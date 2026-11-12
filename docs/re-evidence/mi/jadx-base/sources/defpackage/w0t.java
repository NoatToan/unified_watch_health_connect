package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.DeductConstants;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.deduct.c;
import com.mibi.sdk.deduct.o.h;
import com.mibi.sdk.deduct.ui.UnionpayActivity;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class w0t extends mns {
    public static final String c = "w0t";

    public class a extends RxBaseErrorHandleTaskListener<h.a> {
        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ void c(h.a aVar, Activity activity) {
            if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                MibiLog.d(w0t.c, "activity state illegal");
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) UnionpayActivity.class);
            intent.putExtra(DeductConstants.KEY_PAY_INFO, aVar.f10155a);
            intent.putExtra("mode", aVar.f10156b);
            activity.startActivityForResult(intent, 100);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(final h.a aVar) {
            super.handleSuccess(aVar);
            MibiLog.d(w0t.c, "handle success");
            w0t.this.a().d(new nes() { // from class: r0t
                @Override // defpackage.nes
                public final void a(Object obj) {
                    w0t.a.c(aVar, (Activity) obj);
                }
            });
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            super.handleError(i, str, th);
            MibiLog.d(w0t.c, "handleError code : " + i + " ; desc : " + str, th);
            w0t.this.a().a(i, str);
        }
    }

    public w0t(Session session, String str) {
        super(session, str);
    }

    @Override // defpackage.mns
    public void e() {
        MibiLog.d(c, "start union-pay deduct");
        h hVar = new h(getContext(), getSession());
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, c());
        hVar.setParams(sortedParameter);
        n4h.a(hVar).c(new a(getContext()));
    }

    @Override // defpackage.mns, com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void handleResult(int i, int i2, Bundle bundle) {
        if (i == 100) {
            String str = c;
            MibiLog.d(str, "handle result : " + i2);
            String string = bundle.getString("errDesc");
            if (i2 == 1) {
                MibiLog.d(str, "union-pay deduct success");
                Bundle bundle2 = new Bundle();
                bundle2.putString(CommonConstants.KEY_PROCESS_ID, c());
                bundle2.putString("deductChannel", c.a.UNIONPAY.a());
                a().a(bundle2);
                return;
            }
            if (i2 == 2) {
                MibiLog.d(str, "union-pay deduct cancel");
                a().a(ErrorCodes.DEDUCT_CANCEL, "union-pay deduct cancel");
                return;
            }
            MibiLog.d(str, "union-pay deduct failed : " + string);
            a().a(ErrorCodes.DEDUCT_FAILED, string);
        }
    }
}
