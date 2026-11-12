package com.huami.watch.companion.ecg.ui.adapter;

import android.widget.TextView;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.model.TagSection;
import com.huami.watch.companion.ecg.util.EcgTagEnum;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u0014\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/adapter/EcgTagAdapter;", "Lcom/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lcom/huami/watch/companion/ecg/model/TagSection;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convertHead", "convert", "", "Lcom/huami/watch/companion/ecg/util/EcgTagEnum;", "tags", "setTags", "a", "Ljava/util/Set;", "mTags", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgTagAdapter extends BaseSectionQuickAdapter<TagSection, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Set<EcgTagEnum> mTags;

    public EcgTagAdapter() {
        super(R.layout.item_ecg_tag, R.layout.item_ecg_tag_header, null);
        this.mTags = new LinkedHashSet();
    }

    public final void setTags(@NotNull Set<EcgTagEnum> tags) {
        this.mTags.clear();
        this.mTags.addAll(tags);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull TagSection item) {
        EcgTagEnum ecgTagEnum = (EcgTagEnum) item.t;
        if (ecgTagEnum == null) {
            return;
        }
        TextView textView = (TextView) helper.getView(R.id.text);
        textView.setText(ecgTagEnum.getNameRes());
        textView.setSelected(this.mTags.contains(ecgTagEnum));
        helper.setGone(R.id.icon, this.mTags.contains(ecgTagEnum));
    }

    @Override // com.chad.library.adapter.base.BaseSectionQuickAdapter
    public void convertHead(@Nullable BaseViewHolder helper, @Nullable TagSection item) {
        if (item == null || helper == null) {
            return;
        }
        helper.setText(R.id.text, item.header);
    }
}
