package po;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f138834b;

    public /* synthetic */ f(h hVar, int i14) {
        this.f138833a = i14;
        this.f138834b = hVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i14 = this.f138833a;
        h hVar = this.f138834b;
        ie2.j jVar = (ie2.j) obj;
        switch (i14) {
            case 0:
                int i15 = h.E1;
                String title = jVar.getTitle();
                if (title != null && title.contains("obstacle")) {
                    hVar.f148294e.n(jVar);
                    break;
                }
                break;
            case 1:
                int i16 = h.E1;
                String title2 = jVar.getTitle();
                if (title2 != null && title2.contains("TimingGate")) {
                    hVar.f148294e.n(jVar);
                    break;
                }
                break;
            default:
                int i17 = h.E1;
                String title3 = jVar.getTitle();
                if (title3 != null && title3.contains("Jump")) {
                    hVar.f148294e.n(jVar);
                    break;
                }
                break;
        }
    }
}
