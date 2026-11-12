package v;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f173776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f173777b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f173778c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f173779d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f173780e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f173781f = new a();

    public class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f173782b = 0;

        public a() {
        }

        public final void a() {
            ArrayList arrayListB;
            synchronized (e1.this.f173777b) {
                arrayListB = e1.this.b();
                e1.this.f173780e.clear();
                e1.this.f173778c.clear();
                e1.this.f173779d.clear();
            }
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).i();
            }
        }

        public final void b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (e1.this.f173777b) {
                linkedHashSet.addAll(e1.this.f173780e);
                linkedHashSet.addAll(e1.this.f173778c);
            }
            e1.this.f173776a.execute(new b0(linkedHashSet, 3));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            b();
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i14) {
            b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (e1.this.f173777b) {
                linkedHashSet.addAll(e1.this.f173780e);
                linkedHashSet.addAll(e1.this.f173778c);
            }
            e1.this.f173776a.execute(new androidx.media3.exoplayer.d(linkedHashSet, i14, 14));
            a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }
    }

    public e1(Executor executor) {
        this.f173776a = executor;
    }

    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this.f173777b) {
            arrayList = new ArrayList(this.f173778c);
        }
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f173777b) {
            arrayList = new ArrayList();
            arrayList.addAll(a());
            synchronized (this.f173777b) {
                arrayList2 = new ArrayList(this.f173780e);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
