package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class wz5 extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q8h f38493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38494b;
    public List<xz5> c;
    public int d = 0;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CheckedTextView f38495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f38496b;

        public a(View view) {
            super(view);
            this.f38495a = (CheckedTextView) view.findViewById(zqi.a2);
            this.f38496b = (TextView) view.findViewById(zqi.Y1);
        }
    }

    public wz5(Context context, List<xz5> list) {
        this.f38494b = context;
        this.c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<xz5> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void j(a aVar, int i) {
        xz5 xz5Var = this.c.get(i);
        aVar.itemView.setTag(Integer.valueOf(i));
        if (xz5Var != null) {
            aVar.f38495a.setText(xz5Var.title);
            aVar.f38496b.setText(xz5Var.des);
            if (this.d == i) {
                aVar.f38495a.setChecked(true);
            } else {
                aVar.f38495a.setChecked(false);
            }
        }
    }

    public final /* synthetic */ void k(View view, View view2) {
        q8h q8hVar = this.f38493a;
        if (q8hVar != null) {
            q8hVar.onItemClick(view, ((Integer) view.getTag()).intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a aVar, int i) {
        j(aVar, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        final View viewInflate = LayoutInflater.from(this.f38494b).inflate(eui.i3, viewGroup, false);
        a aVar = new a(viewInflate);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: vz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37382a.k(viewInflate, view);
            }
        });
        return aVar;
    }

    public void setOnItemClickListener(q8h q8hVar) {
        this.f38493a = q8hVar;
    }

    public void setSelectIndex(int i) {
        this.d = i;
        notifyDataSetChanged();
    }
}
