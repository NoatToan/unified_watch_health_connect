package com.huami.moving.ui.view.gradient;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.core.text.TextUtilsCompat;
import com.huami.moving.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class a {
    private final int a = 11;
    private final String b = "CLAMP";
    private final String c = "MIRROR";
    private final String d = "REPEAT";

    public Paint a(Context context, AttributeSet attributeSet, int i) {
        float[] fArr;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.gradientLayout, i, 0);
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        int i3 = context.getResources().getDisplayMetrics().widthPixels;
        int i4 = typedArrayObtainStyledAttributes.getInt(R.styleable.gradientLayout_startX, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(R.styleable.gradientLayout_startY, 0);
        int i6 = typedArrayObtainStyledAttributes.getInt(R.styleable.gradientLayout_endX, i3);
        int i7 = typedArrayObtainStyledAttributes.getInt(R.styleable.gradientLayout_endY, i2);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.gradientLayout_tileMode);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.gradientLayout_linearColors, 0);
        if (resourceId == 0) {
            throw new IllegalArgumentException("GradientUtil: error - colors is not specified");
        }
        int[] intArray = typedArrayObtainStyledAttributes.getResources().getIntArray(resourceId);
        if (intArray.length < 2) {
            throw new IllegalArgumentException("GradientUtil: error - colors length should >=2");
        }
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            int length = intArray.length;
            int[] iArr = new int[length];
            for (int i8 = 0; i8 < length; i8++) {
                iArr[i8] = intArray[(length - i8) - 1];
            }
            intArray = iArr;
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.gradientLayout_linearPositions, 0);
        String[] stringArray = resourceId2 != 0 ? typedArrayObtainStyledAttributes.getResources().getStringArray(resourceId2) : null;
        if (stringArray != null && stringArray.length != intArray.length) {
            throw new IllegalArgumentException("GradientUtil: error - positions length should same as colors");
        }
        if (stringArray == null) {
            fArr = null;
        } else {
            if (stringArray.length > 11) {
                throw new IllegalArgumentException("GradientUtil: error - positions length is only less than 11");
            }
            int length2 = stringArray.length;
            float[] fArr2 = new float[length2];
            for (int i9 = 0; i9 < stringArray.length; i9++) {
                try {
                    fArr2[i9] = Float.valueOf(stringArray[i9]).floatValue();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    throw new IllegalArgumentException("GradientUtil: error - every position must be a float number");
                }
            }
            Arrays.sort(fArr2);
            if (fArr2[0] < 0.0f) {
                throw new IllegalArgumentException("GradientUtil: error - first position must >=0");
            }
            if (fArr2[length2 - 1] > 1.0f) {
                throw new IllegalArgumentException("GradientUtil: error - last position must <=1");
            }
            fArr = fArr2;
        }
        LinearGradient linearGradient = new LinearGradient(i4, i5, i6, i7, intArray, fArr, Shader.TileMode.valueOf(("CLAMP".equalsIgnoreCase(string) || "MIRROR".equalsIgnoreCase(string) || "REPEAT".equalsIgnoreCase(string)) ? string.toUpperCase() : "CLAMP"));
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        typedArrayObtainStyledAttributes.recycle();
        return paint;
    }
}
