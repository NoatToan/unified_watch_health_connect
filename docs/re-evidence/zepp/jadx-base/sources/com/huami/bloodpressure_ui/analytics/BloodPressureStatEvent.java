package com.huami.bloodpressure_ui.analytics;

import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\bA\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BR\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001c\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u001c\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001c\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u001c\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u001c\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u001c\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u001c\u00104\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u001c\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u001c\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u001c\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u001c\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006¨\u0006C"}, d2 = {"Lcom/huami/bloodpressure_ui/analytics/BloodPressureStatEvent;", "", "", "a", "Ljava/lang/String;", "getHEALTH_BLOODPRESSURE_V", "()Ljava/lang/String;", "HEALTH_BLOODPRESSURE_V", "b", "getHEALTH_BLOODPRESSURE_RESEARCH_V", "HEALTH_BLOODPRESSURE_RESEARCH_V", "c", "getHEALTH_BLOODPRESSURE_DAY_C", "HEALTH_BLOODPRESSURE_DAY_C", GoogleApiAvailabilityLight.a, "getHEALTH_BLOODPRESSURE_WEEK_C", "HEALTH_BLOODPRESSURE_WEEK_C", "e", "getHEALTH_BLOODPRESSURE_MONTH_C", "HEALTH_BLOODPRESSURE_MONTH_C", "f", "getHEALTH_BLOODPRESSURE_YEAR_C", "HEALTH_BLOODPRESSURE_YEAR_C", "g", "getHEALTH_BLOODPRESSURE_DAY_DIVISION_C", "HEALTH_BLOODPRESSURE_DAY_DIVISION_C", "h", "getHEALTH_BLOODPRESSURE_WEEK_DIVISION_C", "HEALTH_BLOODPRESSURE_WEEK_DIVISION_C", "i", "getHEALTH_BLOODPRESSURE_MONTH_DIVISION_C", "HEALTH_BLOODPRESSURE_MONTH_DIVISION_C", z.j, "getHEALTH_BLOODPRESSURE_YEAR_DIVISION_C", "HEALTH_BLOODPRESSURE_YEAR_DIVISION_C", hl.k, "getHEALTH_BPAVE_CURVE_C", "HEALTH_BPAVE_CURVE_C", "l", "getHEALTH_BLOODPRESSURE_ADD_C", "HEALTH_BLOODPRESSURE_ADD_C", "m", "getHEALTH_BLOODPRESSURE_SAVE_C", "HEALTH_BLOODPRESSURE_SAVE_C", GoogleApiAvailabilityLight.b, "getHEALTH_BLOODPRESSURE_HISTORY_C", "HEALTH_BLOODPRESSURE_HISTORY_C", "o", "getHEALTH_BLOODPRESSURE_RESEARCH_C", "HEALTH_BLOODPRESSURE_RESEARCH_C", b.r, "getHEALTH_BLOODPRESSURE_RESEARCH_STATE", "HEALTH_BLOODPRESSURE_RESEARCH_STATE", DTransferConstants.SEARCH_KEY, "getHEALTH_BLOODPRESSURE_STATE_START", "HEALTH_BLOODPRESSURE_STATE_START", "r", "getHEALTH_BLOODPRESSURE_STATE_CONTINUE", "HEALTH_BLOODPRESSURE_STATE_CONTINUE", SOAP.XMLNS, "getHEALTH_BLOODPRESSURE_STATE_DONE", "HEALTH_BLOODPRESSURE_STATE_DONE", "t", "getHEALTH_BLOODPRESSURE_INTRODUCE_C", "HEALTH_BLOODPRESSURE_INTRODUCE_C", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureStatEvent {

    @NotNull
    public static final BloodPressureStatEvent INSTANCE = new BloodPressureStatEvent();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_V = "HEALTH_BLOODPRESSURE_V";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_RESEARCH_V = "HEALTH_BLOODPRESSURE_RESEARCH_V";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_DAY_C = "HEALTH_BLOODPRESSURE_DAY_C";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_WEEK_C = "HEALTH_BLOODPRESSURE_WEEK_C";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_MONTH_C = "HEALTH_BLOODPRESSURE_MONTH_C";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_YEAR_C = "HEALTH_BLOODPRESSURE_YEAR_C";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_DAY_DIVISION_C = "HEALTH_BLOODPRESSURE_DAY_DIVISION_C";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_WEEK_DIVISION_C = "HEALTH_BLOODPRESSURE_WEEK_DIVISION_C";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_MONTH_DIVISION_C = "HEALTH_BLOODPRESSURE_MONTH_DIVISION_C";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_YEAR_DIVISION_C = "HEALTH_BLOODPRESSURE_YEAR_DIVISION_C";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BPAVE_CURVE_C = "HEALTH_BPAVE_CURVE_C";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_ADD_C = "HEALTH_BLOODPRESSURE_ADD_C";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_SAVE_C = "HEALTH_BLOODPRESSURE_SAVE_C";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_HISTORY_C = "HEALTH_BLOODPRESSURE_HISTORY_C";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_RESEARCH_C = "HEALTH_BLOODPRESSURE_RESEARCH_C";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_RESEARCH_STATE = "state";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_STATE_START = "start";

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_STATE_CONTINUE = HMFwOnlineAnalyticsKt.TYPE_CONTINUE;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_STATE_DONE = "done";

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private static final String HEALTH_BLOODPRESSURE_INTRODUCE_C = "HEALTH_BLOODPRESSURE_INTRODUCE_C";

    private BloodPressureStatEvent() {
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_ADD_C() {
        return HEALTH_BLOODPRESSURE_ADD_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_DAY_C() {
        return HEALTH_BLOODPRESSURE_DAY_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_DAY_DIVISION_C() {
        return HEALTH_BLOODPRESSURE_DAY_DIVISION_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_HISTORY_C() {
        return HEALTH_BLOODPRESSURE_HISTORY_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_INTRODUCE_C() {
        return HEALTH_BLOODPRESSURE_INTRODUCE_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_MONTH_C() {
        return HEALTH_BLOODPRESSURE_MONTH_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_MONTH_DIVISION_C() {
        return HEALTH_BLOODPRESSURE_MONTH_DIVISION_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_RESEARCH_C() {
        return HEALTH_BLOODPRESSURE_RESEARCH_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_RESEARCH_STATE() {
        return HEALTH_BLOODPRESSURE_RESEARCH_STATE;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_RESEARCH_V() {
        return HEALTH_BLOODPRESSURE_RESEARCH_V;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_SAVE_C() {
        return HEALTH_BLOODPRESSURE_SAVE_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_STATE_CONTINUE() {
        return HEALTH_BLOODPRESSURE_STATE_CONTINUE;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_STATE_DONE() {
        return HEALTH_BLOODPRESSURE_STATE_DONE;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_STATE_START() {
        return HEALTH_BLOODPRESSURE_STATE_START;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_V() {
        return HEALTH_BLOODPRESSURE_V;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_WEEK_C() {
        return HEALTH_BLOODPRESSURE_WEEK_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_WEEK_DIVISION_C() {
        return HEALTH_BLOODPRESSURE_WEEK_DIVISION_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_YEAR_C() {
        return HEALTH_BLOODPRESSURE_YEAR_C;
    }

    @NotNull
    public final String getHEALTH_BLOODPRESSURE_YEAR_DIVISION_C() {
        return HEALTH_BLOODPRESSURE_YEAR_DIVISION_C;
    }

    @NotNull
    public final String getHEALTH_BPAVE_CURVE_C() {
        return HEALTH_BPAVE_CURVE_C;
    }
}
