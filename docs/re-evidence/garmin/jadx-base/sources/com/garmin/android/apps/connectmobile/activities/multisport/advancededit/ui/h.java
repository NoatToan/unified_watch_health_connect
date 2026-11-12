package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar;
import f12.l;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r22.a1;
import r22.e1;
import yo.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/h;", "Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/b;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f29360p = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f29361o = p.DISTANCE;

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    /* JADX INFO: renamed from: C6, reason: from getter */
    public final p getF29361o() {
        return this.f29361o;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final void J6(int i14, int i15, int i16) {
        e1.Z.getClass();
        e1 e1VarA = e1.a.a(i14, i15, i16);
        e1VarA.Y = new yw2.h(this, 14);
        e1VarA.show(getChildFragmentManager(), "MinMaxDistancePickerFragment");
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final void u6(vo.b bVar) {
        A6().setButtonTopLabel(getString(R.string.leg_distance));
        TextView textView = this.f29316c;
        if (textView == null) {
            s.m("divideLegMetricLabel");
            throw null;
        }
        textView.setText(getString(R.string.divide_distance));
        LabelledValuesRangeProgressBar labelledValuesRangeProgressBarZ6 = z6();
        String string = getString(R.string.lbl_distance);
        string.getClass();
        int i14 = LabelledValuesRangeProgressBar.f47474k;
        labelledValuesRangeProgressBarZ6.k(new a1(labelledValuesRangeProgressBarZ6), string);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final String v6(int i14) {
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        l3.a aVar = l3.f23124b;
        DecimalFormat decimalFormat = l3.f23137o;
        aVar.getClass();
        return l3.a.Q(requireContext(), i14, decimalFormat, true, zY);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/h$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
