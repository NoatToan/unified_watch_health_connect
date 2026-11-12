package l70;

import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import i3.e5;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.format.DateTimeFormat;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r53.l1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ll70/l0;", "Ll70/k0;", "Landroid/content/res/Resources;", "resources", "", "locale", "<init>", "(Landroid/content/res/Resources;Ljava/lang/String;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f110732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110733b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110734a;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.BEFORE_MAINTENANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.ONGOING_MAINTENANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f110734a = iArr;
        }
    }

    static {
        new a(null);
    }

    public l0(Resources resources, String str) {
        resources.getClass();
        str.getClass();
        this.f110732a = resources;
        this.f110733b = str;
    }

    @Override // l70.k0
    public final m0 a() {
        az0.b.f13670a.getClass();
        return new m0(r53.s.s(new l1(az0.b.f13674e)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    @Override // l70.k0
    public final String b(j0 j0Var, e23.l lVar) {
        j70.u uVar;
        String startDateTime;
        String upcomingMessage;
        try {
            uVar = (j70.u) new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("myday_message"), j70.u.class);
        } catch (JsonSyntaxException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "ServerMaintenanceRepository", "Firebase message JSON syntax exception. Remote config parameter is malformed.");
            uVar = null;
        }
        String str = "getScheduledServerMaintenanceData " + j0Var + StringUtils.SPACE + uVar;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "ServerMaintenanceRepository", str);
        if (uVar != null && uVar.getEnabled() && (startDateTime = uVar.getStartDateTime()) != null && (!d53.w.J(startDateTime))) {
            try {
                DateTime dateTime = DateTime.parse(uVar.getStartDateTime(), DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZoneUTC());
                i2.a.b(a2Var2, "ServerMaintenanceRepository", "requestDialogData startDateTime " + dateTime);
                dateTime.getClass();
                if (!((Boolean) lVar.invoke(dateTime)).booleanValue()) {
                    int[] iArr = b.f110734a;
                    int i14 = iArr[j0Var.ordinal()];
                    boolean z14 = false;
                    if (i14 != 1) {
                        if (i14 != 2) {
                            lc.u0.r();
                            return null;
                        }
                        if (dateTime.isBeforeNow() && dateTime.plus(uVar.getDurationMillis()).isAfterNow()) {
                            z14 = true;
                        }
                    } else if (dateTime.minusHours(24).isBeforeNow() && dateTime.isAfterNow()) {
                        z14 = true;
                    }
                    int i15 = iArr[j0Var.ordinal()];
                    if (i15 == 1) {
                        upcomingMessage = uVar.getUpcomingMessage();
                    } else {
                        if (i15 != 2) {
                            lc.u0.r();
                            return null;
                        }
                        upcomingMessage = uVar.getOngoingMessage();
                    }
                    String str2 = upcomingMessage;
                    if (z14) {
                        return c(j0Var, str2, this.f110733b, dateTime, uVar.getDurationMillis());
                    }
                }
            } catch (Exception e4) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "getScheduledServerMaintenanceData Error parsing start date ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var3, "ServerMaintenanceRepository", strD);
            }
        }
        return null;
    }

    public final String c(j0 j0Var, String str, String str2, DateTime dateTime, long j8) {
        String string;
        String str3;
        String strString;
        StringBuilder sbI = p6.b.i("fetchTranslation url[", str, "] locale[", str2, "] startDateTime[");
        sbI.append(dateTime);
        sbI.append("] durationMillis[");
        sbI.append(j8);
        sbI.append("]");
        String string2 = sbI.toString();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ServerMaintenanceRepository", string2);
        DateTime dateTimeWithZone = dateTime.withZone(DateTimeZone.getDefault());
        dateTimeWithZone.getClass();
        boolean zK = g22.k.k(dateTimeWithZone);
        Resources resources = this.f110732a;
        String strJ = zK ? lc.u0.j(resources.getString(R.string.mct_lbl_today)) : lc.u0.j(resources.getString(R.string.common_tomorrow));
        String string3 = resources.getString(R.string.lbl_plural_more_than_one_hour, String.valueOf(Duration.millis(j8).toStandardHours().getHours()));
        string3.getClass();
        String string4 = dateTime.toString(DateTimeFormat.shortTime().withZone(DateTimeZone.getDefault()));
        string4.getClass();
        int i14 = b.f110734a[j0Var.ordinal()];
        if (i14 == 1) {
            string = resources.getString(R.string.msg_system_maintenance_planned, strJ, string4, string3);
            string.getClass();
        } else {
            if (i14 != 2) {
                lc.u0.r();
                return null;
            }
            string = resources.getString(R.string.msg_system_maintenance_in_progress);
            string.getClass();
        }
        String str4 = string;
        if (str == null) {
            return str4;
        }
        try {
            Request requestBuild = new Request.Builder().url(e5.g(str, "/", str2)).get().header("X-garmin-client-id", "garminConnect").build();
            bz0.o.f22274a.getClass();
            Response responseExecute = bz0.o.j().newCall(requestBuild).execute();
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody == null || (strString = responseBodyBody.string()) == null) {
                strString = "";
            }
            int iCode = responseExecute.code();
            StringBuilder sb3 = new StringBuilder("fetchTranslation url[");
            sb3.append(str);
            sb3.append("] locale[");
            sb3.append(str2);
            str3 = str4;
            try {
                sb3.append("] response code ");
                sb3.append(iCode);
                sb3.append(" body ");
                sb3.append(strString);
                i2.a.b(a2Var, "ServerMaintenanceRepository", sb3.toString());
                if (responseExecute.isSuccessful() && !d53.w.J(strString)) {
                    try {
                        String string5 = new JSONObject(strString).getString("message");
                        i2.a.b(a2Var, "ServerMaintenanceRepository", "fetchTranslation message[" + string5 + "] startDate[" + strJ + "] startTime[" + string4 + "] durationHours[" + string3 + "]");
                        string5.getClass();
                        String strV = d53.u.v(d53.u.v(d53.u.v(string5, "{{1}}", strJ, false), "{{2}}", string4, false), "{{3}}", string3, false);
                        if (!d53.w.J(strV)) {
                            return strV;
                        }
                    } catch (JSONException e4) {
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var2, "ServerMaintenanceRepository", "fetchTranslation url[" + str + "] locale[" + str2 + "] parsing error " + e4);
                    }
                } else if (!str2.equals("en")) {
                    return c(j0Var, str, "en", dateTime, j8);
                }
            } catch (Exception e14) {
                e = e14;
                StringBuilder sbI2 = p6.b.i("fetchTranslation url[", str, "] locale[", str2, "] error ");
                sbI2.append(e);
                String string6 = sbI2.toString();
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var3, "ServerMaintenanceRepository", string6);
                if (!str2.equals("en")) {
                    return c(j0Var, str, "en", dateTime, j8);
                }
            }
        } catch (Exception e15) {
            e = e15;
            str3 = str4;
        }
        return str3;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Ll70/l0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "NOTIFY_SCHEDULED_MAINTENANCE_HOURS", "I", "START_DATE_TIME_PATTERN", "ENGLISH_LANGUAGE_LOCALE_CODE", "MESSAGE_JSON_KEY", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
