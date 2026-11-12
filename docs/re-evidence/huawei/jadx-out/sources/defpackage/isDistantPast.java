package defpackage;

import com.huawei.hms.framework.common.ExceptionCode;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: renamed from: zfs, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0003\u001a'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0015H\u0000\u001a\u0014\u0010'\u001a\u00020\u0015*\u00020\u00152\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010-\u001a\u00020\u0012*\u00020\u00102\u0006\u0010.\u001a\u00020\u0015H\u0002\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0006\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0015X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"isDistantPast", "", "Lkotlin/time/Instant;", "isDistantPast$annotations", "(Lkotlin/time/Instant;)V", "(Lkotlin/time/Instant;)Z", "isDistantFuture", "isDistantFuture$annotations", "DISTANT_PAST_SECONDS", "", "DISTANT_FUTURE_SECONDS", "MIN_SECOND", "MAX_SECOND", "parseIso", "Lkotlin/time/InstantParseResult;", "isoString", "", "formatIso", "", "instant", "DAYS_PER_CYCLE", "", "DAYS_0000_TO_1970", "safeAddOrElse", "a", "b", "action", "Lkotlin/Function0;", "", "safeMultiplyOrElse", "SECONDS_PER_HOUR", "SECONDS_PER_MINUTE", "HOURS_PER_DAY", "SECONDS_PER_DAY", "NANOS_PER_SECOND", "NANOS_PER_MILLI", "MILLIS_PER_SECOND", "isLeapYear", "year", "monthLength", "POWERS_OF_TEN", "", "asciiDigitPositionsInIsoStringAfterYear", "colonsInIsoOffsetString", "asciiDigitsInIsoOffsetString", "truncateForErrorMessage", "maxLength", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class isDistantPast {
    private static final int[] d = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f54062a = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] e = {3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f54063b = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(zfq zfqVar) throws IOException {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        zfx zfxVarB = zfx.f54064a.b(zfqVar);
        int i = zfxVarB.getJ();
        int i2 = 0;
        if (Math.abs(i) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i >= 0) {
                sb2.append(i + 10000);
                zcp.b((Object) sb2.deleteCharAt(0), "");
            } else {
                sb2.append(i - 10000);
                zcp.b((Object) sb2.deleteCharAt(1), "");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i >= 10000) {
                sb.append('+');
            }
            sb.append(i);
        }
        sb.append('-');
        StringBuilder sb3 = sb;
        b(sb3, sb, zfxVarB.getF54065b());
        sb.append('-');
        b(sb3, sb, zfxVarB.getF54066c());
        sb.append('T');
        b(sb3, sb, zfxVarB.getD());
        sb.append(':');
        b(sb3, sb, zfxVarB.getE());
        sb.append(':');
        b(sb3, sb, zfxVarB.getF());
        if (zfxVarB.getH() != 0) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            while (true) {
                int iA = zfxVarB.getH();
                iArr = d;
                int i3 = i2 + 1;
                if (iA % iArr[i3] != 0) {
                    break;
                }
                i2 = i3;
            }
            int i4 = i2 - (i2 % 3);
            String strValueOf = String.valueOf((zfxVarB.getH() / iArr[i4]) + iArr[9 - i4]);
            zcp.e(strValueOf, "");
            String strSubstring = strValueOf.substring(1);
            zcp.b((Object) strSubstring, "");
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }

    private static final void b(Appendable appendable, StringBuilder sb, int i) throws IOException {
        if (i < 10) {
            appendable.append('0');
        }
        sb.append(i);
    }
}
