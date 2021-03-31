#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_shine_humanbody_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Welcome to HumanBody !";
    return env->NewStringUTF(hello.c_str());
}