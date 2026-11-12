package we1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import p3.c2;
import rd2.j;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$checkIfHermesRegistered$1", f = "RunningEconomyViewModel.kt", l = {216}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f184807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f184808b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyViewModel$checkIfHermesRegistered$1$1", f = "RunningEconomyViewModel.kt", l = {219}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f184809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f184810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f184811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f184812d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f184812d = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f184812d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0071  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayListD;
            String str;
            boolean z14;
            Object next;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184811c;
            d dVar = this.f184812d;
            boolean z15 = true;
            if (i14 == 0) {
                r.b(obj);
                rd2.f.a().f152045a.getClass();
                arrayListD = j.d();
                String str2 = u0.X5.f203854a;
                tc0.a aVar2 = dVar.f184778c;
                this.f184809a = arrayListD;
                this.f184810b = str2;
                this.f184811c = 1;
                Object objB = aVar2.b(this);
                if (objB == aVar) {
                    return aVar;
                }
                str = str2;
                obj = objB;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.f184810b;
                arrayListD = this.f184809a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                Iterator it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String productId = ((sc0.a) next).getProductId();
                    if (productId != null && productId.equals("4607")) {
                        break;
                    }
                }
                if (next != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            c2 c2Var = dVar.f184784i;
            if (!z14) {
                if (arrayListD != null) {
                    ArrayList arrayList = new ArrayList(y.r(arrayListD, 10));
                    Iterator it3 = arrayListD.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((sd2.f) it3.next()).getProductNumber());
                    }
                    if (!arrayList.contains(str)) {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
            }
            c2Var.setValue(Boolean.valueOf(z15));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f184808b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f184808b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184807a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f184808b, null);
            this.f184807a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
