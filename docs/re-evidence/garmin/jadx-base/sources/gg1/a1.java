package gg1;

import android.content.DialogInterface;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.activities.manual.ActivityDiveWaterTypesActivity;

/* JADX INFO: loaded from: classes10.dex */
public class a1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f77187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NumberPicker f77188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f77189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f77190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f77191e;

    public a1(b1 b1Var, NumberPicker numberPicker, NumberPicker numberPicker2, int i14, double d14) {
        this.f77191e = b1Var;
        this.f77187a = numberPicker;
        this.f77188b = numberPicker2;
        this.f77189c = i14;
        this.f77190d = d14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        NumberPicker numberPicker = this.f77187a;
        numberPicker.clearFocus();
        NumberPicker numberPicker2 = this.f77188b;
        numberPicker2.clearFocus();
        ((ActivityDiveWaterTypesActivity) this.f77191e.f77198a).ca((((double) (this.f77189c * numberPicker2.getValue())) / this.f77190d) + numberPicker.getValue());
        dialogInterface.dismiss();
    }
}
