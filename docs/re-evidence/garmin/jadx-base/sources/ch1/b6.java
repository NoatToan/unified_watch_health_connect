package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gfdi.configuration.SupportedCapability;

/* JADX INFO: loaded from: classes10.dex */
public class b6 extends fb2.a<Object> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f27307j;

    public b6(Context context, long j8) {
        super(context);
        this.f27306i = View.generateViewId();
        this.f27307j = j8;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return km2.a.i(this.f27307j, null, SupportedCapability.WEATHER_CONDITIONS.ordinal());
    }

    @Override // fb2.a
    public final boolean q(Object obj) {
        rd2.h.d().getClass();
        return rd2.h.e(2, this.f27307j);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF180397i() {
        return this.f27306i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.title_weather_on_off);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        rd2.h.d().getClass();
        long j8 = this.f27307j;
        rd2.h.g(j8, 2, z14);
        hk0.a.f().p(j8, z14);
    }
}
