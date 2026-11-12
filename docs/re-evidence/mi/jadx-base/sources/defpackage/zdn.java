package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.recorder.utils.RecorderUtils;
import com.xiaomi.fitness.sport_manager.utils.BeanSportUtils;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zdn implements wyc, Handler.Callback {
    protected static final int CAPABILITY = 2048;
    public static final int HUAMI_SPORT_VERSION = 1;
    public static final int INVALID_ADUJUSTMENT_DIS = -1;
    public static final int LoopEmptyMessage = 1;
    private static final String TAG = "SportDataRecorder";
    int RECORD_EACH_SPORT;
    private int appLaunchType;
    private final LinkedList<SportData> cachedRecord;
    protected AtomicBoolean canSetRecord;
    protected int dataCount;
    protected int dataType;
    protected int delayMillis;
    private boolean isFirstSegmentRequest;
    protected boolean isRecoverSport;
    protected boolean isRecoverSupportHr;
    protected ByteBuffer mByteBuffer;
    protected File mCacheDataFile;
    protected Context mContext;
    protected String mDid;
    protected FitnessDataId mFitnessDataId;
    protected Handler mMainHandler;
    protected ExecutorService mSingleExecutor;
    protected int mSportState;
    protected File mTempCacheDataFile;
    int pauseTimeStamp;
    private SportData recoverSport;
    protected int recoverStartTime;
    protected int restartTimeStamp;
    protected SportData sportRecordData;
    private SportData sportReportData;
    protected int startTime;
    int startTimeStame;
    protected int timeZone;
    protected int totalCount;
    private int wearMode;

    public zdn(Context context, String str, SportRequestData sportRequestData, final Boolean bool) {
        this.RECORD_EACH_SPORT = 16;
        this.mSingleExecutor = Executors.newSingleThreadExecutor();
        this.mMainHandler = new Handler(Looper.getMainLooper(), this);
        this.mSportState = 0;
        this.delayMillis = 1000;
        this.isFirstSegmentRequest = true;
        this.canSetRecord = new AtomicBoolean(true);
        this.cachedRecord = new LinkedList<>();
        this.mContext = context;
        this.mDid = str;
        this.startTime = sportRequestData.timeStamp;
        this.timeZone = sportRequestData.timeZone;
        this.dataType = 1;
        this.wearMode = sportRequestData.accessoryWearMode;
        final int i = sportRequestData.sportType;
        FitnessLogUtils.i(TAG, "type:" + getType() + "isRecoverSport:" + bool + ",startTime:" + sportRequestData.timeStamp + ",sportType:" + sportRequestData.sportType);
        this.mSingleExecutor.execute(new Runnable() { // from class: xdn
            @Override // java.lang.Runnable
            public final void run() {
                this.f39024a.lambda$new$0(i, bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i, Boolean bool) {
        this.mFitnessDataId = new FitnessDataId.Builder().timeStampInSec(this.startTime).timeZoneIn15Min(this.timeZone).sportType(getRecordSportType(i)).fileType(0).version(getRecordVersion()).build();
        this.isRecoverSport = bool.booleanValue();
        if (bool.booleanValue()) {
            this.recoverSport = f2o.x().E();
            SportManagerPreference sportManagerPreference = SportManagerPreference.INSTANCE;
            this.mTempCacheDataFile = new File(sportManagerPreference.getKEY_RECOVER_SPORT_RECORD_TEMP_CACHE());
            this.mCacheDataFile = new File(sportManagerPreference.getKEY_RECOVER_SPORT_RECORD_CACHE());
            FitnessLogUtils.i(TAG, "isRecoverSport , cacheDataFile:" + this.mCacheDataFile.getAbsolutePath());
            this.dataCount = sportManagerPreference.getKEY_RECOVER_SPORT_PAUSE_COUNT();
            this.isRecoverSupportHr = this.recoverSport.aveHrRate != 0;
            FitnessLogUtils.i(TAG, "get the recover sport dataCount : " + this.dataCount + ",isRecoverSupportHr:" + this.isRecoverSupportHr);
        } else {
            this.mCacheDataFile = vq9.c(this.mContext, this.mDid, this.mFitnessDataId);
            this.mTempCacheDataFile = vq9.a(this.mContext, this.mDid, this.mFitnessDataId);
            if (RecorderUtils.INSTANCE.isSupportRecover(i)) {
                SportManagerPreference sportManagerPreference2 = SportManagerPreference.INSTANCE;
                sportManagerPreference2.setKEY_RECOVER_SPORT_RECORD_TEMP_CACHE(this.mTempCacheDataFile.getAbsolutePath());
                sportManagerPreference2.setKEY_RECOVER_SPORT_RECORD_CACHE(this.mCacheDataFile.getAbsolutePath());
                FitnessLogUtils.i(TAG, "cacheDataFile:" + this.mCacheDataFile.getAbsolutePath());
                sportManagerPreference2.setKEY_RECOVER_SPORT_FITNESS_DATA_ID(h4b.c(this.mFitnessDataId));
            }
        }
        FitnessLogUtils.i(TAG, "PATH : " + this.mCacheDataFile.getAbsolutePath() + ",cache length:" + this.mCacheDataFile.length());
        this.mByteBuffer = ByteBuffer.allocate(2048);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSportPaused$1() throws Throwable {
        appendDataToFile(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSportData$4(SportData sportData) throws Throwable {
        if (!this.canSetRecord.get()) {
            this.cachedRecord.add(sportData);
            return;
        }
        if (!this.cachedRecord.isEmpty()) {
            for (int i = 0; i < this.cachedRecord.size(); i++) {
                setRecordData(this.cachedRecord.get(i));
            }
            this.cachedRecord.clear();
        }
        setRecordData(sportData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncSport$2() {
        SportDeviceModel.INSTANCE.getFitnessSyncer().syncData(this.mDid, null);
        FitnessLogUtils.i(TAG, "start sync finish command");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncSport$3(boolean z, SportData sportData) throws Throwable {
        FitnessLogUtils.i(TAG, "syncToServer start , did:" + this.mDid + ",dataId:" + this.mFitnessDataId + ",validSport:" + z + ",type:" + getType());
        appendDataToFile(-1, -1);
        if (!z) {
            abort();
            return;
        }
        syncToServer();
        convertReportToBytes(sportData);
        this.mMainHandler.postDelayed(new Runnable() { // from class: pdn
            @Override // java.lang.Runnable
            public final void run() {
                this.f30300a.lambda$syncSport$2();
            }
        }, 5000L);
    }

    private void setRecordData(SportData sportData) throws Throwable {
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer != null && (sportData.addToFile || byteBuffer.position() + this.RECORD_EACH_SPORT >= 2048)) {
            appendSportDataToFile();
            SportManagerPreference.INSTANCE.setKEY_RECOVER_SPORT_PAUSE_COUNT(this.dataCount);
        }
        byte[] bArrConvertRecordToBytes = convertRecordToBytes(sportData);
        if (this.mByteBuffer == null || bArrConvertRecordToBytes == null) {
            return;
        }
        FitnessLogUtils.i(TAG, "record ,type:" + getType() + "data Len:" + bArrConvertRecordToBytes.length + ",totalCount:" + this.totalCount);
        this.mByteBuffer.put(bArrConvertRecordToBytes);
    }

    private void syncToServer() {
        if (this.mFitnessDataId == null || TextUtils.isEmpty(this.mDid)) {
            return;
        }
        FitnessLogUtils.i(TAG, this.mCacheDataFile.getAbsolutePath());
        byte[] bArrD = vq9.d(this.mCacheDataFile);
        if (bArrD == null || bArrD.length == 0) {
            FitnessLogUtils.w(TAG, "empty data");
            return;
        }
        FitnessLogUtils.i(TAG, "syncToServer , record ,  data length : " + bArrD.length + ",type:" + getType() + ",totalCount" + this.totalCount);
        syncSportDataFileToServer(this.mFitnessDataId, this.mDid, bArrD, null);
        abort();
    }

    public void abort() {
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.mByteBuffer = null;
        }
        File file = this.mCacheDataFile;
        if (file != null && file.exists()) {
            FitnessLogUtils.i(TAG, "delete cache file");
            this.mCacheDataFile.delete();
        }
        this.recoverSport = null;
        this.recoverStartTime = 0;
        this.totalCount = 0;
        f2o.x().i0();
    }

    public void appendDataToFile(int i, int i2) throws Throwable {
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer == null) {
            return;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        this.mByteBuffer.clear();
        this.mByteBuffer.get(bArr);
        this.mByteBuffer.clear();
        byte[] bArrD = vq9.d(this.mTempCacheDataFile);
        byte[] bArrConvertRecordPauseDataToBytes = i == -1 ? convertRecordPauseDataToBytes() : convertRecordSegmentDataToBytes(i, i2);
        Logger.i(TAG, "-----------appendDataToFile , pre len:" + bArrConvertRecordPauseDataToBytes.length + ",,,,data:" + iPosition);
        int length = bArrConvertRecordPauseDataToBytes.length;
        ByteBuffer byteBufferAllocate = (bArrD == null || bArrD.length == 0) ? ByteBuffer.allocate(length + iPosition) : ByteBuffer.allocate(length + bArrD.length + iPosition);
        byteBufferAllocate.put(bArrConvertRecordPauseDataToBytes);
        if (bArrD != null && bArrD.length != 0) {
            byteBufferAllocate.put(bArrD);
        }
        byteBufferAllocate.put(bArr);
        this.canSetRecord.set(true);
        appendDataToFile(this.mCacheDataFile, byteBufferAllocate.array());
        this.mTempCacheDataFile.delete();
        this.mTempCacheDataFile = vq9.a(this.mContext, this.mDid, this.mFitnessDataId);
    }

    public void appendSportDataToFile() throws Throwable {
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer == null) {
            return;
        }
        int iPosition = byteBuffer.position();
        if (iPosition == 0) {
            FitnessLogUtils.i(TAG, "empty append data");
            return;
        }
        FitnessLogUtils.i(TAG, "appendDataToFile dataLen = " + iPosition + ",type: " + getType());
        byte[] bArr = new byte[iPosition];
        this.mByteBuffer.clear();
        this.mByteBuffer.get(bArr);
        this.mByteBuffer.clear();
        appendDataToFile(this.mTempCacheDataFile, bArr);
    }

    public abstract byte[] convertRecordPauseDataToBytes();

    public byte[] convertRecordSegmentDataToBytes(int i, int i2) {
        return null;
    }

    public abstract byte[] convertRecordToBytes(SportData sportData);

    public abstract void convertReportToBytes(SportData sportData);

    public void destroy() {
        FitnessLogUtils.i(TAG, "destroy");
    }

    public abstract byte[] getDataValidityForRecordHead();

    public abstract byte[] getDataValidityForReport(SportData sportData);

    public int getRecordSportType(int i) {
        return i;
    }

    public int getRecordVersion() {
        return 1;
    }

    public SportData getSportReportData() {
        return this.sportReportData;
    }

    public abstract String getType();

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    public boolean isBeanConnect() {
        return f2o.x().r().isBeanConnect();
    }

    public boolean isNotSupportHr() {
        SportData sportData = this.recoverSport;
        int i = sportData == null ? 2 : sportData.appLaunchType;
        FitnessLogUtils.i(TAG, "record, app launch type: " + this.appLaunchType + ",recover launch type:" + i + ",isRecoverSupportHr:" + this.isRecoverSupportHr);
        boolean z = !this.isRecoverSport ? !(!SportDeviceModel.INSTANCE.isMainDeviceConnected() || this.appLaunchType == 2) : i != 2;
        FitnessLogUtils.i(TAG, "isOnlyAppLaunch:" + z + ",isRecoverSport:" + this.isRecoverSport + ", recoverLaunchType:" + i + ",isMain:" + SportDeviceModel.INSTANCE.isMainDeviceConnected() + ",AppLaunchType:" + f2o.x().t());
        if (this.isRecoverSupportHr) {
            return false;
        }
        return z || BeanSportUtils.INSTANCE.isOnlyBeanSport();
    }

    public boolean isWearBeanMode() {
        return this.wearMode == 1 && f2o.x().r().isBeanConnect();
    }

    @Override // defpackage.wyc
    public void onAdjustmentDis(int i) {
    }

    @Override // defpackage.wyc
    public void onSportPaused(int i) {
        FitnessLogUtils.i(TAG, "type:" + getType() + "onSportPaused , time:" + i);
        this.pauseTimeStamp = i;
        this.mSportState = 2;
        this.mSingleExecutor.execute(new Runnable() { // from class: vdn
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f36779a.lambda$onSportPaused$1();
            }
        });
    }

    @Override // defpackage.wyc
    public void onSportRecordData(SportData sportData) {
        this.sportRecordData = sportData;
        setSportData(sportData);
    }

    @Override // defpackage.wyc
    public void onSportReportData(boolean z, SportData sportData) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(TAG, "isAccidentStop : " + f2o.x().g + ",validSport:" + z + ",type:" + getType());
        if (f2o.x().g) {
            return;
        }
        if (this.dataType == 0) {
            setSportData(this.sportRecordData);
        }
        this.appLaunchType = f2o.x().t();
        this.mSportState = 4;
        if (z) {
            this.sportReportData = sportData;
            this.isFirstSegmentRequest = true;
            syncSport(true, sportData);
        } else {
            FitnessLogUtils.i(TAG, "validSport:" + z + ",remove recover sport");
            f2o.x().i0();
        }
    }

    @Override // defpackage.wyc
    public void onSportRestart(int i) {
        this.restartTimeStamp = i;
        this.mSportState = 3;
        FitnessLogUtils.i(TAG, "type:" + getType() + "onSportResume , time:" + i);
    }

    @Override // defpackage.wyc
    public void onSportSegment(int i, int i2) throws Throwable {
        if (!this.isFirstSegmentRequest) {
            appendDataToFile(i, i2);
        } else {
            updateFirstSegmentInfo(i);
            this.isFirstSegmentRequest = false;
        }
    }

    @Override // defpackage.wyc
    public void onSportStart() {
        this.startTimeStame = (int) (System.currentTimeMillis() / 1000);
        this.mSportState = 1;
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(TAG, "sport start , type:" + getType());
    }

    public void setSportData(final SportData sportData) {
        if (sportData != null) {
            int i = this.mSportState;
            if (((i == 2 || i == 4) && this.dataType == 1) || this.mByteBuffer == null) {
                return;
            }
            this.mSingleExecutor.execute(new Runnable() { // from class: tdn
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f34605a.lambda$setSportData$4(sportData);
                }
            });
        }
    }

    public void syncRecoverSport(boolean z, SportData sportData) {
        this.recoverStartTime = sportData.startTime;
        FitnessLogUtils.i(TAG, "syncRecoverSport sportReportData:" + sportData);
        this.isRecoverSupportHr = sportData.aveHrRate != 0;
        onSportReportData(z, sportData);
    }

    public void syncSport(final boolean z, final SportData sportData) {
        this.mSingleExecutor.execute(new Runnable() { // from class: rdn
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f32446a.lambda$syncSport$3(z, sportData);
            }
        });
    }

    public void syncSportDataFileToServer(FitnessDataId fitnessDataId, String str, byte[] bArr, SportData sportData) {
        byte[] dataValidityForRecordHead;
        if (fitnessDataId.getFileType() == 1) {
            dataValidityForRecordHead = getDataValidityForReport(sportData);
            FitnessLogUtils.i(TAG, "syncToServer , report , type:" + getType() + ",dataLen:" + bArr.length);
        } else if (fitnessDataId.getFileType() == 0) {
            dataValidityForRecordHead = getDataValidityForRecordHead();
            FitnessLogUtils.i(TAG, "syncToServer , record , type:" + getType() + ",dataLen:" + bArr.length + ",totalCount:" + this.totalCount);
        } else {
            dataValidityForRecordHead = null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
        byteBufferAllocate.put(bArr);
        SportDeviceModel.INSTANCE.getFitnessSyncer().syncData(str, fitnessDataId, dataValidityForRecordHead, byteBufferAllocate.array());
    }

    public void updateFirstSegmentInfo(int i) {
    }

    public zdn() {
        this.RECORD_EACH_SPORT = 16;
        this.mSingleExecutor = Executors.newSingleThreadExecutor();
        this.mMainHandler = new Handler(Looper.getMainLooper(), this);
        this.mSportState = 0;
        this.delayMillis = 1000;
        this.isFirstSegmentRequest = true;
        this.canSetRecord = new AtomicBoolean(true);
        this.cachedRecord = new LinkedList<>();
    }

    public void appendDataToFile(File file, byte[] bArr) throws Throwable {
        FileUtils.writeFile(file, (InputStream) new ByteArrayInputStream(bArr), true);
    }
}
