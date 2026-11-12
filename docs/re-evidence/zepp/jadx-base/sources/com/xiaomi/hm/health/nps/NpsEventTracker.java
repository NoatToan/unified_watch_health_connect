package com.xiaomi.hm.health.nps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/nps/NpsEventTracker;", "", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "c", "b", "", "isShow", "a", "", "message", "", GoogleApiAvailabilityLight.a, "Lcom/huami/lib/rainbow/ListTile;", "npsView", "deviceSource", "trackNpsShow", "itemView", "trackNpsClick", "", "J", "lastClickNpsTime", "", LogUtil.I, "ignoreNpsShowTime", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NpsEventTracker {

    @NotNull
    public static final String EXTRA_REDDOT_KEY = "reddot";

    @NotNull
    public static final String EXTRA_REDDOT_VALUE_OFF = "off";

    @NotNull
    public static final String EXTRA_REDDOT_VALUE_ON = "on";

    @NotNull
    public static final String EXTRA_SOURCE_KEY = "source";

    @NotNull
    public static final String EXTRA_TP_KEY = "tp";

    @NotNull
    public static final String EXTRA_TP_VALUE = "nps";

    @NotNull
    public static final String MINE_NPS_C = "MINE_NPS_C";

    @NotNull
    public static final String MINE_NPS_V = "MINE_NPS_V";

    @NotNull
    public static final String TAG = "NpsEntranceShowTracker";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long lastClickNpsTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int ignoreNpsShowTime = 500;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    private final CountEventBuilder a(CountEventBuilder countEventBuilder, boolean z) {
        return countEventBuilder.addExtra(EXTRA_REDDOT_KEY, z ? "on" : "off");
    }

    private final CountEventBuilder b(CountEventBuilder countEventBuilder) {
        return countEventBuilder.addExtra("tp", "nps");
    }

    private final CountEventBuilder c(CountEventBuilder countEventBuilder) {
        countEventBuilder.setAnonymous(!HMLoginManager.isInChina());
        countEventBuilder.setIdentified(HMLoginManager.isInChina());
        return countEventBuilder;
    }

    private final void d(String message) {
        if (GlobalConfig.get().isBuildInner()) {
            HMLog.debug(TAG, new a(message));
        }
    }

    public final void trackNpsClick(@NotNull ListTile itemView, @NotNull String deviceSource) {
        this.lastClickNpsTime = System.currentTimeMillis();
        Analytics.recordEvent(a(c(b(new CountEventBuilder(MINE_NPS_C))), itemView.isIndicatorVisible()).addExtra("source", deviceSource));
        d("记录 NPS 点击：reddot=" + itemView.isIndicatorVisible());
    }

    public final void trackNpsShow(@Nullable ListTile npsView, @NotNull String deviceSource) {
        if (System.currentTimeMillis() - this.lastClickNpsTime > this.ignoreNpsShowTime && npsView != null && npsView.getVisibility() == 0) {
            boolean zIsIndicatorVisible = npsView.isIndicatorVisible();
            Analytics.recordEvent(a(c(b(new CountEventBuilder(MINE_NPS_V))), zIsIndicatorVisible).addExtra("source", deviceSource));
            d("记录 NPS 展示：reddot=" + zIsIndicatorVisible);
        }
    }
}
