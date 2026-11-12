package hx0;

import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.PregnancyDetailsViewModel$getPregnancyList$1", f = "PregnancyDetailsViewModel.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f86121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(o0 o0Var, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f86121b = o0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p0(this.f86121b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86120a;
        o0 o0Var = this.f86121b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                this.f86120a = 1;
                obj = aVar2.B(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c83.a0 a0Var = (c83.a0) obj;
            List list = (List) a0Var.f25746b;
            if (list != null) {
                i52.a aVar3 = i52.a.f91796a;
                boolean zIsEmpty = true ^ list.isEmpty();
                aVar3.getClass();
                i52.a.s(zIsEmpty);
                if (list.isEmpty()) {
                    o0Var.f86111a = null;
                    o0Var.f86112b = null;
                } else {
                    ArrayList arrayListZ = p13.h0.Z(list);
                    o0.y4(o0Var, arrayListZ);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListZ) {
                        if (!p005kotlin.jvm.internal.s.g((db1.m) obj2, o0Var.f86111a)) {
                            arrayList.add(obj2);
                        }
                    }
                    o0Var.f86112b = arrayList;
                }
            }
            int i15 = o0.f86110f;
            o0Var.z4().j(tb1.d.b(a0Var.f25746b, new Integer(a0Var.f25745a.code()), null, null, 12));
        } catch (Throwable th3) {
            int i16 = o0.f86110f;
            o0Var.z4().j(tb1.d.b(null, null, th3, null, 11));
        }
        return Unit.INSTANCE;
    }
}
