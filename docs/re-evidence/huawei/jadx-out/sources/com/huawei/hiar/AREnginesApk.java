package com.huawei.hiar;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes33.dex */
public class AREnginesApk {
    private static final String LIBRARY_NAME = "huawei_arengine_jni";
    private static final String TAG = "AREnginesApk";

    private static native boolean nativeIsAREngineApkReady(Context context);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static class ARAvailability {
        private static final /* synthetic */ ARAvailability[] $VALUES;
        public static final ARAvailability SUPPORTED_APK_TOO_OLD;
        public static final ARAvailability SUPPORTED_INSTALLED;
        public static final ARAvailability SUPPORTED_NOT_INSTALLED;
        public static final ARAvailability UNKNOWN_CHECKING;
        public static final ARAvailability UNKNOWN_ERROR;
        public static final ARAvailability UNKNOWN_TIMED_OUT;
        public static final ARAvailability UNSUPPORTED_DEVICE_NOT_CAPABLE;
        public static final ARAvailability UNSUPPORTED_EMUI_NOT_CAPABLE;
        final int nativeCode;

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        public static ARAvailability[] values() {
            return (ARAvailability[]) $VALUES.clone();
        }

        public static ARAvailability valueOf(String str) {
            return (ARAvailability) Enum.valueOf(ARAvailability.class, str);
        }

        static ARAvailability forNumber(int i) {
            for (ARAvailability aRAvailability : values()) {
                if (aRAvailability.nativeCode == i) {
                    return aRAvailability;
                }
            }
            return UNKNOWN_ERROR;
        }

        final enum a extends ARAvailability {
            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isUnknown() {
                return true;
            }

            a(String str, int i, int i2) {
                super(str, i, i2);
            }
        }

        final enum b extends ARAvailability {
            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isTransient() {
                return true;
            }

            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isUnknown() {
                return true;
            }

            b(String str, int i, int i2) {
                super(str, i, i2);
            }
        }

        final enum c extends ARAvailability {
            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isUnknown() {
                return true;
            }

            c(String str, int i, int i2) {
                super(str, i, i2);
            }
        }

        final enum d extends ARAvailability {
            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isUnsupported() {
                return true;
            }

            d(String str, int i, int i2) {
                super(str, i, i2);
            }
        }

        final enum e extends ARAvailability {
            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isUnsupported() {
                return true;
            }

            e(String str, int i, int i2) {
                super(str, i, i2);
            }
        }

        final enum f extends ARAvailability {
            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isSupported() {
                return true;
            }

            f(String str, int i, int i2) {
                super(str, i, i2);
            }
        }

        final enum g extends ARAvailability {
            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isSupported() {
                return true;
            }

            g(String str, int i, int i2) {
                super(str, i, i2);
            }
        }

        final enum h extends ARAvailability {
            @Override // com.huawei.hiar.AREnginesApk.ARAvailability
            public boolean isSupported() {
                return true;
            }

            h(String str, int i, int i2) {
                super(str, i, i2);
            }
        }

        private ARAvailability(String str, int i, int i2) {
            super(str, i);
            this.nativeCode = i2;
        }

        static {
            a aVar = new a("UNKNOWN_ERROR", 0, 0);
            UNKNOWN_ERROR = aVar;
            b bVar = new b("UNKNOWN_CHECKING", 1, 1);
            UNKNOWN_CHECKING = bVar;
            c cVar = new c("UNKNOWN_TIMED_OUT", 2, 2);
            UNKNOWN_TIMED_OUT = cVar;
            d dVar = new d("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100);
            UNSUPPORTED_DEVICE_NOT_CAPABLE = dVar;
            e eVar = new e("UNSUPPORTED_EMUI_NOT_CAPABLE", 4, 5000);
            UNSUPPORTED_EMUI_NOT_CAPABLE = eVar;
            f fVar = new f("SUPPORTED_NOT_INSTALLED", 5, 201);
            SUPPORTED_NOT_INSTALLED = fVar;
            g gVar = new g("SUPPORTED_APK_TOO_OLD", 6, 202);
            SUPPORTED_APK_TOO_OLD = gVar;
            h hVar = new h("SUPPORTED_INSTALLED", 7, 203);
            SUPPORTED_INSTALLED = hVar;
            $VALUES = new ARAvailability[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar};
        }
    }

    @Deprecated
    public static ARInstallStatus requestInstall(Activity activity, boolean z) {
        return ARInstallStatus.forNumber(0);
    }

    @Deprecated
    public enum ARInstallStatus {
        UNKNOWN_STATUS(-1),
        INSTALLED(0),
        INSTALL_REQUESTED(1);

        final int nativeCode;

        static ARInstallStatus forNumber(int i) {
            for (ARInstallStatus aRInstallStatus : values()) {
                if (aRInstallStatus.nativeCode == i) {
                    return aRInstallStatus;
                }
            }
            return UNKNOWN_STATUS;
        }

        ARInstallStatus(int i) {
            this.nativeCode = i;
        }
    }

    public static boolean isAREngineApkReady(Context context) {
        return nativeIsAREngineApkReady(context);
    }

    @Deprecated
    public static ARAvailability checkAvailability(Context context) {
        return ARAvailability.forNumber(203);
    }

    private AREnginesApk() {
    }

    static {
        System.loadLibrary(LIBRARY_NAME);
    }
}
