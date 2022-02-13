#include "test_pak_Main.h"

JNIEXPORT jint JNICALL Java_test_pak_Main_add
  (JNIEnv *, jclass, jint a, jint b) {
      return a+b;
  }
