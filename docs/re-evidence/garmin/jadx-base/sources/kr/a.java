package kr;

import am.x0;
import am.z0;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import g22.n;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkr/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f106200b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f106201a;

    static {
        new C2050a(null);
        f106200b = R.raw.default_charts_configuration;
    }

    public a(Context context) {
        context.getClass();
        this.f106201a = context;
    }

    public static jr.c b(a aVar, x0 x0Var) {
        x0 x0Var2 = x0.f4346x;
        x0Var.getClass();
        x0Var2.getClass();
        String strD = d(aVar, x0Var.f4365h, Integer.valueOf(x0Var2.f4365h), 4);
        return n.d(strD) ? (jr.c) GsonUtil.f47253b.fromJson(strD, jr.c.class) : new jr.c(null, null, 3, null);
    }

    public static /* synthetic */ String d(a aVar, int i14, Integer num, int i15) {
        if ((i15 & 2) != 0) {
            num = null;
        }
        return aVar.c(num, i14, "");
    }

    public final jr.b a(x0 x0Var) {
        x0Var.getClass();
        String strC = c(Integer.valueOf(z0.g(x0Var).f4364g), x0Var.f4364g, "{\"sections\": [{ \"type\": \"home\", \"stats\": [\"distance\", \"calories\", \"totalTime\"],\"showPolyline\": false } ] }");
        if (!n.d(strC)) {
            return new jr.b(j0.f134944a);
        }
        try {
            return (jr.b) GsonUtil.f47253b.fromJson(strC, jr.b.class);
        } catch (Exception e4) {
            String str = "Failed to parse activityConfiguration for activity type " + x0Var + ": " + e4;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "ActivityConfigurationProvider", str);
            return new jr.b(j0.f134944a);
        }
    }

    public final String c(Integer num, int i14, String str) {
        Context context = this.f106201a;
        if (i14 == 0) {
            try {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "ActivityConfigurationProvider", "Resource ID not found. Cannot open file.");
            } catch (Exception e4) {
                String message = e4.getMessage();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var2, "ActivityConfigurationProvider", message);
                if (num != null) {
                    try {
                        if (num.intValue() == 0) {
                            i2.a.b(a2Var2, "ActivityConfigurationProvider", "Resource ID not found. Cannot open file.");
                        }
                    } catch (Exception e14) {
                        String message2 = e14.getMessage();
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var3, "ActivityConfigurationProvider", message2);
                        return str;
                    }
                }
                if (num == null) {
                    return str;
                }
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(num.intValue());
                inputStreamOpenRawResource.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, d53.c.f57666b), 8192);
                try {
                    String strE = lg.d.E(bufferedReader);
                    bufferedReader.close();
                    return strE;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(bufferedReader, th3);
                        throw th4;
                    }
                }
            }
        }
        InputStream inputStreamOpenRawResource2 = context.getResources().openRawResource(i14);
        inputStreamOpenRawResource2.getClass();
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource2, d53.c.f57666b), 8192);
        try {
            String strE2 = lg.d.E(bufferedReader2);
            bufferedReader2.close();
            return strE2;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(bufferedReader2, th5);
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: kr.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkr/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "OTHER_ACTIVITY_CONFIGURATION", "EMPTY_STRING", "", "DEFAULT_CHARTS_CONFIGURATION_FILE_NAME", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2050a {
        public /* synthetic */ C2050a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2050a() {
        }
    }
}
