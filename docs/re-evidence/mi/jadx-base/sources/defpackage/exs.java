package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.deduct.o.d;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class exs extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f17175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f17176b;

    public class b extends RxBaseErrorHandleTaskListener<d.a> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(d.a aVar) {
            exs.this.f17176b.a(aVar);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            exs.this.f17176b.b(i, str, th);
        }

        public b(Context context) {
            super(context);
        }
    }

    public interface c {
        void a(d.a aVar);

        void b(int i, String str, Throwable th);
    }

    public exs(Session session) {
        super(session);
        if (this.f17175a == null) {
            this.f17175a = new d(getContext(), getSession());
        }
    }

    public void b(String str, String str2, c cVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("RequestDeductTypeListModel  processId can't be null");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("RequestDeductTypeListModel  channels can't be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("RequestDeductTypeListModel  onRequestDeductTypeListListener can't be null");
        }
        this.f17176b = cVar;
        b bVar = new b(getContext());
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, str);
        sortedParameter.add(Constants.KEY_RECHARGE_CHANNELS, str2);
        this.f17175a.setParams(sortedParameter);
        n4h.a(this.f17175a).c(bVar);
    }
}
