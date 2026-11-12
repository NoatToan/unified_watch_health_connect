package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53266b;

    public /* synthetic */ c(Object obj, int i14) {
        this.f53265a = i14;
        this.f53266b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i14, boolean z14) {
        switch (this.f53265a) {
            case 0:
                ((TimePickerTextInputPresenter) this.f53266b).lambda$setupPeriodToggle$0(materialButtonToggleGroup, i14, z14);
                break;
            default:
                ((TimePickerView) this.f53266b).lambda$new$0(materialButtonToggleGroup, i14, z14);
                break;
        }
    }
}
