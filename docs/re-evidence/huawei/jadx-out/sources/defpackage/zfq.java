package defpackage;

import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001'B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001cH\u0002J\u0019\u0010!\u001a\u00020\"2\n\u0010#\u001a\u00060$j\u0002`%H\u0002¢\u0006\u0002\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006("}, d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "epochSeconds", "", "nanosecondsOfSecond", "", "<init>", "(JI)V", "getEpochSeconds", "()J", "getNanosecondsOfSecond", "()I", "toEpochMilliseconds", "plus", "duration", "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "equals", "", "", WatchFaceConstant.HASHCODE, "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zfq implements Comparable<zfq>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f54061a;
    private final int e;
    public static final b d = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zfq f54060c = new zfq(-31557014167219200L, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zfq f54059b = new zfq(31556889864403199L, 999999999);

    public zfq(long j, int i) {
        this.f54061a = j;
        this.e = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant".toString());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF54061a() {
        return this.f54061a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(zfq zfqVar) {
        zcp.c(zfqVar, "");
        int iD = zcp.d(this.f54061a, zfqVar.f54061a);
        return iD != 0 ? iD : zcp.d(this.e, zfqVar.e);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zfq)) {
            return false;
        }
        zfq zfqVar = (zfq) other;
        return this.f54061a == zfqVar.f54061a && this.e == zfqVar.e;
    }

    public int hashCode() {
        return Long.hashCode(this.f54061a) + (this.e * 51);
    }

    public String toString() {
        return isDistantPast.e(this);
    }

    private final Object writeReplace() {
        return systemClock.c(this);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"Lkotlin/time/Instant$Companion;", "", "<init>", "()V", "now", "Lkotlin/time/Instant;", "fromEpochMilliseconds", "epochMilliseconds", "", "fromEpochSeconds", "epochSeconds", "nanosecondAdjustment", "", "parse", "input", "", "parseOrNull", "DISTANT_PAST", "getDISTANT_PAST", "()Lkotlin/time/Instant;", "DISTANT_FUTURE", "getDISTANT_FUTURE", "MIN", "getMIN$kotlin_stdlib", "MAX", "getMAX$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public final zfq c(long j) {
            long j2 = j / 1000;
            if ((j ^ 1000) < 0 && j2 * 1000 != j) {
                j2--;
            }
            long j3 = j % 1000;
            int i = (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * ((long) 1000000));
            if (j2 < -31557014167219200L) {
                return e();
            }
            if (j2 > 31556889864403199L) {
                return c();
            }
            return d(j2, i);
        }

        public final zfq a(long j, long j2) {
            long j3 = j2 / 1000000000;
            if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                j3--;
            }
            long j4 = j + j3;
            if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                return j > 0 ? zfq.d.c() : zfq.d.e();
            }
            if (j4 < -31557014167219200L) {
                return e();
            }
            if (j4 > 31556889864403199L) {
                return c();
            }
            long j5 = j2 % 1000000000;
            return new zfq(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
        }

        public final zfq d(long j, int i) {
            return a(j, i);
        }

        public final zfq e() {
            return zfq.f54060c;
        }

        public final zfq c() {
            return zfq.f54059b;
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }
}
