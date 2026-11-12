package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.time.DurationUnit;
import okhttp3.internal.http2.Http2Connection;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", TtmlNode.TAG_DIV, "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", WatchFaceConstant.HASHCODE, "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
public final class zfm implements Comparable<zfm> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54057c;
    public static final b d = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f54056b = e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f54055a = toDuration.g(4611686018427387903L);
    private static final long e = toDuration.g(-4611686018427387903L);

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final boolean o(long j) {
        return j < 0;
    }

    public static final boolean r(long j) {
        return j > 0;
    }

    private static final boolean u(long j) {
        return (((int) j) & 1) == 0;
    }

    private static final boolean w(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final long x(long j) {
        return j >> 1;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(zfm zfmVar) {
        return t(zfmVar.getF54057c());
    }

    private static final DurationUnit p(long j) {
        return u(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long e(long j) {
        if (!durationAssertionsEnabled.b()) {
            return j;
        }
        if (u(j)) {
            long jX = x(j);
            if (-4611686018426999999L <= jX && jX < 4611686018427000000L) {
                return j;
            }
            throw new AssertionError(x(j) + " ns is out of nanoseconds range");
        }
        long jX2 = x(j);
        if (-4611686018427387903L > jX2 || jX2 >= 4611686018427387904L) {
            throw new AssertionError(x(j) + " ms is out of milliseconds range");
        }
        long jX3 = x(j);
        if (-4611686018426L > jX3 || jX3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(x(j) + " ms is denormalized");
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", RequestOptions.AD_CONTENT_CLASSIFICATION_J, "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public final long c() {
            return zfm.f54056b;
        }

        public final long b() {
            return zfm.f54055a;
        }

        public final long a() {
            return zfm.e;
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }

    public static final long s(long j) {
        return toDuration.b(-x(j), ((int) j) & 1);
    }

    public static final long e(long j, long j2) {
        if (l(j)) {
            if (n(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (l(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long jX = x(j) + x(j2);
            return u(j) ? toDuration.j(jX) : toDuration.h(jX);
        }
        if (w(j)) {
            return c(j, x(j), x(j2));
        }
        return c(j, x(j2), x(j));
    }

    private static final long c(long j, long j2, long j3) {
        long jO = toDuration.o(j3);
        long j4 = j2 + jO;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return toDuration.g(zdm.a(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return toDuration.i(toDuration.l(j4) + (j3 - toDuration.l(jO)));
    }

    public static final long d(long j, long j2) {
        return e(j, s(j2));
    }

    public static final long c(long j, int i) {
        if (l(j)) {
            if (i != 0) {
                return i > 0 ? j : s(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return f54056b;
        }
        long jX = x(j);
        long j2 = i;
        long j3 = jX * j2;
        if (!u(j)) {
            if (j3 / j2 == jX) {
                return toDuration.g(zdm.c(j3, new zdj(-4611686018427387903L, 4611686018427387903L)));
            }
            return zcz.e(jX) * zcz.a(i) > 0 ? f54055a : e;
        }
        if (-2147483647L <= jX && jX < 2147483648L) {
            return toDuration.i(j3);
        }
        if (j3 / j2 == jX) {
            return toDuration.j(j3);
        }
        long jO = toDuration.o(jX);
        long j4 = jO * j2;
        long jO2 = toDuration.o((jX - toDuration.l(jO)) * j2) + j4;
        if (j4 / j2 != jO || (jO2 ^ j4) < 0) {
            return zcz.e(jX) * zcz.a(i) > 0 ? f54055a : e;
        }
        return toDuration.g(zdm.c(jO2, new zdj(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final long a(long j, int i) {
        if (i == 0) {
            if (r(j)) {
                return f54055a;
            }
            if (o(j)) {
                return e;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (u(j)) {
            return toDuration.i(x(j) / ((long) i));
        }
        if (l(j)) {
            return c(j, zcz.a(i));
        }
        long j2 = i;
        long jX = x(j) / j2;
        if (-4611686018426L > jX || jX >= 4611686018427L) {
            return toDuration.g(jX);
        }
        return toDuration.i(toDuration.l(jX) + (toDuration.l(x(j) - (jX * j2)) / j2));
    }

    public static final long c(long j, DurationUnit durationUnit) {
        zcp.c(durationUnit, "");
        DurationUnit durationUnitP = p(j);
        if (durationUnit.compareTo(durationUnitP) <= 0 || l(j)) {
            return j;
        }
        return toDuration.b(x(j) - (x(j) % zfk.a(1L, durationUnit, durationUnitP)), durationUnitP);
    }

    public static final boolean l(long j) {
        return j == f54055a || j == e;
    }

    public static final boolean n(long j) {
        return !l(j);
    }

    public static final long a(long j) {
        return o(j) ? s(j) : j;
    }

    public int t(long j) {
        return c(this.f54057c, j);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return zcp.d(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return o(j) ? -i : i;
    }

    public static final int b(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) (c(j) % ((long) 24));
    }

    public static final int h(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) (j(j) % ((long) 60));
    }

    public static final int k(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) (i(j) % ((long) 60));
    }

    public static final int g(long j) {
        long jX;
        if (l(j)) {
            return 0;
        }
        if (w(j)) {
            jX = toDuration.l(x(j) % ((long) 1000));
        } else {
            jX = x(j) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        }
        return (int) jX;
    }

    public static final long d(long j, DurationUnit durationUnit) {
        zcp.c(durationUnit, "");
        if (j == f54055a) {
            return Long.MAX_VALUE;
        }
        if (j == e) {
            return Long.MIN_VALUE;
        }
        return zfk.a(x(j), p(j), durationUnit);
    }

    public static final long d(long j) {
        return d(j, DurationUnit.DAYS);
    }

    public static final long c(long j) {
        return d(j, DurationUnit.HOURS);
    }

    public static final long j(long j) {
        return d(j, DurationUnit.MINUTES);
    }

    public static final long i(long j) {
        return d(j, DurationUnit.SECONDS);
    }

    public static final long f(long j) {
        long jX = x(j);
        if (u(j)) {
            return jX;
        }
        if (jX > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jX < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return toDuration.l(jX);
    }

    public String toString() {
        return q(this.f54057c);
    }

    public static String q(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f54055a) {
            return "Infinity";
        }
        if (j == e) {
            return "-Infinity";
        }
        boolean zO = o(j);
        StringBuilder sb = new StringBuilder();
        if (zO) {
            sb.append('-');
        }
        long jA = a(j);
        long jD = d(jA);
        int iB = b(jA);
        int iH = h(jA);
        int iK = k(jA);
        int iG = g(jA);
        int i = 0;
        boolean z = jD != 0;
        boolean z2 = iB != 0;
        boolean z3 = iH != 0;
        boolean z4 = (iK == 0 && iG == 0) ? false : true;
        if (z) {
            sb.append(jD);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iB);
            sb.append('h');
            i++;
        }
        if (z3 || (z4 && (z2 || z))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('m');
            i++;
        }
        if (z4) {
            if (i > 0) {
                sb.append(' ');
            }
            if (iK != 0 || z || z2 || z3) {
                e(j, sb, iK, iG, 9, "s", false);
            } else if (iG >= 1000000) {
                e(j, sb, iG / 1000000, iG % 1000000, 6, "ms", false);
            } else if (iG >= 1000) {
                e(j, sb, iG / 1000, iG % 1000, 3, "us", false);
            } else {
                sb.append(iG);
                sb.append("ns");
            }
            i++;
        }
        if (zO && i > 1) {
            sb.insert(1, g4.k).append(g4.l);
        }
        return sb.toString();
    }

    private static final void e(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            String strE = zes.e(String.valueOf(i2), i3, '0');
            int length = strE.length() - 1;
            if (length < 0) {
                length = -1;
                break;
            }
            while (true) {
                int i4 = length - 1;
                if (strE.charAt(length) != '0') {
                    break;
                }
                if (i4 < 0) {
                    length = -1;
                    break;
                }
                length = i4;
            }
            int i5 = length + 1;
            if (!z && i5 < 3) {
                sb.append((CharSequence) strE, 0, i5);
                zcp.b((Object) sb, "");
            } else {
                sb.append((CharSequence) strE, 0, ((length + 3) / 3) * 3);
                zcp.b((Object) sb, "");
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final /* synthetic */ long getF54057c() {
        return this.f54057c;
    }

    public int hashCode() {
        return m(this.f54057c);
    }

    public boolean equals(Object other) {
        return d(this.f54057c, other);
    }

    public static int m(long j) {
        return Long.hashCode(j);
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof zfm) && j == ((zfm) obj).getF54057c();
    }
}
