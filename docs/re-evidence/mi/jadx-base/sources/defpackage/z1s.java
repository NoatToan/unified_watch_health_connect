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
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.MarketUtils;
import com.mibi.sdk.deduct.c;
import com.mibi.sdk.deduct.o.e;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class z1s extends mns {

    public class a implements nes<Activity> {

        /* JADX INFO: renamed from: z1s$a$a, reason: collision with other inner class name */
        public class C1161a implements MarketUtils.InstallPromptListener {
            public C1161a() {
            }

            @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
            public void onCancel() {
                z1s.this.a().a(ErrorCodes.DEDUCT_CANCEL, "Alipay install is canceled");
            }

            @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
            public void onConfirm() {
                z1s.this.a().a(ErrorCodes.DEDUCT_INSTALL, "go market for alipay install");
            }
        }

        public a() {
        }

        @Override // defpackage.nes
        public void a(Activity activity) {
            MarketUtils.showInstallPrompt(activity, activity.getString(com.mibi.sdk.deduct.a.i, activity.getResources().getString(com.mibi.sdk.deduct.a.h)), CommonConstants.ALIPAY_PACKAGE_NAME, new C1161a());
        }
    }

    public class b extends RxBaseErrorHandleTaskListener<e.a> {
        public /* synthetic */ b(z1s z1sVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(e.a aVar) {
            z1s.this.g(aVar.f10150a);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            z1s.this.a().a(i, str);
        }

        public b(Context context) {
            super(context);
        }
    }

    public z1s(Session session, String str) {
        super(session, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        if (TextUtils.isEmpty(str)) {
            d();
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        getContext().startActivity(intent);
        getSession().getMemoryStorage().put(c(), "deductStart", Boolean.TRUE);
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
        e eVar = new e(getContext(), getSession());
        b bVar = new b(this, getContext(), null);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, c());
        eVar.setParams(sortedParameter);
        n4h.a(eVar).c(bVar);
    }

    @Override // defpackage.mns
    public void d() {
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, c());
        bundle.putString("deductChannel", c.a.ALIPAY.a());
        a().a(bundle);
        getSession().getMemoryStorage().remove(c(), "deductStart");
    }

    @Override // defpackage.mns
    public void e() {
        if (MarketUtils.isAppInstalled(getContext(), CommonConstants.ALIPAY_PACKAGE_NAME)) {
            i();
        } else {
            h();
        }
    }
}
