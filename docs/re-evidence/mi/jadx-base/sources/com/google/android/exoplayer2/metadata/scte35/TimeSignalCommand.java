package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.okh;
import defpackage.rfp;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8034b;

    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, a aVar) {
        this(j, j2);
    }

    public static TimeSignalCommand a(okh okhVar, long j, rfp rfpVar) {
        long jC = c(okhVar, j);
        return new TimeSignalCommand(jC, rfpVar.b(jC));
    }

    public static long c(okh okhVar, long j) {
        long jD = okhVar.D();
        if ((128 & jD) != 0) {
            return 8589934591L & ((((jD & 1) << 32) | okhVar.F()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8033a);
        parcel.writeLong(this.f8034b);
    }

    public TimeSignalCommand(long j, long j2) {
        this.f8033a = j;
        this.f8034b = j2;
    }
}
