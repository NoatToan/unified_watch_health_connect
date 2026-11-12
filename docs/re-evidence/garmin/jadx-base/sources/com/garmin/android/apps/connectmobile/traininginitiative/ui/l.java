package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.ImageMultiPickerActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import i3.e5;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import sg0.w0;
import ty1.h0;
import ty1.n0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/l;", "Lty1/h0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f46122h = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f46123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f46124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f46125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexButton f46126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexButton f46127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f46128g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46129a;

        static {
            int[] iArr = new int[ny1.c.values().length];
            try {
                iArr[ny1.c.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ny1.c.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46129a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/l$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            l lVar = l.this;
            lVar.f46125d.f(false);
            lVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f46131a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f46131a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f46131a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46131a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46132a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46132a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46132a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46133a = aVar;
            this.f46134b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46133a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46134b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46135a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46135a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46135a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public l() {
        super(R.layout.ti_add_event_image);
        this.f46124c = new w1(s0.f105811a.b(AddTIEventViewModel.class), new e(this), new g(this), new f(null, this));
        this.f46125d = new c();
    }

    public final androidx.appcompat.app.e.a A6(ArrayList arrayList) {
        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(requireContext()).setTitle("");
        j22.b.f96736a.getClass();
        return title.setMessage(Html.fromHtml(j22.b.i(arrayList))).setCancelable(false).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null);
    }

    public final AddTIEventViewModel C6() {
        return (AddTIEventViewModel) this.f46124c.getValue();
    }

    public final void E6(j22.a... aVarArr) {
        androidx.appcompat.app.e.a positiveButton;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j22.a aVar : aVarArr) {
            j22.b.f96736a.getClass();
            if (!j22.b.k(aVar)) {
                arrayList.add(aVar);
                androidx.fragment.app.m mVarRequireActivity = requireActivity();
                mVarRequireActivity.getClass();
                if (j22.b.C(mVarRequireActivity, aVar)) {
                    arrayList2.add(aVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList2.isEmpty()) {
            j22.b.f96736a.getClass();
            j22.b.y(this, 1412, arrayList);
            return;
        }
        androidx.appcompat.app.e.a aVarA6 = A6(arrayList2);
        if (aVarA6 == null || (positiveButton = aVarA6.setPositiveButton(R.string.lbl_ok, new pk1.t(11, this, arrayList))) == null) {
            return;
        }
        positiveButton.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f46123b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "TIAddEventMainFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        androidx.appcompat.app.e.a positiveButton;
        strArr.getClass();
        iArr.getClass();
        if (i14 != 1412) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            ImageMultiPickerActivity.f46078j.getClass();
            mVarRequireActivity.startActivity(ImageMultiPickerActivity.a.a(mVarRequireActivity, false));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(j22.a.f96722k);
        androidx.appcompat.app.e.a aVarA6 = A6(arrayList);
        if (aVarA6 == null || (positiveButton = aVarA6.setPositiveButton(R.string.lbl_settings, new n0(this, 0))) == null) {
            return;
        }
        positiveButton.show();
    }

    @Override // ty1.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f46123b;
        if (aVar != null) {
            String string = getString(R.string.add_event);
            string.getClass();
            aVar.g(2, string);
        }
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46125d, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.image_yes_button);
        ((GCMComplexButton) viewFindViewById).a(false);
        viewFindViewById.getClass();
        this.f46126e = (GCMComplexButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.image_no_button);
        ((GCMComplexButton) viewFindViewById2).a(false);
        viewFindViewById2.getClass();
        this.f46127f = (GCMComplexButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.image_info);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f46128g = textView;
        textView.setHighlightColor(0);
        TextView textView2 = this.f46128g;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("imageInfo");
            throw null;
        }
        v22.d.b(textView2, e5.g(getString(R.string.upload_event_image_formats), StringUtils.SPACE, getString(R.string.image_upload_terms_and_conditions)), new w0(this, 28));
        GCMComplexButton gCMComplexButton = this.f46126e;
        if (gCMComplexButton == null) {
            p005kotlin.jvm.internal.s.m("yesButton");
            throw null;
        }
        final int i14 = 0;
        gCMComplexButton.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.l f167208b;

            {
                this.f167208b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.l lVar = this.f167208b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        ht.a aVar3 = ht.a.f85464a;
                        Bundle bundle2 = new Bundle(1);
                        bundle2.putBoolean("EventImageSelected", true);
                        Unit unit = Unit.INSTANCE;
                        aVar3.getClass();
                        ht.a.a(bundle2, "EventImageSelection");
                        AddTIEventViewModel addTIEventViewModelC6 = lVar.C6();
                        ((androidx.lifecycle.y0) addTIEventViewModelC6.Y0.getValue()).m(ny1.c.YES);
                        GCMComplexButton gCMComplexButton2 = lVar.f46126e;
                        if (gCMComplexButton2 == null) {
                            p005kotlin.jvm.internal.s.m("yesButton");
                            throw null;
                        }
                        gCMComplexButton2.a(true);
                        GCMComplexButton gCMComplexButton3 = lVar.f46127f;
                        if (gCMComplexButton3 == null) {
                            p005kotlin.jvm.internal.s.m("noButton");
                            throw null;
                        }
                        gCMComplexButton3.a(false);
                        TrainingInitiativeEventActivity.f45718o.getClass();
                        TrainingInitiativeEventActivity.a.b();
                        TrainingInitiativeEventActivity.a.b();
                        TrainingInitiativeEventActivity.f45720q = TrainingInitiativeEventActivity.f45720q;
                        j22.b.f96736a.getClass();
                        if (!j22.b.d()) {
                            com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.USER;
                            aVar4.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "TIAddEventImageFragment", "Storage permission has NOT been granted.  Requesting permission.");
                            lVar.E6(j22.a.f96722k);
                            return;
                        }
                        com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.USER;
                        aVar5.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "TIAddEventImageFragment", "Storage permission has already been granted.  Opening gallery app ...");
                        androidx.fragment.app.m mVarRequireActivity = lVar.requireActivity();
                        mVarRequireActivity.getClass();
                        ImageMultiPickerActivity.f46078j.getClass();
                        mVarRequireActivity.startActivity(ImageMultiPickerActivity.a.a(mVarRequireActivity, false));
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        ht.a aVar7 = ht.a.f85464a;
                        Bundle bundle3 = new Bundle(1);
                        bundle3.putBoolean("EventImageSelected", false);
                        Unit unit2 = Unit.INSTANCE;
                        aVar7.getClass();
                        ht.a.a(bundle3, "EventImageSelection");
                        AddTIEventViewModel addTIEventViewModelC7 = lVar.C6();
                        ((androidx.lifecycle.y0) addTIEventViewModelC7.Y0.getValue()).m(ny1.c.NO);
                        lVar.C6().a6().m(null);
                        lVar.C6().O5().m("TIAddEventWebsiteNotesFragment");
                        return;
                }
            }
        });
        GCMComplexButton gCMComplexButton2 = this.f46127f;
        if (gCMComplexButton2 == null) {
            p005kotlin.jvm.internal.s.m("noButton");
            throw null;
        }
        final int i15 = 1;
        gCMComplexButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ty1.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.l f167208b;

            {
                this.f167208b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.l lVar = this.f167208b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        ht.a aVar3 = ht.a.f85464a;
                        Bundle bundle2 = new Bundle(1);
                        bundle2.putBoolean("EventImageSelected", true);
                        Unit unit = Unit.INSTANCE;
                        aVar3.getClass();
                        ht.a.a(bundle2, "EventImageSelection");
                        AddTIEventViewModel addTIEventViewModelC6 = lVar.C6();
                        ((androidx.lifecycle.y0) addTIEventViewModelC6.Y0.getValue()).m(ny1.c.YES);
                        GCMComplexButton gCMComplexButton3 = lVar.f46126e;
                        if (gCMComplexButton3 == null) {
                            p005kotlin.jvm.internal.s.m("yesButton");
                            throw null;
                        }
                        gCMComplexButton3.a(true);
                        GCMComplexButton gCMComplexButton4 = lVar.f46127f;
                        if (gCMComplexButton4 == null) {
                            p005kotlin.jvm.internal.s.m("noButton");
                            throw null;
                        }
                        gCMComplexButton4.a(false);
                        TrainingInitiativeEventActivity.f45718o.getClass();
                        TrainingInitiativeEventActivity.a.b();
                        TrainingInitiativeEventActivity.a.b();
                        TrainingInitiativeEventActivity.f45720q = TrainingInitiativeEventActivity.f45720q;
                        j22.b.f96736a.getClass();
                        if (!j22.b.d()) {
                            com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.USER;
                            aVar4.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "TIAddEventImageFragment", "Storage permission has NOT been granted.  Requesting permission.");
                            lVar.E6(j22.a.f96722k);
                            return;
                        }
                        com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.USER;
                        aVar5.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "TIAddEventImageFragment", "Storage permission has already been granted.  Opening gallery app ...");
                        androidx.fragment.app.m mVarRequireActivity = lVar.requireActivity();
                        mVarRequireActivity.getClass();
                        ImageMultiPickerActivity.f46078j.getClass();
                        mVarRequireActivity.startActivity(ImageMultiPickerActivity.a.a(mVarRequireActivity, false));
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        ht.a aVar7 = ht.a.f85464a;
                        Bundle bundle3 = new Bundle(1);
                        bundle3.putBoolean("EventImageSelected", false);
                        Unit unit2 = Unit.INSTANCE;
                        aVar7.getClass();
                        ht.a.a(bundle3, "EventImageSelection");
                        AddTIEventViewModel addTIEventViewModelC7 = lVar.C6();
                        ((androidx.lifecycle.y0) addTIEventViewModelC7.Y0.getValue()).m(ny1.c.NO);
                        lVar.C6().a6().m(null);
                        lVar.C6().O5().m("TIAddEventWebsiteNotesFragment");
                        return;
                }
            }
        });
        final int i16 = 0;
        C6().f46438u1.f(getViewLifecycleOwner(), new w61.g(new e23.l(this) { // from class: ty1.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.l f167200b;

            {
                this.f167200b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.l lVar = this.f167200b;
                switch (i17) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        pVar.getClass();
                        Integer num = (Integer) pVar.f128594a;
                        Integer num2 = (Integer) pVar.f128595b;
                        if (num != null && num2 != null) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(lVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar3.setTitle(iIntValue);
                            aVar3.setMessage(iIntValue2);
                            aVar3.setCancelable(false);
                            aVar3.setPositiveButton(R.string.lbl_exit, new n0(lVar, 1));
                            aVar3.setNegativeButton(R.string.lbl_cancel, new o(2));
                            lVar.f46125d.f(false);
                            lVar.requireActivity().onBackPressed();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        if (((Boolean) obj).booleanValue()) {
                            j22.b.f96736a.getClass();
                            if (j22.b.d()) {
                                com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.USER;
                                aVar5.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "TIAddEventImageFragment", "Storage permission has already been granted.  Opening gallery app ...");
                                androidx.fragment.app.m mVarRequireActivity = lVar.requireActivity();
                                mVarRequireActivity.getClass();
                                ImageMultiPickerActivity.f46078j.getClass();
                                mVarRequireActivity.startActivity(ImageMultiPickerActivity.a.a(mVarRequireActivity, false));
                            } else {
                                com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.USER;
                                aVar6.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "TIAddEventImageFragment", "Storage permission has NOT been granted.  Requesting permission.");
                                lVar.E6(j22.a.f96722k);
                            }
                            ((androidx.lifecycle.y0) lVar.C6().L2.getValue()).m(Boolean.FALSE);
                        }
                        return Unit.INSTANCE;
                    default:
                        ny1.c cVar = (ny1.c) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        if (cVar != null) {
                            int i18 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.b.f46129a[cVar.ordinal()];
                            if (i18 == 1) {
                                GCMComplexButton gCMComplexButton3 = lVar.f46126e;
                                if (gCMComplexButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("yesButton");
                                    throw null;
                                }
                                gCMComplexButton3.a(true);
                                GCMComplexButton gCMComplexButton4 = lVar.f46127f;
                                if (gCMComplexButton4 == null) {
                                    p005kotlin.jvm.internal.s.m("noButton");
                                    throw null;
                                }
                                gCMComplexButton4.a(false);
                            } else {
                                if (i18 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                GCMComplexButton gCMComplexButton5 = lVar.f46126e;
                                if (gCMComplexButton5 == null) {
                                    p005kotlin.jvm.internal.s.m("yesButton");
                                    throw null;
                                }
                                gCMComplexButton5.a(false);
                                GCMComplexButton gCMComplexButton6 = lVar.f46127f;
                                if (gCMComplexButton6 == null) {
                                    p005kotlin.jvm.internal.s.m("noButton");
                                    throw null;
                                }
                                gCMComplexButton6.a(true);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 1;
        C6().M2.f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.l f167200b;

            {
                this.f167200b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.l lVar = this.f167200b;
                switch (i18) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        pVar.getClass();
                        Integer num = (Integer) pVar.f128594a;
                        Integer num2 = (Integer) pVar.f128595b;
                        if (num != null && num2 != null) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(lVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar3.setTitle(iIntValue);
                            aVar3.setMessage(iIntValue2);
                            aVar3.setCancelable(false);
                            aVar3.setPositiveButton(R.string.lbl_exit, new n0(lVar, 1));
                            aVar3.setNegativeButton(R.string.lbl_cancel, new o(2));
                            lVar.f46125d.f(false);
                            lVar.requireActivity().onBackPressed();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        if (((Boolean) obj).booleanValue()) {
                            j22.b.f96736a.getClass();
                            if (j22.b.d()) {
                                com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.USER;
                                aVar5.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "TIAddEventImageFragment", "Storage permission has already been granted.  Opening gallery app ...");
                                androidx.fragment.app.m mVarRequireActivity = lVar.requireActivity();
                                mVarRequireActivity.getClass();
                                ImageMultiPickerActivity.f46078j.getClass();
                                mVarRequireActivity.startActivity(ImageMultiPickerActivity.a.a(mVarRequireActivity, false));
                            } else {
                                com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.USER;
                                aVar6.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "TIAddEventImageFragment", "Storage permission has NOT been granted.  Requesting permission.");
                                lVar.E6(j22.a.f96722k);
                            }
                            ((androidx.lifecycle.y0) lVar.C6().L2.getValue()).m(Boolean.FALSE);
                        }
                        return Unit.INSTANCE;
                    default:
                        ny1.c cVar = (ny1.c) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        if (cVar != null) {
                            int i19 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.b.f46129a[cVar.ordinal()];
                            if (i19 == 1) {
                                GCMComplexButton gCMComplexButton3 = lVar.f46126e;
                                if (gCMComplexButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("yesButton");
                                    throw null;
                                }
                                gCMComplexButton3.a(true);
                                GCMComplexButton gCMComplexButton4 = lVar.f46127f;
                                if (gCMComplexButton4 == null) {
                                    p005kotlin.jvm.internal.s.m("noButton");
                                    throw null;
                                }
                                gCMComplexButton4.a(false);
                            } else {
                                if (i19 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                GCMComplexButton gCMComplexButton5 = lVar.f46126e;
                                if (gCMComplexButton5 == null) {
                                    p005kotlin.jvm.internal.s.m("yesButton");
                                    throw null;
                                }
                                gCMComplexButton5.a(false);
                                GCMComplexButton gCMComplexButton6 = lVar.f46127f;
                                if (gCMComplexButton6 == null) {
                                    p005kotlin.jvm.internal.s.m("noButton");
                                    throw null;
                                }
                                gCMComplexButton6.a(true);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i18 = 2;
        ((androidx.lifecycle.s0) C6().Z0.getValue()).f(getViewLifecycleOwner(), new d(new e23.l(this) { // from class: ty1.o0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.l f167200b;

            {
                this.f167200b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.l lVar = this.f167200b;
                switch (i19) {
                    case 0:
                        o13.p pVar = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        pVar.getClass();
                        Integer num = (Integer) pVar.f128594a;
                        Integer num2 = (Integer) pVar.f128595b;
                        if (num != null && num2 != null) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(lVar.requireContext(), R.style.GCMPalette18BgThemeAlertDialog_TI);
                            aVar3.setTitle(iIntValue);
                            aVar3.setMessage(iIntValue2);
                            aVar3.setCancelable(false);
                            aVar3.setPositiveButton(R.string.lbl_exit, new n0(lVar, 1));
                            aVar3.setNegativeButton(R.string.lbl_cancel, new o(2));
                            lVar.f46125d.f(false);
                            lVar.requireActivity().onBackPressed();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        if (((Boolean) obj).booleanValue()) {
                            j22.b.f96736a.getClass();
                            if (j22.b.d()) {
                                com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.USER;
                                aVar5.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "TIAddEventImageFragment", "Storage permission has already been granted.  Opening gallery app ...");
                                androidx.fragment.app.m mVarRequireActivity = lVar.requireActivity();
                                mVarRequireActivity.getClass();
                                ImageMultiPickerActivity.f46078j.getClass();
                                mVarRequireActivity.startActivity(ImageMultiPickerActivity.a.a(mVarRequireActivity, false));
                            } else {
                                com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.USER;
                                aVar6.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "TIAddEventImageFragment", "Storage permission has NOT been granted.  Requesting permission.");
                                lVar.E6(j22.a.f96722k);
                            }
                            ((androidx.lifecycle.y0) lVar.C6().L2.getValue()).m(Boolean.FALSE);
                        }
                        return Unit.INSTANCE;
                    default:
                        ny1.c cVar = (ny1.c) obj;
                        com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                        if (cVar != null) {
                            int i110 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.b.f46129a[cVar.ordinal()];
                            if (i110 == 1) {
                                GCMComplexButton gCMComplexButton3 = lVar.f46126e;
                                if (gCMComplexButton3 == null) {
                                    p005kotlin.jvm.internal.s.m("yesButton");
                                    throw null;
                                }
                                gCMComplexButton3.a(true);
                                GCMComplexButton gCMComplexButton4 = lVar.f46127f;
                                if (gCMComplexButton4 == null) {
                                    p005kotlin.jvm.internal.s.m("noButton");
                                    throw null;
                                }
                                gCMComplexButton4.a(false);
                            } else {
                                if (i110 != 2) {
                                    lc.u0.r();
                                    return null;
                                }
                                GCMComplexButton gCMComplexButton5 = lVar.f46126e;
                                if (gCMComplexButton5 == null) {
                                    p005kotlin.jvm.internal.s.m("yesButton");
                                    throw null;
                                }
                                gCMComplexButton5.a(false);
                                GCMComplexButton gCMComplexButton6 = lVar.f46127f;
                                if (gCMComplexButton6 == null) {
                                    p005kotlin.jvm.internal.s.m("noButton");
                                    throw null;
                                }
                                gCMComplexButton6.a(true);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_ASK_PERMISSION_GALLERY", "I", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
