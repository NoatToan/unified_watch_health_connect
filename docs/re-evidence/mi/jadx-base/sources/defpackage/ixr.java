package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;

/* JADX INFO: loaded from: classes2.dex */
public class ixr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gur f22210b;
    public final NativeModuleCallExceptionHandler c;
    public final String d = "YRN_YRNV3_SDK";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f22209a = new Handler(Looper.getMainLooper());

    public class a implements com.facebook.react.a.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ YRNDevModeInfo f22211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.facebook.react.a f22212b;
        public final /* synthetic */ u1d c;
        public final /* synthetic */ fwr d;

        public a(YRNDevModeInfo yRNDevModeInfo, com.facebook.react.a aVar, u1d u1dVar, fwr fwrVar) {
            this.f22211a = yRNDevModeInfo;
            this.f22212b = aVar;
            this.c = u1dVar;
            this.d = fwrVar;
        }

        @Override // com.facebook.react.a.l
        public void onReactContextInitialized(ReactContext reactContext) {
            zxr.a("YRN_YRNV3_SDK", "YRNInstanceHelper.createCommonInstanceForDevIPMode success: " + this.f22211a);
            this.f22212b.e0(this);
            u1d u1dVar = this.c;
            if (u1dVar != null) {
                u1dVar.onResult(this.d);
            }
        }
    }

    public ixr(gur gurVar, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.f22210b = gurVar;
        this.c = nativeModuleCallExceptionHandler;
    }

    public static /* synthetic */ void g(YRNBundleInfo yRNBundleInfo, fwr fwrVar, f1d f1dVar) {
        exr.f().b(yRNBundleInfo, fwrVar, f1dVar);
    }

    public void d(final fwr fwrVar, final YRNBundleInfo yRNBundleInfo, final f1d<our> f1dVar) {
        this.f22209a.post(new Runnable() { // from class: fxr
            @Override // java.lang.Runnable
            public final void run() {
                ixr.g(yRNBundleInfo, fwrVar, f1dVar);
            }
        });
    }

    public void e(final YRNDevModeInfo yRNDevModeInfo, final u1d<fwr> u1dVar) {
        this.f22209a.post(new Runnable() { // from class: hxr
            @Override // java.lang.Runnable
            public final void run() {
                this.f20585a.h(yRNDevModeInfo, u1dVar);
            }
        });
    }

    public void f(final YRNBundleInfo yRNBundleInfo, final f1d<fwr> f1dVar) {
        this.f22209a.post(new Runnable() { // from class: gxr
            @Override // java.lang.Runnable
            public final void run() {
                this.f19447a.i(yRNBundleInfo, f1dVar);
            }
        });
    }

    public final /* synthetic */ void h(YRNDevModeInfo yRNDevModeInfo, u1d u1dVar) {
        if (yRNDevModeInfo == null) {
            zxr.b("YRN_YRNV3_SDK", "YRNInstanceHelper.createCommonInstanceForDevIPMode: devModeInfo is null,please check!");
            if (u1dVar != null) {
                u1dVar.onResult(null);
                return;
            }
            return;
        }
        fwr fwrVarD = exr.f().d(this.f22210b, yRNDevModeInfo, this.c);
        if (fwrVarD != null && fwrVarD.o() != null) {
            com.facebook.react.a aVarO = fwrVarD.o();
            aVarO.q(new a(yRNDevModeInfo, aVarO, u1dVar, fwrVarD));
        } else if (u1dVar != null) {
            u1dVar.onResult(null);
        }
    }

    public final /* synthetic */ void i(YRNBundleInfo yRNBundleInfo, f1d f1dVar) {
        exr.f().c(this.f22210b, yRNBundleInfo, this.c, f1dVar);
    }
}
