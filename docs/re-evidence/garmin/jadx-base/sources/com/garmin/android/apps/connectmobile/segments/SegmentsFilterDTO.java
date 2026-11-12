package com.garmin.android.apps.connectmobile.segments;

import am.j;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.maps.MapboxMap;
import ds.e0;
import f12.l;
import i3.e5;
import java.lang.reflect.Type;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import xf1.e;
import xf1.f;
import xf1.o;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(SegmentsFilterDTODeserializer.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007B9\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO;", "Landroid/os/Parcelable;", "<init>", "()V", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "(II)V", "", "minLat", "maxLat", "minLon", "maxLon", "(DDDDII)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "d", "a", "SegmentsFilterDTODeserializer", "c", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentsFilterDTO implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f41190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f41191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f41192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f41193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f41196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f41199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f41200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f41201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f41202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f41203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f41188q = new c(null);
    public static final Parcelable.Creator<SegmentLeaderboardFilterDTO> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO$SegmentsFilterDTODeserializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SegmentsFilterDTODeserializer implements JsonSerializer<SegmentsFilterDTO> {
        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(SegmentsFilterDTO segmentsFilterDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            SegmentsFilterDTO segmentsFilterDTO2 = segmentsFilterDTO;
            segmentsFilterDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(segmentsFilterDTO2.b().toString(), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO$b", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SegmentLeaderboardFilterDTO> {
        @Override // android.os.Parcelable.Creator
        public final SegmentLeaderboardFilterDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SegmentLeaderboardFilterDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SegmentLeaderboardFilterDTO[] newArray(int i14) {
            return new SegmentLeaderboardFilterDTO[i14];
        }
    }

    public SegmentsFilterDTO(Parcel parcel) {
        parcel.getClass();
        this.f41196h = f.ACT_BOTH_RUNNING_AND_CYCLING;
        this.f41199k = true;
        this.f41200l = e.TYPE_ALL;
        this.f41201m = d.ALL;
        this.f41202n = a.ALL;
        this.f41203o = o.TYPE_ALL;
        this.f41189a = parcel.readString();
        this.f41190b = parcel.readDouble();
        this.f41191c = parcel.readDouble();
        this.f41192d = parcel.readDouble();
        this.f41193e = parcel.readDouble();
        this.f41194f = parcel.readInt();
        this.f41195g = parcel.readInt();
        this.f41196h = (f) f.f190681f.get(parcel.readInt());
        this.f41197i = parcel.readInt() == 1;
        this.f41198j = parcel.readInt() == 1;
        this.f41199k = parcel.readInt() == 1;
        this.f41200l = (e) e.f190675l.get(parcel.readInt());
        this.f41201m = (d) d.f41215g.get(parcel.readInt());
        this.f41202n = (a) a.f41208g.get(parcel.readInt());
        this.f41203o = (o) o.f190711j.get(parcel.readInt());
        this.f41204p = parcel.readInt() == 1;
    }

    public final JSONObject b() throws JSONException {
        double dG;
        double dG2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("minLat", this.f41190b);
        jSONObject.put("maxLat", this.f41191c);
        jSONObject.put("minLon", this.f41192d);
        jSONObject.put("maxLon", this.f41193e);
        int i14 = this.f41194f;
        if (i14 >= 0 && this.f41195g > 0) {
            jSONObject.put(TtmlNode.START, i14);
            jSONObject.put(MapboxMap.QFE_LIMIT, this.f41195g);
        }
        if (!TextUtils.isEmpty(this.f41189a)) {
            jSONObject.put("keyword", this.f41189a);
        }
        f fVar = this.f41196h;
        if (fVar != null) {
            jSONObject.put("activityTypePk", fVar.f190682a);
        }
        if (this.f41197i) {
            jSONObject.put("mineOnly", true);
        }
        if (this.f41198j) {
            jSONObject.put("myFavorites", true);
        }
        if (this.f41199k) {
            jSONObject.put("showFavorites", true);
        }
        if (this.f41201m != d.ALL) {
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            if (lVar.y()) {
                dG = this.f41201m.f41216a;
            } else {
                l3.a aVar = l3.f23124b;
                double d14 = this.f41201m.f41216a;
                m3 m3Var = m3.MILE;
                m3 m3Var2 = m3.KILOMETER;
                aVar.getClass();
                dG = l3.a.g(d14, m3Var, m3Var2);
            }
            jSONObject.put("minDistance", dG);
            if (lVar.y()) {
                dG2 = this.f41201m.f41217b;
            } else {
                l3.a aVar2 = l3.f23124b;
                double d15 = this.f41201m.f41217b;
                m3 m3Var3 = m3.MILE;
                m3 m3Var4 = m3.KILOMETER;
                aVar2.getClass();
                dG2 = l3.a.g(d15, m3Var3, m3Var4);
            }
            jSONObject.put("maxDistance", dG2);
        }
        a aVar3 = this.f41202n;
        if (aVar3 != a.ALL) {
            jSONObject.put("minGrade", aVar3.f41209a);
            jSONObject.put("maxGrade", this.f41202n.f41210b);
        }
        e eVar = this.f41200l;
        if (eVar != e.TYPE_ALL) {
            jSONObject.put("classificationPk", eVar.f190676a);
        }
        o oVar = this.f41203o;
        if (oVar != o.TYPE_ALL) {
            jSONObject.put("surfaceTypePk", oVar.f190712a);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f41189a;
        double d14 = this.f41190b;
        double d15 = this.f41191c;
        double d16 = this.f41192d;
        double d17 = this.f41193e;
        int i14 = this.f41194f;
        int i15 = this.f41195g;
        f fVar = this.f41196h;
        boolean z14 = this.f41197i;
        boolean z15 = this.f41198j;
        e eVar = this.f41200l;
        d dVar = this.f41201m;
        a aVar = this.f41202n;
        o oVar = this.f41203o;
        boolean z16 = this.f41204p;
        StringBuilder sb3 = new StringBuilder("SegmentsFilterDTO(keyWord=");
        sb3.append(str);
        sb3.append(", minLat=");
        sb3.append(d14);
        j.x(sb3, ", maxLat=", d15, ", minLon=");
        sb3.append(d16);
        j.x(sb3, ", maxLon=", d17, ", start=");
        e0.m(i14, i15, ", limit=", ", activityType=", sb3);
        sb3.append(fVar);
        sb3.append(", mMineOnly=");
        sb3.append(z14);
        sb3.append(", mMyFavorites=");
        kg.f.q(", mShowFavorites=", ", classificationType=", sb3, z15, this.f41199k);
        sb3.append(eVar);
        sb3.append(", distanceGroup=");
        sb3.append(dVar);
        sb3.append(", avgGradeGroup=");
        sb3.append(aVar);
        sb3.append(", surfaceType=");
        sb3.append(oVar);
        sb3.append(", isAdvancedOn=");
        return hb.a.k(sb3, z16, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f41189a);
        parcel.writeDouble(this.f41190b);
        parcel.writeDouble(this.f41191c);
        parcel.writeDouble(this.f41192d);
        parcel.writeDouble(this.f41193e);
        parcel.writeInt(this.f41194f);
        parcel.writeInt(this.f41195g);
        f fVar = this.f41196h;
        fVar.getClass();
        parcel.writeInt(fVar.ordinal());
        parcel.writeInt(this.f41197i ? 1 : 0);
        parcel.writeInt(this.f41198j ? 1 : 0);
        parcel.writeInt(this.f41199k ? 1 : 0);
        parcel.writeInt(this.f41200l.ordinal());
        parcel.writeInt(this.f41201m.ordinal());
        parcel.writeInt(this.f41202n.ordinal());
        parcel.writeInt(this.f41203o.ordinal());
        parcel.writeInt(this.f41204p ? 1 : 0);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO$a[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO$a[]) from 0x0059: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO$a;", "", "", "avgGradeMin", "avgGradeMax", "displayResourceId", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        ALL(-1, -1, R.string.lbl_surface_type_all),
        /* JADX INFO: Fake field, exist only in values array */
        UNDER_MINUS_15(Integer.MIN_VALUE, -15, -1),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_MINUS_15_TO_MINUS_5(-15, -5, -1),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_MINUS_5_TO_0(-5, 0, -1),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_0_TO_5(0, 5, -1),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_5_TO_15(5, 15, -1),
        /* JADX INFO: Fake field, exist only in values array */
        OVER_15(15, Integer.MAX_VALUE, -1);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0782a f41205d = new C0782a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f41208g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41211c;

        static {
            f41208g = new w13.c(new a[]{r0, new a(Integer.MIN_VALUE, -15, -1), new a(-15, -5, -1), new a(-5, 0, -1), new a(0, 5, -1), new a(5, 15, -1), new a(15, Integer.MAX_VALUE, -1)});
        }

        private a(int i14, int i15, int i16) {
            super(str, i);
            this.f41209a = i14;
            this.f41210b = i15;
            this.f41211c = i16;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f41207f.clone();
        }

        public final String a(Context context) {
            int i14 = this.f41211c;
            if (i14 != -1) {
                String string = context.getString(i14);
                string.getClass();
                return string;
            }
            int i15 = this.f41210b;
            int i16 = this.f41209a;
            if (i16 == Integer.MIN_VALUE) {
                l3.f23124b.getClass();
                return fb1.c.n("< ", l3.a.A0(context, i15, 0));
            }
            if (i15 == Integer.MAX_VALUE) {
                l3.f23124b.getClass();
                return fb1.c.n("> ", l3.a.A0(context, i16, 0));
            }
            l3.f23124b.getClass();
            return e5.g(l3.a.A0(context, i16, 0), " - ", l3.a.A0(context, i15, 0));
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO$a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0782a {
            public /* synthetic */ C0782a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0782a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO$d[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO$d[]) from 0x006a: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO$d;", "", "", "distanceMin", "distanceMax", "", "mLabelResId", "<init>", "(Ljava/lang/String;IDDI)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        ALL(-1.0d, -1.0d, R.string.lbl_surface_type_all),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_0_TO_05(-1.0d, 0.5d, -1),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_05_TO_2(0.5d, 2.0d, -1),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_2_TO_5(2.0d, 5.0d, -1),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_5_TO_10(5.0d, 10.0d, -1),
        /* JADX INFO: Fake field, exist only in values array */
        FROM_10_TO_20(10.0d, 20.0d, -1),
        /* JADX INFO: Fake field, exist only in values array */
        OVER_25(20.0d, 2.147483647E9d, -1);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f41212d = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f41215g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f41216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f41217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41218c;

        static {
            f41215g = new w13.c(new d[]{r0, new d(-1.0d, 0.5d, -1), new d(0.5d, 2.0d, -1), new d(2.0d, 5.0d, -1), new d(5.0d, 10.0d, -1), new d(10.0d, 20.0d, -1), new d(20.0d, 2.147483647E9d, -1)});
        }

        private d(double d14, double d15, int i14) {
            super(str, i);
            this.f41216a = d14;
            this.f41217b = d15;
            this.f41218c = i14;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f41214f.clone();
        }

        public final String a(Context context) {
            boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
            int i14 = this.f41218c;
            if (i14 != -1) {
                String string = context.getString(i14);
                string.getClass();
                return string;
            }
            l3.f23124b.getClass();
            String strE1 = l3.a.E1(context, zY, true);
            double d14 = this.f41217b;
            int i15 = (int) d14;
            double d15 = this.f41216a;
            if (i15 == Integer.MAX_VALUE) {
                return "> " + d15 + StringUtils.SPACE + strE1;
            }
            if (d15 == -1.0d) {
                return "< " + d14 + StringUtils.SPACE + strE1;
            }
            return d15 + StringUtils.SPACE + strE1 + " - " + d14 + StringUtils.SPACE + strE1;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO$d$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\n¨\u0006!"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/SegmentsFilterDTO$c;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "ACTIVITY_TYPE_PK", "Ljava/lang/String;", "CLASSIFICATION_PK", "GROUP_PK", "KEYWORD", "START", "LIMIT", "MAX_DISTANCE", "MAX_GRADE", "MAX_LAT", "MAX_LON", "MIN_DISTANCE", "MIN_GRADE", "MIN_LAT", "MIN_LON", "MINE_ONLY", "MY_FAVORITES", "SHOW_FAVORITES", "SURFACE_TYPE_PK", "ACTIVITY_ID", "COURSE_PK", "IS_ADVANCED_ON", "DISTANCE_GROUP_ORDINAL", "AVG_GRADE_ORDINAL", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static SegmentsFilterDTO a(String str) throws JSONException {
            d dVar;
            a aVar;
            o oVar;
            e eVar;
            f fVar;
            SegmentsFilterDTO segmentsFilterDTO = new SegmentsFilterDTO();
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("activityTypePk") && (fVar = f.f190678c.get(jSONObject.optInt("activityTypePk"))) != null) {
                segmentsFilterDTO.f41196h = fVar;
            }
            if (!jSONObject.isNull("classificationPk") && (eVar = e.f190667d.get(jSONObject.optInt("classificationPk"))) != null) {
                segmentsFilterDTO.f41200l = eVar;
            }
            if (!jSONObject.isNull("surfaceTypePk") && (oVar = o.f190704c.get(jSONObject.optInt("surfaceTypePk"))) != null) {
                segmentsFilterDTO.f41203o = oVar;
            }
            if (!jSONObject.isNull("avgGradeOrdinal")) {
                a.C0782a c0782a = a.f41205d;
                int i14 = jSONObject.getInt("avgGradeOrdinal");
                c0782a.getClass();
                w13.c cVar = a.f41208g;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                do {
                    if (!bVarN.hasNext()) {
                        aVar = a.ALL;
                        break;
                    }
                    aVar = (a) bVarN.next();
                } while (aVar.ordinal() != i14);
                aVar.getClass();
                segmentsFilterDTO.f41202n = aVar;
            }
            if (!jSONObject.isNull("distanceGroupOrdinal")) {
                d.a aVar2 = d.f41212d;
                int i15 = jSONObject.getInt("distanceGroupOrdinal");
                aVar2.getClass();
                w13.c cVar2 = d.f41215g;
                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                do {
                    if (!bVarN2.hasNext()) {
                        dVar = d.ALL;
                        break;
                    }
                    dVar = (d) bVarN2.next();
                } while (dVar.ordinal() != i15);
                dVar.getClass();
                segmentsFilterDTO.f41201m = dVar;
            }
            segmentsFilterDTO.f41189a = jSONObject.optString("keyword");
            segmentsFilterDTO.f41195g = jSONObject.optInt(MapboxMap.QFE_LIMIT);
            segmentsFilterDTO.f41191c = jSONObject.optDouble("maxLat");
            segmentsFilterDTO.f41193e = jSONObject.optDouble("maxLon");
            segmentsFilterDTO.f41197i = jSONObject.optBoolean("mineOnly");
            segmentsFilterDTO.f41190b = jSONObject.optDouble("minLat");
            segmentsFilterDTO.f41192d = jSONObject.optDouble("minLon");
            segmentsFilterDTO.f41198j = jSONObject.optBoolean("myFavorites");
            segmentsFilterDTO.f41194f = jSONObject.optInt(TtmlNode.START);
            segmentsFilterDTO.f41204p = jSONObject.optBoolean("isAdvancedOn");
            return segmentsFilterDTO;
        }

        private c() {
        }
    }

    public SegmentsFilterDTO(int i14, int i15) {
        this.f41196h = f.ACT_BOTH_RUNNING_AND_CYCLING;
        this.f41199k = true;
        this.f41200l = e.TYPE_ALL;
        this.f41201m = d.ALL;
        this.f41202n = a.ALL;
        this.f41203o = o.TYPE_ALL;
        this.f41194f = i14;
        this.f41195g = i15;
    }

    public SegmentsFilterDTO(double d14, double d15, double d16, double d17, int i14, int i15) {
        this.f41196h = f.ACT_BOTH_RUNNING_AND_CYCLING;
        this.f41199k = true;
        this.f41200l = e.TYPE_ALL;
        this.f41201m = d.ALL;
        this.f41202n = a.ALL;
        this.f41203o = o.TYPE_ALL;
        this.f41190b = d14;
        this.f41191c = d15;
        this.f41192d = d16;
        this.f41193e = d17;
        this.f41194f = i14;
        this.f41195g = i15;
    }

    public SegmentsFilterDTO() {
        this.f41196h = f.ACT_BOTH_RUNNING_AND_CYCLING;
        this.f41199k = true;
        this.f41200l = e.TYPE_ALL;
        this.f41201m = d.ALL;
        this.f41202n = a.ALL;
        this.f41203o = o.TYPE_ALL;
    }
}
