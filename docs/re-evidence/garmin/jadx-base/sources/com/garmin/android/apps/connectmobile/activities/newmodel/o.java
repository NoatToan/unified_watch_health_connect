package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface o extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/o$a;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/o;", "", "leftPlatformCenterOffset", "rightPlatformCenterOffset", "<init>", "(DD)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements o {
        public static final Parcelable.Creator<a> CREATOR = new C0455a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f29602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f29603b;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.newmodel.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0455a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new a(parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        public a(double d14, double d15) {
            this.f29602a = d14;
            this.f29603b = d15;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f29602a, aVar.f29602a) == 0 && Double.compare(this.f29603b, aVar.f29603b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f29603b) + (Double.hashCode(this.f29602a) * 31);
        }

        public final String toString() {
            return c22.t.d(this.f29603b, ")", com.airbnb.lottie.parser.moshi.a.a("PlatformCenterOffset(leftPlatformCenterOffset=", this.f29602a, ", rightPlatformCenterOffset="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeDouble(this.f29602a);
            parcel.writeDouble(this.f29603b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/o$b;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/o;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29604a = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return b.f29604a;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        private b() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 439161820;
        }

        public final String toString() {
            return "Position";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/o$c;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/o;", "", "leftPowerPhaseStart", "leftPowerPhaseEnd", "leftPowerPhaseArcLength", "leftPowerPhasePeakArcLength", "leftPowerPhasePeakStart", "leftPowerPhasePeakEnd", "rightPowerPhaseStart", "rightPowerPhaseEnd", "rightPowerPhaseArcLength", "rightPowerPhasePeakArcLength", "rightPowerPhasePeakStart", "rightPowerPhasePeakEnd", "leftBalance", "rightBalance", "<init>", "(DDDDDDDDDDDDDD)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements o {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f29605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f29606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f29607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f29608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f29609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f29610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final double f29611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final double f29612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final double f29613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final double f29614j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final double f29615k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final double f29616l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final double f29617m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final double f29618n;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public c(double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, double d28, double d29, double d34, double d35) {
            this.f29605a = d14;
            this.f29606b = d15;
            this.f29607c = d16;
            this.f29608d = d17;
            this.f29609e = d18;
            this.f29610f = d19;
            this.f29611g = d24;
            this.f29612h = d25;
            this.f29613i = d26;
            this.f29614j = d27;
            this.f29615k = d28;
            this.f29616l = d29;
            this.f29617m = d34;
            this.f29618n = d35;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.f29605a, cVar.f29605a) == 0 && Double.compare(this.f29606b, cVar.f29606b) == 0 && Double.compare(this.f29607c, cVar.f29607c) == 0 && Double.compare(this.f29608d, cVar.f29608d) == 0 && Double.compare(this.f29609e, cVar.f29609e) == 0 && Double.compare(this.f29610f, cVar.f29610f) == 0 && Double.compare(this.f29611g, cVar.f29611g) == 0 && Double.compare(this.f29612h, cVar.f29612h) == 0 && Double.compare(this.f29613i, cVar.f29613i) == 0 && Double.compare(this.f29614j, cVar.f29614j) == 0 && Double.compare(this.f29615k, cVar.f29615k) == 0 && Double.compare(this.f29616l, cVar.f29616l) == 0 && Double.compare(this.f29617m, cVar.f29617m) == 0 && Double.compare(this.f29618n, cVar.f29618n) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f29618n) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.f29605a) * 31, 31, this.f29606b), 31, this.f29607c), 31, this.f29608d), 31, this.f29609e), 31, this.f29610f), 31, this.f29611g), 31, this.f29612h), 31, this.f29613i), 31, this.f29614j), 31, this.f29615k), 31, this.f29616l), 31, this.f29617m);
        }

        public final String toString() {
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("PowerPhaseBalance(leftPowerPhaseStart=", this.f29605a, ", leftPowerPhaseEnd=");
            sbA.append(this.f29606b);
            am.j.x(sbA, ", leftPowerPhaseArcLength=", this.f29607c, ", leftPowerPhasePeakArcLength=");
            sbA.append(this.f29608d);
            am.j.x(sbA, ", leftPowerPhasePeakStart=", this.f29609e, ", leftPowerPhasePeakEnd=");
            sbA.append(this.f29610f);
            am.j.x(sbA, ", rightPowerPhaseStart=", this.f29611g, ", rightPowerPhaseEnd=");
            sbA.append(this.f29612h);
            am.j.x(sbA, ", rightPowerPhaseArcLength=", this.f29613i, ", rightPowerPhasePeakArcLength=");
            sbA.append(this.f29614j);
            am.j.x(sbA, ", rightPowerPhasePeakStart=", this.f29615k, ", rightPowerPhasePeakEnd=");
            sbA.append(this.f29616l);
            am.j.x(sbA, ", leftBalance=", this.f29617m, ", rightBalance=");
            return c22.t.d(this.f29618n, ")", sbA);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeDouble(this.f29605a);
            parcel.writeDouble(this.f29606b);
            parcel.writeDouble(this.f29607c);
            parcel.writeDouble(this.f29608d);
            parcel.writeDouble(this.f29609e);
            parcel.writeDouble(this.f29610f);
            parcel.writeDouble(this.f29611g);
            parcel.writeDouble(this.f29612h);
            parcel.writeDouble(this.f29613i);
            parcel.writeDouble(this.f29614j);
            parcel.writeDouble(this.f29615k);
            parcel.writeDouble(this.f29616l);
            parcel.writeDouble(this.f29617m);
            parcel.writeDouble(this.f29618n);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/o$d;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/o;", "", "seatedTime", "standingTime", "aeroTime", "uprightTime", "loweredTime", "torsoAngleLowThreshold", "<init>", "(DDDDDD)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements o {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f29619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f29620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f29621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f29622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f29623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f29624f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public d(double d14, double d15, double d16, double d17, double d18, double d19) {
            this.f29619a = d14;
            this.f29620b = d15;
            this.f29621c = d16;
            this.f29622d = d17;
            this.f29623e = d18;
            this.f29624f = d19;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Double.compare(this.f29619a, dVar.f29619a) == 0 && Double.compare(this.f29620b, dVar.f29620b) == 0 && Double.compare(this.f29621c, dVar.f29621c) == 0 && Double.compare(this.f29622d, dVar.f29622d) == 0 && Double.compare(this.f29623e, dVar.f29623e) == 0 && Double.compare(this.f29624f, dVar.f29624f) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f29624f) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.f29619a) * 31, 31, this.f29620b), 31, this.f29621c), 31, this.f29622d), 31, this.f29623e);
        }

        public final String toString() {
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("TimeInPosition(seatedTime=", this.f29619a, ", standingTime=");
            sbA.append(this.f29620b);
            am.j.x(sbA, ", aeroTime=", this.f29621c, ", uprightTime=");
            sbA.append(this.f29622d);
            am.j.x(sbA, ", loweredTime=", this.f29623e, ", torsoAngleLowThreshold=");
            return c22.t.d(this.f29624f, ")", sbA);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeDouble(this.f29619a);
            parcel.writeDouble(this.f29620b);
            parcel.writeDouble(this.f29621c);
            parcel.writeDouble(this.f29622d);
            parcel.writeDouble(this.f29623e);
            parcel.writeDouble(this.f29624f);
        }
    }
}
