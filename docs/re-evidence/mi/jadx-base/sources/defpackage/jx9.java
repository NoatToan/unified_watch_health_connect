package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class jx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final frk<byte[]> f23213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f23214b;

    public class a implements frk<byte[]> {
        public a() {
        }

        @Override // defpackage.frk
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(byte[] bArr) {
            jx9.this.a(bArr);
        }
    }

    public static class b extends com.facebook.imagepipeline.memory.a {
        public b(spf spfVar, j3i j3iVar, k3i k3iVar) {
            super(spfVar, j3iVar, k3iVar);
        }

        @Override // com.facebook.imagepipeline.memory.BasePool
        public r53<byte[]> s(int i) {
            return new b3h(k(i), this.c.g, 0);
        }
    }

    public jx9(spf spfVar, j3i j3iVar) {
        b6i.b(j3iVar.g > 0);
        this.f23214b = new b(spfVar, j3iVar, zug.h());
        this.f23213a = new a();
    }

    public void a(byte[] bArr) {
        this.f23214b.release(bArr);
    }
}
