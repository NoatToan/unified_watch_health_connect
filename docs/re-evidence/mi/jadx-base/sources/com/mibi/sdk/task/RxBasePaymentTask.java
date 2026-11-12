package com.mibi.sdk.task;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.exception.ServerErrorCodeException;
import com.mibi.sdk.common.exception.ServiceTokenExpiredException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.privacy.PrivacyManager;
import com.mibi.sdk.network.ConnEncryptManager;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.network.DeviceManager;
import com.mibi.sdk.network.DomainManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RxBasePaymentTask<R> extends RxTask<R> {
    private static final String TAG = "BasePaymentTask";
    private boolean mCacheReadEnabled;
    private boolean mCacheWriteEnabled;
    protected Context mContext;
    private SortedParameter mParams;
    protected Session mSession;

    public RxBasePaymentTask(Context context, Session session, Class<R> cls) {
        super(cls);
        this.mContext = context;
        this.mSession = session;
    }

    public void connect(SortedParameter sortedParameter, R r2) throws PaymentException {
        Connection connection;
        if (this.mCacheReadEnabled) {
            connection = ConnectionFactory.createCacheReaderConnection(getConnection(sortedParameter), this.mSession);
        } else {
            DomainManager.updateDomainByAccount(this.mSession);
            ConnEncryptManager.fetchPubKey(this.mSession);
            DeviceManager.uploadDevice(this.mSession);
            PrivacyManager.uploadPrivacy(this.mSession);
            connection = getConnection(sortedParameter);
            if (this.mCacheWriteEnabled) {
                connection = ConnectionFactory.createCacheWriterConnection(connection, this.mSession);
            }
        }
        JSONObject jSONObjectRequestJSON = connection.requestJSON();
        parseResultInCommon(jSONObjectRequestJSON, r2);
        try {
            int i = jSONObjectRequestJSON.getInt(CommonConstants.KEY_ERR_CODE);
            String strOptString = jSONObjectRequestJSON.optString("errDesc");
            if (i == 1984) {
                throw new ServiceTokenExpiredException();
            }
            if (i == 200) {
                parseResultInSuccess(jSONObjectRequestJSON, r2);
                return;
            }
            if (CommonConstants.DEBUG) {
                MibiLog.w(TAG, "result error : error code " + i);
                MibiLog.w(TAG, "result error : error desc " + strOptString);
            }
            if (!parseResultInError(jSONObjectRequestJSON, r2)) {
                throw new ServerErrorCodeException(i, strOptString, r2);
            }
        } catch (JSONException e) {
            throw new ResultException("error code not exists", e);
        }
    }

    @Override // com.mibi.sdk.task.RxTask
    public void doLoad(R r2) throws PaymentException {
        this.mSession.load(this.mContext);
        try {
            connect(this.mParams, r2);
        } catch (ServiceTokenExpiredException e) {
            MibiLog.e(TAG, "service token expired, re-login exception ", e);
            this.mSession.reload(this.mContext);
            connect(this.mParams, r2);
        }
    }

    public abstract Connection getConnection(SortedParameter sortedParameter);

    public Context getContext() {
        return this.mContext;
    }

    public Session getSession() {
        return this.mSession;
    }

    public boolean isReadingFromCache() {
        return this.mCacheReadEnabled;
    }

    public void parseResultInCommon(JSONObject jSONObject, R r2) throws PaymentException {
    }

    public boolean parseResultInError(JSONObject jSONObject, R r2) throws PaymentException {
        return false;
    }

    public void parseResultInSuccess(JSONObject jSONObject, R r2) throws PaymentException {
    }

    public void setCacheReadEnabled(boolean z) {
        this.mCacheReadEnabled = z;
    }

    public void setCacheWriteEnabled(boolean z) {
        this.mCacheWriteEnabled = z;
    }

    public void setParams(SortedParameter sortedParameter) {
        if (sortedParameter == null) {
            sortedParameter = new SortedParameter();
        }
        this.mParams = sortedParameter;
    }
}
