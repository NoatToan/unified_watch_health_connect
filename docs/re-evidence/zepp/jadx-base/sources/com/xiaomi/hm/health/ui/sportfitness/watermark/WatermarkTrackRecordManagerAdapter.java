package com.xiaomi.hm.health.ui.sportfitness.watermark;

import com.huami.moving.datacenter.TrackRecordManager;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.TrackRecordManagerAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkTrackRecordManagerAdapter implements TrackRecordManagerAdapter {
    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.TrackRecordManagerAdapter
    public TrackRecordManagerAdapter.SimpleTrackRecord getTrackRecordById(long trackId, int deviceSource) {
        Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(trackId, deviceSource);
        TrackRecordManagerAdapter.SimpleTrackRecord simpleTrackRecord = new TrackRecordManagerAdapter.SimpleTrackRecord();
        if (trackRecordById == null) {
            return simpleTrackRecord;
        }
        simpleTrackRecord.setAltitudeAscend(trackRecordById.getAltitudeAscend());
        simpleTrackRecord.setAvghr(trackRecordById.getAvghr());
        simpleTrackRecord.setAvgStrideLength(trackRecordById.getAvgStrideLength());
        simpleTrackRecord.setCal(trackRecordById.getCal());
        simpleTrackRecord.setContoururi(trackRecordById.getContoururi());
        simpleTrackRecord.setCosttime(trackRecordById.getCosttime());
        simpleTrackRecord.setDistance(trackRecordById.getDistance());
        simpleTrackRecord.setFfpercent(trackRecordById.getFfpercent());
        simpleTrackRecord.setPace(trackRecordById.getPace());
        simpleTrackRecord.setSfreq(trackRecordById.getSfreq());
        simpleTrackRecord.setTotalStep(trackRecordById.getTotalStep());
        simpleTrackRecord.setTrackid(trackRecordById.getTrackid());
        return simpleTrackRecord;
    }
}
