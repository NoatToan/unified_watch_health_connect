package defpackage;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.v8.reactexecutor.V8Executor;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class pmq implements JavaScriptExecutorFactory {
    public final String a() {
        return TimeZone.getDefault().getID();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new V8Executor(a());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
    }

    public String toString() {
        return "JSIExecutor+V8Runtime";
    }
}
