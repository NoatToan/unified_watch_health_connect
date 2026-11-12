package oe0;

import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.presentation.DogProfileViewModel$deleteDog$1", f = "DogProfileViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f131281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f131282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f131283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f131283c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f131283c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        j jVar;
        Object value2;
        Object value3;
        Object value4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131282b;
        if (i14 == 0) {
            o13.r.b(obj);
            j jVar2 = this.f131283c;
            pe0.f fVar = (pe0.f) jVar2.f131288e.getValue();
            if (fVar != null) {
                long j8 = fVar.f137420a;
                p2 p2Var = jVar2.f131290g;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.TRUE));
                ne0.e eVar = (ne0.e) jVar2.f131285b.getValue();
                this.f131281a = jVar2;
                this.f131282b = 1;
                eVar.getClass();
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new ne0.d(eVar, j8, null), this);
                if (objE0 == aVar) {
                    return aVar;
                }
                jVar = jVar2;
                obj = objE0;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j jVar3 = this.f131281a;
        o13.r.b(obj);
        jVar = jVar3;
        if (((Boolean) obj).booleanValue()) {
            p2 p2Var2 = jVar.f131292i;
            do {
                value4 = p2Var2.getValue();
                ((Boolean) value4).getClass();
            } while (!p2Var2.b(value4, Boolean.TRUE));
        } else {
            p2 p2Var3 = jVar.f131294k;
            do {
                value2 = p2Var3.getValue();
                ((Boolean) value2).getClass();
            } while (!p2Var3.b(value2, Boolean.TRUE));
        }
        p2 p2Var4 = jVar.f131290g;
        do {
            value3 = p2Var4.getValue();
            ((Boolean) value3).getClass();
        } while (!p2Var4.b(value3, Boolean.FALSE));
        return Unit.INSTANCE;
    }
}
