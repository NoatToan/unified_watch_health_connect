package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.mibi.sdk.common.Client;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.LocalBroadcastManager;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.MarketUtils;
import com.mibi.sdk.deduct.o.f;
import com.mibi.sdk.mvp.lifecycle.ILifeCycleListener;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a9s extends izs implements ILifeCycleListener {
    public volatile Activity c;
    public d d;
    public boolean e;

    public class a implements xrs<Activity> {

        /* JADX INFO: renamed from: a9s$a$a, reason: collision with other inner class name */
        public class C0003a implements MarketUtils.InstallPromptListener {
            public C0003a() {
            }

            @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
            public void onCancel() {
                a9s.this.a().a(ErrorCodes.SIGN_DEDUCT_CANCEL, "Alipay install is canceled");
            }

            @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
            public void onConfirm() {
                a9s.this.a().a(ErrorCodes.DEDUCT_INSTALL, "go market for alipay install");
            }
        }

        public a() {
        }

        @Override // defpackage.xrs
        public void a(Activity activity) {
            MarketUtils.showInstallPrompt(activity, activity.getString(com.mibi.sdk.deduct.a.i, activity.getResources().getString(com.mibi.sdk.deduct.a.h)), CommonConstants.ALIPAY_PACKAGE_NAME, new C0003a());
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f811a;

        public /* synthetic */ b(a9s a9sVar, String str, a aVar) {
            this(str);
        }

        public final void a(String str) {
            Intent intent = new Intent("com.mibi.sdk.alipay.result.action");
            intent.setPackage(Client.getAppInfo().getPackage());
            intent.putExtra("mibi_alipay_status", str);
            LocalBroadcastManager.getInstance(a9s.this.getContext()).sendBroadcast(intent);
            MibiLog.d("AlipaySignDeductModel", "send broadcast");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!a9s.this.n()) {
                MibiLog.d("AlipaySignDeductModel", "activity is null,maybe activity has been destroyed");
                return;
            }
            MibiLog.i("AlipaySignDeductModel", "start ali sign deduct");
            Map<String, String> mapPayV2 = new PayTask(a9s.this.c).payV2(this.f811a, true);
            MibiLog.i("AlipaySignDeductModel", "finish ali sign deduct");
            String strA = new rus(mapPayV2).a();
            if (!a9s.this.n()) {
                a(strA);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.obj = strA;
            a9s.this.d.sendMessage(messageObtain);
        }

        public b(String str) {
            this.f811a = str;
        }
    }

    public class c extends RxBaseErrorHandleTaskListener<f.a> {
        public /* synthetic */ c(a9s a9sVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(f.a aVar) {
            a9s.this.g(aVar);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            a9s.this.a().a(i, str);
        }

        public c(Context context) {
            super(context);
        }
    }

    public static class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<a9s> f814a;

        public /* synthetic */ d(a9s a9sVar, a aVar) {
            this(a9sVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a9s a9sVar = this.f814a.get();
            if (a9sVar == null) {
                MibiLog.d("AlipaySignDeductModel", "model is null");
                return;
            }
            String str = (String) message.obj;
            if (message.what != 100) {
                return;
            }
            if (TextUtils.equals("9000", str)) {
                a9sVar.q();
                MibiLog.d("AlipaySignDeductModel", "ali sign deduct success");
            } else {
                if (TextUtils.equals("6001", str)) {
                    MibiLog.d("AlipaySignDeductModel", "ali sign deduct cancelled by user");
                    a9sVar.a().a(ErrorCodes.SIGN_DEDUCT_CANCEL, a9sVar.getContext().getResources().getString(com.mibi.sdk.deduct.a.f10137r));
                    return;
                }
                MibiLog.d("AlipaySignDeductModel", "ali sign deduct failed : " + str);
                a9sVar.a().a(ErrorCodes.SIGN_DEDUCT_FAILED, "alipay sign deduct exception");
            }
        }

        public d(a9s a9sVar) {
            this.f814a = new WeakReference<>(a9sVar);
        }
    }

    public a9s(Session session, String str) {
        super(session, str);
        this.d = new d(this, null);
        this.e = false;
    }

    @Override // defpackage.izs
    public void d() {
        MibiLog.d("AlipaySignDeductModel", "start sign deduct called");
        if (MarketUtils.isAppInstalled(getContext(), CommonConstants.ALIPAY_PACKAGE_NAME)) {
            r();
        } else {
            p();
        }
    }

    public a9s e(Activity activity) {
        this.c = activity;
        return this;
    }

    public final void g(f.a aVar) {
        if (TextUtils.isEmpty(aVar.f10151a)) {
            q();
            return;
        }
        if (!aVar.f10151a.startsWith("alipays://platformapi/startapp")) {
            MibiLog.d("AlipaySignDeductModel", "open by pay task");
            this.e = true;
            new Thread(new b(this, aVar.f10151a, null)).start();
        } else {
            MibiLog.d("AlipaySignDeductModel", "open by scheme");
            this.e = false;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(aVar.f10151a));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            getSession().getMemoryStorage().put(c(), "signDeductStart", Boolean.TRUE);
        }
    }

    public void l() {
        if (!getSession().getMemoryStorage().getBoolean(c(), "signDeductStart", false) || this.e) {
            return;
        }
        q();
    }

    public final boolean n() {
        return (this.c == null || this.c.isDestroyed() || this.c.isFinishing()) ? false : true;
    }

    @Override // defpackage.izs, com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onDestroy() {
        this.c = null;
    }

    public final void p() {
        a().f(new a());
    }

    public final void q() {
        MibiLog.d("AlipaySignDeductModel", "start query result");
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, c());
        bundle.putString(Constants.KEY_SIGN_DEDUCT_CHANNEL, com.mibi.sdk.deduct.c.a.ALIPAY.a());
        a().a(bundle);
    }

    public final void r() {
        f fVar = new f(getContext(), getSession());
        c cVar = new c(this, getContext(), null);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, c());
        fVar.setParams(sortedParameter);
        n4h.a(fVar).c(cVar);
    }
}
