package kotlinx.serialization.internal;

import m63.p1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/b;", "Li63/c;", "", "Lm63/p1;", "", "Lm63/h;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends p1<Byte, byte[], m63.h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f105968c = new b();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private b() {
        super(m63.i.f116959a);
        p005kotlin.jvm.internal.d.f105790a.getClass();
    }

    @Override // m63.a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // m63.s, m63.a
    public final void f(l63.c cVar, int i14, Object obj) {
        m63.h hVar = (m63.h) obj;
        hVar.getClass();
        byte bC = cVar.C(this.f117005b, i14);
        hVar.b(hVar.getF116955b() + 1);
        byte[] bArr = hVar.f116954a;
        int i15 = hVar.f116955b;
        hVar.f116955b = i15 + 1;
        bArr[i15] = bC;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return new m63.h(bArr);
    }

    @Override // m63.p1
    public final byte[] j() {
        return new byte[0];
    }

    @Override // m63.p1
    public final void k(l63.d dVar, byte[] bArr, int i14) {
        byte[] bArr2 = bArr;
        dVar.getClass();
        bArr2.getClass();
        for (int i15 = 0; i15 < i14; i15++) {
            dVar.j(this.f117005b, i15, bArr2[i15]);
        }
    }
}
