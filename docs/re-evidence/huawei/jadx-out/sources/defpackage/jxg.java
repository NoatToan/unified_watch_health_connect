package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class jxg {
    public static String a(String str) {
        return e("common", str);
    }

    private static String e(String str, String str2) {
        return jey.b("3dMarker") + str + File.separator + str2;
    }

    public static String e(String str) {
        return jey.b("3dMarker") + "numbers" + File.separator + "number_" + str + ".gltf";
    }
}
