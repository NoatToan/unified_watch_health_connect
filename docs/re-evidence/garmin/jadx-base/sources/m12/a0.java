package m12;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm12/a0;", "Lew/b;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends ew.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f115790m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar) {
        super(zVar);
        this.f115790m = zVar;
        zVar.getClass();
    }

    @Override // ew.b
    public final void g(String str, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, String str2) {
        eVar.getClass();
        str2.getClass();
        i2.a.c(i2.f36769a, "UserProfileAboutOperation", "Return result source = " + eVar + " for request: " + str2);
        this.f115790m.i(eVar, (j12.k) GsonUtil.f47253b.fromJson(str, j12.k.class));
    }

    @Override // ew.b
    public final c83.d<String> h() {
        k12.d dVarA = k12.d.a.a(k12.d.f102315g);
        String str = this.f115790m.f115914l;
        str.getClass();
        return dVarA.f102316a.m(str);
    }
}
