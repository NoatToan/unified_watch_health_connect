package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.Size;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class PreviewScalingStrategy {
    private static final String a = "PreviewScalingStrategy";

    public class a implements Comparator<Size> {
        public final /* synthetic */ Size a;

        public a(Size size) {
            this.a = size;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return Float.compare(PreviewScalingStrategy.this.getScore(size2, this.a), PreviewScalingStrategy.this.getScore(size, this.a));
        }
    }

    public List<Size> getBestPreviewOrder(List<Size> list, Size size) {
        if (size == null) {
            return list;
        }
        Collections.sort(list, new a(size));
        return list;
    }

    public Size getBestPreviewSize(List<Size> list, Size size) {
        List<Size> bestPreviewOrder = getBestPreviewOrder(list, size);
        String str = a;
        Log.i(str, "Viewfinder size: " + size);
        Log.i(str, "Preview in order of preference: " + bestPreviewOrder);
        return bestPreviewOrder.get(0);
    }

    public float getScore(Size size, Size size2) {
        return 0.5f;
    }

    public abstract Rect scalePreview(Size size, Size size2);
}
