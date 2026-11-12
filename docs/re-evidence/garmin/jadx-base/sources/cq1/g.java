package cq1;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import o53.e1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import zb0.n0;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq1/g;", "Lcq1/o;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements o {
    @Override // cq1.o
    public final Object a(t13.d<? super Unit> dVar) throws Throwable {
        ArrayList arrayListM = x.m(q92.x.DI_CONNECT_UPLOAD, q92.x.DI_CONNECT_INSIGHTS);
        if (km2.a.g(SupportedCapability.LIVETRACK.ordinal(), n0.f203578b)) {
            arrayListM.add(q92.x.DI_CONNECT_LIVETRACK);
        }
        if (((j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null)).e()) {
            arrayListM.add(q92.x.DI_CONNECT_AI);
        }
        p92.o oVar = p92.o.f136619a;
        oVar.getClass();
        ge1.b.T(e1.f129333a, null, null, new p92.j(arrayListM, null), 3);
        Object objH = oVar.h((v13.c) dVar);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
    }
}
