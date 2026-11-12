package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.net.DownloadService;
import com.xiaomi.fitness.sync.net.RetrofitFactory;
import com.xiaomi.fitness.sync.util.SyncUtil;
import java.io.File;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes10.dex */
public class ugc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f35735a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RetrofitFactory f35736b = RetrofitFactory.INSTANCE.instance();
    public static final String c = "https://" + SyncUtil.INSTANCE.getRegion() + "watch.iot.mi.com";

    public interface a {
        void onComplete();

        void onError(String str);

        default void onProgress(int i) {
        }
    }

    public static jz6 j(String str, final File file, final a aVar) {
        return ((DownloadService) f35736b.getService(DownloadService.class, c)).downloadFace(str).S(ofl.c()).O(new bg4() { // from class: cgc
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                ugc.r(aVar, file, (prk) obj);
            }
        }, new bg4() { // from class: egc
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                ugc.t(aVar, (Throwable) obj);
            }
        });
    }

    public static jz6 k(String str, String str2, a aVar) {
        return j(str, new File(str2), aVar);
    }

    public static /* synthetic */ void l(a aVar) {
        if (aVar != null) {
            Logger.i("downloadFile callback error: resp error", new Object[0]);
            aVar.onError("downloadFile: resp error");
        }
    }

    public static /* synthetic */ void m(a aVar) {
        if (aVar != null) {
            Logger.i("downloadFile callback error: file delete error", new Object[0]);
            aVar.onError("downloadFile: file delete error");
        }
    }

    public static /* synthetic */ void n(a aVar) {
        if (aVar != null) {
            Logger.i("downloadFile callback error: file new error", new Object[0]);
            aVar.onError("downloadFile: file new error");
        }
    }

    public static /* synthetic */ void o(a aVar, int i) {
        if (aVar != null) {
            aVar.onProgress(i);
        }
    }

    public static /* synthetic */ void p(a aVar) {
        if (aVar != null) {
            Logger.i("downloadFile callback complete", new Object[0]);
            aVar.onComplete();
        }
    }

    public static /* synthetic */ void q(a aVar, Exception exc) {
        if (aVar != null) {
            Logger.i("downloadFile callback error: " + exc.getMessage(), new Object[0]);
            aVar.onError(exc.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static /* synthetic */ void r(final a aVar, File file, prk prkVar) throws Exception {
        if (!prkVar.e() || prkVar.a() == null) {
            f35735a.post(new Runnable() { // from class: igc
                @Override // java.lang.Runnable
                public final void run() {
                    ugc.l(aVar);
                }
            });
            return;
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                f35735a.post(new Runnable() { // from class: mgc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ugc.n(aVar);
                    }
                });
                return;
            }
        } else if (!file.delete()) {
            f35735a.post(new Runnable() { // from class: kgc
                @Override // java.lang.Runnable
                public final void run() {
                    ugc.m(aVar);
                }
            });
            return;
        }
        ResponseBody responseBody = (ResponseBody) prkVar.a();
        long contentLength = responseBody.getContentLength();
        try {
            BufferedSource source = responseBody.getSource();
            try {
                BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(file));
                try {
                    Buffer bufferField = bufferedSinkBuffer.getBufferField();
                    long j = 0;
                    while (true) {
                        long j2 = source.read(bufferField, 16384);
                        if (j2 == -1) {
                            bufferField.close();
                            f35735a.post(new Runnable() { // from class: qgc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ugc.p(aVar);
                                }
                            });
                            bufferedSinkBuffer.close();
                            source.close();
                            return;
                        }
                        bufferedSinkBuffer.emit();
                        j += j2;
                        final int iMin = (int) Math.min(99.0f, (j * 100.0f) / contentLength);
                        f35735a.post(new Runnable() { // from class: ogc
                            @Override // java.lang.Runnable
                            public final void run() {
                                ugc.o(aVar, iMin);
                            }
                        });
                        bufferedSinkBuffer.flush();
                        if (source != null) {
                            try {
                                source.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (source != null) {
                    source.close();
                }
                throw th4;
            }
        } catch (Exception e) {
            f35735a.post(new Runnable() { // from class: sgc
                @Override // java.lang.Runnable
                public final void run() {
                    ugc.q(aVar, e);
                }
            });
        }
    }

    public static /* synthetic */ void s(Throwable th, a aVar) {
        Logger.i("downloadFile callback error: " + th.getMessage(), new Object[0]);
        Logger.e("HttpHelper", "downloadFile error : " + th.getMessage());
        if (aVar != null) {
            aVar.onError(th.getMessage());
        }
    }

    public static /* synthetic */ void t(final a aVar, final Throwable th) throws Exception {
        f35735a.post(new Runnable() { // from class: ggc
            @Override // java.lang.Runnable
            public final void run() {
                ugc.s(th, aVar);
            }
        });
    }
}
