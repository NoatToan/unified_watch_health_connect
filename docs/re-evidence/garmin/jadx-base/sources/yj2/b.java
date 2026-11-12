package yj2;

import android.content.Context;
import bj2.d;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.a1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyj2/b;", "", "<init>", "()V", "a", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f197581a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyj2/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        SUCCESS,
        /* JADX INFO: Fake field, exist only in values array */
        FAILURE
    }

    /* JADX INFO: renamed from: yj2.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C3704b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197583a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi2.a.CHINA_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f197583a = iArr;
        }
    }

    static {
        new b();
        f197581a = LoggerFactory.getLogger("CIQReq#ConnectIQUtil");
    }

    private b() {
    }

    public static final void a(Context context) {
        Logger logger = f197581a;
        context.getClass();
        try {
            InputStream inputStreamOpen = context.getAssets().open("iq_devices.xml");
            inputStreamOpen.getClass();
            byte[] bArr = new byte[1024];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("connectiq_devices.xml", 0);
                for (int i14 = inputStreamOpen.read(bArr); i14 > 0; i14 = inputStreamOpen.read(bArr)) {
                    fileOutputStreamOpenFileOutput.write(bArr, 0, i14);
                }
                fileOutputStreamOpenFileOutput.close();
            } catch (Exception e4) {
                logger.error("copyEmbeddedDevicesXmlToLocalStorage", (Throwable) e4);
            }
            inputStreamOpen.close();
        } catch (Exception e14) {
            logger.error("copyEmbeddedDevicesXmlToLocalStorage", (Throwable) e14);
        }
    }

    public static final void b(Context context, zi2.a aVar) {
        context.getClass();
        aVar.getClass();
        byte[] bArr = new byte[1024];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(((aVar == zi2.a.CHINA || aVar == zi2.a.CHINA_TEST) ? "https://static.garmin.cn" : "https://static.garmincdn.com").concat("/com.garmin.apps/devices.xml.gz")).openConnection().getInputStream());
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("connectiq_devices.xml", 0);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(bufferedInputStream);
            for (int i14 = gZIPInputStream.read(bArr); i14 > 0; i14 = gZIPInputStream.read(bArr)) {
                fileOutputStreamOpenFileOutput.write(bArr, 0, i14);
            }
            gZIPInputStream.close();
            fileOutputStreamOpenFileOutput.close();
            a[] aVarArr = a.f197582a;
        } catch (Exception e4) {
            f197581a.error("downloadDevicesXml", (Throwable) e4);
            a[] aVarArr2 = a.f197582a;
        }
    }

    public static final boolean c(int i14, Context context) {
        context.getClass();
        Set setB = a1.b(Integer.valueOf(i14));
        if (setB.isEmpty()) {
            return true;
        }
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("connectiq_devices.xml");
            d dVar = new d();
            dVar.c(fileInputStreamOpenFileInput);
            Iterator it = setB.iterator();
            while (it.hasNext()) {
                if (((String) dVar.f18374b.get(Integer.valueOf(((Number) it.next()).intValue()))) == null) {
                    return false;
                }
            }
            return true;
        } catch (Exception e4) {
            f197581a.error("partNumbersFoundInDevicesXml", (Throwable) e4);
            return false;
        }
    }
}
