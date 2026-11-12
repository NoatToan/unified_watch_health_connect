package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.okh;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8021b;
    public final byte[] c;

    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static PrivateCommand a(okh okhVar, int i, long j) {
        long jF = okhVar.F();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        okhVar.j(bArr, 0, i2);
        return new PrivateCommand(jF, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8020a);
        parcel.writeLong(this.f8021b);
        parcel.writeByteArray(this.c);
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f8020a = j2;
        this.f8021b = j;
        this.c = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f8020a = parcel.readLong();
        this.f8021b = parcel.readLong();
        this.c = (byte[]) wlq.j(parcel.createByteArray());
    }
}
