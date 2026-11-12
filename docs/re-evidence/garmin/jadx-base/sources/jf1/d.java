package jf1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsViewModel$shouldShowBanner$1", f = "RunningToleranceReportsViewModel.kt", l = {97, 99}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f98711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f98713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f98713c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f98713c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        boolean zBooleanValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f98712b;
        b bVar = this.f98713c;
        if (i14 == 0) {
            r.b(obj);
            ff1.a aVar2 = bVar.f98698a;
            this.f98712b = 1;
            obj = aVar2.a(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f98711a;
            r.b(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (v2Var instanceof v2.b) {
            bVar.f98700c.setValue(Boolean.valueOf(zBooleanValue && !s.g(((ef1.c) ((v2.b) v2Var).f47386a).getValue(), BooleanUtils.TRUE)));
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) obj;
        this.f98711a = v2Var2;
        this.f98712b = 2;
        Object objX4 = b.x4(bVar, this);
        if (objX4 != aVar) {
            v2Var = v2Var2;
            obj = objX4;
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (v2Var instanceof v2.b) {
                bVar.f98700c.setValue(Boolean.valueOf(zBooleanValue && !s.g(((ef1.c) ((v2.b) v2Var).f47386a).getValue(), BooleanUtils.TRUE)));
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
