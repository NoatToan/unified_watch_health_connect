package mh1;

import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.index.InviteConnectionsViewModel$fetchAdminDeviceStatus$1", f = "InviteConnectionsViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f118503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f118504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f118505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f118506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f118507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f118508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f118509g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, boolean z14, long j8, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f118507e = wVar;
        this.f118508f = z14;
        this.f118509g = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f118507e, this.f118508f, this.f118509g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        boolean z14;
        long j8;
        Object value;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118506d;
        Object obj2 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            wVar = this.f118507e;
            com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = wVar.f118514b.W0();
            Long l14 = gVarW0 != null ? gVarW0.f46857a : null;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                z14 = this.f118508f;
                if (z14) {
                    p2 p2Var = wVar.f118516d;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, a.a((a) value, false, true, 1)));
                }
                this.f118503a = wVar;
                this.f118504b = z14;
                this.f118505c = jLongValue;
                this.f118506d = 1;
                obj = w.x4(wVar, this.f118509g, this);
                if (obj == aVar) {
                    return aVar;
                }
                j8 = jLongValue;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = this.f118505c;
        z14 = this.f118504b;
        wVar = this.f118503a;
        o13.r.b(obj);
        for (Object obj3 : (List) obj) {
            Long lH = ((com.garmin.android.apps.connectmobile.smartscale.model.e) obj3).getUserProfileId();
            if (lH != null && lH.longValue() == j8) {
                obj2 = obj3;
                break;
            }
        }
        boolean z15 = obj2 != null;
        p2 p2Var2 = wVar.f118516d;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, a.a((a) value2, z15, false, 2)));
        if (z14) {
            p2 p2Var3 = wVar.f118516d;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, a.a((a) value3, false, false, 1)));
        }
        return Unit.INSTANCE;
    }
}
