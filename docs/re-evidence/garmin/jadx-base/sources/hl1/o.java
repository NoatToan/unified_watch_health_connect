package hl1;

import android.text.TextUtils;
import o53.b0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$fetchHeaderInfo$1", f = "SelectActivityViewModel.kt", l = {110, 116}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sd2.f f84447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f84450d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.SelectActivityViewModel$fetchHeaderInfo$1$deviceRecord$1", f = "SelectActivityViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super sd2.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f84451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f84451a = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f84451a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            rd2.j jVar = rd2.f.a().f152045a;
            long j8 = this.f84451a.f84415a;
            jVar.getClass();
            return rd2.j.i(j8, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f84450d = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f84450d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        sd2.f fVar;
        int i14;
        Object objD;
        int i15;
        u0 u0Var;
        sd2.f fVar2;
        boolean zBooleanValue;
        p2 p2Var;
        Object value;
        f fVar3;
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f84449c;
        n nVar = this.f84450d;
        if (i16 == 0) {
            o13.r.b(obj);
            z zVar = nVar.f84425k;
            a aVar2 = new a(nVar, null);
            this.f84449c = 1;
            objE0 = ge1.b.e0(zVar, aVar2, this);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            o13.r.b(obj);
            objE0 = obj;
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = this.f84448b;
            fVar = this.f84447a;
            o13.r.b(obj);
            objD = obj;
        }
        fVar2 = fVar;
        zBooleanValue = ((Boolean) objD).booleanValue();
        p2Var = nVar.f84426l;
        do {
            value = p2Var.getValue();
            fVar3 = (f) value;
            if (i15 != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
        } while (!p2Var.b(value, f.a(fVar3, false, z14, fVar2, null, null, null, null, false, zBooleanValue, 249)));
        return Unit.INSTANCE;
        fVar = (sd2.f) objE0;
        if (fVar != null) {
            String productNumber = fVar.getProductNumber();
            u0 u0Var2 = u0.f203733h;
            if (TextUtils.isEmpty(productNumber) || !((u0Var = (u0) u0.f203782n6.get(productNumber)) == u0.f203739h6 || u0Var == u0.f203720e6)) {
                i14 = 0;
            } else {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        ws.a aVar3 = nVar.f84424j;
        this.f84447a = fVar;
        this.f84448b = i14;
        this.f84449c = 2;
        objD = aVar3.d(this);
        if (objD != aVar) {
            i15 = i14;
            fVar2 = fVar;
            zBooleanValue = ((Boolean) objD).booleanValue();
            p2Var = nVar.f84426l;
            do {
                value = p2Var.getValue();
                fVar3 = (f) value;
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } while (!p2Var.b(value, f.a(fVar3, false, z14, fVar2, null, null, null, null, false, zBooleanValue, 249)));
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
