package com.huami.sleep.daysleep.sleepstagechart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagType;", "", "", "getTitle", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "ADD", "MANUAL", "NIGHTMARE", "DIFF_FAIL_SLEEP", "NOISE", "sleep_release"}, k = 1, mv = {1, 5, 1})
public enum SleepTagType {
    ADD(-1),
    MANUAL(0),
    NIGHTMARE(1),
    DIFF_FAIL_SLEEP(2),
    NOISE(3);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagType$Companion;", "", "", "value", "", "getTitle", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTitle(int value) {
            if (value == SleepTagType.ADD.getValue()) {
                return "+";
            }
            if (value == SleepTagType.NIGHTMARE.getValue()) {
                return KoinExtKt.getAppContext().getString(R.string.slp_default_tag_1);
            }
            if (value == SleepTagType.DIFF_FAIL_SLEEP.getValue()) {
                return KoinExtKt.getAppContext().getString(R.string.slp_default_tag_2);
            }
            return value == SleepTagType.NOISE.getValue() ? KoinExtKt.getAppContext().getString(R.string.slp_default_tag_3) : "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepTagType.values().length];
            iArr[SleepTagType.ADD.ordinal()] = 1;
            iArr[SleepTagType.NIGHTMARE.ordinal()] = 2;
            iArr[SleepTagType.DIFF_FAIL_SLEEP.ordinal()] = 3;
            iArr[SleepTagType.NOISE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    SleepTagType(int i) {
        this.value = i;
    }

    @NotNull
    public final String getTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "+";
        }
        if (i == 2) {
            return KoinExtKt.getAppContext().getString(R.string.slp_default_tag_1);
        }
        if (i != 3) {
            return i != 4 ? "" : KoinExtKt.getAppContext().getString(R.string.slp_default_tag_3);
        }
        return KoinExtKt.getAppContext().getString(R.string.slp_default_tag_2);
    }

    public final int getValue() {
        return this.value;
    }
}
