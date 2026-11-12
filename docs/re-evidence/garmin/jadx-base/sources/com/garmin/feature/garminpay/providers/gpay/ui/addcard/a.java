package com.garmin.feature.garminpay.providers.gpay.ui.addcard;

import ap2.f;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import t13.g;
import v13.e;
import v13.i;
import vb.h;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity$deleteCardAndNotifyUser$1", f = "FitPayAddCardActivity.kt", l = {715}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayAddCardActivity f51406b;

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.ui.addcard.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity$deleteCardAndNotifyUser$1$isSuccessful$1", f = "FitPayAddCardActivity.kt", l = {716}, m = "invokeSuspend", v = 2)
    public static final class C1066a extends i implements p<b0, d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FitPayAddCardActivity f51408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1066a(FitPayAddCardActivity fitPayAddCardActivity, d<? super C1066a> dVar) {
            super(2, dVar);
            this.f51408b = fitPayAddCardActivity;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C1066a(this.f51408b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Boolean> dVar) {
            return ((C1066a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            fo2.p creditCardLink;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51407a;
            String link = null;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            FitPayAddCardActivity.a aVar2 = FitPayAddCardActivity.f51376x;
            ap2.h hVarFa = this.f51408b.fa();
            this.f51407a = 1;
            g1 g1Var = hVarFa.E4().f205979a;
            yo2.b bVar = hVarFa.f11707k.get();
            if (bVar != null && (creditCardLink = bVar.getCreditCardLink()) != null) {
                link = creditCardLink.getLink();
            }
            Object objP = g1Var.p(link, this);
            return objP == aVar ? aVar : objP;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FitPayAddCardActivity fitPayAddCardActivity, d<? super a> dVar) {
        super(2, dVar);
        this.f51406b = fitPayAddCardActivity;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f51406b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f51405a;
        FitPayAddCardActivity fitPayAddCardActivity = this.f51406b;
        if (i14 == 0) {
            r.b(obj);
            FitPayAddCardActivity.a.a(FitPayAddCardActivity.f51376x).debug("deleteCardAndNotifyUser");
            g gVarPlus = f0.w(fitPayAddCardActivity).f7937b.plus(s0.f129406a);
            C1066a c1066a = new C1066a(fitPayAddCardActivity, null);
            this.f51405a = 1;
            obj = ge1.b.e0(gVarPlus, c1066a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        fitPayAddCardActivity.ka(new o13.p<>(fitPayAddCardActivity.getString(R.string.lbl_ok), new f(((Boolean) obj).booleanValue(), fitPayAddCardActivity, 0)));
        return Unit.INSTANCE;
    }
}
