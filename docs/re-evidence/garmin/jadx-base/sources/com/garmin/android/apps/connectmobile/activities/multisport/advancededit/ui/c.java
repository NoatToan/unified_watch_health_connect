package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import am.b1;
import am.x0;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import o53.s0;
import p005kotlin.Metadata;
import wd2.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/c;", "Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/g;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f29328l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f29329m = c.class.getCanonicalName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f29330j = new h0(this, 18);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f29331k = R.string.lbl_convert_to_multisport_title;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29332a;

        static {
            int[] iArr = new int[yo.a.values().length];
            try {
                iArr[yo.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yo.a.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yo.a.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yo.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yo.a.TRIM_IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[yo.a.TRIM_LONG_RUNNING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[yo.a.TRIM_SUCCESSFUL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f29332a = iArr;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 1) {
            requireActivity().setResult(i15);
            requireActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMenuVisibility(false);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.convert_to_multisport_activity_type_fragment, viewGroup, false);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g
    public final String v6() {
        String string = getString(R.string.lbl_convert_to_multisport_choose_activity_type);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g
    /* JADX INFO: renamed from: w6, reason: from getter */
    public final int getF29331k() {
        return this.f29331k;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g
    public final void y6(View view2) {
        super.y6(view2);
        Button button = (Button) view2.findViewById(R.id.finish_button);
        final int i14 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: zo.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c f206030b;

            {
                this.f206030b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                final int i16 = 0;
                final com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar = this.f206030b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                        final int i17 = 1;
                        new androidx.appcompat.app.e.a(cVar.requireActivity()).setTitle(R.string.lbl_convert_to_multisport_dialog_title).setMessage(R.string.lbl_convert_to_multisport_dialog_message).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: zo.f
                            /* JADX WARN: Code duplicated, block: B:13:0x0045  */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i18) {
                                x0 x0Var;
                                int i19 = i16;
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar2 = cVar;
                                switch (i19) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        b1 b1VarU6 = cVar2.u6();
                                        if (b1VarU6.f3872g >= 0) {
                                            int count = b1VarU6.getCount();
                                            int i24 = b1VarU6.f3872g;
                                            if (count > i24) {
                                                x0Var = (x0) b1VarU6.getItem(i24);
                                            } else {
                                                x0Var = null;
                                            }
                                        } else {
                                            x0Var = null;
                                        }
                                        int i25 = cVar2.f29355d;
                                        if (i25 == -1 || x0Var == null) {
                                            return;
                                        }
                                        ap.d dVar = cVar2.f29357f;
                                        if (dVar == null) {
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                        }
                                        yo.p pVar = yo.p.TIME;
                                        pVar.getClass();
                                        dVar.z4();
                                        w9.a aVarA = v1.a(dVar);
                                        x53.c cVar3 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new ap.g(pVar, dVar, i25, x0Var, null), 2);
                                        t1.a(dVar.f11593e.f198248r, new a03.f(dVar, 16)).f(cVar2.getViewLifecycleOwner(), cVar2.f29330j);
                                        return;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                }
                            }
                        }).setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: zo.f
                            /* JADX WARN: Code duplicated, block: B:13:0x0045  */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i18) {
                                x0 x0Var;
                                int i19 = i17;
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar2 = cVar;
                                switch (i19) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        b1 b1VarU6 = cVar2.u6();
                                        if (b1VarU6.f3872g >= 0) {
                                            int count = b1VarU6.getCount();
                                            int i24 = b1VarU6.f3872g;
                                            if (count > i24) {
                                                x0Var = (x0) b1VarU6.getItem(i24);
                                            } else {
                                                x0Var = null;
                                            }
                                        } else {
                                            x0Var = null;
                                        }
                                        int i25 = cVar2.f29355d;
                                        if (i25 == -1 || x0Var == null) {
                                            return;
                                        }
                                        ap.d dVar = cVar2.f29357f;
                                        if (dVar == null) {
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                        }
                                        yo.p pVar = yo.p.TIME;
                                        pVar.getClass();
                                        dVar.z4();
                                        w9.a aVarA = v1.a(dVar);
                                        x53.c cVar3 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new ap.g(pVar, dVar, i25, x0Var, null), 2);
                                        t1.a(dVar.f11593e.f198248r, new a03.f(dVar, 16)).f(cVar2.getViewLifecycleOwner(), cVar2.f29330j);
                                        return;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                }
                            }
                        }).show();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                        final int i18 = 2;
                        new androidx.appcompat.app.e.a(cVar.requireActivity()).setTitle(R.string.save_strategy_details_confirmation_title).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: zo.f
                            /* JADX WARN: Code duplicated, block: B:13:0x0045  */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                x0 x0Var;
                                int i110 = i18;
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar2 = cVar;
                                switch (i110) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        b1 b1VarU6 = cVar2.u6();
                                        if (b1VarU6.f3872g >= 0) {
                                            int count = b1VarU6.getCount();
                                            int i24 = b1VarU6.f3872g;
                                            if (count > i24) {
                                                x0Var = (x0) b1VarU6.getItem(i24);
                                            } else {
                                                x0Var = null;
                                            }
                                        } else {
                                            x0Var = null;
                                        }
                                        int i25 = cVar2.f29355d;
                                        if (i25 == -1 || x0Var == null) {
                                            return;
                                        }
                                        ap.d dVar = cVar2.f29357f;
                                        if (dVar == null) {
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                        }
                                        yo.p pVar = yo.p.TIME;
                                        pVar.getClass();
                                        dVar.z4();
                                        w9.a aVarA = v1.a(dVar);
                                        x53.c cVar3 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new ap.g(pVar, dVar, i25, x0Var, null), 2);
                                        t1.a(dVar.f11593e.f198248r, new a03.f(dVar, 16)).f(cVar2.getViewLifecycleOwner(), cVar2.f29330j);
                                        return;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                }
                            }
                        }).setNegativeButton(R.string.lbl_cancel, new g(i16)).show();
                        break;
                }
            }
        });
        button.setEnabled(false);
        final int i15 = 1;
        ((Button) view2.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener(this) { // from class: zo.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c f206030b;

            {
                this.f206030b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                final int i17 = 0;
                final com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar = this.f206030b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                        final int i18 = 1;
                        new androidx.appcompat.app.e.a(cVar.requireActivity()).setTitle(R.string.lbl_convert_to_multisport_dialog_title).setMessage(R.string.lbl_convert_to_multisport_dialog_message).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: zo.f
                            /* JADX WARN: Code duplicated, block: B:13:0x0045  */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                x0 x0Var;
                                int i110 = i17;
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar2 = cVar;
                                switch (i110) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        b1 b1VarU6 = cVar2.u6();
                                        if (b1VarU6.f3872g >= 0) {
                                            int count = b1VarU6.getCount();
                                            int i24 = b1VarU6.f3872g;
                                            if (count > i24) {
                                                x0Var = (x0) b1VarU6.getItem(i24);
                                            } else {
                                                x0Var = null;
                                            }
                                        } else {
                                            x0Var = null;
                                        }
                                        int i25 = cVar2.f29355d;
                                        if (i25 == -1 || x0Var == null) {
                                            return;
                                        }
                                        ap.d dVar = cVar2.f29357f;
                                        if (dVar == null) {
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                        }
                                        yo.p pVar = yo.p.TIME;
                                        pVar.getClass();
                                        dVar.z4();
                                        w9.a aVarA = v1.a(dVar);
                                        x53.c cVar3 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new ap.g(pVar, dVar, i25, x0Var, null), 2);
                                        t1.a(dVar.f11593e.f198248r, new a03.f(dVar, 16)).f(cVar2.getViewLifecycleOwner(), cVar2.f29330j);
                                        return;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                }
                            }
                        }).setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: zo.f
                            /* JADX WARN: Code duplicated, block: B:13:0x0045  */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i19) {
                                x0 x0Var;
                                int i110 = i18;
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar2 = cVar;
                                switch (i110) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        b1 b1VarU6 = cVar2.u6();
                                        if (b1VarU6.f3872g >= 0) {
                                            int count = b1VarU6.getCount();
                                            int i24 = b1VarU6.f3872g;
                                            if (count > i24) {
                                                x0Var = (x0) b1VarU6.getItem(i24);
                                            } else {
                                                x0Var = null;
                                            }
                                        } else {
                                            x0Var = null;
                                        }
                                        int i25 = cVar2.f29355d;
                                        if (i25 == -1 || x0Var == null) {
                                            return;
                                        }
                                        ap.d dVar = cVar2.f29357f;
                                        if (dVar == null) {
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                        }
                                        yo.p pVar = yo.p.TIME;
                                        pVar.getClass();
                                        dVar.z4();
                                        w9.a aVarA = v1.a(dVar);
                                        x53.c cVar3 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new ap.g(pVar, dVar, i25, x0Var, null), 2);
                                        t1.a(dVar.f11593e.f198248r, new a03.f(dVar, 16)).f(cVar2.getViewLifecycleOwner(), cVar2.f29330j);
                                        return;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                }
                            }
                        }).show();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                        final int i19 = 2;
                        new androidx.appcompat.app.e.a(cVar.requireActivity()).setTitle(R.string.save_strategy_details_confirmation_title).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: zo.f
                            /* JADX WARN: Code duplicated, block: B:13:0x0045  */
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i110) {
                                x0 x0Var;
                                int i111 = i19;
                                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c cVar2 = cVar;
                                switch (i111) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar3 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        b1 b1VarU6 = cVar2.u6();
                                        if (b1VarU6.f3872g >= 0) {
                                            int count = b1VarU6.getCount();
                                            int i24 = b1VarU6.f3872g;
                                            if (count > i24) {
                                                x0Var = (x0) b1VarU6.getItem(i24);
                                            } else {
                                                x0Var = null;
                                            }
                                        } else {
                                            x0Var = null;
                                        }
                                        int i25 = cVar2.f29355d;
                                        if (i25 == -1 || x0Var == null) {
                                            return;
                                        }
                                        ap.d dVar = cVar2.f29357f;
                                        if (dVar == null) {
                                            p005kotlin.jvm.internal.s.m("viewModel");
                                            throw null;
                                        }
                                        yo.p pVar = yo.p.TIME;
                                        pVar.getClass();
                                        dVar.z4();
                                        w9.a aVarA = v1.a(dVar);
                                        x53.c cVar3 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new ap.g(pVar, dVar, i25, x0Var, null), 2);
                                        t1.a(dVar.f11593e.f198248r, new a03.f(dVar, 16)).f(cVar2.getViewLifecycleOwner(), cVar2.f29330j);
                                        return;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar4 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                    default:
                                        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar5 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                                        cVar2.requireActivity().setResult(-1);
                                        cVar2.requireActivity().finish();
                                        return;
                                }
                            }
                        }).setNegativeButton(R.string.lbl_cancel, new g(i17)).show();
                        break;
                }
            }
        });
        u6().f3871f = new xw.b(button, 17);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/c$a;", "", "<init>", "()V", "", "CONVERT_TO_MULTISPORT_REQUEST_CODE", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
