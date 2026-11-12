package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeManager;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.auth.CheckAuthModel;
import com.mibi.sdk.model.domain.UpdateDomainModel;
import com.mibi.sdk.model.progress.StartProcessModel;
import com.mibi.sdk.pay.model.DoPayModel;
import com.mibi.sdk.pay.task.RxAccountGetRechargeTypeTask;
import com.mibi.sdk.pay.task.RxStartAccountPaymentTask;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class qes extends BaseMvpPresenter<u9s> implements b3s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f31451b;
    public boolean c;

    public class b implements CheckAuthModel.ICheckAuthCallback {
        public b() {
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onAccountFrozen() {
            MibiLog.d("PreparePresenter", "onAccountFrozen");
            ((u9s) qes.this.getView()).b(ErrorCodes.ACCOUNT_FROZEN, "account frozen", null);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onAuthCheckError(int i, String str, Throwable th) {
            MibiLog.d("PreparePresenter", "onAuthCheckError:" + i);
            ((u9s) qes.this.getView()).b(i, str, th);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onBindPhoneCheck(Bundle bundle) {
            MibiLog.d("PreparePresenter", "onBindPhoneCheck");
            ((u9s) qes.this.getView()).onBindPhoneCheck(bundle);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onPasswordCheck() {
            MibiLog.d("PreparePresenter", "onPasswordCheck");
            ((u9s) qes.this.getView()).onPasswordCheck();
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onProcessExpired() {
            MibiLog.d("PreparePresenter", "onProcessExpired");
            ((u9s) qes.this.getView()).b(ErrorCodes.PROCESS_EXPIRED, qes.this.getContext().getResources().getString(com.mibi.sdk.pay.a.f), null);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onSMSCodeCheck(Bundle bundle) {
            MibiLog.d("PreparePresenter", "onSMSCodeCheck");
            ((u9s) qes.this.getView()).onSMSCodeCheck(bundle);
        }

        @Override // com.mibi.sdk.model.auth.CheckAuthModel.ICheckAuthCallback
        public void onSuccess() {
            MibiLog.d("PreparePresenter", "CheckAuthCallback onSuccess");
            qes.this.m();
        }
    }

    public class c implements IBaseModel.IResultCallback<Bundle> {
        public c() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bundle bundle) {
            MibiLog.d("PreparePresenter", "CheckOrder onSuccess");
            if (bundle == null) {
                qes.this.b();
                return;
            }
            OrderBean orderBean = (OrderBean) qes.this.getArguments().getParcelable(Constants.KEY_ORDER_BEAN);
            if (orderBean == null) {
                throw new IllegalStateException();
            }
            ArrayList<RechargeType> arrayList = (ArrayList) bundle.getSerializable(Constants.KEY_RECHARGE_TYPES);
            if (arrayList == null) {
                throw new IllegalStateException("rechargesFromServer should not be null");
            }
            if (qes.this.c) {
                if (orderBean.mIsNoAccount) {
                    ((u9s) qes.this.getView()).a(arrayList);
                    return;
                }
                MibiLog.d("PreparePresenter", "use account, use ui");
                ((u9s) qes.this.getView()).i((RxStartAccountPaymentTask.Result) qes.this.getSession().getMemoryStorage().getSerializable(qes.this.f31450a, Constants.KEY_PAY_TYPE_RESULT), (RxAccountGetRechargeTypeTask.Result) bundle.getSerializable(Constants.KEY_RECHARGE_TYPE_RESULT));
                return;
            }
            Recharge rechargeF = qes.this.f(orderBean.mChannel, arrayList);
            if (rechargeF == null) {
                MibiLog.e("PreparePresenter", "recharge is null");
                ((u9s) qes.this.getView()).b(ErrorCodes.PAY_CHANNEL_UNAVAILABLE, "no available channel", null);
                return;
            }
            Intent entryIntent = rechargeF.getEntryIntent(true);
            entryIntent.putExtra(CommonConstants.KEY_PROCESS_ID, qes.this.f31450a);
            if (orderBean.mIsNoAccount) {
                ((u9s) qes.this.getView()).n(entryIntent);
            } else {
                qes.this.f31451b = entryIntent;
                qes.this.b();
            }
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PreparePresenter", "CheckOrder failed:" + i + ",errorDesc:" + str);
            ((u9s) qes.this.getView()).b(i, str, th);
        }
    }

    public class d implements IBaseModel.IResultCallback<Bundle> {
        public d() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bundle bundle) {
            MibiLog.d("PreparePresenter", "do direct pay success");
            ((u9s) qes.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PreparePresenter", "do direct failed:" + i + ",desc:" + str, th);
            ((u9s) qes.this.getView()).b(i, str, th);
        }
    }

    public class e implements IBaseModel.IResultCallback<Void> {
        public e() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r4) {
            MibiLog.d("PreparePresenter", "Domain onSuccess");
            new StartProcessModel(qes.this.getSession()).request(null, new g());
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PreparePresenter", "Domain failed:" + i + ",errorDesc:" + str, th);
            ((u9s) qes.this.getView()).b(i, str, th);
        }
    }

    public class f implements IBaseModel.IResultCallback<Bundle> {
        public f() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bundle bundle) {
            MibiLog.d("PreparePresenter", "query success");
            ((u9s) qes.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PreparePresenter", "query error:" + i + ",errorDesc:" + str);
            ((u9s) qes.this.getView()).b(i, str, th);
        }
    }

    public class g implements IBaseModel.IResultCallback<String> {
        public g() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            MibiLog.d("PreparePresenter", "StartProcess onSuccess");
            qes.this.getSession().getMemoryStorage().put(str, Constants.KEY_ORDER_BEAN, qes.this.getArguments().getParcelable(Constants.KEY_ORDER_BEAN));
            qes.this.f31450a = str;
            qes.this.j();
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PreparePresenter", "StartProcess failed:" + i + ",errorDesc:" + str);
            if (i == 1993) {
                ((u9s) qes.this.getView()).onAccountFrozen();
            } else {
                ((u9s) qes.this.getView()).b(i, str, th);
            }
        }
    }

    public qes() {
        super(u9s.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        OrderBean orderBean = (OrderBean) getArguments().getParcelable(Constants.KEY_ORDER_BEAN);
        if (orderBean == null) {
            throw new IllegalStateException("orderBean is null");
        }
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, this.f31450a);
        sortedParameter.add("payChannel", orderBean.mChannel);
        sortedParameter.add(Constants.KEY_USE_BALANCE, Boolean.valueOf(orderBean.mUseBalance));
        sortedParameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(orderBean.mUseGiftcard));
        sortedParameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(orderBean.mUseParterGiftcard));
        Bundle bundle = new Bundle();
        sortedParameter.add(Constants.KEY_RECHARGE_CHANNELS, RechargeManager.get().getChannels(getContext()));
        sortedParameter.add("order", orderBean.mOrder);
        bundle.putSerializable(Constants.KEY_SORTED_PARAMETERS, sortedParameter);
        c cVar = new c();
        if (orderBean.mIsNoAccount) {
            new ces(getSession()).request(bundle, cVar);
            return;
        }
        sortedParameter.add(Constants.KEY_USE_BALANCE, Boolean.valueOf(orderBean.mUseBalance));
        sortedParameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(orderBean.mUseGiftcard));
        sortedParameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(orderBean.mUseParterGiftcard));
        new t9s(getSession(), this.c).request(bundle, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f31451b != null) {
            MibiLog.d("PreparePresenter", "go third pay:" + this.f31451b.getAction());
            ((u9s) getView()).n(this.f31451b);
            return;
        }
        MibiLog.d("PreparePresenter", "go direct pay");
        OrderBean orderBean = (OrderBean) getSession().getMemoryStorage().get(this.f31450a, Constants.KEY_ORDER_BEAN);
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f31450a);
        bundle.putBoolean(Constants.KEY_USE_BALANCE, orderBean.mUseBalance);
        bundle.putBoolean(Constants.KEY_USE_GIFTCARD, orderBean.mUseGiftcard);
        bundle.putBoolean(Constants.KEY_USE_PARTNER_GIFTCARD, orderBean.mUseParterGiftcard);
        bundle.putLong(Constants.KEY_USE_DISCOUNT_GIFT_CARD_ID, 0L);
        new DoPayModel(getSession()).request(bundle, new d());
    }

    private void n() {
        MibiLog.d("PreparePresenter", "start query");
        bjs bjsVar = new bjs(getSession());
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f31450a);
        bjsVar.request(bundle, new f());
    }

    @Override // defpackage.b3s
    public String a() {
        return this.f31450a;
    }

    public final Recharge f(String str, ArrayList<RechargeType> arrayList) {
        Iterator<RechargeType> it = arrayList.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().mType)) {
                MibiLog.d("PreparePresenter", "there's recharge in the server list");
                return RechargeManager.get().getRecharge(str);
            }
        }
        MibiLog.d("PreparePresenter", "there's no recharge in the server list");
        return null;
    }

    @Override // com.mibi.sdk.mvp.Presenter, com.mibi.sdk.mvp.IPresenter
    public void handleResult(int i, int i2, Bundle bundle) {
        super.handleResult(i, i2, bundle);
        MibiLog.d("PreparePresenter", "requestCode : " + i + " ; resultCode : " + i2);
        if (i == 100) {
            if (i2 == -1) {
                ((u9s) getView()).a();
                n();
                return;
            } else {
                MibiLog.d("PreparePresenter", "pay error");
                ((u9s) getView()).h(i2, bundle);
                return;
            }
        }
        if (i != 201 && i != 202) {
            if (i == 203) {
                if (i2 != -1) {
                    MibiLog.d("PreparePresenter", "account ui failed resultCode : " + i2);
                    ((u9s) getView()).h(i2, bundle);
                    return;
                }
                MibiLog.d("PreparePresenter", "account ui pay success");
                if (bundle.getBoolean(Constants.KEY_IS_DIRECT_PAY)) {
                    ((u9s) getView()).a(bundle.getBundle("result"));
                    return;
                } else {
                    ((u9s) getView()).a();
                    n();
                    return;
                }
            }
            if (i == 204) {
                if (i2 != -1) {
                    ((u9s) getView()).h(i2, bundle);
                    MibiLog.d("PreparePresenter", "select channel, nothing");
                    return;
                }
                Recharge recharge = RechargeManager.get().getRecharge(bundle.getString(Constants.KEY_RECHARGE_PAY_TYPE_CHOSEN));
                if (recharge == null) {
                    MibiLog.e("PreparePresenter", "recharge is null");
                    ((u9s) getView()).b(ErrorCodes.PAY_CHANNEL_UNAVAILABLE, "no available channel", null);
                    return;
                } else {
                    Intent entryIntent = recharge.getEntryIntent(true);
                    entryIntent.putExtra(CommonConstants.KEY_PROCESS_ID, this.f31450a);
                    ((u9s) getView()).n(entryIntent);
                    return;
                }
            }
            return;
        }
        if (i2 == -1) {
            MibiLog.d("PreparePresenter", "start pay from checkauth");
            m();
            return;
        }
        if (i2 == 9) {
            MibiLog.d("PreparePresenter", "account frozen");
            ((u9s) getView()).onAccountFrozen();
            return;
        }
        if (i2 != 1104) {
            StringBuilder sb = new StringBuilder();
            sb.append("check auth error data == null ? ");
            sb.append(bundle == null);
            MibiLog.d("PreparePresenter", sb.toString());
            ((u9s) getView()).h(i2, bundle);
            return;
        }
        int i3 = bundle.getInt("code");
        if (i3 == 7001) {
            MibiLog.d("PreparePresenter", "need check sms from checkauth");
            ((u9s) getView()).onSMSCodeCheck(bundle);
            return;
        }
        if (i3 == 7002) {
            MibiLog.e("PreparePresenter", "need bind phone from checkauth");
            ((u9s) getView()).onBindPhoneCheck(bundle);
        } else {
            if (i3 == 1985) {
                MibiLog.e("PreparePresenter", "need check password from checkauth");
                ((u9s) getView()).onPasswordCheck();
                return;
            }
            MibiLog.e("PreparePresenter", "check auth risk error,this should not be happened:" + i3);
            ((u9s) getView()).h(i2, bundle);
        }
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append("saveState == null ? ");
        sb.append(bundle == null);
        MibiLog.d("PreparePresenter", sb.toString());
        if (bundle == null) {
            q();
        } else {
            this.f31450a = bundle.getString(CommonConstants.KEY_PROCESS_ID);
            this.c = bundle.getBoolean("mibi_use_ui");
        }
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onSave(Bundle bundle) {
        super.onSave(bundle);
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f31450a);
        bundle.putBoolean("mibi_use_ui", this.c);
    }

    public final void q() {
        OrderBean orderBean = (OrderBean) getArguments().getParcelable(Constants.KEY_ORDER_BEAN);
        if (orderBean == null) {
            throw new IllegalStateException("orderBean is null");
        }
        this.c = orderBean.mUseUi;
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(com.mibi.sdk.model.Constants.KEY_PAY_ORDER, orderBean.mOrder);
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.KEY_SORTED_PARAMETERS, sortedParameter);
        new UpdateDomainModel(getSession()).request(bundle, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (((OrderBean) getSession().getMemoryStorage().get(this.f31450a, Constants.KEY_ORDER_BEAN)).mIsNoAccount) {
            throw new IllegalStateException("no account should not startCheckAuth");
        }
        CheckAuthModel checkAuthModel = new CheckAuthModel(getSession());
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f31450a);
        checkAuthModel.checkAuth(bundle, new b());
    }
}
