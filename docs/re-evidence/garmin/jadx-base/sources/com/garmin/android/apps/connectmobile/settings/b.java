package com.garmin.android.apps.connectmobile.settings;

import android.content.DialogInterface;
import android.widget.NumberPicker;
import f12.l;

/* JADX INFO: loaded from: classes10.dex */
public class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f41739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f41740b;

    public b(d dVar, NumberPicker numberPicker) {
        this.f41740b = dVar;
        this.f41739a = numberPicker;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        String strValueOf = String.valueOf(this.f41739a.getValue());
        if (strValueOf.isEmpty()) {
            return;
        }
        try {
            float fFloatValue = Float.valueOf(strValueOf).floatValue();
            l.f68084a.getClass();
            l.a.a().U2(fFloatValue);
            this.f41740b.f41745a.c(fFloatValue);
            dialogInterface.dismiss();
        } catch (NumberFormatException unused) {
        }
    }
}
