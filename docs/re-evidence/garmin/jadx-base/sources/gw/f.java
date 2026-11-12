package gw;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s0;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgw/f;", "Lew/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends ew.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f79500m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(eVar);
        this.f79500m = eVar;
        eVar.getClass();
    }

    @Override // ew.b
    public final long e() {
        return DateTime.now().plusDays(1).withTime(12, 0, 0, 0).getMillis() - DateTimeUtils.currentTimeMillis();
    }

    @Override // ew.b
    public final boolean f() {
        return this.f79500m.f79495m;
    }

    @Override // ew.b
    public final void g(String str, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, String str2) {
        eVar.getClass();
        str2.getClass();
        i2.a.c(i2.f36769a, "BloodPressureConfigOperation", "Return result source = " + eVar + " for request: " + str2);
        kw.e.f106832c.getClass();
        kw.e eVar2 = (kw.e) GsonUtil.f47253b.fromJson(str, new kw.d().getType());
        if (eVar2 == null) {
            eVar2 = new kw.e(null, null, 3, null);
        }
        this.f79500m.i(eVar, eVar2);
    }

    @Override // ew.b
    public final c83.d<String> h() {
        c83.d<String> dVarA = ((lw.b) KoinJavaComponent.get$default(lw.b.class, null, null, 6, null)).a();
        if (this.f79500m.f79495m) {
            ((s0) KoinJavaComponent.get$default(s0.class, null, null, 6, null)).c(dVarA.toString());
        }
        return dVarA;
    }
}
