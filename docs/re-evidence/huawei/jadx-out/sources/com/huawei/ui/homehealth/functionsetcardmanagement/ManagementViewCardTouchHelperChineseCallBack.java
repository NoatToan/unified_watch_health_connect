package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class ManagementViewCardTouchHelperChineseCallBack extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FunctionSetCardManagementViewChineseAdapter f25516b;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    public ManagementViewCardTouchHelperChineseCallBack(FunctionSetCardManagementViewChineseAdapter functionSetCardManagementViewChineseAdapter, Context context) {
        this.f25515a = context;
        this.f25516b = functionSetCardManagementViewChineseAdapter;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        FunctionSetCardManagementViewChineseAdapter functionSetCardManagementViewChineseAdapter = this.f25516b;
        if (functionSetCardManagementViewChineseAdapter == null) {
            return false;
        }
        return functionSetCardManagementViewChineseAdapter.e();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("ManagementViewCardTouchHelperCallBack", "onSwiped");
        FunctionSetCardManagementViewChineseAdapter functionSetCardManagementViewChineseAdapter = this.f25516b;
        if (functionSetCardManagementViewChineseAdapter == null) {
            LogUtil.j("ManagementViewCardTouchHelperCallBack", "mAdapter is null");
        } else {
            functionSetCardManagementViewChineseAdapter.d(viewHolder.getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return makeMovementFlags(15, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder == null || viewHolder2 == null) {
            LogUtil.j("ManagementViewCardTouchHelperCallBack", "source or target is null");
            return false;
        }
        LogUtil.a("ManagementViewCardTouchHelperCallBack", "onMove source", Integer.valueOf(viewHolder.getAdapterPosition()), ", target", Integer.valueOf(viewHolder2.getAdapterPosition()));
        FunctionSetCardManagementViewChineseAdapter functionSetCardManagementViewChineseAdapter = this.f25516b;
        if (functionSetCardManagementViewChineseAdapter == null) {
            LogUtil.j("ManagementViewCardTouchHelperCallBack", "mAdapter is null");
            return false;
        }
        functionSetCardManagementViewChineseAdapter.e(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("ManagementViewCardTouchHelperCallBack", "onSelectedChanged");
        if (viewHolder == null) {
            LogUtil.j("ManagementViewCardTouchHelperCallBack", "viewHolder is null");
            return;
        }
        if (i != 0) {
            LogUtil.a("ManagementViewCardTouchHelperCallBack", "ctionState != ItemTouchHelper.ACTION_STATE_IDLE");
        }
        super.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            LogUtil.j("ManagementViewCardTouchHelperCallBack", "viewHolder is null");
        } else {
            super.clearView(recyclerView, viewHolder);
            LogUtil.a("ManagementViewCardTouchHelperCallBack", "clearView");
        }
    }
}
