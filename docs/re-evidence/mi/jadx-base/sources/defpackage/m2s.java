package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.NoPrivacyRightException;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.model.R;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m2s extends RxBasePaymentTask<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25692b;
    public long c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25693a;
    }

    public m2s(Context context, Session session, String str, String str2, long j) {
        super(context, session, a.class);
        this.f25691a = str;
        this.f25692b = str2;
        this.c = j;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        boolean zOptBoolean = jSONObject.optBoolean(CommonConstants.KEY_USER_REVOKE, false);
        boolean zOptBoolean2 = jSONObject.optBoolean(CommonConstants.KEY_NEED_PRIVACY_AUTHORIZE, false);
        if (zOptBoolean || zOptBoolean2) {
            throw new NoPrivacyRightException(this.mContext.getResources().getString(R.string.mibi_error_privacy_summary));
        }
        try {
            String string = jSONObject.getString(CommonConstants.KEY_PROCESS_ID);
            if (TextUtils.isEmpty(string)) {
                throw new ResultException("processId is empty!");
            }
            aVar.f25693a = string;
        } catch (JSONException e) {
            throw new ResultException(e);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreatePartnerConnection = ConnectionFactory.createPartnerConnection(getSession(), this.f25691a, CommonConstants.getUrl("p/partner/getProcessId"));
        SortedParameter parameter = connectionCreatePartnerConnection.getParameter();
        parameter.add("marketType", Long.valueOf(this.c));
        parameter.add(CommonConstants.KEY_PARTNER_USER_ID, this.f25691a);
        parameter.add("accountType", this.f25692b);
        parameter.add(CommonConstants.KEY_SESSION, getSession().getUuid());
        return connectionCreatePartnerConnection;
    }
}
