package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import com.alipay.sdk.m.s.a;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class OkHttpRequest {
    private static volatile OkHttpRequest singleton;
    private OkHttpClient mOkHttpClient = new OkHttpClient();

    public interface IDataCallBack {
        void onError(Exception exc, String str);

        void onSuccess(String str, String str2);
    }

    private OkHttpRequest() {
    }

    private String convertMap2HttpParams(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                sb.append((String) entry.getKey());
                sb.append(SearchCriteria.EQ);
                sb.append(str);
                sb.append(a.l);
            } else if (entry.getKey() != null) {
                map.remove(entry.getKey());
            }
        }
        if (!map.isEmpty() && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private Map<String, String> encoderName(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.equals(DTransferConstants.SEARCH_KEY) || key.equals(DTransferConstants.TAG_NAME)) {
                String strEncode = null;
                try {
                    strEncode = URLEncoder.encode(entry.getValue(), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                map.put(key, strEncode);
                break;
            }
        }
        return map;
    }

    public static OkHttpRequest getInstanse() {
        if (singleton == null) {
            synchronized (OkHttpRequest.class) {
                if (singleton == null) {
                    singleton = new OkHttpRequest();
                }
            }
        }
        return singleton;
    }

    private Request.Builder urlGet(String str, Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            str = str + "?" + convertMap2HttpParams(encoderName(map));
        }
        try {
            return new Request.Builder().url(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response getResponse(String str, Map<String, String> map) throws Exception {
        Request.Builder builderUrlGet = urlGet(str, map);
        builderUrlGet.header("User-Agent", CommonRequest.getUserAgent());
        return FirebasePerfOkHttpClient.execute(this.mOkHttpClient.newCall(builderUrlGet.build()));
    }
}
