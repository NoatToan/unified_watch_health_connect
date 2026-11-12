package s40;

import androidx.fragment.app.m;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f157050b;

    public /* synthetic */ d(g gVar, int i14) {
        this.f157049a = i14;
        this.f157050b = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f157049a;
        g gVar = this.f157050b;
        switch (i14) {
            case 0:
                g.a aVar = g.f157056i;
                m activity = gVar.getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                }
                m activity2 = gVar.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                break;
            default:
                g.a aVar2 = g.f157056i;
                gVar.z6();
                break;
        }
        return Unit.INSTANCE;
    }
}
