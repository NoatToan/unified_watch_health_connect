package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportDetail800DataParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetailParserFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailParserFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetailParserFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "summary", "", "isTimeX", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportDetailDataParser;", "create", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ISportDetailDataParser create(@NotNull SportSummary summary, boolean isTimeX) {
            if (summary.getVersion() == 32768) {
                return new SportDetail800DataParser(summary);
            }
            if (summary.getVersion() == 258) {
                return new SportDetailParser102(summary);
            }
            if (summary.getVersion() == 517) {
                return new SportDetailParer205(summary);
            }
            if (summary.getVersion() == 518) {
                return new SportDetailParer206(summary);
            }
            if (summary.getVersion() == 519) {
                return new SportDetailParer206(summary);
            }
            return summary.getVersion() >= 259 ? new SportDetailParserNew(summary, isTimeX) : new IdleDetailParser();
        }
    }
}
