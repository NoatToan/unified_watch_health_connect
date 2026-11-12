package com.garmin.android.apps.connectmobile.liveeventsharing.ui;

import android.os.Bundle;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.a2;
import r22.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/g;", "Lr22/f0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends f0 {
    public static final a W0 = new a(null);

    @Override // r22.a2
    public final void y6() {
        Bundle arguments = getArguments();
        int i14 = arguments != null ? arguments.getInt("EXTRA_SECONDS", 0) : 0;
        NumberPicker numberPicker = this.f149556c;
        if (i14 < 3600) {
            a2.S6(numberPicker, 2, 59, true);
            a2.S6(this.f149557d, 0, 59, true);
        } else {
            a2.S6(numberPicker, 0, 0, true);
            a2.S6(this.f149557d, 0, 0, true);
        }
    }

    @Override // r22.a2
    public final void z6(NumberPicker numberPicker, int i14, int i15) {
        if (numberPicker.getId() == R.id.nr_picker_1) {
            NumberPicker numberPicker2 = this.f149556c;
            if (i15 == 0) {
                a2.S6(numberPicker2, 2, 59, true);
                a2.S6(this.f149557d, 0, 59, true);
            } else {
                a2.S6(numberPicker2, 0, 0, true);
                a2.S6(this.f149557d, 0, 0, true);
            }
            int value = this.f149555b.getValue();
            this.X = value;
            this.f149565k0 = w6(this.f149555b, value);
            int value2 = this.f149556c.getValue();
            this.Y = value2;
            this.H0 = w6(this.f149556c, value2);
            int value3 = this.f149557d.getValue();
            this.Z = value3;
            this.I0 = w6(this.f149557d, value3);
            M6();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/g$a;", "", "<init>", "()V", "", "MIN_VALUE_MINUTES", "I", "MAX_VALUE_HOURS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
