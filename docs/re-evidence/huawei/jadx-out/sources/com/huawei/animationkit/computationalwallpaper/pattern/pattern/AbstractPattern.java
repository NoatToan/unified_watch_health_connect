package com.huawei.animationkit.computationalwallpaper.pattern.pattern;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import defpackage.bdo;
import java.io.File;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractPattern implements Pattern {
    private static final String PATTERN_TAG = "tag";
    private Rect mBounds;
    private String mTag;

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void setResource(List<String> list) throws bdo {
    }

    public AbstractPattern() {
    }

    public AbstractPattern(Parcel parcel) {
        this.mTag = parcel.readString();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void setBounds(Rect rect) {
        this.mBounds = rect;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTag);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public Rect getBounds() {
        return new Rect(this.mBounds);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public Bitmap toBitmap() {
        if (this.mBounds.isEmpty()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.mBounds.width(), this.mBounds.height(), Bitmap.Config.RGB_565);
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void save(File file, Properties properties) throws bdo {
        properties.put("tag", this.mTag);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void load(File file, Properties properties, ColorResult colorResult) throws bdo {
        this.mTag = properties.getProperty("tag", "");
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void setTag(String str) {
        if (str != null) {
            this.mTag = str;
        } else {
            this.mTag = "";
        }
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public String getTag() {
        return this.mTag;
    }
}
