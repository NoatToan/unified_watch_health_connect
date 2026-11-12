package com.google.android.gms.dynamite;

import android.os.Looper;

/* JADX INFO: loaded from: classes14.dex */
public final class zzb {
    private static ClassLoader zza;
    private static Thread zzb;

    /* JADX WARN: Code duplicated, block: B:52:0x00a3 A[Catch: all -> 0x009f, PHI: r1
      0x00a3: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v18 java.lang.Thread) binds: [B:7:0x000a, B:46:0x009c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x009a, B:60:0x00c2, B:12:0x001f, B:51:0x00a2, B:52:0x00a3, B:63:0x00c6, B:64:0x00c7, B:53:0x00a4, B:59:0x00c1, B:58:0x00ae, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:42:0x0085, B:43:0x0098, B:18:0x003c), top: B:79:0x0003, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader zza() {
        SecurityException e4;
        Thread thread;
        ThreadGroup threadGroup;
        if (zza == null) {
            Thread thread2 = zzb;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = zzb.getContextClassLoader();
                    } catch (SecurityException e14) {
                        new StringBuilder(String.valueOf(e14.getMessage()).length() + 41);
                    }
                }
                zza = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i14 = 0;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i15];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i15++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i14 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i14];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i14++;
                                }
                                if (thread == null) {
                                    try {
                                        zza zzaVar = new zza(threadGroup, "GmsDynamite");
                                        try {
                                            zzaVar.setContextClassLoader(null);
                                            zzaVar.start();
                                            thread = zzaVar;
                                        } catch (SecurityException e15) {
                                            e4 = e15;
                                            thread = zzaVar;
                                            new StringBuilder(String.valueOf(e4.getMessage()).length() + 39);
                                        }
                                    } catch (SecurityException e16) {
                                        e4 = e16;
                                    }
                                }
                            } catch (SecurityException e17) {
                                e4 = e17;
                                thread = null;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    thread2 = thread;
                }
                zzb = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = zzb.getContextClassLoader();
                    }
                }
                zza = contextClassLoader;
            }
        }
        return zza;
    }
}
