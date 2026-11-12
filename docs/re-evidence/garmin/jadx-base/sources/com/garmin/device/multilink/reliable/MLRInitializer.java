package com.garmin.device.multilink.reliable;

import gt2.c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class MLRInitializer {
    private static boolean HAS_LOADED;
    private static boolean IS_DEBUG;
    private static final Set<MLRValidationListener> LISTENERS = new CopyOnWriteArraySet();
    private static final Logger LOGGER = LoggerFactory.getLogger("MLRInitializer");
    private static final byte[] LOADED_LOCK = new byte[0];

    public interface MLRValidationListener {
        void onPerformValidationResult(boolean z14);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x005d A[Catch: all -> 0x0053, Error -> 0x0055, Exception -> 0x0057, TryCatch #1 {all -> 0x0053, blocks: (B:4:0x0005, B:8:0x000e, B:9:0x0012, B:27:0x003f, B:29:0x0043, B:38:0x0059, B:40:0x005d, B:41:0x006e, B:43:0x007b, B:47:0x0093, B:10:0x0013, B:12:0x0017, B:14:0x0021, B:21:0x0031, B:25:0x003c, B:23:0x0034), top: B:50:0x0005, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[Catch: all -> 0x0053, Error -> 0x0055, Exception -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:4:0x0005, B:8:0x000e, B:9:0x0012, B:27:0x003f, B:29:0x0043, B:38:0x0059, B:40:0x005d, B:41:0x006e, B:43:0x007b, B:47:0x0093, B:10:0x0013, B:12:0x0017, B:14:0x0021, B:21:0x0031, B:25:0x003c, B:23:0x0034), top: B:50:0x0005, inners: #4 }] */
    public static synchronized void initialize(boolean z14, boolean z15) {
        try {
            boolean z16 = true;
            boolean z17 = IS_DEBUG != z14;
            IS_DEBUG = z14;
            synchronized (LOADED_LOCK) {
                try {
                    if (HAS_LOADED) {
                        z16 = z17;
                    } else {
                        try {
                            System.loadLibrary("reliable-ml");
                            powerUp();
                            if (z15) {
                                runLibraryTests(new b());
                            }
                            HAS_LOADED = true;
                        } catch (Error e4) {
                            e = e4;
                            LOGGER.error("Failed to initialize MLR", e);
                            z16 = z17;
                        } catch (Exception e14) {
                            e = e14;
                            LOGGER.error("Failed to initialize MLR", e);
                            z16 = z17;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!z16) {
                try {
                    if (IS_DEBUG) {
                        int i14 = c.f79010a;
                        gt2.b.f79005a.getClass();
                        if (!gt2.b.a.k("MLR")) {
                            if (IS_DEBUG) {
                                int i15 = c.f79010a;
                                gt2.b.f79005a.d(new gt2.a("MLR", ""), false, false);
                            } else {
                                int i16 = c.f79010a;
                                gt2.b.f79005a.getClass();
                                gt2.b.a.l("MLR", false);
                            }
                        }
                    }
                } catch (Error e15) {
                    e = e15;
                    LOGGER.error("Failed to initialize MLR detailed logger: " + e.getMessage());
                } catch (Exception e16) {
                    e = e16;
                    LOGGER.error("Failed to initialize MLR detailed logger: " + e.getMessage());
                }
            } else if (IS_DEBUG) {
                int i17 = c.f79010a;
                gt2.b.f79005a.d(new gt2.a("MLR", ""), false, false);
            } else {
                int i18 = c.f79010a;
                gt2.b.f79005a.getClass();
                gt2.b.a.l("MLR", false);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static boolean isDebug() {
        return IS_DEBUG;
    }

    public static boolean isLoaded() {
        boolean z14;
        synchronized (LOADED_LOCK) {
            z14 = HAS_LOADED;
        }
        return z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(boolean z14) {
        if (z14) {
            LOGGER.debug("/MLR Test: success");
        } else {
            LOGGER.error("/MLR Test: failure");
            h.q("Failed MLR tests");
        }
    }

    public static void onPerformValidationResult(boolean z14) {
        Iterator<MLRValidationListener> it = LISTENERS.iterator();
        while (it.hasNext()) {
            it.next().onPerformValidationResult(z14);
        }
    }

    private static native void performValidation();

    private static native void powerDown();

    private static native void powerUp();

    public static void runLibraryTests(final MLRValidationListener mLRValidationListener) {
        LISTENERS.add(new MLRValidationListener() { // from class: com.garmin.device.multilink.reliable.MLRInitializer.1
            @Override // com.garmin.device.multilink.reliable.MLRInitializer.MLRValidationListener
            public void onPerformValidationResult(boolean z14) {
                mLRValidationListener.onPerformValidationResult(z14);
                synchronized (MLRInitializer.LISTENERS) {
                    MLRInitializer.LISTENERS.remove(this);
                }
            }
        });
        performValidation();
    }

    public static synchronized void initialize(boolean z14) {
        initialize(z14, false);
    }
}
