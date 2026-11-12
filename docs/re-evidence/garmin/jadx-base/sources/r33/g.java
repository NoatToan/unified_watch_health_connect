package r33;

import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class g extends b.AbstractC2822b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.e f150131b;

    public g(b.e eVar) {
        this.f150131b = eVar;
    }

    @Override // r33.b.AbstractC2822b
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.f150119f = strArr;
        } else {
            h.s("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
    }
}
