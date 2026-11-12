package com.huawei.health.ecologydevice.fitness;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.AbstractCommand;
import com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeExtendedSingleData;
import com.huawei.health.ecologydevice.fitness.factory.RopeDataFactory;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.coq;
import defpackage.egx;
import defpackage.ehm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public class RopeDataQueues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseRopeData f6494c;
    private boolean e;
    private ExtendHandler f;
    private RopeDataListener g;
    private long h;
    private long j;
    private Queue<BaseRopeData> i = new ConcurrentLinkedQueue();
    private Queue<AbstractCommand> d = new ConcurrentLinkedQueue();

    public interface RopeDataListener {
        void onResult(byte[] bArr, boolean z);
    }

    public RopeDataQueues(long j, long j2) {
        this.j = j == 0 ? 1000L : j;
        this.f6492a = j2 == 0 ? 500L : j2;
        this.f = HandlerCenter.b(new c(), "BleMessageQueues");
    }

    public void c(int[] iArr, String str) {
        if (iArr == null) {
            return;
        }
        if (this.f6494c == null) {
            RopeDataFactory ropeDataFactoryC = ehm.c(str);
            if (ropeDataFactoryC == null) {
                LogUtil.a("BleMessageQueues", "ropeDataFactory is null");
                return;
            }
            this.f6494c = ropeDataFactoryC.createRopeData(5, 1, false);
        }
        BaseRopeData baseRopeData = this.f6494c;
        if (baseRopeData == null) {
            LogUtil.a("BleMessageQueues", "baseRopeData is null");
            return;
        }
        baseRopeData.setPara(iArr);
        LogUtil.a("BleMessageQueues", "sendRealTimeData paras = ", Arrays.toString(iArr));
        LogUtil.a("BleMessageQueues", "isBlockRealTimeData ", Boolean.valueOf(this.e), " queue size ", Integer.valueOf(this.i.size()));
        if (this.e || this.i.size() >= 1 || this.f6493b) {
            return;
        }
        this.e = true;
        this.h = System.currentTimeMillis();
        this.f.sendEmptyMessage(1, this.j);
    }

    public void b(int i, int i2, int[] iArr, String str) {
        if (c(i, i2, iArr)) {
            boolean z = Math.abs(System.currentTimeMillis() - this.h) >= 200;
            if (i == 5 && i2 == 0 && this.e && z) {
                LogUtil.a("BleMessageQueues", "abandoned heart rate message");
                return;
            }
            RopeDataFactory ropeDataFactoryC = ehm.c(str);
            if (ropeDataFactoryC == null) {
                LogUtil.a("BleMessageQueues", "ropeDataFactory is null");
                return;
            }
            BaseRopeData baseRopeDataCreateRopeData = ropeDataFactoryC.createRopeData(i, i2, true);
            if (baseRopeDataCreateRopeData == null) {
                LogUtil.a("BleMessageQueues", "baseRopeData is null");
                return;
            }
            baseRopeDataCreateRopeData.setPara(iArr);
            this.i.add(baseRopeDataCreateRopeData);
            LogUtil.a("BleMessageQueues", "sendDelayMessage command ", Integer.valueOf(i), " code ", Integer.valueOf(i2), " paras ", Arrays.toString(iArr), " QUEUE length ", Integer.valueOf(this.i.size()), "isSubPackageMessageSending = ", Boolean.valueOf(this.f6493b));
            if (this.i.size() != 1 || this.f6493b) {
                return;
            }
            this.f.sendEmptyMessage(2, this.f6492a);
        }
    }

    public void b(RopeDataListener ropeDataListener) {
        this.g = ropeDataListener;
    }

    public void c() {
        this.f6494c = null;
        this.i.clear();
        this.d.clear();
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
            this.f.quit(false);
        }
    }

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                RopeDataQueues.this.a();
                return true;
            }
            if (i == 2) {
                RopeDataQueues.this.d();
                return true;
            }
            if (i != 3) {
                return false;
            }
            RopeDataQueues.this.b(message);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.i.isEmpty()) {
            LogUtil.a("queue is empty", new Object[0]);
            return;
        }
        BaseRopeData baseRopeDataPoll = this.i.poll();
        if (baseRopeDataPoll == null) {
            LogUtil.a("ropeData is null", new Object[0]);
        } else {
            c(baseRopeDataPoll);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        this.f.removeMessages(1);
        this.f.removeMessages(2);
        Bundle data = message.getData();
        boolean z = data != null ? data.getBoolean("commandType") : false;
        AbstractCommand abstractCommandPoll = this.d.poll();
        RopeDataListener ropeDataListener = this.g;
        if (ropeDataListener != null && abstractCommandPoll != null) {
            ropeDataListener.onResult(abstractCommandPoll.toByteArray(), z);
        }
        if (this.d.size() <= 0) {
            this.e = false;
            this.h = 0L;
            this.f6493b = false;
            b();
            return;
        }
        this.f.sendMessage(a(z), this.f6492a);
    }

    private void c(BaseRopeData baseRopeData) {
        if (baseRopeData == null) {
            LogUtil.a("BleMessageQueues", "ropeData is null");
            return;
        }
        LogUtil.a("BleMessageQueues", "handleBleMessage opCommand: " + baseRopeData.getCommand());
        if (baseRopeData instanceof RopeExtendedSingleData) {
            byte[] heartRateByteArray = ((RopeExtendedSingleData) baseRopeData).getHeartRateByteArray();
            RopeDataListener ropeDataListener = this.g;
            if (ropeDataListener != null) {
                ropeDataListener.onResult(heartRateByteArray, baseRopeData.isRopeConfigCommand());
            }
            b();
            return;
        }
        List<AbstractCommand> listE = e(baseRopeData);
        if (!coq.d(listE) && listE.size() == 1) {
            byte[] byteArray = listE.get(0).toByteArray();
            RopeDataListener ropeDataListener2 = this.g;
            if (ropeDataListener2 != null) {
                ropeDataListener2.onResult(byteArray, baseRopeData.isRopeConfigCommand());
            }
            b();
            return;
        }
        this.d.addAll(listE);
        if (this.d.size() > 1) {
            this.f6493b = true;
            this.f.sendMessage(a(baseRopeData.isRopeConfigCommand()));
        }
    }

    private void b() {
        LogUtil.a("BleMessageQueues", "queue size is ", Integer.valueOf(this.i.size()));
        if (this.i.size() > 0) {
            this.f.sendEmptyMessage(2, this.f6492a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        BaseRopeData baseRopeData = this.f6494c;
        if (baseRopeData == null) {
            this.e = false;
            this.h = 0L;
            return;
        }
        c(baseRopeData);
        if (this.f6493b) {
            return;
        }
        this.e = false;
        this.h = 0L;
    }

    private Message a(boolean z) {
        Message message = new Message();
        message.what = 3;
        Bundle bundle = new Bundle();
        bundle.putBoolean("commandType", z);
        message.setData(bundle);
        return message;
    }

    private List<AbstractCommand> e(BaseRopeData baseRopeData) {
        ArrayList arrayList = new ArrayList();
        egx transmitCommand = baseRopeData.getTransmitCommand();
        if (transmitCommand == null) {
            LogUtil.a("BleMessageQueues", "getRopeConfigCommands ropeConfigCommand is null");
            return arrayList;
        }
        return transmitCommand.b();
    }

    private boolean c(int i, int i2, int[] iArr) {
        LogUtil.a("BleMessageQueues", "verifyingData opCode " + i2);
        if (i > 255 || i < 0) {
            LogUtil.a("BleMessageQueues", "verifyingData, invalid opCommand!");
            return false;
        }
        if (i2 > 255 || i2 < 0) {
            LogUtil.a("BleMessageQueues", "verifyingData, invalid opcode!");
            return false;
        }
        if (iArr != null) {
            return true;
        }
        LogUtil.a("BleMessageQueues", "verifyingData, invalid para!");
        return false;
    }
}
