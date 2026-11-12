package com.ximalaya.ting.android.opensdk.httputil.logging;

import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.util.List;
import okhttp3.FormBody;
import okhttp3.Request;
import okio.Buffer;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
class Printer {
    private static final String BODY_TAG = "Body:";
    private static final String CENTER_LINE = "├ ";
    private static final String CORNER_BOTTOM = "└ ";
    private static final String CORNER_UP = "┌ ";
    private static final String DEFAULT_LINE = "│ ";
    private static final String DOUBLE_SEPARATOR;
    private static final String END_LINE = "└───────────────────────────────────────────────────────────────────────────────────────";
    private static final String HEADERS_TAG = "Headers:";
    private static final int JSON_INDENT = 3;
    private static final String LINE_SEPARATOR;
    private static final String METHOD_TAG = "Method: @";
    private static final String N = "\n";
    private static final String[] OMITTED_REQUEST;
    private static final String[] OMITTED_RESPONSE;
    private static final String RECEIVED_TAG = "Received in: ";
    private static final String REQUEST_UP_LINE = "┌────── Request ────────────────────────────────────────────────────────────────────────";
    private static final String RESPONSE_UP_LINE = "┌────── Response ───────────────────────────────────────────────────────────────────────";
    private static final String STATUS_CODE_TAG = "Status Code: ";
    private static final String T = "\t";
    private static final String URL_TAG = "URL: ";

    static {
        String property = System.getProperty("line.separator");
        LINE_SEPARATOR = property;
        DOUBLE_SEPARATOR = property + property;
        OMITTED_RESPONSE = new String[]{property, "Omitted response body"};
        OMITTED_REQUEST = new String[]{property, "Omitted request body"};
    }

    public Printer() {
        throw new UnsupportedOperationException();
    }

    private static String bodyToString(Request request) {
        try {
            Request requestBuild = request.newBuilder().build();
            Buffer buffer = new Buffer();
            if (requestBuild.body() == null) {
                return "";
            }
            requestBuild.body().writeTo(buffer);
            return getJsonString(buffer.readUtf8());
        } catch (IOException e) {
            return "{\"err\": \"" + e.getMessage() + "\"}";
        }
    }

    private static String dotHeaders(String str) {
        String str2;
        String[] strArrSplit = str.split(LINE_SEPARATOR);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (strArrSplit.length > 1) {
            while (i < strArrSplit.length) {
                if (i == 0) {
                    str2 = CORNER_UP;
                } else {
                    str2 = i == strArrSplit.length - 1 ? CORNER_BOTTOM : CENTER_LINE;
                }
                sb.append(str2);
                sb.append(strArrSplit[i]);
                sb.append("\n");
                i++;
            }
        } else {
            int length = strArrSplit.length;
            while (i < length) {
                String str3 = strArrSplit[i];
                sb.append("─ ");
                sb.append(str3);
                sb.append("\n");
                i++;
            }
        }
        return sb.toString();
    }

    public static String getJsonString(String str) {
        try {
            if (str.startsWith("{")) {
                str = new JSONObject(str).toString(3);
            } else if (str.startsWith("[")) {
                str = new JSONArray(str).toString(3);
            }
        } catch (JSONException unused) {
        }
        return str;
    }

    private static String[] getRequest(Request request, Level level) {
        String string = request.headers().toString();
        boolean z = level == Level.HEADERS || level == Level.BASIC;
        StringBuilder sb = new StringBuilder();
        sb.append(METHOD_TAG);
        sb.append(request.method());
        sb.append(DOUBLE_SEPARATOR);
        String str = "";
        if (!isEmpty(string) && z) {
            str = HEADERS_TAG + LINE_SEPARATOR + dotHeaders(string);
        }
        sb.append(str);
        return sb.toString().split(LINE_SEPARATOR);
    }

    private static String[] getResponse(String str, long j, int i, boolean z, Level level, List<String> list) {
        String str2;
        boolean z2 = level == Level.HEADERS || level == Level.BASIC;
        String strSlashSegments = slashSegments(list);
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (TextUtils.isEmpty(strSlashSegments)) {
            str2 = "";
        } else {
            str2 = strSlashSegments + " - ";
        }
        sb.append(str2);
        sb.append("is success : ");
        sb.append(z);
        sb.append(" - ");
        sb.append(RECEIVED_TAG);
        sb.append(j);
        sb.append("ms");
        String str4 = DOUBLE_SEPARATOR;
        sb.append(str4);
        sb.append(STATUS_CODE_TAG);
        sb.append(i);
        sb.append(str4);
        if (!isEmpty(str) && z2) {
            str3 = HEADERS_TAG + LINE_SEPARATOR + dotHeaders(str);
        }
        sb.append(str3);
        return sb.toString().split(LINE_SEPARATOR);
    }

    private static boolean isEmpty(String str) {
        return TextUtils.isEmpty(str) || "\n".equals(str) || "\t".equals(str) || TextUtils.isEmpty(str.trim());
    }

