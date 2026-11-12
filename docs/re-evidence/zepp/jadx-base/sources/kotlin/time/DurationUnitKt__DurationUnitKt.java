package kotlin.time;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            iArr[DurationUnit.SECONDS.ordinal()] = 4;
            iArr[DurationUnit.MINUTES.ordinal()] = 5;
            iArr[DurationUnit.HOURS.ordinal()] = 6;
            iArr[DurationUnit.DAYS.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final DurationUnit durationUnitByIsoChar(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return DurationUnit.DAYS;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid or unsupported duration ISO non-time unit: ", Character.valueOf(c)));
        }
        if (c == 'H') {
            return DurationUnit.HOURS;
        }
        if (c == 'M') {
            return DurationUnit.MINUTES;
        }
        if (c == 'S') {
            return DurationUnit.SECONDS;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid duration ISO time unit: ", Character.valueOf(c)));
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final DurationUnit durationUnitByShortName(@NotNull String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && str.equals(Configs.Params.US)) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (str.equals(SOAP.XMLNS)) {
                        return DurationUnit.SECONDS;
                    }
                } else if (str.equals("m")) {
                    return DurationUnit.MINUTES;
                }
            } else if (str.equals("h")) {
                return DurationUnit.HOURS;
            }
        } else if (str.equals(GoogleApiAvailabilityLight.a)) {
            return DurationUnit.DAYS;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown duration unit short name: ", str));
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final String shortName(@NotNull DurationUnit durationUnit) {
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return Configs.Params.US;
            case 3:
                return "ms";
            case 4:
                return SOAP.XMLNS;
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return GoogleApiAvailabilityLight.a;
            default:
                throw new IllegalStateException(Intrinsics.stringPlus("Unknown unit: ", durationUnit).toString());
        }
    }
}
