package com.garmin.android.apps.connectmobile.activities.manual.eventType;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import fg0.k;
import gg0.f;
import java.util.WeakHashMap;
import n23.j;
import oo.g;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/eventType/a;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0449a f29185i = new C0449a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f29186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f29187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f29188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f29189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f29190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f29191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f29193h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/manual/eventType/a$b", "Lb/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = a.this;
            aVar.f29193h.f(false);
            aVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f29195a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29195a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f29197b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f29196a = aVar;
            this.f29197b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29196a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29197b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f29198a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f29198a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29198a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public a() {
        super(R.layout.fragment_event_list);
        this.f29186a = new w1(s0.f105811a.b(oo.b.class), new c(this), new e(this), new d(null, this));
        this.f29193h = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String strA;
        f eventType;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f29193h, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.rv_events);
        viewFindViewById.getClass();
        this.f29187b = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.text_view_save);
        viewFindViewById2.getClass();
        this.f29188c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.text_view_cancel);
        viewFindViewById3.getClass();
        this.f29189d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.title_text_view);
        viewFindViewById4.getClass();
        this.f29190e = (TextView) viewFindViewById4;
        final int i14 = 0;
        if (this.f29191f == null) {
            TextView textView = this.f29188c;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("save");
                throw null;
            }
            textView.setEnabled(false);
        }
        TextView textView2 = this.f29190e;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("title");
            throw null;
        }
        k kVar = (k) h0.d0(u6().f133054d);
        if (kVar == null || (eventType = kVar.getEventType()) == null) {
            strA = null;
        } else {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            strA = eventType.a(contextRequireContext);
        }
        textView2.setText(strA + StringUtils.SPACE + getString(R.string.lbl_events));
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        no.e eVar = new no.e(contextRequireContext2, u6().f133054d, (k) ((androidx.lifecycle.s0) u6().f133059i.getValue()).d());
        eVar.f126719d = this;
        RecyclerView recyclerView = this.f29187b;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("rvEvents");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f29187b;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("rvEvents");
            throw null;
        }
        recyclerView2.setAdapter(eVar);
        TextView textView3 = this.f29188c;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("save");
            throw null;
        }
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: no.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.eventType.a f126707b;

            {
                this.f126707b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.activities.manual.eventType.a aVar = this.f126707b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.manual.eventType.a.C0449a c0449a = com.garmin.android.apps.connectmobile.activities.manual.eventType.a.f29185i;
                        aVar.u6().A4(aVar.f29191f);
                        oo.b bVarU6 = aVar.u6();
                        ge1.b.T(v1.a(bVarU6), null, null, new g(aVar.f29191f, bVarU6, aVar.f29192g, null), 3);
                        ((y0) aVar.u6().f133064n.getValue()).m("ActivitiesEventTypeFragment");
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.activities.manual.eventType.a.C0449a c0449a2 = com.garmin.android.apps.connectmobile.activities.manual.eventType.a.f29185i;
                        ((y0) aVar.u6().f133064n.getValue()).m("ActivitiesEventTypeFragment");
                        break;
                }
            }
        });
        TextView textView4 = this.f29189d;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("cancel");
            throw null;
        }
        final int i15 = 1;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: no.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.eventType.a f126707b;

            {
                this.f126707b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.activities.manual.eventType.a aVar = this.f126707b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.manual.eventType.a.C0449a c0449a = com.garmin.android.apps.connectmobile.activities.manual.eventType.a.f29185i;
                        aVar.u6().A4(aVar.f29191f);
                        oo.b bVarU6 = aVar.u6();
                        ge1.b.T(v1.a(bVarU6), null, null, new g(aVar.f29191f, bVarU6, aVar.f29192g, null), 3);
                        ((y0) aVar.u6().f133064n.getValue()).m("ActivitiesEventTypeFragment");
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.activities.manual.eventType.a.C0449a c0449a2 = com.garmin.android.apps.connectmobile.activities.manual.eventType.a.f29185i;
                        ((y0) aVar.u6().f133064n.getValue()).m("ActivitiesEventTypeFragment");
                        break;
                }
            }
        });
        View viewFindViewById5 = view2.findViewById(R.id.toolbar_actionbar_default);
        j jVar = new j();
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById5, jVar);
    }

    public final oo.b u6() {
        return (oo.b) this.f29186a.getValue();
    }

    public final void v6(k kVar, boolean z14) {
        kVar.getClass();
        this.f29191f = kVar;
        this.f29192g = z14;
        TextView textView = this.f29188c;
        if (textView != null) {
            textView.setEnabled(true);
        } else {
            p005kotlin.jvm.internal.s.m("save");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.manual.eventType.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/manual/eventType/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0449a {
        public /* synthetic */ C0449a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0449a() {
        }
    }
}
