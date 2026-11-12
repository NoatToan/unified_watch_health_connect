package hf;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface j {
    Object a(wf.f fVar, v13.c cVar);

    mf.a b();

    wf.d c(wf.f fVar);

    rf.b d();

    wf.f.b e();

    /* JADX INFO: renamed from: getComponents */
    c getF83581d();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lhf/j$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lhf/n$a;", "options", "(Lhf/n$a;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f83564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public wf.f.b f83565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o13.l<? extends t13.g> f83566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o13.l<? extends rf.b> f83567d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final o13.l<? extends mf.a> f83568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e.c f83569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f83570g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final f.a f83571h;

        public a(n.a aVar) {
            this.f83564a = aVar.f83583a;
            wf.f.b bVar = aVar.f83584b;
            this.f83565b = bVar;
            this.f83566c = aVar.f83585c;
            this.f83567d = aVar.f83586d;
            this.f83568e = aVar.f83587e;
            this.f83569f = aVar.f83588f;
            this.f83570g = aVar.f83589g;
            f fVar = bVar.f184967n;
            fVar.getClass();
            this.f83571h = new f.a(fVar);
        }

        public final n a() {
            wf.f.b bVarA = wf.f.b.a(this.f83565b, null, null, this.f83571h.a(), 8191);
            o13.l lVarB = this.f83566c;
            if (lVarB == null) {
                lVarB = o13.m.b(new ha0.a(2));
            }
            o13.l lVar = lVarB;
            o13.l lVarB2 = this.f83567d;
            if (lVarB2 == null) {
                lVarB2 = o13.m.b(new h62.j(this, 4));
            }
            o13.l lVar2 = lVarB2;
            o13.l lVarB3 = this.f83568e;
            if (lVarB3 == null) {
                lVarB3 = o13.m.b(new ha0.a(3));
            }
            o13.l lVar3 = lVarB3;
            e.c cVar = this.f83569f;
            if (cVar == null) {
                cVar = e.c.f83556b0;
            }
            e.c cVar2 = cVar;
            c cVar3 = this.f83570g;
            if (cVar3 == null) {
                cVar3 = new c();
            }
            return new n(new n.a(this.f83564a, bVarA, lVar, lVar2, lVar3, cVar2, cVar3, null));
        }

        public a(Context context) {
            this.f83564a = context.getApplicationContext();
            this.f83565b = wf.f.b.f184953o;
            this.f83566c = null;
            this.f83567d = null;
            this.f83568e = null;
            this.f83569f = null;
            this.f83570g = null;
            this.f83571h = new f.a();
        }
    }
}
