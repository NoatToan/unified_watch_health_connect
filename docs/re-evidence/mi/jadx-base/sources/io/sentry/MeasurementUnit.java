package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface MeasurementUnit {

    public enum Duration implements MeasurementUnit {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // io.sentry.MeasurementUnit
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public enum Fraction implements MeasurementUnit {
        RATIO,
        PERCENT;

        @Override // io.sentry.MeasurementUnit
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public enum Information implements MeasurementUnit {
        BIT,
        BYTE,
        KILOBYTE,
        KIBIBYTE,
        MEGABYTE,
        MEBIBYTE,
        GIGABYTE,
        GIBIBYTE,
        TERABYTE,
        TEBIBYTE,
        PETABYTE,
        PEBIBYTE,
        EXABYTE,
        EXBIBYTE;

        @Override // io.sentry.MeasurementUnit
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    @ApiStatus.Internal
    @NotNull
    String apiName();
}
