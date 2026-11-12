package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.io.ByteArrayOutputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\"\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal;", "", "toBytes", "toEcfExtendBytes", "", "a", LogUtil.I, "TARGET_FLAG_BYTES", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ActivityGoalKt {
    private static final int a = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal;", StatEvent.EventParams.TYPE_CARD_GOAL, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ActivityGoal, byte[]> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byte[] invoke(@Nullable ActivityGoal activityGoal) {
            return ByteUtilsKt.toByteArray$default(activityGoal == null ? 0 : activityGoal.getValue(), 0, 1, null);
        }
    }

    @NotNull
    public static final byte[] toBytes(@NotNull List<ActivityGoal> list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int bitSet = 0;
        for (ActivityGoal activityGoal : CollectionsKt___CollectionsKt.sortedWith(list, new Comparator<T>() { // from class: com.huami.bluetooth.profile.ecf.data.ActivityGoalKt$toBytes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ActivityGoal) t).getType().getBitSet()), Integer.valueOf(((ActivityGoal) t2).getType().getBitSet()));
            }
        })) {
            bitSet |= 1 << activityGoal.getType().getBitSet();
            byteArrayOutputStream.write(activityGoal.getBytes$bluetooth_release());
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byteArrayOutputStream2.write(ByteUtilsKt.toByteArray(bitSet, 4));
        byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
        return byteArrayOutputStream2.toByteArray();
    }

    @NotNull
    public static final byte[] toEcfExtendBytes(@NotNull List<ActivityGoal> list) {
        Object next;
        Object next2;
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((ActivityGoal) next).isRemindEnable());
        ActivityGoal activityGoal = (ActivityGoal) next;
        ActivityGoal.GoalType type = activityGoal == null ? null : activityGoal.getType();
        ActivityGoalKt$toEcfExtendBytes$typeValue$1 activityGoalKt$toEcfExtendBytes$typeValue$1 = new Function1<ActivityGoal.GoalType, Integer>() { // from class: com.huami.bluetooth.profile.ecf.data.ActivityGoalKt$toEcfExtendBytes$typeValue$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ActivityGoal.GoalType.values().length];
                    iArr[ActivityGoal.GoalType.STEP.ordinal()] = 1;
                    iArr[ActivityGoal.GoalType.DISTANCE.ordinal()] = 2;
                    iArr[ActivityGoal.GoalType.CALORIES.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public final int a(@Nullable ActivityGoal.GoalType goalType) {
                int i = goalType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[goalType.ordinal()];
                if (i == 1) {
                    return 1;
                }
                if (i != 2) {
                    return i != 3 ? 0 : 3;
                }
                return 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(ActivityGoal.GoalType goalType) {
                return Integer.valueOf(a(goalType));
            }
        };
        a aVar = a.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(activityGoalKt$toEcfExtendBytes$typeValue$1.invoke(type).intValue());
        for (ActivityGoal.GoalType goalType : CollectionsKt__CollectionsKt.listOf((Object[]) new ActivityGoal.GoalType[]{ActivityGoal.GoalType.STEP, ActivityGoal.GoalType.DISTANCE, ActivityGoal.GoalType.CALORIES})) {
            Iterator<T> it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!(goalType == ((ActivityGoal) next2).getType()));
            byteArrayOutputStream.write(aVar.invoke(next2));
        }
        return byteArrayOutputStream.toByteArray();
    }
}
