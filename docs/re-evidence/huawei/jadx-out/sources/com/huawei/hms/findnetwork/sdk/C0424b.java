package com.huawei.hms.findnetwork.sdk;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.text.TextUtils;
import androidx.media3.extractor.OpusUtil;
import com.huawei.hms.findnetwork.threadpool.ThreadExec;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0424b {
    public static volatile C0424b l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f13228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioRecord f13230c;
    public Runnable e;
    public Context f;
    public int g;
    public int h;
    public long i;
    public InterfaceC0446w k;
    public final B d = new B(4);
    public boolean j = false;

    public static C0424b b() {
        if (l == null) {
            synchronized (C0424b.class) {
                if (l == null) {
                    l = new C0424b();
                }
            }
        }
        return l;
    }

    public void a() {
        HmsFindSDKLog.i("AudioRecordManager", "callListenerStart mRecordListener is " + this.k);
        InterfaceC0446w interfaceC0446w = this.k;
        if (interfaceC0446w == null) {
            return;
        }
        interfaceC0446w.onStart();
    }

    public long c() {
        return this.i;
    }

    public boolean d() {
        return this.j;
    }

    public final void e() {
        try {
            if (this.f13230c != null) {
                HmsFindSDKLog.i("AudioRecordManager", "stop ultrasound measure, audio record release");
                this.f13230c.release();
                this.f13230c = null;
            }
        } catch (IllegalArgumentException unused) {
            HmsFindSDKLog.e("AudioRecordManager", "can not stop audio record");
        }
        this.d.a();
        HmsFindSDKLog.i("AudioRecordManager", "mRecordByteArrayPool is deInit");
        ThreadExec.removeTask(this.e);
        this.e = null;
    }

    public void f() {
        HmsFindSDKLog.i("AudioRecordManager", "call stopRecord method");
        this.f13228a = false;
        e();
    }

    public final int a(int i, InterfaceC0446w interfaceC0446w, byte[] bArr, A a2) {
        int i2 = (int) (i * 7.5f);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            if (!this.f13228a) {
                HmsFindSDKLog.i("AudioRecordManager", "measure status is not running");
                return -1;
            }
            int i5 = this.h;
            if (i5 != -1) {
                this.h = i5 + 1;
            }
            if (this.h == 23) {
                this.i = a(this.f);
                HmsFindSDKLog.i("AudioRecordManager", "startRecordTime :" + this.i);
                interfaceC0446w.onStart();
                this.h = -1;
            }
            int i6 = i2 - i3;
            AudioRecord audioRecord = this.f13230c;
            int i7 = i6 >= i ? audioRecord.read(bArr, i3, i) : audioRecord.read(bArr, i3, i6);
            if (i7 < 0) {
                HmsFindSDKLog.w("AudioRecordManager", "audio record read failed code is: " + i7 + ",diff is: " + i6 + ",minBufferSize is: " + i);
                this.d.a(a2);
                return i7;
            }
            i3 += i7;
            i4 = i7;
        }
        return i4;
    }

    public final void b(int i, InterfaceC0446w interfaceC0446w) {
        HmsFindSDKLog.i("AudioRecordManager", "start circle record thread");
        try {
            this.k = interfaceC0446w;
            if (this.f13230c == null) {
                HmsFindSDKLog.i("AudioRecordManager", "audioRecord is null");
                HmsFindSDKLog.i("AudioRecordManager", "into finally");
                f();
                if (interfaceC0446w != null) {
                    interfaceC0446w.a();
                    return;
                }
                return;
            }
            this.d.b((int) (i * 7.5f));
            HmsFindSDKLog.i("AudioRecordManager", "byteArraySize: " + this.d.b());
            A aC = this.d.c();
            if (aC == null) {
                HmsFindSDKLog.i("AudioRecordManager", "record byte array pool init failed.");
                HmsFindSDKLog.i("AudioRecordManager", "into finally");
                f();
                if (interfaceC0446w != null) {
                    interfaceC0446w.a();
                    return;
                }
                return;
            }
            byte[] bArrA = aC.a();
            if (bArrA.length == 0) {
                HmsFindSDKLog.i("AudioRecordManager", "record byte array is empty");
                HmsFindSDKLog.i("AudioRecordManager", "into finally");
                f();
                if (interfaceC0446w != null) {
                    interfaceC0446w.a();
                    return;
                }
                return;
            }
            this.f13228a = true;
            this.i = -1L;
            for (int i2 = 0; i2 < 2; i2++) {
                if (!this.f13228a) {
                    HmsFindSDKLog.i("AudioRecordManager", "into finally");
                    f();
                    if (interfaceC0446w != null) {
                        interfaceC0446w.a();
                        return;
                    }
                    return;
                }
                if (this.f13230c.read(bArrA, 0, i) < 0) {
                    HmsFindSDKLog.i("AudioRecordManager", "beginning of the record failed");
                    HmsFindSDKLog.i("AudioRecordManager", "into finally");
                    f();
                    if (interfaceC0446w != null) {
                        interfaceC0446w.a();
                        return;
                    }
                    return;
                }
            }
            this.d.a(aC);
            a(i, interfaceC0446w);
            HmsFindSDKLog.i("AudioRecordManager", "into finally");
            f();
            if (interfaceC0446w != null) {
                interfaceC0446w.a();
            }
        } catch (Throwable th) {
            HmsFindSDKLog.i("AudioRecordManager", "into finally");
            f();
            if (interfaceC0446w != null) {
                interfaceC0446w.a();
            }
            throw th;
        }
    }

    public final long a(Context context) {
        Object systemService = context.getSystemService("audio");
        if (!(systemService instanceof AudioManager)) {
            HmsFindSDKLog.i("AudioRecordManager", "can not get audio manager");
            return -1L;
        }
        String parameters = ((AudioManager) systemService).getParameters("nearby_record_time");
        if (!TextUtils.isEmpty(parameters)) {
            String[] strArrSplit = parameters.split(",");
            if (strArrSplit.length == 2) {
                String str = strArrSplit[0] + "000000";
                String str2 = strArrSplit[1];
                long j = Long.parseLong(str);
                long j2 = Long.parseLong(str2);
                HmsFindSDKLog.i("AudioRecordManager", "split[0]=" + strArrSplit[0] + "  split[1]=" + strArrSplit[1]);
                return j + j2;
            }
        }
        return -1L;
    }

    public void b(final InterfaceC0446w interfaceC0446w) {
        if (this.e == null) {
            Runnable runnable = new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(interfaceC0446w);
                }
            };
            this.e = runnable;
            ThreadExec.execNormalTask("AudioRecordManager", runnable);
        }
    }

    public int a(Context context, int i) {
        this.f = context;
        HmsFindSDKLog.i("AudioRecordManager", "audio record init ---");
        if (this.f13230c != null) {
            e();
        }
        int minBufferSize = AudioRecord.getMinBufferSize(OpusUtil.SAMPLE_RATE, 12, 2);
        this.f13229b = minBufferSize;
        if (minBufferSize > 1048576 || minBufferSize < 0) {
            HmsFindSDKLog.i("AudioRecordManager", "audio record buffer size is illegal");
            return -1;
        }
        try {
            if (this.f13230c == null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.setParameters("RECORD_SCENE=off");
                    HmsFindSDKLog.i("AudioRecordManager", "AudioManager set setParameters");
                }
                if (audioManager != null) {
                    int mode = audioManager.getMode();
                    HmsFindSDKLog.i("AudioRecordManager", "AudioManager mode：" + mode);
                    if (mode != 2 && mode != 3) {
                        List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
                        if (activeRecordingConfigurations != null && !activeRecordingConfigurations.isEmpty()) {
                            HmsFindSDKLog.i("AudioRecordManager", "the mic is occupied");
                            return -2;
                        }
                    }
                    HmsFindSDKLog.i("AudioRecordManager", "phone is in call, the mic is occupied");
                    return -2;
                }
                AudioRecord audioRecord = new AudioRecord(i == 0 ? 1 : 6, OpusUtil.SAMPLE_RATE, 12, 2, this.f13229b);
                this.f13230c = audioRecord;
                audioRecord.startRecording();
                HmsFindSDKLog.i("AudioRecordManager", "audioParam: " + i + " audio record init success---");
                return 0;
            }
        } catch (IllegalArgumentException unused) {
            AudioRecord audioRecord2 = this.f13230c;
            if (audioRecord2 != null) {
                audioRecord2.release();
            }
            HmsFindSDKLog.e("AudioRecordManager", "audio record start failed");
        }
        return -1;
    }

    public final /* synthetic */ void a(InterfaceC0446w interfaceC0446w) {
        b(this.f13229b, interfaceC0446w);
    }

    public final void a(int i, InterfaceC0446w interfaceC0446w) {
        this.h = 0;
        this.g = 0;
        while (true) {
            int i2 = 0;
            while (this.f13228a) {
                A aC = this.d.c();
                if (aC == null) {
                    HmsFindSDKLog.i("AudioRecordManager", "calculate record byte array is null.");
                } else {
                    byte[] bArrA = aC.a();
                    if (bArrA.length == 0) {
                        HmsFindSDKLog.i("AudioRecordManager", "circle record byte array is empty");
                        return;
                    }
                    int iA = a(i, interfaceC0446w, bArrA, aC);
                    if (iA == -1) {
                        HmsFindSDKLog.e("AudioRecordManager", "audioRecordReadResult is error");
                        return;
                    }
                    if (iA == -2) {
                        i2++;
                        if (i2 == 2) {
                            HmsFindSDKLog.i("AudioRecordManager", "bad value two times");
                            return;
                        }
                    } else if (iA < 0) {
                        HmsFindSDKLog.i("AudioRecordManager", "audio record failed, code is: " + iA);
                        return;
                    } else {
                        V.a().a(this.g, bArrA);
                        this.g++;
                        this.d.a(aC);
                    }
                }
            }
            return;
        }
    }

    public void a(boolean z) {
        this.j = z;
    }
}
