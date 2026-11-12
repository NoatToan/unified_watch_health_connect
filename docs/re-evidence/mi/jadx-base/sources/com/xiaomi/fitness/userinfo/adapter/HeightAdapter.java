package com.xiaomi.fitness.userinfo.adapter;

import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import defpackage.axf;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/userinfo/adapter/HeightAdapter;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog$a;", "", "getCount", "()I", "index", "getValue", "(I)I", "", "VALID_HEIGHT_RANGE", "[I", "getVALID_HEIGHT_RANGE", "()[I", "", "mHeightList", "Ljava/util/List;", "<init>", "()V", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HeightAdapter implements PickerDialog.a {

    @NotNull
    private final int[] VALID_HEIGHT_RANGE;

    @NotNull
    private final List<Integer> mHeightList;

    public HeightAdapter() {
        int[] iArrB = axf.b();
        Intrinsics.checkNotNullExpressionValue(iArrB, "getSupportedHeightRange(...)");
        this.VALID_HEIGHT_RANGE = iArrB;
        this.mHeightList = new LinkedList();
        int i = iArrB[0];
        int i2 = iArrB[1];
        if (i > i2) {
            return;
        }
        while (true) {
            ((LinkedList) this.mHeightList).add(Integer.valueOf(i));
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getCount() {
        return this.mHeightList.size();
    }

    @NotNull
    public final int[] getVALID_HEIGHT_RANGE() {
        return this.VALID_HEIGHT_RANGE;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getValue(int index) {
        return this.mHeightList.get(index).intValue();
    }
}
