package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup;

import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import lx0.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/f;", "Llx0/g;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f39172f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f39173g = f.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39174d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39175e = 100;

    @Override // lx0.g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((TextView) view2.findViewById(R.id.setup_question_text)).setText(getString(R.string.mct_how_long_do_your_periods));
        ((TextView) view2.findViewById(R.id.setup_description_text)).setText(getString(R.string.mct_period_length_description));
        NumberPicker numberPicker = (NumberPicker) view2.findViewById(R.id.item_picker);
        numberPicker.setValue(u6().f115192h);
        numberPicker.setOnValueChangedListener(new j42.a(this, 3));
    }

    @Override // lx0.g
    /* JADX INFO: renamed from: v6, reason: from getter */
    public final int getF39175e() {
        return this.f39175e;
    }

    @Override // lx0.g
    /* JADX INFO: renamed from: w6, reason: from getter */
    public final int getF39174d() {
        return this.f39174d;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/f$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
