package ok2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import o53.c2;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$requestSync$1", f = "CoreTransferManager.kt", l = {1036}, m = "invokeSuspend")
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f132797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f132798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f132799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<al2.b, CoreTransferException, Unit> f132800e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$requestSync$1$1", f = "CoreTransferManager.kt", l = {1037}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f132802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f132803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, y yVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f132802b = gVar;
            this.f132803c = yVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f132802b, this.f132803c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132801a;
            if (i14 == 0) {
                o13.r.b(obj);
                c2 c2VarK = this.f132802b.f132696o.k(this.f132803c);
                this.f132801a = 1;
                if (c2VarK.P(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(long j8, y yVar, g gVar, e23.p<? super al2.b, ? super CoreTransferException, Unit> pVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f132797b = j8;
        this.f132798c = yVar;
        this.f132799d = gVar;
        this.f132800e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f132797b, this.f132798c, this.f132799d, this.f132800e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        wk2.i iVar;
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132796a;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = this.f132797b;
            a aVar2 = new a(this.f132799d, this.f132798c, null);
            this.f132796a = 1;
            if (j2.c(j8, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        y yVar = this.f132798c;
        g0 g0Var = yVar.f132811e;
        if (g0Var != null) {
            g gVar = this.f132799d;
            bl2.b bVar = gVar.f132694m.get();
            if (bVar != null && (iVar = bVar.f18603d) != null && (-g0Var.ordinal()) > (-g0.USER_INITIATED_GENERAL.ordinal()) && (-g0Var.ordinal()) > (-iVar.getF205155e().ordinal())) {
                zk2.d dVar = gVar.f132695n;
                int iA = iVar.getF205155e().a() + 1;
                Collection<String> collection = yVar.f132808b;
                Map<UUID, zk2.k> map = dVar.f205129c;
                map.getClass();
                synchronized (map) {
                    try {
                        long jMillis = dVar.f205127a.a().millis();
                        Map<UUID, zk2.k> map2 = dVar.f205129c;
                        map2.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<UUID, zk2.k> entry : map2.entrySet()) {
                            zk2.k value = entry.getValue();
                            if (value.f205155e.a() >= iA && dVar.i(value, jMillis) && dVar.j(value.f205152b, collection) && value.f205152b.f185844c == wk2.h.PHONE_TO_DEVICE) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        z14 = false;
                        while (it.hasNext()) {
                            ((zk2.k) ((Map.Entry) it.next()).getValue()).j();
                            z14 = true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                gVar.f132688g.info("requestSync(" + g0Var + ") - retry recently failed items: " + z14);
            }
        }
        g.J(this.f132799d, "requestSync(" + this.f132798c.f132811e + ")", this.f132800e, false, 4);
        return Unit.INSTANCE;
    }
}
