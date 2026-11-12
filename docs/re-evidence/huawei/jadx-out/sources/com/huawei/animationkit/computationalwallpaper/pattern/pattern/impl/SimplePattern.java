package com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.pattern.UpdateListener;
import com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern;
import defpackage.bdo;
import defpackage.bfp;
import java.io.File;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes23.dex */
public class SimplePattern extends AbstractPattern {
    public static final Parcelable.Creator<SimplePattern> CREATOR = new Parcelable.Creator<SimplePattern>() { // from class: com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.SimplePattern.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SimplePattern createFromParcel(Parcel parcel) {
            return new SimplePattern(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimplePattern[] newArray(int i) {
            return new SimplePattern[i];
        }
    };
    private final Arranger mArranger;
    private final bfp mRoot;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SimplePattern(Arranger arranger) {
        bfp bfpVar = new bfp();
        this.mRoot = bfpVar;
        this.mArranger = arranger;
        bfpVar.b(arranger);
    }

    protected SimplePattern(Parcel parcel) {
        super(parcel);
        bfp bfpVar = new bfp();
        this.mRoot = bfpVar;
        Arranger arranger = (Arranger) parcel.readParcelable(Arranger.class.getClassLoader());
        this.mArranger = arranger;
        bfpVar.b(arranger);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.mRoot.setLocation(rect);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void setColor(ColorResult colorResult) {
        this.mRoot.b(colorResult);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void draw(Canvas canvas) {
        this.mRoot.draw(canvas);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public List<Integer> getFinalColors() throws bdo {
        return this.mArranger.getFinalColors();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void releaseBitmap() {
        this.mArranger.releaseBitmap();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void startAnimation() {
        this.mArranger.startAnimation();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void cancelAnimation() {
        this.mArranger.cancelAnimation();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void setUpdateListener(UpdateListener updateListener) {
        this.mArranger.setUpdateListener(updateListener);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mArranger, i);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void save(File file, Properties properties) throws bdo {
        super.save(file, properties);
        this.mArranger.save(file, properties);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void load(File file, Properties properties, ColorResult colorResult) throws bdo {
        super.load(file, properties, colorResult);
        this.mArranger.load(file, properties, colorResult);
    }
}
