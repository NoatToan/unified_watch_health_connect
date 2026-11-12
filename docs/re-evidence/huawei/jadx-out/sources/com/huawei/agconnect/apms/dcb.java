package com.huawei.agconnect.apms;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import com.huawei.agconnect.apms.collect.model.event.fps.FpsDropEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class dcb implements Printer {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();
    public boolean abc;
    public final HandlerThread bcd;
    public long cde;
    public final abc def;
    public final bcd efg;

    public final class abc extends Handler {
        public abc(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            long j = data.getLong("frame_start");
            long j2 = data.getLong("frame_end");
            long j3 = j2 - j;
            dcb.fgh.debug("Fps drop cost: " + j3);
            pon.cde.add(new FpsDropEvent(dcb.this.efg.abc(j, j2), j3, j2));
        }
    }

    public static final class bcd implements Runnable {
        public final Handler abc;
        public final AtomicBoolean bcd = new AtomicBoolean(false);
        public final LinkedHashMap<Long, String> cde = new LinkedHashMap<>();
        public String def;

        public bcd(abc abcVar) {
            this.abc = abcVar;
        }

        public final ArrayList abc(long j, long j2) {
            ArrayList arrayList = new ArrayList();
            synchronized (this.cde) {
                for (Long l : this.cde.keySet()) {
                    if (l.longValue() >= j && l.longValue() <= j2) {
                        arrayList.add(l + System.lineSeparator() + this.cde.get(l));
                    }
                }
            }
            return arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append(System.lineSeparator());
            }
            synchronized (this.cde) {
                if (this.cde.size() == 20) {
                    LinkedHashMap<Long, String> linkedHashMap = this.cde;
                    linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                }
                if (!TextUtils.equals(this.def, sb.toString())) {
                    this.cde.put(Long.valueOf(System.currentTimeMillis()), sb.toString());
                    this.def = sb.toString();
                }
            }
            if (this.bcd.get()) {
                this.abc.postDelayed(this, 300L);
            }
        }
    }

    public dcb() {
        HandlerThread handlerThread = new HandlerThread("FrameTrace");
        this.bcd = handlerThread;
        handlerThread.start();
        abc abcVar = new abc(handlerThread.getLooper());
        this.def = abcVar;
        this.efg = new bcd(abcVar);
    }

    public final void abc() {
        bcd bcdVar = this.efg;
        if (bcdVar.abc == null) {
            fgh.warn("stopTrace, stackHandler == null");
        } else if (bcdVar.bcd.get()) {
            bcdVar.bcd.set(false);
            bcdVar.abc.removeCallbacks(bcdVar);
            bcdVar.def = null;
        }
        HandlerThread handlerThread = this.bcd;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (!this.abc) {
            this.abc = true;
            this.cde = System.currentTimeMillis();
            bcd bcdVar = this.efg;
            if (bcdVar.abc == null) {
                fgh.warn("startTrace, stackHandler == null");
                return;
            } else {
                if (bcdVar.bcd.get()) {
                    return;
                }
                bcdVar.bcd.set(true);
                bcdVar.abc.postDelayed(bcdVar, 32L);
                return;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.cde;
        if (j != 0 && jCurrentTimeMillis - j > Agent.getAgentConfiguration().ijk) {
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putLong("frame_start", this.cde);
            bundle.putLong("frame_end", jCurrentTimeMillis);
            messageObtain.setData(bundle);
            this.def.sendMessage(messageObtain);
        }
        this.abc = false;
        bcd bcdVar2 = this.efg;
        if (bcdVar2.abc == null) {
            fgh.warn("stopTrace, stackHandler == null");
        } else if (bcdVar2.bcd.get()) {
            bcdVar2.bcd.set(false);
            bcdVar2.abc.removeCallbacks(bcdVar2);
            bcdVar2.def = null;
        }
    }
}
