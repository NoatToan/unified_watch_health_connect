package androidx.compose.ui.graphics;

import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.passport.Configs;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.model.account.HMCalendarConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010H\u001a\u00020Gø\u0001\u0000¢\u0006\u0004\bL\u0010MJ \u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\r\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013JP\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000526\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\n0\u0015H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0013J5\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0015\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J-\u00100\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b1\u0010(J\u0015\u00104\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b3\u0010(J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b5\u0010(J\r\u00108\u001a\u00020\n¢\u0006\u0004\b7\u0010\u000fJ\r\u0010:\u001a\u00020\n¢\u0006\u0004\b9\u0010\u000fJ\u0010\u0010>\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010F\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bD\u0010ER\u0019\u0010H\u001a\u00020G8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010Kø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006N"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", WorkoutExercises.ROW, "column", "", "get-impl", "([FII)F", "get", "v", "", "set-impl", "([FIIF)V", WatchFaceArrivingEvent.CMD_SET, "reset-impl", "([F)V", Configs.Params.RESET, "src", "set-jHG-Opc", "([F[F)V", "degrees", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "cosine", "sine", TransportUri.ACTION_BLOCK, "rotateInternal-impl", "([FFLkotlin/jvm/functions/Function2;)V", "rotateInternal", "colorMatrix", "timesAssign-jHG-Opc", "timesAssign", "m1", "m2", "dot-Me4OoYI", "([F[FI[FI)F", b.x0, HMCalendarConfig.VALUE_SAT, "setToSaturation-impl", "([FF)V", "setToSaturation", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "setToScale", "setToRotateRed-impl", "setToRotateRed", "setToRotateGreen-impl", "setToRotateGreen", "setToRotateBlue-impl", "setToRotateBlue", "convertRgbToYuv-impl", "convertRgbToYuv", "convertYuvToRgb-impl", "convertYuvToRgb", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "", "values", "[F", "getValues", "()[F", "constructor-impl", "([F)[F", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
@JvmInline
public final class ColorMatrix {

    @NotNull
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m1268boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m1269constructorimpl(@NotNull float[] fArr) {
        return fArr;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m1270constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m1269constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m1271convertRgbToYuvimpl(float[] fArr) {
        m1278resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* JADX INFO: renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m1272convertYuvToRgbimpl(float[] fArr) {
        m1278resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* JADX INFO: renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m1273dotMe4OoYI(float[] fArr, float[] fArr2, int i, float[] fArr3, int i2) {
        int i3 = i * 5;
        return (fArr2[i3 + 0] * fArr3[0 + i2]) + (fArr2[i3 + 1] * fArr3[5 + i2]) + (fArr2[i3 + 2] * fArr3[10 + i2]) + (fArr2[i3 + 3] * fArr3[15 + i2]);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1274equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).m1289unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1275equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m1276getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1277hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m1278resetimpl(float[] fArr) {
        ArraysKt___ArraysJvmKt.fill$default(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* JADX INFO: renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m1279rotateInternalimpl(float[] fArr, float f, Function2<? super Float, ? super Float, Unit> function2) {
        m1278resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        function2.invoke(Float.valueOf((float) Math.cos(d)), Float.valueOf((float) Math.sin(d)));
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m1280setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* JADX INFO: renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m1281setjHGOpc(float[] fArr, @NotNull float[] fArr2) {
        ArraysKt___ArraysJvmKt.copyInto$default(fArr2, fArr, 0, 0, 0, 14, (Object) null);
    }

    /* JADX INFO: renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m1282setToRotateBlueimpl(float[] fArr, float f) {
        m1278resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }

    /* JADX INFO: renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m1283setToRotateGreenimpl(float[] fArr, float f) {
        m1278resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    /* JADX INFO: renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m1284setToRotateRedimpl(float[] fArr, float f) {
        m1278resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    /* JADX INFO: renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m1285setToSaturationimpl(float[] fArr, float f) {
        m1278resetimpl(fArr);
        float f2 = 1 - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* JADX INFO: renamed from: setToScale-impl, reason: not valid java name */
    public static final void m1286setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        m1278resetimpl(fArr);
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* JADX INFO: renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m1287timesAssignjHGOpc(float[] fArr, @NotNull float[] fArr2) {
        float fM1273dotMe4OoYI = m1273dotMe4OoYI(fArr, fArr, 0, fArr2, 0);
        float fM1273dotMe4OoYI2 = m1273dotMe4OoYI(fArr, fArr, 0, fArr2, 1);
        float fM1273dotMe4OoYI3 = m1273dotMe4OoYI(fArr, fArr, 0, fArr2, 2);
        float fM1273dotMe4OoYI4 = m1273dotMe4OoYI(fArr, fArr, 0, fArr2, 3);
        float f = (fArr[0] * fArr2[4]) + (fArr[1] * fArr2[9]) + (fArr[2] * fArr2[14]) + (fArr[3] * fArr2[19]) + fArr[4];
        float fM1273dotMe4OoYI5 = m1273dotMe4OoYI(fArr, fArr, 1, fArr2, 0);
        float fM1273dotMe4OoYI6 = m1273dotMe4OoYI(fArr, fArr, 1, fArr2, 1);
        float fM1273dotMe4OoYI7 = m1273dotMe4OoYI(fArr, fArr, 1, fArr2, 2);
        float fM1273dotMe4OoYI8 = m1273dotMe4OoYI(fArr, fArr, 1, fArr2, 3);
        float f2 = (fArr[5] * fArr2[4]) + (fArr[6] * fArr2[9]) + (fArr[7] * fArr2[14]) + (fArr[8] * fArr2[19]) + fArr[9];
        float fM1273dotMe4OoYI9 = m1273dotMe4OoYI(fArr, fArr, 2, fArr2, 0);
        float fM1273dotMe4OoYI10 = m1273dotMe4OoYI(fArr, fArr, 2, fArr2, 1);
        float fM1273dotMe4OoYI11 = m1273dotMe4OoYI(fArr, fArr, 2, fArr2, 2);
        float fM1273dotMe4OoYI12 = m1273dotMe4OoYI(fArr, fArr, 2, fArr2, 3);
        float f3 = (fArr[10] * fArr2[4]) + (fArr[11] * fArr2[9]) + (fArr[12] * fArr2[14]) + (fArr[13] * fArr2[19]) + fArr[14];
        float fM1273dotMe4OoYI13 = m1273dotMe4OoYI(fArr, fArr, 3, fArr2, 0);
        float fM1273dotMe4OoYI14 = m1273dotMe4OoYI(fArr, fArr, 3, fArr2, 1);
        float fM1273dotMe4OoYI15 = m1273dotMe4OoYI(fArr, fArr, 3, fArr2, 2);
        float fM1273dotMe4OoYI16 = m1273dotMe4OoYI(fArr, fArr, 3, fArr2, 3);
        float f4 = (fArr[15] * fArr2[4]) + (fArr[16] * fArr2[9]) + (fArr[17] * fArr2[14]) + (fArr[18] * fArr2[19]) + fArr[19];
        fArr[0] = fM1273dotMe4OoYI;
        fArr[1] = fM1273dotMe4OoYI2;
        fArr[2] = fM1273dotMe4OoYI3;
        fArr[3] = fM1273dotMe4OoYI4;
        fArr[4] = f;
        fArr[5] = fM1273dotMe4OoYI5;
        fArr[6] = fM1273dotMe4OoYI6;
        fArr[7] = fM1273dotMe4OoYI7;
        fArr[8] = fM1273dotMe4OoYI8;
        fArr[9] = f2;
        fArr[10] = fM1273dotMe4OoYI9;
        fArr[11] = fM1273dotMe4OoYI10;
        fArr[12] = fM1273dotMe4OoYI11;
        fArr[13] = fM1273dotMe4OoYI12;
        fArr[14] = f3;
        fArr[15] = fM1273dotMe4OoYI13;
        fArr[16] = fM1273dotMe4OoYI14;
        fArr[17] = fM1273dotMe4OoYI15;
        fArr[18] = fM1273dotMe4OoYI16;
        fArr[19] = f4;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1288toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1274equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m1277hashCodeimpl(this.values);
    }

    public String toString() {
        return m1288toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m1289unboximpl() {
        return this.values;
    }
}
