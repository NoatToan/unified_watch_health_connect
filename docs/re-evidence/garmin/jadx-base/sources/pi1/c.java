package pi1;

import android.content.Context;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.l;
import wd2.m;
import wd2.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwd2/m1;", "<anonymous>", "(Lo53/b0;)Lwd2/m1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.logs.HtmlReportData$createReportSectionAppLiveTrack$settingsIO$1", f = "HtmlReportData.kt", l = {115}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super m1>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f137856b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f137856b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f137856b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super m1> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137855a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        Context context = this.f137856b.f137861a;
        this.f137855a = 1;
        t13.i iVar = new t13.i(u13.f.b(this));
        m.c((l) KoinJavaComponent.get$default(l.class, null, null, 6, null), new e(context, iVar));
        Object objA = iVar.a();
        return objA == aVar ? aVar : objA;
    }
}
