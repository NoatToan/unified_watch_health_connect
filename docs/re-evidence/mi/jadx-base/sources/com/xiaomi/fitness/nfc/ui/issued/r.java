package com.xiaomi.fitness.nfc.ui.issued;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.mri;
import defpackage.stk;
import defpackage.sui;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class r extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<stk> f12604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public stk f12605b;
    public a c;

    public interface a {
        void onItemClick(View view, stk stkVar);
    }

    public class b extends RecyclerView.d0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f12606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckBox f12607b;
        public stk c;

        public b(View view) {
            super(view);
            this.f12606a = (TextView) view.findViewById(mri.g5);
            this.f12607b = (CheckBox) view.findViewById(mri.F0);
            view.setOnClickListener(this);
        }

        public void a(stk stkVar) {
            this.c = stkVar;
            if (stkVar == null) {
                return;
            }
            this.f12606a.setText(stkVar.f33978b);
            CheckBox checkBox = this.f12607b;
            if (checkBox != null) {
                checkBox.setChecked(stkVar.c);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f12607b == null || this.c == null) {
                return;
            }
            if (r.this.f12605b == null) {
                stk stkVar = this.c;
                stkVar.c = true;
                r.this.f12605b = stkVar;
            } else if (Objects.equals(r.this.f12605b, this.c)) {
                this.c.c = false;
                r.this.f12605b = null;
            } else {
                Iterator it = r.this.f12604a.iterator();
                while (it.hasNext()) {
                    ((stk) it.next()).c = false;
                }
                stk stkVar2 = this.c;
                stkVar2.c = true;
                r.this.f12605b = stkVar2;
            }
            this.f12607b.setChecked(this.c.c);
            r.this.notifyDataSetChanged();
            if (r.this.c != null) {
                r.this.c.onItemClick(view, this.c);
            }
        }
    }

    public r(List<stk> list) {
        this.f12604a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<stk> list = this.f12604a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        bVar.a(this.f12604a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = sui.u0;
        if (i == 1) {
            i2 = sui.v0;
        }
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
    }

    public void o(a aVar) {
        this.c = aVar;
    }
}
