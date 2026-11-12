package v92;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lv92/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f176379f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f176381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q92.x f176382c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f176384e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f176380a = new w1(s0.f105811a.b(r.class), new e(this), new v10.a(7), new f(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f176383d = e0.NO_ACTION;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f176386b;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.AGREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.DO_NOT_AGREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.GO_TO_OPT_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.GO_TO_OPT_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.CONFIRM_DELETE_DATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m.CANCEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m.CONFIRM_DELETE_DATA_CANCEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m.CONSENT_ACCESS_REQUIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f176385a = iArr;
            int[] iArr2 = new int[e0.values().length];
            try {
                iArr2[e0.ASK_FOR_DEVICE_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[e0.ASK_FOR_DEVICE_UPLOAD_OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[e0.NO_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            f176386b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v92/h$c", "Lb/s;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            h hVar = h.this;
            if (hVar.getChildFragmentManager().M() > 0) {
                hVar.getChildFragmentManager().Z();
                return;
            }
            c cVar = hVar.f176381b;
            if (cVar == null) {
                p005kotlin.jvm.internal.s.m("onBackPressedCallback");
                throw null;
            }
            cVar.f(false);
            hVar.requireActivity().getOnBackPressedDispatcher().d();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f176388a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f176388a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f176388a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f176388a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f176389a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f176389a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f176390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f176391b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f176390a = aVar;
            this.f176391b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f176390a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f176391b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f176381b = new c();
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        c cVar = this.f176381b;
        if (cVar != null) {
            onBackPressedDispatcher.b(cVar, this);
        } else {
            p005kotlin.jvm.internal.s.m("onBackPressedCallback");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        q92.v vVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        q92.x xVar = (q92.x) (arguments != null ? arguments.getSerializable("extra_consent_type_id") : null);
        if (xVar == null) {
            xVar = q92.x.DI_CONNECT_UPLOAD;
        }
        this.f176382c = xVar;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (vVar = (q92.v) arguments2.getParcelable("extra_consent_status")) != null) {
            LinkedHashMap linkedHashMap = u6().f176471f;
            q92.x xVar2 = this.f176382c;
            if (xVar2 == null) {
                p005kotlin.jvm.internal.s.m("consentTypeId");
                throw null;
            }
            linkedHashMap.put(xVar2, vVar);
        }
        Bundle arguments3 = getArguments();
        e0 e0Var = (e0) (arguments3 != null ? arguments3.getSerializable("extra_device_upload_action") : null);
        if (e0Var == null) {
            e0Var = e0.NO_ACTION;
        }
        this.f176383d = e0Var;
        Bundle arguments4 = getArguments();
        this.f176384e = arguments4 != null ? arguments4.getBoolean("extra_is_storage_depended", false) : false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.consent_feature_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final int i14 = 0;
        u6().f176472g.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: v92.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f176368b;

            {
                this.f176368b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                final h hVar = this.f176368b;
                final int i16 = 0;
                final int i17 = 1;
                switch (i15) {
                    case 0:
                        d0 d0Var = (d0) obj;
                        h.a aVar = h.f176379f;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureFragment", "consentViewState = " + d0Var);
                        if (d0Var instanceof d0.e) {
                            d0.e eVar = (d0.e) d0Var;
                            boolean z14 = eVar.f176343a;
                            p92.o.f136619a.getClass();
                            p92.a aVarL = p92.o.l();
                            Context contextRequireContext = hVar.requireContext();
                            contextRequireContext.getClass();
                            q92.x xVar = hVar.f176382c;
                            if (xVar == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            Uri uriC = ((z10.g0) aVarL).c(contextRequireContext, xVar);
                            p92.a aVarL2 = p92.o.l();
                            q92.x xVar2 = hVar.f176382c;
                            if (xVar2 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            ImageView.ScaleType scaleTypeD = ((z10.g0) aVarL2).d(xVar2);
                            m mVar = z14 ? hVar.u6().f176470e ? m.CONSENT_ACCESS_REQUIRED : m.AGREE : m.OPT_OUT;
                            m mVar2 = !z14 ? m.CANCEL : m.DO_NOT_AGREE;
                            l lVar = !z14 ? l.CONSENT_OPTING_OUT : l.CONSENT_OPTING_IN;
                            o.a aVar2 = o.f176444m;
                            s92.g gVar = eVar.f176344b;
                            aVar2.getClass();
                            o oVarA = o.a.a(gVar, uriC, mVar, mVar2, lVar, scaleTypeD);
                            androidx.fragment.app.v childFragmentManager = hVar.getChildFragmentManager();
                            androidx.fragment.app.a aVarB = androidx.core.view.j.b(childFragmentManager, childFragmentManager);
                            Fragment fragmentF = hVar.getChildFragmentManager().F(R.id.consent_feature_fragment_container);
                            if (fragmentF != null && fragmentF.isVisible()) {
                                aVarB.d(null);
                            }
                            aVarB.l(R.id.consent_feature_fragment_container, oVarA, null);
                            aVarB.e();
                        } else if (d0Var instanceof d0.g) {
                            d.a aVar3 = d.f176318n;
                            d0.g gVar2 = (d0.g) d0Var;
                            s92.g gVar3 = gVar2.f176346a;
                            s92.g gVar4 = gVar2.f176347b;
                            p92.o.f136619a.getClass();
                            p92.a aVarL3 = p92.o.l();
                            Context contextRequireContext2 = hVar.requireContext();
                            contextRequireContext2.getClass();
                            q92.x xVar3 = hVar.f176382c;
                            if (xVar3 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            Uri uriC2 = ((z10.g0) aVarL3).c(contextRequireContext2, xVar3);
                            String str = gVar2.f176348c;
                            p92.a aVarL4 = p92.o.l();
                            q92.x xVar4 = hVar.f176382c;
                            if (xVar4 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            ImageView.ScaleType scaleTypeD2 = ((z10.g0) aVarL4).d(xVar4);
                            aVar3.getClass();
                            gVar3.getClass();
                            gVar4.getClass();
                            scaleTypeD2.getClass();
                            Bundle bundle2 = new Bundle();
                            d dVar = new d();
                            bundle2.putParcelable("extra_top_image_uri", uriC2);
                            bundle2.putParcelable("extra_confirm_revoke_text_dto", gVar3);
                            bundle2.putParcelable("extra_consent_text_dto", gVar4);
                            bundle2.putInt("extra_top_image_scale_type", scaleTypeD2.ordinal());
                            bundle2.putString("extra_email_address", str);
                            dVar.setArguments(bundle2);
                            androidx.fragment.app.v childFragmentManager2 = hVar.getChildFragmentManager();
                            childFragmentManager2.getClass();
                            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(childFragmentManager2);
                            aVar4.d(null);
                            aVar4.l(R.id.consent_feature_fragment_container, dVar, null);
                            aVar4.e();
                        } else if (d0Var instanceof d0.h) {
                            p92.o.f136619a.getClass();
                            p92.a aVarL5 = p92.o.l();
                            Context contextRequireContext3 = hVar.requireContext();
                            contextRequireContext3.getClass();
                            Uri uriC3 = ((z10.g0) aVarL5).c(contextRequireContext3, q92.x.DI_CONNECT_UPLOAD);
                            p92.a aVarL6 = p92.o.l();
                            q92.x xVar5 = hVar.f176382c;
                            if (xVar5 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            ImageView.ScaleType scaleTypeD3 = ((z10.g0) aVarL6).d(xVar5);
                            o.a aVar5 = o.f176444m;
                            s92.g gVar5 = ((d0.h) d0Var).f176349a;
                            m mVar3 = m.GO_TO_OPT_IN;
                            m mVar4 = m.GO_TO_OPT_OUT;
                            l lVar2 = l.REVOKED_NOT_CONFIRMED;
                            aVar5.getClass();
                            o oVarA2 = o.a.a(gVar5, uriC3, mVar3, mVar4, lVar2, scaleTypeD3);
                            androidx.fragment.app.v childFragmentManager3 = hVar.getChildFragmentManager();
                            androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(childFragmentManager3, childFragmentManager3);
                            Fragment fragmentF2 = hVar.getChildFragmentManager().F(R.id.consent_feature_fragment_container);
                            if (fragmentF2 != null && fragmentF2.isVisible()) {
                                aVarB2.d(null);
                            }
                            aVarB2.l(R.id.consent_feature_fragment_container, oVarA2, "REVOKED_NOT_CONFIRMED");
                            aVarB2.e();
                        } else if (d0Var instanceof d0.b) {
                            d0.b bVar = (d0.b) d0Var;
                            hVar.u6().f176473h.m(new a.d(bVar.f176338a, bVar.f176339b, bVar.f176340c));
                        } else if (d0Var instanceof d0.f) {
                            androidx.fragment.app.v childFragmentManager4 = hVar.getChildFragmentManager();
                            q92.x xVar6 = hVar.f176382c;
                            if (xVar6 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            childFragmentManager4.G("ConsentFeatureFragment" + xVar6);
                            new androidx.appcompat.app.e.a(hVar.requireContext()).setCancelable(false).setTitle(R.string.consent_lib_data_storage_required_alert_title).setMessage(hVar.getString(R.string.consent_lib_data_storage_required_grant_consent_alert_msg)).setNegativeButton(hVar.getString(R.string.consent_lib_lbl_cancel), new ty1.o(23)).setPositiveButton(hVar.getString(R.string.consent_lib_lbl_continue), new sa2.b(hVar, 12)).create().show();
                        }
                        return Unit.INSTANCE;
                    default:
                        a aVar6 = (a) obj;
                        h.a aVar7 = h.f176379f;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureFragment", "consentAction = " + aVar6);
                        if (aVar6 instanceof a.C3291a) {
                            a.C3291a c3291a = (a.C3291a) aVar6;
                            final s92.g gVar6 = c3291a.f176291b;
                            switch (h.b.f176385a[c3291a.f176290a.ordinal()]) {
                                case 1:
                                    q92.x xVar7 = hVar.f176382c;
                                    if (xVar7 == null) {
                                        p005kotlin.jvm.internal.s.m("consentTypeId");
                                        throw null;
                                    }
                                    if (xVar7 == q92.x.DI_CONNECT_UPLOAD) {
                                        int i18 = h.b.f176386b[hVar.f176383d.ordinal()];
                                        if (i18 == 1 || i18 == 2) {
                                            new androidx.appcompat.app.e.a(hVar.requireContext()).setCancelable(false).setTitle(R.string.consent_lib_device_upload_ask_alert_title).setMessage(hVar.getString(R.string.consent_lib_device_upload_ask_alert_msg)).setPositiveButton(hVar.getString(R.string.consent_lib_lbl_allow), new DialogInterface.OnClickListener() { // from class: v92.g
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i19) {
                                                    int i24 = i16;
                                                    s92.g gVar7 = gVar6;
                                                    h hVar2 = hVar;
                                                    switch (i24) {
                                                        case 0:
                                                            h.a aVar8 = h.f176379f;
                                                            r rVarU6 = hVar2.u6();
                                                            q92.x xVar8 = hVar2.f176382c;
                                                            if (xVar8 != null) {
                                                                rVarU6.I4(xVar8, q92.y.OPT_IN, gVar7, Boolean.TRUE);
                                                                return;
                                                            } else {
                                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                                throw null;
                                                            }
                                                        default:
                                                            h.a aVar9 = h.f176379f;
                                                            r rVarU7 = hVar2.u6();
                                                            q92.x xVar9 = hVar2.f176382c;
                                                            if (xVar9 != null) {
                                                                rVarU7.I4(xVar9, q92.y.OPT_IN, gVar7, Boolean.FALSE);
                                                                return;
                                                            } else {
                                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                                throw null;
                                                            }
                                                    }
                                                }
                                            }).setNegativeButton(hVar.getString(R.string.consent_lib_lbl_not_now), new DialogInterface.OnClickListener() { // from class: v92.g
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i19) {
                                                    int i24 = i17;
                                                    s92.g gVar7 = gVar6;
                                                    h hVar2 = hVar;
                                                    switch (i24) {
                                                        case 0:
                                                            h.a aVar8 = h.f176379f;
                                                            r rVarU6 = hVar2.u6();
                                                            q92.x xVar8 = hVar2.f176382c;
                                                            if (xVar8 != null) {
                                                                rVarU6.I4(xVar8, q92.y.OPT_IN, gVar7, Boolean.TRUE);
                                                                return;
                                                            } else {
                                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                                throw null;
                                                            }
                                                        default:
                                                            h.a aVar9 = h.f176379f;
                                                            r rVarU7 = hVar2.u6();
                                                            q92.x xVar9 = hVar2.f176382c;
                                                            if (xVar9 != null) {
                                                                rVarU7.I4(xVar9, q92.y.OPT_IN, gVar7, Boolean.FALSE);
                                                                return;
                                                            } else {
                                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                                throw null;
                                                            }
                                                    }
                                                }
                                            }).create().show();
                                        } else if (i18 == 3) {
                                            r rVarU6 = hVar.u6();
                                            q92.x xVar8 = hVar.f176382c;
                                            if (xVar8 == null) {
                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                throw null;
                                            }
                                            rVarU6.I4(xVar8, q92.y.OPT_IN, gVar6, Boolean.TRUE);
                                        } else {
                                            if (i18 != 4) {
                                                u0.r();
                                                return null;
                                            }
                                            r rVarU7 = hVar.u6();
                                            q92.x xVar9 = hVar.f176382c;
                                            if (xVar9 == null) {
                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                throw null;
                                            }
                                            q92.y yVar = q92.y.OPT_IN;
                                            int i19 = r.f176465l;
                                            rVarU7.I4(xVar9, yVar, gVar6, null);
                                        }
                                    } else if (hVar.f176384e) {
                                        r rVarU8 = hVar.u6();
                                        q92.x xVar10 = hVar.f176382c;
                                        if (xVar10 == null) {
                                            p005kotlin.jvm.internal.s.m("consentTypeId");
                                            throw null;
                                        }
                                        rVarU8.H4(xVar10, gVar6);
                                    } else {
                                        r rVarU9 = hVar.u6();
                                        q92.x xVar11 = hVar.f176382c;
                                        if (xVar11 == null) {
                                            p005kotlin.jvm.internal.s.m("consentTypeId");
                                            throw null;
                                        }
                                        q92.y yVar2 = q92.y.OPT_IN;
                                        int i24 = r.f176465l;
                                        rVarU9.I4(xVar11, yVar2, gVar6, null);
                                    }
                                    break;
                                    break;
                                case 2:
                                    r rVarU10 = hVar.u6();
                                    q92.x xVar12 = hVar.f176382c;
                                    if (xVar12 == null) {
                                        p005kotlin.jvm.internal.s.m("consentTypeId");
                                        throw null;
                                    }
                                    gVar6.getClass();
                                    p92.y.a.a("ConsentFeatureViewModel", "optOutConsent(" + xVar12 + " , " + gVar6 + ")");
                                    if (xVar12 != q92.x.DI_CONNECT_UPLOAD) {
                                        rVarU10.C4(xVar12, true, gVar6);
                                    } else {
                                        rVarU10.F4(gVar6);
                                    }
                                    break;
                                    break;
                                case 3:
                                    if (hVar.getChildFragmentManager().G("REVOKED_NOT_CONFIRMED") != null) {
                                        hVar.requireActivity().getOnBackPressedDispatcher().d();
                                    } else {
                                        r rVarU11 = hVar.u6();
                                        q92.x xVar13 = hVar.f176382c;
                                        if (xVar13 == null) {
                                            p005kotlin.jvm.internal.s.m("consentTypeId");
                                            throw null;
                                        }
                                        gVar6.getClass();
                                        p92.y.a.a("ConsentFeatureViewModel", "doNotAgreeConsent(" + xVar13 + " , " + gVar6 + ")");
                                        rVarU11.C4(xVar13, false, gVar6);
                                    }
                                    break;
                                case 4:
                                    r rVarU12 = hVar.u6();
                                    q92.x xVar14 = hVar.f176382c;
                                    if (xVar14 == null) {
                                        p005kotlin.jvm.internal.s.m("consentTypeId");
                                        throw null;
                                    }
                                    rVarU12.D4(xVar14, true);
                                    break;
                                    break;
                                case 5:
                                    r rVarU13 = hVar.u6();
                                    q92.x xVar15 = hVar.f176382c;
                                    if (xVar15 == null) {
                                        p005kotlin.jvm.internal.s.m("consentTypeId");
                                        throw null;
                                    }
                                    rVarU13.D4(xVar15, false);
                                    break;
                                    break;
                                case 6:
                                    break;
                                case 7:
                                case 8:
                                    hVar.requireActivity().getOnBackPressedDispatcher().d();
                                    break;
                                case 9:
                                    hVar.u6().f176472g.m(d0.l.f176353a);
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        u6().f176473h.m(null);
        final int i15 = 1;
        u6().f176473h.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: v92.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f176368b;

            {
                this.f176368b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                final h hVar = this.f176368b;
                final int i17 = 0;
                final int i18 = 1;
                switch (i16) {
                    case 0:
                        d0 d0Var = (d0) obj;
                        h.a aVar = h.f176379f;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureFragment", "consentViewState = " + d0Var);
                        if (d0Var instanceof d0.e) {
                            d0.e eVar = (d0.e) d0Var;
                            boolean z14 = eVar.f176343a;
                            p92.o.f136619a.getClass();
                            p92.a aVarL = p92.o.l();
                            Context contextRequireContext = hVar.requireContext();
                            contextRequireContext.getClass();
                            q92.x xVar = hVar.f176382c;
                            if (xVar == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            Uri uriC = ((z10.g0) aVarL).c(contextRequireContext, xVar);
                            p92.a aVarL2 = p92.o.l();
                            q92.x xVar2 = hVar.f176382c;
                            if (xVar2 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            ImageView.ScaleType scaleTypeD = ((z10.g0) aVarL2).d(xVar2);
                            m mVar = z14 ? hVar.u6().f176470e ? m.CONSENT_ACCESS_REQUIRED : m.AGREE : m.OPT_OUT;
                            m mVar2 = !z14 ? m.CANCEL : m.DO_NOT_AGREE;
                            l lVar = !z14 ? l.CONSENT_OPTING_OUT : l.CONSENT_OPTING_IN;
                            o.a aVar2 = o.f176444m;
                            s92.g gVar = eVar.f176344b;
                            aVar2.getClass();
                            o oVarA = o.a.a(gVar, uriC, mVar, mVar2, lVar, scaleTypeD);
                            androidx.fragment.app.v childFragmentManager = hVar.getChildFragmentManager();
                            androidx.fragment.app.a aVarB = androidx.core.view.j.b(childFragmentManager, childFragmentManager);
                            Fragment fragmentF = hVar.getChildFragmentManager().F(R.id.consent_feature_fragment_container);
                            if (fragmentF != null && fragmentF.isVisible()) {
                                aVarB.d(null);
                            }
                            aVarB.l(R.id.consent_feature_fragment_container, oVarA, null);
                            aVarB.e();
                        } else if (d0Var instanceof d0.g) {
                            d.a aVar3 = d.f176318n;
                            d0.g gVar2 = (d0.g) d0Var;
                            s92.g gVar3 = gVar2.f176346a;
                            s92.g gVar4 = gVar2.f176347b;
                            p92.o.f136619a.getClass();
                            p92.a aVarL3 = p92.o.l();
                            Context contextRequireContext2 = hVar.requireContext();
                            contextRequireContext2.getClass();
                            q92.x xVar3 = hVar.f176382c;
                            if (xVar3 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            Uri uriC2 = ((z10.g0) aVarL3).c(contextRequireContext2, xVar3);
                            String str = gVar2.f176348c;
                            p92.a aVarL4 = p92.o.l();
                            q92.x xVar4 = hVar.f176382c;
                            if (xVar4 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            ImageView.ScaleType scaleTypeD2 = ((z10.g0) aVarL4).d(xVar4);
                            aVar3.getClass();
                            gVar3.getClass();
                            gVar4.getClass();
                            scaleTypeD2.getClass();
                            Bundle bundle2 = new Bundle();
                            d dVar = new d();
                            bundle2.putParcelable("extra_top_image_uri", uriC2);
                            bundle2.putParcelable("extra_confirm_revoke_text_dto", gVar3);
                            bundle2.putParcelable("extra_consent_text_dto", gVar4);
                            bundle2.putInt("extra_top_image_scale_type", scaleTypeD2.ordinal());
                            bundle2.putString("extra_email_address", str);
                            dVar.setArguments(bundle2);
                            androidx.fragment.app.v childFragmentManager2 = hVar.getChildFragmentManager();
                            childFragmentManager2.getClass();
                            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(childFragmentManager2);
                            aVar4.d(null);
                            aVar4.l(R.id.consent_feature_fragment_container, dVar, null);
                            aVar4.e();
                        } else if (d0Var instanceof d0.h) {
                            p92.o.f136619a.getClass();
                            p92.a aVarL5 = p92.o.l();
                            Context contextRequireContext3 = hVar.requireContext();
                            contextRequireContext3.getClass();
                            Uri uriC3 = ((z10.g0) aVarL5).c(contextRequireContext3, q92.x.DI_CONNECT_UPLOAD);
                            p92.a aVarL6 = p92.o.l();
                            q92.x xVar5 = hVar.f176382c;
                            if (xVar5 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            ImageView.ScaleType scaleTypeD3 = ((z10.g0) aVarL6).d(xVar5);
                            o.a aVar5 = o.f176444m;
                            s92.g gVar5 = ((d0.h) d0Var).f176349a;
                            m mVar3 = m.GO_TO_OPT_IN;
                            m mVar4 = m.GO_TO_OPT_OUT;
                            l lVar2 = l.REVOKED_NOT_CONFIRMED;
                            aVar5.getClass();
                            o oVarA2 = o.a.a(gVar5, uriC3, mVar3, mVar4, lVar2, scaleTypeD3);
                            androidx.fragment.app.v childFragmentManager3 = hVar.getChildFragmentManager();
                            androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(childFragmentManager3, childFragmentManager3);
                            Fragment fragmentF2 = hVar.getChildFragmentManager().F(R.id.consent_feature_fragment_container);
                            if (fragmentF2 != null && fragmentF2.isVisible()) {
                                aVarB2.d(null);
                            }
                            aVarB2.l(R.id.consent_feature_fragment_container, oVarA2, "REVOKED_NOT_CONFIRMED");
                            aVarB2.e();
                        } else if (d0Var instanceof d0.b) {
                            d0.b bVar = (d0.b) d0Var;
                            hVar.u6().f176473h.m(new a.d(bVar.f176338a, bVar.f176339b, bVar.f176340c));
                        } else if (d0Var instanceof d0.f) {
                            androidx.fragment.app.v childFragmentManager4 = hVar.getChildFragmentManager();
                            q92.x xVar6 = hVar.f176382c;
                            if (xVar6 == null) {
                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                throw null;
                            }
                            childFragmentManager4.G("ConsentFeatureFragment" + xVar6);
                            new androidx.appcompat.app.e.a(hVar.requireContext()).setCancelable(false).setTitle(R.string.consent_lib_data_storage_required_alert_title).setMessage(hVar.getString(R.string.consent_lib_data_storage_required_grant_consent_alert_msg)).setNegativeButton(hVar.getString(R.string.consent_lib_lbl_cancel), new ty1.o(23)).setPositiveButton(hVar.getString(R.string.consent_lib_lbl_continue), new sa2.b(hVar, 12)).create().show();
                        }
                        return Unit.INSTANCE;
                    default:
                        a aVar6 = (a) obj;
                        h.a aVar7 = h.f176379f;
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureFragment", "consentAction = " + aVar6);
                        if (aVar6 instanceof a.C3291a) {
                            a.C3291a c3291a = (a.C3291a) aVar6;
                            final s92.g gVar6 = c3291a.f176291b;
                            switch (h.b.f176385a[c3291a.f176290a.ordinal()]) {
                                case 1:
                                    q92.x xVar7 = hVar.f176382c;
                                    if (xVar7 == null) {
                                        p005kotlin.jvm.internal.s.m("consentTypeId");
                                        throw null;
                                    }
                                    if (xVar7 == q92.x.DI_CONNECT_UPLOAD) {
                                        int i19 = h.b.f176386b[hVar.f176383d.ordinal()];
                                        if (i19 == 1 || i19 == 2) {
                                            new androidx.appcompat.app.e.a(hVar.requireContext()).setCancelable(false).setTitle(R.string.consent_lib_device_upload_ask_alert_title).setMessage(hVar.getString(R.string.consent_lib_device_upload_ask_alert_msg)).setPositiveButton(hVar.getString(R.string.consent_lib_lbl_allow), new DialogInterface.OnClickListener() { // from class: v92.g
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i110) {
                                                    int i24 = i17;
                                                    s92.g gVar7 = gVar6;
                                                    h hVar2 = hVar;
                                                    switch (i24) {
                                                        case 0:
                                                            h.a aVar8 = h.f176379f;
                                                            r rVarU6 = hVar2.u6();
                                                            q92.x xVar8 = hVar2.f176382c;
                                                            if (xVar8 != null) {
                                                                rVarU6.I4(xVar8, q92.y.OPT_IN, gVar7, Boolean.TRUE);
                                                                return;
                                                            } else {
                                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                                throw null;
                                                            }
                                                        default:
                                                            h.a aVar9 = h.f176379f;
                                                            r rVarU7 = hVar2.u6();
                                                            q92.x xVar9 = hVar2.f176382c;
                                                            if (xVar9 != null) {
                                                                rVarU7.I4(xVar9, q92.y.OPT_IN, gVar7, Boolean.FALSE);
                                                                return;
                                                            } else {
                                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                                throw null;
                                                            }
                                                    }
                                                }
                                            }).setNegativeButton(hVar.getString(R.string.consent_lib_lbl_not_now), new DialogInterface.OnClickListener() { // from class: v92.g
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i110) {
                                                    int i24 = i18;
                                                    s92.g gVar7 = gVar6;
                                                    h hVar2 = hVar;
                                                    switch (i24) {
                                                        case 0:
                                                            h.a aVar8 = h.f176379f;
                                                            r rVarU6 = hVar2.u6();
                                                            q92.x xVar8 = hVar2.f176382c;
                                                            if (xVar8 != null) {
                                                                rVarU6.I4(xVar8, q92.y.OPT_IN, gVar7, Boolean.TRUE);
                                                                return;
                                                            } else {
                                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                                throw null;
                                                            }
                                                        default:
                                                            h.a aVar9 = h.f176379f;
                                                            r rVarU7 = hVar2.u6();
                                                            q92.x xVar9 = hVar2.f176382c;
                                                            if (xVar9 != null) {
                                                                rVarU7.I4(xVar9, q92.y.OPT_IN, gVar7, Boolean.FALSE);
                                                                return;
                                                            } else {
                                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                                throw null;
                                                            }
                                                    }
                                                }
                                            }).create().show();
                                        } else if (i19 == 3) {
                                            r rVarU6 = hVar.u6();
                                            q92.x xVar8 = hVar.f176382c;
                                            if (xVar8 == null) {
                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                throw null;
                                            }
                                            rVarU6.I4(xVar8, q92.y.OPT_IN, gVar6, Boolean.TRUE);
                                        } else {
                                            if (i19 != 4) {
                                                u0.r();
                                                return null;
                                            }
                                            r rVarU7 = hVar.u6();
                                            q92.x xVar9 = hVar.f176382c;
                                            if (xVar9 == null) {
                                                p005kotlin.jvm.internal.s.m("consentTypeId");
                                                throw null;
                                            }
                                            q92.y yVar = q92.y.OPT_IN;
                                            int i110 = r.f176465l;
                                            rVarU7.I4(xVar9, yVar, gVar6, null);
                                        }
                                    } else if (hVar.f176384e) {
                                        r rVarU8 = hVar.u6();
                                        q92.x xVar10 = hVar.f176382c;
                                        if (xVar10 == null) {
                                            p005kotlin.jvm.internal.s.m("consentTypeId");
                                            throw null;
                                        }
                                        rVarU8.H4(xVar10, gVar6);
                                    } else {
                                        r rVarU9 = hVar.u6();
                                        q92.x xVar11 = hVar.f176382c;
                                        if (xVar11 == null) {
                                            p005kotlin.jvm.internal.s.m("consentTypeId");
                                            throw null;
                                        }
                                        q92.y yVar2 = q92.y.OPT_IN;
                                        int i24 = r.f176465l;
                                        rVarU9.I4(xVar11, yVar2, gVar6, null);
                                    }
                                    break;
                                    break;
                                case 2:
                                    r rVarU10 = hVar.u6();
                                    q92.x xVar12 = hVar.f176382c;
                                    if (xVar12 == null) {
                                        p005kotlin.jvm.internal.s.m("consentTypeId");
                                        throw null;
                                    }
                                    gVar6.getClass();
                                    p92.y.a.a("ConsentFeatureViewModel", "optOutConsent(" + xVar12 + " , " + gVar6 + ")");
                                    if (xVar12 != q92.x.DI_CONNECT_UPLOAD) {
                                        rVarU10.C4(xVar12, true, gVar6);
                                    } else {
                                        rVarU10.F4(gVar6);
                                    }
                                    break;
                                    break;
                                case 3:
                                    if (hVar.getChildFragmentManager().G("REVOKED_NOT_CONFIRMED") != null) {
                                        hVar.requireActivity().getOnBackPressedDispatcher().d();
                                    } else {
                                        r rVarU11 = hVar.u6();
                                        q92.x xVar13 = hVar.f176382c;
                                        if (xVar13 == null) {
                                            p005kotlin.jvm.internal.s.m("consentTypeId");
                                            throw null;
                                        }
                                        gVar6.getClass();
                                        p92.y.a.a("ConsentFeatureViewModel", "doNotAgreeConsent(" + xVar13 + " , " + gVar6 + ")");
                                        rVarU11.C4(xVar13, false, gVar6);
                                    }
                                    break;
                                case 4:
                                    r rVarU12 = hVar.u6();
                                    q92.x xVar14 = hVar.f176382c;
                                    if (xVar14 == null) {
                                        p005kotlin.jvm.internal.s.m("consentTypeId");
                                        throw null;
                                    }
                                    rVarU12.D4(xVar14, true);
                                    break;
                                    break;
                                case 5:
                                    r rVarU13 = hVar.u6();
                                    q92.x xVar15 = hVar.f176382c;
                                    if (xVar15 == null) {
                                        p005kotlin.jvm.internal.s.m("consentTypeId");
                                        throw null;
                                    }
                                    rVarU13.D4(xVar15, false);
                                    break;
                                    break;
                                case 6:
                                    break;
                                case 7:
                                case 8:
                                    hVar.requireActivity().getOnBackPressedDispatcher().d();
                                    break;
                                case 9:
                                    hVar.u6().f176472g.m(d0.l.f176353a);
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        LinkedHashMap linkedHashMap = u6().f176471f;
        q92.x xVar = this.f176382c;
        if (xVar == null) {
            p005kotlin.jvm.internal.s.m("consentTypeId");
            throw null;
        }
        q92.v vVar = (q92.v) linkedHashMap.get(xVar);
        q92.a aVar = vVar != null ? vVar.f143787e : null;
        LinkedHashMap linkedHashMap2 = u6().f176471f;
        q92.x xVar2 = this.f176382c;
        if (xVar2 == null) {
            p005kotlin.jvm.internal.s.m("consentTypeId");
            throw null;
        }
        q92.v vVar2 = (q92.v) linkedHashMap2.get(xVar2);
        q92.y yVar = vVar2 != null ? vVar2.f143784b : null;
        q92.x xVar3 = this.f176382c;
        if (xVar3 == null) {
            p005kotlin.jvm.internal.s.m("consentTypeId");
            throw null;
        }
        if (xVar3 == q92.x.DI_CONNECT_UPLOAD && yVar == q92.y.OPT_OUT && (aVar == q92.a.NOT_CONFIRMED || aVar == q92.a.LOCATION_CHANGED || aVar == q92.a.PASSWORD_CHECK_FAILED)) {
            u6().G4();
            return;
        }
        Bundle arguments = getArguments();
        s92.g gVar = arguments != null ? (s92.g) arguments.getParcelable("extra_consent_text_dto") : null;
        r rVarU6 = u6();
        q92.x xVar4 = this.f176382c;
        if (xVar4 == null) {
            p005kotlin.jvm.internal.s.m("consentTypeId");
            throw null;
        }
        q92.v vVar3 = (q92.v) rVarU6.f176471f.get(xVar4);
        if (vVar3 != null && gVar != null) {
            rVarU6.f176472g.m(new d0.e(q92.c.c(vVar3), gVar));
        } else if (vVar3 != null) {
            rVarU6.D4(xVar4, q92.c.c(vVar3));
        } else {
            rVarU6.E4(xVar4);
        }
    }

    public final r u6() {
        return (r) this.f176380a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lv92/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONSENT_TYPE_ID", "EXTRA_CONSENT_STATUS", "EXTRA_CONSENT_TEXT_DTO", "EXTRA_DEVICE_UPLOAD_ACTION", "EXTRA_IS_STORAGE_DEPENDED", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a(q92.v vVar, s92.g gVar, e0 e0Var) {
            e0Var.getClass();
            Bundle bundle = new Bundle();
            h hVar = new h();
            bundle.putSerializable("extra_consent_type_id", q92.x.DI_CONNECT_UPLOAD);
            bundle.putParcelable("extra_consent_status", vVar);
            bundle.putParcelable("extra_consent_text_dto", gVar);
            bundle.putSerializable("extra_device_upload_action", e0Var);
            hVar.setArguments(bundle);
            return hVar;
        }

        private a() {
        }
    }
}
