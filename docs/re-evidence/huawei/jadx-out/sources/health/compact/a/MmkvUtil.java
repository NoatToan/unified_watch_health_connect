package health.compact.a;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDataFilter;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import com.tencent.mmkv.MMKVRecoverStrategic;

/* JADX INFO: loaded from: classes.dex */
public class MmkvUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f36618a = new Object();
    private static volatile boolean e = false;

    private MmkvUtil() {
    }

    public static MMKV b(String str, String str2) throws RuntimeException {
        c();
        return MMKV.mmkvWithID(str, 2, str2);
    }

    private static void c() {
        if (e) {
            return;
        }
        synchronized (f36618a) {
            if (e) {
                return;
            }
            MMKV.initialize(BaseApplication.b());
            MMKV.registerHandler(new MMKVHandler() { // from class: health.compact.a.MmkvUtil.5
                @Override // com.tencent.mmkv.MMKVHandler
                public boolean wantLogRedirecting() {
                    return true;
                }

                @Override // com.tencent.mmkv.MMKVHandler
                public MMKVRecoverStrategic onMMKVCRCCheckFail(String str) {
                    ReleaseLogUtil.b("TimeEat_MmkvUtil", "onMMKVCRCCheckFail happened, mmapID = ", str);
                    return null;
                }

                @Override // com.tencent.mmkv.MMKVHandler
                public MMKVRecoverStrategic onMMKVFileLengthError(String str) {
                    ReleaseLogUtil.b("TimeEat_MmkvUtil", "onMMKVFileLengthError happened, mmapID = ", str);
                    return null;
                }

                @Override // com.tencent.mmkv.MMKVHandler
                public void mmkvLog(MMKVLogLevel mMKVLogLevel, String str, int i, String str2, String str3) {
                    String str4 = HiDataFilter.DataFilterExpression.LESS_THAN + str + ":" + i + "::" + str2 + "> " + str3;
                    int i2 = AnonymousClass2.f36619b[mMKVLogLevel.ordinal()];
                    if (i2 == 1) {
                        LogUtil.c("TimeEat_MmkvUtil", "redirect logging MMKV", str4);
                        return;
                    }
                    if (i2 == 2) {
                        LogUtil.c("TimeEat_MmkvUtil", "redirect logging MMKV", str4);
                        return;
                    }
                    if (i2 == 3) {
                        LogUtil.c("TimeEat_MmkvUtil", "redirect logging MMKV", str4);
                    } else if (i2 == 4 || i2 == 5) {
                        LogUtil.c("TimeEat_MmkvUtil", "redirect logging MMKV", str4);
                    }
                }
            });
            e = true;
        }
    }

    /* JADX INFO: renamed from: health.compact.a.MmkvUtil$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f36619b;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            f36619b = iArr;
            try {
                iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36619b[MMKVLogLevel.LevelInfo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36619b[MMKVLogLevel.LevelWarning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36619b[MMKVLogLevel.LevelError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36619b[MMKVLogLevel.LevelNone.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
