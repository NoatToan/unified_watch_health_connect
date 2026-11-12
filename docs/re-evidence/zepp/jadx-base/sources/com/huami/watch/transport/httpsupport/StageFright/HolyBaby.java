package com.huami.watch.transport.httpsupport.StageFright;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.TaskManager;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class HolyBaby extends DataItem {
    public static final String ACTION_OF_HOLY_BOARD = "_holy_";
    public static final String EXTRA_OF_GRADLE = "gradle";
    public static final String EXTRA_OF_TARGET = "target";
    public static final String OWNER_OF_HOLY_BOARD = "_holy_board";
    private ConcurrentLinkedQueue<String> l;
    private String m;

    public class a implements Comparator<String> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            Long lC = HolyBaby.this.c(str);
            Long lC2 = HolyBaby.this.c(str2);
            if (lC.longValue() > lC2.longValue()) {
                return 1;
            }
            return lC == lC2 ? 0 : -1;
        }
    }

    public HolyBaby() {
        super(null, ACTION_OF_HOLY_BOARD, OWNER_OF_HOLY_BOARD, "get");
        addExtraPair(EXTRA_OF_GRADLE, "");
        setIdentifier(System.currentTimeMillis() + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long c(String str) {
        long j = 0L;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        String[] strArrSplit = str.split("_");
        try {
            return Long.valueOf((strArrSplit == null || strArrSplit.length < 2 || TextUtils.isEmpty(strArrSplit[1])) ? String.valueOf(Long.MIN_VALUE) : strArrSplit[1]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    private String[] d(String[] strArr) {
        Arrays.sort(strArr, new a());
        return strArr;
    }

    public static HolyBaby from(DataItem dataItem) {
        HolyBaby holyBaby = new HolyBaby();
        holyBaby.setIdentifier(dataItem.getIdentifier());
        holyBaby.addExtraPair(EXTRA_OF_GRADLE, dataItem.getExtraValByKey(EXTRA_OF_GRADLE));
        holyBaby.addExtraPair("target", dataItem.trackWho());
        holyBaby.withParent(dataItem.trackWho());
        return holyBaby;
    }

    public static HashSet<HolyBaby> zygoteAddAndFillHomeWorkAndKickToFly(Context context, ProcessStateMonitor processStateMonitor, ConcurrentHashMap<String, ConcurrentLinkedQueue<String>> concurrentHashMap, TaskManager taskManager) {
        String str;
        HashSet<HolyBaby> hashSet = new HashSet<>();
        for (String str2 : concurrentHashMap.keySet()) {
            if (TextUtils.isEmpty(str2)) {
                str = "空的===================== target DROPped !!!!!!!!!!!!!!!!!!!!!";
            } else {
                String str3 = str2.split(UpdateUtils.CMD_FILTER)[0];
                String strTargetAtPackage = processStateMonitor.targetAtPackage();
                if (TextUtils.equals(strTargetAtPackage, "*") || TextUtils.equals(str3, strTargetAtPackage)) {
                    Log.i(GlobalDefine.TAG_SERIAL_MODE, "*****OK GO --> 接纳了 who ： " + str2);
                    HolyBaby holyBaby = new HolyBaby();
                    holyBaby.withParent(str2);
                    hashSet.add(holyBaby);
                    holyBaby.fillHomeWork(context, concurrentHashMap.get(str2));
                    HolyBoard.getInstance(context).addBaby(holyBaby);
                    processStateMonitor.addNewHolyWho2Queque(str2);
                } else {
                    str = "注意！！！ 111 忽略了 不关心的who ： " + str2 + " , 只关心： " + strTargetAtPackage;
                }
            }
            Log.i(GlobalDefine.TAG_SERIAL_MODE, str);
        }
        if (!TextUtils.isEmpty(processStateMonitor.pollHolyParentTarget())) {
            HolyBoard.getInstance(context).kickToFly(taskManager, processStateMonitor, processStateMonitor.pollHolyParentTarget());
        }
        return hashSet;
    }

    @Override // com.huami.watch.transport.httpsupport.model.DataItem
    public void addExtraPair(String str, String str2) {
        super.addExtraPair(str, str2);
        if (TextUtils.equals(str, EXTRA_OF_GRADLE)) {
            lookupAllHomeWork();
        }
    }

    public int calculateTaskNum() {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.l;
        if (concurrentLinkedQueue == null) {
            return 0;
        }
        return concurrentLinkedQueue.size();
    }

    public void fillHomeWork(Context context, ConcurrentLinkedQueue<String> concurrentLinkedQueue) {
        String[] strArr = (String[]) concurrentLinkedQueue.toArray(new String[0]);
        d(strArr);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strArr) {
            stringBuffer.append(str + UpdateUtils.CMD_FILTER);
        }
        addExtraPair(EXTRA_OF_GRADLE, stringBuffer.toString());
        DataCacher.getInstance(context).save(this);
    }

    public boolean finishHomeWork(Context context, String str) {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.l;
        if (concurrentLinkedQueue == null) {
            return true;
        }
        String strPeek = concurrentLinkedQueue.peek();
        if (!TextUtils.equals(strPeek, str)) {
            if (GlobalDefine.DEBUG_SERIAL_MODE) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "作业没对上！！！： check " + strPeek + " --> against " + str);
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "作业没对上！！！： check " + strPeek + " --> against " + str);
            return false;
        }
        this.l.poll();
        DataCacher.getInstance(context).save(this);
        if (GlobalDefine.DEBUG_SERIAL_MODE) {
            Log.i(GlobalDefine.TAG_SERIAL_MODE, "BABY : " + getIdentifier() + " 完成了作业 ==> " + str);
        }
        SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "BABY : " + getIdentifier() + " 完成了作业 ==> " + str);
        return true;
    }

    public boolean hasMoreHomeWork() {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.l;
        return (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) ? false : true;
    }

    public ConcurrentLinkedQueue<String> lookupAllHomeWork() {
        String extraValByKey = getExtraValByKey(EXTRA_OF_GRADLE);
        if (TextUtils.isEmpty(extraValByKey)) {
            return null;
        }
        String[] strArrSplit = extraValByKey.split(UpdateUtils.CMD_FILTER);
        if (this.l == null) {
            this.l = new ConcurrentLinkedQueue<>();
        }
        for (String str : strArrSplit) {
            if (!this.l.contains(str)) {
                this.l.add(str);
            }
        }
        return this.l;
    }

    public String nextHomeWork() {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.l;
        if (concurrentLinkedQueue == null) {
            return null;
        }
        return concurrentLinkedQueue.peek();
    }

    public String parent() {
        return this.m;
    }

    @Override // com.huami.watch.transport.httpsupport.model.DataItem
    public void setOwner(String str) {
        super.setOwner(OWNER_OF_HOLY_BOARD);
    }

    public void withParent(String str) {
        this.m = str;
        addExtraPair("target", str);
    }
}
