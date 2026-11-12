package com.huami.worldclock.component;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.add.alphabetic.IIndexBarDataHelper;
import com.huami.worldclock.add.alphabetic.IndexBarDataHelperImpl;
import com.huami.worldclock.add.alphabetic.LabelProcess;
import com.huami.worldclock.bean.BaseIndexAlphabeticBean;
import com.huami.worldclock.utils.DensityUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.c;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 c2\u00020\u0001:\u0002cdB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\ba\u0010bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0006J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014J\u001a\u0010#\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\"\u001a\u00020!J\u0010\u0010$\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010)\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0014J\b\u0010*\u001a\u0004\u0018\u00010\rJ\u0010\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010+J\u000e\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.J\u000e\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020!J\u0016\u00106\u001a\u00020\u00002\u000e\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020403J\b\u00108\u001a\u0004\u0018\u000107J\u000e\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u000207R\u0016\u0010<\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010=R \u00105\u001a\f\u0012\u0006\b\u0001\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010=R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010?R\u0016\u0010A\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010?R\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010DR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010?R\u0018\u0010M\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001d\u0010\\\u001a\u00020W8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00140]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006e"}, d2 = {"Lcom/huami/worldclock/component/IndexBar;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "f", "Landroid/view/MotionEvent;", "event", "c", "Lcom/huami/worldclock/component/IndexBar$OnIndexPressedListener;", "mOnIndexPressedListener", "setOnIndexPressedListener", GoogleApiAvailabilityLight.a, "e", "a", "g", "", "tag", "b", "color", "setSelectBgPaint", "setNormalPaintColor", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "index", "", "fromIndexBar", "setSelectIndex", "onTouchEvent", "w", "h", "oldw", "oldh", "onSizeChanged", "getmOnIndexPressedListener", "Landroid/widget/TextView;", "mPressedShowTextView", "setPressedShowTextView", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLayoutManager", "setLayoutManager", "needRealIndex", "setNeedRealIndex", "", "Lcom/huami/worldclock/bean/BaseIndexAlphabeticBean;", "mSourceData", "setSourceData", "Lcom/huami/worldclock/add/alphabetic/IIndexBarDataHelper;", "getDataHelper", "dataHelper", "setDataHelper", "Z", "isNeedRealIndex", "Ljava/util/List;", "mIndexData", LogUtil.I, "mWidth", "mHeight", "mGapHeight", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaint", "mSelectPaint", "i", "mSelectBgPaint", z.j, "mPressedBackground", hl.k, "Lcom/huami/worldclock/add/alphabetic/IIndexBarDataHelper;", "mDataHelper", "l", "Landroid/widget/TextView;", "m", "Ljava/lang/String;", "selectIndex", GoogleApiAvailabilityLight.b, "Landroidx/recyclerview/widget/LinearLayoutManager;", "o", "Lcom/huami/worldclock/component/IndexBar$OnIndexPressedListener;", "", b.r, "Lkotlin/Lazy;", "getRadius", "()F", "radius", "", DTransferConstants.SEARCH_KEY, "[Ljava/lang/String;", "INDEX_STRING", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OnIndexPressedListener", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class IndexBar extends View {

    @NotNull
    private static final String r = IndexBar.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isNeedRealIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private List<String> mIndexData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private List<? extends BaseIndexAlphabeticBean> mSourceData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mGapHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Paint mPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Paint mSelectPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Paint mSelectBgPaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mPressedBackground;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private IIndexBarDataHelper mDataHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private TextView mPressedShowTextView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private String selectIndex;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private LinearLayoutManager mLayoutManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private OnIndexPressedListener mOnIndexPressedListener;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy radius;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String[] INDEX_STRING;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/huami/worldclock/component/IndexBar$OnIndexPressedListener;", "", "", "index", "", "text", "", "onIndexPressed", "onMotionEventEnd", "worldclock_release"}, k = 1, mv = {1, 5, 1})
    public interface OnIndexPressedListener {
        void onIndexPressed(int index, @NotNull String text);

        void onMotionEventEnd();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
            return Float.valueOf(DensityUtils.INSTANCE.dip2px(this.a, 12.0f) / 2.0f);
        }
    }

    @JvmOverloads
    public IndexBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public IndexBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ IndexBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a() {
        this.mGapHeight = ((this.mHeight - getPaddingTop()) - getPaddingBottom()) / this.mIndexData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b(String tag) {
        int size;
        List<? extends BaseIndexAlphabeticBean> list = this.mSourceData;
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(tag) && (size = this.mSourceData.size() - 1) >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String baseIndexTag = this.mSourceData.get(i).getBaseIndexTag();
                if (baseIndexTag == null) {
                    baseIndexTag = "";
                }
                if (Intrinsics.areEqual(tag, baseIndexTag) || m.startsWith$default(baseIndexTag, tag, false, 2, null)) {
                    break;
                }
                if (i2 <= size) {
                    i = i2;
                }
            }
            return i;
        }
        return -1;
    }

    private final void c(MotionEvent event) {
        OnIndexPressedListener onIndexPressedListener;
        int y = (int) ((event.getY() - getPaddingTop()) / this.mGapHeight);
        if (y < 0) {
            y = 0;
        } else if (y >= this.mIndexData.size()) {
            y = this.mIndexData.size() - 1;
        }
        if (y <= -1 || y >= this.mIndexData.size() || (onIndexPressedListener = this.mOnIndexPressedListener) == null) {
            return;
        }
        onIndexPressedListener.onIndexPressed(y, this.mIndexData.get(y));
    }

    private final void d() {
        List<String> listMutableListOf;
        if (this.isNeedRealIndex) {
            listMutableListOf = new ArrayList<>();
        } else {
            String[] strArr = this.INDEX_STRING;
            if (strArr == null) {
                strArr = null;
            }
            listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(strArr, strArr.length));
        }
        this.mIndexData = listMutableListOf;
    }

    private final void e() {
        List<? extends BaseIndexAlphabeticBean> list = this.mSourceData;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            List<String> listSortByAlphabeticIndex = this.mDataHelper.sortByAlphabeticIndex(this.mSourceData, getContext());
            if (listSortByAlphabeticIndex != null) {
                Object[] array = listSortByAlphabeticIndex.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                this.INDEX_STRING = (String[]) array;
            }
        } else {
            this.mDataHelper.sortSourceData(this.mSourceData, getContext());
        }
        String baseIndexTag = this.mSourceData.get(0).getBaseIndexTag();
        if (baseIndexTag == null) {
            baseIndexTag = "";
        }
        this.selectIndex = baseIndexTag;
        if (this.isNeedRealIndex) {
            this.mDataHelper.getSortedIndexData(this.mSourceData, this.mIndexData);
            a();
        }
    }

    private final void f(Context context, AttributeSet attrs, int defStyleAttr) {
        int iApplyDimension = (int) TypedValue.applyDimension(2, 10.0f, getResources().getDisplayMetrics());
        this.mPressedBackground = ContextCompat.getColor(context, R.color.transparent);
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, com.huami.worldclock.R.styleable.IndexBar, defStyleAttr, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        if (indexCount > 0) {
            while (true) {
                int i2 = i + 1;
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == com.huami.worldclock.R.styleable.IndexBar_indexBarTextSize) {
                    iApplyDimension = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iApplyDimension);
                } else if (index == com.huami.worldclock.R.styleable.IndexBar_indexBarPressBackground) {
                    this.mPressedBackground = typedArrayObtainStyledAttributes.getColor(index, this.mPressedBackground);
                }
                if (i2 >= indexCount) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.INDEX_STRING = context.getResources().getStringArray(com.huami.worldclock.R.array.world_clock_alphabet_navigation_table);
        d();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = iApplyDimension;
        paint.setTextSize(f);
        paint.setColor(ContextCompat.getColor(context, com.huami.worldclock.R.color.cl_80000000));
        Unit unit = Unit.INSTANCE;
        this.mPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextSize(f);
        paint2.setColor(-1);
        this.mSelectPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(ContextCompat.getColor(context, com.huami.worldclock.R.color.cl_FF5353));
        this.mSelectBgPaint = paint3;
        this.mDataHelper = new IndexBarDataHelperImpl();
        setOnIndexPressedListener(new OnIndexPressedListener() { // from class: com.huami.worldclock.component.IndexBar$initialization$4

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            private Integer topMargin;

            @Override // com.huami.worldclock.component.IndexBar.OnIndexPressedListener
            public void onIndexPressed(int index2, @NotNull String text) {
                int iB;
                Log.i(IndexBar.r, "onIndexPressed");
                List list = this.b.mIndexData;
                if (list != null) {
                    IndexBar indexBar = this.b;
                    int iIndexOf = list.indexOf(text);
                    indexBar.setSelectIndex(text, true);
                    TextView textView = indexBar.mPressedShowTextView;
                    if (textView != null) {
                        textView.setVisibility(0);
                        textView.setText(text);
                        if ((textView.getLayoutParams() instanceof FrameLayout.LayoutParams) && textView.getLayoutParams() != null) {
                            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            if (this.topMargin == null) {
                                this.topMargin = Integer.valueOf(indexBar.getHeight() / (-2));
                            }
                            layoutParams2.topMargin = ((int) ((iIndexOf + 0.5f) * indexBar.mGapHeight)) + this.topMargin.intValue();
                            textView.setLayoutParams(layoutParams2);
                        }
                    }
                }
                LinearLayoutManager linearLayoutManager = this.b.mLayoutManager;
                if (linearLayoutManager == null || (iB = this.b.b(text)) == -1) {
                    return;
                }
                linearLayoutManager.scrollToPositionWithOffset(iB, 0);
            }

            @Override // com.huami.worldclock.component.IndexBar.OnIndexPressedListener
            public void onMotionEventEnd() {
                TextView textView = this.b.mPressedShowTextView;
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
            }
        });
    }

    private final void g() {
    }

    private final float getRadius() {
        return ((Number) this.radius.getValue()).floatValue();
    }

    private final void setOnIndexPressedListener(OnIndexPressedListener mOnIndexPressedListener) {
        this.mOnIndexPressedListener = mOnIndexPressedListener;
    }

    public static /* synthetic */ void setSelectIndex$default(IndexBar indexBar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        indexBar.setSelectIndex(str, z);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    /* JADX INFO: renamed from: getDataHelper, reason: from getter */
    public final IIndexBarDataHelper getMDataHelper() {
        return this.mDataHelper;
    }

    @Nullable
    /* JADX INFO: renamed from: getmOnIndexPressedListener, reason: from getter */
    public final OnIndexPressedListener getMOnIndexPressedListener() {
        return this.mOnIndexPressedListener;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int paddingTop = getPaddingTop();
        List<String> list = this.mIndexData;
        if (list == null) {
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
            float f = 2;
            int i3 = (int) (((this.mGapHeight - fontMetrics.bottom) - fontMetrics.top) / f);
            if (Intrinsics.areEqual(this.selectIndex, str)) {
                canvas.drawCircle(this.mWidth / 2.0f, (float) (((double) paddingTop) + (((double) this.mGapHeight) * (((double) i) + 0.5d))), getRadius(), this.mSelectBgPaint);
                canvas.drawText(str, (this.mWidth / 2) - (this.mSelectPaint.measureText(str) / f), (this.mGapHeight * i) + paddingTop + i3, this.mSelectPaint);
            } else {
                canvas.drawText(str, (this.mWidth / 2) - (this.mPaint.measureText(str) / f), (this.mGapHeight * i) + paddingTop + i3, this.mPaint);
            }
            i = i2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMax;
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        Rect rect = new Rect();
        List<String> list = this.mIndexData;
        int i = 0;
        if (list == null) {
            iMax = 0;
        } else {
            iMax = 0;
            int iMax2 = 0;
            for (String str : list) {
                this.mPaint.getTextBounds(str, 0, str.length(), rect);
                iMax = Math.max(rect.width(), iMax);
                iMax2 = Math.max(rect.height(), iMax2);
            }
            i = iMax2;
        }
        float f = 2;
        int iMax3 = Math.max(i, c.roundToInt(getRadius() * f));
        int iMax4 = Math.max(iMax, c.roundToInt(getRadius() * f));
        int size3 = (iMax3 * this.mIndexData.size()) + ((iMax3 / 4) * this.mIndexData.size());
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(iMax4, size);
        } else if (mode != 1073741824) {
            size = iMax4;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size3, size2);
        } else if (mode2 != 1073741824) {
            size2 = size3;
        }
        setMeasuredDimension(size + getPaddingStart() + getPaddingEnd(), size2 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mWidth = w;
        this.mHeight = h;
        List<String> list = this.mIndexData;
        if (list == null || list.isEmpty()) {
            return;
        }
        a();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        OnIndexPressedListener onIndexPressedListener;
        Log.i(r, Intrinsics.stringPlus("onTouchEvent : ", event));
        int action = event.getAction();
        if (action == 0) {
            setBackgroundColor(this.mPressedBackground);
            c(event);
        } else if (action == 1) {
            setBackgroundResource(R.color.transparent);
            onIndexPressedListener = this.mOnIndexPressedListener;
            if (onIndexPressedListener != null) {
                onIndexPressedListener.onMotionEventEnd();
            }
        } else if (action == 2) {
            c(event);
        } else if (action != 3) {
            setBackgroundResource(R.color.transparent);
            OnIndexPressedListener onIndexPressedListener2 = this.mOnIndexPressedListener;
            if (onIndexPressedListener2 != null) {
                onIndexPressedListener2.onMotionEventEnd();
            }
        } else {
            setBackgroundResource(R.color.transparent);
            onIndexPressedListener = this.mOnIndexPressedListener;
            if (onIndexPressedListener != null) {
                onIndexPressedListener.onMotionEventEnd();
            }
        }
        return true;
    }

    @NotNull
    public final IndexBar setDataHelper(@NotNull IIndexBarDataHelper dataHelper) {
        this.mDataHelper = dataHelper;
        return this;
    }

    @NotNull
    public final IndexBar setLayoutManager(@NotNull LinearLayoutManager mLayoutManager) {
        this.mLayoutManager = mLayoutManager;
        return this;
    }

    @NotNull
    public final IndexBar setNeedRealIndex(boolean needRealIndex) {
        this.isNeedRealIndex = needRealIndex;
        d();
        return this;
    }

    public final void setNormalPaintColor(@ColorInt int color) {
        Paint paint = this.mPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(color);
    }

    @NotNull
    public final IndexBar setPressedShowTextView(@Nullable TextView mPressedShowTextView) {
        this.mPressedShowTextView = mPressedShowTextView;
        return this;
    }

    public final void setSelectBgPaint(@ColorInt int color) {
        Paint paint = this.mSelectBgPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(color);
    }

    public final void setSelectIndex(@Nullable String index, boolean fromIndexBar) {
        if (!fromIndexBar) {
            LabelProcess labelProcess = LabelProcess.INSTANCE;
            Locale locale = Locale.getDefault();
            if (index == null) {
                index = "";
            }
            index = labelProcess.labelUnifiedProcessing(locale, index);
        }
        if (index == null || Intrinsics.areEqual(index, this.selectIndex)) {
            return;
        }
        this.selectIndex = index;
        invalidate();
    }

    @NotNull
    public final IndexBar setSourceData(@NotNull List<? extends BaseIndexAlphabeticBean> mSourceData) {
        this.mSourceData = mSourceData;
        e();
        return this;
    }

    @JvmOverloads
    public IndexBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectIndex = "";
        this.radius = LazyKt__LazyJVMKt.lazy(new a(context));
        f(context, attributeSet, i);
    }
}
