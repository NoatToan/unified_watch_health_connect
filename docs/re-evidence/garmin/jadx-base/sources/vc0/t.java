package vc0;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvc0/t;", "Lbd0/u$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements bd0.u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f177009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f177010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f177011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f177012d;

    /* JADX WARN: Multi-variable type inference failed */
    public t(s sVar, boolean z14, e23.l<? super Boolean, Unit> lVar, boolean z15) {
        this.f177009a = sVar;
        this.f177010b = z14;
        this.f177011c = lVar;
        this.f177012d = z15;
    }

    @Override // bd0.u.b
    public final void b(yl2.e eVar) {
        eVar.getClass();
        com.airbnb.lottie.animation.keyframe.a.u("Preferred Activity Tracker failed to set in Pulse Ox ", eVar.name(), ".", s.f177006e);
        kh2.g.f104792a.getClass();
        kh2.g.a.b();
        if (eVar != yl2.e.NO_INTERNET_CONNECTION) {
            Context context = this.f177009a.f64388a;
            Toast.makeText(context, context.getString(R.string.device_settings_cant_set_aatd), 0).show();
        }
        this.f177011c.invoke(Boolean.FALSE);
    }

    @Override // bd0.u.b
    public final void c() {
        s.f177006e.debug("Preferred Activity Tracker successfully set through Pulse Ox.");
        kh2.g.f104792a.getClass();
        kh2.g.a.b();
        s sVar = this.f177009a;
        Context context = sVar.f64388a;
        Toast.makeText(context, context.getString(R.string.msg_settings_saved_successfully), 0).show();
        boolean z14 = this.f177010b;
        e23.l<Boolean, Unit> lVar = this.f177011c;
        if (z14) {
            sVar.w(lVar);
        } else {
            if (this.f177012d) {
                sVar.x(lVar);
                return;
            }
            Context context2 = sVar.f64388a;
            Toast.makeText(context2, context2.getString(R.string.txt_something_went_wrong_try_again), 0).show();
            lVar.invoke(Boolean.FALSE);
        }
    }
}
