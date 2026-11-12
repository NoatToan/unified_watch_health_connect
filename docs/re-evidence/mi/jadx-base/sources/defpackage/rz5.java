package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class rz5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33082b;
    public String c;
    public String d;
    public View.OnClickListener j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33081a = 0;
    public int e = -1;
    public int f = -1;
    public String g = "";
    public String h = "";
    public Boolean i = Boolean.FALSE;

    public rz5() {
    }

    public boolean a() {
        return this.f33081a == 1;
    }

    public boolean b() {
        return this.f33081a == -1;
    }

    public boolean c() {
        return this.f33081a == 2;
    }

    public void d(int i) {
        this.e = i;
    }

    public void e(String str) {
        this.g = str;
    }

    public void f(int i) {
        this.f = i;
    }

    public void g(int i) {
        this.f33081a = i;
    }

    public rz5(String str, String str2) {
        this.f33082b = str;
        this.d = str2;
    }
}
