package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes42.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Character f22949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Character f22950c;
    private int d = 0;
    private int e = 0;

    public a(String str) {
        this.f22948a = str;
    }

    private boolean d() {
        String str = this.f22948a;
        return str != null && str.length() > 0;
    }

    public boolean a() {
        if (this.f22949b != null) {
            return true;
        }
        return c();
    }

    public int b() {
        return this.d;
    }

    public void c(Character ch) {
        this.f22949b = ch;
    }

    public void e() {
        this.f22950c = this.f22949b;
        this.e = this.d;
    }

    public Character f() {
        Character ch = this.f22949b;
        if (ch != null) {
            this.f22949b = null;
            return ch;
        }
        if (!c()) {
            return null;
        }
        String str = this.f22948a;
        int i = this.d;
        this.d = i + 1;
        return Character.valueOf(str.charAt(i));
    }

    public Character g() {
        Character chF = f();
        if (chF != null && a(chF)) {
            return chF;
        }
        return null;
    }

    public Character h() {
        Character chF = f();
        if (chF != null && b(chF)) {
            return chF;
        }
        return null;
    }

    public Character i() {
        Character ch = this.f22949b;
        if (ch != null) {
            return ch;
        }
        if (c()) {
            return Character.valueOf(this.f22948a.charAt(this.d));
        }
        return null;
    }

    protected String j() {
        if (!d()) {
            return "";
        }
        String strSubstring = this.f22948a.substring(this.d);
        if (this.f22949b == null) {
            return strSubstring;
        }
        return this.f22949b + strSubstring;
    }

    public void k() {
        this.f22949b = this.f22950c;
        this.d = this.e;
    }

    public static boolean b(Character ch) {
        char cCharValue;
        return ch != null && (cCharValue = ch.charValue()) >= '0' && cCharValue <= '7';
    }

    private boolean c() {
        return d() && this.d < this.f22948a.length();
    }

    public static boolean a(Character ch) {
        if (ch == null) {
            return false;
        }
        char cCharValue = ch.charValue();
        if (cCharValue >= '0' && cCharValue <= '9') {
            return true;
        }
        if (cCharValue < 'a' || cCharValue > 'f') {
            return cCharValue >= 'A' && cCharValue <= 'F';
        }
        return true;
    }

    public boolean a(char c2) {
        Character ch = this.f22949b;
        if (ch == null || ch.charValue() != c2) {
            return c() && this.f22948a.charAt(this.d) == c2;
        }
        return true;
    }
}
