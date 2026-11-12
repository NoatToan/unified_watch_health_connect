package rb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import fa.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends rb.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f151520a;

    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    private f(Parcel parcel) {
        int i14 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add(c.a(parcel));
        }
        this.f151520a = Collections.unmodifiableList(arrayList);
    }

    public static f b(r rVar) {
        int iU = rVar.u();
        ArrayList arrayList = new ArrayList(iU);
        for (int i14 = 0; i14 < iU; i14++) {
            arrayList.add(c.b(rVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        List<c> list = this.f151520a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            c cVar = list.get(i15);
            parcel.writeLong(cVar.f151523a);
            parcel.writeByte(cVar.f151524b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f151525c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f151526d ? (byte) 1 : (byte) 0);
            List<b> list2 = cVar.f151528f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i16 = 0; i16 < size2; i16++) {
                b bVar = list2.get(i16);
                parcel.writeInt(bVar.f151521a);
                parcel.writeLong(bVar.f151522b);
            }
            parcel.writeLong(cVar.f151527e);
            parcel.writeByte(cVar.f151529g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f151530h);
            parcel.writeInt(cVar.f151531i);
            parcel.writeInt(cVar.f151532j);
            parcel.writeInt(cVar.f151533k);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f151521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f151522b;

        private b(int i14, long j8) {
            this.f151521a = i14;
            this.f151522b = j8;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public /* synthetic */ b(int i14, long j8, a aVar) {
            this(i14, j8);
        }
    }

    private f(List<c> list) {
        this.f151520a = Collections.unmodifiableList(list);
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f151523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f151524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f151525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f151526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f151527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f151528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f151529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f151530h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f151531i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f151532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f151533k;

        private c(Parcel parcel) {
            this.f151523a = parcel.readLong();
            this.f151524b = parcel.readByte() == 1;
            this.f151525c = parcel.readByte() == 1;
            this.f151526d = parcel.readByte() == 1;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList.add(b.a(parcel));
            }
            this.f151528f = Collections.unmodifiableList(arrayList);
            this.f151527e = parcel.readLong();
            this.f151529g = parcel.readByte() == 1;
            this.f151530h = parcel.readLong();
            this.f151531i = parcel.readInt();
            this.f151532j = parcel.readInt();
            this.f151533k = parcel.readInt();
        }

        public static c a(Parcel parcel) {
            return new c(parcel);
        }

        public static c b(r rVar) {
            ArrayList arrayList;
            boolean z14;
            boolean z15;
            long j8;
            boolean z16;
            long j14;
            int i14;
            int i15;
            int iU;
            boolean z17;
            long jW;
            long jW2 = rVar.w();
            boolean z18 = true;
            if ((rVar.u() & 128) == 0) {
                z18 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z18) {
                arrayList = arrayList2;
                z14 = false;
                z15 = false;
                j8 = C.TIME_UNSET;
                z16 = false;
                j14 = C.TIME_UNSET;
                i14 = 0;
                i15 = 0;
                iU = 0;
            } else {
                int iU2 = rVar.u();
                boolean z19 = (iU2 & 128) != 0;
                boolean z24 = (iU2 & 64) != 0 ? z18 : false;
                boolean z25 = (iU2 & 32) != 0 ? z18 : false;
                long jW3 = z24 ? rVar.w() : C.TIME_UNSET;
                if (!z24) {
                    int iU3 = rVar.u();
                    ArrayList arrayList3 = new ArrayList(iU3);
                    int i16 = 0;
                    while (i16 < iU3) {
                        arrayList3.add(new b(rVar.u(), rVar.w(), null));
                        i16++;
                        iU3 = iU3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z25) {
                    long jU = rVar.u();
                    boolean z26 = (128 & jU) != 0;
                    jW = ((((jU & 1) << 32) | rVar.w()) * 1000) / 90;
                    z17 = z26;
                } else {
                    z17 = false;
                    jW = C.TIME_UNSET;
                }
                int iA = rVar.A();
                int iU4 = rVar.u();
                boolean z27 = z19;
                z16 = z17;
                z14 = z27;
                iU = rVar.u();
                long j15 = jW3;
                i14 = iA;
                i15 = iU4;
                long j16 = jW;
                arrayList = arrayList2;
                z15 = z24;
                j8 = j15;
                j14 = j16;
            }
            return new c(jW2, z18, z14, z15, arrayList, j8, z16, j14, i14, i15, iU);
        }

        private c(long j8, boolean z14, boolean z15, boolean z16, List<b> list, long j14, boolean z17, long j15, int i14, int i15, int i16) {
            this.f151523a = j8;
            this.f151524b = z14;
            this.f151525c = z15;
            this.f151526d = z16;
            this.f151528f = Collections.unmodifiableList(list);
            this.f151527e = j14;
            this.f151529g = z17;
            this.f151530h = j15;
            this.f151531i = i14;
            this.f151532j = i15;
            this.f151533k = i16;
        }
    }
}
