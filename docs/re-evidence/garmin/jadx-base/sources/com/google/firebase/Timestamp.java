package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import e23.l;
import java.time.Instant;
import java.util.Date;
import o13.p;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001#B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\nJ\b\u0010\u0014\u001a\u00020\rH\u0007J\u0011\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "seconds", "", "nanoseconds", "", "<init>", "(JI)V", "date", "Ljava/util/Date;", "(Ljava/util/Date;)V", "time", "Ljava/time/Instant;", "(Ljava/time/Instant;)V", "getSeconds", "()J", "getNanoseconds", "()I", "toDate", "toInstant", "compareTo", "other", "equals", "", "", "hashCode", "toString", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel source) {
            source.getClass();
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int size) {
            return new Timestamp[size];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public Timestamp(Date date) {
        date.getClass();
        Companion companion = INSTANCE;
        p preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.f128594a).longValue();
        int iIntValue = ((Number) preciseTime.f128595b).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    public static final Timestamp now() {
        return INSTANCE.now();
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp other) {
        other.getClass();
        l[] lVarArr = {new i0() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // p005kotlin.jvm.internal.i0, k23.n
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new i0() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // p005kotlin.jvm.internal.i0, k23.n
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        }};
        for (int i14 = 0; i14 < 2; i14++) {
            l lVar = lVarArr[i14];
            int iB = r13.a.b((Comparable) lVar.invoke(this), (Comparable) lVar.invoke(other));
            if (iB != 0) {
                return iB;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Timestamp) && compareTo((Timestamp) other) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j8 = this.seconds;
        return (((((int) j8) * 1369) + ((int) (j8 >> 32))) * 37) + this.nanoseconds;
    }

    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / 1000000)));
    }

    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        instantOfEpochSecond.getClass();
        return instantOfEpochSecond;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Timestamp(seconds=");
        sb3.append(this.seconds);
        sb3.append(", nanoseconds=");
        return e0.j(sb3, this.nanoseconds, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "<init>", "()V", "Ljava/util/Date;", "Lo13/p;", "", "", "toPreciseTime", "(Ljava/util/Date;)Lo13/p;", "seconds", "nanoseconds", "", "validateRange", "(JI)V", "Lcom/google/firebase/Timestamp;", "now", "()Lcom/google/firebase/Timestamp;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final p<Long, Integer> toPreciseTime(Date date) {
            long j8 = 1000;
            long time = date.getTime() / j8;
            int time2 = (int) ((date.getTime() % j8) * ((long) 1000000));
            return time2 < 0 ? new p<>(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new p<>(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long seconds, int nanoseconds) {
            if (nanoseconds < 0 || nanoseconds >= 1000000000) {
                h.x(am.j.h(nanoseconds, "Timestamp nanoseconds out of range: "));
            } else if (-62135596800L > seconds || seconds >= 253402300800L) {
                h.x(e.e(seconds, "Timestamp seconds out of range: "));
            }
        }

        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    public Timestamp(long j8, int i14) {
        INSTANCE.validateRange(j8, i14);
        this.seconds = j8;
        this.nanoseconds = i14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Timestamp(Instant instant) {
        this(instant.getEpochSecond(), instant.getNano());
        instant.getClass();
    }
}
