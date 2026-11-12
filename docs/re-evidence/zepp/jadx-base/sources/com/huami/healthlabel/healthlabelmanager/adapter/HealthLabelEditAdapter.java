package com.huami.healthlabel.healthlabelmanager.adapter;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.healthlabel.R;
import com.huami.healthlabel.healthlabelmanager.adapter.HealthLabelEditAdapter;
import com.huami.healthlabel.healthlabelmanager.helper.OnItemDeleteListener;
import com.huami.healthlabel.healthlabelmanager.helper.OnItemMoveListener;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001 B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0015J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\tR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEditAdapter;", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/huami/healthlabel/healthlabelmanager/adapter/HealthLabelEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "Lcom/huami/healthlabel/healthlabelmanager/helper/OnItemMoveListener;", "holder", "item", "", "convert", "", "fromPosition", "toPosition", "onItemMove", "Lcom/huami/healthlabel/healthlabelmanager/helper/OnItemDeleteListener;", "deleteListener", "setItemDeleteListener", "getNotInHomePosition", "Landroidx/recyclerview/widget/ItemTouchHelper;", "a", "Landroidx/recyclerview/widget/ItemTouchHelper;", "mItemTouchHelper", "", "b", "J", "mStartTime", "c", "Lcom/huami/healthlabel/healthlabelmanager/helper/OnItemDeleteListener;", "mOnItemDeleteListener", "", "healthLabelEntity", "<init>", "(Landroidx/recyclerview/widget/ItemTouchHelper;Ljava/util/List;)V", "Companion", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelEditAdapter extends BaseMultiItemQuickAdapter<HealthLabelEntity, BaseViewHolder> implements OnItemMoveListener {
    private static final int d = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ItemTouchHelper mItemTouchHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long mStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnItemDeleteListener mOnItemDeleteListener;

    public HealthLabelEditAdapter(@NotNull ItemTouchHelper itemTouchHelper, @NotNull List<HealthLabelEntity> list) {
        super(list);
        this.mItemTouchHelper = itemTouchHelper;
        int i = R.layout.item_label_manager_title;
        addItemType(1, i);
        addItemType(3, i);
        int i2 = R.layout.item_label_manager_label;
        addItemType(2, i2);
        addItemType(4, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(HealthLabelEditAdapter healthLabelEditAdapter, BaseViewHolder baseViewHolder, View view) {
        healthLabelEditAdapter.mItemTouchHelper.startDrag(baseViewHolder);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(HealthLabelEditAdapter healthLabelEditAdapter, BaseViewHolder baseViewHolder, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            healthLabelEditAdapter.mStartTime = System.currentTimeMillis();
            return false;
        }
        if (action != 1) {
            if (action == 2) {
                if (System.currentTimeMillis() - healthLabelEditAdapter.mStartTime <= 100) {
                    return false;
                }
                healthLabelEditAdapter.mItemTouchHelper.startDrag(baseViewHolder);
                return false;
            }
            if (action != 3) {
                return false;
            }
        }
        healthLabelEditAdapter.mStartTime = System.currentTimeMillis();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HealthLabelEditAdapter healthLabelEditAdapter, BaseViewHolder baseViewHolder, View view) {
        OnItemDeleteListener onItemDeleteListener = healthLabelEditAdapter.mOnItemDeleteListener;
        if (onItemDeleteListener == null) {
            return;
        }
        onItemDeleteListener.onItemDelete(baseViewHolder.getLayoutPosition());
    }

    public final int getNotInHomePosition() {
        int size = getData().size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (3 == ((HealthLabelEntity) getData().get(i)).getMyItemType()) {
                    return i;
                }
                if (i2 <= size) {
                    i = i2;
                }
            }
        }
        return -1;
    }

    @Override // com.huami.healthlabel.healthlabelmanager.helper.OnItemMoveListener
    public void onItemMove(int fromPosition, int toPosition) {
        int notInHomePosition = getNotInHomePosition();
        if (toPosition > 0) {
            HealthLabelEntity healthLabelEntity = (HealthLabelEntity) getData().get(fromPosition);
            healthLabelEntity.setShow(toPosition < notInHomePosition || (fromPosition > toPosition && toPosition == notInHomePosition));
            getData().remove(fromPosition);
            getData().add(toPosition, healthLabelEntity);
            notifyItemMoved(fromPosition, toPosition);
        }
    }

    public final void setItemDeleteListener(@NotNull OnItemDeleteListener deleteListener) {
        this.mOnItemDeleteListener = deleteListener;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"ClickableViewAccessibility"})
    public void convert(@NotNull final BaseViewHolder holder, @NotNull HealthLabelEntity item) {
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 1) {
            holder.setText(R.id.item_label_manager_title, this.mContext.getResources().getString(R.string.health_label_manager_show));
            return;
        }
        if (itemViewType != 2) {
            if (itemViewType == 3) {
                holder.setText(R.id.item_label_manager_title, this.mContext.getResources().getString(R.string.health_label_manager_not_show));
                return;
            } else if (itemViewType != 4) {
                return;
            }
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getView(R.id.item_label_manager_label);
        appCompatTextView.setText(item.getLabelText());
        appCompatTextView.setTextColor(Color.parseColor(item.getLabelColor()));
        appCompatTextView.setOnLongClickListener(new View.OnLongClickListener() { // from class: cw3
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return HealthLabelEditAdapter.d(this.a, holder, view);
            }
        });
        appCompatTextView.setOnTouchListener(new View.OnTouchListener() { // from class: dw3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return HealthLabelEditAdapter.e(this.a, holder, view, motionEvent);
            }
        });
        ((AppCompatImageView) holder.getView(R.id.item_label_manager_label_delete)).setOnClickListener(new View.OnClickListener() { // from class: bw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthLabelEditAdapter.f(this.a, holder, view);
            }
        });
    }
}
