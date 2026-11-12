package com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.pattern.UpdateListener;
import com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorAnimation;
import com.huawei.animationkit.computationalwallpaper.pattern.arranger.impl.VectorArranger;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern;
import com.huawei.animationkit.computationalwallpaper.pattern.variable.VariableType;
import defpackage.bdo;
import defpackage.bfp;
import defpackage.bfr;
import defpackage.bft;
import java.io.File;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes23.dex */
public class VectorPattern extends AbstractPattern {
    private static final String ANIMATION_DELIMITER = ",";
    public static final Parcelable.Creator<VectorPattern> CREATOR = new Parcelable.Creator<VectorPattern>() { // from class: com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.VectorPattern.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public VectorPattern createFromParcel(Parcel parcel) {
            try {
                return new VectorPattern(parcel);
            } catch (bdo e) {
                parcel.writeException(e);
                return null;
            }
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public VectorPattern[] newArray(int i) {
            return new VectorPattern[i];
        }
    };
    private static final String DEFAULT_ANIMATION = "rotate";
    private static final String TAG = "VectorPattern";
    private static final String VECTOR_ANIMATION = "vector_animation";
    private String mAnimationType;
    private final bfp mRoot;
    private final VectorArranger mVectorArranger;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VectorPattern() {
        bfp bfpVar = new bfp();
        this.mRoot = bfpVar;
        VectorArranger vectorArranger = new VectorArranger();
        this.mVectorArranger = vectorArranger;
        bfpVar.b(vectorArranger);
    }

    protected VectorPattern(Parcel parcel) throws bdo {
        super(parcel);
        bfp bfpVar = new bfp();
        this.mRoot = bfpVar;
        this.mAnimationType = parcel.readString();
        VectorArranger vectorArranger = (VectorArranger) parcel.readParcelable(VectorArranger.class.getClassLoader());
        this.mVectorArranger = vectorArranger;
        bfpVar.b(vectorArranger);
        initVectorAnimation();
    }

    public void setAnimation(String str) throws bdo {
        if (str == null) {
            this.mAnimationType = DEFAULT_ANIMATION;
        } else if (!str.contains(",")) {
            this.mAnimationType = str;
        } else {
            String[] strArrSplit = str.split(",");
            this.mAnimationType = strArrSplit[bft.b().nextInt(VariableType.Random.RANDOM.getKey(), 0, strArrSplit.length)].trim();
        }
        initVectorAnimation();
    }

    public void setTransform(float f, float f2, int i, boolean z) {
        this.mVectorArranger.setTransform(f, f2, i, z);
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

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void setResource(List<String> list) {
        this.mRoot.a(list.get(0));
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void draw(Canvas canvas) {
        this.mRoot.draw(canvas);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public Bitmap toBitmap() {
        return this.mVectorArranger.toBitmap();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public List<Integer> getFinalColors() throws bdo {
        return this.mVectorArranger.getFinalColors();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void releaseBitmap() {
        this.mVectorArranger.releaseBitmap();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void startAnimation() {
        this.mVectorArranger.startAnimation();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void goFirstFrame() {
        this.mVectorArranger.goFirstFrame();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void setUpdateListener(UpdateListener updateListener) {
        this.mVectorArranger.setUpdateListener(updateListener);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void save(File file, Properties properties) throws bdo {
        super.save(file, properties);
        properties.put(VECTOR_ANIMATION, String.valueOf(this.mAnimationType));
        this.mVectorArranger.save(file, properties);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern
    public void load(File file, Properties properties, ColorResult colorResult) throws bdo {
        super.load(file, properties, colorResult);
        this.mAnimationType = properties.getProperty(VECTOR_ANIMATION);
        this.mVectorArranger.load(file, properties, colorResult);
        initVectorAnimation();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.pattern.AbstractPattern, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mAnimationType);
        parcel.writeParcelable(this.mVectorArranger, i);
    }

    private void initVectorAnimation() throws bdo {
        List<VectorAnimation> listE = bfr.e(this.mAnimationType);
        if (listE == null) {
            throw new bdo("error animation type");
        }
        this.mVectorArranger.setAnimation(listE);
    }
}
