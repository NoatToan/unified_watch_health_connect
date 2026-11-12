package k82;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import f72.ce;
import f72.de;
import f72.ee;
import f72.ge;
import f72.he;
import f72.ie;
import f72.je;
import f72.ke;
import f72.le;
import f72.me;
import f72.ne;
import o4.f0;
import o4.h1;
import o4.t1;
import o4.u1;
import o4.v1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import tn.k;
import u62.z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lk82/e;", "", "", Action.KEY_ATTRIBUTE, "Lu4/d;", "icon", "", "descriptionStringId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lu4/d;I)V", "a", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f103398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f103399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f103400e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f103401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f103402b;

    static {
        t62.c cVar = t62.c.f162799a;
        e eVar = new e("FAIR", 0, "Fair", ce.a(cVar), R.string.gak_lbl_weather_clear);
        e eVar2 = new e("CLEAR", 1, "Clear", ce.a(cVar), R.string.gak_lbl_weather_clear);
        f103398c = eVar2;
        e eVar3 = new e("MOSTLY_CLEAR", 2, "Mostly Clear", ce.a(cVar), R.string.gak_lbl_weather_clear);
        e eVar4 = new e("CLOUDY", 3, "Cloudy", de.a(cVar), R.string.gak_lbl_weather_cloudy);
        e eVar5 = new e("MOSTLY_CLOUDY", 4, "Mostly Cloudy", de.a(cVar), R.string.gak_lbl_weather_cloudy);
        e eVar6 = new e("FOG", 5, "Fog", ee.a(cVar), R.string.gak_lbl_weather_fog);
        e eVar7 = new e("DRIZZLE", 6, "Drizzle", ee.a(cVar), R.string.gak_lbl_weather_fog);
        e eVar8 = new e("MIST", 7, "Mist", ee.a(cVar), R.string.gak_lbl_weather_fog);
        e eVar9 = new e("SMOKE", 8, "Smoke", ee.a(cVar), R.string.gak_lbl_weather_fog);
        e eVar10 = new e("HAZE", 9, "Haze", ee.a(cVar), R.string.gak_lbl_weather_fog);
        e eVar11 = new e("DUST", 10, "Dust", ee.a(cVar), R.string.gak_lbl_weather_fog);
        e eVar12 = new e("SAND", 11, "Sand", ee.a(cVar), R.string.gak_lbl_weather_fog);
        e eVar13 = new e("VOLCANIC_ASH", 12, "Volcanic Ash", ee.a(cVar), R.string.gak_lbl_weather_fog);
        u4.d dVarC = ge.f69579a;
        if (dVarC == null) {
            float f14 = 32;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("WeatherHail", f14, f14, 32.0f, 32.0f, 0L, 0, false, 224, null);
            t1 t1Var = new t1(f0.d(4285295724L), null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i14 = h1.f128864c;
            u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(27.2823f, 10.2224f);
            eVarL.d(26.9554f, 5.3458f, 22.9383f, 1.4795f, 17.9806f, 1.4795f);
            eVarL.d(13.7623f, 1.4795f, 10.2354f, 4.2898f, 9.064f, 8.1275f);
            eVarL.d(8.2731f, 7.7721f, 7.4023f, 7.563f, 6.4789f, 7.563f);
            eVarL.d(2.9863f, 7.563f, 0.1543f, 10.395f, 0.1543f, 13.8876f);
            eVarL.d(0.1543f, 17.379f, 2.9863f, 20.211f, 6.4789f, 20.211f);
            eVarL.g(26.8297f);
            eVarL.d(29.6f, 20.211f, 31.8457f, 17.9641f, 31.8457f, 15.195f);
            eVarL.d(31.8457f, 12.5778f, 29.8366f, 10.4533f, 27.2823f, 10.2224f);
            eVarL.c();
            u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 1.0f, 0, 1.0f);
            t1 t1Var2 = new t1(f0.d(4279858898L), null);
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(8.3584f, 27.4919f);
            eVarL2.d(8.283f, 27.4919f, 8.2075f, 27.4759f, 8.1355f, 27.4428f);
            eVarL2.d(7.8693f, 27.3193f, 7.7538f, 27.0028f, 7.8773f, 26.7365f);
            eVarL2.i(10.5218f, 21.0359f);
            eVarL2.d(10.6453f, 20.7696f, 10.9607f, 20.6542f, 11.227f, 20.7776f);
            eVarL2.d(11.4933f, 20.9011f, 11.6087f, 21.2176f, 11.4853f, 21.4839f);
            eVarL2.i(8.84068f, 27.1845f);
            eVarL2.d(8.7504f, 27.3776f, 8.5584f, 27.4919f, 8.3584f, 27.4919f);
            eVarL2.c();
            eVarL2.k(5.57577f, 25.8712f);
            eVarL2.d(5.5038f, 25.8712f, 5.4295f, 25.8564f, 5.3598f, 25.8255f);
            eVarL2.d(5.0912f, 25.7055f, 4.9712f, 25.3912f, 5.0912f, 25.1238f);
            eVarL2.i(6.90834f, 21.0438f);
            eVarL2.d(7.0283f, 20.7752f, 7.3426f, 20.6552f, 7.6101f, 20.7752f);
            eVarL2.d(7.8775f, 20.8941f, 7.9986f, 21.2084f, 7.8786f, 21.4758f);
            eVarL2.i(6.06148f, 25.5558f);
            eVarL2.d(5.9735f, 25.7535f, 5.7792f, 25.8712f, 5.5758f, 25.8712f);
            eVarL2.c();
            eVarL2.k(13.1827f, 24.6992f);
            eVarL2.d(13.249f, 24.7278f, 13.3187f, 24.7404f, 13.3862f, 24.7404f);
            eVarL2.d(13.5942f, 24.7404f, 13.7919f, 24.6169f, 13.8765f, 24.4135f);
            eVarL2.i(15.1027f, 21.4638f);
            eVarL2.d(15.2159f, 21.1929f, 15.0879f, 20.8821f, 14.817f, 20.7689f);
            eVarL2.d(14.5462f, 20.6569f, 14.2353f, 20.7849f, 14.1222f, 21.0558f);
            eVarL2.i(12.8959f, 24.0055f);
            eVarL2.d(12.7839f, 24.2764f, 12.9119f, 24.5872f, 13.1827f, 24.6992f);
            eVarL2.c();
            eVarL2.k(14.4226f, 29.7547f);
            eVarL2.d(14.3461f, 29.7547f, 14.2683f, 29.7375f, 14.1941f, 29.7032f);
            eVarL2.d(13.9289f, 29.5764f, 13.8169f, 29.2598f, 13.9438f, 28.9947f);
            eVarL2.i(17.7438f, 21.0312f);
            eVarL2.d(17.8695f, 20.7661f, 18.1872f, 20.6541f, 18.4512f, 20.7809f);
            eVarL2.d(18.7163f, 20.9067f, 18.8283f, 21.2244f, 18.7026f, 21.4884f);
            eVarL2.i(14.9026f, 29.4518f);
            eVarL2.d(14.8112f, 29.6427f, 14.6203f, 29.7547f, 14.4226f, 29.7547f);
            eVarL2.c();
            eVarL2.k(19.3426f, 26.7248f);
            eVarL2.d(19.4135f, 26.758f, 19.4889f, 26.7728f, 19.5621f, 26.7728f);
            eVarL2.d(19.7643f, 26.7728f, 19.9563f, 26.6574f, 20.0455f, 26.462f);
            eVarL2.i(22.3163f, 21.4803f);
            eVarL2.d(22.4375f, 21.2128f, 22.3198f, 20.8985f, 22.0523f, 20.7763f);
            eVarL2.d(21.7861f, 20.6551f, 21.4706f, 20.7728f, 21.3495f, 21.0391f);
            eVarL2.i(19.0786f, 26.0208f);
            eVarL2.d(18.9575f, 26.2883f, 19.0752f, 26.6037f, 19.3426f, 26.7248f);
            eVarL2.c();
            eVarL2.k(22.5807f, 27.9251f);
            eVarL2.d(22.5053f, 27.9251f, 22.4287f, 27.9091f, 22.3567f, 27.8748f);
            eVarL2.d(22.0904f, 27.7513f, 21.9761f, 27.4348f, 22.0995f, 27.1696f);
            eVarL2.i(24.9601f, 21.0359f);
            eVarL2.d(25.0847f, 20.7696f, 25.4013f, 20.6542f, 25.6664f, 20.7788f);
            eVarL2.d(25.9327f, 20.9022f, 26.047f, 21.2188f, 25.9235f, 21.4851f);
            eVarL2.i(23.0618f, 27.6188f);
            eVarL2.d(22.9727f, 27.8119f, 22.7807f, 27.9251f, 22.5807f, 27.9251f);
            eVarL2.c();
            eVarL2.k(4.19554f, 27.1811f);
            eVarL2.d(4.1955f, 26.8919f, 4.431f, 26.6576f, 4.719f, 26.6576f);
            eVarL2.d(5.007f, 26.6576f, 5.2424f, 26.8919f, 5.2424f, 27.1811f);
            eVarL2.d(5.2424f, 27.4691f, 5.007f, 27.7033f, 4.719f, 27.7033f);
            eVarL2.d(4.431f, 27.7033f, 4.1955f, 27.4691f, 4.1955f, 27.1811f);
            eVarL2.c();
            eVarL2.k(3.66525f, 27.1811f);
            eVarL2.d(3.6652f, 27.7616f, 4.1372f, 28.2348f, 4.719f, 28.2348f);
            eVarL2.d(5.3007f, 28.2348f, 5.7727f, 27.7616f, 5.7727f, 27.1811f);
            eVarL2.d(5.7727f, 26.5993f, 5.3007f, 26.1262f, 4.719f, 26.1262f);
            eVarL2.d(4.1372f, 26.1262f, 3.6652f, 26.5993f, 3.6652f, 27.1811f);
            eVarL2.c();
            eVarL2.k(7.46948f, 28.2429f);
            eVarL2.d(7.1815f, 28.2429f, 6.946f, 28.4772f, 6.946f, 28.7663f);
            eVarL2.d(6.946f, 29.0543f, 7.1815f, 29.2897f, 7.4695f, 29.2897f);
            eVarL2.d(7.7575f, 29.2897f, 7.9929f, 29.0543f, 7.9929f, 28.7663f);
            eVarL2.d(7.9929f, 28.4772f, 7.7575f, 28.2429f, 7.4695f, 28.2429f);
            eVarL2.c();
            eVarL2.k(7.46948f, 29.82f);
            eVarL2.d(6.8878f, 29.82f, 6.4158f, 29.348f, 6.4158f, 28.7663f);
            eVarL2.d(6.4158f, 28.1846f, 6.8878f, 27.7115f, 7.4695f, 27.7115f);
            eVarL2.d(8.0512f, 27.7115f, 8.5232f, 28.1846f, 8.5232f, 28.7663f);
            eVarL2.d(8.5232f, 29.348f, 8.0512f, 29.82f, 7.4695f, 29.82f);
            eVarL2.c();
            eVarL2.k(12.0745f, 26.0387f);
            eVarL2.d(12.0745f, 25.7495f, 12.3099f, 25.5152f, 12.5979f, 25.5152f);
            eVarL2.d(12.8859f, 25.5152f, 13.1214f, 25.7495f, 13.1214f, 26.0387f);
            eVarL2.d(13.1214f, 26.3267f, 12.8859f, 26.5609f, 12.5979f, 26.5609f);
            eVarL2.d(12.3099f, 26.5609f, 12.0745f, 26.3267f, 12.0745f, 26.0387f);
            eVarL2.c();
            eVarL2.k(11.5442f, 26.0387f);
            eVarL2.d(11.5442f, 26.6192f, 12.0162f, 27.0924f, 12.5979f, 27.0924f);
            eVarL2.d(13.1797f, 27.0924f, 13.6517f, 26.6192f, 13.6517f, 26.0387f);
            eVarL2.d(13.6517f, 25.4569f, 13.1797f, 24.9838f, 12.5979f, 24.9838f);
            eVarL2.d(12.0162f, 24.9838f, 11.5442f, 25.4569f, 11.5442f, 26.0387f);
            eVarL2.c();
            eVarL2.k(18.7737f, 27.5011f);
            eVarL2.d(18.4857f, 27.5011f, 18.2503f, 27.7353f, 18.2503f, 28.0245f);
            eVarL2.d(18.2503f, 28.3125f, 18.4857f, 28.5468f, 18.7737f, 28.5468f);
            eVarL2.d(19.0617f, 28.5468f, 19.2971f, 28.3125f, 19.2971f, 28.0245f);
            eVarL2.d(19.2971f, 27.7353f, 19.0617f, 27.5011f, 18.7737f, 27.5011f);
            eVarL2.c();
            eVarL2.k(18.7737f, 29.0771f);
            eVarL2.d(18.192f, 29.0771f, 17.72f, 28.6051f, 17.72f, 28.0245f);
            eVarL2.d(17.72f, 27.4428f, 18.192f, 26.9696f, 18.7737f, 26.9696f);
            eVarL2.d(19.3554f, 26.9696f, 19.8274f, 27.4428f, 19.8274f, 28.0245f);
            eVarL2.d(19.8274f, 28.6051f, 19.3554f, 29.0771f, 18.7737f, 29.0771f);
            eVarL2.c();
            eVarL2.k(21.2702f, 29.2239f);
            eVarL2.d(21.2702f, 28.9348f, 21.5045f, 28.7005f, 21.7925f, 28.7005f);
            eVarL2.d(22.0805f, 28.7005f, 22.3159f, 28.9348f, 22.3159f, 29.2239f);
            eVarL2.d(22.3159f, 29.5119f, 22.0805f, 29.7462f, 21.7925f, 29.7462f);
            eVarL2.d(21.5045f, 29.7462f, 21.2702f, 29.5119f, 21.2702f, 29.2239f);
            eVarL2.c();
            eVarL2.k(20.7387f, 29.2239f);
            eVarL2.d(20.7387f, 29.8045f, 21.2119f, 30.2776f, 21.7925f, 30.2776f);
            eVarL2.d(22.3742f, 30.2776f, 22.8462f, 29.8045f, 22.8462f, 29.2239f);
            eVarL2.d(22.8462f, 28.6422f, 22.3742f, 28.1691f, 21.7925f, 28.1691f);
            eVarL2.d(21.2119f, 28.1691f, 20.7387f, 28.6422f, 20.7387f, 29.2239f);
            eVarL2.c();
            u4.d.a.b(aVar2, eVarL2.f168407a, i14, t1Var2, 1.0f, null, 1.0f, 0, 1.0f);
            dVarC = aVar2.c();
            ge.f69579a = dVarC;
        }
        e eVar14 = new e("HAIL", 13, "Hail", dVarC, R.string.gak_lbl_weather_hail);
        e eVar15 = new e("PARTIALY_CLOUDY", 14, "Partly Cloudy", ie.a(cVar), R.string.gak_lbl_weather_partly_cloudy);
        e eVar16 = new e("PRECIPITATION", 15, "Precip", je.a(cVar), R.string.gak_lbl_weather_rain);
        e eVar17 = new e("RAIN", 16, "Rain", je.a(cVar), R.string.gak_lbl_weather_rain);
        e eVar18 = new e("LIGHT_RAIN", 17, "Light Rain", je.a(cVar), R.string.gak_lbl_weather_rain);
        e eVar19 = new e("HEAVY_RAIN", 18, "Heavy Rain", je.a(cVar), R.string.gak_lbl_weather_rain);
        f103399d = eVar19;
        e eVar20 = new e("SHOWERS", 19, "Showers", je.a(cVar), R.string.gak_lbl_weather_rain);
        e eVar21 = new e("HEAVY_SHOWERS", 20, "Heavy Showers", je.a(cVar), R.string.gak_lbl_weather_rain);
        e eVar22 = new e("LIGHT_SHOWERS", 21, "Light Showers", je.a(cVar), R.string.gak_lbl_weather_rain);
        e eVar23 = new e("SNOW", 22, "Snow", ke.a(cVar), R.string.gak_lbl_weather_snow);
        e eVar24 = new e("LIGHT_SNOW", 23, "Light Snow", ke.a(cVar), R.string.gak_lbl_weather_snow);
        e eVar25 = new e("HEAVY_SNOW", 24, "Heavy Snow", ke.a(cVar), R.string.gak_lbl_weather_snow);
        e eVar26 = new e("TORNADO", 25, "Tornado", me.a(cVar), R.string.gak_lbl_weather_tornado);
        u4.d dVarC2 = le.f69671a;
        if (dVarC2 == null) {
            float f15 = 32;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("WeatherThunderstorm", f15, f15, 32.0f, 32.0f, 0L, 0, false, 224, null);
            t1 t1Var3 = new t1(f0.d(4294881114L), null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarJ = sn.a.j(13.6814f, 16.1789f, 9.75072f, 24.0616f, 13.3123f);
            eVarJ.i(10.8505f, 31.1538f);
            eVarJ.i(20.555f, 20.7752f);
            z.k(eVarJ, 16.3491f, 19.8627f, 16.1789f, 13.6814f);
            u4.d.a.b(aVar4, eVarJ.f168407a, i15, t1Var3, 1.0f, null, 1.0f, 0, 1.0f);
            t1 t1Var4 = new t1(f0.d(4285295724L), null);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(26.4635f, 9.00586f);
            eVarL3.d(26.1584f, 4.4544f, 22.4091f, 0.8469f, 17.7819f, 0.8469f);
            eVarL3.d(13.8448f, 0.8469f, 10.5531f, 3.4688f, 9.4597f, 7.0507f);
            eVarL3.d(8.7216f, 6.7189f, 7.9088f, 6.5237f, 7.0469f, 6.5237f);
            eVarL3.d(3.7872f, 6.5237f, 1.144f, 9.1669f, 1.144f, 12.4267f);
            eVarL3.d(1.144f, 15.6864f, 3.7872f, 18.3285f, 7.0469f, 18.3285f);
            eVarL3.g(26.0411f);
            eVarL3.d(28.6267f, 18.3285f, 30.7227f, 16.2315f, 30.7227f, 13.6469f);
            eVarL3.d(30.7227f, 11.2043f, 28.8475f, 9.2213f, 26.4635f, 9.0059f);
            eVarL3.c();
            u4.d.a.b(aVar4, eVarL3.f168407a, i15, t1Var4, 1.0f, null, 1.0f, 0, 1.0f);
            t1 t1Var5 = new t1(f0.d(4279858898L), null);
            u4.e eVarL4 = com.nimbusds.jose.shaded.gson.internal.a.l(2.62154f, 27.6361f);
            eVarL4.d(2.6909f, 27.6681f, 2.7634f, 27.6841f, 2.8349f, 27.6841f);
            eVarL4.d(3.0194f, 27.6841f, 3.1975f, 27.5795f, 3.2829f, 27.4014f);
            eVarL4.i(6.82954f, 19.9689f);
            eVarL4.d(6.9469f, 19.7225f, 6.8423f, 19.4259f, 6.5949f, 19.3086f);
            eVarL4.d(6.3485f, 19.1902f, 6.0519f, 19.2947f, 5.9346f, 19.5422f);
            eVarL4.i(2.38794f, 26.9747f);
            eVarL4.d(2.2695f, 27.2222f, 2.3741f, 27.5177f, 2.6215f, 27.6361f);
            eVarL4.c();
            eVarL4.k(5.99072f, 27.6361f);
            eVarL4.d(6.0601f, 27.6681f, 6.1326f, 27.6841f, 6.204f, 27.6841f);
            eVarL4.d(6.3886f, 27.6841f, 6.5667f, 27.5795f, 6.6521f, 27.4014f);
            eVarL4.i(10.1987f, 19.9689f);
            eVarL4.d(10.316f, 19.7225f, 10.2115f, 19.4259f, 9.9641f, 19.3086f);
            eVarL4.d(9.7177f, 19.1902f, 9.4211f, 19.2947f, 9.3038f, 19.5422f);
            eVarL4.i(5.75712f, 26.9747f);
            eVarL4.d(5.6387f, 27.2222f, 5.7432f, 27.5177f, 5.9907f, 27.6361f);
            eVarL4.c();
            eVarL4.k(19.7099f, 27.6841f);
            eVarL4.d(19.6384f, 27.6841f, 19.5659f, 27.6681f, 19.4965f, 27.6361f);
            eVarL4.d(19.2491f, 27.5177f, 19.1445f, 27.2222f, 19.2629f, 26.9747f);
            eVarL4.i(22.8085f, 19.5422f);
            eVarL4.d(22.9269f, 19.2947f, 23.2224f, 19.1902f, 23.4699f, 19.3086f);
            eVarL4.d(23.7173f, 19.4259f, 23.8219f, 19.7214f, 23.7035f, 19.9689f);
            eVarL4.i(20.1579f, 27.4014f);
            eVarL4.d(20.0725f, 27.5795f, 19.8944f, 27.6841f, 19.7099f, 27.6841f);
            eVarL4.c();
            eVarL4.k(22.8654f, 27.6361f);
            eVarL4.d(22.9347f, 27.6681f, 23.0072f, 27.6841f, 23.0787f, 27.6841f);
            eVarL4.d(23.2632f, 27.6841f, 23.4414f, 27.5795f, 23.5267f, 27.4014f);
            eVarL4.i(27.0734f, 19.9689f);
            eVarL4.d(27.1907f, 19.7225f, 27.0862f, 19.4259f, 26.8387f, 19.3086f);
            eVarL4.d(26.5923f, 19.1902f, 26.2958f, 19.2947f, 26.1784f, 19.5422f);
            eVarL4.i(22.6318f, 26.9747f);
            eVarL4.d(22.5134f, 27.2222f, 22.6179f, 27.5177f, 22.8654f, 27.6361f);
            eVarL4.c();
            u4.d.a.b(aVar4, eVarL4.f168407a, i15, t1Var5, 1.0f, null, 1.0f, 0, 1.0f);
            dVarC2 = aVar4.c();
            le.f69671a = dVarC2;
        }
        e eVar27 = new e("THUNDERSTORM", 26, "Thunderstorm", dVarC2, R.string.gak_lbl_weather_thunderstorm);
        cVar.getClass();
        u4.d dVarC3 = ne.f69707a;
        if (dVarC3 == null) {
            float f16 = 32;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("WeatherWind", f16, f16, 32.0f, 32.0f, 0L, 0, false, 224, null);
            t1 t1Var6 = new t1(f0.d(4285295724L), null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i16 = h1.f128864c;
            u4.e eVarJ2 = k.j(15.9791f, 12.6351f, 2.23876f);
            eVarJ2.d(1.6074f, 12.6351f, 1.0954f, 12.1231f, 1.0954f, 11.4904f);
            eVarJ2.d(1.0954f, 10.8591f, 1.6074f, 10.3471f, 2.2388f, 10.3471f);
            eVarJ2.g(15.9791f);
            eVarJ2.d(16.6388f, 10.3471f, 17.1754f, 9.8104f, 17.1754f, 9.1508f);
            eVarJ2.d(17.1754f, 8.4911f, 16.6388f, 7.9544f, 15.9791f, 7.9544f);
            eVarJ2.d(15.5175f, 7.9544f, 15.0917f, 8.2264f, 14.8948f, 8.6449f);
            eVarJ2.d(14.6277f, 9.2172f, 13.9458f, 9.4634f, 13.3735f, 9.1963f);
            eVarJ2.d(12.8012f, 8.928f, 12.5551f, 8.2474f, 12.8221f, 7.6751f);
            eVarJ2.d(13.3932f, 6.4554f, 14.6326f, 5.6664f, 15.9791f, 5.6664f);
            eVarJ2.d(17.9003f, 5.6664f, 19.4634f, 7.2295f, 19.4634f, 9.1508f);
            eVarJ2.d(19.4634f, 11.072f, 17.9003f, 12.6351f, 15.9791f, 12.6351f);
            eVarJ2.c();
            eVarJ2.k(20.5557f, 26.4876f);
            eVarJ2.d(19.2166f, 26.4876f, 18.0178f, 25.7418f, 17.4271f, 24.5393f);
            eVarJ2.d(17.1489f, 23.9719f, 17.3828f, 23.2864f, 17.9489f, 23.007f);
            eVarJ2.d(18.5163f, 22.7288f, 19.2031f, 22.9627f, 19.4812f, 23.5301f);
            eVarJ2.d(19.6843f, 23.9424f, 20.0954f, 24.1996f, 20.5557f, 24.1996f);
            eVarJ2.d(21.2154f, 24.1996f, 21.752f, 23.663f, 21.752f, 23.0033f);
            eVarJ2.d(21.752f, 22.3436f, 21.2154f, 21.807f, 20.5557f, 21.807f);
            eVarJ2.g(2.23937f);
            eVarJ2.d(1.608f, 21.807f, 1.0948f, 21.295f, 1.0948f, 20.6636f);
            eVarJ2.d(1.0948f, 20.0322f, 1.608f, 19.519f, 2.2394f, 19.519f);
            eVarJ2.g(20.5557f);
            eVarJ2.d(22.4769f, 19.519f, 24.04f, 21.0821f, 24.04f, 23.0033f);
            eVarJ2.d(24.04f, 24.9245f, 22.4769f, 26.4876f, 20.5557f, 26.4876f);
            z.j(eVarJ2, 2.239f, 17.3154f, 27.4205f);
            eVarJ2.d(29.3418f, 17.3154f, 30.9049f, 15.7524f, 30.9049f, 13.8311f);
            eVarJ2.d(30.9049f, 11.9099f, 29.3418f, 10.3468f, 27.4205f, 10.3468f);
            eVarJ2.d(26.0199f, 10.3468f, 24.7608f, 11.1788f, 24.2144f, 12.4674f);
            eVarJ2.d(23.9658f, 13.0484f, 24.2378f, 13.7216f, 24.8187f, 13.9677f);
            eVarJ2.d(25.4009f, 14.2151f, 26.0716f, 13.9444f, 26.319f, 13.3622f);
            eVarJ2.d(26.5073f, 12.9216f, 26.9405f, 12.6348f, 27.4205f, 12.6348f);
            eVarJ2.d(28.0802f, 12.6348f, 28.6168f, 13.1714f, 28.6168f, 13.8311f);
            eVarJ2.d(28.6168f, 14.4908f, 28.0802f, 15.0274f, 27.4205f, 15.0274f);
            eVarJ2.g(2.239f);
            eVarJ2.d(1.6076f, 15.0274f, 1.0956f, 15.5394f, 1.0956f, 16.1708f);
            eVarJ2.d(1.0956f, 16.8034f, 1.6076f, 17.3154f, 2.239f, 17.3154f);
            eVarJ2.c();
            u4.d.a.b(aVar6, eVarJ2.f168407a, i16, t1Var6, 1.0f, null, 1.0f, 0, 1.0f);
            dVarC3 = aVar6.c();
            ne.f69707a = dVarC3;
        }
        f103400e = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, new e("SQALL", 27, "Sqall", dVarC3, R.string.gak_lbl_weather_wind), new e("ICE", 28, "Ice", he.a(cVar), R.string.gak_lbl_weather_winter_mix)};
        new a(null);
    }

    private e(String str, int i14, String str2, u4.d dVar, int i15) {
        super(str, i14);
        this.f103401a = dVar;
        this.f103402b = i15;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f103400e.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk82/e$a;", "", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
