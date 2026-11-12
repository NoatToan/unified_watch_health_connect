package ze;

import cf.t;
import p005kotlin.Metadata;
import ue.u;
import ue.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lze/h;", "Lze/b;", "Lye/f;", "Laf/g;", "tracker", "<init>", "(Laf/g;)V", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends b<ye.f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204257b;

    static {
        new a(null);
        u.b("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(af.g<ye.f> gVar) {
        super(gVar);
        gVar.getClass();
        this.f204257b = 7;
    }

    @Override // ze.e
    public final boolean a(t tVar) {
        tVar.getClass();
        return tVar.f26950j.f170043a == v.NOT_ROAMING;
    }

    @Override // ze.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF204257b() {
        return this.f204257b;
    }

    @Override // ze.b
    public final boolean d(ye.f fVar) {
        ye.f fVar2 = fVar;
        fVar2.getClass();
        return (fVar2.f196791a && fVar2.f196794d) ? false : true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lze/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
