package aq;

import java.util.TreeMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.RestoreActivityViewModel$restoreMultisportActivity$1", f = "RestoreActivityViewModel.kt", l = {124}, m = "invokeSuspend", v = 2)
public final class t2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2 f12220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<fw.m<Object>> f12222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(u2 u2Var, long j8, androidx.lifecycle.y0<fw.m<Object>> y0Var, t13.d<? super t2> dVar) {
        super(2, dVar);
        this.f12220b = u2Var;
        this.f12221c = j8;
        this.f12222d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t2(this.f12220b, this.f12221c, this.f12222d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12219a;
        androidx.lifecycle.y0<fw.m<Object>> y0Var = this.f12222d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.i0<c83.a0<String>> i0VarA = ((yo.q) this.f12220b.f12262d.getValue()).a(this.f12221c);
                this.f12219a = 1;
                obj = i0VarA.await(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c83.a0 a0Var = (c83.a0) obj;
            TreeMap treeMap = new TreeMap();
            treeMap.putAll(a0Var.f25745a.headers().toMultimap());
            y0Var.j(new fw.m<>(null, a0Var.f25745a.isSuccessful() ? fw.p.SUCCESS : fw.p.ERROR, p13.x.m(a0Var.f25746b, treeMap), null, 9, null));
        } catch (Exception unused) {
            y0Var.j(new fw.m<>(null, fw.p.ERROR, null, null, 9, null));
        }
        return Unit.INSTANCE;
    }
}
