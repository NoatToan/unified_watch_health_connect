package com.huami.femalehealth.logiclib.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.reminder.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/Degree;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", c.b, "MIDDLE", c.d, "UNSPECIFIED", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public enum Degree {
    LIGHT(1),
    MIDDLE(2),
    HEAVY(3),
    UNSPECIFIED(0);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/Degree$Companion;", "", "", "type", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "covertByIntType", "(Ljava/lang/Integer;)Lcom/huami/femalehealth/logiclib/dto/Degree;", "covertByWebBeanIntType", "random", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Degree covertByIntType(@Nullable Integer type) {
            if (type != null && type.intValue() == 1) {
                return Degree.LIGHT;
            }
            if (type != null && type.intValue() == 2) {
                return Degree.MIDDLE;
            }
            return (type != null && type.intValue() == 3) ? Degree.HEAVY : Degree.UNSPECIFIED;
        }

        @NotNull
        public final Degree covertByWebBeanIntType(@Nullable Integer type) {
            if (type != null && type.intValue() == 0) {
                return Degree.LIGHT;
            }
            if (type != null && type.intValue() == 1) {
                return Degree.MIDDLE;
            }
            return (type != null && type.intValue() == 2) ? Degree.HEAVY : Degree.UNSPECIFIED;
        }

        @NotNull
        public final Degree random() {
            return (Degree) CollectionsKt.first(e.shuffled(ArraysKt___ArraysKt.toList(Degree.values())));
        }
    }

    Degree(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
