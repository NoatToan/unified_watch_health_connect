package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public final class xmz {
    private volatile String f;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static xmz f53175c = new xmz();
    private int j = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53177b = -1;
    private boolean h = false;
    private BlockingQueue<xna> e = new ArrayBlockingQueue(256);
    private a g = new a();
    private boolean i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f53176a = false;

    private xmz() {
        Log.i("AppLogManager", "AppLogManager onCreate");
    }

    public static xmz b() {
        return f53175c;
    }

    public boolean b(xna xnaVar) {
        return this.e.offer(xnaVar);
    }

    class a extends Thread {
        public a() {
            super.setName("PrintWorker");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            xmz xmzVar = xmz.this;
            synchronized (xmz.d) {
                try {
                    xnh.a(xmzVar.j, xmzVar.f, xmzVar.f53177b, true);
                } catch (IOException unused) {
                    Log.i("AppLogManager", "LogWrite init IOException");
                }
                a(xmzVar);
            }
            Log.i("AppLogManager", "PrintWoker end.");
            xnh.a("I", "AppLogManager", "PrintWoker end.", (Throwable) null);
            xnh.b();
            xmz.this.i = false;
        }

        private void a(xmz xmzVar) {
            while (xmzVar.i) {
                try {
                    if (xmz.this.h) {
                        xna xnaVar = (xna) xmzVar.e.poll();
                        if (xnaVar != null) {
                            xnh.a(xnaVar.c(), xnaVar.e(), xnaVar.a(), (Throwable) null);
                            xnh.b();
                        } else {
                            Log.i("AppLogManager", "PrintWoker poll timeout , shutdown");
                            xnh.b();
                            xna xnaVar2 = (xna) xmzVar.e.take();
                            xnh.a(xnaVar2.c(), xnaVar2.e(), xnaVar2.a(), (Throwable) null);
                            xnh.b();
                        }
                    } else {
                        xna xnaVar3 = (xna) xmzVar.e.poll(60L, TimeUnit.SECONDS);
                        if (xnaVar3 != null) {
                            xnh.a(xnaVar3.c(), xnaVar3.e(), xnaVar3.a(), (Throwable) null);
                        } else {
                            Log.i("AppLogManager", "PrintWoker poll timeout , shutdown");
                            xnh.a("I", "AppLogManager", "PrintWoker poll timeout , shutdown", (Throwable) null);
                            xnh.b();
                            xna xnaVar4 = (xna) xmzVar.e.take();
                            xnh.a(xnaVar4.c(), xnaVar4.e(), xnaVar4.a(), (Throwable) null);
                        }
                    }
                } catch (Error unused) {
                    Log.i("AppLogManager", "PrintWoker Error");
                    return;
                } catch (InterruptedException unused2) {
                    Log.i("AppLogManager", "PrintWoker InterruptedException");
                    return;
                } catch (Exception unused3) {
                    Log.i("AppLogManager", "PrintWoker IllegalMonitorStateException");
                    return;
                }
            }
        }
    }
}
