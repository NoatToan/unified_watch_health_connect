package com.huami.femalehealth.uilib.adapter;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.femalehealth.logiclib.helper.ext.ImageViewExKt;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.training.domain.model.DomainDifficulty;
import com.huami.training.domain.model.TrainingVo;
import kotlin.Metadata;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/uilib/adapter/TrainingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/training/domain/model/TrainingVo;", "item", "", "bind", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingViewHolder extends RecyclerView.ViewHolder {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DomainDifficulty.values().length];
            iArr[DomainDifficulty.JUNIOR.ordinal()] = 1;
            iArr[DomainDifficulty.INTERMEDIATE.ordinal()] = 2;
            iArr[DomainDifficulty.SENIOR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TrainingViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fh_item_training, viewGroup, false));
    }

    public final void bind(@NotNull TrainingVo item) {
        String string;
        View view = this.itemView;
        ImageViewExKt.loadUrl((ImageView) view.findViewById(R.id.iv_tr_img), item.getImage(), R.drawable.fh_img_placeholder);
        ((TextView) view.findViewById(R.id.tv_tr_name)).setText(item.getName());
        TextView textView = (TextView) view.findViewById(R.id.level);
        DomainDifficulty difficulty = item.getDifficulty();
        int i = difficulty == null ? -1 : WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
        if (i == 1) {
            string = view.getContext().getString(R.string.fh_difficulty_junior);
        } else if (i != 2) {
            string = i != 3 ? "" : view.getContext().getString(R.string.fh_difficulty_senior);
        } else {
            string = view.getContext().getString(R.string.fh_difficulty_intermediate);
        }
        textView.setText(string);
        ((TextView) view.findViewById(R.id.calorie)).setText(view.getResources().getQuantityString(R.plurals.fh_cal, (int) item.getCalorie(), Long.valueOf(item.getCalorie())));
        ((TextView) view.findViewById(R.id.number)).setText(view.getResources().getQuantityString(R.plurals.fh_course_number, item.getCourseCount(), Integer.valueOf(item.getCourseCount())));
        TextView textView2 = (TextView) view.findViewById(R.id.tv_label);
        String label = item.getLabel();
        ExtKt.setVisible$default(textView2, !(label == null || m.isBlank(label)), false, 2, null);
        textView2.setText(item.getLabel());
        TextView textView3 = (TextView) view.findViewById(R.id.number_learned);
        Integer number = item.getNumber();
        if (number != null) {
            ExtKt.setVisible$default(textView3, number.intValue() > 0, false, 2, null);
        }
        Resources resources = view.getResources();
        int i2 = R.plurals.fh_study_number;
        Integer number2 = item.getNumber();
        textView3.setText(resources.getQuantityString(i2, number2 == null ? 0 : number2.intValue(), item.getNumber()));
    }
}
