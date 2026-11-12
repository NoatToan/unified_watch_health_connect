package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import c22.c3;
import c22.y3;
import ch1.j2;
import ch1.r3;
import ch1.s3;
import ch1.w4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vg1.z0;
import vk1.g;
import vk1.i;
import vk1.j;
import vn2.t0;
import vu1.k;
import xk1.t;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/b;", "Landroidx/fragment/app/Fragment;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment implements Observer {
    public static final a J0 = new a(null);
    public String A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView I;
    public GCMComplexOneLineButton P;
    public LinearLayout T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vk1.f f44098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vk1.e f44099b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SwitchCompat f44102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f44103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f44104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EditText f44105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f44106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f44107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EditText f44108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f44110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EditText f44111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EditText f44112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f44113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f44114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f44115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EditText f44116r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f44117t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fb2.e<vk1.f> f44120x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j2 f44121y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w4 f44122z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44100c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44101d = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f44118v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f44119w = new ArrayList();
    public final c X = new c();
    public final f Y = new f();
    public final d Z = new d();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0827b f44109k0 = new ViewOnFocusChangeListenerC0827b();
    public final e H0 = new e();
    public final bl0.a I0 = new bl0.a(this, 14);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/b$b", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ViewOnFocusChangeListenerC0827b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b$b$a */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44124a;

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
                f44124a = iArr;
            }
        }

        public ViewOnFocusChangeListenerC0827b() {
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0089  */
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            int i15;
            int iMin;
            view2.getClass();
            EditText editText = (EditText) view2;
            b bVar = b.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                b.u6(bVar, editText.getId());
                return;
            }
            y3.b(editText);
            bVar.getClass();
            String strY6 = b.y6(editText);
            if (strY6.length() == 0 || !StringUtils.isNumeric(strY6)) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                bVar.f44101d = false;
                return;
            }
            int i16 = Integer.parseInt(strY6);
            EditText editText2 = bVar.f44105h;
            if (editText2 == null || editText.getId() != editText2.getId()) {
                EditText editText3 = bVar.f44106i;
                if (editText3 == null || editText.getId() != editText3.getId()) {
                    EditText editText4 = bVar.f44107j;
                    if (editText4 == null || editText.getId() != editText4.getId()) {
                        EditText editText5 = bVar.f44108k;
                        if (editText5 == null || editText.getId() != editText5.getId()) {
                            EditText editText6 = bVar.f44110l;
                            if (editText6 == null || editText.getId() != editText6.getId()) {
                                i15 = -99;
                                i14 = -99;
                            } else {
                                vk1.f fVar = bVar.f44098a;
                                fVar.getClass();
                                if (i16 > fVar.f178618h) {
                                    vk1.f fVar2 = bVar.f44098a;
                                    fVar2.getClass();
                                    if (i16 < fVar2.f178621k) {
                                        bVar.f44101d = true;
                                        vk1.f fVar3 = bVar.f44098a;
                                        if (fVar3 != null) {
                                            fVar3.f178619i = i16;
                                        }
                                        i15 = -99;
                                        i14 = -99;
                                    }
                                }
                                bVar.f44101d = false;
                                vk1.f fVar4 = bVar.f44098a;
                                fVar4.getClass();
                                i14 = fVar4.f178618h;
                                vk1.f fVar5 = bVar.f44098a;
                                fVar5.getClass();
                                i15 = fVar5.f178621k;
                            }
                        } else {
                            vk1.f fVar6 = bVar.f44098a;
                            fVar6.getClass();
                            if (i16 > fVar6.f178617g) {
                                vk1.f fVar7 = bVar.f44098a;
                                fVar7.getClass();
                                if (i16 < fVar7.f178619i) {
                                    bVar.f44101d = true;
                                    vk1.f fVar8 = bVar.f44098a;
                                    if (fVar8 != null) {
                                        fVar8.f178618h = i16;
                                    }
                                    i15 = -99;
                                    i14 = -99;
                                }
                            }
                            bVar.f44101d = false;
                            vk1.f fVar9 = bVar.f44098a;
                            fVar9.getClass();
                            i14 = fVar9.f178617g;
                            vk1.f fVar10 = bVar.f44098a;
                            fVar10.getClass();
                            i15 = fVar10.f178619i;
                        }
                    } else {
                        vk1.f fVar11 = bVar.f44098a;
                        fVar11.getClass();
                        if (i16 > fVar11.f178616f) {
                            vk1.f fVar12 = bVar.f44098a;
                            fVar12.getClass();
                            if (i16 < fVar12.f178618h) {
                                bVar.f44101d = true;
                                vk1.f fVar13 = bVar.f44098a;
                                if (fVar13 != null) {
                                    fVar13.f178617g = i16;
                                }
                                i15 = -99;
                                i14 = -99;
                            }
                        }
                        bVar.f44101d = false;
                        vk1.f fVar14 = bVar.f44098a;
                        fVar14.getClass();
                        i14 = fVar14.f178616f;
                        vk1.f fVar15 = bVar.f44098a;
                        fVar15.getClass();
                        i15 = fVar15.f178618h;
                    }
                } else {
                    vk1.f fVar16 = bVar.f44098a;
                    fVar16.getClass();
                    if (i16 > fVar16.f178615e) {
                        vk1.f fVar17 = bVar.f44098a;
                        fVar17.getClass();
                        if (i16 < fVar17.f178617g) {
                            bVar.f44101d = true;
                            vk1.f fVar18 = bVar.f44098a;
                            if (fVar18 != null) {
                                fVar18.f178616f = i16;
                            }
                            i15 = -99;
                            i14 = -99;
                        }
                    }
                    bVar.f44101d = false;
                    vk1.f fVar19 = bVar.f44098a;
                    fVar19.getClass();
                    i14 = fVar19.f178615e;
                    vk1.f fVar20 = bVar.f44098a;
                    fVar20.getClass();
                    i15 = fVar20.f178617g;
                }
            } else {
                vk1.f fVar21 = bVar.f44098a;
                fVar21.getClass();
                j jVarG = vk1.c.g(fVar21);
                if (jVarG != null) {
                    int i17 = a.f44124a[jVarG.ordinal()];
                    iMin = 30;
                    if (i17 != 1) {
                        if (i17 == 2) {
                            vk1.f fVar22 = bVar.f44098a;
                            fVar22.getClass();
                            iMin = fVar22.f178613c + 1;
                        } else if (i17 != 3) {
                            iMin = 0;
                        } else {
                            int iMin2 = (int) Math.min(i16, 46.0d);
                            if (iMin2 > 30) {
                                iMin = (int) Math.min(iMin2, 30.0d);
                            }
                        }
                    }
                } else {
                    iMin = 0;
                }
                if (i16 >= iMin) {
                    vk1.f fVar23 = bVar.f44098a;
                    fVar23.getClass();
                    if (i16 < fVar23.f178616f) {
                        bVar.f44101d = true;
                        vk1.f fVar24 = bVar.f44098a;
                        if (fVar24 != null) {
                            fVar24.f178615e = i16;
                        }
                        i15 = -99;
                        i14 = -99;
                    }
                }
                bVar.f44101d = false;
                i14 = iMin - 1;
                vk1.f fVar25 = bVar.f44098a;
                fVar25.getClass();
                i15 = fVar25.f178616f;
            }
            if (bVar.f44101d) {
                vk1.f fVar26 = bVar.f44098a;
                fVar26.getClass();
                vk1.a.e(fVar26);
                bVar.C6();
                bVar.w6();
                return;
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            if (i14 == -99 || i15 == -99) {
                return;
            }
            bVar.A6(bVar.getString(R.string.lbl_error_title_wrong_number), bVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i14), String.valueOf(i15)));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/b$c", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            compoundButton.getClass();
            final b bVar = b.this;
            if (z14) {
                vk1.f fVar = bVar.f44098a;
                if (fVar != null) {
                    fVar.f178622l = true;
                }
                bVar.z6();
                return;
            }
            if (!bVar.f44100c) {
                final int i14 = 0;
                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(bVar.requireContext()).setTitle(bVar.getString(R.string.lbl_dialog_delete_custom_zones)).setMessage(bVar.getString(R.string.msg_dialog_delete_custom_zones)).setPositiveButton(R.string.lbl_delete, new t(bVar, 0)).setNegativeButton(R.string.lbl_cancel, new t(bVar, 1)).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xk1.u
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i15, KeyEvent keyEvent) {
                        switch (i14) {
                            case 0:
                                dialogInterface.getClass();
                                if (i15 == 4) {
                                    dialogInterface.dismiss();
                                    SwitchCompat switchCompat = bVar.f44102e;
                                    if (switchCompat != null) {
                                        switchCompat.setChecked(true);
                                    }
                                }
                                break;
                            default:
                                dialogInterface.getClass();
                                if (i15 == 4) {
                                    dialogInterface.dismiss();
                                    SwitchCompat switchCompat2 = bVar.f44102e;
                                    if (switchCompat2 != null) {
                                        switchCompat2.setChecked(true);
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                }).setCancelable(false).create();
                eVarCreate.getClass();
                if (bVar.getActivity() != null) {
                    m activity = bVar.getActivity();
                    activity.getClass();
                    if (activity.isFinishing()) {
                        return;
                    }
                    eVarCreate.show();
                    return;
                }
                return;
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(bVar.requireContext());
            vk1.e eVar = bVar.f44099b;
            eVar.getClass();
            androidx.appcompat.app.e.a title = aVar.setTitle(eVar.f178607c);
            vk1.e eVar2 = bVar.f44099b;
            eVar2.getClass();
            androidx.appcompat.app.e.a negativeButton = title.setMessage(eVar2.f178608d).setPositiveButton(R.string.lbl_common_continue, new t(bVar, 2)).setNegativeButton(R.string.lbl_cancel, new t(bVar, 3));
            final int i15 = 1;
            androidx.appcompat.app.e eVarCreate2 = negativeButton.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xk1.u
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i16, KeyEvent keyEvent) {
                    switch (i15) {
                        case 0:
                            dialogInterface.getClass();
                            if (i16 == 4) {
                                dialogInterface.dismiss();
                                SwitchCompat switchCompat = bVar.f44102e;
                                if (switchCompat != null) {
                                    switchCompat.setChecked(true);
                                }
                            }
                            break;
                        default:
                            dialogInterface.getClass();
                            if (i16 == 4) {
                                dialogInterface.dismiss();
                                SwitchCompat switchCompat2 = bVar.f44102e;
                                if (switchCompat2 != null) {
                                    switchCompat2.setChecked(true);
                                }
                            }
                            break;
                    }
                    return true;
                }
            }).setCancelable(false).create();
            eVarCreate2.getClass();
            if (bVar.getActivity() != null) {
                m activity2 = bVar.getActivity();
                activity2.getClass();
                if (activity2.isFinishing()) {
                    return;
                }
                eVarCreate2.show();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/b$d", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements View.OnFocusChangeListener {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44127a;

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
                f44127a = iArr;
            }
        }

        public d() {
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006f  */
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            view2.getClass();
            EditText editText = (EditText) view2;
            b bVar = b.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                b.u6(bVar, editText.getId());
                return;
            }
            y3.b(editText);
            bVar.getClass();
            String strY6 = b.y6(editText);
            if (strY6.length() == 0 || !StringUtils.isNumeric(strY6)) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                bVar.f44101d = false;
                return;
            }
            int i15 = Integer.parseInt(strY6);
            vk1.f fVar = bVar.f44098a;
            fVar.getClass();
            j jVarG = vk1.c.g(fVar);
            if (jVarG == null) {
                i14 = 0;
            } else {
                int i16 = a.f44127a[jVarG.ordinal()];
                if (i16 == 1) {
                    i14 = 35;
                } else if (i16 == 2) {
                    vk1.f fVar2 = bVar.f44098a;
                    fVar2.getClass();
                    i14 = fVar2.f178619i + 1;
                } else if (i16 != 3) {
                    i14 = 0;
                } else {
                    vk1.f fVar3 = bVar.f44098a;
                    fVar3.getClass();
                    i14 = fVar3.f178613c + 6;
                }
            }
            if (i15 < i14 || i15 > 250) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                bVar.f44101d = false;
                bVar.A6(bVar.getString(R.string.lbl_error_title_wrong_number), bVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i14 - 1), "251"));
                return;
            }
            bVar.f44101d = true;
            editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
            bVar.w6();
            vk1.f fVar4 = bVar.f44098a;
            fVar4.getClass();
            vk1.a.b(fVar4, i15);
            bVar.C6();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/b$e", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements View.OnFocusChangeListener {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44129a;

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
                f44129a = iArr;
            }
        }

        public e() {
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0097  */
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            int i15;
            int i16;
            int iA;
            view2.getClass();
            EditText editText = (EditText) view2;
            b bVar = b.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                b.u6(bVar, editText.getId());
                return;
            }
            y3.b(editText);
            bVar.getClass();
            String strY6 = b.y6(editText);
            if (strY6.length() == 0 || !StringUtils.isNumeric(strY6)) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                bVar.f44101d = false;
                return;
            }
            int i17 = Integer.parseInt(strY6);
            EditText editText2 = bVar.f44112n;
            if (editText2 == null || editText.getId() != editText2.getId()) {
                EditText editText3 = bVar.f44113o;
                if (editText3 == null || editText.getId() != editText3.getId()) {
                    EditText editText4 = bVar.f44114p;
                    if (editText4 == null || editText.getId() != editText4.getId()) {
                        EditText editText5 = bVar.f44115q;
                        if (editText5 == null || editText.getId() != editText5.getId()) {
                            EditText editText6 = bVar.f44116r;
                            if (editText6 == null || editText.getId() != editText6.getId()) {
                                i14 = -99;
                                i15 = -99;
                            } else {
                                vk1.f fVar = bVar.f44098a;
                                fVar.getClass();
                                j jVarG = vk1.c.g(fVar);
                                int i18 = 100;
                                if (jVarG != null && (i16 = a.f44129a[jVarG.ordinal()]) != 1 && i16 != 2 && i16 == 3) {
                                    vk1.f fVar2 = bVar.f44098a;
                                    fVar2.getClass();
                                    i18 = fVar2.f178628r;
                                }
                                i14 = i18;
                                vk1.f fVar3 = bVar.f44098a;
                                fVar3.getClass();
                                if (i17 <= fVar3.f178626p || i17 >= i14) {
                                    bVar.f44101d = false;
                                    vk1.f fVar4 = bVar.f44098a;
                                    fVar4.getClass();
                                    i15 = fVar4.f178626p;
                                } else {
                                    bVar.f44101d = true;
                                    vk1.f fVar5 = bVar.f44098a;
                                    if (fVar5 != null) {
                                        fVar5.f178627q = i17;
                                    }
                                    i14 = -99;
                                    i15 = -99;
                                }
                            }
                        } else {
                            vk1.f fVar6 = bVar.f44098a;
                            fVar6.getClass();
                            if (i17 > fVar6.f178625o) {
                                vk1.f fVar7 = bVar.f44098a;
                                fVar7.getClass();
                                if (i17 < fVar7.f178627q) {
                                    bVar.f44101d = true;
                                    vk1.f fVar8 = bVar.f44098a;
                                    if (fVar8 != null) {
                                        fVar8.f178626p = i17;
                                    }
                                    i14 = -99;
                                    i15 = -99;
                                }
                            }
                            bVar.f44101d = false;
                            vk1.f fVar9 = bVar.f44098a;
                            fVar9.getClass();
                            i15 = fVar9.f178625o;
                            vk1.f fVar10 = bVar.f44098a;
                            fVar10.getClass();
                            i14 = fVar10.f178627q;
                        }
                    } else {
                        vk1.f fVar11 = bVar.f44098a;
                        fVar11.getClass();
                        if (i17 > fVar11.f178624n) {
                            vk1.f fVar12 = bVar.f44098a;
                            fVar12.getClass();
                            if (i17 < fVar12.f178626p) {
                                bVar.f44101d = true;
                                vk1.f fVar13 = bVar.f44098a;
                                if (fVar13 != null) {
                                    fVar13.f178625o = i17;
                                }
                                i14 = -99;
                                i15 = -99;
                            }
                        }
                        bVar.f44101d = false;
                        vk1.f fVar14 = bVar.f44098a;
                        fVar14.getClass();
                        i15 = fVar14.f178624n;
                        vk1.f fVar15 = bVar.f44098a;
                        fVar15.getClass();
                        i14 = fVar15.f178626p;
                    }
                } else {
                    vk1.f fVar16 = bVar.f44098a;
                    fVar16.getClass();
                    if (i17 > fVar16.f178623m) {
                        vk1.f fVar17 = bVar.f44098a;
                        fVar17.getClass();
                        if (i17 < fVar17.f178625o) {
                            bVar.f44101d = true;
                            vk1.f fVar18 = bVar.f44098a;
                            if (fVar18 != null) {
                                fVar18.f178624n = i17;
                            }
                            i14 = -99;
                            i15 = -99;
                        }
                    }
                    bVar.f44101d = false;
                    vk1.f fVar19 = bVar.f44098a;
                    fVar19.getClass();
                    i15 = fVar19.f178623m;
                    vk1.f fVar20 = bVar.f44098a;
                    fVar20.getClass();
                    i14 = fVar20.f178625o;
                }
            } else {
                vk1.f fVar21 = bVar.f44098a;
                fVar21.getClass();
                i14 = fVar21.f178624n;
                vk1.f fVar22 = bVar.f44098a;
                fVar22.getClass();
                j jVarG2 = vk1.c.g(fVar22);
                if (jVarG2 == null) {
                    i15 = 0;
                } else {
                    int i19 = a.f44129a[jVarG2.ordinal()];
                    if (i19 == 1) {
                        vk1.f fVar23 = bVar.f44098a;
                        fVar23.getClass();
                        iA = i.a(30, fVar23.f178621k);
                    } else if (i19 != 2) {
                        i15 = 0;
                    } else {
                        vk1.f fVar24 = bVar.f44098a;
                        fVar24.getClass();
                        int i24 = fVar24.f178613c;
                        vk1.f fVar25 = bVar.f44098a;
                        fVar25.getClass();
                        int i25 = fVar25.f178613c;
                        vk1.f fVar26 = bVar.f44098a;
                        fVar26.getClass();
                        iA = g.a(i24, i25, fVar26.f178621k);
                    }
                    i15 = iA - 1;
                }
                if (i17 <= i15 || i17 >= i14) {
                    bVar.f44101d = false;
                } else {
                    bVar.f44101d = true;
                    vk1.f fVar27 = bVar.f44098a;
                    if (fVar27 != null) {
                        fVar27.f178623m = i17;
                    }
                    i14 = -99;
                    i15 = -99;
                }
            }
            if (bVar.f44101d) {
                vk1.f fVar28 = bVar.f44098a;
                fVar28.getClass();
                vk1.a.d(fVar28);
                bVar.C6();
                bVar.w6();
                return;
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            if (i15 == -99 || i14 == -99) {
                return;
            }
            bVar.A6(bVar.getString(R.string.lbl_error_title_wrong_number), bVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i15), String.valueOf(i14)));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/b$f", "Landroid/view/View$OnClickListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            b bVar = b.this;
            vk1.f fVar = bVar.f44098a;
            fVar.getClass();
            String string = bVar.getString(R.string.hr_zones_msg_reset_zones_confirm, vk1.c.f(fVar));
            string.getClass();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(bVar.requireContext());
            vk1.e eVar = bVar.f44099b;
            eVar.getClass();
            androidx.appcompat.app.e eVarCreate = aVar.setTitle(eVar.f178609e).setMessage(string).setPositiveButton(R.string.lbl_reset, new t(bVar, 4)).setNegativeButton(R.string.lbl_cancel, new k(27)).create();
            eVarCreate.getClass();
            if (bVar.getActivity() != null) {
                m activity = bVar.getActivity();
                activity.getClass();
                if (activity.isFinishing()) {
                    return;
                }
                eVarCreate.show();
            }
        }
    }

    public static final void u6(b bVar, int i14) {
        ArrayList<EditText> arrayList = bVar.f44119w;
        if (arrayList != null) {
            for (EditText editText : arrayList) {
                if (editText == null || editText.getId() != i14) {
                    if (editText != null) {
                        bVar.v6(editText, false);
                    }
                }
            }
        }
    }

    public static String y6(EditText editText) {
        editText.getClass();
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

    public final void A6(String str, String str2) {
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireContext()).setTitle(str).setMessage(str2).setPositiveButton(R.string.lbl_ok, new k(26)).create();
        eVarCreate.getClass();
        if (getActivity() == null || requireActivity().isFinishing()) {
            return;
        }
        eVarCreate.show();
    }

    public final void C6() {
        z6();
        w4 w4Var = this.f44122z;
        if (w4Var != null) {
            vk1.f fVar = this.f44098a;
            fVar.getClass();
            w4Var.k(fVar);
        }
        fb2.e<vk1.f> eVar = this.f44120x;
        if (eVar != null) {
            vk1.f fVar2 = this.f44098a;
            fVar2.getClass();
            eVar.k(fVar2);
        }
        j2 j2Var = this.f44121y;
        if (j2Var != null) {
            vk1.f fVar3 = this.f44098a;
            fVar3.getClass();
            j2Var.k(fVar3);
        }
        vk1.f fVar4 = this.f44098a;
        fVar4.getClass();
        j jVarG = vk1.c.g(fVar4);
        if (jVarG != null) {
            j2 j2Var2 = this.f44121y;
            if (j2Var2 != null) {
                j2Var2.m(jVarG == j.LACTATE_THRESHOLD);
            }
            fb2.e<vk1.f> eVar2 = this.f44120x;
            if (eVar2 != null) {
                eVar2.m(jVarG == j.HR_RESERVE);
            }
        }
        EditText editText = this.f44105h;
        if (editText != null) {
            vk1.f fVar5 = this.f44098a;
            fVar5.getClass();
            editText.setText(String.valueOf(fVar5.f178615e));
        }
        EditText editText2 = this.f44112n;
        if (editText2 != null) {
            vk1.f fVar6 = this.f44098a;
            fVar6.getClass();
            editText2.setText(String.valueOf(fVar6.f178623m));
        }
        EditText editText3 = this.f44106i;
        if (editText3 != null) {
            vk1.f fVar7 = this.f44098a;
            fVar7.getClass();
            editText3.setText(String.valueOf(fVar7.f178616f));
        }
        EditText editText4 = this.f44113o;
        if (editText4 != null) {
            vk1.f fVar8 = this.f44098a;
            fVar8.getClass();
            editText4.setText(String.valueOf(fVar8.f178624n));
        }
        EditText editText5 = this.f44107j;
        if (editText5 != null) {
            vk1.f fVar9 = this.f44098a;
            fVar9.getClass();
            editText5.setText(String.valueOf(fVar9.f178617g));
        }
        EditText editText6 = this.f44114p;
        if (editText6 != null) {
            vk1.f fVar10 = this.f44098a;
            fVar10.getClass();
            editText6.setText(String.valueOf(fVar10.f178625o));
        }
        EditText editText7 = this.f44108k;
        if (editText7 != null) {
            vk1.f fVar11 = this.f44098a;
            fVar11.getClass();
            editText7.setText(String.valueOf(fVar11.f178618h));
        }
        EditText editText8 = this.f44115q;
        if (editText8 != null) {
            vk1.f fVar12 = this.f44098a;
            fVar12.getClass();
            editText8.setText(String.valueOf(fVar12.f178626p));
        }
        EditText editText9 = this.f44110l;
        if (editText9 != null) {
            vk1.f fVar13 = this.f44098a;
            fVar13.getClass();
            editText9.setText(String.valueOf(fVar13.f178619i));
        }
        EditText editText10 = this.f44116r;
        if (editText10 != null) {
            vk1.f fVar14 = this.f44098a;
            fVar14.getClass();
            editText10.setText(String.valueOf(fVar14.f178627q));
        }
        EditText editText11 = this.f44111m;
        if (editText11 != null) {
            vk1.f fVar15 = this.f44098a;
            fVar15.getClass();
            editText11.setText(String.valueOf(fVar15.f178621k));
        }
        EditText editText12 = this.f44117t;
        if (editText12 != null) {
            vk1.f fVar16 = this.f44098a;
            fVar16.getClass();
            editText12.setText(String.valueOf(fVar16.f178628r));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Object serializableExtra;
        if (i14 == 100 && i15 == -1 && intent != null) {
            if ("android.intent.action.EDIT".equalsIgnoreCase(intent.getAction())) {
                j jVar = (j) intent.getSerializableExtra("CURRENT_TRAINING_METHOD_EXTRA");
                vk1.f fVar = this.f44098a;
                fVar.getClass();
                if (jVar != vk1.c.g(fVar)) {
                    vk1.f fVar2 = this.f44098a;
                    if (fVar2 != null) {
                        jVar.getClass();
                        fVar2.f178611a = jVar.name();
                    }
                    vk1.f fVar3 = this.f44098a;
                    if (fVar3 != null) {
                        fVar3.f178613c = 0;
                    }
                    if (fVar3 != null) {
                        fVar3.f178614d = 0;
                    }
                    if (fVar3 != null) {
                        fVar3.f178621k = vk1.c.h();
                    }
                    vk1.f fVar4 = this.f44098a;
                    fVar4.getClass();
                    vk1.c.i(fVar4);
                    C6();
                    if (jVar == j.HR_MAX) {
                        EditText editText = this.f44111m;
                        if (editText != null) {
                            editText.requestFocus();
                        }
                        TextView textView = this.F;
                        if (textView != null) {
                            textView.requestFocus();
                        }
                    }
                }
            }
        } else if (i14 == 200 && i15 == -1 && intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("HR_ZONE_MODE_EXTRA", RestingHeartRateActivity.b.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("HR_ZONE_MODE_EXTRA");
                if (!(serializableExtra2 instanceof RestingHeartRateActivity.b)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (RestingHeartRateActivity.b) serializableExtra2;
            }
            RestingHeartRateActivity.b bVar = (RestingHeartRateActivity.b) serializableExtra;
            int intExtra = intent.getIntExtra("RESTING_HEART_RATE_VALUE_EXTRA", 30);
            vk1.f fVar5 = this.f44098a;
            if (fVar5 != null) {
                fVar5.f178629t = bVar == RestingHeartRateActivity.b.AUTO;
            }
            fVar5.getClass();
            vk1.a.c(fVar5, intExtra);
            C6();
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("dto")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) arguments.getParcelable("dto", vk1.f.class);
                } else {
                    Parcelable parcelable2 = arguments.getParcelable("dto");
                    if (!(parcelable2 instanceof vk1.f)) {
                        parcelable2 = null;
                    }
                    parcelable = (vk1.f) parcelable2;
                }
                vk1.f fVar = (vk1.f) parcelable;
                this.f44098a = fVar;
                if (fVar != null) {
                    this.f44099b = vk1.c.d(fVar);
                    this.f44100c = arguments.getBoolean(Constants.ENABLE_DISABLE, true);
                }
            }
            if (arguments.containsKey("GCM_deviceProductNbr")) {
                this.A = arguments.getString("GCM_deviceProductNbr", null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_hr_zones_frag, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ArrayList<fb2.e> arrayList = this.f44118v;
        if (arrayList != null) {
            for (fb2.e eVar : arrayList) {
                eVar.getClass();
                eVar.n();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String strA;
        fb2.e<vk1.f> r3Var;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.T = (LinearLayout) view2.findViewById(R.id.training_method_container);
        View viewFindViewById = view2.findViewById(R.id.enable_disable_toggle_container);
        vk1.e eVar = vk1.e.DEFAULT;
        vk1.e eVar2 = this.f44099b;
        if (eVar == eVar2) {
            viewFindViewById.setVisibility(8);
        } else if (vk1.e.SWIMMING == eVar2 && ((u0) u0.f203782n6.get(this.A)) == u0.M5) {
            viewFindViewById.setVisibility(8);
            vk1.f fVar = this.f44098a;
            fVar.getClass();
            fVar.f178622l = true;
        } else {
            SwitchCompat switchCompat = (SwitchCompat) viewFindViewById.findViewById(R.id.switch_right);
            this.f44102e = switchCompat;
            if (switchCompat != null) {
                vk1.f fVar2 = this.f44098a;
                fVar2.getClass();
                switchCompat.setChecked(fVar2.f178622l);
            }
            SwitchCompat switchCompat2 = this.f44102e;
            if (switchCompat2 != null) {
                switchCompat2.setOnCheckedChangeListener(this.X);
            }
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.bottom_hint);
            this.I = textView;
            if (textView != null) {
                vk1.e eVar3 = this.f44099b;
                eVar3.getClass();
                textView.setText(eVar3.f178606b);
            }
            View viewFindViewById2 = viewFindViewById.findViewById(R.id.label_left);
            viewFindViewById2.getClass();
            TextView textView2 = (TextView) viewFindViewById2;
            vk1.e eVar4 = this.f44099b;
            eVar4.getClass();
            c3 c3Var = eVar4.f178605a;
            if (c3Var != null) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                strA = dh.b.A(contextRequireContext, c3Var);
            } else {
                strA = null;
            }
            textView2.setText(strA);
        }
        TextView textView3 = (TextView) view2.findViewById(R.id.bottom_note_text);
        if (!this.f44100c && textView3 != null) {
            textView3.setVisibility(0);
        }
        this.f44121y = new j2(getActivity());
        this.f44122z = new w4(getActivity());
        vk1.f fVar3 = this.f44098a;
        fVar3.getClass();
        if (fVar3.f178631w) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            r3Var = new s3(contextRequireContext2);
        } else {
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            r3Var = new r3(contextRequireContext3);
        }
        this.f44120x = r3Var;
        View viewFindViewById3 = view2.findViewById(R.id.three_column_container);
        this.f44103f = viewFindViewById3;
        TextView textView4 = viewFindViewById3 != null ? (TextView) viewFindViewById3.findViewById(R.id.zone1_label) : null;
        this.B = textView4;
        if (textView4 != null) {
            textView4.setText(getString(R.string.heart_rate_zone_name, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        }
        View view3 = this.f44103f;
        EditText editText = view3 != null ? (EditText) view3.findViewById(R.id.bpm1) : null;
        this.f44105h = editText;
        ViewOnFocusChangeListenerC0827b viewOnFocusChangeListenerC0827b = this.f44109k0;
        if (editText != null) {
            editText.setOnFocusChangeListener(viewOnFocusChangeListenerC0827b);
        }
        EditText editText2 = this.f44105h;
        bl0.a aVar = this.I0;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(aVar);
        }
        View view4 = this.f44103f;
        EditText editText3 = view4 != null ? (EditText) view4.findViewById(R.id.percent1) : null;
        this.f44112n = editText3;
        e eVar5 = this.H0;
        if (editText3 != null) {
            editText3.setOnFocusChangeListener(eVar5);
        }
        EditText editText4 = this.f44112n;
        if (editText4 != null) {
            editText4.setOnEditorActionListener(aVar);
        }
        v6(this.f44105h, this.f44100c);
        v6(this.f44112n, this.f44100c);
        View view5 = this.f44103f;
        TextView textView5 = view5 != null ? (TextView) view5.findViewById(R.id.zone2_label) : null;
        this.C = textView5;
        if (textView5 != null) {
            textView5.setText(getString(R.string.heart_rate_zone_name, "2"));
        }
        View view6 = this.f44103f;
        EditText editText5 = view6 != null ? (EditText) view6.findViewById(R.id.bpm2) : null;
        this.f44106i = editText5;
        if (editText5 != null) {
            editText5.setOnFocusChangeListener(viewOnFocusChangeListenerC0827b);
        }
        EditText editText6 = this.f44106i;
        if (editText6 != null) {
            editText6.setOnEditorActionListener(aVar);
        }
        View view7 = this.f44103f;
        EditText editText7 = view7 != null ? (EditText) view7.findViewById(R.id.percent2) : null;
        this.f44113o = editText7;
        if (editText7 != null) {
            editText7.setOnFocusChangeListener(eVar5);
        }
        EditText editText8 = this.f44113o;
        if (editText8 != null) {
            editText8.setOnEditorActionListener(aVar);
        }
        v6(this.f44106i, this.f44100c);
        v6(this.f44113o, this.f44100c);
        View view8 = this.f44103f;
        TextView textView6 = view8 != null ? (TextView) view8.findViewById(R.id.zone3_label) : null;
        this.D = textView6;
        if (textView6 != null) {
            textView6.setText(getString(R.string.heart_rate_zone_name, "3"));
        }
        View view9 = this.f44103f;
        EditText editText9 = view9 != null ? (EditText) view9.findViewById(R.id.bpm3) : null;
        this.f44107j = editText9;
        if (editText9 != null) {
            editText9.setOnFocusChangeListener(viewOnFocusChangeListenerC0827b);
        }
        EditText editText10 = this.f44107j;
        if (editText10 != null) {
            editText10.setOnEditorActionListener(aVar);
        }
        View view10 = this.f44103f;
        EditText editText11 = view10 != null ? (EditText) view10.findViewById(R.id.percent3) : null;
        this.f44114p = editText11;
        if (editText11 != null) {
            editText11.setOnFocusChangeListener(eVar5);
        }
        EditText editText12 = this.f44114p;
        if (editText12 != null) {
            editText12.setOnEditorActionListener(aVar);
        }
        v6(this.f44107j, this.f44100c);
        v6(this.f44114p, this.f44100c);
        View view11 = this.f44103f;
        TextView textView7 = view11 != null ? (TextView) view11.findViewById(R.id.zone4_label) : null;
        this.E = textView7;
        if (textView7 != null) {
            textView7.setText(getString(R.string.heart_rate_zone_name, "4"));
        }
        View view12 = this.f44103f;
        EditText editText13 = view12 != null ? (EditText) view12.findViewById(R.id.bpm4) : null;
        this.f44108k = editText13;
        if (editText13 != null) {
            editText13.setOnFocusChangeListener(viewOnFocusChangeListenerC0827b);
        }
        EditText editText14 = this.f44108k;
        if (editText14 != null) {
            editText14.setOnEditorActionListener(aVar);
        }
        View view13 = this.f44103f;
        EditText editText15 = view13 != null ? (EditText) view13.findViewById(R.id.percent4) : null;
        this.f44115q = editText15;
        if (editText15 != null) {
            editText15.setOnFocusChangeListener(eVar5);
        }
        EditText editText16 = this.f44115q;
        if (editText16 != null) {
            editText16.setOnEditorActionListener(aVar);
        }
        v6(this.f44108k, this.f44100c);
        v6(this.f44115q, this.f44100c);
        View view14 = this.f44103f;
        TextView textView8 = view14 != null ? (TextView) view14.findViewById(R.id.zone5_label) : null;
        this.F = textView8;
        if (textView8 != null) {
            textView8.setText(getString(R.string.heart_rate_zone_name, "5"));
        }
        View view15 = this.f44103f;
        EditText editText17 = view15 != null ? (EditText) view15.findViewById(R.id.bpm5) : null;
        this.f44110l = editText17;
        if (editText17 != null) {
            editText17.setOnFocusChangeListener(viewOnFocusChangeListenerC0827b);
        }
        EditText editText18 = this.f44110l;
        if (editText18 != null) {
            editText18.setOnEditorActionListener(aVar);
        }
        View view16 = this.f44103f;
        EditText editText19 = view16 != null ? (EditText) view16.findViewById(R.id.percent5) : null;
        this.f44116r = editText19;
        if (editText19 != null) {
            editText19.setOnFocusChangeListener(eVar5);
        }
        EditText editText20 = this.f44116r;
        if (editText20 != null) {
            editText20.setOnEditorActionListener(aVar);
        }
        v6(this.f44110l, this.f44100c);
        v6(this.f44116r, this.f44100c);
        View view17 = this.f44103f;
        EditText editText21 = view17 != null ? (EditText) view17.findViewById(R.id.max_hr) : null;
        this.f44111m = editText21;
        if (editText21 != null) {
            editText21.setOnFocusChangeListener(this.Z);
        }
        EditText editText22 = this.f44111m;
        if (editText22 != null) {
            editText22.setOnEditorActionListener(aVar);
        }
        v6(this.f44111m, this.f44100c);
        View view18 = this.f44103f;
        EditText editText23 = view18 != null ? (EditText) view18.findViewById(R.id.percent_total) : null;
        this.f44117t = editText23;
        v6(editText23, false);
        View viewFindViewById4 = view2.findViewById(R.id.reset_container);
        this.f44104g = viewFindViewById4;
        f fVar4 = this.Y;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(fVar4);
        }
        View view19 = this.f44104g;
        TextView textView9 = view19 != null ? (TextView) view19.findViewById(R.id.reset_text) : null;
        if (textView9 != null) {
            textView9.setOnClickListener(fVar4);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) view2.findViewById(R.id.additional_info_btn);
        this.P = gCMComplexOneLineButton;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setOnClickListener(new z0(this, 25));
        }
        EditText editText24 = this.f44105h;
        ArrayList arrayList = this.f44119w;
        arrayList.add(editText24);
        arrayList.add(this.f44106i);
        arrayList.add(this.f44107j);
        arrayList.add(this.f44108k);
        arrayList.add(this.f44110l);
        arrayList.add(this.f44111m);
        arrayList.add(this.f44112n);
        arrayList.add(this.f44113o);
        arrayList.add(this.f44114p);
        arrayList.add(this.f44115q);
        arrayList.add(this.f44116r);
        arrayList.add(this.f44117t);
        ArrayList<fb2.e> arrayList2 = this.f44118v;
        arrayList2.clear();
        w4 w4Var = this.f44122z;
        w4Var.getClass();
        arrayList2.add(w4Var);
        fb2.e<vk1.f> eVar6 = this.f44120x;
        eVar6.getClass();
        arrayList2.add(eVar6);
        j2 j2Var = this.f44121y;
        j2Var.getClass();
        arrayList2.add(j2Var);
        e22.a.a(arrayList2, new t0(this, 29));
        if (arrayList2 != null) {
            for (fb2.e eVar7 : arrayList2) {
                eVar7.getClass();
                LinearLayout linearLayout = this.T;
                if (linearLayout != null) {
                    linearLayout.addView(eVar7.a());
                }
            }
        }
        Context contextRequireContext4 = requireContext();
        contextRequireContext4.getClass();
        int iB = (int) c22.b.b(contextRequireContext4, getResources().getDimension(R.dimen.andfont_body_1), 1.3f);
        EditText editText25 = this.f44105h;
        editText25.getClass();
        float f14 = iB;
        editText25.setTextSize(0, f14);
        EditText editText26 = this.f44106i;
        editText26.getClass();
        editText26.setTextSize(0, f14);
        EditText editText27 = this.f44107j;
        editText27.getClass();
        editText27.setTextSize(0, f14);
        EditText editText28 = this.f44108k;
        editText28.getClass();
        editText28.setTextSize(0, f14);
        EditText editText29 = this.f44110l;
        editText29.getClass();
        editText29.setTextSize(0, f14);
        EditText editText30 = this.f44112n;
        editText30.getClass();
        editText30.setTextSize(0, f14);
        EditText editText31 = this.f44113o;
        editText31.getClass();
        editText31.setTextSize(0, f14);
        EditText editText32 = this.f44114p;
        editText32.getClass();
        editText32.setTextSize(0, f14);
        EditText editText33 = this.f44115q;
        editText33.getClass();
        editText33.setTextSize(0, f14);
        EditText editText34 = this.f44116r;
        editText34.getClass();
        editText34.setTextSize(0, f14);
        Context contextRequireContext5 = requireContext();
        contextRequireContext5.getClass();
        int iB2 = (int) c22.b.b(contextRequireContext5, getResources().getDimension(R.dimen.andfont_body_2), 1.3f);
        TextView textView10 = this.B;
        textView10.getClass();
        float f15 = iB2;
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
        TextView textView14 = this.F;
        textView14.getClass();
        textView14.setTextSize(0, f15);
        EditText editText35 = this.f44117t;
        editText35.getClass();
        editText35.setTextSize(0, f15);
        EditText editText36 = this.f44111m;
        editText36.getClass();
        editText36.setTextSize(0, f15);
        C6();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        if ((observable instanceof j2) || (observable instanceof r3)) {
            this.f44101d = true;
            w6();
            C6();
        } else {
            if (!(observable instanceof w4) || getActivity() == null) {
                if (observable instanceof s3) {
                    Intent intent = new Intent(getActivity(), (Class<?>) RestingHeartRateActivity.class);
                    intent.putExtra("HR_ZONE_EXTRA", this.f44098a);
                    startActivityForResult(intent, 200);
                    return;
                }
                return;
            }
            Intent intent2 = new Intent(getActivity(), (Class<?>) TrainingMethodActivity.class);
            vk1.f fVar = this.f44098a;
            fVar.getClass();
            intent2.putExtra("CURRENT_TRAINING_METHOD_EXTRA", vk1.c.g(fVar));
            intent2.putExtra("GCM_deviceProductNbr", this.A);
            startActivityForResult(intent2, 100);
        }
    }

    public final void v6(EditText editText, boolean z14) {
        if (editText != null) {
            editText.setEnabled(z14);
            editText.setClickable(z14);
            editText.setFocusable(z14);
            editText.setFocusableInTouchMode(z14);
            Context context = getContext();
            if (context != null) {
                editText.setTextColor(a7.b.getColor(context, z14 ? R.color.gcm_text_primary : R.color.gcm_text_primary_disabled));
                if (z14) {
                    editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                } else {
                    editText.setBackgroundColor(a7.b.getColor(context, android.R.color.transparent));
                }
            }
        }
    }

    public final void w6() {
        ArrayList<EditText> arrayList = this.f44119w;
        if (arrayList != null) {
            for (EditText editText : arrayList) {
                if (editText != null) {
                    v6(editText, this.f44100c);
                }
            }
        }
    }

    public final void z6() {
        vk1.f fVar = this.f44098a;
        fVar.getClass();
        boolean z14 = fVar.f178622l;
        TextView textView = this.I;
        if (!z14) {
            if (textView != null && textView != null) {
                textView.setVisibility(0);
            }
            View view2 = this.f44103f;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.f44104g;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            LinearLayout linearLayout = this.T;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (textView != null && textView != null) {
            textView.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.T;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        View view4 = this.f44103f;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.f44104g;
        if (view5 != null) {
            view5.setVisibility(0);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton = this.P;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setVisibility(0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "TRAINING_METHOD_REQUEST_CODE", "I", "RESTING_HR_REQUEST_CODE", "EXTRA_DTO", "EXTRA_ENABLED", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
