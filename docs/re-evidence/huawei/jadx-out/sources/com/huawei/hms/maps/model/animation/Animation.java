package com.huawei.hms.maps.model.animation;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Animation implements Parcelable {
    public static final Parcelable.Creator<Animation> CREATOR = new maa();
    public static final int FILL_MODE_BACKWARDS = 1;
    public static final int FILL_MODE_FORWARDS = 0;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f14289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f14290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f14291c;
    protected int d;
    protected long e;
    protected Interpolator f;
    protected AnimationListener g;

    public interface AnimationListener {
        void onAnimationEnd();

        void onAnimationStart();
    }

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Animation createFromParcel(Parcel parcel) {
            return Animation.b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Animation[] newArray(int i) {
            return new Animation[0];
        }

        maa() {
        }
    }

    public Animation() {
        this.f14290b = 0;
        this.f14291c = 1;
        this.d = 0;
        this.e = 250L;
    }

    protected abstract void a(ParcelWrite parcelWrite, int i);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract void setDuration(long j);

    public abstract void setInterpolator(Interpolator interpolator);

    protected Animation(ParcelReader parcelReader) {
        this.f14290b = 0;
        this.f14291c = 1;
        this.d = 0;
        this.e = 250L;
        this.f14289a = parcelReader.readInt(2, 0);
        this.f14290b = parcelReader.readInt(3, 0);
        this.f14291c = parcelReader.readInt(4, 0);
        this.d = parcelReader.readInt(5, 0);
        this.e = parcelReader.readLong(6, 0L);
        IBinder iBinder = parcelReader.readIBinder(7, null);
        if (iBinder != null) {
            this.f = (Interpolator) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.f14289a);
        parcelWrite.writeInt(3, this.f14290b);
        parcelWrite.writeInt(4, this.f14291c);
        parcelWrite.writeInt(5, this.d);
        parcelWrite.writeLong(6, this.e);
        parcelWrite.writeIBinder(7, ObjectWrapper.wrap(this.f).asBinder(), false);
        a(parcelWrite, i);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public void setRepeatMode(int i) {
        this.f14291c = i;
    }

    public void setRepeatCount(int i) {
        this.d = i;
    }

    public void setFillMode(int i) {
        this.f14290b = i;
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.g = animationListener;
    }

    public int getRepeatMode() {
        return this.f14291c;
    }

    public int getRepeatCount() {
        return this.d;
    }

    public AnimationListener getListener() {
        return this.g;
    }

    public Interpolator getInterpolator() {
        return this.f;
    }

    public int getFillMode() {
        return this.f14290b;
    }

    public long getDuration() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Animation b(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        int i = parcelReader.readInt(2, 0);
        if (i == 1) {
            return new AlphaAnimation(parcelReader);
        }
        if (i == 2) {
            return new RotateAnimation(parcelReader);
        }
        if (i == 3) {
            return new ScaleAnimation(parcelReader);
        }
        if (i == 4) {
            return new TranslateAnimation(parcelReader);
        }
        if (i != 5) {
            return null;
        }
        return new AnimationSet(parcelReader);
    }
}
