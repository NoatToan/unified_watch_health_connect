package v;

import android.hardware.camera2.CameraManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lv/k0;", "Landroidx/camera/core/impl/a;", "", "", "initialCameraIds", "Landroidx/camera/camera2/internal/compat/q;", "cameraManager", "Ljava/util/concurrent/Executor;", "systemCallbackExecutor", "<init>", "(Ljava/util/List;Landroidx/camera/camera2/internal/compat/q;Ljava/util/concurrent/Executor;)V", "a", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 extends androidx.camera.core.impl.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f173861i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.q f173862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f173863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f173864h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v/k0$b", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends CameraManager.AvailabilityCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            androidx.concurrent.futures.b.d dVar = (androidx.concurrent.futures.b.d) k0.this.b();
            l0.j.a aVar = l0.j.f107810a;
            androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
            aVar2.f6080b = dVar2;
            aVar2.f6079a = h.class;
            try {
                dVar.addListener(new l0.g(aVar2, 0), k0.b.a());
                aVar2.f6079a = "transformVoidFuture [" + dVar + "]";
            } catch (Exception e4) {
                dVar2.a(e4);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            str.getClass();
            androidx.concurrent.futures.b.d dVar = (androidx.concurrent.futures.b.d) k0.this.b();
            l0.j.a aVar = l0.j.f107810a;
            androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
            aVar2.f6080b = dVar2;
            aVar2.f6079a = h.class;
            try {
                dVar.addListener(new l0.g(aVar2, 0), k0.b.a());
                aVar2.f6079a = "transformVoidFuture [" + dVar + "]";
            } catch (Exception e4) {
                dVar2.a(e4);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            str.getClass();
            androidx.concurrent.futures.b.d dVar = (androidx.concurrent.futures.b.d) k0.this.b();
            l0.j.a aVar = l0.j.f107810a;
            androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
            aVar2.f6080b = dVar2;
            aVar2.f6079a = h.class;
            try {
                dVar.addListener(new l0.g(aVar2, 0), k0.b.a());
                aVar2.f6079a = "transformVoidFuture [" + dVar + "]";
            } catch (Exception e4) {
                dVar2.a(e4);
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(List<String> list, androidx.camera.camera2.internal.compat.q qVar, Executor executor) {
        super(list);
        list.getClass();
        qVar.getClass();
        executor.getClass();
        this.f173862f = qVar;
        this.f173863g = executor;
    }

    @Override // androidx.camera.core.impl.a
    public final void a() {
        if (this.f173864h != null) {
            f();
        }
        b bVar = new b();
        this.f173864h = bVar;
        this.f173862f.f5368a.c(this.f173863g, bVar);
        ListenableFuture<List<b0.q>> listenableFutureB = b();
        l0.j.a aVar = l0.j.f107810a;
        androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
        aVar2.f6080b = dVar;
        aVar2.f6079a = h.class;
        try {
            ((androidx.concurrent.futures.b.d) listenableFutureB).addListener(new l0.g(aVar2, 0), k0.b.a());
            aVar2.f6079a = "transformVoidFuture [" + listenableFutureB + "]";
        } catch (Exception e4) {
            dVar.a(e4);
        }
    }

    @Override // androidx.camera.core.impl.z1
    public final ListenableFuture<List<b0.q>> b() {
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = h.class;
        try {
            this.f173863g.execute(new r0.h(23, this, aVar));
            aVar.f6079a = "FetchData for CameraAvailability";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        return dVar;
    }

    @Override // androidx.camera.core.impl.a
    public final void f() {
        b bVar = this.f173864h;
        if (bVar != null) {
            try {
                this.f173862f.f5368a.e(bVar);
                Unit unit = Unit.INSTANCE;
            } catch (Exception unused) {
            } finally {
                this.f173864h = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv/k0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
