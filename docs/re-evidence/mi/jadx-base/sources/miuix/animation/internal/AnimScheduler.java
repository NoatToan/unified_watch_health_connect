package miuix.animation.internal;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.Folme;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.utils.LinkNode;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
class AnimScheduler {

    @Deprecated
    static final int MSG_CLEAN = 5;

    @Deprecated
    static final int MSG_RUN = 3;

    @Deprecated
    static final int MSG_SET_TO = 4;

    @Deprecated
    static final int MSG_TO = 1;

    @Deprecated
    static final int MSG_UPDATE = 2;
    protected final FolmeEngine mEngine;
    private volatile boolean mEngineStart;
    protected boolean mHasTaskStackRunning;
    private volatile boolean mStart;
    protected HashMap<Integer, Boolean> mAnimTaskSchedMap = null;
    private final Set<IAnimTarget> mOneShotTargets = new HashSet();
    protected final Set<IAnimTarget> mRunningTarget = new HashSet();
    protected final Map<IAnimTarget, AnimOperationInfo> mOpMap = new ConcurrentHashMap();
    protected final Map<IAnimTarget, TransitionInfo> mPrepareTransMap = new HashMap();
    private final List<TransitionInfo> mTempSetupInfoList = new ArrayList();
    private final List<AnimTask> mTaskStackList = new ArrayList();
    private final List<IAnimTarget> mPreDelTargetList = new ArrayList();
    private final List<TransitionInfo> mTransListForRun = new ArrayList();
    private final List<AnimTask> mAnimTaskForRun = new ArrayList();
    private final List<TransitionInfo> mTempTargetRunningInfo = new ArrayList();
    public Handler handler = null;
    public final AtomicInteger runningStackCount = new AtomicInteger();
    private int mRunningAnimCount = 0;
    private long mTotalTNanos = 0;
    private int mFrameCount = 0;
    private final int[] mTaskStackSplitInfo = new int[2];
    public final long runnerThreadId = Thread.currentThread().getId();

    public static class SetToInfo {
        AnimState state;
        IAnimTarget target;
    }

    public AnimScheduler(FolmeEngine folmeEngine) {
        this.mEngine = folmeEngine;
    }

    private <T extends LinkNode> void addToMap(IAnimTarget iAnimTarget, T t, Map<IAnimTarget, T> map) {
        T t2 = map.get(iAnimTarget);
        if (t2 == null) {
            map.put(iAnimTarget, t);
        } else {
            t2.addToTail(t);
        }
    }

    private void assignAnimTaskToStack(List<AnimTask> list, int i, int i2) {
        for (AnimTask animTask : list) {
            if (this.mTaskStackList.isEmpty()) {
                this.mTaskStackList.add(animTask);
                if (animTask.next != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("warning!! first task of first stack has next task!! ");
                    sb.append(animTask);
                    sb.append(" next:");
                    sb.append(animTask.next);
                    animTask.next = null;
                }
            } else if (this.mTaskStackList.size() == 1) {
                AnimTask animTask2 = this.mTaskStackList.get(0);
                int animCountOfTaskStack = AnimTask.getAnimCountOfTaskStack(animTask2);
                if (LogUtils.isLogMainEnabled()) {
                    LogUtils.debug("+++ assignAnimTaskToStack-> firstStackCount " + animCountOfTaskStack, new Object[0]);
                }
                if (animCountOfTaskStack + animTask.getAnimCount() > 4000) {
                    this.mTaskStackList.add(animTask);
                } else {
                    animTask2.addToTail(animTask);
                }
            } else {
                Pair<AnimTask, Integer> minAnimCountOfOtherStack = getMinAnimCountOfOtherStack();
                if (LogUtils.isLogMainEnabled()) {
                    LogUtils.debug("+++ assignAnimTaskToStack-> minAnimCountStackInfo.min " + minAnimCountOfOtherStack.second, new Object[0]);
                }
                AnimTask animTask3 = (AnimTask) minAnimCountOfOtherStack.first;
                int iIntValue = ((Integer) minAnimCountOfOtherStack.second).intValue();
                if (this.mTaskStackList.size() > i2 - 1 || iIntValue + animTask.getAnimCount() <= i) {
                    animTask3.addToTail(animTask);
                } else {
                    this.mTaskStackList.add(animTask);
                }
            }
        }
    }

