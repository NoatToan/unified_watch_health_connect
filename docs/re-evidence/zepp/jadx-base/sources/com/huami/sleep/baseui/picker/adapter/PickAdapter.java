package com.huami.sleep.baseui.picker.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import com.huami.sleep.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\u0018\u0000 \u007f2\u00020\u0001:\u0004\u0080\u0001\u007f:B\u007f\b\u0007\u0012\u0006\u0010m\u001a\u00020X\u0012\u0006\u0010n\u001a\u00020\u0004\u0012\u0006\u0010o\u001a\u00020\u0004\u0012\b\u0010p\u001a\u0004\u0018\u00010P\u0012\u0006\u0010q\u001a\u00020\u0004\u0012\u0006\u0010r\u001a\u00020\u0004\u0012\u0006\u0010s\u001a\u00020\u0004\u0012\u0006\u0010t\u001a\u00020\b\u0012\u0006\u0010u\u001a\u00020\u0004\u0012\u0006\u0010v\u001a\u00020\u0004\u0012\u0006\u0010w\u001a\u00020\u0004\u0012\u0006\u0010x\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010y\u001a\u00020\u0004¢\u0006\u0004\bz\u0010{BE\b\u0017\u0012\u0006\u0010m\u001a\u00020X\u0012\u0006\u0010n\u001a\u00020\u0004\u0012\u0006\u0010o\u001a\u00020\u0004\u0012\b\u0010p\u001a\u0004\u0018\u00010P\u0012\u0006\u0010q\u001a\u00020\u0004\u0012\u0006\u0010r\u001a\u00020\u0004\u0012\b\b\u0002\u0010|\u001a\u00020\b¢\u0006\u0004\bz\u0010}B\u0083\u0001\b\u0016\u0012\u0006\u0010m\u001a\u00020X\u0012\u0006\u0010n\u001a\u00020\u0004\u0012\u0006\u0010o\u001a\u00020\u0004\u0012\b\u0010p\u001a\u0004\u0018\u00010P\u0012\u0006\u0010q\u001a\u00020\u0004\u0012\u0006\u0010r\u001a\u00020\u0004\u0012\u0006\u0010s\u001a\u00020\u0004\u0012\u0006\u0010t\u001a\u00020\b\u0012\u0006\u0010u\u001a\u00020\u0004\u0012\u0006\u0010v\u001a\u00020\u0004\u0012\u0006\u0010w\u001a\u00020\u0004\u0012\u0006\u0010x\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010y\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\bz\u0010~J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0010\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004J\b\u0010\u0019\u001a\u00020\u0004H\u0016J$\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0004J\u0010\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0006J\u0010\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0006R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u0016\u0010A\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00108R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00102R\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00104R\u0016\u0010I\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00102R\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00102R\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00102R\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00102R\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u00102R\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u00102R\u0018\u0010b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u00102R\u0018\u0010f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010aR\u0018\u0010h\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010aR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u00104R\u0018\u0010l\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006\u0081\u0001"}, d2 = {"Lcom/huami/sleep/baseui/picker/adapter/PickAdapter;", "Lcom/huami/widget/wheelview/adapters/WheelViewAdapter;", "", "b", "", "position", "", "a", "", "containUnselectedValue", "setContainUnselectedValue", "isContainUnselectedValue", "mode", "setMode", "Typeface", "setTypeface", "thousandsSeparators", "setThousandsSeparators", "Lcom/huami/sleep/baseui/picker/adapter/PickAdapter$AmPmUpdateCallback;", "callback", "setAmPmUpdateCallback", "style", "setUIStyle", "valueGap", "setValueGap", "getItemsCount", "index", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getItem", "getEmptyItem", "Landroid/database/DataSetObserver;", "observer", "registerDataSetObserver", "unregisterDataSetObserver", "isNeedLoop", "getInitLoopBase", "getBASE_BUNDLE", "startValue", "setStartValue", "endValue", "setEndValue", "appendTxtResId", "setAppendTxt", "formatStr", "setFormatStr", "suffixStr", "setSuffixStr", LogUtil.I, "mTypeface", "Z", "bThousandsSeparators", "", "c", "F", "mCenterTextSize", GoogleApiAvailabilityLight.a, "mNormalTextSize", "e", "mNormalLightTextSize", "f", "mNormalColorLight", "g", "mItemHeight", "h", "BASE_BUNDLE", "i", "mInitLoopBase", z.j, "mNeedLoop", hl.k, "mCenterColor", "l", "mNormalColor", "m", "mEnd", GoogleApiAvailabilityLight.b, "mStart", "Lcom/huami/widget/wheelview/WheelView;", "o", "Lcom/huami/widget/wheelview/WheelView;", "mWheelView", "Landroid/view/LayoutInflater;", com.google.android.exoplayer2.text.ttml.b.r, "Landroid/view/LayoutInflater;", "mInflater", "Landroid/content/Context;", DTransferConstants.SEARCH_KEY, "Landroid/content/Context;", "mContext", "r", "mValueGap", SOAP.XMLNS, "mMode", "t", "Ljava/lang/String;", "mUIStyle", "u", "mAppendTxtId", "v", "mFormatStr", "w", "mSuffixStr", "x", "y", "Lcom/huami/sleep/baseui/picker/adapter/PickAdapter$AmPmUpdateCallback;", "mCallback", DbUtils.Const.Table.CONTEXT, "start", "end", "wheelView", "centerColor", "normalColor", "normalColorLight", "neewLoop", "itemHeightDP", "centerTextSizeDp", "normalTextSizeDp", "normalLightTextDp", "typeface", "<init>", "(Landroid/content/Context;IILcom/huami/widget/wheelview/WheelView;IIIZIIIIII)V", "needLoop", "(Landroid/content/Context;IILcom/huami/widget/wheelview/WheelView;IIZ)V", "(Landroid/content/Context;IILcom/huami/widget/wheelview/WheelView;IIIZIIIIIIZ)V", "Companion", "AmPmUpdateCallback", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class PickAdapter implements WheelViewAdapter {
    private static final int A = 16777215;

    @NotNull
    private static final String B = "--";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int INDEX_TODAY = 10000000;
    public static final int MIDDLE_LARGE_NUM = 8388607;

    @NotNull
    public static final String STYLE_MI_UI = "miui";

    @NotNull
    public static final String STYLE_NORMAL = "normal";
    public static final int TYPEFACE_DEFAULT = 0;
    public static final int TYPEFACE_DIN_MED = 1;
    public static final int TYPEFACE_KM = 3;
    public static final int TYPEFACE_PT_DIN = 2;

    @NotNull
    private static final String z = "PickAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mTypeface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean bThousandsSeparators;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mCenterTextSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mNormalTextSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float mNormalLightTextSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mNormalColorLight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float mItemHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int BASE_BUNDLE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mInitLoopBase;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean mNeedLoop;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mCenterColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mNormalColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mEnd;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mStart;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private WheelView mWheelView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private LayoutInflater mInflater;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private Context mContext;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int mValueGap;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int mMode;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    private String mUIStyle;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int mAppendTxtId;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    private String mFormatStr;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private String mSuffixStr;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean isContainUnselectedValue;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private AmPmUpdateCallback mCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/sleep/baseui/picker/adapter/PickAdapter$AmPmUpdateCallback;", "", "", "value", "", "getAmPm", "hour", "getHour", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public interface AmPmUpdateCallback {
        void getAmPm(int value);

        void getHour(int hour);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huami/sleep/baseui/picker/adapter/PickAdapter$Companion;", "", "", "content", "a", "", "INDEX_TODAY", LogUtil.I, "LARGE_NUM", "MIDDLE_LARGE_NUM", "STYLE_MI_UI", "Ljava/lang/String;", "STYLE_NORMAL", "TAG", "TYPEFACE_DEFAULT", "TYPEFACE_DIN_MED", "TYPEFACE_KM", "TYPEFACE_PT_DIN", "UNSELECTED_VALUE", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a(String content) {
            try {
                return new DecimalFormat("#,###").format(Integer.valueOf(content).intValue());
            } catch (Exception unused) {
                return content;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, int i3) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "index = " + this.a + ", realCurIndex =" + this.b + ", pos=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set close";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ PickAdapter b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, PickAdapter pickAdapter) {
            super(0);
            this.a = i;
            this.b = pickAdapter;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setEnd: " + this.a + " base bundle = " + this.b.BASE_BUNDLE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"com/huami/sleep/baseui/picker/adapter/PickAdapter$d", "", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "b", "(Landroid/widget/TextView;)V", "content", "<init>", "(Lcom/huami/sleep/baseui/picker/adapter/PickAdapter;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public final class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private TextView content;

        public d() {
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getContent() {
            return this.content;
        }

        public final void b(@Nullable TextView textView) {
            this.content = textView;
        }
    }

    @JvmOverloads
    public PickAdapter(@NotNull Context context, int i, int i2, @Nullable WheelView wheelView, int i3, int i4) {
        this(context, i, i2, wheelView, i3, i4, false, 64, null);
    }

    @JvmOverloads
    public PickAdapter(@NotNull Context context, int i, int i2, @Nullable WheelView wheelView, int i3, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9) {
        this(context, i, i2, wheelView, i3, i4, i5, z2, i6, i7, i8, i9, 0, 0, 12288, null);
    }

    @JvmOverloads
    public PickAdapter(@NotNull Context context, int i, int i2, @Nullable WheelView wheelView, int i3, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9, int i10) {
        this(context, i, i2, wheelView, i3, i4, i5, z2, i6, i7, i8, i9, i10, 0, 8192, null);
    }

    @JvmOverloads
    public PickAdapter(@NotNull Context context, int i, int i2, @Nullable WheelView wheelView, int i3, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.mTypeface = 3;
        this.mValueGap = 1;
        this.mContext = context;
        this.mStart = i;
        this.mEnd = i2;
        this.mWheelView = wheelView;
        this.mInflater = LayoutInflater.from(context);
        this.mCenterColor = i3;
        this.mNormalColor = i4;
        this.mNormalColorLight = i5;
        this.mNeedLoop = z2;
        this.mItemHeight = TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
        this.mCenterTextSize = i7;
        this.mNormalTextSize = i8;
        this.mNormalLightTextSize = i9;
        setValueGap(i10);
        b();
        this.mTypeface = i11;
    }

    private final String a(int position) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, position - 10000000);
        StringBuilder sb = new StringBuilder();
        sb.append(TimeUtils.formatDate_no_y(this.mContext, calendar.getTime(), false));
        sb.append(" ");
        if (position == 10000000) {
            return this.mContext.getString(R.string.today);
        }
        switch (calendar.get(7)) {
            case 1:
                sb.append(this.mContext.getString(R.string.sunday));
                break;
            case 2:
                sb.append(this.mContext.getString(R.string.monday));
                break;
            case 3:
                sb.append(this.mContext.getString(R.string.tuesday));
                break;
            case 4:
                sb.append(this.mContext.getString(R.string.wednesday));
                break;
            case 5:
                sb.append(this.mContext.getString(R.string.thursday));
                break;
            case 6:
                sb.append(this.mContext.getString(R.string.friday));
                break;
            case 7:
                sb.append(this.mContext.getString(R.string.saturday));
                break;
            default:
                return null;
        }
        return sb.toString();
    }

    private final void b() {
        int i = this.isContainUnselectedValue ? (this.mEnd - this.mStart) + 2 : (this.mEnd - this.mStart) + 1;
        this.BASE_BUNDLE = i;
        this.mInitLoopBase = i * (8388607 / i);
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return this.BASE_BUNDLE;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    @Nullable
    public View getEmptyItem(@Nullable View convertView, @NotNull ViewGroup parent) {
        return null;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: getInitLoopBase, reason: from getter */
    public int getMInitLoopBase() {
        return this.mInitLoopBase;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    @Nullable
    public View getItem(int index, @Nullable View convertView, @NotNull ViewGroup parent) {
        RelativeLayout relativeLayout;
        String strA;
        AmPmUpdateCallback amPmUpdateCallback;
        AmPmUpdateCallback amPmUpdateCallback2;
        if (convertView != null) {
            relativeLayout = (RelativeLayout) convertView;
        } else {
            int i = this.mTypeface;
            if (i == 1) {
                View viewInflate = this.mInflater.inflate(R.layout.wheel_item_din_med, parent, false);
                Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                relativeLayout = (RelativeLayout) viewInflate;
            } else if (i == 2) {
                View viewInflate2 = this.mInflater.inflate(R.layout.wheel_item_pt_din, parent, false);
                Objects.requireNonNull(viewInflate2, "null cannot be cast to non-null type android.widget.RelativeLayout");
                relativeLayout = (RelativeLayout) viewInflate2;
            } else if (i != 3) {
                View viewInflate3 = this.mInflater.inflate(R.layout.wheel_item_normal, parent, false);
                Objects.requireNonNull(viewInflate3, "null cannot be cast to non-null type android.widget.RelativeLayout");
                relativeLayout = (RelativeLayout) viewInflate3;
            } else {
                View viewInflate4 = this.mInflater.inflate(R.layout.wheel_item_km, parent, false);
                Objects.requireNonNull(viewInflate4, "null cannot be cast to non-null type android.widget.RelativeLayout");
                relativeLayout = (RelativeLayout) viewInflate4;
            }
        }
        d dVar = new d();
        dVar.b((TextView) relativeLayout.findViewById(R.id.content_txt));
        dVar.getContent().getLayoutParams().height = (int) this.mItemHeight;
        relativeLayout.setTag(dVar);
        int i2 = index % this.BASE_BUNDLE;
        TextView content = dVar.getContent();
        if (TextUtils.isEmpty(this.mFormatStr)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strA = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf((this.mStart + i2) * this.mValueGap)}, 1));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            strA = String.format(this.mFormatStr, Arrays.copyOf(new Object[]{Integer.valueOf((this.mStart + i2) * this.mValueGap)}, 1));
        }
        int realCurrentItem = this.mWheelView.getRealCurrentItem();
        HMLog.debug(z, new a(index, realCurrentItem, i2));
        int i3 = this.mMode;
        if (i3 == 9) {
            int i4 = this.mStart + i2;
            if (i4 < 0) {
                i4 += 24;
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            strA = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
        } else if (i3 == 32) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            strA = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf((this.mStart + i2) * this.mValueGap)}, 1)) + this.mContext.getString(this.mAppendTxtId);
        } else if (i3 == 24) {
            strA = a(i2);
        } else if (i3 != 25) {
            switch (i3) {
                case 16:
                    int i5 = this.mStart + i2;
                    if (i5 == 0) {
                        strA = "12";
                    } else if (i5 > 12) {
                        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                        strA = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i5 - 12)}, 1));
                    }
                    if (realCurrentItem == index && (amPmUpdateCallback = this.mCallback) != null) {
                        amPmUpdateCallback.getHour(i5);
                    }
                    break;
                case 17:
                    strA = i2 == 0 ? this.mContext.getString(R.string.am) : this.mContext.getString(R.string.pm);
                    if (index == realCurrentItem && (amPmUpdateCallback2 = this.mCallback) != null) {
                        amPmUpdateCallback2.getAmPm(i2);
                    }
                    break;
                case 18:
                    if (index != 0) {
                        StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                        strA = String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf((this.mStart + i2) * this.mValueGap)}, 1)) + this.mContext.getString(this.mAppendTxtId);
                    } else {
                        HMLog.debug(z, b.a);
                        strA = this.mContext.getString(R.string.state_close);
                    }
                    break;
                case 19:
                    NumberFormat numberInstance = NumberFormat.getNumberInstance();
                    numberInstance.setMaximumIntegerDigits(0);
                    numberInstance.setMaximumFractionDigits(1);
                    numberInstance.setMinimumFractionDigits(1);
                    strA = numberInstance.format(((double) (this.mStart + i2)) / 10.0d);
                    break;
            }
        } else {
            StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
            strA = String.format(Locale.getDefault(), ":%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.mStart + i2)}, 1));
        }
        if (this.bThousandsSeparators) {
            strA = INSTANCE.a(strA);
        }
        if (!TextUtils.isEmpty(this.mSuffixStr)) {
            strA = strA + this.mSuffixStr;
        }
        if (this.isContainUnselectedValue && i2 == this.BASE_BUNDLE - 1) {
            strA = "--";
        }
        content.setText(strA);
        int i6 = (int) this.mCenterTextSize;
        if (index == realCurrentItem) {
            content.setTextColor(this.mCenterColor);
        } else if (index == realCurrentItem - 1 || index == realCurrentItem + 1) {
            i6 = (int) this.mNormalTextSize;
            content.setTextColor(this.mNormalColor);
        } else {
            i6 = (int) this.mNormalLightTextSize;
            content.setTextColor(this.mNormalColorLight);
        }
        content.setTextSize(i6);
        return relativeLayout;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        if (this.mNeedLoop) {
            return 16777215;
        }
        return this.BASE_BUNDLE;
    }

    /* JADX INFO: renamed from: isContainUnselectedValue, reason: from getter */
    public final boolean getIsContainUnselectedValue() {
        return this.isContainUnselectedValue;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: isNeedLoop, reason: from getter */
    public boolean getMNeedLoop() {
        return this.mNeedLoop;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void registerDataSetObserver(@NotNull DataSetObserver observer) {
    }

    public final void setAmPmUpdateCallback(@NotNull AmPmUpdateCallback callback) {
        this.mCallback = callback;
    }

    public final void setAppendTxt(int appendTxtResId) {
        this.mAppendTxtId = appendTxtResId;
    }

    public final void setContainUnselectedValue(boolean containUnselectedValue) {
        this.isContainUnselectedValue = containUnselectedValue;
        b();
    }

    public final void setEndValue(int endValue) {
        this.mEnd = endValue;
        b();
        HMLog.debug("Height", new c(endValue, this));
    }

    public final void setFormatStr(@Nullable String formatStr) {
        this.mFormatStr = formatStr;
    }

    public final void setMode(int mode) {
        this.mMode = mode;
    }

    public final void setStartValue(int startValue) {
        this.mStart = startValue;
    }

    public final void setSuffixStr(@Nullable String suffixStr) {
        this.mSuffixStr = suffixStr;
    }

    public final void setThousandsSeparators(boolean thousandsSeparators) {
        this.bThousandsSeparators = thousandsSeparators;
    }

    public final void setTypeface(int Typeface) {
        this.mTypeface = Typeface;
    }

    public final void setUIStyle(@Nullable String style) {
        this.mUIStyle = style;
    }

    public final void setValueGap(int valueGap) {
        this.mValueGap = valueGap;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public void unregisterDataSetObserver(@NotNull DataSetObserver observer) {
    }

    public /* synthetic */ PickAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, i2, wheelView, i3, i4, i5, z2, i6, i7, i8, i9, (i12 & 4096) != 0 ? 1 : i10, (i12 & 8192) != 0 ? 3 : i11);
    }

    public /* synthetic */ PickAdapter(Context context, int i, int i2, WheelView wheelView, int i3, int i4, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, i2, wheelView, i3, i4, (i5 & 64) != 0 ? false : z2);
    }

    @JvmOverloads
    public PickAdapter(@NotNull Context context, int i, int i2, @Nullable WheelView wheelView, int i3, int i4, boolean z2) {
        this(context, i, i2, wheelView, i3, i4, -2003199591, z2, 32, 12, 11, 9, 1, 0, 8192, null);
    }

    public PickAdapter(@NotNull Context context, int i, int i2, @Nullable WheelView wheelView, int i3, int i4, int i5, boolean z2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z3) {
        this(context, i, i2, wheelView, i3, i4, i5, z2, i6, i7, i8, i9, i10, i11);
        this.isContainUnselectedValue = z3;
    }
}
