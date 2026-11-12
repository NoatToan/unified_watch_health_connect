package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.Gson;
import com.xiaomi.xms.wearable.utils.net.DownloadService;
import java.io.File;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes2.dex */
public class vgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gson f36867a = new Gson();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Handler f36868b = new Handler(Looper.getMainLooper());
    public static final ftk c = ftk.e();

    public interface a {
        void onComplete();

        void onError(String str);

        default void onProgress(int i) {
        }
    }

    public static jz6 j(String str, final File file, final a aVar) {
        lg1.d("downloadFile url:" + str);
        return ((DownloadService) c.b(DownloadService.class, "https://watch.iot.mi.com")).downloadFace(str).S(ofl.c()).O(new bg4() { // from class: bgc
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                vgc.r(aVar, file, (prk) obj);
            }
        }, new bg4() { // from class: dgc
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                vgc.t(aVar, (Throwable) obj);
            }
        });
    }

    public static jz6 k(String str, String str2, a aVar) {
        return j(str, new File(str2), aVar);
    }

    public static /* synthetic */ void l(a aVar) {
        if (aVar != null) {
            lg1.d("downloadFile callback error: resp error");
            aVar.onError("downloadFile: resp error");
        }
    }

    public static /* synthetic */ void m(a aVar) {
        if (aVar != null) {
            lg1.d("downloadFile callback error: file delete error");
            aVar.onError("downloadFile: file delete error");
        }
    }

    public static /* synthetic */ void n(a aVar) {
        if (aVar != null) {
            lg1.d("downloadFile callback error: file new error");
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
            lg1.d("downloadFile callback complete");
            aVar.onComplete();
        }
    }

    public static /* synthetic */ void q(a aVar, Exception exc) {
        if (aVar != null) {
            lg1.d("downloadFile callback error: " + exc.getMessage());
            aVar.onError(exc.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static /* synthetic */ void r(final a aVar, File file, prk prkVar) throws Exception {
        if (!prkVar.e() || prkVar.a() == null) {
            f36868b.post(new Runnable() { // from class: fgc
                @Override // java.lang.Runnable
                public final void run() {
                    vgc.l(aVar);
                }
            });
            return;
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                f36868b.post(new Runnable() { // from class: jgc
                    @Override // java.lang.Runnable
                    public final void run() {
                        vgc.n(aVar);
                    }
                });
                return;
            }
        } else if (!file.delete()) {
            f36868b.post(new Runnable() { // from class: hgc
                @Override // java.lang.Runnable
                public final void run() {
                    vgc.m(aVar);
                }
            });
            return;
        }
        ResponseBody responseBody = (ResponseBody) prkVar.a();
        long contentLength = responseBody.getContentLength();
        try {
            BufferedSource bodySource = responseBody.getBodySource();
            try {
                BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(file));
                try {
                    Buffer bufferField = bufferedSinkBuffer.getBufferField();
                    long j = 0;
                    while (true) {
                        long j2 = bodySource.read(bufferField, 16384);
                        if (j2 == -1) {
                            bufferField.close();
                            f36868b.post(new Runnable() { // from class: ngc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    vgc.p(aVar);
                                }
                            });
                            bufferedSinkBuffer.close();
                            bodySource.close();
                            return;
                        }
                        bufferedSinkBuffer.emit();
                        j += j2;
                        final int iMin = (int) Math.min(99.0f, (j * 100.0f) / contentLength);
                        f36868b.post(new Runnable() { // from class: lgc
                            @Override // java.lang.Runnable
                            public final void run() {
                                vgc.o(aVar, iMin);
                            }
                        });
                        bufferedSinkBuffer.flush();
                        if (bodySource != null) {
                            try {
                                bodySource.close();
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
                if (bodySource != null) {
                    bodySource.close();
                }
                throw th4;
            }
        } catch (Exception e) {
            f36868b.post(new Runnable() { // from class: pgc
                @Override // java.lang.Runnable
                public final void run() {
                    vgc.q(aVar, e);
                }
            });
        }
    }

    public static /* synthetic */ void s(Throwable th, a aVar) {
        lg1.d("downloadFile callback error: " + th.getMessage());
        lg1.b("downloadFile error : " + th.getMessage());
        if (aVar != null) {
            aVar.onError(th.getMessage());
        }
    }

    public static /* synthetic */ void t(final a aVar, final Throwable th) throws Exception {
        f36868b.post(new Runnable() { // from class: rgc
            @Override // java.lang.Runnable
            public final void run() {
                vgc.s(th, aVar);
            }
        });
    }
}
