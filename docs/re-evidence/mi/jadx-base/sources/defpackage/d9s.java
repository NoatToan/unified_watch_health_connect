package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.mibi.sdk.task.handler.NoPrivacyRightExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public class d9s extends Model<String> {

    public class a extends NoPrivacyRightExceptionHandler {
        public a(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.handler.NoPrivacyRightExceptionHandler
        public boolean handleNoPrivacyRightException(int i, String str) {
            d9s.this.getCallback().onFailed(0, str, null);
            return true;
        }
    }

    public class b extends RxBaseErrorHandleTaskListener<m2s.a> {
        public /* synthetic */ b(d9s d9sVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(m2s.a aVar) {
            String str = aVar.f25693a;
            if (TextUtils.isEmpty(str)) {
                d9s.this.getCallback().onFailed(0, "process is is null", null);
            } else {
                d9s.this.getCallback().onSuccess(str);
            }
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            d9s.this.getCallback().onFailed(i, str, th);
        }

        public b(Context context) {
            super(context);
        }
    }

    public d9s(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<String> iResultCallback) {
        super.request(bundle, iResultCallback);
        b bVar = new b(this, getContext(), null);
        bVar.getDispatcher().register(new a(getContext()));
        n4h.a(new m2s(getContext(), getSession(), bundle.getString(CommonConstants.KEY_PARTNER_USER_ID), bundle.getString("accountType"), bundle.getLong("marketType"))).c(bVar);
    }
}
