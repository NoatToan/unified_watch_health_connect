package a.a.a.a.e;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.recharge.EntryData;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePartnerTask;
import com.mibi.sdk.task.RxBaseQueryTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends RxBasePartnerTask<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f452b;
    public boolean c;

    public static class a extends RxBaseQueryTask.Result implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bundle f454b;
        public long c;
        public String d;
        public EntryData e;
        public boolean f;
    }

    public b(Context context, Session session, String str, boolean z) {
        super(context, session, a.class);
        this.f451a = str;
        this.c = z;
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

    public final void b(JSONObject jSONObject, a aVar) throws PaymentException {
        try {
            int i = jSONObject.getInt(Constants.KEY_PAY_STATUS);
            aVar.f453a = i;
            if (i != 200) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                long jOptLong = jSONObject.optLong("payFee", -1L);
                if (jSONObjectOptJSONObject != null) {
                    aVar.f454b = a(jSONObjectOptJSONObject);
                }
                if (jOptLong >= 0) {
                    aVar.c = jOptLong;
                    return;
                }
                return;
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                long j = jSONObject.getLong("payFee");
                Bundle bundleA = a(jSONObject2);
                aVar.f454b = bundleA;
                aVar.c = j;
                if (TextUtils.isEmpty(bundleA.getString(Constants.KEY_PAY_RESULT_RET))) {
                    throw new ResultException("result has error");
                }
                if (aVar.c < 0) {
                    throw new ResultException("result has error");
                }
                aVar.d = jSONObject.optString(Constants.KEY_BANNER_PIC_URL);
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("entry");
                if (jSONObjectOptJSONObject2 != null) {
                    EntryData entryData = new EntryData();
                    entryData.parseEntryData(jSONObjectOptJSONObject2);
                    aVar.e = entryData;
                }
            } catch (JSONException e) {
                throw new ResultException(e);
            }
        } catch (JSONException e2) {
            throw new ResultException(e2);
        }
    }

    public final void c(JSONObject jSONObject, a aVar) throws PaymentException {
        try {
            aVar.mChargeStatus = jSONObject.getString(Constants.KEY_CHARGE_STATUS);
            aVar.mRechargeFee = jSONObject.getLong(Constants.KEY_CHARGE_FEE);
            aVar.mHint = jSONObject.optString(Constants.KEY_RESULT_ACTIVITY);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("entry");
            if (jSONObjectOptJSONObject != null) {
                EntryData entryData = new EntryData();
                aVar.mHintEntryData = entryData;
                entryData.parseEntryData(jSONObjectOptJSONObject);
            }
            if (!TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.TRADE_SUCCESS) && !TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.WAIT_BUYER_PAY) && !TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.TRADE_CLOSED) && !TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.TRADE_FAIL)) {
                throw new ResultException("result has error");
            }
            if (TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.TRADE_SUCCESS)) {
                if (aVar.mRechargeFee <= 0) {
                    throw new ResultException("result has error");
                }
                aVar.mRechargeSuccess = true;
            } else if (aVar.mRechargeFee <= 0) {
                aVar.mRechargeFee = this.f452b;
            }
        } catch (JSONException e) {
            throw new ResultException(e);
        }
    }

    public final void d(JSONObject jSONObject, a aVar) throws PaymentException {
        aVar.d = jSONObject.optString(Constants.KEY_BANNER_PIC_URL);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("entry");
        if (jSONObjectOptJSONObject != null) {
            EntryData entryData = new EntryData();
            aVar.e = entryData;
            entryData.parseEntryData(jSONObjectOptJSONObject);
        }
        if (!Utils.checkStrings(aVar.d) || aVar.e == null) {
            aVar.f = false;
        } else {
            aVar.f = true;
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseResultInCommon(JSONObject jSONObject, a aVar) {
        aVar.mErrorDesc = jSONObject.optString("errDesc");
        aVar.mBalance = jSONObject.optLong("balance", -1L);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        c(jSONObject, aVar);
        if (aVar.mRechargeSuccess) {
            if (this.c) {
                b(jSONObject, aVar);
            } else {
                d(jSONObject, aVar);
            }
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreatePartnerConnection = ConnectionFactory.createPartnerConnection(getSession(), getPartnerUserId(this.f451a), CommonConstants.getUrl("p/partner/recharge/result"));
        connectionCreatePartnerConnection.getParameter().addAll(sortedParameter);
        addPartnerParams(connectionCreatePartnerConnection, this.f451a);
        return connectionCreatePartnerConnection;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public void setParams(SortedParameter sortedParameter) {
        super.setParams(sortedParameter);
        this.f452b = sortedParameter.getLong(Constants.KEY_RECHARGE_MIBI);
    }
}
