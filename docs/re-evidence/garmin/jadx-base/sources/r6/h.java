package r6;

/* JADX INFO: loaded from: classes.dex */
public class h implements e, q6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.g f151000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f151001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t6.h f151002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f151003d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f151004e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f151005f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f151006g;

    public h(q6.g gVar) {
        this.f151000a = gVar;
    }

    @Override // q6.e
    public final t6.e a() {
        if (this.f151002c == null) {
            this.f151002c = new t6.h();
        }
        return this.f151002c;
    }

    @Override // r6.e, q6.e
    public final void apply() {
        this.f151002c.X(this.f151001b);
        int i14 = this.f151003d;
        if (i14 != -1) {
            t6.h hVar = this.f151002c;
            if (i14 <= -1) {
                hVar.getClass();
                return;
            }
            hVar.f162685w0 = -1.0f;
            hVar.f162686x0 = i14;
            hVar.f162687y0 = -1;
            return;
        }
        int i15 = this.f151004e;
        t6.h hVar2 = this.f151002c;
        if (i15 != -1) {
            if (i15 <= -1) {
                hVar2.getClass();
                return;
            }
            hVar2.f162685w0 = -1.0f;
            hVar2.f162686x0 = -1;
            hVar2.f162687y0 = i15;
            return;
        }
        float f14 = this.f151005f;
        if (f14 <= -1.0f) {
            hVar2.getClass();
            return;
        }
        hVar2.f162685w0 = f14;
        hVar2.f162686x0 = -1;
        hVar2.f162687y0 = -1;
    }

    @Override // q6.e
    public final e b() {
        return null;
    }

    @Override // q6.e
    public final void c(t6.e eVar) {
        if (eVar instanceof t6.h) {
            this.f151002c = (t6.h) eVar;
        } else {
            this.f151002c = null;
        }
    }

    @Override // q6.e
    public final Object getKey() {
        return this.f151006g;
    }
}
