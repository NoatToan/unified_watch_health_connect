package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.privacy.MibiPrivacyUtils;
import com.mibi.sdk.component.privacy.PrivacyManager;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.deduct.o.d;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.progress.StartProcessModel;
import com.mibi.sdk.mvp.IPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c2s extends BaseMvpPresenter<z2s> implements IPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StartProcessModel f4870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oes f4871b;
    public exs c;
    public String d;
    public String e;
    public String f;
    public String g;

    public class a implements IBaseModel.IResultCallback<String> {
        public a() {
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            MibiLog.d("CheckDeductOrderPre", "get processId success");
            c2s.this.d = str;
            PrivacyManager.makePrivacyParam(c2s.this.getSession(), MibiPrivacyUtils.MIBI_MARKET_TYPE, MibiPrivacyUtils.PRIVACY_DEDUCT_ENTRY);
            c2s.this.h();
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            MibiLog.d("CheckDeductOrderPre", "start process failed code : " + i + " ; msg : " + str);
            ((z2s) c2s.this.getView()).a(false);
            if (i == 1993) {
                ((z2s) c2s.this.getView()).a();
            } else {
                ((z2s) c2s.this.getView()).a(i, str);
            }
        }
    }

    public class b implements oes.c {
        public b() {
        }

        @Override // oes.c
        public void a(com.mibi.sdk.deduct.o.a.C0314a c0314a) {
            MibiLog.d("CheckDeductOrderPre", "check order success");
            c2s.this.j();
        }

        @Override // oes.c
        public void b(int i, String str, Throwable th) {
            ((z2s) c2s.this.getView()).a(false);
            ((z2s) c2s.this.getView()).a(i, str);
        }
    }

    public class c implements exs.c {
        public c() {
        }

        @Override // exs.c
        public void a(d.a aVar) {
            ArrayList<RechargeType> arrayList = aVar.f10148a;
            if (arrayList == null || arrayList.size() == 0) {
                ((z2s) c2s.this.getView()).a(ErrorCodes.SERVER_CHANNELS_EMPTY, "no available channels");
            }
            c2s c2sVar = c2s.this;
            if (!c2sVar.e(c2sVar.f, aVar.f10148a)) {
                ((z2s) c2s.this.getView()).a(ErrorCodes.DEDUCT_CHANNEL_NOT_IN_SERVER_CHANNELS, "channel not in server channels");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("deductChannel", c2s.this.f);
            bundle.putString(CommonConstants.KEY_PROCESS_ID, c2s.this.d);
            ((z2s) c2s.this.getView()).g(bundle);
        }

        @Override // exs.c
        public void b(int i, String str, Throwable th) {
            ((z2s) c2s.this.getView()).a(false);
            ((z2s) c2s.this.getView()).a(i, str);
        }
    }

    public c2s() {
        super(z2s.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        MibiLog.d("CheckDeductOrderPre", "start check order");
        this.f4871b.b(this.d, this.g, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        MibiLog.d("CheckDeductOrderPre", "start get types");
        this.c.b(this.d, this.e, new c());
    }

    private void l() {
        MibiLog.d("CheckDeductOrderPre", "start process");
        ((z2s) getView()).a(true);
        this.f4870a.request(null, new a());
    }

    public final boolean e(String str, List<RechargeType> list) {
        Iterator<RechargeType> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().mRechargeMethods.get(0).mChannel)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mibi.sdk.mvp.Presenter, com.mibi.sdk.mvp.IPresenter
    public void handleResult(int i, int i2, Bundle bundle) {
        super.handleResult(i, i2, bundle);
        MibiLog.d("CheckDeductOrderPre", "handleResult req: " + i + " ; res : " + i2);
        if (i == 120) {
            ((z2s) getView()).a(i2, bundle != null ? bundle.getString("message") : null);
        }
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        this.f4870a = new StartProcessModel(getSession());
        this.f4871b = new oes(getSession());
        this.c = new exs(getSession());
        this.g = getArguments().getString(Constants.KEY_DEDUCT_ORDER);
        this.f = getArguments().getString("deductChannel");
        this.e = com.mibi.sdk.deduct.c.c(getContext(), false, getSession().isFakeAccountLoader());
        if (bundle == null) {
            if (TextUtils.isEmpty(this.g)) {
                String string = getContext().getString(com.mibi.sdk.deduct.a.e);
                MibiLog.d("CheckDeductOrderPre", string);
                ((z2s) getView()).a(ErrorCodes.DEDUCT_ORDER_NULL, string);
            } else if (!TextUtils.isEmpty(this.e)) {
                l();
            } else {
                ((z2s) getView()).a(ErrorCodes.DEDUCT_LOCAL_CHANNELS_EMPTY, getContext().getResources().getString(com.mibi.sdk.deduct.a.g));
            }
        }
    }
}
