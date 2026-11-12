package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import g62.d0;
import java.util.ArrayList;
import p005kotlin.Metadata;
import uu.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/k;", "Lb32/a;", "<init>", "()V", "b", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends b32.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f30519b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f30520c = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/k$a;", "Lb32/e;", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/redesign/k;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a implements b32.e {
        public a() {
        }

        @Override // b32.e
        public final void d(RecyclerView.f0 f0Var, int i14) {
            f0Var.getClass();
            h0 h0Var = (h0) f0Var;
            TextView textView = h0Var.f172714d;
            TextView textView2 = h0Var.f172712b;
            Context context = h0Var.itemView.getContext();
            k kVar = k.this;
            m mVar = kVar.f30519b.f30522a.get(i14);
            mVar.getClass();
            m mVar2 = mVar;
            context.getClass();
            zp0.c cVar = new zp0.c(context);
            cVar.f206565e = mVar2.t();
            cVar.f206570j = 2131231129;
            cVar.f206576p = true;
            cVar.f206578r = "cache_availability_today";
            cVar.h(h0Var.f172711a);
            if (c22.b.a(context) > 1.3f) {
                textView2.setAutoSizeTextTypeUniformWithConfiguration(10, 14, 1, 2);
            }
            StringBuilder sb3 = new StringBuilder();
            textView2.setText(mVar2.A());
            sb3.append(context.getString(R.string.lbl_badge_name, mVar2.A()));
            sb3.append(". ");
            boolean isBadgeViewed = mVar2.getIsBadgeViewed();
            TextView textView3 = h0Var.f172713c;
            if (isBadgeViewed) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                sb3.append(context.getString(R.string.social_new_badge_hint));
                sb3.append(". ");
            }
            if (mVar2.getBadgeEarnedNumber() > 1) {
                textView.setText(context.getString(R.string.times_string_pattern, String.valueOf(mVar2.getBadgeEarnedNumber())));
                textView.setVisibility(0);
                sb3.append(context.getString(R.string.lbl_earned_badges_value, String.valueOf(mVar2.getBadgeEarnedNumber())));
            } else {
                textView.setVisibility(8);
            }
            h0Var.itemView.setContentDescription(sb3.toString());
            h0Var.itemView.setOnClickListener(new d0(kVar, i14, mVar2, 6));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/k$b;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/redesign/k;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<m> f30522a = new ArrayList<>();

        public b() {
        }
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new h0(viewGroup);
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        return this.f30520c;
    }

    @Override // b32.a, b32.d
    public final void e(b32.c cVar) {
        cVar.getClass();
    }

    @Override // b32.d
    public final int getItemCount() {
        return this.f30519b.f30522a.size();
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return 0;
    }
}
