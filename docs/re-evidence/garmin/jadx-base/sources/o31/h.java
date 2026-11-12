package o31;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import e23.p;
import ht2.n;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.inappupdate.InAppUpdateManager$shouldForceUpdate$2", f = "InAppUpdateManager.kt", l = {170, 170, TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
public final class h extends i implements p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f128791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f128793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f128794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f128794d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f128794d, dVar);
        hVar.f128793c = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        n nVar;
        Object objA;
        com.garmin.inappupdate.e eVar;
        Object objA2;
        com.garmin.inappupdate.e eVar2;
        AppUpdateInfo appUpdateInfo;
        b0 b0Var = (b0) this.f128793c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128792b;
        boolean z14 = false;
        d dVar = this.f128794d;
        if (i14 == 0) {
            r.b(obj);
            nVar = n.f85666a;
            this.f128793c = b0Var;
            this.f128791a = nVar;
            this.f128792b = 1;
            obj = ge1.b.e0(dVar.f128766c, new g(dVar, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            nVar = (n) this.f128791a;
            r.b(obj);
        } else {
            if (i14 == 2) {
                r.b(obj);
                objA = ((q) obj).f128597a;
                int i15 = q.f128596b;
                eVar = (com.garmin.inappupdate.e) (objA instanceof q.b ? null : objA);
                if (eVar != null && eVar.f52422a == com.garmin.inappupdate.d.IMMEDIATE) {
                    this.f128793c = b0Var;
                    this.f128791a = eVar;
                    this.f128792b = 3;
                    objA2 = d.a(dVar, eVar, this);
                    if (objA2 != aVar) {
                        eVar2 = eVar;
                        obj = objA2;
                    }
                    return aVar;
                }
                return Boolean.valueOf(z14);
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar2 = (com.garmin.inappupdate.e) this.f128791a;
            r.b(obj);
        }
        appUpdateInfo = (AppUpdateInfo) obj;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "InAppUpdateManager", "shouldForceUpdate check: update=" + eVar2 + ", appUpdateInfo=" + appUpdateInfo);
        if (appUpdateInfo != null) {
            z14 = true;
        }
        return Boolean.valueOf(z14);
        this.f128793c = b0Var;
        this.f128791a = null;
        this.f128792b = 2;
        objA = nVar.a((ht2.g) obj, this);
        if (objA != aVar) {
            int i16 = q.f128596b;
            eVar = (com.garmin.inappupdate.e) (objA instanceof q.b ? null : objA);
            if (eVar != null) {
                this.f128793c = b0Var;
                this.f128791a = eVar;
                this.f128792b = 3;
                objA2 = d.a(dVar, eVar, this);
                if (objA2 != aVar) {
                    eVar2 = eVar;
                    obj = objA2;
                    appUpdateInfo = (AppUpdateInfo) obj;
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var2, "InAppUpdateManager", "shouldForceUpdate check: update=" + eVar2 + ", appUpdateInfo=" + appUpdateInfo);
                    if (appUpdateInfo != null) {
                        z14 = true;
                    }
                }
            }
            return Boolean.valueOf(z14);
        }
        return aVar;
    }
}
