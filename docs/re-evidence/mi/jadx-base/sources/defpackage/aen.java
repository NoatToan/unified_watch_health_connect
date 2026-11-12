package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.recorder.utils.RecorderUtils;
import com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aen implements xyc, Handler.Callback {
    protected static final int CAPABILITY = 2048;
    public static final int HUAMI_SPORT_VERSION = 1;
    public static final int LoopEmptyMessage = 1;
    private static final String TAG = "SportDataRecorder";
    protected int dataCount;
    protected boolean isRecoverSport;
    protected ByteBuffer mByteBuffer;
    protected File mCacheDataFile;
    protected Context mContext;
    protected String mDid;
    protected FitnessDataId mFitnessDataId;
    protected File mTempCacheDataFile;
    int pauseTimeStamp;
    protected int recoverStartTime;
    protected int restartTimeStamp;
    protected SportData sportRecordData;
    private SportData sportReportData;
    int startTimeStame;
    protected int timeZone;
    int RECORD_EACH_SPORT = 16;
    protected ExecutorService mSingleExecutor = Executors.newSingleThreadExecutor();
    protected Handler mMainHandler = new Handler(Looper.getMainLooper(), this);
    protected int mSportState = 0;
    protected int delayMillis = 1000;
    protected int dataType = 1;

    public aen(Context context, String str, final int i, final int i2, final int i3, final boolean z) {
        this.mContext = context;
        this.mDid = str;
        this.timeZone = i2;
        this.mSingleExecutor.execute(new Runnable() { // from class: udn
            @Override // java.lang.Runnable
            public final void run() {
                this.f35663a.lambda$new$0(i, i2, i3, z);
            }
        });
    }

    private void abort() {
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
        this.recoverStartTime = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i, int i2, int i3, boolean z) {
        this.mFitnessDataId = new FitnessDataId.Builder().timeStampInSec(i).timeZoneIn15Min(i2).sportType(i3).fileType(0).version(1).build();
        FitnessLogUtils.i(TAG, "this sport is recover sport : " + z);
        this.isRecoverSport = z;
        if (z) {
            SportManagerPreference sportManagerPreference = SportManagerPreference.INSTANCE;
            this.mTempCacheDataFile = new File(sportManagerPreference.getKEY_RECOVER_SPORT_RECORD_TEMP_CACHE());
            this.mCacheDataFile = new File(sportManagerPreference.getKEY_RECOVER_SPORT_RECORD_CACHE());
            this.dataCount = sportManagerPreference.getKEY_RECOVER_SPORT_PAUSE_COUNT();
            FitnessLogUtils.i(TAG, "get the recover sport dataCount : " + this.dataCount);
        } else {
            this.mCacheDataFile = vq9.c(this.mContext, this.mDid, this.mFitnessDataId);
            this.mTempCacheDataFile = vq9.a(this.mContext, this.mDid, this.mFitnessDataId);
            if (RecorderUtils.INSTANCE.isSupportRecover(i3)) {
                SportManagerPreference sportManagerPreference2 = SportManagerPreference.INSTANCE;
                sportManagerPreference2.setKEY_RECOVER_SPORT_RECORD_TEMP_CACHE(this.mTempCacheDataFile.getAbsolutePath());
                sportManagerPreference2.setKEY_RECOVER_SPORT_RECORD_CACHE(this.mCacheDataFile.getAbsolutePath());
                sportManagerPreference2.setKEY_RECOVER_SPORT_FITNESS_DATA_ID(h4b.c(this.mFitnessDataId));
            }
        }
        FitnessLogUtils.i(TAG, "PATH : " + this.mCacheDataFile.getAbsolutePath());
        this.mByteBuffer = ByteBuffer.allocate(2048);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSportData$4(SportData sportData) throws Throwable {
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer != null && (sportData.addToFile || byteBuffer.position() + this.RECORD_EACH_SPORT >= 2048)) {
            appendSportDataToFile();
            SportManagerPreference.INSTANCE.setKEY_RECOVER_SPORT_PAUSE_COUNT(this.dataCount);
            FitnessLogUtils.i(TAG, "save the dataCount : " + this.dataCount);
        }
        byte[] bArrConvertRecordToBytes = convertRecordToBytes(sportData);
        ByteBuffer byteBuffer2 = this.mByteBuffer;
        if (byteBuffer2 == null || bArrConvertRecordToBytes == null) {
            return;
        }
        byteBuffer2.put(bArrConvertRecordToBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncSport$2() {
        SportDeviceModel.INSTANCE.getFitnessSyncer().syncData(this.mDid, null);
        FitnessLogUtils.i(TAG, "start sync finish command");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncSport$3(boolean z, SportData sportData) throws Throwable {
        FitnessLogUtils.i(TAG, "syncToServer start , did:" + this.mDid);
        lambda$onSportPaused$1();
        if (!z) {
            FitnessLogUtils.i(TAG, "syncSport运动数据:abort");
            abort();
            return;
        }
        FitnessLogUtils.i(TAG, "syncToServer " + this.mFitnessDataId);
        syncToServer();
        convertReportToBytes(sportData);
        this.mMainHandler.postDelayed(new Runnable() { // from class: sdn
            @Override // java.lang.Runnable
            public final void run() {
                this.f33537a.lambda$syncSport$2();
            }
        }, 5000L);
    }

    private void syncToServer() {
        FitnessLogUtils.i(TAG, "syncToServer-上传运动打点，mFitnessDataId is ：" + this.mFitnessDataId + "---mDid=" + this.mDid);
        if (this.mFitnessDataId == null || TextUtils.isEmpty(this.mDid)) {
            return;
        }
        FitnessLogUtils.i(TAG, this.mCacheDataFile.getAbsolutePath());
        byte[] bArrD = vq9.d(this.mCacheDataFile);
        if (bArrD == null || bArrD.length == 0) {
            FitnessLogUtils.w(TAG, "empty data");
            return;
        }
        FitnessLogUtils.i(TAG, "syncToServer data lenght : " + bArrD.length);
        syncSportDataFileToServer(this.mFitnessDataId, this.mDid, bArrD);
        FitnessLogUtils.i(TAG, "syncToServer end, did:" + this.mDid);
        abort();
    }

    /* JADX INFO: renamed from: appendDataToFile, reason: merged with bridge method [inline-methods] */
    public void lambda$onSportPaused$1() throws Throwable {
        if (this.mByteBuffer == null) {
            return;
        }
        FitnessLogUtils.i(TAG, "appendDataToFile");
        int iPosition = this.mByteBuffer.position();
        FitnessLogUtils.i(TAG, "appendDataToFile dataLen = " + iPosition);
        byte[] bArr = new byte[iPosition];
        this.mByteBuffer.clear();
        this.mByteBuffer.get(bArr);
        this.mByteBuffer.clear();
        byte[] bArrD = vq9.d(this.mTempCacheDataFile);
        byte[] bArrConvertRecordPauseDataToBytes = convertRecordPauseDataToBytes();
        int length = bArrConvertRecordPauseDataToBytes.length;
        ByteBuffer byteBufferAllocate = (bArrD == null || bArrD.length == 0) ? ByteBuffer.allocate(length + iPosition) : ByteBuffer.allocate(length + bArrD.length + iPosition);
        byteBufferAllocate.put(bArrConvertRecordPauseDataToBytes);
        if (bArrD != null && bArrD.length != 0) {
            byteBufferAllocate.put(bArrD);
        }
        byteBufferAllocate.put(bArr);
        appendDataToFile(this.mCacheDataFile, byteBufferAllocate.array());
        this.mTempCacheDataFile.delete();
        this.mTempCacheDataFile = vq9.a(this.mContext, this.mDid, this.mFitnessDataId);
    }

    public void appendSportDataToFile() throws Throwable {
        if (this.mByteBuffer == null) {
            return;
        }
        FitnessLogUtils.i(TAG, "appendDataToFile");
        int iPosition = this.mByteBuffer.position();
        if (iPosition == 0) {
            FitnessLogUtils.i(TAG, "empty append data");
            return;
        }
        FitnessLogUtils.i(TAG, "appendDataToFile dataLen = " + iPosition);
        byte[] bArr = new byte[iPosition];
        this.mByteBuffer.clear();
        this.mByteBuffer.get(bArr);
        this.mByteBuffer.clear();
        appendDataToFile(this.mTempCacheDataFile, bArr);
    }

    public abstract byte[] convertRecordPauseDataToBytes();

    public abstract byte[] convertRecordToBytes(SportData sportData);

    public abstract void convertReportToBytes(SportData sportData);

    public void destroy() {
        FitnessLogUtils.i(TAG, "destroy");
        syncToServer();
    }

    public abstract byte[] getDataValidityForRecordHead();

    public abstract byte[] getDataValidityForReport();

    public SportData getSportReportData() {
        return this.sportReportData;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    @Override // defpackage.xyc
    public void onSportPaused(int i) {
        this.pauseTimeStamp = i;
        this.mSportState = 2;
        this.mSingleExecutor.execute(new Runnable() { // from class: qdn
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f31417a.lambda$onSportPaused$1();
            }
        });
    }

    @Override // defpackage.xyc
    public void onSportRecordData(SportData sportData) {
        this.sportRecordData = sportData;
        setSportData(sportData);
    }

    @Override // defpackage.xyc
    public void onSportReportData(boolean z, SportData sportData) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i(TAG, "isAccidentStop : " + g2o.s().h);
        if (g2o.s().h) {
            return;
        }
        if (this.dataType == 0) {
            setSportData(this.sportRecordData);
        }
        this.mSportState = 4;
        FitnessLogUtils.i(TAG, "sport report is validSport : " + z);
        if (z) {
            this.sportReportData = sportData;
            syncSport(true, sportData);
        }
    }

    @Override // defpackage.xyc
    public void onSportRestart(int i) {
        this.restartTimeStamp = i;
        this.mSportState = 3;
        FitnessLogUtils.i(TAG, "sport recorder restart");
    }

    @Override // defpackage.xyc
    public void onSportStart() {
        this.startTimeStame = (int) (System.currentTimeMillis() / 1000);
        this.mSportState = 1;
        FitnessLogUtils.i(TAG, "sport recorder start");
    }

    public void setSportData(final SportData sportData) {
        if (sportData != null) {
            int i = this.mSportState;
            if (((i == 2 || i == 4) && this.dataType == 1) || this.mByteBuffer == null) {
                return;
            }
            this.mSingleExecutor.execute(new Runnable() { // from class: ydn
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f40078a.lambda$setSportData$4(sportData);
                }
            });
        }
    }

    public void syncRecoverSport(boolean z, SportData sportData) {
        this.recoverStartTime = sportData.startTime;
        onSportReportData(z, sportData);
    }

    public void syncSport(final boolean z, final SportData sportData) {
        FitnessLogUtils.i(TAG, "syncSport运动数据，validSport is：" + z);
        this.mSingleExecutor.execute(new Runnable() { // from class: wdn
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f37874a.lambda$syncSport$3(z, sportData);
            }
        });
    }

    public void syncSportDataFileToServer(FitnessDataId fitnessDataId, String str, byte[] bArr) {
        byte[] dataValidityForRecordHead;
        if (fitnessDataId.getFileType() == 1) {
            dataValidityForRecordHead = getDataValidityForReport();
        } else {
            dataValidityForRecordHead = fitnessDataId.getFileType() == 0 ? getDataValidityForRecordHead() : null;
        }
        int length = bArr.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put(bArr);
        FitnessLogUtils.i(TAG, ", dataLen = " + length);
        SportDeviceModel.INSTANCE.getFitnessSyncer().syncData(str, fitnessDataId, dataValidityForRecordHead, byteBufferAllocate.array());
    }

    public void appendDataToFile(File file, byte[] bArr) throws Throwable {
        FileUtils fileUtils = FileUtils.INSTANCE;
        FitnessLogUtils.i(TAG, "appendDataToFile = " + FileUtils.writeFile(file, (InputStream) new ByteArrayInputStream(bArr), true));
    }
}
