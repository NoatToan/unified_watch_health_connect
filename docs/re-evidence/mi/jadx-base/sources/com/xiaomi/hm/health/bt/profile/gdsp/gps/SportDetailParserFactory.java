package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportDetail800DataParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetailParserFactory;", "", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SportDetailParserFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetailParserFactory$Companion;", "", "()V", "create", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportDetailDataParser;", "summary", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "isTimeX", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ISportDetailDataParser create(@NotNull SportSummary summary, boolean isTimeX) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            if (summary.getVersion() == 32768) {
                return new SportDetail800DataParser(summary);
            }
            if (summary.getVersion() == 258) {
                return new SportDetailParser102(summary);
            }
            if (summary.getVersion() == 517) {
                return new SportDetailParer205(summary);
            }
            if (summary.getVersion() != 518 && summary.getVersion() != 519 && summary.getVersion() != 520) {
                return summary.getVersion() >= 259 ? new SportDetailParserNew(summary, isTimeX) : new IdleDetailParser();
            }
            return new SportDetailParer206(summary);
        }
    }
}
