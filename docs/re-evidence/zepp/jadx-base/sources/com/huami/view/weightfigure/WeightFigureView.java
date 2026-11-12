package com.huami.view.weightfigure;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¾\u00012\u00020\u0001:\u0002¾\u0001B!\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\b\u0002\u0010»\u0001\u001a\u0005\u0018\u00010º\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002JB\u0010\u0016\u001a\u00020\b2:\u0010\u0015\u001a6\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0014J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0012J-\u0010\u001f\u001a\u00020\b2%\u0010\u001e\u001a!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\u001cj\u0002`\u001dJ\u0010\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006H\u0007J\u000e\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0006J#\u0010)\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120&¢\u0006\u0004\b,\u0010-JE\u0010)\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010/\u001a\u00020.2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010+\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u00101J1\u0010)\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u0002022\u0006\u00103\u001a\u00020.2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b)\u00104J9\u0010)\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u0002022\u0006\u00103\u001a\u00020.2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010+\u001a\u00020.¢\u0006\u0004\b)\u00105JC\u0010)\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u0002022\u0006\u00103\u001a\u00020.2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010+\u001a\u00020.2\u0006\u00106\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u00107J\u000e\u00109\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0002J\u000e\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0006J\u0018\u0010>\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0012H\u0014J\u0010\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?H\u0016J\b\u0010B\u001a\u00020\u0012H\u0014J\u0010\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0014J\u000e\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u0012J\u000e\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020HJ\u000e\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u0012J\u000e\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u0002J\u0016\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010I\u001a\u00020HJ\u0014\u0010O\u001a\u00020\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'02J\u0014\u0010)\u001a\u00020\b2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000202J\u000e\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u0002J\u000e\u0010S\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u0002J\u000e\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u0012J-\u0010W\u001a\u00020\b2%\u0010\u0015\u001a!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020'0\u001cj\u0002`VR*\u0010]\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010_R\u0016\u0010b\u001a\u00020^8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_R\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020g8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010iR\u0016\u0010n\u001a\u00020^8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010_R\u0016\u0010q\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010_R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010XR\u0016\u0010v\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010XR\u0018\u0010y\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020|8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010{R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0|8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010~R\u001f\u00103\u001a\t\u0012\u0004\u0012\u00020\u00120\u0082\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010{R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010+\u001a\t\u0012\u0004\u0012\u00020\u00120\u0082\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0084\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010XR\u0018\u0010\u008e\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010XR\u0018\u0010\u0090\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010pR\u0018\u0010\u0092\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010XR\u0018\u0010\u0094\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010{R\u0018\u0010\u0096\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010{RQ\u0010\u0099\u0001\u001a:\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u000ej\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R<\u0010\u009c\u0001\u001a%\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010XR\u0017\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010XR\u0018\u0010 \u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010pR\u0017\u0010¡\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010pR\u0018\u0010£\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010XR\u0018\u0010¥\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010{R\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010xR\u0018\u0010§\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010{R\u0017\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010pR.\u0010¬\u0001\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010X\u001a\u0005\bª\u0001\u0010Z\"\u0005\b«\u0001\u0010\\R.\u0010°\u0001\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010X\u001a\u0005\b®\u0001\u0010Z\"\u0005\b¯\u0001\u0010\\RL\u0010¶\u0001\u001a%\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020'\u0018\u00010\u001cj\u0004\u0018\u0001`V8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010\u009b\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u001c\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120&8F@\u0006¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001¨\u0006¿\u0001"}, d2 = {"Lcom/huami/view/weightfigure/WeightFigureView;", "Landroid/view/View;", "", "realWidth", "Landroid/graphics/LinearGradient;", "a", "", "isIncrease", "", "setValuesIncrease", "indicatorCircleRadius", "setIndicatorCircleRadius", "indicatorOutlineCircleRadius", "setIndicatorOutlineCircleRadius", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "", "index", "Lcom/huami/view/weightfigure/OnValueIndexChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setValueIndexListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "setThumbDarkStyle", "defaultLabelColor", "setDynamicLabelColor", "Lkotlin/Function1;", "Lcom/huami/view/weightfigure/OnValueChangedListener;", "onValueChangedListener", "setOnValueChangedListener", "isLanguageNormal", "setLanguageNormal", "b", "setCenterLabel", "", "values", "", "", "labels", "setValues", "([F[Ljava/lang/String;)V", "labelColors", "setLabelColors", "([Ljava/lang/Integer;)V", "", "barColors", "isGradient", "([F[I[Ljava/lang/String;[IZ)V", "", "colors", "(Ljava/util/List;[I[Ljava/lang/String;)V", "(Ljava/util/List;[I[Ljava/lang/String;[I)V", "enableIndicatorCircleFilled", "(Ljava/util/List;[I[Ljava/lang/String;[IZ)V", "barGap", "setBarGap", "hide", "hideThumb", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "getSuggestedMinimumHeight", "Landroid/graphics/Canvas;", "canvas", "onDraw", "iconRes", "setThumbIcon", "Landroid/graphics/Typeface;", "typeface", "setTypeface", "mType", "setType", "mInitValue", "setInitValue", "setLabels", "scales", "textSize", "setLabelTextSize", "setScaleTextSize", "color", "setScaleTextColor", "Lcom/huami/view/weightfigure/OnShownValueListener;", "setListener", "F", "getBarHeight", "()F", "setBarHeight", "(F)V", "barHeight", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "barPaint", "c", "thumbPaint", "Landroid/graphics/Bitmap;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Bitmap;", "thumbBitmap", "Landroid/text/TextPaint;", "e", "Landroid/text/TextPaint;", "scalePaint", "f", "labelPaint", "g", "whitePaint", "h", LogUtil.I, "defaultColor", "i", "darkModeWhitePaint", z.j, hl.k, "initValue", "l", "Landroid/graphics/Typeface;", "initValueLabelTypeface", "m", "Z", "", GoogleApiAvailabilityLight.b, "Ljava/util/List;", "o", "valuesIncrease", b.r, "Ljava/util/ArrayList;", DTransferConstants.SEARCH_KEY, "Ljava/util/ArrayList;", "r", "isGradientBar", SOAP.XMLNS, "Landroid/graphics/LinearGradient;", "barLinearGradient", "t", "u", "labelTextSize", "v", "scaleTextSize", "w", "scaleTextColor", "x", "currentX", "y", "needHideThumb", "z", "isCenterLabel", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/jvm/functions/Function2;", "valueIndexListener", "B", "Lkotlin/jvm/functions/Function1;", "valueChangeListener", "C", LogUtil.D, "E", "barCenterY", "type", "G", "padding", "H", "isTouched", "J", "enableDynamicLabelColor", "K", "L", "getScaleToBarSpacing", "setScaleToBarSpacing", "scaleToBarSpacing", "M", "getLabelToBarSpacing", "setLabelToBarSpacing", "labelToBarSpacing", "N", "getShownListener", "()Lkotlin/jvm/functions/Function1;", "setShownListener", "(Lkotlin/jvm/functions/Function1;)V", "shownListener", "getCurrentLabelColor", "()[Ljava/lang/Integer;", "currentLabelColor", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "weightfigure_release"}, k = 1, mv = {1, 4, 0})
public final class WeightFigureView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final float[] O = {0.0f, 122.0f, 157.0f, 180.0f, 200.0f};

    @NotNull
    private static final int[] P = {Color.parseColor("#2F91CE"), Color.parseColor("#55AA2F"), Color.parseColor("#F5AA05"), Color.parseColor("#ED4F4E")};

    @NotNull
    private static final String[] Q = {"偏瘦", "标准", "偏胖", "肥胖"};
    public static final int TYPE_MOVEABLE = 0;
    public static final int TYPE_UNMOVEABLE = 1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Function2<? super Float, ? super Integer, Unit> valueIndexListener;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private Function1<? super Float, Unit> valueChangeListener;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float indicatorCircleRadius;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float indicatorOutlineCircleRadius;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final int barCenterY;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float padding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isTouched;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private Typeface typeface;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean enableDynamicLabelColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private int defaultLabelColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private float scaleToBarSpacing;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private float labelToBarSpacing;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Float, String> shownListener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float barHeight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Paint barPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Paint thumbPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Bitmap thumbBitmap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextPaint scalePaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextPaint labelPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Paint whitePaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int defaultColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Paint darkModeWhitePaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float barGap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float initValue;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Typeface initValueLabelTypeface;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean enableIndicatorCircleFilled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final List<Float> values;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean valuesIncrease;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final List<String> labels;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final ArrayList<Integer> colors;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isGradientBar;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private LinearGradient barLinearGradient;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final ArrayList<Integer> labelColors;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float labelTextSize;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float scaleTextSize;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int scaleTextColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private float currentX;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean needHideThumb;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean isCenterLabel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/view/weightfigure/WeightFigureView$Companion;", "", "", "DEFAULT_VALUES", "[F", "getDEFAULT_VALUES", "()[F", "", "DEFAULT_COLORS", "[I", "getDEFAULT_COLORS", "()[I", "", "", "DEFAULT_LABELS", "[Ljava/lang/String;", "getDEFAULT_LABELS", "()[Ljava/lang/String;", "", "TYPE_MOVEABLE", LogUtil.I, "TYPE_UNMOVEABLE", "<init>", "()V", "weightfigure_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final int[] getDEFAULT_COLORS() {
            return WeightFigureView.P;
        }

        @NotNull
        public final String[] getDEFAULT_LABELS() {
            return WeightFigureView.Q;
        }

        @NotNull
        public final float[] getDEFAULT_VALUES() {
            return WeightFigureView.O;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public WeightFigureView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WeightFigureView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final LinearGradient a(float realWidth) {
        LinearGradient linearGradient = this.barLinearGradient;
        if (linearGradient != null) {
            return linearGradient;
        }
        ArrayList<Integer> arrayList = this.colors;
        if (arrayList == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        Object[] array = arrayList.toArray(new Integer[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, realWidth, 0.0f, ArraysKt___ArraysKt.toIntArray((Integer[]) array), (float[]) null, Shader.TileMode.CLAMP);
        this.barLinearGradient = linearGradient2;
        return linearGradient2;
    }

    public static /* synthetic */ void setValues$default(WeightFigureView weightFigureView, float[] fArr, int[] iArr, String[] strArr, int[] iArr2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iArr = P;
        }
        int[] iArr3 = iArr;
        if ((i & 4) != 0) {
            strArr = Q;
        }
        String[] strArr2 = strArr;
        if ((i & 8) != 0) {
            iArr2 = P;
        }
        weightFigureView.setValues(fArr, iArr3, strArr2, iArr2, (i & 16) != 0 ? false : z);
    }

    public final float getBarHeight() {
        return this.barHeight;
    }

    @NotNull
    public final Integer[] getCurrentLabelColor() {
        ArrayList<Integer> arrayList = this.labelColors;
        if (arrayList == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        Object[] array = arrayList.toArray(new Integer[0]);
        if (array != null) {
            return (Integer[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final float getLabelToBarSpacing() {
        return this.labelToBarSpacing;
    }

    public final float getScaleToBarSpacing() {
        float f = this.scaleToBarSpacing;
        return f == 0.0f ? this.barHeight / 2 : f;
    }

    @Nullable
    public final Function1<Float, String> getShownListener() {
        return this.shownListener;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) (this.barHeight + getScaleToBarSpacing() + WeightFigureViewKt.b(this.scalePaint) + this.labelToBarSpacing + (WeightFigureViewKt.b(this.labelPaint) * 4));
    }

    public final void hideThumb(boolean hide) {
        this.needHideThumb = hide;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        boolean z;
        int i;
        float f;
        float f2;
        String strInvoke;
        float f3;
        float f4;
        float f5;
        super.onDraw(canvas);
        boolean z2 = getLayoutDirection() == 1;
        if (this.valuesIncrease) {
            z = z2;
        } else {
            z = !z2;
        }
        float f6 = 2;
        float f7 = this.barHeight / f6;
        int size = this.values.size() - 1;
        float width = (((getWidth() - getPaddingStart()) - getPaddingEnd()) - (this.padding * f6)) - (f7 * f6);
        float f8 = width / size;
        float width2 = z ? ((getWidth() - getPaddingStart()) - this.padding) - f7 : getPaddingStart() + this.padding + f7;
        float paddingStart = z ? getPaddingStart() + this.padding + f7 : ((getWidth() - getPaddingStart()) - this.padding) - f7;
        float f9 = z ? paddingStart : width2;
        float f10 = z ? width2 : paddingStart;
        this.scalePaint.setColor(this.scaleTextColor);
        float fMax = Math.max(((Number) CollectionsKt.first((List) this.values)).floatValue(), Math.min(((Number) CollectionsKt.last((List) this.values)).floatValue(), this.initValue));
        int size2 = this.values.size() - 2;
        int size3 = this.values.size() - 1;
        int i2 = 0;
        while (i2 < size3) {
            int i3 = size3;
            if (fMax >= this.values.get(i2).floatValue()) {
                f5 = paddingStart;
                if (fMax < this.values.get(i2 + 1).floatValue()) {
                    size2 = i2;
                }
            } else {
                f5 = paddingStart;
            }
            i2++;
            size3 = i3;
            paddingStart = f5;
        }
        float f11 = paddingStart;
        float fFloatValue = ((fMax - this.values.get(size2).floatValue()) * f8) / (this.values.get(size2 + 1).floatValue() - this.values.get(size2).floatValue());
        float f12 = z ? (width2 - (size2 * f8)) - fFloatValue : (size2 * f8) + width2 + fFloatValue;
        if (this.currentX == -1.0f || this.type == 1 || !this.isTouched) {
            this.currentX = f12;
        }
        float f13 = this.currentX;
        if (f13 != -1.0f) {
            float fMax2 = Math.max(f9, Math.min(f13, f10));
            this.currentX = fMax2;
            int iMax = Math.max(0, Math.min((int) ((z ? width2 - fMax2 : fMax2 - width2) / f8), size - 1));
            if (z) {
                f3 = width2 - (iMax * f8);
                f4 = this.currentX;
            } else {
                f3 = this.currentX;
                f4 = (iMax * f8) + width2;
            }
            float fFloatValue2 = this.values.get(iMax).floatValue() + (((f3 - f4) / f8) * (this.values.get(iMax + 1).floatValue() - this.values.get(iMax).floatValue()));
            Function1<? super Float, Unit> function1 = this.valueChangeListener;
            if (function1 != null) {
                function1.invoke(Float.valueOf(fFloatValue2));
            }
            Function2<? super Float, ? super Integer, Unit> function2 = this.valueIndexListener;
            if (function2 != null) {
                function2.invoke(Float.valueOf(fFloatValue2), Integer.valueOf(iMax));
            }
            i = iMax;
        } else {
            i = -1;
        }
        int i4 = 0;
        while (i4 < size) {
            if (this.isGradientBar) {
                this.barPaint.setShader(a(width));
            } else {
                this.barPaint.setColor(this.colors.get(i4).intValue());
            }
            if (!this.enableDynamicLabelColor || i4 == i) {
                this.labelPaint.setColor(this.labelColors.get(i4).intValue());
            } else {
                this.labelPaint.setColor(this.defaultLabelColor);
            }
            float width3 = z ? (((getWidth() - getPaddingStart()) - this.padding) - f7) - (i4 * f8) : getPaddingStart() + this.padding + f7 + (i4 * f8);
            float f14 = z ? width3 - f8 : width3 + f8;
            float f15 = (i4 == 0 ? 0.0f : this.barGap / 2.0f) + (z ? f14 : width3);
            if (z) {
                f14 = width3;
            }
            int i5 = size - 1;
            float f16 = f14 - (i4 == i5 ? 0.0f : this.barGap / 2.0f);
            int i6 = this.barCenterY;
            boolean z3 = z;
            float f17 = width;
            int i7 = i;
            float f18 = f11;
            float f19 = f8;
            int i8 = i4;
            int i9 = size2;
            float f20 = width2;
            canvas.drawRect(f15, i6 - f7, f16, i6 + f7, this.barPaint);
            if (this.barGap > 0) {
                canvas.drawCircle(f15, this.barCenterY, f7 - this.barPaint.getStrokeWidth(), this.barPaint);
                f = f16;
                canvas.drawCircle(f, this.barCenterY, f7 - this.barPaint.getStrokeWidth(), this.barPaint);
            } else {
                f = f16;
            }
            if (size == 1) {
                canvas.drawCircle(f20, this.barCenterY, f7 - this.barPaint.getStrokeWidth(), this.barPaint);
                canvas.drawCircle(f18, this.barCenterY, f7 - this.barPaint.getStrokeWidth(), this.barPaint);
            } else if (i8 == 0) {
                canvas.drawCircle(f20, this.barCenterY, f7 - this.barPaint.getStrokeWidth(), this.barPaint);
            } else if (i8 == i5) {
                canvas.drawCircle(f18, this.barCenterY, f7 - this.barPaint.getStrokeWidth(), this.barPaint);
            }
            if (i8 != 0) {
                Function1<? super Float, String> function3 = this.shownListener;
                if (function3 != null) {
                    if (function3 == null) {
                        Intrinsics.throwNpe();
                    }
                    strInvoke = function3.invoke(this.values.get(i8));
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    strInvoke = String.format(Locale.getDefault(), "%.0f", Arrays.copyOf(new Object[]{this.values.get(i8)}, 1));
                }
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.scalePaint.setTypeface(typeface);
                }
                canvas.drawText(strInvoke, width3 - (this.scalePaint.measureText(strInvoke) / f6), (this.barCenterY - getScaleToBarSpacing()) - WeightFigureViewKt.b(this.scalePaint), this.scalePaint);
            }
            int iA = (int) WeightFigureViewKt.a(this, 4.0f);
            float fMeasureText = size == 1 ? ((f + f15) / f6) - (this.labelPaint.measureText(this.labels.get(i8)) / f6) : f15 + iA;
            float f21 = this.barCenterY + (this.barHeight / f6) + this.labelToBarSpacing;
            Typeface typeface2 = this.initValueLabelTypeface;
            if (typeface2 == null || i9 != i8) {
                this.labelPaint.setTypeface(Typeface.DEFAULT);
            } else {
                this.labelPaint.setTypeface(typeface2);
            }
            if (this.labels.size() != 1) {
                f2 = f19;
                StaticLayout staticLayout = new StaticLayout(this.labels.get(i8), this.labelPaint, ((int) f2) - (iA * 2), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                canvas.save();
                canvas.translate(fMeasureText, f21);
                staticLayout.draw(canvas);
                canvas.restore();
            } else {
                f2 = f19;
            }
            int i10 = i8 + 1;
            f8 = f2;
            width2 = f20;
            f11 = f18;
            width = f17;
            z = z3;
            i = i7;
            size2 = i9;
            i4 = i10;
        }
        int i11 = i;
        if (i11 >= 0 && size > i11 && !this.needHideThumb) {
            Bitmap bitmap = this.thumbBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, this.currentX - (bitmap.getWidth() / 2.0f), this.barCenterY - (bitmap.getHeight() / 2.0f), this.thumbPaint);
                return;
            }
            this.thumbPaint.setColor(this.colors.get(i11).intValue());
            this.thumbPaint.setStrokeWidth(WeightFigureViewKt.a(this, 2.0f));
            if (!this.enableIndicatorCircleFilled) {
                canvas.drawCircle(this.currentX, this.barCenterY, WeightFigureViewKt.a(this, this.indicatorOutlineCircleRadius), this.thumbPaint);
                float f22 = this.currentX;
                float f23 = this.barCenterY;
                float fA = WeightFigureViewKt.a(this, this.indicatorCircleRadius);
                Paint paint = this.darkModeWhitePaint;
                if (paint == null) {
                    paint = this.whitePaint;
                }
                canvas.drawCircle(f22, f23, fA, paint);
                return;
            }
            float f24 = this.currentX;
            float f25 = this.barCenterY;
            float fA2 = WeightFigureViewKt.a(this, this.indicatorOutlineCircleRadius);
            Paint paint2 = this.darkModeWhitePaint;
            if (paint2 == null) {
                paint2 = this.whitePaint;
            }
            canvas.drawCircle(f24, f25, fA2, paint2);
            this.thumbPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.currentX, this.barCenterY, WeightFigureViewKt.a(this, this.indicatorCircleRadius), this.thumbPaint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec), View.MeasureSpec.getMode(heightMeasureSpec) != 1073741824 ? getSuggestedMinimumHeight() : View.MeasureSpec.getSize(heightMeasureSpec));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        if (this.type != 0) {
            return false;
        }
        this.currentX = event.getX();
        this.isTouched = true;
        postInvalidate();
        return true;
    }

    public final void setBarGap(float barGap) {
        this.barGap = barGap;
        invalidate();
    }

    public final void setBarHeight(float f) {
        this.barHeight = f;
        invalidate();
    }

    public final void setCenterLabel(boolean b) {
        this.isCenterLabel = b;
        invalidate();
    }

    public final void setDynamicLabelColor(int defaultLabelColor) {
        this.enableDynamicLabelColor = true;
        this.defaultLabelColor = defaultLabelColor;
    }

    public final void setIndicatorCircleRadius(float indicatorCircleRadius) {
        this.indicatorCircleRadius = indicatorCircleRadius;
    }

    public final void setIndicatorOutlineCircleRadius(float indicatorOutlineCircleRadius) {
        this.indicatorOutlineCircleRadius = indicatorOutlineCircleRadius;
    }

    public final void setInitValue(float mInitValue) {
        this.initValue = mInitValue;
        invalidate();
    }

    public final void setLabelColors(@NotNull Integer[] labelColors) {
        this.labelColors.clear();
        int size = this.values.size() - 1;
        for (int i = 0; i < size; i++) {
            if (i < labelColors.length) {
                this.labelColors.add(labelColors[i]);
            } else {
                this.labelColors.add(Integer.valueOf(this.defaultColor));
            }
        }
    }

    public final void setLabelTextSize(float textSize) {
        this.labelTextSize = textSize;
        this.labelPaint.setTextSize(WeightFigureViewKt.d(this, textSize));
    }

    public final void setLabelToBarSpacing(float f) {
        this.labelToBarSpacing = f;
        invalidate();
    }

    public final void setLabels(@NotNull List<String> labels) {
        List<String> list = this.labels;
        list.clear();
        list.addAll(labels);
    }

    @Deprecated(message = "")
    public final void setLanguageNormal(boolean isLanguageNormal) {
    }

    public final void setListener(@NotNull Function1<? super Float, String> listener) {
        this.shownListener = listener;
        invalidate();
    }

    public final void setOnValueChangedListener(@NotNull Function1<? super Float, Unit> onValueChangedListener) {
        this.valueChangeListener = onValueChangedListener;
    }

    public final void setScaleTextColor(int color) {
        this.scaleTextColor = color;
        this.scalePaint.setColor(color);
    }

    public final void setScaleTextSize(float textSize) {
        this.scaleTextSize = textSize;
        this.scalePaint.setTextSize(WeightFigureViewKt.d(this, textSize));
    }

    public final void setScaleToBarSpacing(float f) {
        this.scaleToBarSpacing = f;
        invalidate();
    }

    public final void setShownListener(@Nullable Function1<? super Float, String> function1) {
        this.shownListener = function1;
    }

    public final void setThumbDarkStyle(@NotNull Context context) {
        boolean zC = WeightFigureViewKt.c(context);
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor(zC ? "#1D1E1F" : "#FFFFFF"));
        Unit unit = Unit.INSTANCE;
        this.darkModeWhitePaint = paint;
    }

    public final void setThumbIcon(int iconRes) {
        this.thumbBitmap = BitmapFactory.decodeResource(getContext().getResources(), iconRes);
        invalidate();
    }

    public final void setType(int mType) {
        this.type = mType;
        invalidate();
    }

    public final void setTypeface(@NotNull Typeface typeface) {
        this.typeface = typeface;
        invalidate();
    }

    public final void setValueIndexListener(@NotNull Function2<? super Float, ? super Integer, Unit> listener) {
        this.valueIndexListener = listener;
    }

    @JvmOverloads
    public final void setValues(@NotNull float[] fArr) {
        setValues$default(this, fArr, null, null, null, false, 30, null);
    }

    @JvmOverloads
    public final void setValues(@NotNull float[] fArr, @NotNull int[] iArr) {
        setValues$default(this, fArr, iArr, null, null, false, 28, null);
    }

    @JvmOverloads
    public final void setValues(@NotNull float[] fArr, @NotNull int[] iArr, @NotNull String[] strArr) {
        setValues$default(this, fArr, iArr, strArr, null, false, 24, null);
    }

    @JvmOverloads
    public final void setValues(@NotNull float[] fArr, @NotNull int[] iArr, @NotNull String[] strArr, @NotNull int[] iArr2) {
        setValues$default(this, fArr, iArr, strArr, iArr2, false, 16, null);
    }

    public final void setValues(@NotNull float[] values, @NotNull String[] labels) {
        setValues$default(this, values, P, labels, null, false, 24, null);
    }

    public final void setValuesIncrease(boolean isIncrease) {
        this.valuesIncrease = isIncrease;
    }

    @JvmOverloads
    public WeightFigureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.barHeight = WeightFigureViewKt.a(this, 4.0f);
        this.barPaint = new Paint(1);
        this.thumbPaint = new Paint(1);
        this.scalePaint = new TextPaint(1);
        this.labelPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        Unit unit = Unit.INSTANCE;
        this.whitePaint = paint;
        this.defaultColor = Color.parseColor("#55AA2F");
        this.initValue = -1.0f;
        this.values = new ArrayList();
        this.valuesIncrease = true;
        this.labels = new ArrayList();
        this.colors = new ArrayList<>();
        this.labelColors = new ArrayList<>();
        this.labelTextSize = 11.0f;
        this.scaleTextSize = 12.0f;
        this.scaleTextColor = Color.parseColor("#66000000");
        this.currentX = -1.0f;
        this.indicatorCircleRadius = 5.0f;
        this.indicatorOutlineCircleRadius = 7.0f;
        this.barCenterY = (int) WeightFigureViewKt.a(this, 40.0f);
        this.padding = WeightFigureViewKt.a(this, 5.0f);
        this.defaultLabelColor = Color.parseColor("#66000000");
        this.labelToBarSpacing = WeightFigureViewKt.a(this, 14.0f);
        setLabelTextSize(this.labelTextSize);
        setScaleTextSize(this.scaleTextSize);
        setScaleTextColor(this.scaleTextColor);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.WeightFigureView);
        this.type = typedArrayObtainStyledAttributes.getInteger(R.styleable.WeightFigureView_type, 0);
        int i = R.styleable.WeightFigureView_slideHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i)) {
            setBarHeight(typedArrayObtainStyledAttributes.getFloat(i, this.barHeight));
        }
        typedArrayObtainStyledAttributes.recycle();
        setValues$default(this, O, null, null, null, false, 30, null);
    }

    @JvmOverloads
    public final void setValues(@NotNull float[] values, @NotNull int[] barColors, @NotNull String[] labels, @NotNull int[] labelColors, boolean isGradient) {
        this.values.clear();
        this.colors.clear();
        this.labels.clear();
        this.labelColors.clear();
        if (barColors.length <= 1) {
            isGradient = false;
        }
        this.isGradientBar = isGradient;
        for (float f : values) {
            this.values.add(Float.valueOf(f));
        }
        int length = values.length - 1;
        for (int i = 0; i < length; i++) {
            if (i < barColors.length) {
                this.colors.add(Integer.valueOf(barColors[i]));
            } else if (!this.isGradientBar) {
                this.colors.add(Integer.valueOf(this.defaultColor));
            }
        }
        int length2 = values.length - 1;
        for (int i2 = 0; i2 < length2; i2++) {
            if (i2 < labelColors.length) {
                this.labelColors.add(Integer.valueOf(labelColors[i2]));
            } else {
                this.labelColors.add(Integer.valueOf(this.defaultColor));
            }
        }
        int length3 = values.length - 1;
        for (int i3 = 0; i3 < length3; i3++) {
            if (i3 < values.length) {
                this.labels.add(labels[i3]);
            } else {
                this.labels.add("");
            }
        }
        invalidate();
    }

    public final void setInitValue(float mInitValue, @NotNull Typeface typeface) {
        this.initValue = mInitValue;
        this.initValueLabelTypeface = typeface;
        invalidate();
    }

    public final void setValues(@NotNull List<Float> values, @NotNull int[] colors, @NotNull String[] labels) {
        float[] fArr = new float[values.size()];
        int size = values.size();
        for (int i = 0; i < size; i++) {
            fArr[i] = values.get(i).floatValue();
        }
        setValues$default(this, fArr, colors, labels, null, false, 24, null);
    }

    public final void setValues(@NotNull List<Float> values, @NotNull int[] colors, @NotNull String[] labels, @NotNull int[] labelColors) {
        float[] fArr = new float[values.size()];
        int size = values.size();
        for (int i = 0; i < size; i++) {
            fArr[i] = values.get(i).floatValue();
        }
        setValues$default(this, fArr, colors, labels, labelColors, false, 16, null);
    }

    @JvmOverloads
    public final void setValues(@NotNull List<Float> values, @NotNull int[] colors, @NotNull String[] labels, @NotNull int[] labelColors, boolean enableIndicatorCircleFilled) {
        float[] fArr = new float[values.size()];
        int size = values.size();
        for (int i = 0; i < size; i++) {
            fArr[i] = values.get(i).floatValue();
        }
        this.enableIndicatorCircleFilled = enableIndicatorCircleFilled;
        setValues$default(this, fArr, colors, labels, labelColors, false, 16, null);
    }

    public final void setValues(@NotNull List<Float> scales) {
        List<Float> list = this.values;
        list.clear();
        list.addAll(scales);
    }
}
