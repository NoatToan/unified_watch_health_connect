package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class zis extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mibi.sdk.deduct.o.b f41326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f41327b;

    public class b extends RxBaseErrorHandleTaskListener<com.mibi.sdk.deduct.o.b.a> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.deduct.o.b.a aVar) {
            zis.this.f41327b.a(aVar);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            zis.this.f41327b.b(i, str, th);
        }

        public b(Context context) {
            super(context);
        }
    }

    public interface c {
        void a(com.mibi.sdk.deduct.o.b.a aVar);

        void b(int i, String str, Throwable th);
    }

    public zis(Session session) {
        super(session);
        if (this.f41326a == null) {
            this.f41326a = new com.mibi.sdk.deduct.o.b(getContext(), getSession());
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
            throw new IllegalArgumentException("CheckDeductOrderModel  onCheckSignDeductOrderListener can't be null");
        }
        this.f41327b = cVar;
        b bVar = new b(getContext());
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add("deductSignAndPayOrder", str2);
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, str);
        this.f41326a.setParams(sortedParameter);
        n4h.a(this.f41326a).c(bVar);
    }
}
