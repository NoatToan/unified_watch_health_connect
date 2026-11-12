package zb0;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.DeviceDetailsViewModel$getNotStartedOnboardingItemsCount$1", f = "DeviceDetailsViewModel.kt", l = {33, 35, 41}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<androidx.lifecycle.t0<Integer>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f203537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f203538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f203539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f203540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z14, g gVar, long j8, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f203538c = z14;
        this.f203539d = gVar;
        this.f203540e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f203538c, this.f203539d, this.f203540e, dVar);
        jVar.f203537b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<Integer> t0Var, t13.d<? super Unit> dVar) {
        return ((j) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r0.emit(r2, r9) == r1) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f203537b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203536a;
        long j8 = this.f203540e;
        g gVar = this.f203539d;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f203538c) {
                i31.c0 c0Var = (i31.c0) gVar.f203485e.getValue();
                this.f203537b = t0Var;
                this.f203536a = 1;
                if (c0Var.a(j8, this) != aVar) {
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (((d31.a) obj2).f57326f == d31.d.DEVICE_WELCOME) {
                    arrayList.add(obj2);
                }
            }
            Integer num = new Integer(arrayList.size());
            this.f203537b = null;
            this.f203536a = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        b31.a aVar2 = (b31.a) gVar.f203484d.getValue();
        d31.c cVar = d31.c.NOT_STARTED;
        this.f203537b = t0Var;
        this.f203536a = 2;
        obj = aVar2.b(j8, cVar, this);
        if (obj != aVar) {
            arrayList = new ArrayList();
            while (r10.hasNext()) {
                if (((d31.a) obj2).f57326f == d31.d.DEVICE_WELCOME) {
                    arrayList.add(obj2);
                }
            }
            Integer num2 = new Integer(arrayList.size());
            this.f203537b = null;
            this.f203536a = 3;
        }
        return aVar;
    }
}
