package rb;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import fa.r;
import fa.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends rb.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f151504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f151505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f151506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f151507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f151508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f151509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f151510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f151511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f151512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f151513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f151514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f151515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f151516m;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    private d(Parcel parcel) {
        this.f151504a = parcel.readLong();
        this.f151505b = parcel.readByte() == 1;
        this.f151506c = parcel.readByte() == 1;
        this.f151507d = parcel.readByte() == 1;
        this.f151508e = parcel.readByte() == 1;
        this.f151509f = parcel.readLong();
        this.f151510g = parcel.readLong();
        int i14 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add(b.a(parcel));
        }
        this.f151511h = Collections.unmodifiableList(arrayList);
        this.f151512i = parcel.readByte() == 1;
        this.f151513j = parcel.readLong();
        this.f151514k = parcel.readInt();
        this.f151515l = parcel.readInt();
        this.f151516m = parcel.readInt();
    }

    public static d b(r rVar, long j8, w wVar) {
        List list;
        long j14;
        boolean z14;
        boolean z15;
        boolean z16;
        long j15;
        int i14;
        int i15;
        int iU;
        boolean z17;
        boolean z18;
        long jW;
        long jW2 = rVar.w();
        boolean z19 = (rVar.u() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        if (z19) {
            list = list2;
            j14 = C.TIME_UNSET;
            z14 = false;
            z15 = false;
            z16 = false;
            j15 = C.TIME_UNSET;
            i14 = 0;
            i15 = 0;
            iU = 0;
            z17 = false;
        } else {
            int iU2 = rVar.u();
            boolean z24 = (iU2 & 128) != 0;
            boolean z25 = (iU2 & 64) != 0;
            boolean z26 = (iU2 & 32) != 0;
            boolean z27 = (iU2 & 16) != 0;
            long jD = (!z25 || z27) ? C.TIME_UNSET : g.d(j8, rVar);
            if (!z25) {
                int iU3 = rVar.u();
                ArrayList arrayList = new ArrayList(iU3);
                for (int i16 = 0; i16 < iU3; i16++) {
                    int iU4 = rVar.u();
                    long jD2 = !z27 ? g.d(j8, rVar) : C.TIME_UNSET;
                    arrayList.add(new b(iU4, jD2, wVar.b(jD2), null));
                }
                list2 = arrayList;
            }
            if (z26) {
                long jU = rVar.u();
                boolean z28 = (128 & jU) != 0;
                jW = ((((jU & 1) << 32) | rVar.w()) * 1000) / 90;
                z18 = z28;
            } else {
                z18 = false;
                jW = C.TIME_UNSET;
            }
            int iA = rVar.A();
            int iU5 = rVar.u();
            i14 = iA;
            z14 = z27;
            z16 = z18;
            z15 = z24;
            long j16 = jD;
            iU = rVar.u();
            i15 = iU5;
            j14 = j16;
            list = list2;
            z17 = z25;
            j15 = jW;
        }
        return new d(jW2, z19, z15, z17, z14, j14, wVar.b(j14), list, z16, j15, i14, i15, iU);
    }

    @Override // rb.b
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb3.append(this.f151509f);
        sb3.append(", programSplicePlaybackPositionUs= ");
        return j.i(this.f151510g, " }", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f151504a);
        parcel.writeByte(this.f151505b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f151506c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f151507d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f151508e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f151509f);
        parcel.writeLong(this.f151510g);
        List<b> list = this.f151511h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            b bVar = list.get(i15);
            parcel.writeInt(bVar.f151517a);
            parcel.writeLong(bVar.f151518b);
            parcel.writeLong(bVar.f151519c);
        }
        parcel.writeByte(this.f151512i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f151513j);
        parcel.writeInt(this.f151514k);
        parcel.writeInt(this.f151515l);
        parcel.writeInt(this.f151516m);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f151517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f151518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f151519c;

        private b(int i14, long j8, long j14) {
            this.f151517a = i14;
            this.f151518b = j8;
            this.f151519c = j14;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public /* synthetic */ b(int i14, long j8, long j14, a aVar) {
            this(i14, j8, j14);
        }
    }

    private d(long j8, boolean z14, boolean z15, boolean z16, boolean z17, long j14, long j15, List<b> list, boolean z18, long j16, int i14, int i15, int i16) {
        this.f151504a = j8;
        this.f151505b = z14;
        this.f151506c = z15;
        this.f151507d = z16;
        this.f151508e = z17;
        this.f151509f = j14;
        this.f151510g = j15;
        this.f151511h = Collections.unmodifiableList(list);
        this.f151512i = z18;
        this.f151513j = j16;
        this.f151514k = i14;
        this.f151515l = i15;
        this.f151516m = i16;
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }
}
