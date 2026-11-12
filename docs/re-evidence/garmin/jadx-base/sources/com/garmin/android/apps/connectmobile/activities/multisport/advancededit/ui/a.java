package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.v;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import yo.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/a;", "Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/b;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f29309p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f29310o = R.string.lbl_convert_to_multisport_title;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0452a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f29311a;

        public C0452a(l lVar) {
            lVar.getClass();
            this.f29311a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f29311a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29311a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    /* JADX INFO: renamed from: F6, reason: from getter */
    public final int getF29310o() {
        return this.f29310o;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final int H6(wo.a aVar) {
        Integer num;
        wo.a aVarY4 = G6().y4(0);
        if (aVarY4 == null || (num = aVarY4.f186397a) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final void I6() {
        v supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        c.a aVar2 = c.f29328l;
        int i14 = this.f29324k;
        p f29361o = getF29335r();
        int i15 = this.f29323j;
        aVar2.getClass();
        f29361o.getClass();
        Bundle bundle = new Bundle(3);
        bundle.putInt("legIndex", i14);
        bundle.putString("legUpdateType", f29361o.name());
        bundle.putInt("divisionPoint", i15);
        c cVar = new c();
        cVar.setArguments(bundle);
        aVar.l(R.id.multisport_content_frame, cVar, null);
        aVar.d(c.f29329m);
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final void S6(View view2, vo.b bVar) {
        ((Button) view2.findViewById(R.id.next_button)).setOnClickListener(new xp0.d(this, 23));
        super.S6(view2, bVar);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.convert_to_multisport_divide_activity_fragment, viewGroup, false);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final void y6(View view2) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.content_container);
        constraintLayout.setVisibility(4);
        g22.e.l(this);
        G6().x4().f(getViewLifecycleOwner(), new C0452a(new wn2.f(this, 29, constraintLayout, view2)));
    }
}
