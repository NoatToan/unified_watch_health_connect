package i3;

import android.view.KeyEvent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class rd implements e23.l<z4.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f89524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f89525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j23.f<Float> f89526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f89528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f89529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f89530g;

    /* JADX WARN: Multi-variable type inference failed */
    public rd(boolean z14, e23.l<? super Float, Unit> lVar, j23.f<Float> fVar, int i14, boolean z15, float f14, e23.a<Unit> aVar) {
        this.f89524a = z14;
        this.f89525b = lVar;
        this.f89526c = fVar;
        this.f89527d = i14;
        this.f89528e = z15;
        this.f89529f = f14;
        this.f89530g = aVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Boolean invoke(z4.b bVar) {
        e23.l<Float, Unit> lVar;
        KeyEvent keyEvent = bVar.f202306a;
        if (this.f89524a && (lVar = this.f89525b) != 0) {
            int iB = z4.d.b(keyEvent);
            z4.c.f202307b.getClass();
            boolean z14 = false;
            if (iB == z4.c.f202309d) {
                j23.f<Float> fVar = this.f89526c;
                float fAbs = Math.abs(fVar.b().floatValue() - fVar.getStart().floatValue());
                int i14 = this.f89527d;
                int i15 = i14 > 0 ? i14 + 1 : 100;
                float f14 = fAbs / i15;
                int i16 = this.f89528e ? -1 : 1;
                long jA = z4.f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                boolean zA = z4.a.a(jA, z4.a.f202284f);
                float f15 = this.f89529f;
                if (zA) {
                    lVar.invoke((Float) j23.t.j(Float.valueOf((i16 * f14) + f15), fVar));
                } else if (z4.a.a(jA, z4.a.f202285g)) {
                    lVar.invoke((Float) j23.t.j(Float.valueOf(f15 - (i16 * f14)), fVar));
                } else if (z4.a.a(jA, z4.a.f202287i)) {
                    lVar.invoke((Float) j23.t.j(Float.valueOf((i16 * f14) + f15), fVar));
                } else if (z4.a.a(jA, z4.a.f202286h)) {
                    lVar.invoke((Float) j23.t.j(Float.valueOf(f15 - (i16 * f14)), fVar));
                } else if (z4.a.a(jA, z4.a.f202302x)) {
                    lVar.invoke(fVar.getStart());
                } else if (z4.a.a(jA, z4.a.f202303y)) {
                    lVar.invoke(fVar.b());
                } else if (z4.a.a(jA, z4.a.E)) {
                    lVar.invoke((Float) j23.t.j(Float.valueOf(f15 - (j23.t.e(i15 / 10, 1, 10) * f14)), fVar));
                } else if (z4.a.a(jA, z4.a.F)) {
                    lVar.invoke((Float) j23.t.j(Float.valueOf((j23.t.e(i15 / 10, 1, 10) * f14) + f15), fVar));
                }
                z14 = true;
            } else if (iB == z4.c.f202308c) {
                long jA2 = z4.f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA2, z4.a.f202284f) || z4.a.a(jA2, z4.a.f202285g) || z4.a.a(jA2, z4.a.f202287i) || z4.a.a(jA2, z4.a.f202286h) || z4.a.a(jA2, z4.a.f202302x) || z4.a.a(jA2, z4.a.f202303y) || z4.a.a(jA2, z4.a.E) || z4.a.a(jA2, z4.a.F)) {
                    e23.a<Unit> aVar = this.f89530g;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    z14 = true;
                }
            }
            return Boolean.valueOf(z14);
        }
        return Boolean.FALSE;
    }
}
