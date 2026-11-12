package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class eon implements ISportStateChangedListener, ISportDataChangedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16888b;
    public final String c;
    public FitnessDataId d;
    public File e;
    public volatile ByteBuffer f;
    public int g;
    public boolean h;
    public long i;
    public int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f16887a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f16889k = new Handler(Looper.getMainLooper());

    public eon(Context context, String str, boolean z, int i) {
        this.f16888b = context;
        this.c = str;
        this.h = z;
        this.j = i;
    }

    public final void g() {
        if (this.f != null) {
            this.f.clear();
            this.f16889k.postDelayed(new Runnable() { // from class: don
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15746a.o();
                }
            }, 3000L);
        }
        File file = this.e;
        if (file == null || !file.exists()) {
            return;
        }
        FitnessLogUtils.i("SportGpsDataRecorder", "delete cache file");
        this.e.delete();
    }

    public final synchronized void h() {
        try {
            FitnessLogUtils.i("SportGpsDataRecorder", "appendDataToFile");
            int iPosition = this.f != null ? this.f.position() : 0;
            if (iPosition == 0) {
                FitnessLogUtils.i("SportGpsDataRecorder", "empty append data");
                return;
            }
            FitnessLogUtils.i("SportGpsDataRecorder", "appendDataToFile dataLen = " + iPosition);
            byte[] bArr = new byte[iPosition];
            if (this.f != null) {
                this.f.clear();
                this.f.get(bArr);
                this.f.clear();
            }
            i(this.e, bArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(File file, byte[] bArr) throws Throwable {
        FitnessLogUtils.i("SportGpsDataRecorder", "appendDataToFile = " + FileUtils.writeFile(file, (InputStream) new ByteArrayInputStream(bArr), true));
    }

    public final byte[] j(Location location) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(18).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt((int) location.timeStamp);
        byteBufferOrder.putFloat((float) location.longitude);
        byteBufferOrder.putFloat((float) location.latitude);
        byteBufferOrder.putFloat(location.horizontalAccuracy);
        byteBufferOrder.putShort((short) (((((short) (location.speed * 10.0f)) << 4) & 65520) + 2));
        return byteBufferOrder.array();
    }

    public final void k(int i, int i2, int i3) {
        if (this.j != 2) {
            l(i, i2, i3);
            return;
        }
        if (i3 == 1 || i3 == 2) {
            l(i, i2, 22);
        } else if (i3 == 6) {
            l(i, i2, 23);
        } else {
            l(i, i2, i3);
        }
    }

    public final void l(int i, int i2, int i3) {
        this.d = new FitnessDataId.Builder().timeStampInSec(i).timeZoneIn15Min(i2).sportType(i3).fileType(2).version(2).build();
    }

    public void m() {
        FitnessLogUtils.i("SportGpsDataRecorder", "destroy");
        w();
    }

    public final byte[] n(FitnessDataId fitnessDataId) {
        int version = fitnessDataId.getVersion();
        if (version == 1) {
            return new byte[]{-32};
        }
        if (version != 2) {
            return null;
        }
        return new byte[]{-4};
    }

    public final /* synthetic */ void o() {
        this.f = null;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(final SportLocationResult sportLocationResult) {
        this.f16887a.execute(new Runnable() { // from class: znn
            @Override // java.lang.Runnable
            public final void run() {
                this.f41498a.p(sportLocationResult);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(x7r x7rVar) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr, FinishSportData finishSportData) {
        FitnessLogUtils.i("SportGpsDataRecorder", "isAccidentStop : " + f2o.x().g);
        if (f2o.x().g) {
            return;
        }
        FitnessLogUtils.i("SportGpsDataRecorder", "SportGpsDataRecorder:" + this + ",onSportFinished()");
        v(z);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        FitnessLogUtils.i("SportGpsDataRecorder", "SportGpsDataRecorder:" + this + ",onSportPaused()");
        this.f16887a.execute(new Runnable() { // from class: aon
            @Override // java.lang.Runnable
            public final void run() {
                this.f3303a.h();
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        FitnessLogUtils.i("SportGpsDataRecorder", "SportGpsDataRecorder:" + this + ",onSportRestarted()");
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    @SuppressLint({"WrongConstant"})
    public void onSportStarted(int i, final int i2, final int i3, final int i4, int i5) {
        if (this.g == i2) {
            return;
        }
        this.g = i2;
        this.f16887a.execute(new Runnable() { // from class: con
            @Override // java.lang.Runnable
            public final void run() {
                this.f14568a.q(i2, i3, i4);
            }
        });
    }

    public final /* synthetic */ void p(SportLocationResult sportLocationResult) {
        FitnessLogUtils.d("SportGpsDataRecorder", "SportGpsDataRecorder:" + this + ",onLocationChanged()");
        if (this.f == null) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if (this.i == 0) {
            this.i = seconds;
        }
        if (seconds - this.i >= 15 || this.f.position() + 18 >= 2048) {
            h();
            this.i = seconds;
            FitnessLogUtils.d("SportGpsDataRecorder", "GPS is save");
        }
        if (sportLocationResult.getLocation() != null) {
            this.f.put(j(sportLocationResult.getLocation()));
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }

    public final /* synthetic */ void q(int i, int i2, int i3) {
        k(i, i2, i3);
        if (this.h) {
            this.e = new File(SportManagerPreference.INSTANCE.getKEY_RECOVER_SPORT_GPS());
        } else {
            File fileC = vq9.c(this.f16888b, this.c, this.d);
            this.e = fileC;
            SportManagerPreference.INSTANCE.setKEY_RECOVER_SPORT_GPS(fileC.getAbsolutePath());
        }
        this.f = ByteBuffer.allocate(2048);
        FitnessLogUtils.i("SportGpsDataRecorder", "gps catheDataFile : " + this.e.getName() + ", isRecoverSport : " + this.h);
        FitnessLogUtils.i("SportGpsDataRecorder", "SportGpsDataRecorder:" + this + ",FitnessDataId：" + this.d + ",did:" + this.c);
    }

    public final /* synthetic */ void r() {
        FitnessLogUtils.i("SportGpsDataRecorder", "syncRecoverGpsToServer " + this.d);
        w();
    }

    public final /* synthetic */ void s(boolean z) {
        h();
        if (!z) {
            g();
            return;
        }
        FitnessLogUtils.i("SportGpsDataRecorder", "syncToServer " + this.d);
        w();
    }

    public final void t(FitnessDataId fitnessDataId, String str, byte[] bArr) {
        new FitnessDataHeader(this.d);
        int length = bArr.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put(bArr);
        FitnessLogUtils.i("SportGpsDataRecorder", ", dataLen = " + length);
        SportDeviceModel.INSTANCE.getFitnessSyncer().syncData(str, fitnessDataId, n(fitnessDataId), byteBufferAllocate.array());
    }

    public void u(int i, int i2, int i3) {
        l(i, i2, i3);
        this.e = new File(SportManagerPreference.INSTANCE.getKEY_RECOVER_SPORT_GPS());
        this.f16887a.execute(new Runnable() { // from class: ynn
            @Override // java.lang.Runnable
            public final void run() {
                this.f40349a.r();
            }
        });
    }

    public final void v(final boolean z) {
        this.f16887a.execute(new Runnable() { // from class: bon
            @Override // java.lang.Runnable
            public final void run() {
                this.f4422a.s(z);
            }
        });
    }

    public final void w() {
        if (this.d == null || TextUtils.isEmpty(this.c)) {
            return;
        }
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i("SportGpsDataRecorder", "syncToServer , mCacheDataFile : " + this.e.getName());
        byte[] bArrD = vq9.d(this.e);
        if (bArrD == null || bArrD.length == 0) {
            FitnessLogUtils.w("SportGpsDataRecorder", "empty data");
            return;
        }
        t(this.d, this.c, bArrD);
        f2o.x().i0();
        g();
    }
}
