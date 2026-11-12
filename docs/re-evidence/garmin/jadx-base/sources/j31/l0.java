package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.settings.devices.index.ManagePeopleActivity;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj31/l0;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "Lk12/a;", "usersRepo", "<init>", "(Lb31/f;Lk12/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k12.a f96907c;

    public l0(b31.f fVar, k12.a aVar) {
        fVar.getClass();
        aVar.getClass();
        this.f96906b = fVar;
        this.f96907c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f96901d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f96901d = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object objA = k0Var.f96899b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f96901d;
        if (i15 == 0) {
            o13.r.b(objA);
            k0Var.f96898a = j8;
            k0Var.f96901d = 1;
            objA = this.f96907c.a(j8, k0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = k0Var.f96898a;
            o13.r.b(objA);
        }
        List list = (List) objA;
        if ((list != null ? list.size() : 0) > 1) {
            this.f96906b.a(j8, e31.a.ENTERED_MANAGE_PEOPLE_SCREEN);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        Intent intent = new Intent(context, (Class<?>) ManagePeopleActivity.class);
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_deviceDisplayName", str);
        context.startActivity(intent);
    }
}
