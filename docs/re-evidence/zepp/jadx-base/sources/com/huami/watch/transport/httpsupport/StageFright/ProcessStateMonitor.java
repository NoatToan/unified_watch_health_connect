package com.huami.watch.transport.httpsupport.StageFright;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ProcessStateMonitor {
    public static final byte STATE_BEGIN_SYNC = 5;
    public static final byte STATE_FINISH_SINGINE_ROM_2_ASSIST = 4;
    public static final byte STATE_FINISH_SINGLE_UPLOAD_CLOUD = 3;
    public static final byte STATE_IDLE = 0;
    public static final byte STATE_PREPARE_REQUEST_CLOUD = 2;
    public static final byte STATE_WAITING_FOR_LAZY_GIRL = 1;
    private Jack a;
    private byte b;
    private byte c;
    private ConcurrentHashMap<String, Boolean> e;
    private HashSet<ReportListInfo> f;
    private String g;
    private long l;
    public String name;
    private int k = 0;
    private int j = 0;
    private int i = 0;
    private int h = 0;
    private ConcurrentHashMap<String, Boolean> d = new ConcurrentHashMap<>();
    private String m = null;

    public interface Jack {
        void onFinish(int i, boolean z, long j);

        void onUpdate(int i, int i2, int i3);

        String targetAtAction();

        String targetAtPackage();
    }

    public ProcessStateMonitor() {
        byte b = (byte) 0;
        this.c = b;
        this.b = b;
        this.l = System.currentTimeMillis();
        this.l = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("processor is : ");
        String str = "" + new Random().nextLong();
        this.name = str;
        sb.append(str);
        Log.i("CloudSyncMonitor", sb.toString());
    }

    private Jack a() {
        return this.a;
    }

    public void addNewHolyWho2Queque(String str) {
        this.d.put(str, Boolean.FALSE);
    }

    public void appendSumOfNeedAssist2Cloud(int i) {
        Log.i("CloudSyncMonitor", "now append sum : " + i, new Throwable());
        this.j = this.j + i;
    }

    public void appendSumOfNeedRom2Assist(int i) {
        this.k += i;
    }

    public HashSet<String> extractTargetActions() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(targetAtAction().split("\\|")));
        return hashSet;
    }

    public void finishHolyWho(String str) {
        this.d.put(str, Boolean.TRUE);
    }

    public void finishOneAssist2Cloud(DataItem dataItem) {
        if (a() == null) {
            return;
        }
        this.h++;
        Log.i("CloudSyncMonitor", this.name + " , " + targetWho() + " ==> 助手到云端 ： 总数： " + this.j + " , 已完成：" + this.h + " , item：" + dataItem.getIdentifier() + " , " + dataItem.trackWho(), new Throwable());
        this.a.onUpdate(3, this.j, this.h);
    }

    public void finishOneRom2Assist(DataItem dataItem) {
        if (a() == null) {
            return;
        }
        this.i++;
        Log.i("CloudSyncMonitor", this.name + " , " + targetWho() + " ==> ROM到助手 ： 总数： " + this.k + " , 已完成：" + this.i + " , item：" + dataItem.getIdentifier() + " , " + dataItem.trackWho());
        this.a.onUpdate(4, this.k, this.i);
    }

    public byte getCurrState() {
        return this.c;
    }

    public byte getLastState() {
        return this.b;
    }

    public String getReportId() {
        return this.g;
    }

    public HashSet<ReportListInfo> getReportListStorage() {
        if (this.f == null) {
            this.f = new HashSet<>();
        }
        return this.f;
    }

    public long getStartSyncTime() {
        return this.l;
    }

    public int getSumOfFinishedAssist2Cloud() {
        return this.h;
    }

    public void inJack(Jack jack) {
        this.a = jack;
    }

    public boolean isAllHolyFinished() {
        boolean zBooleanValue = true;
        for (Boolean bool : this.d.values()) {
            if (bool == null) {
                zBooleanValue &= false;
            }
            zBooleanValue &= bool.booleanValue();
        }
        return zBooleanValue;
    }

    public boolean isAuto() {
        return false;
    }

    public boolean newDataUploaded() {
        return this.h > 0;
    }

    public void onFeedSingleLazyGirl(Context context, DataItem dataItem) {
        if (Command.isInternal(dataItem.getAction())) {
            return;
        }
        if (this.e == null) {
            this.e = new ConcurrentHashMap<>();
        }
        if (Boolean.valueOf(this.e.containsKey(dataItem.getIdentifier())).booleanValue()) {
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, trackWho() + "arrival OUR TRAFFIC tracked : " + dataItem.getIdentifier());
            }
            finishOneRom2Assist(dataItem);
            this.e.put(dataItem.getIdentifier(), Boolean.TRUE);
        } else if (GlobalDefine.DEBUG_SERIAL_MODE) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, trackWho() + "arrival OUR TRAFFIC tracked : " + dataItem.getIdentifier() + " BUT NOT EXPECTED !");
        }
        Log.i(GlobalDefine.TAG_SERIAL_MODE, trackWho() + " ==> arrival ids 剩余量如下 \n");
        int i = 0;
        for (String str : this.e.keySet()) {
            if (!this.e.get(str).booleanValue()) {
                i++;
            }
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "arrival: " + str + " ：" + this.e.get(str) + "\n");
        }
        Log.i(GlobalDefine.TAG_SERIAL_MODE, trackWho() + " ==> arrival ids 剩余量 ： " + i);
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, trackWho() + " ==> arrival ids 剩余量 ： " + i);
        Iterator<Boolean> it2 = this.e.values().iterator();
        boolean zBooleanValue = true;
        while (it2.hasNext()) {
            zBooleanValue &= it2.next().booleanValue();
        }
        if (zBooleanValue) {
            SyncProcessManager.getInstance().tellWith(trackWho(), (byte) 7, new int[0]);
            onUpdateAssist2CloudState((byte) 2);
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                if (GlobalDefine.DEBUG_SERVER) {
                    Log.i(GlobalDefine.TAG_SRV, hashCode() + " , " + trackWho() + " arrival Traffic 数据track完成了呢！");
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, hashCode() + " , " + trackWho() + "arrival 移除掉了time out callback！");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, hashCode() + "  arrival Traffic 数据track完成了呢！");
                SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, hashCode() + "  arrival 移除掉了time out callback！");
            }
            if (GlobalDefine.DEBUG_SERVER) {
                Log.i(GlobalDefine.TAG_SRV, trackWho() + "arrival -------->>>>> 开始分析Reportlist！");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, trackWho() + "arrival -------->>>>> 开始分析 reportlist！");
            Serializer.getInstance(context).onEventOfDanceWith(this);
        }
    }

    public void onFinish(String str, int i) {
        if (!isAllHolyFinished() && i == 0) {
            Log.i("CloudSyncMonitor", this.name + ">>>>>> 调用了FINISH ' 但是还不是时候！！！！" + str);
            return;
        }
        if (a() != null) {
            this.a.onFinish(i, this.h > 0, this.l);
        }
        Log.i("CloudSyncMonitor", this.name + ">>>>>> FINISH '" + targetAtPackage() + UpdateUtils.CMD_FILTER + targetAtAction() + " OF : " + str + "' DATA SYNC ! CODE: " + i, new Throwable());
        this.i = 0;
        this.h = 0;
        this.j = 0;
        this.k = 0;
        AnalysisStage.getInstance().removeReportArrivalListener(this);
    }

    public void onReportArrival(Context context, ProcessStateMonitor processStateMonitor, DataItem dataItem) {
        Serializer.getInstance(context).onEventProcessReportItem(processStateMonitor, dataItem);
    }

    public void onUpdateAssist2CloudState(byte b) {
        if (this.a == null) {
            return;
        }
        Log.i("CloudSyncMonitor", this.name + " , " + targetWho() + " ==> 助手到云端 ： 总数： " + this.j + " , 已完成：" + this.h);
        int i = this.j;
        if (i == 0 && this.h == 0) {
            return;
        }
        this.a.onUpdate(b, i, this.h);
        this.c = b;
    }

    public void onUpdateRom2AssistState(byte b) {
        if (this.a == null) {
            return;
        }
        Log.i("CloudSyncMonitor", this.name + " , " + targetWho() + " ==> ROM到助手 ： 总数： " + this.k + " , 已完成：" + this.i);
        int i = this.k;
        if (i == 0 && this.i == 0) {
            return;
        }
        this.a.onUpdate(b, i, this.i);
        this.c = b;
    }

    public String pollHolyParentTarget() {
        for (String str : this.d.keySet()) {
            Boolean bool = this.d.get(str);
            if (bool != null && !bool.booleanValue()) {
                return str;
            }
        }
        return null;
    }

    public void setReportId(String str) {
        this.g = str;
    }

    public void setState(byte b) {
        this.b = this.c;
        this.c = b;
    }

    public void setSumOfNeedAssist2Cloud(int i) {
        this.j = i;
        this.i = 0;
    }

    public void setSumOfNeedRom2Assist(int i) {
        this.k = i;
        this.h = 0;
    }

    public void startWaitForDataItems(HashSet<String> hashSet) {
        if (this.e == null) {
            this.e = new ConcurrentHashMap<>();
        }
        Iterator<String> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            this.e.put(it2.next(), Boolean.FALSE);
        }
        for (String str : this.e.keySet()) {
            if (this.e.get(str).booleanValue()) {
                this.e.remove(str);
            }
        }
    }

    public String targetAtAction() {
        Jack jack = this.a;
        return jack == null ? "" : jack.targetAtAction();
    }

    public String targetAtPackage() {
        Jack jack = this.a;
        return jack == null ? "" : jack.targetAtPackage();
    }

    public String targetWho() {
        return trackWho();
    }

    public String trackWho() {
        if (TextUtils.isEmpty(this.m)) {
            this.m = targetAtPackage();
        }
        return this.m;
    }

    public void withStartSyncTime(long j) {
        this.l = j;
    }
}
