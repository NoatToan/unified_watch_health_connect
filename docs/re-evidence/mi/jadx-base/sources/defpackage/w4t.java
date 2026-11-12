package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.DeductConstants;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.MarketUtils;
import com.mibi.sdk.deduct.c;
import com.mibi.sdk.deduct.o.j;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class w4t extends mns {
    public IWXAPI c;

    public class a implements nes<Activity> {

        /* JADX INFO: renamed from: w4t$a$a, reason: collision with other inner class name */
        public class C1131a implements MarketUtils.InstallPromptListener {
            public C1131a() {
            }

            @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
            public void onCancel() {
                w4t.this.a().a(ErrorCodes.DEDUCT_CANCEL, "Wxpay install is canceled");
            }

            @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
            public void onConfirm() {
                w4t.this.a().a(ErrorCodes.DEDUCT_INSTALL, "go market for wxpay install");
            }
        }

        public a() {
        }

        @Override // defpackage.nes
        public void a(Activity activity) {
            MarketUtils.showInstallPrompt(activity, activity.getString(com.mibi.sdk.deduct.a.i, activity.getResources().getString(com.mibi.sdk.deduct.a.n)), "com.tencent.mm", new C1131a());
        }
    }

    public class b extends RxBaseErrorHandleTaskListener<j.a> {
        public /* synthetic */ b(w4t w4tVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(j.a aVar) {
            w4t.this.f(aVar);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            w4t.this.a().a(i, str);
        }

        public b(Context context) {
            super(context);
        }
    }

    public w4t(Session session, String str) {
        super(session, str);
        this.c = WXAPIFactory.createWXAPI(getContext().getApplicationContext(), null);
    }

    private void h() {
        a().d(new a());
    }

    private void i() {
        if (getSession().getMemoryStorage().getBoolean(c(), "deductStart", false)) {
            d();
        } else {
            j();
        }
    }

    private void j() {
        j jVar = new j(getContext(), getSession());
        b bVar = new b(this, getContext(), null);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, c());
        jVar.setParams(sortedParameter);
        n4h.a(jVar).c(bVar);
    }

    @Override // defpackage.mns
    public void d() {
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, c());
        bundle.putString("deductChannel", c.a.WXPAY.a());
        a().a(bundle);
        getSession().getMemoryStorage().remove(c(), "deductStart");
    }

    @Override // defpackage.mns
    public void e() {
        if (this.c.isWXAppInstalled()) {
            i();
        } else {
            h();
        }
    }

    public final void f(j.a aVar) {
        if (TextUtils.isEmpty(aVar.f10160a)) {
            d();
            return;
        }
        WXOpenBusinessWebview.Req req = new WXOpenBusinessWebview.Req();
        req.businessType = aVar.m;
        HashMap<String, String> map = new HashMap<>();
        map.put("appid", aVar.f10161b);
        map.put(DeductConstants.KEY_WX_CONTRACT_CODE, aVar.c);
        map.put(DeductConstants.KEY_WX_CONTRACT_DISPLAY_ACCOUNT, aVar.d);
        map.put(DeductConstants.KEY_WX_MCH_ID, aVar.e);
        map.put(DeductConstants.KEY_WX_NOTIFY_URL, aVar.f);
        map.put(DeductConstants.KEY_WX_PLAN_ID, aVar.g);
        map.put(DeductConstants.KEY_WX_REQUEST_SERIAL, aVar.h);
        map.put("timestamp", aVar.j);
        map.put("version", aVar.f10162k);
        map.put("sign", aVar.l);
        map.put(DeductConstants.KEY_WX_RETURN_APP, aVar.i);
        if (!TextUtils.isEmpty(aVar.n)) {
            map.put(DeductConstants.KEY_WX_OUTER_ID, aVar.n);
        }
        req.queryInfo = map;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(getContext().getApplicationContext(), null);
        this.c = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(aVar.f10161b);
        this.c.sendReq(req);
        getSession().getMemoryStorage().put(c(), "deductStart", Boolean.TRUE);
    }
}
