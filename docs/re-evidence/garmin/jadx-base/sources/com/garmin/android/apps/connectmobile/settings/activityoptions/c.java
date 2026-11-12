package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.DialogInterface;
import android.widget.NumberPicker;
import hg1.j;

/* JADX INFO: loaded from: classes10.dex */
public class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f41721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f41722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f41723c;

    public c(d dVar, NumberPicker numberPicker, NumberPicker numberPicker2) {
        this.f41723c = dVar;
        this.f41721a = numberPicker;
        this.f41722b = numberPicker2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int value;
        int value2;
        d dVar = this.f41723c;
        j jVar = dVar.f41725b;
        j jVar2 = j.ALERT_TYPE_VIRTUAL_PACER;
        NumberPicker numberPicker = this.f41722b;
        NumberPicker numberPicker2 = this.f41721a;
        if (jVar == jVar2) {
            value = numberPicker2.getValue() * 60;
            value2 = numberPicker.getValue() * 5;
        } else {
            value = numberPicker2.getValue() * 60;
            value2 = numberPicker.getValue() * 30;
        }
        dVar.f41724a.b(value2 + value);
        dialogInterface.dismiss();
    }
}
