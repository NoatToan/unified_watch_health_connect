package wg0;

import am.c2;
import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import ps.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u00011BÍ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020\u0012\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0012\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100¨\u00062"}, d2 = {"Lwg0/a;", "Landroid/os/Parcelable;", "", "activityId", "", "activityName", "Lam/x0;", "activityType", "", "userProfileId", "userDisplayName", "userFullName", "Lorg/joda/time/DateTime;", "startTimeGMT", "startTimeLocal", "Lam/l;", "privacyType", "description", "", "isPersonalRecord", "isFavorite", "isRace", "isDiveDecompression", "", "Laq/c;", "activityStatsTexts", "Lps/q;", "activityStatsBrief", "descriptionExpanded", "Lwg0/l;", "mediaData", "Lwg0/m;", "socialData", "Ljo1/e;", "newsPostDTO", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;", "groupMembership", "isGroupFeed", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupAnnouncementDTO;", "announcementDTO", "startTimeText", "isCloudPositioningProcessing", "startTimeContentDescription", "Lb12/b;", "userProfileImageData", "isFavoriteUser", "speedMeasurementUnit", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lam/x0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lam/l;Ljava/lang/String;ZZZZLjava/util/List;Lps/q;ZLwg0/l;Lwg0/m;Ljo1/e;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$c;ZLcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupAnnouncementDTO;Ljava/lang/String;ZLjava/lang/String;Lb12/b;Ljava/lang/Boolean;Ljava/lang/String;)V", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public final boolean A;
    public final String B;
    public final b12.b C;
    public final Boolean D;
    public final String E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f185042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f185044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f185045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f185046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f185047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f185048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f185049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final am.l f185050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f185051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f185052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f185053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f185054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f185055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<aq.c> f185056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f185057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f185058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f185059r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f185060t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final jo1.e f185061v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final GroupDTO.c f185062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f185063x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final GroupAnnouncementDTO f185064y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f185065z;
    public static final b F = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new c();
    public static final int I = 8;
    public static final C3424a P = new C3424a();

    /* JADX INFO: renamed from: wg0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"wg0/a$a", "Landroidx/recyclerview/widget/o$f;", "Lwg0/a;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3424a extends androidx.recyclerview.widget.o.f<a> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            return s.g(aVar3.f185060t, aVar4.f185060t) && s.g(aVar3.f185059r, aVar4.f185059r) && s.g(aVar3.f185051j, aVar4.f185051j) && s.g(aVar3.f185057p, aVar4.f185057p) && aVar3.f185050i == aVar4.f185050i && s.g(aVar3.f185043b, aVar4.f185043b) && s.g(aVar3.f185061v, aVar4.f185061v) && s.g(aVar3.f185065z, aVar4.f185065z) && aVar3.f185044c == aVar4.f185044c && s.g(aVar3.D, aVar4.D);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(a aVar, a aVar2) {
            GroupAnnouncementDTO groupAnnouncementDTO;
            String str;
            GroupAnnouncementDTO groupAnnouncementDTO2;
            String str2;
            String strR;
            jo1.e eVar;
            String strR2;
            a aVar3 = aVar;
            a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            if (aVar3.h() && aVar4.h()) {
                Long l14 = aVar3.f185042a;
                if (l14 == null) {
                    return false;
                }
                long jLongValue = l14.longValue();
                Long l15 = aVar4.f185042a;
                return l15 != null && jLongValue == l15.longValue();
            }
            if (aVar3.m() && aVar4.m()) {
                jo1.e eVar2 = aVar3.f185061v;
                if (eVar2 == null || (strR = eVar2.getUuid()) == null || (eVar = aVar4.f185061v) == null || (strR2 = eVar.getUuid()) == null) {
                    return false;
                }
                return strR.equals(strR2);
            }
            if (!aVar3.i() || !aVar4.i() || (groupAnnouncementDTO = aVar3.f185064y) == null || (str = groupAnnouncementDTO.f31502a) == null || (groupAnnouncementDTO2 = aVar4.f185064y) == null || (str2 = groupAnnouncementDTO2.f31502a) == null) {
                return false;
            }
            return str.equals(str2);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            aVar3.getClass();
            m mVar = aVar3.f185060t;
            aVar4.getClass();
            b12.b bVar = aVar4.C;
            m mVar2 = aVar4.f185060t;
            ArrayList arrayList = new ArrayList();
            b bVar2 = a.F;
            l lVar = aVar3.f185059r;
            l lVar2 = aVar4.f185059r;
            bVar2.getClass();
            if (!b.a(lVar, lVar2)) {
                arrayList.add(lVar2);
                arrayList.add(mVar2);
            } else if (!s.g(mVar, mVar2)) {
                arrayList.add(mVar2);
            }
            if (b.a(lVar, lVar2) && s.g(mVar, mVar2) && !aVar3.equals(aVar4)) {
                arrayList.add(aVar4);
            }
            if (!s.g(aVar3.C, bVar)) {
                arrayList.add(new o(bVar, new b12.b(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).z4("PREMIUM_FRIEND"), null, null, null, null, 30, null)));
            }
            return arrayList;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            x0 x0Var = (x0) parcel.readParcelable(a.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            am.l lVarValueOf = parcel.readInt() == 0 ? null : am.l.valueOf(parcel.readString());
            String string4 = parcel.readString();
            boolean z14 = false;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            boolean z15 = parcel.readInt() != 0 ? true : z14;
            boolean z16 = parcel.readInt() != 0 ? true : z14;
            boolean z17 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            Long l14 = lValueOf;
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(a.class, parcel, arrayList, iD, 1);
            }
            q qVar = (q) parcel.readParcelable(a.class.getClassLoader());
            boolean z18 = parcel.readInt() != 0;
            l lVarCreateFromParcel = parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel);
            m mVarCreateFromParcel = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
            jo1.e eVarCreateFromParcel = parcel.readInt() == 0 ? null : jo1.e.CREATOR.createFromParcel(parcel);
            GroupDTO.c cVarValueOf = GroupDTO.c.valueOf(parcel.readString());
            boolean z19 = parcel.readInt() != 0;
            GroupAnnouncementDTO groupAnnouncementDTO = (GroupAnnouncementDTO) parcel.readParcelable(r1.getClassLoader());
            boolean z24 = true;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                z24 = false;
            }
            String string6 = parcel.readString();
            b12.b bVar = (b12.b) parcel.readParcelable(a.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(l14, string, x0Var, numValueOf, string2, string3, dateTime, dateTime2, lVarValueOf, string4, z14, z15, z16, z17, arrayList, qVar, z18, lVarCreateFromParcel, mVarCreateFromParcel, eVarCreateFromParcel, cVarValueOf, z19, groupAnnouncementDTO, string5, z24, string6, bVar, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Long l14, String str, x0 x0Var, Integer num, String str2, String str3, DateTime dateTime, DateTime dateTime2, am.l lVar, String str4, boolean z14, boolean z15, boolean z16, boolean z17, List list, q qVar, boolean z18, l lVar2, m mVar, jo1.e eVar, GroupDTO.c cVar, boolean z19, GroupAnnouncementDTO groupAnnouncementDTO, String str5, boolean z24, String str6, b12.b bVar, Boolean bool, String str7, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? x0.f4346x : x0Var, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? "" : str2, (i14 & 32) == 0 ? str3 : "", (i14 & 64) != 0 ? null : dateTime, (i14 & 128) != 0 ? null : dateTime2, (i14 & 256) != 0 ? null : lVar, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? false : z14, (i14 & 2048) != 0 ? false : z15, (i14 & 4096) != 0 ? false : z16, (i14 & 8192) != 0 ? false : z17, (i14 & 16384) != 0 ? j0.f134944a : list, (i14 & 32768) != 0 ? null : qVar, (i14 & 65536) != 0 ? false : z18, (i14 & 131072) != 0 ? null : lVar2, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : mVar, (i14 & 524288) != 0 ? null : eVar, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? GroupDTO.c.NOT_DEFINED : cVar, (i14 & 2097152) != 0 ? false : z19, (i14 & 4194304) != 0 ? null : groupAnnouncementDTO, (i14 & 8388608) != 0 ? null : str5, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z24, (i14 & 33554432) != 0 ? null : str6, (i14 & 67108864) != 0 ? b12.b.f14386g : bVar, (i14 & 134217728) != 0 ? null : bool, (i14 & 268435456) != 0 ? null : str7);
    }

    public static a b(a aVar, am.l lVar, l lVar2, m mVar, b12.b bVar, Boolean bool, int i14) {
        Long l14 = aVar.f185042a;
        String str = aVar.f185043b;
        x0 x0Var = aVar.f185044c;
        Integer num = aVar.f185045d;
        String str2 = aVar.f185046e;
        String str3 = aVar.f185047f;
        DateTime dateTime = aVar.f185048g;
        DateTime dateTime2 = aVar.f185049h;
        am.l lVar3 = (i14 & 256) != 0 ? aVar.f185050i : lVar;
        String str4 = aVar.f185051j;
        am.l lVar4 = lVar3;
        boolean z14 = aVar.f185052k;
        boolean z15 = aVar.f185053l;
        boolean z16 = aVar.f185054m;
        boolean z17 = aVar.f185055n;
        List<aq.c> list = aVar.f185056o;
        q qVar = aVar.f185057p;
        boolean z18 = aVar.f185058q;
        l lVar5 = (i14 & 131072) != 0 ? aVar.f185059r : lVar2;
        m mVar2 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? aVar.f185060t : mVar;
        jo1.e eVar = aVar.f185061v;
        GroupDTO.c cVar = aVar.f185062w;
        boolean z19 = aVar.f185063x;
        GroupAnnouncementDTO groupAnnouncementDTO = aVar.f185064y;
        String str5 = aVar.f185065z;
        boolean z24 = aVar.A;
        String str6 = aVar.B;
        b12.b bVar2 = (i14 & 67108864) != 0 ? aVar.C : bVar;
        Boolean bool2 = (i14 & 134217728) != 0 ? aVar.D : bool;
        String str7 = aVar.E;
        aVar.getClass();
        str.getClass();
        x0Var.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        cVar.getClass();
        bVar2.getClass();
        return new a(l14, str, x0Var, num, str2, str3, dateTime, dateTime2, lVar4, str4, z14, z15, z16, z17, list, qVar, z18, lVar5, mVar2, eVar, cVar, z19, groupAnnouncementDTO, str5, z24, str6, bVar2, bool2, str7);
    }

    public static a d(a aVar) {
        l lVar = aVar.f185059r;
        l lVarB = lVar != null ? l.b(lVar, null, h0.d1(lVar.f185103b), 29) : null;
        m mVar = aVar.f185060t;
        m mVarB = mVar != null ? m.b(mVar, null, null, 255) : null;
        aVar.getClass();
        return b(aVar, null, lVarB, mVarB, null, null, 536477695);
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
        return s.g(this.f185042a, aVar.f185042a) && s.g(this.f185043b, aVar.f185043b) && this.f185044c == aVar.f185044c && s.g(this.f185045d, aVar.f185045d) && s.g(this.f185046e, aVar.f185046e) && s.g(this.f185047f, aVar.f185047f) && s.g(this.f185048g, aVar.f185048g) && s.g(this.f185049h, aVar.f185049h) && this.f185050i == aVar.f185050i && s.g(this.f185051j, aVar.f185051j) && this.f185052k == aVar.f185052k && this.f185053l == aVar.f185053l && this.f185054m == aVar.f185054m && this.f185055n == aVar.f185055n && s.g(this.f185056o, aVar.f185056o) && s.g(this.f185057p, aVar.f185057p) && this.f185058q == aVar.f185058q && s.g(this.f185059r, aVar.f185059r) && s.g(this.f185060t, aVar.f185060t) && s.g(this.f185061v, aVar.f185061v) && this.f185062w == aVar.f185062w && this.f185063x == aVar.f185063x && s.g(this.f185064y, aVar.f185064y) && s.g(this.f185065z, aVar.f185065z) && this.A == aVar.A && s.g(this.B, aVar.B) && s.g(this.C, aVar.C) && s.g(this.D, aVar.D) && s.g(this.E, aVar.E);
    }

    public final String f() {
        boolean zH = h();
        Long l14 = this.f185042a;
        if (zH) {
            if (l14 != null) {
                return String.valueOf(l14.longValue());
            }
            return null;
        }
        if (!m()) {
            if (l14 != null) {
                return String.valueOf(l14.longValue());
            }
            return null;
        }
        jo1.e eVar = this.f185061v;
        if (eVar != null) {
            return eVar.getUuid();
        }
        return null;
    }

    public final c2 g() {
        if (h()) {
            return c2.ACTIVITY;
        }
        if (m()) {
            return c2.NEWS_POST;
        }
        return null;
    }

    public final boolean h() {
        return this.f185057p != null;
    }

    public final int hashCode() {
        Long l14 = this.f185042a;
        int iHashCode = (this.f185044c.hashCode() + wr.g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f185043b)) * 31;
        Integer num = this.f185045d;
        int iJ = wr.g.j(wr.g.j((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f185046e), 31, this.f185047f);
        DateTime dateTime = this.f185048g;
        int iHashCode2 = (iJ + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f185049h;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        am.l lVar = this.f185050i;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.f185051j;
        int iB = u0.b(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f185052k), 31, this.f185053l), 31, this.f185054m), 31, this.f185055n), 31, this.f185056o);
        q qVar = this.f185057p;
        int iG = q6.f.g((iB + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f185058q);
        l lVar2 = this.f185059r;
        int iHashCode5 = (iG + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        m mVar = this.f185060t;
        int iHashCode6 = (iHashCode5 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        jo1.e eVar = this.f185061v;
        int iG2 = q6.f.g((this.f185062w.hashCode() + ((iHashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31, 31, this.f185063x);
        GroupAnnouncementDTO groupAnnouncementDTO = this.f185064y;
        int iHashCode7 = (iG2 + (groupAnnouncementDTO == null ? 0 : groupAnnouncementDTO.hashCode())) * 31;
        String str2 = this.f185065z;
        int iG3 = q6.f.g((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.A);
        String str3 = this.B;
        int iHashCode8 = (this.C.hashCode() + ((iG3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Boolean bool = this.D;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.E;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean i() {
        return this.f185064y != null;
    }

    public final boolean j() {
        int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        Integer num = this.f185045d;
        return num != null && num.intValue() == userProfilePk;
    }

    public final boolean k() {
        String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        jo1.e eVar = this.f185061v;
        return s.g(userDisplayName, eVar != null ? eVar.getDisplayName() : null);
    }

    public final boolean m() {
        return this.f185061v != null;
    }

    public final String toString() {
        boolean z14 = this.f185058q;
        StringBuilder sbJ = b71.i.j("ActivityFeed(activityId=", ", activityName=", this.f185043b, this.f185042a, ", activityType=");
        sbJ.append(this.f185044c);
        sbJ.append(", userProfileId=");
        sbJ.append(this.f185045d);
        sbJ.append(", userDisplayName=");
        sn.a.t(sbJ, this.f185046e, ", userFullName=", this.f185047f, ", startTimeGMT=");
        sbJ.append(this.f185048g);
        sbJ.append(", startTimeLocal=");
        sbJ.append(this.f185049h);
        sbJ.append(", privacyType=");
        sbJ.append(this.f185050i);
        sbJ.append(", description=");
        sbJ.append(this.f185051j);
        sbJ.append(", isPersonalRecord=");
        kg.f.q(", isFavorite=", ", isRace=", sbJ, this.f185052k, this.f185053l);
        kg.f.q(", isDiveDecompression=", ", activityStatsTexts=", sbJ, this.f185054m, this.f185055n);
        sbJ.append(this.f185056o);
        sbJ.append(", activityStatsBrief=");
        sbJ.append(this.f185057p);
        sbJ.append(", descriptionExpanded=");
        sbJ.append(z14);
        sbJ.append(", mediaData=");
        sbJ.append(this.f185059r);
        sbJ.append(", socialData=");
        sbJ.append(this.f185060t);
        sbJ.append(", newsPostDTO=");
        sbJ.append(this.f185061v);
        sbJ.append(", groupMembership=");
        sbJ.append(this.f185062w);
        sbJ.append(", isGroupFeed=");
        sbJ.append(this.f185063x);
        sbJ.append(", announcementDTO=");
        sbJ.append(this.f185064y);
        sbJ.append(", startTimeText=");
        sbJ.append(this.f185065z);
        sbJ.append(", isCloudPositioningProcessing=");
        fb1.c.w(", startTimeContentDescription=", this.B, ", userProfileImageData=", sbJ, this.A);
        sbJ.append(this.C);
        sbJ.append(", isFavoriteUser=");
        sbJ.append(this.D);
        sbJ.append(", speedMeasurementUnit=");
        return am.j.o(this.E, ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f185042a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f185043b);
        parcel.writeParcelable(this.f185044c, i14);
        Integer num = this.f185045d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f185046e);
        parcel.writeString(this.f185047f);
        parcel.writeSerializable(this.f185048g);
        parcel.writeSerializable(this.f185049h);
        am.l lVar = this.f185050i;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(lVar.name());
        }
        parcel.writeString(this.f185051j);
        parcel.writeInt(this.f185052k ? 1 : 0);
        parcel.writeInt(this.f185053l ? 1 : 0);
        parcel.writeInt(this.f185054m ? 1 : 0);
        parcel.writeInt(this.f185055n ? 1 : 0);
        Iterator itE = kg.f.e(this.f185056o, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
        parcel.writeParcelable(this.f185057p, i14);
        parcel.writeInt(this.f185058q ? 1 : 0);
        l lVar2 = this.f185059r;
        if (lVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar2.writeToParcel(parcel, i14);
        }
        m mVar = this.f185060t;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i14);
        }
        jo1.e eVar = this.f185061v;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f185062w.name());
        parcel.writeInt(this.f185063x ? 1 : 0);
        parcel.writeParcelable(this.f185064y, i14);
        parcel.writeString(this.f185065z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeString(this.B);
        parcel.writeParcelable(this.C, i14);
        Boolean bool = this.D;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.E);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwg0/a$b;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a(l lVar, l lVar2) {
            if (lVar == null && lVar2 == null) {
                return true;
            }
            return lVar != null && lVar2 != null && s.g(lVar.f185103b, lVar2.f185103b) && s.g(lVar.f185104c, lVar2.f185104c);
        }

        private b() {
        }
    }

    public a(Long l14, String str, x0 x0Var, Integer num, String str2, String str3, DateTime dateTime, DateTime dateTime2, am.l lVar, String str4, boolean z14, boolean z15, boolean z16, boolean z17, List<aq.c> list, q qVar, boolean z18, l lVar2, m mVar, jo1.e eVar, GroupDTO.c cVar, boolean z19, GroupAnnouncementDTO groupAnnouncementDTO, String str5, boolean z24, String str6, b12.b bVar, Boolean bool, String str7) {
        str.getClass();
        x0Var.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        cVar.getClass();
        bVar.getClass();
        this.f185042a = l14;
        this.f185043b = str;
        this.f185044c = x0Var;
        this.f185045d = num;
        this.f185046e = str2;
        this.f185047f = str3;
        this.f185048g = dateTime;
        this.f185049h = dateTime2;
        this.f185050i = lVar;
        this.f185051j = str4;
        this.f185052k = z14;
        this.f185053l = z15;
        this.f185054m = z16;
        this.f185055n = z17;
        this.f185056o = list;
        this.f185057p = qVar;
        this.f185058q = z18;
        this.f185059r = lVar2;
        this.f185060t = mVar;
        this.f185061v = eVar;
        this.f185062w = cVar;
        this.f185063x = z19;
        this.f185064y = groupAnnouncementDTO;
        this.f185065z = str5;
        this.A = z24;
        this.B = str6;
        this.C = bVar;
        this.D = bool;
        this.E = str7;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, null, null, null, null, false, null, null, false, null, null, null, null, 536870911, null);
    }
}
