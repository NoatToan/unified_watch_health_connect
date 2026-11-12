package com.huawei.hianalytics;

import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.media.controller.MediaControlCenter;
import com.huawei.media.controller.MediaEventFilter;
import com.huawei.media.controller.MediaPlayerInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {
    public q1 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11592a = new HashMap();
    public boolean e = false;
    public String f = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaControlCenter f11593b = MediaControlCenter.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f11594c = new n1(this);

    public final void a() {
        try {
            List<MediaPlayerInfo> playerInfoList = this.f11593b.getPlayerInfoList();
            if (playerInfoList.isEmpty()) {
                playerInfoList = this.f11593b.getHistoryMediaPlayerInfoList();
            }
            this.f11592a.clear();
            for (MediaPlayerInfo mediaPlayerInfo : playerInfoList) {
                this.f11592a.put(mediaPlayerInfo.getPlayerId(), mediaPlayerInfo.getPackageName());
            }
        } catch (Exception unused) {
            HiLog.w("MediaHelper", "RPI Exception");
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.e) {
                HiLog.d("MediaHelper", "register: hasInit");
                return;
            }
            try {
                a();
                if (this.f11592a.isEmpty()) {
                    return;
                }
                d();
                c();
                this.e = true;
            } catch (Throwable th) {
                HiLog.w("MediaHelper", "register error: " + th.getMessage());
            }
        }
    }

    public final void c() {
        if (!j1.a().f11558a) {
            r1.b("1");
            return;
        }
        j1 j1VarA = j1.a();
        j1VarA.getClass();
        if (!j1VarA.q.contains(x0.b(EnvUtils.getAppContext()))) {
            r1.b("2");
            return;
        }
        MediaEventFilter mediaEventFilter = new MediaEventFilter();
        Iterator it = this.f11592a.keySet().iterator();
        while (it.hasNext()) {
            mediaEventFilter.addPlayerId((String) it.next());
        }
        mediaEventFilter.addEventType(20);
        mediaEventFilter.addEventType(3);
        mediaEventFilter.addEventType(11);
        mediaEventFilter.addEventType(4);
        this.f11593b.registerEventObserver(this.f11594c, mediaEventFilter);
        r1.b("0");
    }

    public final void d() {
        synchronized (this) {
            HiLog.d("MediaHelper", "unregister");
            if (this.e) {
                this.f11593b.unregisterEventObserver(this.f11594c);
            }
        }
    }
}
