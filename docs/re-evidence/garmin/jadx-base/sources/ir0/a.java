package ir0;

import android.os.Parcel;
import android.os.Parcelable;
import gs1.k;
import gs1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#BÕ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\u0004\b\u001b\u0010\u001cB¡\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 ¨\u0006$"}, d2 = {"Lir0/a;", "Landroid/os/Parcelable;", "", "userProfilePK", "", "calendarDate", "startTimestampGMT", "endTimestampGMT", "startTimestampLocal", "endTimestampLocal", "", "weekGoal", "weeklyTotal", "dayOfGoalMet", "startDayMinutes", "endDayMinutes", "moderateMinutes", "vigorousMinutes", "", "Lir0/g;", "imValues", "Lgs1/o;", "sleepTimes", "Lir0/b;", "activities", "Lgs1/k;", "naps", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;IIIILjava/util/List;Lgs1/o;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;IIIILjava/util/List;Lm63/u1;)V", "Companion", "b", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f94767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f94768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f94769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f94770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f94771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f94772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f94773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f94774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f94775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f94776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<g> f94777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f94778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<b> f94779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<k> f94780q;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f94762r = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f94763t = {null, null, null, null, null, null, null, null, null, null, null, null, null, m.a(n.PUBLICATION, new ik2.b(4))};

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Object obj;
            ArrayList arrayList;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                obj = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                obj = null;
            }
            String string6 = parcel.readString();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i19 = parcel.readInt();
                arrayList = new ArrayList(i19);
                int iD = 0;
                while (iD != i19) {
                    iD = u0.d(a.class, parcel, arrayList, iD, 1);
                    i19 = i19;
                }
            }
            o oVar = (o) parcel.readParcelable(a.class.getClassLoader());
            int i24 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i24);
            ArrayList arrayList3 = arrayList;
            int iA = 0;
            while (iA != i24) {
                iA = kg.f.a(b.CREATOR, parcel, arrayList2, iA, 1);
                i24 = i24;
                string2 = string2;
            }
            String str = string2;
            int i25 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i25);
            int iD2 = 0;
            while (iD2 != i25) {
                iD2 = u0.d(a.class, parcel, arrayList4, iD2, 1);
            }
            return new a(j8, string, str, string3, string4, string5, i14, numValueOf, string6, i15, i16, i17, i18, arrayList3, oVar, arrayList2, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(long j8, String str, String str2, String str3, String str4, String str5, int i14, Integer num, String str6, int i15, int i16, int i17, int i18, List list, o oVar, List list2, List list3, int i19, j jVar) {
        this((i19 & 1) != 0 ? 0L : j8, (i19 & 2) != 0 ? null : str, (i19 & 4) != 0 ? null : str2, (i19 & 8) != 0 ? null : str3, (i19 & 16) != 0 ? null : str4, (i19 & 32) != 0 ? null : str5, (i19 & 64) != 0 ? 0 : i14, (i19 & 128) != 0 ? null : num, (i19 & 256) != 0 ? null : str6, (i19 & 512) != 0 ? 0 : i15, (i19 & 1024) != 0 ? 0 : i16, (i19 & 2048) != 0 ? 0 : i17, (i19 & 4096) == 0 ? i18 : 0, (i19 & 8192) != 0 ? null : list, (i19 & 16384) != 0 ? null : oVar, (32768 & i19) != 0 ? j0.f134944a : list2, (i19 & 65536) != 0 ? j0.f134944a : list3);
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
        return this.f94764a == aVar.f94764a && s.g(this.f94765b, aVar.f94765b) && s.g(this.f94766c, aVar.f94766c) && s.g(this.f94767d, aVar.f94767d) && s.g(this.f94768e, aVar.f94768e) && s.g(this.f94769f, aVar.f94769f) && this.f94770g == aVar.f94770g && s.g(this.f94771h, aVar.f94771h) && s.g(this.f94772i, aVar.f94772i) && this.f94773j == aVar.f94773j && this.f94774k == aVar.f94774k && this.f94775l == aVar.f94775l && this.f94776m == aVar.f94776m && s.g(this.f94777n, aVar.f94777n) && s.g(this.f94778o, aVar.f94778o) && s.g(this.f94779p, aVar.f94779p) && s.g(this.f94780q, aVar.f94780q);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f94764a) * 31;
        String str = this.f94765b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94766c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94767d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94768e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f94769f;
        int iD = q2.d(this.f94770g, (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Integer num = this.f94771h;
        int iHashCode6 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f94772i;
        int iD2 = q2.d(this.f94776m, q2.d(this.f94775l, q2.d(this.f94774k, q2.d(this.f94773j, (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31), 31);
        List<g> list = this.f94777n;
        int iHashCode7 = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        o oVar = this.f94778o;
        return this.f94780q.hashCode() + u0.b((iHashCode7 + (oVar != null ? oVar.hashCode() : 0)) * 31, 31, this.f94779p);
    }

    public final String toString() {
        o oVar = this.f94778o;
        List<b> list = this.f94779p;
        List<k> list2 = this.f94780q;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f94764a, "DailyIntensityMinutesDTO(userProfilePK=", ", calendarDate=", this.f94765b);
        sn.a.t(sbK, ", startTimestampGMT=", this.f94766c, ", endTimestampGMT=", this.f94767d);
        sn.a.t(sbK, ", startTimestampLocal=", this.f94768e, ", endTimestampLocal=", this.f94769f);
        sbK.append(", weekGoal=");
        sbK.append(this.f94770g);
        sbK.append(", weeklyTotal=");
        sbK.append(this.f94771h);
        sbK.append(", dayOfGoalMet=");
        sbK.append(this.f94772i);
        sbK.append(", startDayMinutes=");
        sbK.append(this.f94773j);
        androidx.core.view.j.m(this.f94774k, this.f94775l, ", endDayMinutes=", ", moderateMinutes=", sbK);
        sbK.append(", vigorousMinutes=");
        sbK.append(this.f94776m);
        sbK.append(", imValues=");
        sbK.append(this.f94777n);
        sbK.append(", sleepTimes=");
        sbK.append(oVar);
        sbK.append(", activities=");
        sbK.append(list);
        sbK.append(", naps=");
        sbK.append(list2);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f94764a);
        parcel.writeString(this.f94765b);
        parcel.writeString(this.f94766c);
        parcel.writeString(this.f94767d);
        parcel.writeString(this.f94768e);
        parcel.writeString(this.f94769f);
        parcel.writeInt(this.f94770g);
        Integer num = this.f94771h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f94772i);
        parcel.writeInt(this.f94773j);
        parcel.writeInt(this.f94774k);
        parcel.writeInt(this.f94775l);
        parcel.writeInt(this.f94776m);
        List<g> list = this.f94777n;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        parcel.writeParcelable(this.f94778o, i14);
        Iterator itE = kg.f.e(this.f94779p, parcel);
        while (itE.hasNext()) {
            ((b) itE.next()).writeToParcel(parcel, i14);
        }
        Iterator itE2 = kg.f.e(this.f94780q, parcel);
        while (itE2.hasNext()) {
            parcel.writeParcelable((Parcelable) itE2.next(), i14);
        }
    }

    /* JADX INFO: renamed from: ir0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lir0/a$b;", "", "<init>", "()V", "Li63/c;", "Lir0/a;", "serializer", "()Li63/c;", "", "IM_MULTIPLIER", "I", "", "CALENDAR_DATE_FORMAT", "Ljava/lang/String;", "DATE_FORMAT", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1810a.f94781a;
        }

        private Companion() {
        }
    }

    public a(int i14, long j8, String str, String str2, String str3, String str4, String str5, int i15, Integer num, String str6, int i16, int i17, int i18, int i19, List list, u1 u1Var) {
        this.f94764a = (i14 & 1) == 0 ? 0L : j8;
        if ((i14 & 2) == 0) {
            this.f94765b = null;
        } else {
            this.f94765b = str;
        }
        if ((i14 & 4) == 0) {
            this.f94766c = null;
        } else {
            this.f94766c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f94767d = null;
        } else {
            this.f94767d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f94768e = null;
        } else {
            this.f94768e = str4;
        }
        if ((i14 & 32) == 0) {
            this.f94769f = null;
        } else {
            this.f94769f = str5;
        }
        if ((i14 & 64) == 0) {
            this.f94770g = 0;
        } else {
            this.f94770g = i15;
        }
        if ((i14 & 128) == 0) {
            this.f94771h = null;
        } else {
            this.f94771h = num;
        }
        if ((i14 & 256) == 0) {
            this.f94772i = null;
        } else {
            this.f94772i = str6;
        }
        if ((i14 & 512) == 0) {
            this.f94773j = 0;
        } else {
            this.f94773j = i16;
        }
        if ((i14 & 1024) == 0) {
            this.f94774k = 0;
        } else {
            this.f94774k = i17;
        }
        if ((i14 & 2048) == 0) {
            this.f94775l = 0;
        } else {
            this.f94775l = i18;
        }
        if ((i14 & 4096) == 0) {
            this.f94776m = 0;
        } else {
            this.f94776m = i19;
        }
        if ((i14 & 8192) == 0) {
            this.f94777n = null;
        } else {
            this.f94777n = list;
        }
        this.f94778o = null;
        j0 j0Var = j0.f134944a;
        this.f94779p = j0Var;
        this.f94780q = j0Var;
    }

    public a(long j8, String str, String str2, String str3, String str4, String str5, int i14, Integer num, String str6, int i15, int i16, int i17, int i18, List<g> list, o oVar, List<b> list2, List<k> list3) {
        list2.getClass();
        list3.getClass();
        this.f94764a = j8;
        this.f94765b = str;
        this.f94766c = str2;
        this.f94767d = str3;
        this.f94768e = str4;
        this.f94769f = str5;
        this.f94770g = i14;
        this.f94771h = num;
        this.f94772i = str6;
        this.f94773j = i15;
        this.f94774k = i16;
        this.f94775l = i17;
        this.f94776m = i18;
        this.f94777n = list;
        this.f94778o = oVar;
        this.f94779p = list2;
        this.f94780q = list3;
    }

    public a() {
        this(0L, null, null, null, null, null, 0, null, null, 0, 0, 0, 0, null, null, null, null, 131071, null);
    }
}
