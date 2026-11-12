package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import c22.b1;
import com.garmin.android.apps.connectmobile.R;
import hg1.j;
import hg1.l;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f41714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f41715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatEditText f41718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f41719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f41720h;

    public interface a {
        void e(double d14);
    }

    public b(Context context, a aVar, String str, String str2, int i14, String str3, String str4, j jVar, int i15, int i16) {
        double dB;
        this.f41713a = context;
        this.f41714b = aVar;
        this.f41715c = jVar;
        this.f41716d = i15;
        this.f41717e = i16;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_edit_text_dialog, (ViewGroup) null);
        this.f41718f = (AppCompatEditText) viewInflate.findViewById(R.id.value);
        TextView textView = (TextView) viewInflate.findViewById(R.id.errorMessage);
        this.f41719g = textView;
        textView.setTextColor(context.getColor(R.color.gcm_text_danger_action));
        this.f41720h = (TextView) viewInflate.findViewById(R.id.unit);
        try {
            dB = Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            dB = b1.b(str);
        }
        j jVar2 = j.ALERT_TYPE_DISTANCE;
        this.f41718f.setText((jVar == jVar2 || jVar == j.ALERT_TYPE_SWIM_DISTANCE) ? String.valueOf(dB) : String.valueOf((int) dB));
        this.f41718f.setRawInputType(i14);
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(this.f41718f, 1);
        this.f41720h.setText(str3);
        this.f41718f.setSelectAllOnFocus(true);
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(context).setTitle(str2).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create();
        eVarCreate.setOnShowListener(new com.garmin.android.apps.connectmobile.settings.activityoptions.a(this, eVarCreate));
        eVarCreate.show();
        this.f41718f.setKeyListener(DigitsKeyListener.getInstance(false, i14 == 8192));
        this.f41718f.setOnFocusChangeListener(new l(this, eVarCreate));
        if (jVar != null) {
            InputFilter[] inputFilterArr = new InputFilter[1];
            if (jVar == jVar2) {
                inputFilterArr[0] = new InputFilter.LengthFilter(5);
            } else if (jVar == j.ALERT_TYPE_SWIM_DISTANCE) {
                inputFilterArr[0] = new InputFilter.LengthFilter(4);
            } else if (jVar == j.ALERT_TYPE_CALORIES) {
                inputFilterArr[0] = new InputFilter.LengthFilter(5);
            } else if (jVar == j.ALERT_TYPE_REP_COUNTING) {
                inputFilterArr[0] = new InputFilter.LengthFilter(3);
            }
            this.f41718f.setFilters(inputFilterArr);
        }
    }
}
