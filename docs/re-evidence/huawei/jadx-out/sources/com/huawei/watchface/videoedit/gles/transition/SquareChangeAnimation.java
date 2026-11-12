package com.huawei.watchface.videoedit.gles.transition;

import android.text.TextUtils;
import com.huawei.watchface.videoedit.gles.animations.MeshChanger;
import com.huawei.watchface.videoedit.utils.Utils;

/* JADX INFO: loaded from: classes20.dex */
public class SquareChangeAnimation implements MeshChanger {
    public static final String BIG = "big";
    private static final float DELTA = 0.05f;
    public static final String DOWN = "down";
    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    private static final float SCALE_EXTRA = 1.5f;
    public static final String SMALL = "small";
    public static final String UP = "up";
    private float mDelta = 0.05f;
    private final String mType;

    public SquareChangeAnimation(String str) {
        this.mType = str;
    }

    private void big(float[] fArr, float f, float f2) {
        float f3 = f2 * f;
        float f4 = 1.0f - f3;
        setCoordinateUv(fArr, f4, f3, f3, f4);
    }

    private void down(float[] fArr, float f, float f2) {
        float f3 = 2.0f * f2;
        setCoordinateUv(fArr, 1.0f - (f3 * f), f3 * (1.0f - f), f2, 1.0f - f2);
    }

    private void left(float[] fArr, float f, float f2) {
        float f3 = 2.0f * f2;
        setCoordinateUv(fArr, 1.0f - f2, f2, f3 * f, 1.0f - (f3 * (1.0f - f)));
    }

    private void right(float[] fArr, float f, float f2) {
        float f3 = 2.0f * f2;
        setCoordinateUv(fArr, 1.0f - f2, f2, f3 * (1.0f - f), 1.0f - (f3 * f));
    }

    private void setCoordinateUv(float[] fArr, float f, float f2, float f3, float f4) {
        fArr[11] = f;
        fArr[15] = f;
        fArr[3] = f2;
        fArr[7] = f2;
        fArr[2] = f3;
        fArr[10] = f3;
        fArr[6] = f4;
        fArr[14] = f4;
    }

    private void small(float[] fArr, float f, float f2) {
        float f3 = f2 * (1.0f - f);
        float f4 = 1.0f - f3;
        setCoordinateUv(fArr, f4, f3, f3, f4);
    }

    private void up(float[] fArr, float f, float f2) {
        float f3 = 2.0f * f2;
        setCoordinateUv(fArr, 1.0f - ((1.0f - f) * f3), f3 * f, f2, 1.0f - f2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    @Override // com.huawei.watchface.videoedit.gles.animations.MeshChanger
    public void changeMesh(float[] fArr, float f, int i) {
        byte b2;
        if (TextUtils.isEmpty(this.mType)) {
            return;
        }
        String str = this.mType;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "up":
                b2 = 0;
                break;
            case "big":
                b2 = 1;
                break;
            case "down":
                b2 = 2;
                break;
            case "left":
                b2 = 3;
                break;
            case "right":
                b2 = 4;
                break;
            case "small":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            up(fArr, f, this.mDelta);
        } else if (b2 == 1) {
            big(fArr, f, this.mDelta * SCALE_EXTRA);
        } else if (b2 == 2) {
            down(fArr, f, this.mDelta);
        } else if (b2 == 3) {
            left(fArr, f, this.mDelta);
        } else if (b2 == 4) {
            right(fArr, f, this.mDelta);
        } else if (b2 != 5) {
            return;
        } else {
            small(fArr, f, this.mDelta * SCALE_EXTRA);
        }
        Utils.vboBindData(i, fArr);
    }

    public MeshChanger setDelta(float f) {
        this.mDelta = f;
        return this;
    }
}
