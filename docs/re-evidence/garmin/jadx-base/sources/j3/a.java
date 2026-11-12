package j3;

import java.util.ArrayList;
import java.util.List;
import o13.r;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements i<List<? extends oe.c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f96817a;

    /* JADX INFO: renamed from: j3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class C1847a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f96818a;

        /* JADX INFO: renamed from: j3.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @v13.e(c = "androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$2$$inlined$map$1$2", f = "AndroidWindowAdaptiveInfo.android.kt", l = {219}, m = "emit")
        public static final class C1848a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f96819a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f96820b;

            public C1848a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f96819a = obj;
                this.f96820b |= Integer.MIN_VALUE;
                return C1847a.this.emit(null, this);
            }
        }

        public C1847a(j jVar) {
            this.f96818a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1848a c1848a;
            if (dVar instanceof C1848a) {
                c1848a = (C1848a) dVar;
                int i14 = c1848a.f96820b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1848a.f96820b = i14 - Integer.MIN_VALUE;
                } else {
                    c1848a = new C1848a(dVar);
                }
            } else {
                c1848a = new C1848a(dVar);
            }
            Object obj2 = c1848a.f96819a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1848a.f96820b;
            if (i15 == 0) {
                r.b(obj2);
                List<oe.a> list = ((l) obj).f131239a;
                ArrayList arrayList = new ArrayList();
                for (T t7 : list) {
                    if (t7 instanceof oe.c) {
                        arrayList.add(t7);
                    }
                }
                c1848a.f96820b = 1;
                if (this.f96818a.emit(arrayList, c1848a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public a(i iVar) {
        this.f96817a = iVar;
    }

    @Override // r53.i
    public final Object collect(j<? super List<? extends oe.c>> jVar, t13.d dVar) {
        Object objCollect = this.f96817a.collect(new C1847a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
