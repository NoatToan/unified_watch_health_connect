package com.garmin.android.apps.connectmobile;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.GarminConnectMobileApp$onCreateMainApplication$3$1", f = "GarminConnectMobileApp.kt", l = {PsExtractor.VIDEO_STREAM_MASK, 247}, m = "invokeSuspend", v = 2)
public final class d2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33137b;

    public d2(t13.d<? super d2> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d2 d2Var = new d2(dVar);
        d2Var.f33137b = obj;
        return d2Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r7.i(r6) == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f33137b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33136a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "GarminConnectMobileApp", "onCreateMainApplication. Initialize promos module.");
        zd0.p0 p0Var = zd0.p0.f204108a;
        this.f33137b = b0Var;
        this.f33136a = 1;
        if (p0Var.a(this) != aVar) {
        }
        return aVar;
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
            return Unit.INSTANCE;
        }
        a2 a2Var2 = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var2, "GarminConnectMobileApp", "onCreateMainApplication. Load initial promotions.");
        zd0.q0 q0Var = (zd0.q0) KoinJavaComponent.get$default(zd0.q0.class, null, null, 6, null);
        this.f33137b = null;
        this.f33136a = 2;
    }
}
