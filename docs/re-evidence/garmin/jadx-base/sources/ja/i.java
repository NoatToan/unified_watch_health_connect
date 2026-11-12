package ja;

import androidx.media3.common.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f97972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f97973c;

    public /* synthetic */ i(int i14, long j8, b.a aVar) {
        this.f97971a = 3;
        this.f97972b = aVar;
        this.f97973c = i14;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        switch (this.f97971a) {
            case 0:
                ((b) obj).E(this.f97972b, this.f97973c);
                break;
            case 1:
                ((b) obj).V(this.f97972b, this.f97973c);
                break;
            case 2:
                ((b) obj).K(this.f97972b, this.f97973c);
                break;
            case 3:
                ((b) obj).O(this.f97972b, this.f97973c);
                break;
            case 4:
                ((b) obj).h(this.f97972b, this.f97973c);
                break;
            case 5:
                b bVar = (b) obj;
                bVar.getClass();
                bVar.T(this.f97972b, this.f97973c);
                break;
            default:
                ((b) obj).c0(this.f97972b, this.f97973c);
                break;
        }
    }

    public /* synthetic */ i(b.a aVar, int i14, int i15) {
        this.f97971a = i15;
        this.f97972b = aVar;
        this.f97973c = i14;
    }

    public /* synthetic */ i(b.a aVar, t tVar, int i14) {
        this.f97971a = 1;
        this.f97972b = aVar;
        this.f97973c = i14;
    }
}
