package com.xiaomi.hm.health.device.watchskinstore.adapter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xiaomi.hm.health.device.watchskinnew.ui.SelectColorView;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/adapter/SelectColorAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convert", "(Lcom/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Integer;)V", "a", LogUtil.I, "getSelectPosition", "()I", "setSelectPosition", "(I)V", "selectPosition", "layoutResId", "", "data", "<init>", "(ILjava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SelectColorAdapter extends BaseQuickAdapter<Integer, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int selectPosition;

    public SelectColorAdapter(int i, @Nullable List<Integer> list) {
        super(i, list);
        this.selectPosition = -1;
    }

    public final int getSelectPosition() {
        return this.selectPosition;
    }

    public final void setSelectPosition(int i) {
        this.selectPosition = i;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @Nullable Integer item) {
        SelectColorView selectColorView = (SelectColorView) helper.itemView;
        int adapterPosition = helper.getAdapterPosition();
        if (adapterPosition == this.mData.size() - 1) {
            selectColorView.setImage();
        } else {
            selectColorView.setColor(item.intValue());
        }
        selectColorView.setColorSelect(adapterPosition == this.selectPosition);
    }
}
