package com.huawei.agconnect.apms;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.agconnect.apms.anr.NativeHandler;
import com.huawei.agconnect.apms.log.AgentLog;

/* JADX INFO: loaded from: classes2.dex */
public final class efg implements Runnable {
    public final /* synthetic */ Context abc;
    public final /* synthetic */ hij bcd;

    public final class abc implements Runnable {
        public abc() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NativeHandler.efg == null) {
                NativeHandler.efg = new NativeHandler();
            }
            NativeHandler nativeHandler = NativeHandler.efg;
            boolean z = efg.this.bcd.efg;
            nativeHandler.getClass();
            NativeHandler.abc(z);
        }
    }

    public efg(Context context, hij hijVar) {
        this.abc = context;
        this.bcd = hijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        try {
            Agent.setImpl(new fgh(this.abc, this.bcd));
            if (Agent.isDisabled()) {
                fgh.klm.info("APMS has been disabled.");
                return;
            }
            AgentLog agentLog = com.huawei.agconnect.apms.anr.abc.bcd;
            com.huawei.agconnect.apms.anr.abc.bcd.abc.getClass();
            synchronized (h.class) {
                if (h.fgh == null) {
                    h.fgh = new h();
                }
                hVar = h.fgh;
            }
            hVar.abc(this.bcd.efg);
            new Handler(Looper.getMainLooper()).post(new abc());
            m0.cde.nop();
            Agent.start();
        } catch (Throwable th) {
            AgentLog agentLog2 = fgh.klm;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("failed to initialize APMS: ");
            sbAbc.append(th.toString());
            agentLog2.error(sbAbc.toString());
        }
    }
}
