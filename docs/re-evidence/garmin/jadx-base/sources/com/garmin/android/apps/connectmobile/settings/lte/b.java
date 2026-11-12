package com.garmin.android.apps.connectmobile.settings.lte;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMRunningProgressView;
import com.garmin.android.apps.connectmobile.z1;
import e23.l;
import fw.p;
import java.util.Map;
import lc.u0;
import o13.h;
import ov1.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import qi1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f43475i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f43476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f43477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatButton f43478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatButton f43479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f43480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMRunningProgressView f43481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f43483h;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.lte.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0805b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43485b;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.ERROR_RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.ERROR_EXIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.GENESIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u.TRANSFER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u.TRANSFER_PROCESSING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u.TRANSFER_COMPLETE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u.COMPLETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u.TRANSFER_TIMEOUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[u.TRANSFER_PROCESSING_OLDDEVICE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f43484a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            f43485b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43486a;

        public c(l lVar) {
            lVar.getClass();
            this.f43486a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43486a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43486a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43487a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43487a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43487a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43489b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43488a = aVar;
            this.f43489b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43488a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43489b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f43490a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43490a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b() {
        super(R.layout.lte_subscription_fragment);
        this.f43483h = new w1(s0.f105811a.b(qi1.f.class), new d(this), new f(this), new e(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.initActionBar(getString(R.string.lte_set_up_title), 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.lte_title);
        viewFindViewById.getClass();
        this.f43476a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.lte_description_text);
        viewFindViewById2.getClass();
        this.f43477b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.set_up_button);
        viewFindViewById3.getClass();
        this.f43478c = (AppCompatButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.other_button);
        viewFindViewById4.getClass();
        this.f43479d = (AppCompatButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.lte_icon_image);
        viewFindViewById5.getClass();
        this.f43480e = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.device_detection_progress);
        viewFindViewById6.getClass();
        this.f43481f = (GCMRunningProgressView) viewFindViewById6;
        final int i14 = 0;
        u6().f144862d.f(getViewLifecycleOwner(), new c(new l(this) { // from class: qi1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.lte.b f144855b;

            {
                this.f144855b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String productDisplayName;
                String productDisplayName2;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.lte.b bVar = this.f144855b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i16 = com.garmin.android.apps.connectmobile.settings.lte.b.C0805b.f43485b[pVar.ordinal()];
                        boolean z14 = true;
                        if (i16 == 1) {
                            u uVar = (u) t7;
                            if (uVar != u.TRANSFER_PROCESSING) {
                                ImageView imageView = bVar.f43480e;
                                if (imageView == null) {
                                    p005kotlin.jvm.internal.s.m("imgView");
                                    throw null;
                                }
                                imageView.setVisibility(0);
                                GCMRunningProgressView gCMRunningProgressView = bVar.f43481f;
                                if (gCMRunningProgressView == null) {
                                    p005kotlin.jvm.internal.s.m("runningProgressView");
                                    throw null;
                                }
                                gCMRunningProgressView.setVisibility(8);
                            }
                            String str = "";
                            switch (uVar != null ? com.garmin.android.apps.connectmobile.settings.lte.b.C0805b.f43484a[uVar.ordinal()] : -1) {
                                case 4:
                                    TextView textView = bVar.f43476a;
                                    if (textView == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView.setText(bVar.getString(R.string.connect_to_lte_title));
                                    TextView textView2 = bVar.f43477b;
                                    if (textView2 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView2.setText(bVar.getString(R.string.connect_to_lte_descr));
                                    AppCompatButton appCompatButton = bVar.f43478c;
                                    if (appCompatButton == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton.setVisibility(0);
                                    ImageView imageView2 = bVar.f43480e;
                                    if (imageView2 == null) {
                                        p005kotlin.jvm.internal.s.m("imgView");
                                        throw null;
                                    }
                                    imageView2.setVisibility(0);
                                    Map<Object, String> mapD = bVar.u6().f144866h.d();
                                    if (mapD != null && !mapD.isEmpty()) {
                                        z14 = false;
                                    }
                                    AppCompatButton appCompatButton2 = bVar.f43479d;
                                    if (z14) {
                                        if (appCompatButton2 == null) {
                                            p005kotlin.jvm.internal.s.m("otherButton");
                                            throw null;
                                        }
                                        appCompatButton2.setVisibility(8);
                                        AppCompatButton appCompatButton3 = bVar.f43478c;
                                        if (appCompatButton3 == null) {
                                            p005kotlin.jvm.internal.s.m("setUpButton");
                                            throw null;
                                        }
                                        ViewGroup.LayoutParams layoutParams = appCompatButton3.getLayoutParams();
                                        layoutParams.getClass();
                                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
                                        bVar2.setMargins(0, 0, 0, 16);
                                        appCompatButton3.setLayoutParams(bVar2);
                                    } else {
                                        if (appCompatButton2 == null) {
                                            p005kotlin.jvm.internal.s.m("otherButton");
                                            throw null;
                                        }
                                        appCompatButton2.setText(bVar.getString(R.string.lte_see_transfer_options));
                                        appCompatButton2.setVisibility(0);
                                    }
                                    break;
                                    break;
                                case 5:
                                    TextView textView3 = bVar.f43476a;
                                    if (textView3 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView3.setText(bVar.getString(R.string.lte_set_up_complete_title));
                                    TextView textView4 = bVar.f43477b;
                                    if (textView4 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView4.setText(bVar.getString(R.string.lte_completed_descr));
                                    AppCompatButton appCompatButton4 = bVar.f43478c;
                                    if (appCompatButton4 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton4.setVisibility(8);
                                    AppCompatButton appCompatButton5 = bVar.f43479d;
                                    if (appCompatButton5 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton5.setVisibility(8);
                                    break;
                                    break;
                                case 6:
                                    TextView textView5 = bVar.f43476a;
                                    if (textView5 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView5.setText(bVar.getString(R.string.lte_previous_subscription_found));
                                    TextView textView6 = bVar.f43477b;
                                    if (textView6 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    sd2.f fVar = bVar.u6().f144872n;
                                    if (fVar != null && (productDisplayName = fVar.getProductDisplayName()) != null) {
                                        str = productDisplayName;
                                    }
                                    textView6.setText(bVar.getString(R.string.lte_subscription_found_msg2, str));
                                    AppCompatButton appCompatButton6 = bVar.f43478c;
                                    if (appCompatButton6 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton6.setText(bVar.getString(R.string.lte_transfer_subscription));
                                    AppCompatButton appCompatButton7 = bVar.f43479d;
                                    if (appCompatButton7 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton7.setText(bVar.getString(R.string.feedback_no_thanks_btn));
                                    AppCompatButton appCompatButton8 = bVar.f43478c;
                                    if (appCompatButton8 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton8.setVisibility(0);
                                    AppCompatButton appCompatButton9 = bVar.f43479d;
                                    if (appCompatButton9 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton9.setVisibility(0);
                                    break;
                                    break;
                                case 7:
                                    ImageView imageView3 = bVar.f43480e;
                                    if (imageView3 == null) {
                                        p005kotlin.jvm.internal.s.m("imgView");
                                        throw null;
                                    }
                                    imageView3.setVisibility(4);
                                    GCMRunningProgressView gCMRunningProgressView2 = bVar.f43481f;
                                    if (gCMRunningProgressView2 == null) {
                                        p005kotlin.jvm.internal.s.m("runningProgressView");
                                        throw null;
                                    }
                                    gCMRunningProgressView2.setVisibility(0);
                                    TextView textView7 = bVar.f43476a;
                                    if (textView7 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView7.setText(bVar.getString(R.string.lte_transferring_desc2, "30"));
                                    AppCompatButton appCompatButton10 = bVar.f43478c;
                                    if (appCompatButton10 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton10.setVisibility(8);
                                    AppCompatButton appCompatButton11 = bVar.f43479d;
                                    if (appCompatButton11 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton11.setVisibility(8);
                                    TextView textView8 = bVar.f43477b;
                                    if (textView8 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView8.setVisibility(8);
                                    break;
                                    break;
                                case 8:
                                    TextView textView9 = bVar.f43476a;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView9.setText(bVar.getString(R.string.common_youre_all_set));
                                    TextView textView10 = bVar.f43477b;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    sd2.f fVar2 = bVar.u6().f144872n;
                                    if (fVar2 != null && (productDisplayName2 = fVar2.getProductDisplayName()) != null) {
                                        str = productDisplayName2;
                                    }
                                    textView10.setText(bVar.getString(R.string.lte_transfer_subscription_success_msg2, str));
                                    TextView textView11 = bVar.f43477b;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView11.setVisibility(0);
                                    AppCompatButton appCompatButton12 = bVar.f43478c;
                                    if (appCompatButton12 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton12.setVisibility(4);
                                    AppCompatButton appCompatButton13 = bVar.f43479d;
                                    if (appCompatButton13 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton13.setVisibility(0);
                                    appCompatButton13.setText(bVar.getString(R.string.sleep_advanced_sleep_got_it_button));
                                    appCompatButton13.setTextAppearance(R.style.PrimaryActionButtonStyle);
                                    break;
                                    break;
                                case 9:
                                    TextView textView12 = bVar.f43476a;
                                    if (textView12 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView12.setText(bVar.getString(R.string.lte_set_up_complete_title));
                                    TextView textView13 = bVar.f43477b;
                                    if (textView13 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView13.setText(bVar.getString(R.string.lte_completed_descr));
                                    AppCompatButton appCompatButton14 = bVar.f43478c;
                                    if (appCompatButton14 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton14.setVisibility(8);
                                    AppCompatButton appCompatButton15 = bVar.f43479d;
                                    if (appCompatButton15 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton15.setVisibility(8);
                                    break;
                                    break;
                                case 10:
                                    TextView textView14 = bVar.f43476a;
                                    if (textView14 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView14.setText(bVar.getString(R.string.lte_transfer_progress));
                                    TextView textView15 = bVar.f43477b;
                                    if (textView15 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView15.setVisibility(0);
                                    TextView textView16 = bVar.f43477b;
                                    if (textView16 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView16.setText(bVar.getString(R.string.lte_transfer_progress_desc));
                                    AppCompatButton appCompatButton16 = bVar.f43478c;
                                    if (appCompatButton16 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton16.setVisibility(4);
                                    AppCompatButton appCompatButton17 = bVar.f43479d;
                                    if (appCompatButton17 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton17.setText(bVar.getString(R.string.lbl_close));
                                    appCompatButton17.setVisibility(0);
                                    appCompatButton17.setTextAppearance(R.style.PrimaryActionButtonStyle);
                                    break;
                                    break;
                                case 11:
                                    TextView textView17 = bVar.f43476a;
                                    if (textView17 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView17.setText(bVar.getString(R.string.lte_transfer_progress));
                                    TextView textView18 = bVar.f43477b;
                                    if (textView18 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView18.setVisibility(0);
                                    TextView textView19 = bVar.f43477b;
                                    if (textView19 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView19.setText(bVar.getString(R.string.lte_transfer_progress_old_desc));
                                    AppCompatButton appCompatButton18 = bVar.f43479d;
                                    if (appCompatButton18 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton18.setVisibility(4);
                                    AppCompatButton appCompatButton19 = bVar.f43478c;
                                    if (appCompatButton19 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton19.setVisibility(4);
                                    break;
                                    break;
                                default:
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var, "LTESubscriptionStatusFragment", "handleSubscriptionStatus status: " + uVar + " not handled");
                                    break;
                            }
                            g22.e.f(bVar);
                        } else if (i16 == 2) {
                            g22.e.l(bVar);
                        } else {
                            if (i16 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(bVar);
                            GCMRunningProgressView gCMRunningProgressView3 = bVar.f43481f;
                            if (gCMRunningProgressView3 == null) {
                                p005kotlin.jvm.internal.s.m("runningProgressView");
                                throw null;
                            }
                            gCMRunningProgressView3.setVisibility(8);
                            u uVar2 = (u) t7;
                            int i17 = uVar2 != null ? com.garmin.android.apps.connectmobile.settings.lte.b.C0805b.f43484a[uVar2.ordinal()] : -1;
                            if (i17 == 1) {
                                bVar.v6(false);
                            } else if (i17 == 2) {
                                bVar.v6(true);
                            } else if (i17 != 3) {
                                g22.e.c(bVar);
                            } else {
                                androidx.fragment.app.m activity = bVar.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                        Context contextRequireContext = bVar.requireContext();
                        SafetyFeatureSetupWizardActivity.a aVar4 = SafetyFeatureSetupWizardActivity.f43851k;
                        Context contextRequireContext2 = bVar.requireContext();
                        contextRequireContext2.getClass();
                        hl.a.c cVar = hl.a.c.f84256b;
                        aVar4.getClass();
                        contextRequireContext.startActivity(SafetyFeatureSetupWizardActivity.a.a(contextRequireContext2, cVar));
                        return Unit.INSTANCE;
                }
            }
        }));
        AppCompatButton appCompatButton = this.f43478c;
        if (appCompatButton == null) {
            s.m("setUpButton");
            throw null;
        }
        final int i15 = 0;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: qi1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.lte.b f144857b;

            {
                this.f144857b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Map<Object, String> mapD;
                androidx.fragment.app.m activity;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.lte.b bVar = this.f144857b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                        view3.getClass();
                        CharSequence text = ((Button) view3).getText();
                        if (p005kotlin.jvm.internal.s.g(text, bVar.getString(R.string.lte_set_up_button_title))) {
                            bVar.u6().E4(s.SETUP);
                            break;
                        } else if (p005kotlin.jvm.internal.s.g(text, bVar.getString(R.string.lte_transfer_subscription)) && (mapD = bVar.u6().f144866h.d()) != null) {
                            if (mapD.size() > 1) {
                                new r22.y1().a(bVar.getContext(), bVar.getString(R.string.lte_transfer_device_selector), mapD, "", new ps2.d(bVar, 12));
                            } else if (mapD.size() == 1) {
                                Object objA0 = h0.a0(mapD.keySet());
                                objA0.getClass();
                                bVar.f43482g = ((Long) objA0).longValue();
                                bVar.u6().F4(bVar.f43482g);
                            }
                            break;
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar2 = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                        view3.getClass();
                        CharSequence text2 = ((Button) view3).getText();
                        if (p005kotlin.jvm.internal.s.g(text2, bVar.getString(R.string.lte_see_transfer_options))) {
                            bVar.u6().E4(s.OTHER_OPTIONS);
                            break;
                        } else if (p005kotlin.jvm.internal.s.g(text2, bVar.getString(R.string.sleep_advanced_sleep_got_it_button))) {
                            bVar.u6().E4(s.TRANSFER_COMPLETE);
                            bVar.f43482g = 0L;
                            break;
                        } else if (p005kotlin.jvm.internal.s.g(text2, bVar.getString(R.string.feedback_no_thanks_btn))) {
                            bVar.u6().E4(s.NO_THANKS);
                            break;
                        } else if (p005kotlin.jvm.internal.s.g(text2, bVar.getString(R.string.lbl_close)) && (activity = bVar.getActivity()) != null) {
                            activity.finish();
                            break;
                        }
                        break;
                }
            }
        });
        AppCompatButton appCompatButton2 = this.f43479d;
        if (appCompatButton2 == null) {
            s.m("otherButton");
            throw null;
        }
        final int i16 = 1;
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: qi1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.lte.b f144857b;

            {
                this.f144857b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Map<Object, String> mapD;
                androidx.fragment.app.m activity;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.settings.lte.b bVar = this.f144857b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                        view3.getClass();
                        CharSequence text = ((Button) view3).getText();
                        if (p005kotlin.jvm.internal.s.g(text, bVar.getString(R.string.lte_set_up_button_title))) {
                            bVar.u6().E4(s.SETUP);
                            break;
                        } else if (p005kotlin.jvm.internal.s.g(text, bVar.getString(R.string.lte_transfer_subscription)) && (mapD = bVar.u6().f144866h.d()) != null) {
                            if (mapD.size() > 1) {
                                new r22.y1().a(bVar.getContext(), bVar.getString(R.string.lte_transfer_device_selector), mapD, "", new ps2.d(bVar, 12));
                            } else if (mapD.size() == 1) {
                                Object objA0 = h0.a0(mapD.keySet());
                                objA0.getClass();
                                bVar.f43482g = ((Long) objA0).longValue();
                                bVar.u6().F4(bVar.f43482g);
                            }
                            break;
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar2 = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                        view3.getClass();
                        CharSequence text2 = ((Button) view3).getText();
                        if (p005kotlin.jvm.internal.s.g(text2, bVar.getString(R.string.lte_see_transfer_options))) {
                            bVar.u6().E4(s.OTHER_OPTIONS);
                            break;
                        } else if (p005kotlin.jvm.internal.s.g(text2, bVar.getString(R.string.sleep_advanced_sleep_got_it_button))) {
                            bVar.u6().E4(s.TRANSFER_COMPLETE);
                            bVar.f43482g = 0L;
                            break;
                        } else if (p005kotlin.jvm.internal.s.g(text2, bVar.getString(R.string.feedback_no_thanks_btn))) {
                            bVar.u6().E4(s.NO_THANKS);
                            break;
                        } else if (p005kotlin.jvm.internal.s.g(text2, bVar.getString(R.string.lbl_close)) && (activity = bVar.getActivity()) != null) {
                            activity.finish();
                            break;
                        }
                        break;
                }
            }
        });
        final int i17 = 1;
        u6().f144865g.f(getViewLifecycleOwner(), new c(new l(this) { // from class: qi1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.lte.b f144855b;

            {
                this.f144855b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                String productDisplayName;
                String productDisplayName2;
                int i18 = i17;
                com.garmin.android.apps.connectmobile.settings.lte.b bVar = this.f144855b;
                switch (i18) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i19 = com.garmin.android.apps.connectmobile.settings.lte.b.C0805b.f43485b[pVar.ordinal()];
                        boolean z14 = true;
                        if (i19 == 1) {
                            u uVar = (u) t7;
                            if (uVar != u.TRANSFER_PROCESSING) {
                                ImageView imageView = bVar.f43480e;
                                if (imageView == null) {
                                    p005kotlin.jvm.internal.s.m("imgView");
                                    throw null;
                                }
                                imageView.setVisibility(0);
                                GCMRunningProgressView gCMRunningProgressView = bVar.f43481f;
                                if (gCMRunningProgressView == null) {
                                    p005kotlin.jvm.internal.s.m("runningProgressView");
                                    throw null;
                                }
                                gCMRunningProgressView.setVisibility(8);
                            }
                            String str = "";
                            switch (uVar != null ? com.garmin.android.apps.connectmobile.settings.lte.b.C0805b.f43484a[uVar.ordinal()] : -1) {
                                case 4:
                                    TextView textView = bVar.f43476a;
                                    if (textView == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView.setText(bVar.getString(R.string.connect_to_lte_title));
                                    TextView textView2 = bVar.f43477b;
                                    if (textView2 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView2.setText(bVar.getString(R.string.connect_to_lte_descr));
                                    AppCompatButton appCompatButton3 = bVar.f43478c;
                                    if (appCompatButton3 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton3.setVisibility(0);
                                    ImageView imageView2 = bVar.f43480e;
                                    if (imageView2 == null) {
                                        p005kotlin.jvm.internal.s.m("imgView");
                                        throw null;
                                    }
                                    imageView2.setVisibility(0);
                                    Map<Object, String> mapD = bVar.u6().f144866h.d();
                                    if (mapD != null && !mapD.isEmpty()) {
                                        z14 = false;
                                    }
                                    AppCompatButton appCompatButton4 = bVar.f43479d;
                                    if (z14) {
                                        if (appCompatButton4 == null) {
                                            p005kotlin.jvm.internal.s.m("otherButton");
                                            throw null;
                                        }
                                        appCompatButton4.setVisibility(8);
                                        AppCompatButton appCompatButton5 = bVar.f43478c;
                                        if (appCompatButton5 == null) {
                                            p005kotlin.jvm.internal.s.m("setUpButton");
                                            throw null;
                                        }
                                        ViewGroup.LayoutParams layoutParams = appCompatButton5.getLayoutParams();
                                        layoutParams.getClass();
                                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
                                        bVar2.setMargins(0, 0, 0, 16);
                                        appCompatButton5.setLayoutParams(bVar2);
                                    } else {
                                        if (appCompatButton4 == null) {
                                            p005kotlin.jvm.internal.s.m("otherButton");
                                            throw null;
                                        }
                                        appCompatButton4.setText(bVar.getString(R.string.lte_see_transfer_options));
                                        appCompatButton4.setVisibility(0);
                                    }
                                    break;
                                    break;
                                case 5:
                                    TextView textView3 = bVar.f43476a;
                                    if (textView3 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView3.setText(bVar.getString(R.string.lte_set_up_complete_title));
                                    TextView textView4 = bVar.f43477b;
                                    if (textView4 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView4.setText(bVar.getString(R.string.lte_completed_descr));
                                    AppCompatButton appCompatButton6 = bVar.f43478c;
                                    if (appCompatButton6 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton6.setVisibility(8);
                                    AppCompatButton appCompatButton7 = bVar.f43479d;
                                    if (appCompatButton7 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton7.setVisibility(8);
                                    break;
                                    break;
                                case 6:
                                    TextView textView5 = bVar.f43476a;
                                    if (textView5 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView5.setText(bVar.getString(R.string.lte_previous_subscription_found));
                                    TextView textView6 = bVar.f43477b;
                                    if (textView6 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    sd2.f fVar = bVar.u6().f144872n;
                                    if (fVar != null && (productDisplayName = fVar.getProductDisplayName()) != null) {
                                        str = productDisplayName;
                                    }
                                    textView6.setText(bVar.getString(R.string.lte_subscription_found_msg2, str));
                                    AppCompatButton appCompatButton8 = bVar.f43478c;
                                    if (appCompatButton8 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton8.setText(bVar.getString(R.string.lte_transfer_subscription));
                                    AppCompatButton appCompatButton9 = bVar.f43479d;
                                    if (appCompatButton9 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton9.setText(bVar.getString(R.string.feedback_no_thanks_btn));
                                    AppCompatButton appCompatButton10 = bVar.f43478c;
                                    if (appCompatButton10 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton10.setVisibility(0);
                                    AppCompatButton appCompatButton11 = bVar.f43479d;
                                    if (appCompatButton11 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton11.setVisibility(0);
                                    break;
                                    break;
                                case 7:
                                    ImageView imageView3 = bVar.f43480e;
                                    if (imageView3 == null) {
                                        p005kotlin.jvm.internal.s.m("imgView");
                                        throw null;
                                    }
                                    imageView3.setVisibility(4);
                                    GCMRunningProgressView gCMRunningProgressView2 = bVar.f43481f;
                                    if (gCMRunningProgressView2 == null) {
                                        p005kotlin.jvm.internal.s.m("runningProgressView");
                                        throw null;
                                    }
                                    gCMRunningProgressView2.setVisibility(0);
                                    TextView textView7 = bVar.f43476a;
                                    if (textView7 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView7.setText(bVar.getString(R.string.lte_transferring_desc2, "30"));
                                    AppCompatButton appCompatButton12 = bVar.f43478c;
                                    if (appCompatButton12 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton12.setVisibility(8);
                                    AppCompatButton appCompatButton13 = bVar.f43479d;
                                    if (appCompatButton13 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton13.setVisibility(8);
                                    TextView textView8 = bVar.f43477b;
                                    if (textView8 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView8.setVisibility(8);
                                    break;
                                    break;
                                case 8:
                                    TextView textView9 = bVar.f43476a;
                                    if (textView9 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView9.setText(bVar.getString(R.string.common_youre_all_set));
                                    TextView textView10 = bVar.f43477b;
                                    if (textView10 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    sd2.f fVar2 = bVar.u6().f144872n;
                                    if (fVar2 != null && (productDisplayName2 = fVar2.getProductDisplayName()) != null) {
                                        str = productDisplayName2;
                                    }
                                    textView10.setText(bVar.getString(R.string.lte_transfer_subscription_success_msg2, str));
                                    TextView textView11 = bVar.f43477b;
                                    if (textView11 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView11.setVisibility(0);
                                    AppCompatButton appCompatButton14 = bVar.f43478c;
                                    if (appCompatButton14 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton14.setVisibility(4);
                                    AppCompatButton appCompatButton15 = bVar.f43479d;
                                    if (appCompatButton15 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton15.setVisibility(0);
                                    appCompatButton15.setText(bVar.getString(R.string.sleep_advanced_sleep_got_it_button));
                                    appCompatButton15.setTextAppearance(R.style.PrimaryActionButtonStyle);
                                    break;
                                    break;
                                case 9:
                                    TextView textView12 = bVar.f43476a;
                                    if (textView12 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView12.setText(bVar.getString(R.string.lte_set_up_complete_title));
                                    TextView textView13 = bVar.f43477b;
                                    if (textView13 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView13.setText(bVar.getString(R.string.lte_completed_descr));
                                    AppCompatButton appCompatButton16 = bVar.f43478c;
                                    if (appCompatButton16 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton16.setVisibility(8);
                                    AppCompatButton appCompatButton17 = bVar.f43479d;
                                    if (appCompatButton17 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton17.setVisibility(8);
                                    break;
                                    break;
                                case 10:
                                    TextView textView14 = bVar.f43476a;
                                    if (textView14 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView14.setText(bVar.getString(R.string.lte_transfer_progress));
                                    TextView textView15 = bVar.f43477b;
                                    if (textView15 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView15.setVisibility(0);
                                    TextView textView16 = bVar.f43477b;
                                    if (textView16 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView16.setText(bVar.getString(R.string.lte_transfer_progress_desc));
                                    AppCompatButton appCompatButton18 = bVar.f43478c;
                                    if (appCompatButton18 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton18.setVisibility(4);
                                    AppCompatButton appCompatButton19 = bVar.f43479d;
                                    if (appCompatButton19 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton19.setText(bVar.getString(R.string.lbl_close));
                                    appCompatButton19.setVisibility(0);
                                    appCompatButton19.setTextAppearance(R.style.PrimaryActionButtonStyle);
                                    break;
                                    break;
                                case 11:
                                    TextView textView17 = bVar.f43476a;
                                    if (textView17 == null) {
                                        p005kotlin.jvm.internal.s.m("title");
                                        throw null;
                                    }
                                    textView17.setText(bVar.getString(R.string.lte_transfer_progress));
                                    TextView textView18 = bVar.f43477b;
                                    if (textView18 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView18.setVisibility(0);
                                    TextView textView19 = bVar.f43477b;
                                    if (textView19 == null) {
                                        p005kotlin.jvm.internal.s.m("description");
                                        throw null;
                                    }
                                    textView19.setText(bVar.getString(R.string.lte_transfer_progress_old_desc));
                                    AppCompatButton appCompatButton110 = bVar.f43479d;
                                    if (appCompatButton110 == null) {
                                        p005kotlin.jvm.internal.s.m("otherButton");
                                        throw null;
                                    }
                                    appCompatButton110.setVisibility(4);
                                    AppCompatButton appCompatButton111 = bVar.f43478c;
                                    if (appCompatButton111 == null) {
                                        p005kotlin.jvm.internal.s.m("setUpButton");
                                        throw null;
                                    }
                                    appCompatButton111.setVisibility(4);
                                    break;
                                    break;
                                default:
                                    i2.a aVar2 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar2.getClass();
                                    i2.a.b(a2Var, "LTESubscriptionStatusFragment", "handleSubscriptionStatus status: " + uVar + " not handled");
                                    break;
                            }
                            g22.e.f(bVar);
                        } else if (i19 == 2) {
                            g22.e.l(bVar);
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(bVar);
                            GCMRunningProgressView gCMRunningProgressView3 = bVar.f43481f;
                            if (gCMRunningProgressView3 == null) {
                                p005kotlin.jvm.internal.s.m("runningProgressView");
                                throw null;
                            }
                            gCMRunningProgressView3.setVisibility(8);
                            u uVar2 = (u) t7;
                            int i110 = uVar2 != null ? com.garmin.android.apps.connectmobile.settings.lte.b.C0805b.f43484a[uVar2.ordinal()] : -1;
                            if (i110 == 1) {
                                bVar.v6(false);
                            } else if (i110 == 2) {
                                bVar.v6(true);
                            } else if (i110 != 3) {
                                g22.e.c(bVar);
                            } else {
                                androidx.fragment.app.m activity = bVar.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
                        Context contextRequireContext = bVar.requireContext();
                        SafetyFeatureSetupWizardActivity.a aVar4 = SafetyFeatureSetupWizardActivity.f43851k;
                        Context contextRequireContext2 = bVar.requireContext();
                        contextRequireContext2.getClass();
                        hl.a.c cVar = hl.a.c.f84256b;
                        aVar4.getClass();
                        contextRequireContext.startActivity(SafetyFeatureSetupWizardActivity.a.a(contextRequireContext2, cVar));
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final qi1.f u6() {
        return (qi1.f) this.f43483h.getValue();
    }

    public final void v6(boolean z14) {
        String string = getString(z14 ? R.string.lbl_retry : R.string.lbl_close);
        string.getClass();
        o13.p pVar = new o13.p(string, new ap2.f(z14, this, 13));
        o13.p pVar2 = new o13.p(getString(R.string.lbl_cancel), new q(this, 22));
        String string2 = getString(R.string.lte_transfer_not_completed);
        string2.getClass();
        String string3 = getString(R.string.lte_transfer_not_completed_desc);
        string3.getClass();
        if (!z14) {
            string2 = getString(R.string.lte_unable_transfer);
            string2.getClass();
            string3 = getString(R.string.lte_unable_transfer_desc);
            string3.getClass();
            pVar2 = null;
        }
        String str = string2;
        String str2 = string3;
        c22.f fVar = c22.f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.f.d(fVar, contextRequireContext, str, str2, pVar, pVar2, null, false, 96).show();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
