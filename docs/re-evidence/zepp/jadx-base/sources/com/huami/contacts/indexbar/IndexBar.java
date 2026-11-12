package com.huami.contacts.indexbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.contacts.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0002>?B\u0013\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b9\u0010:B\u001d\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b9\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014J(\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0014J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u0010\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0016\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0006R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00106\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006@"}, d2 = {"Lcom/huami/contacts/indexbar/IndexBar;", "Landroid/view/View;", "", "c", "", "text", "", "b", "a", "", "Lcom/huami/contacts/indexbar/IndexBean;", "index", "setIndex", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "Lcom/huami/contacts/indexbar/IndexBar$OnIndexChangedListener;", "onIndexChangedListener", "setOnIndexChangedListener", "Landroid/widget/TextView;", "textView", "setSelectedIndexTextView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, Constant.PAI_KEY_DAILY_PAI, "dp2px", "", "Ljava/util/List;", "indexs", LogUtil.I, "mWidth", "mHeight", GoogleApiAvailabilityLight.a, "F", "mCellHeight", "e", "mMarginTop", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Paint;", "mPaint", "g", "mInvalidLetterPaint", "Lcom/huami/contacts/indexbar/IndexBar$OnIndexChangedListener;", "mOnIndexChangedListener", "i", "Landroid/widget/TextView;", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "OnIndexChangedListener", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class IndexBar extends View {

    @ColorRes
    private static int k = R.color.s1;

    @ColorRes
    private static int l = R.color.s3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<IndexBean> indexs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mCellHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float mMarginTop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Paint mPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Paint mInvalidLetterPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private OnIndexChangedListener mOnIndexChangedListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private TextView textView;
    private HashMap j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/contacts/indexbar/IndexBar$OnIndexChangedListener;", "", "Lcom/huami/contacts/indexbar/IndexBean;", "index", "", "onIndexChanged", "contacts_release"}, k = 1, mv = {1, 4, 1})
    public interface OnIndexChangedListener {
        void onIndexChanged(@NotNull IndexBean index);
    }

    public IndexBar(@Nullable Context context) {
        super(context);
        this.indexs = new ArrayList();
        this.mPaint = new Paint();
        this.mInvalidLetterPaint = new Paint();
        c();
    }

    private final float a(String text) {
        Rect rect = new Rect();
        this.mPaint.getTextBounds(text, 0, text.length(), rect);
        return rect.height();
    }

    private final float b(String text) {
        Rect rect = new Rect();
        this.mPaint.getTextBounds(text, 0, text.length(), rect);
        return rect.width();
    }

    private final void c() {
        this.mPaint.setColor(ContextCompat.getColor(getContext(), k));
        this.mPaint.setTextSize(dp2px(getContext(), 10.0f));
        this.mPaint.setAntiAlias(true);
        this.mInvalidLetterPaint.setColor(ContextCompat.getColor(getContext(), l));
        this.mInvalidLetterPaint.setTextSize(dp2px(getContext(), 10.0f));
        this.mInvalidLetterPaint.setAntiAlias(true);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.j;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.j == null) {
            this.j = new HashMap();
        }
        View view = (View) this.j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.j.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final float dp2px(@NotNull Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        if (this.indexs.isEmpty()) {
            return;
        }
        int size = this.indexs.size();
        for (int i = 0; i < size; i++) {
            IndexBean indexBean = this.indexs.get(i);
            String str = indexBean.getStr();
            float f = 2;
            canvas.drawText(str, (this.mWidth / 2) - (b(str) / f), (this.mCellHeight / f) + (a(str) / f) + (this.mCellHeight * i) + this.mMarginTop, indexBean.getValid() ? this.mPaint : this.mInvalidLetterPaint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.mHeight = measuredHeight;
        float f = (measuredHeight * 1.0f) / 27;
        this.mCellHeight = f;
        this.mMarginTop = (measuredHeight - (f * this.indexs.size())) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010  */
    /* JADX WARN: Code duplicated, block: B:12:0x0014  */
    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        int y;
        IndexBean indexBean;
        TextView textView;
        TextView textView2;
        OnIndexChangedListener onIndexChangedListener;
        TextView textView3;
        int action = event.getAction();
        if (action == 0) {
            y = (int) ((event.getY() - this.mMarginTop) / this.mCellHeight);
            if (y >= 0 && y < this.indexs.size()) {
                indexBean = this.indexs.get(y);
                if (indexBean.getValid()) {
                    textView = this.textView;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    textView2 = this.textView;
                    if (textView2 != null) {
                        textView2.setText(indexBean.getStr());
                    }
                    onIndexChangedListener = this.mOnIndexChangedListener;
                    if (onIndexChangedListener != null) {
                        onIndexChangedListener.onIndexChanged(indexBean);
                    }
                }
            }
        } else if (action == 1) {
            textView3 = this.textView;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else if (action == 2) {
            y = (int) ((event.getY() - this.mMarginTop) / this.mCellHeight);
            if (y >= 0) {
                indexBean = this.indexs.get(y);
                if (indexBean.getValid()) {
                    textView = this.textView;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    textView2 = this.textView;
                    if (textView2 != null) {
                        textView2.setText(indexBean.getStr());
                    }
                    onIndexChangedListener = this.mOnIndexChangedListener;
                    if (onIndexChangedListener != null) {
                        onIndexChangedListener.onIndexChanged(indexBean);
                    }
                }
            }
        } else if (action == 3) {
            textView3 = this.textView;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        return true;
    }

    public final void setIndex(@NotNull List<IndexBean> index) {
        this.indexs.clear();
        this.indexs.addAll(index);
        this.mMarginTop = (this.mHeight - (this.mCellHeight * this.indexs.size())) / 2;
        invalidate();
    }

    public final void setOnIndexChangedListener(@Nullable OnIndexChangedListener onIndexChangedListener) {
        this.mOnIndexChangedListener = onIndexChangedListener;
    }

    public final void setSelectedIndexTextView(@Nullable TextView textView) {
        this.textView = textView;
    }

    public IndexBar(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.indexs = new ArrayList();
        this.mPaint = new Paint();
        this.mInvalidLetterPaint = new Paint();
        c();
    }
}
