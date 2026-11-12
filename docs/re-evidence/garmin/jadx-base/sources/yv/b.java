package yv;

import androidx.lifecycle.v1;
import bd0.b0;
import bd0.s;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyv/b;", "Lbd0/s$c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements s.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f199812a;

    public b(d dVar) {
        this.f199812a = dVar;
    }

    @Override // bd0.s.c
    public final void a() {
        String str = a2.SETTINGS.f28756a;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, str, "checkFirmwareUpdate onExecuted");
        d dVar = this.f199812a;
        dVar.getClass();
        ge1.b.T(v1.a(dVar), null, null, new c(dVar, null), 3);
    }

    @Override // bd0.s.c
    public final void b(b0 b0Var) {
        String str = a2.SETTINGS.f28756a;
        String strM = am.j.m("checkFirmwareUpdate onFail: ", b0Var.name(), StringUtils.SPACE);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, str, strM);
    }

    @Override // bd0.s.c
    public final void c(lj0.e.a aVar) {
        aVar.getClass();
        String str = a2.SETTINGS.f28756a;
        String strF = e5.f(aVar.f112977a, "checkFirmwareUpdate onSucceed result: ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, str, strF);
    }
}
