package com.amap.api.services.weather;

import android.content.Context;
import com.amap.api.col.p0003sl.ib;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IWeatherSearch;

/* JADX INFO: loaded from: classes4.dex */
public class WeatherSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IWeatherSearch f3892a;

    public interface OnWeatherSearchListener {
        void onWeatherForecastSearched(LocalWeatherForecastResult localWeatherForecastResult, int i);

        void onWeatherLiveSearched(LocalWeatherLiveResult localWeatherLiveResult, int i);
    }

    public WeatherSearch(Context context) throws AMapException {
        this.f3892a = null;
        try {
            this.f3892a = new ib(context);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof AMapException) {
                throw ((AMapException) e);
            }
        }
    }

    public WeatherSearchQuery getQuery() {
        IWeatherSearch iWeatherSearch = this.f3892a;
        if (iWeatherSearch != null) {
            return iWeatherSearch.getQuery();
        }
        return null;
    }

    public void setQuery(WeatherSearchQuery weatherSearchQuery) {
        IWeatherSearch iWeatherSearch = this.f3892a;
        if (iWeatherSearch != null) {
            iWeatherSearch.setQuery(weatherSearchQuery);
        }
    }

    public void searchWeatherAsyn() {
        IWeatherSearch iWeatherSearch = this.f3892a;
        if (iWeatherSearch != null) {
            iWeatherSearch.searchWeatherAsyn();
        }
    }

    public void setOnWeatherSearchListener(OnWeatherSearchListener onWeatherSearchListener) {
        IWeatherSearch iWeatherSearch = this.f3892a;
        if (iWeatherSearch != null) {
            iWeatherSearch.setOnWeatherSearchListener(onWeatherSearchListener);
        }
    }
}
