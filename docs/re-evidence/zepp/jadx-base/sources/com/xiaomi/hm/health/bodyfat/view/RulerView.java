package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000e\n\u0002\b'\u0018\u0000 Á\u00012\u00020\u00012\u00020\u0002:\u0004Á\u0001Â\u0001B\u0013\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0006\b¼\u0001\u0010½\u0001B\u001d\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0006\b¼\u0001\u0010¾\u0001B$\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0007\u0010¿\u0001\u001a\u00020\u0005¢\u0006\u0006\b¼\u0001\u0010À\u0001J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J(\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016J\u000e\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(R\"\u00100\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00106\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010+\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\"\u0010<\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010B\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010+\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R\"\u0010E\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010+\u001a\u0004\bC\u0010-\"\u0004\bD\u0010/R\"\u0010H\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010+\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R\"\u0010K\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010+\u001a\u0004\bI\u0010-\"\u0004\bJ\u0010/R\"\u0010N\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010+\u001a\u0004\bL\u0010-\"\u0004\bM\u0010/R\"\u0010Q\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\bO\u0010-\"\u0004\bP\u0010/R\"\u0010U\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010+\u001a\u0004\bS\u0010-\"\u0004\bT\u0010/R\"\u0010Y\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010+\u001a\u0004\bW\u0010-\"\u0004\bX\u0010/R\"\u0010`\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010+\u001a\u0004\bb\u0010-\"\u0004\bc\u0010/R\"\u0010h\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010+\u001a\u0004\bf\u0010-\"\u0004\bg\u0010/R\"\u0010l\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010+\u001a\u0004\bj\u0010-\"\u0004\bk\u0010/R\"\u0010p\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010+\u001a\u0004\bn\u0010-\"\u0004\bo\u0010/R\"\u0010t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u00107\u001a\u0004\br\u00109\"\u0004\bs\u0010;R$\u0010|\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010\u0080\u0001\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010w\u001a\u0004\b~\u0010y\"\u0004\b\u007f\u0010{R\u0018\u0010\u0082\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0081\u0001\u00107R\u0018\u0010\u0084\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0083\u0001\u00107R\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00107R%\u0010\u0087\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0016\u0010+\u001a\u0005\b\u0085\u0001\u0010-\"\u0005\b\u0086\u0001\u0010/R\u0018\u0010\u0089\u0001\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010wR\u0018\u0010\u008b\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u00107R\u0018\u0010\u008d\u0001\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010wR\u0018\u0010\u008f\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u00107R\u0018\u0010\u0091\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u00107R\u0018\u0010\u0093\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010[R\u0017\u0010\u0094\u0001\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010wR\u0018\u0010\u0096\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u00107R\u0018\u0010\u0098\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u00107R\u0017\u0010\u0099\u0001\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u0010wR\u0018\u0010\u009b\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u00107R\u001a\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010¡\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u00107R\u0018\u0010£\u0001\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b¢\u0001\u0010wR\u0018\u0010¥\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u00107R\u0018\u0010§\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u00107R\u0018\u0010©\u0001\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b¨\u0001\u0010wR\u0018\u0010«\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u00107R\u0018\u0010\u00ad\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u00107R\u0018\u0010¯\u0001\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b®\u0001\u0010wR\u0018\u0010±\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u00107R\u0018\u0010³\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u00107R)\u0010´\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R\u001a\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001¨\u0006Ã\u0001"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/view/RulerView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", hl.k, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "f", "g", "a", "Landroid/graphics/Canvas;", "canvas", "b", "e", "c", GoogleApiAvailabilityLight.a, "", "x", "y", "h", z.j, "i", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", TrainingWebConst.QueryParam.VIDEO_FORMAT, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "surfaceChanged", "surfaceDestroyed", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "selectPosition", "setSelectPosition", "Lcom/xiaomi/hm/health/bodyfat/view/RulerView$OnChooseResultListener;", "onChooseResultListener", "setOnChooseResultListener", "F", "getUNIT_MM", "()F", "setUNIT_MM", "(F)V", "UNIT_MM", "getRULE_HEIGHT", "setRULE_HEIGHT", "RULE_HEIGHT", "getRULE_SCALE", "setRULE_SCALE", "RULE_SCALE", LogUtil.I, "getSCREEN_W", "()I", "setSCREEN_W", "(I)V", "SCREEN_W", "getSCREEN_H", "setSCREEN_H", "SCREEN_H", "getFONT_SIZE", "setFONT_SIZE", "FONT_SIZE", "getPADDING", "setPADDING", "PADDING", "getRADIUS_BIG", "setRADIUS_BIG", "RADIUS_BIG", "getRADIUS_MEDIUM", "setRADIUS_MEDIUM", "RADIUS_MEDIUM", "getRADIUS_SMALL", "setRADIUS_SMALL", "RADIUS_SMALL", "getCYCLE_WIDTH", "setCYCLE_WIDTH", "CYCLE_WIDTH", "l", "getDISPLAY_SIZE_BIG", "setDISPLAY_SIZE_BIG", "DISPLAY_SIZE_BIG", "m", "getDISPLAY_SIZE_SMALL", "setDISPLAY_SIZE_SMALL", "DISPLAY_SIZE_SMALL", GoogleApiAvailabilityLight.b, "Z", "getUnlockLineCanvas", "()Z", "setUnlockLineCanvas", "(Z)V", "unlockLineCanvas", "o", "getLineX", "setLineX", "lineX", b.r, "getLineOffset", "setLineOffset", "lineOffset", DTransferConstants.SEARCH_KEY, "getStartX", "setStartX", "startX", "r", "getLastX", "setLastX", "lastX", SOAP.XMLNS, "getKedu", "setKedu", "kedu", "Landroid/graphics/Paint;", "t", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "paint", "u", "getFontPaint", "setFontPaint", "fontPaint", "v", "start", "w", "end", "getSpacing", "setSpacing", "spacing", "z", "bgPaint", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "bgColor", "B", "cursorPaint", "C", "cursorColor", LogUtil.D, "cursorStrokeWidth", "E", "showResult", "resultTextPaint", "G", "resultTextSize", "H", "resultTextColor", "unitTextPaint", "J", "unitTextSize", "", "K", "Ljava/lang/String;", "unitText", "L", "unitTextColor", "M", "scaleTextPaint", "N", "scaleTextColor", "O", "scaleTextSize", "P", "scaleLinePaint", "Q", "scaleLineColor", "R", "scaleLineWidth", ExifInterface.LATITUDE_SOUTH, "outsideLinePaint", ExifInterface.GPS_DIRECTION_TRUE, "outsideLineColor", "U", "outsideLineWidth", "surfaceHolder", "Landroid/view/SurfaceHolder;", "getSurfaceHolder", "()Landroid/view/SurfaceHolder;", "setSurfaceHolder", "(Landroid/view/SurfaceHolder;)V", "V", "Lcom/xiaomi/hm/health/bodyfat/view/RulerView$OnChooseResultListener;", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OnChooseResultListener", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class RulerView extends SurfaceView implements SurfaceHolder.Callback {
    private static final float W = 100.0f;
    private static final float m0 = 150.0f;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int bgColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private Paint cursorPaint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int cursorColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private int cursorStrokeWidth;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean showResult;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Paint resultTextPaint;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int resultTextSize;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int resultTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private Paint unitTextPaint;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private int unitTextSize;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private String unitText;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private int unitTextColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Paint scaleTextPaint;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private int scaleTextColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private int scaleTextSize;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private Paint scaleLinePaint;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private int scaleLineColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private int scaleLineWidth;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private Paint outsideLinePaint;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private int outsideLineColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private int outsideLineWidth;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    private OnChooseResultListener onChooseResultListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float UNIT_MM;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float RULE_HEIGHT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float RULE_SCALE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int SCREEN_W;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int SCREEN_H;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float FONT_SIZE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float PADDING;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float RADIUS_BIG;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float RADIUS_MEDIUM;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float RADIUS_SMALL;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float CYCLE_WIDTH;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float DISPLAY_SIZE_BIG;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float DISPLAY_SIZE_SMALL;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean unlockLineCanvas;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float lineX;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float lineOffset;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float lastX;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int kedu;
    public SurfaceHolder surfaceHolder;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    private Paint paint;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    private Paint fontPaint;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int selectPosition;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private float spacing;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private Paint bgPaint;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/view/RulerView$OnChooseResultListener;", "", "", "result", "", "onScrollResult", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnChooseResultListener {
        void onScrollResult(@NotNull String result);
    }

    public RulerView(@NotNull Context context) {
        super(context);
        this.start = 1;
        this.end = 10;
        this.selectPosition = 5;
        this.bgColor = -1;
        this.cursorColor = -44205;
        this.cursorStrokeWidth = 4;
        this.showResult = true;
        this.resultTextSize = 100;
        this.resultTextColor = -44205;
        this.unitTextSize = 45;
        this.unitText = "kg";
        this.unitTextColor = -44205;
        this.scaleTextColor = -13421773;
        this.scaleTextSize = 50;
        this.scaleLineColor = -2368549;
        this.scaleLineWidth = 3;
        this.outsideLineColor = -3158065;
        this.outsideLineWidth = 4;
        f(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        Canvas canvasLockCanvas = null;
        try {
            try {
                canvasLockCanvas = getSurfaceHolder().lockCanvas();
                canvasLockCanvas.drawColor(-1);
                b(canvasLockCanvas);
                e(canvasLockCanvas);
                c(canvasLockCanvas);
                d(canvasLockCanvas);
            } catch (Exception e) {
                e.printStackTrace();
                if (canvasLockCanvas == null) {
                    return;
                }
            }
            getSurfaceHolder().unlockCanvasAndPost(canvasLockCanvas);
        } catch (Throwable th) {
            if (canvasLockCanvas != null) {
                getSurfaceHolder().unlockCanvasAndPost(canvasLockCanvas);
            }
            throw th;
        }
    }

    private final void b(Canvas canvas) {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, this.SCREEN_W, this.SCREEN_H);
        Paint paint = this.bgPaint;
        Objects.requireNonNull(paint);
        canvas.drawRect(rectF, paint);
    }

    private final void c(Canvas canvas) {
        if (this.lineX == -1.0f) {
            this.lineX = ((this.selectPosition - this.start) * this.spacing) + 100.0f;
        }
        int i = this.selectPosition;
        float f = ((i == this.start || i == this.end) ? this.outsideLineWidth : this.scaleLineWidth) / 2.0f;
        Paint paint = this.cursorPaint;
        Objects.requireNonNull(paint);
        paint.setStyle(Paint.Style.FILL);
        Rect rect = new Rect();
        float f2 = this.lineX;
        float f3 = 20;
        int i2 = this.outsideLineWidth;
        rect.set((int) ((f2 - f) - f3), (int) (147.0f - (i2 / 2)), (int) ((f2 - f) + f3), (int) (i2 + m0));
        Paint paint2 = this.cursorPaint;
        Objects.requireNonNull(paint2);
        canvas.drawRect(rect, paint2);
        Path path = new Path();
        path.moveTo((this.lineX - f) - f3, this.outsideLineWidth + m0);
        path.lineTo(this.lineX - f, this.outsideLineWidth + m0 + f3);
        path.lineTo((this.lineX - f) + f3, this.outsideLineWidth + m0);
        path.close();
        Paint paint3 = this.cursorPaint;
        Objects.requireNonNull(paint3);
        canvas.drawPath(path, paint3);
        Paint paint4 = this.cursorPaint;
        Objects.requireNonNull(paint4);
        float f4 = this.lineX;
        paint4.setShader(new LinearGradient(f4 - f, ((this.outsideLineWidth + m0) + f3) - (this.cursorStrokeWidth / 2), f4 - f, this.RULE_HEIGHT + m0, new int[]{this.cursorColor, -1}, (float[]) null, Shader.TileMode.CLAMP));
        float f5 = this.lineX;
        float f6 = this.RULE_HEIGHT + m0;
        Paint paint5 = this.cursorPaint;
        Objects.requireNonNull(paint5);
        canvas.drawLine(f5 - f, ((this.outsideLineWidth + m0) + f3) - (this.cursorStrokeWidth / 2), f5 - f, f6, paint5);
    }

    private final void d(Canvas canvas) {
        String strValueOf = String.valueOf(this.selectPosition);
        Paint paint = this.resultTextPaint;
        Objects.requireNonNull(paint);
        float fMeasureText = paint.measureText(strValueOf);
        Paint paint2 = this.unitTextPaint;
        Objects.requireNonNull(paint2);
        float f = 20;
        float fMeasureText2 = this.lineX - (((paint2.measureText(this.unitText) + fMeasureText) + f) / 2);
        Rect rect = new Rect();
        Paint paint3 = this.resultTextPaint;
        Objects.requireNonNull(paint3);
        paint3.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
        float fHeight = m0 - rect.height();
        Paint paint4 = this.resultTextPaint;
        Objects.requireNonNull(paint4);
        canvas.drawText(strValueOf, fMeasureText2, fHeight, paint4);
        Rect rect2 = new Rect();
        Paint paint5 = this.unitTextPaint;
        Objects.requireNonNull(paint5);
        String str = this.unitText;
        paint5.getTextBounds(str, 0, str.length(), rect2);
        String str2 = this.unitText;
        float f2 = fMeasureText2 + fMeasureText + f;
        float fHeight2 = m0 - rect.height();
        Paint paint6 = this.unitTextPaint;
        Objects.requireNonNull(paint6);
        canvas.drawText(str2, f2, fHeight2, paint6);
    }

    private final void e(Canvas canvas) {
        float f = this.SCREEN_W - 200.0f;
        int i = this.end;
        int i2 = this.start;
        this.spacing = f / (i - i2);
        float f2 = 100.0f;
        if (i2 <= i) {
            float f3 = 0.0f;
            while (true) {
                int i3 = i2 + 1;
                this.RULE_SCALE = 0.6f;
                if (i2 == this.start || i2 == this.end) {
                    this.RULE_SCALE = 1.0f;
                }
                String strValueOf = String.valueOf(i2);
                Rect rect = new Rect();
                float fMeasureText = this.fontPaint.measureText(strValueOf);
                this.fontPaint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
                float f4 = 2;
                float f5 = f2 - (fMeasureText / f4);
                float fHeight = this.RULE_HEIGHT + (this.FONT_SIZE / f4) + rect.height() + m0;
                Paint paint = this.scaleTextPaint;
                Objects.requireNonNull(paint);
                canvas.drawText(strValueOf, f5, fHeight, paint);
                RectF rectF = new RectF();
                rectF.top = m0;
                rectF.bottom = m0 + (this.RULE_HEIGHT * this.RULE_SCALE);
                if (i2 == this.start || i2 == this.end) {
                    int i4 = this.outsideLineWidth;
                    rectF.left = f2 - (i4 / 2);
                    rectF.right = (i4 / 2) + f2;
                    this.paint.setStrokeWidth(this.outsideLineWidth);
                    float f6 = rectF.left;
                    float f7 = rectF.top;
                    float f8 = rectF.bottom;
                    Paint paint2 = this.outsideLinePaint;
                    Objects.requireNonNull(paint2);
                    canvas.drawLine(f6, f7, f6, f8, paint2);
                } else {
                    int i5 = this.scaleLineWidth;
                    rectF.left = f2 - (i5 / 2);
                    rectF.right = (i5 / 2) + f2;
                    this.paint.setStrokeWidth(this.scaleLineWidth);
                    float f9 = rectF.left;
                    float f10 = rectF.top;
                    float f11 = rectF.bottom;
                    Paint paint3 = this.scaleLinePaint;
                    Objects.requireNonNull(paint3);
                    canvas.drawLine(f9, f10, f9, f11, paint3);
                }
                if (i2 == this.start) {
                    f3 = f2 - this.outsideLineWidth;
                } else {
                    this.paint.setStrokeWidth(this.outsideLineWidth);
                    float f12 = rectF.top;
                    Paint paint4 = this.outsideLinePaint;
                    Objects.requireNonNull(paint4);
                    canvas.drawLine(f3, f12, f2, f12, paint4);
                }
                f2 += this.spacing;
                if (i2 == i) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        this.lastX = f2 - this.UNIT_MM;
    }

    private final void f(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        this.RADIUS_BIG = TypedValue.applyDimension(1, 46.0f, displayMetrics);
        this.RADIUS_MEDIUM = TypedValue.applyDimension(1, 40.0f, displayMetrics);
        this.RADIUS_SMALL = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.CYCLE_WIDTH = TypedValue.applyDimension(1, 4.0f, displayMetrics);
        this.DISPLAY_SIZE_BIG = TypedValue.applyDimension(1, 40.0f, displayMetrics);
        this.DISPLAY_SIZE_SMALL = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.UNIT_MM = TypedValue.applyDimension(5, 1.0f, displayMetrics);
        this.RULE_HEIGHT = TypedValue.applyDimension(1, 30.0f, displayMetrics);
        float fApplyDimension = TypedValue.applyDimension(1, 20.0f, displayMetrics);
        this.FONT_SIZE = fApplyDimension;
        this.PADDING = fApplyDimension / 2;
        this.SCREEN_W = displayMetrics.widthPixels;
        this.SCREEN_H = displayMetrics.heightPixels;
        setSurfaceHolder(getHolder());
        getSurfaceHolder().addCallback(this);
        getSurfaceHolder().setFormat(-2);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(-14763784);
        Paint paint2 = new Paint();
        this.fontPaint = paint2;
        paint2.setTextSize(this.FONT_SIZE);
        this.fontPaint.setAntiAlias(true);
        this.fontPaint.setColor(-14763784);
        this.lineX = -1.0f;
        this.kedu = 0;
        g();
    }

    private final void g() {
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        Objects.requireNonNull(paint);
        paint.setColor(this.bgColor);
        Paint paint2 = new Paint(1);
        this.cursorPaint = paint2;
        Objects.requireNonNull(paint2);
        paint2.setColor(this.cursorColor);
        Paint paint3 = this.cursorPaint;
        Objects.requireNonNull(paint3);
        paint3.setStrokeWidth(this.cursorStrokeWidth);
        Paint paint4 = new Paint(1);
        this.outsideLinePaint = paint4;
        Objects.requireNonNull(paint4);
        paint4.setColor(this.outsideLineColor);
        Paint paint5 = this.outsideLinePaint;
        Objects.requireNonNull(paint5);
        paint5.setStrokeWidth(this.outsideLineWidth);
        Paint paint6 = new Paint(1);
        this.scaleLinePaint = paint6;
        Objects.requireNonNull(paint6);
        paint6.setColor(this.scaleLineColor);
        Paint paint7 = this.scaleLinePaint;
        Objects.requireNonNull(paint7);
        paint7.setStrokeWidth(this.scaleLineWidth);
        Paint paint8 = new Paint(1);
        this.scaleTextPaint = paint8;
        Objects.requireNonNull(paint8);
        paint8.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/AmazonEmberDisplay_Md.ttf"));
        Paint paint9 = this.scaleTextPaint;
        Objects.requireNonNull(paint9);
        paint9.setColor(this.scaleTextColor);
        Paint paint10 = this.scaleTextPaint;
        Objects.requireNonNull(paint10);
        paint10.setTextSize(this.scaleTextSize);
        Paint paint11 = new Paint(1);
        this.resultTextPaint = paint11;
        Objects.requireNonNull(paint11);
        paint11.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/AmazonEmberDisplay_Md.ttf"));
        Paint paint12 = this.resultTextPaint;
        Objects.requireNonNull(paint12);
        paint12.setTextSize(this.resultTextSize);
        Paint paint13 = this.resultTextPaint;
        Objects.requireNonNull(paint13);
        paint13.setColor(this.resultTextColor);
        Paint paint14 = new Paint(1);
        this.unitTextPaint = paint14;
        Objects.requireNonNull(paint14);
        paint14.setTextSize(this.unitTextSize);
        Paint paint15 = this.unitTextPaint;
        Objects.requireNonNull(paint15);
        paint15.setColor(this.unitTextColor);
    }

    private final void h(float x, float y) {
        float fAbs = Math.abs(x - this.lineX);
        this.lineOffset = fAbs;
        if (fAbs <= this.PADDING * 2) {
            this.startX = x;
            this.unlockLineCanvas = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    private final void i(float x, float y) {
        this.unlockLineCanvas = false;
        this.startX = -1.0f;
        float f = this.lineX;
        float f2 = this.spacing;
        int i = (int) ((f - 100.0f) / f2);
        if ((f - 100.0f) % f2 >= f2 / 2) {
            int i2 = this.start;
            if (i2 + i + 1 <= this.end) {
                this.lineX = (f2 * (i + 1)) + 100.0f;
                this.selectPosition = i2 + i + 1;
            } else {
                this.lineX = (f2 * i) + 100.0f;
                this.selectPosition = this.start + i;
            }
        } else {
            this.lineX = (f2 * i) + 100.0f;
            this.selectPosition = this.start + i;
        }
        int i3 = this.selectPosition;
        int i4 = this.end;
        if (i3 > i4) {
            this.selectPosition = i4;
        } else {
            int i5 = this.start;
            if (i3 < i5) {
                this.selectPosition = i5;
            }
        }
        a();
        OnChooseResultListener onChooseResultListener = this.onChooseResultListener;
        if (onChooseResultListener != null) {
            onChooseResultListener.onScrollResult(String.valueOf(this.selectPosition));
        }
    }

    private final void j(float x, float y) {
        if (this.unlockLineCanvas) {
            float f = this.lineX + (x - this.startX);
            this.lineX = f;
            float f2 = this.PADDING;
            if (f < f2) {
                this.lineX = f2;
            } else {
                float f3 = this.lastX;
                if (f > f3) {
                    this.lineX = f3;
                }
            }
            this.kedu = Math.round((this.lineX - f2) / this.UNIT_MM);
            this.startX = x;
            if (this.lineX < 100.0f) {
                this.lineX = 100.0f;
            }
            float f4 = this.lineX;
            int i = this.SCREEN_W;
            if (f4 > i - 100.0f) {
                this.lineX = i - 100.0f;
            }
            float f5 = this.lineX;
            float f6 = this.spacing;
            int i2 = (int) ((f5 - 100.0f) / f6);
            int i3 = (f5 - 100.0f) % f6 >= f6 / ((float) 2) ? this.start + i2 + 1 : this.start + i2;
            this.selectPosition = i3;
            int i4 = this.end;
            if (i3 > i4) {
                this.selectPosition = i4;
            } else {
                int i5 = this.start;
                if (i3 < i5) {
                    this.selectPosition = i5;
                }
            }
            a();
        }
    }

    private final void k(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.RulerView, defStyleAttr, 0);
        this.bgColor = typedArrayObtainStyledAttributes.getColor(R.styleable.RulerView_bgColor, this.bgColor);
        this.cursorColor = typedArrayObtainStyledAttributes.getColor(R.styleable.RulerView_cursorColor, this.cursorColor);
        this.cursorStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RulerView_cursorStrokeWidth, this.cursorStrokeWidth);
        this.showResult = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RulerView_showResult, this.showResult);
        this.resultTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.RulerView_resultTextColor, this.resultTextColor);
        this.resultTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RulerView_resultTextSize, this.resultTextSize);
        this.unitTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.RulerView_unitTextColor, this.unitTextColor);
        this.unitTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RulerView_unitTextSize, this.unitTextSize);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.RulerView_unitText);
        if (string != null) {
            this.unitText = string;
        }
        this.scaleTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.RulerView_scaleTextColor, this.scaleTextColor);
        this.scaleTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RulerView_scaleTextSize, this.scaleTextSize);
        this.scaleLineColor = typedArrayObtainStyledAttributes.getColor(R.styleable.RulerView_scaleLineColor, this.scaleLineColor);
        this.scaleLineWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RulerView_scaleLineWidth, this.scaleLineWidth);
        this.outsideLineColor = typedArrayObtainStyledAttributes.getColor(R.styleable.RulerView_outsideLineColor, this.outsideLineColor);
        this.outsideLineWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RulerView_outsideLineWidth, this.outsideLineWidth);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final float getCYCLE_WIDTH() {
        return this.CYCLE_WIDTH;
    }

    public final float getDISPLAY_SIZE_BIG() {
        return this.DISPLAY_SIZE_BIG;
    }

    public final float getDISPLAY_SIZE_SMALL() {
        return this.DISPLAY_SIZE_SMALL;
    }

    public final float getFONT_SIZE() {
        return this.FONT_SIZE;
    }

    @Nullable
    public final Paint getFontPaint() {
        return this.fontPaint;
    }

    public final int getKedu() {
        return this.kedu;
    }

    public final float getLastX() {
        return this.lastX;
    }

    public final float getLineOffset() {
        return this.lineOffset;
    }

    public final float getLineX() {
        return this.lineX;
    }

    public final float getPADDING() {
        return this.PADDING;
    }

    @Nullable
    public final Paint getPaint() {
        return this.paint;
    }

    public final float getRADIUS_BIG() {
        return this.RADIUS_BIG;
    }

    public final float getRADIUS_MEDIUM() {
        return this.RADIUS_MEDIUM;
    }

    public final float getRADIUS_SMALL() {
        return this.RADIUS_SMALL;
    }

    public final float getRULE_HEIGHT() {
        return this.RULE_HEIGHT;
    }

    public final float getRULE_SCALE() {
        return this.RULE_SCALE;
    }

    public final int getSCREEN_H() {
        return this.SCREEN_H;
    }

    public final int getSCREEN_W() {
        return this.SCREEN_W;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final float getStartX() {
        return this.startX;
    }

    @NotNull
    public final SurfaceHolder getSurfaceHolder() {
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        Objects.requireNonNull(surfaceHolder);
        return surfaceHolder;
    }

    public final float getUNIT_MM() {
        return this.UNIT_MM;
    }

    public final boolean getUnlockLineCanvas() {
        return this.unlockLineCanvas;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            h(event.getX(), event.getY());
        } else if (action == 1) {
            i(event.getX(), event.getY());
        } else if (action == 2) {
            j(event.getX(), event.getY());
        } else if (action == 3) {
            i(event.getX(), event.getY());
        }
        return true;
    }

    public final void setCYCLE_WIDTH(float f) {
        this.CYCLE_WIDTH = f;
    }

    public final void setDISPLAY_SIZE_BIG(float f) {
        this.DISPLAY_SIZE_BIG = f;
    }

    public final void setDISPLAY_SIZE_SMALL(float f) {
        this.DISPLAY_SIZE_SMALL = f;
    }

    public final void setFONT_SIZE(float f) {
        this.FONT_SIZE = f;
    }

    public final void setFontPaint(@Nullable Paint paint) {
        this.fontPaint = paint;
    }

    public final void setKedu(int i) {
        this.kedu = i;
    }

    public final void setLastX(float f) {
        this.lastX = f;
    }

    public final void setLineOffset(float f) {
        this.lineOffset = f;
    }

    public final void setLineX(float f) {
        this.lineX = f;
    }

    public final void setOnChooseResultListener(@NotNull OnChooseResultListener onChooseResultListener) {
        this.onChooseResultListener = onChooseResultListener;
    }

    public final void setPADDING(float f) {
        this.PADDING = f;
    }

    public final void setPaint(@Nullable Paint paint) {
        this.paint = paint;
    }

    public final void setRADIUS_BIG(float f) {
        this.RADIUS_BIG = f;
    }

    public final void setRADIUS_MEDIUM(float f) {
        this.RADIUS_MEDIUM = f;
    }

    public final void setRADIUS_SMALL(float f) {
        this.RADIUS_SMALL = f;
    }

    public final void setRULE_HEIGHT(float f) {
        this.RULE_HEIGHT = f;
    }

    public final void setRULE_SCALE(float f) {
        this.RULE_SCALE = f;
    }

    public final void setSCREEN_H(int i) {
        this.SCREEN_H = i;
    }

    public final void setSCREEN_W(int i) {
        this.SCREEN_W = i;
    }

    public final void setSelectPosition(int selectPosition) {
        this.selectPosition = selectPosition;
        invalidate();
    }

    public final void setSpacing(float f) {
        this.spacing = f;
    }

    public final void setStartX(float f) {
        this.startX = f;
    }

    public final void setSurfaceHolder(@NotNull SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
    }

    public final void setUNIT_MM(float f) {
        this.UNIT_MM = f;
    }

    public final void setUnlockLineCanvas(boolean z) {
        this.unlockLineCanvas = z;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NotNull SurfaceHolder holder, int format, int width, int height) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder holder) {
        new Thread() { // from class: com.xiaomi.hm.health.bodyfat.view.RulerView.surfaceCreated.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                RulerView.this.a();
            }
        }.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
    }

    public RulerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.start = 1;
        this.end = 10;
        this.selectPosition = 5;
        this.bgColor = -1;
        this.cursorColor = -44205;
        this.cursorStrokeWidth = 4;
        this.showResult = true;
        this.resultTextSize = 100;
        this.resultTextColor = -44205;
        this.unitTextSize = 45;
        this.unitText = "kg";
        this.unitTextColor = -44205;
        this.scaleTextColor = -13421773;
        this.scaleTextSize = 50;
        this.scaleLineColor = -2368549;
        this.scaleLineWidth = 3;
        this.outsideLineColor = -3158065;
        this.outsideLineWidth = 4;
        f(context);
    }

    public RulerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.start = 1;
        this.end = 10;
        this.selectPosition = 5;
        this.bgColor = -1;
        this.cursorColor = -44205;
        this.cursorStrokeWidth = 4;
        this.showResult = true;
        this.resultTextSize = 100;
        this.resultTextColor = -44205;
        this.unitTextSize = 45;
        this.unitText = "kg";
        this.unitTextColor = -44205;
        this.scaleTextColor = -13421773;
        this.scaleTextSize = 50;
        this.scaleLineColor = -2368549;
        this.scaleLineWidth = 3;
        this.outsideLineColor = -3158065;
        this.outsideLineWidth = 4;
        k(attributeSet, i);
        f(context);
    }
}
