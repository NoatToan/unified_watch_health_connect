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
import com.mibi.sdk.deduct.o.i;
import com.mibi.sdk.deduct.ui.UnionpayActivity;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class y2t extends izs {
    public static final String c = "y2t";

    public class a extends RxBaseErrorHandleTaskListener<i.a> {
        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ void c(i.a aVar, Activity activity) {
            if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                MibiLog.d(y2t.c, "activity state illegal");
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) UnionpayActivity.class);
            intent.putExtra(DeductConstants.KEY_PAY_INFO, aVar.f10158a);
            intent.putExtra("mode", aVar.f10159b);
            activity.startActivityForResult(intent, 101);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(final i.a aVar) {
            super.handleSuccess(aVar);
            MibiLog.d(y2t.c, "handle success");
            y2t.this.a().f(new xrs() { // from class: u2t
                @Override // defpackage.xrs
                public final void a(Object obj) {
                    y2t.a.c(aVar, (Activity) obj);
                }
            });
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            super.handleError(i, str, th);
            MibiLog.d(y2t.c, "handleError code : " + i + " ; desc : " + str, th);
            y2t.this.a().a(i, str);
        }
    }

    public y2t(Session session, String str) {
        super(session, str);
    }

    @Override // defpackage.izs
    public void d() {
        MibiLog.d(c, "start union-pay sign deduct");
        i iVar = new i(getContext(), getSession());
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, c());
        iVar.setParams(sortedParameter);
        n4h.a(iVar).c(new a(getContext()));
    }

    @Override // defpackage.izs, com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void handleResult(int i, int i2, Bundle bundle) {
        if (i == 101) {
            String str = c;
            MibiLog.d(str, "handle result : " + i2);
            String string = bundle.getString("errDesc");
            if (i2 == 1) {
                MibiLog.d(str, "union-pay sign deduct success");
                Bundle bundle2 = new Bundle();
                bundle2.putString(CommonConstants.KEY_PROCESS_ID, c());
                bundle2.putString("deductChannel", c.a.UNIONPAY.a());
                a().a(bundle2);
                return;
            }
            if (i2 == 2) {
                MibiLog.d(str, "union-pay sign deduct cancel");
                a().a(ErrorCodes.SIGN_DEDUCT_CANCEL, "union-pay deduct cancel");
                return;
            }
            MibiLog.d(str, "union-pay sign deduct failed : " + string);
            a().a(ErrorCodes.SIGN_DEDUCT_FAILED, string);
        }
    }
}
