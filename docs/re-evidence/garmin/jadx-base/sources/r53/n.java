package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f150747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q53.v f150748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q53.k f150749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f150750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f150751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f150752f;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150751e = obj;
            this.f150752f |= Integer.MIN_VALUE;
            return n.a(null, null, false, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object a(j<? super T> jVar, q53.v<? extends T> vVar, boolean z14, t13.d<? super Unit> dVar) {
        a aVar;
        q53.k<? extends T> it;
        q53.k<? extends T> kVar;
        j<? super T> jVar2;
        Object objA;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150752f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150752f = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f150751e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150752f;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (jVar instanceof v2) {
                    throw ((v2) jVar).f150914a;
                }
                it = vVar.iterator();
                aVar.f150747a = jVar;
                aVar.f150748b = vVar;
                aVar.f150749c = it;
                aVar.f150750d = z14;
                aVar.f150752f = 1;
                objA = it.a(aVar);
                if (objA == aVar2) {
                    jVar2 = jVar;
                    kVar = it;
                    obj = objA;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z14) {
                            vVar.c(null);
                        }
                        return Unit.INSTANCE;
                    }
                    T next = kVar.next();
                    aVar.f150747a = jVar2;
                    aVar.f150748b = vVar;
                    aVar.f150749c = kVar;
                    aVar.f150750d = z14;
                    aVar.f150752f = 2;
                }
                return aVar2;
            }
            if (i15 == 1) {
                z14 = aVar.f150750d;
                kVar = aVar.f150749c;
                vVar = aVar.f150748b;
                jVar2 = aVar.f150747a;
                o13.r.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z14) {
                        vVar.c(null);
                    }
                    return Unit.INSTANCE;
                }
                T next2 = kVar.next();
                aVar.f150747a = jVar2;
                aVar.f150748b = vVar;
                aVar.f150749c = kVar;
                aVar.f150750d = z14;
                aVar.f150752f = 2;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z14 = aVar.f150750d;
                kVar = aVar.f150749c;
                vVar = aVar.f150748b;
                jVar2 = aVar.f150747a;
                o13.r.b(obj);
            }
            it = kVar;
            jVar = jVar2;
            aVar.f150747a = jVar;
            aVar.f150748b = vVar;
            aVar.f150749c = it;
            aVar.f150750d = z14;
            aVar.f150752f = 1;
            objA = it.a(aVar);
            if (objA == aVar2) {
                jVar2 = jVar;
                kVar = it;
                obj = objA;
                if (!((Boolean) obj).booleanValue()) {
                    if (z14) {
                        vVar.c(null);
                    }
                    return Unit.INSTANCE;
                }
                T next3 = kVar.next();
                aVar.f150747a = jVar2;
                aVar.f150748b = vVar;
                aVar.f150749c = kVar;
                aVar.f150750d = z14;
                aVar.f150752f = 2;
            }
            return aVar2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (z14) {
                    og.a.v(vVar, th3);
                }
                throw th4;
            }
        }
    }
}
