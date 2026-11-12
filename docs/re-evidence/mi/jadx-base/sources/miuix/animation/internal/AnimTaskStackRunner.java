package miuix.animation.internal;

import android.os.Trace;
import android.util.Log;
import defpackage.gv5;
import java.util.ArrayList;
import java.util.List;
import miuix.animation.IAnimTarget;
import miuix.animation.ValueTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimSpecialConfig;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.styles.ForegroundColorStyle;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
class AnimTaskStackRunner {
    static int INIT_RESULT_CODE_FAILED = 1;
    static int INIT_RESULT_CODE_SUCCESS = 0;
    static int INIT_RESULT_CODE_VALUE_INVALID = 2;
    private static final String SECTION_TAG = "Folme.TaskRunner_doFrame";
    static final ThreadLocal<AnimData> animDataLocal = new ThreadLocal<>();
    static final ThreadLocal<List<UpdateInfo>> tempTaskUpdateList = new ThreadLocal<List<UpdateInfo>>() { // from class: miuix.animation.internal.AnimTaskStackRunner.1
        @Override // java.lang.ThreadLocal
        public List<UpdateInfo> initialValue() {
            return new ArrayList();
        }
    };

    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:103:0x023c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0263 A[Catch: Exception -> 0x0224, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0224, blocks: (B:93:0x0221, B:104:0x0240, B:110:0x024b, B:114:0x0256, B:116:0x025c, B:119:0x0263), top: B:201:0x0221 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x029a A[Catch: Exception -> 0x02ac, TryCatch #1 {Exception -> 0x02ac, blocks: (B:121:0x0293, B:123:0x029a, B:125:0x02a6, B:128:0x02b1, B:130:0x02b7, B:132:0x02bd, B:134:0x02c3, B:138:0x02f6, B:140:0x02fd), top: B:175:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02a6 A[Catch: Exception -> 0x02ac, TryCatch #1 {Exception -> 0x02ac, blocks: (B:121:0x0293, B:123:0x029a, B:125:0x02a6, B:128:0x02b1, B:130:0x02b7, B:132:0x02bd, B:134:0x02c3, B:138:0x02f6, B:140:0x02fd), top: B:175:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02b7 A[Catch: Exception -> 0x02ac, TryCatch #1 {Exception -> 0x02ac, blocks: (B:121:0x0293, B:123:0x029a, B:125:0x02a6, B:128:0x02b1, B:130:0x02b7, B:132:0x02bd, B:134:0x02c3, B:138:0x02f6, B:140:0x02fd), top: B:175:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c3 A[Catch: Exception -> 0x02ac, TryCatch #1 {Exception -> 0x02ac, blocks: (B:121:0x0293, B:123:0x029a, B:125:0x02a6, B:128:0x02b1, B:130:0x02b7, B:132:0x02bd, B:134:0x02c3, B:138:0x02f6, B:140:0x02fd), top: B:175:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:140:0x02fd A[Catch: Exception -> 0x02ac, TRY_LEAVE, TryCatch #1 {Exception -> 0x02ac, blocks: (B:121:0x0293, B:123:0x029a, B:125:0x02a6, B:128:0x02b1, B:130:0x02b7, B:132:0x02bd, B:134:0x02c3, B:138:0x02f6, B:140:0x02fd), top: B:175:0x0293 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0344  */
    /* JADX WARN: Code duplicated, block: B:162:0x0367  */
    /* JADX WARN: Code duplicated, block: B:197:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f3 A[Catch: Exception -> 0x01cf, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01cf, blocks: (B:69:0x01d7, B:75:0x01f3, B:64:0x01cb), top: B:173:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01fb A[Catch: Exception -> 0x0233, TRY_LEAVE, TryCatch #7 {Exception -> 0x0233, blocks: (B:73:0x01e4, B:76:0x01f6, B:78:0x01fb), top: B:187:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x0263, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [miuix.animation.listener.UpdateInfo] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [miuix.animation.internal.AnimData] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v28, types: [miuix.animation.internal.AnimData] */
    /* JADX WARN: Type inference failed for: r5v32, types: [miuix.animation.internal.AnimData] */
    /* JADX WARN: Type inference failed for: r5v7, types: [miuix.animation.internal.AnimData] */
    /* JADX WARN: Type inference failed for: r5v8, types: [miuix.animation.internal.AnimData] */
    public static void doAnimationFrame(AnimTask animTask, long j, long j2, int i, double d, boolean z) {
        ?? r2;
        AnimScheduler animScheduler;
        List<UpdateInfo> list;
        AnimTask animTask2;
        String str;
        AnimTask animTask3;
        String str2;
        AnimTask animTask4;
        String str3;
        UpdateInfo updateInfo;
        int i2;
        int i3;
        String str4;
        IAnimTarget iAnimTarget;
        AnimStats animStats;
        TransitionInfo transitionInfo;
        String str5;
        ?? r0;
        int i4;
        AnimScheduler animScheduler2;
        String str6;
        TransitionInfo transitionInfo2;
        String str7;
        int i5;
        TransitionInfo transitionInfo3;
        AnimTask animTask5;
        ?? r14;
        int i6;
        AnimTask animTask6 = animTask;
        AnimScheduler animScheduler3 = animTask6.scheduler;
        if (animScheduler3 != null) {
            r2 = (AnimData) CommonUtils.getLocal(animScheduler3.mEngine.getObjPool(), animDataLocal, AnimData.class);
        } else {
            ThreadLocal<AnimData> threadLocal = animDataLocal;
            AnimData animData = threadLocal.get();
            if (animData == null) {
                animData = new AnimData();
                threadLocal.set(animData);
            }
            r2 = animData;
        }
        boolean z2 = LogUtils.isLogDetailEnable() || LogUtils.isLogFrameEnable();
        r2.logEnabled = z2;
        if (z2) {
            Trace.beginSection("Folme.TaskRunner_doFrame " + Thread.currentThread().getId());
        }
        List<UpdateInfo> list2 = tempTaskUpdateList.get();
        boolean z3 = r2.logEnabled;
        String str8 = CommonUtils.TAG;
        if (z3) {
            LogUtils.logThread(CommonUtils.TAG, "↓---- TaskRunner.run start");
        }
        int i7 = 0;
        while (animTask6 != null) {
            AnimTask animTaskRemove = animTask6.remove();
            int i8 = i7 + 1;
            try {
                AnimStats animStats2 = animTask6.animStats;
                TransitionInfo transitionInfo4 = animTask6.info;
                IAnimTarget iAnimTarget2 = transitionInfo4.target;
                animStats2.prepareOnFrameStart();
                boolean zIsNeedSetup = animStats2.isNeedSetup();
                int animCount = animTask6.getAnimCount();
                list2.clear();
                list2.addAll(transitionInfo4.updateList);
                int i9 = animTask6.startPos;
                int i10 = i9 + animCount;
                int i11 = i9;
                ?? r18 = 0;
                while (i11 < i10) {
                    UpdateInfo updateInfo2 = list2.get(i11);
                    if (updateInfo2 == null) {
                        animTask5 = animTask6;
                        animScheduler = animScheduler3;
                        list = list2;
                        i2 = i11;
                        i3 = i10;
                        transitionInfo3 = transitionInfo4;
                        iAnimTarget = iAnimTarget2;
                        animTask2 = animTaskRemove;
                        animStats = animStats2;
                        str = str8;
                    } else {
                        if (r2.logEnabled) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                list = list2;
                                try {
                                    sb.append("------ data-start: info.id=");
                                    sb.append(transitionInfo4.id);
                                    sb.append(" startImmediately=");
                                    sb.append(transitionInfo4.config.startImmediately);
                                    sb.append(String.format(", p='%s'", updateInfo2.property.getName()));
                                    sb.append(" update.op=");
                                    sb.append((int) updateInfo2.animInfo.op);
                                    sb.append(", ");
                                    sb.append(animStats2);
                                    LogUtils.logThread(str8, sb.toString());
                                } catch (Exception e) {
                                    e = e;
                                    animScheduler = animScheduler3;
                                    animTask2 = animTaskRemove;
                                    str = str8;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("---- AnimTaskStackRunner.doAnimationFrame task:");
                                    animTask3 = animTask2;
                                    sb2.append(animTask3);
                                    sb2.append(" failed: ");
                                    sb2.append(Log.getStackTraceString(e));
                                    LogUtils.logThread(str, sb2.toString());
                                    animTask6 = animTask3;
                                    str8 = str;
                                    i7 = i8;
                                    list2 = list;
                                    animScheduler3 = animScheduler;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                list = list2;
                            }
                        } else {
                            list = list2;
                        }
                        AnimSpecialConfig specialConfig = transitionInfo4.config.getSpecialConfig(updateInfo2.property.getName());
                        r2.from(updateInfo2, transitionInfo4.config, specialConfig);
                        try {
                            if (zIsNeedSetup) {
                                try {
                                    animTask4 = animTask6;
                                    str3 = ", ";
                                    updateInfo = updateInfo2;
                                    i2 = i11;
                                    i3 = i10;
                                    TransitionInfo transitionInfo5 = transitionInfo4;
                                    str4 = " update.op=";
                                    iAnimTarget = iAnimTarget2;
                                    animScheduler = animScheduler3;
                                    animTask2 = animTaskRemove;
                                    animStats = animStats2;
                                    str2 = str8;
                                    try {
                                        setup(animStats2, r2, iAnimTarget2, transitionInfo4.config, specialConfig, j, j2, transitionInfo4.key);
                                        if (r2.logEnabled) {
                                            printSetupLog(r2, iAnimTarget, transitionInfo5, animStats);
                                        }
                                        transitionInfo = transitionInfo5;
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = str2;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("---- AnimTaskStackRunner.doAnimationFrame task:");
                                        animTask3 = animTask2;
                                        sb3.append(animTask3);
                                        sb3.append(" failed: ");
                                        sb3.append(Log.getStackTraceString(e));
                                        LogUtils.logThread(str, sb3.toString());
                                        animTask6 = animTask3;
                                        str8 = str;
                                        i7 = i8;
                                        list2 = list;
                                        animScheduler3 = animScheduler;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    animScheduler = animScheduler3;
                                    animTask2 = animTaskRemove;
                                    str2 = str8;
                                }
                            } else {
                                i2 = i11;
                                animTask4 = animTask6;
                                animScheduler = animScheduler3;
                                str3 = ", ";
                                UpdateInfo updateInfo3 = updateInfo2;
                                i3 = i10;
                                animTask2 = animTaskRemove;
                                animStats = animStats2;
                                str2 = str8;
                                str4 = " update.op=";
                                transitionInfo = transitionInfo4;
                                iAnimTarget = iAnimTarget2;
                                updateInfo = updateInfo3;
                                if (r2.op == 6) {
                                    try {
                                        reuse(animStats, r2, iAnimTarget, transitionInfo.config, specialConfig, j, j2);
                                        updateInfo = updateInfo3;
                                        if (r2.logEnabled) {
                                            str5 = str2;
                                            LogUtils.logThread(str5, "++++++ data.reuse info.id=" + transitionInfo.id + String.format(", p='%s'", updateInfo3.property.getName()) + " stats=" + animStats);
                                            r0 = updateInfo3;
                                        }
                                        if (r2.op == 1) {
                                            try {
                                                start(animStats, r2, iAnimTarget, j, j2, transitionInfo);
                                                AnimInfo animInfo = r0.animInfo;
                                                i6 = r2.tintMode;
                                                animInfo.tintMode = i6;
                                                if (r0.property == ViewPropertyExt.FOREGROUND) {
                                                    ForegroundColorStyle.start(iAnimTarget, i6);
                                                }
                                                if (r2.op == 5) {
                                                    if (!transitionInfo.hasSendNotifyStart || animScheduler == null) {
                                                        animScheduler2 = animScheduler;
                                                    } else {
                                                        animScheduler2 = animScheduler;
                                                        try {
                                                            animScheduler2.executeNotifyTransitionBegin(transitionInfo);
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            animScheduler = animScheduler2;
                                                            str = str5;
                                                            StringBuilder sb4 = new StringBuilder();
                                                            sb4.append("---- AnimTaskStackRunner.doAnimationFrame task:");
                                                            animTask3 = animTask2;
                                                            sb4.append(animTask3);
                                                            sb4.append(" failed: ");
                                                            sb4.append(Log.getStackTraceString(e));
                                                            LogUtils.logThread(str, sb4.toString());
                                                            animTask6 = animTask3;
                                                            str8 = str;
                                                            i7 = i8;
                                                            list2 = list;
                                                            animScheduler3 = animScheduler;
                                                        }
                                                    }
                                                    try {
                                                        if (animStats.focusCount <= 0 && transitionInfo.config.isFocusPropertyForComplete(r0.property)) {
                                                            i4 = 1;
                                                            try {
                                                                animStats.focusCount--;
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                animScheduler = animScheduler2;
                                                                str = str5;
                                                                StringBuilder sb5 = new StringBuilder();
                                                                sb5.append("---- AnimTaskStackRunner.doAnimationFrame task:");
                                                                animTask3 = animTask2;
                                                                sb5.append(animTask3);
                                                                sb5.append(" failed: ");
                                                                sb5.append(Log.getStackTraceString(e));
                                                                LogUtils.logThread(str, sb5.toString());
                                                                animTask6 = animTask3;
                                                                str8 = str;
                                                                i7 = i8;
                                                                list2 = list;
                                                                animScheduler3 = animScheduler;
                                                            }
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        i4 = 1;
                                                    }
                                                } else {
                                                    animScheduler2 = animScheduler;
                                                }
                                                i4 = 1;
                                            } catch (Exception e8) {
                                                e = e8;
                                                i4 = 1;
                                            }
                                        } else {
                                            i4 = 1;
                                            animScheduler2 = animScheduler;
                                        }
                                        if (r2.op == 2) {
                                            try {
                                                if (!transitionInfo.hasSendNotifyStart && animScheduler2 != null) {
                                                    animScheduler2.executeNotifyTransitionBegin(transitionInfo);
                                                }
                                                if (r2.velocity == 0.0d && transitionInfo.config.startImmediately) {
                                                    r2.justStart = false;
                                                }
                                                if (r2.logEnabled) {
                                                    LogUtils.logThread(str5, "++++++ data.update start data.justStart=" + r2.justStart);
                                                }
                                                animScheduler = animScheduler2;
                                                transitionInfo2 = transitionInfo;
                                                str6 = str5;
                                                str7 = ", p='%s'";
                                                i5 = i4;
                                                try {
                                                    update(animStats, r2, iAnimTarget, j, j2, d, i, transitionInfo2);
                                                    if (r2.justEnd) {
                                                        transitionInfo3 = transitionInfo2;
                                                        if (transitionInfo3.config.isFocusPropertyForComplete(r0.property)) {
                                                            animStats.focusEndCount += i5;
                                                        }
                                                        if (r2.property == ViewPropertyExt.FOREGROUND) {
                                                            ForegroundColorStyle.end(iAnimTarget, r0);
                                                        }
                                                    } else {
                                                        transitionInfo3 = transitionInfo2;
                                                    }
                                                    if (LogUtils.isLogDesignEnable()) {
                                                        Object[] objArr = new Object[3];
                                                        objArr[0] = transitionInfo3.to.getAlias();
                                                        objArr[i5] = r0.property.getName();
                                                        objArr[2] = Double.valueOf(r2.value);
                                                        String.format("update anim:{name:\"%s\", %s:%.10f }", objArr);
                                                    }
                                                } catch (Exception e9) {
                                                    e = e9;
                                                    str = str6;
                                                    StringBuilder sb6 = new StringBuilder();
                                                    sb6.append("---- AnimTaskStackRunner.doAnimationFrame task:");
                                                    animTask3 = animTask2;
                                                    sb6.append(animTask3);
                                                    sb6.append(" failed: ");
                                                    sb6.append(Log.getStackTraceString(e));
                                                    LogUtils.logThread(str, sb6.toString());
                                                    animTask6 = animTask3;
                                                    str8 = str;
                                                    i7 = i8;
                                                    list2 = list;
                                                    animScheduler3 = animScheduler;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                animScheduler = animScheduler2;
                                                str6 = str5;
                                            }
                                        } else {
                                            animScheduler = animScheduler2;
                                            str6 = str5;
                                            transitionInfo3 = transitionInfo;
                                            str7 = ", p='%s'";
                                            i5 = i4;
                                        }
                                        r2.to(r0);
                                        if (r2.logEnabled) {
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append("------ data-end: info.id=");
                                            sb7.append(transitionInfo3.id);
                                            Object[] objArr2 = new Object[i5];
                                            try {
                                                objArr2[0] = r0.property.getName();
                                                sb7.append(String.format(str7, objArr2));
                                                sb7.append(str4);
                                                sb7.append((int) r0.animInfo.op);
                                                sb7.append(str3);
                                                sb7.append(animStats);
                                                str = str6;
                                                try {
                                                    LogUtils.logThread(str, sb7.toString());
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    StringBuilder sb8 = new StringBuilder();
                                                    sb8.append("---- AnimTaskStackRunner.doAnimationFrame task:");
                                                    animTask3 = animTask2;
                                                    sb8.append(animTask3);
                                                    sb8.append(" failed: ");
                                                    sb8.append(Log.getStackTraceString(e));
                                                    LogUtils.logThread(str, sb8.toString());
                                                    animTask6 = animTask3;
                                                    str8 = str;
                                                    i7 = i8;
                                                    list2 = list;
                                                    animScheduler3 = animScheduler;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                str = str6;
                                            }
                                        } else {
                                            str = str6;
                                        }
                                        if (z || !AnimValueUtils.isValid(r2.value)) {
                                            animTask5 = animTask4;
                                        } else {
                                            if (iAnimTarget instanceof ValueTarget) {
                                                animTask5 = animTask4;
                                                if (!animTask5.runInMainThread) {
                                                    r14 = i5;
                                                }
                                                r0.setTargetValue(iAnimTarget, r14);
                                                r18 = r14;
                                            } else {
                                                animTask5 = animTask4;
                                            }
                                            r14 = r18 == true ? 1 : 0;
                                            r0.setTargetValue(iAnimTarget, r14);
                                            r18 = r14;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        str5 = str2;
                                        str = str5;
                                        StringBuilder sb9 = new StringBuilder();
                                        sb9.append("---- AnimTaskStackRunner.doAnimationFrame task:");
                                        animTask3 = animTask2;
                                        sb9.append(animTask3);
                                        sb9.append(" failed: ");
                                        sb9.append(Log.getStackTraceString(e));
                                        LogUtils.logThread(str, sb9.toString());
                                        animTask6 = animTask3;
                                        str8 = str;
                                        i7 = i8;
                                        list2 = list;
                                        animScheduler3 = animScheduler;
                                    }
                                }
                                animTask6 = animTask3;
                                str8 = str;
                                i7 = i8;
                                list2 = list;
                                animScheduler3 = animScheduler;
                            }
                            if (r2.op == 1) {
                                start(animStats, r2, iAnimTarget, j, j2, transitionInfo);
                                AnimInfo animInfo2 = r0.animInfo;
                                i6 = r2.tintMode;
                                animInfo2.tintMode = i6;
                                if (r0.property == ViewPropertyExt.FOREGROUND) {
                                    ForegroundColorStyle.start(iAnimTarget, i6);
                                }
                                if (r2.op == 5) {
                                    if (transitionInfo.hasSendNotifyStart) {
                                        animScheduler2 = animScheduler;
                                    } else {
                                        animScheduler2 = animScheduler;
                                    }
                                    if (animStats.focusCount <= 0) {
                                    }
                                } else {
                                    animScheduler2 = animScheduler;
                                }
                                i4 = 1;
                            } else {
                                i4 = 1;
                                animScheduler2 = animScheduler;
                            }
                            if (r2.op == 2) {
                                if (!transitionInfo.hasSendNotifyStart) {
                                    animScheduler2.executeNotifyTransitionBegin(transitionInfo);
                                }
                                if (r2.velocity == 0.0d) {
                                    r2.justStart = false;
                                }
                                if (r2.logEnabled) {
                                    LogUtils.logThread(str5, "++++++ data.update start data.justStart=" + r2.justStart);
                                }
                                animScheduler = animScheduler2;
                                transitionInfo2 = transitionInfo;
                                str6 = str5;
                                str7 = ", p='%s'";
                                i5 = i4;
                                update(animStats, r2, iAnimTarget, j, j2, d, i, transitionInfo2);
                                if (r2.justEnd) {
                                    transitionInfo3 = transitionInfo2;
                                    if (transitionInfo3.config.isFocusPropertyForComplete(r0.property)) {
                                        animStats.focusEndCount += i5;
                                    }
                                    if (r2.property == ViewPropertyExt.FOREGROUND) {
                                        ForegroundColorStyle.end(iAnimTarget, r0);
                                    }
                                } else {
                                    transitionInfo3 = transitionInfo2;
                                }
                                if (LogUtils.isLogDesignEnable()) {
                                    Object[] objArr3 = new Object[3];
                                    objArr3[0] = transitionInfo3.to.getAlias();
                                    objArr3[i5] = r0.property.getName();
                                    objArr3[2] = Double.valueOf(r2.value);
                                    String.format("update anim:{name:\"%s\", %s:%.10f }", objArr3);
                                }
                            } else {
                                animScheduler = animScheduler2;
                                str6 = str5;
                                transitionInfo3 = transitionInfo;
                                str7 = ", p='%s'";
                                i5 = i4;
                            }
                            r2.to(r0);
                            if (r2.logEnabled) {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("------ data-end: info.id=");
                                sb10.append(transitionInfo3.id);
                                Object[] objArr4 = new Object[i5];
                                objArr4[0] = r0.property.getName();
                                sb10.append(String.format(str7, objArr4));
                                sb10.append(str4);
                                sb10.append((int) r0.animInfo.op);
                                sb10.append(str3);
                                sb10.append(animStats);
                                str = str6;
                                LogUtils.logThread(str, sb10.toString());
                            } else {
                                str = str6;
                            }
                            if (z) {
                                animTask5 = animTask4;
                            } else {
                                animTask5 = animTask4;
                            }
                        } catch (Exception e14) {
                            e = e14;
                        }
                        str5 = str2;
                        r0 = updateInfo;
                    }
                    i11 = i2 + 1;
                    animStats2 = animStats;
                    transitionInfo4 = transitionInfo3;
                    animTask6 = animTask5;
                    str8 = str;
                    iAnimTarget2 = iAnimTarget;
                    list2 = list;
                    i10 = i3;
                    animTaskRemove = animTask2;
                    animScheduler3 = animScheduler;
                    r18 = r18;
                }
                animScheduler = animScheduler3;
                list = list2;
                str = str8;
                animTask3 = animTaskRemove;
            } catch (Exception e15) {
                e = e15;
                animScheduler = animScheduler3;
                list = list2;
            }
            animTask6 = animTask3;
            str8 = str;
            i7 = i8;
            list2 = list;
            animScheduler3 = animScheduler;
        }
        String str9 = str8;
        if (r2.logEnabled) {
            LogUtils.logThread(str9, "↑---- TaskRunner.run finish taskCount=" + i7);
            Trace.endSection();
        }
    }

    private static void finishProperty(AnimStats animStats, AnimData animData) {
        animData.setOp((byte) 5);
        animStats.failCount++;
    }

    private static int initTask(IAnimTarget iAnimTarget, AnimData animData, long j, long j2) {
        if ((animData.property instanceof ViewPropertyExt.ForegroundProperty) && !ForegroundColorStyle.isValid(iAnimTarget, animData)) {
            animData.value = animData.targetValue;
            animData.progress = 1.0d;
            return INIT_RESULT_CODE_FAILED;
        }
        if (!setValues(animData)) {
            return INIT_RESULT_CODE_FAILED;
        }
        if (isValueInvalid(animData)) {
            animData.reset();
            animData.value = animData.startValue;
            return INIT_RESULT_CODE_VALUE_INVALID;
        }
        animData.startTime = j - j2;
        animData.frameCount = 0;
        animData.setOp((byte) 2);
        return INIT_RESULT_CODE_SUCCESS;
    }

    private static boolean isValueInvalid(AnimData animData) {
        return animData.startValue == animData.targetValue && Math.abs(animData.velocity) < 16.66666603088379d;
    }

    private static void printDelayTaskLog(AnimData animData, Object obj, long j) {
        LogUtils.logThread(CommonUtils.TAG, "++++++ data.start:check delay", "tag=" + obj + gv5.CONNECT_VALUE_STR + obj.hashCode(), String.format("p='%s'", animData.property.getName()), "delay=" + animData.delay, "op=" + ((int) animData.op), "initTime=" + animData.initTime, "totalT_ms=" + ((j * 1.0d) / 1000000.0d));
    }

    private static void printSetValueFailedLog(AnimData animData, Object obj) {
        LogUtils.logThread(CommonUtils.TAG, "++++++ data.start:setValueFailed, break", String.format("p='%s'", animData.property.getName()), "tag=" + obj + gv5.CONNECT_VALUE_STR + obj.hashCode(), "op=" + ((int) animData.op), "value=" + animData.value, "start-v=" + animData.startValue, "target-v= " + animData.targetValue);
    }

    private static void printSetupInUpdateLog(AnimData animData, IAnimTarget iAnimTarget, Object obj) {
        LogUtils.logThread(CommonUtils.TAG, "++++++ data.setup when op is update and no delay: " + String.format("p='%s'", animData.property.getName()), "tag=" + obj + gv5.CONNECT_VALUE_STR + obj.hashCode(), "value=" + animData.value, "start-v=" + animData.startValue, "target-v=" + animData.targetValue, "target=" + iAnimTarget, "ease=" + animData.ease, "progress=" + animData.progress, "velocity=" + animData.velocity, "delay=" + animData.delay, "op=" + ((int) animData.op));
    }

    private static void printSetupLog(AnimData animData, IAnimTarget iAnimTarget, TransitionInfo transitionInfo, AnimStats animStats) {
        LogUtils.logThread(CommonUtils.TAG, "++++++ data.setup: info.id=" + transitionInfo.id, String.format("p='%s'", animData.property.getName()), "tag=" + transitionInfo.key + gv5.CONNECT_VALUE_STR + transitionInfo.key.hashCode(), "value=" + animData.value, "start-v=" + animData.startValue, "target-v=" + animData.targetValue, "progress=" + animData.progress, "animStats=" + animStats, "ease=" + animData.ease, "velocity=" + animData.velocity, "delay=" + animData.delay, "op=" + ((int) animData.op), "target=" + iAnimTarget);
    }

    private static void printStartFinishLog(AnimData animData, IAnimTarget iAnimTarget, Object obj) {
        LogUtils.logThread(CommonUtils.TAG, "++++++ data.start:finish", String.format("p='%s'", animData.property.getName()), "tag=" + obj + gv5.CONNECT_VALUE_STR + obj.hashCode(), "op=" + ((int) animData.op), "value=" + animData.value, "start-v=" + animData.startValue, "target-v=" + animData.targetValue, "progress=" + animData.progress, "ease=" + animData.ease, "delay=" + animData.delay, "velocity=" + animData.velocity, "target=" + iAnimTarget);
    }

    private static void printUpdateAnimLog(AnimData animData, IAnimTarget iAnimTarget, TransitionInfo transitionInfo, double d) {
        LogUtils.logThread(CommonUtils.TAG, "------ data.update: info.id=" + transitionInfo.id, String.format("p='%s'", animData.property.getName()), "tag=" + transitionInfo.key + gv5.CONNECT_VALUE_STR + transitionInfo.key.hashCode(), "op=" + ((int) animData.op), "frame=" + animData.frameCount, "value=" + animData.value, "start-v=" + animData.startValue, "target-v=" + animData.targetValue, "value_hex=" + Integer.toHexString((int) animData.value), "delta_s=" + d, "interval=" + animData.frameInterval, "progress=" + animData.progress, "target=" + iAnimTarget, "justEnd=" + animData.justEnd, "init-t=" + animData.initTime, "start-t=" + animData.startTime, "velocity=" + animData.velocity);
    }

    private static void printValueInvalidFailedLog(AnimData animData, Object obj) {
        LogUtils.logThread(CommonUtils.TAG, "++++++ data.start:valueInvalidFailedLog, start-v equal target-v, so break", String.format("p='%s'", animData.property.getName()), "tag=" + obj + gv5.CONNECT_VALUE_STR + obj.hashCode(), "op=" + ((int) animData.op), "value=" + animData.value, "start-v=" + animData.startValue, "target-v=" + animData.targetValue, "velocity=" + animData.velocity);
    }

    public static void reuse(AnimStats animStats, AnimData animData, IAnimTarget iAnimTarget, AnimConfig animConfig, AnimSpecialConfig animSpecialConfig, long j, long j2) {
        if (AnimValueUtils.isInvalid(animData.startValue)) {
            animData.startValue = AnimValueUtils.getValue(iAnimTarget, animData.property, animData.startValue);
        }
        animData.initTime = j - j2;
        animData.setOp((byte) 1);
        int i = animStats.failCount;
        if (i > 0) {
            animStats.failCount = i - 1;
        }
        if (animStats.focusEndCount > 0 && animConfig.isFocusPropertyForComplete(animData.property)) {
            animStats.focusEndCount--;
        }
        float fromSpeed = AnimConfigUtils.getFromSpeed(animConfig, animSpecialConfig);
        if (fromSpeed != Float.MAX_VALUE) {
            animData.velocity = fromSpeed;
        }
    }

    private static void setStartData(AnimData animData) {
        animData.progress = 0.0d;
        animData.reset();
    }

    private static boolean setValues(AnimData animData) {
        if (AnimValueUtils.isValid(animData.value)) {
            if (AnimValueUtils.isInvalid(animData.startValue)) {
                animData.startValue = animData.value;
            }
            return true;
        }
        if (!AnimValueUtils.isValid(animData.startValue)) {
            return false;
        }
        animData.value = animData.startValue;
        return true;
    }

    public static void setup(AnimStats animStats, AnimData animData, IAnimTarget iAnimTarget, AnimConfig animConfig, AnimSpecialConfig animSpecialConfig, long j, long j2, Object obj) {
        double d = animData.startValue;
        if (d == Double.MAX_VALUE || d == 3.4028234663852886E38d || d == 2.147483647E9d) {
            animData.startValue = AnimValueUtils.getValue(iAnimTarget, animData.property, d);
        }
        long j3 = j - j2;
        animData.initTime = j3;
        animStats.startedCount++;
        if (animData.op != 2 || animData.delay > 0) {
            animData.setOp((byte) 1);
            float fromSpeed = AnimConfigUtils.getFromSpeed(animConfig, animSpecialConfig);
            if (fromSpeed != Float.MAX_VALUE) {
                animData.velocity = fromSpeed;
            }
            if (animData.logEnabled) {
                LogUtils.logThread(CommonUtils.TAG, "++++++ data.setup path0");
                return;
            }
            return;
        }
        animData.startTime = j3;
        animData.delay = 0L;
        float fromSpeed2 = AnimConfigUtils.getFromSpeed(animConfig, animSpecialConfig);
        if (fromSpeed2 != Float.MAX_VALUE) {
            animData.velocity = fromSpeed2;
        }
        animStats.prepareCount--;
        setStartData(animData);
        if (animData.logEnabled) {
            LogUtils.logThread(CommonUtils.TAG, "++++++ data.setup path1");
            printSetupInUpdateLog(animData, iAnimTarget, obj);
        }
    }

    public static void start(AnimStats animStats, AnimData animData, IAnimTarget iAnimTarget, long j, long j2, TransitionInfo transitionInfo) {
        if (animData.delay > 0) {
            if (animData.logEnabled) {
                printDelayTaskLog(animData, transitionInfo.key, j);
            }
            if (transitionInfo.currentTime < transitionInfo.startTime + (animData.delay * FolmeCore.NANOS_TO_MS)) {
                return;
            }
            double value = AnimValueUtils.getValue(iAnimTarget, animData.property, Double.MAX_VALUE);
            if (value != Double.MAX_VALUE) {
                animData.startValue = value;
            }
            if (animData.logEnabled) {
                LogUtils.logThread(CommonUtils.TAG, "+++++ data.delay-start: time's up", "info.id=" + transitionInfo.id, String.format("p='%s'", animData.property.getName()));
            }
        }
        animStats.prepareCount--;
        int iInitTask = initTask(iAnimTarget, animData, j, j2);
        if (iInitTask == INIT_RESULT_CODE_SUCCESS) {
            setStartData(animData);
            if (animData.logEnabled) {
                printStartFinishLog(animData, iAnimTarget, transitionInfo.key);
                return;
            }
            return;
        }
        finishProperty(animStats, animData);
        if (animData.logEnabled) {
            if (iInitTask == INIT_RESULT_CODE_FAILED) {
                printSetValueFailedLog(animData, transitionInfo.key);
            } else if (iInitTask == INIT_RESULT_CODE_VALUE_INVALID) {
                printValueInvalidFailedLog(animData, transitionInfo.key);
            }
        }
    }

    private static void update(AnimStats animStats, AnimData animData, IAnimTarget iAnimTarget, long j, long j2, double d, int i, TransitionInfo transitionInfo) {
        double d2;
        if (animData.velocity == 0.0d && animData.justStart) {
            d2 = 0.0d;
        } else {
            animData.frameCount++;
            d2 = d;
        }
        animStats.updateCount++;
        animData.frameInterval = d2;
        animData.duration += d2;
        FloatProperty floatProperty = animData.property;
        if (floatProperty == ViewPropertyExt.FOREGROUND || floatProperty == ViewPropertyExt.BACKGROUND || (floatProperty instanceof ColorProperty)) {
            FolmeCore.doAnimationFrame(iAnimTarget, true, animData, j, d2, i);
        } else {
            FolmeCore.doAnimationFrame(iAnimTarget, false, animData, j, d2, i);
            if (animData.logEnabled) {
                LogUtils.logThread(CommonUtils.TAG, "------ data.update doAnimationFrame: info.id=" + transitionInfo.id, String.format("p='%s'", animData.property.getName()), "value=" + animData.value, "velocity=" + animData.velocity);
            }
        }
        if (animData.justStart) {
            animData.justStart = false;
        }
        if (animData.op == 3) {
            animData.justEnd = true;
            animStats.endCount++;
        }
        if (animData.logEnabled) {
            printUpdateAnimLog(animData, iAnimTarget, transitionInfo, d2);
        }
    }
}
