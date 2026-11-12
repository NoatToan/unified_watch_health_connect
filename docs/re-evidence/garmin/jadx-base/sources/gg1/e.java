package gg1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgg1/e;", "", "", "nameResId", "licenseRawResId", "contentDescriptionResId", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e {
    APP_INSIGHTS(R.string.app_insights, R.raw.attribution_app_insights, null, 4, null),
    GARMIN(R.string.pref_garmin_copyright, R.raw.attribution_garmin, null, 4, null),
    MP_ANDROID_CHART(R.string.mp_android_chart_lib, R.raw.attribution_mp_android_chart, Integer.valueOf(R.string.mp_android_chart_lib_content_description)),
    PHOTO_VIEW(R.string.title_photoview, R.raw.attribution_photo_view, 0 == true ? 1 : 0, 4, null),
    WEATHER(R.string.title_weather_on_off, R.raw.attribution_weather, null, 4, null),
    EXO_PLAYER(R.string.exo_player_lib, R.raw.attribution_blank_apache_2_0, null, 4, null),
    MARKWON(R.string.markwon_lib, R.raw.attribution_markwon, null, 4, null),
    MATERIAL_CALENDAR_VIEW(R.string.material_calendar_view_lib, R.raw.attribution_material_calendar_view, null, 4, null),
    LOTTIE(R.string.lottie_lib, R.raw.attribution_lottie, null, 4, null),
    BODY_MOVIN(R.string.body_movin_lib, R.raw.attribution_body_movin, null, 4, null),
    FLEXBOX_LAYOUT(R.string.flexbox_layout_lib, R.raw.attribution_blank_apache_2_0, null, 4, null),
    LUCASFILM_MARVEL_DISNEY(R.string.lucas_film_marvel_disney, R.raw.attribution_lucasfilm_marvel_disney, null, 4, null),
    OPENCV(R.string.opencv_lib, R.raw.attribution_opencv, Integer.valueOf(R.string.opencv_lib_content_description)),
    AMPLITUDA(R.string.amplituda_lib, R.raw.attribution_lincollincol_amplituda, 0 == true ? 1 : 0, 4, null),
    UCROP(R.string.ucrop_name, R.raw.attribution_ucrop, null, 4, null),
    OPENSTREETMAP(R.string.openstreetmap_name, R.raw.attribution_openstreetmap, null, 4, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f77228c;

    /* synthetic */ e(int i14, int i15, Integer num, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i16 & 2) != 0 ? 0 : i15, (i16 & 4) != 0 ? null : num);
    }

    e(int i14, int i15, Integer num) {
        this.f77226a = i14;
        this.f77227b = i15;
        this.f77228c = num;
    }
}
