package com.huawei.hmf.orb.tbis;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.huawei.hmf.orb.tbis.type.IntentRef;
import com.huawei.hmf.services.ui.Launcher;
import com.huawei.hmf.services.ui.UIModule;
import com.huawei.hmf.services.ui.activity.ActivityCallback;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes33.dex */
public class TBUIModule {
    private static final String TAG = "TBUIModule";
    private Intent mFillInIntent;
    private final UIModule mUiModule;

    public interface Callback {
        void onResult(String str);
    }

    public interface Callback2 {
        void onResult(Object obj);
    }

    public static void onActivityResult(int i, int i2, Intent intent) {
    }

    public TBUIModule(UIModule uIModule) {
        this.mUiModule = uIModule;
    }

    public void startActivity(Context context, String str, final Callback callback) {
        TextCodec textCodecCreate = TextCodecFactory.create(str);
        Object object = textCodecCreate.getObject(x2.PROTOCOL, this.mUiModule.getUIModuleSpec().getProtocol());
        IntentRef intentRef = (IntentRef) textCodecCreate.getObject(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, IntentRef.class);
        Intent intentUnboxing2 = intentRef != null ? intentRef.unboxing2() : null;
        copy(object, this.mUiModule.createProtocol());
        if (callback == null) {
            Launcher.getLauncher().startActivity(context, this.mUiModule, intentUnboxing2);
        } else {
            Launcher.getLauncher().startActivity(context, this.mUiModule, intentUnboxing2, new ActivityCallback() { // from class: com.huawei.hmf.orb.tbis.TBUIModule.1
                @Override // com.huawei.hmf.services.ui.activity.ActivityCallback
                public void onResult(int i, Object obj) {
                    TextCodec textCodecCreate2 = TextCodecFactory.create();
                    textCodecCreate2.put("code", Integer.valueOf(i));
                    textCodecCreate2.put("result", obj);
                    callback.onResult(textCodecCreate2.toString());
                }
            });
        }
    }

    public void startActivity(Context context, final Callback2 callback2) {
        if (callback2 == null) {
            Launcher.getLauncher().startActivity(context, this.mUiModule, this.mFillInIntent);
        } else {
            Launcher.getLauncher().startActivity(context, this.mUiModule, this.mFillInIntent, new ActivityCallback() { // from class: com.huawei.hmf.orb.tbis.TBUIModule.2
                @Override // com.huawei.hmf.services.ui.activity.ActivityCallback
                public void onResult(int i, Object obj) {
                    callback2.onResult(new Object[]{Integer.valueOf(i), obj});
                }
            });
        }
    }

    public <T> T createProtocol() {
        return (T) this.mUiModule.createProtocol();
    }

    public Intent createFillInIntent() {
        Intent intent = new Intent();
        this.mFillInIntent = intent;
        return intent;
    }

    private static void copy(Object obj, Object obj2) {
        for (Method method : obj2.getClass().getMethods()) {
            try {
                if (method.getName().startsWith("set")) {
                    method.invoke(obj2, obj.getClass().getMethod("get" + method.getName().substring(3), new Class[0]).invoke(obj, new Object[0]));
                }
            } catch (Exception e) {
                Log.e(TAG, "copy UIModule protocol's value exception", e);
            }
        }
    }
}
