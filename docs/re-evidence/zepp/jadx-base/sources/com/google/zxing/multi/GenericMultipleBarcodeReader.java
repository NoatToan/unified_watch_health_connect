package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    private static final int b = 100;
    private static final int c = 4;
    private final Reader a;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.a = reader;
    }

    private void a(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i, int i2, int i3) {
        boolean z;
        float f;
        if (i3 > 4) {
            return;
        }
        try {
            Result resultDecode = this.a.decode(binaryBitmap, map);
            Iterator<Result> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().getText().equals(resultDecode.getText())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                list.add(b(resultDecode, i, i2));
            }
            ResultPoint[] resultPoints = resultDecode.getResultPoints();
            if (resultPoints == null || resultPoints.length == 0) {
                return;
            }
            int width = binaryBitmap.getWidth();
            int height = binaryBitmap.getHeight();
            float f2 = width;
            float f3 = height;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (ResultPoint resultPoint : resultPoints) {
                if (resultPoint != null) {
                    float x = resultPoint.getX();
                    float y = resultPoint.getY();
                    if (x < f2) {
                        f2 = x;
                    }
                    if (y < f3) {
                        f3 = y;
                    }
                    if (x > f4) {
                        f4 = x;
                    }
                    if (y > f5) {
                        f5 = y;
                    }
                }
            }
            if (f2 > 100.0f) {
                f = f4;
                a(binaryBitmap.crop(0, 0, (int) f2, height), map, list, i, i2, i3 + 1);
            } else {
                f = f4;
            }
            if (f3 > 100.0f) {
                a(binaryBitmap.crop(0, 0, width, (int) f3), map, list, i, i2, i3 + 1);
            }
            float f6 = f;
            if (f6 < width - 100) {
                int i4 = (int) f6;
                a(binaryBitmap.crop(i4, 0, width - i4, height), map, list, i + i4, i2, i3 + 1);
            }
            if (f5 < height - 100) {
                int i5 = (int) f5;
                a(binaryBitmap.crop(0, i5, width, height - i5), map, list, i, i2 + i5, i3 + 1);
            }
        } catch (ReaderException unused) {
        }
    }

    private static Result b(Result result, int i, int i2) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i3 = 0; i3 < resultPoints.length; i3++) {
            ResultPoint resultPoint = resultPoints[i3];
            if (resultPoint != null) {
                resultPointArr[i3] = new ResultPoint(resultPoint.getX() + i, resultPoint.getY() + i2);
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        a(binaryBitmap, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }
}
