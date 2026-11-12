package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePartnerTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n2s extends RxBasePartnerTask<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27493a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f27494a;
    }

    public n2s(Context context, Session session, String str) {
        super(context, session, a.class);
        this.f27493a = str;
    }

    public final Bundle a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            if (jSONObject.has(Constants.KEY_PAY_RESULT_RET)) {
                bundle.putString(Constants.KEY_PAY_RESULT_RET, jSONObject.optString(Constants.KEY_PAY_RESULT_RET));
            }
            if (jSONObject.has(Constants.KEY_PAY_RESULT_SENDERSIGN)) {
                bundle.putString(Constants.KEY_PAY_RESULT_SENDERSIGN, jSONObject.optString(Constants.KEY_PAY_RESULT_SENDERSIGN));
            }
        }
        return bundle;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseResultInCommon(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInCommon(jSONObject, aVar);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        if (jSONObjectOptJSONObject != null) {
            aVar.f27494a = a(jSONObjectOptJSONObject);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean parseResultInError(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInError(jSONObject, aVar);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        if (jSONObjectOptJSONObject == null) {
            return false;
        }
        aVar.f27494a = a(jSONObjectOptJSONObject);
        return false;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreatePartnerConnection = ConnectionFactory.createPartnerConnection(getSession(), getPartnerUserId(this.f27493a), CommonConstants.getUrl("p/partner/doPay"));
        connectionCreatePartnerConnection.getParameter().addAll(sortedParameter);
        addPartnerParams(connectionCreatePartnerConnection, this.f27493a);
        return connectionCreatePartnerConnection;
    }
}
