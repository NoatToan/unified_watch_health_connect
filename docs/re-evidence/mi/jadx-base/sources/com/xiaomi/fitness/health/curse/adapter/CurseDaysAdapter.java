package com.xiaomi.fitness.health.curse.adapter;

import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/curse/adapter/CurseDaysAdapter;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog$a;", "", "getCount", "()I", "index", "getValue", "(I)I", "min", "I", "getMin", VibrateModeSetFragment.MAX, "getMax", "Ljava/util/ArrayList;", "numList", "Ljava/util/ArrayList;", "<init>", "(II)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseDaysAdapter implements PickerDialog.a {
    private final int max;
    private final int min;

    @NotNull
    private final ArrayList<Integer> numList = new ArrayList<>();

    public CurseDaysAdapter(int i, int i2) {
        this.min = i;
        this.max = i2;
        if (i > i2) {
            return;
        }
        while (true) {
            this.numList.add(Integer.valueOf(i));
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getCount() {
        return this.numList.size();
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getValue(int index) {
        Integer num = this.numList.get(index);
        Intrinsics.checkNotNullExpressionValue(num, "get(...)");
        return num.intValue();
    }
}
