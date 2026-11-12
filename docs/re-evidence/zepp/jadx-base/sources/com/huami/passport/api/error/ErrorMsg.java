package com.huami.passport.api.error;

import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.ServerError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.huami.passport.ErrorCode;
import com.huami.passport.net.WebAPI;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes12.dex */
public class ErrorMsg {
    public static String mapErrMsg4CaptchaRsp(int i) {
        if (i == 400) {
            return "Parameter error";
        }
        if (i != 429) {
            return i != 500 ? "System failure" : "Internal Server Error";
        }
        return "Too Many Requests";
    }

    public static String mapErrMsg4ChangePasswordRsp(int i) {
        if (i == 400) {
            return "Invalid new password";
        }
        if (i == 401) {
            return "Wrong old password";
        }
        if (i == 413) {
            return "Payload Too Large";
        }
        if (i != 429) {
            return i != 500 ? "System failure" : "Internal Server Error";
        }
        return "Too Many attempts";
    }

    public static String mapErrMsg4ChangeRsp(int i) {
        if (i == 400) {
            return "Bad Request of new Email address / phone # confirmed already or same as old, or missing/wrong phone security code for new phone";
        }
        if (i == 401) {
            return "wrong old Email address / phone # / password, or missing/wrong Oauth id \"sub\" if unconfirmed multiple registrations)";
        }
        if (i == 413) {
            return "Payload Too Large";
        }
        if (i == 429) {
            return "Too Many attempts, see Content-Type/Content-Language for captcha; or too many passwords";
        }
        if (i != 451) {
            return i != 500 ? "System failure" : "Internal Server Error such as storage or remote regions";
        }
        return "new Email address / phone # complained / permanently bounced before";
    }

    public static String mapErrMsg4ForgotPasswordRsp(int i) {
        if (i == 404) {
            return "Not Found Email address / phone #, or missing/wrong Oauth id \"sub\" if unconfirmed multiple registrations";
        }
        if (i == 429) {
            return "Too Many Requests";
        }
        if (i != 451) {
            return i != 500 ? "System failure" : "Internal Server Error";
        }
        return "Complained / permanently bounced before";
    }

    public static String mapErrMsg4RefreshRsp(int i) {
        if (i != 401) {
            return i != 500 ? "System failure" : "Internal Server Error";
        }
        return "invalid party/secret or invalid/expired Refresh Token";
    }

    public static String mapErrMsg4ResendConfirmationRsp(int i) {
        if (i == 400) {
            return "Confirmed already";
        }
        if (i == 401) {
            return "Invalid Access Token";
        }
        if (i == 404) {
            return "Wrong Email address / phone # or missing/wrong Oauth id \"sub\" for multiple registrations";
        }
        if (i == 429) {
            return "Too Many Requests";
        }
        if (i != 451) {
            return i != 500 ? "System failure" : "Internal Server Error such as storage or remote regions";
        }
        return "Complained / permanently bounced before";
    }

    public static String mapErrMsg4ResetPasswordRsp(int i) {
        if (i == 400) {
            return "Invalid new password";
        }
        if (i == 401) {
            return "Wrong email address or phone #";
        }
        if (i == 413) {
            return "Payload Too Large";
        }
        if (i != 429) {
            return i != 500 ? "System failure" : "Internal Server Error";
        }
        return "Too Many attempts";
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public static ErrorCode mapErrMsg4ServerError(Exception exc) {
        ServerError serverError;
        NetworkResponse networkResponse;
        ErrorCode errorCode = null;
        if (exc instanceof ExecutionException) {
            Throwable cause = ((ExecutionException) exc).getCause();
            if (cause instanceof ServerError) {
                serverError = (ServerError) cause;
            } else {
                serverError = null;
            }
        } else if (exc instanceof ServerError) {
            serverError = (ServerError) exc;
        } else {
            serverError = null;
        }
        if (serverError == null || (networkResponse = serverError.networkResponse) == null) {
            return ErrorCode.builder(WebAPI.getError(exc));
        }
        int i = networkResponse.statusCode;
        if (i == 400) {
            try {
                errorCode = (ErrorCode) new Gson().fromJson(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers)), ErrorCode.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
            int code = errorCode != null ? errorCode.getCode() : 0;
            if (code > 0) {
                return new ErrorCode(i + ":" + code);
            }
        }
        return ErrorCode.builder(String.valueOf(i));
    }

    public static String mapErrMsg4SigninRsp(int i) {
        if (i == 400) {
            return "Wrong party";
        }
        if (i == 401) {
            return "Wrong Email address";
        }
        if (i == 413) {
            return "Payload Too Large";
        }
        if (i != 429) {
            return i != 500 ? "System failure" : "Internal Server Error";
        }
        return "Too Many Requests";
    }

    public static String mapErrMsg4SignupRsp(int i, int i2) {
        if (i != 400) {
            if (i == 413) {
                return "Payload Too Large";
            }
            if (i != 429) {
                return i != 500 ? "system failure" : "Internal Server Error";
            }
            return "Too Many Requests";
        }
        switch (i2) {
            case 1:
                return "Email address or phone is existed.";
            case 2:
                return "Invalid password";
            case 3:
                return "Invalid name including blank";
            case 4:
                return "Missing/invalid/expired security code for phone # registration.";
            case 5:
                return "Invalid region.";
            case 6:
                return "Email address / phone # bounced / permanently complained before";
            default:
                return "Bad Request.";
        }
    }

    public static String mapErrMsg4SignupRsp(NetworkResponse networkResponse) {
        ErrorCode errorCode;
        try {
            errorCode = (ErrorCode) new Gson().fromJson(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers)), ErrorCode.class);
        } catch (Exception e) {
            e.printStackTrace();
            errorCode = null;
        }
        return !TextUtils.isEmpty(errorCode.getErrorMsg()) ? errorCode.getErrorMsg() : mapErrMsg4SignupRsp(networkResponse.statusCode, errorCode != null ? errorCode.getCode() : 0);
    }

    public static String mapErrMsg4UserInfoRsp(int i) {
        if (i != 401) {
            return i != 500 ? "System failure" : "Internal Server Error";
        }
        return "invalid party/secret or invalid/expired Access Token";
    }
}
