package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class d {
    public static final String a = "com.google.protobuf.ExtensionRegistry";
    public static final Class<?> b = e();

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite extensionRegistryLiteC = c("newInstance");
        return extensionRegistryLiteC != null ? extensionRegistryLiteC : new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite b() {
        ExtensionRegistryLite extensionRegistryLiteC = c("getEmptyRegistry");
        return extensionRegistryLiteC != null ? extensionRegistryLiteC : ExtensionRegistryLite.f;
    }

    private static final ExtensionRegistryLite c(String str) {
        Class<?> cls = b;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean d(ExtensionRegistryLite extensionRegistryLite) {
        Class<?> cls = b;
        return cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass());
    }

    public static Class<?> e() {
        try {
            return Class.forName(a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
