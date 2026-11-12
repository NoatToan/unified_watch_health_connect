package jo2;

import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f99829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f99830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Date f99831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f99832f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f99833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f99834b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Date f99835c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Date f99836d = new Date();

        public final void a(String str) {
            this.f99833a = str;
            try {
                JWTClaimsSet jWTClaimsSet = SignedJWT.parse(str).getJWTClaimsSet();
                if (jWTClaimsSet.getStringClaim("user_id") != null) {
                    jWTClaimsSet.getStringClaim("user_id");
                }
                if (jWTClaimsSet.getExpirationTime() != null) {
                    this.f99835c = jWTClaimsSet.getExpirationTime();
                }
                if (jWTClaimsSet.getIssueTime() != null) {
                    this.f99836d = jWTClaimsSet.getIssueTime();
                }
            } catch (Exception unused) {
            }
        }
    }

    private c(String str, String str2, long j8, Date date, Date date2, String str3) {
        this.f99827a = str;
        this.f99828b = str2;
        this.f99829c = j8;
        this.f99830d = date;
        this.f99831e = date2;
        this.f99832f = str3;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("OAuthToken{tokenType='");
        stringBuffer.append(this.f99827a);
        stringBuffer.append("', accessToken='");
        stringBuffer.append(this.f99828b);
        stringBuffer.append("', expiresIn=");
        stringBuffer.append(this.f99829c);
        stringBuffer.append(", expiresTs=");
        stringBuffer.append(this.f99830d);
        stringBuffer.append(", issuedTs=");
        stringBuffer.append(this.f99831e);
        stringBuffer.append(", userId='");
        stringBuffer.append(this.f99832f);
        stringBuffer.append("'}");
        return stringBuffer.toString();
    }

    public /* synthetic */ c(String str, long j8, Date date, Date date2, String str2) {
        this(null, str, j8, date, date2, str2);
    }
}
