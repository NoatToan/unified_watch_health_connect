package xc0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f189919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f189920c;

    public /* synthetic */ f(g gVar, Fragment fragment, int i14) {
        this.f189918a = i14;
        this.f189919b = gVar;
        this.f189920c = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f189918a) {
            case 0:
                g gVar = this.f189919b;
                ax2.a aVar = gVar.f189925e;
                if (aVar == null) {
                    p005kotlin.jvm.internal.s.m("findMyDeviceDelegate");
                    throw null;
                }
                aVar.c(gw2.d.DEFAULT);
                gVar.n(this.f189920c);
                return;
            case 1:
                g gVar2 = this.f189919b;
                ax2.a aVar2 = gVar2.f189925e;
                if (aVar2 == null) {
                    p005kotlin.jvm.internal.s.m("findMyDeviceDelegate");
                    throw null;
                }
                aVar2.c(gw2.d.DEFAULT);
                Context context = gVar2.f207282a;
                String string = context.getString(R.string.find_my_watch_found_title);
                String strD = p6.b.d(context, R.string.find_my_watch_found_msg, string);
                String string2 = context.getString(R.string.lbl_close);
                string2.getClass();
                Fragment fragment = this.f189920c;
                androidx.fragment.app.m activity = fragment.getActivity();
                if (activity == null || !cx2.g.e(activity)) {
                    return;
                }
                ew2.e.a aVar3 = ew2.e.f66901a;
                Context contextRequireContext = fragment.requireContext();
                contextRequireContext.getClass();
                ew2.e.a.a(aVar3, contextRequireContext, string, strD, new o13.p(string2, new vy0.e(gVar2, 17)), null, 496).show();
                return;
            default:
                g gVar3 = this.f189919b;
                ax2.a aVar4 = gVar3.f189925e;
                if (aVar4 == null) {
                    p005kotlin.jvm.internal.s.m("findMyDeviceDelegate");
                    throw null;
                }
                aVar4.c(gw2.d.DEFAULT);
                gVar3.n(this.f189920c);
                return;
        }
    }
}
