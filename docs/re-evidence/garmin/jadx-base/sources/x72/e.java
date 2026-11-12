package x72;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lx72/e;", "", "Lx72/f;", "themeMode", "Lx72/b;", "colorMode", "", "fontScale", "Lx72/c;", "fontScaleMode", "Lx72/d;", "textDirection", "<init>", "(Lx72/f;Lx72/b;FLx72/c;Lx72/d;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f189449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f189450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f189451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f189452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f189453e;

    public /* synthetic */ e(f fVar, b bVar, float f14, c cVar, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? f.System : fVar, (i14 & 2) != 0 ? b.Baseline : bVar, (i14 & 4) != 0 ? 1.0f : f14, (i14 & 8) != 0 ? c.System : cVar, (i14 & 16) != 0 ? d.System : dVar);
    }

    public static e a(e eVar, f fVar, b bVar, float f14, c cVar, d dVar, int i14) {
        if ((i14 & 1) != 0) {
            fVar = eVar.f189449a;
        }
        f fVar2 = fVar;
        if ((i14 & 2) != 0) {
            bVar = eVar.f189450b;
        }
        b bVar2 = bVar;
        if ((i14 & 4) != 0) {
            f14 = eVar.f189451c;
        }
        float f15 = f14;
        if ((i14 & 8) != 0) {
            cVar = eVar.f189452d;
        }
        c cVar2 = cVar;
        if ((i14 & 16) != 0) {
            dVar = eVar.f189453e;
        }
        d dVar2 = dVar;
        eVar.getClass();
        fVar2.getClass();
        bVar2.getClass();
        cVar2.getClass();
        dVar2.getClass();
        return new e(fVar2, bVar2, f15, cVar2, dVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f189449a == eVar.f189449a && this.f189450b == eVar.f189450b && Float.compare(this.f189451c, eVar.f189451c) == 0 && this.f189452d == eVar.f189452d && this.f189453e == eVar.f189453e;
    }

    public final int hashCode() {
        return this.f189453e.hashCode() + ((this.f189452d.hashCode() + q6.f.d(this.f189451c, (this.f189450b.hashCode() + (this.f189449a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Theme(themeMode=" + this.f189449a + ", colorMode=" + this.f189450b + ", fontScale=" + this.f189451c + ", fontScaleMode=" + this.f189452d + ", textDirection=" + this.f189453e + ")";
    }

    public e(f fVar, b bVar, float f14, c cVar, d dVar) {
        fVar.getClass();
        bVar.getClass();
        cVar.getClass();
        dVar.getClass();
        this.f189449a = fVar;
        this.f189450b = bVar;
        this.f189451c = f14;
        this.f189452d = cVar;
        this.f189453e = dVar;
    }

    public e() {
        this(null, null, 0.0f, null, null, 31, null);
    }
}
