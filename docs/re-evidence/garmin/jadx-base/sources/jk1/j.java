package jk1;

import e23.p;
import ek1.v;
import hk1.n;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.connect.ThirdPartyConnectViewModel$updatePermission$1", f = "ThirdPartyConnectViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f99420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f99421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f99422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk1.d f99423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f99424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, String str, String str2, hk1.d dVar, n nVar, t13.d<? super j> dVar2) {
        super(2, dVar2);
        this.f99420b = fVar;
        this.f99421c = str;
        this.f99422d = str2;
        this.f99423e = dVar;
        this.f99424f = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f99420b, this.f99421c, this.f99422d, this.f99423e, this.f99424f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99419a;
        if (i14 == 0) {
            r.b(obj);
            f fVar = this.f99420b;
            p2 p2Var = fVar.f99406j;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, e.a((e) value, true, null, null, null, 510)));
            v vVar = fVar.f99401e;
            List<String> list = fVar.f99404h;
            i53.d<hk1.d, Boolean> dVar = ((e) fVar.f99406j.getValue()).f99392f;
            ik1.c cVar = new ik1.c(fVar, 12);
            a aVar2 = new a(fVar, 1);
            this.f99419a = 1;
            if (vVar.a(this.f99421c, this.f99423e, this.f99424f, list, dVar, cVar, aVar2, this) == aVar) {
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
