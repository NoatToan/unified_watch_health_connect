package com.huawei.health.manager;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.services.core.AMapException;
import com.huawei.health.manager.util.AlarmHelper;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class SportStatusDetectManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TriggerSportInterface f8071a;
    private AutoRecognizeStatus d = AutoRecognizeStatus.IDLE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AlarmHelper f8072b = new AlarmHelper();

    public SportStatusDetectManager(TriggerSportInterface triggerSportInterface) {
        this.f8071a = triggerSportInterface;
    }

    public void a(AutoRecognizeStatus autoRecognizeStatus) {
        ReleaseLogUtil.d("Track_SportStatusDetectManager", "current status is ", autoRecognizeStatus);
        if (this.d.getStatus() == autoRecognizeStatus.getStatus()) {
            ReleaseLogUtil.a("Track_SportStatusDetectManager", "status is same,not need update");
        } else {
            this.d = this.d.detect(autoRecognizeStatus, this.f8071a, this.f8072b);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RUN' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class AutoRecognizeStatus implements IDetect {
        public static final AutoRecognizeStatus HANG_START;
        public static final AutoRecognizeStatus IDLE;
        public static final AutoRecognizeStatus PRE_STOP;
        public static final AutoRecognizeStatus RECOGNIZE_RUN;
        public static final AutoRecognizeStatus RUN;
        public static final AutoRecognizeStatus WALK;
        private final int mStatus;
        public static final AutoRecognizeStatus RECOGNIZE_WALK = new AutoRecognizeStatus("RECOGNIZE_WALK", 3, 501) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.4
            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize walk start to pre sport ", Integer.valueOf(autoRecognizeStatus.getStatus()));
                alarmHelper.p();
                alarmHelper.e();
                alarmHelper.d();
                if (autoRecognizeStatus.getStatus() == WALK.getStatus()) {
                    alarmHelper.i();
                    return PRE_WALK;
                }
                if (autoRecognizeStatus.getStatus() == END_CALCULATE.getStatus()) {
                    alarmHelper.i();
                    return alarmHelper.b(PRE_WALK);
                }
                alarmHelper.g();
                return PRE_RUN;
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize walk cancel to idle");
                alarmHelper.c();
                alarmHelper.p();
                alarmHelper.k();
                return HANG_START;
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus trans(AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize walk trans to recognize run");
                alarmHelper.c();
                alarmHelper.p();
                return runPre(alarmHelper);
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus detect(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                if (autoRecognizeStatus.getStatus() == WALK.getStatus() || autoRecognizeStatus.getStatus() == END_CALCULATE.getStatus()) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize walk detect to recognize walk");
                    return upgrade(autoRecognizeStatus, triggerSportInterface, alarmHelper);
                }
                if (autoRecognizeStatus.getStatus() == RUN.getStatus()) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize walk detect to recognize run");
                    return trans(alarmHelper);
                }
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize walk detect to recognize idle");
                return demote(triggerSportInterface, alarmHelper);
            }
        };
        public static final AutoRecognizeStatus FAULT_TOLERANT = new AutoRecognizeStatus("FAULT_TOLERANT", 7, 1701) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.8
            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                alarmHelper.c();
                return alarmHelper.d(autoRecognizeStatus, triggerSportInterface);
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "fault tolerant status detected demote to stop");
                alarmHelper.c();
                alarmHelper.e();
                alarmHelper.a();
                return IDLE;
            }
        };
        public static final AutoRecognizeStatus PRE_WALK = new AutoRecognizeStatus("PRE_WALK", 8, 1501) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.9
            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre walk status detected start to walk or running ", Integer.valueOf(autoRecognizeStatus.getStatus()));
                alarmHelper.a();
                if (autoRecognizeStatus.getStatus() == WALK.getStatus()) {
                    alarmHelper.p();
                    return alarmHelper.d(autoRecognizeStatus, triggerSportInterface);
                }
                alarmHelper.c();
                return FAULT_TOLERANT;
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre walk demote now is to cancel");
                alarmHelper.h();
                alarmHelper.n();
                return PRE_PAUSE;
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus detect(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre walk status detected  ", Integer.valueOf(autoRecognizeStatus.getStatus()));
                if (autoRecognizeStatus.getStatus() == WALK.getStatus()) {
                    return upgrade(autoRecognizeStatus, triggerSportInterface, alarmHelper);
                }
                if (autoRecognizeStatus.getStatus() == RUN.getStatus()) {
                    return trans(alarmHelper);
                }
                return demote(triggerSportInterface, alarmHelper);
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus trans(AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre walk trans to pre run");
                alarmHelper.c();
                alarmHelper.p();
                alarmHelper.g();
                return PRE_RUN;
            }
        };
        public static final AutoRecognizeStatus PRE_RUN = new AutoRecognizeStatus("PRE_RUN", 9, 1502) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.10
            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre run status detected start to walk or running ");
                alarmHelper.a();
                if (autoRecognizeStatus.getStatus() == RUN.getStatus()) {
                    alarmHelper.q();
                    return alarmHelper.d(autoRecognizeStatus, triggerSportInterface);
                }
                alarmHelper.c();
                return FAULT_TOLERANT;
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre run demote now is to cancel");
                alarmHelper.h();
                alarmHelper.n();
                return PRE_PAUSE;
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus detect(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre run status detected  ", Integer.valueOf(autoRecognizeStatus.getStatus()));
                if (autoRecognizeStatus.getStatus() == RUN.getStatus()) {
                    return upgrade(autoRecognizeStatus, triggerSportInterface, alarmHelper);
                }
                if (autoRecognizeStatus.getStatus() == WALK.getStatus()) {
                    return trans(alarmHelper);
                }
                return demote(triggerSportInterface, alarmHelper);
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus trans(AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre run trans to pre walk");
                alarmHelper.c();
                alarmHelper.q();
                alarmHelper.i();
                return PRE_WALK;
            }
        };
        public static final AutoRecognizeStatus PRE_PAUSE = new AutoRecognizeStatus("PRE_PAUSE", 10, 1303) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.11
            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre pause demote now is to cancel");
                alarmHelper.c();
                alarmHelper.e();
                alarmHelper.a();
                return IDLE;
            }

            @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
            public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre pause status detected start to walk or running ");
                alarmHelper.m();
                alarmHelper.b();
                if (autoRecognizeStatus.getStatus() == RUN.getStatus()) {
                    return PRE_RUN;
                }
                return PRE_WALK;
            }
        };
        public static final AutoRecognizeStatus END_CALCULATE = new AutoRecognizeStatus("END_CALCULATE", 11, 1603);
        private static final /* synthetic */ AutoRecognizeStatus[] $VALUES = $values();

        private static /* synthetic */ AutoRecognizeStatus[] $values() {
            return new AutoRecognizeStatus[]{RUN, WALK, RECOGNIZE_RUN, RECOGNIZE_WALK, HANG_START, PRE_STOP, IDLE, FAULT_TOLERANT, PRE_WALK, PRE_RUN, PRE_PAUSE, END_CALCULATE};
        }

        public static AutoRecognizeStatus valueOf(String str) {
            return (AutoRecognizeStatus) Enum.valueOf(AutoRecognizeStatus.class, str);
        }

        public static AutoRecognizeStatus[] values() {
            return (AutoRecognizeStatus[]) $VALUES.clone();
        }

        static {
            int i = 0;
            RUN = new AutoRecognizeStatus("RUN", i, AMapException.CODE_AMAP_CLIENT_IO_EXCEPTION) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.1
                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "run status upgrade enter pre stop ");
                    alarmHelper.c();
                    return stopPre(alarmHelper);
                }
            };
            int i2 = 1;
            WALK = new AutoRecognizeStatus("WALK", i2, AMapException.CODE_AMAP_CLIENT_INVALID_PARAMETER) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.2
                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "walk status upgrade enter pre stop ");
                    alarmHelper.c();
                    return stopPre(alarmHelper);
                }
            };
            int i3 = 2;
            RECOGNIZE_RUN = new AutoRecognizeStatus("RECOGNIZE_RUN", i3, TypedValues.PositionType.TYPE_DRAWPATH) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.3
                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize run start to pre sport ", Integer.valueOf(autoRecognizeStatus.getStatus()));
                    alarmHelper.q();
                    alarmHelper.e();
                    alarmHelper.d();
                    if (autoRecognizeStatus == WALK) {
                        alarmHelper.i();
                        return PRE_WALK;
                    }
                    if (autoRecognizeStatus == END_CALCULATE) {
                        alarmHelper.g();
                        return alarmHelper.b(PRE_RUN);
                    }
                    alarmHelper.g();
                    return PRE_RUN;
                }

                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize run cancel to idle");
                    alarmHelper.q();
                    alarmHelper.c();
                    alarmHelper.k();
                    return HANG_START;
                }

                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus trans(AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize run trans to recognize walk");
                    alarmHelper.c();
                    alarmHelper.q();
                    return walkPre(alarmHelper);
                }

                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus detect(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    if (autoRecognizeStatus.getStatus() == RUN.getStatus() || autoRecognizeStatus.getStatus() == END_CALCULATE.getStatus()) {
                        ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize run detect to recognize run");
                        return upgrade(autoRecognizeStatus, triggerSportInterface, alarmHelper);
                    }
                    if (autoRecognizeStatus.getStatus() == WALK.getStatus()) {
                        ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize run detect to recognize walk");
                        return trans(alarmHelper);
                    }
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "recognize run detect to recognize idle");
                    return demote(triggerSportInterface, alarmHelper);
                }
            };
            HANG_START = new AutoRecognizeStatus("HANG_START", 4, i3) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.5
                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    alarmHelper.c();
                    alarmHelper.r();
                    if (autoRecognizeStatus == WALK) {
                        alarmHelper.o();
                        ReleaseLogUtil.d("Track_SportStatusDetectManager", "HANG_START continue walk");
                        return RECOGNIZE_WALK;
                    }
                    alarmHelper.l();
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "HANG_START continue running");
                    return RECOGNIZE_RUN;
                }

                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "hang start status detected demote to stop");
                    alarmHelper.c();
                    alarmHelper.e();
                    alarmHelper.a();
                    return IDLE;
                }

                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus detect(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "hang start status detected demote ", Integer.valueOf(autoRecognizeStatus.getStatus()));
                    if (autoRecognizeStatus == IDLE) {
                        return demote(triggerSportInterface, alarmHelper);
                    }
                    return upgrade(autoRecognizeStatus, triggerSportInterface, alarmHelper);
                }
            };
            PRE_STOP = new AutoRecognizeStatus("PRE_STOP", 5, i2) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.6
                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    alarmHelper.c();
                    alarmHelper.e();
                    alarmHelper.t();
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre stop status upgrade to stop", autoRecognizeStatus);
                    return autoRecognizeStatus;
                }

                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre stop status detected demote to stop");
                    alarmHelper.a();
                    alarmHelper.c();
                    triggerSportInterface.endSport();
                    return IDLE;
                }

                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus detect(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "pre stop status detected ", Integer.valueOf(autoRecognizeStatus.getStatus()));
                    if (autoRecognizeStatus == AutoRecognizeStatus.IDLE) {
                        return demote(triggerSportInterface, alarmHelper);
                    }
                    return upgrade(autoRecognizeStatus, triggerSportInterface, alarmHelper);
                }
            };
            IDLE = new AutoRecognizeStatus("IDLE", 6, i) { // from class: com.huawei.health.manager.SportStatusDetectManager.AutoRecognizeStatus.7
                @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
                public AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
                    if (autoRecognizeStatus == PRE_STOP) {
                        ReleaseLogUtil.d("Track_SportStatusDetectManager", "invalid status,continue idle ");
                        alarmHelper.a();
                        alarmHelper.c();
                        return IDLE;
                    }
                    if (autoRecognizeStatus.getStatus() == WALK.getStatus()) {
                        ReleaseLogUtil.d("Track_SportStatusDetectManager", "idle pre to walk");
                        return walkPre(alarmHelper);
                    }
                    ReleaseLogUtil.d("Track_SportStatusDetectManager", "idle pre to run");
                    return runPre(alarmHelper);
                }
            };
        }

        private AutoRecognizeStatus(String str, int i, int i2) {
            super(str, i);
            this.mStatus = i2;
        }

        @Override // com.huawei.health.manager.SportStatusDetectManager.IDetect
        public int getStatus() {
            return this.mStatus;
        }

        AutoRecognizeStatus walkPre(AlarmHelper alarmHelper) {
            alarmHelper.o();
            return RECOGNIZE_WALK;
        }

        AutoRecognizeStatus runPre(AlarmHelper alarmHelper) {
            alarmHelper.l();
            return RECOGNIZE_RUN;
        }

        AutoRecognizeStatus stopPre(AlarmHelper alarmHelper) {
            alarmHelper.j();
            alarmHelper.f();
            return PRE_STOP;
        }
    }

    public interface IDetect {
        default int getStatus() {
            return 0;
        }

        default AutoRecognizeStatus upgrade(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
            ReleaseLogUtil.d("Track_SportStatusDetectManager", "upgrade default implement");
            return AutoRecognizeStatus.RUN;
        }

        default AutoRecognizeStatus demote(TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
            ReleaseLogUtil.d("Track_SportStatusDetectManager", "demote default implement");
            return AutoRecognizeStatus.IDLE;
        }

        default AutoRecognizeStatus reset(TriggerSportInterface triggerSportInterface) {
            ReleaseLogUtil.d("Track_SportStatusDetectManager", "reset default implement");
            triggerSportInterface.endSport();
            return AutoRecognizeStatus.IDLE;
        }

        default AutoRecognizeStatus trans(AlarmHelper alarmHelper) {
            ReleaseLogUtil.d("Track_SportStatusDetectManager", "trans default implement");
            return AutoRecognizeStatus.WALK;
        }

        default AutoRecognizeStatus detect(AutoRecognizeStatus autoRecognizeStatus, TriggerSportInterface triggerSportInterface, AlarmHelper alarmHelper) {
            int status = autoRecognizeStatus.getStatus() - getStatus();
            if (status >= 100) {
                return upgrade(autoRecognizeStatus, triggerSportInterface, alarmHelper);
            }
            if (Math.abs(status) < 10) {
                return trans(alarmHelper);
            }
            return demote(triggerSportInterface, alarmHelper);
        }
    }
}
