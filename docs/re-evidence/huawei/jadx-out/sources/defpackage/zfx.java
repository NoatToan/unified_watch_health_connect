package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.network.embedded.g4;
import com.huawei.hms.network.embedded.k;
import kotlin.Metadata;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJW\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u000326\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u0002H\u00150\u0018H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "year", "", "month", "day", "hour", "minute", "second", "nanosecond", "<init>", "(IIIIIII)V", "getYear", "()I", "getMonth", "getDay", "getHour", "getMinute", "getSecond", "getNanosecond", "toInstant", ExifInterface.GPS_DIRECTION_TRUE, "offsetSeconds", "buildInstant", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "epochSeconds", "nanosecondOfSecond", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f54064a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54066c;
    private final int d;
    private final int e;
    private final int f;
    private final int h;
    private final int j;

    public zfx(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.j = i;
        this.f54065b = i2;
        this.f54066c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.h = i7;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getJ() {
        return this.j;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF54065b() {
        return this.f54065b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF54066c() {
        return this.f54066c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getH() {
        return this.h;
    }

    public String toString() {
        return "UnboundLocalDateTime(" + this.j + '-' + this.f54065b + '-' + this.f54066c + ' ' + this.d + ':' + this.e + ':' + this.f + FilenameUtils.EXTENSION_SEPARATOR + this.h + g4.l;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "<init>", "()V", "fromInstant", "Lkotlin/time/UnboundLocalDateTime;", "instant", "Lkotlin/time/Instant;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        private c() {
        }

        public final zfx b(zfq zfqVar) {
            long j;
            zcp.c(zfqVar, "");
            long f54061a = zfqVar.getF54061a();
            long j2 = f54061a / k.b.m;
            if ((f54061a ^ k.b.m) < 0 && j2 * k.b.m != f54061a) {
                j2--;
            }
            long j3 = f54061a % k.b.m;
            int i = (int) (j3 + (k.b.m & (((j3 ^ k.b.m) & ((-j3) | j3)) >> 63)));
            long j4 = (j2 + ((long) 719528)) - ((long) 60);
            if (j4 < 0) {
                long j5 = 146097;
                long j6 = ((j4 + 1) / j5) - 1;
                j = ((long) 400) * j6;
                j4 += (-j6) * j5;
            } else {
                j = 0;
            }
            long j7 = 400;
            long j8 = ((j7 * j4) + ((long) 591)) / ((long) 146097);
            long j9 = 365;
            long j10 = 4;
            long j11 = 100;
            long j12 = j4 - ((((j9 * j8) + (j8 / j10)) - (j8 / j11)) + (j8 / j7));
            if (j12 < 0) {
                j8--;
                j12 = j4 - ((((j9 * j8) + (j8 / j10)) - (j8 / j11)) + (j8 / j7));
            }
            int i2 = (int) j12;
            int i3 = ((i2 * 5) + 2) / 153;
            int i4 = i / 3600;
            int i5 = i - (i4 * 3600);
            int i6 = i5 / 60;
            return new zfx((int) (j8 + j + ((long) (i3 / 10))), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1, i4, i6, i5 - (i6 * 60), zfqVar.getE());
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }
}
