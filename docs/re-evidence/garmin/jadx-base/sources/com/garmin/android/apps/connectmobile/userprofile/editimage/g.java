package com.garmin.android.apps.connectmobile.userprofile.editimage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import g62.d0;
import i3.e5;
import java.util.ArrayList;
import n12.q0;
import n12.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u0007\b\tB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/g;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/g$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/g$c;", "onAvatarSelectListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/userprofile/editimage/g$c;)V", "c", "a", "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f46709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f46710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46711c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/g$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/userprofile/editimage/g;Landroid/view/View;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f46712c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f46713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f46714b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, View view2) {
            super(view2);
            view2.getClass();
            this.f46714b = gVar;
            this.f46713a = new u0(view2);
        }
    }

    public interface c {
        void E2(com.garmin.android.apps.connectmobile.userprofile.model.a aVar);
    }

    static {
        new b(null);
    }

    public g(c cVar) {
        cVar.getClass();
        this.f46709a = cVar;
        this.f46710b = new ArrayList();
        this.f46711c = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f46710b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.userprofile.model.a aVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.a) this.f46710b.get(i14);
        aVar2.getClass();
        u0 u0Var = aVar.f46713a;
        g gVar = aVar.f46714b;
        u0Var.f122313b.setOnClickListener(new d0(gVar, aVar2, i14, 4));
        u0Var.a(i14 == gVar.f46711c);
        String image = aVar2.getImage();
        image.getClass();
        ge1.b.T(u0Var, null, null, new q0(u0Var, image, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.edit_profile_image_grid_item_with_check, viewGroup, false);
        viewE.getClass();
        return new a(this, viewE);
    }

    public final void r(int i14) {
        int i15 = this.f46711c;
        this.f46711c = i14;
        notifyItemChanged(i14);
        notifyItemChanged(i15);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/g$b;", "", "<init>", "()V", "", "POSITION_NO_SELECT", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
