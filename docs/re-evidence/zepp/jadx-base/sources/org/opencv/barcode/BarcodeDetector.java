package org.opencv.barcode;

import java.util.List;
import org.opencv.core.Mat;

/* JADX INFO: loaded from: classes23.dex */
public class BarcodeDetector {
    public final long nativeObj;

    public BarcodeDetector(long j) {
        this.nativeObj = j;
    }

    private static native long BarcodeDetector_0(String str, String str2);

    private static native long BarcodeDetector_1(String str);

    private static native long BarcodeDetector_2();

    public static BarcodeDetector __fromPtr__(long j) {
        return new BarcodeDetector(j);
    }

    private static native boolean decode_0(long j, long j2, long j3, List<String> list, List<Integer> list2);

    private static native void delete(long j);

    private static native boolean detectAndDecode_0(long j, long j2, List<String> list, List<Integer> list2, long j3);

    private static native boolean detectAndDecode_1(long j, long j2, List<String> list, List<Integer> list2);

    private static native boolean detect_0(long j, long j2, long j3);

    public boolean decode(Mat mat, Mat mat2, List<String> list, List<Integer> list2) {
        return decode_0(this.nativeObj, mat.nativeObj, mat2.nativeObj, list, list2);
    }

    public boolean detect(Mat mat, Mat mat2) {
        return detect_0(this.nativeObj, mat.nativeObj, mat2.nativeObj);
    }

    public boolean detectAndDecode(Mat mat, List<String> list, List<Integer> list2, Mat mat2) {
        return detectAndDecode_0(this.nativeObj, mat.nativeObj, list, list2, mat2.nativeObj);
    }

    public void finalize() throws Throwable {
        delete(this.nativeObj);
    }

    public long getNativeObjAddr() {
        return this.nativeObj;
    }

    public BarcodeDetector(String str, String str2) {
        this.nativeObj = BarcodeDetector_0(str, str2);
    }

    public boolean detectAndDecode(Mat mat, List<String> list, List<Integer> list2) {
        return detectAndDecode_1(this.nativeObj, mat.nativeObj, list, list2);
    }

    public BarcodeDetector(String str) {
        this.nativeObj = BarcodeDetector_1(str);
    }

    public BarcodeDetector() {
        this.nativeObj = BarcodeDetector_2();
    }
}
