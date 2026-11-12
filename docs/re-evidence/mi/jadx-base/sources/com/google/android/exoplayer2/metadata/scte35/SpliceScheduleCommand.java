package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.okh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f8027a;

    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8029b;

        public /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f8028a);
            parcel.writeLong(this.f8029b);
        }

        public b(int i, long j) {
            this.f8028a = i;
            this.f8029b = j;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceScheduleCommand a(okh okhVar) {
        int iD = okhVar.D();
        ArrayList arrayList = new ArrayList(iD);
        for (int i = 0; i < iD; i++) {
            arrayList.add(c.e(okhVar));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f8027a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f8027a.get(i2).f(parcel);
        }
    }

    public SpliceScheduleCommand(List<c> list) {
        this.f8027a = Collections.unmodifiableList(list);
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(c.d(parcel));
        }
        this.f8027a = Collections.unmodifiableList(arrayList);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8031b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f8032k;

        public c(long j, boolean z, boolean z2, boolean z3, List<b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f8030a = j;
            this.f8031b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.f8032k = i3;
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(okh okhVar) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int iD;
            boolean z3;
            boolean z4;
            long jF;
            long jF2 = okhVar.F();
            boolean z5 = (okhVar.D() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                iD = 0;
                z3 = false;
            } else {
                int iD2 = okhVar.D();
                boolean z6 = (iD2 & 128) != 0;
                boolean z7 = (iD2 & 64) != 0;
                boolean z8 = (iD2 & 32) != 0;
                long jF3 = z7 ? okhVar.F() : -9223372036854775807L;
                if (!z7) {
                    int iD3 = okhVar.D();
                    ArrayList arrayList3 = new ArrayList(iD3);
                    for (int i3 = 0; i3 < iD3; i3++) {
                        arrayList3.add(new b(okhVar.D(), okhVar.F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jD = okhVar.D();
                    boolean z9 = (128 & jD) != 0;
                    jF = ((((jD & 1) << 32) | okhVar.F()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jF = -9223372036854775807L;
                }
                int iJ = okhVar.J();
                int iD4 = okhVar.D();
                z3 = z7;
                iD = okhVar.D();
                j2 = jF;
                arrayList = arrayList2;
                long j3 = jF3;
                i = iJ;
                i2 = iD4;
                j = j3;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new c(jF2, z5, z, z3, arrayList, j, z2, j2, i, i2, iD);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f8030a);
            parcel.writeByte(this.f8031b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f.get(i).d(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.f8032k);
        }

        public c(Parcel parcel) {
            this.f8030a = parcel.readLong();
            this.f8031b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(b.c(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.f8032k = parcel.readInt();
        }
    }
}
