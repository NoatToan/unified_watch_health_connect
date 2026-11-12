package defpackage;

import miuix.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public class uy9 {
    public static s72 a(AppCompatActivity appCompatActivity) {
        int iB = b(appCompatActivity);
        if (iB != 1) {
            return iB != 2 ? new nth(appCompatActivity) : new oz9(appCompatActivity);
        }
        return new thh(appCompatActivity);
    }

    public static int b(AppCompatActivity appCompatActivity) {
        boolean zB = xcd.b(appCompatActivity.getIntent());
        if (zB || !(b63.e || b63.h)) {
            return (zB || !b63.f3843b) ? 0 : 1;
        }
        return 2;
    }
}
