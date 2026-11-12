package com.huawei.featureuserprofile.todo.adapter;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.todo.datatype.TodoCheckEntity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import defpackage.njy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TodoCheckListAdapter extends BaseAdapter implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TodoCheckEntity> f5763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f5764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f5765c;
    private boolean d;
    private boolean e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public void e(ViewGroup viewGroup) {
        registerDataSetObserver(new a(viewGroup, this));
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (njy.e(this.f5763a)) {
            return 0;
        }
        return this.f5763a.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TodoCheckEntity getItem(int i) {
        if (njy.e(this.f5763a, i)) {
            return null;
        }
        return this.f5763a.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f5765c == null) {
            this.f5765c = LayoutInflater.from(viewGroup.getContext());
        }
        if (view == null) {
            view = this.f5765c.inflate(R.layout.item_todo_check_layout, viewGroup, false);
        }
        view.setId(View.generateViewId());
        e(getItem(i), view, i);
        return view;
    }

    public List<TodoCheckEntity> d() {
        return this.f5763a;
    }

    private void e(TodoCheckEntity todoCheckEntity, View view, int i) {
        if (todoCheckEntity == null || view == null) {
            return;
        }
        view.findViewById(R.id.health_todo_live_item_divider).setVisibility(i == getCount() - 1 ? 8 : 0);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) view.findViewById(R.id.health_todo_live_item_switch);
        healthSwitchButton.setChecked(todoCheckEntity.isChecked());
        healthSwitchButton.setEnabled(this.e && this.d);
        healthSwitchButton.setOnCheckedChangeListener(this);
        healthSwitchButton.setTag(R.id.health_todo_live_item_switch, Integer.valueOf(i));
        ((HealthTextView) view.findViewById(R.id.health_todo_live_item_switch_title)).setText(todoCheckEntity.getTitle());
    }

    public void d(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5764b = onCheckedChangeListener;
    }

    public void c(boolean z) {
        if (this.d != z) {
            this.d = z;
            notifyDataSetChanged();
        }
    }

    public void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            notifyDataSetChanged();
        }
    }

    public void a(List<TodoCheckEntity> list) {
        if (njy.e(list)) {
            return;
        }
        List<TodoCheckEntity> list2 = this.f5763a;
        if (list2 == null) {
            this.f5763a = new ArrayList();
        } else {
            list2.clear();
        }
        this.f5763a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f5764b;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    static class a extends DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ViewGroup> f5766a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BaseAdapter> f5767c;

        a(ViewGroup viewGroup, BaseAdapter baseAdapter) {
            this.f5767c = new WeakReference<>(baseAdapter);
            this.f5766a = new WeakReference<>(viewGroup);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ViewGroup viewGroup = this.f5766a.get();
            BaseAdapter baseAdapter = this.f5767c.get();
            if (viewGroup == null) {
                return;
            }
            if (baseAdapter == null || baseAdapter.getCount() <= 0) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(8);
                return;
            }
            int count = baseAdapter.getCount();
            for (int i = 0; i < count; i++) {
                b(baseAdapter.getView(i, a(i, viewGroup), viewGroup), viewGroup, i);
            }
            int childCount = viewGroup.getChildCount();
            if (childCount > count) {
                while (true) {
                    childCount--;
                    if (childCount < count) {
                        break;
                    } else {
                        viewGroup.removeViewAt(childCount);
                    }
                }
            }
            viewGroup.setVisibility(viewGroup.getChildCount() > 0 ? 0 : 8);
        }

        private void b(View view, ViewGroup viewGroup, int i) {
            if (view == null || viewGroup == null) {
                return;
            }
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            }
            if (i < viewGroup.getChildCount()) {
                viewGroup.addView(view, i);
            } else {
                viewGroup.addView(view);
            }
        }

        private View a(int i, ViewGroup viewGroup) {
            if (i < viewGroup.getChildCount()) {
                return viewGroup.getChildAt(i);
            }
            return null;
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
        }
    }
}
