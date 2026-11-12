package oi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p005kotlin.Metadata;
import r53.c2;
import vh.g0;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Loi/h;", "Lni/a;", "Lwh/h;", "httpRequestComposer", "Loi/e;", "engine", "", "Loi/g;", "interceptors", "", "exposeErrorBody", "<init>", "(Lwh/h;Loi/e;Ljava/util/List;Z)V", "a", "b", "c", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class h implements ni.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f132193f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wh.h f132194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f132195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<g> f132196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f132197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f132198e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loi/h$a;", "", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f132199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public oi.c f132200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f132201c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f132202d;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loi/h$c;", "Loi/g;", "<init>", "(Loi/h;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class c implements g {
        public c() {
        }

        @Override // oi.g
        public final Object a(wh.g gVar, i iVar) {
            return h.this.f132195b.a(gVar, iVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(wh.h hVar, e eVar, List<? extends g> list, boolean z14) {
        this.f132194a = hVar;
        this.f132195b = eVar;
        this.f132196c = list;
        this.f132197d = z14;
        this.f132198e = new c();
    }

    public static final vh.f b(h hVar, vh.f fVar, UUID uuid, wh.i iVar, long j8) {
        hVar.getClass();
        vh.f.a aVarA = fVar.a();
        uuid.getClass();
        aVarA.f178315b = uuid;
        int i14 = mi.a.f118679a;
        aVarA.a(new f(j8, System.currentTimeMillis(), iVar.f185234a, iVar.f185235b));
        return aVarA.b();
    }

    @Override // ni.a
    public final <D extends n0.a> r53.i<vh.f<D>> a(vh.e<D> eVar) {
        eVar.getClass();
        g0.b bVarB = eVar.f178290c.b(z.f178396e);
        bVarB.getClass();
        return new c2(new i(this, this.f132194a.a(eVar), eVar, (z) bVarB, null));
    }

    @Override // ni.a
    public final void dispose() {
        Iterator<T> it = this.f132196c.iterator();
        while (it.hasNext()) {
            ((g) it.next()).getClass();
        }
        this.f132195b.getClass();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loi/h$b;", "", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ h(wh.h hVar, e eVar, List list, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(hVar, eVar, list, z14);
    }
}
