package com.xiaomi.fitness.health.sleep.rhythm.diary;

import com.xiaomi.fit.fitness.export.data.project.SleepNapSituation;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment$mSleepDiarySleepInDayAdapter$2$1;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryUpdateFragment$mSleepDiarySleepInDayAdapter$2$1", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiarySleepInDayAdapter$OnSleepDiarySleepInDayItemClickListener;", "onItemSelectEdit", "", "index", "", "item", "Lcom/xiaomi/fit/fitness/export/data/project/SleepNapSituation;", "onItemSelectDelete", "deleteCallBack", "Lkotlin/Function0;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepDiaryUpdateFragment$mSleepDiarySleepInDayAdapter$2$1 implements SleepDiarySleepInDayAdapter.OnSleepDiarySleepInDayItemClickListener {
    final /* synthetic */ SleepDiaryUpdateFragment this$0;

    public SleepDiaryUpdateFragment$mSleepDiarySleepInDayAdapter$2$1(SleepDiaryUpdateFragment sleepDiaryUpdateFragment) {
        this.this$0 = sleepDiaryUpdateFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemSelectDelete$lambda$0(Function0 deleteCallBack, SleepDiaryUpdateFragment this$0, SleepNapSituation item) {
        Intrinsics.checkNotNullParameter(deleteCallBack, "$deleteCallBack");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        deleteCallBack.invoke();
        List<SleepNapSituation> napSituation = SleepDiaryUpdateFragment.access$getMViewModel(this$0).getUpdateSleepDiaryInfo().getNapSituation();
        if (napSituation != null && !napSituation.isEmpty()) {
            List<SleepNapSituation> napSituation2 = SleepDiaryUpdateFragment.access$getMViewModel(this$0).getUpdateSleepDiaryInfo().getNapSituation();
            Intrinsics.checkNotNull(napSituation2);
            List<SleepNapSituation> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) napSituation2);
            mutableList.remove(item);
            SleepDiaryUpdateFragment.access$getMViewModel(this$0).getUpdateSleepDiaryInfo().setNapSituation(mutableList);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiarySleepInDayAdapter.OnSleepDiarySleepInDayItemClickListener
    public void onItemSelectDelete(final SleepNapSituation item, final Function0<Unit> deleteCallBack) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(deleteCallBack, "deleteCallBack");
        final SleepDiaryUpdateFragment sleepDiaryUpdateFragment = this.this$0;
        sleepDiaryUpdateFragment.showRecordDeleteRemindDialog(new Function0() { // from class: llm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepDiaryUpdateFragment$mSleepDiarySleepInDayAdapter$2$1.onItemSelectDelete$lambda$0(deleteCallBack, sleepDiaryUpdateFragment, item);
            }
        });
    }

    @Override // com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiarySleepInDayAdapter.OnSleepDiarySleepInDayItemClickListener
    public void onItemSelectEdit(int index, SleepNapSituation item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.this$0.needUpdateSleepInDayTimeIndex = index;
        this.this$0.selectSleepInDayTime();
    }
}
