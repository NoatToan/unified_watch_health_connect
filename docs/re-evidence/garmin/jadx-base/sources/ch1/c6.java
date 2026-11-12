package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class c6 extends fb2.m<Long> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27314f = View.generateViewId();

    public c6(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        Long l14 = (Long) obj;
        rd2.h hVarD = rd2.h.d();
        long jLongValue = l14.longValue();
        hVarD.getClass();
        boolean zE = rd2.h.e(2, jLongValue);
        rd2.h hVarD2 = rd2.h.d();
        long jLongValue2 = l14.longValue();
        hVarD2.getClass();
        return zE || rd2.h.e(3, jLongValue2);
    }

    @Override // fb2.m
    public final int t() {
        return f27314f;
    }

    @Override // fb2.m
    public final String u() {
        return this.f70343a.getString(R.string.title_weather_on_off);
    }
}
