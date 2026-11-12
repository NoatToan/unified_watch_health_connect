package com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vg1.z0;
import vk1.f;
import vk1.g;
import vk1.i;
import vk1.j;
import vu1.k;
import xg1.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {
    public static final a I = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f44131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vk1.e f44132b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f44134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f44135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f44136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f44137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EditText f44138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f44139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f44140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EditText f44141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f44142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EditText f44143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EditText f44144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f44145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f44146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f44147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EditText f44148r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f44149t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f44150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f44151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f44152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f44153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f44154z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44133c = true;
    public final e A = new e();
    public final z0 B = new z0(this, 26);
    public final ViewOnFocusChangeListenerC0828c C = new ViewOnFocusChangeListenerC0828c();
    public final b D = new b();
    public final d E = new d();
    public final bl0.a F = new bl0.a(this, 15);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/c$b", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements View.OnFocusChangeListener {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44156a;

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
                f44156a = iArr;
            }
        }

        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            int i15;
            int i16;
            view2.getClass();
            EditText editText = (EditText) view2;
            c cVar = c.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                c.u6(cVar, editText.getId());
                return;
            }
            c.y6(cVar, editText);
            String strW6 = c.w6(cVar, editText);
            if (strW6.length() != 0) {
                try {
                    Integer.parseInt(strW6);
                    int i17 = Integer.parseInt(strW6);
                    EditText editText2 = cVar.f44137g;
                    if (editText2 == null || editText.getId() != editText2.getId()) {
                        EditText editText3 = cVar.f44138h;
                        if (editText3 == null || editText.getId() != editText3.getId()) {
                            EditText editText4 = cVar.f44139i;
                            if (editText4 == null || editText.getId() != editText4.getId()) {
                                int id3 = editText.getId();
                                EditText editText5 = cVar.f44140j;
                                editText5.getClass();
                                if (id3 == editText5.getId()) {
                                    f fVar = cVar.f44131a;
                                    fVar.getClass();
                                    if (i17 > fVar.f178617g) {
                                        f fVar2 = cVar.f44131a;
                                        fVar2.getClass();
                                        if (i17 < fVar2.f178619i) {
                                            cVar.f44133c = true;
                                            f fVar3 = cVar.f44131a;
                                            if (fVar3 != null) {
                                                fVar3.f178618h = i17;
                                            }
                                            i15 = -99;
                                            i14 = -99;
                                        }
                                    }
                                    cVar.f44133c = false;
                                    f fVar4 = cVar.f44131a;
                                    fVar4.getClass();
                                    i14 = fVar4.f178617g;
                                    f fVar5 = cVar.f44131a;
                                    fVar5.getClass();
                                    i15 = fVar5.f178619i;
                                } else {
                                    EditText editText6 = cVar.f44141k;
                                    if (editText6 == null || editText.getId() != editText6.getId()) {
                                        i15 = -99;
                                        i14 = -99;
                                    } else {
                                        f fVar6 = cVar.f44131a;
                                        fVar6.getClass();
                                        if (i17 > fVar6.f178618h) {
                                            f fVar7 = cVar.f44131a;
                                            fVar7.getClass();
                                            if (i17 < fVar7.f178621k) {
                                                cVar.f44133c = true;
                                                f fVar8 = cVar.f44131a;
                                                if (fVar8 != null) {
                                                    fVar8.f178619i = i17;
                                                }
                                                i15 = -99;
                                                i14 = -99;
                                            }
                                        }
                                        cVar.f44133c = false;
                                        f fVar9 = cVar.f44131a;
                                        fVar9.getClass();
                                        i14 = fVar9.f178618h;
                                        f fVar10 = cVar.f44131a;
                                        fVar10.getClass();
                                        i15 = fVar10.f178621k;
                                    }
                                }
                            } else {
                                f fVar11 = cVar.f44131a;
                                fVar11.getClass();
                                if (i17 > fVar11.f178616f) {
                                    f fVar12 = cVar.f44131a;
                                    fVar12.getClass();
                                    if (i17 < fVar12.f178618h) {
                                        cVar.f44133c = true;
                                        f fVar13 = cVar.f44131a;
                                        if (fVar13 != null) {
                                            fVar13.f178617g = i17;
                                        }
                                        i15 = -99;
                                        i14 = -99;
                                    }
                                }
                                cVar.f44133c = false;
                                f fVar14 = cVar.f44131a;
                                fVar14.getClass();
                                i14 = fVar14.f178616f;
                                f fVar15 = cVar.f44131a;
                                fVar15.getClass();
                                i15 = fVar15.f178618h;
                            }
                        } else {
                            f fVar16 = cVar.f44131a;
                            fVar16.getClass();
                            if (i17 > fVar16.f178615e) {
                                f fVar17 = cVar.f44131a;
                                fVar17.getClass();
                                if (i17 < fVar17.f178617g) {
                                    cVar.f44133c = true;
                                    f fVar18 = cVar.f44131a;
                                    if (fVar18 != null) {
                                        fVar18.f178616f = i17;
                                    }
                                    i15 = -99;
                                    i14 = -99;
                                }
                            }
                            cVar.f44133c = false;
                            f fVar19 = cVar.f44131a;
                            fVar19.getClass();
                            i14 = fVar19.f178615e;
                            f fVar20 = cVar.f44131a;
                            fVar20.getClass();
                            i15 = fVar20.f178617g;
                        }
                    } else {
                        f fVar21 = cVar.f44131a;
                        fVar21.getClass();
                        j jVarG = vk1.c.g(fVar21);
                        int i18 = jVarG == null ? -1 : a.f44156a[jVarG.ordinal()];
                        if (i18 == 1) {
                            i16 = 30;
                        } else if (i18 != 2) {
                            i16 = i18 != 3 ? 0 : 46;
                        } else {
                            f fVar22 = cVar.f44131a;
                            fVar22.getClass();
                            i16 = fVar22.f178613c + 1;
                        }
                        if (i17 >= i16) {
                            f fVar23 = cVar.f44131a;
                            fVar23.getClass();
                            if (i17 < fVar23.f178616f) {
                                cVar.f44133c = true;
                                f fVar24 = cVar.f44131a;
                                if (fVar24 != null) {
                                    fVar24.f178615e = i17;
                                }
                                i15 = -99;
                                i14 = -99;
                            }
                        }
                        cVar.f44133c = false;
                        i14 = i16 - 1;
                        f fVar25 = cVar.f44131a;
                        fVar25.getClass();
                        i15 = fVar25.f178616f;
                    }
                    if (cVar.f44133c) {
                        f fVar26 = cVar.f44131a;
                        fVar26.getClass();
                        vk1.a.e(fVar26);
                        cVar.E6();
                        c.v6(cVar);
                        return;
                    }
                    editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                    if (i14 == -99 || i15 == -99) {
                        return;
                    }
                    String string = cVar.getString(R.string.lbl_error_title_wrong_number);
                    string.getClass();
                    String string2 = cVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i14), String.valueOf(i15));
                    string2.getClass();
                    c.z6(cVar, string, string2);
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            cVar.f44133c = false;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/c$c", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ViewOnFocusChangeListenerC0828c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.c$c$a */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44158a;

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
                f44158a = iArr;
            }
        }

        public ViewOnFocusChangeListenerC0828c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            view2.getClass();
            EditText editText = (EditText) view2;
            c cVar = c.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                c.u6(cVar, editText.getId());
                return;
            }
            c.y6(cVar, editText);
            String strW6 = c.w6(cVar, editText);
            if (strW6.length() != 0) {
                try {
                    Integer.parseInt(strW6);
                    int i15 = Integer.parseInt(strW6);
                    f fVar = cVar.f44131a;
                    fVar.getClass();
                    j jVarG = vk1.c.g(fVar);
                    int i16 = jVarG == null ? -1 : a.f44158a[jVarG.ordinal()];
                    if (i16 == 1) {
                        i14 = 35;
                    } else if (i16 == 2) {
                        f fVar2 = cVar.f44131a;
                        fVar2.getClass();
                        i14 = fVar2.f178619i + 1;
                    } else if (i16 != 3) {
                        i14 = 0;
                    } else {
                        f fVar3 = cVar.f44131a;
                        fVar3.getClass();
                        i14 = fVar3.f178613c + 6;
                    }
                    if (i15 < i14 || i15 > 250) {
                        editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                        cVar.f44133c = false;
                        String string = cVar.getString(R.string.lbl_error_title_wrong_number);
                        string.getClass();
                        String string2 = cVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i14 - 1), "251");
                        string2.getClass();
                        c.z6(cVar, string, string2);
                        return;
                    }
                    cVar.f44133c = true;
                    editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                    c.v6(cVar);
                    f fVar4 = cVar.f44131a;
                    fVar4.getClass();
                    vk1.a.b(fVar4, i15);
                    cVar.E6();
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            cVar.f44133c = false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/c$d", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements View.OnFocusChangeListener {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44160a;

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
                f44160a = iArr;
            }
        }

        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            int i15;
            int iA;
            view2.getClass();
            EditText editText = (EditText) view2;
            c cVar = c.this;
            if (z14) {
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                c.u6(cVar, editText.getId());
                return;
            }
            c.y6(cVar, editText);
            String strW6 = c.w6(cVar, editText);
            if (strW6.length() != 0) {
                try {
                    Integer.parseInt(strW6);
                    int i16 = Integer.parseInt(strW6);
                    EditText editText2 = cVar.f44143m;
                    if (editText2 == null || editText.getId() != editText2.getId()) {
                        EditText editText3 = cVar.f44144n;
                        if (editText3 == null || editText.getId() != editText3.getId()) {
                            EditText editText4 = cVar.f44145o;
                            if (editText4 == null || editText.getId() != editText4.getId()) {
                                EditText editText5 = cVar.f44146p;
                                if (editText5 == null || editText.getId() != editText5.getId()) {
                                    EditText editText6 = cVar.f44147q;
                                    if (editText6 == null || editText.getId() != editText6.getId()) {
                                        i14 = -99;
                                        i15 = -99;
                                    } else {
                                        f fVar = cVar.f44131a;
                                        fVar.getClass();
                                        j jVarG = vk1.c.g(fVar);
                                        int i17 = jVarG != null ? a.f44160a[jVarG.ordinal()] : -1;
                                        i14 = 100;
                                        if (i17 != 1 && i17 != 2 && i17 == 3) {
                                            f fVar2 = cVar.f44131a;
                                            fVar2.getClass();
                                            i14 = fVar2.f178628r;
                                        }
                                        f fVar3 = cVar.f44131a;
                                        fVar3.getClass();
                                        if (i16 <= fVar3.f178626p || i16 >= i14) {
                                            cVar.f44133c = false;
                                            f fVar4 = cVar.f44131a;
                                            fVar4.getClass();
                                            i15 = fVar4.f178626p;
                                        } else {
                                            cVar.f44133c = true;
                                            f fVar5 = cVar.f44131a;
                                            if (fVar5 != null) {
                                                fVar5.f178627q = i16;
                                            }
                                            i14 = -99;
                                            i15 = -99;
                                        }
                                    }
                                } else {
                                    f fVar6 = cVar.f44131a;
                                    fVar6.getClass();
                                    if (i16 > fVar6.f178625o) {
                                        f fVar7 = cVar.f44131a;
                                        fVar7.getClass();
                                        if (i16 < fVar7.f178627q) {
                                            cVar.f44133c = true;
                                            f fVar8 = cVar.f44131a;
                                            if (fVar8 != null) {
                                                fVar8.f178626p = i16;
                                            }
                                            i14 = -99;
                                            i15 = -99;
                                        }
                                    }
                                    cVar.f44133c = false;
                                    f fVar9 = cVar.f44131a;
                                    fVar9.getClass();
                                    i15 = fVar9.f178625o;
                                    f fVar10 = cVar.f44131a;
                                    fVar10.getClass();
                                    i14 = fVar10.f178627q;
                                }
                            } else {
                                f fVar11 = cVar.f44131a;
                                fVar11.getClass();
                                if (i16 > fVar11.f178624n) {
                                    f fVar12 = cVar.f44131a;
                                    fVar12.getClass();
                                    if (i16 < fVar12.f178626p) {
                                        cVar.f44133c = true;
                                        f fVar13 = cVar.f44131a;
                                        if (fVar13 != null) {
                                            fVar13.f178625o = i16;
                                        }
                                        i14 = -99;
                                        i15 = -99;
                                    }
                                }
                                cVar.f44133c = false;
                                f fVar14 = cVar.f44131a;
                                fVar14.getClass();
                                i15 = fVar14.f178624n;
                                f fVar15 = cVar.f44131a;
                                fVar15.getClass();
                                i14 = fVar15.f178626p;
                            }
                        } else {
                            f fVar16 = cVar.f44131a;
                            fVar16.getClass();
                            if (i16 > fVar16.f178623m) {
                                f fVar17 = cVar.f44131a;
                                fVar17.getClass();
                                if (i16 < fVar17.f178625o) {
                                    cVar.f44133c = true;
                                    f fVar18 = cVar.f44131a;
                                    if (fVar18 != null) {
                                        fVar18.f178624n = i16;
                                    }
                                    i14 = -99;
                                    i15 = -99;
                                }
                            }
                            cVar.f44133c = false;
                            f fVar19 = cVar.f44131a;
                            fVar19.getClass();
                            i15 = fVar19.f178623m;
                            f fVar20 = cVar.f44131a;
                            fVar20.getClass();
                            i14 = fVar20.f178625o;
                        }
                    } else {
                        f fVar21 = cVar.f44131a;
                        fVar21.getClass();
                        i14 = fVar21.f178624n;
                        f fVar22 = cVar.f44131a;
                        fVar22.getClass();
                        j jVarG2 = vk1.c.g(fVar22);
                        int i18 = jVarG2 == null ? -1 : a.f44160a[jVarG2.ordinal()];
                        if (i18 != 1) {
                            if (i18 != 2) {
                                i15 = 0;
                            } else {
                                f fVar23 = cVar.f44131a;
                                fVar23.getClass();
                                int i19 = fVar23.f178613c;
                                f fVar24 = cVar.f44131a;
                                fVar24.getClass();
                                int i24 = fVar24.f178613c;
                                f fVar25 = cVar.f44131a;
                                fVar25.getClass();
                                iA = g.a(i19, i24, fVar25.f178621k);
                            }
                            if (i16 > i15 || i16 >= i14) {
                                cVar.f44133c = false;
                            } else {
                                cVar.f44133c = true;
                                f fVar26 = cVar.f44131a;
                                if (fVar26 != null) {
                                    fVar26.f178623m = i16;
                                }
                                i14 = -99;
                                i15 = -99;
                            }
                        } else {
                            f fVar27 = cVar.f44131a;
                            fVar27.getClass();
                            iA = i.a(30, fVar27.f178621k);
                        }
                        i15 = iA - 1;
                        if (i16 > i15) {
                        }
                        cVar.f44133c = false;
                    }
                    if (cVar.f44133c) {
                        f fVar28 = cVar.f44131a;
                        fVar28.getClass();
                        vk1.a.d(fVar28);
                        cVar.E6();
                        c.v6(cVar);
                        return;
                    }
                    editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                    if (i15 == -99 || i14 == -99) {
                        return;
                    }
                    String string = cVar.getString(R.string.lbl_error_title_wrong_number);
                    string.getClass();
                    String string2 = cVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i15), String.valueOf(i14));
                    string2.getClass();
                    c.z6(cVar, string, string2);
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            cVar.f44133c = false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/c$e", "Landroid/view/View$OnClickListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            c cVar = c.this;
            f fVar = cVar.f44131a;
            fVar.getClass();
            String string = cVar.getString(R.string.hr_zones_msg_reset_zones_confirm, vk1.c.f(fVar));
            string.getClass();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(cVar.requireContext());
            vk1.e eVar = cVar.f44132b;
            eVar.getClass();
            androidx.appcompat.app.e eVarCreate = aVar.setTitle(eVar.f178609e).setMessage(string).setPositiveButton(R.string.lbl_reset, new l(cVar, 6)).setNegativeButton(R.string.lbl_cancel, new k(29)).create();
            eVarCreate.getClass();
            if (cVar.getActivity() != null) {
                m activity = cVar.getActivity();
                activity.getClass();
                if (activity.isFinishing()) {
                    return;
                }
                eVarCreate.show();
            }
        }
    }

    public static void C6(TextView textView, int i14) {
        if (textView != null) {
            textView.setTextSize(0, i14);
        }
    }

    public static final void u6(c cVar, int i14) {
        EditText editText = cVar.f44137g;
        if (editText == null || editText.getId() != i14) {
            EditText editText2 = cVar.f44137g;
            editText2.getClass();
            cVar.A6(editText2, false);
        }
        EditText editText3 = cVar.f44138h;
        if (editText3 == null || editText3.getId() != i14) {
            EditText editText4 = cVar.f44138h;
            editText4.getClass();
            cVar.A6(editText4, false);
        }
        EditText editText5 = cVar.f44139i;
        if (editText5 == null || editText5.getId() != i14) {
            EditText editText6 = cVar.f44139i;
            editText6.getClass();
            cVar.A6(editText6, false);
        }
        EditText editText7 = cVar.f44140j;
        if (editText7 == null || editText7.getId() != i14) {
            EditText editText8 = cVar.f44140j;
            editText8.getClass();
            cVar.A6(editText8, false);
        }
        EditText editText9 = cVar.f44141k;
        if (editText9 == null || editText9.getId() != i14) {
            EditText editText10 = cVar.f44141k;
            editText10.getClass();
            cVar.A6(editText10, false);
        }
        EditText editText11 = cVar.f44143m;
        if (editText11 == null || editText11.getId() != i14) {
            EditText editText12 = cVar.f44143m;
            editText12.getClass();
            cVar.A6(editText12, false);
        }
        EditText editText13 = cVar.f44144n;
        if (editText13 == null || editText13.getId() != i14) {
            EditText editText14 = cVar.f44144n;
            editText14.getClass();
            cVar.A6(editText14, false);
        }
        EditText editText15 = cVar.f44145o;
        if (editText15 == null || editText15.getId() != i14) {
            EditText editText16 = cVar.f44145o;
            editText16.getClass();
            cVar.A6(editText16, false);
        }
        EditText editText17 = cVar.f44146p;
        if (editText17 == null || editText17.getId() != i14) {
            EditText editText18 = cVar.f44146p;
            editText18.getClass();
            cVar.A6(editText18, false);
        }
        EditText editText19 = cVar.f44147q;
        if (editText19 == null || editText19.getId() != i14) {
            EditText editText20 = cVar.f44147q;
            editText20.getClass();
            cVar.A6(editText20, false);
        }
        EditText editText21 = cVar.f44142l;
        if (editText21 == null || editText21.getId() != i14) {
            EditText editText22 = cVar.f44142l;
            editText22.getClass();
            cVar.A6(editText22, false);
        }
    }

    public static final void v6(c cVar) {
        EditText editText = cVar.f44137g;
        editText.getClass();
        cVar.A6(editText, true);
        EditText editText2 = cVar.f44138h;
        editText2.getClass();
        cVar.A6(editText2, true);
        EditText editText3 = cVar.f44139i;
        editText3.getClass();
        cVar.A6(editText3, true);
        EditText editText4 = cVar.f44140j;
        editText4.getClass();
        cVar.A6(editText4, true);
        EditText editText5 = cVar.f44141k;
        editText5.getClass();
        cVar.A6(editText5, true);
        EditText editText6 = cVar.f44143m;
        editText6.getClass();
        cVar.A6(editText6, true);
        EditText editText7 = cVar.f44144n;
        editText7.getClass();
        cVar.A6(editText7, true);
        EditText editText8 = cVar.f44145o;
        editText8.getClass();
        cVar.A6(editText8, true);
        EditText editText9 = cVar.f44146p;
        editText9.getClass();
        cVar.A6(editText9, true);
        EditText editText10 = cVar.f44147q;
        editText10.getClass();
        cVar.A6(editText10, true);
        EditText editText11 = cVar.f44142l;
        editText11.getClass();
        cVar.A6(editText11, true);
    }

    public static final String w6(c cVar, EditText editText) {
        cVar.getClass();
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

    public static final void y6(c cVar, EditText editText) {
        Object systemService = cVar.requireActivity().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static final void z6(c cVar, String str, String str2) {
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(cVar.requireContext()).setTitle(str).setMessage(str2).setPositiveButton(R.string.lbl_ok, new k(28)).create();
        eVarCreate.getClass();
        if (cVar.getActivity() == null || cVar.requireActivity().isFinishing()) {
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

    public final void E6() {
        f fVar = this.f44131a;
        fVar.getClass();
        boolean z14 = fVar.f178622l;
        View view2 = this.f44134d;
        if (z14) {
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f44135e;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.f44136f;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        } else {
            if (view2 != null) {
                view2.setVisibility(4);
            }
            View view5 = this.f44135e;
            if (view5 != null) {
                view5.setVisibility(4);
            }
            View view6 = this.f44136f;
            if (view6 != null) {
                view6.setVisibility(4);
            }
        }
        EditText editText = this.f44137g;
        if (editText != null) {
            f fVar2 = this.f44131a;
            fVar2.getClass();
            editText.setText(String.valueOf(fVar2.f178615e));
        }
        EditText editText2 = this.f44143m;
        if (editText2 != null) {
            f fVar3 = this.f44131a;
            fVar3.getClass();
            editText2.setText(String.valueOf(fVar3.f178623m));
        }
        EditText editText3 = this.f44138h;
        if (editText3 != null) {
            f fVar4 = this.f44131a;
            fVar4.getClass();
            editText3.setText(String.valueOf(fVar4.f178616f));
        }
        EditText editText4 = this.f44144n;
        if (editText4 != null) {
            f fVar5 = this.f44131a;
            fVar5.getClass();
            editText4.setText(String.valueOf(fVar5.f178624n));
        }
        EditText editText5 = this.f44139i;
        if (editText5 != null) {
            f fVar6 = this.f44131a;
            fVar6.getClass();
            editText5.setText(String.valueOf(fVar6.f178617g));
        }
        EditText editText6 = this.f44145o;
        if (editText6 != null) {
            f fVar7 = this.f44131a;
            fVar7.getClass();
            editText6.setText(String.valueOf(fVar7.f178625o));
        }
        EditText editText7 = this.f44140j;
        if (editText7 != null) {
            f fVar8 = this.f44131a;
            fVar8.getClass();
            editText7.setText(String.valueOf(fVar8.f178618h));
        }
        EditText editText8 = this.f44146p;
        if (editText8 != null) {
            f fVar9 = this.f44131a;
            fVar9.getClass();
            editText8.setText(String.valueOf(fVar9.f178626p));
        }
        EditText editText9 = this.f44141k;
        if (editText9 != null) {
            f fVar10 = this.f44131a;
            fVar10.getClass();
            editText9.setText(String.valueOf(fVar10.f178619i));
        }
        EditText editText10 = this.f44147q;
        if (editText10 != null) {
            f fVar11 = this.f44131a;
            fVar11.getClass();
            editText10.setText(String.valueOf(fVar11.f178627q));
        }
        EditText editText11 = this.f44142l;
        if (editText11 != null) {
            f fVar12 = this.f44131a;
            fVar12.getClass();
            editText11.setText(String.valueOf(fVar12.f178621k));
        }
        EditText editText12 = this.f44148r;
        if (editText12 != null) {
            f fVar13 = this.f44131a;
            fVar13.getClass();
            editText12.setText(String.valueOf(fVar13.f178628r));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("dto") : null;
            parcelable = (f) (parcelable2 instanceof f ? parcelable2 : null);
        } else if (bundleRequireArguments != null) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("dto", f.class);
        }
        f fVar = (f) parcelable;
        this.f44131a = fVar;
        fVar.getClass();
        this.f44132b = vk1.c.d(fVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_vivosmart3_hr_zones_frag, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.three_column_container);
        this.f44134d = viewFindViewById;
        TextView textView = (TextView) (viewFindViewById != null ? viewFindViewById.findViewById(R.id.zone1_label) : null);
        this.f44149t = textView;
        if (textView != null) {
            textView.setText(getString(R.string.heart_rate_zone_name, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        }
        View view3 = this.f44134d;
        EditText editText = (EditText) (view3 != null ? view3.findViewById(R.id.bpm1) : null);
        this.f44137g = editText;
        b bVar = this.D;
        if (editText != null) {
            editText.setOnFocusChangeListener(bVar);
        }
        EditText editText2 = this.f44137g;
        bl0.a aVar = this.F;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(aVar);
        }
        View view4 = this.f44134d;
        EditText editText3 = (EditText) (view4 != null ? view4.findViewById(R.id.percent1) : null);
        this.f44143m = editText3;
        d dVar = this.E;
        if (editText3 != null) {
            editText3.setOnFocusChangeListener(dVar);
        }
        EditText editText4 = this.f44143m;
        if (editText4 != null) {
            editText4.setOnEditorActionListener(aVar);
        }
        View view5 = this.f44134d;
        TextView textView2 = (TextView) (view5 != null ? view5.findViewById(R.id.zone2_label) : null);
        this.f44150v = textView2;
        if (textView2 != null) {
            textView2.setText(getString(R.string.heart_rate_zone_name, "2"));
        }
        View view6 = this.f44134d;
        EditText editText5 = (EditText) (view6 != null ? view6.findViewById(R.id.bpm2) : null);
        this.f44138h = editText5;
        if (editText5 != null) {
            editText5.setOnFocusChangeListener(bVar);
        }
        EditText editText6 = this.f44138h;
        if (editText6 != null) {
            editText6.setOnEditorActionListener(aVar);
        }
        View view7 = this.f44134d;
        EditText editText7 = (EditText) (view7 != null ? view7.findViewById(R.id.percent2) : null);
        this.f44144n = editText7;
        if (editText7 != null) {
            editText7.setOnFocusChangeListener(dVar);
        }
        EditText editText8 = this.f44144n;
        if (editText8 != null) {
            editText8.setOnEditorActionListener(aVar);
        }
        View view8 = this.f44134d;
        TextView textView3 = (TextView) (view8 != null ? view8.findViewById(R.id.zone3_label) : null);
        this.f44151w = textView3;
        if (textView3 != null) {
            textView3.setText(getString(R.string.heart_rate_zone_name, "3"));
        }
        View view9 = this.f44134d;
        EditText editText9 = (EditText) (view9 != null ? view9.findViewById(R.id.bpm3) : null);
        this.f44139i = editText9;
        if (editText9 != null) {
            editText9.setOnFocusChangeListener(bVar);
        }
        EditText editText10 = this.f44139i;
        if (editText10 != null) {
            editText10.setOnEditorActionListener(aVar);
        }
        View view10 = this.f44134d;
        EditText editText11 = (EditText) (view10 != null ? view10.findViewById(R.id.percent3) : null);
        this.f44145o = editText11;
        if (editText11 != null) {
            editText11.setOnFocusChangeListener(dVar);
        }
        EditText editText12 = this.f44145o;
        if (editText12 != null) {
            editText12.setOnEditorActionListener(aVar);
        }
        View view11 = this.f44134d;
        TextView textView4 = (TextView) (view11 != null ? view11.findViewById(R.id.zone4_label) : null);
        this.f44152x = textView4;
        if (textView4 != null) {
            textView4.setText(getString(R.string.heart_rate_zone_name, "4"));
        }
        View view12 = this.f44134d;
        EditText editText13 = (EditText) (view12 != null ? view12.findViewById(R.id.bpm4) : null);
        this.f44140j = editText13;
        if (editText13 != null) {
            editText13.setOnFocusChangeListener(bVar);
        }
        EditText editText14 = this.f44140j;
        if (editText14 != null) {
            editText14.setOnEditorActionListener(aVar);
        }
        View view13 = this.f44134d;
        EditText editText15 = (EditText) (view13 != null ? view13.findViewById(R.id.percent4) : null);
        this.f44146p = editText15;
        if (editText15 != null) {
            editText15.setOnFocusChangeListener(dVar);
        }
        EditText editText16 = this.f44146p;
        if (editText16 != null) {
            editText16.setOnEditorActionListener(aVar);
        }
        View view14 = this.f44134d;
        TextView textView5 = (TextView) (view14 != null ? view14.findViewById(R.id.zone5_label) : null);
        this.f44153y = textView5;
        if (textView5 != null) {
            textView5.setText(getString(R.string.heart_rate_zone_name, "5"));
        }
        View view15 = this.f44134d;
        EditText editText17 = (EditText) (view15 != null ? view15.findViewById(R.id.bpm5) : null);
        this.f44141k = editText17;
        if (editText17 != null) {
            editText17.setOnFocusChangeListener(bVar);
        }
        EditText editText18 = this.f44141k;
        if (editText18 != null) {
            editText18.setOnEditorActionListener(aVar);
        }
        View view16 = this.f44134d;
        EditText editText19 = (EditText) (view16 != null ? view16.findViewById(R.id.percent5) : null);
        this.f44147q = editText19;
        if (editText19 != null) {
            editText19.setOnFocusChangeListener(dVar);
        }
        EditText editText20 = this.f44147q;
        if (editText20 != null) {
            editText20.setOnEditorActionListener(aVar);
        }
        View view17 = this.f44134d;
        this.f44154z = (TextView) (view17 != null ? view17.findViewById(R.id.max_hr_label) : null);
        View view18 = this.f44134d;
        EditText editText21 = (EditText) (view18 != null ? view18.findViewById(R.id.max_hr) : null);
        this.f44142l = editText21;
        if (editText21 != null) {
            editText21.setOnFocusChangeListener(this.C);
        }
        EditText editText22 = this.f44142l;
        if (editText22 != null) {
            editText22.setOnEditorActionListener(aVar);
        }
        View view19 = this.f44134d;
        EditText editText23 = (EditText) (view19 != null ? view19.findViewById(R.id.percent_total) : null);
        this.f44148r = editText23;
        if (editText23 != null) {
            editText23.setEnabled(false);
        }
        EditText editText24 = this.f44148r;
        if (editText24 != null) {
            editText24.setFocusable(false);
        }
        EditText editText25 = this.f44148r;
        if (editText25 != null) {
            editText25.setFocusableInTouchMode(false);
        }
        EditText editText26 = this.f44148r;
        if (editText26 != null) {
            editText26.setBackgroundColor(requireContext().getColor(android.R.color.transparent));
        }
        EditText editText27 = this.f44148r;
        if (editText27 != null) {
            editText27.setTextColor(requireContext().getColor(R.color.gcm_text_secondary));
        }
        View viewFindViewById2 = view2.findViewById(R.id.reset_container);
        this.f44135e = viewFindViewById2;
        e eVar = this.A;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(eVar);
        }
        View view20 = this.f44135e;
        TextView textView6 = (TextView) (view20 != null ? view20.findViewById(R.id.reset_text) : null);
        if (textView6 != null) {
            textView6.setOnClickListener(eVar);
        }
        View viewFindViewById3 = view2.findViewById(R.id.additional_info_container);
        this.f44136f = viewFindViewById3;
        View view21 = this.f44136f;
        if (view21 != null) {
            view21.setOnClickListener(this.B);
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        int iB = (int) c22.b.b(contextRequireContext, getResources().getDimension(R.dimen.andfont_body_1), 1.3f);
        C6(this.f44137g, iB);
        C6(this.f44138h, iB);
        C6(this.f44139i, iB);
        C6(this.f44140j, iB);
        C6(this.f44141k, iB);
        C6(this.f44142l, iB);
        C6(this.f44143m, iB);
        C6(this.f44144n, iB);
        C6(this.f44145o, iB);
        C6(this.f44146p, iB);
        C6(this.f44147q, iB);
        C6(this.f44148r, iB);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        int iB2 = (int) c22.b.b(contextRequireContext2, getResources().getDimension(R.dimen.andfont_body_2), 1.3f);
        C6(this.f44149t, iB2);
        C6(this.f44150v, iB2);
        C6(this.f44151w, iB2);
        C6(this.f44152x, iB2);
        C6(this.f44153y, iB2);
        C6(this.f44154z, iB2);
        E6();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/heartratezones/ui/c$a;", "", "<init>", "()V", "", "EXTRA_DTO", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
