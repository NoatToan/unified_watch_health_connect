package xk1;

import android.annotation.SuppressLint;
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
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMLeftSquareBracketView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxk1/j;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class j extends Fragment {
    public static final a M0 = new a(null);
    public EditText A;
    public EditText B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView I;
    public TextView P;
    public TextView T;
    public TextView X;
    public TextView Y;
    public TextView Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerZonesDTO f191230a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f191232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f191233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f191234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f191235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f191236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMLeftSquareBracketView f191237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMLeftSquareBracketView f191238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f191239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EditText f191240k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f191241k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f191242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EditText f191243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EditText f191244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f191245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f191246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f191247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EditText f191248r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f191249t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EditText f191250v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EditText f191251w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EditText f191252x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EditText f191253y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EditText f191254z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f191231b = true;
    public final b H0 = new b();
    public final e I0 = new e();
    public final c J0 = new c();
    public final bl0.a K0 = new bl0.a(this, 13);
    public final d L0 = new d();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xk1/j$b", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            view2.getClass();
            EditText editText = (EditText) view2;
            j jVar = j.this;
            if (z14) {
                jVar.getClass();
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                j.u6(jVar, editText.getId());
                return;
            }
            j.y6(jVar, editText);
            String strW6 = j.w6(jVar, editText);
            if (strW6.length() == 0) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                jVar.f191231b = false;
                return;
            }
            if (strW6.equalsIgnoreCase("0")) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                jVar.f191231b = false;
                String string = jVar.getString(R.string.device_settings_functional_threshold_power);
                string.getClass();
                String string2 = jVar.getString(R.string.hr_zones_msg_enter_lactate_threshold, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "999");
                string2.getClass();
                j.z6(jVar, string, string2);
                return;
            }
            try {
                Integer.parseInt(strW6);
                int i15 = Integer.parseInt(strW6);
                if (jVar.f191234e) {
                    EditText editText2 = jVar.f191254z;
                    editText2.getClass();
                    i14 = Integer.parseInt(d53.w.O(editText2.getText().toString(), ">"));
                } else {
                    EditText editText3 = jVar.A;
                    editText3.getClass();
                    i14 = Integer.parseInt(editText3.getText().toString());
                }
                EditText editText4 = jVar.f191249t;
                editText4.getClass();
                int iMax = (int) (Math.max(1.0d, (int) Math.round(100.0d / ((double) Integer.parseInt(editText4.getText().toString())))) + ((double) 1));
                int iMin = (int) Math.min(1999.0d, 2000 - (100 / i14));
                if (i15 < 1 || i15 > 999 || i15 < iMax || i15 > iMin) {
                    editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                    jVar.f191231b = false;
                    String string3 = jVar.getString(R.string.lbl_error_title_wrong_number);
                    string3.getClass();
                    String string4 = jVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(iMax - 1), "999");
                    string4.getClass();
                    j.z6(jVar, string3, string4);
                    return;
                }
                jVar.f191231b = true;
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                j.v6(jVar);
                PowerZonesDTO powerZonesDTO = jVar.f191230a;
                powerZonesDTO.getClass();
                ok1.a aVar = ok1.a.f132581a;
                powerZonesDTO.f43987b = i15;
                ok1.a.d(powerZonesDTO);
                jVar.C6();
                jVar.f191232c = true;
            } catch (NumberFormatException unused) {
                editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                jVar.f191231b = false;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xk1/j$c", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int iA;
            view2.getClass();
            EditText editText = (EditText) view2;
            j jVar = j.this;
            if (z14) {
                jVar.getClass();
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                j.u6(jVar, editText.getId());
                return;
            }
            j.y6(jVar, editText);
            String strW6 = j.w6(jVar, editText);
            int i14 = 0;
            if (strW6.length() != 0) {
                try {
                    Integer.parseInt(strW6);
                    int i15 = Integer.parseInt(strW6);
                    EditText editText2 = jVar.f191249t;
                    if (editText2 == null || editText.getId() != editText2.getId()) {
                        EditText editText3 = jVar.f191250v;
                        if (editText3 == null || editText.getId() != editText3.getId()) {
                            EditText editText4 = jVar.f191251w;
                            if (editText4 == null || editText.getId() != editText4.getId()) {
                                EditText editText5 = jVar.f191252x;
                                if (editText5 == null || editText.getId() != editText5.getId()) {
                                    EditText editText6 = jVar.f191253y;
                                    if (editText6 == null || editText.getId() != editText6.getId()) {
                                        EditText editText7 = jVar.f191254z;
                                        if (editText7 == null || editText.getId() != editText7.getId()) {
                                            EditText editText8 = jVar.A;
                                            if (editText8 == null || editText.getId() != editText8.getId()) {
                                                iA = -99;
                                                i14 = -99;
                                            } else {
                                                PowerZonesDTO powerZonesDTO = jVar.f191230a;
                                                powerZonesDTO.getClass();
                                                iA = ok1.a.a(2000, powerZonesDTO.f43987b) + 1;
                                                PowerZonesDTO powerZonesDTO2 = jVar.f191230a;
                                                powerZonesDTO2.getClass();
                                                if (i15 <= powerZonesDTO2.f44000o || i15 >= iA) {
                                                    jVar.f191231b = false;
                                                    PowerZonesDTO powerZonesDTO3 = jVar.f191230a;
                                                    powerZonesDTO3.getClass();
                                                    i14 = powerZonesDTO3.f44000o;
                                                } else {
                                                    jVar.f191231b = true;
                                                    PowerZonesDTO powerZonesDTO4 = jVar.f191230a;
                                                    if (powerZonesDTO4 != null) {
                                                        powerZonesDTO4.f44001p = i15;
                                                    }
                                                    iA = -99;
                                                    i14 = -99;
                                                }
                                            }
                                        } else {
                                            PowerZonesDTO powerZonesDTO5 = jVar.f191230a;
                                            powerZonesDTO5.getClass();
                                            if (i15 > powerZonesDTO5.f43999n) {
                                                PowerZonesDTO powerZonesDTO6 = jVar.f191230a;
                                                powerZonesDTO6.getClass();
                                                if (i15 < powerZonesDTO6.f44001p) {
                                                    jVar.f191231b = true;
                                                    PowerZonesDTO powerZonesDTO7 = jVar.f191230a;
                                                    if (powerZonesDTO7 != null) {
                                                        powerZonesDTO7.f44000o = i15;
                                                    }
                                                    iA = -99;
                                                    i14 = -99;
                                                }
                                            }
                                            jVar.f191231b = false;
                                            PowerZonesDTO powerZonesDTO8 = jVar.f191230a;
                                            powerZonesDTO8.getClass();
                                            i14 = powerZonesDTO8.f43999n;
                                            PowerZonesDTO powerZonesDTO9 = jVar.f191230a;
                                            powerZonesDTO9.getClass();
                                            iA = powerZonesDTO9.f44001p;
                                        }
                                    } else {
                                        PowerZonesDTO powerZonesDTO10 = jVar.f191230a;
                                        powerZonesDTO10.getClass();
                                        if (i15 > powerZonesDTO10.f43998m) {
                                            PowerZonesDTO powerZonesDTO11 = jVar.f191230a;
                                            powerZonesDTO11.getClass();
                                            if (i15 < powerZonesDTO11.f44000o) {
                                                jVar.f191231b = true;
                                                PowerZonesDTO powerZonesDTO12 = jVar.f191230a;
                                                if (powerZonesDTO12 != null) {
                                                    powerZonesDTO12.f43999n = i15;
                                                }
                                                iA = -99;
                                                i14 = -99;
                                            }
                                        }
                                        jVar.f191231b = false;
                                        PowerZonesDTO powerZonesDTO13 = jVar.f191230a;
                                        powerZonesDTO13.getClass();
                                        i14 = powerZonesDTO13.f43998m;
                                        PowerZonesDTO powerZonesDTO14 = jVar.f191230a;
                                        powerZonesDTO14.getClass();
                                        iA = powerZonesDTO14.f44000o;
                                    }
                                } else {
                                    PowerZonesDTO powerZonesDTO15 = jVar.f191230a;
                                    powerZonesDTO15.getClass();
                                    if (i15 > powerZonesDTO15.f43997l) {
                                        PowerZonesDTO powerZonesDTO16 = jVar.f191230a;
                                        powerZonesDTO16.getClass();
                                        if (i15 < powerZonesDTO16.f43999n) {
                                            jVar.f191231b = true;
                                            PowerZonesDTO powerZonesDTO17 = jVar.f191230a;
                                            if (powerZonesDTO17 != null) {
                                                powerZonesDTO17.f43998m = i15;
                                            }
                                            iA = -99;
                                            i14 = -99;
                                        }
                                    }
                                    jVar.f191231b = false;
                                    PowerZonesDTO powerZonesDTO18 = jVar.f191230a;
                                    powerZonesDTO18.getClass();
                                    i14 = powerZonesDTO18.f43997l;
                                    PowerZonesDTO powerZonesDTO19 = jVar.f191230a;
                                    powerZonesDTO19.getClass();
                                    iA = powerZonesDTO19.f43999n;
                                }
                            } else {
                                PowerZonesDTO powerZonesDTO20 = jVar.f191230a;
                                powerZonesDTO20.getClass();
                                if (i15 > powerZonesDTO20.f43996k) {
                                    PowerZonesDTO powerZonesDTO21 = jVar.f191230a;
                                    powerZonesDTO21.getClass();
                                    if (i15 < powerZonesDTO21.f43998m) {
                                        jVar.f191231b = true;
                                        PowerZonesDTO powerZonesDTO22 = jVar.f191230a;
                                        if (powerZonesDTO22 != null) {
                                            powerZonesDTO22.f43997l = i15;
                                        }
                                        iA = -99;
                                        i14 = -99;
                                    }
                                }
                                jVar.f191231b = false;
                                PowerZonesDTO powerZonesDTO23 = jVar.f191230a;
                                powerZonesDTO23.getClass();
                                i14 = powerZonesDTO23.f43996k;
                                PowerZonesDTO powerZonesDTO24 = jVar.f191230a;
                                powerZonesDTO24.getClass();
                                iA = powerZonesDTO24.f43998m;
                            }
                        } else {
                            PowerZonesDTO powerZonesDTO25 = jVar.f191230a;
                            powerZonesDTO25.getClass();
                            if (i15 > powerZonesDTO25.f43995j) {
                                PowerZonesDTO powerZonesDTO26 = jVar.f191230a;
                                powerZonesDTO26.getClass();
                                if (i15 < powerZonesDTO26.f43997l) {
                                    jVar.f191231b = true;
                                    PowerZonesDTO powerZonesDTO27 = jVar.f191230a;
                                    if (powerZonesDTO27 != null) {
                                        powerZonesDTO27.f43996k = i15;
                                    }
                                    iA = -99;
                                    i14 = -99;
                                }
                            }
                            jVar.f191231b = false;
                            PowerZonesDTO powerZonesDTO28 = jVar.f191230a;
                            powerZonesDTO28.getClass();
                            i14 = powerZonesDTO28.f43995j;
                            PowerZonesDTO powerZonesDTO29 = jVar.f191230a;
                            powerZonesDTO29.getClass();
                            iA = powerZonesDTO29.f43997l;
                        }
                    } else {
                        PowerZonesDTO powerZonesDTO30 = jVar.f191230a;
                        powerZonesDTO30.getClass();
                        iA = powerZonesDTO30.f43996k;
                        if (i15 <= 0 || i15 >= iA) {
                            jVar.f191231b = false;
                        } else {
                            jVar.f191231b = true;
                            PowerZonesDTO powerZonesDTO31 = jVar.f191230a;
                            if (powerZonesDTO31 != null) {
                                powerZonesDTO31.f43995j = i15;
                            }
                            iA = -99;
                            i14 = -99;
                        }
                    }
                    if (jVar.f191231b) {
                        PowerZonesDTO powerZonesDTO32 = jVar.f191230a;
                        powerZonesDTO32.getClass();
                        ok1.a.d(powerZonesDTO32);
                        jVar.C6();
                        j.v6(jVar);
                        jVar.f191232c = true;
                        return;
                    }
                    editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                    if (i14 == -99 || iA == -99) {
                        return;
                    }
                    String string = jVar.getString(R.string.lbl_error_title_wrong_number);
                    string.getClass();
                    String string2 = jVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i14), String.valueOf(iA));
                    string2.getClass();
                    j.z6(jVar, string, string2);
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            jVar.f191231b = false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xk1/j$d", "Landroid/view/View$OnClickListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            j jVar = j.this;
            androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(jVar.requireContext()).setTitle(jVar.getString(R.string.device_settings_functional_threshold_power));
            vk1.d.a aVar = vk1.d.f178596a;
            int i14 = jVar.f191233d;
            PowerZonesDTO powerZonesDTO = jVar.f191230a;
            aVar.getClass();
            String string = jVar.getString(R.string.reset_power_zones_alert_message, Integer.valueOf(vk1.d.a.b(i14, vk1.d.a.c(powerZonesDTO))));
            string.getClass();
            androidx.appcompat.app.e eVarCreate = title.setMessage(string).setPositiveButton(R.string.lbl_reset, new xg1.l(jVar, 5)).setNegativeButton(R.string.lbl_cancel, new vu1.k(25)).create();
            eVarCreate.getClass();
            if (jVar.getActivity() != null) {
                androidx.fragment.app.m activity = jVar.getActivity();
                activity.getClass();
                if (activity.isFinishing()) {
                    return;
                }
                eVarCreate.show();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xk1/j$e", "Landroid/view/View$OnFocusChangeListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements View.OnFocusChangeListener {
        public e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view2, boolean z14) {
            int i14;
            view2.getClass();
            EditText editText = (EditText) view2;
            j jVar = j.this;
            if (z14) {
                jVar.getClass();
                editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
                j.u6(jVar, editText.getId());
                return;
            }
            j.y6(jVar, editText);
            String strW6 = j.w6(jVar, editText);
            int i15 = 0;
            if (strW6.length() != 0) {
                try {
                    Integer.parseInt(strW6);
                    int i16 = Integer.parseInt(strW6);
                    EditText editText2 = jVar.f191240k;
                    if (editText2 == null || editText.getId() != editText2.getId()) {
                        EditText editText3 = jVar.f191242l;
                        if (editText3 == null || editText.getId() != editText3.getId()) {
                            EditText editText4 = jVar.f191243m;
                            if (editText4 == null || editText.getId() != editText4.getId()) {
                                EditText editText5 = jVar.f191244n;
                                if (editText5 == null || editText.getId() != editText5.getId()) {
                                    EditText editText6 = jVar.f191245o;
                                    if (editText6 == null || editText.getId() != editText6.getId()) {
                                        EditText editText7 = jVar.f191246p;
                                        if (editText7 == null || editText.getId() != editText7.getId()) {
                                            EditText editText8 = jVar.f191247q;
                                            if (editText8 == null || editText.getId() != editText8.getId()) {
                                                i14 = -99;
                                                i15 = -99;
                                            } else {
                                                PowerZonesDTO powerZonesDTO = jVar.f191230a;
                                                powerZonesDTO.getClass();
                                                if (i16 <= powerZonesDTO.f43993h || i16 >= 2001) {
                                                    jVar.f191231b = false;
                                                    PowerZonesDTO powerZonesDTO2 = jVar.f191230a;
                                                    powerZonesDTO2.getClass();
                                                    i15 = powerZonesDTO2.f43993h;
                                                    i14 = 2001;
                                                } else {
                                                    jVar.f191231b = true;
                                                    PowerZonesDTO powerZonesDTO3 = jVar.f191230a;
                                                    if (powerZonesDTO3 != null) {
                                                        powerZonesDTO3.f43994i = i16;
                                                    }
                                                    i14 = -99;
                                                    i15 = -99;
                                                }
                                            }
                                        } else {
                                            PowerZonesDTO powerZonesDTO4 = jVar.f191230a;
                                            powerZonesDTO4.getClass();
                                            if (i16 > powerZonesDTO4.f43992g) {
                                                PowerZonesDTO powerZonesDTO5 = jVar.f191230a;
                                                powerZonesDTO5.getClass();
                                                if (i16 < powerZonesDTO5.f43994i) {
                                                    jVar.f191231b = true;
                                                    PowerZonesDTO powerZonesDTO6 = jVar.f191230a;
                                                    if (powerZonesDTO6 != null) {
                                                        powerZonesDTO6.f43993h = i16;
                                                    }
                                                    i14 = -99;
                                                    i15 = -99;
                                                }
                                            }
                                            jVar.f191231b = false;
                                            PowerZonesDTO powerZonesDTO7 = jVar.f191230a;
                                            powerZonesDTO7.getClass();
                                            i15 = powerZonesDTO7.f43992g;
                                            PowerZonesDTO powerZonesDTO8 = jVar.f191230a;
                                            powerZonesDTO8.getClass();
                                            i14 = powerZonesDTO8.f43994i;
                                        }
                                    } else {
                                        PowerZonesDTO powerZonesDTO9 = jVar.f191230a;
                                        powerZonesDTO9.getClass();
                                        if (i16 > powerZonesDTO9.f43991f) {
                                            PowerZonesDTO powerZonesDTO10 = jVar.f191230a;
                                            powerZonesDTO10.getClass();
                                            if (i16 < powerZonesDTO10.f43993h) {
                                                jVar.f191231b = true;
                                                PowerZonesDTO powerZonesDTO11 = jVar.f191230a;
                                                if (powerZonesDTO11 != null) {
                                                    powerZonesDTO11.f43992g = i16;
                                                }
                                                i14 = -99;
                                                i15 = -99;
                                            }
                                        }
                                        jVar.f191231b = false;
                                        PowerZonesDTO powerZonesDTO12 = jVar.f191230a;
                                        powerZonesDTO12.getClass();
                                        i15 = powerZonesDTO12.f43991f;
                                        PowerZonesDTO powerZonesDTO13 = jVar.f191230a;
                                        powerZonesDTO13.getClass();
                                        i14 = powerZonesDTO13.f43993h;
                                    }
                                } else {
                                    PowerZonesDTO powerZonesDTO14 = jVar.f191230a;
                                    powerZonesDTO14.getClass();
                                    if (i16 > powerZonesDTO14.f43990e) {
                                        PowerZonesDTO powerZonesDTO15 = jVar.f191230a;
                                        powerZonesDTO15.getClass();
                                        if (i16 < powerZonesDTO15.f43992g) {
                                            jVar.f191231b = true;
                                            PowerZonesDTO powerZonesDTO16 = jVar.f191230a;
                                            if (powerZonesDTO16 != null) {
                                                powerZonesDTO16.f43991f = i16;
                                            }
                                            i14 = -99;
                                            i15 = -99;
                                        }
                                    }
                                    jVar.f191231b = false;
                                    PowerZonesDTO powerZonesDTO17 = jVar.f191230a;
                                    powerZonesDTO17.getClass();
                                    i15 = powerZonesDTO17.f43990e;
                                    PowerZonesDTO powerZonesDTO18 = jVar.f191230a;
                                    powerZonesDTO18.getClass();
                                    i14 = powerZonesDTO18.f43992g;
                                }
                            } else {
                                PowerZonesDTO powerZonesDTO19 = jVar.f191230a;
                                powerZonesDTO19.getClass();
                                if (i16 > powerZonesDTO19.f43989d) {
                                    PowerZonesDTO powerZonesDTO20 = jVar.f191230a;
                                    powerZonesDTO20.getClass();
                                    if (i16 < powerZonesDTO20.f43991f) {
                                        jVar.f191231b = true;
                                        PowerZonesDTO powerZonesDTO21 = jVar.f191230a;
                                        if (powerZonesDTO21 != null) {
                                            powerZonesDTO21.f43990e = i16;
                                        }
                                        i14 = -99;
                                        i15 = -99;
                                    }
                                }
                                jVar.f191231b = false;
                                PowerZonesDTO powerZonesDTO22 = jVar.f191230a;
                                powerZonesDTO22.getClass();
                                i15 = powerZonesDTO22.f43989d;
                                PowerZonesDTO powerZonesDTO23 = jVar.f191230a;
                                powerZonesDTO23.getClass();
                                i14 = powerZonesDTO23.f43991f;
                            }
                        } else {
                            PowerZonesDTO powerZonesDTO24 = jVar.f191230a;
                            powerZonesDTO24.getClass();
                            if (i16 > powerZonesDTO24.f43988c) {
                                PowerZonesDTO powerZonesDTO25 = jVar.f191230a;
                                powerZonesDTO25.getClass();
                                if (i16 < powerZonesDTO25.f43990e) {
                                    jVar.f191231b = true;
                                    PowerZonesDTO powerZonesDTO26 = jVar.f191230a;
                                    if (powerZonesDTO26 != null) {
                                        powerZonesDTO26.f43989d = i16;
                                    }
                                    i14 = -99;
                                    i15 = -99;
                                }
                            }
                            jVar.f191231b = false;
                            PowerZonesDTO powerZonesDTO27 = jVar.f191230a;
                            powerZonesDTO27.getClass();
                            i15 = powerZonesDTO27.f43988c;
                            PowerZonesDTO powerZonesDTO28 = jVar.f191230a;
                            powerZonesDTO28.getClass();
                            i14 = powerZonesDTO28.f43990e;
                        }
                    } else {
                        if (i16 >= 1) {
                            PowerZonesDTO powerZonesDTO29 = jVar.f191230a;
                            powerZonesDTO29.getClass();
                            if (i16 < powerZonesDTO29.f43990e) {
                                jVar.f191231b = true;
                                PowerZonesDTO powerZonesDTO30 = jVar.f191230a;
                                if (powerZonesDTO30 != null) {
                                    powerZonesDTO30.f43988c = i16;
                                }
                                i14 = -99;
                                i15 = -99;
                            }
                        }
                        jVar.f191231b = false;
                        PowerZonesDTO powerZonesDTO31 = jVar.f191230a;
                        powerZonesDTO31.getClass();
                        i14 = powerZonesDTO31.f43989d;
                    }
                    if (jVar.f191231b) {
                        PowerZonesDTO powerZonesDTO32 = jVar.f191230a;
                        powerZonesDTO32.getClass();
                        ok1.a.c(powerZonesDTO32);
                        jVar.C6();
                        j.v6(jVar);
                        jVar.f191232c = true;
                        return;
                    }
                    editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
                    if (i15 == -99 || i14 == -99) {
                        return;
                    }
                    String string = jVar.getString(R.string.lbl_error_title_wrong_number);
                    string.getClass();
                    String string2 = jVar.getString(R.string.lbl_error_message_wrong_number, String.valueOf(i15), String.valueOf(i14));
                    string2.getClass();
                    j.z6(jVar, string, string2);
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            editText.setBackgroundResource(R.drawable.shape_rectangle_transparent_with_stroke_danger_action);
            jVar.f191231b = false;
        }
    }

    public static final void u6(j jVar, int i14) {
        EditText editText = jVar.f191239j;
        if (editText == null || editText.getId() != i14) {
            EditText editText2 = jVar.f191239j;
            editText2.getClass();
            jVar.A6(editText2, false);
        }
        EditText editText3 = jVar.f191240k;
        if (editText3 == null || editText3.getId() != i14) {
            EditText editText4 = jVar.f191240k;
            editText4.getClass();
            jVar.A6(editText4, false);
        }
        EditText editText5 = jVar.f191242l;
        if (editText5 == null || editText5.getId() != i14) {
            EditText editText6 = jVar.f191242l;
            editText6.getClass();
            jVar.A6(editText6, false);
        }
        EditText editText7 = jVar.f191243m;
        if (editText7 == null || editText7.getId() != i14) {
            EditText editText8 = jVar.f191243m;
            editText8.getClass();
            jVar.A6(editText8, false);
        }
        EditText editText9 = jVar.f191244n;
        if (editText9 == null || editText9.getId() != i14) {
            EditText editText10 = jVar.f191244n;
            editText10.getClass();
            jVar.A6(editText10, false);
        }
        EditText editText11 = jVar.f191245o;
        if (editText11 == null || editText11.getId() != i14) {
            EditText editText12 = jVar.f191245o;
            editText12.getClass();
            jVar.A6(editText12, false);
        }
        EditText editText13 = jVar.f191246p;
        if (editText13 == null || editText13.getId() != i14) {
            EditText editText14 = jVar.f191246p;
            editText14.getClass();
            jVar.A6(editText14, false);
        }
        EditText editText15 = jVar.f191247q;
        if (editText15 == null || editText15.getId() != i14) {
            EditText editText16 = jVar.f191247q;
            editText16.getClass();
            jVar.A6(editText16, false);
        }
        EditText editText17 = jVar.f191249t;
        if (editText17 == null || editText17.getId() != i14) {
            EditText editText18 = jVar.f191249t;
            editText18.getClass();
            jVar.A6(editText18, false);
        }
        EditText editText19 = jVar.f191250v;
        if (editText19 == null || editText19.getId() != i14) {
            EditText editText20 = jVar.f191250v;
            editText20.getClass();
            jVar.A6(editText20, false);
        }
        EditText editText21 = jVar.f191251w;
        if (editText21 == null || editText21.getId() != i14) {
            EditText editText22 = jVar.f191251w;
            editText22.getClass();
            jVar.A6(editText22, false);
        }
        EditText editText23 = jVar.f191252x;
        if (editText23 == null || editText23.getId() != i14) {
            EditText editText24 = jVar.f191252x;
            editText24.getClass();
            jVar.A6(editText24, false);
        }
        EditText editText25 = jVar.f191253y;
        if (editText25 == null || editText25.getId() != i14) {
            EditText editText26 = jVar.f191253y;
            editText26.getClass();
            jVar.A6(editText26, false);
        }
        EditText editText27 = jVar.f191254z;
        if (editText27 == null || editText27.getId() != i14) {
            EditText editText28 = jVar.f191254z;
            editText28.getClass();
            jVar.A6(editText28, false);
        }
        EditText editText29 = jVar.A;
        if (editText29 == null || editText29.getId() != i14) {
            EditText editText30 = jVar.A;
            editText30.getClass();
            jVar.A6(editText30, false);
        }
    }

    public static final void v6(j jVar) {
        EditText editText = jVar.f191239j;
        editText.getClass();
        jVar.A6(editText, true);
        EditText editText2 = jVar.f191240k;
        editText2.getClass();
        jVar.A6(editText2, true);
        EditText editText3 = jVar.f191242l;
        editText3.getClass();
        jVar.A6(editText3, true);
        EditText editText4 = jVar.f191243m;
        editText4.getClass();
        jVar.A6(editText4, true);
        EditText editText5 = jVar.f191244n;
        editText5.getClass();
        jVar.A6(editText5, true);
        EditText editText6 = jVar.f191245o;
        editText6.getClass();
        jVar.A6(editText6, true);
        EditText editText7 = jVar.f191246p;
        editText7.getClass();
        jVar.A6(editText7, true);
        EditText editText8 = jVar.f191247q;
        editText8.getClass();
        jVar.A6(editText8, true);
        EditText editText9 = jVar.f191249t;
        editText9.getClass();
        jVar.A6(editText9, true);
        EditText editText10 = jVar.f191250v;
        editText10.getClass();
        jVar.A6(editText10, true);
        EditText editText11 = jVar.f191251w;
        editText11.getClass();
        jVar.A6(editText11, true);
        EditText editText12 = jVar.f191252x;
        editText12.getClass();
        jVar.A6(editText12, true);
        EditText editText13 = jVar.f191253y;
        editText13.getClass();
        jVar.A6(editText13, true);
        EditText editText14 = jVar.f191254z;
        editText14.getClass();
        jVar.A6(editText14, true);
        EditText editText15 = jVar.A;
        editText15.getClass();
        jVar.A6(editText15, true);
    }

    public static final String w6(j jVar, EditText editText) {
        jVar.getClass();
        String string = editText.getText().toString();
        int length = string.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length) {
            boolean z15 = p005kotlin.jvm.internal.s.h(string.charAt(!z14 ? i14 : length), 32) <= 0;
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

    public static final void y6(j jVar, EditText editText) {
        Object systemService = jVar.requireActivity().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static final void z6(j jVar, String str, String str2) {
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(jVar.requireContext()).setTitle(str).setMessage(str2).setPositiveButton(R.string.lbl_ok, new vu1.k(24)).create();
        eVarCreate.getClass();
        if (jVar.getActivity() == null || jVar.requireActivity().isFinishing()) {
            return;
        }
        eVarCreate.show();
    }

    public final void A6(EditText editText, boolean z14) {
        editText.setEnabled(z14);
        editText.setTextColor(z14 ? a7.b.getColor(requireContext(), R.color.gcm_text_primary) : a7.b.getColor(requireContext(), R.color.gcm_text_primary_disabled));
        if (z14) {
            editText.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void C6() {
        View view2 = this.f191236g;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.f191235f;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        EditText editText = this.f191239j;
        if (editText != null) {
            PowerZonesDTO powerZonesDTO = this.f191230a;
            powerZonesDTO.getClass();
            editText.setText(String.valueOf(powerZonesDTO.f43987b));
        }
        EditText editText2 = this.f191240k;
        if (editText2 != null) {
            PowerZonesDTO powerZonesDTO2 = this.f191230a;
            powerZonesDTO2.getClass();
            editText2.setText(String.valueOf(powerZonesDTO2.f43988c));
        }
        EditText editText3 = this.f191249t;
        if (editText3 != null) {
            PowerZonesDTO powerZonesDTO3 = this.f191230a;
            powerZonesDTO3.getClass();
            editText3.setText(String.valueOf(powerZonesDTO3.f43995j));
        }
        EditText editText4 = this.f191242l;
        if (editText4 != null) {
            PowerZonesDTO powerZonesDTO4 = this.f191230a;
            powerZonesDTO4.getClass();
            editText4.setText(String.valueOf(powerZonesDTO4.f43989d));
        }
        EditText editText5 = this.f191250v;
        if (editText5 != null) {
            PowerZonesDTO powerZonesDTO5 = this.f191230a;
            powerZonesDTO5.getClass();
            editText5.setText(String.valueOf(powerZonesDTO5.f43996k));
        }
        EditText editText6 = this.f191243m;
        if (editText6 != null) {
            PowerZonesDTO powerZonesDTO6 = this.f191230a;
            powerZonesDTO6.getClass();
            editText6.setText(String.valueOf(powerZonesDTO6.f43990e));
        }
        EditText editText7 = this.f191251w;
        if (editText7 != null) {
            PowerZonesDTO powerZonesDTO7 = this.f191230a;
            powerZonesDTO7.getClass();
            editText7.setText(String.valueOf(powerZonesDTO7.f43997l));
        }
        EditText editText8 = this.f191244n;
        if (editText8 != null) {
            PowerZonesDTO powerZonesDTO8 = this.f191230a;
            powerZonesDTO8.getClass();
            editText8.setText(String.valueOf(powerZonesDTO8.f43991f));
        }
        EditText editText9 = this.f191252x;
        if (editText9 != null) {
            PowerZonesDTO powerZonesDTO9 = this.f191230a;
            powerZonesDTO9.getClass();
            editText9.setText(String.valueOf(powerZonesDTO9.f43998m));
        }
        EditText editText10 = this.f191245o;
        if (editText10 != null) {
            PowerZonesDTO powerZonesDTO10 = this.f191230a;
            powerZonesDTO10.getClass();
            editText10.setText(String.valueOf(powerZonesDTO10.f43992g));
        }
        EditText editText11 = this.f191253y;
        if (editText11 != null) {
            PowerZonesDTO powerZonesDTO11 = this.f191230a;
            powerZonesDTO11.getClass();
            editText11.setText(String.valueOf(powerZonesDTO11.f43999n));
        }
        EditText editText12 = this.f191246p;
        if (editText12 != null) {
            PowerZonesDTO powerZonesDTO12 = this.f191230a;
            powerZonesDTO12.getClass();
            editText12.setText(String.valueOf(powerZonesDTO12.f43993h));
        }
        EditText editText13 = this.f191254z;
        if (editText13 != null) {
            PowerZonesDTO powerZonesDTO13 = this.f191230a;
            powerZonesDTO13.getClass();
            editText13.setText(String.valueOf(powerZonesDTO13.f44000o));
        }
        if (!this.f191234e) {
            EditText editText14 = this.f191247q;
            if (editText14 != null) {
                PowerZonesDTO powerZonesDTO14 = this.f191230a;
                powerZonesDTO14.getClass();
                editText14.setText(String.valueOf(powerZonesDTO14.f43994i));
            }
            EditText editText15 = this.A;
            if (editText15 != null) {
                PowerZonesDTO powerZonesDTO15 = this.f191230a;
                powerZonesDTO15.getClass();
                editText15.setText(String.valueOf(powerZonesDTO15.f44001p));
            }
            EditText editText16 = this.f191248r;
            if (editText16 != null) {
                PowerZonesDTO powerZonesDTO16 = this.f191230a;
                powerZonesDTO16.getClass();
                editText16.setText(">" + powerZonesDTO16.f43994i);
            }
            EditText editText17 = this.B;
            if (editText17 != null) {
                PowerZonesDTO powerZonesDTO17 = this.f191230a;
                powerZonesDTO17.getClass();
                editText17.setText(">" + powerZonesDTO17.f44001p);
                return;
            }
            return;
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setText(R.string.device_settings_threshold_power);
        }
        TextView textView2 = this.Y;
        if (textView2 != null) {
            textView2.setText(R.string.device_settings_percent_of_tp);
        }
        EditText editText18 = this.f191246p;
        if (editText18 != null) {
            PowerZonesDTO powerZonesDTO18 = this.f191230a;
            powerZonesDTO18.getClass();
            editText18.setText(">" + powerZonesDTO18.f43992g);
        }
        EditText editText19 = this.f191254z;
        if (editText19 != null) {
            PowerZonesDTO powerZonesDTO19 = this.f191230a;
            powerZonesDTO19.getClass();
            editText19.setText(">" + powerZonesDTO19.f43999n);
        }
        TextView textView3 = this.P;
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        EditText editText20 = this.f191247q;
        if (editText20 != null) {
            editText20.setVisibility(4);
        }
        EditText editText21 = this.A;
        if (editText21 != null) {
            editText21.setVisibility(4);
        }
        TextView textView4 = this.T;
        if (textView4 != null) {
            textView4.setVisibility(4);
        }
        EditText editText22 = this.f191248r;
        if (editText22 != null) {
            editText22.setVisibility(4);
        }
        EditText editText23 = this.B;
        if (editText23 != null) {
            editText23.setVisibility(4);
        }
        GCMLeftSquareBracketView gCMLeftSquareBracketView = this.f191237h;
        if (gCMLeftSquareBracketView != null) {
            gCMLeftSquareBracketView.setVisibility(4);
        }
        GCMLeftSquareBracketView gCMLeftSquareBracketView2 = this.f191238i;
        if (gCMLeftSquareBracketView2 != null) {
            gCMLeftSquareBracketView2.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) arguments.getParcelable("EXTRA_DTO", PowerZonesDTO.class);
        } else {
            Parcelable parcelable2 = arguments.getParcelable("EXTRA_DTO");
            if (!(parcelable2 instanceof PowerZonesDTO)) {
                parcelable2 = null;
            }
            parcelable = (PowerZonesDTO) parcelable2;
        }
        PowerZonesDTO powerZonesDTO = (PowerZonesDTO) parcelable;
        this.f191230a = powerZonesDTO;
        if (p005kotlin.jvm.internal.s.g(powerZonesDTO != null ? powerZonesDTO.f43986a : null, "CYCLING")) {
            this.f191233d = arguments.getInt("EXTRA_CYCLING_FTP");
            return;
        }
        PowerZonesDTO powerZonesDTO2 = this.f191230a;
        boolean zG = p005kotlin.jvm.internal.s.g(powerZonesDTO2 != null ? powerZonesDTO2.f43986a : null, "RUNNING");
        PowerZonesDTO powerZonesDTO3 = this.f191230a;
        if (zG) {
            this.f191234e = p005kotlin.jvm.internal.s.g(powerZonesDTO3 != null ? powerZonesDTO3.f43986a : null, "RUNNING");
            this.f191233d = arguments.getInt("EXTRA_RUNNING_FTP");
            return;
        }
        if (p005kotlin.jvm.internal.s.g(powerZonesDTO3 != null ? powerZonesDTO3.f43986a : null, "CROSS_COUNTRY_SKIING")) {
            this.f191233d = arguments.getInt("EXTRA_CYCLING_FTP");
            return;
        }
        PowerZonesDTO powerZonesDTO4 = this.f191230a;
        if (p005kotlin.jvm.internal.s.g(powerZonesDTO4 != null ? powerZonesDTO4.f43986a : null, "ROWING")) {
            this.f191233d = arguments.getInt("EXTRA_ROWING_FTP");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_power_zones_frag, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.functional_threshold_power_container);
        this.f191235f = viewFindViewById;
        this.X = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.functional_threshold_power_label) : null;
        View view3 = this.f191235f;
        EditText editText = view3 != null ? (EditText) view3.findViewById(R.id.functional_threshold_power) : null;
        this.f191239j = editText;
        if (editText != null) {
            editText.setOnFocusChangeListener(this.H0);
        }
        EditText editText2 = this.f191239j;
        bl0.a aVar = this.K0;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(aVar);
        }
        EditText editText3 = this.f191239j;
        if (editText3 != null) {
            editText3.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        this.f191236g = view2.findViewById(R.id.three_column_container);
        this.Y = (TextView) view2.findViewById(R.id.percent_power_tp);
        View view4 = this.f191236g;
        EditText editText4 = (EditText) (view4 != null ? view4.findViewById(R.id.watts0) : null);
        this.f191240k = editText4;
        e eVar = this.I0;
        if (editText4 != null) {
            editText4.setOnFocusChangeListener(eVar);
        }
        EditText editText5 = this.f191240k;
        if (editText5 != null) {
            editText5.setOnEditorActionListener(aVar);
        }
        EditText editText6 = this.f191240k;
        if (editText6 != null) {
            editText6.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view5 = this.f191236g;
        EditText editText7 = (EditText) (view5 != null ? view5.findViewById(R.id.percent0) : null);
        this.f191249t = editText7;
        c cVar = this.J0;
        if (editText7 != null) {
            editText7.setOnFocusChangeListener(cVar);
        }
        EditText editText8 = this.f191249t;
        if (editText8 != null) {
            editText8.setOnEditorActionListener(aVar);
        }
        EditText editText9 = this.f191249t;
        if (editText9 != null) {
            editText9.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view6 = this.f191236g;
        TextView textView = (TextView) (view6 != null ? view6.findViewById(R.id.zone1_label) : null);
        this.C = textView;
        if (textView != null) {
            textView.setText(getString(R.string.heart_rate_zone_name, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        }
        View view7 = this.f191236g;
        EditText editText10 = (EditText) (view7 != null ? view7.findViewById(R.id.watts1) : null);
        this.f191242l = editText10;
        if (editText10 != null) {
            editText10.setOnFocusChangeListener(eVar);
        }
        EditText editText11 = this.f191242l;
        if (editText11 != null) {
            editText11.setOnEditorActionListener(aVar);
        }
        EditText editText12 = this.f191242l;
        if (editText12 != null) {
            editText12.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view8 = this.f191236g;
        EditText editText13 = (EditText) (view8 != null ? view8.findViewById(R.id.percent1) : null);
        this.f191250v = editText13;
        if (editText13 != null) {
            editText13.setOnFocusChangeListener(cVar);
        }
        EditText editText14 = this.f191250v;
        if (editText14 != null) {
            editText14.setOnEditorActionListener(aVar);
        }
        EditText editText15 = this.f191250v;
        if (editText15 != null) {
            editText15.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view9 = this.f191236g;
        TextView textView2 = (TextView) (view9 != null ? view9.findViewById(R.id.zone2_label) : null);
        this.D = textView2;
        if (textView2 != null) {
            textView2.setText(getString(R.string.heart_rate_zone_name, "2"));
        }
        View view10 = this.f191236g;
        EditText editText16 = (EditText) (view10 != null ? view10.findViewById(R.id.watts2) : null);
        this.f191243m = editText16;
        if (editText16 != null) {
            editText16.setOnFocusChangeListener(eVar);
        }
        EditText editText17 = this.f191243m;
        if (editText17 != null) {
            editText17.setOnEditorActionListener(aVar);
        }
        EditText editText18 = this.f191243m;
        if (editText18 != null) {
            editText18.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view11 = this.f191236g;
        EditText editText19 = (EditText) (view11 != null ? view11.findViewById(R.id.percent2) : null);
        this.f191251w = editText19;
        if (editText19 != null) {
            editText19.setOnFocusChangeListener(cVar);
        }
        EditText editText20 = this.f191251w;
        if (editText20 != null) {
            editText20.setOnEditorActionListener(aVar);
        }
        EditText editText21 = this.f191251w;
        if (editText21 != null) {
            editText21.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view12 = this.f191236g;
        TextView textView3 = (TextView) (view12 != null ? view12.findViewById(R.id.zone3_label) : null);
        this.E = textView3;
        if (textView3 != null) {
            textView3.setText(getString(R.string.heart_rate_zone_name, "3"));
        }
        View view13 = this.f191236g;
        EditText editText22 = (EditText) (view13 != null ? view13.findViewById(R.id.watts3) : null);
        this.f191244n = editText22;
        if (editText22 != null) {
            editText22.setOnFocusChangeListener(eVar);
        }
        EditText editText23 = this.f191244n;
        if (editText23 != null) {
            editText23.setOnEditorActionListener(aVar);
        }
        EditText editText24 = this.f191244n;
        if (editText24 != null) {
            editText24.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view14 = this.f191236g;
        EditText editText25 = (EditText) (view14 != null ? view14.findViewById(R.id.percent3) : null);
        this.f191252x = editText25;
        if (editText25 != null) {
            editText25.setOnFocusChangeListener(cVar);
        }
        EditText editText26 = this.f191252x;
        if (editText26 != null) {
            editText26.setOnEditorActionListener(aVar);
        }
        EditText editText27 = this.f191252x;
        if (editText27 != null) {
            editText27.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view15 = this.f191236g;
        TextView textView4 = (TextView) (view15 != null ? view15.findViewById(R.id.zone4_label) : null);
        this.F = textView4;
        if (textView4 != null) {
            textView4.setText(getString(R.string.heart_rate_zone_name, "4"));
        }
        View view16 = this.f191236g;
        EditText editText28 = (EditText) (view16 != null ? view16.findViewById(R.id.watts4) : null);
        this.f191245o = editText28;
        if (editText28 != null) {
            editText28.setOnFocusChangeListener(eVar);
        }
        EditText editText29 = this.f191245o;
        if (editText29 != null) {
            editText29.setOnEditorActionListener(aVar);
        }
        EditText editText30 = this.f191245o;
        if (editText30 != null) {
            editText30.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view17 = this.f191236g;
        EditText editText31 = (EditText) (view17 != null ? view17.findViewById(R.id.percent4) : null);
        this.f191253y = editText31;
        if (editText31 != null) {
            editText31.setOnFocusChangeListener(cVar);
        }
        EditText editText32 = this.f191253y;
        if (editText32 != null) {
            editText32.setOnEditorActionListener(aVar);
        }
        EditText editText33 = this.f191253y;
        if (editText33 != null) {
            editText33.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view18 = this.f191236g;
        TextView textView5 = (TextView) (view18 != null ? view18.findViewById(R.id.zone5_label) : null);
        this.I = textView5;
        if (textView5 != null) {
            textView5.setText(getString(R.string.heart_rate_zone_name, "5"));
        }
        View view19 = this.f191236g;
        EditText editText34 = (EditText) (view19 != null ? view19.findViewById(R.id.watts5) : null);
        this.f191246p = editText34;
        if (editText34 != null) {
            editText34.setOnFocusChangeListener(eVar);
        }
        EditText editText35 = this.f191246p;
        if (editText35 != null) {
            editText35.setOnEditorActionListener(aVar);
        }
        EditText editText36 = this.f191246p;
        if (editText36 != null) {
            editText36.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view20 = this.f191236g;
        EditText editText37 = (EditText) (view20 != null ? view20.findViewById(R.id.percent5) : null);
        this.f191254z = editText37;
        if (editText37 != null) {
            editText37.setOnFocusChangeListener(cVar);
        }
        EditText editText38 = this.f191254z;
        if (editText38 != null) {
            editText38.setOnEditorActionListener(aVar);
        }
        EditText editText39 = this.f191254z;
        if (editText39 != null) {
            editText39.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view21 = this.f191236g;
        TextView textView6 = (TextView) (view21 != null ? view21.findViewById(R.id.zone6_label) : null);
        this.P = textView6;
        if (textView6 != null) {
            textView6.setText(getString(R.string.heart_rate_zone_name, "6"));
        }
        View view22 = this.f191236g;
        EditText editText40 = (EditText) (view22 != null ? view22.findViewById(R.id.watts6) : null);
        this.f191247q = editText40;
        if (editText40 != null) {
            editText40.setOnFocusChangeListener(eVar);
        }
        EditText editText41 = this.f191247q;
        if (editText41 != null) {
            editText41.setOnEditorActionListener(aVar);
        }
        EditText editText42 = this.f191247q;
        if (editText42 != null) {
            editText42.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view23 = this.f191236g;
        EditText editText43 = (EditText) (view23 != null ? view23.findViewById(R.id.percent6) : null);
        this.A = editText43;
        if (editText43 != null) {
            editText43.setOnFocusChangeListener(cVar);
        }
        EditText editText44 = this.A;
        if (editText44 != null) {
            editText44.setOnEditorActionListener(aVar);
        }
        EditText editText45 = this.A;
        if (editText45 != null) {
            editText45.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view24 = this.f191236g;
        GCMLeftSquareBracketView gCMLeftSquareBracketView = (GCMLeftSquareBracketView) (view24 != null ? view24.findViewById(R.id.zone6_connector) : null);
        this.f191237h = gCMLeftSquareBracketView;
        if (gCMLeftSquareBracketView != null) {
            gCMLeftSquareBracketView.setVisibility(0);
        }
        View view25 = this.f191236g;
        TextView textView7 = (TextView) (view25 != null ? view25.findViewById(R.id.zone7_label) : null);
        this.T = textView7;
        if (textView7 != null) {
            textView7.setText(getString(R.string.heart_rate_zone_name, "7"));
        }
        TextView textView8 = this.T;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
        View view26 = this.f191236g;
        GCMLeftSquareBracketView gCMLeftSquareBracketView2 = (GCMLeftSquareBracketView) (view26 != null ? view26.findViewById(R.id.zone7_connector) : null);
        this.f191238i = gCMLeftSquareBracketView2;
        if (gCMLeftSquareBracketView2 != null) {
            gCMLeftSquareBracketView2.setVisibility(0);
        }
        View view27 = this.f191236g;
        EditText editText46 = (EditText) (view27 != null ? view27.findViewById(R.id.watts7) : null);
        this.f191248r = editText46;
        if (editText46 != null) {
            editText46.setVisibility(0);
        }
        EditText editText47 = this.f191248r;
        if (editText47 != null) {
            editText47.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View view28 = this.f191236g;
        EditText editText48 = (EditText) (view28 != null ? view28.findViewById(R.id.percent7) : null);
        this.B = editText48;
        if (editText48 != null) {
            editText48.setVisibility(0);
        }
        EditText editText49 = this.B;
        if (editText49 != null) {
            editText49.setBackgroundResource(R.drawable.gcm_transparent_rectangle_edit_text);
        }
        View viewFindViewById2 = view2.findViewById(R.id.reset_container);
        this.f191241k0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(0);
        }
        View view29 = this.f191241k0;
        d dVar = this.L0;
        if (view29 != null) {
            view29.setOnClickListener(dVar);
        }
        View view30 = this.f191241k0;
        TextView textView9 = view30 != null ? (TextView) view30.findViewById(R.id.reset_text) : null;
        if (textView9 != null) {
            textView9.setOnClickListener(dVar);
        }
        this.Z = (TextView) view2.findViewById(R.id.watts_text_view);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        int iB = (int) c22.b.b(contextRequireContext, getResources().getDimension(R.dimen.andfont_body_1), 1.3f);
        EditText editText50 = this.f191240k;
        editText50.getClass();
        float f14 = iB;
        editText50.setTextSize(0, f14);
        EditText editText51 = this.f191242l;
        editText51.getClass();
        editText51.setTextSize(0, f14);
        EditText editText52 = this.f191243m;
        editText52.getClass();
        editText52.setTextSize(0, f14);
        EditText editText53 = this.f191244n;
        editText53.getClass();
        editText53.setTextSize(0, f14);
        EditText editText54 = this.f191245o;
        editText54.getClass();
        editText54.setTextSize(0, f14);
        EditText editText55 = this.f191246p;
        editText55.getClass();
        editText55.setTextSize(0, f14);
        EditText editText56 = this.f191247q;
        editText56.getClass();
        editText56.setTextSize(0, f14);
        EditText editText57 = this.f191248r;
        editText57.getClass();
        editText57.setTextSize(0, f14);
        EditText editText58 = this.f191249t;
        editText58.getClass();
        editText58.setTextSize(0, f14);
        EditText editText59 = this.f191250v;
        editText59.getClass();
        editText59.setTextSize(0, f14);
        EditText editText60 = this.f191251w;
        editText60.getClass();
        editText60.setTextSize(0, f14);
        EditText editText61 = this.f191252x;
        editText61.getClass();
        editText61.setTextSize(0, f14);
        EditText editText62 = this.f191253y;
        editText62.getClass();
        editText62.setTextSize(0, f14);
        EditText editText63 = this.f191254z;
        editText63.getClass();
        editText63.setTextSize(0, f14);
        EditText editText64 = this.B;
        editText64.getClass();
        editText64.setTextSize(0, f14);
        EditText editText65 = this.A;
        editText65.getClass();
        editText65.setTextSize(0, f14);
        EditText editText66 = this.f191239j;
        editText66.getClass();
        editText66.setTextSize(0, f14);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        int iB2 = (int) c22.b.b(contextRequireContext2, getResources().getDimension(R.dimen.andfont_body_2), 1.3f);
        TextView textView10 = this.C;
        textView10.getClass();
        float f15 = iB2;
        textView10.setTextSize(0, f15);
        TextView textView11 = this.D;
        textView11.getClass();
        textView11.setTextSize(0, f15);
        TextView textView12 = this.E;
        textView12.getClass();
        textView12.setTextSize(0, f15);
        TextView textView13 = this.F;
        textView13.getClass();
        textView13.setTextSize(0, f15);
        TextView textView14 = this.I;
        textView14.getClass();
        textView14.setTextSize(0, f15);
        TextView textView15 = this.P;
        textView15.getClass();
        textView15.setTextSize(0, f15);
        TextView textView16 = this.T;
        textView16.getClass();
        textView16.setTextSize(0, f15);
        TextView textView17 = this.Y;
        textView17.getClass();
        textView17.setTextSize(0, f15);
        TextView textView18 = this.Z;
        textView18.getClass();
        textView18.setTextSize(0, f15);
        C6();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lxk1/j$a;", "", "<init>", "()V", "", "EXTRA_DTO", "Ljava/lang/String;", "EXTRA_CYCLING_FTP", "EXTRA_RUNNING_FTP", "EXTRA_ROWING_FTP", "", "FUNCTIONAL_THRESHOLD_POWER_MIN_VAL", "I", "FUNCTIONAL_THRESHOLD_POWER_MAX_VAL", "WATTS_MAX_VAL", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
