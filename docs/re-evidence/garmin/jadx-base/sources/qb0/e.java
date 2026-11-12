package qb0;

import androidx.lifecycle.v1;
import c22.e1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o53.b0;
import o53.c2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.DeviceSetupSyncViewModel$triggerDeviceSync$1", f = "DeviceSetupSyncViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f143985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f143986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, boolean z14, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f143985b = bVar;
        this.f143986c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f143985b, this.f143986c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        z90.b bVar;
        int i14;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f143984a;
        boolean z14 = this.f143986c;
        b bVar2 = this.f143985b;
        if (i15 == 0) {
            o13.r.b(obj);
            p2 p2Var = bVar2.f143966i;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, new sb0.b(false, 0.0f, false, null, 0, 31, null)));
            if (e1.a()) {
                bVar2.x4().b();
                c2 c2Var = bVar2.f143972o;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                bVar2.f143972o = ge1.b.T(v1.a(bVar2), null, null, new d(bVar2, null), 3);
                y90.h hVar = bVar2.f143961d;
                q90.c cVar = bVar2.f143958a;
                this.f143984a = 1;
                objA = hVar.a(cVar, z14, this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                p2 p2Var2 = bVar2.f143966i;
                do {
                    value2 = p2Var2.getValue();
                    bVar = z90.b.NO_BLUETOOTH;
                    i14 = bVar2.f143973p + 1;
                    bVar2.f143973p = i14;
                } while (!p2Var2.b(value2, new sb0.b(false, 0.0f, false, bVar, i14, 7, null)));
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objA = obj;
        if (((z90.c) objA) == z90.c.SKIPPED) {
            bVar2.f143959b.j();
            c2 c2Var2 = bVar2.f143972o;
            if (c2Var2 != null) {
                c2Var2.c(null);
            }
            p2 p2Var3 = bVar2.f143966i;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, new sb0.b(false, 0.0f, false, z90.b.SUCCESS, 0, 23, null)));
        }
        yr1.u.a aVar2 = yr1.u.f199129b;
        yl2.b bVar3 = bVar2.f143958a.f143495c.f111530o;
        aVar2.getClass();
        if (yr1.u.a.a(bVar3, z14) == yr1.u.SOFTWARE_UPDATE_REQUIRED_TIER_ONE) {
            y90.b bVar4 = bVar2.f143965h;
            q90.c cVar2 = bVar2.f143958a;
            Logger logger = bVar4.f195269c;
            cVar2.getClass();
            y90.c cVar3 = bVar4.f195267a;
            long j8 = cVar2.f143493a;
            if (((Map) cVar3.f195277a.getValue()).containsKey(Long.valueOf(j8))) {
                z90.a aVarB = cVar3.b(j8);
                logger.debug(v.h.u(j8, "register ", " already registered: ", aVarB != null ? aVarB.getF203117b() : null));
            } else {
                Iterator<T> it = cVar3.a().iterator();
                while (it.hasNext()) {
                    bVar4.a(((z90.a) it.next()).getF203116a().f143493a);
                }
                cVar3.c(j8, new z90.a.c(cVar2));
                LinkedHashMap linkedHashMap = bVar4.f195271e;
                Long lValueOf = Long.valueOf(j8);
                yr1.q qVar = new yr1.q("DeviceSetupFirmwareUpdateStateObserver", bVar4, Long.valueOf(j8), null, 8, null);
                qVar.b();
                linkedHashMap.put(lValueOf, qVar);
                z90.a aVarB2 = cVar3.b(j8);
                logger.debug(v.h.u(j8, "register ", " from empty to ", aVarB2 != null ? aVarB2.getF203117b() : null));
            }
            bVar4.f195273g.g(new y90.b.c(bVar4.f195274h));
        }
        return Unit.INSTANCE;
    }
}
