package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public class uz6 extends xz {
    public final int c;
    public int d;
    public int e;
    public final int f;
    public String g;
    public String h;
    public String i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f36300k;
    public int l;
    public boolean m;

    public uz6(int i, String str, int i2, int i3, int i4) {
        this.d = 0;
        this.f39601a = i4;
        this.g = str;
        this.f = i2;
        this.c = i;
        this.e = i3;
    }

    @Override // defpackage.b72
    public int a() {
        return this.c;
    }

    @Override // defpackage.b72
    public int b() {
        return this.f39601a;
    }

    public int c() {
        return this.d;
    }

    public String d(Context context) {
        return this.g;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public uz6(int i, String str, int i2, int i3, String str2, String str3) {
        this.d = 0;
        this.c = i;
        this.g = str;
        this.f = i2;
        this.f39601a = i3;
        this.h = str2;
        this.i = str3;
    }

    public uz6(int i, String str, int i2, int i3, boolean z, long j) {
        this.d = 0;
        this.c = i;
        this.f = i2;
        this.f39601a = i3;
        this.g = str;
        this.j = z;
        this.f36300k = j;
    }

    public uz6(int i, int i2, String str, int i3, int i4, boolean z, long j) {
        this.c = i2;
        this.d = i;
        this.f = i3;
        this.f39601a = i4;
        this.g = str;
        this.j = z;
        this.f36300k = j;
    }
}
