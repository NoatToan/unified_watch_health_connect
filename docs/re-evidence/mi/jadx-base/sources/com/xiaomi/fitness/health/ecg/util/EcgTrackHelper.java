package com.xiaomi.fitness.health.ecg.util;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/util/EcgTrackHelper;", "", "<init>", "()V", "trackEntranceBannerClick", "", "trackAppAuthorizeResult", "result", "", "trackOauthAuthorizeResult", "trackSubmitReportClick", "origin", "", "trackViewReportDetailClick", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgTrackHelper {

    @NotNull
    public static final EcgTrackHelper INSTANCE = new EcgTrackHelper();

    private EcgTrackHelper() {
    }

    public final void trackAppAuthorizeResult(boolean result) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.72.1.1.30067");
        pairArr[1] = TuplesKt.to("name", "ecg_empower");
        pairArr[2] = TuplesKt.to("source", "ecg_empower_information");
        pairArr[3] = TuplesKt.to("type", result ? "yes" : "no");
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackEntranceBannerClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.72.1.1.29844"), TuplesKt.to("name", "ecg_explain_service_banner")));
    }

    public final void trackOauthAuthorizeResult(boolean result) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.72.1.1.30067");
        pairArr[1] = TuplesKt.to("name", "ecg_empower");
        pairArr[2] = TuplesKt.to("source", "ecg_empower_account");
        pairArr[3] = TuplesKt.to("type", result ? "yes" : "no");
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSubmitReportClick(@NotNull String origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.72.1.1.30070"), TuplesKt.to("name", "ecg_submit_explanation"), TuplesKt.to("source", origin)));
    }

    public final void trackViewReportDetailClick(@NotNull String origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.72.1.1.30071"), TuplesKt.to("name", "ecg_view_report"), TuplesKt.to("source", origin)));
    }
}
