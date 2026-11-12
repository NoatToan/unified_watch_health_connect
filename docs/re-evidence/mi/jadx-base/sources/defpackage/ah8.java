package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ah8 extends tg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<a> f1013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t7h<Integer> f1014b;
    public int c;
    public final Context d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1016b;

        public a() {
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f1017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f1018b;
        public final TextView c;

        public b(View view) {
            super(view);
            nuf.g(view);
            this.f1017a = (ImageView) view.findViewById(bsi.d3);
            this.f1018b = (TextView) view.findViewById(bsi.r8);
            this.c = (TextView) view.findViewById(bsi.p8);
        }
    }

    public ah8(Context context, List<a> list) {
        LinkedList linkedList = new LinkedList();
        this.f1013a = linkedList;
        this.c = -1;
        this.d = context;
        linkedList.clear();
        this.f1013a.addAll(list);
    }

    public static List<a> k(Context context) {
        LinkedList linkedList = new LinkedList();
        a aVar = new a();
        aVar.f1015a = context.getString(j1j.k1);
        aVar.f1016b = context.getString(j1j.i1);
        linkedList.add(aVar);
        a aVar2 = new a();
        aVar2.f1015a = context.getString(j1j.m1);
        aVar2.f1016b = context.getString(j1j.J1);
        linkedList.add(aVar2);
        a aVar3 = new a();
        aVar3.f1015a = context.getString(j1j.l1);
        aVar3.f1016b = context.getString(j1j.w1);
        linkedList.add(aVar3);
        return linkedList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1013a.size();
    }

    @Override // defpackage.tg8
    public void i(t7h<Integer> t7hVar) {
        this.f1014b = t7hVar;
    }

    public final /* synthetic */ void l(b bVar, View view) {
        t7h<Integer> t7hVar = this.f1014b;
        if (t7hVar != null) {
            t7hVar.a(Integer.valueOf(bVar.getAdapterPosition()));
            this.c = bVar.getAdapterPosition();
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(ivi.R0, viewGroup, false));
    }

    public final void n(b bVar) {
        Resources resources = this.d.getResources();
        bVar.f1017a.setVisibility(0);
        bVar.f1018b.setTextColor(resources.getColor(dki.v, null));
        bVar.c.setTextColor(resources.getColor(dki.u, null));
        bVar.itemView.setBackgroundColor(resources.getColor(dki.t, null));
    }

    public final void o(b bVar) {
        Resources resources = this.d.getResources();
        bVar.f1017a.setVisibility(8);
        bVar.f1018b.setTextColor(resources.getColor(dki.x, null));
        bVar.c.setTextColor(resources.getColor(dki.w, null));
        bVar.itemView.setBackground(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var instanceof b) {
            final b bVar = (b) d0Var;
            a aVar = this.f1013a.get(i);
            bVar.f1018b.setText(aVar.f1015a);
            if (!TextUtils.isEmpty(aVar.f1016b)) {
                bVar.c.setVisibility(0);
                bVar.c.setText(aVar.f1016b);
            }
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: yg8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f40151a.l(bVar, view);
                }
            });
            if (i == this.c) {
                n(bVar);
            } else {
                o(bVar);
            }
        }
    }
}
