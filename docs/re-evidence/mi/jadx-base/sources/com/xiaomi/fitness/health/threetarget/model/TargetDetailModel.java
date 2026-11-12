package com.xiaomi.fitness.health.threetarget.model;

import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B%\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/model/TargetDetailModel;", "", "<init>", "()V", "type", "", "elementName", "", "elementValueStr", "(ILjava/lang/String;Ljava/lang/String;)V", "setType", "", "getNameImg", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TargetDetailModel {
    public static final int TYPE_BREATHE = 5;
    public static final int TYPE_CALORIE = 2;
    public static final int TYPE_MH_INTENSITY = 4;
    public static final int TYPE_STANDING = 3;
    public static final int TYPE_STEP = 1;

    @NotNull
    private static final String VIDEO_HEART_RATE_DIR = "threetarget/";

    @NotNull
    public static final String VIDEO_THREE_TARGET_MH_NIGHT_PROGRESS = "http://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/three-target/ThreeTargetNightMH.mp4?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=eDgm92JJMuKcu+QprJWFFIUt0Fw=";

    @NotNull
    public static final String VIDEO_THREE_TARGET_MH_PROGRESS = "http://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/three-target/ThreeTargetMH.mp4?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=knxPFSMf2SzCwi+NwliC8XdenjA=";

    @NotNull
    public static final String VIDEO_THREE_TARGET_STAND_NIGHT_PROGRESS = "http://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/three-target/ThreeTargetNightStand.mp4?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=B79FGd/9IKFXr3c3rsGTeknN5yE=";

    @NotNull
    public static final String VIDEO_THREE_TARGET_STAND_PROGRESS = "http://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/three-target/ThreeTargetStand.mp4?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=u82RlD92JdIYJrQW5Jsumzl1+lA=";

    @JvmField
    @Nullable
    public String elementName;

    @JvmField
    @Nullable
    public String elementValueStr;

    @JvmField
    public int type;

    public TargetDetailModel() {
    }

    public TargetDetailModel(int i, @Nullable String str, @Nullable String str2) {
        this.type = i;
        this.elementName = str;
        this.elementValueStr = str2;
    }

    public final int getNameImg(int type) {
        if (type == 1) {
            return pni.M3;
        }
        if (type == 2) {
            return pni.K3;
        }
        if (type != 3) {
            return type != 4 ? pni.A1 : pni.A1;
        }
        return pni.L3;
    }

    public final void setType(int type) {
        this.type = type;
    }
}
