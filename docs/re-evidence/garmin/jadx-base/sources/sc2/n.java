package sc2;

import ch.qos.logback.core.joran.action.Action;
import d53.w;
import java.util.Calendar;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsc2/n;", "", "Lve2/k;", "mfaTokenData", "Lsc2/m;", "oAuth2DIData", "<init>", "(Lve2/k;Lsc2/m;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f158540c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve2.k f158541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f158542b;

    public n(ve2.k kVar, m mVar) {
        mVar.getClass();
        this.f158541a = kVar;
        this.f158542b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f158541a, nVar.f158541a) && s.g(this.f158542b, nVar.f158542b);
    }

    public final int hashCode() {
        ve2.k kVar = this.f158541a;
        return this.f158542b.hashCode() + ((kVar == null ? 0 : kVar.hashCode()) * 31);
    }

    public final String toString() {
        return "OAuth2DIDataWithMFA(mfaTokenData=" + this.f158541a + ", oAuth2DIData=" + this.f158542b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsc2/n$a;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static n a(String str) throws JSONException {
            str.getClass();
            JSONObject jSONObject = new JSONObject(str);
            n.f158540c.getClass();
            String strOptString = jSONObject.optString("mfa_token", "");
            strOptString.getClass();
            ve2.k kVar = !w.J(strOptString) ? new ve2.k(strOptString, Long.valueOf(jSONObject.getLong("mfa_expiration_timestamp_millis"))) : null;
            String strOptString2 = jSONObject.optString(Action.SCOPE_ATTRIBUTE, "");
            strOptString2.getClass();
            Set setB = b(StringUtils.SPACE, strOptString2);
            String string = jSONObject.getString("access_token");
            string.getClass();
            String string2 = jSONObject.getString("refresh_token");
            string2.getClass();
            int i14 = jSONObject.getInt("expires_in");
            Calendar calendarC = nd2.c.c();
            calendarC.clear();
            calendarC.setTimeInMillis(System.currentTimeMillis());
            calendarC.add(13, i14);
            long timeInMillis = calendarC.getTimeInMillis();
            int i15 = jSONObject.getInt("refresh_token_expires_in");
            Calendar calendarC2 = nd2.c.c();
            calendarC2.clear();
            calendarC2.setTimeInMillis(System.currentTimeMillis());
            calendarC2.add(13, i15);
            return new n(kVar, new m(setB, string, string2, timeInMillis, calendarC2.getTimeInMillis()));
        }

        public static Set b(String str, String str2) {
            if (w.J(str2)) {
                return null;
            }
            return h0.g1(w.W(w.i0(str2).toString(), new String[]{str}));
        }

        private a() {
        }
    }

    public /* synthetic */ n(ve2.k kVar, m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : kVar, mVar);
    }
}
