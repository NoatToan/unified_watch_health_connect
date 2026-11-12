package kd0;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.gcsprotos.generated.Auth;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/w2;", "Lgk0/d;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w2 implements gk0.d {
    @Override // gk0.d
    public final DeviceProfile b(long j8) {
        return hk0.p.b(j8);
    }

    @Override // gk0.d
    public final void c(Auth.Category category, String str) {
        category.getClass();
        str.getClass();
        gg1.v0 v0VarK = GCMSettingManager.k();
        v0VarK.getClass();
        v0VarK.P.put(category, str);
        SharedPreferences sharedPreferences = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c().getSharedPreferences("GCS_URL_OVERRIDES_KEY" + v0VarK.f77335a.name(), 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(category.name(), str);
        editorEdit.apply();
    }

    @Override // gk0.d
    public final void d(Context context) {
        hk0.p.h(context);
    }

    @Override // gk0.d
    public final void e() {
        GCMSettingManager.k().g();
    }

    @Override // gk0.d
    public final String f() {
        return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).d().f158514a;
    }

    @Override // gk0.d
    public final String g(Auth.Category category) {
        return GCMSettingManager.k().c(category);
    }

    @Override // gk0.d
    public final String h() {
        return !((f12.b) KoinJavaComponent.get(f12.b.class)).D() ? "1.0-dev" : "5.30.1";
    }
}
