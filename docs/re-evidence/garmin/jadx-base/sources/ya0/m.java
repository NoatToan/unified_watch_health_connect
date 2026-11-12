package ya0;

import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f195488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f195489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f195490d;

    public /* synthetic */ m(a aVar, long j8, p1 p1Var, int i14) {
        this.f195487a = i14;
        this.f195488b = aVar;
        this.f195489c = j8;
        this.f195490d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f195487a) {
            case 0:
                if (((Boolean) this.f195490d.getF182175a()) == null) {
                    this.f195488b.x4(this.f195489c);
                }
                break;
            default:
                if (((Boolean) this.f195490d.getF182175a()) == null) {
                    this.f195488b.x4(this.f195489c);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
