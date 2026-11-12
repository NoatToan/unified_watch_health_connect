package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.ndj;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = "JSCHeapCapture", needsEagerInit = true)
public class JSCHeapCapture extends ReactContextBaseJavaModule {
    private a mCaptureInProgress;

    public static class CaptureException extends Exception {
        public CaptureException(String str) {
            super(str);
        }

        public CaptureException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    public interface a {
        void a(CaptureException captureException);

        void onSuccess(File file);
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCaptureInProgress = null;
    }

    @ReactMethod
    public synchronized void captureComplete(String str, String str2) {
        try {
            a aVar = this.mCaptureInProgress;
            if (aVar != null) {
                if (str2 == null) {
                    aVar.onSuccess(new File(str));
                } else {
                    aVar.a(new CaptureException(str2));
                }
                this.mCaptureInProgress = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void captureHeap(String str, a aVar) {
        if (this.mCaptureInProgress != null) {
            aVar.a(new CaptureException("Heap capture already in progress."));
            return;
        }
        File file = new File(str + "/capture.json");
        file.delete();
        HeapCapture heapCapture = (HeapCapture) getReactApplicationContext().getJSModule(HeapCapture.class);
        if (heapCapture == null) {
            aVar.a(new CaptureException("Heap capture js module not registered."));
        } else {
            this.mCaptureInProgress = aVar;
            heapCapture.captureHeap(file.getPath());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JSCHeapCapture";
    }
}
