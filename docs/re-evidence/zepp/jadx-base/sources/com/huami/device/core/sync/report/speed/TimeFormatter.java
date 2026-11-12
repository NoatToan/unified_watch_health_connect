package com.huami.device.core.sync.report.speed;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/device/core/sync/report/speed/TimeFormatter;", "", "Ljava/util/Date;", GoogleApiAvailabilityLight.a, "", "toUTCTimeStr", "Ljava/text/SimpleDateFormat;", "formatter$delegate", "Lkotlin/Lazy;", "getFormatter", "()Ljava/text/SimpleDateFormat;", "formatter", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class TimeFormatter {

    @NotNull
    public static final TimeFormatter INSTANCE = new TimeFormatter();

    /* JADX INFO: renamed from: formatter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy formatter = LazyKt__LazyJVMKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.huami.device.core.sync.report.speed.TimeFormatter$formatter$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_ISO8601, Locale.CHINESE);
        }
    });

    private TimeFormatter() {
    }

    private final SimpleDateFormat getFormatter() {
        return (SimpleDateFormat) formatter.getValue();
    }

    @NotNull
    public final String toUTCTimeStr(@NotNull Date d) {
        try {
            return getFormatter().format(d);
        } catch (Exception unused) {
            return "";
        }
    }
}
