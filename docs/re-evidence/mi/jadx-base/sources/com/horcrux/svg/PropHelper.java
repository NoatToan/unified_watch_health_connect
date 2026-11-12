package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
class PropHelper {
    private static final int inputMatrixDataSize = 6;

    /* JADX INFO: renamed from: com.horcrux.svg.PropHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$SVGLengthUnitType;

        static {
            int[] iArr = new int[SVGLengthUnitType.values().length];
            $SwitchMap$com$horcrux$svg$SVGLengthUnitType = iArr;
            try {
                iArr[SVGLengthUnitType.SVG_LENGTHTYPE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$SVGLengthUnitType[SVGLengthUnitType.SVG_LENGTHTYPE_UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static class PathParser {
        private WritableArray mBezierCurves;
        private String mLastCommand;
        private WritableMap mLastStartPoint;
        private String mLastValue;
        private Matcher mMatcher;
        private Path mPath;
        private float mPenDownX;
        private float mPenDownY;
        private final float mScale;
        private final String mString;
        private static final Pattern PATH_REG_EXP = Pattern.compile("[a-df-z]|[\\-+]?(?:[\\d.]e[\\-+]?|[^\\s\\-+,a-z])+", 2);
        private static final Pattern DECIMAL_REG_EXP = Pattern.compile("(\\.\\d+)(?=-?\\.)");
        private float mPenX = 0.0f;
        private float mPenY = 0.0f;
        private float mPivotX = 0.0f;
        private float mPivotY = 0.0f;
        private boolean mValid = true;
        private boolean mPendDownSet = false;

        public PathParser(String str, float f) {
            this.mScale = f;
            this.mString = str;
        }

        private void arc(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            arcTo(f, f2, f3, z, z2, f4 + this.mPenX, f5 + this.mPenY);
        }

        private void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            float f6;
            float f7;
            float f8;
            float f9 = this.mPenX;
            float f10 = this.mPenY;
            if (f2 == 0.0f) {
                f6 = f == 0.0f ? f5 - f10 : f;
            } else {
                f6 = f2;
            }
            float fAbs = Math.abs(f6);
            float fAbs2 = Math.abs(f == 0.0f ? f4 - f9 : f);
            if (fAbs2 == 0.0f || fAbs == 0.0f || (f4 == f9 && f5 == f10)) {
                lineTo(f4, f5);
                return;
            }
            float radians = (float) Math.toRadians(f3);
            double d = radians;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            float f11 = f4 - f9;
            float f12 = f5 - f10;
            float f13 = ((fCos * f11) / 2.0f) + ((fSin * f12) / 2.0f);
            float f14 = -fSin;
            float f15 = ((f14 * f11) / 2.0f) + ((fCos * f12) / 2.0f);
            float f16 = fAbs2 * fAbs2;
            float f17 = f16 * fAbs * fAbs;
            float f18 = fAbs * fAbs * f13 * f13;
            float f19 = f16 * f15 * f15;
            float f20 = (f17 - f19) - f18;
            if (f20 < 0.0f) {
                float fSqrt = (float) Math.sqrt(1.0f - (f20 / f17));
                fAbs2 *= fSqrt;
                fAbs *= fSqrt;
                f7 = f11 / 2.0f;
                f8 = f12 / 2.0f;
            } else {
                float fSqrt2 = (float) Math.sqrt(f20 / (f19 + f18));
                if (z == z2) {
                    fSqrt2 = -fSqrt2;
                }
                float f21 = (((-fSqrt2) * f15) * fAbs2) / fAbs;
                float f22 = ((fSqrt2 * f13) * fAbs) / fAbs2;
                float f23 = ((fCos * f21) - (fSin * f22)) + (f11 / 2.0f);
                float f24 = (f12 / 2.0f) + (f21 * fSin) + (f22 * fCos);
                f7 = f23;
                f8 = f24;
            }
            float f25 = fCos / fAbs2;
            float f26 = fSin / fAbs2;
            float f27 = f14 / fAbs;
            float f28 = fCos / fAbs;
            float f29 = -f7;
            float f30 = -f8;
            float f31 = fAbs2;
            float f32 = fAbs;
            float fAtan2 = (float) Math.atan2((f27 * f29) + (f28 * f30), (f29 * f25) + (f30 * f26));
            float f33 = f11 - f7;
            float f34 = f12 - f8;
            float fAtan3 = (float) Math.atan2((f27 * f33) + (f28 * f34), (f25 * f33) + (f26 * f34));
            float f35 = f7 + f9;
            float f36 = f8 + f10;
            float f37 = f11 + f9;
            float f38 = f12 + f10;
            setPenDown();
            this.mPivotX = f37;
            this.mPenX = f37;
            this.mPivotY = f38;
            this.mPenY = f38;
            if (f31 != f32 || radians != 0.0f) {
                arcToBezier(f35, f36, f31, f32, fAtan2, fAtan3, z2, radians);
                return;
            }
            float degrees = (float) Math.toDegrees(fAtan2);
            float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan3))) % 360.0f);
            if (!z ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
                fAbs3 = 360.0f - fAbs3;
            }
            if (!z2) {
                fAbs3 = -fAbs3;
            }
            float f39 = this.mScale;
            this.mPath.arcTo(new RectF((f35 - f31) * f39, (f36 - f31) * f39, (f35 + f31) * f39, (f36 + f31) * f39), degrees, fAbs3);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0069 A[LOOP:0: B:12:0x0067->B:13:0x0069, LOOP_END] */
        private void arcToBezier(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7) {
            double d;
            int iCeil;
            float f8;
            float fTan;
            float fCos;
            float fSin;
            int i;
            float f9 = f5;
            double d2 = f7;
            float fCos2 = (float) Math.cos(d2);
            float fSin2 = (float) Math.sin(d2);
            float f10 = fCos2 * f3;
            float f11 = (-fSin2) * f4;
            float f12 = fSin2 * f3;
            float f13 = fCos2 * f4;
            float f14 = f6 - f9;
            if (f14 >= 0.0f || !z) {
                if (f14 > 0.0f && !z) {
                    d = ((double) f14) - 6.283185307179586d;
                }
                iCeil = (int) Math.ceil(Math.abs(round(((double) f14) / 1.5707963267948966d)));
                f8 = f14 / iCeil;
                fTan = (float) (Math.tan(f8 / 4.0f) * 1.3333333333333333d);
                double d3 = f9;
                fCos = (float) Math.cos(d3);
                fSin = (float) Math.sin(d3);
                i = 0;
                while (i < iCeil) {
                    float f15 = fCos - (fTan * fSin);
                    float f16 = fSin + (fCos * fTan);
                    float f17 = f9 + f8;
                    double d4 = f17;
                    float f18 = f8;
                    int i2 = iCeil;
                    float fCos3 = (float) Math.cos(d4);
                    float fSin3 = (float) Math.sin(d4);
                    float f19 = (fTan * fSin3) + fCos3;
                    float f20 = fSin3 - (fTan * fCos3);
                    float f21 = f2 + (f12 * fCos3) + (f13 * fSin3);
                    Path path = this.mPath;
                    float f22 = f12;
                    float f23 = this.mScale;
                    path.cubicTo((f + (f10 * f15) + (f11 * f16)) * f23, (f2 + (f15 * f12) + (f16 * f13)) * f23, (f + (f10 * f19) + (f11 * f20)) * f23, (f2 + (f19 * f12) + (f20 * f13)) * f23, (f + (f10 * fCos3) + (f11 * fSin3)) * f23, f21 * f23);
                    i++;
                    f9 = f17;
                    f12 = f22;
                    fSin = fSin3;
                    iCeil = i2;
                    fCos = fCos3;
                    f8 = f18;
                }
            }
            d = ((double) f14) + 6.283185307179586d;
            f14 = (float) d;
            iCeil = (int) Math.ceil(Math.abs(round(((double) f14) / 1.5707963267948966d)));
            f8 = f14 / iCeil;
            fTan = (float) (Math.tan(f8 / 4.0f) * 1.3333333333333333d);
            double d5 = f9;
            fCos = (float) Math.cos(d5);
            fSin = (float) Math.sin(d5);
            i = 0;
            while (i < iCeil) {
                float f110 = fCos - (fTan * fSin);
                float f111 = fSin + (fCos * fTan);
                float f112 = f9 + f8;
                double d6 = f112;
                float f113 = f8;
                int i3 = iCeil;
                float fCos4 = (float) Math.cos(d6);
                float fSin4 = (float) Math.sin(d6);
                float f114 = (fTan * fSin4) + fCos4;
                float f24 = fSin4 - (fTan * fCos4);
                float f25 = f2 + (f12 * fCos4) + (f13 * fSin4);
                Path path2 = this.mPath;
                float f26 = f12;
                float f27 = this.mScale;
                path2.cubicTo((f + (f10 * f110) + (f11 * f111)) * f27, (f2 + (f110 * f12) + (f111 * f13)) * f27, (f + (f10 * f114) + (f11 * f24)) * f27, (f2 + (f114 * f12) + (f24 * f13)) * f27, (f + (f10 * fCos4) + (f11 * fSin4)) * f27, f25 * f27);
                i++;
                f9 = f112;
                f12 = f26;
                fSin = fSin4;
                iCeil = i3;
                fCos = fCos4;
                f8 = f113;
            }
        }

