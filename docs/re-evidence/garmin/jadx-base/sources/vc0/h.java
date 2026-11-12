package vc0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f176987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f176988c;

    public /* synthetic */ h(j jVar, Fragment fragment, int i14) {
        this.f176986a = i14;
        this.f176987b = jVar;
        this.f176988c = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f176986a) {
            case 0:
                j jVar = this.f176987b;
                di2.a aVar = jVar.f176994f;
                if (aVar == null) {
                    p005kotlin.jvm.internal.s.m("findMyDeviceDelegate");
                    throw null;
                }
                aVar.e(mh2.j.DEFAULT);
                jVar.u(this.f176988c);
                return;
            case 1:
                j jVar2 = this.f176987b;
                di2.a aVar2 = jVar2.f176994f;
                if (aVar2 == null) {
                    p005kotlin.jvm.internal.s.m("findMyDeviceDelegate");
                    throw null;
                }
                aVar2.e(mh2.j.DEFAULT);
                jVar2.u(this.f176988c);
                return;
            default:
                j jVar3 = this.f176987b;
                di2.a aVar3 = jVar3.f176994f;
                if (aVar3 == null) {
                    p005kotlin.jvm.internal.s.m("findMyDeviceDelegate");
                    throw null;
                }
                aVar3.e(mh2.j.DEFAULT);
                Context context = jVar3.f64388a;
                String string = context.getString(R.string.find_my_watch_found_title);
                String strD = p6.b.d(context, R.string.find_my_watch_found_msg, string);
                String string2 = context.getString(R.string.lbl_close);
                string2.getClass();
                Fragment fragment = this.f176988c;
                androidx.fragment.app.m activity = fragment.getActivity();
                if (activity == null || !hi2.c.a(activity)) {
                    return;
                }
                kh2.g.a aVar4 = kh2.g.f104792a;
                Context contextRequireContext = fragment.requireContext();
                contextRequireContext.getClass();
                kh2.g.a.a(aVar4, contextRequireContext, string, strD, new o13.p(string2, new tr2.o(jVar3, 17)), null, 496).show();
                return;
        }
    }
}