    private static void changeRunningPropertyOp(UpdateInfo updateInfo, AnimOperationInfo animOperationInfo, AnimStats animStats, AnimStats animStats2, IAnimTarget iAnimTarget, AnimConfig animConfig) {
        byte b2 = updateInfo.animInfo.op;
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        if (zIsLogMoreEnable) {
            List<FloatProperty> list = animOperationInfo.propList;
            LogUtils.debug(" |---- before step1 changeRunningPropertyOp doOp " + (list == null || list.contains(updateInfo.property)) + " update.property=" + updateInfo.property, new Object[0]);
        }
        if (!AnimTask.isRunning(b2) || animOperationInfo.op == 0) {
            return;
        }
        List<FloatProperty> list2 = animOperationInfo.propList;
        if (list2 == null || list2.contains(updateInfo.property)) {
            if (zIsLogMoreEnable) {
                LogUtils.debug(" |---- step1 changeRunningPropertyOp " + updateInfo.property.getName() + "'s op=" + ((int) b2) + " to opInfo.op=" + ((int) animOperationInfo.op), new Object[0]);
            }
            animOperationInfo.usedCount++;
            byte b3 = animOperationInfo.op;
            if (b3 == 3) {
                animStats.endCount++;
                animStats2.endCount++;
                updateInfo.skipToTargetValue(iAnimTarget);
                if (animConfig.isFocusPropertyForComplete(updateInfo.property)) {
                    animStats.focusEndCount++;
                    animStats2.focusEndCount++;
                }
            } else if (b3 == 4) {
                animStats.cancelCount++;
                animStats2.cancelCount++;
                if (animConfig.isFocusPropertyForComplete(updateInfo.property)) {
                    animStats.focusCount--;
                    animStats2.focusCount--;
                }
            }
            updateInfo.setOp(animOperationInfo.op);
            TransitionInfo.decreasePrepareCountForDelayAnim(animStats, animStats2, updateInfo, b2);
            if (zIsLogMoreEnable) {
                LogUtils.debug("----- changeRunningPropertyOp finish update.animInfo.op=" + ((int) b2), "opInfo=" + animOperationInfo, "task-stats=" + animStats);
            }
        }
    }

    private void doOperationForTarget(AnimOperationInfo animOperationInfo) {
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        ArrayList<TransitionInfo> arrayList = new ArrayList();
        IAnimTarget iAnimTarget = animOperationInfo.target;
        iAnimTarget.animManager.addToTransitionInfoList(arrayList);
        for (TransitionInfo transitionInfo : arrayList) {
            if (zIsLogMoreEnable) {
                LogUtils.debug("-- doOperationForTarget -> update transInfo " + transitionInfo, new Object[0]);
            }
            if (animOperationInfo != null && transitionInfo.startTime > animOperationInfo.sendTime) {
                animOperationInfo = null;
            }
            AnimStats infoAnimStats = transitionInfo.getInfoAnimStats();
            if (infoAnimStats.isStarted()) {
                doOperationForUpdateInfoList(transitionInfo, animOperationInfo, infoAnimStats, transitionInfo.updateList);
            }
            if (!infoAnimStats.isRunning()) {
                int i = (animOperationInfo == null || animOperationInfo.op != 4) ? 3 : 4;
                int i2 = infoAnimStats.focusCount;
                if (i2 > 0 && i2 == infoAnimStats.focusEndCount) {
                    i = 3;
                }
                if (zIsLogMoreEnable) {
                    LogUtils.debug("--- notifyTransitionEndOrCancel from doOperationForTarget msg=" + i + ":" + transitionInfo, new Object[0]);
                }
                if (i == 3) {
                    if (zIsLogMoreEnable) {
                        LogUtils.debug("--- notifyTransitionUpdate before notifyTransitionEnd from doOperationForTarget", new Object[0]);
                    }
                    iAnimTarget.animManager.notifyTransitionUpdate(transitionInfo, transitionInfo.updateListForNotify);
                }
                iAnimTarget.animManager.notifyTransitionEndOrCancel(transitionInfo, 2, i);
            }
            if (zIsLogMoreEnable) {
                String str = "-- doOperationForTarget , id=" + transitionInfo.id;
                Object[] objArr = new Object[7];
                objArr[0] = "key=" + transitionInfo.key;
                objArr[1] = "targetOpInfo=" + animOperationInfo;
                objArr[2] = "info.startTime=" + transitionInfo.startTime;
                StringBuilder sb = new StringBuilder();
                sb.append("targetOpInfo.time=");
                sb.append(animOperationInfo != null ? Long.valueOf(animOperationInfo.sendTime) : null);
                objArr[3] = sb.toString();
                objArr[4] = "statsFromInfo.isRunning=" + infoAnimStats.isRunning();
                objArr[5] = "statsFromInfo=" + infoAnimStats;
                objArr[6] = "target=" + iAnimTarget;
                LogUtils.debug(str, objArr);
            }
        }
    }

