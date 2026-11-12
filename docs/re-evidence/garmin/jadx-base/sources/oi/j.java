package oi;

import com.google.mlkit.common.MlKitException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import vh.n0;
import vh.o0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class j implements r53.i<vh.f<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f132224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f132225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f132226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f132227d;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f132228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n0 f132229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z f132230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0 f132231d;

        /* JADX INFO: renamed from: oi.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @v13.e(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "emit")
        public static final class C2512a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f132232a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f132233b;

            public C2512a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f132232a = obj;
                this.f132233b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, n0 n0Var, z zVar, r0 r0Var) {
            this.f132228a = jVar;
            this.f132229b = n0Var;
            this.f132230c = zVar;
            this.f132231d = r0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2512a c2512a;
            if (dVar instanceof C2512a) {
                c2512a = (C2512a) dVar;
                int i14 = c2512a.f132233b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2512a.f132233b = i14 - Integer.MIN_VALUE;
                } else {
                    c2512a = new C2512a(dVar);
                }
            } else {
                c2512a = new C2512a(dVar);
            }
            Object obj2 = c2512a.f132232a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2512a.f132233b;
            if (i15 == 0) {
                r.b(obj2);
                w63.g gVar = (w63.g) obj;
                r0 r0Var = this.f132231d;
                if (r0Var.f105810a == null) {
                    r0Var.f105810a = (T) new li.d();
                }
                T t7 = r0Var.f105810a;
                t7.getClass();
                gVar.getClass();
                Object objA = zh.a.a(new zh.d(gVar));
                objA.getClass();
                LinkedHashMap linkedHashMapB = ((li.d) t7).b((Map) objA);
                T t14 = r0Var.f105810a;
                t14.getClass();
                LinkedHashSet linkedHashSet = ((li.d) t14).f112569d;
                T t15 = r0Var.f105810a;
                t15.getClass();
                boolean z14 = !((li.d) t15).f112570e;
                T t16 = r0Var.f105810a;
                t16.getClass();
                vh.f fVarB = null;
                if (!((li.d) t16).f112571f) {
                    zh.h hVar = new zh.h(linkedHashMapB, null, 2, null);
                    z zVar = this.f132230c;
                    zVar.getClass();
                    linkedHashSet.getClass();
                    z.a aVar2 = new z.a();
                    aVar2.f178401a.putAll(zVar.f178400d);
                    vh.b.a aVarA = zVar.f178398b.a();
                    aVarA.f178262b = linkedHashSet;
                    aVar2.f178402b = aVarA.a();
                    vh.f.a aVarA2 = o0.a(this.f132229b, hVar, aVar2.a()).a();
                    aVarA2.f178320g = z14;
                    fVarB = aVarA2.b();
                }
                if (fVarB != null) {
                    c2512a.f132233b = 1;
                    if (this.f132228a.emit(fVarB, c2512a) == aVar) {
                        return aVar;
                    }
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

    public j(r53.i iVar, n0 n0Var, z zVar, r0 r0Var) {
        this.f132224a = iVar;
        this.f132225b = n0Var;
        this.f132226c = zVar;
        this.f132227d = r0Var;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super vh.f<Object>> jVar, t13.d dVar) {
        Object objCollect = this.f132224a.collect(new a(jVar, this.f132225b, this.f132226c, this.f132227d), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
