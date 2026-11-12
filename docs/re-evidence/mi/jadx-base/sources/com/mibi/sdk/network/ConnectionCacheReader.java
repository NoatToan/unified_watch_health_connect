package com.mibi.sdk.network;

import com.mibi.sdk.common.Coder;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.storage.StorageDir;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectionCacheReader implements Connection {
    private Connection mConnection;
    private JSONObject mResponse;
    private int mResponseCode;
    private Session mSession;
    private String mString;
    private URL mUrl;

    public ConnectionCacheReader(Connection connection, Session session) {
        this.mConnection = connection;
        this.mSession = session;
    }

    public static String connect(String str, String str2) {
        return Utils.join(str, str2);
    }

    @Override // com.mibi.sdk.network.Connection
    public SortedParameter getParameter() {
        return this.mConnection.getParameter();
    }

    @Override // com.mibi.sdk.network.Connection
    public JSONObject getResponse() {
        return this.mResponse;
    }

    @Override // com.mibi.sdk.network.Connection
    public int getResponseCode() {
        return this.mResponseCode;
    }

    @Override // com.mibi.sdk.network.Connection
    public String getStringResponse() {
        return this.mString;
    }

    @Override // com.mibi.sdk.network.Connection
    public URL getUrl() {
        return this.mUrl;
    }

    @Override // com.mibi.sdk.network.Connection
    public JSONObject requestJSON() throws PaymentException {
        requestString();
        try {
            JSONObject jSONObject = new JSONObject(this.mString);
            this.mResponse = jSONObject;
            return jSONObject;
        } catch (Exception e) {
            throw new ResultException(e);
        }
    }

    @Override // com.mibi.sdk.network.Connection
    public String requestString() throws PaymentException {
        StorageDir userStorage = this.mSession.getUserStorage();
        String strEncodeMD5 = Coder.encodeMD5(this.mConnection.getUrl().toString());
        if (userStorage.hasFile(strEncodeMD5)) {
            this.mString = userStorage.read(strEncodeMD5);
        } else {
            this.mString = null;
        }
        return this.mString;
    }

    @Override // com.mibi.sdk.network.Connection
    public void setNeedGzipRequest(boolean z) {
    }

    @Override // com.mibi.sdk.network.Connection
    public void setUseGet(boolean z) {
    }
}
