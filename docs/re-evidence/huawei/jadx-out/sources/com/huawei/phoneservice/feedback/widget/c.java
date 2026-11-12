package com.huawei.phoneservice.feedback.widget;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.phoneservice.faq.base.util.q;

/* JADX INFO: loaded from: classes13.dex */
public class c extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<View> f21797b;
    private a d;
    private b e;

    public interface a {
        void a(c cVar, int i);
    }

    public interface b {
        void a(c cVar, int i);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        b bVar = this.e;
        if (bVar == null) {
            return false;
        }
        bVar.a(this, getLayoutPosition());
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        if (q.b(view) || (aVar = this.d) == null) {
            return;
        }
        aVar.a(this, getLayoutPosition());
    }

    public <T extends View> T c(int i) {
        T t = (T) this.f21797b.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.f21797b.put(i, t2);
        return t2;
    }

    public c(View view) {
        super(view);
        this.f21797b = new SparseArray<>();
    }
}
