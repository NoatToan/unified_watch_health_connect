package kv0;

import android.content.ClipData;
import j20.x;
import java.util.Iterator;
import kd0.e1;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import su0.u;
import wd2.c2;
import wd2.h2;
import wd2.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackStatusViewModel$shareSession$1", f = "LiveTrackStatusViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f106711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f106712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1 f106714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f106715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z1 z1Var, j jVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f106714d = z1Var;
        this.f106715e = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f106714d, this.f106715e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        String str;
        j jVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106713c;
        if (i14 == 0) {
            r.b(obj);
            z1 z1Var = this.f106714d;
            z1Var.getClass();
            Iterator<T> it = z1Var.f184698f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                h2 h2Var = (h2) next;
                if ((h2Var.f184494d instanceof c2.a) && h2Var.f184493c != null) {
                    break;
                }
            }
            h2 h2Var2 = (h2) next;
            String str2 = h2Var2 != null ? h2Var2.f184493c : null;
            if (str2 != null) {
                j jVar2 = this.f106715e;
                e1 f104144a = jVar2.f106664a.getF104144a();
                f104144a.getClass();
                String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
                String strG = z1Var.f184694b;
                if (strG == null) {
                    strG = f104144a.g();
                }
                String strD = x.d(userFullName, "\n", strG, "\n", str2);
                u uVar = jVar2.f106665b;
                f12.l.f68084a.getClass();
                String strZ4 = f12.l.a.a().z4("PREMIUM_PROFILE");
                if (strZ4 == null) {
                    strZ4 = f12.l.a.a().q4();
                }
                this.f106711a = jVar2;
                this.f106712b = strD;
                this.f106713c = 1;
                Object objA = uVar.a(strZ4, this);
                if (objA == aVar) {
                    return aVar;
                }
                str = strD;
                obj = objA;
                jVar = jVar2;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.f106712b;
        jVar = this.f106711a;
        r.b(obj);
        jVar.C4(new i.f(new lv0.d(str, (ClipData) obj)));
        return Unit.INSTANCE;
    }
}
