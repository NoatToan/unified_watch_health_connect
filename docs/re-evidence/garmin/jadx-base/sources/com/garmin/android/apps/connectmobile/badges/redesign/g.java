package com.garmin.android.apps.connectmobile.badges.redesign;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.badges.service.model.p;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import java.util.ArrayList;
import p005kotlin.Metadata;
import t61.m;
import uu.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/g;", "Lb32/a;", "<init>", "()V", "b", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends b32.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f30481b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f30482c = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/g$a;", "Lb32/e;", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/redesign/g;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a implements b32.e {
        public a() {
        }

        @Override // b32.e
        public final void d(RecyclerView.f0 f0Var, int i14) {
            f0Var.getClass();
            e0 e0Var = (e0) f0Var;
            p pVar = g.this.f30481b.f30484a.get(i14);
            pVar.getClass();
            p pVar2 = pVar;
            UserLevelImageView userLevelImageView = e0Var.f172668a;
            com.garmin.android.apps.connectmobile.userprofile.model.k kVar = com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND;
            Long userLevel = pVar2.getUserLevel();
            userLevelImageView.setProfileImageData(pVar2.i(kVar, userLevel != null ? Integer.valueOf((int) userLevel.longValue()) : null));
            e0Var.f172669b.setText(pVar2.getFullName());
            e0Var.f172670c.setText(j0.o(pVar2.f(), 'M'));
            e0Var.itemView.setOnClickListener(new m(pVar2, 22));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/g$b;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/redesign/g;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<p> f30484a = new ArrayList<>();

        public b() {
        }
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new e0(viewGroup);
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        return this.f30482c;
    }

    @Override // b32.a, b32.d
    public final void e(b32.c cVar) {
        cVar.getClass();
    }

    @Override // b32.d
    public final int getItemCount() {
        return this.f30481b.f30484a.size();
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return 0;
    }
}
