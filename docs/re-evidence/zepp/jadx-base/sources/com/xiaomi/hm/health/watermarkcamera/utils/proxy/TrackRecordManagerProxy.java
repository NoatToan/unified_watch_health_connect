package com.xiaomi.hm.health.watermarkcamera.utils.proxy;

import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.TrackRecordManagerAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class TrackRecordManagerProxy implements TrackRecordManagerAdapter {
    private TrackRecordManagerAdapter a;

    public static class a {
        private static final TrackRecordManagerProxy a = new TrackRecordManagerProxy();

        private a() {
        }
    }

    private TrackRecordManagerProxy() {
    }

    public static TrackRecordManagerProxy getInstance() {
        return a.a;
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.TrackRecordManagerAdapter
    public TrackRecordManagerAdapter.SimpleTrackRecord getTrackRecordById(long j, int i) {
        return this.a.getTrackRecordById(j, i);
    }

    public void setAdapter(TrackRecordManagerAdapter trackRecordManagerAdapter) {
        this.a = trackRecordManagerAdapter;
    }
}
