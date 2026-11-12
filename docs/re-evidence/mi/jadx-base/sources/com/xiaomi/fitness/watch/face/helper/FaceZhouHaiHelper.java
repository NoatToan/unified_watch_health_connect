package com.xiaomi.fitness.watch.face.helper;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.cdm;
import defpackage.ddm;
import defpackage.edm;
import defpackage.ld5;
import defpackage.md5;
import defpackage.nd5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0006*\u0003\u001f\"%\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJK\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/watch/face/helper/FaceZhouHaiHelper;", "", "", "deviceType", "Lcom/xiaomi/fitness/watch/face/helper/FaceZhouHaiListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setZhouHaiFaceListener", "(ILcom/xiaomi/fitness/watch/face/helper/FaceZhouHaiListener;)V", "zhouHaiDeviceType", "", "data", "red", "green", "blue", "Landroid/graphics/Bitmap;", "bg", "up", "getCustomClockDialData", "(I[BIIILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "mListener", "Lcom/xiaomi/fitness/watch/face/helper/FaceZhouHaiListener;", "Lld5;", "mMulanCustomClockDial", "Lld5;", "Lmd5;", "mM69CustomClockDial", "Lmd5;", "Lnd5;", "mM65ACustomClockDial", "Lnd5;", "com/xiaomi/fitness/watch/face/helper/FaceZhouHaiHelper$mMulanPerformerListener$1", "mMulanPerformerListener", "Lcom/xiaomi/fitness/watch/face/helper/FaceZhouHaiHelper$mMulanPerformerListener$1;", "com/xiaomi/fitness/watch/face/helper/FaceZhouHaiHelper$mM69PerformerListener$1", "mM69PerformerListener", "Lcom/xiaomi/fitness/watch/face/helper/FaceZhouHaiHelper$mM69PerformerListener$1;", "com/xiaomi/fitness/watch/face/helper/FaceZhouHaiHelper$m65APerformListener$1", "m65APerformListener", "Lcom/xiaomi/fitness/watch/face/helper/FaceZhouHaiHelper$m65APerformListener$1;", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceZhouHaiHelper {

    @Nullable
    private static FaceZhouHaiListener mListener;

    @NotNull
    public static final FaceZhouHaiHelper INSTANCE = new FaceZhouHaiHelper();

    @NotNull
    private static final ld5 mMulanCustomClockDial = new ld5();

    @NotNull
    private static final md5 mM69CustomClockDial = new md5();

    @NotNull
    private static final nd5 mM65ACustomClockDial = new nd5();

    @NotNull
    private static final FaceZhouHaiHelper$mMulanPerformerListener$1 mMulanPerformerListener = new edm() { // from class: com.xiaomi.fitness.watch.face.helper.FaceZhouHaiHelper$mMulanPerformerListener$1
        @Override // defpackage.edm
        public void onResponseCustomDialData(byte[] p0) {
            super.onResponseCustomDialData(p0);
            FaceZhouHaiListener faceZhouHaiListener = FaceZhouHaiHelper.mListener;
            if (faceZhouHaiListener != null) {
                faceZhouHaiListener.onResponseCustomDialData(p0);
            }
        }

        @Override // defpackage.edm
        public void onResponseCustomDialEffectImg(Bitmap p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            super.onResponseCustomDialEffectImg(p0);
            FaceZhouHaiListener faceZhouHaiListener = FaceZhouHaiHelper.mListener;
            if (faceZhouHaiListener != null) {
                faceZhouHaiListener.onResponseCustomDialEffectImg(p0);
            }
        }
    };

    @NotNull
    private static final FaceZhouHaiHelper$mM69PerformerListener$1 mM69PerformerListener = new ddm() { // from class: com.xiaomi.fitness.watch.face.helper.FaceZhouHaiHelper$mM69PerformerListener$1
        @Override // defpackage.ddm
        public void onResponseCustomDialData(byte[] p0) {
            super.onResponseCustomDialData(p0);
            FaceZhouHaiListener faceZhouHaiListener = FaceZhouHaiHelper.mListener;
            if (faceZhouHaiListener != null) {
                faceZhouHaiListener.onResponseCustomDialData(p0);
            }
        }

        @Override // defpackage.ddm
        public void onResponseCustomDialEffectImg(Bitmap p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            super.onResponseCustomDialEffectImg(p0);
            FaceZhouHaiListener faceZhouHaiListener = FaceZhouHaiHelper.mListener;
            if (faceZhouHaiListener != null) {
                faceZhouHaiListener.onResponseCustomDialEffectImg(p0);
            }
        }
    };

    @NotNull
    private static final FaceZhouHaiHelper$m65APerformListener$1 m65APerformListener = new cdm() { // from class: com.xiaomi.fitness.watch.face.helper.FaceZhouHaiHelper$m65APerformListener$1
        @Override // defpackage.cdm
        public void onResponseCustomDialData(byte[] p0) {
            super.onResponseCustomDialData(p0);
            FaceZhouHaiListener faceZhouHaiListener = FaceZhouHaiHelper.mListener;
            if (faceZhouHaiListener != null) {
                faceZhouHaiListener.onResponseCustomDialData(p0);
            }
        }

        @Override // defpackage.cdm
        public void onResponseCustomDialEffectImg(Bitmap p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            super.onResponseCustomDialEffectImg(p0);
            FaceZhouHaiListener faceZhouHaiListener = FaceZhouHaiHelper.mListener;
            if (faceZhouHaiListener != null) {
                faceZhouHaiListener.onResponseCustomDialEffectImg(p0);
            }
        }
    };

    private FaceZhouHaiHelper() {
    }

    public final void getCustomClockDialData(int zhouHaiDeviceType, @Nullable byte[] data, int red, int green, int blue, @Nullable Bitmap bg, @Nullable Bitmap up) {
        if (zhouHaiDeviceType == 1) {
            mMulanCustomClockDial.f(data, red, green, blue, bg, up);
        } else if (zhouHaiDeviceType == 2) {
            mM69CustomClockDial.d(data, red, green, blue, bg, up);
        } else {
            if (zhouHaiDeviceType != 3) {
                return;
            }
            mM65ACustomClockDial.d(data, red, green, blue, bg, up);
        }
    }

    public final void setZhouHaiFaceListener(int deviceType, @NotNull FaceZhouHaiListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        mListener = listener;
        if (deviceType == 1) {
            mMulanCustomClockDial.g(mMulanPerformerListener);
        } else if (deviceType == 2) {
            mM69CustomClockDial.e(mM69PerformerListener);
        } else {
            if (deviceType != 3) {
                return;
            }
            mM65ACustomClockDial.e(m65APerformListener);
        }
    }
}
