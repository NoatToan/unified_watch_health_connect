package com.huami.assistant.ocr.idcardquality;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.baidu.idl.authority.AlgorithmOnMainThreadException;
import com.baidu.idl.authority.IDLAuthorityException;
import com.baidu.idl.license.License;
import com.baidu.idl.util.UIThread;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes5.dex */
public class IDcardQualityProcess {
    private static IDcardQualityProcess b;
    private static String c;
    private static int d;
    private static Throwable e;
    private static volatile boolean f;
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock();

    static {
        try {
            System.loadLibrary("idl_license");
            System.loadLibrary("idcard_quality.1.1.1");
        } catch (Throwable th) {
            e = th;
        }
        b = null;
        d = 256;
    }

    public static synchronized IDcardQualityProcess getInstance() {
        if (b == null) {
            b = new IDcardQualityProcess();
        }
        return b;
    }

    public static Throwable getLoadSoException() {
        return e;
    }

    public static synchronized int init(String token) throws IDLAuthorityException, AlgorithmOnMainThreadException {
        if (UIThread.isUITread()) {
            throw new AlgorithmOnMainThreadException();
        }
        c = token;
        try {
            d = License.getInstance().init(c);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return d;
    }

    public native byte[] convertRGBImage(int[] colors, int width, int height);

    public byte[] getRGBImageData(Bitmap img) {
        int width = img.getWidth();
        int height = img.getHeight();
        int[] iArr = new int[width * height];
        img.getPixels(iArr, 0, width, 0, 0, width, height);
        return convertRGBImage(iArr, width, height);
    }

    public native int idcardQualityCaptchaRelease();

    public int idcardQualityDetectionImg(Bitmap img, boolean isfont) {
        int i = d;
        if (i != 0) {
            return i;
        }
        if (f) {
            return -1;
        }
        int height = img.getHeight();
        int width = img.getWidth();
        byte[] rGBImageData = getRGBImageData(img);
        this.a.readLock().lock();
        int iIdcardQualityProcess = idcardQualityProcess(rGBImageData, height, width, isfont, 3);
        this.a.readLock().unlock();
        return iIdcardQualityProcess;
    }

    public int idcardQualityInit(AssetManager assetManager, String modelPath) {
        int i = d;
        if (i != 0) {
            return i;
        }
        f = false;
        this.a.writeLock().lock();
        int iIdcardQualityModelInit = idcardQualityModelInit(assetManager, modelPath);
        this.a.writeLock().unlock();
        return iIdcardQualityModelInit;
    }

    public native int idcardQualityModelInit(AssetManager var1, String var2);

    public native int idcardQualityProcess(byte[] var1, int var2, int var3, boolean var4, int var5);

    public int idcardQualityRelease() {
        int i = d;
        if (i != 0) {
            return i;
        }
        f = true;
        this.a.writeLock().lock();
        idcardQualityCaptchaRelease();
        this.a.writeLock().unlock();
        return 0;
    }

    public void releaseModel() {
        idcardQualityRelease();
    }
}
