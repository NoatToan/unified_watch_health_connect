package com.garmin.android.apps.connectmobile;

import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lue0/l;", "<anonymous>", "(Lo53/b0;)Lue0/l;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.GCMCommonDeepLinkHandler$getChildData$2", f = "GCMCommonDeepLinkHandler.kt", l = {1052}, m = "invokeSuspend", v = 2)
public final class j1 extends v13.i implements e23.p<o53.b0, t13.d<? super ue0.l>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(String str, t13.d<? super j1> dVar) {
        super(2, dVar);
        this.f36948b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j1(this.f36948b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ue0.l> dVar) {
        return ((j1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<ue0.l> listC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f36947a;
        Object obj2 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            re0.o oVar = (re0.o) KoinJavaComponent.get$default(re0.o.class, null, null, 6, null);
            this.f36947a = 1;
            obj = oVar.i(this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            ue0.k kVar = (ue0.k) ((v2.b) v2Var).f47386a;
            if (kVar != null && (listC = kVar.c()) != null) {
                for (Object obj3 : listC) {
                    if (String.valueOf(((ue0.l) obj3).getUserId()).equals(this.f36948b)) {
                        obj2 = obj3;
                        break;
                    }
                }
                return (ue0.l) obj2;
            }
        } else if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        return null;
    }
}
