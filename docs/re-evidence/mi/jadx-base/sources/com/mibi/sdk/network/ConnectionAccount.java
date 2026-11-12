package com.mibi.sdk.network;

import android.text.TextUtils;
import com.mibi.sdk.common.Coder;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.utils.MibiLog;
import com.miui.tsmclient.common.net.NetConstants;
import defpackage.gv5;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectionAccount extends ConnectionDefault {
    private static final String TAG = "ConnectionAccount";
    private String mSecurity;
    private String mServiceToken;
    private String mUserId;

    public class EncryptParameter extends ConnectionDefault.Parameter {
        public EncryptParameter(ConnectionDefault.Parameter parameter, String str) {
            super();
            if (parameter.isEmpty()) {
                return;
            }
            TreeMap<String, Object> params = parameter.getParams();
            for (String str2 : params.keySet()) {
                String string = params.get(str2).toString();
                if (!TextUtils.isEmpty(string)) {
                    String strEncodeAES = Coder.encodeAES(string, str);
                    if (!TextUtils.isEmpty(strEncodeAES)) {
                        add(str2, strEncodeAES);
                    }
                }
            }
        }
    }

    public ConnectionAccount(String str, String str2, String str3, String str4) {
        super(str);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            throw new IllegalArgumentException("account detail is empty");
        }
        this.mUserId = str2;
        this.mSecurity = str3;
        this.mServiceToken = str4;
    }

    private String genSHASignature(String str) {
        byte[] bArrEncodeSHABytes = Coder.encodeSHABytes(str);
        if (bArrEncodeSHABytes == null) {
            return null;
        }
        return Coder.encodeBase64(bArrEncodeSHABytes);
    }

    private String genSignature(String str, String str2, TreeMap<String, Object> treeMap, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str.toUpperCase(Locale.getDefault()));
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        if (treeMap != null && !treeMap.isEmpty()) {
            for (String str4 : treeMap.keySet()) {
                String string = treeMap.get(str4).toString();
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(String.format("%s=%s", str4, string));
                }
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        return genSHASignature(TextUtils.join(gv5.CONNECT_STR, arrayList));
    }

    @Override // com.mibi.sdk.network.ConnectionDefault
    public boolean checkURL(URL url) {
        if (TextUtils.isEmpty(url.getQuery())) {
            return super.checkURL(url);
        }
        return false;
    }

    @Override // com.mibi.sdk.network.ConnectionDefault
    public HttpURLConnection onConnectionCreated(HttpURLConnection httpURLConnection) {
        StringBuilder sb = new StringBuilder();
        sb.append("userId=" + this.mUserId);
        sb.append("; ");
        sb.append("serviceToken=" + this.mServiceToken);
        httpURLConnection.setRequestProperty(NetConstants.COOKIE, sb.toString());
        return httpURLConnection;
    }

    @Override // com.mibi.sdk.network.ConnectionDefault
    public ConnectionDefault.Parameter onQueryCreated(ConnectionDefault.Parameter parameter) {
        return new EncryptParameter(parameter, this.mSecurity);
    }

    @Override // com.mibi.sdk.network.ConnectionDefault
    public URL onURLCreated(URL url, ConnectionDefault.Parameter parameter) {
        String strEncode;
        String str;
        String path = url.getPath();
        String query = url.getQuery();
        String string = url.toString();
        try {
            strEncode = URLEncoder.encode(genSignature(this.mUseGet ? "GET" : "POST", path, parameter.getParams(), this.mSecurity), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            MibiLog.e(TAG, "generate signature error :" + e);
            strEncode = "";
        }
        if (TextUtils.isEmpty(query)) {
            str = string + "?signature=" + strEncode;
        } else {
            str = string + "&signature=" + strEncode;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // com.mibi.sdk.network.ConnectionDefault, com.mibi.sdk.network.Connection
    public String requestString() throws Throwable {
        super.requestString();
        String strDecodeAES = Coder.decodeAES(this.mString, this.mSecurity);
        this.mString = strDecodeAES;
        if (strDecodeAES != null) {
            return strDecodeAES;
        }
        throw new ResultException("requestString error, decode failed");
    }
}
