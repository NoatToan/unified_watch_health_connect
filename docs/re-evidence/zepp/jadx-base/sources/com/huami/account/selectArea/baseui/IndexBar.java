package com.huami.account.selectArea.baseui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u000f\u0018\u0000 Z2\u00020\u0001:\u0003Z[\\B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bX\u0010YJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0003J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010!\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0014J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0014J\u0010\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010*\u001a\u00020\u00002\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'H\u0007J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010.R \u0010)\u001a\f\u0012\u0006\b\u0001\u0012\u00020(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0016\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00105R\u0018\u00108\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0018\u00109\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0016\u0010;\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00100R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010M\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000f0N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006]"}, d2 = {"Lcom/huami/account/selectArea/baseui/IndexBar;", "Landroid/view/View;", "", "a", "Landroid/view/MotionEvent;", "event", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "f", "e", "", "tag", "c", "Lcom/huami/account/selectArea/baseui/IndexBar$OnIndexPressedListener;", "mOnIndexPressedListener", "setOnIndexPressedListener", "", "dpValue", "b", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "onTouchEvent", "w", "h", "oldw", "oldh", "onSizeChanged", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "index", "setSelectIndex", "", "Lcom/huami/account/selectArea/baseui/BaseIndexBean;", "mSourceData", "setSourceData", "Lcom/huami/account/selectArea/baseui/IndexBar$OnIndexChangeListener;", "mOnIndexChangeListener", "setOnIndexChangeListener", "Ljava/util/List;", "mIndexData", LogUtil.I, "mWidth", "mHeight", "mGapHeight", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaint", "g", "mSelectPaint", "mSelectBgPaint", "i", "mPressedBackground", "Lcom/huami/account/selectArea/baseui/IndexBarDataHelper;", z.j, "Lcom/huami/account/selectArea/baseui/IndexBarDataHelper;", "mDataHelper", "Landroid/widget/TextView;", hl.k, "Landroid/widget/TextView;", "mPressedShowTextView", "l", "Ljava/lang/String;", "selectIndex", "m", "Lcom/huami/account/selectArea/baseui/IndexBar$OnIndexPressedListener;", GoogleApiAvailabilityLight.b, "Lkotlin/Lazy;", "getRadius", "()F", "radius", "", "o", "[Ljava/lang/String;", "indexList", b.r, "Lcom/huami/account/selectArea/baseui/IndexBar$OnIndexChangeListener;", "onIndexChangeListener", DTransferConstants.SEARCH_KEY, "Z", "showSelected", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OnIndexChangeListener", "OnIndexPressedListener", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class IndexBar extends View {
    private static final String r = IndexBar.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<String> mIndexData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private List<? extends BaseIndexBean> mSourceData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mGapHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Paint mPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Paint mSelectPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Paint mSelectBgPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mPressedBackground;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private IndexBarDataHelper mDataHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private TextView mPressedShowTextView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private String selectIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private OnIndexPressedListener mOnIndexPressedListener;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy radius;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String[] indexList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private OnIndexChangeListener onIndexChangeListener;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean showSelected;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/account/selectArea/baseui/IndexBar$OnIndexChangeListener;", "", "", "position", "", "onChange", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public interface OnIndexChangeListener {
        void onChange(int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/huami/account/selectArea/baseui/IndexBar$OnIndexPressedListener;", "", "", "index", "", "text", "", "onIndexPressed", "onMotionEventEnd", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public interface OnIndexPressedListener {
        void onIndexPressed(int index, @NotNull String text);

        void onMotionEventEnd();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.b = context;
        }

        public final float a() {
            return IndexBar.this.b(this.b, 12.0f) / 2.0f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
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
    public final int b(Context context, float dpValue) {
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c(String tag) {
        int size;
        List<? extends BaseIndexBean> list = this.mSourceData;
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

    private final void d(MotionEvent event) {
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

    @RequiresApi(24)
    private final void e() {
        List<? extends BaseIndexBean> list = this.mSourceData;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<String> listSortByAlphabeticIndex = this.mDataHelper.sortByAlphabeticIndex(this.mSourceData, getContext());
        if (listSortByAlphabeticIndex != null) {
            Object[] array = listSortByAlphabeticIndex.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            this.indexList = (String[]) array;
        }
        String baseIndexTag = this.mSourceData.get(0).getBaseIndexTag();
        if (baseIndexTag == null) {
            baseIndexTag = "";
        }
        this.selectIndex = baseIndexTag;
        this.mDataHelper.getSortedIndexData(this.mSourceData, this.mIndexData);
        a();
    }

    private final void f(Context context, AttributeSet attrs, int defStyleAttr) {
        int iApplyDimension = (int) TypedValue.applyDimension(2, 10.0f, getResources().getDisplayMetrics());
        this.mPressedBackground = ContextCompat.getColor(context, R.color.transparent);
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, com.huami.account.ui.R.styleable.IndexBar, defStyleAttr, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        if (indexCount > 0) {
            while (true) {
                int i2 = i + 1;
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == com.huami.account.ui.R.styleable.IndexBar_indexBarTextSize) {
                    iApplyDimension = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iApplyDimension);
                } else if (index == com.huami.account.ui.R.styleable.IndexBar_indexBarPressBackground) {
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
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = iApplyDimension;
        paint.setTextSize(f);
        paint.setColor(ContextCompat.getColor(context, com.huami.account.ui.R.color.s2));
        Unit unit = Unit.INSTANCE;
        this.mPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextSize(f);
        paint2.setColor(ContextCompat.getColor(context, com.huami.account.ui.R.color.s38));
        this.mSelectPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(ContextCompat.getColor(context, com.huami.account.ui.R.color.s1));
        this.mSelectBgPaint = paint3;
        this.mDataHelper = new IndexBarDataHelper();
        setOnIndexPressedListener(new OnIndexPressedListener() { // from class: com.huami.account.selectArea.baseui.IndexBar$initialization$4

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            private Integer topMargin;

            @Override // com.huami.account.selectArea.baseui.IndexBar.OnIndexPressedListener
            public void onIndexPressed(int index2, @NotNull String text) {
                Log.i(IndexBar.r, "onIndexPressed");
                List list = this.b.mIndexData;
                IndexBar indexBar = this.b;
                int iIndexOf = list.indexOf(text);
                indexBar.setSelectIndex(text);
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
                int iC = this.b.c(text);
                IndexBar.OnIndexChangeListener onIndexChangeListener = this.b.onIndexChangeListener;
                if (onIndexChangeListener == null) {
                    return;
                }
                onIndexChangeListener.onChange(iC);
            }

            @Override // com.huami.account.selectArea.baseui.IndexBar.OnIndexPressedListener
            public void onMotionEventEnd() {
                TextView textView = this.b.mPressedShowTextView;
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
            }
        });
    }

    private final float getRadius() {
        return ((Number) this.radius.getValue()).floatValue();
    }

    private final void setOnIndexPressedListener(OnIndexPressedListener mOnIndexPressedListener) {
        this.mOnIndexPressedListener = mOnIndexPressedListener;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int paddingTop = getPaddingTop();
        int i = 0;
        for (Object obj : this.mIndexData) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
            float f = 2;
            int i3 = (int) (((this.mGapHeight - fontMetrics.bottom) - fontMetrics.top) / f);
            if (Intrinsics.areEqual(this.selectIndex, str) && this.showSelected) {
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
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        Rect rect = new Rect();
        int iMax = 0;
        int iMax2 = 0;
        for (String str : this.mIndexData) {
            this.mPaint.getTextBounds(str, 0, str.length(), rect);
            iMax2 = Math.max(rect.width(), iMax2);
            iMax = Math.max(rect.height(), iMax);
        }
        float f = 2;
        int iMax3 = Math.max(iMax, c.roundToInt(getRadius() * f));
        int iMax4 = Math.max(iMax2, c.roundToInt(getRadius() * f));
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
        if (this.mIndexData.isEmpty()) {
            return;
        }
        a();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        OnIndexPressedListener onIndexPressedListener;
        Log.i(r, "onTouchEvent : " + event);
        int action = event.getAction();
        if (action == 0) {
            setBackgroundColor(this.mPressedBackground);
            d(event);
        } else if (action == 1) {
            setBackgroundResource(R.color.transparent);
            onIndexPressedListener = this.mOnIndexPressedListener;
            if (onIndexPressedListener != null) {
                onIndexPressedListener.onMotionEventEnd();
            }
        } else if (action == 2) {
            d(event);
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

    public final void setOnIndexChangeListener(@NotNull OnIndexChangeListener mOnIndexChangeListener) {
        this.onIndexChangeListener = mOnIndexChangeListener;
    }

    public final void setSelectIndex(@Nullable String index) {
        if (index == null || Intrinsics.areEqual(index, this.selectIndex)) {
            return;
        }
        this.selectIndex = index;
        invalidate();
    }

    @RequiresApi(24)
    @NotNull
    public final IndexBar setSourceData(@NotNull List<? extends BaseIndexBean> mSourceData) {
        this.mSourceData = mSourceData;
        e();
        return this;
    }

    @JvmOverloads
    public IndexBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIndexData = new ArrayList();
        this.selectIndex = "";
        this.radius = LazyKt__LazyJVMKt.lazy(new a(context));
        f(context, attributeSet, i);
    }
}
