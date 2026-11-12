package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import android.content.Context;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r22.f1;
import yo.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/d;", "Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/a;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f29333t = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public oi0.h f29334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f29335r = p.TIME;

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    /* JADX INFO: renamed from: C6, reason: from getter */
    public final p getF29335r() {
        return this.f29335r;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final void J6(int i14, int i15, int i16) {
        String strG = e5.g(getString(R.string.leg_split_time), StringUtils.SPACE, getString(R.string.common_duration_format_label));
        f1.a aVar = f1.f149645b1;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        f1 f1VarA = f1.a.a(aVar, i14, i15, i16, strG, oi0.c.A(contextRequireContext, new z81.b(19), strG), 456);
        f1VarA.V0 = new zo.h(this, 0);
        f1VarA.show(getChildFragmentManager(), "MinMaxDurationPickerFragment");
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final void K6(int i14) {
        super.K6(i14);
        GCMComplexTwoLineButton gCMComplexTwoLineButtonA6 = A6();
        String strV6 = v6(i14);
        oi0.h hVar = this.f29334q;
        if (hVar != null) {
            gCMComplexTwoLineButtonA6.b(strV6, hVar.d(i14, true));
        } else {
            s.m("gcmContentDescriptionTimeFormatter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f29334q = new oi0.h(context);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final void u6(vo.b bVar) {
        A6().setButtonTopLabel(getString(R.string.lbl_multisport_leg_time));
        TextView textView = this.f29316c;
        if (textView == null) {
            s.m("divideLegMetricLabel");
            throw null;
        }
        textView.setText(getString(R.string.divide_duration));
        GCMComplexTwoLineButton gCMComplexTwoLineButtonA6 = A6();
        int i14 = bVar.f178994c;
        String strV6 = v6(i14);
        oi0.h hVar = this.f29334q;
        if (hVar == null) {
            s.m("gcmContentDescriptionTimeFormatter");
            throw null;
        }
        gCMComplexTwoLineButtonA6.b(strV6, hVar.d(i14, true));
        LabelledValuesRangeProgressBar labelledValuesRangeProgressBarZ6 = z6();
        String string = getString(R.string.lbl_time);
        string.getClass();
        labelledValuesRangeProgressBarZ6.k(new zo.h(this, 1), string);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.b
    public final String v6(int i14) {
        l3.f23124b.getClass();
        String strE1 = l3.a.e1(i14);
        return strE1 == null ? "" : strE1;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/d$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
