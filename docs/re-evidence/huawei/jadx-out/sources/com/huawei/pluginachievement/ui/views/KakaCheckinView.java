package com.huawei.pluginachievement.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.KakaCheckinRecord;
import defpackage.njy;
import defpackage.osa;
import defpackage.pap;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class KakaCheckinView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private KakaCheckinItemView f22290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private KakaCheckinItemView f22292c;
    private KakaCheckinItemView d;
    private KakaCheckinItemView e;
    private List<KakaCheckinItemView> h;

    public KakaCheckinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new ArrayList(7);
        this.f22291b = context;
        e();
    }

    private void e() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.kaka_checkin_layout, this);
        KakaCheckinItemView kakaCheckinItemView = (KakaCheckinItemView) viewInflate.findViewById(R.id.checkin_date_first);
        this.e = kakaCheckinItemView;
        kakaCheckinItemView.setAlpha(0.5f);
        this.f22292c = (KakaCheckinItemView) viewInflate.findViewById(R.id.checkin_date_second);
        this.d = (KakaCheckinItemView) viewInflate.findViewById(R.id.checkin_date_third);
        this.f22290a = (KakaCheckinItemView) viewInflate.findViewById(R.id.checkin_date_fourth);
        this.h.add(this.e);
        this.h.add(this.f22292c);
        this.h.add(this.d);
        this.h.add(this.f22290a);
        int iD = qrs.d(getContext(), 10.0f);
        if (qrs.a(3.1f)) {
            LogUtil.a("KakaCheckinView", "isLargeScaledDensityMode wide = ", 5);
            iD = qrs.d(getContext(), 5.0f);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iD, qrs.d(getContext(), qrs.d(getContext(), 1.0f)));
        viewInflate.findViewById(R.id.itemStoneFirst).setLayoutParams(layoutParams);
        viewInflate.findViewById(R.id.itemStoneSecond).setLayoutParams(layoutParams);
        viewInflate.findViewById(R.id.itemStoneThird).setLayoutParams(layoutParams);
    }

    public int a(List<KakaCheckinRecord> list) {
        if (njy.e(list)) {
            LogUtil.j("KakaCheckinView", "check record is empty");
            return 0;
        }
        LogUtil.a("KakaCheckinView", "check in records = ", Integer.valueOf(list.size()));
        b();
        return c(list);
    }

    private void b() {
        String strD;
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < this.h.size(); i++) {
            KakaCheckinItemView kakaCheckinItemView = this.h.get(i);
            if (i == 1) {
                strD = this.f22291b.getString(R.string.IDS_detail_sleep_bottom_btu_day_txt);
                kakaCheckinItemView.setDateTextColor(R.color.hw_achieve_medal_color_white);
            } else if (i == 0) {
                strD = UnitUtil.d("M/d", jCurrentTimeMillis - 86400000);
            } else if (i == 2) {
                strD = UnitUtil.d("M/d", 86400000 + jCurrentTimeMillis);
            } else {
                strD = UnitUtil.d("M/d", (((long) (i - 1)) * 86400000) + jCurrentTimeMillis);
            }
            kakaCheckinItemView.setDate(strD);
        }
    }

    private int c(List<KakaCheckinRecord> list) {
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            KakaCheckinRecord kakaCheckinRecord = list.get(i);
            int iD = d(kakaCheckinRecord.getRecordDay());
            LogUtil.a("KakaCheckinView", "check in recordTemp = ", Integer.valueOf(kakaCheckinRecord.getConDays()), "   ", kakaCheckinRecord.getRecordDay());
            if (iD >= 0 && iD < this.h.size()) {
                KakaCheckinItemView kakaCheckinItemView = this.h.get(iD);
                if (iD <= 1) {
                    if (kakaCheckinRecord.getConDays() > 0) {
                        iMax = Math.max(iMax, kakaCheckinRecord.getConDays());
                        kakaCheckinItemView.setCheckeinStatus(kakaCheckinRecord.getKaka(), true);
                    } else {
                        kakaCheckinItemView.setCheckeinStatus(kakaCheckinRecord.getKaka(), false);
                    }
                    if (iD == 1 && kakaCheckinRecord.getConDays() > 0) {
                        LogUtil.a("KakaCheckinView", "CheckedIn:date == " + kakaCheckinRecord.getRecordDay());
                        osa.b(this.f22291b, "kakaLastCheckInTime", kakaCheckinRecord.getRecordDay());
                        osa.b(this.f22291b, "kakaCheckedDays", String.valueOf(iMax));
                    }
                } else {
                    kakaCheckinItemView.setCheckeinStatus(kakaCheckinRecord.getKaka(), false);
                }
            }
        }
        return iMax;
    }

    private int d(String str) {
        return (int) (((pap.d(str) + 86400000) - qrk.c(System.currentTimeMillis(), 0)) / 86400000);
    }
}
