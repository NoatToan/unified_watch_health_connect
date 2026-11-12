package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.devicesettings.base.worldclock.TimeZoneItem;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.eui;
import defpackage.zqi;

/* JADX INFO: loaded from: classes8.dex */
public class TimeZoneItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12049b;
    public TextView c;
    public TimeView d;
    public Context e;
    public final String f;

    public TimeZoneItemView(Context context) {
        this(context, null);
    }

    public void a(TimeZoneItem timeZoneItem) {
        this.f12048a.setText(timeZoneItem.c());
        this.f12049b.setText(timeZoneItem.h(this.e));
        this.d.setTimeZone(timeZoneItem.e);
        if (DateFormat.is24HourFormat(this.e)) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.c.setText(TimeDateUtil.getDateStr(timeZoneItem.e, "aa"));
    }

    public final void b() {
        this.f12048a = (TextView) findViewById(zqi.ha);
        this.f12049b = (TextView) findViewById(zqi.sa);
        this.d = (TimeView) findViewById(zqi.qa);
        this.c = (TextView) findViewById(zqi.N9);
    }

    public void setTimeVisible(int i) {
        this.d.setVisibility(i);
        this.c.setVisibility(i);
    }

    public TimeZoneItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeZoneItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(eui.f2, this);
        this.e = context;
        this.f = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toUpperCase();
        b();
    }
}
