package com.xiaomi.fitness.health.bloodglucose.ui;

import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import defpackage.c0j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseAddValueFragment;", "Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseAddFragment;", "<init>", "()V", "bloodGlucoseViewModel", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "finishEdit", "", "showDialog", "getConstantByBloodGlucoseType", "", "typeResStr", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucoseAddValueFragment extends Hilt_BloodGlucoseAddValueFragment {

    @Nullable
    private BloodGlucoseViewModel bloodGlucoseViewModel;

    private final int getConstantByBloodGlucoseType(String typeResStr) {
        if (Intrinsics.areEqual(typeResStr, getString(c0j.l0))) {
            return 2;
        }
        if (Intrinsics.areEqual(typeResStr, getString(c0j.i0))) {
            return 1;
        }
        if (Intrinsics.areEqual(typeResStr, getString(c0j.V0))) {
            return 9;
        }
        if (Intrinsics.areEqual(typeResStr, getString(c0j.Q0))) {
            return 3;
        }
        if (Intrinsics.areEqual(typeResStr, getString(c0j.U0))) {
            return 4;
        }
        if (Intrinsics.areEqual(typeResStr, getString(c0j.S0))) {
            return 5;
        }
        if (Intrinsics.areEqual(typeResStr, getString(c0j.T0))) {
            return 6;
        }
        if (Intrinsics.areEqual(typeResStr, getString(c0j.R0))) {
            return 7;
        }
        return Intrinsics.areEqual(typeResStr, getString(c0j.f0)) ? 8 : -1;
    }

    private final void showDialog() {
        setMSelectedMealTimeAdd(0);
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.Ga).setDialogDescription(c0j.g0).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.setRequestCode(4);
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    @Override // com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAddFragment
    public void finishEdit() {
        this.bloodGlucoseViewModel = (BloodGlucoseViewModel) new ViewModelProvider(this).get(BloodGlucoseViewModel.class);
        int constantByBloodGlucoseType = getConstantByBloodGlucoseType(getMSelectedMealTime());
        if (getMSelectedBloodGlucose() > 0.0f && constantByBloodGlucoseType != -1 && getMRecordTimeMills() != -1) {
            BloodGlucoseViewModel bloodGlucoseViewModel = this.bloodGlucoseViewModel;
            List<BloodSugarItem> listCheckManualBloodSugarItem = bloodGlucoseViewModel != null ? bloodGlucoseViewModel.checkManualBloodSugarItem(constantByBloodGlucoseType, getMRecordTimeMills() / ((long) 1000)) : null;
            if (listCheckManualBloodSugarItem != null && listCheckManualBloodSugarItem.isEmpty()) {
                BloodGlucoseViewModel bloodGlucoseViewModel2 = this.bloodGlucoseViewModel;
                if (bloodGlucoseViewModel2 != null) {
                    bloodGlucoseViewModel2.insertBloodGlucoseRecord(getMSelectedBloodGlucose(), constantByBloodGlucoseType, getMRecordTimeMills() / ((long) 1000));
                }
            } else if (getMSelectedMealTimeAdd() != 1) {
                showDialog();
            }
            if (getMSelectedMealTimeAdd() == 1) {
                if (listCheckManualBloodSugarItem != null) {
                    for (BloodSugarItem bloodSugarItem : listCheckManualBloodSugarItem) {
                        BloodGlucoseViewModel bloodGlucoseViewModel3 = this.bloodGlucoseViewModel;
                        if (bloodGlucoseViewModel3 != null) {
                            bloodGlucoseViewModel3.deleteBloodGlucoseRecord(bloodSugarItem);
                        }
                    }
                }
                BloodGlucoseViewModel bloodGlucoseViewModel4 = this.bloodGlucoseViewModel;
                if (bloodGlucoseViewModel4 != null) {
                    bloodGlucoseViewModel4.insertBloodGlucoseRecord(getMSelectedBloodGlucose(), constantByBloodGlucoseType, getMRecordTimeMills() / ((long) 1000));
                }
            }
        }
        if (getMSelectedMealTimeAdd() != 0) {
            exitEdit();
        }
    }
}
