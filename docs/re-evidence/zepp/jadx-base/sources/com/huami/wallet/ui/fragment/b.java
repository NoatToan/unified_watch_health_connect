package com.huami.wallet.ui.fragment;

import android.annotation.SuppressLint;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.huami.wallet.ui.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/wallet/ui/fragment/b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "a", "", "position", "b", LogUtil.I, "checked", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
final class b extends BaseQuickAdapter<ReturnCardReason, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int checked;

    public b() {
        super(R.layout.wl_item_radio);
        this.checked = -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull ReturnCardReason item) {
        int i = R.id.checkbox;
        helper.setText(i, item.getTitle()).setChecked(i, this.checked == helper.getAdapterPosition());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void b(int position) {
        if (this.checked != position) {
            this.checked = position;
            notifyDataSetChanged();
        }
    }
}
