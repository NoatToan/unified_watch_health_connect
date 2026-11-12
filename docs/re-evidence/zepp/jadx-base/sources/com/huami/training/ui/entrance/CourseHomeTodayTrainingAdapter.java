package com.huami.training.ui.entrance;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.dto.Difficulty;
import com.huami.training.ext.ImageViewExKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.helper.AppExecutors;
import com.huami.training.ui.R;
import com.huami.training.ui.entrance.CourseHomeTodayTrainingAdapter;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.utils.CountListItemVisitHelper;
import com.huami.training.vo.TrainingVo;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001f\b\u0016\u0018\u0000 (2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002()B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001c\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016RE\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006*"}, d2 = {"Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter$CourseHomeTodayTrainingViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "a", "Lkotlin/jvm/functions/Function2;", "getItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "itemClickListener", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getJoinCourseClickListener", "()Lkotlin/jvm/functions/Function1;", "setJoinCourseClickListener", "(Lkotlin/jvm/functions/Function1;)V", "joinCourseClickListener", "com/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter$countItemVisitHelper$2$1", "c", "Lkotlin/Lazy;", "()Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter$countItemVisitHelper$2$1;", "countItemVisitHelper", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "<init>", "(Lcom/huami/training/helper/AppExecutors;)V", "Companion", "CourseHomeTodayTrainingViewHolder", "ui_release"}, k = 1, mv = {1, 5, 1})
public class CourseHomeTodayTrainingAdapter extends ListAdapter<TrainingVo, CourseHomeTodayTrainingViewHolder> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DiffUtil.ItemCallback<TrainingVo> d = new DiffUtil.ItemCallback<TrainingVo>() { // from class: com.huami.training.ui.entrance.CourseHomeTodayTrainingAdapter$Companion$DIFF$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull TrainingVo oldItem, @NotNull TrainingVo newItem) {
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull TrainingVo oldItem, @NotNull TrainingVo newItem) {
            return oldItem.getId() == newItem.getId();
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function2<? super TrainingVo, ? super Integer, Unit> itemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super TrainingVo, Unit> joinCourseClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy countItemVisitHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter$Companion;", "", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huami/training/vo/TrainingVo;", "DIFF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDIFF", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiffUtil.ItemCallback<TrainingVo> getDIFF() {
            return CourseHomeTodayTrainingAdapter.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter$CourseHomeTodayTrainingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/training/vo/TrainingVo;", "item", "", "bind", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/training/ui/entrance/CourseHomeTodayTrainingAdapter;Landroid/view/ViewGroup;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public final class CourseHomeTodayTrainingViewHolder extends RecyclerView.ViewHolder {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Difficulty.values().length];
                iArr[Difficulty.JUNIOR.ordinal()] = 1;
                iArr[Difficulty.INTERMEDIATE.ordinal()] = 2;
                iArr[Difficulty.SENIOR.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public CourseHomeTodayTrainingViewHolder(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tr_item_today_training_v2, viewGroup, false));
        }

        public final void bind(@NotNull TrainingVo item) {
            String string;
            View view = this.itemView;
            ((TypefaceTextView) view.findViewById(R.id.tv_name)).setText(item.getName());
            ImageViewExKt.loadUrlWithCorner((ImageView) view.findViewById(R.id.iv_img), item.getSquareImageUrl(), Float.valueOf(ViewExKt.dpToPx(view, 9.6f)));
            int i = R.id.tv_lable;
            TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(i);
            String label = item.getLabel();
            ViewExKt.setVisible(typefaceTextView, !(label == null || m.isBlank(label)));
            if (((TypefaceTextView) view.findViewById(i)).getVisibility() == 0) {
                ((TypefaceTextView) view.findViewById(i)).setText(item.getLabel());
            }
            Difficulty difficulty = item.getDifficulty();
            int i2 = difficulty == null ? -1 : WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
            if (i2 == 1) {
                string = view.getContext().getString(R.string.tr_difficulty_junior);
            } else if (i2 != 2) {
                string = i2 != 3 ? "" : view.getContext().getString(R.string.tr_difficulty_senior);
            } else {
                string = view.getContext().getString(R.string.tr_difficulty_intermediate);
            }
            ((TypefaceTextView) view.findViewById(R.id.tv_rank_and_coursecount)).setText(Intrinsics.stringPlus(string, view.getResources().getQuantityString(R.plurals.tr_course_number, item.getCourseCount(), Integer.valueOf(item.getCourseCount()))));
            ((TypefaceTextView) view.findViewById(R.id.tv_cal)).setText(view.getResources().getQuantityString(R.plurals.tr_cal, item.getCalorie(), Integer.valueOf(item.getCalorie())));
            ((TypefaceTextView) view.findViewById(R.id.tv_study_number)).setText(view.getResources().getQuantityString(R.plurals.tr_study_number, item.getParticipants(), Integer.valueOf(item.getParticipants())));
        }
    }

    public CourseHomeTodayTrainingAdapter(@NotNull AppExecutors appExecutors) {
        super(new AsyncDifferConfig.Builder(d).setBackgroundThreadExecutor(appExecutors.getDiskIO()).build());
        this.countItemVisitHelper = LazyKt__LazyJVMKt.lazy(new Function0<CourseHomeTodayTrainingAdapter$countItemVisitHelper$2.AnonymousClass1>() { // from class: com.huami.training.ui.entrance.CourseHomeTodayTrainingAdapter$countItemVisitHelper$2
            /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.training.ui.entrance.CourseHomeTodayTrainingAdapter$countItemVisitHelper$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                return new CountListItemVisitHelper<TrainingVo>() { // from class: com.huami.training.ui.entrance.CourseHomeTodayTrainingAdapter$countItemVisitHelper$2.1
                    @Override // com.huami.training.utils.CountListItemVisitHelper
                    public void count(int position, @NotNull TrainingVo v) {
                        AnalyticsHelper.INSTANCE.countCourseVisitInTag(position, v.getLabel(), String.valueOf(v.getId()));
                    }
                };
            }
        });
    }

    private final CourseHomeTodayTrainingAdapter$countItemVisitHelper$2.AnonymousClass1 c() {
        return (CourseHomeTodayTrainingAdapter$countItemVisitHelper$2.AnonymousClass1) this.countItemVisitHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CourseHomeTodayTrainingViewHolder courseHomeTodayTrainingViewHolder, CourseHomeTodayTrainingAdapter courseHomeTodayTrainingAdapter, View view) {
        TrainingVo item;
        Function2<TrainingVo, Integer, Unit> itemClickListener;
        int adapterPosition = courseHomeTodayTrainingViewHolder.getAdapterPosition();
        boolean z = false;
        if (adapterPosition >= 0 && adapterPosition < courseHomeTodayTrainingAdapter.getPagerCount()) {
            z = true;
        }
        if (!z || (item = courseHomeTodayTrainingAdapter.getItem(adapterPosition)) == null || (itemClickListener = courseHomeTodayTrainingAdapter.getItemClickListener()) == null) {
            return;
        }
        itemClickListener.invoke(item, Integer.valueOf(adapterPosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CourseHomeTodayTrainingAdapter courseHomeTodayTrainingAdapter, CourseHomeTodayTrainingViewHolder courseHomeTodayTrainingViewHolder, View view) {
        Function1<TrainingVo, Unit> joinCourseClickListener = courseHomeTodayTrainingAdapter.getJoinCourseClickListener();
        if (joinCourseClickListener == null) {
            return;
        }
        joinCourseClickListener.invoke(courseHomeTodayTrainingAdapter.getItem(courseHomeTodayTrainingViewHolder.getAdapterPosition()));
    }

    @Nullable
    public final Function2<TrainingVo, Integer, Unit> getItemClickListener() {
        return this.itemClickListener;
    }

    @Nullable
    public final Function1<TrainingVo, Unit> getJoinCourseClickListener() {
        return this.joinCourseClickListener;
    }

    public final void setItemClickListener(@Nullable Function2<? super TrainingVo, ? super Integer, Unit> function2) {
        this.itemClickListener = function2;
    }

    public final void setJoinCourseClickListener(@Nullable Function1<? super TrainingVo, Unit> function1) {
        this.joinCourseClickListener = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CourseHomeTodayTrainingViewHolder holder, int position) {
        TrainingVo item = getItem(position);
        holder.bind(item);
        c().put(item, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CourseHomeTodayTrainingViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        final CourseHomeTodayTrainingViewHolder courseHomeTodayTrainingViewHolder = new CourseHomeTodayTrainingViewHolder(parent);
        courseHomeTodayTrainingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseHomeTodayTrainingAdapter.d(courseHomeTodayTrainingViewHolder, this, view);
            }
        });
        ((TypefaceTextView) courseHomeTodayTrainingViewHolder.itemView.findViewById(R.id.tv_join_course)).setOnClickListener(new View.OnClickListener() { // from class: g11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseHomeTodayTrainingAdapter.e(this.a, courseHomeTodayTrainingViewHolder, view);
            }
        });
        return courseHomeTodayTrainingViewHolder;
    }
}
