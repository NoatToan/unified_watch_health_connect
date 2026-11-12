package com.google.android.gms.internal.gcm;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
public final class zzq {
    private static final zzr zzdq;
    private static final int zzdr;

    public static final class zzd extends zzr {
        @Override // com.google.android.gms.internal.gcm.zzr
        public final void zzd(Throwable th3, Throwable th4) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:6:0x000e, B:9:0x0016, B:11:0x001e, B:12:0x0024), top: B:24:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:6:0x000e, B:9:0x0016, B:11:0x001e, B:12:0x0024), top: B:24:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0016 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:6:0x000e, B:9:0x0016, B:11:0x001e, B:12:0x0024), top: B:24:0x0006 }] */
    static {
        Integer numZzac;
        zzr zzdVar;
        try {
            numZzac = zzac();
            if (numZzac != null) {
                try {
                    if (numZzac.intValue() >= 19) {
                        zzdVar = new zzv();
                    } else if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                        zzdVar = new zzd();
                    } else {
                        zzdVar = new zzu();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    PrintStream printStream = System.err;
                    String name = zzd.class.getName();
                    StringBuilder sb3 = new StringBuilder(name.length() + 133);
                    sb3.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                    sb3.append(name);
                    sb3.append("will be used. The error is: ");
                    printStream.println(sb3.toString());
                    th.printStackTrace(System.err);
                    zzdVar = new zzd();
                }
            } else if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                zzdVar = new zzu();
            } else {
                zzdVar = new zzd();
            }
        } catch (Throwable th4) {
            th = th4;
            numZzac = null;
        }
        zzdq = zzdVar;
        zzdr = numZzac == null ? 1 : numZzac.intValue();
    }

    private static Integer zzac() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e4) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e4.printStackTrace(System.err);
            return null;
        }
    }

    public static void zzd(Throwable th3, Throwable th4) {
        zzdq.zzd(th3, th4);
    }
}