        private WritableMap clonePointMap(WritableMap writableMap) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", writableMap.getDouble("x"));
            writableMapCreateMap.putDouble("y", writableMap.getDouble("y"));
            return writableMapCreateMap;
        }

        private void close() {
            if (this.mPendDownSet) {
                this.mPenX = this.mPenDownX;
                this.mPenY = this.mPenDownY;
                this.mPendDownSet = false;
                this.mPath.close();
                WritableArray writableArrayCreateArray = Arguments.createArray();
                writableArrayCreateArray.pushMap(clonePointMap(this.mLastStartPoint));
                writableArrayCreateArray.pushMap(clonePointMap(this.mLastStartPoint));
                writableArrayCreateArray.pushMap(clonePointMap(this.mLastStartPoint));
                this.mBezierCurves.pushArray(writableArrayCreateArray);
            }
        }

        private void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            setPenDown();
            this.mPenX = f5;
            this.mPenY = f6;
            Path path = this.mPath;
            float f7 = this.mScale;
            path.cubicTo(f * f7, f2 * f7, f3 * f7, f4 * f7, f5 * f7, f6 * f7);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushMap(getPointMap(f, f2));
            writableArrayCreateArray.pushMap(getPointMap(f3, f4));
            writableArrayCreateArray.pushMap(getPointMap(f5, f6));
            this.mBezierCurves.pushArray(writableArrayCreateArray);
        }

        private void curve(float f, float f2, float f3, float f4, float f5, float f6) {
            float f7 = this.mPenX;
            float f8 = f + f7;
            float f9 = this.mPenY;
            curveTo(f8, f2 + f9, f3 + f7, f4 + f9, f5 + f7, f6 + f9);
        }

        private void curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.mPivotX = f3;
            this.mPivotY = f4;
            cubicTo(f, f2, f3, f4, f5, f6);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void executeCommand(String str) {
            str.hashCode();
            byte b2 = -1;
            switch (str.hashCode()) {
                case 65:
                    if (str.equals("A")) {
                        b2 = 0;
                    }
                    break;
                case 67:
                    if (str.equals("C")) {
                        b2 = 1;
                    }
                    break;
                case 72:
                    if (str.equals(c.f13756b)) {
                        b2 = 2;
                    }
                    break;
                case 76:
                    if (str.equals("L")) {
                        b2 = 3;
                    }
                    break;
                case 77:
                    if (str.equals("M")) {
                        b2 = 4;
                    }
                    break;
                case 81:
                    if (str.equals("Q")) {
                        b2 = 5;
                    }
                    break;
                case 83:
                    if (str.equals("S")) {
                        b2 = 6;
                    }
                    break;
                case 84:
                    if (str.equals("T")) {
                        b2 = 7;
                    }
                    break;
                case 86:
                    if (str.equals("V")) {
                        b2 = 8;
                    }
                    break;
                case 90:
                    if (str.equals("Z")) {
                        b2 = 9;
                    }
                    break;
                case 97:
                    if (str.equals(PluginDeviceInfo.FMODEL)) {
                        b2 = 10;
                    }
                    break;
                case 99:
                    if (str.equals(PluginDeviceInfo.FICONON)) {
                        b2 = 11;
                    }
                    break;
                case 104:
                    if (str.equals("h")) {
                        b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                    }
                    break;
                case 108:
                    if (str.equals(e.f13808a)) {
                        b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                    }
                    break;
                case 109:
                    if (str.equals("m")) {
                        b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                    }
                    break;
                case 113:
                    if (str.equals("q")) {
                        b2 = 15;
                    }
                    break;
                case 115:
                    if (str.equals("s")) {
                        b2 = 16;
                    }
                    break;
                case 116:
                    if (str.equals(DeviceTagInterface.CUSTOM_TAG_TYPE)) {
                        b2 = 17;
                    }
                    break;
                case 118:
                    if (str.equals("v")) {
                        b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE;
                    }
                    break;
                case 122:
                    if (str.equals("z")) {
                        b2 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    arcTo(getNextFloat(), getNextFloat(), getNextFloat(), getNextBoolean(), getNextBoolean(), getNextFloat(), getNextFloat());
                    break;
                case 1:
                    curveTo(getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat());
                    break;
                case 2:
                    lineTo(getNextFloat(), this.mPenY);
                    break;
                case 3:
                    lineTo(getNextFloat(), getNextFloat());
                    break;
                case 4:
                    moveTo(getNextFloat(), getNextFloat());
                    break;
                case 5:
                    quadraticBezierCurveTo(getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat());
                    break;
                case 6:
                    smoothCurveTo(getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat());
                    break;
                case 7:
                    smoothQuadraticBezierCurveTo(getNextFloat(), getNextFloat());
                    break;
                case 8:
                    lineTo(this.mPenX, getNextFloat());
                    break;
                case 9:
                case 19:
                    close();
                    break;
                case 10:
                    arc(getNextFloat(), getNextFloat(), getNextFloat(), getNextBoolean(), getNextBoolean(), getNextFloat(), getNextFloat());
                    break;
                case 11:
                    curve(getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat());
                    break;
                case 12:
                    line(getNextFloat(), 0.0f);
                    break;
                case 13:
                    line(getNextFloat(), getNextFloat());
                    break;
                case 14:
                    move(getNextFloat(), getNextFloat());
                    break;
                case 15:
                    quadraticBezierCurve(getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat());
                    break;
                case 16:
                    smoothCurve(getNextFloat(), getNextFloat(), getNextFloat(), getNextFloat());
                    break;
                case 17:
                    smoothQuadraticBezierCurve(getNextFloat(), getNextFloat());
                    break;
                case 18:
                    line(0.0f, getNextFloat());
                    break;
                default:
                    this.mLastValue = str;
                    executeCommand(this.mLastCommand);
                    return;
            }
            this.mLastCommand = str;
            if (str.equals("m")) {
                this.mLastCommand = e.f13808a;
            } else if (str.equals("M")) {
                this.mLastCommand = "L";
            }
        }

        private boolean getNextBoolean() {
            if (this.mMatcher.find()) {
                return this.mMatcher.group().equals("1");
            }
            this.mValid = false;
            this.mPath = new Path();
            return false;
        }

        private float getNextFloat() {
            String str = this.mLastValue;
            if (str != null) {
                this.mLastValue = null;
                return Float.parseFloat(str);
            }
            if (this.mMatcher.find()) {
                return Float.parseFloat(this.mMatcher.group());
            }
            this.mValid = false;
            this.mPath = new Path();
            return 0.0f;
        }

        private WritableMap getPointMap(float f, float f2) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", f * this.mScale);
            writableMapCreateMap.putDouble("y", f2 * this.mScale);
            return writableMapCreateMap;
        }

        private void line(float f, float f2) {
            lineTo(f + this.mPenX, f2 + this.mPenY);
        }

        private void lineTo(float f, float f2) {
            setPenDown();
            this.mPenX = f;
            this.mPivotX = f;
            this.mPenY = f2;
            this.mPivotY = f2;
            Path path = this.mPath;
            float f3 = this.mScale;
            path.lineTo(f * f3, f3 * f2);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushMap(getPointMap(f, f2));
            writableArrayCreateArray.pushMap(getPointMap(f, f2));
            writableArrayCreateArray.pushMap(getPointMap(f, f2));
            this.mBezierCurves.pushArray(writableArrayCreateArray);
        }

        private void move(float f, float f2) {
            moveTo(f + this.mPenX, f2 + this.mPenY);
        }

        private void moveTo(float f, float f2) {
            this.mPenX = f;
            this.mPivotX = f;
            this.mPenDownX = f;
            this.mPenY = f2;
            this.mPivotY = f2;
            this.mPenDownY = f2;
            Path path = this.mPath;
            float f3 = this.mScale;
            path.moveTo(f * f3, f3 * f2);
            this.mLastStartPoint = getPointMap(f, f2);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushMap(getPointMap(f, f2));
            this.mBezierCurves.pushArray(writableArrayCreateArray);
        }

        private void quadraticBezierCurve(float f, float f2, float f3, float f4) {
            float f5 = this.mPenX;
            float f6 = this.mPenY;
            quadraticBezierCurveTo(f + f5, f2 + f6, f3 + f5, f4 + f6);
        }

        private void quadraticBezierCurveTo(float f, float f2, float f3, float f4) {
            this.mPivotX = f;
            this.mPivotY = f2;
            float f5 = f * 2.0f;
            float f6 = f2 * 2.0f;
            cubicTo((this.mPenX + f5) / 3.0f, (this.mPenY + f6) / 3.0f, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
        }

        private double round(double d) {
            double dPow = Math.pow(10.0d, 4.0d);
            return Math.round(d * dPow) / dPow;
        }

        private void setPenDown() {
            if (this.mPendDownSet) {
                return;
            }
            this.mPenDownX = this.mPenX;
            this.mPenDownY = this.mPenY;
            this.mPendDownSet = true;
        }

        private void smoothCurve(float f, float f2, float f3, float f4) {
            float f5 = this.mPenX;
            float f6 = this.mPenY;
            smoothCurveTo(f + f5, f2 + f6, f3 + f5, f4 + f6);
        }

        private void smoothCurveTo(float f, float f2, float f3, float f4) {
            float f5 = (this.mPenX * 2.0f) - this.mPivotX;
            float f6 = (this.mPenY * 2.0f) - this.mPivotY;
            this.mPivotX = f;
            this.mPivotY = f2;
            cubicTo(f5, f6, f, f2, f3, f4);
        }

        private void smoothQuadraticBezierCurve(float f, float f2) {
            smoothQuadraticBezierCurveTo(f + this.mPenX, f2 + this.mPenY);
        }

        private void smoothQuadraticBezierCurveTo(float f, float f2) {
            quadraticBezierCurveTo((this.mPenX * 2.0f) - this.mPivotX, (this.mPenY * 2.0f) - this.mPivotY, f, f2);
        }

        public Path getPath() {
            this.mPath = new Path();
            this.mBezierCurves = Arguments.createArray();
            this.mMatcher = PATH_REG_EXP.matcher(DECIMAL_REG_EXP.matcher(this.mString).replaceAll("$1,"));
            while (this.mMatcher.find() && this.mValid) {
                executeCommand(this.mMatcher.group());
            }
            return this.mPath;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double fromRelative(String str, double d, double d2, double d3) {
        double dDoubleValue;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i = length - 1;
        if (length == 0 || strTrim.equals("normal")) {
            return 0.0d;
        }
        if (strTrim.codePointAt(i) == 37) {
            return (Double.valueOf(strTrim.substring(0, i)).doubleValue() / 100.0d) * d;
        }
        int i2 = length - 2;
        if (i2 > 0) {
            String strSubstring = strTrim.substring(i2);
            strSubstring.hashCode();
            switch (strSubstring) {
                case "cm":
                    d3 = 35.43307d;
                    length = i2;
                    break;
                case "em":
                    length = i2;
                    break;
                case "in":
                    d3 = 90.0d;
                    length = i2;
                    break;
                case "mm":
                    d3 = 3.543307d;
                    length = i2;
                    break;
                case "pc":
                    d3 = 15.0d;
                    length = i2;
                    break;
                case "pt":
                    d3 = 1.25d;
                    length = i2;
                    break;
                case "px":
                    length = i2;
                    d3 = 1.0d;
                    break;
                default:
                    d3 = 1.0d;
                    break;
            }
            dDoubleValue = Double.valueOf(strTrim.substring(0, length)).doubleValue() * d3;
        } else {
            dDoubleValue = Double.valueOf(strTrim).doubleValue();
        }
        return dDoubleValue * d2;
    }

    public static int toMatrixData(ReadableArray readableArray, float[] fArr, float f) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f;
        return 6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double fromRelative(SVGLength sVGLength, double d, double d2, double d3, double d4) {
        double d5;
        if (sVGLength == null) {
            return d2;
        }
        SVGLengthUnitType sVGLengthUnitType = sVGLength.unit;
        double d6 = sVGLength.value;
        switch (AnonymousClass1.$SwitchMap$com$horcrux$svg$SVGLengthUnitType[sVGLengthUnitType.ordinal()]) {
            case 1:
            case 2:
                d4 = 1.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 3:
                d5 = (d6 / 100.0d) * d;
                break;
            case 4:
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 5:
                d4 /= 2.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 6:
                d4 = 35.43307d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 7:
                d4 = 3.543307d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 8:
                d4 = 90.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 9:
                d4 = 1.25d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            case 10:
                d4 = 15.0d;
                d6 *= d4;
                d5 = d6 * d3;
                break;
            default:
                d5 = d6 * d3;
                break;
        }
        return d5 + d2;
    }
}
