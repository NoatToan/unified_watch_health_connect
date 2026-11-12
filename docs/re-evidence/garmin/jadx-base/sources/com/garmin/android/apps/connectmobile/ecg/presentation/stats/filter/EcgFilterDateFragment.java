package com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import aq.s1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import d10.b;
import e23.l;
import java.util.Calendar;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pf0.s;
import r22.c0;
import rf0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/filter/EcgFilterDateFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgFilterDateFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b<a> f34909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f34910b;

    public EcgFilterDateFragment() {
        super(R.layout.ecg_filter_date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f34909a = (b) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f34910b = new s(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        b<a> bVar = this.f34909a;
        if (bVar == null) {
            p005kotlin.jvm.internal.s.m("filterDataListener");
            throw null;
        }
        a aVarO = bVar.O();
        aVarO.getClass();
        final a aVar = aVarO;
        LocalDate localDate = new LocalDate(2021, 1, 1);
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        final GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) view2.findViewById(R.id.filter_beginning_date);
        s sVar = this.f34910b;
        if (sVar == null) {
            p005kotlin.jvm.internal.s.m("formatter");
            throw null;
        }
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(sVar.d(aVar.f152390c));
        gCMComplexTwoLineButton.setOnClickListener(new rf0.b(this, localDate, aVar, localDateNow, gCMComplexTwoLineButton));
        final int i14 = 0;
        gCMComplexTwoLineButton.setSecondActionOnClickListener(new View.OnClickListener() { // from class: rf0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        aVar.f152390c = null;
                        s sVar2 = this.f34910b;
                        if (sVar2 == null) {
                            p005kotlin.jvm.internal.s.m("formatter");
                            throw null;
                        }
                        String strD = sVar2.d(null);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = gCMComplexTwoLineButton;
                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(strD);
                        gCMComplexTwoLineButton2.setButtonRightLabel((String) null);
                        return;
                    default:
                        aVar.f152391d = null;
                        s sVar3 = this.f34910b;
                        if (sVar3 == null) {
                            p005kotlin.jvm.internal.s.m("formatter");
                            throw null;
                        }
                        String strD2 = sVar3.d(null);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = gCMComplexTwoLineButton;
                        gCMComplexTwoLineButton3.setButtonBottomLeftLabel(strD2);
                        gCMComplexTwoLineButton3.setButtonRightLabel((String) null);
                        return;
                }
            }
        });
        v6(gCMComplexTwoLineButton, aVar.f152390c != null);
        final GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) view2.findViewById(R.id.filter_ending_date);
        s sVar2 = this.f34910b;
        if (sVar2 == null) {
            p005kotlin.jvm.internal.s.m("formatter");
            throw null;
        }
        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(sVar2.d(aVar.f152391d));
        gCMComplexTwoLineButton2.setOnClickListener(new rf0.b(this, aVar, localDate, localDateNow, gCMComplexTwoLineButton2));
        final int i15 = 1;
        gCMComplexTwoLineButton2.setSecondActionOnClickListener(new View.OnClickListener() { // from class: rf0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        aVar.f152390c = null;
                        s sVar3 = this.f34910b;
                        if (sVar3 == null) {
                            p005kotlin.jvm.internal.s.m("formatter");
                            throw null;
                        }
                        String strD = sVar3.d(null);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = gCMComplexTwoLineButton2;
                        gCMComplexTwoLineButton3.setButtonBottomLeftLabel(strD);
                        gCMComplexTwoLineButton3.setButtonRightLabel((String) null);
                        return;
                    default:
                        aVar.f152391d = null;
                        s sVar4 = this.f34910b;
                        if (sVar4 == null) {
                            p005kotlin.jvm.internal.s.m("formatter");
                            throw null;
                        }
                        String strD2 = sVar4.d(null);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = gCMComplexTwoLineButton2;
                        gCMComplexTwoLineButton4.setButtonBottomLeftLabel(strD2);
                        gCMComplexTwoLineButton4.setButtonRightLabel((String) null);
                        return;
                }
            }
        });
        v6(gCMComplexTwoLineButton2, aVar.f152391d != null);
    }

    public final void u6(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, l<? super LocalDate, Unit> lVar) {
        long millis = localDate.toDateTimeAtStartOfDay().getMillis();
        long millis2 = c0.a(localDate2.toDateTimeAtStartOfDay()).getMillis();
        Calendar calendar = Calendar.getInstance();
        if (localDate3 != null) {
            calendar.setTime(localDate3.toDate());
        }
        new c0(requireContext(), millis, millis2, calendar, new s1(lVar, 13)).show();
    }

    public final void v6(GCMComplexTwoLineButton gCMComplexTwoLineButton, boolean z14) {
        gCMComplexTwoLineButton.setButtonRightLabel(z14 ? getString(R.string.lbl_remove_date) : null);
    }
}