    private void doOperationForUpdateInfoList(TransitionInfo transitionInfo, AnimOperationInfo animOperationInfo, AnimStats animStats, List<UpdateInfo> list) {
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        boolean z = transitionInfo.state == 2;
        for (AnimTask animTask : transitionInfo.animTasks) {
            int i = animTask.startPos;
            int animCount = animTask.getAnimCount() + i;
            while (i < animCount) {
                UpdateInfo updateInfo = list.get(i);
                if (updateInfo != null) {
                    boolean zHandleSetToPropertyOnUpdate = handleSetToPropertyOnUpdate(updateInfo, animTask.animStats, animStats);
                    if (zIsLogMoreEnable) {
                        LogUtils.debug(" |---- step0", "doSetTo " + zHandleSetToPropertyOnUpdate, updateInfo);
                    }
                    if (animOperationInfo != null && z && !zHandleSetToPropertyOnUpdate) {
                        changeRunningPropertyOp(updateInfo, animOperationInfo, animTask.animStats, animStats, transitionInfo.target, transitionInfo.config);
                        if (zIsLogMoreEnable) {
                            LogUtils.debug(" |---- step2 changeRunningPropertyOp finish taskInfo " + animTask.info, new Object[0]);
                        }
                    }
                }
                i++;
            }
        }
    }

    private void endEngine() {
        boolean zIsLogMainEnabled = LogUtils.isLogMainEnabled();
        if (zIsLogMainEnabled) {
            LogUtils.debug("-- endEngine Scheduler@" + hashCode(), new Object[0]);
        }
        this.mRunningTarget.clear();
        if (zIsLogMainEnabled) {
            LogUtils.debug("-- endEngine after mRunningTarget.clear()", new Object[0]);
        }
        if (this.mStart) {
            if (zIsLogMainEnabled) {
                LogUtils.debug("-- endEngine", "frames=" + this.mFrameCount, "total_time_ms=" + (this.mTotalTNanos / FolmeCore.NANOS_TO_MS), "Scheduler@" + hashCode());
            }
            this.mStart = false;
            this.mEngineStart = false;
            this.mTotalTNanos = 0L;
            this.mFrameCount = 0;
            this.mEngine.end();
        }
    }

    private Pair<AnimTask, Integer> getMinAnimCountOfOtherStack() {
        int i = Integer.MAX_VALUE;
        AnimTask animTask = null;
        for (int i2 = 1; i2 < this.mTaskStackList.size(); i2++) {
            AnimTask animTask2 = this.mTaskStackList.get(i2);
            int animCountOfTaskStack = AnimTask.getAnimCountOfTaskStack(animTask2);
            if (animCountOfTaskStack < i) {
                animTask = animTask2;
                i = animCountOfTaskStack;
            }
        }
        return new Pair<>(animTask, Integer.valueOf(i));
    }

    private static boolean handleSetToPropertyOnUpdate(UpdateInfo updateInfo, AnimStats animStats, AnimStats animStats2) {
        if (!AnimValueUtils.handleSetToValue(updateInfo)) {
            return false;
        }
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        if (AnimTask.isRunning(updateInfo.animInfo.op)) {
            if (zIsLogMoreEnable) {
                LogUtils.debug("----- setToPropertyOnUpdate start updateInfo p=" + updateInfo.property, "id=" + updateInfo.hashCode(), "op=" + ((int) updateInfo.animInfo.op), updateInfo);
            }
            animStats.cancelCount++;
            animStats2.cancelCount++;
            updateInfo.setOp((byte) 4);
            TransitionInfo.decreasePrepareCountForDelayAnim(animStats, animStats2, updateInfo, updateInfo.animInfo.op);
            if (zIsLogMoreEnable) {
                LogUtils.debug("----- setToPropertyOnUpdate finish updateInfo p=" + updateInfo.property, "id=" + updateInfo.hashCode(), "op=" + ((int) updateInfo.animInfo.op), "task-stats.cancelCount " + animStats.cancelCount, "info-stats.cancelCount " + animStats2.cancelCount, updateInfo);
            }
        }
        return true;
    }

    private boolean prepareWaitTransAfterUpdated(IAnimTarget iAnimTarget) {
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        if (zIsLogMoreEnable) {
            LogUtils.debug("--- update->prepareWaitTransAfterUpdated " + iAnimTarget, new Object[0]);
        }
        TransitionInfo transitionInfoPoll = iAnimTarget.animManager.mWaitState.poll();
        if (transitionInfoPoll == null || !iAnimTarget.animManager.prepareAnim(transitionInfoPoll, true)) {
            if (zIsLogMoreEnable) {
                LogUtils.debug("--- update->prepareWaitTransAfterUpdated return false " + transitionInfoPoll, new Object[0]);
            }
            return false;
        }
        addToMap(transitionInfoPoll.target, transitionInfoPoll, this.mPrepareTransMap);
        if (zIsLogMoreEnable) {
            LogUtils.debug("--- update->prepareWaitTransAfterUpdated return true " + transitionInfoPoll, new Object[0]);
        }
        return true;
    }

