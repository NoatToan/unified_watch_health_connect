package androidx.media3.exoplayer.offline;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.R;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        boolean z2;
        int i8;
        float percentDownloaded;
        boolean z3;
        float f = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = true;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Download download = list.get(i10);
            int i11 = download.state;
            if (i11 == 0) {
                z6 = true;
            } else if (i11 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z8 |= z3;
                i9++;
                z5 = true;
            } else if (i11 == 5) {
                z7 = true;
            } else if (i11 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z8 |= z3;
                i9++;
                z5 = true;
            }
        }
        if (z5) {
            i3 = R.string.exo_download_downloading;
        } else {
            if (!z6 || i2 == 0) {
                i3 = z7 ? R.string.exo_download_removing : 0;
            } else {
                if ((i2 & 2) != 0) {
                    i4 = R.string.exo_download_paused_for_wifi;
                } else if ((i2 & 1) != 0) {
                    i4 = R.string.exo_download_paused_for_network;
                } else {
                    i4 = R.string.exo_download_paused;
                }
                i5 = i4;
                z = false;
            }
            if (z) {
                if (z5) {
                    i8 = (int) (f / i9);
                    if (z9 && z8) {
                    }
                    i7 = i8;
                    z2 = z4;
                    i6 = 100;
                } else {
                    i8 = 0;
                }
                z4 = true;
                i7 = i8;
                z2 = z4;
                i6 = 100;
            } else {
                i6 = 0;
                i7 = 0;
                z2 = false;
            }
            return buildNotification(context, i, pendingIntent, str, i5, i6, i7, z2, true, false);
        }
        i5 = i3;
        z = true;
        if (z) {
            if (z5) {
                i8 = (int) (f / i9);
                if (z9) {
                }
                i7 = i8;
                z2 = z4;
                i6 = 100;
            } else {
                i8 = 0;
            }
            z4 = true;
            i7 = i8;
            z2 = z4;
            i6 = 100;
        } else {
            i6 = 0;
            i7 = 0;
            z2 = false;
        }
        return buildNotification(context, i, pendingIntent, str, i5, i6, i7, z2, true, false);
    }

    public Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, R.string.exo_download_failed);
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        if (Util.SDK_INT >= 31) {
            Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.build();
    }

    static final class Api31 {
        private Api31() {
        }

        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }
}
