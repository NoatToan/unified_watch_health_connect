package vx1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import p005kotlin.Unit;
import ro0.l;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180654a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f180655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f180656c;

    public /* synthetic */ c(Context context, d dVar) {
        this.f180655b = context;
        this.f180656c = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f180654a;
        d dVar = this.f180656c;
        switch (i14) {
            case 0:
                int i15 = d.f180657g;
                h82.c.f(dVar, this.f180655b, "https://familydoctor.org/weight-training-and-weight-lifting-safety/");
                break;
            default:
                int i16 = d.f180657g;
                HelpActivity.a.e(HelpActivity.f36653a, this.f180655b, l.BENCHMARK_EXERCISE, null, dVar.f180658f, 4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(d dVar, Context context) {
        this.f180656c = dVar;
        this.f180655b = context;
    }
}
