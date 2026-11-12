package ot;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p13.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lot/q;", "Lot/l;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/l;", "bodyBatteryData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/l;Lot/x;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends l implements bu.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tt.l f133663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f133664s;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, tt.l lVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133663r = lVar;
        this.f133664s = "BodyBatteryChapter";
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133587s() {
        return this.f133664s;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/body_battery";
    }

    @Override // ot.p
    public final LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        Integer avgDailyBbDrained;
        Integer avgDailyBbCharged;
        JsonObject jsonObjectC = c(d(context), pVar, pVar2, i14);
        b(context);
        String string = context.getString(R.string.annual_report_body_battery_intro_text);
        string.getClass();
        pt.i.z(jsonObjectC, "intro_layer_name", string, oe2.f.O(context));
        pt.i iVar = pt.i.f140571a;
        float f14 = this.f133656j;
        iVar.getClass();
        pt.i.f(jsonObjectC, f14);
        String string2 = context.getString(R.string.gcm_body_battery_lbl_body_battery);
        string2.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string2.toUpperCase(locale);
        upperCase.getClass();
        pt.i.g(context, jsonObjectC, "Text_Topic", upperCase);
        float f15 = this.f133656j;
        String string3 = context.getString(R.string.gcm_body_battery_lbl_body_battery);
        string3.getClass();
        String upperCase2 = string3.toUpperCase(locale);
        upperCase2.getClass();
        pt.i.a(context, jsonObjectC, "Text_Topic", f15, upperCase2, false);
        r(context, jsonObjectC, 330.0f - this.f133656j, 18.0f);
        tt.l lVar = this.f133663r;
        Integer bbHighAchievedThreshold = lVar != null ? lVar.getBbHighAchievedThreshold() : null;
        Integer bbHighAchievedThresholdDayCount = lVar != null ? lVar.getBbHighAchievedThresholdDayCount() : null;
        if (bbHighAchievedThreshold != null && bbHighAchievedThresholdDayCount != null) {
            int iIntValue = bbHighAchievedThresholdDayCount.intValue();
            int iIntValue2 = bbHighAchievedThreshold.intValue();
            x0 x0Var = x0.f105818a;
            String string4 = context.getString(R.string.annual_report_body_battery_fun_fact);
            string4.getClass();
            pt.i.z(jsonObjectC, "funfact_layer_name", String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(iIntValue2), String.valueOf(iIntValue)}, 2)), oe2.f.T(context));
        }
        pt.n nVar = pt.n.f140581a;
        String string5 = context.getString(R.string.annual_report_body_battery_month_chart_title);
        string5.getClass();
        String strV = d53.u.v(new d53.k("([\\u0E01-\\u0E2E])([\\u0E48-\\u0E4B])\\u0E33").f(string5, "$1ํ$2า"), "ำ", "ํา", false);
        Typeface typefaceS = oe2.f.S(context);
        nVar.getClass();
        pt.n.e(jsonObjectC, strV, typefaceS);
        List<Integer> listF = lVar != null ? lVar.f() : null;
        List<Integer> listG = lVar != null ? lVar.g() : null;
        if (listF != null && listG != null) {
            pt.g gVar = pt.g.f140567a;
            gVar.getClass();
            pt.g.d(jsonObjectC, listF, listG, new pt.e(gVar));
        }
        if (lVar != null && (avgDailyBbCharged = lVar.getAvgDailyBbCharged()) != null) {
            pt.i.y(jsonObjectC, "Stats_1_Value", Marker.ANY_NON_NULL_MARKER + avgDailyBbCharged.intValue());
        }
        String string6 = context.getString(R.string.annual_report_body_battery_avg_daily_charge_text);
        string6.getClass();
        pt.i.z(jsonObjectC, "Stats_1_Description", string6, oe2.f.T(context));
        if (lVar != null && (avgDailyBbDrained = lVar.getAvgDailyBbDrained()) != null) {
            pt.i.y(jsonObjectC, "Stats_2_Value", String.valueOf(-avgDailyBbDrained.intValue()));
        }
        String string7 = context.getString(R.string.annual_report_body_battery_avg_daily_drain_text);
        string7.getClass();
        pt.i.z(jsonObjectC, "Stats_2_Description", string7, oe2.f.T(context));
        String string8 = jsonObjectC.toString();
        string8.getClass();
        byte[] bytes = string8.getBytes(d53.c.f57666b);
        bytes.getClass();
        return LottieCompositionFactory.fromJsonInputStreamSync(new ByteArrayInputStream(bytes), null).getValue();
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        Object obj = null;
        tt.l lVar = this.f133663r;
        if ((lVar != null ? lVar.getBbHighAchievedThreshold() : null) == null || lVar.getBbHighAchievedThresholdDayCount() == null) {
            for (Object obj2 : this.f133650d) {
                if (p005kotlin.jvm.internal.s.g(((com.airbnb.lottie.model.Marker) obj2).getName(), "Funfact")) {
                    obj = obj2;
                    break;
                }
            }
            com.airbnb.lottie.model.Marker marker = (com.airbnb.lottie.model.Marker) obj;
            if (marker != null) {
                a(lottieDrawable, p13.w.c(marker));
            }
        }
        pt.i iVar = pt.i.f140571a;
        String string = context.getString(R.string.gcm_body_battery_lbl_body_battery);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        p(context, lottieDrawable, t0.b(new o13.p("image_0", "bg_icon.png")));
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.STEPS_PUSHES;
    }

    @Override // ot.l
    public final Map<String, String> l() {
        return t0.b(new o13.p("image_0", "sharing_bg.png"));
    }

    @Override // ot.l
    public final Object m(Context context, yt.o oVar) throws Throwable {
        LottieDrawable lottieDrawable = new LottieDrawable();
        JsonObject jsonObjectK = k(context, this, "sharing.json");
        if (jsonObjectK != null) {
            r(context, jsonObjectK, 230.0f, 12.0f);
            tt.l lVar = this.f133663r;
            List<Integer> listF = lVar != null ? lVar.f() : null;
            List<Integer> listG = lVar != null ? lVar.g() : null;
            if (listF != null && listG != null) {
                pt.g gVar = pt.g.f140567a;
                gVar.getClass();
                pt.g.d(jsonObjectK, listF, listG, new pt.f(gVar));
            }
        }
        q(context, jsonObjectK, lottieDrawable);
        pt.i iVar = pt.i.f140571a;
        String string = context.getString(R.string.gcm_body_battery_lbl_body_battery);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        Object objO = o(context, p13.w.c(new l.a(this, lottieDrawable, "BodyBatteryChapter")), oVar);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : Unit.INSTANCE;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133663r == null || e() == null) ? false : true;
    }

    public final void r(Context context, JsonObject jsonObject, float f14, float f15) {
        Integer avgDailyBbHigh;
        tt.l lVar = this.f133663r;
        if (lVar == null || (avgDailyBbHigh = lVar.getAvgDailyBbHigh()) == null) {
            return;
        }
        String strValueOf = String.valueOf(avgDailyBbHigh.intValue());
        String string = context.getString(R.string.annual_report_body_battery_avg_daily_high_unit);
        string.getClass();
        pt.h.i(context, jsonObject, strValueOf, string, f14, f15);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lot/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "BB_SHARE_IMAGE_FILE_NAME", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
