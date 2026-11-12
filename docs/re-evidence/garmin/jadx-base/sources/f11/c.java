package f11;

import android.content.Context;
import b11.s;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CreateFoodException;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CustomFoodImageUploadFailed;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import y22.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.CreateEditFoodViewModel$saveCustomFood$1", f = "CreateEditFoodViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f67903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f67904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f67905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d11.a f67906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Context context, d11.a aVar2, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f67904c = aVar;
        this.f67905d = context;
        this.f67906e = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f67904c, this.f67905d, this.f67906e, dVar);
        cVar.f67903b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        b0 b0Var = (b0) this.f67903b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67902a;
        d11.a aVar2 = this.f67906e;
        a aVar3 = this.f67904c;
        if (i14 == 0) {
            r.b(obj);
            aVar3.f67888h.setValue(a.c.LOADING);
            v01.e eVar = aVar3.f67883c;
            d11.c cVar = aVar2.f57040a;
            x xVar = aVar2.f57043d;
            x xVar2 = aVar2.f57042c;
            this.f67903b = b0Var;
            this.f67902a = 1;
            objE0 = ge1.b.e0(eVar.f174313c, new v01.d(cVar, xVar, xVar2, eVar, this.f67905d, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.a) {
            Exception exc = ((v2.a) v2Var).f47383a;
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "Failed to create food. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "CreateFoodViewModel", strD);
            if (exc instanceof CreateFoodException) {
                aVar3.f67886f.setValue(((CreateFoodException) exc).getErrors());
                aVar3.f67888h.setValue(a.c.LOADED);
            } else if (exc instanceof CustomFoodImageUploadFailed) {
                b11.e food = ((CustomFoodImageUploadFailed) exc).getFood();
                d11.c cVar2 = aVar2.f57040a;
                String str = food.f14261a.f14253a;
                s sVar = (s) h0.d0(food.f14262b);
                d11.c cVarA = d11.c.a(cVar2, str, null, null, null, sVar != null ? sVar.f14372a : null, null, null, 494);
                x xVar3 = aVar2.f57042c;
                x xVarB = xVar3 != null ? x.b(xVar3) : null;
                aVar3.f67890j = true;
                aVar3.f67881a = new a.b.C1411b(food.f14261a.f14253a);
                aVar3.f67884d.k(null, d11.a.a(aVar2, cVarA, xVarB, 10));
                aVar3.f67888h.setValue(a.c.LOADED);
            } else {
                aVar3.f67886f.setValue(j53.l.b());
                aVar3.f67888h.setValue(a.c.ERROR);
            }
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            aVar3.f67890j = true;
            aVar3.f67888h.setValue(a.c.SAVED);
        }
        return Unit.INSTANCE;
    }
}
