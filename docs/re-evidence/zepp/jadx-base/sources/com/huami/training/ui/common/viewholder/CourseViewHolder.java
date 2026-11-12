package com.huami.training.ui.common.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.dto.Difficulty;
import com.huami.training.ext.ImageViewExKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.R;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.common.MiFitCourseLayoutDelegate;
import com.huami.training.vo.TrainingVo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/huami/training/ui/common/viewholder/CourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/training/vo/TrainingVo;", "item", "", "bind", "Landroid/view/ViewGroup;", "parent", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "<init>", "(Landroid/view/ViewGroup;Lcom/huami/training/ui/common/CourseLayoutDelegate;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class CourseViewHolder extends RecyclerView.ViewHolder {

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

    public /* synthetic */ CourseViewHolder(ViewGroup viewGroup, CourseLayoutDelegate courseLayoutDelegate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i & 2) != 0 ? new MiFitCourseLayoutDelegate() : courseLayoutDelegate);
    }

    public final void bind(@NotNull TrainingVo item) {
        String string;
        View view = this.itemView;
        ImageViewExKt.loadUrl((ImageView) view.findViewById(R.id.image), item.getImage());
        ((TextView) view.findViewById(R.id.name)).setText(item.getName());
        TextView textView = (TextView) view.findViewById(R.id.level);
        Difficulty difficulty = item.getDifficulty();
        int i = difficulty == null ? -1 : WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
        if (i == 1) {
            string = view.getContext().getString(R.string.tr_difficulty_junior);
        } else if (i != 2) {
            string = i != 3 ? "" : view.getContext().getString(R.string.tr_difficulty_senior);
        } else {
            string = view.getContext().getString(R.string.tr_difficulty_intermediate);
        }
        textView.setText(string);
        ((TextView) view.findViewById(R.id.calorie)).setText(view.getResources().getQuantityString(R.plurals.tr_cal, item.getCalorie(), Integer.valueOf(item.getCalorie())));
        ((TextView) view.findViewById(R.id.number)).setText(view.getResources().getQuantityString(R.plurals.tr_course_number, item.getCourseCount(), Integer.valueOf(item.getCourseCount())));
        ((TextView) view.findViewById(R.id.participants)).setText(view.getResources().getQuantityString(R.plurals.tr_study_number, item.getParticipants(), Integer.valueOf(item.getParticipants())));
        TextView textView2 = (TextView) view.findViewById(R.id.label);
        String label = item.getLabel();
        ViewExKt.setVisible(textView2, !(label == null || m.isBlank(label)));
        textView2.setText(item.getLabel());
    }

    public CourseViewHolder(@NotNull ViewGroup viewGroup, @NotNull CourseLayoutDelegate courseLayoutDelegate) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(courseLayoutDelegate.getCourseItem(), viewGroup, false));
    }
}
