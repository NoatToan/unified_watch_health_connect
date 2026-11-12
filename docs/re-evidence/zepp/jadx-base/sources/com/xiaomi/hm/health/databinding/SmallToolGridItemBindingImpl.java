package com.xiaomi.hm.health.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.generated.callback.OnClickListener;
import com.xiaomi.hm.health.smalltool.ToolBinding;
import com.xiaomi.hm.health.smalltool.ToolViewModel;
import com.xiaomi.hm.health.smalltool.model.Tool;

/* JADX INFO: loaded from: classes20.dex */
public class SmallToolGridItemBindingImpl extends SmallToolGridItemBinding implements OnClickListener.Listener {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts d = null;

    @Nullable
    private static final SparseIntArray e;

    @NonNull
    private final ConstraintLayout a;

    @Nullable
    private final View.OnClickListener b;
    private long c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(R.id.bg_card_view, 7);
    }

    public SmallToolGridItemBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, d, e));
    }

    @Override // com.xiaomi.hm.health.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        Tool tool = this.mItem;
        ToolViewModel toolViewModel = this.mViewmodel;
        if (toolViewModel != null) {
            toolViewModel.onItemClick(callbackArg_0, tool);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        int i;
        int nameResId;
        synchronized (this) {
            j = this.c;
            this.c = 0L;
        }
        Tool tool = this.mItem;
        long j2 = 5 & j;
        int iconResId = 0;
        if (j2 == 0 || tool == null) {
            i = 0;
            nameResId = 0;
        } else {
            int backgroundColor = tool.getBackgroundColor();
            nameResId = tool.getNameResId();
            iconResId = tool.getIconResId();
            i = backgroundColor;
        }
        if ((j & 4) != 0) {
            this.a.setOnClickListener(this.b);
        }
        if (j2 != 0) {
            ToolBinding.setImageResource(this.toolIcon, iconResId);
            ToolBinding.setImageResource(this.toolIconBk, i);
            ToolBinding.setImageResource(this.toolIconCard, iconResId);
            ToolBinding.setImageResource(this.toolIconCardBk, i);
            this.toolName.setText(nameResId);
            this.toolNameCard.setText(nameResId);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.c != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.c = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // com.xiaomi.hm.health.databinding.SmallToolGridItemBinding
    public void setItem(@Nullable Tool Item) {
        this.mItem = Item;
        synchronized (this) {
            this.c |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (2 == variableId) {
            setItem((Tool) variable);
        } else {
            if (4 != variableId) {
                return false;
            }
            setViewmodel((ToolViewModel) variable);
        }
        return true;
    }

    @Override // com.xiaomi.hm.health.databinding.SmallToolGridItemBinding
    public void setViewmodel(@Nullable ToolViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized (this) {
            this.c |= 2;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    private SmallToolGridItemBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (CardView) bindings[7], (ImageView) bindings[5], (ShapeableImageView) bindings[4], (ImageView) bindings[2], (ShapeableImageView) bindings[1], (TextView) bindings[6], (TextView) bindings[3]);
        this.c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.a = constraintLayout;
        constraintLayout.setTag(null);
        this.toolIcon.setTag(null);
        this.toolIconBk.setTag(null);
        this.toolIconCard.setTag(null);
        this.toolIconCardBk.setTag(null);
        this.toolName.setTag(null);
        this.toolNameCard.setTag(null);
        setRootTag(root);
        this.b = new OnClickListener(this, 1);
        invalidateAll();
    }
}
