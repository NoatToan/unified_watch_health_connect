package com.huami.bloodoxygen.core.local.config;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/huami/bloodoxygen/core/local/config/BloodOxygen;", "", "", "KVKIT_NAME", "Ljava/lang/String;", "EVENT_TYPE", "", "a", "J", "getDEFAULT_FROM", "()J", "DEFAULT_FROM", "<init>", "()V", "OdiValid", "OdiWatch", "SleepLevel", "Spo2", "SubType", "core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygen {

    @NotNull
    public static final String EVENT_TYPE = "blood_oxygen";

    @NotNull
    public static final String KVKIT_NAME = "blood_oxygen_kvkit_";

    @NotNull
    public static final BloodOxygen INSTANCE = new BloodOxygen();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final long DEFAULT_FROM = BloodOxygenUtils.INSTANCE.yMDToTimestamp("2019-01-01");

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$OdiValid;", "", "", "SHOW_NOTHING", LogUtil.I, "SHOW_ODI_AND_WEAR_TIP", "SHOW_ODI", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final class OdiValid {

        @NotNull
        public static final OdiValid INSTANCE = new OdiValid();
        public static final int SHOW_NOTHING = 0;
        public static final int SHOW_ODI = 2;
        public static final int SHOW_ODI_AND_WEAR_TIP = 1;

        private OdiValid() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$OdiWatch;", "", "", "HOUR_MIN", LogUtil.I, "HOUR_MAX", "VALUE_MIN", "VALUE_MAX", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final class OdiWatch {
        public static final int HOUR_MAX = 4;
        public static final int HOUR_MIN = 2;

        @NotNull
        public static final OdiWatch INSTANCE = new OdiWatch();
        public static final int VALUE_MAX = 80;
        public static final int VALUE_MIN = 40;

        private OdiWatch() {
        }
    }

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SleepLevel;", "", "<init>", "(Ljava/lang/String;I)V", "AWAKE", "SHALLOW", "DEEP", "core_release"}, k = 1, mv = {1, 5, 1})
    public enum SleepLevel {
        AWAKE,
        SHALLOW,
        DEEP
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$Spo2;", "", "", "VALID_MIN", LogUtil.I, "VALID_MAX", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Spo2 {

        @NotNull
        public static final Spo2 INSTANCE = new Spo2();
        public static final int VALID_MAX = 100;
        public static final int VALID_MIN = 80;

        private Spo2() {
        }
    }

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "", "", "string", "Ljava/lang/String;", "getString", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ALL", "CLICK", "OSA_PROCESS", "OSA_EVENT", "ODI", "core_release"}, k = 1, mv = {1, 5, 1})
    public enum SubType {
        ALL("all"),
        CLICK("click"),
        OSA_PROCESS("osa_process"),
        OSA_EVENT("osa_event"),
        ODI("odi");


        @NotNull
        private final String string;

        SubType(String str) {
            this.string = str;
        }

        @NotNull
        public final String getString() {
            return this.string;
        }
    }

    private BloodOxygen() {
    }

    public final long getDEFAULT_FROM() {
        return DEFAULT_FROM;
    }
}
