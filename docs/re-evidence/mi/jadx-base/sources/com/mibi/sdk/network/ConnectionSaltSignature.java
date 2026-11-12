package com.mibi.sdk.network;

import android.text.TextUtils;
import com.mibi.sdk.common.Coder;
import com.mibi.sdk.common.utils.MibiLog;
import defpackage.gv5;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectionSaltSignature extends ConnectionDefault {
    private static final String SALT = "8007236f-a2d6-4847-ac83-c49395ad6d65";
    private static final String TAG = "ConnectionSaltSignature";

    public class NonEmptyParameter extends ConnectionDefault.Parameter {
        public NonEmptyParameter(ConnectionDefault.Parameter parameter) {
            super();
            if (parameter.isEmpty()) {
                return;
            }
            TreeMap<String, Object> params = parameter.getParams();
            for (String str : params.keySet()) {
                String string = params.get(str).toString();
                if (!TextUtils.isEmpty(string)) {
                    add(str, string);
                }
            }
        }
    }

    public ConnectionSaltSignature(String str) {
        super(str);
    }

    private String genSignature(TreeMap<String, Object> treeMap, String str) {
        ArrayList arrayList = new ArrayList();
        if (treeMap != null && !treeMap.isEmpty()) {
            for (String str2 : treeMap.keySet()) {
                String string = treeMap.get(str2).toString();
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(String.format("%s=%s", str2, string));
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        return Coder.encodeMD5(Coder.encodeBase64(TextUtils.join(gv5.CONNECT_STR, arrayList))).toUpperCase(Locale.getDefault());
    }

    @Override // com.mibi.sdk.network.ConnectionDefault
    public ConnectionDefault.Parameter onQueryCreated(ConnectionDefault.Parameter parameter) {
        return new NonEmptyParameter(parameter);
    }

    @Override // com.mibi.sdk.network.ConnectionDefault
    public URL onURLCreated(URL url, ConnectionDefault.Parameter parameter) {
        String strEncode;
        String str;
        String query = url.getQuery();
        String string = url.toString();
        try {
            strEncode = URLEncoder.encode(genSignature(parameter.getParams(), SALT), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            MibiLog.e(TAG, "generate signature error :" + e);
            strEncode = "";
        }
        if (TextUtils.isEmpty(query)) {
            str = string + "?s=" + strEncode;
        } else {
            str = string + "&s=" + strEncode;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
