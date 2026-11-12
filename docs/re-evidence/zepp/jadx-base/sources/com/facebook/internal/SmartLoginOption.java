package com.facebook.internal;

import com.huami.wallet.ui.utils.AnalyticConst;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "", "value", "J", "getValue", "()J", "<init>", "(Ljava/lang/String;IJ)V", "Companion", "None", AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_ENABLED, "RequireConfirm", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private final long value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final EnumSet<SmartLoginOption> ALL = EnumSet.allOf(SmartLoginOption.class);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/SmartLoginOption$Companion;", "", "", "bitmask", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "parseOptions", "ALL", "Ljava/util/EnumSet;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final EnumSet<SmartLoginOption> parseOptions(long bitmask) {
            EnumSet<SmartLoginOption> enumSetNoneOf = EnumSet.noneOf(SmartLoginOption.class);
            for (SmartLoginOption smartLoginOption : SmartLoginOption.ALL) {
                if ((smartLoginOption.getValue() & bitmask) != 0) {
                    enumSetNoneOf.add(smartLoginOption);
                }
            }
            return enumSetNoneOf;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    SmartLoginOption(long j) {
        this.value = j;
    }

    @JvmStatic
    @NotNull
    public static final EnumSet<SmartLoginOption> parseOptions(long j) {
        return INSTANCE.parseOptions(j);
    }

    public final long getValue() {
        return this.value;
    }
}
