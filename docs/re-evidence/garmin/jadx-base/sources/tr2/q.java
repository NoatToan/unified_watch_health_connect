package tr2;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import o53.b0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment$deletePaymentCard$1", f = "PaymentCardDetailsFragment.kt", l = {363}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentCardDetailsFragment f166166b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment$deletePaymentCard$1$isDeleted$1", f = "PaymentCardDetailsFragment.kt", l = {364}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PaymentCardDetailsFragment f166168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaymentCardDetailsFragment paymentCardDetailsFragment, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166168b = paymentCardDetailsFragment;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166168b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166167a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            Logger logger = PaymentCardDetailsFragment.f52189m;
            vr2.i iVarY6 = this.f166168b.y6();
            this.f166167a = 1;
            Object objX4 = iVarY6.x4(this);
            return objX4 == aVar ? aVar : objX4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PaymentCardDetailsFragment paymentCardDetailsFragment, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f166166b = paymentCardDetailsFragment;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f166166b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166165a;
        PaymentCardDetailsFragment paymentCardDetailsFragment = this.f166166b;
        if (i14 == 0) {
            o13.r.b(obj);
            PaymentCardDetailsFragment.f52189m.error("deletePaymentCard");
            SwipeRefreshLayout swipeRefreshLayout = paymentCardDetailsFragment.f52199j;
            if (swipeRefreshLayout == null) {
                p005kotlin.jvm.internal.s.m("swipeToRefreshView");
                throw null;
            }
            swipeRefreshLayout.setRefreshing(true);
            t13.g gVarPlus = f0.w(paymentCardDetailsFragment).f7937b.plus(s0.f129406a);
            a aVar2 = new a(paymentCardDetailsFragment, null);
            this.f166165a = 1;
            objE0 = ge1.b.e0(gVarPlus, aVar2, this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        Boolean bool = (Boolean) objE0;
        SwipeRefreshLayout swipeRefreshLayout2 = paymentCardDetailsFragment.f52199j;
        if (swipeRefreshLayout2 == null) {
            p005kotlin.jvm.internal.s.m("swipeToRefreshView");
            throw null;
        }
        swipeRefreshLayout2.setRefreshing(false);
        yq2.a aVar3 = paymentCardDetailsFragment.f52197h;
        if (aVar3 == null) {
            p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        aVar3.x(false);
        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
            paymentCardDetailsFragment.y6().z4();
            yq2.a aVar4 = paymentCardDetailsFragment.f52197h;
            if (aVar4 == null) {
                p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            aVar4.v3(paymentCardDetailsFragment.u6());
        } else {
            Logger logger = PaymentCardDetailsFragment.f52189m;
            logger.error("removeCard: failed to remove card");
            logger.debug("showUnsuccessfulCardRemovalDialog");
            br2.c cVar = br2.c.f19585a;
            hn2.c cVarU6 = paymentCardDetailsFragment.u6();
            String string = paymentCardDetailsFragment.getString(R.string.wallet_title_card_not_removed);
            string.getClass();
            String string2 = paymentCardDetailsFragment.getString(R.string.wallet_message_card_removal_unsuccessful);
            string2.getClass();
            androidx.appcompat.app.e eVarQ = br2.c.q(cVar, cVarU6, string, string2, new o13.p(paymentCardDetailsFragment.getString(R.string.lbl_ok), new e(2)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ != null) {
                eVarQ.show();
            }
        }
        return Unit.INSTANCE;
    }
}
