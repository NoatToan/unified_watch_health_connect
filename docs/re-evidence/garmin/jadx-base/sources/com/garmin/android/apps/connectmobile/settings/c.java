package com.garmin.android.apps.connectmobile.settings;

import android.content.DialogInterface;
import android.widget.NumberPicker;
import c22.l3;
import f12.l;

/* JADX INFO: loaded from: classes10.dex */
public class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f41741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f41742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f41743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f41744d;

    public c(d dVar, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        this.f41744d = dVar;
        this.f41741a = numberPicker;
        this.f41742b = numberPicker2;
        this.f41743c = numberPicker3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        NumberPicker numberPicker = this.f41741a;
        float value = (numberPicker.getValue() * 12) + (numberPicker.getValue() != 8 ? this.f41742b.getValue() : this.f41743c.getValue());
        l3.f23124b.getClass();
        float f14 = (float) (((double) value) * 2.54d);
        l.f68084a.getClass();
        l.a.a().U2(f14);
        this.f41744d.f41745a.c(f14);
        dialogInterface.dismiss();
    }
}
