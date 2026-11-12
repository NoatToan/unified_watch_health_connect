package com.xiaomi.hm.health.device;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.lib.view.quickadapter.MultiTypeDelegate;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u001b\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002:;B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b8\u00109J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\fH\u0016R\u0019\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020!0 8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010)\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00103\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/device/SmartCardAdapter;", "Lcom/huami/lib/view/quickadapter/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/device/DisplaySettingVo;", "Lcom/huami/lib/view/quickadapter/BaseViewHolder;", "Lcom/xiaomi/hm/health/device/ItemTouchHelperAdapter;", "Lcom/huami/lib/view/quickadapter/MultiTypeDelegate;", GoogleApiAvailabilityLight.b, "helper", "item", "", "l", "m", "", "fromPosition", "toPosition", "o", "convert", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "canMove", "actionState", "onSelectedChanged", "onItemMove", "position", "onItemDismiss", "Lcom/xiaomi/hm/health/device/SmartCardAdapter$OnCardsMaxListener;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/device/SmartCardAdapter$OnCardsMaxListener;", "getListener", "()Lcom/xiaomi/hm/health/device/SmartCardAdapter$OnCardsMaxListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/lifecycle/MutableLiveData;", "", "B", "Landroidx/lifecycle/MutableLiveData;", "getSortedResult", "()Landroidx/lifecycle/MutableLiveData;", "sortedResult", "C", "Z", "isShowDialog", "()Z", "setShowDialog", "(Z)V", LogUtil.D, LogUtil.I, "getStartPos", "()I", "setStartPos", "(I)V", "startPos", "E", "getEndPos", "setEndPos", "endPos", "<init>", "(Lcom/xiaomi/hm/health/device/SmartCardAdapter$OnCardsMaxListener;)V", "Companion", "OnCardsMaxListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartCardAdapter extends BaseQuickAdapter<DisplaySettingVo, BaseViewHolder> implements ItemTouchHelperAdapter {
    public static final int MAX_COUNT_SHOW = 8;
    public static final int VIEW_TYPE_ITEM = 0;
    public static final int VIEW_TYPE_ITEM_FIXED = 2;
    public static final int VIEW_TYPE_TITLE = 1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final OnCardsMaxListener listener;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<DisplaySettingVo>> sortedResult;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isShowDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int startPos;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int endPos;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/SmartCardAdapter$OnCardsMaxListener;", "", "", "onCardsMax", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnCardsMaxListener {
        void onCardsMax();
    }

    public SmartCardAdapter(@NotNull OnCardsMaxListener onCardsMaxListener) {
        super(CollectionsKt__CollectionsKt.emptyList());
        this.listener = onCardsMaxListener;
        this.sortedResult = new MutableLiveData<>();
        this.startPos = -1;
        this.endPos = -1;
        setMultiTypeDelegate(n());
    }

    private final void l(BaseViewHolder helper, DisplaySettingVo item) {
        View view = helper.itemView;
        if (item.getTitleRes() != 0) {
            ((TextView) view.findViewById(R.id.sort_item_text)).setText(item.getTitleRes());
        }
        ViewExKt.setVisible((TextView) view.findViewById(R.id.sort_item_sub_text), false);
        if (item.getIconRes() != 0) {
            ((AppCompatImageView) view.findViewById(R.id.sort_icon)).setImageResource(item.getIconRes());
        }
    }

    private final void m(BaseViewHolder helper, DisplaySettingVo item) {
        ((TextView) helper.itemView.findViewById(R.id.sort_item_title)).setText(item.getTitleRes());
    }

    private final MultiTypeDelegate<DisplaySettingVo> n() {
        MultiTypeDelegate<DisplaySettingVo> multiTypeDelegate = new MultiTypeDelegate<DisplaySettingVo>() { // from class: com.xiaomi.hm.health.device.SmartCardAdapter$createMultiTypeDelegate$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ItemType.values().length];
                    iArr[ItemType.TYPE_TITLE.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.huami.lib.view.quickadapter.MultiTypeDelegate
            public int getItemType(@NotNull DisplaySettingVo t) {
                if (WhenMappings.$EnumSwitchMapping$0[t.getItemType().ordinal()] == 1) {
                    return 1;
                }
                return t.getStatus() == AppCardStatus.FIX ? 2 : 0;
            }
        };
        multiTypeDelegate.registerItemType(0, R.layout.sort_item_app_layout);
        multiTypeDelegate.registerItemType(2, R.layout.sort_item_app_layout_fixed);
        multiTypeDelegate.registerItemType(1, R.layout.sort_item_title);
        return multiTypeDelegate;
    }

    private final void o(int fromPosition, int toPosition) {
        int iNextIndex;
        DisplaySettingVo displaySettingVo = getData().get(fromPosition);
        DisplaySettingVo displaySettingVo2 = getData().get(toPosition);
        if (displaySettingVo.getStatus() == displaySettingVo2.getStatus()) {
            List<DisplaySettingVo> data = getData();
            ListIterator<DisplaySettingVo> listIterator = data.listIterator(data.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else {
                    if (listIterator.previous().getItemType() == ItemType.TYPE_TITLE) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
            }
            if (toPosition <= iNextIndex) {
                displaySettingVo.setStatus(AppCardStatus.VISIBLE);
            } else {
                displaySettingVo.setStatus(AppCardStatus.HIDDEN);
            }
            Collections.swap(getData(), fromPosition, toPosition);
        } else {
            displaySettingVo.setStatus(displaySettingVo2.getStatus());
            getData().remove(fromPosition);
            getData().add(toPosition, displaySettingVo);
        }
        this.sortedResult.setValue(getData());
    }

    @Override // com.xiaomi.hm.health.device.ItemTouchHelperAdapter
    public boolean canMove(@NotNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getItemViewType() == 0;
    }

    public final int getEndPos() {
        return this.endPos;
    }

    @NotNull
    public final OnCardsMaxListener getListener() {
        return this.listener;
    }

    @NotNull
    public final MutableLiveData<List<DisplaySettingVo>> getSortedResult() {
        return this.sortedResult;
    }

    public final int getStartPos() {
        return this.startPos;
    }

    /* JADX INFO: renamed from: isShowDialog, reason: from getter */
    public final boolean getIsShowDialog() {
        return this.isShowDialog;
    }

    @Override // com.xiaomi.hm.health.device.ItemTouchHelperAdapter
    public void onItemDismiss(int position) {
        notifyItemRemoved(position);
    }

    @Override // com.xiaomi.hm.health.device.ItemTouchHelperAdapter
    public void onItemMove(int fromPosition, int toPosition) {
        this.endPos = toPosition;
        notifyItemMoved(fromPosition, toPosition);
        o(fromPosition, toPosition);
    }

    @Override // com.xiaomi.hm.health.device.ItemTouchHelperAdapter
    public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState) {
        if (viewHolder != null && actionState != 0) {
            this.startPos = viewHolder.getAdapterPosition();
        }
        if (actionState != 0 || this.endPos == -1) {
            return;
        }
        List<DisplaySettingVo> data = getData();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = data.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!(((DisplaySettingVo) next).getStatus() == AppCardStatus.HIDDEN)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 8) {
            this.listener.onCardsMax();
            o(this.endPos, this.startPos);
        }
        notifyItemRangeChanged(Math.min(this.startPos, this.endPos), Math.abs(this.startPos - this.endPos) + 1);
    }

    public final void setEndPos(int i) {
        this.endPos = i;
    }

    public final void setShowDialog(boolean z) {
        this.isShowDialog = z;
    }

    public final void setStartPos(int i) {
        this.startPos = i;
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull DisplaySettingVo item) {
        if (helper.getItemViewType() == 1) {
            m(helper, item);
        } else {
            l(helper, item);
        }
    }
}
