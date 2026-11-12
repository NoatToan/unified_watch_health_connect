package tv;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.RemoteException;
import android.text.TextUtils;
import c22.u1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.garmin.gcsprotos.generated.FitnessDeviceProto;
import i3.e5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import java.util.List;
import ok2.a0;
import ok2.g0;
import ok2.w;
import ok2.y;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
public class s implements yr1.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static s f166537f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f166538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<Context> f166539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f166540c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f166541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yr1.q f166542e;

    private s(Context context, long j8) {
        this.f166539b = new WeakReference<>(context);
        this.f166538a = j8;
        this.f166542e = new yr1.q("VectorSettingsManager", this, Long.valueOf(j8));
    }

    public static s b(Context context, long j8) {
        s sVar = f166537f;
        if (sVar == null) {
            f166537f = new s(context, j8);
        } else {
            sVar.f166538a = j8;
            sVar.f166539b = new WeakReference<>(context);
            s sVar2 = f166537f;
            sVar2.getClass();
            sVar2.f166542e = new yr1.q("VectorSettingsManager", sVar2, Long.valueOf(j8));
        }
        return f166537f;
    }

    @Override // yr1.r
    public final void B1(al2.c cVar) {
        i2.d("VectorSettingsManager", "onSyncStarted: status: " + cVar);
    }

    @Override // yr1.r
    public final void F1(al2.a aVar, boolean z14) {
        xv.h hVar = new xv.h((long) aVar.a());
        oi2.a.f132270a.getClass();
        l73.c.b().e(hVar);
    }

    public final void a() {
        File file = new File(this.f166539b.get().getFilesDir().getAbsolutePath(), "SETTINGS.FIT");
        if (file.isFile()) {
            file.delete();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(pi1.b.a(this.f166539b.get(), Environment.DIRECTORY_DOWNLOADS));
        File file2 = new File(am.j.o(File.separator, "vector_firmware_files", sb3), "firmware.gcd");
        if (file2.exists()) {
            file2.delete();
        }
        File file3 = new File(this.f166539b.get().getFilesDir().getAbsolutePath(), "firmware.gcd");
        if (file3.exists()) {
            file3.delete();
        }
        this.f166541d = "";
    }

    public final boolean c() {
        String strA = u1.a(this.f166538a);
        boolean zIsFileUploadInProgress = false;
        if (strA != null) {
            if (yr1.e.d(strA)) {
                w wVarA = a0.f().a(strA);
                if (wVarA != null && wVarA.c() == g0.USER_INITIATED_PREFERRED) {
                    zIsFileUploadInProgress = true;
                }
            } else {
                hk0.d dVarH = hk0.d.h();
                Context context = dVarH.f84094a;
                if (TextUtils.isEmpty(strA)) {
                    dVarH.c("directExtract");
                } else {
                    ka2.a aVar = (ka2.a) da2.d.c(context).getCapability(strA, ka2.a.class);
                    if (aVar == null) {
                        i2.i(dVarH.b(), "Device disconnected");
                    } else {
                        context.getClass();
                        try {
                            da2.b bVar = da2.d.c(context).f58886a.f111646e;
                            if (bVar == null) {
                                bVar = null;
                            }
                            da2.l lVarF = bVar != null ? bVar.f(aVar.a().getF172493a()) : null;
                            if (lVarF instanceof DeviceManager) {
                                zIsFileUploadInProgress = ((DeviceManager) lVarF).isFileUploadInProgress(2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            yr1.q qVar = this.f166542e;
            if (zIsFileUploadInProgress) {
                qVar.b();
            } else {
                qVar.e();
            }
        }
        return zIsFileUploadInProgress;
    }

    public final void d() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f166539b.get().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
        String str = File.separator;
        String strH = e0.h(sb3, str, "vector_firmware_files", str);
        FileInputStream fileInputStream = new FileInputStream(new File(strH.concat("firmware.gcd")));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f166539b.get().getFilesDir().getAbsolutePath() + str + "firmware.gcd"));
        FileChannel channel = fileInputStream.getChannel();
        FileChannel channel2 = fileOutputStream.getChannel();
        channel.transferTo(0L, channel.size(), channel2);
        long size = channel.size();
        channel.close();
        if (channel2 != null) {
            channel2.close();
        }
        byte number = (byte) FitnessDeviceProto.MessageType.SOFTWARE_UPDATE.getNumber();
        String strA = u1.a(this.f166538a);
        if (strA == null || !yr1.e.d(strA)) {
            try {
                hk0.d.h().g(strA, 2, strH, "firmware.gcd", (byte) -1, number, 20000L, new r(this));
            } catch (RemoteException e4) {
                i2.i("VectorSettingsManager", "sendFileToRemoteDevice ERROR " + e4);
                xv.g gVar = new xv.g(4);
                oi2.a.C2513a c2513a = oi2.a.f132270a;
                c2513a.getClass();
                l73.c.b().e(gVar);
                xv.a aVar = new xv.a();
                c2513a.getClass();
                l73.c.b().e(aVar);
            }
        } else {
            this.f166542e.b();
            y.c cVar = y.f132805h;
            List listC = p13.w.c("software-update");
            y.d dVar = y.d.FORCED;
            y yVarA = y.c.a(cVar, null, listC, dVar, dVar, 17);
            w wVarA = a0.f().a(strA);
            if (wVarA != null) {
                wVarA.q(yVarA, new q(this));
            }
        }
        this.f166540c = size;
    }

    public final void e(String str) {
        String strValueOf = String.valueOf(this.f166538a);
        GCMSettingManager.f41537c.edit().putString(strValueOf + "sw_version", str).apply();
    }

    public final long f(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        a();
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle("Vector Firmware Download");
        request.setDescription("Downloading new firmware for Vector 3");
        request.setAllowedNetworkTypes(3);
        request.setVisibleInDownloadsUi(true);
        String str2 = Environment.DIRECTORY_DOWNLOADS;
        StringBuilder sb3 = new StringBuilder();
        String str3 = File.separator;
        request.setDestinationInExternalFilesDir(context, str2, e5.h(sb3, str3, "vector_firmware_files", str3, "firmware.gcd"));
        return downloadManager.enqueue(request);
    }

    @Override // yr1.r
    public final void g5(al2.c cVar, boolean z14) {
        int i14;
        i2.d("VectorSettingsManager", "onSyncFinished: status: " + cVar);
        al2.b bVar = cVar.f3777c;
        bVar.getClass();
        int i15 = yv.j.f199836a[bVar.ordinal()];
        if (i15 != 1) {
            i14 = 2;
            if (i15 != 2) {
                i14 = (i15 == 3 || i15 == 4 || i15 == 5) ? 4 : -1;
            }
        } else {
            i14 = 0;
        }
        xv.g gVar = new xv.g(i14 != -1 ? i14 : 4);
        oi2.a.f132270a.getClass();
        l73.c.b().e(gVar);
        this.f166542e.e();
    }
}
