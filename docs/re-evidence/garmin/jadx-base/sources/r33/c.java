package r33;

import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b.AbstractC2822b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.c f150127b;

    public c(b.c cVar) {
        this.f150127b = cVar;
    }

    @Override // r33.b.AbstractC2822b
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.f150118e = strArr;
        } else {
            h.s("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
        }
    }
}
