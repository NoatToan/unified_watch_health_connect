package r02;

import j23.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$ZoomableLayout$gesturesModifier$1$1", f = "ZoomableLayout.kt", l = {62}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f148833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f148833b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f148833b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f148832a;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVar = this.f148833b;
            if (!((Boolean) mVar.f148904l.getF182175a()).booleanValue()) {
                b bVar = (b) mVar.f148907o.getF182175a();
                j23.e eVar = bVar != null ? bVar.f148831c : null;
                if (eVar != null && !eVar.contains(new Float(mVar.f148895c.getFloatValue()))) {
                    float fFloatValue = ((Number) t.j(new Float(mVar.f148895c.getFloatValue()), eVar)).floatValue();
                    this.f148832a = 1;
                    if (m.a(mVar, fFloatValue, 0L, this, 6) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
