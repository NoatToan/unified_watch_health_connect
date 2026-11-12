package com.huami.ai.uitls;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/huami/ai/uitls/BleAlertType;", "", "", "type", LogUtil.I, "<init>", "(Ljava/lang/String;II)V", "Companion", "ALARM", "REMINDER", "TIMER", "TODO_LIST", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public enum BleAlertType {
    ALARM(1),
    REMINDER(2),
    TIMER(3),
    TODO_LIST(4);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/ai/uitls/BleAlertType$Companion;", "", "", "type", "Lcom/huami/ai/uitls/BleAlertType;", "fromValue", "<init>", "()V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x001e  */
        @NotNull
        public final BleAlertType fromValue(int type) {
            for (BleAlertType bleAlertType : BleAlertType.values()) {
                if (bleAlertType.type == type) {
                    if (bleAlertType != null) {
                        return bleAlertType;
                    }
                    throw new IllegalArgumentException("非法的参数");
                }
            }
            bleAlertType = null;
            if (bleAlertType != null) {
                return bleAlertType;
            }
            throw new IllegalArgumentException("非法的参数");
        }
    }

    BleAlertType(int i) {
        this.type = i;
    }
}
