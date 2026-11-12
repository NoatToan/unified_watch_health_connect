package vc0;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvc0/r;", "Lbd0/u$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements bd0.u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f177005a;

    public r(q qVar) {
        this.f177005a = qVar;
    }

    @Override // bd0.u.b
    public final void b(yl2.e eVar) {
        eVar.getClass();
        com.airbnb.lottie.animation.keyframe.a.z("PreferredActivity Tracker change failed ", eVar.name(), ".", q.f177002e);
        kh2.g.f104792a.getClass();
        kh2.g.a.b();
        q qVar = this.f177005a;
        di2.a aVar = qVar.f177004d;
        if (aVar != null) {
            aVar.e(mh2.j.DEFAULT);
        }
        if (eVar != yl2.e.NO_INTERNET_CONNECTION) {
            Context context = qVar.f64388a;
            Toast.makeText(context, context.getString(R.string.device_settings_cant_set_aatd), 0).show();
        }
    }

    @Override // bd0.u.b
    public final void c() {
        q.f177002e.debug("PreferredActivity Tracker successfully changed.");
        kh2.g.f104792a.getClass();
        kh2.g.a.b();
        q qVar = this.f177005a;
        di2.a aVar = qVar.f177004d;
        if (aVar != null) {
            aVar.e(mh2.j.PREFERRED_ACTIVITY_DEVICE_SELECTED);
        }
        Context context = qVar.f64388a;
        Toast.makeText(context, context.getString(R.string.msg_settings_saved_successfully), 0).show();
    }
}
