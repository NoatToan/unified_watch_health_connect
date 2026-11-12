package androidx.room;

import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements r53.i<Set<? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f10918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f10919b;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f10920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f10921b;

        /* JADX INFO: renamed from: androidx.room.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", l = {235}, m = "emit")
        public static final class C0154a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f10922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f10923b;

            public C0154a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f10922a = obj;
                this.f10923b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, String[] strArr) {
            this.f10920a = jVar;
            this.f10921b = strArr;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C0154a c0154a;
            if (dVar instanceof C0154a) {
                c0154a = (C0154a) dVar;
                int i14 = c0154a.f10923b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c0154a.f10923b = i14 - Integer.MIN_VALUE;
                } else {
                    c0154a = new C0154a(dVar);
                }
            } else {
                c0154a = new C0154a(dVar);
            }
            Object obj2 = c0154a.f10922a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c0154a.f10923b;
            if (i15 == 0) {
                o13.r.b(obj2);
                Set set = (Set) obj;
                q13.g gVar = new q13.g();
                for (String str : this.f10921b) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (d53.u.q(str, (String) it.next(), true)) {
                            gVar.add(str);
                        }
                    }
                }
                q13.g gVarA = p13.a1.a(gVar);
                if (gVarA.f142145a.isEmpty()) {
                    gVarA = null;
                }
                if (gVarA != null) {
                    c0154a.f10923b = 1;
                    if (this.f10920a.emit(gVarA, c0154a) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public q(r53.i iVar, String[] strArr) {
        this.f10918a = iVar;
        this.f10919b = strArr;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Set<? extends String>> jVar, t13.d dVar) {
        Object objCollect = this.f10918a.collect(new a(jVar, this.f10919b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
