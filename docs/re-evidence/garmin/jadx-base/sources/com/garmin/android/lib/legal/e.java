package com.garmin.android.lib.legal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i0;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/lib/legal/e;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/lib/legal/e$a;", "Lcom/garmin/android/lib/legal/LegalLocalesFragment$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/lib/legal/LegalLocalesFragment$b;)V", "a", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegalLocalesFragment.b f50056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js0.d f50057b = new js0.d(this, 13);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f50058c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/lib/legal/e$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/lib/legal/e;Landroid/view/View;)V", "legal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f50059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f50060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, View view2) {
            super(view2);
            view2.getClass();
            this.f50059a = view2;
            View viewFindViewById = view2.findViewById(R.id.country_name);
            viewFindViewById.getClass();
            this.f50060b = (TextView) viewFindViewById;
        }
    }

    public e(LegalLocalesFragment.b bVar) {
        this.f50056a = bVar;
        d.f49991k.getClass();
        this.f50058c = u.Y(d.values(), r13.a.a(new i0() { // from class: com.garmin.android.lib.legal.b
            @Override // p005kotlin.jvm.internal.i0, k23.n
            public final Object get(Object obj) {
                return ((d) obj).f50054i;
            }
        }, new i0() { // from class: com.garmin.android.lib.legal.c
            @Override // p005kotlin.jvm.internal.i0, k23.n
            public final Object get(Object obj) {
                return ((d) obj).name();
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f50058c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        d dVar = this.f50058c.get(i14);
        aVar.f50060b.setText(dVar.f50055j);
        View view2 = aVar.f50059a;
        view2.setTag(dVar);
        view2.setOnClickListener(this.f50057b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.legal_locale_fragment_item, viewGroup, false);
        viewE.getClass();
        return new a(this, viewE);
    }
}
