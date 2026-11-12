package com.xiaomi.fitness.health.weight.ui;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class WeightTypeListDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f12326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayoutManager f12327b;

    public class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if ((WeightTypeListDialog.this.f12327b.findLastCompletelyVisibleItemPosition() - WeightTypeListDialog.this.f12327b.findFirstCompletelyVisibleItemPosition()) + 1 < WeightTypeListDialog.this.f12326a.getCount()) {
                recyclerView.setOverScrollMode(0);
            } else {
                recyclerView.setOverScrollMode(2);
            }
        }
    }

    public static class c extends RecyclerView.Adapter<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f12329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f12330b;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(int i, View view) {
            e eVar = this.f12330b;
            if (eVar != null) {
                eVar.onItemClick(view, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            List<String> list = this.f12329a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(d dVar, final int i) {
            dVar.f12331a.setText(this.f12329a.get(i));
            dVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: tgr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34685a.j(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public d onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(jui.f8, viewGroup, false));
        }

        public void m(List<String> list) {
            this.f12329a = list;
            notifyDataSetChanged();
        }

        public void setOnItemClickListener(e eVar) {
            this.f12330b = eVar;
        }

        public c() {
        }
    }

    public static class d extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f12331a;

        public d(View view) {
            super(view);
            this.f12331a = (TextView) view.findViewById(eri.cj);
        }
    }

    public interface e {
        void onItemClick(View view, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view, int i) {
        dismiss();
        setResultData(Integer.valueOf(i), null);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(eri.Ld);
        if (this.f12326a == null) {
            this.f12326a = new c();
        }
        this.f12326a.setOnItemClickListener(new e() { // from class: rgr
            @Override // com.xiaomi.fitness.health.weight.ui.WeightTypeListDialog.e
            public final void onItemClick(View view2, int i) {
                this.f32530a.B(view2, i);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        this.f12327b = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f12326a);
        recyclerView.addOnScrollListener(new a());
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onShow() {
        FrameLayout frameLayout;
        super.onShow();
        Dialog dialog = getDialog();
        if (dialog == null || (frameLayout = (FrameLayout) dialog.findViewById(R.id.custom)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        new ViewGroup.MarginLayoutParams(layoutParams).setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void updateData(List<String> list) {
        if (this.f12326a == null) {
            this.f12326a = new c();
        }
        this.f12326a.m(list);
    }

    public static class b extends com.xiaomi.fitness.baseui.dialog.a<b, DialogParams, WeightTypeListDialog> {
        public b() {
            this(new DialogParams("body_type"));
            setCustomLayoutId(jui.e8);
            setNegativeText(c0j.c);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WeightTypeListDialog internalCreate() {
            return new WeightTypeListDialog();
        }

        public b(DialogParams dialogParams) {
            super(dialogParams);
        }
    }
}
