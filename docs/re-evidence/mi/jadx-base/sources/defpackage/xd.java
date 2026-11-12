package defpackage;

import com.google.android.gms.common.ConnectionResult;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yd f39005b;
    public int c;
    public boolean d;
    public long e;
    public a f;
    public boolean g;
    public int h;
    public String i;
    public byte j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39006k;
    public o5 l;
    public nv m;

    public enum a {
        NONE(-1),
        CONTINUE(1),
        LAST(2);

        public int t;

        a(int i) {
            this.t = i;
        }

        public int a() {
            return this.t;
        }
    }

    public xd(String str, yd ydVar) {
        this.c = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.d = false;
        this.f = a.NONE;
        this.g = false;
        this.h = -1;
        this.l = new o5();
        this.m = nv.FOREGROUND;
        this.f39004a = str;
        this.f39005b = ydVar;
        this.e = qa.a(str);
    }

    public int a() {
        return this.h;
    }

    public void b(nv nvVar) {
        this.m = nvVar;
    }

    public void c(o5 o5Var) {
        this.l = o5Var;
    }

    public void d(boolean z) {
        this.g = z;
    }

    public o5 e() {
        return this.l;
    }

    public a f() {
        return this.f;
    }

    public String g() {
        return this.f39004a;
    }

    public yd h() {
        return this.f39005b;
    }

    public int i() {
        return this.c;
    }

    public nv j() {
        return this.m;
    }

    public boolean k() {
        return this.g;
    }

    public boolean l() {
        return this.d;
    }

    public String toString() {
        return "HMFirmwareInfo{fwPath='" + this.f39004a + "', fwType=" + this.f39005b + ", syncSize=" + this.c + ", fileSize=" + this.e + ", continueFlag=" + this.f.t + ", voiceType=" + ((int) this.j) + ", voiceId=" + this.f39006k + ", otherFwPath=" + this.i + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public xd(String str, yd ydVar, a aVar, int i) {
        this.c = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.d = false;
        this.f = a.NONE;
        this.g = false;
        this.h = -1;
        this.l = new o5();
        this.m = nv.FOREGROUND;
        this.f39004a = str;
        this.f39005b = ydVar;
        this.f = aVar;
        this.h = i;
    }
}
