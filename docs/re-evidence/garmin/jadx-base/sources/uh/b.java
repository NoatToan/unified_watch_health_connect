package uh;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import ki.d;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import pi.k;
import vb.h;
import vh.g0;
import vh.z;
import wh.e;
import wh.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002\u001d\u001eB\u008b\u0001\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Luh/b;", "", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lni/a;", "networkTransport", "Lvh/z;", "customScalarAdapters", "subscriptionNetworkTransport", "", "Lki/a;", "interceptors", "Lvh/g0;", "executionContext", "Lo53/z;", "dispatcher", "Lwh/f;", "httpMethod", "Lwh/e;", "httpHeaders", "", "sendApqExtensions", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "Luh/b$a;", "builder", "<init>", "(Lni/a;Lvh/z;Lni/a;Ljava/util/List;Lvh/g0;Lo53/z;Lwh/f;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Luh/b$a;)V", "a", "b", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ni.a f171099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f171100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ni.a f171101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ki.a> f171102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f171103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f171104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<e> f171105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f171106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f171107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f171108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f171109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f171110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f171111m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luh/b$a;", "", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z.a f171112a = new z.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f171113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f171114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f171115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g0 f171116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f171117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public oi.c f171118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Long f171119h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f171120i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public pi.e f171121j;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f171113b = arrayList;
            this.f171114c = arrayList;
            this.f171115d = new ArrayList();
            this.f171116e = g0.f178322a;
            x53.b bVar = li.e.f112572a;
        }

        public final b a() {
            ni.a kVar;
            if (this.f171117f == null) {
                h.z("Apollo: 'serverUrl' is required");
                return null;
            }
            oi.h.a aVar = new oi.h.a();
            String str = this.f171117f;
            str.getClass();
            aVar.f132199a = str;
            oi.c cVar = this.f171118g;
            if (cVar != null) {
                aVar.f132200b = cVar;
            }
            Boolean bool = this.f171120i;
            if (bool != null) {
                aVar.f132202d = bool.booleanValue();
            }
            ArrayList arrayList = this.f171115d;
            arrayList.getClass();
            ArrayList arrayList2 = aVar.f132201c;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            String str2 = aVar.f132199a;
            j jVar = null;
            wh.c cVar2 = str2 != null ? new wh.c(str2) : null;
            if (cVar2 == null) {
                h.z("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
                return null;
            }
            oi.c cVar3 = aVar.f132200b;
            if (cVar3 == null) {
                cVar3 = new oi.c(0L, 1, jVar);
            }
            oi.h hVar = new oi.h(cVar2, cVar3, arrayList2, aVar.f132202d, null);
            String str3 = this.f171117f;
            if (str3 == null) {
                kVar = hVar;
            } else {
                k.b bVar = new k.b();
                pi.e eVar = this.f171121j;
                if (eVar != null) {
                    bVar.f137763b = eVar;
                }
                Long l14 = this.f171119h;
                if (l14 != null) {
                    bVar.f137764c = l14;
                }
                pi.e eVar2 = bVar.f137763b;
                if (eVar2 == null) {
                    eVar2 = new pi.e();
                }
                pi.e eVar3 = eVar2;
                Long l15 = bVar.f137764c;
                kVar = new k(str3, bVar.f137762a, eVar3, l15 != null ? l15.longValue() : 60000L, new pi.f.b(0L, null, null, 7, null), null, null);
            }
            return new b(hVar, this.f171112a.a(), kVar, h0.C0(this.f171113b, j0.f134944a), this.f171116e, null, null, null, null, null, null, null, this, null);
        }
    }

    static {
        new C3188b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(ni.a aVar, z zVar, ni.a aVar2, List<? extends ki.a> list, g0 g0Var, o53.z zVar2, f fVar, List<e> list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, a aVar3) {
        this.f171099a = aVar;
        this.f171100b = zVar;
        this.f171101c = aVar2;
        this.f171102d = list;
        this.f171103e = g0Var;
        this.f171104f = fVar;
        this.f171105g = list2;
        this.f171106h = bool;
        this.f171107i = bool2;
        this.f171108j = bool3;
        this.f171109k = aVar3;
        zVar2 = zVar2 == null ? li.e.f112572a : zVar2;
        c cVar = new c(zVar2, c0.a(zVar2));
        this.f171110l = cVar;
        this.f171111m = new d(aVar, aVar2, cVar.f171123b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c0.c(this.f171110l.f171124c, null);
        this.f171099a.dispose();
        this.f171101c.dispose();
    }

    /* JADX INFO: renamed from: uh.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luh/b$b;", "", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class C3188b {
        public /* synthetic */ C3188b(j jVar) {
            this();
        }

        private C3188b() {
        }
    }

    public /* synthetic */ b(ni.a aVar, z zVar, ni.a aVar2, List list, g0 g0Var, o53.z zVar2, f fVar, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, a aVar3, j jVar) {
        this(aVar, zVar, aVar2, list, g0Var, zVar2, fVar, list2, bool, bool2, bool3, bool4, aVar3);
    }
}
