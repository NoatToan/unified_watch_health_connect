package com.xiaomi.hm.health.device.assistant.smart;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.femalehealth.logiclib.helper.ext.ImageViewExKt;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.lib.view.quickadapter.MultiTypeDelegate;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.assistant.smart.vo.DisplayItemVo;
import com.xiaomi.hm.health.device.assistant.smart.vo.DisplayItemVoWithUrl;
import com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00015BF\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0!\u0012%\b\u0002\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\t\u0018\u00010%\u0012\b\b\u0002\u00102\u001a\u00020\r¢\u0006\u0004\b3\u00104J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J \u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0016R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R3\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\t\u0018\u00010%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00102\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/AssistantCardAdapter;", "Lcom/huami/lib/view/quickadapter/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/ItemVo;", "Lcom/huami/lib/view/quickadapter/BaseViewHolder;", "Lcom/xiaomi/hm/health/device/assistant/smart/ItemTouchHelperAdapter;", "Lcom/huami/lib/view/quickadapter/MultiTypeDelegate;", "o", "holder", "item", "", "m", GoogleApiAvailabilityLight.b, "l", "", "fromPosition", "toPosition", b.r, "helper", "convert", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "canMove", "onItemMove", "position", "onItemDismiss", "selected", "onSelectedChanged", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "current", "target", "canDropOver", "Lkotlin/Function0;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/jvm/functions/Function0;", "resortData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "limit", "B", "Lkotlin/jvm/functions/Function1;", "onLimit", "C", LogUtil.I, "getLimitSize", "()I", "setLimitSize", "(I)V", "limitSize", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AssistantCardAdapter extends BaseQuickAdapter<ItemVo, BaseViewHolder> implements ItemTouchHelperAdapter {
    private static final int D = 0;
    private static final int E = -2;
    public static final int TYPE_LINE = -1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> resortData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private final Function1<Integer, Unit> onLimit;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int limitSize;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onSelectedChanged --> " + this.a;
        }
    }

    public /* synthetic */ AssistantCardAdapter(Function0 function0, Function1 function1, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i2 & 2) != 0 ? null : function1, (i2 & 4) != 0 ? 20 : i);
    }

    private final void l(BaseViewHolder holder, ItemVo item) {
        ViewExKt.setVisible(holder.itemView, item.getIsEnable());
    }

    private final void m(BaseViewHolder holder, ItemVo item) {
        View view = holder.itemView;
        view.setTag(R.id.custom_tag, Integer.valueOf(item.getType()));
        ImageView imageView = (ImageView) view.findViewById(R.id.sort_icon);
        TextView textView = (TextView) view.findViewById(R.id.sort_item_text);
        ViewExKt.setVisible(view.findViewById(R.id.sort_item_sub_text), false);
        if (item instanceof DisplayItemVo) {
            DisplayItemVo displayItemVo = (DisplayItemVo) item;
            textView.setText(displayItemVo.getTitleRes());
            imageView.setImageResource(displayItemVo.getIconRes());
        } else if (item instanceof DisplayItemVoWithUrl) {
            DisplayItemVoWithUrl displayItemVoWithUrl = (DisplayItemVoWithUrl) item;
            textView.setText(displayItemVoWithUrl.getTitle());
            ImageViewExKt.loadUrl(imageView, displayItemVoWithUrl.getIconUrl());
        }
    }

    private final void n(BaseViewHolder holder, ItemVo item) {
        holder.itemView.setTag(R.id.custom_tag, Integer.valueOf(item.getType()));
        ViewExKt.setVisible(holder.itemView, true);
    }

    private final MultiTypeDelegate<ItemVo> o() {
        MultiTypeDelegate<ItemVo> multiTypeDelegate = new MultiTypeDelegate<ItemVo>() { // from class: com.xiaomi.hm.health.device.assistant.smart.AssistantCardAdapter$createMultiTypeDelegate$1
            @Override // com.huami.lib.view.quickadapter.MultiTypeDelegate
            public int getItemType(@NotNull ItemVo t) {
                int type = t.getType();
                if (type != -2) {
                    return type != -1 ? 0 : -1;
                }
                return -2;
            }
        };
        multiTypeDelegate.registerItemType(0, R.layout.smart_card_item_app_layout);
        multiTypeDelegate.registerItemType(-1, R.layout.smart_sort_item_title);
        multiTypeDelegate.registerItemType(-2, R.layout.sort_list_app_footer);
        return multiTypeDelegate;
    }

    private final void p(int fromPosition, int toPosition) {
        ItemVo itemVo = getData().get(fromPosition);
        getData().set(fromPosition, getData().get(toPosition));
        getData().set(toPosition, itemVo);
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public boolean canDropOver(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder current, @NotNull RecyclerView.ViewHolder target) {
        return !Intrinsics.areEqual(target.itemView.getTag(R.id.custom_tag), (Object) (-1)) || target.getAdapterPosition() < this.limitSize || current.getAdapterPosition() <= target.getAdapterPosition();
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public boolean canMove(@NotNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getItemViewType() == 0;
    }

    public final int getLimitSize() {
        return this.limitSize;
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public void onItemDismiss(int position) {
        notifyItemRemoved(position);
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public void onItemMove(int fromPosition, int toPosition) {
        notifyItemMoved(fromPosition, toPosition);
        p(fromPosition, toPosition);
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.ItemTouchHelperAdapter
    public void onSelectedChanged(@NotNull RecyclerView.ViewHolder viewHolder, boolean selected) {
        HMLog.debug$default(null, new a(selected), 1, null);
        if (selected) {
            return;
        }
        this.resortData.invoke();
    }

    public final void setLimitSize(int i) {
        this.limitSize = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssistantCardAdapter(@NotNull Function0<Unit> function0, @Nullable Function1<? super Integer, Unit> function1, int i) {
        super(CollectionsKt__CollectionsKt.emptyList());
        this.resortData = function0;
        this.onLimit = function1;
        this.limitSize = i;
        setMultiTypeDelegate(o());
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull ItemVo item) {
        int itemViewType = helper.getItemViewType();
        if (itemViewType == -2) {
            l(helper, item);
        } else if (itemViewType == -1) {
            n(helper, item);
        } else {
            if (itemViewType != 0) {
                return;
            }
            m(helper, item);
        }
    }
}
