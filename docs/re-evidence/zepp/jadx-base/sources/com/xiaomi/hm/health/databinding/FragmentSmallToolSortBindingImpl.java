package com.xiaomi.hm.health.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.generated.callback.OnClickListener;
import com.xiaomi.hm.health.smalltool.ToolBinding;
import com.xiaomi.hm.health.smalltool.ToolSortFragment;
import com.xiaomi.hm.health.smalltool.ToolViewModel;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class FragmentSmallToolSortBindingImpl extends FragmentSmallToolSortBinding implements OnClickListener.Listener {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts g = null;

    @Nullable
    private static final SparseIntArray h;

    @NonNull
    private final ConstraintLayout a;

    @Nullable
    private final View.OnClickListener b;

    @Nullable
    private final View.OnClickListener c;

    @Nullable
    private final View.OnClickListener d;

    @Nullable
    private final View.OnClickListener e;
    private long f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h = sparseIntArray;
        sparseIntArray.put(R.id.header, 6);
        sparseIntArray.put(R.id.divider, 7);
    }

    public FragmentSmallToolSortBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, g, h));
    }

    private boolean a(MediatorLiveData<List<Tool>> ViewmodelMyTools, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f |= 1;
        }
        return true;
    }

    private boolean b(MutableLiveData<List<Tool>> ViewmodelSupportTools, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f |= 2;
        }
        return true;
    }

    @Override // com.xiaomi.hm.health.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        if (sourceId == 1) {
            ToolSortFragment.MyHandler myHandler = this.mHandler;
            if (myHandler != null) {
                myHandler.onBackClick(callbackArg_0);
                return;
            }
            return;
        }
        if (sourceId == 2) {
            ToolSortFragment.MyHandler myHandler2 = this.mHandler;
            if (myHandler2 != null) {
                myHandler2.onCancelClick(callbackArg_0);
                return;
            }
            return;
        }
        if (sourceId == 3) {
            ToolSortFragment.MyHandler myHandler3 = this.mHandler;
            if (myHandler3 != null) {
                myHandler3.onEditClick(callbackArg_0);
                return;
            }
            return;
        }
        if (sourceId != 4) {
            return;
        }
        ToolSortFragment.MyHandler myHandler4 = this.mHandler;
        if (myHandler4 != null) {
            myHandler4.onFinishClick(callbackArg_0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        List<Tool> value;
        MutableLiveData<List<Tool>> supportTools;
        MediatorLiveData<List<Tool>> myTools;
        synchronized (this) {
            j = this.f;
            this.f = 0L;
        }
        ToolViewModel toolViewModel = this.mViewmodel;
        long j2 = 27 & j;
        List<Tool> value2 = null;
        if (j2 != 0) {
            if (toolViewModel != null) {
                myTools = toolViewModel.getMyTools();
                supportTools = toolViewModel.getSupportTools();
            } else {
                supportTools = null;
                myTools = null;
            }
            updateLiveDataRegistration(0, myTools);
            updateLiveDataRegistration(1, supportTools);
            value = myTools != null ? myTools.getValue() : null;
            if (supportTools != null) {
                value2 = supportTools.getValue();
            }
        } else {
            value = null;
        }
        if ((j & 16) != 0) {
            this.btnBack.setOnClickListener(this.e);
            this.btnCancel.setOnClickListener(this.c);
            this.btnEdit.setOnClickListener(this.d);
            this.btnFinish.setOnClickListener(this.b);
        }
        if (j2 != 0) {
            ToolBinding.setItems(this.recyclerView, value2, value);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return a((MediatorLiveData) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return b((MutableLiveData) object, fieldId);
    }

    @Override // com.xiaomi.hm.health.databinding.FragmentSmallToolSortBinding
    public void setHandler(@Nullable ToolSortFragment.MyHandler Handler) {
        this.mHandler = Handler;
        synchronized (this) {
            this.f |= 4;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (1 == variableId) {
            setHandler((ToolSortFragment.MyHandler) variable);
            return true;
        }
        if (4 != variableId) {
            return false;
        }
        setViewmodel((ToolViewModel) variable);
        return true;
    }

    @Override // com.xiaomi.hm.health.databinding.FragmentSmallToolSortBinding
    public void setViewmodel(@Nullable ToolViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized (this) {
            this.f |= 8;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    private FragmentSmallToolSortBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (ImageButton) bindings[1], (TextView) bindings[2], (TextView) bindings[3], (TextView) bindings[4], (View) bindings[7], (FrameLayout) bindings[6], (RecyclerView) bindings[5]);
        this.f = -1L;
        this.btnBack.setTag(null);
        this.btnCancel.setTag(null);
        this.btnEdit.setTag(null);
        this.btnFinish.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.a = constraintLayout;
        constraintLayout.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        this.b = new OnClickListener(this, 4);
        this.c = new OnClickListener(this, 2);
        this.d = new OnClickListener(this, 3);
        this.e = new OnClickListener(this, 1);
        invalidateAll();
    }
}
