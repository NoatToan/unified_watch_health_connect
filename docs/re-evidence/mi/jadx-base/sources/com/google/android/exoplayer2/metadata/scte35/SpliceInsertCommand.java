package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.okh;
import defpackage.rfp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8023b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List<b> h;
    public final boolean i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8024k;
    public final int l;
    public final int m;

    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8026b;
        public final long c;

        public /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f8025a);
            parcel.writeLong(this.f8026b);
            parcel.writeLong(this.c);
        }

        public b(int i, long j, long j2) {
            this.f8025a = i;
            this.f8026b = j;
            this.c = j2;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceInsertCommand a(okh okhVar, long j, rfp rfpVar) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int iJ;
        int iD;
        int iD2;
        boolean z4;
        boolean z5;
        long jF;
        long jF2 = okhVar.F();
        boolean z6 = (okhVar.D() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            iJ = 0;
            iD = 0;
            iD2 = 0;
            z4 = false;
        } else {
            int iD3 = okhVar.D();
            boolean z7 = (iD3 & 128) != 0;
            boolean z8 = (iD3 & 64) != 0;
            boolean z9 = (iD3 & 32) != 0;
            boolean z10 = (iD3 & 16) != 0;
            long jC = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.c(okhVar, j);
            if (!z8) {
                int iD4 = okhVar.D();
                ArrayList arrayList = new ArrayList(iD4);
                for (int i = 0; i < iD4; i++) {
                    int iD5 = okhVar.D();
                    long jC2 = !z10 ? TimeSignalCommand.c(okhVar, j) : -9223372036854775807L;
                    arrayList.add(new b(iD5, jC2, rfpVar.b(jC2), null));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long jD = okhVar.D();
                boolean z11 = (128 & jD) != 0;
                jF = ((((jD & 1) << 32) | okhVar.F()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jF = -9223372036854775807L;
            }
            iJ = okhVar.J();
            z4 = z8;
            iD = okhVar.D();
            iD2 = okhVar.D();
            list = listEmptyList;
            long j4 = jC;
            z3 = z5;
            j3 = jF;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new SpliceInsertCommand(jF2, z6, z, z4, z2, j2, rfpVar.b(j2), list, z3, j3, iJ, iD, iD2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8022a);
        parcel.writeByte(this.f8023b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.h.get(i2).b(parcel);
        }
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.f8024k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f8022a = j;
        this.f8023b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j4;
        this.f8024k = i;
        this.l = i2;
        this.m = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f8022a = parcel.readLong();
        this.f8023b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(b.a(parcel));
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.f8024k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }
}
