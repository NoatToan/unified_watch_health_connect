package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class v extends fb2.a<Object> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f27481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27482k;

    public v(Context context, long j8) {
        super(context);
        this.f27480i = View.generateViewId();
        this.f27482k = true;
        this.f27481j = j8;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return true;
    }

    @Override // fb2.a
    public final boolean q(Object obj) {
        rd2.h.d().getClass();
        return rd2.h.e(1, this.f27481j);
    }

    @Override // fb2.a
    public final String r() {
        if (this.f27482k) {
            return this.f70343a.getString(R.string.description_auto_upload_on_off);
        }
        return null;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71600i() {
        return this.f27480i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_settings_auto_upload_activities);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        rd2.h.d().getClass();
        long j8 = this.f27481j;
        rd2.h.g(j8, 1, z14);
        hk0.a.f().o(j8, z14);
    }

    public v(Context context, long j8, boolean z14) {
        super(context);
        this.f27480i = View.generateViewId();
        this.f27481j = j8;
        this.f27482k = z14;
    }
}
