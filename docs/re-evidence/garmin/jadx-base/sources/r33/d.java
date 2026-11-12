package r33;

import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b.AbstractC2822b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.c f150128b;

    public d(b.c cVar) {
        this.f150128b = cVar;
    }

    @Override // r33.b.AbstractC2822b
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.f150119f = strArr;
        } else {
            h.s("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
        }
    }
}
