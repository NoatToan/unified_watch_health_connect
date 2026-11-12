package tr2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import o53.b0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity$deletePaymentCard$1", f = "UserWalletActivity.kt", l = {454}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vr2.q f166175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserWalletActivity f166176c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity$deletePaymentCard$1$isDeleted$1", f = "UserWalletActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f166177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f166178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserWalletActivity f166179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, UserWalletActivity userWalletActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166177a = str;
            this.f166178b = str2;
            this.f166179c = userWalletActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166177a, this.f166178b, this.f166179c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            ms2.g gVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            String str2 = this.f166177a;
            if (str2 == null || (str = this.f166178b) == null || (gVar = this.f166179c.f52223k) == null) {
                return null;
            }
            return Boolean.valueOf(gVar.b(str2, str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(vr2.q qVar, UserWalletActivity userWalletActivity, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f166175b = qVar;
        this.f166176c = userWalletActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f166175b, this.f166176c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        zo2.a aVar;
        fo2.p paymentCardLink;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166174a;
        UserWalletActivity userWalletActivity = this.f166176c;
        if (i14 == 0) {
            o13.r.b(obj);
            UserWalletActivity.f52218r.error("deletePaymentCard");
            vr2.q qVar = this.f166175b;
            try {
                aVar = (zo2.a) fs2.a.f(qVar.f179658e, zo2.a.class);
            } catch (Exception unused) {
                aVar = null;
            }
            if (aVar != null) {
                try {
                    paymentCardLink = aVar.getPaymentCardLink();
                } catch (Exception unused2) {
                    paymentCardLink = null;
                }
            } else {
                paymentCardLink = null;
            }
            String link = paymentCardLink != null ? paymentCardLink.getLink() : null;
            String strM = w3.x.m(qVar.f179658e);
            t13.g gVarPlus = f0.w(userWalletActivity).f7937b.plus(s0.f129406a);
            a aVar3 = new a(link, strM, userWalletActivity, null);
            this.f166174a = 1;
            obj = ge1.b.e0(gVarPlus, aVar3, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        hn2.c.ba(userWalletActivity, Boolean.FALSE, null, null, 14);
        if (p005kotlin.jvm.internal.s.g((Boolean) obj, Boolean.TRUE)) {
            vr2.e eVar = userWalletActivity.f52219g;
            if (eVar == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            eVar.d0();
            vr2.e eVar2 = userWalletActivity.f52219g;
            if (eVar2 == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            List<vr2.q> listD = eVar2.getData().d();
            if (listD == null) {
                listD = j0.f134944a;
            }
            vr2.e eVar3 = userWalletActivity.f52219g;
            if (eVar3 == null) {
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            }
            List<fs2.a> listD2 = eVar3.X3().d();
            if (listD2 == null) {
                listD2 = j0.f134944a;
            }
            userWalletActivity.ga(listD, listD2);
        } else {
            UserWalletActivity.a aVar4 = UserWalletActivity.f52217q;
            userWalletActivity.getClass();
            UserWalletActivity.f52218r.debug("showUnsuccessfulCardRemovalDialog");
            br2.c cVar = br2.c.f19585a;
            String string = userWalletActivity.getString(R.string.wallet_title_card_not_removed);
            string.getClass();
            String string2 = userWalletActivity.getString(R.string.wallet_message_card_removal_unsuccessful);
            string2.getClass();
            androidx.appcompat.app.e eVarQ = br2.c.q(cVar, userWalletActivity, string, string2, new o13.p(userWalletActivity.getString(R.string.lbl_ok), new e(5)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ != null) {
                eVarQ.show();
            }
        }
        return Unit.INSTANCE;
    }
}
