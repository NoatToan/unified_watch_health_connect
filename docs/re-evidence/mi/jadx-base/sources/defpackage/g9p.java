package defpackage;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes4.dex */
public class g9p extends ReactContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f18761a;

    public g9p(ReactApplicationContext reactApplicationContext, Context context) {
        super(context);
        if (reactApplicationContext.hasCatalystInstance()) {
            initializeWithInstance(reactApplicationContext.getCatalystInstance());
        }
        this.f18761a = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f18761a.addLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.f18761a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.f18761a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f18761a.removeLifecycleEventListener(lifecycleEventListener);
    }
}
