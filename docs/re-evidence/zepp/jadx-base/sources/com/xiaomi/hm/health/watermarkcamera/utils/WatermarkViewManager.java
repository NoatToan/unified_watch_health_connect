package com.xiaomi.hm.health.watermarkcamera.utils;

import android.content.Context;
import android.view.View;
import com.xiaomi.hm.health.watermarkcamera.entity.Watermark;
import com.xiaomi.hm.health.watermarkcamera.ui.activity.WatermarkShareActivity;
import com.xiaomi.hm.health.watermarkcamera.ui.widget.CustomWatermarkView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkViewManager {
    private List<Watermark> b;
    private List<Watermark> d;
    private WatermarkViewGenerator e;
    private boolean g;
    private WatermarkShareActivity h;
    private Context i;
    private List<WatermarkViewGenerator> a = new ArrayList();
    private List<WatermarkViewGenerator> c = new ArrayList();
    private int f = 16;

    public WatermarkViewManager(Context context, List<Watermark> list, List<Watermark> list2, boolean z, WatermarkShareActivity watermarkShareActivity) {
        this.b = new ArrayList();
        this.d = new ArrayList();
        this.i = context;
        this.b = list;
        this.d = list2;
        this.g = z;
        this.h = watermarkShareActivity;
        a(list, false);
        a(this.d, true);
    }

    private void a(List<Watermark> list, boolean z) {
        Iterator<Watermark> it2 = list.iterator();
        while (it2.hasNext()) {
            WatermarkViewGenerator watermarkViewGenerator = new WatermarkViewGenerator(this.i, it2.next(), this.g);
            watermarkViewGenerator.O(this.h);
            if (z) {
                this.c.add(watermarkViewGenerator);
            } else {
                this.a.add(watermarkViewGenerator);
            }
        }
    }

    public void clearWatermarkViews(boolean z) {
        if (z) {
            for (int i = 0; i < this.a.size(); i++) {
                CustomWatermarkView selfCustomWatermarkView = this.a.get(i).getSelfCustomWatermarkView();
                if (selfCustomWatermarkView != null) {
                    selfCustomWatermarkView.recycleBitmap();
                }
            }
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                CustomWatermarkView selfCustomWatermarkView2 = this.c.get(i2).getSelfCustomWatermarkView();
                if (selfCustomWatermarkView2 != null) {
                    selfCustomWatermarkView2.recycleBitmap();
                }
            }
        }
        this.a.clear();
        this.c.clear();
        if (z) {
            this.a = null;
            this.c = null;
            this.e = null;
        }
    }

    public void dealWatermarkBlackWhiteReverseColor(int i, boolean z) {
        setGeneratorBlackOrWhite(i, z);
        getWatermarkView(i);
        if (isStickerCategory()) {
            if (this.c.size() > i) {
                this.c.get(i).D(this.d.get(i).type, z);
                return;
            }
            return;
        }
        if (this.a.size() > i) {
            this.a.get(i).D(this.b.get(i).type, z);
        }
    }

    public View getWatermarkView(int i) {
        this.e = null;
        if (isStickerCategory()) {
            if (this.c.size() <= i) {
                return null;
            }
            WatermarkViewGenerator watermarkViewGenerator = this.c.get(i);
            this.e = watermarkViewGenerator;
            return watermarkViewGenerator.E();
        }
        if (this.a.size() <= i) {
            return null;
        }
        WatermarkViewGenerator watermarkViewGenerator2 = this.a.get(i);
        this.e = watermarkViewGenerator2;
        return watermarkViewGenerator2.E();
    }

    public boolean isStickerCategory() {
        return this.f == 17;
    }

    public boolean isStickerMarkView() {
        WatermarkViewGenerator watermarkViewGenerator = this.e;
        if (watermarkViewGenerator != null) {
            return watermarkViewGenerator.getWatermark().isSticker;
        }
        return false;
    }

    public void reinitGenerators(List<Watermark> list, boolean z, boolean z2) {
        if (z2) {
            this.d.addAll(list);
        } else {
            this.b.addAll(list);
        }
        this.g = z;
        Iterator<Watermark> it2 = list.iterator();
        while (it2.hasNext()) {
            WatermarkViewGenerator watermarkViewGenerator = new WatermarkViewGenerator(this.i, it2.next(), this.g);
            watermarkViewGenerator.O(this.h);
            if (z2) {
                this.c.add(watermarkViewGenerator);
            } else {
                this.a.add(watermarkViewGenerator);
            }
        }
    }

    public void setCurrentMarkViewReverseColor(boolean z) {
        WatermarkViewGenerator watermarkViewGenerator = this.e;
        if (watermarkViewGenerator != null) {
            this.e.D(watermarkViewGenerator.getWatermark().type, z);
        }
    }

    public void setGeneratorBlackOrWhite(int i, boolean z) {
        if (isStickerCategory()) {
            if (this.c.size() > i) {
                this.c.get(i).P(z);
            }
        } else if (this.a.size() > i) {
            this.a.get(i).P(z);
        }
    }

    public void setTabToSticker(boolean z) {
        if (z) {
            this.f = 17;
        } else {
            this.f = 16;
        }
    }
}
