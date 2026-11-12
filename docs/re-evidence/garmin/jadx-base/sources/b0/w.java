package b0;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.c3;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14069a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f14070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f14071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f14074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f14075g;

    public /* synthetic */ w(x xVar, Context context, Executor executor, int i14, androidx.concurrent.futures.b.a aVar, long j8) {
        this.f14070b = xVar;
        this.f14074f = context;
        this.f14071c = executor;
        this.f14073e = i14;
        this.f14075g = aVar;
        this.f14072d = j8;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x018d A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:7:0x003d, B:9:0x0045, B:11:0x0062, B:13:0x007b, B:15:0x0083, B:17:0x008d, B:19:0x00aa, B:28:0x00bf, B:29:0x00e6, B:31:0x00ec, B:32:0x00fc, B:34:0x012e, B:36:0x0134, B:37:0x013a, B:38:0x013c, B:41:0x0142, B:45:0x014c, B:46:0x014d, B:47:0x0159, B:58:0x017c, B:60:0x018d, B:61:0x0194, B:65:0x01a2, B:66:0x01b4, B:67:0x01b6, B:70:0x01bc, B:72:0x01c0, B:73:0x01c2, B:76:0x01c8, B:80:0x01cf, B:81:0x01d0, B:83:0x01d4, B:84:0x01fb, B:86:0x01ff, B:87:0x0204, B:92:0x0211, B:54:0x0162, B:55:0x016e, B:56:0x016f, B:57:0x017b, B:74:0x01c3, B:75:0x01c7, B:68:0x01b7, B:69:0x01bb), top: B:95:0x003d, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x019d  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:7:0x003d, B:9:0x0045, B:11:0x0062, B:13:0x007b, B:15:0x0083, B:17:0x008d, B:19:0x00aa, B:28:0x00bf, B:29:0x00e6, B:31:0x00ec, B:32:0x00fc, B:34:0x012e, B:36:0x0134, B:37:0x013a, B:38:0x013c, B:41:0x0142, B:45:0x014c, B:46:0x014d, B:47:0x0159, B:58:0x017c, B:60:0x018d, B:61:0x0194, B:65:0x01a2, B:66:0x01b4, B:67:0x01b6, B:70:0x01bc, B:72:0x01c0, B:73:0x01c2, B:76:0x01c8, B:80:0x01cf, B:81:0x01d0, B:83:0x01d4, B:84:0x01fb, B:86:0x01ff, B:87:0x0204, B:92:0x0211, B:54:0x0162, B:55:0x016e, B:56:0x016f, B:57:0x017b, B:74:0x01c3, B:75:0x01c7, B:68:0x01b7, B:69:0x01bb), top: B:95:0x003d, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:7:0x003d, B:9:0x0045, B:11:0x0062, B:13:0x007b, B:15:0x0083, B:17:0x008d, B:19:0x00aa, B:28:0x00bf, B:29:0x00e6, B:31:0x00ec, B:32:0x00fc, B:34:0x012e, B:36:0x0134, B:37:0x013a, B:38:0x013c, B:41:0x0142, B:45:0x014c, B:46:0x014d, B:47:0x0159, B:58:0x017c, B:60:0x018d, B:61:0x0194, B:65:0x01a2, B:66:0x01b4, B:67:0x01b6, B:70:0x01bc, B:72:0x01c0, B:73:0x01c2, B:76:0x01c8, B:80:0x01cf, B:81:0x01d0, B:83:0x01d4, B:84:0x01fb, B:86:0x01ff, B:87:0x0204, B:92:0x0211, B:54:0x0162, B:55:0x016e, B:56:0x016f, B:57:0x017b, B:74:0x01c3, B:75:0x01c7, B:68:0x01b7, B:69:0x01bb), top: B:95:0x003d, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d0 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:7:0x003d, B:9:0x0045, B:11:0x0062, B:13:0x007b, B:15:0x0083, B:17:0x008d, B:19:0x00aa, B:28:0x00bf, B:29:0x00e6, B:31:0x00ec, B:32:0x00fc, B:34:0x012e, B:36:0x0134, B:37:0x013a, B:38:0x013c, B:41:0x0142, B:45:0x014c, B:46:0x014d, B:47:0x0159, B:58:0x017c, B:60:0x018d, B:61:0x0194, B:65:0x01a2, B:66:0x01b4, B:67:0x01b6, B:70:0x01bc, B:72:0x01c0, B:73:0x01c2, B:76:0x01c8, B:80:0x01cf, B:81:0x01d0, B:83:0x01d4, B:84:0x01fb, B:86:0x01ff, B:87:0x0204, B:92:0x0211, B:54:0x0162, B:55:0x016e, B:56:0x016f, B:57:0x017b, B:74:0x01c3, B:75:0x01c7, B:68:0x01b7, B:69:0x01bb), top: B:95:0x003d, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d4 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:7:0x003d, B:9:0x0045, B:11:0x0062, B:13:0x007b, B:15:0x0083, B:17:0x008d, B:19:0x00aa, B:28:0x00bf, B:29:0x00e6, B:31:0x00ec, B:32:0x00fc, B:34:0x012e, B:36:0x0134, B:37:0x013a, B:38:0x013c, B:41:0x0142, B:45:0x014c, B:46:0x014d, B:47:0x0159, B:58:0x017c, B:60:0x018d, B:61:0x0194, B:65:0x01a2, B:66:0x01b4, B:67:0x01b6, B:70:0x01bc, B:72:0x01c0, B:73:0x01c2, B:76:0x01c8, B:80:0x01cf, B:81:0x01d0, B:83:0x01d4, B:84:0x01fb, B:86:0x01ff, B:87:0x0204, B:92:0x0211, B:54:0x0162, B:55:0x016e, B:56:0x016f, B:57:0x017b, B:74:0x01c3, B:75:0x01c7, B:68:0x01b7, B:69:0x01bb), top: B:95:0x003d, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:7:0x003d, B:9:0x0045, B:11:0x0062, B:13:0x007b, B:15:0x0083, B:17:0x008d, B:19:0x00aa, B:28:0x00bf, B:29:0x00e6, B:31:0x00ec, B:32:0x00fc, B:34:0x012e, B:36:0x0134, B:37:0x013a, B:38:0x013c, B:41:0x0142, B:45:0x014c, B:46:0x014d, B:47:0x0159, B:58:0x017c, B:60:0x018d, B:61:0x0194, B:65:0x01a2, B:66:0x01b4, B:67:0x01b6, B:70:0x01bc, B:72:0x01c0, B:73:0x01c2, B:76:0x01c8, B:80:0x01cf, B:81:0x01d0, B:83:0x01d4, B:84:0x01fb, B:86:0x01ff, B:87:0x0204, B:92:0x0211, B:54:0x0162, B:55:0x016e, B:56:0x016f, B:57:0x017b, B:74:0x01c3, B:75:0x01c7, B:68:0x01b7, B:69:0x01bb), top: B:95:0x003d, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ff A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:7:0x003d, B:9:0x0045, B:11:0x0062, B:13:0x007b, B:15:0x0083, B:17:0x008d, B:19:0x00aa, B:28:0x00bf, B:29:0x00e6, B:31:0x00ec, B:32:0x00fc, B:34:0x012e, B:36:0x0134, B:37:0x013a, B:38:0x013c, B:41:0x0142, B:45:0x014c, B:46:0x014d, B:47:0x0159, B:58:0x017c, B:60:0x018d, B:61:0x0194, B:65:0x01a2, B:66:0x01b4, B:67:0x01b6, B:70:0x01bc, B:72:0x01c0, B:73:0x01c2, B:76:0x01c8, B:80:0x01cf, B:81:0x01d0, B:83:0x01d4, B:84:0x01fb, B:86:0x01ff, B:87:0x0204, B:92:0x0211, B:54:0x0162, B:55:0x016e, B:56:0x016f, B:57:0x017b, B:74:0x01c3, B:75:0x01c7, B:68:0x01b7, B:69:0x01bb), top: B:95:0x003d, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0204 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #2 {all -> 0x00b3, blocks: (B:7:0x003d, B:9:0x0045, B:11:0x0062, B:13:0x007b, B:15:0x0083, B:17:0x008d, B:19:0x00aa, B:28:0x00bf, B:29:0x00e6, B:31:0x00ec, B:32:0x00fc, B:34:0x012e, B:36:0x0134, B:37:0x013a, B:38:0x013c, B:41:0x0142, B:45:0x014c, B:46:0x014d, B:47:0x0159, B:58:0x017c, B:60:0x018d, B:61:0x0194, B:65:0x01a2, B:66:0x01b4, B:67:0x01b6, B:70:0x01bc, B:72:0x01c0, B:73:0x01c2, B:76:0x01c8, B:80:0x01cf, B:81:0x01d0, B:83:0x01d4, B:84:0x01fb, B:86:0x01ff, B:87:0x0204, B:92:0x0211, B:54:0x0162, B:55:0x016e, B:56:0x016f, B:57:0x017b, B:74:0x01c3, B:75:0x01c7, B:68:0x01b7, B:69:0x01bb), top: B:95:0x003d, inners: #8, #9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x01d4, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.camera.core.impl.p0 p0Var;
        x0.c cVarC;
        switch (this.f14069a) {
            case 0:
                x xVar = this.f14070b;
                Context context = this.f14074f;
                Executor executor = this.f14071c;
                int i14 = this.f14073e;
                androidx.concurrent.futures.b.a aVar = this.f14075g;
                long j8 = this.f14072d;
                Object obj = x.f14087r;
                Trace.beginSection(ce.a.d("CX:initAndRetryRecursively"));
                Context contextA = j0.f.a(context);
                try {
                    try {
                        androidx.camera.core.impl.j0.a aVarU = xVar.f14091c.U();
                        if (aVarU == null) {
                            throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                        }
                        androidx.camera.core.impl.g gVar = new androidx.camera.core.impl.g(xVar.f14092d, xVar.f14093e);
                        t tVarT = xVar.f14091c.T();
                        long jV = xVar.f14091c.V();
                        c3.c cVarX = xVar.f14091c.X();
                        if (cVarX == null) {
                            throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                        }
                        xVar.f14097i = cVarX.a(contextA);
                        androidx.camera.core.internal.b bVar = new androidx.camera.core.internal.b(xVar.f14097i, null);
                        xVar.f14098j = bVar;
                        try {
                            xVar.f14095g = aVarU.a(contextA, gVar, tVarT, jV, xVar.f14091c, bVar);
                            androidx.camera.core.impl.i0.a aVarW = xVar.f14091c.W();
                            if (aVarW == null) {
                                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                            }
                            v.h0 h0VarA = aVarW.a(contextA, xVar.f14095g.a(), xVar.f14095g.e());
                            xVar.f14096h = h0VarA;
                            androidx.camera.core.internal.b bVar2 = xVar.f14098j;
                            bVar2.getClass();
                            bVar2.f5916c = h0VarA;
                            if (executor instanceof o) {
                                ((o) executor).a(xVar.f14095g);
                            }
                            xVar.f14089a.d(xVar.f14095g);
                            z.a aVarF = xVar.f14095g.f();
                            aVarF.getClass();
                            xVar.f14099k = new v(xVar.f14089a, aVarF, xVar.f14097i, xVar.f14098j);
                            Iterator<androidx.camera.core.impl.l0> it = xVar.f14089a.c().iterator();
                            while (it.hasNext()) {
                                it.next().c().u(xVar.f14099k);
                            }
                            xVar.f14102n.e(xVar.f14095g, xVar.f14089a);
                            androidx.camera.core.impl.o0 o0Var = xVar.f14102n;
                            androidx.camera.core.impl.i0 i0Var = xVar.f14096h;
                            o0Var.getClass();
                            i0Var.getClass();
                            o0Var.f5673i.add(i0Var);
                            androidx.camera.core.impl.o0 o0Var2 = xVar.f14102n;
                            z.a aVarF2 = xVar.f14095g.f();
                            o0Var2.getClass();
                            aVarF2.getClass();
                            o0Var2.f5673i.add(aVarF2);
                            CameraValidator.a(contextA, xVar.f14089a, tVarT);
                            if (i14 > 1 && ce.a.b()) {
                                ce.a.c(-1, "CX:CameraProvider-RetryStatus");
                            }
                            synchronized (xVar.f14090b) {
                                xVar.f14103o = x.a.INITIALIZED;
                                break;
                            }
                            aVar.b(null);
                            Trace.endSection();
                            return;
                        } catch (InitializationException e4) {
                            e = e4;
                            contextA = contextA;
                            p0Var = new androidx.camera.core.impl.p0(j8, i14, e);
                            cVarC = xVar.f14100l.c(p0Var);
                            if (ce.a.b()) {
                                ce.a.c(p0Var.f5680a, "CX:CameraProvider-RetryStatus");
                            }
                            xVar.f14102n.d();
                            if (cVarC.f14119b || i14 >= Integer.MAX_VALUE) {
                                synchronized (xVar.f14090b) {
                                    xVar.f14103o = x.a.INITIALIZING_ERROR;
                                    break;
                                }
                                if (cVarC.f14120c) {
                                    synchronized (xVar.f14090b) {
                                        xVar.f14103o = x.a.INITIALIZED;
                                        break;
                                    }
                                    aVar.b(null);
                                } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                                    aVar.d(new InitializationException(new CameraUnavailableException(3, "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount())));
                                } else if (e instanceof InitializationException) {
                                    aVar.d(e);
                                } else {
                                    aVar.d(new InitializationException(e));
                                }
                            } else {
                                SystemClock.elapsedRealtime();
                                xVar.f14093e.postDelayed(new w(xVar, executor, j8, i14, contextA, aVar), "retry_token", cVarC.f14118a);
                            }
                        } catch (CameraValidator.CameraIdListIncorrectException e14) {
                            e = e14;
                            contextA = contextA;
                            p0Var = new androidx.camera.core.impl.p0(j8, i14, e);
                            cVarC = xVar.f14100l.c(p0Var);
                            if (ce.a.b()) {
                                ce.a.c(p0Var.f5680a, "CX:CameraProvider-RetryStatus");
                            }
                            xVar.f14102n.d();
                            if (cVarC.f14119b) {
                                synchronized (xVar.f14090b) {
                                    xVar.f14103o = x.a.INITIALIZING_ERROR;
                                    if (cVarC.f14120c) {
                                        synchronized (xVar.f14090b) {
                                            xVar.f14103o = x.a.INITIALIZED;
                                            aVar.b(null);
                                        }
                                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                                        aVar.d(new InitializationException(new CameraUnavailableException(3, "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount())));
                                    } else if (e instanceof InitializationException) {
                                        aVar.d(e);
                                    } else {
                                        aVar.d(new InitializationException(e));
                                    }
                                }
                            } else {
                                synchronized (xVar.f14090b) {
                                    xVar.f14103o = x.a.INITIALIZING_ERROR;
                                    if (cVarC.f14120c) {
                                        synchronized (xVar.f14090b) {
                                            xVar.f14103o = x.a.INITIALIZED;
                                            aVar.b(null);
                                        }
                                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                                        aVar.d(new InitializationException(new CameraUnavailableException(3, "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount())));
                                    } else if (e instanceof InitializationException) {
                                        aVar.d(e);
                                    } else {
                                        aVar.d(new InitializationException(e));
                                    }
                                }
                            }
                        } catch (RuntimeException e15) {
                            e = e15;
                            contextA = contextA;
                            p0Var = new androidx.camera.core.impl.p0(j8, i14, e);
                            cVarC = xVar.f14100l.c(p0Var);
                            if (ce.a.b()) {
                                ce.a.c(p0Var.f5680a, "CX:CameraProvider-RetryStatus");
                            }
                            xVar.f14102n.d();
                            if (cVarC.f14119b) {
                                synchronized (xVar.f14090b) {
                                    xVar.f14103o = x.a.INITIALIZING_ERROR;
                                    if (cVarC.f14120c) {
                                        synchronized (xVar.f14090b) {
                                            xVar.f14103o = x.a.INITIALIZED;
                                            aVar.b(null);
                                        }
                                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                                        aVar.d(new InitializationException(new CameraUnavailableException(3, "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount())));
                                    } else if (e instanceof InitializationException) {
                                        aVar.d(e);
                                    } else {
                                        aVar.d(new InitializationException(e));
                                    }
                                }
                            } else {
                                synchronized (xVar.f14090b) {
                                    xVar.f14103o = x.a.INITIALIZING_ERROR;
                                    if (cVarC.f14120c) {
                                        synchronized (xVar.f14090b) {
                                            xVar.f14103o = x.a.INITIALIZED;
                                            aVar.b(null);
                                        }
                                    } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                                        aVar.d(new InitializationException(new CameraUnavailableException(3, "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount())));
                                    } else if (e instanceof InitializationException) {
                                        aVar.d(e);
                                    } else {
                                        aVar.d(new InitializationException(e));
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (InitializationException e16) {
                    e = e16;
                } catch (CameraValidator.CameraIdListIncorrectException e17) {
                    e = e17;
                } catch (RuntimeException e18) {
                    e = e18;
                }
                break;
            default:
                x xVar2 = this.f14070b;
                Executor executor2 = this.f14071c;
                long j14 = this.f14072d;
                int i15 = this.f14073e;
                Context context2 = this.f14074f;
                androidx.concurrent.futures.b.a aVar2 = this.f14075g;
                Object obj2 = x.f14087r;
                executor2.execute(new w(xVar2, context2, executor2, i15 + 1, aVar2, j14));
                return;
        }
    }

    public /* synthetic */ w(x xVar, Executor executor, long j8, int i14, Context context, androidx.concurrent.futures.b.a aVar) {
        this.f14070b = xVar;
        this.f14071c = executor;
        this.f14072d = j8;
        this.f14073e = i14;
        this.f14074f = context;
        this.f14075g = aVar;
    }
}
