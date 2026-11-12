package hd1;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.a1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhd1/c;", "Lhd1/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw.c0 f83371a = new jw.c0(AbstractComponentTracker.LINGERING_TIMEOUT, 86400000);

    @Override // hd1.a
    public final Unit a(q qVar, zy0.a aVar) {
        String strH;
        if (qVar == null || (strH = qVar.h()) == null) {
            return Unit.INSTANCE;
        }
        String str = aVar.f207440a;
        jw.c0 c0Var = this.f83371a;
        c0Var.e(str);
        Unit unit = Unit.INSTANCE;
        c0Var.d(unit, strH);
        return unit;
    }

    @Override // hd1.a
    public final Object b(zy0.a aVar, Class cls, a1 a1Var) {
        q qVar = (q) l23.f.a(s0.f105811a.b(cls));
        String str = aVar.f207440a;
        jw.c0 c0Var = this.f83371a;
        c0Var.e(str);
        String strA = c0Var.a();
        Boolean boolValueOf = strA != null ? Boolean.valueOf(qVar.d(strA)) : null;
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new b(boolValueOf, qVar, null), a1Var);
    }
}
