package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import am.a2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import wt1.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/c;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/d;", "", "<init>", "()V", "a", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f45254m = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f45255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public xw1.h f45256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f45257l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/c$b;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f45258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserLevelImageView f45259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f45260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f45261d;

        public b(View view2) {
            view2.getClass();
            this.f45258a = view2;
            View viewFindViewById = view2.findViewById(R.id.training_coach_image);
            viewFindViewById.getClass();
            this.f45259b = (UserLevelImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.training_coach_name);
            viewFindViewById2.getClass();
            this.f45260c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.training_coach_tagline);
            viewFindViewById3.getClass();
            this.f45261d = (TextView) viewFindViewById3;
        }
    }

    @Override // yt1.e
    public final int V5() {
        return R.string.lbl_edit_personal_coach;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b
    public final String b5() {
        return "CoachEditFragment";
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        if (activity != null) {
            au1.c cVar = new au1.c(activity);
            RecyclerView recyclerView = this.f45262h;
            if (recyclerView == null) {
                s.m("recyclerView");
                throw null;
            }
            recyclerView.setAdapter(cVar);
            xw1.h hVar = this.f45256k;
            if (hVar != null) {
                b bVar = this.f45255j;
                if (bVar == null) {
                    s.m("coachUnavailableHeader");
                    throw null;
                }
                bVar.f45259b.setImageUrl(r.a() + hVar.getCoachThumbnail());
                bVar.f45260c.setText(hVar.g());
                TextView textView = bVar.f45261d;
                String coachLocalizedCoachTag = hVar.getCoachLocalizedCoachTag();
                if (coachLocalizedCoachTag == null) {
                    coachLocalizedCoachTag = "";
                }
                textView.setText(coachLocalizedCoachTag);
                b bVar2 = this.f45255j;
                if (bVar2 == null) {
                    s.m("coachUnavailableHeader");
                    throw null;
                }
                cVar.t(bVar2.f45258a);
            } else {
                View view2 = this.f45263i;
                if (view2 == null) {
                    s.m("listHeader");
                    throw null;
                }
                TextView textView2 = (TextView) view2.findViewById(R.id.training_step_header_info);
                if (textView2 != null) {
                    textView2.setText(R.string.lbl_available_coaches);
                }
                if (textView2 != null) {
                    textView2.setAllCaps(true);
                }
                View view3 = this.f45263i;
                if (view3 == null) {
                    s.m("listHeader");
                    throw null;
                }
                cVar.t(view3);
            }
            List<xw1.h> list = this.f45257l;
            if (list == null) {
                list = j0.f134944a;
            }
            cVar.f13028d = list;
            cVar.notifyDataSetChanged();
            cVar.f13029e = this;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45256k = (xw1.h) a2.c(getArguments(), "EXTRAS_COACH");
        this.f45257l = a2.d(getArguments(), "EXTRAS_COACH_PLANS");
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewB = com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.gcm4_training_coach_unavailable_header, viewGroup, false);
        v22.e.u(v6(), viewB);
        this.f45255j = new b(viewB);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRAS_COACH", "EXTRAS_COACH_PLANS", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(xw1.c cVar, xw1.h hVar, List list) {
            cVar.getClass();
            c cVar2 = new c();
            Bundle bundleU6 = com.garmin.android.apps.connectmobile.training.atp.create.steps.b.u6(cVar, 1);
            a2.b(bundleU6, "EXTRAS_COACH", hVar);
            a2.a("EXTRAS_COACH_PLANS", bundleU6, list);
            cVar2.setArguments(bundleU6);
            return cVar2;
        }

        private a() {
        }
    }
}
