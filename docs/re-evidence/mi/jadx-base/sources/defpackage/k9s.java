package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.session.MemoryStorage;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeManager;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.domain.UpdateDomainModel;
import com.mibi.sdk.partner.task.RxGetPartnerRechargeTypeTask;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class k9s extends BaseMvpPresenter<uis> implements ges {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OrderBean f23640b;

    public class b implements IBaseModel.IResultCallback<Void> {
        public b() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r5) {
            MibiLog.d("PartnerRechargePre", "Domain onSuccess");
            d9s d9sVar = new d9s(k9s.this.getSession());
            Bundle bundle = new Bundle();
            bundle.putString(CommonConstants.KEY_PARTNER_USER_ID, k9s.this.f23640b.mPartnerUserId);
            bundle.putString("accountType", k9s.this.f23640b.mPartnerAccountType);
            bundle.putLong("marketType", k9s.this.f23640b.mPartnerMarketType);
            d9sVar.request(bundle, new e());
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerRechargePre", "Domain failed:" + i + ",errorDesc:" + str);
            ((uis) k9s.this.getView()).a(false);
            ((uis) k9s.this.getView()).c(i, str, null);
        }
    }

    public class c implements IBaseModel.IResultCallback<RxGetPartnerRechargeTypeTask.Result> {
        public c() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(RxGetPartnerRechargeTypeTask.Result result) {
            MibiLog.d("PartnerRechargePre", "get recharge types success");
            MemoryStorage memoryStorage = k9s.this.getSession().getMemoryStorage();
            memoryStorage.put(k9s.this.f23639a, Constants.KEY_RECHARGE_VALUE, Long.valueOf(k9s.this.f23640b.mRechargeFee));
            memoryStorage.put(k9s.this.f23639a, CommonConstants.KEY_IS_PARTNER_ACCOUNT, Boolean.TRUE);
            if (k9s.this.f23640b.mUseUi) {
                ((uis) k9s.this.getView()).a(result.mRechargeTypes);
            } else {
                k9s.this.e(result);
            }
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerRechargePre", "get recharge types failed code : " + i + " ; msg : " + str, th);
            ((uis) k9s.this.getView()).c(i, str, null);
        }
    }

    public class d implements IBaseModel.IResultCallback<Bundle> {
        public d() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bundle bundle) {
            MibiLog.d("PartnerRechargePre", "query success");
            ((uis) k9s.this.getView()).a(bundle);
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerRechargePre", "query error:" + i + ",errorDesc:" + str);
            ((uis) k9s.this.getView()).c(i, str, null);
        }
    }

    public class e implements IBaseModel.IResultCallback<String> {
        public e() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            MibiLog.d("PartnerRechargePre", "StartProcess onSuccess");
            k9s.this.f23639a = str;
            MemoryStorage memoryStorage = k9s.this.getSession().getMemoryStorage();
            memoryStorage.put(str, CommonConstants.KEY_PARTNER_USER_ID, k9s.this.f23640b.mPartnerUserId);
            memoryStorage.put(str, "accountType", k9s.this.f23640b.mPartnerAccountType);
            memoryStorage.put(str, "marketType", Long.valueOf(k9s.this.f23640b.mPartnerMarketType));
            k9s.this.b();
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("PartnerRechargePre", "StartProcess failed:" + i + ",errorDesc:" + str);
            ((uis) k9s.this.getView()).a(false);
            ((uis) k9s.this.getView()).c(i, str, null);
        }
    }

    public k9s() {
        super(uis.class);
    }

    @Override // defpackage.ges
    public String a() {
        return this.f23639a;
    }

    public final void b() {
        MibiLog.d("PartnerRechargePre", "start get recharge types");
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f23639a);
        bundle.putLong(Constants.KEY_CHARGE_FEE, this.f23640b.mRechargeFee);
        new j9s(getSession()).request(bundle, new c());
    }

    public final void e(RxGetPartnerRechargeTypeTask.Result result) {
        Recharge recharge;
        MibiLog.d("PartnerRechargePre", "check channel");
        Iterator<RechargeType> it = result.mRechargeTypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                recharge = null;
                break;
            }
            if (TextUtils.equals(this.f23640b.mChannel, it.next().mType)) {
                recharge = RechargeManager.get().getRecharge(this.f23640b.mChannel);
                break;
            }
        }
        if (recharge != null) {
            ((uis) getView()).j(recharge);
            return;
        }
        String str = "channel : " + this.f23640b.mChannel + " unavailable";
        MibiLog.d("PartnerRechargePre", str);
        ((uis) getView()).c(ErrorCodes.PARTNER_CHANNEL_INVALID, str, null);
    }

    public final void h() {
        MibiLog.d("PartnerRechargePre", "start query recharge result");
        hes hesVar = new hes(getSession(), false);
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f23639a);
        hesVar.request(bundle, new d());
    }

    @Override // com.mibi.sdk.mvp.Presenter, com.mibi.sdk.mvp.IPresenter
    public void handleResult(int i, int i2, Bundle bundle) {
        super.handleResult(i, i2, bundle);
        MibiLog.d("PartnerRechargePre", "handleResult req : " + i + " ; res : " + i2);
        if (i == 50) {
            if (i2 == -1) {
                ((uis) getView()).a();
                h();
                return;
            }
            String string = bundle.getString("message");
            MibiLog.d("PartnerRechargePre", "msg: " + string);
            ((uis) getView()).c(i2, string, bundle);
            return;
        }
        if (i == 51) {
            if (i2 != -1) {
                String string2 = bundle.getString("message");
                MibiLog.d("PartnerRechargePre", "msg" + string2);
                ((uis) getView()).c(i2, string2, bundle);
                return;
            }
            if (i2 == -1) {
                Recharge recharge = RechargeManager.get().getRecharge(bundle.getString(Constants.KEY_RECHARGE_PAY_TYPE_CHOSEN));
                if (recharge != null) {
                    ((uis) getView()).j(recharge);
                    return;
                }
                MibiLog.d("PartnerRechargePre", "msg: can't get recharge from local map, maybe app has been killed in the bg");
                ((uis) getView()).c(ErrorCodes.PARTNER_APP_KILLED, "can't get recharge from local map, maybe app has been killed in the bg", null);
            }
        }
    }

    public final void j() {
        MibiLog.d("PartnerRechargePre", "start update domain");
        new UpdateDomainModel(getSession()).request(new Bundle(), new b());
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        if (bundle != null) {
            this.f23639a = bundle.getString(CommonConstants.KEY_PROCESS_ID);
            return;
        }
        this.f23640b = (OrderBean) getArguments().getParcelable(Constants.KEY_ORDER_BEAN);
        ((uis) getView()).a(true);
        j();
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onSave(Bundle bundle) {
        super.onSave(bundle);
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f23639a);
    }
}
