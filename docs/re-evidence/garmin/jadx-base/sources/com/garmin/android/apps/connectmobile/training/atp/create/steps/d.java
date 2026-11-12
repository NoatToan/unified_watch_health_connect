package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import r22.l1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/d;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b;", "", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f45262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f45263i;

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f45263i = com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.gcm4_training_create_step_header, viewGroup, false);
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_create_default_step, viewGroup, false);
        viewInflate.getClass();
        v22.e.g(R.color.gcm_background, viewInflate);
        return viewInflate;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.simple_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f45262h = recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        recyclerView.addItemDecoration(new l1(contextRequireContext));
        recyclerView.setPadding(0, 0, 0, 1);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
