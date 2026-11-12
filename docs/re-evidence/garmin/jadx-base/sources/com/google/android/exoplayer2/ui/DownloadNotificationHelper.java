package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.exoplayer2.offline.Download;
import java.util.List;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes14.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final q notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new q(context.getApplicationContext(), str);
    }

    private Notification buildEndStateNotification(Context context, int i14, PendingIntent pendingIntent, String str, int i15) {
        return buildNotification(context, i14, pendingIntent, str, i15, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i14, PendingIntent pendingIntent, String str, int i15, int i16, int i17, boolean z14, boolean z15, boolean z16) {
        q qVar = this.notificationBuilder;
        qVar.N.icon = i14;
        o oVar = null;
        qVar.g(i15 == 0 ? null : context.getResources().getString(i15));
        q qVar2 = this.notificationBuilder;
        qVar2.f202686h = pendingIntent;
        if (str != null) {
            oVar = new o();
            oVar.f202664e = q.e(str);
        }
        qVar2.l(oVar);
        q qVar3 = this.notificationBuilder;
        qVar3.f202697s = i16;
        qVar3.f202698t = i17;
        qVar3.f202699u = z14;
        qVar3.i(2, z15);
        q qVar4 = this.notificationBuilder;
        qVar4.f202692n = z16;
        return qVar4.c();
    }

    public Notification buildDownloadCompletedNotification(Context context, int i14, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i14, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i14, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i14, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_failed);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    public Notification buildProgressNotification(Context context, int i14, PendingIntent pendingIntent, String str, List<Download> list, int i15) {
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        boolean z15;
        float percentDownloaded;
        boolean z16;
        float f14 = 0.0f;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z24 = false;
        boolean z25 = false;
        int i24 = 0;
        boolean z26 = true;
        for (int i25 = 0; i25 < list.size(); i25++) {
            Download download = list.get(i25);
            int i26 = download.state;
            if (i26 == 0) {
                z19 = true;
            } else if (i26 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f14 += percentDownloaded;
                    z26 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z24 |= z16;
                i24++;
                z18 = true;
            } else if (i26 == 5) {
                z25 = true;
            } else if (i26 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f14 += percentDownloaded;
                    z26 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z24 |= z16;
                i24++;
                z18 = true;
            }
        }
        if (!z18) {
            if (!z19 || i15 == 0) {
                if (z25) {
                    i17 = com.google.android.exoplayer2.core.R.string.exo_download_removing;
                } else {
                    i16 = 0;
                }
                z14 = true;
            } else {
                i16 = (i15 & 2) != 0 ? com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi : (i15 & 1) != 0 ? com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network : com.google.android.exoplayer2.core.R.string.exo_download_paused;
                z14 = false;
            }
            if (z14) {
                if (z18) {
                    int i27 = (int) (f14 / i24);
                    if (z26 && z24) {
                        z17 = true;
                    }
                    i19 = i27;
                    z15 = z17;
                } else {
                    i19 = 0;
                    z15 = true;
                }
                i18 = 100;
            } else {
                i18 = 0;
                i19 = 0;
                z15 = false;
            }
            return buildNotification(context, i14, pendingIntent, str, i16, i18, i19, z15, true, false);
        }
        i17 = com.google.android.exoplayer2.core.R.string.exo_download_downloading;
        i16 = i17;
        z14 = true;
        if (z14) {
            if (z18) {
                int i28 = (int) (f14 / i24);
                if (z26) {
                    z17 = true;
                }
                i19 = i28;
                z15 = z17;
            } else {
                i19 = 0;
                z15 = true;
            }
            i18 = 100;
        } else {
            i18 = 0;
            i19 = 0;
            z15 = false;
        }
        return buildNotification(context, i14, pendingIntent, str, i16, i18, i19, z15, true, false);
    }

    @Deprecated
    public Notification buildProgressNotification(Context context, int i14, PendingIntent pendingIntent, String str, List<Download> list) {
        return buildProgressNotification(context, i14, pendingIntent, str, list, 0);
    }
}
