package com.huawei.animationkit.computationalwallpaper.graphicanalysis.impl;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.graphicanalysis.AiAnalysisStrategy;
import defpackage.bdn;
import defpackage.bdo;
import defpackage.bfe;
import defpackage.bff;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class AiStrategyImpl implements AiAnalysisStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<RectF> f5158b = Arrays.asList(new RectF(0.0625f, 0.0625f, 0.9375f, 0.9375f), new RectF(0.0f, 0.0f, 1.0f, 1.0f), new RectF(0.0f, 0.0f, 0.875f, 0.875f), new RectF(0.125f, 0.0f, 1.0f, 0.875f), new RectF(0.0f, 0.125f, 0.875f, 1.0f), new RectF(0.125f, 0.125f, 1.0f, 1.0f), new RectF(0.0f, 0.0f, 0.666f, 1.0f), new RectF(0.1665f, 0.0f, 0.8335f, 1.0f), new RectF(0.333f, 0.0f, 1.0f, 1.0f), new RectF(0.0f, 0.0f, 1.0f, 0.666f), new RectF(0.0f, 0.1665f, 1.0f, 0.8335f), new RectF(0.0f, 0.333f, 1.0f, 1.0f), new RectF(0.0f, 0.0f, 0.75f, 1.0f), new RectF(0.125f, 0.0f, 0.875f, 1.0f), new RectF(0.25f, 0.0f, 1.0f, 1.0f), new RectF(0.0f, 0.0f, 1.0f, 0.75f), new RectF(0.0f, 0.125f, 1.0f, 0.875f), new RectF(0.0f, 0.25f, 1.0f, 1.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AiStrategyImpl f5157a = new AiStrategyImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f5159c = {0.485f, 0.456f, 0.406f};
    private final float[] e = {0.229f, 0.224f, 0.225f};
    private boolean d = false;

    private native void getResult(float[] fArr, int i, float[] fArr2);

    private native int loadModel(String str);

    static {
        System.loadLibrary("mindspore-lite-wear");
        System.loadLibrary("dlliteclient_mindspore-wear");
        System.loadLibrary("dlliteclient-wear");
        System.loadLibrary("model");
    }

    private AiStrategyImpl() {
    }

    public static AiStrategyImpl a() {
        return f5157a;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.graphicanalysis.AiAnalysisStrategy
    public bfe analyze(Bitmap bitmap) throws bdo {
        bfe bfeVar;
        synchronized (this) {
            int i = 0;
            if (!this.d) {
                StringBuilder sb = new StringBuilder();
                sb.append(bdn.a());
                sb.append(File.separator);
                sb.append("model_weight8.ms");
                this.d = loadModel(sb.toString()) == 0;
            }
            if (!this.d) {
                Log.e("AiStrategyImpl", "model load failed");
                throw new bdo("model load failed");
            }
            Log.d("AiStrategyImpl", "width " + bitmap.getWidth() + " height " + bitmap.getHeight());
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap<String, Float> map = new HashMap<>();
            while (true) {
                List<RectF> list = f5158b;
                if (i >= list.size()) {
                    break;
                }
                b(d(bitmap, list.get(i)), map);
                i++;
            }
            Log.d("AiStrategyImpl", "Image Recognition cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                arrayList.add(new bfe.c(entry.getKey(), entry.getValue().floatValue()));
            }
            bfeVar = new bfe(arrayList);
        }
        return bfeVar;
    }

    private Bitmap d(Bitmap bitmap, RectF rectF) {
        return Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap, (int) (bitmap.getWidth() * rectF.left), (int) (bitmap.getHeight() * rectF.top), Math.max((int) (bitmap.getWidth() * rectF.width()), 1), Math.max((int) (bitmap.getHeight() * rectF.height()), 1)), 224, 224, true);
    }

    private void b(Bitmap bitmap, HashMap<String, Float> map) {
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        float[] fArr = new float[bitmap.getWidth() * bitmap.getHeight() * 3];
        for (int i = 0; i < bitmap.getHeight(); i++) {
            for (int i2 = 0; i2 < bitmap.getWidth(); i2++) {
                int i3 = iArr[(bitmap.getWidth() * i) + i2];
                fArr[(bitmap.getWidth() * i) + i2] = (((((16711680 & i3) >> 16) * 1.0f) / 255.0f) - this.f5159c[0]) / this.e[0];
                fArr[(bitmap.getHeight() * bitmap.getWidth()) + (bitmap.getWidth() * i) + i2] = (((((65280 & i3) >> 8) * 1.0f) / 255.0f) - this.f5159c[1]) / this.e[1];
                fArr[(bitmap.getHeight() * 2 * bitmap.getWidth()) + (bitmap.getWidth() * i) + i2] = ((((i3 & 255) * 1.0f) / 255.0f) - this.f5159c[2]) / this.e[2];
            }
        }
        float[] fArr2 = new float[10];
        getResult(fArr, bitmap.getWidth() * bitmap.getHeight() * 12, fArr2);
        double dExp = 0.0d;
        for (int i4 = 0; i4 < 10; i4++) {
            dExp += Math.exp(fArr2[i4]);
        }
        for (int i5 = 0; i5 < 10; i5++) {
            String str = bff.f1061a[i5];
            map.put(str, Float.valueOf(map.getOrDefault(str, Float.valueOf(0.0f)).floatValue() + ((float) (Math.exp(fArr2[i5]) / dExp))));
        }
    }
}
