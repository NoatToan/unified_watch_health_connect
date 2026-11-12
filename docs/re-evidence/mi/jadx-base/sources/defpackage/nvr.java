package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.WritableMap;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class nvr implements e1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i1d f28489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f28490b;
    public WeakReference<Activity> c;
    public boolean d = false;

    public void a() {
        zxr.b("YRNCProviderImpl", "Please init! YRNCProviderImpl did not call init() method!");
    }

    @Override // defpackage.e1d
    public Context getContext() {
        return this.f28490b;
    }

    @Override // defpackage.e1d
    public i1d getInfoProvider() {
        return this.f28489a;
    }

    @Override // defpackage.e1d
    public String getRNAppNameByUrl(String str) {
        return uvr.b(str);
    }

    @Override // defpackage.e1d
    public String getRNModuleByUrl(String str) {
        return uvr.c(str);
    }

    @Override // defpackage.e1d
    public String getRNPathByUrl(String str) {
        return uvr.d(str);
    }

    @Override // defpackage.e1d
    public void init(Application application, i1d i1dVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f28490b = application;
        this.f28489a = i1dVar;
        hvr.l(application);
        jwr.b(application, i1dVar);
    }

    @Override // defpackage.e1d
    public void initReactNative(String str) {
        if (this.d) {
            ayr.b().d(str, null);
        } else {
            a();
        }
    }

    @Override // defpackage.e1d
    public Fragment newYRNFragment(String str, Bundle bundle) {
        if (this.d) {
            return mvr.a(str, bundle);
        }
        a();
        return new Fragment();
    }

    @Override // defpackage.e1d
    public void openPage(Activity activity, String str, int i) {
        if (this.d) {
            mvr.b(activity, str, i);
        } else {
            a();
        }
    }

    @Override // defpackage.e1d
    public boolean sendJSEvent(String str, String str2, Map<String, Object> map) {
        return this.d && ayr.b().f(str, str2, map);
    }

    @Override // defpackage.e1d
    public void setResumeActivity(WeakReference<Activity> weakReference) {
        this.c = weakReference;
    }

    @Override // defpackage.e1d
    public boolean sendJSEvent(String str, String str2, WritableMap writableMap) {
        return this.d && ayr.b().g(str, str2, writableMap);
    }
}
