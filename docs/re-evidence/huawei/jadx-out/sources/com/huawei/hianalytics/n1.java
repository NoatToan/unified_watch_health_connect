package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.media.controller.FavoriteStateData;
import com.huawei.media.controller.MediaEvent;
import com.huawei.media.controller.MediaEventObserver;
import com.huawei.media.controller.MediaMetadata;
import com.huawei.media.controller.MediaPlayerInfo;
import com.huawei.media.controller.MediaPlayerInfoData;
import com.huawei.media.controller.PlaybackStateData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements MediaEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f11588a;

    public n1(p1 p1Var) {
        this.f11588a = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0232 A[LOOP:1: B:129:0x0232->B:135:0x0260, LOOP_START, PHI: r3 r10
      0x0232: PHI (r3v15 int) = (r3v25 int), (r3v16 int) binds: [B:127:0x022f, B:135:0x0260] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r10v5 long) = (r10v2 long), (r10v6 long) binds: [B:127:0x022f, B:135:0x0260] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x023b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0248  */
    /* JADX WARN: Code duplicated, block: B:144:0x0290  */
    /* JADX WARN: Code duplicated, block: B:173:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ca, code lost:
    
        if (r9 != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f4, code lost:
    
        if (r6.contains(r12) != false) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onEvent(MediaEvent mediaEvent) {
        boolean zEquals;
        l1 l1Var;
        j1 j1VarA;
        l1 l1Var2;
        MediaPlayerInfoData data;
        List mediaPlayerInfos;
        if (mediaEvent == null || mediaEvent.getData() == null) {
            return;
        }
        p1 p1Var = this.f11588a;
        p1Var.getClass();
        if ((mediaEvent.getData() instanceof MediaPlayerInfoData) && (data = mediaEvent.getData()) != null && (mediaPlayerInfos = data.getMediaPlayerInfos()) != null && !mediaPlayerInfos.isEmpty()) {
            p1Var.f11592a.clear();
            for (MediaPlayerInfo mediaPlayerInfo : data.getMediaPlayerInfos()) {
                p1Var.f11592a.put(mediaPlayerInfo.getPlayerId(), mediaPlayerInfo.getPackageName());
            }
            p1Var.c();
        }
        if (p1Var.f11592a.get(mediaEvent.getPlayerId()) != null) {
            p1Var.f = (String) p1Var.f11592a.get(mediaEvent.getPlayerId());
        }
        if (TextUtils.isEmpty(p1Var.f)) {
            return;
        }
        j1 j1VarA2 = j1.a();
        String str = p1Var.f;
        if (j1VarA2.p.isEmpty() || j1VarA2.p.contains(str)) {
            if (mediaEvent.getData() instanceof FavoriteStateData) {
                p1Var.d.f11604b.i = mediaEvent.getData().getState();
                return;
            }
            if (!(mediaEvent.getData() instanceof MediaMetadata)) {
                if (mediaEvent.getData() instanceof PlaybackStateData) {
                    p1Var.d.f11604b.l.add(new k1(mediaEvent.getData().getState() == 1, System.currentTimeMillis()));
                    return;
                }
                return;
            }
            MediaMetadata data2 = mediaEvent.getData();
            if (data2 == null) {
                return;
            }
            String string = "";
            String string2 = data2.getString("media.metadata.title") != null ? data2.getString("media.metadata.title") : "";
            String string3 = data2.getString("media.metadata.artist") != null ? data2.getString("media.metadata.artist") : "";
            String string4 = data2.getString("media.metadata.album") != null ? data2.getString("media.metadata.album") : "";
            try {
                string = Long.toString(data2.getLong("media.metadata.duration"));
            } catch (Exception unused) {
            }
            j1 j1VarA3 = j1.a();
            j1VarA3.getClass();
            if (TextUtils.isEmpty(string2) || string2.length() >= j1VarA3.h) {
                r1.a("title", string2);
                return;
            }
            if (TextUtils.isEmpty(string3) || string3.length() >= j1VarA3.i) {
                r1.a("artist", string3);
                return;
            }
            if (!TextUtils.isEmpty(string4) && string4.length() >= j1VarA3.j) {
                r1.a(MusicSong.SORT_TYPE_ALBUM, string4);
                return;
            }
            q1 q1Var = p1Var.d;
            String str2 = p1Var.f;
            q1Var.getClass();
            long j = 0;
            if (!j1.a().m) {
                if (TextUtils.equals(string2, q1Var.f11604b.f11578c) && TextUtils.equals(string3, q1Var.f11604b.d)) {
                    zEquals = TextUtils.equals(str2, q1Var.f11604b.j);
                }
                HiLog.d("MPL", "is diff mc");
                q1Var.f11603a.removeMessages(8);
                q1Var.f11603a.sendEmptyMessageDelayed(8, j1.a().n);
                q1Var.f11604b.l.add(new k1(true, System.currentTimeMillis()));
                l1Var = q1Var.f11604b;
                if (l1Var.l.size() > 1) {
                    for (int i = 0; i < l1Var.l.size() - 1; i++) {
                        if (!((k1) l1Var.l.get(i)).f11568a) {
                            j += ((k1) l1Var.l.get(i + 1)).f11569b - ((k1) l1Var.l.get(i)).f11569b;
                        }
                    }
                }
                l1Var.h = j;
                l1Var.l.clear();
                j1VarA = j1.a();
                String str3 = l1Var.j;
                if (j1VarA.s.isEmpty() || !(!j1VarA.s.contains(str3)) || l1Var.h >= j1.a().g) {
                    q1Var.a();
                }
                l1Var2 = q1Var.f11604b;
                l1Var2.f11578c = string2;
                l1Var2.d = string3;
                l1Var2.e = string;
                l1Var2.f = string4;
                l1Var2.j = str2;
                l1Var2.g = System.currentTimeMillis();
                if (!TextUtils.isEmpty(l1Var2.f11578c) && !TextUtils.isEmpty(l1Var2.d)) {
                    try {
                        l1Var2.f11577b = l1Var2.f11578c + "##" + l1Var2.d;
                    } catch (Exception unused2) {
                        HiLog.w("McInfo", "Integer Exception");
                    }
                }
                q1Var.f11604b.l.add(new k1(true, System.currentTimeMillis()));
            }
            if (TextUtils.equals(str2, q1Var.f11604b.j)) {
                l1 l1Var3 = q1Var.f11604b;
                String str4 = l1Var3.d;
                long j2 = Long.parseLong(l1Var3.e);
                if (TextUtils.equals(string3, str4) || (string3 != null && str4 != null && string3.contains(str4))) {
                    long j3 = Long.parseLong(string);
                    if (j3 == 60000 || j2 == 60000) {
                        String str5 = q1Var.f11604b.f11578c;
                        if (!TextUtils.equals(string2, str5)) {
                            if (!TextUtils.isEmpty(string3)) {
                                if (!TextUtils.isEmpty(str5)) {
                                    if (!TextUtils.isEmpty(str4)) {
                                        if (string3.contains(str5)) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        long jAbs = Math.abs(j3 - j2);
                        Object[] objArr = j3 <= 0 || j2 <= 0;
                        Object[] objArr2 = jAbs < 1000;
                        if (objArr == false && objArr2 == false) {
                            zEquals = TextUtils.equals(string2, q1Var.f11604b.f11578c);
                        }
                    }
                    l1 l1Var4 = q1Var.f11604b;
                    l1Var4.e = string;
                    l1Var4.f = string4;
                    return;
                }
            }
            HiLog.d("MPL", "is diff mc");
            q1Var.f11603a.removeMessages(8);
            q1Var.f11603a.sendEmptyMessageDelayed(8, j1.a().n);
            q1Var.f11604b.l.add(new k1(true, System.currentTimeMillis()));
            l1Var = q1Var.f11604b;
            if (l1Var.l.size() > 1) {
                while (i < l1Var.l.size() - 1) {
                    if (!((k1) l1Var.l.get(i)).f11568a) {
                        j += ((k1) l1Var.l.get(i + 1)).f11569b - ((k1) l1Var.l.get(i)).f11569b;
                    }
                }
            }
            l1Var.h = j;
            l1Var.l.clear();
            j1VarA = j1.a();
            String str6 = l1Var.j;
            if (j1VarA.s.isEmpty()) {
                q1Var.a();
            } else {
                q1Var.a();
            }
            l1Var2 = q1Var.f11604b;
            l1Var2.f11578c = string2;
            l1Var2.d = string3;
            l1Var2.e = string;
            l1Var2.f = string4;
            l1Var2.j = str2;
            l1Var2.g = System.currentTimeMillis();
            if (!TextUtils.isEmpty(l1Var2.f11578c)) {
                l1Var2.f11577b = l1Var2.f11578c + "##" + l1Var2.d;
            }
            q1Var.f11604b.l.add(new k1(true, System.currentTimeMillis()));
        }
    }
}
