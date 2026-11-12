package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/r1;", "Lcom/garmin/android/apps/connectmobile/w1;", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class r1 extends w1 implements com.garmin.android.library.mapsdkadapter.i.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f41076d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMMapPreview f41077c;

    static {
        new a(null);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview != null) {
            gCMMapPreview.c();
        }
        GCMMapPreview gCMMapPreview2 = this.f41077c;
        if (gCMMapPreview2 != null) {
            gCMMapPreview2.setOnClickListener(new a61.d0(23, dVar, this));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview == null || gCMMapPreview == null) {
            return;
        }
        gCMMapPreview.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview == null || gCMMapPreview == null) {
            return;
        }
        gCMMapPreview.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview != null) {
            gCMMapPreview.onPause();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.w1, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview != null) {
            gCMMapPreview.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (getActivity() == null || requireActivity().isFinishing()) {
            return;
        }
        w6();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        v6();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f47886a.setVisibility(8);
        GCMMapPreview gCMMapPreview = (GCMMapPreview) view2.findViewById(R.id.activity_stats_summary_map_preview);
        this.f41077c = gCMMapPreview;
        if (gCMMapPreview != null) {
            gCMMapPreview.setupMap(this);
        }
        GCMMapPreview gCMMapPreview2 = this.f41077c;
        if (gCMMapPreview2 != null) {
            gCMMapPreview2.onCreate(bundle);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.w1
    public View u6(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_map_preview, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    public abstract void v6();

    public abstract void w6();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/r1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
