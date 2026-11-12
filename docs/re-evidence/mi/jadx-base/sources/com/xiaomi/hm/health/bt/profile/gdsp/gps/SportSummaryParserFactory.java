package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SportSummary800Parser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummaryParserFactory;", "", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SportSummaryParserFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummaryParserFactory$Companion;", "", "()V", "createSummaryParser", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/ISportSummaryDataParser;", "isTimex", "", "version", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ISportSummaryDataParser createSummaryParser(boolean isTimex, int version) {
            if (isTimex) {
                return new TimexSummaryParser(version);
            }
            if (version == 516) {
                return new SportSummary204DataParser(version);
            }
            if (version == 32768) {
                return new SportSummary800Parser(version);
            }
            if (version != 519) {
                return version != 520 ? new SportSummaryDataParser(version) : new SportSummary208DataParser(version);
            }
            return new SportSummary207DataParser(version);
        }
    }
}
