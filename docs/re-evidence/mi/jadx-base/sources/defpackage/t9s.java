package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.MemoryStorage;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.component.privacy.MibiPrivacyUtils;
import com.mibi.sdk.component.privacy.PrivacyManager;
import com.mibi.sdk.component.recharge.RechargeManager;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.pay.model.UploadOrderGiftcardModel;
import com.mibi.sdk.pay.task.RxAccountGetRechargeTypeTask;
import com.mibi.sdk.pay.task.RxStartAccountPaymentTask;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.mibi.sdk.task.RxPrivacyUploadTask;

/* JADX INFO: loaded from: classes5.dex */
public class t9s extends Model<Bundle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34485b;
    public boolean c;

    public class b implements IBaseModel.IResultCallback<RxAccountGetRechargeTypeTask.Result> {
        public b() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(RxAccountGetRechargeTypeTask.Result result) {
            MibiLog.d("AccountOrderCheckModel", "get recharge types success");
            Bundle bundle = new Bundle();
            bundle.putSerializable(Constants.KEY_RECHARGE_TYPES, result.mRechargeTypes);
            if (t9s.this.c) {
                bundle.putSerializable(Constants.KEY_RECHARGE_TYPE_RESULT, result);
            }
            t9s.this.getCallback().onSuccess(bundle);
            t9s t9sVar = t9s.this;
            t9sVar.f(t9sVar.f34485b);
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("AccountOrderCheckModel", "get recharge types failed");
            t9s.this.getCallback().onFailed(i, str, th);
        }
    }

    public class c extends RxBaseErrorHandleTaskListener<RxStartAccountPaymentTask.Result> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(RxStartAccountPaymentTask.Result result) {
            if (result.mResult != null) {
                new Bundle().putString(MibiSdkConstants.PAYMENT_KEY_PAYMENT_RESULT, result.mResult);
                t9s.this.getCallback().onFailed(result.mResultErrorCode, result.mResultErrorDesc, null);
                return;
            }
            t9s.this.f34485b = result.mServerMarketType;
            MemoryStorage memoryStorage = t9s.this.getSession().getMemoryStorage();
            if (t9s.this.c) {
                memoryStorage.put(t9s.this.f34484a, Constants.KEY_PAY_TYPE_RESULT, result);
                t9s.this.c(result.mOrderPrice);
                return;
            }
            memoryStorage.put(t9s.this.f34484a, Constants.KEY_ORDER_FEE, Long.valueOf(result.mOrderPrice));
            memoryStorage.put(t9s.this.f34484a, "balance", Long.valueOf(result.mBalance));
            memoryStorage.put(t9s.this.f34484a, "giftcardValue", Long.valueOf(result.mGiftcardValue));
            memoryStorage.put(t9s.this.f34484a, Constants.KEY_PARTNER_GIFTCARD_VALUE, Long.valueOf(result.mPartnerGiftcardValue));
            memoryStorage.put(t9s.this.f34484a, Constants.KEY_USE_GIFTCARD_ALLOWED, Boolean.valueOf(result.mUseGiftcard));
            memoryStorage.put(t9s.this.f34484a, Constants.KEY_USE_PARTNER_GIFTCARD_ALLOWED, Boolean.valueOf(result.mUsePartnerGiftcard));
            memoryStorage.put(t9s.this.f34484a, Constants.KEY_RECHARGE_VALUE, Long.valueOf(t9s.this.a()));
            MibiLog.d("AccountOrderCheckModel", "requesting giftcards");
            OrderBean orderBean = (OrderBean) t9s.this.getSession().getMemoryStorage().get(t9s.this.f34484a, Constants.KEY_ORDER_BEAN);
            UploadOrderGiftcardModel uploadOrderGiftcardModel = new UploadOrderGiftcardModel(t9s.this.getSession());
            SortedParameter sortedParameter = new SortedParameter();
            sortedParameter.add(CommonConstants.KEY_PROCESS_ID, t9s.this.f34484a);
            sortedParameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(orderBean.mUseGiftcard));
            sortedParameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(orderBean.mUseParterGiftcard));
            Bundle bundle = new Bundle();
            bundle.putSerializable(Constants.KEY_SORTED_PARAMETERS, sortedParameter);
            uploadOrderGiftcardModel.request(bundle, new d());
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            t9s.this.getCallback().onFailed(i, str, th);
        }

        public c(Context context) {
            super(context);
        }
    }

    public class d implements IBaseModel.IResultCallback<Void> {
        public d() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r6) {
            MibiLog.d("AccountOrderCheckModel", "upload giftcard successed");
            long j = t9s.this.getSession().getMemoryStorage().getLong(t9s.this.f34484a, Constants.KEY_RECHARGE_VALUE);
            if (j > 0) {
                MibiLog.d("AccountOrderCheckModel", "need third party recharge");
                t9s.this.c(j);
            } else {
                MibiLog.d("AccountOrderCheckModel", "no need third party recharge");
                t9s.this.getCallback().onSuccess(null);
                t9s t9sVar = t9s.this;
                t9sVar.f(t9sVar.f34485b);
            }
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("AccountOrderCheckModel", "upload giftcard failed");
            t9s.this.getCallback().onFailed(i, str, th);
        }
    }

    public t9s(Session session, boolean z) {
        super(session);
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        PrivacyManager.makePrivacyParam(getSession(), str, MibiPrivacyUtils.PRIVACY_PAYMENT_ENTRY);
        n4h.a(new RxPrivacyUploadTask(getSession())).b();
    }

    public final long a() {
        MemoryStorage memoryStorage = getSession().getMemoryStorage();
        OrderBean orderBean = (OrderBean) memoryStorage.get(this.f34484a, Constants.KEY_ORDER_BEAN);
        boolean z = orderBean.mUseBalance;
        boolean z2 = orderBean.mUseGiftcard;
        boolean z3 = orderBean.mUseParterGiftcard;
        long j = memoryStorage.getLong(this.f34484a, Constants.KEY_ORDER_FEE);
        long j2 = memoryStorage.getLong(this.f34484a, "balance");
        long j3 = memoryStorage.getLong(this.f34484a, "giftcardValue");
        long j4 = memoryStorage.getLong(this.f34484a, Constants.KEY_PARTNER_GIFTCARD_VALUE);
        boolean zBooleanValue = ((Boolean) memoryStorage.get(this.f34484a, Constants.KEY_USE_GIFTCARD_ALLOWED)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) memoryStorage.get(this.f34484a, Constants.KEY_USE_PARTNER_GIFTCARD_ALLOWED)).booleanValue();
        if (!z) {
            j2 = 0;
        }
        if (zBooleanValue && z2) {
            j2 += j3;
        }
        if (zBooleanValue2 && z3) {
            j2 += j4;
        }
        return Math.max(j - j2, 0L);
    }

    public final void c(long j) {
        a3s a3sVar = new a3s(getSession());
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, this.f34484a);
        sortedParameter.add(Constants.KEY_CHARGE_FEE, Long.valueOf(j));
        sortedParameter.add(Constants.KEY_RECHARGE_CHANNELS, RechargeManager.get().getChannels(getContext()));
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.KEY_SORTED_PARAMETERS, sortedParameter);
        a3sVar.request(bundle, new b());
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Bundle> iResultCallback) {
        super.request(bundle, iResultCallback);
        SortedParameter sortedParameter = (SortedParameter) bundle.getSerializable(Constants.KEY_SORTED_PARAMETERS);
        if (sortedParameter == null || iResultCallback == null) {
            throw new IllegalStateException();
        }
        this.f34484a = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        RxStartAccountPaymentTask rxStartAccountPaymentTask = new RxStartAccountPaymentTask(getContext(), getSession());
        rxStartAccountPaymentTask.setParams(sortedParameter);
        n4h.a(rxStartAccountPaymentTask).c(new c(getContext()));
    }
}
