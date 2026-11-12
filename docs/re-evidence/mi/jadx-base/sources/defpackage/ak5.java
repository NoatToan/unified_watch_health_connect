package defpackage;

import android.content.Context;
import android.os.Message;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.sport_eco_manager.utils.UserInfo;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.wearable.gpsalgorithm.utils.ActivityIntensity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public class ak5 extends aen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1120b;
    public long c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public UserProfile j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ActivityIntensity f1121k;

    public ak5(Context context, String str, final int i, final int i2, int i3, boolean z) {
        super(context, str, i, i2, i3, z);
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = UserInfo.INSTANCE.getUserProfile();
        this.f1121k = new ActivityIntensity();
        this.mContext = context;
        this.mDid = str;
        this.timeZone = i2;
        this.d = i3;
        this.delayMillis = 60000;
        this.dataType = 0;
        this.mSingleExecutor.execute(new Runnable() { // from class: yj5
            @Override // java.lang.Runnable
            public final void run() {
                this.f40234a.g(i, i2);
            }
        });
    }

    @Override // defpackage.aen
    public byte[] convertRecordPauseDataToBytes() {
        return new byte[0];
    }

    @Override // defpackage.aen
    public byte[] convertRecordToBytes(SportData sportData) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.LITTLE_ENDIAN);
        short s = (short) (sportData.currentSteps - this.f1119a);
        short s2 = (short) (sportData.distance - this.e);
        if (s < 0) {
            s = 0;
        }
        byteBufferOrder.putShort(s);
        byteBufferOrder.put((byte) (sportData.currentCal - this.f1120b));
        byteBufferOrder.put((byte) ((this.f1121k.getSportStrength() << 5) | this.d));
        if (s2 < 0) {
            s2 = 0;
        }
        byteBufferOrder.putShort(s2);
        this.e = sportData.distance;
        this.f1120b = sportData.currentCal;
        this.f1119a = sportData.currentSteps;
        return byteBufferOrder.array();
    }

    @Override // defpackage.aen
    public void convertReportToBytes(SportData sportData) {
    }

    public final /* synthetic */ void g(int i, int i2) {
        FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(i).timeZoneIn15Min(i2).dailyType(0).fileType(0).version(3).build();
        this.mFitnessDataId = fitnessDataIdBuild;
        this.mCacheDataFile = vq9.c(this.mContext, this.mDid, fitnessDataIdBuild);
        this.mTempCacheDataFile = vq9.a(this.mContext, this.mDid, this.mFitnessDataId);
        this.mByteBuffer = ByteBuffer.allocate(2048);
    }

    @Override // defpackage.aen
    public byte[] getDataValidityForRecordHead() {
        return new byte[]{-102, -20, 0, 0, 0};
    }

    @Override // defpackage.aen
    public byte[] getDataValidityForReport() {
        return new byte[0];
    }

    @Override // defpackage.aen, android.os.Handler.Callback
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

    @Override // defpackage.aen, defpackage.xyc
    public void onSportPaused(int i) {
        super.onSportPaused(i);
        FitnessLogUtils.i("DailyRecorder", "onSportPaused()");
        this.mMainHandler.sendEmptyMessage(1);
    }

    @Override // defpackage.aen, defpackage.xyc
    public void onSportRecordData(SportData sportData) {
        this.sportRecordData = sportData;
        if (sportData != null) {
            this.f1121k.buildActivityIntensity(this.j.getMaxHrm(), sportData.hrRate, sportData.stepRate);
        }
        if (System.currentTimeMillis() - this.c >= 60000) {
            setSportData(sportData);
            this.c = System.currentTimeMillis();
        }
    }
}
