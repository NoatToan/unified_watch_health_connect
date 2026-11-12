package dl2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import el2.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import o13.m;
import o13.t;
import ok2.d;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w0;
import p13.j0;
import p13.x;
import pk2.c0;
import pk2.f0;
import vb.h;
import wk2.f;
import yr1.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bBa\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017Bc\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u001a¨\u0006\u001c"}, d2 = {"Ldl2/b;", "Lok2/d;", "Lel2/e;", "Lok2/d$d;", "Lgl2/a;", "gcUpload", "Lfl2/a;", "gcDownload", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "", "isAppVisible", "", "Lpk2/f0;", "otherUploadDestinations", "Lpk2/c0;", "otherDownloadSources", "Ldl2/c;", "transferRemoteConfig", "Lhy2/d;", "serverDelegate", "<init>", "(Lgl2/a;Lfl2/a;Landroid/content/Context;Le23/a;Ljava/util/List;Ljava/util/List;Ldl2/c;Lhy2/d;)V", "Lmy2/a$c;", "serviceFactory", "(Lmy2/a$c;Lgl2/a;Lfl2/a;Landroid/content/Context;Le23/a;Ljava/util/List;Ljava/util/List;Ldl2/c;)V", "a", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b extends d implements e, d.InterfaceC2519d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f60318s = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gl2.a f60319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fl2.a f60320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f60321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hy2.d f60322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLong f60323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f60324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f60325r;

    static {
        new a(null);
    }

    public b(gl2.a aVar, fl2.a aVar2, Context context, e23.a<Boolean> aVar3, List<? extends f0> list, List<? extends c0> list2, c cVar, hy2.d dVar) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        list.getClass();
        list2.getClass();
        cVar.getClass();
        dVar.getClass();
        w0 w0Var = new w0(2);
        w0Var.a(aVar);
        w0Var.b(list.toArray(new f0[0]));
        ArrayList<Object> arrayList = w0Var.f105816a;
        List listK = x.k(arrayList.toArray(new f0[arrayList.size()]));
        w0 w0Var2 = new w0(2);
        w0Var2.a(aVar2);
        w0Var2.b(list2.toArray(new c0[0]));
        ArrayList<Object> arrayList2 = w0Var2.f105816a;
        super(listK, x.k(arrayList2.toArray(new c0[arrayList2.size()])), context, aVar3, null, new d.c(null, 1, null), null, 80, null);
        this.f60319l = aVar;
        this.f60320m = aVar2;
        this.f60321n = cVar;
        this.f60322o = dVar;
        this.f60323p = new AtomicLong(0L);
        this.f60324q = m.b(new dl2.a(this, 0));
        this.f60325r = m.b(new dl2.a(this, 1));
    }

    @Override // el2.e
    public final boolean a() {
        gl2.a aVar = this.f60319l;
        return aVar.f77890l.a() && aVar.f77890l.c();
    }

    @Override // el2.e
    public boolean b() {
        return this instanceof n;
    }

    @Override // ok2.d.InterfaceC2519d
    public final com.garmin.device.filetransfer.core.background.a c() {
        return new com.garmin.device.filetransfer.core.background.a(new dl2.a(this, 2), new dl2.a(this, 3));
    }

    @Override // el2.e
    public boolean d() {
        return true;
    }

    @Override // ok2.d.InterfaceC2519d
    public final void e() {
        this.f60321n.getClass();
    }

    @Override // ok2.d.InterfaceC2519d
    public final void f() {
        this.f60321n.getClass();
    }

    @Override // el2.e
    public final Object g(rs2.c cVar, boolean z14, el2.c cVar2) {
        Object objY = this.f60320m.y(cVar, cVar2, z14);
        return objY == u13.a.COROUTINE_SUSPENDED ? objY : Unit.INSTANCE;
    }

    @Override // ok2.d.InterfaceC2519d
    public final void h(rs2.c cVar, f fVar) {
        fVar.getClass();
        this.f60321n.getClass();
    }

    @Override // ok2.d.InterfaceC2519d
    public final void i() {
        this.f60321n.getClass();
    }

    public String q() {
        String str;
        yt2.f.f199669a.getClass();
        yt2.a aVar = yt2.f.f199670b;
        if (aVar != null && (str = aVar.d().f199675a) != null) {
            return str;
        }
        h.s("Sync 1.0 defaulted to ConnectMobile. App must supply value with OmtAnalytics/OmtAnalyticsProvider or override omtClientId");
        return null;
    }

    public Object r(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ldl2/b$a;", "", "<init>", "()V", "", "LOGGING_PREFIX", "Ljava/lang/String;", "LIB_VERSION", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(my2.a.c cVar, gl2.a aVar, fl2.a aVar2, Context context, e23.a<Boolean> aVar3, List<? extends f0> list) {
        this(cVar, aVar, aVar2, context, aVar3, list, (List) null, (c) null, 192, (j) null);
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(my2.a.c cVar, gl2.a aVar, fl2.a aVar2, Context context, e23.a<Boolean> aVar3, List<? extends f0> list, List<? extends c0> list2) {
        this(cVar, aVar, aVar2, context, aVar3, list, list2, (c) null, 128, (j) null);
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        list.getClass();
        list2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(my2.a.c cVar, gl2.a aVar, fl2.a aVar2, Context context, e23.a<Boolean> aVar3) {
        this(cVar, aVar, aVar2, context, aVar3, (List) null, (List) null, (c) null, 224, (j) null);
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
    }

    public b(gl2.a aVar, fl2.a aVar2, Context context, e23.a aVar3, List list, List list2, c cVar, hy2.d dVar, int i14, j jVar) {
        this(aVar, aVar2, context, (e23.a<Boolean>) aVar3, (List<? extends f0>) ((i14 & 16) != 0 ? j0.f134944a : list), (List<? extends c0>) ((i14 & 32) != 0 ? j0.f134944a : list2), cVar, dVar);
    }

    public b(my2.a.c cVar, gl2.a aVar, fl2.a aVar2, Context context, e23.a aVar3, List list, List list2, c cVar2, int i14, j jVar) {
        this(cVar, aVar, aVar2, context, (e23.a<Boolean>) aVar3, (List<? extends f0>) ((i14 & 32) != 0 ? j0.f134944a : list), (List<? extends c0>) ((i14 & 64) != 0 ? j0.f134944a : list2), (i14 & 128) != 0 ? new c(null, 1, null) : cVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(my2.a.c cVar, gl2.a aVar, fl2.a aVar2, Context context, e23.a<Boolean> aVar3, List<? extends f0> list, List<? extends c0> list2, c cVar2) {
        this(aVar, aVar2, context, aVar3, list, list2, cVar2, new my2.a("GCFT#", cVar, 0, 4, null));
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        list.getClass();
        list2.getClass();
        cVar2.getClass();
    }
}
