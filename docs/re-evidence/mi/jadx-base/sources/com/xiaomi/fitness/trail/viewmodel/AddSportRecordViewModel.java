package com.xiaomi.fitness.trail.viewmodel;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.trail.data.ExerciseRecord;
import com.xiaomi.fitness.trail.model.AddSportTypeModel;
import com.xiaomi.fitness.trail.widget.ExerciseRVDialog;
import com.xiaomi.fitness.trail.widget.TrailTimePickerDialog;
import com.xiaomi.fitness.util.AddTrailHelper;
import defpackage.byi;
import defpackage.ivi;
import defpackage.j1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/trail/viewmodel/AddSportRecordViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/trail/model/AddSportTypeModel;", "<init>", "()V", "timeRange", "", "", "getTimeRange", "()Ljava/util/List;", "calorieRange", "getCalorieRange", "stepRange", "getStepRange", "distanceRange", "getDistanceRange", "createDetailDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "item", "Lcom/xiaomi/fitness/trail/model/AddSportTypeModel$DetailItem;", "exerciseRecord", "Lcom/xiaomi/fitness/trail/data/ExerciseRecord;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddSportRecordViewModel extends BaseViewModel<AddSportTypeModel> {
    public static final int REQ_SELECT = 3;

    @NotNull
    private final List<Integer> timeRange = CollectionsKt___CollectionsKt.toList(new IntRange(1, 1440));

    @NotNull
    private final List<Integer> calorieRange = CollectionsKt___CollectionsKt.toList(new IntRange(1, 5000));

    @NotNull
    private final List<Integer> stepRange = CollectionsKt___CollectionsKt.toList(RangesKt___RangesKt.step(new IntRange(0, 100000), 10));

    @NotNull
    private final List<Integer> distanceRange = CollectionsKt___CollectionsKt.toList(RangesKt___RangesKt.step(new IntRange(100, 500000), 100));

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public final CommonDialog<?> createDetailDialog(@NotNull AddSportTypeModel.DetailItem item, @NotNull ExerciseRecord exerciseRecord) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(exerciseRecord, "exerciseRecord");
        switch (item.getItemType()) {
            case 1:
            case 3:
            case 4:
            case 5:
                PickerDialog.b negativeText = new PickerDialog.b("add trail detail").setDialogTitle(new DialogParams.DialogDescriptionString(item.getName())).setCustomLayoutId(ivi.S0).setCanceledOnTouchOutside(true).setCancelable(true).setPositiveText(j1j.c).setNegativeText(j1j.f22329b);
                int itemType = item.getItemType();
                if (itemType == 1) {
                    negativeText.c(new PickerDialog.a() { // from class: com.xiaomi.fitness.trail.viewmodel.AddSportRecordViewModel.createDetailDialog.1
                        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                        public int getCount() {
                            return AddSportRecordViewModel.this.getTimeRange().size();
                        }

                        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                        public int getValue(int index) {
                            return AddSportRecordViewModel.this.getTimeRange().get(index).intValue();
                        }
                    });
                    PickerDialog pickerDialogCreate = negativeText.create();
                    Integer value = item.getValue();
                    pickerDialogCreate.setValue(value != null ? value.intValue() : 1);
                    pickerDialogCreate.setPickerHintTextPluralsRes(byi.t);
                    return pickerDialogCreate;
                }
                if (itemType == 3) {
                    negativeText.c(new PickerDialog.a() { // from class: com.xiaomi.fitness.trail.viewmodel.AddSportRecordViewModel.createDetailDialog.4
                        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                        public int getCount() {
                            return AddSportRecordViewModel.this.getDistanceRange().size();
                        }

                        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                        public int getValue(int index) {
                            return AddSportRecordViewModel.this.getDistanceRange().get(index).intValue();
                        }
                    });
                    PickerDialog pickerDialogCreate2 = negativeText.create();
                    pickerDialogCreate2.setPickerHintTextPluralsRes(byi.s);
                    int iIntValue = 100;
                    if (item.getValue() != null) {
                        Integer value2 = item.getValue();
                        iIntValue = 100 * ((value2 != null ? value2.intValue() : 100) / 100);
                    }
                    pickerDialogCreate2.setValue(iIntValue);
                    return pickerDialogCreate2;
                }
                if (itemType == 4) {
                    negativeText.c(new PickerDialog.a() { // from class: com.xiaomi.fitness.trail.viewmodel.AddSportRecordViewModel.createDetailDialog.3
                        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                        public int getCount() {
                            return AddSportRecordViewModel.this.getCalorieRange().size();
                        }

                        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                        public int getValue(int index) {
                            return AddSportRecordViewModel.this.getCalorieRange().get(index).intValue();
                        }
                    });
                    PickerDialog pickerDialogCreate3 = negativeText.create();
                    pickerDialogCreate3.setPickerHintTextPluralsRes(byi.f4729r);
                    Integer value3 = item.getValue();
                    pickerDialogCreate3.setValue(value3 != null ? value3.intValue() : 1);
                    return pickerDialogCreate3;
                }
                if (itemType == 5) {
                    negativeText.c(new PickerDialog.a() { // from class: com.xiaomi.fitness.trail.viewmodel.AddSportRecordViewModel.createDetailDialog.2
                        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                        public int getCount() {
                            return AddSportRecordViewModel.this.getStepRange().size();
                        }

                        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
                        public int getValue(int index) {
                            return AddSportRecordViewModel.this.getStepRange().get(index).intValue();
                        }
                    });
                    PickerDialog pickerDialogCreate4 = negativeText.create();
                    pickerDialogCreate4.setPickerHintTextPluralsRes(byi.u);
                    Integer value4 = item.getValue();
                    pickerDialogCreate4.setValue(((value4 != null ? value4.intValue() : 0) / 10) * 10);
                    return pickerDialogCreate4;
                }
                return null;
            case 2:
                if (item.getValue() == null) {
                    return null;
                }
                Integer value5 = item.getValue();
                Intrinsics.checkNotNull(value5);
                long jIntValue = ((long) value5.intValue()) * ((long) 1000);
                TimeUtils timeUtils = TimeUtils.INSTANCE;
                int hourOfDay = timeUtils.getHourOfDay(jIntValue);
                int minute = timeUtils.getMinute(jIntValue);
                TrailTimePickerDialog trailTimePickerDialogCreate = TrailTimePickerDialog.INSTANCE.defaultBuilder("time picker").setDialogTitle(new DialogParams.DialogDescriptionString(item.getName())).setNegativeText(j1j.f22329b).setPositiveText(j1j.c).create();
                trailTimePickerDialogCreate.setCurrentHour(hourOfDay);
                trailTimePickerDialogCreate.setCurrentMinute(minute);
                trailTimePickerDialogCreate.setMaxTime(hourOfDay, minute);
                return trailTimePickerDialogCreate;
            case 6:
                return new CommonDialog.c("trail choose posture").setDialogTitle(j1j.u0).setItems(AddTrailHelper.INSTANCE.constructPostureArray()).create();
            case 7:
                ExerciseRVDialog exerciseRVDialogCreate = new ExerciseRVDialog.a("trail choose intensity").setDialogTitle(j1j.i2).setCustomLayoutId(ivi.N0).setCanceledOnTouchOutside(true).setPositiveText(j1j.c).setNegativeText(j1j.f22329b).create();
                exerciseRVDialogCreate.setRequestCode(3);
                return exerciseRVDialogCreate;
            default:
                return null;
        }
    }

    @NotNull
    public final List<Integer> getCalorieRange() {
        return this.calorieRange;
    }

    @NotNull
    public final List<Integer> getDistanceRange() {
        return this.distanceRange;
    }

    @NotNull
    public final List<Integer> getStepRange() {
        return this.stepRange;
    }

    @NotNull
    public final List<Integer> getTimeRange() {
        return this.timeRange;
    }
}
