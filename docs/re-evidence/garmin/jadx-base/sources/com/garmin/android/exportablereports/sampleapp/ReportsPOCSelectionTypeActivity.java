package com.garmin.android.exportablereports.sampleapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import bz0.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.exportablereports.sampleapp.ReportsPOCSelectionTypeActivity;
import d53.u;
import i.c;
import java.sql.Date;
import java.util.Calendar;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import pa2.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/exportablereports/sampleapp/ReportsPOCSelectionTypeActivity;", "Li/c;", "<init>", "()V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ReportsPOCSelectionTypeActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f49842a = 0;

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.er_poc_selection_style);
        final int i14 = 0;
        ((Button) findViewById(R.id.btn_report_download)).setOnClickListener(new View.OnClickListener(this) { // from class: va2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportsPOCSelectionTypeActivity f176656b;

            {
                this.f176656b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                ReportsPOCSelectionTypeActivity reportsPOCSelectionTypeActivity = this.f176656b;
                switch (i15) {
                    case 0:
                        int i16 = ReportsPOCSelectionTypeActivity.f49842a;
                        new b();
                        o.f22274a.getClass();
                        b.a(reportsPOCSelectionTypeActivity, new pa2.a("Weight", "weightReport", "https://connectapitest.garmin.com", o.b(), R.layout.er_loading_view, true, "en", null, null, u.v("Garmin_Weight", StringUtils.SPACE, "", false), null, null, 3456, null));
                        break;
                    default:
                        int i17 = ReportsPOCSelectionTypeActivity.f49842a;
                        new b();
                        Date date = new Date(Calendar.getInstance().getTimeInMillis());
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new java.util.Date());
                        calendar.add(6, -28);
                        Date date2 = new Date(calendar.getTimeInMillis());
                        o.f22274a.getClass();
                        b.a(reportsPOCSelectionTypeActivity, new pa2.a("Weight", "weightReport", "https://connectapitest.garmin.com", o.b(), R.layout.er_loading_view, true, "en", date2, date, u.v("Garmin_Weight", StringUtils.SPACE, "", false), null, null, 3072, null));
                        break;
                }
            }
        });
        final int i15 = 1;
        ((Button) findViewById(R.id.btn_report_download_predefined_dates)).setOnClickListener(new View.OnClickListener(this) { // from class: va2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportsPOCSelectionTypeActivity f176656b;

            {
                this.f176656b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                ReportsPOCSelectionTypeActivity reportsPOCSelectionTypeActivity = this.f176656b;
                switch (i16) {
                    case 0:
                        int i17 = ReportsPOCSelectionTypeActivity.f49842a;
                        new b();
                        o.f22274a.getClass();
                        b.a(reportsPOCSelectionTypeActivity, new pa2.a("Weight", "weightReport", "https://connectapitest.garmin.com", o.b(), R.layout.er_loading_view, true, "en", null, null, u.v("Garmin_Weight", StringUtils.SPACE, "", false), null, null, 3456, null));
                        break;
                    default:
                        int i18 = ReportsPOCSelectionTypeActivity.f49842a;
                        new b();
                        Date date = new Date(Calendar.getInstance().getTimeInMillis());
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new java.util.Date());
                        calendar.add(6, -28);
                        Date date2 = new Date(calendar.getTimeInMillis());
                        o.f22274a.getClass();
                        b.a(reportsPOCSelectionTypeActivity, new pa2.a("Weight", "weightReport", "https://connectapitest.garmin.com", o.b(), R.layout.er_loading_view, true, "en", date2, date, u.v("Garmin_Weight", StringUtils.SPACE, "", false), null, null, 3072, null));
                        break;
                }
            }
        });
    }
}
