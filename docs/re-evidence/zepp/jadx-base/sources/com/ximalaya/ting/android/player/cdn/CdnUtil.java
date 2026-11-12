package com.ximalaya.ting.android.player.cdn;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.ximalaya.ting.android.opensdk.model.xdcs.CdnConfigModel;
import com.ximalaya.ting.android.player.Logger;
import com.ximalaya.ting.android.player.PlayerUtil;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class CdnUtil {
    private static final String cdnUrl = "http://xdcs-collector.ximalaya.com/api/v1/cdnAndroid";
    private static final String cdnUrlTest = "http://xdcs-collector.test.ximalaya.com/api/v1/cdnAndroid";
    private static InputStream is;
    private static CdnConfigModel mCdnConfigModel;
    private static HttpURLConnection mConn;
    private static OutputStream os;

    private CdnUtil() {
    }

    public static String exception2String(Throwable th) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        if (stackTraceElement == null) {
            return th.getMessage();
        }
        if (!TextUtils.isEmpty(th.getMessage())) {
            return th.getMessage();
        }
        return "null  located at:" + stackTraceElement.toString();
    }

    public static CdnConfigModel getCdnConfigModel() {
        return mCdnConfigModel;
    }

    private static String getHostName(String str) {
        if (str == null || str.trim().equals("")) {
            return "";
        }
        Matcher matcher = Pattern.compile("(?<=//|)((\\w)+\\.)+\\w+").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    public static String getUrlIp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return InetAddress.getByName(getHostName(str)).getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String objectTOJSON(List<CdnEvent> list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (CdnEvent cdnEvent : list) {
            if (cdnEvent != null) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(cdnEvent.getViewId())) {
                    jSONObject2.put("viewId", cdnEvent.getViewId());
                }
                if (!TextUtils.isEmpty(cdnEvent.getParentSpanId())) {
                    jSONObject2.put("parentSpanId", cdnEvent.getParentSpanId());
                }
                if (!TextUtils.isEmpty(cdnEvent.getSpanId())) {
                    jSONObject2.put("viewId", cdnEvent.getSpanId());
                }
                if (!TextUtils.isEmpty(cdnEvent.getTraceId())) {
                    jSONObject2.put("viewId", cdnEvent.getTraceId());
                }
                if (cdnEvent.getTs() >= 0) {
                    jSONObject2.put(AuthHandler.d, cdnEvent.getTs());
                }
                if (cdnEvent.getSeqId() >= 0) {
                    jSONObject2.put("seqId", cdnEvent.getSeqId());
                }
                if (!TextUtils.isEmpty(cdnEvent.getType())) {
                    jSONObject2.put("type", cdnEvent.getType());
                }
                if (cdnEvent.getProps() != null) {
                    CdnCollectDataForPlay props = cdnEvent.getProps();
                    JSONObject jSONObject3 = new JSONObject();
                    if (!TextUtils.isEmpty(props.getAudioUrl())) {
                        jSONObject3.put("audioUrl", props.getAudioUrl());
                    }
                    if (!TextUtils.isEmpty(props.getCdnIP())) {
                        jSONObject3.put("cdnIP", props.getCdnIP());
                    }
                    if (TextUtils.isEmpty(props.getDownloadSpeed())) {
                        jSONObject3.put("downloadSpeed", IdManager.DEFAULT_VERSION_NAME);
                    } else {
                        jSONObject3.put("downloadSpeed", props.getDownloadSpeed() + "");
                    }
                    if (!TextUtils.isEmpty(props.getErrorType())) {
                        jSONObject3.put("errorType", props.getErrorType());
                    }
                    if (!TextUtils.isEmpty(props.getExceptionReason())) {
                        jSONObject3.put("exceptionReason", props.getExceptionReason());
                    }
                    if (!TextUtils.isEmpty(props.getStatusCode())) {
                        jSONObject3.put("statusCode", props.getStatusCode());
                    }
                    if (!TextUtils.isEmpty(props.getType())) {
                        jSONObject3.put("type", props.getType());
                    }
                    if (!TextUtils.isEmpty(props.getViaInfo())) {
                        jSONObject3.put("viaInfo", props.getViaInfo());
                    }
                    if (props.getAudioBytes() > 0) {
                        jSONObject3.put("audioBytes", props.getAudioBytes() + "");
                    } else {
                        jSONObject3.put("audioBytes", 0);
                    }
                    if (props.getConnectedTime() >= 0.0f) {
                        jSONObject3.put("connectedTime", props.getConnectedTime() + "");
                    }
                    if (props.getTimestamp() >= 0) {
                        jSONObject3.put("timestamp", props.getTimestamp());
                    }
                    if (props.getRange() != null) {
                        jSONObject3.put("range", props.getRange());
                    }
                    if (props.getFileSize() != null) {
                        jSONObject3.put("fileSize", props.getFileSize());
                    }
                    if (TextUtils.isEmpty(props.getDownloaded())) {
                        jSONObject3.put("downloaded", "");
                    } else {
                        jSONObject3.put("downloaded", props.getDownloaded());
                    }
                    if (TextUtils.isEmpty(props.getDownloadTime())) {
                        jSONObject3.put("downloadTime", "");
                    } else {
                        jSONObject3.put("downloadTime", props.getDownloadTime());
                    }
                    if (TextUtils.isEmpty(props.getDownloadResult())) {
                        jSONObject3.put("downloadResult", "failed");
                    } else {
                        jSONObject3.put("downloadResult", props.getDownloadResult());
                    }
                    if (!TextUtils.isEmpty(props.getCdnDomain())) {
                        jSONObject3.put("cdnDomain", props.getCdnDomain());
                    }
                    jSONObject3.put("timeout", props.isTimeout());
                    jSONObject2.put("props", jSONObject3);
                }
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("events", jSONArray);
        return jSONObject.toString();
    }

    public static float oneDecimal(float f, boolean z) {
        String str;
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (z) {
            str = new DecimalFormat(".0").format(f);
        } else {
            if (f < 0.1d) {
                return 0.001f;
            }
            str = new DecimalFormat(".000").format(f / 1000.0f);
        }
        try {
            return Float.valueOf(str).floatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    public static void setCdnConfigModel(CdnConfigModel cdnConfigModel) {
        mCdnConfigModel = cdnConfigModel;
    }

    public static void statDownLoadCDN(CdnCollectDataForPlay cdnCollectDataForPlay, CdnConfigModel cdnConfigModel) {
        HttpURLConnection httpURLConnection;
        if (cdnCollectDataForPlay == null || cdnConfigModel == null) {
            return;
        }
        try {
            CdnEvent cdnEvent = new CdnEvent();
            cdnEvent.setType("CDN");
            cdnEvent.setProps(cdnCollectDataForPlay);
            cdnEvent.setTs(System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            arrayList.add(cdnEvent);
            String strObjectTOJSON = objectTOJSON(arrayList);
            String doMain = cdnConfigModel.getDoMain();
            String path = cdnConfigModel.getPath();
            StringBuffer stringBuffer = new StringBuffer();
            HashMap<String, String> map = cdnConfigModel.getMap();
            if (map != null) {
                for (String str : map.keySet()) {
                    stringBuffer.append(str);
                    stringBuffer.append(SearchCriteria.EQ);
                    stringBuffer.append(map.get(str));
                    stringBuffer.append(";");
                }
            }
            HashMap map2 = new HashMap();
            map2.put(HttpHeaders.COOKIE, stringBuffer.toString() + "domain=" + doMain + ";path=" + path);
            map2.put("User-Agent", cdnConfigModel.getUserAgent());
            map2.put("Content-Length", String.valueOf(strObjectTOJSON.length()));
            map2.put("Content-Type", "application/json");
            HttpURLConnection httpURLConnection2 = PlayerUtil.getHttpURLConnection(TextUtils.isEmpty(cdnConfigModel.getCdnUrl()) ? cdnUrl : cdnConfigModel.getCdnUrl(), "POST", map2);
            mConn = httpURLConnection2;
            httpURLConnection2.connect();
            OutputStream outputStream = mConn.getOutputStream();
            os = outputStream;
            outputStream.write(strObjectTOJSON.getBytes("utf-8"));
            os.flush();
            os.close();
            int responseCode = mConn.getResponseCode();
            Logger.log("post to xdcs url: " + mConn.getURL());
            Logger.log("post to xdcs Response Code : " + responseCode);
            InputStream inputStream = mConn.getInputStream();
            is = inputStream;
            if (inputStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
                StringBuffer stringBuffer2 = new StringBuffer();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        stringBuffer2.append(line);
                    }
                }
                Logger.log(stringBuffer2.toString());
            }
            OutputStream outputStream2 = os;
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            InputStream inputStream2 = is;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            httpURLConnection = mConn;
            if (httpURLConnection == null) {
                return;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            OutputStream outputStream3 = os;
            if (outputStream3 != null) {
                try {
                    outputStream3.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            InputStream inputStream3 = is;
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            httpURLConnection = mConn;
            if (httpURLConnection == null) {
                return;
            }
        } finally {
            OutputStream outputStream4 = os;
            if (outputStream4 != null) {
                try {
                    outputStream4.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            InputStream inputStream4 = is;
            if (inputStream4 != null) {
                try {
                    inputStream4.close();
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
            HttpURLConnection httpURLConnection3 = mConn;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
                mConn = null;
            }
        }
        httpURLConnection.disconnect();
    }

    public static void statToXDCSError(String str, String str2) {
    }
}
