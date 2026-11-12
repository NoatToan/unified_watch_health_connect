package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import am.x0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.r1;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mz1.e0;
import mz1.o0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/b;", "Lcom/garmin/android/apps/connectmobile/r1;", "<init>", "()V", "a", "b", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends r1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f45836k = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f45837e = new w1(s0.f105811a.b(e0.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<GeoPointDTO> f45838f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45839g = R.color.gcm_map_segment_track_path;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.i.b f45840h = com.garmin.android.library.mapsdkadapter.i.b.WGS84;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45841i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0884b f45842j;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.b$b, reason: collision with other inner class name */
    public interface InterfaceC0884b {
        void V();
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f45843a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f45843a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45843a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45843a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f45844a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45844a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45845a = aVar;
            this.f45846b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45845a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45846b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f45847a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45847a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public final void A6(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, boolean z15) {
        if (eVar != null) {
            com.garmin.android.library.mapsdkadapter.i.b bVarH = eVar.h();
            if (bVarH == null) {
                bVarH = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
            }
            this.f45840h = bVarH;
            List<GeoPointDTO> list = eVar.geoPoints;
            if (list != null) {
                ((y0) y6().E1.getValue()).j(Boolean.valueOf(!list.isEmpty()));
                this.f45841i = z15;
                ArrayList<GeoPointDTO> arrayList = this.f45838f;
                arrayList.clear();
                arrayList.addAll(list);
                y6();
                x0 x0VarG = eVar.g();
                int i14 = R.color.gcm_map_segment_track_path;
                if (z14) {
                    if (am.z0.g0(x0VarG)) {
                        i14 = R.color.gcm_polyline_activity_lap_ascent;
                    } else if (am.z0.h0(x0VarG)) {
                        i14 = R.color.gcm_polyline_activity_lap_descent;
                    }
                }
                this.f45839g = i14;
                w6();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r1, com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        GCMMapPreview gCMMapPreview = this.f41077c;
        if (gCMMapPreview != null) {
            gCMMapPreview.setOnMapClickListener(new tr2.b(this, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof InterfaceC0884b) {
            this.f45842j = (InterfaceC0884b) context;
            return;
        }
        throw new RuntimeException(context + " must implement InteractionListener.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f45842j = null;
    }

    @Override // com.garmin.android.apps.connectmobile.r1, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("GCM_extra_target_legs") : null;
        Bundle arguments2 = getArguments();
        Long lValueOf = arguments2 != null ? Long.valueOf(arguments2.getLong("GCM_extra_course_id")) : null;
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            y6().u5(parcelableArrayList);
        } else if (lValueOf != null && lValueOf.longValue() != 0) {
            e0 e0VarY6 = y6();
            ge1.b.T(v1.a(e0VarY6), null, null, new o0(e0VarY6, lValueOf.longValue(), null), 3);
        }
        final int i14 = 0;
        y6().h5().f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: ty1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.b f167178b;

            {
                this.f167178b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.b bVar = this.f167178b;
                switch (i15) {
                    case 0:
                        List list = (List) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.f45836k;
                        bVar.y6();
                        bVar.A6(mz1.e0.d5(list), true, true);
                        bVar.y6();
                        bVar.A6(mz1.e0.c5(list), true, false);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.f45836k;
                        bVar.A6((com.garmin.android.apps.connectmobile.courses.model.e) obj, false, true);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        ((androidx.lifecycle.s0) y6().M0.getValue()).f(getViewLifecycleOwner(), new c(new e23.l(this) { // from class: ty1.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.b f167178b;

            {
                this.f167178b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.b bVar = this.f167178b;
                switch (i16) {
                    case 0:
                        List list = (List) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.f45836k;
                        bVar.y6();
                        bVar.A6(mz1.e0.d5(list), true, true);
                        bVar.y6();
                        bVar.A6(mz1.e0.c5(list), true, false);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.f45836k;
                        bVar.A6((com.garmin.android.apps.connectmobile.courses.model.e) obj, false, true);
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.garmin.android.apps.connectmobile.r1
    public final void v6() {
    }

    @Override // com.garmin.android.apps.connectmobile.r1
    public final void w6() {
        GCMMapPreview gCMMapPreview;
        GCMMapPreview gCMMapPreview2;
        GCMMapPreview gCMMapPreview3;
        if (this.f45841i && (gCMMapPreview3 = this.f41077c) != null) {
            gCMMapPreview3.getMapProxy().clear();
        }
        GCMMapPreview gCMMapPreview4 = this.f41077c;
        if (gCMMapPreview4 != null) {
            gCMMapPreview4.b();
        }
        ArrayList<GeoPointDTO> arrayList = this.f45838f;
        if (arrayList.size() < 1) {
            return;
        }
        int size = arrayList.size() - 1;
        GeoPointDTO geoPointDTO = arrayList.get(size).b() ? arrayList.get(size) : null;
        if (size > 0 && geoPointDTO != null && (gCMMapPreview2 = this.f41077c) != null) {
            com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
            pVar.b(2131232001);
            pVar.d(z6(geoPointDTO));
            gCMMapPreview2.g(pVar);
        }
        GeoPointDTO geoPointDTO2 = arrayList.get(0).b() ? arrayList.get(0) : null;
        if (geoPointDTO2 != null && (gCMMapPreview = this.f41077c) != null) {
            com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p();
            pVar2.b(2131232000);
            pVar2.d(z6(geoPointDTO2));
            gCMMapPreview.g(pVar2);
        }
        com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
        Context context = getContext();
        ie2.p pVar3 = qVar.f50328a;
        if (context != null) {
            pVar3.f93156d = a7.b.getColor(context, this.f45839g);
        }
        pVar3.f93155c = 5.0f;
        pVar3.f93161i = true;
        Iterator<GeoPointDTO> it = arrayList.iterator();
        while (it.hasNext()) {
            pVar3.f93153a.add(z6(it.next()));
        }
        GCMMapPreview gCMMapPreview5 = this.f41077c;
        if (gCMMapPreview5 != null) {
            gCMMapPreview5.h(qVar);
        }
        GCMMapPreview gCMMapPreview6 = this.f41077c;
        if (gCMMapPreview6 != null) {
            gCMMapPreview6.i();
        }
    }

    public final e0 y6() {
        return (e0) this.f45837e.getValue();
    }

    public final com.garmin.android.library.mapsdkadapter.f z6(GeoPointDTO geoPointDTO) {
        Double d14 = geoPointDTO.latitude;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        Double d15 = geoPointDTO.longitude;
        return new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d, this.f45840h);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(Long l14, List list) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putLong("GCM_extra_course_id", l14 != null ? l14.longValue() : 0L);
            if (list != null) {
                bundle.putParcelableArrayList("GCM_extra_target_legs", new ArrayList<>(list));
            }
            bVar.setArguments(bundle);
            return bVar;
        }

        private a() {
        }
    }
}
