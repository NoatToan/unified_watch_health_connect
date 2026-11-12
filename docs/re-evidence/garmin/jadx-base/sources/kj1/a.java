package kj1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import gj1.f;
import kd0.j5;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkj1/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends u1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f104963c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f104964a = m.b(new j5(5));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f104965b;

    static {
        new C2020a(null);
    }

    public final fj1.b x4() {
        return (fj1.b) this.f104964a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y4(v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f104968c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f104968c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objA = bVar.f104966a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f104968c;
        if (i15 == 0) {
            r.b(objA);
            fj1.b bVarX4 = x4();
            bVar.f104968c = 1;
            objA = bVarX4.a(bVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            this.f104965b = (f) ((v2.b) v2Var).f47386a;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.DEVICES;
            v2.a aVar3 = (v2.a) v2Var;
            String str = "- Got ERROR with http code " + aVar3.f47383a + " and message " + aVar3.f47385c;
            aVar2.getClass();
            i2.a.f(a2Var, "DevicesDashboardFragment", str);
        }
        return Unit.INSTANCE;
    }

    public final y0 z4(gj1.c cVar) {
        gj1.b bVar;
        Long deviceId;
        y0 y0Var = new y0();
        if (cVar != null && (bVar = cVar.f77653b) != null && (deviceId = bVar.getDeviceId()) != null) {
            ge1.b.T(v1.a(this), null, null, new c(y0Var, cVar, this, deviceId.longValue(), null), 3);
            return y0Var;
        }
        g3.f35298f.getClass();
        y0Var.j(g3.a.d(cVar));
        Unit unit = Unit.INSTANCE;
        return y0Var;
    }

    /* JADX INFO: renamed from: kj1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkj1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2020a {
        public /* synthetic */ C2020a(j jVar) {
            this();
        }

        private C2020a() {
        }
    }
}
