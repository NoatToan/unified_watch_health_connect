package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class oes extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mibi.sdk.deduct.o.a f29090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f29091b;

    public class b extends RxBaseErrorHandleTaskListener<com.mibi.sdk.deduct.o.a.C0314a> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.deduct.o.a.C0314a c0314a) {
            oes.this.f29091b.a(c0314a);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            oes.this.f29091b.b(i, str, th);
        }

        public b(Context context) {
            super(context);
        }
    }

    public interface c {
        void a(com.mibi.sdk.deduct.o.a.C0314a c0314a);

        void b(int i, String str, Throwable th);
    }

    public oes(Session session) {
        super(session);
        if (this.f29090a == null) {
            this.f29090a = new com.mibi.sdk.deduct.o.a(getContext(), getSession());
        }
    }

    public void b(String str, String str2, c cVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("CheckDeductOrderModel  processId can't be null");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("CheckDeductOrderModel  order can't be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CheckDeductOrderModel  onCheckDeductOrderListener can't be null");
        }
        this.f29091b = cVar;
        b bVar = new b(getContext());
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(Constants.KEY_DEDUCT_ORDER, str2);
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, str);
        this.f29090a.setParams(sortedParameter);
        n4h.a(this.f29090a).c(bVar);
    }
}
