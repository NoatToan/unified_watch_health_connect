package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class aak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f838b;
    public float c;
    public float d;

    public aak(float f, float f2, float f3, float f4) {
        this.f837a = f;
        this.f838b = f2;
        this.c = f3;
        this.d = f4;
    }

    public boolean a(aak aakVar) {
        if (this == aakVar) {
            return true;
        }
        return this.f837a == aakVar.f837a && this.f838b == aakVar.f838b && this.c == aakVar.c && this.d == aakVar.d;
    }
}
