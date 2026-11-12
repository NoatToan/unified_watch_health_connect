package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public class ipq {
    public static String a(String str) {
        int iIndexOf = str != null ? str.indexOf("XM") : -1;
        if (iIndexOf != -1) {
            return str.substring(iIndexOf + 2, iIndexOf + 5);
        }
        throw new IllegalArgumentException("firmware version not matched");
    }
}
