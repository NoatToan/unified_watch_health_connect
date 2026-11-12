package com.xiaomi.hm.health.weather.events;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.hm.health.weather.model.WeatherVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/weather/events/CityListEventListener;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onSearchClick", "Lcom/xiaomi/hm/health/weather/model/WeatherVo;", "weatherVo", "onDelete", "onDefaultCityChange", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface CityListEventListener {
    void onDefaultCityChange(@NotNull WeatherVo weatherVo);

    void onDelete(@NotNull WeatherVo weatherVo);

    void onSearchClick(@NotNull View view);
}
