package o12;

import java.util.List;
import m12.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements r53.i<List<? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f128549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.d f128550b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f128551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.presentation.d f128552b;

        /* JADX INFO: renamed from: o12.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileViewModel$getFavoriteActivities$$inlined$map$1$2", f = "EditProfileViewModel.kt", l = {50}, m = "emit", v = 2)
        public static final class C2465a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f128553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f128554b;

            public C2465a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f128553a = obj;
                this.f128554b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar) {
            this.f128551a = jVar;
            this.f128552b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2465a c2465a;
            List<String> listF;
            if (dVar instanceof C2465a) {
                c2465a = (C2465a) dVar;
                int i14 = c2465a.f128554b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2465a.f128554b = i14 - Integer.MIN_VALUE;
                } else {
                    c2465a = new C2465a(dVar);
                }
            } else {
                c2465a = new C2465a(dVar);
            }
            Object obj2 = c2465a.f128553a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2465a.f128554b;
            if (i15 == 0) {
                r.b(obj2);
                q qVar = (q) obj;
                if (qVar != null) {
                    this.f128552b.f47023g.getClass();
                    com.garmin.android.apps.connectmobile.userprofile.model.r rVar = qVar.f115856b;
                    if (rVar == null || (listF = rVar.f()) == null) {
                        listF = j0.f134944a;
                    }
                    if (listF == null) {
                        listF = j0.f134944a;
                    }
                } else {
                    listF = j0.f134944a;
                }
                c2465a.f128554b = 1;
                if (this.f128551a.emit(listF, c2465a) == aVar) {
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

    public g(r53.i iVar, com.garmin.android.apps.connectmobile.userprofile.presentation.d dVar) {
        this.f128549a = iVar;
        this.f128550b = dVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends String>> jVar, t13.d dVar) {
        Object objCollect = this.f128549a.collect(new a(jVar, this.f128550b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
