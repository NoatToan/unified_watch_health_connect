package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class ocx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char[] f44167c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44165a = 0;
    private int d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44166b = 0;
    private int e = 0;

    ocx() {
    }

    private boolean a() {
        return this.f44165a < this.d;
    }

    private String b(boolean z) {
        while (true) {
            int i = this.f44166b;
            if (i >= this.e || !Character.isWhitespace(this.f44167c[i])) {
                break;
            }
            this.f44166b++;
        }
        while (true) {
            int i2 = this.e;
            if (i2 <= this.f44166b || !Character.isWhitespace(this.f44167c[i2 - 1])) {
                break;
            }
            this.e--;
        }
        if (z) {
            int i3 = this.e;
            int i4 = this.f44166b;
            if (i3 - i4 >= 2) {
                char[] cArr = this.f44167c;
                if (cArr[i4] == '\"') {
                    int i5 = i3 - 1;
                    if (cArr[i5] == '\"') {
                        this.f44166b = i4 + 1;
                        this.e = i5;
                    }
                }
            }
        }
        int i6 = this.e;
        int i7 = this.f44166b;
        if (i6 >= i7) {
            return new String(this.f44167c, i7, i6 - i7);
        }
        return null;
    }

    private boolean c(char c2, char[] cArr) {
        for (char c3 : cArr) {
            if (c2 == c3) {
                return true;
            }
        }
        return false;
    }

    private String c(char[] cArr) {
        int i = this.f44165a;
        this.f44166b = i;
        this.e = i;
        while (a() && !c(this.f44167c[this.f44165a], cArr)) {
            this.e++;
            this.f44165a++;
        }
        return b(false);
    }

    private String d(char[] cArr) {
        int i = this.f44165a;
        this.f44166b = i;
        this.e = i;
        boolean z = false;
        boolean z2 = false;
        while (a()) {
            char c2 = this.f44167c[this.f44165a];
            if (!z && c(c2, cArr)) {
                break;
            }
            if (!z2 && c2 == '\"') {
                z = !z;
            }
            z2 = !z2 && c2 == '\\';
            this.e++;
            this.f44165a++;
        }
        return b(true);
    }

    List c(String str, char c2) {
        if (str == null) {
            return new ArrayList();
        }
        return a(str.toCharArray(), c2);
    }

    private List a(char[] cArr, char c2) {
        if (cArr == null) {
            return new ArrayList();
        }
        return d(cArr, 0, cArr.length, c2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    private List d(char[] cArr, int i, int i2, char c2) {
        String strD;
        if (cArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        this.f44167c = cArr;
        this.f44165a = i;
        this.d = i2;
        while (a()) {
            String strC = c(new char[]{'=', c2});
            if (a()) {
                int i3 = this.f44165a;
                if (cArr[i3] == '=') {
                    this.f44165a = i3 + 1;
                    strD = d(new char[]{c2});
                } else {
                    strD = null;
                }
            } else {
                strD = null;
            }
            if (a()) {
                int i4 = this.f44165a;
                if (cArr[i4] == c2) {
                    this.f44165a = i4 + 1;
                }
            }
            if (strC != null && (!strC.equals("") || strD != null)) {
                arrayList.add(new ocz(strC, strD));
            }
        }
        return arrayList;
    }
}
