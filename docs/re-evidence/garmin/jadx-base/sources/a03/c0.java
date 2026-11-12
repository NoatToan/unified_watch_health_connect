package a03;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class c0 extends p005kotlin.jvm.internal.q implements e23.q<o53.b0, Float, t13.d<? super Unit>, Object> {
    public c0(Object obj) {
        super(3, obj, kotlin.jvm.internal.s.a.class, "suspendConversion0", "flexibleBottomSheetSwipeable$suspendConversion0(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CoroutineScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, Float f14, t13.d<? super Unit> dVar) {
        float fFloatValue = f14.floatValue();
        ((e23.p) this.receiver).invoke(b0Var, new Float(fFloatValue));
        return Unit.INSTANCE;
    }
}
