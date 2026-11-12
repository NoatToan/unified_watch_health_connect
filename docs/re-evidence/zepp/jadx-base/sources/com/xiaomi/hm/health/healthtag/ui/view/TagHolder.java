package com.xiaomi.hm.health.healthtag.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.healthtag.core.dto.HealthDataTagType;
import com.xiaomi.hm.health.healthtag.ui.vo.TagInfoVo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/view/TagHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "item", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TagHolder extends RecyclerView.ViewHolder {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ TagInfoVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TagInfoVo tagInfoVo) {
            super(0);
            this.a = tagInfoVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add s2 " + this.a;
        }
    }

    public TagHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_select_tag_layout, viewGroup, false));
    }

    public final void bindTo(@Nullable TagInfoVo item) {
        int color;
        View view = this.itemView;
        int i = com.xiaomi.hm.health.R.id.titleTv;
        ((TextView) view.findViewById(i)).setText(item == null ? null : item.getTag());
        TextView textView = (TextView) view.findViewById(i);
        if (item != null && item.getTagType() == HealthDataTagType.INSTANCE.getADD()) {
            HMLog.info("TagHolder", new a(item));
            color = ContextCompat.getColor(view.getContext(), R.color.s2);
        } else {
            color = item != null && item.isSelect() ? ContextCompat.getColor(view.getContext(), R.color.s5) : ContextCompat.getColor(view.getContext(), R.color.s1);
        }
        textView.setTextColor(color);
        ((TextView) view.findViewById(i)).setBackground(item != null && item.isSelect() ? ContextCompat.getDrawable(view.getContext(), R.drawable.stress_edit_tag_selected_bg) : ContextCompat.getDrawable(view.getContext(), R.drawable.stress_edit_tag_bg));
        ((TextView) view.findViewById(i)).setTextSize(item != null && item.getTagType() == HealthDataTagType.INSTANCE.getADD() ? 18.0f : 13.0f);
    }
}
