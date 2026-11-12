package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.icu.text.MeasureFormat;
import android.icu.util.MeasureUnit;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class WeatherInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f11370c;
    private static final Map<Integer, Integer> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthImageView f11371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11372b;
    private HealthTextView d;
    private HealthImageView g;
    private int h;
    private HealthTextView i;
    private HealthImageView j;

    static {
        HashMap map = new HashMap();
        f11370c = map;
        HashMap map2 = new HashMap();
        e = map2;
        map.put(0, Integer.valueOf(R.drawable.weather_sunny_daytime));
        map.put(1, Integer.valueOf(R.drawable.weather_cloud_day));
        map.put(2, Integer.valueOf(R.drawable.weather_cloudy));
        map.put(3, Integer.valueOf(R.drawable.weather_showers));
        map.put(4, Integer.valueOf(R.drawable.weather_thunderstorm));
        map.put(5, Integer.valueOf(R.drawable.weather_thunderstorm));
        map.put(6, Integer.valueOf(R.drawable.weather_sleet_rain));
        map.put(7, Integer.valueOf(R.drawable.weather_light_rain));
        map.put(8, Integer.valueOf(R.drawable.weather_moderate_rain));
        map.put(9, Integer.valueOf(R.drawable.weather_heavy_rain));
        map.put(10, Integer.valueOf(R.drawable.weather_heavy_rainstorm));
        map.put(11, Integer.valueOf(R.drawable.weather_heavy_big_rainstorm));
        map.put(12, Integer.valueOf(R.drawable.weather_heavy_torrential_rainstorm));
        map.put(13, Integer.valueOf(R.drawable.weather_snow_squall));
        map.put(14, Integer.valueOf(R.drawable.weather_light_snowfall));
        map.put(15, Integer.valueOf(R.drawable.weather_moderate_snowfall));
        map.put(16, Integer.valueOf(R.drawable.weather_heavy_snowfall));
        map.put(17, Integer.valueOf(R.drawable.weather_blizzard));
        map.put(18, Integer.valueOf(R.drawable.weather_fog));
        map.put(19, Integer.valueOf(R.drawable.weather_freezing_rain));
        map.put(20, Integer.valueOf(R.drawable.weather_sandstorm));
        map.put(21, Integer.valueOf(R.drawable.weather_moderate_rain));
        map.put(22, Integer.valueOf(R.drawable.weather_heavy_rain));
        map.put(23, Integer.valueOf(R.drawable.weather_heavy_rainstorm));
        map.put(24, Integer.valueOf(R.drawable.weather_heavy_big_rainstorm));
        map.put(25, Integer.valueOf(R.drawable.weather_heavy_torrential_rainstorm));
        map.put(26, Integer.valueOf(R.drawable.weather_moderate_snowfall));
        map.put(27, Integer.valueOf(R.drawable.weather_heavy_snowfall));
        map.put(28, Integer.valueOf(R.drawable.weather_blizzard));
        map.put(29, Integer.valueOf(R.drawable.weather_haze));
        map.put(30, Integer.valueOf(R.drawable.weather_sandstorm));
        map.put(31, Integer.valueOf(R.drawable.weather_sandstorm));
        map.put(32, Integer.valueOf(R.drawable.weather_snow_squall));
        map.put(33, Integer.valueOf(R.drawable.weather_unknown));
        map.put(34, Integer.valueOf(R.drawable.weather_unknown));
        map.put(35, Integer.valueOf(R.drawable.weather_meteorology_wind));
        map.put(53, Integer.valueOf(R.drawable.weather_haze));
        map.put(99, Integer.valueOf(R.drawable.weather_unknown));
        map2.put(0, Integer.valueOf(R.drawable.weather_dark_sunny_daytime));
        map2.put(1, Integer.valueOf(R.drawable.weather_dark_cloud_day));
        map2.put(2, Integer.valueOf(R.drawable.weather_dark_cloudy));
        map2.put(3, Integer.valueOf(R.drawable.weather_dark_showers));
        map2.put(4, Integer.valueOf(R.drawable.weather_dark_thunderstorm));
        map2.put(5, Integer.valueOf(R.drawable.weather_dark_thunderstorm));
        map2.put(6, Integer.valueOf(R.drawable.weather_dark_sleet_rain));
        map2.put(7, Integer.valueOf(R.drawable.weather_dark_light_rain));
        map2.put(8, Integer.valueOf(R.drawable.weather_dark_moderate_rain));
        map2.put(9, Integer.valueOf(R.drawable.weather_dark_heavy_rain));
        map2.put(10, Integer.valueOf(R.drawable.weather_dark_heavy_rainstorm));
        map2.put(11, Integer.valueOf(R.drawable.weather_dark_heavy_big_rainstorm));
        map2.put(12, Integer.valueOf(R.drawable.weather_dark_heavy_torrential_rainstorm));
        map2.put(13, Integer.valueOf(R.drawable.weather_dark_snow_squall));
        map2.put(14, Integer.valueOf(R.drawable.weather_dark_light_snowfall));
        map2.put(15, Integer.valueOf(R.drawable.weather_dark_moderate_snowfall));
        map2.put(16, Integer.valueOf(R.drawable.weather_dark_heavy_snowfall));
        map2.put(17, Integer.valueOf(R.drawable.weather_dark_blizzard));
        map2.put(18, Integer.valueOf(R.drawable.weather_dark_fog));
        map2.put(19, Integer.valueOf(R.drawable.weather_dark_freezing_rain));
        map2.put(20, Integer.valueOf(R.drawable.weather_dark_sandstorm));
        map2.put(21, Integer.valueOf(R.drawable.weather_dark_moderate_rain));
        map2.put(22, Integer.valueOf(R.drawable.weather_dark_heavy_rain));
        map2.put(23, Integer.valueOf(R.drawable.weather_dark_heavy_rainstorm));
        map2.put(24, Integer.valueOf(R.drawable.weather_dark_heavy_big_rainstorm));
        map2.put(25, Integer.valueOf(R.drawable.weather_dark_heavy_torrential_rainstorm));
        map2.put(26, Integer.valueOf(R.drawable.weather_dark_moderate_snowfall));
        map2.put(27, Integer.valueOf(R.drawable.weather_dark_heavy_snowfall));
        map2.put(28, Integer.valueOf(R.drawable.weather_dark_blizzard));
        map2.put(29, Integer.valueOf(R.drawable.weather_dark_haze));
        map2.put(30, Integer.valueOf(R.drawable.weather_dark_sandstorm));
        map2.put(31, Integer.valueOf(R.drawable.weather_dark_sandstorm));
        map2.put(32, Integer.valueOf(R.drawable.weather_dark_snow_squall));
        map2.put(33, Integer.valueOf(R.drawable.weather_dark_unknown));
        map2.put(34, Integer.valueOf(R.drawable.weather_dark_unknown));
        map2.put(35, Integer.valueOf(R.drawable.weather_dark_meteorology_wind));
        map2.put(53, Integer.valueOf(R.drawable.weather_dark_haze));
        map2.put(99, Integer.valueOf(R.drawable.weather_dark_unknown));
    }

    public WeatherInfoView(Context context) {
        super(context);
        e(context);
    }

    public WeatherInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public WeatherInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_weather_info, (ViewGroup) this, true);
        this.g = (HealthImageView) findViewById(R.id.weather_icon_image_view);
        this.f11372b = (HealthTextView) findViewById(R.id.temperature_text_view);
        this.f11371a = (HealthImageView) findViewById(R.id.sensible_temperature_image_view);
        this.d = (HealthTextView) findViewById(R.id.sensible_temperature_text_view);
        this.j = (HealthImageView) findViewById(R.id.wind_direction_image_view);
        this.i = (HealthTextView) findViewById(R.id.wind_direction_text_view);
    }

    private void d(int i, boolean z) {
        if (z) {
            this.g.setImageResource(e.getOrDefault(Integer.valueOf(i), Integer.valueOf(R.drawable.weather_dark_unknown)).intValue());
        } else {
            this.g.setImageResource(f11370c.getOrDefault(Integer.valueOf(i), Integer.valueOf(R.drawable.weather_unknown)).intValue());
        }
    }

    private void setTemperature(int i) {
        double d = i;
        if (!UnitUtil.a()) {
            d = qrs.d(d);
        }
        long jRound = Math.round(d);
        LogUtil.a("Track_WeatherInfoView", "setTemperature finalTemperature :", Long.valueOf(jRound));
        this.f11372b.setText(UnitUtil.e(MeasureFormat.FormatWidth.SHORT, Long.valueOf(jRound), UnitUtil.a() ? MeasureUnit.CELSIUS : MeasureUnit.FAHRENHEIT));
    }

    private void setSensibleTemperature(int i) {
        double d = i;
        if (!UnitUtil.a()) {
            d = qrs.d(d);
        }
        long jRound = Math.round(d);
        LogUtil.a("Track_WeatherInfoView", "setSensibleTemperature finalTemperature :", Long.valueOf(jRound));
        this.d.setText(qre.a(R.string.IDS_motiontrack_apparent_temperature, UnitUtil.e(MeasureFormat.FormatWidth.SHORT, Long.valueOf(jRound), UnitUtil.a() ? MeasureUnit.CELSIUS : MeasureUnit.FAHRENHEIT)));
    }

    private void d(int i, int i2) {
        this.i.setText(qre.a(R.string.IDS_motiontrack_windy_direction_format, d(i), b(i2)));
    }

    private String d(int i) {
        switch (i) {
            case 0:
                return qre.f(R.string.IDS_motiontrack_windy_direction_no);
            case 1:
                return qre.f(R.string.IDS_motiontrack_windy_direction_northeast);
            case 2:
                return qre.f(R.string.IDS_motiontrack_windy_direction_east);
            case 3:
                return qre.f(R.string.IDS_motiontrack_windy_direction_southeast);
            case 4:
                return qre.f(R.string.IDS_motiontrack_windy_direction_south);
            case 5:
                return qre.f(R.string.IDS_motiontrack_windy_direction_southwest);
            case 6:
                return qre.f(R.string.IDS_motiontrack_windy_direction_west);
            case 7:
                return qre.f(R.string.IDS_motiontrack_windy_direction_northwest);
            case 8:
                return qre.f(R.string.IDS_motiontrack_windy_direction_north);
            default:
                return qre.f(R.string.IDS_motiontrack_windy_direction_no);
        }
    }

    private String b(int i) {
        double dDoubleValue = BigDecimal.valueOf(i).divide(BigDecimal.valueOf(3.6d), 1, RoundingMode.HALF_UP).doubleValue();
        int i2 = R.plurals.IDS_weather_wind_ms_unit;
        if (UnitUtil.f()) {
            dDoubleValue = qrs.c(dDoubleValue);
            i2 = R.plurals.IDS_weather_wind_fts_unit;
        }
        long jRound = Math.round(dDoubleValue);
        LogUtil.a("Track_WeatherInfoView", "getWindSpeedDescription finalWindSpeed:", Long.valueOf(jRound));
        return qre.e(i2, (int) jRound, UnitUtil.e(jRound, 1, 0));
    }

    public void a(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null || motionPathSimplify.requestExtendDataMap() == null) {
            LogUtil.e("Track_WeatherInfoView", "showWeatherInfoView motionPathSimplify is null, return");
            return;
        }
        this.h = motionPathSimplify.getExtendDataInt(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER);
        int extendDataInt = motionPathSimplify.getExtendDataInt(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE);
        int extendDataInt2 = motionPathSimplify.getExtendDataInt("apparentTemperature");
        motionPathSimplify.getExtendDataInt("relativeHumidity");
        int extendDataInt3 = motionPathSimplify.getExtendDataInt("windDirection");
        motionPathSimplify.getExtendDataInt("windForce");
        int extendDataInt4 = motionPathSimplify.getExtendDataInt("windSpeed");
        setTemperature(extendDataInt);
        d(this.h, qrs.x(getContext()));
        setSensibleTemperature(extendDataInt2);
        d(extendDataInt3, extendDataInt4);
        if (qrs.x(getContext())) {
            this.f11371a.setImageResource(R.drawable.weather_dark_sensible_temperature);
            this.j.setImageResource(R.drawable.weather_dark_wind);
        } else {
            this.f11371a.setImageResource(R.drawable.weather_sensible_temperature);
            this.j.setImageResource(R.drawable.weather_wind);
        }
    }

    public void a(boolean z) {
        if (z) {
            int color = ContextCompat.getColor(getContext(), R.color.font_dark_secondary);
            this.f11372b.setTextColor(color);
            this.d.setTextColor(color);
            this.i.setTextColor(color);
            d(this.h, true);
            this.f11371a.setImageResource(R.drawable.weather_dark_sensible_temperature);
            this.j.setImageResource(R.drawable.weather_dark_wind);
            return;
        }
        int color2 = ContextCompat.getColor(getContext(), R.color.health_secondary_color);
        this.f11372b.setTextColor(color2);
        this.d.setTextColor(color2);
        this.i.setTextColor(color2);
        d(this.h, false);
        this.f11371a.setImageResource(R.drawable.weather_sensible_temperature);
        this.j.setImageResource(R.drawable.weather_wind);
    }
}
