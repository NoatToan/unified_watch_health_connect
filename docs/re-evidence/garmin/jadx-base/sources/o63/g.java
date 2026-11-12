package o63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo63/g;", "", "Lo63/l;", "writer", "<init>", "(Lo63/l;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f129854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f129855b;

    public g(l lVar) {
        lVar.getClass();
        this.f129854a = lVar;
        this.f129855b = true;
    }

    public void a() {
        this.f129855b = true;
    }

    public void b() {
        this.f129855b = false;
    }

    public void c() {
        this.f129855b = false;
    }

    public void d(byte b14) {
        this.f129854a.writeLong(b14);
    }

    public final void e(char c14) {
        this.f129854a.a(c14);
    }

    public void f(int i14) {
        this.f129854a.writeLong(i14);
    }

    public void g(long j8) {
        this.f129854a.writeLong(j8);
    }

    public void h(short s8) {
        this.f129854a.writeLong(s8);
    }

    public void i(String str) {
        str.getClass();
        this.f129854a.b(str);
    }

    public void j() {
    }

    public void k() {
    }
}
