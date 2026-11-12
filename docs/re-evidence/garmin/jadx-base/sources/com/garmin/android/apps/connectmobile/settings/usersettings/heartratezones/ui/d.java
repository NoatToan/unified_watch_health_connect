package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vg1.z0;
import vk1.j;
import xk1.v;
import xk1.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {
    public static final a N0 = new a(null);
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView I;
    public TextView P;
    public TextView T;
    public TextView X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vk1.f f44162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vk1.e f44163b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwitchCompat f44165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f44166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f44167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f44168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f44169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f44170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f44171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EditText f44172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f44174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EditText f44175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EditText f44176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f44177o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f44178p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f44179q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EditText f44180r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f44181t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EditText f44182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EditText f44183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EditText f44184x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EditText f44185y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EditText f44186z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44164c = true;
    public final C0829d Y = new C0829d();
    public final h Z = new h();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final z0 f44173k0 = new z0(this, 27);
    public final i H0 = new i();
    public final e I0 = new e();
    public final f J0 = new f();
    public final c K0 = new c();
    public final g L0 = new g();
    public final bl0.a M0 = new bl0.a(this, 16);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44187a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.HR_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.HR_RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.LACTATE_THRESHOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44187a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d$c", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements View.OnFocusChangeListener {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44189a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.HR_MAX.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.HR_RESERVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j.LACTATE_THRESHOLD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f44189a = iArr;
            }
        }

        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            int i15;
            int i16;
            view2.getClass();
            EditText editText = (EditText) view2;
            d dVar = d.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                d.u6(dVar, editText.getId());
                return;
            }
            d.y6(dVar, editText);
            String strW6 = d.w6(dVar, editText);
            if (strW6.length() != 0) {
                try {
                    Integer.parseInt(strW6);
                    int i17 = Integer.parseInt(strW6);
                    EditText editText2 = dVar.f44175m;
                    if (editText2 == null || editText.getId() != editText2.getId()) {
                        EditText editText3 = dVar.f44176n;
                        if (editText3 == null || editText.getId() != editText3.getId()) {
                            EditText editText4 = dVar.f44177o;
                            if (editText4 == null || editText.getId() != editText4.getId()) {
                                EditText editText5 = dVar.f44178p;
                                if (editText5 == null || editText.getId() != editText5.getId()) {
                                    EditText editText6 = dVar.f44179q;
                                    if (editText6 == null || editText.getId() != editText6.getId()) {
                                        i15 = -99;
                                        i14 = -99;
                                    } else {
                                        vk1.f fVar = dVar.f44162a;
                                        fVar.getClass();
                                        if (i17 > fVar.f178618h) {
                                            vk1.f fVar2 = dVar.f44162a;
                                            fVar2.getClass();
                                            if (i17 < fVar2.f178621k) {
                                                dVar.f44164c = true;
                                                vk1.f fVar3 = dVar.f44162a;
                                                if (fVar3 != null) {
                                                    fVar3.f178619i = i17;
                                                }
                                                i15 = -99;
                                                i14 = -99;
                                            }
                                        }
                                        dVar.f44164c = false;
                                        vk1.f fVar4 = dVar.f44162a;
                                        fVar4.getClass();
                                        i14 = fVar4.f178618h;
                                        vk1.f fVar5 = dVar.f44162a;
                                        fVar5.getClass();
                                        i15 = fVar5.f178621k;
                                    }
                                } else {
                                    vk1.f fVar6 = dVar.f44162a;
                                    fVar6.getClass();
                                    if (i17 > fVar6.f178617g) {
                                        vk1.f fVar7 = dVar.f44162a;
                                        fVar7.getClass();
                                        if (i17 < fVar7.f178619i) {
                                            dVar.f44164c = true;
                                            vk1.f fVar8 = dVar.f44162a;
                                            if (fVar8 != null) {
                                                fVar8.f178618h = i17;
                                            }
                                            i15 = -99;
                                            i14 = -99;
                                        }
                                    }
                                    dVar.f44164c = false;
                                    vk1.f fVar9 = dVar.f44162a;
                                    fVar9.getClass();
                                    i14 = fVar9.f178617g;
                                    vk1.f fVar10 = dVar.f44162a;
                                    fVar10.getClass();
                                    i15 = fVar10.f178619i;
                                }
                            } else {
                                vk1.f fVar11 = dVar.f44162a;
                                fVar11.getClass();
                                if (i17 > fVar11.f178616f) {
                                    vk1.f fVar12 = dVar.f44162a;
                                    fVar12.getClass();
                                    if (i17 < fVar12.f178618h) {
                                        dVar.f44164c = true;
                                        vk1.f fVar13 = dVar.f44162a;
                                        if (fVar13 != null) {
                                            fVar13.f178617g = i17;
                                        }
                                        i15 = -99;
                                        i14 = -99;
                                    }
                                }
                                dVar.f44164c = false;
                                vk1.f fVar14 = dVar.f44162a;
                                fVar14.getClass();
                                i14 = fVar14.f178616f;
                                vk1.f fVar15 = dVar.f44162a;
                                fVar15.getClass();
                                i15 = fVar15.f178618h;
                            }
                        } else {
                            vk1.f fVar16 = dVar.f44162a;
                            fVar16.getClass();
                            if (i17 > fVar16.f178615e) {
                                vk1.f fVar17 = dVar.f44162a;
                                fVar17.getClass();
                                if (i17 < fVar17.f178617g) {
                                    dVar.f44164c = true;
                                    vk1.f fVar18 = dVar.f44162a;
                                    if (fVar18 != null) {
                                        fVar18.f178616f = i17;
                                    }
                                    i15 = -99;
                                    i14 = -99;
                                }
                            }
                            dVar.f44164c = false;
                            vk1.f fVar19 = dVar.f44162a;
                            fVar19.getClass();
                            i14 = fVar19.f178615e;
                            vk1.f fVar20 = dVar.f44162a;
                            fVar20.getClass();
                            i15 = fVar20.f178617g;
                        }
                    } else {
                        vk1.f fVar21 = dVar.f44162a;
                        fVar21.getClass();
                        j jVarG = vk1.c.g(fVar21);
                        int i18 = jVarG == null ? -1 : a.f44189a[jVarG.ordinal()];
                        if (i18 == 1) {
                            i16 = 30;
                        } else if (i18 != 2) {
                            i16 = i18 != 3 ? 0 : 46;
                        } else {
                            vk1.f fVar22 = dVar.f44162a;
                            fVar22.getClass();
                            i16 = fVar22.f178613c + 1;
                        }
                        if (i17 >= i16) {
                            vk1.f fVar23 = dVar.f44162a;
                            fVar23.getClass();
                            if (i17 < fVar23.f178616f) {
                                dVar.f44164c = true;
                                vk1.f fVar24 = dVar.f44162a;
                                if (fVar24 != null) {
                                    fVar24.f178615e = i17;
                                }
                                i15 = -99;
                                i14 = -99;
                            }
                        }
                        dVar.f44164c = false;
                        i14 = i16 - 1;
                        vk1.f fVar25 = dVar.f44162a;
                        fVar25.getClass();
                        i15 = fVar25.f178616f;
                    }
                    if (dVar.f44164c) {
                        vk1.f fVar26 = dVar.f44162a;
                        fVar26.getClass();
                        vk1.a.e(fVar26);
                        dVar.E6();
                        d.v6(dVar);
                        return;
                    }
                    editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                    if (i14 == -99 || i15 == -99) {
                        return;
                    }
                    String string = dVar.getString(R.string.lbl_error_title_wrong_number);
                    string.getClass();
                    String string2 = dVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i14), String.valueOf(i15));
                    string2.getClass();
                    d.z6(dVar, string, string2);
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            dVar.f44164c = false;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d$d", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0829d implements CompoundButton.OnCheckedChangeListener {
        public C0829d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            compoundButton.getClass();
            d dVar = d.this;
            if (z14) {
                vk1.f fVar = dVar.f44162a;
                if (fVar != null) {
                    fVar.f178622l = z14;
                }
                dVar.C6();
                return;
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(dVar.requireContext());
            vk1.e eVar = dVar.f44163b;
            eVar.getClass();
            androidx.appcompat.app.e.a title = aVar.setTitle(eVar.f178607c);
            vk1.e eVar2 = dVar.f44163b;
            eVar2.getClass();
            androidx.appcompat.app.e eVarCreate = title.setMessage(eVar2.f178608d).setPositiveButton(R.string.lbl_common_continue, new w(dVar, 0)).setNegativeButton(R.string.lbl_cancel, new w(dVar, 1)).setOnKeyListener(new ci2.d(dVar, 1)).setCancelable(false).create();
            eVarCreate.getClass();
            if (dVar.getActivity() != null) {
                m activity = dVar.getActivity();
                activity.getClass();
                if (activity.isFinishing()) {
                    return;
                }
                eVarCreate.show();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d$e", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements View.OnFocusChangeListener {
        public e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            view2.getClass();
            EditText editText = (EditText) view2;
            d dVar = d.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                d.u6(dVar, editText.getId());
                return;
            }
            d.y6(dVar, editText);
            String strW6 = d.w6(dVar, editText);
            if (strW6.length() == 0) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                dVar.f44164c = false;
                return;
            }
            if (strW6.equalsIgnoreCase("0")) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                dVar.f44164c = false;
                String string = dVar.getString(R.string.hr_zones_lbl_resting_heart_rate);
                string.getClass();
                String string2 = dVar.getString(R.string.hr_zones_msg_enter_lactate_threshold, "46", "250");
                string2.getClass();
                d.z6(dVar, string, string2);
                return;
            }
            try {
                Integer.parseInt(strW6);
                int i14 = Integer.parseInt(strW6);
                if (i14 < 46 || i14 > 249) {
                    editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                    dVar.f44164c = false;
                    String string3 = dVar.getString(R.string.lbl_error_title_wrong_number);
                    string3.getClass();
                    String string4 = dVar.getString(R.string.lbl_error_message_wrong_number, "45", "250");
                    string4.getClass();
                    d.z6(dVar, string3, string4);
                    return;
                }
                dVar.f44164c = true;
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                d.v6(dVar);
                vk1.f fVar = dVar.f44162a;
                fVar.getClass();
                vk1.a.a(fVar, i14);
                dVar.E6();
            } catch (NumberFormatException unused) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                dVar.f44164c = false;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d$f", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements View.OnFocusChangeListener {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44193a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.HR_MAX.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.LACTATE_THRESHOLD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j.HR_RESERVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f44193a = iArr;
            }
        }

        public f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            view2.getClass();
            EditText editText = (EditText) view2;
            d dVar = d.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                d.u6(dVar, editText.getId());
                return;
            }
            d.y6(dVar, editText);
            String strW6 = d.w6(dVar, editText);
            if (strW6.length() != 0) {
                try {
                    Integer.parseInt(strW6);
                    int i15 = Integer.parseInt(strW6);
                    vk1.f fVar = dVar.f44162a;
                    fVar.getClass();
                    j jVarG = vk1.c.g(fVar);
                    int i16 = jVarG == null ? -1 : a.f44193a[jVarG.ordinal()];
                    if (i16 == 1) {
                        i14 = 35;
                    } else if (i16 == 2) {
                        vk1.f fVar2 = dVar.f44162a;
                        fVar2.getClass();
                        i14 = fVar2.f178619i + 1;
                    } else if (i16 != 3) {
                        i14 = 0;
                    } else {
                        vk1.f fVar3 = dVar.f44162a;
                        fVar3.getClass();
                        i14 = fVar3.f178613c + 6;
                    }
                    if (i15 < i14 || i15 > 250) {
                        editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                        dVar.f44164c = false;
                        String string = dVar.getString(R.string.lbl_error_title_wrong_number);
                        string.getClass();
                        String string2 = dVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i14 - 1), "251");
                        string2.getClass();
                        d.z6(dVar, string, string2);
                        return;
                    }
                    dVar.f44164c = true;
                    editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                    d.v6(dVar);
                    vk1.f fVar4 = dVar.f44162a;
                    fVar4.getClass();
                    vk1.a.b(fVar4, i15);
                    dVar.E6();
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            dVar.f44164c = false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d$g", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements View.OnFocusChangeListener {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44195a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.HR_MAX.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.HR_RESERVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j.LACTATE_THRESHOLD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f44195a = iArr;
            }
        }

        public g() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            int i15;
            int iA;
            view2.getClass();
            EditText editText = (EditText) view2;
            d dVar = d.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                d.u6(dVar, editText.getId());
                return;
            }
            d.y6(dVar, editText);
            String strW6 = d.w6(dVar, editText);
            if (strW6.length() != 0) {
                try {
                    Integer.parseInt(strW6);
                    int i16 = Integer.parseInt(strW6);
                    EditText editText2 = dVar.f44181t;
                    if (editText2 == null || editText.getId() != editText2.getId()) {
                        EditText editText3 = dVar.f44182v;
                        if (editText3 == null || editText.getId() != editText3.getId()) {
                            EditText editText4 = dVar.f44183w;
                            if (editText4 == null || editText.getId() != editText4.getId()) {
                                EditText editText5 = dVar.f44184x;
                                if (editText5 == null || editText.getId() != editText5.getId()) {
                                    EditText editText6 = dVar.f44185y;
                                    if (editText6 == null || editText.getId() != editText6.getId()) {
                                        i14 = -99;
                                        i15 = -99;
                                    } else {
                                        vk1.f fVar = dVar.f44162a;
                                        fVar.getClass();
                                        j jVarG = vk1.c.g(fVar);
                                        int i17 = jVarG != null ? a.f44195a[jVarG.ordinal()] : -1;
                                        i14 = 100;
                                        if (i17 != 1 && i17 != 2 && i17 == 3) {
                                            vk1.f fVar2 = dVar.f44162a;
                                            fVar2.getClass();
                                            i14 = fVar2.f178628r;
                                        }
                                        vk1.f fVar3 = dVar.f44162a;
                                        fVar3.getClass();
                                        if (i16 <= fVar3.f178626p || i16 >= i14) {
                                            dVar.f44164c = false;
                                            vk1.f fVar4 = dVar.f44162a;
                                            fVar4.getClass();
                                            i15 = fVar4.f178626p;
                                        } else {
                                            dVar.f44164c = true;
                                            vk1.f fVar5 = dVar.f44162a;
                                            if (fVar5 != null) {
                                                fVar5.f178627q = i16;
                                            }
                                            i14 = -99;
                                            i15 = -99;
                                        }
                                    }
                                } else {
                                    vk1.f fVar6 = dVar.f44162a;
                                    fVar6.getClass();
                                    if (i16 > fVar6.f178625o) {
                                        vk1.f fVar7 = dVar.f44162a;
                                        fVar7.getClass();
                                        if (i16 < fVar7.f178627q) {
                                            dVar.f44164c = true;
                                            vk1.f fVar8 = dVar.f44162a;
                                            if (fVar8 != null) {
                                                fVar8.f178626p = i16;
                                            }
                                            i14 = -99;
                                            i15 = -99;
                                        }
                                    }
                                    dVar.f44164c = false;
                                    vk1.f fVar9 = dVar.f44162a;
                                    fVar9.getClass();
                                    i15 = fVar9.f178625o;
                                    vk1.f fVar10 = dVar.f44162a;
                                    fVar10.getClass();
                                    i14 = fVar10.f178627q;
                                }
                            } else {
                                vk1.f fVar11 = dVar.f44162a;
                                fVar11.getClass();
                                if (i16 > fVar11.f178624n) {
                                    vk1.f fVar12 = dVar.f44162a;
                                    fVar12.getClass();
                                    if (i16 < fVar12.f178626p) {
                                        dVar.f44164c = true;
                                        vk1.f fVar13 = dVar.f44162a;
                                        if (fVar13 != null) {
                                            fVar13.f178625o = i16;
                                        }
                                        i14 = -99;
                                        i15 = -99;
                                    }
                                }
                                dVar.f44164c = false;
                                vk1.f fVar14 = dVar.f44162a;
                                fVar14.getClass();
                                i15 = fVar14.f178624n;
                                vk1.f fVar15 = dVar.f44162a;
                                fVar15.getClass();
                                i14 = fVar15.f178626p;
                            }
                        } else {
                            vk1.f fVar16 = dVar.f44162a;
                            fVar16.getClass();
                            if (i16 > fVar16.f178623m) {
                                vk1.f fVar17 = dVar.f44162a;
                                fVar17.getClass();
                                if (i16 < fVar17.f178625o) {
                                    dVar.f44164c = true;
                                    vk1.f fVar18 = dVar.f44162a;
                                    if (fVar18 != null) {
                                        fVar18.f178624n = i16;
                                    }
                                    i14 = -99;
                                    i15 = -99;
                                }
                            }
                            dVar.f44164c = false;
                            vk1.f fVar19 = dVar.f44162a;
                            fVar19.getClass();
                            i15 = fVar19.f178623m;
                            vk1.f fVar20 = dVar.f44162a;
                            fVar20.getClass();
                            i14 = fVar20.f178625o;
                        }
                    } else {
                        vk1.f fVar21 = dVar.f44162a;
                        fVar21.getClass();
                        i14 = fVar21.f178624n;
                        vk1.f fVar22 = dVar.f44162a;
                        fVar22.getClass();
                        j jVarG2 = vk1.c.g(fVar22);
                        int i18 = jVarG2 == null ? -1 : a.f44195a[jVarG2.ordinal()];
                        if (i18 != 1) {
                            if (i18 != 2) {
                                i15 = 0;
                            } else {
                                vk1.f fVar23 = dVar.f44162a;
                                fVar23.getClass();
                                int i19 = fVar23.f178613c;
                                vk1.f fVar24 = dVar.f44162a;
                                fVar24.getClass();
                                int i24 = fVar24.f178613c;
                                vk1.f fVar25 = dVar.f44162a;
                                fVar25.getClass();
                                iA = vk1.g.a(i19, i24, fVar25.f178621k);
                            }
                            if (i16 > i15 || i16 >= i14) {
                                dVar.f44164c = false;
                            } else {
                                dVar.f44164c = true;
                                vk1.f fVar26 = dVar.f44162a;
                                if (fVar26 != null) {
                                    fVar26.f178623m = i16;
                                }
                                i14 = -99;
                                i15 = -99;
                            }
                        } else {
                            vk1.f fVar27 = dVar.f44162a;
                            fVar27.getClass();
                            iA = vk1.i.a(30, fVar27.f178621k);
                        }
                        i15 = iA - 1;
                        if (i16 > i15) {
                        }
                        dVar.f44164c = false;
                    }
                    if (dVar.f44164c) {
                        vk1.f fVar28 = dVar.f44162a;
                        fVar28.getClass();
                        vk1.a.d(fVar28);
                        dVar.E6();
                        d.v6(dVar);
                        return;
                    }
                    editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                    if (i15 == -99 || i14 == -99) {
                        return;
                    }
                    String string = dVar.getString(R.string.lbl_error_title_wrong_number);
                    string.getClass();
                    String string2 = dVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i15), String.valueOf(i14));
                    string2.getClass();
                    d.z6(dVar, string, string2);
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            dVar.f44164c = false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d$h", "Landroid/view/View$OnClickListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            d dVar = d.this;
            vk1.f fVar = dVar.f44162a;
            fVar.getClass();
            String string = dVar.getString(R.string.hr_zones_msg_reset_zones_confirm, vk1.c.f(fVar));
            string.getClass();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(dVar.requireContext());
            vk1.e eVar = dVar.f44163b;
            eVar.getClass();
            androidx.appcompat.app.e eVarCreate = aVar.setTitle(eVar.f178609e).setMessage(string).setPositiveButton(R.string.lbl_reset, new w(dVar, 2)).setNegativeButton(R.string.lbl_cancel, new v(1)).create();
            eVarCreate.getClass();
            if (dVar.getActivity() != null) {
                m activity = dVar.getActivity();
                activity.getClass();
                if (activity.isFinishing()) {
                    return;
                }
                eVarCreate.show();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d$i", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i implements View.OnFocusChangeListener {
        public i() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            view2.getClass();
            EditText editText = (EditText) view2;
            d dVar = d.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                d.u6(dVar, editText.getId());
                return;
            }
            d.y6(dVar, editText);
            String strW6 = d.w6(dVar, editText);
            if (strW6.length() == 0) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                dVar.f44164c = false;
                return;
            }
            if (strW6.equalsIgnoreCase("0")) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                dVar.f44164c = false;
                String string = dVar.getString(R.string.hr_zones_lbl_resting_heart_rate);
                string.getClass();
                vk1.f fVar = dVar.f44162a;
                fVar.getClass();
                String string2 = dVar.getString(R.string.hr_zones_msg_enter_resting_heart_rate, "30", String.valueOf(fVar.f178615e));
                string2.getClass();
                d.z6(dVar, string, string2);
                return;
            }
            try {
                Integer.parseInt(strW6);
                int i14 = Integer.parseInt(strW6);
                if (i14 >= 30) {
                    dVar.f44164c = true;
                    editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                    d.v6(dVar);
                    vk1.f fVar2 = dVar.f44162a;
                    fVar2.getClass();
                    vk1.a.c(fVar2, i14);
                    dVar.E6();
                    return;
                }
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                dVar.f44164c = false;
                String string3 = dVar.getString(R.string.lbl_error_title_wrong_number);
                string3.getClass();
                vk1.f fVar3 = dVar.f44162a;
                fVar3.getClass();
                String string4 = dVar.getString(R.string.lbl_error_message_wrong_number, "29", String.valueOf(fVar3.f178615e));
                string4.getClass();
                d.z6(dVar, string3, string4);
            } catch (NumberFormatException unused) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                dVar.f44164c = false;
            }
        }
    }

    public static final void u6(d dVar, int i14) {
        EditText editText = dVar.f44172k;
        if (editText == null || editText.getId() != i14) {
            EditText editText2 = dVar.f44172k;
            editText2.getClass();
            dVar.A6(editText2, false);
        }
        EditText editText3 = dVar.f44174l;
        if (editText3 == null || editText3.getId() != i14) {
            EditText editText4 = dVar.f44174l;
            editText4.getClass();
            dVar.A6(editText4, false);
        }
        EditText editText5 = dVar.f44175m;
        if (editText5 == null || editText5.getId() != i14) {
            EditText editText6 = dVar.f44175m;
            editText6.getClass();
            dVar.A6(editText6, false);
        }
        EditText editText7 = dVar.f44176n;
        if (editText7 == null || editText7.getId() != i14) {
            EditText editText8 = dVar.f44176n;
            editText8.getClass();
            dVar.A6(editText8, false);
        }
        EditText editText9 = dVar.f44177o;
        if (editText9 == null || editText9.getId() != i14) {
            EditText editText10 = dVar.f44177o;
            editText10.getClass();
            dVar.A6(editText10, false);
        }
        EditText editText11 = dVar.f44178p;
        if (editText11 == null || editText11.getId() != i14) {
            EditText editText12 = dVar.f44178p;
            editText12.getClass();
            dVar.A6(editText12, false);
        }
        EditText editText13 = dVar.f44179q;
        if (editText13 == null || editText13.getId() != i14) {
            EditText editText14 = dVar.f44179q;
            editText14.getClass();
            dVar.A6(editText14, false);
        }
        EditText editText15 = dVar.f44181t;
        if (editText15 == null || editText15.getId() != i14) {
            EditText editText16 = dVar.f44181t;
            editText16.getClass();
            dVar.A6(editText16, false);
        }
        EditText editText17 = dVar.f44182v;
        if (editText17 == null || editText17.getId() != i14) {
            EditText editText18 = dVar.f44182v;
            editText18.getClass();
            dVar.A6(editText18, false);
        }
        EditText editText19 = dVar.f44183w;
        if (editText19 == null || editText19.getId() != i14) {
            EditText editText20 = dVar.f44183w;
            editText20.getClass();
            dVar.A6(editText20, false);
        }
        EditText editText21 = dVar.f44184x;
        if (editText21 == null || editText21.getId() != i14) {
            EditText editText22 = dVar.f44184x;
            editText22.getClass();
            dVar.A6(editText22, false);
        }
        EditText editText23 = dVar.f44185y;
        if (editText23 == null || editText23.getId() != i14) {
            EditText editText24 = dVar.f44185y;
            editText24.getClass();
            dVar.A6(editText24, false);
        }
        EditText editText25 = dVar.f44180r;
        if (editText25 == null || editText25.getId() != i14) {
            EditText editText26 = dVar.f44180r;
            editText26.getClass();
            dVar.A6(editText26, false);
        }
    }

    public static final void v6(d dVar) {
        EditText editText = dVar.f44172k;
        editText.getClass();
        dVar.A6(editText, true);
        EditText editText2 = dVar.f44174l;
        editText2.getClass();
        dVar.A6(editText2, true);
        EditText editText3 = dVar.f44175m;
        editText3.getClass();
        dVar.A6(editText3, true);
        EditText editText4 = dVar.f44176n;
        editText4.getClass();
        dVar.A6(editText4, true);
        EditText editText5 = dVar.f44177o;
        editText5.getClass();
        dVar.A6(editText5, true);
        EditText editText6 = dVar.f44178p;
        editText6.getClass();
        dVar.A6(editText6, true);
        EditText editText7 = dVar.f44179q;
        editText7.getClass();
        dVar.A6(editText7, true);
        EditText editText8 = dVar.f44181t;
        editText8.getClass();
        dVar.A6(editText8, true);
        EditText editText9 = dVar.f44182v;
        editText9.getClass();
        dVar.A6(editText9, true);
        EditText editText10 = dVar.f44183w;
        editText10.getClass();
        dVar.A6(editText10, true);
        EditText editText11 = dVar.f44184x;
        editText11.getClass();
        dVar.A6(editText11, true);
        EditText editText12 = dVar.f44185y;
        editText12.getClass();
        dVar.A6(editText12, true);
        EditText editText13 = dVar.f44180r;
        editText13.getClass();
        dVar.A6(editText13, true);
    }

    public static final String w6(d dVar, EditText editText) {
        dVar.getClass();
        String string = editText.getText().toString();
        int length = string.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length) {
            boolean z15 = s.h(string.charAt(!z14 ? i14 : length), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length--;
            } else if (z15) {
                i14++;
            } else {
                z14 = true;
            }
        }
        return string.subSequence(i14, length + 1).toString();
    }

    public static final void y6(d dVar, EditText editText) {
        Object systemService = dVar.requireActivity().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static final void z6(d dVar, String str, String str2) {
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(dVar.requireContext()).setTitle(str).setMessage(str2).setPositiveButton(R.string.lbl_ok, new v(0)).create();
        eVarCreate.getClass();
        if (dVar.getActivity() == null || dVar.requireActivity().isFinishing()) {
            return;
        }
        eVarCreate.show();
    }

    public final void A6(EditText editText, boolean z14) {
        editText.setEnabled(z14);
        editText.setTextColor(requireContext().getColor(z14 ? R.color.gcm_text_primary : R.color.gcm_text_primary_disabled));
        if (z14) {
            editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
    }

    public final void C6() {
        vk1.f fVar = this.f44162a;
        fVar.getClass();
        boolean z14 = fVar.f178622l;
        TextView textView = this.X;
        if (!z14) {
            if (textView != null && textView != null) {
                textView.setVisibility(0);
            }
            View view2 = this.f44166e;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.f44167f;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.f44168g;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            View view5 = this.f44169h;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.f44170i;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            View view7 = this.f44171j;
            if (view7 != null) {
                view7.setVisibility(0);
                return;
            }
            return;
        }
        if (textView != null && textView != null) {
            textView.setVisibility(8);
        }
        View view8 = this.f44166e;
        if (view8 != null) {
            view8.setVisibility(0);
        }
        View view9 = this.f44169h;
        if (view9 != null) {
            view9.setVisibility(0);
        }
        View view10 = this.f44170i;
        if (view10 != null) {
            view10.setVisibility(0);
        }
        View view11 = this.f44171j;
        if (view11 != null) {
            view11.setVisibility(0);
        }
        vk1.f fVar2 = this.f44162a;
        fVar2.getClass();
        j jVarG = vk1.c.g(fVar2);
        int i14 = jVarG == null ? -1 : b.f44187a[jVarG.ordinal()];
        if (i14 == 1) {
            TextView textView2 = this.I;
            if (textView2 != null) {
                textView2.setText(R.string.based_on_percent_hr_lbl);
            }
            View view12 = this.f44167f;
            if (view12 != null) {
                view12.setVisibility(8);
            }
            View view13 = this.f44168g;
            if (view13 != null) {
                view13.setVisibility(8);
                return;
            }
            return;
        }
        if (i14 == 2) {
            TextView textView3 = this.I;
            if (textView3 != null) {
                textView3.setText(R.string.based_on_percent_heart_rate_reserve_lbl);
            }
            View view14 = this.f44167f;
            if (view14 != null) {
                view14.setVisibility(0);
            }
            View view15 = this.f44168g;
            if (view15 != null) {
                view15.setVisibility(8);
                return;
            }
            return;
        }
        if (i14 != 3) {
            return;
        }
        TextView textView4 = this.I;
        if (textView4 != null) {
            textView4.setText(R.string.based_on_percent_lactate_threshold_lbl);
        }
        View view16 = this.f44167f;
        if (view16 != null) {
            view16.setVisibility(8);
        }
        View view17 = this.f44168g;
        if (view17 != null) {
            view17.setVisibility(0);
        }
    }

    public final void E6() {
        C6();
        EditText editText = this.f44172k;
        if (editText != null) {
            vk1.f fVar = this.f44162a;
            fVar.getClass();
            editText.setText(String.valueOf(fVar.f178613c));
        }
        EditText editText2 = this.f44174l;
        if (editText2 != null) {
            vk1.f fVar2 = this.f44162a;
            fVar2.getClass();
            editText2.setText(String.valueOf(fVar2.f178614d));
        }
        EditText editText3 = this.f44175m;
        if (editText3 != null) {
            vk1.f fVar3 = this.f44162a;
            fVar3.getClass();
            editText3.setText(String.valueOf(fVar3.f178615e));
        }
        EditText editText4 = this.f44181t;
        if (editText4 != null) {
            vk1.f fVar4 = this.f44162a;
            fVar4.getClass();
            editText4.setText(String.valueOf(fVar4.f178623m));
        }
        EditText editText5 = this.f44176n;
        if (editText5 != null) {
            vk1.f fVar5 = this.f44162a;
            fVar5.getClass();
            editText5.setText(String.valueOf(fVar5.f178616f));
        }
        EditText editText6 = this.f44182v;
        if (editText6 != null) {
            vk1.f fVar6 = this.f44162a;
            fVar6.getClass();
            editText6.setText(String.valueOf(fVar6.f178624n));
        }
        EditText editText7 = this.f44177o;
        if (editText7 != null) {
            vk1.f fVar7 = this.f44162a;
            fVar7.getClass();
            editText7.setText(String.valueOf(fVar7.f178617g));
        }
        EditText editText8 = this.f44183w;
        if (editText8 != null) {
            vk1.f fVar8 = this.f44162a;
            fVar8.getClass();
            editText8.setText(String.valueOf(fVar8.f178625o));
        }
        EditText editText9 = this.f44178p;
        if (editText9 != null) {
            vk1.f fVar9 = this.f44162a;
            fVar9.getClass();
            editText9.setText(String.valueOf(fVar9.f178618h));
        }
        EditText editText10 = this.f44184x;
        if (editText10 != null) {
            vk1.f fVar10 = this.f44162a;
            fVar10.getClass();
            editText10.setText(String.valueOf(fVar10.f178626p));
        }
        EditText editText11 = this.f44179q;
        if (editText11 != null) {
            vk1.f fVar11 = this.f44162a;
            fVar11.getClass();
            editText11.setText(String.valueOf(fVar11.f178619i));
        }
        EditText editText12 = this.f44185y;
        if (editText12 != null) {
            vk1.f fVar12 = this.f44162a;
            fVar12.getClass();
            editText12.setText(String.valueOf(fVar12.f178627q));
        }
        EditText editText13 = this.f44180r;
        if (editText13 != null) {
            vk1.f fVar13 = this.f44162a;
            fVar13.getClass();
            editText13.setText(String.valueOf(fVar13.f178621k));
        }
        EditText editText14 = this.f44186z;
        if (editText14 != null) {
            vk1.f fVar14 = this.f44162a;
            fVar14.getClass();
            editText14.setText(String.valueOf(fVar14.f178628r));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("dto") : null;
            parcelable = (vk1.f) (parcelable2 instanceof vk1.f ? parcelable2 : null);
        } else if (bundleRequireArguments != null) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("dto", vk1.f.class);
        }
        vk1.f fVar = (vk1.f) parcelable;
        this.f44162a = fVar;
        fVar.getClass();
        this.f44163b = vk1.c.d(fVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_vivosport_hr_zones_frag, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String strA;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.enable_disable_toggle_container);
        if (vk1.e.DEFAULT == this.f44163b) {
            viewFindViewById.setVisibility(8);
        } else {
            View viewFindViewById2 = viewFindViewById.findViewById(R.id.switch_right);
            viewFindViewById2.getClass();
            SwitchCompat switchCompat = (SwitchCompat) viewFindViewById2;
            this.f44165d = switchCompat;
            vk1.f fVar = this.f44162a;
            fVar.getClass();
            switchCompat.setChecked(fVar.f178622l);
            SwitchCompat switchCompat2 = this.f44165d;
            if (switchCompat2 != null) {
                switchCompat2.setOnCheckedChangeListener(this.Y);
            }
            View viewFindViewById3 = viewFindViewById.findViewById(R.id.bottom_hint);
            viewFindViewById3.getClass();
            TextView textView = (TextView) viewFindViewById3;
            this.X = textView;
            vk1.e eVar = this.f44163b;
            eVar.getClass();
            textView.setText(eVar.f178606b);
            View viewFindViewById4 = viewFindViewById.findViewById(R.id.label_left);
            viewFindViewById4.getClass();
            TextView textView2 = (TextView) viewFindViewById4;
            vk1.e eVar2 = this.f44163b;
            eVar2.getClass();
            c3 c3Var = eVar2.f178605a;
            if (c3Var != null) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                strA = dh.b.A(contextRequireContext, c3Var);
            } else {
                strA = null;
            }
            textView2.setText(strA);
        }
        this.f44166e = view2.findViewById(R.id.training_method_container);
        this.I = (TextView) view2.findViewById(R.id.training_method_label);
        View viewFindViewById5 = view2.findViewById(R.id.resting_heart_rate_container);
        this.f44167f = viewFindViewById5;
        this.T = (TextView) (viewFindViewById5 != null ? viewFindViewById5.findViewById(R.id.resting_heart_rate_label) : null);
        View view3 = this.f44167f;
        EditText editText = (EditText) (view3 != null ? view3.findViewById(R.id.resting_heart_rate) : null);
        this.f44172k = editText;
        if (editText != null) {
            editText.setOnFocusChangeListener(this.H0);
        }
        EditText editText2 = this.f44172k;
        bl0.a aVar = this.M0;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(aVar);
        }
        View viewFindViewById6 = view2.findViewById(R.id.lactate_threshold_container);
        this.f44168g = viewFindViewById6;
        this.P = (TextView) (viewFindViewById6 != null ? viewFindViewById6.findViewById(R.id.lactate_threshold_label) : null);
        View view4 = this.f44168g;
        EditText editText3 = (EditText) (view4 != null ? view4.findViewById(R.id.lactate_threshold) : null);
        this.f44174l = editText3;
        if (editText3 != null) {
            editText3.setOnFocusChangeListener(this.I0);
        }
        EditText editText4 = this.f44174l;
        if (editText4 != null) {
            editText4.setOnEditorActionListener(aVar);
        }
        View viewFindViewById7 = view2.findViewById(R.id.three_column_container);
        this.f44169h = viewFindViewById7;
        TextView textView3 = (TextView) (viewFindViewById7 != null ? viewFindViewById7.findViewById(R.id.zone1_label) : null);
        this.A = textView3;
        if (textView3 != null) {
            textView3.setText(getString(R.string.heart_rate_zone_name, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        }
        View view5 = this.f44169h;
        EditText editText5 = (EditText) (view5 != null ? view5.findViewById(R.id.bpm1) : null);
        this.f44175m = editText5;
        c cVar = this.K0;
        if (editText5 != null) {
            editText5.setOnFocusChangeListener(cVar);
        }
        EditText editText6 = this.f44175m;
        if (editText6 != null) {
            editText6.setOnEditorActionListener(aVar);
        }
        View view6 = this.f44169h;
        EditText editText7 = (EditText) (view6 != null ? view6.findViewById(R.id.percent1) : null);
        this.f44181t = editText7;
        g gVar = this.L0;
        if (editText7 != null) {
            editText7.setOnFocusChangeListener(gVar);
        }
        EditText editText8 = this.f44181t;
        if (editText8 != null) {
            editText8.setOnEditorActionListener(aVar);
        }
        View view7 = this.f44169h;
        TextView textView4 = (TextView) (view7 != null ? view7.findViewById(R.id.zone2_label) : null);
        this.B = textView4;
        if (textView4 != null) {
            textView4.setText(getString(R.string.heart_rate_zone_name, "2"));
        }
        View view8 = this.f44169h;
        EditText editText9 = (EditText) (view8 != null ? view8.findViewById(R.id.bpm2) : null);
        this.f44176n = editText9;
        if (editText9 != null) {
            editText9.setOnFocusChangeListener(cVar);
        }
        EditText editText10 = this.f44176n;
        if (editText10 != null) {
            editText10.setOnEditorActionListener(aVar);
        }
        View view9 = this.f44169h;
        EditText editText11 = (EditText) (view9 != null ? view9.findViewById(R.id.percent2) : null);
        this.f44182v = editText11;
        if (editText11 != null) {
            editText11.setOnFocusChangeListener(gVar);
        }
        EditText editText12 = this.f44182v;
        if (editText12 != null) {
            editText12.setOnEditorActionListener(aVar);
        }
        View view10 = this.f44169h;
        TextView textView5 = (TextView) (view10 != null ? view10.findViewById(R.id.zone3_label) : null);
        this.C = textView5;
        if (textView5 != null) {
            textView5.setText(getString(R.string.heart_rate_zone_name, "3"));
        }
        View view11 = this.f44169h;
        EditText editText13 = (EditText) (view11 != null ? view11.findViewById(R.id.bpm3) : null);
        this.f44177o = editText13;
        if (editText13 != null) {
            editText13.setOnFocusChangeListener(cVar);
        }
        EditText editText14 = this.f44177o;
        if (editText14 != null) {
            editText14.setOnEditorActionListener(aVar);
        }
        View view12 = this.f44169h;
        EditText editText15 = (EditText) (view12 != null ? view12.findViewById(R.id.percent3) : null);
        this.f44183w = editText15;
        if (editText15 != null) {
            editText15.setOnFocusChangeListener(gVar);
        }
        EditText editText16 = this.f44183w;
        if (editText16 != null) {
            editText16.setOnEditorActionListener(aVar);
        }
        View view13 = this.f44169h;
        TextView textView6 = (TextView) (view13 != null ? view13.findViewById(R.id.zone4_label) : null);
        this.D = textView6;
        if (textView6 != null) {
            textView6.setText(getString(R.string.heart_rate_zone_name, "4"));
        }
        View view14 = this.f44169h;
        EditText editText17 = (EditText) (view14 != null ? view14.findViewById(R.id.bpm4) : null);
        this.f44178p = editText17;
        if (editText17 != null) {
            editText17.setOnFocusChangeListener(cVar);
        }
        EditText editText18 = this.f44178p;
        if (editText18 != null) {
            editText18.setOnEditorActionListener(aVar);
        }
        View view15 = this.f44169h;
        EditText editText19 = (EditText) (view15 != null ? view15.findViewById(R.id.percent4) : null);
        this.f44184x = editText19;
        if (editText19 != null) {
            editText19.setOnFocusChangeListener(gVar);
        }
        EditText editText20 = this.f44184x;
        if (editText20 != null) {
            editText20.setOnEditorActionListener(aVar);
        }
        View view16 = this.f44169h;
        TextView textView7 = (TextView) (view16 != null ? view16.findViewById(R.id.zone5_label) : null);
        this.E = textView7;
        if (textView7 != null) {
            textView7.setText(getString(R.string.heart_rate_zone_name, "5"));
        }
        View view17 = this.f44169h;
        EditText editText21 = (EditText) (view17 != null ? view17.findViewById(R.id.bpm5) : null);
        this.f44179q = editText21;
        if (editText21 != null) {
            editText21.setOnFocusChangeListener(cVar);
        }
        EditText editText22 = this.f44179q;
        if (editText22 != null) {
            editText22.setOnEditorActionListener(aVar);
        }
        View view18 = this.f44169h;
        EditText editText23 = (EditText) (view18 != null ? view18.findViewById(R.id.percent5) : null);
        this.f44185y = editText23;
        if (editText23 != null) {
            editText23.setOnFocusChangeListener(gVar);
        }
        EditText editText24 = this.f44185y;
        if (editText24 != null) {
            editText24.setOnEditorActionListener(aVar);
        }
        View view19 = this.f44169h;
        this.F = (TextView) (view19 != null ? view19.findViewById(R.id.max_hr_label) : null);
        View view20 = this.f44169h;
        EditText editText25 = (EditText) (view20 != null ? view20.findViewById(R.id.max_hr) : null);
        this.f44180r = editText25;
        if (editText25 != null) {
            editText25.setOnFocusChangeListener(this.J0);
        }
        EditText editText26 = this.f44180r;
        if (editText26 != null) {
            editText26.setOnEditorActionListener(aVar);
        }
        View view21 = this.f44169h;
        EditText editText27 = (EditText) (view21 != null ? view21.findViewById(R.id.percent_total) : null);
        this.f44186z = editText27;
        if (editText27 != null) {
            editText27.setEnabled(false);
        }
        EditText editText28 = this.f44186z;
        if (editText28 != null) {
            editText28.setFocusable(false);
        }
        EditText editText29 = this.f44186z;
        if (editText29 != null) {
            editText29.setFocusableInTouchMode(false);
        }
        EditText editText30 = this.f44186z;
        if (editText30 != null) {
            editText30.setBackgroundColor(requireContext().getColor(android.R.color.transparent));
        }
        EditText editText31 = this.f44186z;
        if (editText31 != null) {
            editText31.setTextColor(requireContext().getColor(R.color.gcm_text_secondary));
        }
        View viewFindViewById8 = view2.findViewById(R.id.reset_container);
        this.f44170i = viewFindViewById8;
        h hVar = this.Z;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(hVar);
        }
        View view22 = this.f44170i;
        TextView textView8 = (TextView) (view22 != null ? view22.findViewById(R.id.reset_text) : null);
        if (textView8 != null) {
            textView8.setOnClickListener(hVar);
        }
        View viewFindViewById9 = view2.findViewById(R.id.additional_info_container);
        this.f44171j = viewFindViewById9;
        View view23 = this.f44171j;
        if (view23 != null) {
            view23.setOnClickListener(this.f44173k0);
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        int iB = (int) c22.b.b(contextRequireContext2, getResources().getDimension(R.dimen.andfont_body_1), 1.3f);
        EditText editText32 = this.f44175m;
        editText32.getClass();
        float f14 = iB;
        editText32.setTextSize(0, f14);
        EditText editText33 = this.f44176n;
        editText33.getClass();
        editText33.setTextSize(0, f14);
        EditText editText34 = this.f44177o;
        editText34.getClass();
        editText34.setTextSize(0, f14);
        EditText editText35 = this.f44178p;
        editText35.getClass();
        editText35.setTextSize(0, f14);
        EditText editText36 = this.f44179q;
        editText36.getClass();
        editText36.setTextSize(0, f14);
        EditText editText37 = this.f44181t;
        editText37.getClass();
        editText37.setTextSize(0, f14);
        EditText editText38 = this.f44182v;
        editText38.getClass();
        editText38.setTextSize(0, f14);
        EditText editText39 = this.f44183w;
        editText39.getClass();
        editText39.setTextSize(0, f14);
        EditText editText40 = this.f44184x;
        editText40.getClass();
        editText40.setTextSize(0, f14);
        EditText editText41 = this.f44185y;
        editText41.getClass();
        editText41.setTextSize(0, f14);
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        int iB2 = (int) c22.b.b(contextRequireContext3, getResources().getDimension(R.dimen.andfont_body_2), 1.3f);
        TextView textView9 = this.A;
        textView9.getClass();
        float f15 = iB2;
        textView9.setTextSize(0, f15);
        TextView textView10 = this.B;
        textView10.getClass();
        textView10.setTextSize(0, f15);
        TextView textView11 = this.C;
        textView11.getClass();
        textView11.setTextSize(0, f15);
        TextView textView12 = this.D;
        textView12.getClass();
        textView12.setTextSize(0, f15);
        TextView textView13 = this.E;
        textView13.getClass();
        textView13.setTextSize(0, f15);
        EditText editText42 = this.f44186z;
        editText42.getClass();
        editText42.setTextSize(0, f15);
        EditText editText43 = this.f44180r;
        editText43.getClass();
        editText43.setTextSize(0, f15);
        TextView textView14 = this.F;
        textView14.getClass();
        textView14.setTextSize(0, f15);
        E6();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/d$a;", "", "<init>", "()V", "", "EXTRA_DTO", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
