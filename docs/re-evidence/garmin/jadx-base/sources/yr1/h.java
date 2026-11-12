package yr1;

import android.content.Context;
import c83.b0;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.Iterator;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyr1/h;", "Lmy2/a$c;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements my2.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f199093a;

    public h(Context context) {
        context.getClass();
        this.f199093a = context;
    }

    @Override // my2.a.b
    public final zi2.a a() {
        return GCMSettingManager.k().f77335a;
    }

    @Override // my2.a.c
    public final b0 b(String str) {
        str.getClass();
        bz0.o.f22274a.getClass();
        OkHttpClient okHttpClientD = bz0.o.d();
        if (okHttpClientD == null) {
            vb.h.s("cannot make GC call when not signed in");
            return null;
        }
        List<Interceptor> listInterceptors = okHttpClientD.interceptors();
        if (listInterceptors == null || !listInterceptors.isEmpty()) {
            Iterator<T> it = listInterceptors.iterator();
            while (it.hasNext()) {
                if (((Interceptor) it.next()) instanceof id2.o) {
                    List<Interceptor> listInterceptors2 = okHttpClientD.interceptors();
                    if (listInterceptors2 == null || !listInterceptors2.isEmpty()) {
                        for (Interceptor interceptor : listInterceptors2) {
                            if ((interceptor instanceof id2.h) || (interceptor instanceof id2.i) || (interceptor instanceof dz0.b)) {
                                List<Interceptor> listInterceptors3 = okHttpClientD.interceptors();
                                if (listInterceptors3 == null || !listInterceptors3.isEmpty()) {
                                    Iterator<T> it3 = listInterceptors3.iterator();
                                    while (it3.hasNext()) {
                                        if (((Interceptor) it3.next()) instanceof id2.g) {
                                        }
                                    }
                                    okHttpClientD = okHttpClientD.newBuilder().addInterceptor(new id2.g(new vc2.c(this.f199093a, null, false, null, 14, null), null, 2, null)).build();
                                } else {
                                    okHttpClientD = okHttpClientD.newBuilder().addInterceptor(new id2.g(new vc2.c(this.f199093a, null, false, null, 14, null), null, 2, null)).build();
                                }
                                b0.b bVar = new b0.b();
                                bVar.b("https://".concat(str));
                                bVar.d(okHttpClientD);
                                return bVar.c();
                            }
                        }
                    }
                    vb.h.s("Okhttp client must supply oauth credentials interceptor");
                    return null;
                }
            }
        }
        vb.h.s("Okhttp client must supply UserAgentInterceptor");
        return null;
    }

    @Override // my2.a.b
    public final OkHttpClient c() {
        bz0.o.f22274a.getClass();
        return bz0.o.d();
    }

    @Override // my2.a.c
    public final String d() {
        if (GCMSettingManager.k().f77335a != zi2.a.PROD) {
            return null;
        }
        kg1.a.f104701a.getClass();
        if (!kg1.a.C2003a.a().P()) {
            return null;
        }
        GCMSettingManager.k().getClass();
        return "https://omtdemo.garmin.com/UploadConfigurationService/UnitUploadSettings/";
    }

    @Override // my2.a.b
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final Context getF199093a() {
        return this.f199093a;
    }
}
