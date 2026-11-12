package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadNotificationHelper {

    @StringRes
    private static final int b = 0;
    private final NotificationCompat.Builder a;

    public DownloadNotificationHelper(Context context, String channelId) {
        this.a = new NotificationCompat.Builder(context.getApplicationContext(), channelId);
    }

    private Notification a(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message, @StringRes int titleStringId) {
        return b(context, smallIcon, contentIntent, message, titleStringId, 0, 0, false, false, true);
    }

    private Notification b(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message, @StringRes int titleStringId, int maxProgress, int currentProgress, boolean indeterminateProgress, boolean ongoing, boolean showWhen) {
        this.a.setSmallIcon(smallIcon);
        this.a.setContentTitle(titleStringId == 0 ? null : context.getResources().getString(titleStringId));
        this.a.setContentIntent(contentIntent);
        this.a.setStyle(message != null ? new NotificationCompat.BigTextStyle().bigText(message) : null);
        this.a.setProgress(maxProgress, currentProgress, indeterminateProgress);
        this.a.setOngoing(ongoing);
        this.a.setShowWhen(showWhen);
        return this.a.build();
    }

    public Notification buildDownloadCompletedNotification(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message) {
        return a(context, smallIcon, contentIntent, message, R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message) {
        return a(context, smallIcon, contentIntent, message, R.string.exo_download_failed);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    public Notification buildProgressNotification(Context context, @DrawableRes int smallIcon, @Nullable PendingIntent contentIntent, @Nullable String message, List<Download> downloads) {
        int i;
        int i2;
        int i3;
        boolean z;
        float f = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        boolean z4 = true;
        boolean z5 = false;
        for (int i5 = 0; i5 < downloads.size(); i5++) {
            Download download = downloads.get(i5);
            int i6 = download.state;
            if (i6 == 5) {
                z3 = true;
            } else if (i6 == 7 || i6 == 2) {
                float percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z4 = false;
                }
                z5 |= download.getBytesDownloaded() > 0;
                i4++;
                z2 = true;
            }
        }
        if (!z2) {
            if (z3) {
                i2 = R.string.exo_download_removing;
            } else {
                i = 0;
            }
            if (z2) {
                int i7 = (int) (f / i4);
                z = !z4 && z5;
                i3 = i7;
            } else {
                i3 = 0;
                z = true;
            }
            return b(context, smallIcon, contentIntent, message, i, 100, i3, z, true, false);
        }
        i2 = R.string.exo_download_downloading;
        i = i2;
        if (z2) {
            int i8 = (int) (f / i4);
            z = !z4 && z5;
            i3 = i8;
        } else {
            i3 = 0;
            z = true;
        }
        return b(context, smallIcon, contentIntent, message, i, 100, i3, z, true, false);
    }
}