    private static void logLines(int i, String str, String[] strArr, Logger logger, boolean z) {
        for (String str2 : strArr) {
            int length = str2.length();
            int i2 = z ? 110 : length;
            int i3 = 0;
            while (i3 <= length / i2) {
                int i4 = i3 * i2;
                i3++;
                int length2 = i3 * i2;
                if (length2 > str2.length()) {
                    length2 = str2.length();
                }
                if (logger == null) {
                    I.log(i, str, DEFAULT_LINE + str2.substring(i4, length2));
                } else {
                    logger.log(i, str, str2.substring(i4, length2));
                }
            }
        }
    }

    public static void printFileRequest(LoggingInterceptor.Builder builder, Request request) {
        String tag = builder.getTag(true);
        if (builder.getLogger() == null) {
            I.log(builder.getType(), tag, REQUEST_UP_LINE);
        }
        logLines(builder.getType(), tag, new String[]{URL_TAG + request.url()}, builder.getLogger(), false);
        logLines(builder.getType(), tag, getRequest(request, builder.getLevel()), builder.getLogger(), true);
        if (request.body() instanceof FormBody) {
            StringBuilder sb = new StringBuilder();
            FormBody formBody = (FormBody) request.body();
            if (formBody != null && formBody.size() != 0) {
                for (int i = 0; i < formBody.size(); i++) {
                    sb.append(formBody.encodedName(i) + SearchCriteria.EQ + formBody.encodedValue(i) + a.l);
                }
                sb.delete(sb.length() - 1, sb.length());
                logLines(builder.getType(), tag, new String[]{sb.toString()}, builder.getLogger(), true);
            }
        }
        if (builder.getLevel() == Level.BASIC || builder.getLevel() == Level.BODY) {
            logLines(builder.getType(), tag, OMITTED_REQUEST, builder.getLogger(), true);
        }
        if (builder.getLogger() == null) {
            I.log(builder.getType(), tag, END_LINE);
        }
    }

    public static void printFileResponse(LoggingInterceptor.Builder builder, long j, boolean z, int i, String str, List<String> list) {
        String tag = builder.getTag(false);
        if (builder.getLogger() == null) {
            I.log(builder.getType(), tag, RESPONSE_UP_LINE);
        }
        logLines(builder.getType(), tag, getResponse(str, j, i, z, builder.getLevel(), list), builder.getLogger(), true);
        logLines(builder.getType(), tag, OMITTED_RESPONSE, builder.getLogger(), true);
        if (builder.getLogger() == null) {
            I.log(builder.getType(), tag, END_LINE);
        }
    }

    public static void printJsonRequest(LoggingInterceptor.Builder builder, Request request) {
        StringBuilder sb = new StringBuilder();
        String str = LINE_SEPARATOR;
        sb.append(str);
        sb.append(BODY_TAG);
        sb.append(str);
        sb.append(bodyToString(request));
        String string = sb.toString();
        String tag = builder.getTag(true);
        if (builder.getLogger() == null) {
            I.log(builder.getType(), tag, REQUEST_UP_LINE);
        }
        logLines(builder.getType(), tag, new String[]{URL_TAG + request.url()}, builder.getLogger(), false);
        logLines(builder.getType(), tag, getRequest(request, builder.getLevel()), builder.getLogger(), true);
        if (request.body() instanceof FormBody) {
            StringBuilder sb2 = new StringBuilder();
            FormBody formBody = (FormBody) request.body();
            if (formBody != null && formBody.size() != 0) {
                for (int i = 0; i < formBody.size(); i++) {
                    sb2.append(formBody.encodedName(i) + SearchCriteria.EQ + formBody.encodedValue(i) + a.l);
                }
                sb2.delete(sb2.length() - 1, sb2.length());
                logLines(builder.getType(), tag, new String[]{sb2.toString()}, builder.getLogger(), true);
            }
        }
        if (builder.getLevel() == Level.BASIC || builder.getLevel() == Level.BODY) {
            logLines(builder.getType(), tag, string.split(LINE_SEPARATOR), builder.getLogger(), true);
        }
        if (builder.getLogger() == null) {
            I.log(builder.getType(), tag, END_LINE);
        }
    }

    public static void printJsonResponse(LoggingInterceptor.Builder builder, long j, boolean z, int i, String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder();
        String str3 = LINE_SEPARATOR;
        sb.append(str3);
        sb.append(BODY_TAG);
        sb.append(str3);
        sb.append(getJsonString(str2));
        String string = sb.toString();
        String tag = builder.getTag(false);
        if (builder.getLogger() == null) {
            I.log(builder.getType(), tag, RESPONSE_UP_LINE);
        }
        logLines(builder.getType(), tag, getResponse(str, j, i, z, builder.getLevel(), list), builder.getLogger(), true);
        if (builder.getLevel() == Level.BASIC || builder.getLevel() == Level.BODY) {
            logLines(builder.getType(), tag, string.split(str3), builder.getLogger(), true);
        }
        if (builder.getLogger() == null) {
            I.log(builder.getType(), tag, END_LINE);
        }
    }

    private static String slashSegments(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            sb.append(str);
        }
        return sb.toString();
    }
}
