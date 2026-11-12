package defpackage;

import android.app.Activity;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeDeltaClient;

/* JADX INFO: loaded from: classes4.dex */
public interface kdj {
    JavaScriptExecutorFactory a();

    void b(NativeDeltaClient nativeDeltaClient);

    void c(JavaJSExecutor.Factory factory);

    Activity d();

    void toggleElementInspector();
}
