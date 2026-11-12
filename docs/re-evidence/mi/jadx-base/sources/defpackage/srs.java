package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.MarketUtils;
import com.mibi.sdk.deduct.o.g;
import com.mibi.sdk.deduct.o.m;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.miui.tsmclient.util.Constants;

/* JADX INFO: loaded from: classes5.dex */
public class srs extends mns {

    public class a extends RxBaseErrorHandleTaskListener<g.a> {

        /* JADX INFO: renamed from: srs$a$a, reason: collision with other inner class name */
        public class C1107a implements nes<Activity> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g.a f33926a;

            public C1107a(g.a aVar) {
                this.f33926a = aVar;
            }

            @Override // defpackage.nes
            public void a(Activity activity) {
                if (MarketUtils.isAppInstalled(activity, "com.mipay.wallet")) {
                    activity.startActivityForResult(a.this.a(this.f33926a), 100);
                    MibiLog.d("MipayDeductModel", "start Mipay deduct success");
                } else {
                    srs.this.a().a(ErrorCodes.DEDUCT_FAILED, activity.getResources().getString(com.mibi.sdk.deduct.a.f));
                    MibiLog.d("MipayDeductModel", "start Mipay deduct failed");
                }
            }
        }

        public final Intent a(g.a aVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.mipay.wallet");
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(Constants.URI_SCHEME);
            builder.authority(Constants.URI_AUTHORITY_MIPAY);
            builder.appendQueryParameter("id", "mipay.partnerAutoPay");
            builder.appendQueryParameter(com.mibi.sdk.component.Constants.KEY_REQUEST_DATA, aVar.f10152a);
            builder.appendQueryParameter("merchantName", aVar.c);
            builder.appendQueryParameter(com.mibi.sdk.component.Constants.KEY_CANCEL_MERCHANT_NAME, aVar.d);
            builder.appendQueryParameter(com.mibi.sdk.component.Constants.KEY_ORDER_GOODS_NAME, aVar.f10153b);
            intent.setData(builder.build());
            return intent;
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(g.a aVar) {
            super.handleSuccess(aVar);
            if (!TextUtils.isEmpty(aVar.f10152a)) {
                srs.this.a().d(new C1107a(aVar));
            } else {
                srs.this.h();
            }
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            super.handleError(i, str, th);
            srs.this.a().a(i, str);
        }

        public a(Context context) {
            super(context);
        }
    }

    public class c extends RxBaseErrorHandleTaskListener<m.a> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(m.a aVar) {
            srs.this.h();
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            srs.this.a().a(i, str);
            srs.this.getSession().getMemoryStorage().remove(srs.this.c(), "responseData");
        }

        public c(Context context) {
            super(context);
        }
    }

    public srs(Session session, String str) {
        super(session, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, c());
        bundle.putString("deductChannel", com.mibi.sdk.deduct.c.a.MIPAY.a());
        a().a(bundle);
        getSession().getMemoryStorage().remove(c(), "responseData");
    }

    private void i() {
        g gVar = new g(getContext(), getSession());
        a aVar = new a(getContext());
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, c());
        gVar.setParams(sortedParameter);
        n4h.a(gVar).c(aVar);
    }

    private void j() {
        m mVar = new m(getContext(), getSession());
        c cVar = new c(getContext());
        String str = (String) getSession().getMemoryStorage().get(c(), "responseData");
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, c());
        sortedParameter.add("responseData", str);
        mVar.setParams(sortedParameter);
        n4h.a(mVar).c(cVar);
    }

    @Override // defpackage.mns
    public void e() {
        if (TextUtils.isEmpty((String) getSession().getMemoryStorage().get(c(), "responseData"))) {
            i();
        } else {
            j();
        }
    }

    @Override // defpackage.mns, com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void handleResult(int i, int i2, Bundle bundle) {
        if (i == 100) {
            MibiLog.d("MipayDeductModel", "handle result");
            if (-1 == i2 && bundle != null) {
                MibiLog.d("MipayDeductModel", "mipay deduct success");
                getSession().getMemoryStorage().put(c(), "responseData", bundle.getBundle("result").getString("responseData"));
                j();
                return;
            }
            if (i2 != 0) {
                MibiLog.d("MipayDeductModel", "mipay deduct faield : " + i2);
                a().a(ErrorCodes.DEDUCT_FAILED, "mipay deduct failed");
                return;
            }
            MibiLog.d("MipayDeductModel", "mipay deduct cancel");
            if (bundle == null) {
                a().a(ErrorCodes.DEDUCT_CANCEL, "user cancel mipay deduct");
                return;
            }
            String string = bundle.getString("message");
            if (TextUtils.isEmpty(string)) {
                string = "mipay deduct canceled by user";
            }
            a().a(ErrorCodes.DEDUCT_CANCEL, string);
        }
    }
}
