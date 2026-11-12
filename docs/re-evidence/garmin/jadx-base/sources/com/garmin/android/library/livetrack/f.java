package com.garmin.android.library.livetrack;

import androidx.lifecycle.y0;
import e23.p;
import fe2.p1;
import fe2.z1;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import wd2.l;
import xd2.a1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackService$restoreLivetrack$1", f = "LivetrackService.kt", l = {219, 221}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackService f50213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<be2.g> f50214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f50215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LivetrackService livetrackService, List<be2.g> list, l lVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f50213b = livetrackService;
        this.f50214c = list;
        this.f50215d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f50213b, this.f50214c, this.f50215d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r8 == r0) goto L19;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f50212a;
        List<be2.g> list = this.f50214c;
        LivetrackService livetrackService = this.f50213b;
        if (i14 == 0) {
            r.b(obj);
            this.f50212a = 1;
            int i15 = LivetrackService.f50160k;
            if (livetrackService.d(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        List<o13.p> list2 = (List) obj;
        if (list2 == null || list2.isEmpty()) {
            y0<d> y0Var = livetrackService.f50163c;
            be2.g gVar = (be2.g) h0.d0(list);
            y0Var.m(new d.a(gVar != null ? gVar.f17765a : -1L, c.j.f50195a));
        } else {
            for (o13.p pVar : list2) {
                livetrackService.f50167g.put(((p1) pVar.f128594a).getF70789a(), (p1) pVar.f128594a);
                livetrackService.f50163c.m((d) pVar.f128595b);
            }
        }
        l lVar = livetrackService.f50164d;
        if (lVar != null) {
            livetrackService.m(lVar.getF104144a().e());
            return Unit.INSTANCE;
        }
        s.m("applicationDelegate");
        throw null;
        a1 a1Var = livetrackService.f50166f;
        if (a1Var == null) {
            s.m("repository");
            throw null;
        }
        de2.a aVar2 = livetrackService.f50165e;
        if (aVar2 == null) {
            s.m("deviceManager");
            throw null;
        }
        z1 z1Var = new z1(a1Var, aVar2);
        this.f50212a = 2;
        obj = z1Var.b(list, this.f50215d, this);
    }
}
