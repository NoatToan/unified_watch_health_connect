package com.huami.moving.ui.sport.in;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.widget.RemoteViews;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.mifit.sportlib.services.util.SportNotification;
import com.huami.moving.R;
import com.huami.moving.ui.utils.RomIdentify;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.utils.Utils;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationForSporting implements SportNotification.NotificationInfoInitializer {
    private static volatile NotificationForSporting o;
    private RemoteViews c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private String k;
    private Notification l;
    private final int a = 60;
    private int b = 0;
    private boolean m = false;
    private int n = 0;

    private NotificationForSporting() {
    }

    private Notification a(Context context) {
        Intent intent = new Intent(context, (Class<?>) GPSMainActivity.class);
        intent.setFlags(268435456);
        int i = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.layout_notification_sporting);
        this.c = remoteViews;
        int i2 = R.id.sporting_notification;
        remoteViews.setOnClickPendingIntent(i2, activity);
        if (RomIdentify.isUnknownOS() || RomIdentify.isVivo()) {
            int iDp2px = (int) ViewUtils.dp2px(context, 16.0f);
            this.n = iDp2px;
            this.c.setViewPadding(i2, iDp2px, 0, iDp2px, 0);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        String simpleName = NotificationForSporting.class.getSimpleName();
        if (i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(simpleName, context.getString(R.string.app_name), 2);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Notification.Builder when = new Notification.Builder(context).setContentIntent(activity).setSmallIcon(Utils.isMidong() ? R.drawable.app_icon_small : R.drawable.app_icon_small_life).setContent(this.c).setOngoing(true).setWhen(System.currentTimeMillis());
        if (i >= 26) {
            when.setChannelId(simpleName);
        }
        if (i >= 21) {
            when.setColor(Color.argb(255, 255, 90, 0));
        }
        return when.build();
    }

    private void b() {
        this.e = "00'00\"";
        this.f = "0.00";
        this.g = 0;
        this.h = "0.00";
        this.i = "--";
        this.j = "";
        this.k = "--";
    }

    public static NotificationForSporting getInstance() {
        if (o == null) {
            synchronized (NotificationForSporting.class) {
                if (o == null) {
                    o = new NotificationForSporting();
                }
            }
        }
        return o;
    }

    @Override // com.huami.mifit.sportlib.services.util.SportNotification.NotificationInfoInitializer
    public Notification initNotification(Context context) {
        b();
        this.m = true;
        Notification notificationA = a(context);
        this.l = notificationA;
        return notificationA;
    }

    public void reinitNotification(Context context) {
        this.m = true;
        this.l = a(context);
    }

    public void setAltitudeFmtValue(String str) {
        this.j = str;
    }

    public void setDistanceFmtValue(String str) {
        this.h = str;
    }

    public void setHrFmtValue(String str) {
        this.k = str;
    }

    public void setPaceFmtValue(String str) {
        this.e = str;
    }

    public void setSpeedFmtValue(String str) {
        this.f = str;
    }

    public void setStepFreqFmtValue(String str) {
        this.i = str;
    }

    public void setStepValue(int i) {
        this.g = i;
    }

    public void setTimeCostFmtValue(String str) {
        this.d = str;
    }

    public Notification updateNotification(Context context, int i, boolean z, boolean z2) {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 % 60 == 0 || this.l == null) {
            reinitNotification(context);
        }
        this.l.contentView.setTextViewText(R.id.label_value_1, this.d);
        if (this.m) {
            this.l.contentView.setTextViewText(R.id.label_unit_1, context.getString(R.string.running_time_desc));
        }
        if (i == 1) {
            this.l.contentView.setTextViewText(R.id.label_value_2, this.h);
            this.l.contentView.setTextViewText(R.id.label_value_3, this.e);
            if (this.m) {
                this.l.contentView.setTextViewText(R.id.label_unit_2, context.getString(z ? R.string.running_kilometer : R.string.running_mile));
                this.l.contentView.setTextViewText(R.id.label_unit_3, context.getString(z ? R.string.running_detail_pace1 : R.string.running_detail_pace_br1));
            }
        } else if (i == 6) {
            this.l.contentView.setTextViewText(R.id.label_value_2, this.h);
            this.l.contentView.setTextViewText(R.id.label_value_3, String.valueOf(this.g));
            if (this.m) {
                this.l.contentView.setTextViewText(R.id.label_unit_2, context.getString(z ? R.string.running_kilometer : R.string.running_mile));
                this.l.contentView.setTextViewText(R.id.label_unit_3, context.getResources().getQuantityString(R.plurals.unit_step, this.g));
            }
        } else if (i == 8) {
            if (z2) {
                this.l.contentView.setTextViewText(R.id.label_value_2, this.k);
            } else {
                this.l.contentView.setTextViewText(R.id.label_value_2, this.i);
            }
            this.l.contentView.setTextViewText(R.id.label_value_3, this.h);
            if (this.m) {
                if (z2) {
                    this.l.contentView.setTextViewText(R.id.label_unit_2, context.getString(R.string.hr_unit));
                } else {
                    this.l.contentView.setTextViewText(R.id.label_unit_2, context.getString(R.string.unit_pace_freq));
                }
                this.l.contentView.setTextViewText(R.id.label_unit_3, context.getString(z ? R.string.running_kilometer : R.string.running_mile));
            }
        } else if (i == 9) {
            this.l.contentView.setTextViewText(R.id.label_value_2, this.f);
            this.l.contentView.setTextViewText(R.id.label_value_3, this.h);
            if (this.m) {
                this.l.contentView.setTextViewText(R.id.label_unit_2, context.getString(z ? R.string.running_detail_speed1 : R.string.running_detail_speed_br1));
                this.l.contentView.setTextViewText(R.id.label_unit_3, context.getString(z ? R.string.running_kilometer : R.string.running_mile));
            }
        }
        this.m = false;
        SportNotification.getInstance().notifyRunningInfo(context, this.l);
        return this.l;
    }
}
