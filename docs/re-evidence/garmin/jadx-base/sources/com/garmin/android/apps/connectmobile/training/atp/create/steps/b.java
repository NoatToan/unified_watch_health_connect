package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import ak0.t;
import am.a2;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import wt1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b;", "Landroidx/fragment/app/Fragment;", "Lyt1/e;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends Fragment implements yt1.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f45247g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yt1.c f45248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f45249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xw1.c f45250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wt1.b f45252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<Long> f45253f = new ArrayList<>();

    public static void C6(b bVar, Long l14) {
        wt1.b bVar2 = bVar.f45252e;
        if (bVar2 != null) {
            bVar2.e();
        }
        yt1.c cVar = bVar.f45248a;
        if (cVar != null) {
            cVar.j();
        }
        bVar.f45253f.add(l14);
    }

    public static final Bundle u6(xw1.c cVar, int i14) {
        f45247g.getClass();
        cVar.getClass();
        Bundle bundle = new Bundle();
        a2.b(bundle, "EXTRAS_TRAINING_PLAN", cVar);
        bundle.putInt("EXTRAS_FLOW_TYPE", i14);
        return bundle;
    }

    public final void A6(Long l14, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        yt1.c cVar2 = this.f45248a;
        if (cVar2 != null) {
            cVar2.f(cVar);
        }
        this.f45253f.remove(l14);
        boolean z14 = cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        wt1.b bVar = this.f45252e;
        if (z14) {
            if (bVar != null) {
                bVar.e();
            }
        } else if (bVar != null) {
            bVar.g();
        }
    }

    public abstract String b5();

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            yt1.d dVar = (yt1.d) getContext();
            yt1.c cVarA9 = dVar != null ? dVar.a9() : null;
            this.f45248a = cVarA9;
            if (dVar == null || cVarA9 == null) {
                throw new IllegalArgumentException(getContext() + " missing required ATPWizardProvider or ATPWizardListener");
            }
            try {
                yt1.a aVar = (yt1.a) getContext();
                if (aVar != null) {
                    aVar.a();
                }
            } catch (ClassCastException unused) {
                i2.a aVar2 = i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "BaseWizardFragment", "Activity does not implement ATPSetupUpdate (optional)");
            }
            u uVar = (u) KoinJavaComponent.get$default(u.class, null, null, 6, null);
            uVar.getClass();
            this.f45249b = uVar;
            wt1.b bVar = this.f45252e;
            if (bVar != null) {
                bVar.b();
                Unit unit = Unit.INSTANCE;
            }
            t tVar = new t(26);
            wt1.b bVar2 = this.f45252e;
            if (bVar2 != null) {
                bVar2.c(tVar);
            }
            wt1.b bVar3 = this.f45252e;
            if (bVar3 != null) {
                bVar3.e();
            }
        } catch (ClassCastException unused2) {
            throw new ClassCastException(getContext() + " must implement ATPWizardProvider");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xw1.c cVar = (xw1.c) a2.c(getArguments(), "EXTRAS_TRAINING_PLAN");
        Bundle arguments = getArguments();
        this.f45251d = arguments != null ? arguments.getInt("EXTRAS_FLOW_TYPE", 0) : 0;
        if (cVar != null) {
            this.f45250c = cVar;
        } else {
            vb.h.s("Fragment not initialized - missing AdaptiveTrainingPlan object.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f45248a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.c(this.f45253f);
        yt1.c cVar = this.f45248a;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        wt1.b bVar = new wt1.b(view2.findViewById(R.id.training_error_layout));
        this.f45252e = bVar;
        bVar.d(new a03.e(this, 20));
    }

    public final int v6() {
        Resources resources;
        m activity = getActivity();
        if (activity == null || (resources = activity.getResources()) == null) {
            return 0;
        }
        return (int) resources.getDimension(R.dimen.section_header_height);
    }

    public final xw1.c w6() {
        xw1.c cVar = this.f45250c;
        if (cVar != null) {
            return cVar;
        }
        s.m("trainingPlan");
        throw null;
    }

    public final boolean y6() {
        return this.f45251d == 0;
    }

    public final boolean z6() {
        return this.f45251d == 1;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRAS_TRAINING_PLAN", "EXTRAS_FLOW_TYPE", "", "CREATE", "I", "EDIT", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
