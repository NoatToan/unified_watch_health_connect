package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new Parcelable.Creator<Timer>() { // from class: com.google.firebase.perf.util.Timer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timer[] newArray(int i14) {
            return new Timer[i14];
        }
    };
    private long elapsedRealtimeMicros;
    private long wallClockMicros;

    public Timer() {
        this(wallClockMicros(), elapsedRealtimeMicros());
    }

    private static long elapsedRealtimeMicros() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public static Timer ofElapsedRealtime(long j8) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j8);
        return new Timer((micros - elapsedRealtimeMicros()) + wallClockMicros(), micros);
    }

    private static long wallClockMicros() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrentTimestampMicros() {
        return getDurationMicros() + this.wallClockMicros;
    }

    public long getDurationMicros() {
        return getDurationMicros(new Timer());
    }

    public long getMicros() {
        return this.wallClockMicros;
    }

    public void reset() {
        this.wallClockMicros = wallClockMicros();
        this.elapsedRealtimeMicros = elapsedRealtimeMicros();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.wallClockMicros);
        parcel.writeLong(this.elapsedRealtimeMicros);
    }

    public long getDurationMicros(Timer timer) {
        return timer.elapsedRealtimeMicros - this.elapsedRealtimeMicros;
    }

    public Timer(long j8, long j14) {
        this.wallClockMicros = j8;
        this.elapsedRealtimeMicros = j14;
    }

    public Timer(long j8) {
        this(j8, j8);
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
