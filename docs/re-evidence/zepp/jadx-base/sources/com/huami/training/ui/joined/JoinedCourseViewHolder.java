package com.huami.training.ui.joined;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.dto.TrainingType;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.R;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/huami/training/ui/joined/JoinedCourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/training/vo/JoinedCourseVo;", "item", "", "bind", "a", "Lcom/huami/training/vo/JoinedCourseVo;", "joinedCourseVo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class JoinedCourseViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private JoinedCourseVo joinedCourseVo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainingType.values().length];
            iArr[TrainingType.FEATURED_COURSE.ordinal()] = 1;
            iArr[TrainingType.ACTION.ordinal()] = 2;
            iArr[TrainingType.YOGA.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JoinedCourseViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tr_item_joined_course, viewGroup, false));
    }

    public final void bind(@Nullable JoinedCourseVo item) {
        this.joinedCourseVo = item;
        if (item == null) {
            return;
        }
        View view = this.itemView;
        ((TypefaceTextView) view.findViewById(R.id.name)).setText(item.getName());
        ((TypefaceTextView) view.findViewById(R.id.number)).setText(view.getResources().getQuantityString(R.plurals.tr_course_number, item.getCourseCount(), Integer.valueOf(item.getCourseCount())));
        if (item.getTrainTimes() == 0) {
            ((TypefaceTextView) view.findViewById(R.id.tv_end_top)).setText(view.getContext().getString(R.string.tr_has_not_train_yet));
        } else {
            ((TypefaceTextView) view.findViewById(R.id.tv_end_top)).setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(view.getResources().getQuantityString(R.plurals.tr_train_times, item.getTrainTimes(), Integer.valueOf(item.getTrainTimes())), view.getContext(), Font.LT, Integer.valueOf((int) ViewExKt.spToPx(view, 13.0f)), Integer.valueOf(ContextCompat.getColor(view.getContext(), R.color.tr_orange))));
        }
        int i = WhenMappings.$EnumSwitchMapping$0[item.getTrainingType().ordinal()];
        String string = "";
        if (i == 1) {
            String expiry = item.getExpiry();
            ((TypefaceTextView) view.findViewById(R.id.tv_end_bottom)).setText(expiry == null || expiry.length() == 0 ? "" : view.getResources().getString(R.string.tr_expiry, item.getExpiry()));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((TypefaceTextView) view.findViewById(R.id.tv_end_bottom)).setText("");
            return;
        }
        TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(R.id.tv_end_bottom);
        Boolean hasDownloaded = item.getHasDownloaded();
        if (Intrinsics.areEqual(hasDownloaded, Boolean.TRUE)) {
            string = view.getContext().getString(R.string.tr_has_downloaded);
        } else if (Intrinsics.areEqual(hasDownloaded, Boolean.FALSE)) {
            string = view.getContext().getString(R.string.tr_has_not_downloaded_yet);
        } else if (hasDownloaded != null) {
            throw new NoWhenBranchMatchedException();
        }
        typefaceTextView.setText(string);
    }
}
