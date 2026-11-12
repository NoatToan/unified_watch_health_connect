package org.cybergarage.http;

import com.huami.moving.ui.utils.SportAnalytics;
import java.util.StringTokenizer;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class HTTPStatus {
    public static final int BAD_REQUEST = 400;
    public static final int CONTINUE = 100;
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int INVALID_RANGE = 416;
    public static final int NOT_FOUND = 404;
    public static final int OK = 200;
    public static final int PARTIAL_CONTENT = 206;
    public static final int PRECONDITION_FAILED = 412;
    private String version = "";
    private int statusCode = 0;
    private String reasonPhrase = "";

    public HTTPStatus() {
        setVersion("");
        setStatusCode(0);
        setReasonPhrase("");
    }

    public static final String code2String(int i) {
        if (i == 100) {
            return SportAnalytics.Params.VALUE_CONTINUE;
        }
        if (i == 200) {
            return "OK";
        }
        if (i == 206) {
            return "Partial Content";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 404) {
            return "Not Found";
        }
        if (i == 412) {
            return "Precondition Failed";
        }
        if (i != 416) {
            return i != 500 ? "" : "Internal Server Error";
        }
        return "Invalid Range";
    }

    public static final boolean isSuccessful(int i) {
        return 200 <= i && i < 300;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isSuccessful() {
        return isSuccessful(getStatusCode());
    }

    public void set(String str) {
        if (str == null) {
            setVersion("1.1");
            setStatusCode(500);
            setReasonPhrase(code2String(500));
            return;
        }
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
            if (stringTokenizer.hasMoreTokens()) {
                setVersion(stringTokenizer.nextToken().trim());
                if (stringTokenizer.hasMoreTokens()) {
                    int i = 0;
                    try {
                        i = Integer.parseInt(stringTokenizer.nextToken());
                    } catch (Exception unused) {
                    }
                    setStatusCode(i);
                    String str2 = "";
                    while (stringTokenizer.hasMoreTokens()) {
                        if (str2.length() >= 0) {
                            str2 = str2 + " ";
                        }
                        str2 = str2 + stringTokenizer.nextToken();
                    }
                    setReasonPhrase(str2.trim());
                }
            }
        } catch (Exception e) {
            Debug.warning(e);
        }
    }

    public void setReasonPhrase(String str) {
        this.reasonPhrase = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public HTTPStatus(String str, int i, String str2) {
        setVersion(str);
        setStatusCode(i);
        setReasonPhrase(str2);
    }

    public HTTPStatus(String str) {
        set(str);
    }
}
