package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import p005kotlin.jvm.internal.s;
import re.e;

/* JADX INFO: loaded from: classes7.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f11396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f11397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f11398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f11399e;

    public DistinctElementSidecarCallback(SidecarInterface.SidecarCallback sidecarCallback) {
        this.f11395a = new Object();
        this.f11397c = new WeakHashMap();
        this.f11398d = new e();
        this.f11399e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (re.e.a.b(r2) == re.e.a.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f11395a) {
            try {
                e eVar = this.f11398d;
                SidecarDeviceState sidecarDeviceState2 = this.f11396b;
                eVar.getClass();
                if (!s.g(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 != null) {
                        e.f152085b.getClass();
                    }
                    this.f11396b = sidecarDeviceState;
                    this.f11399e.onDeviceStateChanged(sidecarDeviceState);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean zB;
        synchronized (this.f11395a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f11397c.get(iBinder);
                this.f11398d.getClass();
                if (s.g(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    zB = true;
                } else if (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) {
                    zB = false;
                } else {
                    e.f152085b.getClass();
                    zB = e.b(e.a.c(sidecarWindowLayoutInfo2), e.a.c(sidecarWindowLayoutInfo));
                }
                if (zB) {
                    return;
                }
                this.f11397c.put(iBinder, sidecarWindowLayoutInfo);
                this.f11399e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public DistinctElementSidecarCallback(e eVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f11395a = new Object();
        this.f11397c = new WeakHashMap();
        this.f11398d = eVar;
        this.f11399e = sidecarCallback;
    }
}
