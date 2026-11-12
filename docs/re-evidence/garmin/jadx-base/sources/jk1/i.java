package jk1;

import c22.s3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import hk1.k;
import hk1.w;
import hk1.y;
import hk1.z;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.connect.ThirdPartyConnectViewModel$initializeData$1", f = "ThirdPartyConnectViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f99418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f99418b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f99418b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99417a;
        f fVar = this.f99418b;
        if (i14 == 0) {
            r.b(obj);
            w wVar = fVar.f99397a;
            p2 p2Var = fVar.f99406j;
            if (wVar == null) {
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, e.a((e) value2, false, new y.a(k.UNKNOWN, null, 2, null), null, null, 492)));
                return Unit.INSTANCE;
            }
            if (s3.b()) {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, e.a((e) value, false, new y.a(k.CHILD_ACCOUNT, null, 2, null), null, null, 494)));
                return Unit.INSTANCE;
            }
            ek1.c cVar = fVar.f99400d;
            w wVar2 = fVar.f99397a;
            boolean z14 = fVar.f99398b;
            g gVar = new g(fVar, 2);
            this.f99417a = 1;
            obj = cVar.b(wVar2, z14, gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            T t7 = ((v2.b) v2Var).f47386a;
            y.b bVar = t7 instanceof y.b ? (y.b) t7 : null;
            if (bVar != null) {
                fVar.f99405i = bVar.f84220a.f84191c;
            }
        }
        p2 p2Var2 = fVar.f99406j;
        do {
            value3 = p2Var2.getValue();
        } while (!p2Var2.b(value3, z.a(v2Var)));
        return Unit.INSTANCE;
    }
}
