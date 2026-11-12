package com.huami.watchfacesstore.ui.adapter;

import android.content.Context;
import android.widget.ImageView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.view.SelectColorView;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0007R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/ColorAdapter;", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "", "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "position", "item", "", "convert", "(Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;ILjava/lang/Integer;)V", "updateSelectPosition", "resetColorSelect", "", GoogleApiAvailabilityLight.b, "Ljava/util/List;", "getData", "()Ljava/util/List;", "data", "o", LogUtil.I, "getPrePosition", "()I", "setPrePosition", "(I)V", "prePosition", b.r, "getSelectPosition", "setSelectPosition", "selectPosition", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "layoutRes", "<init>", "(Landroid/content/Context;Ljava/util/List;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ColorAdapter extends BaseRVAdapter<Integer> {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> data;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int prePosition;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int selectPosition;

    public ColorAdapter(@NotNull Context context, @NotNull List<Integer> list, int i) {
        super(context, list, i);
        this.data = list;
        this.prePosition = -1;
        this.selectPosition = -1;
    }

    @NotNull
    public final List<Integer> getData() {
        return this.data;
    }

    public final int getPrePosition() {
        return this.prePosition;
    }

    public final int getSelectPosition() {
        return this.selectPosition;
    }

    public final void resetColorSelect() {
        updateSelectPosition(-1);
    }

    public final void setPrePosition(int i) {
        this.prePosition = i;
    }

    public final void setSelectPosition(int i) {
        this.selectPosition = i;
    }

    public final void updateSelectPosition(int position) {
        if (position < 0) {
            int i = this.selectPosition;
            this.selectPosition = position;
            notifyItemChanged(i);
            this.prePosition = position;
            return;
        }
        this.selectPosition = position;
        int i2 = this.prePosition;
        if (i2 > -1) {
            notifyItemChanged(i2);
        }
        notifyItemChanged(position);
        this.prePosition = position;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
    public void convert(@NotNull ViewHolder holder, int position, @Nullable Integer item) {
        int layoutResId = getLayoutResId(item, position);
        if (layoutResId == R.layout.wf_item_color_selector) {
            SelectColorView selectColorView = (SelectColorView) holder.itemView;
            if (position == this.data.size() - 1) {
                selectColorView.setImage();
            } else {
                selectColorView.setColor(item.intValue());
            }
            selectColorView.setColorSelect(position == this.selectPosition);
            return;
        }
        if (layoutResId == R.layout.wf_item_more_color_selector) {
            holder.itemView.setBackgroundColor(item.intValue());
            ImageView imageView = (ImageView) holder.getView(R.id.selected_img);
            if (position == this.selectPosition) {
                ExtensionsKt.visible(imageView);
            } else {
                ExtensionsKt.gone(imageView);
            }
        }
    }
}
