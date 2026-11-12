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
public interface e1d {
    Context getContext();

    i1d getInfoProvider();

    String getRNAppNameByUrl(String str);

    String getRNModuleByUrl(String str);

    String getRNPathByUrl(String str);

    void init(Application application, i1d i1dVar);

    void initReactNative(String str);

    Fragment newYRNFragment(String str, Bundle bundle);

    void openPage(Activity activity, String str, int i);

    boolean sendJSEvent(String str, String str2, WritableMap writableMap);

    boolean sendJSEvent(String str, String str2, Map<String, Object> map);

    void setResumeActivity(WeakReference<Activity> weakReference);
}
