package com.journeyapps.barcodescanner.camera;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes18.dex */
public final class AutoFocusManager {
    private static final String i = "AutoFocusManager";
    private static final long j = 2000;
    private static final Collection<String> k;
    private boolean a;
    private boolean b;
    private final boolean c;
    private final Camera d;
    private Handler e;
    private int f = 1;
    private final Handler.Callback g;
    private final Camera.AutoFocusCallback h;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != AutoFocusManager.this.f) {
                return false;
            }
            AutoFocusManager.this.h();
            return true;
        }
    }

    public class b implements Camera.AutoFocusCallback {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AutoFocusManager.this.b = false;
                AutoFocusManager.this.f();
            }
        }

        public b() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            AutoFocusManager.this.e.post(new a());
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        k = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public AutoFocusManager(Camera camera, CameraSettings cameraSettings) {
        a aVar = new a();
        this.g = aVar;
        this.h = new b();
        this.e = new Handler(aVar);
        this.d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z = cameraSettings.isAutoFocusEnabled() && k.contains(focusMode);
        this.c = z;
        Log.i(i, "Current focus mode '" + focusMode + "'; use auto focus? " + z);
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        if (!this.a && !this.e.hasMessages(this.f)) {
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f), 2000L);
        }
    }

    private void g() {
        this.e.removeMessages(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!this.c || this.a || this.b) {
            return;
        }
        try {
            this.d.autoFocus(this.h);
            this.b = true;
        } catch (RuntimeException e) {
            Log.w(i, "Unexpected exception while focusing", e);
            f();
        }
    }

    public void start() {
        this.a = false;
        h();
    }

    public void stop() {
        this.a = true;
        this.b = false;
        g();
        if (this.c) {
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(i, "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
