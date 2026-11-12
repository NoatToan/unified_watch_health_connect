package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AnimationSet extends Animation {
    public static final Parcelable.Creator<AnimationSet> CREATOR = new maa();
    private boolean h;
    private List i;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimationSet createFromParcel(Parcel parcel) {
            return new AnimationSet(new ParcelReader(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimationSet[] newArray(int i) {
            return new AnimationSet[0];
        }

        maa() {
        }
    }

    protected AnimationSet(ParcelReader parcelReader) {
        super(parcelReader);
        this.i = new ArrayList();
        this.h = parcelReader.readBoolean(8, false);
        this.i = parcelReader.createTypedList(9, Animation.CREATOR, new ArrayList());
    }

    public AnimationSet(boolean z) {
        this.i = new ArrayList();
        this.f14289a = 5;
        this.h = z;
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public void setInterpolator(Interpolator interpolator) {
        this.f = interpolator;
        if (this.h) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((Animation) it.next()).setInterpolator(interpolator);
            }
        }
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public void setDuration(long j) {
        this.e = j;
    }

    public boolean isShareInterpolator() {
        return this.h;
    }

    public List<Animation> getAnimations() {
        return this.i;
    }

    public void cleanAnimation() {
        this.i.clear();
    }

    public void addAnimation(Animation animation) {
        if (this.h) {
            animation.setInterpolator(this.f);
        }
        this.i.add(animation);
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    protected void a(ParcelWrite parcelWrite, int i) {
        parcelWrite.writeBoolean(8, this.h);
        parcelWrite.writeTypedList(9, this.i, false);
    }
}
