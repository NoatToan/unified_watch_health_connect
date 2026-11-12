package jx2;

import com.garmin.samd.exception.GHSDuplicateUploadException;
import com.garmin.samd.exception.GHSEnvironmentNotSupportedException;
import com.garmin.samd.exception.GHSFitFileTypeUnsupportedException;
import com.garmin.samd.exception.GHSGarminDeviceInactiveException;
import com.garmin.samd.exception.GHSGarminDeviceNotRegisteredException;
import com.garmin.samd.exception.GHSInvalidCustomerException;
import com.garmin.samd.exception.GHSInvalidFITArchiveException;
import com.garmin.samd.exception.GHSInvalidFITFileException;
import com.garmin.samd.exception.GHSSaMDIdMismatchException;
import com.garmin.samd.exception.GHSServerException;
import com.garmin.samd.exception.GHSUnknownErrorTypeException;
import com.garmin.samd.exception.GHSUserAccountAlreadyExistsException;
import com.garmin.samd.exception.GHSUserAccountDoesNotExistException;
import com.garmin.samd.exception.MFARequiredException;
import com.garmin.samd.exception.MFATokenNotBoundException;
import com.garmin.samd.exception.NetworkException;
import com.garmin.samd.exception.NullAppDelegateException;
import com.garmin.samd.exception.UserDoesNotConsentToUploadException;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljx2/a;", "", "", "className", "<init>", "(Ljava/lang/String;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f101508a;

    /* JADX INFO: renamed from: jx2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C1952a extends p005kotlin.jvm.internal.w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f101509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f101510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1952a(String str, a aVar) {
            super(0);
            this.f101509a = str;
            this.f101510b = aVar;
        }

        @Override // e23.a
        public final Logger invoke() {
            return ge1.b.L(this.f101509a + "@" + this.f101510b.hashCode());
        }
    }

    public a(String str) {
        str.getClass();
        this.f101508a = o13.m.b(new C1952a(str, this));
    }

    public static String a(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("errorId");
            return strOptString == null ? "" : strOptString;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("errorMessage");
            return strOptString == null ? "" : strOptString;
        } catch (Exception unused) {
            return "";
        }
    }

    public static gx2.a c() {
        gx2.b.f80060a.getClass();
        return gx2.b.f80061b;
    }

    public final Logger d() {
        return (Logger) this.f101508a.getValue();
    }

    public final void e(String str, Throwable th3) {
        Unit unit;
        if (th3 != null) {
            d().error(str, th3);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            d().error(str);
        }
    }

    public final void f(Exception exc, String str) {
        Unit unit;
        if (exc != null) {
            d().warn(str, (Throwable) exc);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            d().warn(str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Throwable g(Throwable th3) throws JSONException {
        String string;
        Throwable gHSInvalidCustomerException;
        th3.getClass();
        if (!(th3 instanceof UnexpectedResponseCodeException)) {
            return th3;
        }
        UnexpectedResponseCodeException unexpectedResponseCodeException = (UnexpectedResponseCodeException) th3;
        if (unexpectedResponseCodeException.isCaptivePortal()) {
            String strN = fb1.c.n("Captive Portal detected -> ", unexpectedResponseCodeException.getResponseBody());
            d().error("UnexpectedResponseCodeException.toSaMDException: ".concat(strN));
            return new NetworkException(strN);
        }
        if (unexpectedResponseCodeException.getResponseCode() >= 500) {
            return new GHSServerException(unexpectedResponseCodeException.getResponseCode(), unexpectedResponseCodeException.getResponseBody());
        }
        try {
            JSONObject jSONObject = new JSONObject(unexpectedResponseCodeException.getResponseBody());
            if (!jSONObject.has("errorType")) {
                String str = "'errorType' not present\n" + jSONObject.toString(3);
                d().error("UnexpectedGHSResponseCodeException.convert: ".concat(str));
                return new GHSUnknownErrorTypeException("", a(jSONObject), str);
            }
            try {
                string = jSONObject.getString("errorType");
                string.getClass();
            } catch (Exception unused) {
                string = "";
            }
            switch (string.hashCode()) {
                case -2081290970:
                    if (string.equals("invalid_customer")) {
                        gHSInvalidCustomerException = new GHSInvalidCustomerException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case -2063594571:
                    if (string.equals("duplicate_upload")) {
                        gHSInvalidCustomerException = new GHSDuplicateUploadException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case -1868496726:
                    if (string.equals("inactive_device")) {
                        Long deviceUnitId = unexpectedResponseCodeException.getDeviceUnitId();
                        gHSInvalidCustomerException = new GHSGarminDeviceInactiveException(deviceUnitId != null ? deviceUnitId.longValue() : 0L, a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case -1297355294:
                    if (string.equals("improper_consent_status")) {
                        gHSInvalidCustomerException = new UserDoesNotConsentToUploadException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case -952837687:
                    if (string.equals("invalid_fit")) {
                        gHSInvalidCustomerException = new GHSInvalidFITFileException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case -842009704:
                    if (string.equals("samd_id_mismatch")) {
                        gHSInvalidCustomerException = new GHSSaMDIdMismatchException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case -754263910:
                    if (string.equals("invalid_mfa_token")) {
                        gHSInvalidCustomerException = new MFARequiredException(null, 1, null);
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case 0:
                    if (string.equals("")) {
                        String str2 = "'errorType' is empty\n" + jSONObject.toString(3);
                        d().error("UnexpectedGHSResponseCodeException.convert: ".concat(str2));
                        gHSInvalidCustomerException = new GHSUnknownErrorTypeException("", a(jSONObject), str2);
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case 341849411:
                    if (string.equals("verification_required")) {
                        gHSInvalidCustomerException = new GHSUserAccountAlreadyExistsException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case 395107350:
                    if (string.equals("mfa_required")) {
                        gHSInvalidCustomerException = new MFATokenNotBoundException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case 520063052:
                    if (string.equals("invalid_fit_archive")) {
                        gHSInvalidCustomerException = new GHSInvalidFITArchiveException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case 1073586285:
                    if (string.equals("device_not_found")) {
                        Long deviceUnitId2 = unexpectedResponseCodeException.getDeviceUnitId();
                        gHSInvalidCustomerException = new GHSGarminDeviceNotRegisteredException(deviceUnitId2 != null ? deviceUnitId2.longValue() : 0L, a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case 1147986294:
                    if (string.equals("file_not_accepted")) {
                        gHSInvalidCustomerException = new GHSFitFileTypeUnsupportedException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                case 1244556164:
                    if (string.equals("account_not_found")) {
                        gHSInvalidCustomerException = new GHSUserAccountDoesNotExistException(a(jSONObject), b(jSONObject));
                        return gHSInvalidCustomerException;
                    }
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
                default:
                    d().warn("UnexpectedGHSResponseCodeException.convert: ".concat("unknown 'errorType' " + string + "\n" + jSONObject.toString(3)));
                    return new GHSUnknownErrorTypeException(string, a(jSONObject), b(jSONObject));
            }
        } catch (JSONException e4) {
            d().error("UnexpectedResponseCodeException.convert():\n" + unexpectedResponseCodeException.getResponseBody(), (Throwable) e4);
            throw e4;
        }
    }

    public final gx2.a h(String str) throws NullAppDelegateException, NetworkException, GHSEnvironmentNotSupportedException {
        gx2.a aVarC = c();
        if (aVarC == null) {
            throw new NullAppDelegateException();
        }
        if (!aVarC.a()) {
            d().warn(str.concat(": no network connection"));
            throw new NetworkException("no network connection");
        }
        zi2.a aVarJ = aVarC.j();
        o13.t tVar = sx2.b.f161144a;
        aVarJ.getClass();
        if (aVarJ == zi2.a.PROD || aVarJ == zi2.a.TEST || aVarJ == zi2.a.TEST_SSO_CHINA || aVarJ == zi2.a.CHINA) {
            return aVarC;
        }
        throw new GHSEnvironmentNotSupportedException(aVarJ);
    }
}
