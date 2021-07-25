package ru.vlapin.demo.lombokdemo.extensionmethods;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LombokExtensionMethodExampleTest {

  @Test
  @SneakyThrows
  @DisplayName("UseExtensionMethods method works correctly")
  void useExtensionMethodsMethodWorksCorrectlyTest() {
    assertThat(new LombokExtensionMethodExample()
                   .useExtensionMethods()).isNotNull()
        .isEqualTo("Hello, world!");
  }

  @Test
  void getSortedArray() {
    assertThat(new LombokExtensionMethodExample()
                   .getSortedArray()).isNotNull()
        .containsExactly(2, 3, 5, 8);
  }
}
