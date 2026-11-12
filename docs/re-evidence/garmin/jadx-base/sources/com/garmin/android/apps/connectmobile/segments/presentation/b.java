package com.garmin.android.apps.connectmobile.segments.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.m;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import ie2.k;
import java.util.ArrayList;
import java.util.List;
import o13.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/b;", "Lxf1/d;", "<init>", "()V", "b", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends xf1.d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f41423w = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f41424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f41425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l<mv0.g> f41426r = KoinJavaComponent.inject$default(mv0.g.class, null, null, 6, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Location f41427t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f41428v;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.segments.presentation.b$b, reason: collision with other inner class name */
    public interface InterfaceC0786b extends xf1.d.a {
        void N5();

        void f0(com.garmin.android.library.mapsdkadapter.e eVar);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f41429a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f41429a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f41429a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f41429a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Override // xf1.d
    public final void A6() {
        super.A6();
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.setMyLocationEnabled(true);
        }
        View view2 = this.f41424p;
        view2.getClass();
        view2.setVisibility(0);
        View view3 = this.f41425q;
        view3.getClass();
        view3.setVisibility(0);
    }

    @Override // xf1.d
    public final void C6() {
        this.f190663m = true;
        View view2 = this.f41424p;
        view2.getClass();
        view2.setVisibility(8);
        View view3 = this.f41425q;
        view3.getClass();
        view3.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96719h};
        bVar.getClass();
        if (!j22.b.k(aVarArr)) {
            qe2.h hVar = this.f148294e;
            if (hVar != null) {
                hVar.setMyLocationEnabled(false);
            }
            i2.a.c(i2.f36769a, "ExploreSegmentsMapFragment", "onActivityCreated:location perm off, no location client will be created");
            return;
        }
        i2.a.c(i2.f36769a, "ExploreSegmentsMapFragment", "onActivityCreated:location perm on, creating the location client");
        qe2.h hVar2 = this.f148294e;
        if (hVar2 != null) {
            hVar2.setMyLocationEnabled(true);
        }
        com.garmin.android.library.mapsdkadapter.e eVar = this.f190659i;
        if (eVar != null) {
            u6(eVar, 0);
        }
        List<SegmentDetailsDTO> list = this.f190664n;
        if (list == null || this.f148294e == null || this.f190663m) {
            return;
        }
        ArrayList arrayListZ = h0.Z(list);
        this.f190664n = arrayListZ;
        z6(arrayListZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw0.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f190658h = (InterfaceC0786b) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement ExploreSegmentsMapFragmentListener");
        }
    }

    @Override // xf1.d, qw0.a, com.garmin.android.library.mapsdkadapter.i.g
    public final void onCameraIdle() {
        super.onCameraIdle();
        if (this.f190663m) {
            return;
        }
        xf1.d.a aVar = this.f190658h;
        aVar.getClass();
        ((InterfaceC0786b) aVar).f0(this.f190659i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41428v = true;
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_segments_explore_map, viewGroup, false);
        ((ViewGroup) viewInflate.findViewById(R.id.segments_explore_map_container)).addView(super.onCreateView(layoutInflater, viewGroup, bundle));
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        if (progressBar != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(a7.b.getColor(requireContext(), R.color.palette_delta_2), PorterDuff.Mode.SRC_IN);
        }
        return viewInflate;
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m activity = getActivity();
        mv0.g value = this.f41426r.getValue();
        value.getClass();
        if (value.f121162a.a("ExploreSegmentsMapFragment")) {
            return;
        }
        activity.getClass();
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(activity);
        aVar.setTitle(R.string.location_services_off_title);
        aVar.setMessage(R.string.segments_location_services_off_message);
        aVar.setPositiveButton(getResources().getString(R.string.lbl_settings), new ai1.a(this, 9));
        aVar.setNegativeButton(getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null);
        aVar.show();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"MissingPermission"})
    public final void onStart() {
        super.onStart();
        j22.b bVar = j22.b.f96736a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bVar.getClass();
        if (!j22.b.c(contextRequireContext)) {
            i2.a.c(i2.f36769a, "ExploreSegmentsMapFragment", "onStart: location perm off");
        } else {
            i2.a.c(i2.f36769a, "ExploreSegmentsMapFragment", "onStart:location perm on, fetching location");
            this.f41426r.getValue().x4("ExploreSegmentsMapFragment").f(getViewLifecycleOwner(), new c(new b41.a(this, 21)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        k uiSettings;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.E(this);
        }
        qe2.h hVar2 = this.f148294e;
        if (hVar2 != null) {
            hVar2.B(this);
        }
        qe2.h hVar3 = this.f148294e;
        if (hVar3 != null) {
            hVar3.O(this);
        }
        qe2.h hVar4 = this.f148294e;
        if (hVar4 != null && (uiSettings = hVar4.f144584a.getUiSettings()) != null) {
            uiSettings.a();
        }
        this.f41424p = view2.findViewById(R.id.segments_explore_map_filter);
        this.f41425q = view2.findViewById(R.id.segments_explore_map_recenter);
        View view3 = this.f41424p;
        if (view3 != null) {
            final int i14 = 0;
            view3.setOnClickListener(new View.OnClickListener(this) { // from class: cg1.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.segments.presentation.b f27146b;

                {
                    this.f27146b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.segments.presentation.b bVar = this.f27146b;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.segments.presentation.b.f41423w;
                            xf1.d.a aVar = bVar.f190658h;
                            aVar.getClass();
                            ((com.garmin.android.apps.connectmobile.segments.presentation.b.InterfaceC0786b) aVar).N5();
                            break;
                        default:
                            int i17 = com.garmin.android.apps.connectmobile.segments.presentation.b.f41423w;
                            bVar.f41428v = false;
                            Location location = bVar.f41427t;
                            if (location != null) {
                                bVar.v6(com.garmin.android.library.mapsdkadapter.n.c(location), 13);
                            }
                            break;
                    }
                }
            });
        }
        View view4 = this.f41425q;
        if (view4 != null) {
            final int i15 = 1;
            view4.setOnClickListener(new View.OnClickListener(this) { // from class: cg1.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.segments.presentation.b f27146b;

                {
                    this.f27146b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.segments.presentation.b bVar = this.f27146b;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.segments.presentation.b.f41423w;
                            xf1.d.a aVar = bVar.f190658h;
                            aVar.getClass();
                            ((com.garmin.android.apps.connectmobile.segments.presentation.b.InterfaceC0786b) aVar).N5();
                            break;
                        default:
                            int i18 = com.garmin.android.apps.connectmobile.segments.presentation.b.f41423w;
                            bVar.f41428v = false;
                            Location location = bVar.f41427t;
                            if (location != null) {
                                bVar.v6(com.garmin.android.library.mapsdkadapter.n.c(location), 13);
                            }
                            break;
                    }
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INITIAL_ZOOM_LEVEL", "I", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
