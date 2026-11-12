package com.huami.account.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.R;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.lang.reflect.Array;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes4.dex */
public class VerificationCodeView extends View {
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    public String a;
    public Paint b;
    private final int c;
    private final int d;
    private final int e;
    private final float f;
    private final int[][] g;
    private final int[][] h;
    private final int[][] i;
    private final String[] j;
    private final boolean k;

    public VerificationCodeView(Context context) {
        this(context, null);
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.c; i++) {
            double dRandom = Math.random();
            String[] strArr = this.j;
            sb.append(strArr[(int) (dRandom * ((double) strArr.length))]);
        }
        return sb.toString();
    }

    private String[] b(int i) {
        if (i == 0) {
            return new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        }
        if (i == 1) {
            return new String[]{"a", "b", GoogleApiAvailabilityLight.a, "e", "f", "g", "h", "m", GoogleApiAvailabilityLight.b, DTransferConstants.SEARCH_KEY, "r", "t", "y", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", LogUtil.D, "E", "F", "G", "H", "M", "N", "Q", "R", ExifInterface.GPS_DIRECTION_TRUE, "Y"};
        }
        if (i != 2) {
            return i != 3 ? new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "a", "b", GoogleApiAvailabilityLight.a, "e", "f", "g", "h", "m", GoogleApiAvailabilityLight.b, DTransferConstants.SEARCH_KEY, "r", "t", "y", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", LogUtil.D, "E", "F", "G", "H", "M", "N", "Q", "R", ExifInterface.GPS_DIRECTION_TRUE, "Y"} : new String[]{ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", LogUtil.D, "E", "F", "G", "H", LogUtil.I, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", "V", "W", "X", "Y", "Z"};
        }
        return new String[]{"a", "b", "c", GoogleApiAvailabilityLight.a, "e", "f", "g", "h", "i", z.j, hl.k, "l", "m", GoogleApiAvailabilityLight.b, "o", b.r, DTransferConstants.SEARCH_KEY, "r", SOAP.XMLNS, "t", "u", "v", "w", "x", "y", "z"};
    }

    private void c(int i, int i2, int[][] iArr) {
        for (int[] iArr2 : iArr) {
            double d = i2;
            iArr2[0] = (int) (Math.random() * d);
            double d2 = i;
            iArr2[1] = (int) (Math.random() * d2);
            iArr2[2] = (int) (Math.random() * d);
            iArr2[3] = (int) (Math.random() * d2);
        }
    }

    private void d(int i, int i2, int[][] iArr) {
        for (int[] iArr2 : iArr) {
            iArr2[0] = (int) (Math.random() * ((double) i2));
            iArr2[1] = (int) (Math.random() * ((double) i));
        }
    }

    private void e(int i, int[][] iArr) {
        for (int[] iArr2 : iArr) {
            iArr2[0] = (int) (((double) this.f) + (Math.random() * ((double) (i - this.f))));
        }
    }

    public void create() {
        this.a = a();
        invalidate();
    }

    public String getVerificationCode() {
        return this.a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int height = getHeight();
        int width = getWidth();
        if (!this.a.equals(getTag())) {
            c(height, width, this.g);
            d(height, width, this.h);
            e(height, this.i);
        }
        setTag(this.a);
        canvas.drawColor(this.e);
        int i = (width / this.c) / 2;
        char[] charArray = this.a.toCharArray();
        this.b.setColor(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            canvas.drawText(String.valueOf(charArray[i2]), i, this.i[i2][0], this.b);
            i += width / (this.c + 1);
        }
        this.b.setColor(-16777216);
        for (int[] iArr : this.g) {
            canvas.drawLine(iArr[0], iArr[1], iArr[2], iArr[3], this.b);
        }
        for (int[] iArr2 : this.h) {
            canvas.drawCircle(iArr2[0], iArr2[1], 1.0f, this.b);
        }
    }

    public boolean verify(String str) {
        return !TextUtils.isEmpty(this.a) && (!this.k ? !this.a.equalsIgnoreCase(str) : !this.a.equals(str));
    }

    public VerificationCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerificationCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
        this.b = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.VerificationCodeView);
        int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.VerificationCodeView_text_length, 4);
        this.c = integer;
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.VerificationCodeView_bg_color, -1);
        this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.VerificationCodeView_text_color, -16777216);
        this.k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.VerificationCodeView_case_sensitive, false);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.VerificationCodeView_code_type, 4);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R.styleable.VerificationCodeView_line_num, 0);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(R.styleable.VerificationCodeView_point_num, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.VerificationCodeView_text_size, 30.0f);
        this.f = dimension;
        typedArrayObtainStyledAttributes.recycle();
        this.j = b(color);
        this.b.setStrokeWidth(3.0f);
        this.b.setAntiAlias(true);
        this.b.setTextSize(dimension);
        this.g = (int[][]) Array.newInstance((Class<?>) int.class, integer2, 4);
        this.h = (int[][]) Array.newInstance((Class<?>) int.class, integer3, 2);
        this.i = (int[][]) Array.newInstance((Class<?>) int.class, integer, 1);
        create();
    }
}
