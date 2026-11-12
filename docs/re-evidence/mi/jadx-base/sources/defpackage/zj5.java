package defpackage;

import android.content.Context;
import android.os.Message;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.sport_manager.utils.UserInfo;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.wearable.gpsalgorithm.utils.ActivityIntensity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class zj5 extends zdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41337b;
    public long c;
    public int d;
    public int e;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public UserProfile j = UserInfo.INSTANCE.getUserProfile();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ActivityIntensity f41338k = new ActivityIntensity();

    public zj5(Context context, String str, SportRequestData sportRequestData, boolean z) {
        this.mContext = context;
        this.mDid = str;
        this.startTime = sportRequestData.timeStamp;
        this.timeZone = sportRequestData.timeZone;
        this.d = sportRequestData.sportType;
        this.delayMillis = 60000;
        this.dataType = 0;
        this.mSingleExecutor.execute(new Runnable() { // from class: xj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f39176a.g();
            }
        });
    }

    @Override // defpackage.zdn
    public byte[] convertRecordPauseDataToBytes() {
        return new byte[0];
    }

    @Override // defpackage.zdn
    public byte[] convertRecordToBytes(SportData sportData) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.LITTLE_ENDIAN);
        short s = (short) (sportData.currentSteps - this.f41336a);
        short s2 = (short) (sportData.distance - this.e);
        byteBufferOrder.putShort(s < 0 ? (short) 0 : s);
        byteBufferOrder.put((byte) (sportData.currentCal - this.f41337b));
        byteBufferOrder.put((byte) ((this.f41338k.getSportStrength() << 5) | this.d));
        byteBufferOrder.putShort(s2 >= 0 ? s2 : (short) 0);
        FitnessLogUtils.i("DailyRecorder", "step:" + sportData.currentSteps + ", stepChange:" + ((int) s) + ", cal:" + sportData.currentCal + ", calChange:" + (sportData.currentCal - this.f41337b) + ", dis:" + sportData.distance + ", disChange:" + ((int) s2) + ",this:" + this);
        this.e = sportData.distance;
        this.f41337b = sportData.currentCal;
        this.f41336a = sportData.currentSteps;
        return byteBufferOrder.array();
    }

    @Override // defpackage.zdn
    public void convertReportToBytes(SportData sportData) {
    }

    public final /* synthetic */ void g() {
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(this.startTime).timeZoneIn15Min(this.timeZone).dailyType(0).fileType(0).version(3).build();
        this.mFitnessDataId = fitnessDataIdBuild;
        this.mCacheDataFile = vq9.c(this.mContext, this.mDid, fitnessDataIdBuild);
        this.mTempCacheDataFile = vq9.a(this.mContext, this.mDid, this.mFitnessDataId);
        this.mByteBuffer = ByteBuffer.allocate(2048);
    }

    @Override // defpackage.zdn
    public byte[] getDataValidityForRecordHead() {
        return new byte[]{-102, -20, 0, 0, 0};
    }

    @Override // defpackage.zdn
    public byte[] getDataValidityForReport(SportData sportData) {
        return new byte[0];
    }

    @Override // defpackage.zdn
    public String getType() {
        return "DailyRecorder , this:" + this;
    }

    @Override // defpackage.zdn, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        onSportRecordData(this.sportRecordData);
        this.mMainHandler.removeMessages(1);
        if (this.mSportState != 2 || this.dataType != 0) {
            return false;
        }
        this.mMainHandler.sendEmptyMessageDelayed(1, VibrateModeProgressBar.sLongToLong);
        return false;
    }

    @Override // defpackage.zdn, defpackage.wyc
    public void onSportPaused(int i) {
        super.onSportPaused(i);
        FitnessLogUtils.i("DailyRecorder", "onSportPaused()");
        this.mMainHandler.sendEmptyMessage(1);
    }

    @Override // defpackage.zdn, defpackage.wyc
    public void onSportRecordData(SportData sportData) {
        this.sportRecordData = sportData;
        if (sportData != null && this.j.getRecordMaxHrm() != null) {
            this.f41338k.buildActivityIntensity(this.j.getRecordMaxHrm().getHrm(), sportData.hrRate, sportData.stepRate);
        }
        if (System.currentTimeMillis() - this.c >= 60000) {
            setSportData(sportData);
            this.c = System.currentTimeMillis();
        }
    }
}
