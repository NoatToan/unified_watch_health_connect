package defpackage;

import com.facebook.common.memory.MemoryTrimType;

/* JADX INFO: loaded from: classes4.dex */
public class vhg implements yl4.c {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36900a;

        static {
            int[] iArr = new int[MemoryTrimType.values().length];
            f36900a = iArr;
            try {
                iArr[MemoryTrimType.OnCloseToDalvikHeapLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36900a[MemoryTrimType.OnAppBackgrounded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36900a[MemoryTrimType.OnSystemMemoryCriticallyLowWhileAppInForeground.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36900a[MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36900a[MemoryTrimType.OnSystemLowMemoryWhileAppInBackground.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // yl4.c
    public double a(MemoryTrimType memoryTrimType) {
        int i = a.f36900a[memoryTrimType.ordinal()];
        if (i == 1) {
            return 0.0d;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return 1.0d;
        }
        cm8.I("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", memoryTrimType);
        return 0.0d;
    }
}
