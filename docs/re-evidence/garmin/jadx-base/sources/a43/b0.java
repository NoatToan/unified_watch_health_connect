package a43;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends g23.c<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f1107a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Object obj, c0 c0Var) {
        super(obj);
        this.f1107a = c0Var;
    }

    @Override // g23.c
    public final boolean beforeChange(k23.l<?> lVar, Object obj, Object obj2) {
        lVar.getClass();
        if (!this.f1107a.f1109a) {
            return true;
        }
        vb.h.z("Cannot modify readonly DescriptorRendererOptions");
        return false;
    }
}
