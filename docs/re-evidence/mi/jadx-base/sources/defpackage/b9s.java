package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.deduct.o.d;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.progress.StartProcessModel;
import com.mibi.sdk.mvp.IPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b9s extends BaseMvpPresenter<s9s> implements IPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StartProcessModel f3960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zis f3961b;
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
            MibiLog.d("CheckSignDeductOrderPre", "get processId success");
            b9s.this.d = str;
            b9s.this.h();
        }

        @Override // com.mibi.sdk.model.IBaseModel.IResultCallback
        public void onFailed(int i, String str, Throwable th) {
            ((s9s) b9s.this.getView()).a(false);
            if (i == 1993) {
                ((s9s) b9s.this.getView()).a();
            } else {
                ((s9s) b9s.this.getView()).c(i, str, null);
            }
        }
    }

    public class b implements zis.c {
        public b() {
        }

        @Override // zis.c
        public void a(com.mibi.sdk.deduct.o.b.a aVar) {
            MibiLog.d("CheckSignDeductOrderPre", "check order success");
            b9s.this.j();
        }

        @Override // zis.c
        public void b(int i, String str, Throwable th) {
            MibiLog.d("CheckSignDeductOrderPre", "check order failed", th);
            ((s9s) b9s.this.getView()).a(false);
            ((s9s) b9s.this.getView()).c(i, str, null);
        }
    }

    public class c implements exs.c {
        public c() {
        }

        @Override // exs.c
        public void a(d.a aVar) {
            ArrayList<RechargeType> arrayList = aVar.f10148a;
            if (arrayList == null || arrayList.size() == 0) {
                ((s9s) b9s.this.getView()).c(ErrorCodes.SERVER_CHANNELS_EMPTY, "no available channels", null);
            }
            b9s b9sVar = b9s.this;
            if (!b9sVar.e(b9sVar.f, aVar.f10148a)) {
                ((s9s) b9s.this.getView()).c(ErrorCodes.DEDUCT_CHANNEL_NOT_IN_SERVER_CHANNELS, "channel not in server channels", null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable(Constants.KEY_SIGN_DEDUCT_CHANNEL, b9s.this.f);
            bundle.putString(CommonConstants.KEY_PROCESS_ID, b9s.this.d);
            ((s9s) b9s.this.getView()).a(bundle);
        }

        @Override // exs.c
        public void b(int i, String str, Throwable th) {
            ((s9s) b9s.this.getView()).a(false);
            ((s9s) b9s.this.getView()).c(i, str, null);
        }
    }

    public b9s() {
        super(s9s.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, List<RechargeType> list) {
        Iterator<RechargeType> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().mRechargeMethods.get(0).mChannel)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        MibiLog.d("CheckSignDeductOrderPre", "start check order");
        this.f3961b.b(this.d, this.g, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.c.b(this.d, this.e, new c());
    }

    private void l() {
        MibiLog.d("CheckSignDeductOrderPre", "start process");
        ((s9s) getView()).a(true);
        this.f3960a.request(null, new a());
    }

    @Override // com.mibi.sdk.mvp.Presenter, com.mibi.sdk.mvp.IPresenter
    public void handleResult(int i, int i2, Bundle bundle) {
        super.handleResult(i, i2, bundle);
        MibiLog.d("CheckSignDeductOrderPre", "handleResult req : " + i + " ; res : " + i2);
        if (i == 120) {
            ((s9s) getView()).c(i2, bundle != null ? bundle.getString("message") : null, bundle);
        }
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        this.f3960a = new StartProcessModel(getSession());
        this.f3961b = new zis(getSession());
        this.c = new exs(getSession());
        this.g = getArguments().getString("deductSignAndPayOrder");
        this.f = getArguments().getString(Constants.KEY_SIGN_DEDUCT_CHANNEL);
        this.e = com.mibi.sdk.deduct.c.c(getContext(), true, getSession().isFakeAccountLoader());
        if (bundle == null) {
            if (TextUtils.isEmpty(this.g)) {
                String string = getContext().getString(com.mibi.sdk.deduct.a.e);
                MibiLog.d("CheckSignDeductOrderPre", string);
                ((s9s) getView()).c(ErrorCodes.DEDUCT_ORDER_NULL, string, null);
            } else if (!TextUtils.isEmpty(this.e)) {
                l();
            } else {
                ((s9s) getView()).c(ErrorCodes.DEDUCT_LOCAL_CHANNELS_EMPTY, getContext().getResources().getString(com.mibi.sdk.deduct.a.g), null);
            }
        }
    }
}
