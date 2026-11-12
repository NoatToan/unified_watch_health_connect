package com.huami.moving.sport.ui.view.bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.sport.ui.R;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b)\u0010+B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b)\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\"\u0010\t\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006-"}, d2 = {"Lcom/huami/moving/sport/ui/view/bar/BodyPositionView;", "Landroid/widget/FrameLayout;", "", "b", "a", "", "", "mainPositions", "subPositions", "setPositions", LogUtil.I, "bodyDrawble", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "mParentBody", "c", "Landroid/widget/FrameLayout;", "mPositionsBody", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "mMainPositions", "e", "mSubPositions", "", "f", "Z", "mIsBcckBody", "g", "mDrawPostionList", "", "h", "[I", "bodyItemList", "i", "backBodyItemList", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BodyPositionView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int bodyDrawble;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ImageView mParentBody;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private FrameLayout mPositionsBody;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<Integer> mMainPositions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<Integer> mSubPositions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean mIsBcckBody;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private List<Integer> mDrawPostionList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final int[] bodyItemList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final int[] backBodyItemList;

    public BodyPositionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMainPositions = new ArrayList();
        this.mSubPositions = new ArrayList();
        this.mDrawPostionList = new ArrayList();
        this.bodyItemList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 32, 33, 46, 47, 48, 49};
        this.backBodyItemList = new int[]{19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
        LayoutInflater.from(context).inflate(R.layout.moving_ui_body_position, this);
        this.mParentBody = (ImageView) findViewById(R.id.moving_ui_body_parent);
        this.mPositionsBody = (FrameLayout) findViewById(R.id.moving_ui_body_positions_parent);
    }

    private final void a() {
        FrameLayout frameLayout = this.mPositionsBody;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        Iterator<Integer> it2 = this.mDrawPostionList.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(getResources().getIdentifier("moving_ui_body_" + iIntValue, "drawable", getContext().getPackageName()));
            if (this.mMainPositions.contains(Integer.valueOf(iIntValue))) {
                imageView.setColorFilter(ContextCompat.getColor(getContext(), R.color.p3));
            } else if (this.mSubPositions.contains(Integer.valueOf(iIntValue))) {
                imageView.setColorFilter(ContextCompat.getColor(getContext(), R.color.s33));
            }
            imageView.setLayoutParams(layoutParams);
            FrameLayout frameLayout2 = this.mPositionsBody;
            if (frameLayout2 != null) {
                frameLayout2.addView(imageView);
            }
        }
    }

    private final void b() {
        ImageView imageView = this.mParentBody;
        if (imageView != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(getContext(), this.bodyDrawble));
        }
        this.mDrawPostionList = ArraysKt___ArraysKt.toMutableList(this.bodyItemList);
        if (this.mIsBcckBody) {
            this.mDrawPostionList = ArraysKt___ArraysKt.toMutableList(this.backBodyItemList);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setPositions(@NotNull List<Integer> mainPositions, @NotNull List<Integer> subPositions) {
        this.mMainPositions = TypeIntrinsics.asMutableList(mainPositions);
        this.mSubPositions = TypeIntrinsics.asMutableList(subPositions);
        a();
    }

    public BodyPositionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        this(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BodyPositionView, 0, 0);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BodyPositionView_moving_ui_is_back_body, false);
            this.mIsBcckBody = z;
            if (z) {
                i = R.drawable.moving_ui_body_back_parent;
            } else {
                i = R.drawable.moving_ui_body_parent;
            }
            this.bodyDrawble = i;
            typedArrayObtainStyledAttributes.recycle();
        }
        b();
    }

    public BodyPositionView(@NotNull Context context) {
        this(context, null);
    }
}
