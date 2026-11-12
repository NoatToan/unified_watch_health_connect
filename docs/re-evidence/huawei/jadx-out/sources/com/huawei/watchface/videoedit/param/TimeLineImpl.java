package com.huawei.watchface.videoedit.param;

import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class TimeLineImpl implements ItimeLine {
    private long mCurrentTime;
    private boolean mIsSaveMode;
    private TimeLineStatus mPendingStatus;
    private long mStartBaseTime;
    private long saveTime;
    TimeLineStatus status;

    public enum TimeLineStatus {
        INIT,
        ACTIVE,
        SEEKING,
        PAUSE
    }

    public TimeLineImpl() {
        TimeLineStatus timeLineStatus = TimeLineStatus.INIT;
        this.saveTime = 0L;
        this.status = timeLineStatus;
        this.mStartBaseTime = 0L;
        this.mCurrentTime = 0L;
    }

    public void dump() {
        HwLog.d(HwLog.TAG, "save mode ? " + this.mIsSaveMode + ", status: " + this.status + ", CurrentTime : " + this.mCurrentTime + " mStartBaseTime : " + this.mStartBaseTime);
    }

    @Override // com.huawei.watchface.videoedit.param.ItimeLine
    public long getCurrentTime() {
        if (this.mIsSaveMode) {
            return this.saveTime;
        }
        int iOrdinal = this.status.ordinal();
        if (iOrdinal == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.mStartBaseTime;
            this.mCurrentTime = jCurrentTimeMillis;
            return jCurrentTimeMillis;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return this.mCurrentTime;
        }
        return 0L;
    }

    public void increasByFixTime(long j) {
        this.saveTime += j;
    }

    @Override // com.huawei.watchface.videoedit.param.ItimeLine
    public void pause() {
        HwLog.d(HwLog.TAG, "Pause CurrentTime is " + this.mCurrentTime + " mStartBaseTime is " + this.mStartBaseTime + " status is " + this.status);
        TimeLineStatus timeLineStatus = this.status;
        if (timeLineStatus == TimeLineStatus.ACTIVE) {
            this.status = TimeLineStatus.PAUSE;
            this.mCurrentTime = System.currentTimeMillis() - this.mStartBaseTime;
        } else if (timeLineStatus == TimeLineStatus.SEEKING) {
            this.mPendingStatus = TimeLineStatus.PAUSE;
        } else {
            HwLog.d(HwLog.TAG, "other case");
        }
        HwLog.d(HwLog.TAG, "Pause CurrentTime is " + this.mCurrentTime + " mStartBaseTime is " + this.mStartBaseTime + " status is " + this.status);
    }

    @Override // com.huawei.watchface.videoedit.param.ItimeLine
    public void reset() {
        HwLog.e(HwLog.TAG, "pause and seek reset");
        this.status = TimeLineStatus.INIT;
        this.mStartBaseTime = 0L;
        this.mCurrentTime = 0L;
        this.mIsSaveMode = false;
    }

    @Override // com.huawei.watchface.videoedit.param.ItimeLine
    public void resume() {
        HwLog.d(HwLog.TAG, "Resume CurrentTime is " + this.mCurrentTime + " mStartBaseTime is " + this.mStartBaseTime + " status is " + this.status);
        TimeLineStatus timeLineStatus = this.status;
        if (timeLineStatus == TimeLineStatus.PAUSE) {
            this.status = TimeLineStatus.ACTIVE;
            this.mStartBaseTime = System.currentTimeMillis() - this.mCurrentTime;
        } else if (timeLineStatus == TimeLineStatus.SEEKING) {
            this.mPendingStatus = TimeLineStatus.ACTIVE;
        } else {
            HwLog.d(HwLog.TAG, "other case");
        }
        HwLog.d(HwLog.TAG, "Resume CurrentTime is " + this.mCurrentTime + " mStartBaseTime is " + this.mStartBaseTime + " status is " + this.status);
    }

    @Override // com.huawei.watchface.videoedit.param.ItimeLine
    public TimeLineStatus seekCompleted() {
        HwLog.d(HwLog.TAG, "seekCompleted status is  " + this.status + " mCurrentTime is " + this.mCurrentTime + " mPendingStatus " + this.mPendingStatus);
        TimeLineStatus timeLineStatus = this.mPendingStatus;
        TimeLineStatus timeLineStatus2 = TimeLineStatus.ACTIVE;
        if (timeLineStatus == timeLineStatus2) {
            this.status = timeLineStatus2;
            this.mStartBaseTime = System.currentTimeMillis() - this.mCurrentTime;
        } else {
            TimeLineStatus timeLineStatus3 = TimeLineStatus.PAUSE;
            if (timeLineStatus == timeLineStatus3) {
                this.status = timeLineStatus3;
            } else {
                HwLog.e(HwLog.TAG, "invalid status is  " + this.mPendingStatus);
            }
        }
        return this.status;
    }

    @Override // com.huawei.watchface.videoedit.param.ItimeLine
    public void seekTo(long j) {
        HwLog.d(HwLog.TAG, "SeekTo " + j + " status is " + this.status);
        TimeLineStatus timeLineStatus = this.status;
        TimeLineStatus timeLineStatus2 = TimeLineStatus.ACTIVE;
        if (timeLineStatus == timeLineStatus2 || timeLineStatus == TimeLineStatus.PAUSE) {
            this.mPendingStatus = timeLineStatus;
        } else if (timeLineStatus == TimeLineStatus.SEEKING) {
            HwLog.d(HwLog.TAG, "status is SEEKING");
        } else {
            this.mPendingStatus = timeLineStatus2;
        }
        this.status = TimeLineStatus.SEEKING;
        this.mCurrentTime = j;
    }

    @Override // com.huawei.watchface.videoedit.param.ItimeLine
    public void start() {
        HwLog.e(HwLog.TAG, "start");
        if (this.status == TimeLineStatus.SEEKING) {
            this.mStartBaseTime = System.currentTimeMillis() - this.mCurrentTime;
        } else {
            this.mStartBaseTime = System.currentTimeMillis();
        }
        this.status = TimeLineStatus.ACTIVE;
        this.mIsSaveMode = false;
    }

    public void startSaveMode(boolean z) {
        this.mIsSaveMode = z;
        this.saveTime = 0L;
    }
}
