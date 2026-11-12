package com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import hx0.k;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import zp0.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/settings/defaultimage/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/settings/defaultimage/a$b;", "onImageSelectListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/details/settings/defaultimage/a$b;)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f31497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<l10.a> f31498b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.details.settings.defaultimage.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/settings/defaultimage/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/details/settings/defaultimage/a;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0514a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f31499c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f31500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f31501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0514a(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f31501b = aVar;
            View viewFindViewById = view2.findViewById(R.id.image_view);
            viewFindViewById.getClass();
            this.f31500a = (ImageView) viewFindViewById;
        }
    }

    public interface b {
        void d6(l10.a aVar);
    }

    public a(b bVar) {
        bVar.getClass();
        this.f31497a = bVar;
        this.f31498b = j0.f134944a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f31498b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        C0514a c0514a = (C0514a) f0Var;
        l10.a aVar = this.f31498b.get(i14);
        aVar.getClass();
        c.a aVar2 = c.f206560v;
        Context context = c0514a.itemView.getContext();
        context.getClass();
        aVar2.getClass();
        c cVar = new c(context);
        cVar.f206567g = aVar.f108050a;
        cVar.h(c0514a.f31500a);
        c0514a.itemView.setOnClickListener(new k(24, c0514a.f31501b, aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.item_group_default_image, viewGroup, false);
        viewE.getClass();
        return new C0514a(this, viewE);
    }
}
