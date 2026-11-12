package com.garmin.android.apps.connectmobile.segments.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusCodes;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(SegmentLeaderboardFilterDTODeserializer.class)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001bB;\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO;", "Landroid/os/Parcelable;", "", "segmentUuid", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$f;", "usersGroup", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$e;", "gender", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$g;", "weightGroup", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$a;", "ageGroup", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$d;", "cyclingClass", "<init>", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$f;Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$e;Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$g;Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$a;Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$d;)V", "(Ljava/lang/String;)V", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "f", JWKParameterNames.RSA_EXPONENT, "g", "a", "d", "SegmentLeaderboardFilterDTODeserializer", "c", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentLeaderboardFilterDTO implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f41287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f41288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f41289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f41290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f41291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f41285i = new c(null);
    public static final Parcelable.Creator<SegmentLeaderboardFilterDTO> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$SegmentLeaderboardFilterDTODeserializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SegmentLeaderboardFilterDTODeserializer implements JsonSerializer<SegmentLeaderboardFilterDTO> {
        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO2 = segmentLeaderboardFilterDTO;
            segmentLeaderboardFilterDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(segmentLeaderboardFilterDTO2.b(), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$b", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$f[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$f[]) from 0x0044: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$f;", "", "", "displayResourceId", "displayDescriptionResourceId", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f {
        ALL(R.string.privacy_everyone, null),
        FOLLOWINGS_ONLY(R.string.privacy_setting_tagging_people_i_follow, Integer.valueOf(R.string.concept_my_friends_description)),
        CONNECTIONS_ONLY(R.string.privacy_my_connections, null),
        ME_ONLY(R.string.privacy_only_me, null);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f41319f;

        static {
            f41319f = new w13.c(fVarArr);
        }

        private f(int i14, Integer num) {
            super(str, i);
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f41318e.clone();
        }
    }

    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41328a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.ME_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.FOLLOWINGS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.CONNECTIONS_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41328a = iArr;
        }
    }

    public SegmentLeaderboardFilterDTO(Parcel parcel) {
        parcel.getClass();
        this.f41287b = f.ALL;
        this.f41288c = e.BOTH;
        this.f41289d = g.ALL;
        this.f41290e = a.ALL;
        this.f41291f = d.ALL;
        this.f41292g = -1;
        this.f41293h = 26;
        this.f41286a = parcel.readString();
        this.f41287b = (f) f.f41319f.get(parcel.readInt());
        this.f41288c = (e) e.f41311f.get(parcel.readInt());
        this.f41289d = (g) g.f41323h.get(parcel.readInt());
        this.f41290e = (a) a.f41297g.get(parcel.readInt());
        this.f41291f = (d) d.f41304g.get(parcel.readInt());
    }

    public final String b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f41286a;
        if (str != null) {
            jSONObject.put("segmentUuid", str);
            jSONObject.put("startingRowNumber", this.f41292g);
            jSONObject.put("numberPerPage", this.f41293h);
            int i14 = h.f41328a[this.f41287b.ordinal()];
            if (i14 == 1) {
                jSONObject.put("meOnly", true);
                String string = jSONObject.toString();
                string.getClass();
                return string;
            }
            if (i14 == 2) {
                jSONObject.put("followingsOnly", true);
            } else if (i14 != 3) {
                Unit unit = Unit.INSTANCE;
            } else {
                jSONObject.put("connectionsOnly", true);
            }
            e eVar = this.f41288c;
            if (eVar != e.BOTH) {
                jSONObject.put("gender", eVar.f41312a);
            }
            g gVar = this.f41289d;
            if (gVar != g.ALL) {
                jSONObject.put("weightMin", gVar.f41324a);
                jSONObject.put("weightMax", this.f41289d.f41325b);
            }
            a aVar = this.f41290e;
            if (aVar != a.ALL) {
                jSONObject.put("ageMin", aVar.f41298a);
                jSONObject.put("ageMax", this.f41290e.f41299b);
            }
            d dVar = this.f41291f;
            if (dVar != d.ALL) {
                jSONObject.put("cyclingClass", dVar.f41305a);
            }
        }
        String string2 = jSONObject.toString();
        string2.getClass();
        return string2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f41286a);
        parcel.writeInt(this.f41287b.ordinal());
        parcel.writeInt(this.f41288c.ordinal());
        parcel.writeInt(this.f41289d.ordinal());
        parcel.writeInt(this.f41290e.ordinal());
        parcel.writeInt(this.f41291f.ordinal());
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$a[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$a[]) from 0x007f: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$a;", "", "", "ageMin", "ageMax", "displayResourceId", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        ALL(-1, -1, R.string.lbl_age_group_all),
        /* JADX INFO: Fake field, exist only in values array */
        UNDER_18(0, 17, R.string.lbl_age_group_under_18),
        /* JADX INFO: Fake field, exist only in values array */
        AGE_18_24(18, 24, R.string.age_group_18_24),
        /* JADX INFO: Fake field, exist only in values array */
        AGE_25_34(25, 34, R.string.age_group_25_34),
        /* JADX INFO: Fake field, exist only in values array */
        AGE_35_44(35, 44, R.string.age_group_35_44),
        /* JADX INFO: Fake field, exist only in values array */
        AGE_45_54(45, 54, R.string.age_group_45_54),
        /* JADX INFO: Fake field, exist only in values array */
        AGE_55_64(55, 64, R.string.age_group_55_64),
        /* JADX INFO: Fake field, exist only in values array */
        AGE_65_PLUS(65, 120, R.string.age_group_65_plus);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0783a f41294d = new C0783a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f41297g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41300c;

        static {
            f41297g = new w13.c(new a[]{r0, new a(0, 17, R.string.lbl_age_group_under_18), new a(18, 24, R.string.age_group_18_24), new a(25, 34, R.string.age_group_25_34), new a(35, 44, R.string.age_group_35_44), new a(45, 54, R.string.age_group_45_54), new a(55, 64, R.string.age_group_55_64), new a(65, 120, R.string.age_group_65_plus)});
        }

        private a(int i14, int i15, int i16) {
            super(str, i);
            this.f41298a = i14;
            this.f41299b = i15;
            this.f41300c = i16;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f41296f.clone();
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0783a {
            public /* synthetic */ C0783a(j jVar) {
                this();
            }

            private C0783a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$d[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$d[]) from 0x0081: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$d;", "", "", "value", "displayResourceId", "categoryIndex", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        ALL(-1, R.string.lbl_cycling_class_all, -1),
        /* JADX INFO: Fake field, exist only in values array */
        RECREATIONAL(1, R.string.lbl_cycling_class_recreational, -1),
        /* JADX INFO: Fake field, exist only in values array */
        OPEN(7, R.string.lbl_cycling_class_open, -1),
        /* JADX INFO: Fake field, exist only in values array */
        CATEGORY_5(2, R.string.lbl_cycling_class_category, 5),
        /* JADX INFO: Fake field, exist only in values array */
        CATEGORY_4(3, R.string.lbl_cycling_class_category, 4),
        /* JADX INFO: Fake field, exist only in values array */
        CATEGORY_3(4, R.string.lbl_cycling_class_category, 3),
        /* JADX INFO: Fake field, exist only in values array */
        CATEGORY_2(5, R.string.lbl_cycling_class_category, 2),
        /* JADX INFO: Fake field, exist only in values array */
        CATEGORY_1(6, R.string.lbl_cycling_class_category, 1),
        /* JADX INFO: Fake field, exist only in values array */
        PRO(8, R.string.lbl_cycling_class_pro, -1);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f41301d = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f41304g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41307c;

        static {
            f41304g = new w13.c(new d[]{r0, new d(1, R.string.lbl_cycling_class_recreational, -1), new d(7, R.string.lbl_cycling_class_open, -1), new d(2, R.string.lbl_cycling_class_category, 5), new d(3, R.string.lbl_cycling_class_category, 4), new d(4, R.string.lbl_cycling_class_category, 3), new d(5, R.string.lbl_cycling_class_category, 2), new d(6, R.string.lbl_cycling_class_category, 1), new d(8, R.string.lbl_cycling_class_pro, -1)});
        }

        private d(int i14, int i15, int i16) {
            super(str, i);
            this.f41305a = i14;
            this.f41306b = i15;
            this.f41307c = i16;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f41303f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$d$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$e[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$e[]) from 0x0031: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$e;", "", "", "value", "", "displayResourceId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {
        BOTH("", R.string.lbl_both_genders),
        /* JADX INFO: Fake field, exist only in values array */
        MALE("male", R.string.lbl_men),
        /* JADX INFO: Fake field, exist only in values array */
        FEMALE("female", R.string.lbl_women);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41308c = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f41311f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41313b;

        static {
            f41311f = new w13.c(new e[]{r0, new e("male", R.string.lbl_men), new e("female", R.string.lbl_women)});
        }

        private e(String str, int i14) {
            super(str, i);
            this.f41312a = str;
            this.f41313b = i14;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f41310e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$e$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$g[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$g[]) from 0x00a1: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO$g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$g;", "", "", "weightMin", "weightMax", "metricDisplayResourceId", "statuteDisplayResourceId", "<init>", "(Ljava/lang/String;IIIII)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g {
        ALL(-1, -1, R.string.lbl_weight_group_all, R.string.lbl_weight_group_all),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_0_45(0, 45000, R.string.weight_group_0_45_metric, R.string.weight_group_0_99_statute),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_46_56(ModuleInstallStatusCodes.UNKNOWN_MODULE, 56000, R.string.weight_group_46_56_metric, R.string.weight_group_100_124_statute),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_57_68(57000, 68000, R.string.weight_group_57_68_metric, R.string.weight_group_125_149_statute),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_69_74(69000, 74000, R.string.weight_group_69_74_metric, R.string.weight_group_150_164_statute),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_75_81(75000, 81000, R.string.weight_group_75_81_metric, R.string.weight_group_165_179_statute),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_82_90(82000, 90000, R.string.weight_group_82_90_metric, R.string.weight_group_180_199_statute),
        /* JADX INFO: Fake field, exist only in values array */
        WEIGHT_90_PLUS(90000, 999000, R.string.weight_group_90_plus_metric, R.string.weight_group_200_plus_statute);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f41320e = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f41323h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f41327d;

        static {
            f41323h = new w13.c(new g[]{r0, new g(0, 45000, R.string.weight_group_0_45_metric, R.string.weight_group_0_99_statute), new g(ModuleInstallStatusCodes.UNKNOWN_MODULE, 56000, R.string.weight_group_46_56_metric, R.string.weight_group_100_124_statute), new g(57000, 68000, R.string.weight_group_57_68_metric, R.string.weight_group_125_149_statute), new g(69000, 74000, R.string.weight_group_69_74_metric, R.string.weight_group_150_164_statute), new g(75000, 81000, R.string.weight_group_75_81_metric, R.string.weight_group_165_179_statute), new g(82000, 90000, R.string.weight_group_82_90_metric, R.string.weight_group_180_199_statute), new g(90000, 999000, R.string.weight_group_90_plus_metric, R.string.weight_group_200_plus_statute)});
        }

        private g(int i14, int i15, int i16, int i17) {
            super(str, i);
            this.f41324a = i14;
            this.f41325b = i15;
            this.f41326c = i16;
            this.f41327d = i17;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f41322g.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$g$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO$c;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentLeaderboardFilterDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "SEGMENT_UUID", "Ljava/lang/String;", "GENDER", "WEIGHT_MIN", "WEIGHT_MAX", "AGE_MIN", "AGE_MAX", "CYCLING_CLASS", "FOLLOWINGS_ONLY", "CONNECTIONS_ONLY", "ME_ONLY", "STARTING_ROW_NUMBER", "NUMBER_PER_PAGE", "", "NO_CATEGORY_INDEX", "I", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        public static SegmentLeaderboardFilterDTO a(String str) {
            e eVar;
            g gVar;
            a aVar;
            d dVar;
            SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = new SegmentLeaderboardFilterDTO("");
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optBoolean("meOnly")) {
                f fVar = f.ME_ONLY;
                fVar.getClass();
                segmentLeaderboardFilterDTO.f41287b = fVar;
                return segmentLeaderboardFilterDTO;
            }
            if (jSONObject.optBoolean("followingsOnly")) {
                f fVar2 = f.FOLLOWINGS_ONLY;
                fVar2.getClass();
                segmentLeaderboardFilterDTO.f41287b = fVar2;
            }
            if (jSONObject.optBoolean("connectionsOnly")) {
                f fVar3 = f.CONNECTIONS_ONLY;
                fVar3.getClass();
                segmentLeaderboardFilterDTO.f41287b = fVar3;
            }
            e.a aVar2 = e.f41308c;
            String strOptString = jSONObject.optString("gender");
            strOptString.getClass();
            aVar2.getClass();
            w13.c cVar = e.f41311f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    eVar = e.BOTH;
                    break;
                }
                eVar = (e) bVarN.next();
            } while (!s.g(eVar.f41312a, strOptString));
            eVar.getClass();
            segmentLeaderboardFilterDTO.f41288c = eVar;
            g.a aVar3 = g.f41320e;
            int iOptInt = jSONObject.optInt("weightMin");
            int iOptInt2 = jSONObject.optInt("weightMax");
            aVar3.getClass();
            w13.c cVar2 = g.f41323h;
            p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            while (true) {
                if (!bVarN2.hasNext()) {
                    gVar = g.ALL;
                    break;
                }
                gVar = (g) bVarN2.next();
                if (gVar.f41324a == iOptInt && gVar.f41325b == iOptInt2) {
                    break;
                }
            }
            gVar.getClass();
            segmentLeaderboardFilterDTO.f41289d = gVar;
            a.C0783a c0783a = a.f41294d;
            int iOptInt3 = jSONObject.optInt("ageMin");
            int iOptInt4 = jSONObject.optInt("ageMax");
            c0783a.getClass();
            w13.c cVar3 = a.f41297g;
            p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
            while (true) {
                if (!bVarN3.hasNext()) {
                    aVar = a.ALL;
                    break;
                }
                aVar = (a) bVarN3.next();
                if (aVar.f41298a == iOptInt3 && aVar.f41299b == iOptInt4) {
                    break;
                }
            }
            aVar.getClass();
            segmentLeaderboardFilterDTO.f41290e = aVar;
            d.a aVar4 = d.f41301d;
            int iOptInt5 = jSONObject.optInt("cyclingClass");
            aVar4.getClass();
            w13.c cVar4 = d.f41304g;
            p13.c.b bVarN4 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
            while (bVarN4.hasNext()) {
                dVar = (d) bVarN4.next();
                if (dVar.f41305a == iOptInt5) {
                    dVar.getClass();
                    segmentLeaderboardFilterDTO.f41291f = dVar;
                    return segmentLeaderboardFilterDTO;
                }
            }
            dVar = d.ALL;
            dVar.getClass();
            segmentLeaderboardFilterDTO.f41291f = dVar;
            return segmentLeaderboardFilterDTO;
        }

        private c() {
        }
    }

    public SegmentLeaderboardFilterDTO(String str) {
        this.f41287b = f.ALL;
        this.f41288c = e.BOTH;
        this.f41289d = g.ALL;
        this.f41290e = a.ALL;
        this.f41291f = d.ALL;
        this.f41292g = -1;
        this.f41293h = 26;
        this.f41286a = str;
    }

    public SegmentLeaderboardFilterDTO() {
        this.f41287b = f.ALL;
        this.f41288c = e.BOTH;
        this.f41289d = g.ALL;
        this.f41290e = a.ALL;
        this.f41291f = d.ALL;
        this.f41292g = -1;
        this.f41293h = 26;
    }

    public SegmentLeaderboardFilterDTO(String str, f fVar, e eVar, g gVar, a aVar, d dVar) {
        fVar.getClass();
        eVar.getClass();
        gVar.getClass();
        aVar.getClass();
        dVar.getClass();
        this.f41287b = f.ALL;
        this.f41288c = e.BOTH;
        this.f41289d = g.ALL;
        this.f41290e = a.ALL;
        d.a aVar2 = d.f41301d;
        this.f41292g = -1;
        this.f41293h = 26;
        this.f41286a = str;
        this.f41287b = fVar;
        this.f41288c = eVar;
        this.f41289d = gVar;
        this.f41290e = aVar;
        this.f41291f = dVar;
    }
}
