package com.xiaomi.fitness.userinfo.adapter;

import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import defpackage.axf;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/userinfo/adapter/WeightAdapter;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog$a;", "", "getCount", "()I", "index", "getValue", "(I)I", "", "validWeightRange", "[I", "Ljava/util/LinkedList;", "weightList", "Ljava/util/LinkedList;", "<init>", "()V", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightAdapter implements PickerDialog.a {

    @NotNull
    private final int[] validWeightRange;

    @NotNull
    private final LinkedList<Integer> weightList;

    public WeightAdapter() {
        int[] iArr = {axf.d(), axf.c()};
        this.validWeightRange = iArr;
        this.weightList = new LinkedList<>();
        int i = iArr[0];
        int i2 = iArr[1];
        if (i > i2) {
            return;
        }
        while (true) {
            this.weightList.add(Integer.valueOf(i));
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getCount() {
        return this.weightList.size();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getValue(int index) {
        Integer num = this.weightList.get(index);
        Intrinsics.checkNotNullExpressionValue(num, "get(...)");
        return num.intValue();
    }
}
