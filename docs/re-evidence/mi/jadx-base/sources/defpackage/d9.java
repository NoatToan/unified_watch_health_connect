package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.smarthome.core.modelconfig.PluginDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public class d9 extends jb {
    public Path f;
    public float[] g;
    public float[] h;
    public float[] i;
    public float j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15241k = 1;
    public int l = 1;

    @Override // defpackage.jb
    public void a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f22602a;
        if (f2 > 0.01f) {
            c(canvas);
            if (this.f == null) {
                throw new JSApplicationIllegalArgumentException("Shapes should have a valid path (d) prop");
            }
            if (g(paint, f2)) {
                canvas.drawPath(this.f, paint);
            }
            if (h(paint, f2)) {
                canvas.drawPath(this.f, paint);
            }
            b(canvas);
        }
        markUpdateSeen();
    }

    public final Path e(float[] fArr) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i = 0;
        while (i < fArr.length) {
            int i2 = i + 1;
            int i3 = (int) fArr[i];
            if (i3 != 0) {
                if (i3 == 1) {
                    path.close();
                    i = i2;
                } else if (i3 == 2) {
                    int i4 = i + 2;
                    float f = fArr[i2];
                    float f2 = this.c;
                    i += 3;
                    path.lineTo(f * f2, fArr[i4] * f2);
                } else if (i3 == 3) {
                    float f3 = fArr[i2];
                    float f4 = this.c;
                    path.cubicTo(f3 * f4, fArr[i + 2] * f4, fArr[i + 3] * f4, fArr[i + 4] * f4, fArr[i + 5] * f4, fArr[i + 6] * f4);
                    i += 7;
                } else {
                    if (i3 != 4) {
                        throw new JSApplicationIllegalArgumentException("Unrecognized drawing instruction " + i3);
                    }
                    float f5 = fArr[i2];
                    float f6 = this.c;
                    float f7 = f5 * f6;
                    float f8 = fArr[i + 2] * f6;
                    float f9 = fArr[i + 3] * f6;
                    float degrees = (float) Math.toDegrees(fArr[i + 4]);
                    int i5 = i + 6;
                    float degrees2 = (float) Math.toDegrees(fArr[i + 5]);
                    i += 7;
                    boolean z = fArr[i5] != 1.0f;
                    float f10 = degrees2 - degrees;
                    if (Math.abs(f10) >= 360.0f) {
                        path.addCircle(f7, f8, f9, z ? Path.Direction.CCW : Path.Direction.CW);
                    } else {
                        float f11 = f(f10, 360.0f);
                        if (z && f11 < 360.0f) {
                            f11 = (360.0f - f11) * (-1.0f);
                        }
                        path.arcTo(new RectF(f7 - f9, f8 - f9, f7 + f9, f8 + f9), degrees, f11);
                    }
                }
            } else {
                int i6 = i + 2;
                float f12 = fArr[i2];
                float f13 = this.c;
                i += 3;
                path.moveTo(f12 * f13, fArr[i6] * f13);
            }
        }
        return path;
    }

    public final float f(float f, float f2) {
        float f3 = f % f2;
        return f3 < 0.0f ? f3 + f2 : f3;
    }

    public boolean g(Paint paint, float f) {
        int[] iArr;
        float[] fArr;
        float[] fArr2 = this.h;
        int i = 0;
        if (fArr2 == null || fArr2.length <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        float[] fArr3 = this.h;
        int i2 = (int) fArr3[0];
        if (i2 == 0) {
            paint.setARGB((int) (fArr3.length > 4 ? fArr3[4] * f * 255.0f : f * 255.0f), (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f), (int) (fArr3[3] * 255.0f));
        } else if (i2 != 1) {
            cm8.C("ReactNative", "ART: Color type " + i2 + " not supported!");
        } else {
            int i3 = 5;
            if (fArr3.length < 5) {
                cm8.C("ReactNative", "[ARTShapeShadowNode setupFillPaint] expects 5 elements, received " + this.h.length);
                return false;
            }
            float f2 = fArr3[1];
            float f3 = this.c;
            float f4 = f2 * f3;
            float f5 = fArr3[2] * f3;
            float f6 = fArr3[3] * f3;
            float f7 = fArr3[4] * f3;
            int length = (fArr3.length - 5) / 5;
            if (length > 0) {
                int[] iArr2 = new int[length];
                float[] fArr4 = new float[length];
                while (i < length) {
                    float[] fArr5 = this.h;
                    fArr4[i] = fArr5[(length * 4) + i3 + i];
                    int i4 = i * 4;
                    iArr2[i] = Color.argb((int) (fArr5[i4 + 8] * 255.0f), (int) (fArr5[i4 + 5] * 255.0f), (int) (fArr5[i4 + 6] * 255.0f), (int) (fArr5[i4 + 7] * 255.0f));
                    i++;
                    i3 = 5;
                }
                iArr = iArr2;
                fArr = fArr4;
            } else {
                iArr = null;
                fArr = null;
            }
            paint.setShader(new LinearGradient(f4, f5, f6, f7, iArr, fArr, Shader.TileMode.CLAMP));
        }
        return true;
    }

    public boolean h(Paint paint, float f) {
        float[] fArr;
        if (this.j == 0.0f || (fArr = this.g) == null || fArr.length == 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        int i = this.f15241k;
        if (i == 0) {
            paint.setStrokeCap(Paint.Cap.BUTT);
        } else if (i == 1) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        } else {
            if (i != 2) {
                throw new JSApplicationIllegalArgumentException("strokeCap " + this.f15241k + " unrecognized");
            }
            paint.setStrokeCap(Paint.Cap.SQUARE);
        }
        int i2 = this.l;
        if (i2 == 0) {
            paint.setStrokeJoin(Paint.Join.MITER);
        } else if (i2 == 1) {
            paint.setStrokeJoin(Paint.Join.ROUND);
        } else {
            if (i2 != 2) {
                throw new JSApplicationIllegalArgumentException("strokeJoin " + this.l + " unrecognized");
            }
            paint.setStrokeJoin(Paint.Join.BEVEL);
        }
        paint.setStrokeWidth(this.j * this.c);
        float[] fArr2 = this.g;
        paint.setARGB((int) (fArr2.length > 3 ? fArr2[3] * f * 255.0f : f * 255.0f), (int) (fArr2[0] * 255.0f), (int) (fArr2[1] * 255.0f), (int) (fArr2[2] * 255.0f));
        float[] fArr3 = this.i;
        if (fArr3 != null && fArr3.length > 0) {
            paint.setPathEffect(new DashPathEffect(this.i, 0.0f));
        }
        return true;
    }

    @iej(name = "fill")
    public void setFill(ReadableArray readableArray) {
        this.h = gdi.b(readableArray);
        markUpdated();
    }

    @iej(name = PluginDeviceInfo.FICONOFF)
    public void setShapePath(ReadableArray readableArray) {
        this.f = e(gdi.b(readableArray));
        markUpdated();
    }

    @iej(name = "stroke")
    public void setStroke(ReadableArray readableArray) {
        this.g = gdi.b(readableArray);
        markUpdated();
    }

    @iej(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i) {
        this.f15241k = i;
        markUpdated();
    }

    @iej(name = "strokeDash")
    public void setStrokeDash(ReadableArray readableArray) {
        this.i = gdi.b(readableArray);
        markUpdated();
    }

    @iej(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i) {
        this.l = i;
        markUpdated();
    }

    @iej(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(float f) {
        this.j = f;
        markUpdated();
    }
}
