package com.huami.femalehealth.logiclib.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "", "", "index", LogUtil.I, "getIndex", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "PAIN", "BLOOD", "MOOD", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public enum SymptomType {
    PAIN(0),
    BLOOD(1),
    MOOD(2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int index;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/SymptomType$Companion;", "", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "random", "", "index", "of", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final SymptomType of(int index) {
            for (SymptomType symptomType : SymptomType.values()) {
                if (symptomType.getIndex() == index) {
                    if (symptomType == null) {
                        return SymptomType.PAIN;
                    }
                    return symptomType;
                }
            }
            symptomType = null;
            if (symptomType == null) {
                return SymptomType.PAIN;
            }
            return symptomType;
        }

        @NotNull
        public final SymptomType random() {
            return (SymptomType) CollectionsKt.first(e.shuffled(ArraysKt___ArraysKt.toList(SymptomType.values())));
        }
    }

    SymptomType(int i) {
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }
}
