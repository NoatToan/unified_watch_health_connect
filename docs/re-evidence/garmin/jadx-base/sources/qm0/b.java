package qm0;

import android.content.Context;
import c22.b3;
import com.garmin.android.apps.connectmobile.g3;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f145481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wg0.a f145482c;

    public /* synthetic */ b(d dVar, wg0.a aVar, int i14) {
        this.f145480a = i14;
        this.f145481b = dVar;
        this.f145482c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f145480a;
        wg0.a aVar = this.f145482c;
        d dVar = this.f145481b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                d.a aVar2 = d.E;
                g3Var.getClass();
                int i15 = d.b.f145496a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    dVar.Y6().f145572g.j(new b0(aVar, (mo1.f) g3Var.f35301b));
                } else if (i15 == 2) {
                    dVar.Y6().f145572g.j(new b0(aVar, null));
                    if (zy0.g.a(g3Var.f35304e)) {
                        Context context = dVar.getContext();
                        if (context == null) {
                            return Unit.INSTANCE;
                        }
                        b3.c(context);
                    }
                } else if (i15 != 3) {
                    u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            default:
                d.a aVar3 = d.E;
                g3Var.getClass();
                int i16 = d.b.f145496a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    dVar.Y6().f145573h.j(new e0(aVar, true));
                } else if (i16 == 2) {
                    dVar.Y6().f145573h.j(new e0(aVar, false));
                } else if (i16 != 3) {
                    u0.r();
                    return null;
                }
                return Unit.INSTANCE;
        }
    }
}
