package com.huami.training.ui.common.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.dto.Difficulty;
import com.huami.training.ext.ImageViewExKt;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.R;
import com.huami.training.ui.widget.RoundImageView;
import com.huami.training.vo.TrainingVo;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/training/ui/common/viewholder/MiDongCourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/training/vo/TrainingVo;", "item", "", "bind", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiDongCourseViewHolder extends RecyclerView.ViewHolder {

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

    public MiDongCourseViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tr_item_course_v2, viewGroup, false));
    }

    public final void bind(@NotNull TrainingVo item) {
        String string;
        View view = this.itemView;
        ImageViewExKt.loadUrl((RoundImageView) view.findViewById(R.id.image), item.getImage());
        ((TypefaceTextView) view.findViewById(R.id.name)).setText(item.getName());
        TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(R.id.level);
        Difficulty difficulty = item.getDifficulty();
        int i = difficulty == null ? -1 : WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
        if (i == 1) {
            string = view.getContext().getString(R.string.tr_difficulty_junior);
        } else if (i != 2) {
            string = i != 3 ? "" : view.getContext().getString(R.string.tr_difficulty_senior);
        } else {
            string = view.getContext().getString(R.string.tr_difficulty_intermediate);
        }
        typefaceTextView.setText(string);
        ((TypefaceTextView) view.findViewById(R.id.calorie)).setText(view.getResources().getQuantityString(R.plurals.tr_cal, item.getCalorie(), Integer.valueOf(item.getCalorie())));
        ((TypefaceTextView) view.findViewById(R.id.number)).setText(view.getResources().getQuantityString(R.plurals.tr_course_number, item.getCourseCount(), Integer.valueOf(item.getCourseCount())));
        ((TypefaceTextView) view.findViewById(R.id.participants)).setText(view.getResources().getQuantityString(R.plurals.tr_study_number, item.getParticipants(), Integer.valueOf(item.getParticipants())));
        int i2 = R.id.label;
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) view.findViewById(i2);
        String label = item.getLabel();
        ViewExKt.setVisible(typefaceTextView2, true ^ (label == null || m.isBlank(label)));
        ((TypefaceTextView) view.findViewById(i2)).setText(item.getLabel());
    }
}
