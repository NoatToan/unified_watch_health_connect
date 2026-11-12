package jg1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.o;
import q92.v;
import q92.x;
import r53.p2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.settings.autodetect.DeviceAutoDetectViewModel$checkAutoDetectConsent$1", f = "DeviceAutoDetectViewModel.kt", l = {24, 25}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f98726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f98728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(2, dVar);
        this.f98728c = cVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f98728c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L24;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x xVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f98727b;
        if (i14 != 0) {
            if (i14 == 1) {
                xVar = this.f98726a;
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        xVar = x.DI_CONNECT_AUTO_ACTIVITY_DETECTION;
        o oVar = o.f136619a;
        this.f98726a = xVar;
        this.f98727b = 1;
        obj = oVar.c(xVar, this);
        if (obj != aVar) {
        }
        return aVar;
        v vVarN = (v) obj;
        if (vVarN == null) {
            o.f136619a.getClass();
            vVarN = o.n(xVar);
        }
        p2 p2Var = this.f98728c.f98729a;
        Boolean boolValueOf = Boolean.valueOf(vVarN != null && vVarN.b());
        this.f98726a = null;
        this.f98727b = 2;
        p2Var.k(null, boolValueOf);
    }
}
