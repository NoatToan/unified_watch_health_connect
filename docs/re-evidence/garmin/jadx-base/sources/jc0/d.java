package jc0;

import b71.i;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i63.h;
import j20.x;
import java.util.List;
import l63.f;
import m63.e0;
import m63.g;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B\u0097\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b1\u00102BÝ\u0003\b\u0010\u0012\u0006\u00103\u001a\u00020\u000f\u0012\u0006\u00104\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b1\u00107¨\u0006;"}, d2 = {"Ljc0/d;", "", "", "appSupport", "", "applicationKey", "bestInClassCapable", "bestInClassVideoLink", "bluetoothClassicDevice", "bluetoothLowEnergyDevice", "", "deviceCategories", "deviceEmbedVideoLink", "deviceSettingsFile", "deviceTags", "", "deviceTypePk", "deviceTypeSimpleName", "deviceVideoPageLink", "displayOrder", "excludeCountries", "fitProductNumber", "floorsClimbedGoalCapable", "gcmSettingsFile", "golfAppPairingCapable", "golfAppSyncCapable", "golfDisplayOrder", "handednessCapable", "hasOpticalHeartRate", "hasPowerButton", "highlighted", "hybrid", "imageUrl", "includeCountries", "incompatibleApplications", "intensityMinutesGoalCapable", "minGCMAndroidVersion", "minGolfAppAndroidVersion", "moderateIntensityMinutesGoalCapable", "partNumber", "primary", "primaryApplication", "productDisplayName", "productSku", "supportsSecondaryUsers", "wasp", "weightScale", "wellness", "wifi", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "seen1", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final l<i63.c<Object>>[] R;
    public final String A;
    public final String B;
    public final List<String> C;
    public final Boolean D;
    public final Integer E;
    public final Integer F;
    public final Boolean G;
    public final String H;
    public final Boolean I;
    public final String J;
    public final String K;
    public final String L;
    public final Boolean M;
    public final Boolean N;
    public final Boolean O;
    public final Boolean P;
    public final Boolean Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f98133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f98135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f98136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f98137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f98138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f98139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f98140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f98141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f98142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f98143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f98144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f98145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f98146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f98147o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f98148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f98149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f98150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Boolean f98151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Boolean f98152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f98153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Boolean f98154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Boolean f98155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Boolean f98156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f98157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Boolean f98158z;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/devices/data/model/DeviceInfoDTO.$serializer", "Lm63/e0;", "Ljc0/d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f98159a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f98159a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.devices.data.model.DeviceInfoDTO", aVar, 43);
            m1Var.j("appSupport", true);
            m1Var.j("applicationKey", true);
            m1Var.j("bestInClassCapable", true);
            m1Var.j("bestInClassVideoLink", true);
            m1Var.j("bluetoothClassicDevice", true);
            m1Var.j("bluetoothLowEnergyDevice", true);
            m1Var.j("deviceCategories", true);
            m1Var.j("deviceEmbedVideoLink", true);
            m1Var.j("deviceSettingsFile", true);
            m1Var.j("deviceTags", true);
            m1Var.j("deviceTypePk", true);
            m1Var.j("deviceTypeSimpleName", true);
            m1Var.j("deviceVideoPageLink", true);
            m1Var.j("displayOrder", true);
            m1Var.j("excludeCountries", true);
            m1Var.j("fitProductNumber", true);
            m1Var.j("floorsClimbedGoalCapable", true);
            m1Var.j("gcmSettingsFile", true);
            m1Var.j("golfAppPairingCapable", true);
            m1Var.j("golfAppSyncCapable", true);
            m1Var.j("golfDisplayOrder", true);
            m1Var.j("handednessCapable", true);
            m1Var.j("hasOpticalHeartRate", true);
            m1Var.j("hasPowerButton", true);
            m1Var.j("highlighted", true);
            m1Var.j("hybrid", true);
            m1Var.j("imageUrl", true);
            m1Var.j("includeCountries", true);
            m1Var.j("incompatibleApplications", true);
            m1Var.j("intensityMinutesGoalCapable", true);
            m1Var.j("minGCMAndroidVersion", true);
            m1Var.j("minGolfAppAndroidVersion", true);
            m1Var.j("moderateIntensityMinutesGoalCapable", true);
            m1Var.j("partNumber", true);
            m1Var.j("primary", true);
            m1Var.j("primaryApplication", true);
            m1Var.j("productDisplayName", true);
            m1Var.j("productSku", true);
            m1Var.j("supportsSecondaryUsers", true);
            m1Var.j("wasp", true);
            m1Var.j("weightScale", true);
            m1Var.j("wellness", true);
            m1Var.j("wifi", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = d.R;
            g gVar = g.f116948a;
            i63.c<?> cVarD = j63.a.d(gVar);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            i63.c<?> cVarD3 = j63.a.d(gVar);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(gVar);
            i63.c<?> cVarD6 = j63.a.d(gVar);
            i63.c<?> cVarD7 = j63.a.d(lVarArr[6].getValue());
            i63.c<?> cVarD8 = j63.a.d(y1Var);
            i63.c<?> cVarD9 = j63.a.d(y1Var);
            i63.c<?> cVarD10 = j63.a.d(y1Var);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, cVarD7, cVarD8, cVarD9, cVarD10, j63.a.d(m0Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(m0Var), j63.a.d(y1Var), j63.a.d(m0Var), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(m0Var), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[28].getValue()), j63.a.d(gVar), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            int i14;
            int i15;
            int i16;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = d.R;
            int i17 = l63.c.f110557a;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            Boolean bool2 = null;
            String str3 = null;
            Integer num = null;
            Boolean bool3 = null;
            int i18 = 0;
            String str4 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Integer num2 = null;
            boolean z14 = true;
            Boolean bool8 = null;
            String str5 = null;
            Boolean bool9 = null;
            String str6 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            List list = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            Integer num3 = null;
            String str10 = null;
            String str11 = null;
            Integer num4 = null;
            int i19 = 0;
            String str12 = null;
            Integer num5 = null;
            Boolean bool12 = null;
            String str13 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Integer num6 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            String str14 = null;
            String str15 = null;
            List list2 = null;
            Boolean bool20 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        String str16 = str;
                        i14 = i19;
                        Unit unit = Unit.INSTANCE;
                        z14 = false;
                        bool = bool;
                        str = str16;
                        str5 = str5;
                        str12 = str12;
                        num2 = num2;
                        i19 = i14;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 0:
                        String str17 = str;
                        Integer num7 = num;
                        int i24 = i19;
                        String str18 = str12;
                        Boolean bool21 = bool;
                        str2 = str2;
                        Boolean bool22 = (Boolean) cVarC.v(eVar2, 0, g.f116948a, bool8);
                        int i25 = i24 | 1;
                        Unit unit2 = Unit.INSTANCE;
                        i19 = i25;
                        bool = bool21;
                        str12 = str18;
                        bool8 = bool22;
                        num = num7;
                        str = str17;
                        str5 = str5;
                        num2 = num2;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 1:
                        String str19 = str;
                        Integer num8 = num2;
                        int i26 = i19;
                        String str20 = (String) cVarC.v(eVar2, 1, y1.f117048a, str5);
                        i14 = i26 | 2;
                        Unit unit3 = Unit.INSTANCE;
                        bool9 = bool9;
                        bool = bool;
                        num2 = num8;
                        str5 = str20;
                        str12 = str12;
                        str = str19;
                        i19 = i14;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 2:
                        int i27 = i19;
                        String str21 = str12;
                        Boolean bool23 = bool;
                        Boolean bool24 = (Boolean) cVarC.v(eVar2, 2, g.f116948a, bool9);
                        int i28 = i27 | 4;
                        Unit unit4 = Unit.INSTANCE;
                        i19 = i28;
                        bool = bool23;
                        str12 = str21;
                        bool9 = bool24;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 3:
                        int i29 = i19;
                        String str22 = str12;
                        Boolean bool25 = bool;
                        String str23 = (String) cVarC.v(eVar2, 3, y1.f117048a, str6);
                        int i30 = i29 | 8;
                        Unit unit5 = Unit.INSTANCE;
                        i19 = i30;
                        bool = bool25;
                        str12 = str22;
                        str6 = str23;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 4:
                        int i34 = i19;
                        String str24 = str12;
                        Boolean bool26 = bool;
                        Boolean bool27 = (Boolean) cVarC.v(eVar2, 4, g.f116948a, bool10);
                        int i35 = i34 | 16;
                        Unit unit6 = Unit.INSTANCE;
                        i19 = i35;
                        bool = bool26;
                        str12 = str24;
                        bool10 = bool27;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 5:
                        Boolean bool28 = (Boolean) cVarC.v(eVar2, 5, g.f116948a, bool11);
                        i15 = i19 | 32;
                        Unit unit7 = Unit.INSTANCE;
                        bool11 = bool28;
                        str5 = str5;
                        bool = bool;
                        num2 = num2;
                        num = num;
                        str12 = str12;
                        i19 = i15;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 6:
                        int i36 = i19;
                        String str25 = str12;
                        Boolean bool29 = bool;
                        List list3 = (List) cVarC.v(eVar2, 6, lVarArr[6].getValue(), list);
                        int i37 = i36 | 64;
                        Unit unit8 = Unit.INSTANCE;
                        i19 = i37;
                        bool = bool29;
                        str12 = str25;
                        list = list3;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 7:
                        int i38 = i19;
                        String str26 = str12;
                        Boolean bool30 = bool;
                        String str27 = (String) cVarC.v(eVar2, 7, y1.f117048a, str7);
                        int i39 = i38 | 128;
                        Unit unit9 = Unit.INSTANCE;
                        i19 = i39;
                        bool = bool30;
                        str12 = str26;
                        str7 = str27;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 8:
                        int i44 = i19;
                        String str28 = str12;
                        Boolean bool31 = bool;
                        String str29 = (String) cVarC.v(eVar2, 8, y1.f117048a, str8);
                        int i45 = i44 | 256;
                        Unit unit10 = Unit.INSTANCE;
                        i19 = i45;
                        bool = bool31;
                        str12 = str28;
                        str8 = str29;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 9:
                        String str30 = (String) cVarC.v(eVar2, 9, y1.f117048a, str9);
                        i15 = i19 | 512;
                        Unit unit11 = Unit.INSTANCE;
                        str9 = str30;
                        str5 = str5;
                        bool = bool;
                        num2 = num2;
                        num = num;
                        str12 = str12;
                        i19 = i15;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 10:
                        int i46 = i19;
                        String str31 = str12;
                        Boolean bool32 = bool;
                        Integer num9 = (Integer) cVarC.v(eVar2, 10, m0.f116981a, num3);
                        int i47 = i46 | 1024;
                        Unit unit12 = Unit.INSTANCE;
                        i19 = i47;
                        bool = bool32;
                        str12 = str31;
                        num3 = num9;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 11:
                        int i48 = i19;
                        String str32 = str12;
                        Boolean bool33 = bool;
                        String str33 = (String) cVarC.v(eVar2, 11, y1.f117048a, str10);
                        int i49 = i48 | 2048;
                        Unit unit13 = Unit.INSTANCE;
                        i19 = i49;
                        bool = bool33;
                        str12 = str32;
                        str10 = str33;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 12:
                        int i54 = i19;
                        String str34 = str12;
                        Boolean bool34 = bool;
                        String str35 = (String) cVarC.v(eVar2, 12, y1.f117048a, str11);
                        int i55 = i54 | 4096;
                        Unit unit14 = Unit.INSTANCE;
                        i19 = i55;
                        bool = bool34;
                        str12 = str34;
                        str11 = str35;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 13:
                        String str36 = str12;
                        Integer num10 = (Integer) cVarC.v(eVar2, 13, m0.f116981a, num4);
                        Unit unit15 = Unit.INSTANCE;
                        i19 |= 8192;
                        bool = bool;
                        str12 = str36;
                        num4 = num10;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 14:
                        num2 = num2;
                        String str37 = (String) cVarC.v(eVar2, 14, y1.f117048a, str12);
                        i16 = i19 | 16384;
                        Unit unit16 = Unit.INSTANCE;
                        str12 = str37;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 15:
                        num2 = num2;
                        Integer num11 = (Integer) cVarC.v(eVar2, 15, m0.f116981a, num5);
                        i16 = i19 | 32768;
                        Unit unit17 = Unit.INSTANCE;
                        num5 = num11;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 16:
                        num2 = num2;
                        Boolean bool35 = (Boolean) cVarC.v(eVar2, 16, g.f116948a, bool12);
                        i16 = i19 | 65536;
                        Unit unit18 = Unit.INSTANCE;
                        bool12 = bool35;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 17:
                        str = str;
                        num = num;
                        num2 = num2;
                        String str38 = (String) cVarC.v(eVar2, 17, y1.f117048a, str13);
                        Unit unit19 = Unit.INSTANCE;
                        i19 |= 131072;
                        str13 = str38;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 18:
                        str = str;
                        num = num;
                        num2 = num2;
                        Boolean bool36 = (Boolean) cVarC.v(eVar2, 18, g.f116948a, bool13);
                        int i56 = i19 | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        Unit unit20 = Unit.INSTANCE;
                        i19 = i56;
                        bool13 = bool36;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 19:
                        num2 = num2;
                        Boolean bool37 = (Boolean) cVarC.v(eVar2, 19, g.f116948a, bool14);
                        i16 = i19 | 524288;
                        Unit unit21 = Unit.INSTANCE;
                        bool14 = bool37;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 20:
                        num2 = num2;
                        Integer num12 = (Integer) cVarC.v(eVar2, 20, m0.f116981a, num6);
                        i16 = i19 | ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        Unit unit22 = Unit.INSTANCE;
                        num6 = num12;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 21:
                        num2 = num2;
                        Boolean bool38 = (Boolean) cVarC.v(eVar2, 21, g.f116948a, bool15);
                        i16 = i19 | 2097152;
                        Unit unit23 = Unit.INSTANCE;
                        bool15 = bool38;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 22:
                        num2 = num2;
                        Boolean bool39 = (Boolean) cVarC.v(eVar2, 22, g.f116948a, bool16);
                        i16 = i19 | 4194304;
                        Unit unit24 = Unit.INSTANCE;
                        bool16 = bool39;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 23:
                        num2 = num2;
                        Boolean bool40 = (Boolean) cVarC.v(eVar2, 23, g.f116948a, bool17);
                        i16 = i19 | 8388608;
                        Unit unit25 = Unit.INSTANCE;
                        bool17 = bool40;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 24:
                        num2 = num2;
                        Boolean bool41 = (Boolean) cVarC.v(eVar2, 24, g.f116948a, bool18);
                        i16 = i19 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        Unit unit26 = Unit.INSTANCE;
                        bool18 = bool41;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 25:
                        num2 = num2;
                        Boolean bool42 = (Boolean) cVarC.v(eVar2, 25, g.f116948a, bool19);
                        i16 = i19 | 33554432;
                        Unit unit27 = Unit.INSTANCE;
                        bool19 = bool42;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 26:
                        num2 = num2;
                        String str39 = (String) cVarC.v(eVar2, 26, y1.f117048a, str14);
                        i16 = i19 | 67108864;
                        Unit unit28 = Unit.INSTANCE;
                        str14 = str39;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 27:
                        num2 = num2;
                        String str40 = (String) cVarC.v(eVar2, 27, y1.f117048a, str15);
                        i16 = i19 | 134217728;
                        Unit unit29 = Unit.INSTANCE;
                        str15 = str40;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 28:
                        num2 = num2;
                        List list4 = (List) cVarC.v(eVar2, 28, lVarArr[28].getValue(), list2);
                        i16 = i19 | 268435456;
                        Unit unit30 = Unit.INSTANCE;
                        list2 = list4;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 29:
                        num2 = num2;
                        Boolean bool43 = (Boolean) cVarC.v(eVar2, 29, g.f116948a, bool20);
                        i16 = i19 | 536870912;
                        Unit unit31 = Unit.INSTANCE;
                        bool20 = bool43;
                        i19 = i16;
                        num2 = num2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 30:
                        str = str;
                        num = num;
                        num2 = (Integer) cVarC.v(eVar2, 30, m0.f116981a, num2);
                        Unit unit32 = Unit.INSTANCE;
                        i19 |= 1073741824;
                        str2 = str2;
                        num = num;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 31:
                        Integer num13 = num2;
                        str = str;
                        num = (Integer) cVarC.v(eVar2, 31, m0.f116981a, num);
                        Unit unit33 = Unit.INSTANCE;
                        i19 |= Integer.MIN_VALUE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num13;
                        str = str;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 32:
                        bool2 = (Boolean) cVarC.v(eVar2, 32, g.f116948a, bool2);
                        i18 |= 1;
                        Unit unit34 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 33:
                        str2 = (String) cVarC.v(eVar2, 33, y1.f117048a, str2);
                        i18 |= 2;
                        Unit unit35 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 34:
                        bool = (Boolean) cVarC.v(eVar2, 34, g.f116948a, bool);
                        i18 |= 4;
                        Unit unit36 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 35:
                        str = (String) cVarC.v(eVar2, 35, y1.f117048a, str);
                        i18 |= 8;
                        Unit unit37 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 36:
                        str3 = (String) cVarC.v(eVar2, 36, y1.f117048a, str3);
                        i18 |= 16;
                        Unit unit38 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 37:
                        str4 = (String) cVarC.v(eVar2, 37, y1.f117048a, str4);
                        i18 |= 32;
                        Unit unit39 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 38:
                        bool4 = (Boolean) cVarC.v(eVar2, 38, g.f116948a, bool4);
                        i18 |= 64;
                        Unit unit310 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 39:
                        bool3 = (Boolean) cVarC.v(eVar2, 39, g.f116948a, bool3);
                        i18 |= 128;
                        Unit unit311 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 40:
                        bool5 = (Boolean) cVarC.v(eVar2, 40, g.f116948a, bool5);
                        i18 |= 256;
                        Unit unit312 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 41:
                        bool6 = (Boolean) cVarC.v(eVar2, 41, g.f116948a, bool6);
                        i18 |= 512;
                        Unit unit313 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    case 42:
                        bool7 = (Boolean) cVarC.v(eVar2, 42, g.f116948a, bool7);
                        i18 |= 1024;
                        Unit unit314 = Unit.INSTANCE;
                        str2 = str2;
                        str5 = str5;
                        num2 = num2;
                        num = num;
                        str2 = str2;
                        str5 = str5;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            String str41 = str;
            Integer num14 = num;
            Integer num15 = num2;
            String str42 = str5;
            Boolean bool44 = bool9;
            int i57 = i19;
            String str43 = str12;
            Boolean bool45 = bool;
            Boolean bool46 = bool8;
            cVarC.b(eVar2);
            return new d(i57, i18, bool46, str42, bool44, str6, bool10, bool11, list, str7, str8, str9, num3, str10, str11, num4, str43, num5, bool12, str13, bool13, bool14, num6, bool15, bool16, bool17, bool18, bool19, str14, str15, list2, bool20, num15, num14, bool2, str2, bool45, str41, str3, str4, bool4, bool3, bool5, bool6, bool7, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            d dVar = (d) obj;
            dVar.getClass();
            Boolean bool = dVar.Q;
            Boolean bool2 = dVar.P;
            Boolean bool3 = dVar.O;
            Boolean bool4 = dVar.N;
            Boolean bool5 = dVar.M;
            String str = dVar.L;
            String str2 = dVar.K;
            String str3 = dVar.J;
            Boolean bool6 = dVar.I;
            String str4 = dVar.H;
            Boolean bool7 = dVar.G;
            Integer num = dVar.F;
            Integer num2 = dVar.E;
            Boolean bool8 = dVar.D;
            List<String> list = dVar.C;
            String str5 = dVar.B;
            String str6 = dVar.A;
            Boolean bool9 = dVar.f98158z;
            Boolean bool10 = dVar.f98157y;
            Boolean bool11 = dVar.f98156x;
            Boolean bool12 = dVar.f98155w;
            Boolean bool13 = dVar.f98154v;
            Integer num3 = dVar.f98153u;
            Boolean bool14 = dVar.f98152t;
            Boolean bool15 = dVar.f98151s;
            String str7 = dVar.f98150r;
            Boolean bool16 = dVar.f98149q;
            Integer num4 = dVar.f98148p;
            String str8 = dVar.f98147o;
            Integer num5 = dVar.f98146n;
            String str9 = dVar.f98145m;
            String str10 = dVar.f98144l;
            Integer num6 = dVar.f98143k;
            String str11 = dVar.f98142j;
            String str12 = dVar.f98141i;
            String str13 = dVar.f98140h;
            List<String> list2 = dVar.f98139g;
            Boolean bool17 = dVar.f98138f;
            Boolean bool18 = dVar.f98137e;
            String str14 = dVar.f98136d;
            Boolean bool19 = dVar.f98135c;
            String str15 = dVar.f98134b;
            Boolean bool20 = dVar.f98133a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = d.R;
            if (dVarC.C(eVar) || bool20 != null) {
                dVarC.d(eVar, 0, g.f116948a, bool20);
            }
            if (dVarC.C(eVar) || str15 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str15);
            }
            if (dVarC.C(eVar) || bool19 != null) {
                dVarC.d(eVar, 2, g.f116948a, bool19);
            }
            if (dVarC.C(eVar) || str14 != null) {
                dVarC.d(eVar, 3, y1.f117048a, str14);
            }
            if (dVarC.C(eVar) || bool18 != null) {
                dVarC.d(eVar, 4, g.f116948a, bool18);
            }
            if (dVarC.C(eVar) || bool17 != null) {
                dVarC.d(eVar, 5, g.f116948a, bool17);
            }
            if (dVarC.C(eVar) || list2 != null) {
                dVarC.d(eVar, 6, lVarArr[6].getValue(), list2);
            }
            if (dVarC.C(eVar) || str13 != null) {
                dVarC.d(eVar, 7, y1.f117048a, str13);
            }
            if (dVarC.C(eVar) || str12 != null) {
                dVarC.d(eVar, 8, y1.f117048a, str12);
            }
            if (dVarC.C(eVar) || str11 != null) {
                dVarC.d(eVar, 9, y1.f117048a, str11);
            }
            if (dVarC.C(eVar) || num6 != null) {
                dVarC.d(eVar, 10, m0.f116981a, num6);
            }
            if (dVarC.C(eVar) || str10 != null) {
                dVarC.d(eVar, 11, y1.f117048a, str10);
            }
            if (dVarC.C(eVar) || str9 != 0) {
                dVarC.d(eVar, 12, y1.f117048a, str9);
            }
            if (dVarC.C(eVar) || num5 != 0) {
                dVarC.d(eVar, 13, m0.f116981a, num5);
            }
            if (dVarC.C(eVar) || str8 != null) {
                dVarC.d(eVar, 14, y1.f117048a, str8);
            }
            if (dVarC.C(eVar) || num4 != null) {
                dVarC.d(eVar, 15, m0.f116981a, num4);
            }
            if (dVarC.C(eVar) || bool16 != null) {
                dVarC.d(eVar, 16, g.f116948a, bool16);
            }
            if (dVarC.C(eVar) || str7 != null) {
                dVarC.d(eVar, 17, y1.f117048a, str7);
            }
            if (dVarC.C(eVar) || bool15 != null) {
                dVarC.d(eVar, 18, g.f116948a, bool15);
            }
            if (dVarC.C(eVar) || bool14 != null) {
                dVarC.d(eVar, 19, g.f116948a, bool14);
            }
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 20, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || bool13 != null) {
                dVarC.d(eVar, 21, g.f116948a, bool13);
            }
            if (dVarC.C(eVar) || bool12 != null) {
                dVarC.d(eVar, 22, g.f116948a, bool12);
            }
            if (dVarC.C(eVar) || bool11 != null) {
                dVarC.d(eVar, 23, g.f116948a, bool11);
            }
            if (dVarC.C(eVar) || bool10 != null) {
                dVarC.d(eVar, 24, g.f116948a, bool10);
            }
            if (dVarC.C(eVar) || bool9 != null) {
                dVarC.d(eVar, 25, g.f116948a, bool9);
            }
            if (dVarC.C(eVar) || str6 != null) {
                dVarC.d(eVar, 26, y1.f117048a, str6);
            }
            if (dVarC.C(eVar) || str5 != null) {
                dVarC.d(eVar, 27, y1.f117048a, str5);
            }
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 28, lVarArr[28].getValue(), list);
            }
            if (dVarC.C(eVar) || bool8 != null) {
                dVarC.d(eVar, 29, g.f116948a, bool8);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 30, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 31, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || bool7 != null) {
                dVarC.d(eVar, 32, g.f116948a, bool7);
            }
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 33, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || bool6 != null) {
                dVarC.d(eVar, 34, g.f116948a, bool6);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 35, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 36, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 37, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || bool5 != null) {
                dVarC.d(eVar, 38, g.f116948a, bool5);
            }
            if (dVarC.C(eVar) || bool4 != null) {
                dVarC.d(eVar, 39, g.f116948a, bool4);
            }
            if (dVarC.C(eVar) || bool3 != null) {
                dVarC.d(eVar, 40, g.f116948a, bool3);
            }
            if (dVarC.C(eVar) || bool2 != null) {
                dVarC.d(eVar, 41, g.f116948a, bool2);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 42, g.f116948a, bool);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        R = new l[]{null, null, null, null, null, null, m.a(nVar, new j21.f(17)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, m.a(nVar, new j21.f(18)), null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, Boolean bool4, List list, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, String str8, Integer num3, Boolean bool5, String str9, Boolean bool6, Boolean bool7, Integer num4, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str10, String str11, List list2, Boolean bool13, Integer num5, Integer num6, Boolean bool14, String str12, Boolean bool15, String str13, String str14, String str15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, int i14, int i15, j jVar) {
        Boolean bool21 = (i14 & 1) != 0 ? null : bool;
        this(bool21, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : bool2, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : bool3, (i14 & 32) != 0 ? null : bool4, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? null : str6, (i14 & 4096) != 0 ? null : str7, (i14 & 8192) != 0 ? null : num2, (i14 & 16384) != 0 ? null : str8, (i14 & 32768) != 0 ? null : num3, (i14 & 65536) != 0 ? null : bool5, (i14 & 131072) != 0 ? null : str9, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : bool6, (i14 & 524288) != 0 ? null : bool7, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num4, (i14 & 2097152) != 0 ? null : bool8, (i14 & 4194304) != 0 ? null : bool9, (i14 & 8388608) != 0 ? null : bool10, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool11, (i14 & 33554432) != 0 ? null : bool12, (i14 & 67108864) != 0 ? null : str10, (i14 & 134217728) != 0 ? null : str11, (i14 & 268435456) != 0 ? null : list2, (i14 & 536870912) != 0 ? null : bool13, (i14 & 1073741824) != 0 ? null : num5, (i14 & Integer.MIN_VALUE) != 0 ? null : num6, (i15 & 1) != 0 ? null : bool14, (i15 & 2) != 0 ? null : str12, (i15 & 4) != 0 ? null : bool15, (i15 & 8) != 0 ? null : str13, (i15 & 16) != 0 ? null : str14, (i15 & 32) != 0 ? null : str15, (i15 & 64) != 0 ? null : bool16, (i15 & 128) != 0 ? null : bool17, (i15 & 256) != 0 ? null : bool18, (i15 & 512) != 0 ? null : bool19, (i15 & 1024) != 0 ? null : bool20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f98133a, dVar.f98133a) && s.g(this.f98134b, dVar.f98134b) && s.g(this.f98135c, dVar.f98135c) && s.g(this.f98136d, dVar.f98136d) && s.g(this.f98137e, dVar.f98137e) && s.g(this.f98138f, dVar.f98138f) && s.g(this.f98139g, dVar.f98139g) && s.g(this.f98140h, dVar.f98140h) && s.g(this.f98141i, dVar.f98141i) && s.g(this.f98142j, dVar.f98142j) && s.g(this.f98143k, dVar.f98143k) && s.g(this.f98144l, dVar.f98144l) && s.g(this.f98145m, dVar.f98145m) && s.g(this.f98146n, dVar.f98146n) && s.g(this.f98147o, dVar.f98147o) && s.g(this.f98148p, dVar.f98148p) && s.g(this.f98149q, dVar.f98149q) && s.g(this.f98150r, dVar.f98150r) && s.g(this.f98151s, dVar.f98151s) && s.g(this.f98152t, dVar.f98152t) && s.g(this.f98153u, dVar.f98153u) && s.g(this.f98154v, dVar.f98154v) && s.g(this.f98155w, dVar.f98155w) && s.g(this.f98156x, dVar.f98156x) && s.g(this.f98157y, dVar.f98157y) && s.g(this.f98158z, dVar.f98158z) && s.g(this.A, dVar.A) && s.g(this.B, dVar.B) && s.g(this.C, dVar.C) && s.g(this.D, dVar.D) && s.g(this.E, dVar.E) && s.g(this.F, dVar.F) && s.g(this.G, dVar.G) && s.g(this.H, dVar.H) && s.g(this.I, dVar.I) && s.g(this.J, dVar.J) && s.g(this.K, dVar.K) && s.g(this.L, dVar.L) && s.g(this.M, dVar.M) && s.g(this.N, dVar.N) && s.g(this.O, dVar.O) && s.g(this.P, dVar.P) && s.g(this.Q, dVar.Q);
    }

    public final int hashCode() {
        Boolean bool = this.f98133a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f98134b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f98135c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f98136d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.f98137e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f98138f;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list = this.f98139g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f98140h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f98141i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f98142j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f98143k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f98144l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f98145m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.f98146n;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.f98147o;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.f98148p;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool5 = this.f98149q;
        int iHashCode17 = (iHashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str9 = this.f98150r;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool6 = this.f98151s;
        int iHashCode19 = (iHashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f98152t;
        int iHashCode20 = (iHashCode19 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num4 = this.f98153u;
        int iHashCode21 = (iHashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool8 = this.f98154v;
        int iHashCode22 = (iHashCode21 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f98155w;
        int iHashCode23 = (iHashCode22 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.f98156x;
        int iHashCode24 = (iHashCode23 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.f98157y;
        int iHashCode25 = (iHashCode24 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.f98158z;
        int iHashCode26 = (iHashCode25 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str10 = this.A;
        int iHashCode27 = (iHashCode26 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.B;
        int iHashCode28 = (iHashCode27 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<String> list2 = this.C;
        int iHashCode29 = (iHashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool13 = this.D;
        int iHashCode30 = (iHashCode29 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Integer num5 = this.E;
        int iHashCode31 = (iHashCode30 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.F;
        int iHashCode32 = (iHashCode31 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool14 = this.G;
        int iHashCode33 = (iHashCode32 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        String str12 = this.H;
        int iHashCode34 = (iHashCode33 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool15 = this.I;
        int iHashCode35 = (iHashCode34 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        String str13 = this.J;
        int iHashCode36 = (iHashCode35 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.K;
        int iHashCode37 = (iHashCode36 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.L;
        int iHashCode38 = (iHashCode37 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool16 = this.M;
        int iHashCode39 = (iHashCode38 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.N;
        int iHashCode40 = (iHashCode39 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.O;
        int iHashCode41 = (iHashCode40 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.P;
        int iHashCode42 = (iHashCode41 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.Q;
        return iHashCode42 + (bool20 != null ? bool20.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceInfoDTO(appSupport=");
        sb3.append(this.f98133a);
        sb3.append(", applicationKey=");
        sb3.append(this.f98134b);
        sb3.append(", bestInClassCapable=");
        i.s(sb3, this.f98135c, ", bestInClassVideoLink=", this.f98136d, ", bluetoothClassicDevice=");
        i.o(this.f98137e, this.f98138f, ", bluetoothLowEnergyDevice=", ", deviceCategories=", sb3);
        o2.c.n(", deviceEmbedVideoLink=", this.f98140h, ", deviceSettingsFile=", sb3, this.f98139g);
        sn.a.t(sb3, this.f98141i, ", deviceTags=", this.f98142j, ", deviceTypePk=");
        p6.b.l(this.f98143k, ", deviceTypeSimpleName=", this.f98144l, ", deviceVideoPageLink=", sb3);
        fb1.c.u(this.f98146n, this.f98145m, ", displayOrder=", ", excludeCountries=", sb3);
        fb1.c.u(this.f98148p, this.f98147o, ", fitProductNumber=", ", floorsClimbedGoalCapable=", sb3);
        i.s(sb3, this.f98149q, ", gcmSettingsFile=", this.f98150r, ", golfAppPairingCapable=");
        i.o(this.f98151s, this.f98152t, ", golfAppSyncCapable=", ", golfDisplayOrder=", sb3);
        kg.f.r(sb3, this.f98153u, ", handednessCapable=", this.f98154v, ", hasOpticalHeartRate=");
        i.o(this.f98155w, this.f98156x, ", hasPowerButton=", ", highlighted=", sb3);
        i.o(this.f98157y, this.f98158z, ", hybrid=", ", imageUrl=", sb3);
        sn.a.t(sb3, this.A, ", includeCountries=", this.B, ", incompatibleApplications=");
        sb3.append(this.C);
        sb3.append(", intensityMinutesGoalCapable=");
        sb3.append(this.D);
        sb3.append(", minGCMAndroidVersion=");
        x.m(sb3, this.E, ", minGolfAppAndroidVersion=", this.F, ", moderateIntensityMinutesGoalCapable=");
        i.s(sb3, this.G, ", partNumber=", this.H, ", primary=");
        i.s(sb3, this.I, ", primaryApplication=", this.J, ", productDisplayName=");
        sn.a.t(sb3, this.K, ", productSku=", this.L, ", supportsSecondaryUsers=");
        i.o(this.M, this.N, ", wasp=", ", weightScale=", sb3);
        i.o(this.O, this.P, ", wellness=", ", wifi=", sb3);
        return p6.b.f(sb3, this.Q, ")");
    }

    /* JADX INFO: renamed from: jc0.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljc0/d$b;", "", "<init>", "()V", "Li63/c;", "Ljc0/d;", "serializer", "()Li63/c;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f98159a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(int i14, int i15, Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, Boolean bool4, List list, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, String str8, Integer num3, Boolean bool5, String str9, Boolean bool6, Boolean bool7, Integer num4, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str10, String str11, List list2, Boolean bool13, Integer num5, Integer num6, Boolean bool14, String str12, Boolean bool15, String str13, String str14, String str15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f98133a = null;
        } else {
            this.f98133a = bool;
        }
        if ((i14 & 2) == 0) {
            this.f98134b = null;
        } else {
            this.f98134b = str;
        }
        if ((i14 & 4) == 0) {
            this.f98135c = null;
        } else {
            this.f98135c = bool2;
        }
        if ((i14 & 8) == 0) {
            this.f98136d = null;
        } else {
            this.f98136d = str2;
        }
        if ((i14 & 16) == 0) {
            this.f98137e = null;
        } else {
            this.f98137e = bool3;
        }
        if ((i14 & 32) == 0) {
            this.f98138f = null;
        } else {
            this.f98138f = bool4;
        }
        if ((i14 & 64) == 0) {
            this.f98139g = null;
        } else {
            this.f98139g = list;
        }
        if ((i14 & 128) == 0) {
            this.f98140h = null;
        } else {
            this.f98140h = str3;
        }
        if ((i14 & 256) == 0) {
            this.f98141i = null;
        } else {
            this.f98141i = str4;
        }
        if ((i14 & 512) == 0) {
            this.f98142j = null;
        } else {
            this.f98142j = str5;
        }
        if ((i14 & 1024) == 0) {
            this.f98143k = null;
        } else {
            this.f98143k = num;
        }
        if ((i14 & 2048) == 0) {
            this.f98144l = null;
        } else {
            this.f98144l = str6;
        }
        if ((i14 & 4096) == 0) {
            this.f98145m = null;
        } else {
            this.f98145m = str7;
        }
        if ((i14 & 8192) == 0) {
            this.f98146n = null;
        } else {
            this.f98146n = num2;
        }
        if ((i14 & 16384) == 0) {
            this.f98147o = null;
        } else {
            this.f98147o = str8;
        }
        if ((32768 & i14) == 0) {
            this.f98148p = null;
        } else {
            this.f98148p = num3;
        }
        if ((65536 & i14) == 0) {
            this.f98149q = null;
        } else {
            this.f98149q = bool5;
        }
        if ((131072 & i14) == 0) {
            this.f98150r = null;
        } else {
            this.f98150r = str9;
        }
        if ((262144 & i14) == 0) {
            this.f98151s = null;
        } else {
            this.f98151s = bool6;
        }
        if ((524288 & i14) == 0) {
            this.f98152t = null;
        } else {
            this.f98152t = bool7;
        }
        if ((1048576 & i14) == 0) {
            this.f98153u = null;
        } else {
            this.f98153u = num4;
        }
        if ((2097152 & i14) == 0) {
            this.f98154v = null;
        } else {
            this.f98154v = bool8;
        }
        if ((4194304 & i14) == 0) {
            this.f98155w = null;
        } else {
            this.f98155w = bool9;
        }
        if ((8388608 & i14) == 0) {
            this.f98156x = null;
        } else {
            this.f98156x = bool10;
        }
        if ((16777216 & i14) == 0) {
            this.f98157y = null;
        } else {
            this.f98157y = bool11;
        }
        if ((33554432 & i14) == 0) {
            this.f98158z = null;
        } else {
            this.f98158z = bool12;
        }
        if ((67108864 & i14) == 0) {
            this.A = null;
        } else {
            this.A = str10;
        }
        if ((134217728 & i14) == 0) {
            this.B = null;
        } else {
            this.B = str11;
        }
        if ((268435456 & i14) == 0) {
            this.C = null;
        } else {
            this.C = list2;
        }
        if ((536870912 & i14) == 0) {
            this.D = null;
        } else {
            this.D = bool13;
        }
        if ((1073741824 & i14) == 0) {
            this.E = null;
        } else {
            this.E = num5;
        }
        if ((i14 & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = num6;
        }
        if ((i15 & 1) == 0) {
            this.G = null;
        } else {
            this.G = bool14;
        }
        if ((i15 & 2) == 0) {
            this.H = null;
        } else {
            this.H = str12;
        }
        if ((i15 & 4) == 0) {
            this.I = null;
        } else {
            this.I = bool15;
        }
        if ((i15 & 8) == 0) {
            this.J = null;
        } else {
            this.J = str13;
        }
        if ((i15 & 16) == 0) {
            this.K = null;
        } else {
            this.K = str14;
        }
        if ((i15 & 32) == 0) {
            this.L = null;
        } else {
            this.L = str15;
        }
        if ((i15 & 64) == 0) {
            this.M = null;
        } else {
            this.M = bool16;
        }
        if ((i15 & 128) == 0) {
            this.N = null;
        } else {
            this.N = bool17;
        }
        if ((i15 & 256) == 0) {
            this.O = null;
        } else {
            this.O = bool18;
        }
        if ((i15 & 512) == 0) {
            this.P = null;
        } else {
            this.P = bool19;
        }
        if ((i15 & 1024) == 0) {
            this.Q = null;
        } else {
            this.Q = bool20;
        }
    }

    public d(Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, Boolean bool4, List<String> list, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, String str8, Integer num3, Boolean bool5, String str9, Boolean bool6, Boolean bool7, Integer num4, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str10, String str11, List<String> list2, Boolean bool13, Integer num5, Integer num6, Boolean bool14, String str12, Boolean bool15, String str13, String str14, String str15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20) {
        this.f98133a = bool;
        this.f98134b = str;
        this.f98135c = bool2;
        this.f98136d = str2;
        this.f98137e = bool3;
        this.f98138f = bool4;
        this.f98139g = list;
        this.f98140h = str3;
        this.f98141i = str4;
        this.f98142j = str5;
        this.f98143k = num;
        this.f98144l = str6;
        this.f98145m = str7;
        this.f98146n = num2;
        this.f98147o = str8;
        this.f98148p = num3;
        this.f98149q = bool5;
        this.f98150r = str9;
        this.f98151s = bool6;
        this.f98152t = bool7;
        this.f98153u = num4;
        this.f98154v = bool8;
        this.f98155w = bool9;
        this.f98156x = bool10;
        this.f98157y = bool11;
        this.f98158z = bool12;
        this.A = str10;
        this.B = str11;
        this.C = list2;
        this.D = bool13;
        this.E = num5;
        this.F = num6;
        this.G = bool14;
        this.H = str12;
        this.I = bool15;
        this.J = str13;
        this.K = str14;
        this.L = str15;
        this.M = bool16;
        this.N = bool17;
        this.O = bool18;
        this.P = bool19;
        this.Q = bool20;
    }

    public d() {
        this((Boolean) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (List) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (List) null, (Boolean) null, (Integer) null, (Integer) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, -1, 2047, (j) null);
    }
}
