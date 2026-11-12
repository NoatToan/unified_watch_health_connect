package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.MemoryStorage;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.DiscountGiftCard;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeManager;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.domain.UpdateDomainModel;
import com.mibi.sdk.partner.model.PartnerDoPayModel;
import com.mibi.sdk.partner.task.RxCheckPartnerPayOrderTask;
import com.mibi.sdk.partner.task.RxGetPartnerRechargeTypeTask;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l2s extends BaseMvpPresenter<i9s> implements j2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderBean f24580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24581b;
    public RxCheckPartnerPayOrderTask.Result c;

    public class b implements IBaseModel.IResultCallback<RxCheckPartnerPayOrderTask.Result> {
        public b() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(RxCheckPartnerPayOrderTask.Result result) {
            MibiLog.d("PartnerPayPresenter", "check order success");
            l2s.this.c = result;
            if (l2s.this.f24580a.mUseUi) {
                l2s.this.g(result.mOrderPrice);
                return;
            }
            long jD = l2s.this.d(result);
            if (jD <= 0) {
                MibiLog.d("PartnerPayPresenter", "no ui, balance enough, do pay");
                l2s.this.o();
                return;
            }
            MibiLog.d("PartnerPayPresenter", "no ui, balance not enough, get recharge types");
            MemoryStorage memoryStorage = l2s.this.getSession().getMemoryStorage();
            memoryStorage.put(l2s.this.f24581b, Constants.KEY_RECHARGE_VALUE, Long.valueOf(jD));
            memoryStorage.put(l2s.this.f24581b, CommonConstants.KEY_IS_PARTNER_ACCOUNT, Boolean.TRUE);
            memoryStorage.put(l2s.this.f24581b, Constants.KEY_USE_GIFTCARD, Boolean.valueOf(l2s.this.f24580a.mUseGiftcard));
            memoryStorage.put(l2s.this.f24581b, Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(l2s.this.f24580a.mUseParterGiftcard));
            l2s.this.g(result.mOrderPrice);
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerPayPresenter", "check order failed code : " + i + " ; msg : " + str, th);
        }
    }

    public class c implements IBaseModel.IResultCallback<Bundle> {
        public c() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bundle bundle) {
            MibiLog.d("PartnerPayPresenter", "do direct pay success");
            ((i9s) l2s.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerPayPresenter", "do direct failed:" + i + ",desc:" + str, th);
            ((i9s) l2s.this.getView()).c(i, str, null);
        }
    }

    public class d implements IBaseModel.IResultCallback<Void> {
        public d() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r6) {
            MibiLog.d("PartnerPayPresenter", "Domain onSuccess");
            d9s d9sVar = new d9s(l2s.this.getSession());
            Bundle bundle = new Bundle();
            bundle.putString(CommonConstants.KEY_PARTNER_USER_ID, l2s.this.f24580a.mPartnerUserId);
            bundle.putString("accountType", l2s.this.f24580a.mPartnerAccountType);
            bundle.putLong("marketType", l2s.this.f24580a.mPartnerMarketType);
            d9sVar.request(bundle, new g());
            MibiLog.d("PartnerPayPresenter", "start get process id");
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerPayPresenter", "Domain failed:" + i + ",errorDesc:" + str);
            ((i9s) l2s.this.getView()).a(false);
            ((i9s) l2s.this.getView()).c(i, str, null);
        }
    }

    public class e implements IBaseModel.IResultCallback<RxGetPartnerRechargeTypeTask.Result> {
        public e() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(RxGetPartnerRechargeTypeTask.Result result) {
            MibiLog.d("PartnerPayPresenter", "get recharge types success");
            if (l2s.this.f24580a.mUseUi) {
                ((i9s) l2s.this.getView()).m(l2s.this.c, result);
            } else {
                l2s.this.j(result);
            }
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerPayPresenter", "get recharge types failed code : " + i + " ; msg : " + str, th);
            ((i9s) l2s.this.getView()).c(i, str, null);
        }
    }

    public class f implements IBaseModel.IResultCallback<Bundle> {
        public f() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bundle bundle) {
            MibiLog.d("PartnerPayPresenter", "query success");
            ((i9s) l2s.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerPayPresenter", "query error:" + i + ",errorDesc:" + str);
            ((i9s) l2s.this.getView()).c(i, str, null);
        }
    }

    public class g implements IBaseModel.IResultCallback<String> {
        public g() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            MibiLog.d("PartnerPayPresenter", "StartProcess onSuccess");
            l2s.this.f24581b = str;
            MemoryStorage memoryStorage = l2s.this.getSession().getMemoryStorage();
            memoryStorage.put(str, "order", l2s.this.f24580a.mOrder);
            memoryStorage.put(str, CommonConstants.KEY_PARTNER_USER_ID, l2s.this.f24580a.mPartnerUserId);
            memoryStorage.put(str, "accountType", l2s.this.f24580a.mPartnerAccountType);
            memoryStorage.put(str, "marketType", Long.valueOf(l2s.this.f24580a.mPartnerMarketType));
            l2s.this.b();
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerPayPresenter", "StartProcess failed:" + i + ",errorDesc:" + str);
            ((i9s) l2s.this.getView()).a(false);
            ((i9s) l2s.this.getView()).c(i, str, null);
        }
    }

    public l2s() {
        super(i9s.class);
    }

    @Override // defpackage.j2s
    public String a() {
        return this.f24581b;
    }

    public final long b(long j, List<DiscountGiftCard> list) {
        if (list != null && list.size() > 0) {
            for (DiscountGiftCard discountGiftCard : list) {
                if (j == discountGiftCard.mGiftCardId) {
                    return discountGiftCard.mGiftCardValue;
                }
            }
        }
        MibiLog.d("PartnerPayPresenter", "discountGiftCardId invalid");
        return 0L;
    }

    public final long d(RxCheckPartnerPayOrderTask.Result result) {
        return result.mOrderPrice - k(result);
    }

    public final void g(long j) {
        MibiLog.d("PartnerPayPresenter", "start get recharge types");
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f24581b);
        bundle.putLong(Constants.KEY_CHARGE_FEE, j);
        new j9s(getSession()).request(bundle, new e());
    }

    @Override // com.mibi.sdk.mvp.Presenter, com.mibi.sdk.mvp.IPresenter
    public void handleResult(int i, int i2, Bundle bundle) {
        super.handleResult(i, i2, bundle);
        MibiLog.d("PartnerPayPresenter", "handleResult req : " + i + " ; res : " + i2);
        if (i != 16) {
            if (i == 17) {
                if (i2 != -1) {
                    ((i9s) getView()).c(i2, bundle.getString("message"), null);
                    return;
                } else {
                    ((i9s) getView()).a();
                    q();
                    return;
                }
            }
            return;
        }
        boolean z = bundle.getBoolean(Constants.KEY_IS_DIRECT_PAY);
        MibiLog.d("PartnerPayPresenter", "isDirectPay : " + z);
        String string = bundle.getString("message");
        if (i2 != -1) {
            ((i9s) getView()).c(i2, string, bundle);
        } else if (z) {
            ((i9s) getView()).c(i2, string, bundle);
        } else {
            ((i9s) getView()).a();
            q();
        }
    }

    public final void j(RxGetPartnerRechargeTypeTask.Result result) {
        Recharge recharge;
        MibiLog.d("PartnerPayPresenter", "check channel");
        Iterator<RechargeType> it = result.mRechargeTypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                recharge = null;
                break;
            }
            if (TextUtils.equals(this.f24580a.mChannel, it.next().mType)) {
                recharge = RechargeManager.get().getRecharge(this.f24580a.mChannel);
                break;
            }
        }
        if (recharge != null) {
            ((i9s) getView()).k(recharge);
            return;
        }
        String str = "channel : " + this.f24580a.mChannel + " unavailable";
        MibiLog.d("PartnerPayPresenter", str);
        ((i9s) getView()).c(ErrorCodes.PARTNER_CHANNEL_INVALID, str, null);
    }

    public final long k(RxCheckPartnerPayOrderTask.Result result) {
        OrderBean orderBean = this.f24580a;
        long j = orderBean.mUseGiftcard ? result.mGiftcardValue : 0L;
        if (orderBean.mUseParterGiftcard) {
            j += result.mPartnerGiftcardValue;
        }
        if (orderBean.mUseBalance) {
            j += result.mBalance;
        }
        long j2 = orderBean.mDiscountGiftCardId;
        return j2 >= 0 ? j + b(j2, result.mDiscountGiftCards) : j;
    }

    public final void o() {
        MibiLog.d("PartnerPayPresenter", "doPay");
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f24581b);
        bundle.putBoolean(Constants.KEY_USE_BALANCE, this.f24580a.mUseBalance);
        bundle.putBoolean(Constants.KEY_USE_GIFTCARD, this.f24580a.mUseGiftcard);
        bundle.putBoolean(Constants.KEY_USE_PARTNER_GIFTCARD, this.f24580a.mUseParterGiftcard);
        bundle.putLong(Constants.KEY_USE_DISCOUNT_GIFT_CARD_ID, this.f24580a.mDiscountGiftCardId);
        new PartnerDoPayModel(getSession()).request(bundle, new c());
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        if (bundle != null) {
            this.f24581b = bundle.getString(CommonConstants.KEY_PROCESS_ID);
            return;
        }
        this.f24580a = (OrderBean) getArguments().getParcelable(Constants.KEY_ORDER_BEAN);
        ((i9s) getView()).a(true);
        s();
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onSave(Bundle bundle) {
        super.onSave(bundle);
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f24581b);
    }

    public final void q() {
        MibiLog.d("PartnerPayPresenter", "start query");
        hes hesVar = new hes(getSession(), true);
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f24581b);
        hesVar.request(bundle, new f());
    }

    public final void s() {
        MibiLog.d("PartnerPayPresenter", "start update domain");
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(com.mibi.sdk.model.Constants.KEY_PAY_ORDER, this.f24580a.mOrder);
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.KEY_SORTED_PARAMETERS, sortedParameter);
        new UpdateDomainModel(getSession()).request(bundle, new d());
    }

    public final void b() {
        MibiLog.d("PartnerPayPresenter", "start check order");
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f24581b);
        bundle.putString("order", this.f24580a.mOrder);
        new k2s(getSession()).request(bundle, new b());
    }
}
