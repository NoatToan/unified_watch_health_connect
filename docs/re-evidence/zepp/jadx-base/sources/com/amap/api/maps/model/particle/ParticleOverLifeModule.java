package com.amap.api.maps.model.particle;

import android.os.Parcel;
import android.os.Parcelable;
import com.autonavi.amap.mapcore.AbstractNativeInstance;
import com.autonavi.base.amap.mapcore.AMapNativeParticleSystem;
import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;

/* JADX INFO: loaded from: classes2.dex */
@JBindingInclude
public class ParticleOverLifeModule extends AbstractNativeInstance implements Parcelable {

    @JBindingExclude
    public static final Parcelable.Creator<ParticleOverLifeModule> CREATOR = new Parcelable.Creator<ParticleOverLifeModule>() { // from class: com.amap.api.maps.model.particle.ParticleOverLifeModule.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParticleOverLifeModule createFromParcel(Parcel parcel) {
            return new ParticleOverLifeModule(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ParticleOverLifeModule[] newArray(int i) {
            return new ParticleOverLifeModule[i];
        }
    };

    @JBindingExclude
    private static final int TYPE_COLOR = 3;

    @JBindingExclude
    private static final int TYPE_ROTATE = 1;

    @JBindingExclude
    private static final int TYPE_SCALE = 2;

    @JBindingExclude
    private static final int TYPE_VEL = 0;

    @JBindingExclude
    private ColorGenerate colorGenerate;
    private Object colorGenerateObject;

    @JBindingExclude
    private RotationOverLife rotateOverLife;
    private Object rotateOverLifeObject;

    @JBindingExclude
    private SizeOverLife sizeOverLife;
    private Object sizeOverLifeObject;
    private Object velocityOverLifeObject;

    @JBindingExclude
    private VelocityGenerate overLife = null;

    @JBindingExclude
    private VelocityGenerate velocityOverLife = null;

    @JBindingExclude
    private boolean isNeedReloadVelocityGenerate = false;

    @JBindingExclude
    private boolean isNeedReloadRotationOverLife = false;

    @JBindingExclude
    private boolean isNeedReloadSizeOverLife = false;

    @JBindingExclude
    private boolean isNeedReloadColorGenerate = false;

    @JBindingExclude
    public ParticleOverLifeModule(Parcel parcel) {
        this.nativeInstance = parcel.readLong();
    }

    @Override // com.autonavi.amap.mapcore.AbstractNativeInstance
    public void createNativeInstace() {
        try {
            this.nativeInstance = AMapNativeParticleSystem.nativeCreateParticleOverLifeModule();
            if (this.isNeedReloadVelocityGenerate) {
                setVelocityOverLife(this.overLife);
                this.isNeedReloadVelocityGenerate = false;
            }
            if (this.isNeedReloadRotationOverLife) {
                setRotateOverLife(this.rotateOverLife);
                this.isNeedReloadRotationOverLife = false;
            }
            if (this.isNeedReloadSizeOverLife) {
                setSizeOverLife(this.sizeOverLife);
                this.isNeedReloadSizeOverLife = false;
            }
            if (this.isNeedReloadColorGenerate) {
                setColorGenerate(this.colorGenerate);
                this.isNeedReloadColorGenerate = false;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Parcelable
    @JBindingExclude
    public int describeContents() {
        return 0;
    }

    @Override // com.autonavi.amap.mapcore.AbstractNativeInstance
    public void finalize() throws Throwable {
        super.finalize();
        long j = this.nativeInstance;
        if (j != 0) {
            AMapNativeParticleSystem.nativeReleaseParticleOverLifeModule(j);
            this.nativeInstance = 0L;
        }
    }

    public void setColorGenerate(ColorGenerate colorGenerate) {
        this.colorGenerate = colorGenerate;
        this.colorGenerateObject = colorGenerate;
        long j = this.nativeInstance;
        if (j == 0) {
            this.isNeedReloadColorGenerate = true;
        } else {
            if (colorGenerate == null) {
                AMapNativeParticleSystem.nativeSetOverLifeItem(j, 0L, 3);
                return;
            }
            if (colorGenerate.getNativeInstance() == 0) {
                this.colorGenerate.createNativeInstace();
            }
            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, this.colorGenerate.getNativeInstance(), 3);
        }
    }

    public void setRotateOverLife(RotationOverLife rotationOverLife) {
        this.rotateOverLife = rotationOverLife;
        this.rotateOverLifeObject = rotationOverLife;
        long j = this.nativeInstance;
        if (j == 0) {
            this.isNeedReloadRotationOverLife = true;
        } else {
            if (rotationOverLife == null) {
                AMapNativeParticleSystem.nativeSetOverLifeItem(j, 0L, 1);
                return;
            }
            if (rotationOverLife.getNativeInstance() == 0) {
                this.rotateOverLife.createNativeInstace();
            }
            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, this.rotateOverLife.getNativeInstance(), 1);
        }
    }

    public void setSizeOverLife(SizeOverLife sizeOverLife) {
        this.sizeOverLife = sizeOverLife;
        this.sizeOverLifeObject = sizeOverLife;
        long j = this.nativeInstance;
        if (j == 0) {
            this.isNeedReloadSizeOverLife = true;
        } else {
            if (sizeOverLife == null) {
                AMapNativeParticleSystem.nativeSetOverLifeItem(j, 0L, 2);
                return;
            }
            if (sizeOverLife.getNativeInstance() == 0) {
                this.sizeOverLife.createNativeInstace();
            }
            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, this.sizeOverLife.getNativeInstance(), 2);
        }
    }

    public void setVelocityOverLife(VelocityGenerate velocityGenerate) {
        this.overLife = velocityGenerate;
        this.velocityOverLife = velocityGenerate;
        this.velocityOverLifeObject = velocityGenerate;
        long j = this.nativeInstance;
        if (j == 0) {
            this.isNeedReloadVelocityGenerate = true;
        } else {
            if (velocityGenerate == null) {
                AMapNativeParticleSystem.nativeSetOverLifeItem(j, 0L, 0);
                return;
            }
            if (velocityGenerate.getNativeInstance() == 0) {
                this.overLife.createNativeInstace();
            }
            AMapNativeParticleSystem.nativeSetOverLifeItem(this.nativeInstance, this.overLife.getNativeInstance(), 0);
        }
    }

    @Override // android.os.Parcelable
    @JBindingExclude
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.nativeInstance);
    }

    public ParticleOverLifeModule() {
        createNativeInstace();
    }
}
