package r33;

import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class e extends b.AbstractC2822b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.d f150129b;

    public e(b.d dVar) {
        this.f150129b = dVar;
    }

    @Override // r33.b.AbstractC2822b
    public final void f(String[] strArr) {
        if (strArr != null) {
            b.this.f150122i = strArr;
        } else {
            h.s("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
    }
}
