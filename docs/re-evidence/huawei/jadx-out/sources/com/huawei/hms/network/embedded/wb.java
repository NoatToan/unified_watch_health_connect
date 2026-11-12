package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f15579a = 65536;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static vb f15580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f15581c;

    public static void a(vb vbVar) {
        if (vbVar.f != null || vbVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (vbVar.d) {
            return;
        }
        synchronized (wb.class) {
            long j = f15581c + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            if (j <= 65536) {
                f15581c = j;
                vbVar.f = f15580b;
                vbVar.f15548c = 0;
                vbVar.f15547b = 0;
                f15580b = vbVar;
            }
        }
    }

    public static vb a() {
        synchronized (wb.class) {
            vb vbVar = f15580b;
            if (vbVar == null) {
                return new vb();
            }
            f15580b = vbVar.f;
            vbVar.f = null;
            f15581c -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return vbVar;
        }
    }
}
