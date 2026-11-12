package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes2.dex */
final class NativeScope implements b {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeRemoveExtra(String str);

    public static native void nativeRemoveTag(String str);

    public static native void nativeRemoveUser();

    public static native void nativeSetExtra(String str, String str2);

    public static native void nativeSetTag(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);

    @Override // io.sentry.android.ndk.b
    public void a(String str, String str2) {
        nativeSetTag(str, str2);
    }

    @Override // io.sentry.android.ndk.b
    public void b(String str, String str2, String str3, String str4, String str5, String str6) {
        nativeAddBreadcrumb(str, str2, str3, str4, str5, str6);
    }
}
