package kotlinx.serialization.internal;

import m63.p1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/a;", "Li63/c;", "", "Lm63/p1;", "", "Lm63/f;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends p1<Boolean, boolean[], m63.f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f105967c = new a();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private a() {
        super(m63.g.f116948a);
        p005kotlin.jvm.internal.c.f105789a.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        m63.f fVar = (m63.f) obj;
        fVar.getClass();
        boolean zG = cVar.g(this.f117005b, i14);
        fVar.b(fVar.getF116942b() + 1);
        boolean[] zArr = fVar.f116941a;
        int i15 = fVar.f116942b;
        fVar.f116942b = i15 + 1;
        zArr[i15] = zG;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return new m63.f(zArr);
    }

    @Override // m63.p1
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // m63.p1
    public final void k(l63.d dVar, boolean[] zArr, int i14) {
        boolean[] zArr2 = zArr;
        dVar.getClass();
        zArr2.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            dVar.n(this.f117005b, i15, zArr2[i15]);
        }
    }
}
