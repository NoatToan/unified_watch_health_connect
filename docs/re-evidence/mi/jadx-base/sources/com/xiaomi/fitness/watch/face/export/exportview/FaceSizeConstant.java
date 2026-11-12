package com.xiaomi.fitness.watch.face.export.exportview;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/exportview/FaceSizeConstant;", "", "<init>", "()V", "TYPE_ROUND_WATCH", "", "TYPE_SQUARE_WATCH", "TYPE_ROUND_BAND", "TYPE_SQUARE_BAND", "currentType", "setCurrentType", "", "type", "getCurrentType", "getFaceEntranceDimension", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceEntranceDimension;", "normal", "", "getFaceMarketCommonDimension", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceMarketCommonDimension;", "getFaceMarketPhotoDimension", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceMarketPhotoDimension;", "getFaceCategoryDimension", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceCategoryDimension;", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceSizeConstant {

    @NotNull
    public static final FaceSizeConstant INSTANCE = new FaceSizeConstant();
    public static final int TYPE_ROUND_BAND = 3;
    public static final int TYPE_ROUND_WATCH = 1;
    public static final int TYPE_SQUARE_BAND = 4;
    public static final int TYPE_SQUARE_WATCH = 2;
    private static int currentType;

    private FaceSizeConstant() {
    }

    public static /* synthetic */ FaceCategoryDimension getFaceCategoryDimension$default(FaceSizeConstant faceSizeConstant, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = currentType;
        }
        return faceSizeConstant.getFaceCategoryDimension(i);
    }

    public static /* synthetic */ FaceEntranceDimension getFaceEntranceDimension$default(FaceSizeConstant faceSizeConstant, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            i = currentType;
        }
        return faceSizeConstant.getFaceEntranceDimension(z, i);
    }

    public static /* synthetic */ FaceMarketCommonDimension getFaceMarketCommonDimension$default(FaceSizeConstant faceSizeConstant, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = currentType;
        }
        return faceSizeConstant.getFaceMarketCommonDimension(i);
    }

    public static /* synthetic */ FaceMarketPhotoDimension getFaceMarketPhotoDimension$default(FaceSizeConstant faceSizeConstant, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = currentType;
        }
        return faceSizeConstant.getFaceMarketPhotoDimension(i);
    }

    public final int getCurrentType() {
        return currentType;
    }

    @NotNull
    public final FaceCategoryDimension getFaceCategoryDimension(int type) {
        if (type == 1) {
            return new FaceCategoryDimension(69.33f, 12.0f, 18.0f);
        }
        if (type == 2) {
            return new FaceCategoryDimension(60.67f, 16.0f, 18.0f);
        }
        if (type != 3) {
            return type != 4 ? new FaceCategoryDimension(0.0f, 0.0f, 0.0f) : new FaceCategoryDimension(43.0f, 16.0f, 20.59f);
        }
        return new FaceCategoryDimension(30.0f, 16.0f, 18.0f);
    }

    @NotNull
    public final FaceEntranceDimension getFaceEntranceDimension(boolean normal, int type) {
        if (normal) {
            if (type == 1) {
                return new FaceEntranceDimension(66.67f, 30.33f, 23.33f, 12.0f);
            }
            if (type == 2) {
                return new FaceEntranceDimension(66.0f, 30.0f, 23.67f, 12.33f);
            }
            if (type != 3) {
                return type != 4 ? new FaceEntranceDimension(0.0f, 0.0f, 0.0f, 0.0f) : new FaceEntranceDimension(66.67f, 32.0f, 26.67f, 12.33f);
            }
            return new FaceEntranceDimension(76.0f, 37.0f, 27.67f, 7.33f);
        }
        if (type == 1) {
            return new FaceEntranceDimension(66.67f, 30.33f, 46.67f, 12.0f);
        }
        if (type == 2) {
            return new FaceEntranceDimension(66.0f, 30.0f, 46.67f, 12.33f);
        }
        if (type != 3) {
            return type != 4 ? new FaceEntranceDimension(0.0f, 0.0f, 0.0f, 0.0f) : new FaceEntranceDimension(66.67f, 32.0f, 46.67f, 12.33f);
        }
        return new FaceEntranceDimension(76.0f, 37.0f, 46.67f, 7.33f);
    }

    @NotNull
    public final FaceMarketCommonDimension getFaceMarketCommonDimension(int type) {
        if (type == 1) {
            return new FaceMarketCommonDimension(108.0f);
        }
        if (type == 2) {
            return new FaceMarketCommonDimension(93.33f);
        }
        if (type != 3) {
            return type != 4 ? new FaceMarketCommonDimension(0.0f) : new FaceMarketCommonDimension(80.0f);
        }
        return new FaceMarketCommonDimension(54.67f);
    }

    @NotNull
    public final FaceMarketPhotoDimension getFaceMarketPhotoDimension(int type) {
        if (type == 1) {
            return new FaceMarketPhotoDimension(63.33f, 30.0f, 14.0f, 21.33f, 18.67f);
        }
        if (type == 2) {
            return new FaceMarketPhotoDimension(53.33f, 32.0f, 16.0f, 12.0f, 20.0f);
        }
        if (type != 3) {
            return type != 4 ? new FaceMarketPhotoDimension(0.0f, 0.0f, 0.0f, 0.0f, 0.0f) : new FaceMarketPhotoDimension(53.33f, 32.0f, 16.0f, 12.0f, 20.0f);
        }
        return new FaceMarketPhotoDimension(34.0f, 28.0f, 16.0f, 12.0f, 20.0f);
    }

    public final void setCurrentType(int type) {
        if (type == 0) {
            return;
        }
        currentType = type;
    }
}
