package pi;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u0;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B`\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012.\b\u0002\u0010\r\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lpi/f;", "Lpi/p;", "Lpi/i;", "webSocketConnection", "Lpi/p$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lt13/d;", "", "", "", "connectionPayload", "Lpi/o;", "frameType", "<init>", "(Lpi/i;Lpi/p$b;JLe23/l;Lpi/o;)V", "b", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class f extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f137734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<t13.d<? super Map<String, ? extends Object>>, Object> f137735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f137736e;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    @v13.e(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$1", f = "SubscriptionWsProtocol.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d, Object> {
        public a(t13.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d dVar) {
            new a(dVar).invokeSuspend(Unit.INSTANCE);
            return null;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return null;
        }
    }

    public /* synthetic */ f(i iVar, p.b bVar, long j8, e23.l lVar, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, bVar, (i14 & 4) != 0 ? AbstractComponentTracker.LINGERING_TIMEOUT : j8, (i14 & 8) != 0 ? new a(null) : lVar, (i14 & 16) != 0 ? o.Text : oVar);
    }

    @Override // pi.p
    public final void a(Map<String, ? extends Object> map) {
        map.getClass();
        Object obj = map.get(NotificationConstants.KEY_DATA_MIME_TYPE);
        boolean zG = s.g(obj, "data");
        p.b bVar = this.f137821b;
        if (zG) {
            Object obj2 = map.get(TtmlNode.ATTR_ID);
            obj2.getClass();
            Object obj3 = map.get("payload");
            obj3.getClass();
            bVar.e((String) obj2, (Map) obj3);
            return;
        }
        if (s.g(obj, Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
            Object obj4 = map.get(TtmlNode.ATTR_ID);
            if (obj4 instanceof String) {
                bVar.b((String) obj4, (Map) map.get("payload"));
                return;
            } else {
                bVar.c((Map) map.get("payload"));
                return;
            }
        }
        if (s.g(obj, "complete")) {
            Object obj5 = map.get(TtmlNode.ATTR_ID);
            obj5.getClass();
            bVar.d((String) obj5);
        }
    }

    @Override // pi.p
    public final <D extends n0.a> void e(vh.e<D> eVar) {
        o13.p pVar = new o13.p(NotificationConstants.KEY_DATA_MIME_TYPE, TtmlNode.START);
        o13.p pVar2 = new o13.p(TtmlNode.ATTR_ID, eVar.f178289b.toString());
        wh.c.a aVar = wh.c.f185218b;
        aVar.getClass();
        n0<D> n0Var = eVar.f178288a;
        Boolean bool = eVar.f178293f;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = eVar.f178294g;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        z zVar = (z) eVar.f178290c.b(z.f178396e);
        if (zVar == null) {
            vb.h.z("Cannot find a ResponseAdapterCache");
            return;
        }
        String strD = zBooleanValue2 ? n0Var.d() : null;
        zh.i iVar = new zh.i();
        wh.c.a.a(aVar, iVar, n0Var, zVar, zBooleanValue, strD);
        Object objC = iVar.c();
        objC.getClass();
        d(u0.e(pVar, pVar2, new o13.p("payload", (Map) objC)), this.f137736e);
    }

    @Override // pi.p
    public final <D extends n0.a> void f(vh.e<D> eVar) {
        d(u0.e(new o13.p(NotificationConstants.KEY_DATA_MIME_TYPE, "stop"), new o13.p(TtmlNode.ATTR_ID, eVar.f178289b.toString())), this.f137736e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (o53.j2.b(r5, r8, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(v13.c cVar) {
        g gVar;
        LinkedHashMap linkedHashMapF;
        f fVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f137744e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f137744e = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objInvoke = gVar.f137742c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f137744e;
        if (i15 != 0) {
            if (i15 == 1) {
                linkedHashMapF = gVar.f137741b;
                fVar = gVar.f137740a;
                o13.r.b(objInvoke);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objInvoke);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objInvoke);
        linkedHashMapF = u0.f(new o13.p(NotificationConstants.KEY_DATA_MIME_TYPE, "connection_init"));
        gVar.f137740a = this;
        gVar.f137741b = linkedHashMapF;
        gVar.f137744e = 1;
        objInvoke = this.f137735d.invoke(gVar);
        if (objInvoke != aVar) {
            fVar = this;
        }
        return aVar;
        Map map = (Map) objInvoke;
        if (map != null) {
            linkedHashMapF.put("payload", map);
        }
        fVar.d(linkedHashMapF, fVar.f137736e);
        long j8 = fVar.f137734c;
        h hVar = new h(fVar, null);
        gVar.f137740a = null;
        gVar.f137741b = null;
        gVar.f137744e = 2;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BP\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lpi/f$b;", "Lpi/p$a;", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lt13/d;", "", "", "", "connectionPayload", "Lpi/o;", "frameType", "<init>", "(JLe23/l;Lpi/o;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f137737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.l<t13.d<? super Map<String, ? extends Object>>, Object> f137738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f137739c;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
        @v13.e(c = "com.apollographql.apollo3.network.ws.SubscriptionWsProtocol$Factory$1", f = "SubscriptionWsProtocol.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.l<t13.d, Object> {
            public a(t13.d<? super a> dVar) {
                super(1, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d dVar) {
                new a(dVar).invokeSuspend(Unit.INSTANCE);
                return null;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return null;
            }
        }

        public /* synthetic */ b(long j8, e23.l lVar, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? AbstractComponentTracker.LINGERING_TIMEOUT : j8, (i14 & 2) != 0 ? new a(null) : lVar, (i14 & 4) != 0 ? o.Text : oVar);
        }

        @Override // pi.p.a
        public final f a(i iVar, k.i iVar2, b0 b0Var) {
            iVar.getClass();
            iVar2.getClass();
            b0Var.getClass();
            return new f(iVar, iVar2, this.f137737a, this.f137738b, this.f137739c);
        }

        public b(long j8) {
            this(j8, null, null, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(long j8, e23.l<? super t13.d<? super Map<String, ? extends Object>>, ? extends Object> lVar) {
            this(j8, lVar, null, 4, null);
            lVar.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(long j8, e23.l<? super t13.d<? super Map<String, ? extends Object>>, ? extends Object> lVar, o oVar) {
            lVar.getClass();
            oVar.getClass();
            this.f137737a = j8;
            this.f137738b = lVar;
            this.f137739c = oVar;
        }

        public b() {
            this(0L, null, null, 7, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(i iVar, p.b bVar, long j8) {
        this(iVar, bVar, j8, null, null, 24, null);
        iVar.getClass();
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(i iVar, p.b bVar, long j8, e23.l<? super t13.d<? super Map<String, ? extends Object>>, ? extends Object> lVar) {
        this(iVar, bVar, j8, lVar, null, 16, null);
        iVar.getClass();
        bVar.getClass();
        lVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(i iVar, p.b bVar) {
        this(iVar, bVar, 0L, null, null, 28, null);
        iVar.getClass();
        bVar.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(i iVar, p.b bVar, long j8, e23.l<? super t13.d<? super Map<String, ? extends Object>>, ? extends Object> lVar, o oVar) {
        super(iVar, bVar);
        iVar.getClass();
        bVar.getClass();
        lVar.getClass();
        oVar.getClass();
        this.f137734c = j8;
        this.f137735d = lVar;
        this.f137736e = oVar;
    }
}
