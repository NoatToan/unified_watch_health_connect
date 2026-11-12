package com.xiaomi.hm.health.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public class SmallToolGridTitleBindingImpl extends SmallToolGridTitleBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts c = null;

    @Nullable
    private static final SparseIntArray d;

    @NonNull
    private final ConstraintLayout a;
    private long b;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(R.id.small_tool_drag_sort_tip, 2);
    }

    public SmallToolGridTitleBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, c, d));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.b;
            this.b = 0L;
        }
        long j2 = j & 3;
        int iSafeUnbox = j2 != 0 ? ViewDataBinding.safeUnbox(this.mTitleResId) : 0;
        if (j2 != 0) {
            this.smallToolTitle.setText(iSafeUnbox);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.b != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.b = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // com.xiaomi.hm.health.databinding.SmallToolGridTitleBinding
    public void setTitleResId(@Nullable Integer TitleResId) {
        this.mTitleResId = TitleResId;
        synchronized (this) {
            this.b |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (3 != variableId) {
            return false;
        }
        setTitleResId((Integer) variable);
        return true;
    }

    private SmallToolGridTitleBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[2], (TextView) bindings[1]);
        this.b = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.a = constraintLayout;
        constraintLayout.setTag(null);
        this.smallToolTitle.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