    private void releaseIdleOneShotTargetAfterRun() {
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        if (zIsLogMoreEnable) {
            LogUtils.debug("--- releaseIdleOneShotTargetAfterRun", new Object[0]);
        }
        Set<IAnimTarget> oneShotTargets = this.mEngine.getOneShotTargets();
        if (oneShotTargets.isEmpty()) {
            return;
        }
        ArrayList<IAnimTarget> arrayList = null;
        for (IAnimTarget iAnimTarget : oneShotTargets) {
            if (iAnimTarget.isIdle()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iAnimTarget);
            }
        }
        if (arrayList != null) {
            for (IAnimTarget iAnimTarget2 : arrayList) {
                if (zIsLogMoreEnable) {
                    LogUtils.debug(" |--- clean idle oneshot target " + iAnimTarget2, new Object[0]);
                }
                if (iAnimTarget2.hasFlags(1L)) {
                    removeFromOneShot(iAnimTarget2);
                }
                Folme.clean(iAnimTarget2);
            }
        }
    }

    private void setup() {
        if (LogUtils.isLogMainEnabled()) {
            LogUtils.debug("--- setup prepareTrans.size=" + this.mPrepareTransMap.size() + " runningTarget.size=" + this.mRunningTarget.size() + " Scheduler@" + hashCode(), new Object[0]);
        }
        for (TransitionInfo transitionInfo : this.mPrepareTransMap.values()) {
            if (LogUtils.isLogMainEnabled()) {
                LogUtils.debug("---- setupAllInfoToTarget-> " + transitionInfo, new Object[0]);
            }
            this.mRunningTarget.add(transitionInfo.target);
            this.mTempSetupInfoList.add(transitionInfo);
        }
        this.mPrepareTransMap.clear();
        for (int i = 0; i < this.mTempSetupInfoList.size(); i++) {
            TransitionInfo.setupAllInfoToTarget(this.mTempSetupInfoList.get(i));
        }
        this.mTempSetupInfoList.clear();
    }

    private void startEngine() {
        if (LogUtils.isLogMainEnabled()) {
            LogUtils.debug("-- startEngine mEngineStart=" + this.mEngineStart + " Scheduler@" + hashCode(), new Object[0]);
        }
        if (this.mEngineStart) {
            return;
        }
        this.mEngineStart = true;
        this.mEngine.start();
    }

    private boolean updateTarget(IAnimTarget iAnimTarget, List<TransitionInfo> list) {
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        iAnimTarget.animManager.addToTransitionInfoList(list);
        if (zIsLogMoreEnable) {
            LogUtils.debug("--- update->updateTarget start transList " + list.size() + " " + iAnimTarget, new Object[0]);
        }
        AnimOperationInfo animOperationInfo = this.mOpMap.get(iAnimTarget);
        int i = 0;
        int i2 = 0;
        for (TransitionInfo transitionInfo : list) {
            if (zIsLogMoreEnable) {
                LogUtils.debug("--- update->updateTarget-> update transInfo " + transitionInfo, new Object[0]);
            }
            if (transitionInfo.state == 0) {
                i2++;
                if (zIsLogMoreEnable) {
                    LogUtils.debug("---- update->updateTarget-> this info isInfoOnPrepare runCount " + i2, new Object[0]);
                }
            } else {
                if (animOperationInfo != null && transitionInfo.startTime > animOperationInfo.sendTime) {
                    i++;
                    animOperationInfo = null;
                }
                AnimStats infoAnimStats = transitionInfo.getInfoAnimStats();
                if (infoAnimStats.isStarted()) {
                    updateTransInfo(transitionInfo, animOperationInfo, infoAnimStats);
                }
                if (zIsLogMoreEnable) {
                    LogUtils.debug("---- update->updateTarget after updateTransInfo " + infoAnimStats, new Object[0]);
                }
                if (infoAnimStats.isRunning()) {
                    i2++;
                } else {
                    int i3 = infoAnimStats.cancelCount > infoAnimStats.endCount ? 4 : 3;
                    int i4 = infoAnimStats.focusCount;
                    if (i4 > 0 && i4 == infoAnimStats.focusEndCount) {
                        if (zIsLogMoreEnable) {
                            LogUtils.debug("--- transitionComplete by focus end all info.id=" + transitionInfo.id, new Object[0]);
                        }
                        for (int i5 = 0; i5 < transitionInfo.updateListForNotify.size(); i5++) {
                            UpdateInfo updateInfo = transitionInfo.updateListForNotify.get(i5);
                            if (updateInfo != null && !updateInfo.isCompleted) {
                                updateInfo.skipToTargetValue(iAnimTarget);
                            }
                        }
                        i3 = 3;
                    }
                    if (zIsLogMoreEnable) {
                        LogUtils.debug("--- notifyTransitionEndOrCancel from updateTarget msg=" + i3 + ":" + transitionInfo, new Object[0]);
                        LogUtils.debug("--- notifyTransitionUpdate before notifyTransitionEndOrCancel from updateTarget", new Object[0]);
                    }
                    iAnimTarget.animManager.notifyTransitionUpdate(transitionInfo, transitionInfo.updateListForNotify);
                    iAnimTarget.animManager.notifyTransitionEndOrCancel(transitionInfo, 2, i3);
                }
                if (zIsLogMoreEnable) {
                    String str = "--- update->after handleUpdate , id=" + transitionInfo.id;
                    Object[] objArr = new Object[9];
                    objArr[0] = "key=" + transitionInfo.key;
                    objArr[1] = "runCount=" + i2;
                    objArr[2] = "animStartAfterCancel=" + i;
                    objArr[3] = "targetOpInfo=" + animOperationInfo;
                    objArr[4] = "info.startTime=" + transitionInfo.startTime;
                    StringBuilder sb = new StringBuilder();
                    sb.append("targetOpInfo.time=");
                    sb.append(animOperationInfo != null ? Long.valueOf(animOperationInfo.sendTime) : null);
                    objArr[5] = sb.toString();
                    objArr[6] = "statsFromInfo.isRunning=" + infoAnimStats.isRunning();
                    objArr[7] = "statsFromInfo=" + infoAnimStats;
                    objArr[8] = "target=" + iAnimTarget;
                    LogUtils.debug(str, objArr);
                }
            }
        }
        if (animOperationInfo != null && (i == list.size() || animOperationInfo.isUsed())) {
            this.mOpMap.remove(iAnimTarget);
        }
        list.clear();
        if (zIsLogMoreEnable) {
            LogUtils.debug("--- update->updateTarget finish runCount=" + i2, new Object[0]);
        }
        return i2 > 0;
    }

    private void updateTransInfo(TransitionInfo transitionInfo, AnimOperationInfo animOperationInfo, AnimStats animStats) {
        if (animStats == null) {
            animStats = transitionInfo.getInfoAnimStats();
        }
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        if (zIsLogMoreEnable) {
            LogUtils.debug("---- updateTransInfo start " + transitionInfo + " opInfo:" + animOperationInfo, new Object[0]);
        }
        boolean z = transitionInfo.state == 2;
        doOperationForUpdateInfoList(transitionInfo, animOperationInfo, animStats, transitionInfo.updateList);
        if (!animStats.isRunning() || animStats.updateCount <= 0) {
            if (transitionInfo.updateListForNotify.isEmpty()) {
                transitionInfo.updateListForNotify.addAll(transitionInfo.updateList);
                return;
            }
            return;
        }
        if (zIsLogMoreEnable) {
            LogUtils.debug("---- updateTransInfo finish " + transitionInfo, new Object[0]);
        }
        if (!z || (!transitionInfo.hasSendNotifyStart && !transitionInfo.hasOnStart)) {
            if (zIsLogMoreEnable) {
                LogUtils.debug("---- notifyTransitionBegin from updateTransInfo: " + transitionInfo, new Object[0]);
            }
            transitionInfo.target.animManager.notifyTransitionBegin(transitionInfo, transitionInfo.updateList, true);
            return;
        }
        if (zIsLogMoreEnable) {
            LogUtils.debug("---- notifyTransitionUpdate from updateTransInfo:" + transitionInfo, new Object[0]);
        }
        List<UpdateInfo> list = transitionInfo.updateList;
        if (list == null || list.isEmpty()) {
            if (zIsLogMoreEnable) {
                LogUtils.debug("---- notifyTransitionUpdate fail updateList is empty " + transitionInfo, new Object[0]);
                return;
            }
            return;
        }
        List<UpdateInfo> list2 = transitionInfo.updateListForNotify;
        if (transitionInfo.target.shouldCheckValue()) {
            List<UpdateInfo> list3 = transitionInfo.updateList;
            list2.clear();
            for (UpdateInfo updateInfo : list3) {
                if (updateInfo.animInfo.op > 1 && updateInfo.animInfo.op < 6 && AnimValueUtils.isValid(updateInfo.animInfo.value)) {
                    list2.add(updateInfo);
                }
            }
            if (!list2.isEmpty() && zIsLogMoreEnable) {
                LogUtils.debug("---- notifyTransitionUpdate withCheckValue info.id=" + transitionInfo.id, "info.key=" + transitionInfo.key, "updateList.size=" + list2.size());
            }
        } else {
            list2.addAll(transitionInfo.updateList);
        }
        transitionInfo.target.animManager.notifyTransitionUpdate(transitionInfo, list2);
    }

    public void addToOneShot(IAnimTarget iAnimTarget) {
        this.mOneShotTargets.add(iAnimTarget);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: doAnimationFrame, reason: merged with bridge method [inline-methods] */
    public final void lambda$executeDoAnimOnFrame$2(long j, long j2) {
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        if (LogUtils.isLogMainEnabled()) {
            LogUtils.debug(String.format("++ doAnimationFrame: deltaTNanos=%d Scheduler@%s", Long.valueOf(j2), Integer.valueOf(hashCode())), new Object[0]);
        }
        setup();
        if (zIsLogMoreEnable) {
            LogUtils.debug(String.format("++ doAnimationFrame: |-> after setup: mRunningTarget.size=%s", Integer.valueOf(this.mRunningTarget.size())), new Object[0]);
        }
        if (!this.mRunningTarget.isEmpty()) {
            long averageDeltaNanos = AndroidEngine.getInst().getAverageDeltaNanos();
            if (zIsLogMoreEnable) {
                LogUtils.debug(String.format("++ doAnimationFrame: |--> hasRunningTarget mStart=%s mHasTaskStackRunning=%s ", Boolean.valueOf(this.mStart), Boolean.valueOf(this.mHasTaskStackRunning)), new Object[0]);
            }
            if (!this.mStart) {
                this.mStart = true;
                this.mTotalTNanos = 0L;
                this.mFrameCount = 0;
            }
            runAnimTaskOnFrame(j, j2, averageDeltaNanos);
        }
        releaseIdleOneShotTargetAfterRun();
    }

    public final void execute(Runnable runnable) {
        if (isInMainThread(Thread.currentThread().getId())) {
            runnable.run();
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(runnable);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("execute warning!! this scheduler has no handler");
        sb.append(LogUtils.getStackTrace(8));
        runnable.run();
    }

    public void executeDoAnimOnFrame(final long j, final long j2) {
        if (isInMainThread(Thread.currentThread().getId())) {
            lambda$executeDoAnimOnFrame$2(j, j2);
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: miuix.animation.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26274a.lambda$executeDoAnimOnFrame$2(j, j2);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("executeOnFrame warning!! this scheduler has no handler");
        sb.append(LogUtils.getStackTrace(8));
        lambda$executeDoAnimOnFrame$2(j, j2);
    }

    public void executeNotifyTransitionBegin(final TransitionInfo transitionInfo) {
        if (LogUtils.isLogMainEnabled()) {
            LogUtils.debug("----- TaskStackRunner before update : notifyTransitionBegin ", new Object[0]);
        }
        if (isInMainThread(Thread.currentThread().getId())) {
            lambda$executeNotifyTransitionBegin$3(transitionInfo);
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: miuix.animation.internal.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26272a.lambda$executeNotifyTransitionBegin$3(transitionInfo);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("executeNotifyTransitionBegin warning!! this scheduler has no handler");
        sb.append(LogUtils.getStackTrace(8));
        lambda$executeNotifyTransitionBegin$3(transitionInfo);
    }

    @Deprecated
    public void executePendingSetTo(IAnimTarget iAnimTarget, AnimState animState) {
        final SetToInfo setToInfo = new SetToInfo();
        setToInfo.target = iAnimTarget;
        if (animState.needDuplicate) {
            AnimState animState2 = new AnimState();
            setToInfo.state = animState2;
            animState2.set(animState);
        } else {
            setToInfo.state = animState;
        }
        Handler handler = this.handler;
        if (handler == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("executeSetTo warning!! this scheduler has no handler, so direct run executePendingSetTo(info)");
            sb.append(LogUtils.getStackTrace(8));
        }
        if (isInMainThread(Thread.currentThread().getId()) || handler == null) {
            pendingSetTo(setToInfo);
        } else {
            handler.post(new Runnable() { // from class: miuix.animation.internal.AnimScheduler.1
                @Override // java.lang.Runnable
                public void run() {
                    AnimScheduler.this.pendingSetTo(setToInfo);
                }
            });
        }
    }

    public void executeTo(final TransitionInfo transitionInfo) {
        if (LogUtils.isLogDetailEnable()) {
            LogUtils.debug("++ executeTo", new Object[0]);
        }
        if (transitionInfo.config.delay > 0) {
            if (this.handler != null) {
                if (LogUtils.isLogMainEnabled()) {
                    LogUtils.debug("-- to with delay Scheduler@" + hashCode() + " " + transitionInfo, new Object[0]);
                }
                this.handler.postDelayed(new Runnable() { // from class: miuix.animation.internal.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26277a.lambda$executeTo$0(transitionInfo);
                    }
                }, transitionInfo.config.delay);
                return;
            }
            return;
        }
        if (isInMainThread(Thread.currentThread().getId())) {
            lambda$executeTo$1(transitionInfo);
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: miuix.animation.internal.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26279a.lambda$executeTo$1(transitionInfo);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("executeTo warning!! this scheduler has no handler, so direct run to(info)");
        sb.append(LogUtils.getStackTrace(8));
        lambda$executeTo$1(transitionInfo);
    }

    public void executeUpdate() {
        if (LogUtils.isLogDetailEnable()) {
            LogUtils.debug("-- executeUpdate", new Object[0]);
        }
        if (isInMainThread(Thread.currentThread().getId())) {
            update();
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: miuix.animation.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26276a.update();
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("executeUpdate warning!! this scheduler has no handler");
        sb.append(LogUtils.getStackTrace(8));
        update();
    }

    public Set<IAnimTarget> getOneShotTargets() {
        return this.mOneShotTargets;
    }

    public int getTotalRunningTransitionCount() {
        Iterator it = new HashSet(this.mRunningTarget).iterator();
        int runningTransitionCount = 0;
        while (it.hasNext()) {
            runningTransitionCount += ((IAnimTarget) it.next()).animManager.getRunningTransitionCount();
        }
        return runningTransitionCount;
    }

    public final boolean isInMainThread(long j) {
        return this.runnerThreadId == j;
    }

    /* JADX INFO: renamed from: notifyTransitionBegin, reason: merged with bridge method [inline-methods] */
    public final void lambda$executeNotifyTransitionBegin$3(TransitionInfo transitionInfo) {
        transitionInfo.target.animManager.notifyTransitionBegin(transitionInfo, transitionInfo.updateList, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Deprecated
    public final void pendingSetTo(SetToInfo setToInfo) {
        boolean zIsLogMainEnabled = LogUtils.isLogMainEnabled();
        IAnimTarget iAnimTarget = setToInfo.target;
        if (zIsLogMainEnabled) {
            LogUtils.debug("-- setTo Scheduler@" + hashCode() + " " + setToInfo + " " + iAnimTarget, new Object[0]);
        }
        AnimState animState = setToInfo.state;
        setToInfo.target.animManager.setTo(animState, null);
        Iterator<Object> it = animState.keySet().iterator();
        while (it.hasNext()) {
            FloatProperty property = animState.getProperty(iAnimTarget, it.next());
            UpdateInfo updateInfo = iAnimTarget.animManager.mUpdateMap.get(property);
            if (updateInfo != null) {
                double d = animState.get(iAnimTarget, property);
                if (zIsLogMainEnabled) {
                    LogUtils.debug("-- setTo setToValue=" + d + " " + property + " toState " + animState, new Object[0]);
                }
                AnimInfo animInfo = updateInfo.animInfo;
                animInfo.startValue = d;
                animInfo.setToValue = d;
                boolean z = updateInfo.useInt;
                if (z && (property instanceof IIntValueProperty)) {
                    iAnimTarget.doSetIntValue((IIntValueProperty) property, updateInfo.getIntValue());
                } else {
                    if (z) {
                        LogUtils.debug("-- setTo Warning!! the property is " + property, new Object[0]);
                    }
                    iAnimTarget.doSetValue(property, updateInfo.getFloatValue());
                }
            }
        }
        if (zIsLogMainEnabled) {
            LogUtils.debug("-- setTo done " + iAnimTarget, new Object[0]);
        }
    }

    public void removeFromOneShot(IAnimTarget iAnimTarget) {
        this.mOneShotTargets.remove(iAnimTarget);
    }

    public void runAnimTaskOnFrame(long j, long j2, long j3) {
        HashSet hashSet = new HashSet(this.mRunningTarget);
        this.mTotalTNanos += j2;
        if (j2 > 0) {
            this.mFrameCount++;
        }
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        if (LogUtils.isLogMainEnabled()) {
            LogUtils.debug("+++ runAnimTaskOnFrame start frameCount=" + this.mFrameCount + " nowNanos=" + j + " deltaTNanos=" + j2 + " averageDelta=" + j3 + " Scheduler@" + hashCode(), new Object[0]);
        }
        this.mRunningAnimCount = 0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((IAnimTarget) it.next()).animManager.addToTransitionInfoList(this.mTransListForRun);
        }
        for (TransitionInfo transitionInfo : this.mTransListForRun) {
            this.mRunningAnimCount += transitionInfo.getAnimCount();
            TransitionInfo.tickOnFrame(transitionInfo, j3);
            this.mAnimTaskForRun.addAll(transitionInfo.animTasks);
        }
        boolean zIsEmpty = this.mTransListForRun.isEmpty();
        this.mTransListForRun.clear();
        ThreadPoolUtil.getSplitCount(Math.max(0, this.mRunningAnimCount - 4000), this.mTaskStackSplitInfo);
        int[] iArr = this.mTaskStackSplitInfo;
        assignAnimTaskToStack(this.mAnimTaskForRun, iArr[1], iArr[0]);
        this.mAnimTaskForRun.clear();
        this.mHasTaskStackRunning = !this.mTaskStackList.isEmpty();
        this.runningStackCount.getAndAdd(this.mTaskStackList.size());
        if (zIsLogMoreEnable) {
            LogUtils.debug("+++ runAnimTaskOnFrame mTaskStackList.size " + this.mTaskStackList.size(), new Object[0]);
        }
        double d = j3 / 1.0E9d;
        if (this.mHasTaskStackRunning) {
            AnimTask animTask = this.mTaskStackList.get(0);
            if (this.mTaskStackList.size() > 1) {
                for (int i = 1; i < this.mTaskStackList.size(); i++) {
                    AnimTask.asyncStart(this.mTaskStackList.get(i), this, this.mTotalTNanos, j2, 1, d);
                }
            }
            AnimTask.start(animTask, this, this.mTotalTNanos, j2, 1, d);
            this.mTaskStackList.clear();
        }
        if (zIsLogMoreEnable) {
            LogUtils.debug(String.format("--- runAnimTaskOnFrame finish isAllTransFinish:%s mHasTaskStackRunning:%s", Boolean.valueOf(zIsEmpty), Boolean.valueOf(this.mHasTaskStackRunning)), new Object[0]);
        }
        if (this.mHasTaskStackRunning) {
            this.mEngineStart = false;
            this.mEngine.waitForAllTaskFinish();
        } else if (zIsEmpty) {
            if (zIsLogMoreEnable) {
                LogUtils.debug("--- runAnimTaskOnFrame->endEngine: no transList then endEngine", new Object[0]);
            }
            endEngine();
        }
    }

    public void setOperation(AnimOperationInfo animOperationInfo) {
        if (animOperationInfo.target.isAnimRunning(new FloatProperty[0])) {
            animOperationInfo.sendTime = System.nanoTime();
            if (this.mHasTaskStackRunning) {
                this.mOpMap.put(animOperationInfo.target, animOperationInfo);
                LogUtils.isLogMainEnabled();
            } else {
                LogUtils.isLogMainEnabled();
                doOperationForTarget(animOperationInfo);
            }
        }
    }

    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void lambda$executeTo$1(TransitionInfo transitionInfo) {
        boolean zIsLogMainEnabled = LogUtils.isLogMainEnabled();
        if (zIsLogMainEnabled) {
            LogUtils.debug("-- to Scheduler@" + hashCode() + " " + transitionInfo, new Object[0]);
        }
        if (transitionInfo != null) {
            addToMap(transitionInfo.target, transitionInfo, this.mPrepareTransMap);
            if (this.mHasTaskStackRunning) {
                return;
            }
            if (zIsLogMainEnabled) {
                LogUtils.debug("-- to->startEngine", new Object[0]);
            }
            startEngine();
        }
    }

    public final void update() {
        boolean zIsLogMoreEnable = LogUtils.isLogMoreEnable();
        if (zIsLogMoreEnable) {
            LogUtils.debug("-- update from runningStackCount == 0 frameCount=" + this.mFrameCount + " Scheduler@" + hashCode(), new Object[0]);
        }
        this.mRunningAnimCount = 0;
        boolean z = false;
        for (IAnimTarget iAnimTarget : new HashSet(this.mRunningTarget)) {
            if (updateTarget(iAnimTarget, this.mTempTargetRunningInfo) || prepareWaitTransAfterUpdated(iAnimTarget)) {
                z = true;
            } else {
                this.mPreDelTargetList.add(iAnimTarget);
            }
            if (LogUtils.isLogMainEnabled()) {
                this.mRunningAnimCount += iAnimTarget.animManager.getTotalAnimCount();
            }
        }
        this.mHasTaskStackRunning = false;
        if (!this.mPreDelTargetList.isEmpty()) {
            this.mRunningTarget.removeAll(this.mPreDelTargetList);
            this.mPreDelTargetList.clear();
        }
        if (LogUtils.isLogMainEnabled()) {
            LogUtils.debug("-- update after traversal all target", "mRunningAnimCount=" + this.mRunningAnimCount, "mPrepareTransMap.size=" + this.mPrepareTransMap.size(), "mRunningTarget.size=" + this.mRunningTarget.size());
        }
        boolean z2 = !this.mPrepareTransMap.isEmpty();
        boolean z3 = !this.mRunningTarget.isEmpty();
        if (!z2 && !z3) {
            if (z) {
                return;
            }
            if (zIsLogMoreEnable) {
                LogUtils.debug("-- update->endEngine when isRunning is false", new Object[0]);
            }
            endEngine();
            return;
        }
        if (zIsLogMoreEnable) {
            LogUtils.debug("-- update finish->startEngine hasPrepareTrans:" + z2 + " hasRunningTarget:" + z3, new Object[0]);
        }
        startEngine();
    }
}
