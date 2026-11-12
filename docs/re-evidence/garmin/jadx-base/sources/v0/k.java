package v0;

import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.h1;
import com.google.common.util.concurrent.ListenableFuture;
import h0.m;
import java.util.Collections;
import java.util.List;
import o62.b0;

/* JADX INFO: loaded from: classes.dex */
public class k extends h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f174194d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.a f174195c;

    public k(CameraControlInternal cameraControlInternal, d.a aVar) {
        super(cameraControlInternal);
        this.f174195c = aVar;
    }

    @Override // androidx.camera.core.impl.h1, androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture j(int i14, int i15, List list) {
        k7.h.b(list.size() == 1, "Only support one capture config.");
        final ListenableFuture listenableFutureO = this.f5567b.o(i14);
        final int i16 = 0;
        final int i17 = 1;
        return l0.j.b(Collections.singletonList(l0.j.j(l0.j.j(l0.j.j(l0.d.a(listenableFutureO), new l0.a() { // from class: v0.j
            @Override // l0.a
            public final ListenableFuture apply(Object obj) {
                int i18 = i16;
                ListenableFuture listenableFuture = listenableFutureO;
                switch (i18) {
                    case 0:
                        int i19 = k.f174194d;
                        return ((m) listenableFuture.get()).a();
                    default:
                        int i24 = k.f174194d;
                        return ((m) listenableFuture.get()).b();
                }
            }
        }, k0.b.a()), new b0(22, this, list), k0.b.a()), new l0.a() { // from class: v0.j
            @Override // l0.a
            public final ListenableFuture apply(Object obj) {
                int i18 = i17;
                ListenableFuture listenableFuture = listenableFutureO;
                switch (i18) {
                    case 0:
                        int i19 = k.f174194d;
                        return ((m) listenableFuture.get()).a();
                    default:
                        int i24 = k.f174194d;
                        return ((m) listenableFuture.get()).b();
                }
            }
        }, k0.b.a())));
    }
}
