package be1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gs1.t;
import i63.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'Bµ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018\u0018\u00010\u0018\u0012\u0018\b\u0002\u0010\u001a\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B\u0091\u0002\b\u0010\u0012\u0006\u0010!\u001a\u00020\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0019\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018\u0018\u00010\u0018\u0012\u0016\u0010\u001a\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$¨\u0006("}, d2 = {"Lbe1/a;", "Landroid/os/Parcelable;", "", "userProfilePK", "", "calendarDate", "startTimestampGMT", "endTimestampGMT", "startTimestampLocal", "endTimestampLocal", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampLocal", "tomorrowSleepStartTimestampGMT", "tomorrowSleepEndTimestampGMT", "tomorrowSleepStartTimestampLocal", "tomorrowSleepEndTimestampLocal", "", "avgWakingRespirationValue", "avgSleepRespirationValue", "avgTomorrowSleepRespirationValue", "lowestRespirationValue", "highestRespirationValue", "", "respirationValuesArray", "respirationAveragesValuesArray", "", "respirationVersion", "Lgs1/t;", "timelineDTO", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lgs1/t;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "b", "a", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f17713z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f17723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f17724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f17726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f17727n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f17728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f17729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f17730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f17731r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f17732t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<List<Double>> f17733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<? extends List<Double>> f17734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f17735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f17736y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int i15 = 0;
                while (i15 != i14) {
                    int i16 = i14;
                    int i17 = parcel.readInt();
                    int i18 = i15;
                    ArrayList arrayList3 = new ArrayList(i17);
                    String str = string;
                    int i19 = 0;
                    while (i19 != i17) {
                        arrayList3.add(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                        i19++;
                        i17 = i17;
                    }
                    arrayList.add(arrayList3);
                    i15 = i18 + 1;
                    i14 = i16;
                    string = str;
                }
            }
            String str2 = string;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i24);
                int i25 = 0;
                while (i25 != i24) {
                    int i26 = i24;
                    int i27 = parcel.readInt();
                    ArrayList arrayList5 = arrayList;
                    ArrayList arrayList6 = new ArrayList(i27);
                    int i28 = i25;
                    int i29 = 0;
                    while (i29 != i27) {
                        arrayList6.add(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                        i29++;
                        i27 = i27;
                    }
                    arrayList4.add(arrayList6);
                    i25 = i28 + 1;
                    i24 = i26;
                    arrayList = arrayList5;
                }
                arrayList2 = arrayList4;
            }
            return new a(j8, str2, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, arrayList, arrayList2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (t) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f17713z = new l[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, m.a(nVar, new b4.b(14)), m.a(nVar, new b4.b(15)), null};
    }

    public /* synthetic */ a(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Double d14, Double d15, Double d16, Double d17, Double d18, List list, List list2, Integer num, t tVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7, (i14 & 256) != 0 ? null : str8, (i14 & 512) != 0 ? null : str9, (i14 & 1024) != 0 ? null : str10, (i14 & 2048) != 0 ? null : str11, (i14 & 4096) != 0 ? null : str12, (i14 & 8192) != 0 ? null : str13, (i14 & 16384) != 0 ? null : d14, (32768 & i14) != 0 ? null : d15, (i14 & 65536) != 0 ? null : d16, (i14 & 131072) != 0 ? null : d17, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d18, (i14 & 524288) != 0 ? null : list, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list2, (i14 & 2097152) != 0 ? null : num, (i14 & 4194304) != 0 ? null : tVar);
    }

    public final ArrayList b() {
        List<? extends List<Double>> list = this.f17734w;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            Double d14 = (Double) list2.get(0);
            long jDoubleValue = d14 != null ? (long) d14.doubleValue() : -1L;
            Double d15 = (Double) list2.get(1);
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
            Double d16 = (Double) list2.get(2);
            double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
            Double d17 = (Double) list2.get(3);
            if (d17 != null) {
                dDoubleValue = d17.doubleValue();
            }
            arrayList.add(new be1.c(jDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue));
        }
        return arrayList;
    }

    public final ArrayList d() {
        List<List<Double>> list = this.f17733v;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((List) obj).size() == 2) {
                arrayList.add(obj);
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            List list2 = (List) obj2;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (((Double) it.next()) != null);
            }
            arrayList2.add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        for (List list3 : arrayList2) {
            Double d14 = (Double) list3.get(0);
            Long lValueOf = d14 != null ? Long.valueOf((long) d14.doubleValue()) : null;
            lValueOf.getClass();
            long jLongValue = lValueOf.longValue();
            Object obj3 = list3.get(1);
            obj3.getClass();
            arrayList3.add(new d(jLongValue, ((Number) obj3).doubleValue()));
        }
        return arrayList3;
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
        return this.f17714a == aVar.f17714a && s.g(this.f17715b, aVar.f17715b) && s.g(this.f17716c, aVar.f17716c) && s.g(this.f17717d, aVar.f17717d) && s.g(this.f17718e, aVar.f17718e) && s.g(this.f17719f, aVar.f17719f) && s.g(this.f17720g, aVar.f17720g) && s.g(this.f17721h, aVar.f17721h) && s.g(this.f17722i, aVar.f17722i) && s.g(this.f17723j, aVar.f17723j) && s.g(this.f17724k, aVar.f17724k) && s.g(this.f17725l, aVar.f17725l) && s.g(this.f17726m, aVar.f17726m) && s.g(this.f17727n, aVar.f17727n) && s.g(this.f17728o, aVar.f17728o) && s.g(this.f17729p, aVar.f17729p) && s.g(this.f17730q, aVar.f17730q) && s.g(this.f17731r, aVar.f17731r) && s.g(this.f17732t, aVar.f17732t) && s.g(this.f17733v, aVar.f17733v) && s.g(this.f17734w, aVar.f17734w) && s.g(this.f17735x, aVar.f17735x) && s.g(this.f17736y, aVar.f17736y);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f17714a) * 31;
        String str = this.f17715b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17716c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17717d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17718e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17719f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17720g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f17721h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f17722i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f17723j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f17724k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f17725l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f17726m;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f17727n;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Double d14 = this.f17728o;
        int iHashCode15 = (iHashCode14 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f17729p;
        int iHashCode16 = (iHashCode15 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f17730q;
        int iHashCode17 = (iHashCode16 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f17731r;
        int iHashCode18 = (iHashCode17 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f17732t;
        int iHashCode19 = (iHashCode18 + (d18 == null ? 0 : d18.hashCode())) * 31;
        List<List<Double>> list = this.f17733v;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends List<Double>> list2 = this.f17734w;
        int iHashCode21 = (iHashCode20 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f17735x;
        int iHashCode22 = (iHashCode21 + (num == null ? 0 : num.hashCode())) * 31;
        t tVar = this.f17736y;
        return iHashCode22 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f17714a, "DailyRespirationDTO(userProfilePK=", ", calendarDate=", this.f17715b);
        sn.a.t(sbK, ", startTimestampGMT=", this.f17716c, ", endTimestampGMT=", this.f17717d);
        sn.a.t(sbK, ", startTimestampLocal=", this.f17718e, ", endTimestampLocal=", this.f17719f);
        sn.a.t(sbK, ", sleepStartTimestampGMT=", this.f17720g, ", sleepEndTimestampGMT=", this.f17721h);
        sn.a.t(sbK, ", sleepStartTimestampLocal=", this.f17722i, ", sleepEndTimestampLocal=", this.f17723j);
        sn.a.t(sbK, ", tomorrowSleepStartTimestampGMT=", this.f17724k, ", tomorrowSleepEndTimestampGMT=", this.f17725l);
        sn.a.t(sbK, ", tomorrowSleepStartTimestampLocal=", this.f17726m, ", tomorrowSleepEndTimestampLocal=", this.f17727n);
        sn.a.p(this.f17728o, this.f17729p, ", avgWakingRespirationValue=", ", avgSleepRespirationValue=", sbK);
        sn.a.p(this.f17730q, this.f17731r, ", avgTomorrowSleepRespirationValue=", ", lowestRespirationValue=", sbK);
        sbK.append(", highestRespirationValue=");
        sbK.append(this.f17732t);
        sbK.append(", respirationValuesArray=");
        sbK.append(this.f17733v);
        sbK.append(", respirationAveragesValuesArray=");
        sbK.append(this.f17734w);
        sbK.append(", respirationVersion=");
        sbK.append(this.f17735x);
        sbK.append(", timelineDTO=");
        sbK.append(this.f17736y);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f17714a);
        parcel.writeString(this.f17715b);
        parcel.writeString(this.f17716c);
        parcel.writeString(this.f17717d);
        parcel.writeString(this.f17718e);
        parcel.writeString(this.f17719f);
        parcel.writeString(this.f17720g);
        parcel.writeString(this.f17721h);
        parcel.writeString(this.f17722i);
        parcel.writeString(this.f17723j);
        parcel.writeString(this.f17724k);
        parcel.writeString(this.f17725l);
        parcel.writeString(this.f17726m);
        parcel.writeString(this.f17727n);
        Double d14 = this.f17728o;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f17729p;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f17730q;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.f17731r;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.f17732t;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        List<List<Double>> list = this.f17733v;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                Iterator itE = f.e((List) itO.next(), parcel);
                while (itE.hasNext()) {
                    Double d19 = (Double) itE.next();
                    if (d19 == null) {
                        parcel.writeInt(0);
                    } else {
                        sn.a.m(parcel, 1, d19);
                    }
                }
            }
        }
        List<? extends List<Double>> list2 = this.f17734w;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                Iterator itE2 = f.e((List) itO2.next(), parcel);
                while (itE2.hasNext()) {
                    Double d24 = (Double) itE2.next();
                    if (d24 == null) {
                        parcel.writeInt(0);
                    } else {
                        sn.a.m(parcel, 1, d24);
                    }
                }
            }
        }
        Integer num = this.f17735x;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        parcel.writeParcelable(this.f17736y, i14);
    }

    /* JADX INFO: renamed from: be1.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lbe1/a$b;", "", "<init>", "()V", "Li63/c;", "Lbe1/a;", "serializer", "()Li63/c;", "", "CALENDAR_DATE_FORMAT", "Ljava/lang/String;", "DATE_FORMAT", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C0251a.f17737a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ a(int i14, long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Double d14, Double d15, Double d16, Double d17, Double d18, List list, List list2, Integer num, u1 u1Var) {
        this.f17714a = (i14 & 1) == 0 ? 0L : j8;
        if ((i14 & 2) == 0) {
            this.f17715b = null;
        } else {
            this.f17715b = str;
        }
        if ((i14 & 4) == 0) {
            this.f17716c = null;
        } else {
            this.f17716c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f17717d = null;
        } else {
            this.f17717d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f17718e = null;
        } else {
            this.f17718e = str4;
        }
        if ((i14 & 32) == 0) {
            this.f17719f = null;
        } else {
            this.f17719f = str5;
        }
        if ((i14 & 64) == 0) {
            this.f17720g = null;
        } else {
            this.f17720g = str6;
        }
        if ((i14 & 128) == 0) {
            this.f17721h = null;
        } else {
            this.f17721h = str7;
        }
        if ((i14 & 256) == 0) {
            this.f17722i = null;
        } else {
            this.f17722i = str8;
        }
        if ((i14 & 512) == 0) {
            this.f17723j = null;
        } else {
            this.f17723j = str9;
        }
        if ((i14 & 1024) == 0) {
            this.f17724k = null;
        } else {
            this.f17724k = str10;
        }
        if ((i14 & 2048) == 0) {
            this.f17725l = null;
        } else {
            this.f17725l = str11;
        }
        if ((i14 & 4096) == 0) {
            this.f17726m = null;
        } else {
            this.f17726m = str12;
        }
        if ((i14 & 8192) == 0) {
            this.f17727n = null;
        } else {
            this.f17727n = str13;
        }
        if ((i14 & 16384) == 0) {
            this.f17728o = null;
        } else {
            this.f17728o = d14;
        }
        if ((32768 & i14) == 0) {
            this.f17729p = null;
        } else {
            this.f17729p = d15;
        }
        if ((65536 & i14) == 0) {
            this.f17730q = null;
        } else {
            this.f17730q = d16;
        }
        if ((131072 & i14) == 0) {
            this.f17731r = null;
        } else {
            this.f17731r = d17;
        }
        if ((262144 & i14) == 0) {
            this.f17732t = null;
        } else {
            this.f17732t = d18;
        }
        if ((524288 & i14) == 0) {
            this.f17733v = null;
        } else {
            this.f17733v = list;
        }
        if ((1048576 & i14) == 0) {
            this.f17734w = null;
        } else {
            this.f17734w = list2;
        }
        if ((i14 & 2097152) == 0) {
            this.f17735x = null;
        } else {
            this.f17735x = num;
        }
        this.f17736y = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Double d14, Double d15, Double d16, Double d17, Double d18, List<? extends List<Double>> list, List<? extends List<Double>> list2, Integer num, t tVar) {
        this.f17714a = j8;
        this.f17715b = str;
        this.f17716c = str2;
        this.f17717d = str3;
        this.f17718e = str4;
        this.f17719f = str5;
        this.f17720g = str6;
        this.f17721h = str7;
        this.f17722i = str8;
        this.f17723j = str9;
        this.f17724k = str10;
        this.f17725l = str11;
        this.f17726m = str12;
        this.f17727n = str13;
        this.f17728o = d14;
        this.f17729p = d15;
        this.f17730q = d16;
        this.f17731r = d17;
        this.f17732t = d18;
        this.f17733v = list;
        this.f17734w = list2;
        this.f17735x = num;
        this.f17736y = tVar;
    }

    public a() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }
}
