package ta0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 implements r53.i<o13.q<? extends l90.b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f163222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f163223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f163224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f163225d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f163226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f163227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f163228c;

        /* JADX INFO: renamed from: ta0.a0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$getCompatibleDevice$$inlined$mapNotNull$1$2", f = "DeviceDiscoveryViewModel.kt", l = {69}, m = "emit", v = 2)
        public static final class C3073a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f163229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f163230b;

            public C3073a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f163229a = obj;
                this.f163230b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, x xVar, String str, String str2) {
            this.f163226a = jVar;
            this.f163227b = str;
            this.f163228c = str2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C3073a c3073a;
            String str;
            T next;
            Object bVar;
            if (dVar instanceof C3073a) {
                c3073a = (C3073a) dVar;
                int i14 = c3073a.f163230b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3073a.f163230b = i14 - Integer.MIN_VALUE;
                } else {
                    c3073a = new C3073a(dVar);
                }
            } else {
                c3073a = new C3073a(dVar);
            }
            Object obj2 = c3073a.f163229a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3073a.f163230b;
            Object objA = null;
            if (i15 == 0) {
                o13.r.b(obj2);
                Object obj3 = ((o13.q) obj).f128597a;
                if (obj3 instanceof o13.q.b) {
                    obj3 = null;
                }
                List<Object> list = (List) obj3;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        str = this.f163228c;
                        if (!zHasNext) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        l90.b bVar2 = (l90.b) next;
                        if (!d53.w.J(bVar2.f111516a) && p005kotlin.jvm.internal.s.g(bVar2.f111516a, str)) {
                            break;
                        }
                    }
                    l90.b bVar3 = next;
                    String str2 = this.f163227b;
                    l90.b bVar4 = bVar3;
                    if (bVar3 == null) {
                        for (Object obj4 : list) {
                            l90.b bVar5 = (l90.b) obj4;
                            if (!d53.w.J(bVar5.f111522g) && p005kotlin.jvm.internal.s.g(bVar5.f111522g, str2)) {
                                objA = obj4;
                                break;
                            }
                        }
                        bVar4 = (l90.b) objA;
                    }
                    if (bVar4 != null) {
                        a2 a2Var = a2.DEVICE_SETUP;
                        String str3 = bVar4.f111521f;
                        StringBuilder sbI = p6.b.i("Found compatible device for productNumber: ", str2, ", applicationKey: ", str, " - ");
                        sbI.append(str3);
                        String string = sbI.toString();
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "DeviceDiscoveryViewModel", string);
                        int i16 = o13.q.f128596b;
                        bVar = bVar4;
                    } else {
                        a2 a2Var2 = a2.DEVICE_SETUP;
                        String strJ = androidx.room.a0.j("No compatible device found for productNumber: ", str2, ", applicationKey: ", str);
                        i2.f36769a.getClass();
                        i2.a.b(a2Var2, "DeviceDiscoveryViewModel", strJ);
                        int i17 = o13.q.f128596b;
                        bVar = new o13.q.b(new Exception(androidx.room.a0.j("No compatible device found for productNumber: ", str2, ", applicationKey: ", str)));
                    }
                    objA = o13.q.a(bVar);
                }
                if (objA != null) {
                    c3073a.f163230b = 1;
                    if (this.f163226a.emit(objA, c3073a) == aVar) {
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

    public a0(r53.i iVar, x xVar, String str, String str2) {
        this.f163222a = iVar;
        this.f163223b = xVar;
        this.f163224c = str;
        this.f163225d = str2;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super o13.q<? extends l90.b>> jVar, t13.d dVar) {
        Object objCollect = this.f163222a.collect(new a(jVar, this.f163223b, this.f163224c, this.f163225d), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
