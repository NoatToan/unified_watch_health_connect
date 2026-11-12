package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d0 extends m0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f33120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f33121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView.p f33122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r22.i0 f33123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f33124l;

    public abstract a I6();

    public abstract r22.i0 J6(RecyclerView.p pVar, int i14);

    public RecyclerView.p K6() {
        return new LinearLayoutManager(getContext());
    }

    public CharSequence M6() {
        return getString(R.string.txt_empty_page_no_data);
    }

    @Override // com.garmin.android.apps.connectmobile.m0, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void M7() {
        if (this.f33123k.f149677b > 1) {
            V6();
        }
        this.f33123k.f149679d = false;
        TextView textView = this.f33120h;
        if (textView != null) {
            textView.setVisibility(4);
        }
        E6();
    }

    public int S6() {
        return 20;
    }

    public final void T6(boolean z14) {
        if (z14) {
            this.f33121i.postDelayed(new cd0.h0(this, 2), 2000L);
        } else {
            a.A(this.f33124l, false);
        }
    }

    public void U6() {
        a aVarI6 = I6();
        this.f33124l = aVarI6;
        aVarI6.B();
        aVarI6.z(aVarI6.f33125b);
        this.f33121i.setAdapter(this.f33124l);
        g22.p.a(this.f33121i, this.f33124l);
    }

    public void V6() {
        this.f33124l.clear();
        r22.i0 i0Var = this.f33123k;
        if (!i0Var.f149680e) {
            i0Var.f149679d = false;
            i0Var.f149677b = 1;
        }
        i0Var.f149680e = true;
    }

    public final void X6(int i14) {
        r22.i0 i0Var = this.f33123k;
        int i15 = i0Var.f149677b + i14;
        i0Var.f149677b = i15;
        if (i14 == 0 || i14 < i0Var.f149678c) {
            i0Var.f149679d = true;
            i0Var.a(i15 - 1);
        }
        i0Var.f149680e = false;
        boolean z14 = this.f33123k.f149677b == 1;
        TextView textView = this.f33120h;
        if (textView != null) {
            textView.setVisibility(z14 ? 0 : 4);
            if (z14) {
                this.f33120h.setText(M6());
            }
        }
    }

    public final void Y6(boolean z14) {
        r22.i0 i0Var = this.f33123k;
        i0Var.f149680e = false;
        if (z14) {
            i0Var.f149679d = true;
            i0Var.a(i0Var.f149677b - 1);
        }
        boolean z15 = this.f33123k.f149677b == 1;
        TextView textView = this.f33120h;
        if (textView != null) {
            textView.setVisibility(z15 ? 0 : 4);
            if (z15) {
                this.f33120h.setText(M6());
            }
        }
    }

    public final void c7() {
        a.A(this.f33124l, true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return A6(viewGroup, layoutInflater, R.layout.endless_scroll_recycler_view_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        this.f33121i = (RecyclerView) view2.findViewById(R.id.recycler_view);
        this.f33120h = (TextView) view2.findViewById(R.id.empty_view);
        RecyclerView.p pVarK6 = K6();
        this.f33122j = pVarK6;
        this.f33121i.setLayoutManager(pVarK6);
        this.f33121i.setHasFixedSize(true);
        U6();
        r22.i0 i0VarJ6 = J6(this.f33122j, S6());
        this.f33123k = i0VarJ6;
        this.f33121i.addOnScrollListener(i0VarJ6);
    }

    public static abstract class a extends b32.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z12.k f33125b;

        public a() {
            this.f33125b = new z12.k();
        }

        public static void A(a aVar, boolean z14) {
            z12.k kVar = aVar.f33125b;
            if (kVar.f201423c != z14) {
                kVar.f201423c = z14;
                if (z14) {
                    kVar.f().t(kVar);
                } else {
                    kVar.f().x(kVar, 0);
                }
            }
        }

        public abstract void B();

        public abstract void clear();

        public a(z12.k kVar) {
            this.f33125b = kVar;
        }
    }
}
