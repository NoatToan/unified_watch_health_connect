package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import aq.r3;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB/\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/p0;", "dataList", "", "hasAValidValue", "hasAValidPowerValue", "", "highestValue", "<init>", "(Ljava/util/List;ZZD)V", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends l implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p0> f29637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f29640d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<q0> {
        @Override // android.os.Parcelable.Creator
        public final q0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (true) {
                if (iA == i14) {
                    break;
                }
                iA = kg.f.a(p0.CREATOR, parcel, arrayList, iA, 1);
            }
            return new q0(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readDouble(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final q0[] newArray(int i14) {
            return new q0[i14];
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29641a;

        static {
            int[] iArr = new int[fz.c.values().length];
            try {
                iArr[fz.c.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fz.c.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29641a = iArr;
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public q0() {
        this(new ArrayList(), false, false, 0.0d);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.newmodel.l
    public final List<Entry> d(zm.p pVar, fz.c cVar) {
        double d14;
        pVar.getClass();
        cVar.getClass();
        List<p0> list = this.f29637a;
        if (list.isEmpty() || pVar.P(0).isEmpty()) {
            return p13.j0.f134944a;
        }
        int iG1 = pVar.g1();
        ArrayList arrayList = new ArrayList();
        List<o20.a> listP = pVar.P(0);
        int size = 0;
        double d15 = 0.0d;
        for (p0 p0Var : list) {
            int i14 = c.f29641a[cVar.ordinal()];
            if (i14 == 1) {
                d14 = p0Var.f29631a;
            } else {
                if (i14 != 2) {
                    u0.r();
                    return null;
                }
                d14 = p0Var.f29632b;
            }
            double d16 = d14 + d15;
            ArrayList arrayListB = l.b(pVar.P(0), size, d16, p0Var.f29633c);
            arrayList.addAll(arrayListB);
            size += arrayListB.size();
            d15 = d16;
        }
        boolean zB = gl1.y.B(iG1);
        if (d15 < ((o20.a) com.airbnb.lottie.animation.keyframe.a.c(1, listP)).C()) {
            arrayList.addAll(l.b(listP, size, ((o20.a) com.airbnb.lottie.animation.keyframe.a.c(1, listP)).C(), zB ? 1000000.0d : 0.0d));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.newmodel.l
    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getF29638b() {
        return this.f29638b;
    }

    public final void g(p0 p0Var, r3 r3Var) {
        this.f29637a.add(p0Var);
        double d14 = p0Var.f29633c;
        if (d14 > 0.0d && d14 != 1000000.0d) {
            this.f29638b = true;
            if (d14 != 1000000.0d && d14 > this.f29640d) {
                this.f29640d = d14;
            }
        }
        if (d14 > 0.0d) {
            if (r3Var == r3.POWER || r3Var == r3.POWER_PER_KG || r3Var == r3.SPLIT_AVG_POWER || r3Var == r3.SPLIT_AVG_POWER_PER_KG) {
                this.f29639c = true;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f29637a, parcel);
        while (itE.hasNext()) {
            ((p0) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f29638b ? 1 : 0);
        parcel.writeInt(this.f29639c ? 1 : 0);
        parcel.writeDouble(this.f29640d);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0$a;", "", "<init>", "()V", "", "TARGET_TYPE_TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private q0(List<p0> list, boolean z14, boolean z15, double d14) {
        this.f29637a = list;
        this.f29638b = z14;
        this.f29639c = z15;
        this.f29640d = d14;
    }

    public /* synthetic */ q0(List list, boolean z14, boolean z15, double d14, p005kotlin.jvm.internal.j jVar) {
        this(list, z14, z15, d14);
    }
}
