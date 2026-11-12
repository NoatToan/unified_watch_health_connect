package com.xiaomi.fitness.health.sleep.rhythm.diary;

import android.os.Bundle;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment$mSleepDiaryMedicationAdapter$2$1;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateFragment$mSleepDiaryMedicationAdapter$2$1", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter$OnMedicationBeforeSleepItemClickListener;", "onItemSelectEdit", "", "index", "", "medicationBeforeSleep", "Lcom/xiaomi/fit/fitness/export/data/project/SleepMedicationDetail;", "onItemSelectDelete", "item", "deleteCallBack", "Lkotlin/Function0;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepDiaryUpdateFragment$mSleepDiaryMedicationAdapter$2$1 implements SleepDiaryMedicationAdapter.OnMedicationBeforeSleepItemClickListener {
    final /* synthetic */ SleepDiaryUpdateFragment this$0;

    public SleepDiaryUpdateFragment$mSleepDiaryMedicationAdapter$2$1(SleepDiaryUpdateFragment sleepDiaryUpdateFragment) {
        this.this$0 = sleepDiaryUpdateFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemSelectDelete$lambda$0(Function0 deleteCallBack, SleepDiaryUpdateFragment this$0, SleepMedicationDetail item) {
        Intrinsics.checkNotNullParameter(deleteCallBack, "$deleteCallBack");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        deleteCallBack.invoke();
        List<SleepMedicationDetail> medicationBeforeBedtime = SleepDiaryUpdateFragment.access$getMViewModel(this$0).getUpdateSleepDiaryInfo().getMedicationBeforeBedtime();
        if (medicationBeforeBedtime != null && !medicationBeforeBedtime.isEmpty()) {
            List<SleepMedicationDetail> medicationBeforeBedtime2 = SleepDiaryUpdateFragment.access$getMViewModel(this$0).getUpdateSleepDiaryInfo().getMedicationBeforeBedtime();
            Intrinsics.checkNotNull(medicationBeforeBedtime2);
            List<SleepMedicationDetail> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) medicationBeforeBedtime2);
            mutableList.remove(item);
            SleepDiaryUpdateFragment.access$getMViewModel(this$0).getUpdateSleepDiaryInfo().setMedicationBeforeBedtime(mutableList);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryMedicationAdapter.OnMedicationBeforeSleepItemClickListener
    public void onItemSelectDelete(int index, final SleepMedicationDetail item, final Function0<Unit> deleteCallBack) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(deleteCallBack, "deleteCallBack");
        final SleepDiaryUpdateFragment sleepDiaryUpdateFragment = this.this$0;
        sleepDiaryUpdateFragment.showRecordDeleteRemindDialog(new Function0() { // from class: klm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDiaryUpdateFragment$mSleepDiaryMedicationAdapter$2$1.onItemSelectDelete$lambda$0(deleteCallBack, sleepDiaryUpdateFragment, item);
            }
        });
    }

    @Override // com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryMedicationAdapter.OnMedicationBeforeSleepItemClickListener
    public void onItemSelectEdit(int index, SleepMedicationDetail medicationBeforeSleep) {
        Intrinsics.checkNotNullParameter(medicationBeforeSleep, "medicationBeforeSleep");
        Bundle bundle = new Bundle();
        bundle.putSerializable(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_DATA, medicationBeforeSleep);
        bundle.putInt(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_ACTION_INDEX, index);
        Long preSleepRoutineTime = SleepDiaryUpdateFragment.access$getMViewModel(this.this$0).getUpdateSleepDiaryInfo().getPreSleepRoutineTime();
        if (preSleepRoutineTime != null) {
            bundle.putLong(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_DATA_SLEEP_TIME, preSleepRoutineTime.longValue());
        }
        bundle.putLong(SleepDiaryMedicationUpdateFragment.INTENT_REQUEST_DATA_DIARY_TIME, SleepDiaryUpdateFragment.access$getMViewModel(this.this$0).getUpdateSleepDiaryInfo().getTime());
        BaseFragmentExKt.gotoPageForResult(this.this$0, (Class<?>) SleepDiaryMedicationUpdateFragment.class, bundle, 1001);
    }
}
