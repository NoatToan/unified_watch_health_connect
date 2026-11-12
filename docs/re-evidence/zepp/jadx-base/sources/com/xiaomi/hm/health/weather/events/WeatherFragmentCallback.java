package com.xiaomi.hm.health.weather.events;

import androidx.fragment.app.Fragment;
import com.alipay.sdk.m.x.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/weather/events/WeatherFragmentCallback;", "", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "clazz", "", "onEnter", d.n, "startLoading", "stopLoading", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface WeatherFragmentCallback {
    void onBack(@NotNull Class<? extends Fragment> clazz);

    void onEnter(@NotNull Class<? extends Fragment> clazz);

    void startLoading();

    void stopLoading();
}
