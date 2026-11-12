package com.huami.health.afppg.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\b\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/health/afppg/model/AFPPGDataType;", "", "", "value", LogUtil.I, "getValue", "()I", "", "isNotAFData", "()Z", "<init>", "(Ljava/lang/String;II)V", "Companion", "RR", "MOTOR", "AF_PPG", "DIAGNOSIS", "HR_PG", "AF_ACC", "HL_HR", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public enum AFPPGDataType {
    RR(8),
    MOTOR(10),
    AF_PPG(11),
    DIAGNOSIS(17),
    HR_PG(29),
    AF_ACC(30),
    HL_HR(50);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/health/afppg/model/AFPPGDataType$Companion;", "", "", "value", "Lcom/huami/health/afppg/model/AFPPGDataType;", "fromType", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AFPPGDataType fromType(int value) {
            for (AFPPGDataType aFPPGDataType : AFPPGDataType.values()) {
                if (aFPPGDataType.getValue() == value) {
                    return aFPPGDataType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    AFPPGDataType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isNotAFData() {
        return this.value != DIAGNOSIS.value;
    }
}
