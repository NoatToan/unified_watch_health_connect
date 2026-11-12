package com.garmin.android.apps.connectmobile;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m1 extends androidx.fragment.app.i {
    @Override // androidx.fragment.app.i
    public void show(androidx.fragment.app.v vVar, String str) {
        if (isVisible()) {
            i2.j("GCMFragDialog", "Fragment already added.");
        } else {
            super.show(vVar, str);
        }
    }
}
