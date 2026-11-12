package com.xiaomi.hm.health.device.earbud.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/view/EarbudImageView;", "Landroid/widget/LinearLayout;", "", "isConnect", "", "setLeftConnect", "setRightConnect", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "mLeftImg", "b", "mRightImg", "c", "mBoxImg", "value", GoogleApiAvailabilityLight.a, "Z", "getMHasBox", "()Z", "setMHasBox", "(Z)V", "mHasBox", "e", "getMBigStyle", "setMBigStyle", "mBigStyle", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudImageView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ImageView mLeftImg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ImageView mRightImg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ImageView mBoxImg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean mHasBox;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean mBigStyle;

    @JvmOverloads
    public EarbudImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public EarbudImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EarbudImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final boolean getMBigStyle() {
        return this.mBigStyle;
    }

    public final boolean getMHasBox() {
        return this.mHasBox;
    }

    public final void setLeftConnect(boolean isConnect) {
        this.mLeftImg.setAlpha(isConnect ? 1.0f : 0.5f);
    }

    public final void setMBigStyle(boolean z) {
        this.mBigStyle = z;
        if (z) {
            this.mLeftImg.setImageResource(R.drawable.img_earbud_left_big);
            this.mRightImg.setImageResource(R.drawable.img_earbud_right_big);
        } else {
            this.mLeftImg.setImageResource(R.drawable.img_earbud_left);
            this.mRightImg.setImageResource(R.drawable.img_earbud_right);
        }
    }

    public final void setMHasBox(boolean z) {
        this.mHasBox = z;
        this.mBoxImg.setVisibility(z ? 0 : 8);
    }

    public final void setRightConnect(boolean isConnect) {
        this.mRightImg.setAlpha(isConnect ? 1.0f : 0.5f);
    }

    @JvmOverloads
    public EarbudImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHasBox = true;
        View.inflate(context, R.layout.view_earbud_image, this);
        this.mLeftImg = (ImageView) findViewById(R.id.img_left);
        this.mRightImg = (ImageView) findViewById(R.id.img_right);
        this.mBoxImg = (ImageView) findViewById(R.id.img_box);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EarbudImageView);
        setMHasBox(typedArrayObtainStyledAttributes.getBoolean(R.styleable.EarbudImageView_hasBox, true));
        setMBigStyle(typedArrayObtainStyledAttributes.getBoolean(R.styleable.EarbudImageView_bigStyle, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
