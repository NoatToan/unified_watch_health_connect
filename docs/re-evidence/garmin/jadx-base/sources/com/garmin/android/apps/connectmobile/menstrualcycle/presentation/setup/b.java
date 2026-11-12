package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup;

import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;
import lx0.g;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p006l2.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/b;", "Llx0/g;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f39112g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39113h = f.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f39114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f39115e = m.b(new v0(this, 16));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39116f = 365;

    @Override // lx0.g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.setup_help_text);
        viewFindViewById.getClass();
        this.f39114d = (TextView) viewFindViewById;
        ((TextView) view2.findViewById(R.id.setup_question_text)).setText(getString(R.string.mct_how_long_does_your_cycle));
        ((TextView) view2.findViewById(R.id.setup_description_text)).setText(getString(R.string.mct_cycle_length_setup_description));
        y6(u6().f115193i);
        NumberPicker numberPicker = (NumberPicker) view2.findViewById(R.id.item_picker);
        numberPicker.setValue(u6().f115193i);
        numberPicker.setOnValueChangedListener(new j42.a(this, 2));
    }

    @Override // lx0.g
    /* JADX INFO: renamed from: v6, reason: from getter */
    public final int getF39175e() {
        return this.f39116f;
    }

    @Override // lx0.g
    /* JADX INFO: renamed from: w6 */
    public final int getF39174d() {
        return ((Number) this.f39115e.getValue()).intValue();
    }

    public final void y6(int i14) {
        String string;
        NumberFormat numberFormat = NumberFormat.getInstance();
        TextView textView = this.f39114d;
        if (textView == null) {
            s.m("setupHelpText");
            throw null;
        }
        if (i14 < 20) {
            string = getString(R.string.mct_fertile_window_pred_off_less, numberFormat.format((Object) 20));
        } else if (46 > i14 || i14 >= 101) {
            string = i14 > 100 ? getString(R.string.mct_period_fertile_window_pred_off_more, numberFormat.format((Object) 100)) : "";
        } else {
            string = getString(R.string.mct_fertile_window_pred_off_more, numberFormat.format((Object) 45));
        }
        textView.setText(string);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/b$a;", "", "<init>", "()V", "", "LOWER_LIMIT", "I", "MID_LIMIT", "UPPER_LIMIT", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
