package com.xiaomi.fitness.sport.sporttab.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.sport.sporttab.util.SportTabOneTrackExtKt;
import com.xiaomi.fitness.sport.sporttab.viewholder.TrainingIndexHolder$addScrollListener$scrollListener$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/xiaomi/fitness/sport/sporttab/viewholder/TrainingIndexHolder$addScrollListener$scrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrainingIndexHolder$addScrollListener$scrollListener$1 extends RecyclerView.s {
    final /* synthetic */ Ref.IntRef $mDx;
    final /* synthetic */ TrainingIndexHolder this$0;

    public TrainingIndexHolder$addScrollListener$scrollListener$1(Ref.IntRef intRef, TrainingIndexHolder trainingIndexHolder) {
        this.$mDx = intRef;
        this.this$0 = trainingIndexHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onScrollStateChanged$lambda$0(TrainingIndexHolder this$0, HomeDataType homeDataType, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportTabOneTrackExtKt.oneTrackOnTrainingIndexEntranceExpose(this$0.oneTrackReportMap, homeDataType, num);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, newState);
        if (newState == 0) {
            if (this.$mDx.element > 0) {
                SportTabOneTrackExtKt.oneTrackOneTrainingIndexCardScrollLeft();
            }
            final TrainingIndexHolder trainingIndexHolder = this.this$0;
            trainingIndexHolder.getVisibleRangeAndDealWithExpose(new Function2() { // from class: gtp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TrainingIndexHolder$addScrollListener$scrollListener$1.onScrollStateChanged$lambda$0(trainingIndexHolder, (HomeDataType) obj, (Integer) obj2);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, dx, dy);
        this.$mDx.element = dx;
    }
}
