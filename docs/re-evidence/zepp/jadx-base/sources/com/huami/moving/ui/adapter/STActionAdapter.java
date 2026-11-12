package com.huami.moving.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.R;
import com.huami.moving.model.StrengthTrainingAction;
import com.huami.moving.ui.adapter.STActionAdapter;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.ActionList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()*B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/huami/moving/ui/adapter/STActionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "getItemViewType", "", "Lcom/huami/moving/model/StrengthTrainingAction;", "searchList", "setSearchResultList", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Ljava/util/List;", ActionList.ELEM_NAME, "c", LogUtil.I, "TYPE_HEADER", GoogleApiAvailabilityLight.a, "TYPE_ITEM", "Lcom/huami/moving/ui/adapter/STActionAdapter$SelectListener;", "e", "Lcom/huami/moving/ui/adapter/STActionAdapter$SelectListener;", "getSelectListener", "()Lcom/huami/moving/ui/adapter/STActionAdapter$SelectListener;", "setSelectListener", "(Lcom/huami/moving/ui/adapter/STActionAdapter$SelectListener;)V", "selectListener", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "SelectListener", "ViewHolderActionItem", "ViewHolderHeader", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class STActionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<StrengthTrainingAction> actionList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int TYPE_HEADER;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int TYPE_ITEM = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SelectListener selectListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/adapter/STActionAdapter$SelectListener;", "", "", "actionType", "", "doSelect", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface SelectListener {
        void doSelect(int actionType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/moving/ui/adapter/STActionAdapter$ViewHolderActionItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/moving/model/StrengthTrainingAction;", "sta", "", "position", "", "bindData", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "action", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/moving/ui/adapter/STActionAdapter;Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolderActionItem extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView action;

        public ViewHolderActionItem(View view) {
            super(view);
            this.action = (TextView) view.findViewById(R.id.tv_st_action);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(STActionAdapter sTActionAdapter, StrengthTrainingAction strengthTrainingAction, View view) {
            SelectListener selectListener = sTActionAdapter.getSelectListener();
            if (selectListener == null) {
                return;
            }
            selectListener.doSelect(strengthTrainingAction.getActionType());
        }

        public final void bindData(@NotNull final StrengthTrainingAction sta, int position) {
            this.action.setText(sta.getActionName());
            if (position % 2 != 0) {
                this.action.setBackgroundResource(R.color.s4);
            } else {
                this.action.setBackgroundResource(R.drawable.shape_rect_white_corner_6);
            }
            View view = this.itemView;
            final STActionAdapter sTActionAdapter = STActionAdapter.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: zg6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    STActionAdapter.ViewHolderActionItem.b(sTActionAdapter, sta, view2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/adapter/STActionAdapter$ViewHolderHeader;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolderHeader extends RecyclerView.ViewHolder {
        public ViewHolderHeader(@NotNull View view) {
            super(view);
        }
    }

    public STActionAdapter(@NotNull Context context, @NotNull List<StrengthTrainingAction> list) {
        this.context = context;
        this.actionList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.actionList.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? this.TYPE_HEADER : this.TYPE_ITEM;
    }

    @Nullable
    public final SelectListener getSelectListener() {
        return this.selectListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderActionItem) {
            int i = position - 1;
            ((ViewHolderActionItem) holder).bindData(this.actionList.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return viewType == this.TYPE_ITEM ? new ViewHolderActionItem(LayoutInflater.from(this.context).inflate(R.layout.item_st_action, parent, false)) : new ViewHolderHeader(LayoutInflater.from(this.context).inflate(R.layout.item_st_action_header, parent, false));
    }

    public final void setSearchResultList(@NotNull List<StrengthTrainingAction> searchList) {
        this.actionList = searchList;
    }

    public final void setSelectListener(@Nullable SelectListener selectListener) {
        this.selectListener = selectListener;
    }
}
