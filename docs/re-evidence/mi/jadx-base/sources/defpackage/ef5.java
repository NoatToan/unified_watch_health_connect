package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class ef5 extends tl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16583a = -1.0f;

    @Override // defpackage.tl4
    public void a(d3m d3mVar, float f, float f2, float f3) {
        d3mVar.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        d3mVar.m((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
