package com.huawei.featureuserprofile.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.featureuserprofile.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ikw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TodoCardRecyAdapter extends RecyclerView.Adapter<TodoCardInnerViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnItemClickListener f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f5761c;
    private List<ikw> e;

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnItemClickListener<T> {
        void onItemClicked(int i);
    }

    public TodoCardRecyAdapter(Context context, List<ikw> list) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f5761c = context;
        arrayList.clear();
        this.e.addAll(list);
        LogUtil.a("TodoCardRecyAdapter", "mTodoCardRecyModels");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public TodoCardInnerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("TodoCardRecyAdapter", "onCreateViewHolder");
        return new TodoCardInnerViewHolder(this.f5761c, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_todo_recy_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(TodoCardInnerViewHolder todoCardInnerViewHolder, final int i) {
        LogUtil.a("TodoCardRecyAdapter", "onBindViewHolder");
        List<ikw> list = this.e;
        if (list == null || list.get(i) == null) {
            return;
        }
        todoCardInnerViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.todo.adapter.TodoCardRecyAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TodoCardRecyAdapter.this.f5759a != null) {
                    TodoCardRecyAdapter.this.f5759a.onItemClicked(i);
                }
            }
        });
        if (i == 0) {
            todoCardInnerViewHolder.a();
        }
        todoCardInnerViewHolder.d(this.e.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f5760b <= this.e.size()) {
            return this.f5760b;
        }
        LogUtil.j("TodoCardRecyAdapter", "mShowCount should not > ", Integer.valueOf(this.e.size()));
        return this.e.size();
    }

    public void d(int i) {
        this.f5760b = i;
    }

    public void b(List<ikw> list) {
        LogUtil.a("TodoCardRecyAdapter", "save todoCardRecyModels.size():", Integer.valueOf(list.size()));
        this.e.clear();
        this.e.addAll(list);
    }

    public void d(OnItemClickListener onItemClickListener) {
        this.f5759a = onItemClickListener;
    }
}
