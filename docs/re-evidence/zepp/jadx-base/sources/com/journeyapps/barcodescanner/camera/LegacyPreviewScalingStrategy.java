package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.Size;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class LegacyPreviewScalingStrategy extends PreviewScalingStrategy {
    private static final String b = "LegacyPreviewScalingStrategy";

    public class a implements Comparator<Size> {
        public final /* synthetic */ Size a;

        public a(Size size) {
            this.a = size;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            int i = LegacyPreviewScalingStrategy.scale(size, this.a).width - size.width;
            int i2 = LegacyPreviewScalingStrategy.scale(size2, this.a).width - size2.width;
            if (i == 0 && i2 == 0) {
                return size.compareTo(size2);
            }
            if (i == 0) {
                return -1;
            }
            if (i2 == 0) {
                return 1;
            }
            if (i < 0 && i2 < 0) {
                return size.compareTo(size2);
            }
            if (i <= 0 || i2 <= 0) {
                return i < 0 ? -1 : 1;
            }
            return -size.compareTo(size2);
        }
    }

    public static Size scale(Size size, Size size2) {
        Size sizeScale;
        if (size2.fitsIn(size)) {
            while (true) {
                sizeScale = size.scale(2, 3);
                Size sizeScale2 = size.scale(1, 2);
                if (!size2.fitsIn(sizeScale2)) {
                    break;
                }
                size = sizeScale2;
            }
            return size2.fitsIn(sizeScale) ? sizeScale : size;
        }
        do {
            Size sizeScale3 = size.scale(3, 2);
            size = size.scale(2, 1);
            if (size2.fitsIn(sizeScale3)) {
                return sizeScale3;
            }
        } while (!size2.fitsIn(size));
        return size;
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public Size getBestPreviewSize(List<Size> list, Size size) {
        if (size == null) {
            return list.get(0);
        }
        Collections.sort(list, new a(size));
        String str = b;
        Log.i(str, "Viewfinder size: " + size);
        Log.i(str, "Preview in order of preference: " + list);
        return list.get(0);
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public Rect scalePreview(Size size, Size size2) {
        Size sizeScale = scale(size, size2);
        Log.i(b, "Preview: " + size + "; Scaled: " + sizeScale + "; Want: " + size2);
        int i = (sizeScale.width - size2.width) / 2;
        int i2 = (sizeScale.height - size2.height) / 2;
        return new Rect(-i, -i2, sizeScale.width - i, sizeScale.height - i2);
    }
}
