package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.e;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import java.util.WeakHashMap;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
public class a extends e implements DialogInterface.OnClickListener, EditTextPicker.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47558d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditTextPicker f47559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0927a f47560c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC0927a {
        void a(int i14, Number number);
    }

    public a(Context context, int i14, InterfaceC0927a interfaceC0927a, int i15, double d14) {
        super(context, i14);
        this.f47560c = interfaceC0927a;
        setTitle(context.getString(R.string.txt_untitle));
        g(-1, context.getText(R.string.lbl_done), this);
        g(-2, context.getText(R.string.lbl_cancel), null);
        this.f4658a.d(0);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.gcm_text_view_picker_dialog, (ViewGroup) null);
        i(viewInflate);
        EditTextPicker editTextPicker = (EditTextPicker) viewInflate.findViewById(R.id.textViewPicker);
        this.f47559b = editTextPicker;
        editTextPicker.a(i15, Double.valueOf(d14));
        editTextPicker.setOnFieldChangeListener(this);
    }

    @Override // com.garmin.android.apps.connectmobile.view.EditTextPicker.c
    public final void a(EditTextPicker editTextPicker, int i14, Number number) {
        String strJ = j(number);
        if (strJ != null) {
            setTitle(strJ);
        }
    }

    public String j(Number number) {
        return getContext().getString(R.string.txt_untitle);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        EditTextPicker editTextPicker = this.f47559b;
        editTextPicker.clearFocus();
        this.f47560c.a(editTextPicker.getFirstValue(), editTextPicker.getEditTextValue());
    }

    @Override // androidx.appcompat.app.e, i.l, b.i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            q2 q2Var = new q2(2);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(decorView, q2Var);
        }
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i14 = bundle.getInt("first");
        double d14 = bundle.getDouble("edit_text");
        EditTextPicker editTextPicker = this.f47559b;
        editTextPicker.getFirstPicker().setValue(i14);
        editTextPicker.getEditTextNumber().setText(String.valueOf(d14));
    }

    @Override // b.i, android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        EditTextPicker editTextPicker = this.f47559b;
        bundleOnSaveInstanceState.putInt("first", editTextPicker.getFirstValue());
        bundleOnSaveInstanceState.putSerializable("edit_text", editTextPicker.getEditTextValue());
        return bundleOnSaveInstanceState;
    }

    public a(Context context, InterfaceC0927a interfaceC0927a, int i14, double d14) {
        this(context, -1, interfaceC0927a, i14, d14);
    }
}
