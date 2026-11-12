package com.huami.wallet.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.wallet.lib.entity.BusCardListItem;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.entity.BusCardItemSection;
import com.huami.wallet.ui.utils.ImageLoadUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.utils.TintUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/wallet/ui/adapter/BusCardListSectionAdapter;", "Lcom/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lcom/huami/wallet/ui/entity/BusCardItemSection;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "Landroid/widget/TextView;", "stateTextView", "Lcom/huami/wallet/ui/adapter/BusCardListSectionAdapter$StateStyle;", "stateStyle", "", "a", "helper", "busCardItemSection", "convert", "item", "convertHead", "holder", "", "position", "onBindViewHolder", "layoutResId", "sectionHeadResId", "", "data", "<init>", "(IILjava/util/List;)V", "StateStyle", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BusCardListSectionAdapter extends BaseSectionQuickAdapter<BusCardItemSection, BaseViewHolder> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huami/wallet/ui/adapter/BusCardListSectionAdapter$StateStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Opened", "CanOpen", "CantOpen", "CantOpenButShowArrow", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public enum StateStyle {
        Opened,
        CanOpen,
        CantOpen,
        CantOpenButShowArrow
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateStyle.values().length];
            iArr[StateStyle.CanOpen.ordinal()] = 1;
            iArr[StateStyle.CantOpen.ordinal()] = 2;
            iArr[StateStyle.CantOpenButShowArrow.ordinal()] = 3;
            iArr[StateStyle.Opened.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BusCardListSectionAdapter(int i, int i2, @Nullable List<? extends BusCardItemSection> list) {
        super(i, i2, list);
    }

    private final void a(TextView stateTextView, StateStyle stateStyle) {
        Context context = stateTextView.getContext();
        int i = R.drawable.wl_ic_arrow_right;
        int i2 = R.color.s1;
        Drawable drawableTintDrawable = TintUtils.tintDrawable(context, i, i2);
        Drawable drawableTintDrawable2 = TintUtils.tintDrawable(context, i, android.R.color.transparent);
        int i3 = WhenMappings.$EnumSwitchMapping$0[stateStyle.ordinal()];
        if (i3 == 1) {
            stateTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
            stateTextView.setTextColor(ContextCompat.getColor(context, R.color.s2));
            return;
        }
        if (i3 == 2) {
            stateTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable2, (Drawable) null);
            stateTextView.setTextColor(ContextCompat.getColor(context, i2));
        } else if (i3 == 3) {
            stateTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
            stateTextView.setTextColor(ContextCompat.getColor(context, i2));
        } else {
            if (i3 != 4) {
                return;
            }
            stateTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableTintDrawable, (Drawable) null);
            stateTextView.setTextColor(ContextCompat.getColor(context, R.color.s15));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull BusCardItemSection busCardItemSection) {
        int i;
        BusCardListItem busCardListItem = (BusCardListItem) busCardItemSection.t;
        View view = helper.getView(R.id.wl_offline_mask);
        ImageView imageView = (ImageView) helper.getView(R.id.preview_image);
        ImageLoadUtils.loadImage(imageView, busCardListItem.imageUrl);
        int i2 = busCardListItem.state;
        if ((i2 == 8 || i2 == 10 || i2 == 12 || i2 == 11 || i2 == 14) && busCardListItem.shiftBalance != null) {
            try {
                helper.setText(R.id.name, Intrinsics.stringPlus(imageView.getContext().getString(R.string.wl_r_shift_balance), imageView.getContext().getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB((int) busCardListItem.shiftBalance.longValue()))));
                helper.setText(R.id.description, busCardListItem.name);
            } catch (Exception unused) {
                helper.setText(R.id.name, busCardListItem.name);
                helper.setText(R.id.description, busCardListItem.description);
            }
        } else {
            helper.setText(R.id.name, busCardListItem.name);
            helper.setText(R.id.description, busCardListItem.description);
        }
        TextView textView = (TextView) helper.getView(R.id.state);
        switch (busCardListItem.state) {
            case 0:
                i = R.string.wl_open_up_now;
                a(textView, StateStyle.CanOpen);
                view.setVisibility(8);
                break;
            case 1:
                i = R.string.wl_has_opened;
                a(textView, StateStyle.Opened);
                view.setVisibility(8);
                break;
            case 2:
                i = R.string.wl_not_finished;
                a(textView, StateStyle.CanOpen);
                view.setVisibility(8);
                break;
            case 3:
                i = R.string.wl_offline;
                a(textView, StateStyle.CantOpen);
                view.setVisibility(0);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                view.setVisibility(8);
                i = R.string.wl_cant_open;
                a(textView, StateStyle.CantOpen);
                break;
            case 8:
                i = R.string.wl_card_shift_in;
                a(textView, StateStyle.CanOpen);
                view.setVisibility(8);
                break;
            case 9:
                i = R.string.wl_r_shift_out_retry;
                a(textView, StateStyle.CanOpen);
                view.setVisibility(8);
                break;
            case 10:
            case 11:
            case 12:
            case 14:
                i = R.string.wl_card_shift_in_cant_hint;
                a(textView, StateStyle.CantOpenButShowArrow);
                view.setVisibility(8);
                break;
            case 13:
                i = R.string.wl_r_shift_in_retry;
                a(textView, StateStyle.CanOpen);
                view.setVisibility(8);
                break;
            case 15:
                i = R.string.wl_return_exception;
                a(textView, StateStyle.CanOpen);
                view.setVisibility(8);
                break;
            default:
                return;
        }
        if (busCardListItem.isParent) {
            textView.setText("");
        } else {
            textView.setText(i);
        }
    }

    @Override // com.chad.library.adapter.base.BaseSectionQuickAdapter
    public void convertHead(@NotNull BaseViewHolder helper, @NotNull BusCardItemSection item) {
        helper.setText(R.id.head_title, item.header);
    }

    @Override // com.chad.library.adapter.base.BaseSectionQuickAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BaseViewHolder holder, int position) {
        if (holder.getItemViewType() == 1092) {
            if (position == 0) {
                holder.setGone(R.id.head_top_divider, false);
            } else {
                holder.setGone(R.id.head_top_divider, true);
            }
        }
        super.onBindViewHolder(holder, position);
    }
}
