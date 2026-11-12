package com.xiaomi.hm.health.homepage.status.card;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b2\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0019\u0010\"\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0019\u0010%\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0019\u0010(\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u0019\u0010+\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0019\u0010.\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0019\u00101\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/DataNotifiers;", "", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "a", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "getSummeryDataNotifier", "()Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "summeryDataNotifier", "b", "getFullHeartRateSwitchNotifier", "fullHeartRateSwitchNotifier", "c", "getEcgNotifier", "ecgNotifier", GoogleApiAvailabilityLight.a, "getVo2maxNotifier", "vo2maxNotifier", "e", "getSportLoadNotifier", "sportLoadNotifier", "f", "getUnitNotifier", "unitNotifier", "g", "getDeviceBoundNotifier", "deviceBoundNotifier", "h", "getTodaySportAnalysisJobFinishedNotifier", "todaySportAnalysisJobFinishedNotifier", "i", "getEditSleepNotifier", "editSleepNotifier", z.j, "getAllDayStressSwitchNotifier", "allDayStressSwitchNotifier", hl.k, "getLoginNotifier", "loginNotifier", "l", "getAtrialDataNotifier", "atrialDataNotifier", "m", "getTimeChangedNotifier", "timeChangedNotifier", GoogleApiAvailabilityLight.b, "getPersonInfoChangedNotifier", "personInfoChangedNotifier", "o", "getDataDownloadFinishedNotifier", "dataDownloadFinishedNotifier", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataNotifiers {

    @NotNull
    public static final DataNotifiers INSTANCE = new DataNotifiers();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier summeryDataNotifier = new DataNotifier();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier fullHeartRateSwitchNotifier = new DataNotifier();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier ecgNotifier = new DataNotifier();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier vo2maxNotifier = new DataNotifier();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier sportLoadNotifier = new DataNotifier();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier unitNotifier = new DataNotifier();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier deviceBoundNotifier = new DataNotifier();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier todaySportAnalysisJobFinishedNotifier = new DataNotifier();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier editSleepNotifier = new DataNotifier();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier allDayStressSwitchNotifier = new DataNotifier();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier loginNotifier = new DataNotifier();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier atrialDataNotifier = new DataNotifier();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier timeChangedNotifier = new DataNotifier();

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier personInfoChangedNotifier = new DataNotifier();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private static final DataNotifier dataDownloadFinishedNotifier = new DataNotifier();

    private DataNotifiers() {
    }

    @NotNull
    public final DataNotifier getAllDayStressSwitchNotifier() {
        return allDayStressSwitchNotifier;
    }

    @NotNull
    public final DataNotifier getAtrialDataNotifier() {
        return atrialDataNotifier;
    }

    @NotNull
    public final DataNotifier getDataDownloadFinishedNotifier() {
        return dataDownloadFinishedNotifier;
    }

    @NotNull
    public final DataNotifier getDeviceBoundNotifier() {
        return deviceBoundNotifier;
    }

    @NotNull
    public final DataNotifier getEcgNotifier() {
        return ecgNotifier;
    }

    @NotNull
    public final DataNotifier getEditSleepNotifier() {
        return editSleepNotifier;
    }

    @NotNull
    public final DataNotifier getFullHeartRateSwitchNotifier() {
        return fullHeartRateSwitchNotifier;
    }

    @NotNull
    public final DataNotifier getLoginNotifier() {
        return loginNotifier;
    }

    @NotNull
    public final DataNotifier getPersonInfoChangedNotifier() {
        return personInfoChangedNotifier;
    }

    @NotNull
    public final DataNotifier getSportLoadNotifier() {
        return sportLoadNotifier;
    }

    @NotNull
    public final DataNotifier getSummeryDataNotifier() {
        return summeryDataNotifier;
    }

    @NotNull
    public final DataNotifier getTimeChangedNotifier() {
        return timeChangedNotifier;
    }

    @NotNull
    public final DataNotifier getTodaySportAnalysisJobFinishedNotifier() {
        return todaySportAnalysisJobFinishedNotifier;
    }

    @NotNull
    public final DataNotifier getUnitNotifier() {
        return unitNotifier;
    }

    @NotNull
    public final DataNotifier getVo2maxNotifier() {
        return vo2maxNotifier;
    }
}
