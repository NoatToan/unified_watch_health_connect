package z80;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B\u008b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b0\u00101BÓ\u0003\b\u0010\u0012\u0006\u00102\u001a\u00020\u000f\u0012\u0006\u00103\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b0\u00106¨\u0006:"}, d2 = {"Lz80/e;", "", "", "appSupport", "", "applicationKey", "bestInClassCapable", "bestInClassVideoLink", "bluetoothClassicDevice", "bluetoothLowEnergyDevice", "", "deviceCategories", "deviceEmbedVideoLink", "deviceSettingsFile", "deviceTags", "", "deviceTypePk", "deviceVideoPageLink", "displayOrder", "excludeCountries", "fitProductNumber", "floorsClimbedGoalCapable", "gcmSettingsFile", "golfAppPairingCapable", "golfAppSyncCapable", "golfDisplayOrder", "handednessCapable", "hasOpticalHeartRate", "hasPowerButton", "highlighted", "hybrid", "imageUrl", "includeCountries", "incompatibleApplications", "intensityMinutesGoalCapable", "minGCMAndroidVersion", "minGolfAppAndroidVersion", "moderateIntensityMinutesGoalCapable", "partNumber", "primary", "primaryApplication", "productDisplayName", "productSku", "supportsSecondaryUsers", "wasp", "weightScale", "wellness", "wifi", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "seen1", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final o13.l<i63.c<Object>>[] Q;
    public final String A;
    public final List<String> B;
    public final Boolean C;
    public final Integer D;
    public final Integer E;
    public final Boolean F;
    public final String G;
    public final Boolean H;
    public final String I;
    public final String J;
    public final String K;
    public final Boolean L;
    public final Boolean M;
    public final Boolean N;
    public final Boolean O;
    public final Boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f203015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f203017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f203018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f203019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f203020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f203021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f203022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f203023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f203024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f203025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f203026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f203027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f203028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f203029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f203030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f203031q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f203032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Boolean f203033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f203034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Boolean f203035u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Boolean f203036v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Boolean f203037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Boolean f203038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f203039y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f203040z;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/data/model/DeviceInfoDTO.$serializer", "Lm63/e0;", "Lz80/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f203041a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f203041a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.data.model.DeviceInfoDTO", aVar, 42);
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
            o13.l<i63.c<Object>>[] lVarArr = e.Q;
            m63.g gVar = m63.g.f116948a;
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
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, cVarD7, cVarD8, cVarD9, cVarD10, j63.a.d(m0Var), j63.a.d(y1Var), j63.a.d(m0Var), j63.a.d(y1Var), j63.a.d(m0Var), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(m0Var), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[27].getValue()), j63.a.d(gVar), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            int i14;
            int i15;
            int i16;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = e.Q;
            int i17 = l63.c.f110557a;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            int i18 = 0;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Integer num = null;
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
            Integer num4 = null;
            String str11 = null;
            int i19 = 0;
            Integer num5 = null;
            Boolean bool12 = null;
            String str12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Integer num6 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            String str13 = null;
            String str14 = null;
            List list2 = null;
            Boolean bool20 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        String str15 = str;
                        i14 = i19;
                        Unit unit = Unit.INSTANCE;
                        z14 = false;
                        str2 = str2;
                        str = str15;
                        str5 = str5;
                        num5 = num5;
                        num2 = num2;
                        i19 = i14;
                        num = num;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 0:
                        String str16 = str;
                        Integer num7 = num;
                        int i24 = i19;
                        Integer num8 = num5;
                        String str17 = str2;
                        bool = bool;
                        Boolean bool21 = (Boolean) cVarC.v(eVar2, 0, m63.g.f116948a, bool8);
                        int i25 = i24 | 1;
                        Unit unit2 = Unit.INSTANCE;
                        i19 = i25;
                        str2 = str17;
                        num5 = num8;
                        bool8 = bool21;
                        num = num7;
                        str = str16;
                        str5 = str5;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 1:
                        String str18 = str;
                        Integer num9 = num2;
                        int i26 = i19;
                        String str19 = (String) cVarC.v(eVar2, 1, y1.f117048a, str5);
                        i14 = i26 | 2;
                        Unit unit3 = Unit.INSTANCE;
                        bool9 = bool9;
                        str2 = str2;
                        num2 = num9;
                        str5 = str19;
                        num5 = num5;
                        str = str18;
                        i19 = i14;
                        num = num;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 2:
                        int i27 = i19;
                        Integer num10 = num5;
                        String str20 = str2;
                        Boolean bool22 = (Boolean) cVarC.v(eVar2, 2, m63.g.f116948a, bool9);
                        int i28 = i27 | 4;
                        Unit unit4 = Unit.INSTANCE;
                        i19 = i28;
                        str2 = str20;
                        num5 = num10;
                        bool9 = bool22;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 3:
                        int i29 = i19;
                        Integer num11 = num5;
                        String str21 = str2;
                        String str22 = (String) cVarC.v(eVar2, 3, y1.f117048a, str6);
                        int i30 = i29 | 8;
                        Unit unit5 = Unit.INSTANCE;
                        i19 = i30;
                        str2 = str21;
                        num5 = num11;
                        str6 = str22;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 4:
                        int i34 = i19;
                        Integer num12 = num5;
                        String str23 = str2;
                        Boolean bool23 = (Boolean) cVarC.v(eVar2, 4, m63.g.f116948a, bool10);
                        int i35 = i34 | 16;
                        Unit unit6 = Unit.INSTANCE;
                        i19 = i35;
                        str2 = str23;
                        num5 = num12;
                        bool10 = bool23;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 5:
                        Boolean bool24 = (Boolean) cVarC.v(eVar2, 5, m63.g.f116948a, bool11);
                        i15 = i19 | 32;
                        Unit unit7 = Unit.INSTANCE;
                        bool11 = bool24;
                        str5 = str5;
                        str2 = str2;
                        num = num;
                        num2 = num2;
                        num5 = num5;
                        i19 = i15;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 6:
                        int i36 = i19;
                        Integer num13 = num5;
                        String str24 = str2;
                        List list3 = (List) cVarC.v(eVar2, 6, lVarArr[6].getValue(), list);
                        int i37 = i36 | 64;
                        Unit unit8 = Unit.INSTANCE;
                        i19 = i37;
                        str2 = str24;
                        num5 = num13;
                        list = list3;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 7:
                        int i38 = i19;
                        Integer num14 = num5;
                        String str25 = str2;
                        String str26 = (String) cVarC.v(eVar2, 7, y1.f117048a, str7);
                        int i39 = i38 | 128;
                        Unit unit9 = Unit.INSTANCE;
                        i19 = i39;
                        str2 = str25;
                        num5 = num14;
                        str7 = str26;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 8:
                        int i44 = i19;
                        Integer num15 = num5;
                        String str27 = str2;
                        String str28 = (String) cVarC.v(eVar2, 8, y1.f117048a, str8);
                        int i45 = i44 | 256;
                        Unit unit10 = Unit.INSTANCE;
                        i19 = i45;
                        str2 = str27;
                        num5 = num15;
                        str8 = str28;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 9:
                        String str29 = (String) cVarC.v(eVar2, 9, y1.f117048a, str9);
                        i15 = i19 | 512;
                        Unit unit11 = Unit.INSTANCE;
                        str9 = str29;
                        str5 = str5;
                        str2 = str2;
                        num = num;
                        num2 = num2;
                        num5 = num5;
                        i19 = i15;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 10:
                        int i46 = i19;
                        Integer num16 = num5;
                        String str30 = str2;
                        Integer num17 = (Integer) cVarC.v(eVar2, 10, m0.f116981a, num3);
                        int i47 = i46 | 1024;
                        Unit unit12 = Unit.INSTANCE;
                        i19 = i47;
                        str2 = str30;
                        num5 = num16;
                        num3 = num17;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 11:
                        int i48 = i19;
                        Integer num18 = num5;
                        String str31 = str2;
                        String str32 = (String) cVarC.v(eVar2, 11, y1.f117048a, str10);
                        int i49 = i48 | 2048;
                        Unit unit13 = Unit.INSTANCE;
                        i19 = i49;
                        str2 = str31;
                        num5 = num18;
                        str10 = str32;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 12:
                        int i54 = i19;
                        Integer num19 = num5;
                        String str33 = str2;
                        Integer num20 = (Integer) cVarC.v(eVar2, 12, m0.f116981a, num4);
                        int i55 = i54 | 4096;
                        Unit unit14 = Unit.INSTANCE;
                        i19 = i55;
                        str2 = str33;
                        num5 = num19;
                        num4 = num20;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 13:
                        Integer num21 = num5;
                        String str34 = (String) cVarC.v(eVar2, 13, y1.f117048a, str11);
                        Unit unit15 = Unit.INSTANCE;
                        i19 |= 8192;
                        str2 = str2;
                        num5 = num21;
                        str11 = str34;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 14:
                        num = num;
                        Integer num22 = (Integer) cVarC.v(eVar2, 14, m0.f116981a, num5);
                        i16 = i19 | 16384;
                        Unit unit16 = Unit.INSTANCE;
                        num5 = num22;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 15:
                        num = num;
                        Boolean bool25 = (Boolean) cVarC.v(eVar2, 15, m63.g.f116948a, bool12);
                        i16 = i19 | 32768;
                        Unit unit17 = Unit.INSTANCE;
                        bool12 = bool25;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 16:
                        str = str;
                        num = num;
                        num2 = num2;
                        String str35 = (String) cVarC.v(eVar2, 16, y1.f117048a, str12);
                        Unit unit18 = Unit.INSTANCE;
                        i19 |= 65536;
                        str12 = str35;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 17:
                        str = str;
                        num = num;
                        num2 = num2;
                        Boolean bool26 = (Boolean) cVarC.v(eVar2, 17, m63.g.f116948a, bool13);
                        Unit unit19 = Unit.INSTANCE;
                        i19 |= 131072;
                        bool13 = bool26;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 18:
                        num = num;
                        Boolean bool27 = (Boolean) cVarC.v(eVar2, 18, m63.g.f116948a, bool14);
                        i16 = i19 | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        Unit unit20 = Unit.INSTANCE;
                        bool14 = bool27;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 19:
                        num = num;
                        Integer num23 = (Integer) cVarC.v(eVar2, 19, m0.f116981a, num6);
                        i16 = i19 | 524288;
                        Unit unit21 = Unit.INSTANCE;
                        num6 = num23;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 20:
                        num = num;
                        Boolean bool28 = (Boolean) cVarC.v(eVar2, 20, m63.g.f116948a, bool15);
                        i16 = i19 | ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        Unit unit22 = Unit.INSTANCE;
                        bool15 = bool28;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 21:
                        num = num;
                        Boolean bool29 = (Boolean) cVarC.v(eVar2, 21, m63.g.f116948a, bool16);
                        i16 = i19 | 2097152;
                        Unit unit23 = Unit.INSTANCE;
                        bool16 = bool29;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 22:
                        num = num;
                        Boolean bool30 = (Boolean) cVarC.v(eVar2, 22, m63.g.f116948a, bool17);
                        i16 = i19 | 4194304;
                        Unit unit24 = Unit.INSTANCE;
                        bool17 = bool30;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 23:
                        num = num;
                        Boolean bool31 = (Boolean) cVarC.v(eVar2, 23, m63.g.f116948a, bool18);
                        i16 = i19 | 8388608;
                        Unit unit25 = Unit.INSTANCE;
                        bool18 = bool31;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 24:
                        num = num;
                        Boolean bool32 = (Boolean) cVarC.v(eVar2, 24, m63.g.f116948a, bool19);
                        i16 = i19 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        Unit unit26 = Unit.INSTANCE;
                        bool19 = bool32;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 25:
                        num = num;
                        String str36 = (String) cVarC.v(eVar2, 25, y1.f117048a, str13);
                        i16 = i19 | 33554432;
                        Unit unit27 = Unit.INSTANCE;
                        str13 = str36;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 26:
                        num = num;
                        String str37 = (String) cVarC.v(eVar2, 26, y1.f117048a, str14);
                        i16 = i19 | 67108864;
                        Unit unit28 = Unit.INSTANCE;
                        str14 = str37;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 27:
                        num = num;
                        List list4 = (List) cVarC.v(eVar2, 27, lVarArr[27].getValue(), list2);
                        i16 = i19 | 134217728;
                        Unit unit29 = Unit.INSTANCE;
                        list2 = list4;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 28:
                        num = num;
                        Boolean bool33 = (Boolean) cVarC.v(eVar2, 28, m63.g.f116948a, bool20);
                        i16 = i19 | 268435456;
                        Unit unit30 = Unit.INSTANCE;
                        bool20 = bool33;
                        i19 = i16;
                        num = num;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 29:
                        str = str;
                        num2 = num2;
                        num = (Integer) cVarC.v(eVar2, 29, m0.f116981a, num);
                        Unit unit31 = Unit.INSTANCE;
                        i19 |= 536870912;
                        bool = bool;
                        num2 = num2;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 30:
                        Integer num24 = num;
                        str = str;
                        num2 = (Integer) cVarC.v(eVar2, 30, m0.f116981a, num2);
                        Unit unit32 = Unit.INSTANCE;
                        i19 |= 1073741824;
                        bool = bool;
                        str5 = str5;
                        num = num24;
                        str = str;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 31:
                        num = num;
                        num2 = num2;
                        bool2 = (Boolean) cVarC.v(eVar2, 31, m63.g.f116948a, bool2);
                        Unit unit33 = Unit.INSTANCE;
                        bool = bool;
                        i19 |= Integer.MIN_VALUE;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 32:
                        str3 = (String) cVarC.v(eVar2, 32, y1.f117048a, str3);
                        i18 |= 1;
                        Unit unit34 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 33:
                        bool = (Boolean) cVarC.v(eVar2, 33, m63.g.f116948a, bool);
                        i18 |= 2;
                        Unit unit35 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 34:
                        str2 = (String) cVarC.v(eVar2, 34, y1.f117048a, str2);
                        i18 |= 4;
                        Unit unit36 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 35:
                        str = (String) cVarC.v(eVar2, 35, y1.f117048a, str);
                        i18 |= 8;
                        Unit unit37 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 36:
                        str4 = (String) cVarC.v(eVar2, 36, y1.f117048a, str4);
                        i18 |= 16;
                        Unit unit38 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 37:
                        bool4 = (Boolean) cVarC.v(eVar2, 37, m63.g.f116948a, bool4);
                        i18 |= 32;
                        Unit unit39 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 38:
                        bool5 = (Boolean) cVarC.v(eVar2, 38, m63.g.f116948a, bool5);
                        i18 |= 64;
                        Unit unit310 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 39:
                        bool3 = (Boolean) cVarC.v(eVar2, 39, m63.g.f116948a, bool3);
                        i18 |= 128;
                        Unit unit311 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 40:
                        bool6 = (Boolean) cVarC.v(eVar2, 40, m63.g.f116948a, bool6);
                        i18 |= 256;
                        Unit unit312 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    case 41:
                        bool7 = (Boolean) cVarC.v(eVar2, 41, m63.g.f116948a, bool7);
                        i18 |= 512;
                        Unit unit313 = Unit.INSTANCE;
                        bool = bool;
                        str5 = str5;
                        num = num;
                        num2 = num2;
                        bool = bool;
                        str5 = str5;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            String str38 = str;
            Integer num25 = num;
            Integer num26 = num2;
            String str39 = str5;
            Boolean bool34 = bool9;
            int i56 = i19;
            Integer num27 = num5;
            String str40 = str2;
            Boolean bool35 = bool8;
            cVarC.b(eVar2);
            return new e(i56, i18, bool35, str39, bool34, str6, bool10, bool11, list, str7, str8, str9, num3, str10, num4, str11, num27, bool12, str12, bool13, bool14, num6, bool15, bool16, bool17, bool18, bool19, str13, str14, list2, bool20, num25, num26, bool2, str3, bool, str40, str38, str4, bool4, bool5, bool3, bool6, bool7, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            Boolean bool = eVar.P;
            Boolean bool2 = eVar.O;
            Boolean bool3 = eVar.N;
            Boolean bool4 = eVar.M;
            Boolean bool5 = eVar.L;
            String str = eVar.K;
            String str2 = eVar.J;
            String str3 = eVar.I;
            Boolean bool6 = eVar.H;
            String str4 = eVar.G;
            Boolean bool7 = eVar.F;
            Integer num = eVar.E;
            Integer num2 = eVar.D;
            Boolean bool8 = eVar.C;
            List<String> list = eVar.B;
            String str5 = eVar.A;
            String str6 = eVar.f203040z;
            Boolean bool9 = eVar.f203039y;
            Boolean bool10 = eVar.f203038x;
            Boolean bool11 = eVar.f203037w;
            Boolean bool12 = eVar.f203036v;
            Boolean bool13 = eVar.f203035u;
            Integer num3 = eVar.f203034t;
            Boolean bool14 = eVar.f203033s;
            Boolean bool15 = eVar.f203032r;
            String str7 = eVar.f203031q;
            Boolean bool16 = eVar.f203030p;
            Integer num4 = eVar.f203029o;
            String str8 = eVar.f203028n;
            Integer num5 = eVar.f203027m;
            String str9 = eVar.f203026l;
            Integer num6 = eVar.f203025k;
            String str10 = eVar.f203024j;
            String str11 = eVar.f203023i;
            String str12 = eVar.f203022h;
            List<String> list2 = eVar.f203021g;
            Boolean bool17 = eVar.f203020f;
            Boolean bool18 = eVar.f203019e;
            String str13 = eVar.f203018d;
            Boolean bool19 = eVar.f203017c;
            String str14 = eVar.f203016b;
            Boolean bool20 = eVar.f203015a;
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = e.Q;
            if (dVarC.C(eVar2) || bool20 != null) {
                dVarC.d(eVar2, 0, m63.g.f116948a, bool20);
            }
            if (dVarC.C(eVar2) || str14 != null) {
                dVarC.d(eVar2, 1, y1.f117048a, str14);
            }
            if (dVarC.C(eVar2) || bool19 != null) {
                dVarC.d(eVar2, 2, m63.g.f116948a, bool19);
            }
            if (dVarC.C(eVar2) || str13 != null) {
                dVarC.d(eVar2, 3, y1.f117048a, str13);
            }
            if (dVarC.C(eVar2) || bool18 != null) {
                dVarC.d(eVar2, 4, m63.g.f116948a, bool18);
            }
            if (dVarC.C(eVar2) || bool17 != null) {
                dVarC.d(eVar2, 5, m63.g.f116948a, bool17);
            }
            if (dVarC.C(eVar2) || list2 != null) {
                dVarC.d(eVar2, 6, lVarArr[6].getValue(), list2);
            }
            if (dVarC.C(eVar2) || str12 != null) {
                dVarC.d(eVar2, 7, y1.f117048a, str12);
            }
            if (dVarC.C(eVar2) || str11 != null) {
                dVarC.d(eVar2, 8, y1.f117048a, str11);
            }
            if (dVarC.C(eVar2) || str10 != null) {
                dVarC.d(eVar2, 9, y1.f117048a, str10);
            }
            if (dVarC.C(eVar2) || num6 != null) {
                dVarC.d(eVar2, 10, m0.f116981a, num6);
            }
            if (dVarC.C(eVar2) || str9 != null) {
                dVarC.d(eVar2, 11, y1.f117048a, str9);
            }
            if (dVarC.C(eVar2) || num5 != 0) {
                dVarC.d(eVar2, 12, m0.f116981a, num5);
            }
            if (dVarC.C(eVar2) || str8 != 0) {
                dVarC.d(eVar2, 13, y1.f117048a, str8);
            }
            if (dVarC.C(eVar2) || num4 != null) {
                dVarC.d(eVar2, 14, m0.f116981a, num4);
            }
            if (dVarC.C(eVar2) || bool16 != null) {
                dVarC.d(eVar2, 15, m63.g.f116948a, bool16);
            }
            if (dVarC.C(eVar2) || str7 != null) {
                dVarC.d(eVar2, 16, y1.f117048a, str7);
            }
            if (dVarC.C(eVar2) || bool15 != null) {
                dVarC.d(eVar2, 17, m63.g.f116948a, bool15);
            }
            if (dVarC.C(eVar2) || bool14 != null) {
                dVarC.d(eVar2, 18, m63.g.f116948a, bool14);
            }
            if (dVarC.C(eVar2) || num3 != null) {
                dVarC.d(eVar2, 19, m0.f116981a, num3);
            }
            if (dVarC.C(eVar2) || bool13 != null) {
                dVarC.d(eVar2, 20, m63.g.f116948a, bool13);
            }
            if (dVarC.C(eVar2) || bool12 != null) {
                dVarC.d(eVar2, 21, m63.g.f116948a, bool12);
            }
            if (dVarC.C(eVar2) || bool11 != null) {
                dVarC.d(eVar2, 22, m63.g.f116948a, bool11);
            }
            if (dVarC.C(eVar2) || bool10 != null) {
                dVarC.d(eVar2, 23, m63.g.f116948a, bool10);
            }
            if (dVarC.C(eVar2) || bool9 != null) {
                dVarC.d(eVar2, 24, m63.g.f116948a, bool9);
            }
            if (dVarC.C(eVar2) || str6 != null) {
                dVarC.d(eVar2, 25, y1.f117048a, str6);
            }
            if (dVarC.C(eVar2) || str5 != null) {
                dVarC.d(eVar2, 26, y1.f117048a, str5);
            }
            if (dVarC.C(eVar2) || list != null) {
                dVarC.d(eVar2, 27, lVarArr[27].getValue(), list);
            }
            if (dVarC.C(eVar2) || bool8 != null) {
                dVarC.d(eVar2, 28, m63.g.f116948a, bool8);
            }
            if (dVarC.C(eVar2) || num2 != null) {
                dVarC.d(eVar2, 29, m0.f116981a, num2);
            }
            if (dVarC.C(eVar2) || num != null) {
                dVarC.d(eVar2, 30, m0.f116981a, num);
            }
            if (dVarC.C(eVar2) || bool7 != null) {
                dVarC.d(eVar2, 31, m63.g.f116948a, bool7);
            }
            if (dVarC.C(eVar2) || str4 != null) {
                dVarC.d(eVar2, 32, y1.f117048a, str4);
            }
            if (dVarC.C(eVar2) || bool6 != null) {
                dVarC.d(eVar2, 33, m63.g.f116948a, bool6);
            }
            if (dVarC.C(eVar2) || str3 != null) {
                dVarC.d(eVar2, 34, y1.f117048a, str3);
            }
            if (dVarC.C(eVar2) || str2 != null) {
                dVarC.d(eVar2, 35, y1.f117048a, str2);
            }
            if (dVarC.C(eVar2) || str != null) {
                dVarC.d(eVar2, 36, y1.f117048a, str);
            }
            if (dVarC.C(eVar2) || bool5 != null) {
                dVarC.d(eVar2, 37, m63.g.f116948a, bool5);
            }
            if (dVarC.C(eVar2) || bool4 != null) {
                dVarC.d(eVar2, 38, m63.g.f116948a, bool4);
            }
            if (dVarC.C(eVar2) || bool3 != null) {
                dVarC.d(eVar2, 39, m63.g.f116948a, bool3);
            }
            if (dVarC.C(eVar2) || bool2 != null) {
                dVarC.d(eVar2, 40, m63.g.f116948a, bool2);
            }
            if (dVarC.C(eVar2) || bool != null) {
                dVarC.d(eVar2, 41, m63.g.f116948a, bool);
            }
            dVarC.b(eVar2);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        Q = new o13.l[]{null, null, null, null, null, null, o13.m.a(nVar, new z41.j(18)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new z41.j(19)), null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e(Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, Boolean bool4, List list, String str3, String str4, String str5, Integer num, String str6, Integer num2, String str7, Integer num3, Boolean bool5, String str8, Boolean bool6, Boolean bool7, Integer num4, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str9, String str10, List list2, Boolean bool13, Integer num5, Integer num6, Boolean bool14, String str11, Boolean bool15, String str12, String str13, String str14, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        Boolean bool21 = (i14 & 1) != 0 ? null : bool;
        this(bool21, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : bool2, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : bool3, (i14 & 32) != 0 ? null : bool4, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? null : str6, (i14 & 4096) != 0 ? null : num2, (i14 & 8192) != 0 ? null : str7, (i14 & 16384) != 0 ? null : num3, (i14 & 32768) != 0 ? null : bool5, (i14 & 65536) != 0 ? null : str8, (i14 & 131072) != 0 ? null : bool6, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : bool7, (i14 & 524288) != 0 ? null : num4, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool8, (i14 & 2097152) != 0 ? null : bool9, (i14 & 4194304) != 0 ? null : bool10, (i14 & 8388608) != 0 ? null : bool11, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool12, (i14 & 33554432) != 0 ? null : str9, (i14 & 67108864) != 0 ? null : str10, (i14 & 134217728) != 0 ? null : list2, (i14 & 268435456) != 0 ? null : bool13, (i14 & 536870912) != 0 ? null : num5, (i14 & 1073741824) != 0 ? null : num6, (i14 & Integer.MIN_VALUE) != 0 ? null : bool14, (i15 & 1) != 0 ? null : str11, (i15 & 2) != 0 ? null : bool15, (i15 & 4) != 0 ? null : str12, (i15 & 8) != 0 ? null : str13, (i15 & 16) != 0 ? null : str14, (i15 & 32) != 0 ? null : bool16, (i15 & 64) != 0 ? null : bool17, (i15 & 128) != 0 ? null : bool18, (i15 & 256) != 0 ? null : bool19, (i15 & 512) != 0 ? null : bool20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f203015a, eVar.f203015a) && s.g(this.f203016b, eVar.f203016b) && s.g(this.f203017c, eVar.f203017c) && s.g(this.f203018d, eVar.f203018d) && s.g(this.f203019e, eVar.f203019e) && s.g(this.f203020f, eVar.f203020f) && s.g(this.f203021g, eVar.f203021g) && s.g(this.f203022h, eVar.f203022h) && s.g(this.f203023i, eVar.f203023i) && s.g(this.f203024j, eVar.f203024j) && s.g(this.f203025k, eVar.f203025k) && s.g(this.f203026l, eVar.f203026l) && s.g(this.f203027m, eVar.f203027m) && s.g(this.f203028n, eVar.f203028n) && s.g(this.f203029o, eVar.f203029o) && s.g(this.f203030p, eVar.f203030p) && s.g(this.f203031q, eVar.f203031q) && s.g(this.f203032r, eVar.f203032r) && s.g(this.f203033s, eVar.f203033s) && s.g(this.f203034t, eVar.f203034t) && s.g(this.f203035u, eVar.f203035u) && s.g(this.f203036v, eVar.f203036v) && s.g(this.f203037w, eVar.f203037w) && s.g(this.f203038x, eVar.f203038x) && s.g(this.f203039y, eVar.f203039y) && s.g(this.f203040z, eVar.f203040z) && s.g(this.A, eVar.A) && s.g(this.B, eVar.B) && s.g(this.C, eVar.C) && s.g(this.D, eVar.D) && s.g(this.E, eVar.E) && s.g(this.F, eVar.F) && s.g(this.G, eVar.G) && s.g(this.H, eVar.H) && s.g(this.I, eVar.I) && s.g(this.J, eVar.J) && s.g(this.K, eVar.K) && s.g(this.L, eVar.L) && s.g(this.M, eVar.M) && s.g(this.N, eVar.N) && s.g(this.O, eVar.O) && s.g(this.P, eVar.P);
    }

    public final int hashCode() {
        Boolean bool = this.f203015a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f203016b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f203017c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f203018d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.f203019e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f203020f;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list = this.f203021g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f203022h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f203023i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f203024j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f203025k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f203026l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.f203027m;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.f203028n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.f203029o;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool5 = this.f203030p;
        int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str8 = this.f203031q;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool6 = this.f203032r;
        int iHashCode18 = (iHashCode17 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f203033s;
        int iHashCode19 = (iHashCode18 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num4 = this.f203034t;
        int iHashCode20 = (iHashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool8 = this.f203035u;
        int iHashCode21 = (iHashCode20 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f203036v;
        int iHashCode22 = (iHashCode21 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.f203037w;
        int iHashCode23 = (iHashCode22 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.f203038x;
        int iHashCode24 = (iHashCode23 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.f203039y;
        int iHashCode25 = (iHashCode24 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str9 = this.f203040z;
        int iHashCode26 = (iHashCode25 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.A;
        int iHashCode27 = (iHashCode26 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list2 = this.B;
        int iHashCode28 = (iHashCode27 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool13 = this.C;
        int iHashCode29 = (iHashCode28 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Integer num5 = this.D;
        int iHashCode30 = (iHashCode29 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.E;
        int iHashCode31 = (iHashCode30 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool14 = this.F;
        int iHashCode32 = (iHashCode31 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        String str11 = this.G;
        int iHashCode33 = (iHashCode32 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool15 = this.H;
        int iHashCode34 = (iHashCode33 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        String str12 = this.I;
        int iHashCode35 = (iHashCode34 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.J;
        int iHashCode36 = (iHashCode35 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.K;
        int iHashCode37 = (iHashCode36 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool16 = this.L;
        int iHashCode38 = (iHashCode37 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.M;
        int iHashCode39 = (iHashCode38 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.N;
        int iHashCode40 = (iHashCode39 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.O;
        int iHashCode41 = (iHashCode40 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.P;
        return iHashCode41 + (bool20 != null ? bool20.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceInfoDTO(appSupport=");
        sb3.append(this.f203015a);
        sb3.append(", applicationKey=");
        sb3.append(this.f203016b);
        sb3.append(", bestInClassCapable=");
        b71.i.s(sb3, this.f203017c, ", bestInClassVideoLink=", this.f203018d, ", bluetoothClassicDevice=");
        b71.i.o(this.f203019e, this.f203020f, ", bluetoothLowEnergyDevice=", ", deviceCategories=", sb3);
        o2.c.n(", deviceEmbedVideoLink=", this.f203022h, ", deviceSettingsFile=", sb3, this.f203021g);
        sn.a.t(sb3, this.f203023i, ", deviceTags=", this.f203024j, ", deviceTypePk=");
        p6.b.l(this.f203025k, ", deviceVideoPageLink=", this.f203026l, ", displayOrder=", sb3);
        p6.b.l(this.f203027m, ", excludeCountries=", this.f203028n, ", fitProductNumber=", sb3);
        kg.f.r(sb3, this.f203029o, ", floorsClimbedGoalCapable=", this.f203030p, ", gcmSettingsFile=");
        b71.i.w(sb3, this.f203031q, ", golfAppPairingCapable=", this.f203032r, ", golfAppSyncCapable=");
        sb3.append(this.f203033s);
        sb3.append(", golfDisplayOrder=");
        sb3.append(this.f203034t);
        sb3.append(", handednessCapable=");
        b71.i.o(this.f203035u, this.f203036v, ", hasOpticalHeartRate=", ", hasPowerButton=", sb3);
        b71.i.o(this.f203037w, this.f203038x, ", highlighted=", ", hybrid=", sb3);
        b71.i.s(sb3, this.f203039y, ", imageUrl=", this.f203040z, ", includeCountries=");
        v.e0.o(this.A, ", incompatibleApplications=", ", intensityMinutesGoalCapable=", sb3, this.B);
        sb3.append(this.C);
        sb3.append(", minGCMAndroidVersion=");
        sb3.append(this.D);
        sb3.append(", minGolfAppAndroidVersion=");
        kg.f.r(sb3, this.E, ", moderateIntensityMinutesGoalCapable=", this.F, ", partNumber=");
        b71.i.w(sb3, this.G, ", primary=", this.H, ", primaryApplication=");
        sn.a.t(sb3, this.I, ", productDisplayName=", this.J, ", productSku=");
        b71.i.w(sb3, this.K, ", supportsSecondaryUsers=", this.L, ", wasp=");
        b71.i.o(this.M, this.N, ", weightScale=", ", wellness=", sb3);
        sb3.append(this.O);
        sb3.append(", wifi=");
        sb3.append(this.P);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: z80.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/e$b;", "", "<init>", "()V", "Li63/c;", "Lz80/e;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f203041a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ e(int i14, int i15, Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, Boolean bool4, List list, String str3, String str4, String str5, Integer num, String str6, Integer num2, String str7, Integer num3, Boolean bool5, String str8, Boolean bool6, Boolean bool7, Integer num4, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str9, String str10, List list2, Boolean bool13, Integer num5, Integer num6, Boolean bool14, String str11, Boolean bool15, String str12, String str13, String str14, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f203015a = null;
        } else {
            this.f203015a = bool;
        }
        if ((i14 & 2) == 0) {
            this.f203016b = null;
        } else {
            this.f203016b = str;
        }
        if ((i14 & 4) == 0) {
            this.f203017c = null;
        } else {
            this.f203017c = bool2;
        }
        if ((i14 & 8) == 0) {
            this.f203018d = null;
        } else {
            this.f203018d = str2;
        }
        if ((i14 & 16) == 0) {
            this.f203019e = null;
        } else {
            this.f203019e = bool3;
        }
        if ((i14 & 32) == 0) {
            this.f203020f = null;
        } else {
            this.f203020f = bool4;
        }
        if ((i14 & 64) == 0) {
            this.f203021g = null;
        } else {
            this.f203021g = list;
        }
        if ((i14 & 128) == 0) {
            this.f203022h = null;
        } else {
            this.f203022h = str3;
        }
        if ((i14 & 256) == 0) {
            this.f203023i = null;
        } else {
            this.f203023i = str4;
        }
        if ((i14 & 512) == 0) {
            this.f203024j = null;
        } else {
            this.f203024j = str5;
        }
        if ((i14 & 1024) == 0) {
            this.f203025k = null;
        } else {
            this.f203025k = num;
        }
        if ((i14 & 2048) == 0) {
            this.f203026l = null;
        } else {
            this.f203026l = str6;
        }
        if ((i14 & 4096) == 0) {
            this.f203027m = null;
        } else {
            this.f203027m = num2;
        }
        if ((i14 & 8192) == 0) {
            this.f203028n = null;
        } else {
            this.f203028n = str7;
        }
        if ((i14 & 16384) == 0) {
            this.f203029o = null;
        } else {
            this.f203029o = num3;
        }
        if ((32768 & i14) == 0) {
            this.f203030p = null;
        } else {
            this.f203030p = bool5;
        }
        if ((65536 & i14) == 0) {
            this.f203031q = null;
        } else {
            this.f203031q = str8;
        }
        if ((131072 & i14) == 0) {
            this.f203032r = null;
        } else {
            this.f203032r = bool6;
        }
        if ((262144 & i14) == 0) {
            this.f203033s = null;
        } else {
            this.f203033s = bool7;
        }
        if ((524288 & i14) == 0) {
            this.f203034t = null;
        } else {
            this.f203034t = num4;
        }
        if ((1048576 & i14) == 0) {
            this.f203035u = null;
        } else {
            this.f203035u = bool8;
        }
        if ((2097152 & i14) == 0) {
            this.f203036v = null;
        } else {
            this.f203036v = bool9;
        }
        if ((4194304 & i14) == 0) {
            this.f203037w = null;
        } else {
            this.f203037w = bool10;
        }
        if ((8388608 & i14) == 0) {
            this.f203038x = null;
        } else {
            this.f203038x = bool11;
        }
        if ((16777216 & i14) == 0) {
            this.f203039y = null;
        } else {
            this.f203039y = bool12;
        }
        if ((33554432 & i14) == 0) {
            this.f203040z = null;
        } else {
            this.f203040z = str9;
        }
        if ((67108864 & i14) == 0) {
            this.A = null;
        } else {
            this.A = str10;
        }
        if ((134217728 & i14) == 0) {
            this.B = null;
        } else {
            this.B = list2;
        }
        if ((268435456 & i14) == 0) {
            this.C = null;
        } else {
            this.C = bool13;
        }
        if ((536870912 & i14) == 0) {
            this.D = null;
        } else {
            this.D = num5;
        }
        if ((1073741824 & i14) == 0) {
            this.E = null;
        } else {
            this.E = num6;
        }
        if ((i14 & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = bool14;
        }
        if ((i15 & 1) == 0) {
            this.G = null;
        } else {
            this.G = str11;
        }
        if ((i15 & 2) == 0) {
            this.H = null;
        } else {
            this.H = bool15;
        }
        if ((i15 & 4) == 0) {
            this.I = null;
        } else {
            this.I = str12;
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
            this.L = bool16;
        }
        if ((i15 & 64) == 0) {
            this.M = null;
        } else {
            this.M = bool17;
        }
        if ((i15 & 128) == 0) {
            this.N = null;
        } else {
            this.N = bool18;
        }
        if ((i15 & 256) == 0) {
            this.O = null;
        } else {
            this.O = bool19;
        }
        if ((i15 & 512) == 0) {
            this.P = null;
        } else {
            this.P = bool20;
        }
    }

    public e(Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, Boolean bool4, List<String> list, String str3, String str4, String str5, Integer num, String str6, Integer num2, String str7, Integer num3, Boolean bool5, String str8, Boolean bool6, Boolean bool7, Integer num4, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, String str9, String str10, List<String> list2, Boolean bool13, Integer num5, Integer num6, Boolean bool14, String str11, Boolean bool15, String str12, String str13, String str14, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20) {
        this.f203015a = bool;
        this.f203016b = str;
        this.f203017c = bool2;
        this.f203018d = str2;
        this.f203019e = bool3;
        this.f203020f = bool4;
        this.f203021g = list;
        this.f203022h = str3;
        this.f203023i = str4;
        this.f203024j = str5;
        this.f203025k = num;
        this.f203026l = str6;
        this.f203027m = num2;
        this.f203028n = str7;
        this.f203029o = num3;
        this.f203030p = bool5;
        this.f203031q = str8;
        this.f203032r = bool6;
        this.f203033s = bool7;
        this.f203034t = num4;
        this.f203035u = bool8;
        this.f203036v = bool9;
        this.f203037w = bool10;
        this.f203038x = bool11;
        this.f203039y = bool12;
        this.f203040z = str9;
        this.A = str10;
        this.B = list2;
        this.C = bool13;
        this.D = num5;
        this.E = num6;
        this.F = bool14;
        this.G = str11;
        this.H = bool15;
        this.I = str12;
        this.J = str13;
        this.K = str14;
        this.L = bool16;
        this.M = bool17;
        this.N = bool18;
        this.O = bool19;
        this.P = bool20;
    }

    public e() {
        this((Boolean) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (List) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (List) null, (Boolean) null, (Integer) null, (Integer) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, -1, 1023, (p005kotlin.jvm.internal.j) null);
    }
}
