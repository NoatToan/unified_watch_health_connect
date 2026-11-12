package l0;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import tn2.r0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f107806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f107807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f107808d;

    public /* synthetic */ h(Object obj, Object obj2, long j8, int i14) {
        this.f107805a = i14;
        this.f107807c = obj;
        this.f107808d = obj2;
        this.f107806b = j8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        int i14 = this.f107805a;
        long j8 = this.f107806b;
        Object obj = this.f107808d;
        Object obj2 = this.f107807c;
        switch (i14) {
            case 0:
                j.a aVar = j.f107810a;
                return Boolean.valueOf(((androidx.concurrent.futures.b.a) obj2).d(new TimeoutException("Future[" + ((ListenableFuture) obj) + "] is not done within " + j8 + " ms.")));
            default:
                byte[] bArr = (byte[]) obj;
                Logger logger = r0.f165631n;
                File file = new File(pi1.b.a(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), null), (String) obj2);
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                long length = 0;
                try {
                    try {
                        fileOutputStream.write(bArr);
                        length = bArr.length;
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        logger.trace("Download Pdf successfully: " + length + "/" + j8);
                        return file;
                    } catch (IOException e4) {
                        logger.trace("Download Pdf failed: " + length + "/" + j8);
                        throw e4;
                    }
                } catch (Throwable th3) {
                    fileOutputStream.close();
                    throw th3;
                }
        }
    }
}
