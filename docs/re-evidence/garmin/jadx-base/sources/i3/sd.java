package i3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class sd implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ud f89662a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly1/c2;", "Ln4/c;", "it", "", "<anonymous>", "(Ly1/c2;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.q<p008y1.c2, n4.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ long f89663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ud f89664b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ud udVar, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f89664b = udVar;
        }

        @Override // e23.q
        public final Object invoke(p008y1.c2 c2Var, n4.c cVar, t13.d<? super Unit> dVar) {
            long j8 = cVar.f123544a;
            a aVar = new a(this.f89664b, dVar);
            aVar.f89663a = j8;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            float intValue;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            long j8 = this.f89663a;
            ud udVar = this.f89664b;
            if (udVar.f89922m == p008y1.b2.Vertical) {
                intValue = Float.intBitsToFloat((int) (j8 & 4294967295L));
            } else {
                intValue = udVar.f89919j ? udVar.f89917h.getIntValue() - Float.intBitsToFloat((int) (j8 >> 32)) : Float.intBitsToFloat((int) (j8 >> 32));
            }
            udVar.f89926q.i(intValue - udVar.f89925p.getFloatValue());
            return Unit.INSTANCE;
        }
    }

    public sd(ud udVar) {
        this.f89662a = udVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        ud udVar = this.f89662a;
        Object objF = p008y1.k3.f(h0Var, null, new a(udVar, null), new id(udVar, 2), dVar, 3);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
    }
}
