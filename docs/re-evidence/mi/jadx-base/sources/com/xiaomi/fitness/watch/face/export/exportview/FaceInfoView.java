package com.xiaomi.fitness.watch.face.export.exportview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import defpackage.jki;
import defpackage.k47;
import defpackage.ni4;
import defpackage.ooi;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\rJ\u0010\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "mDeviceScaleFactor", "", "mCurrentBorder", "Landroid/graphics/drawable/GradientDrawable;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "getW", "getH", "getRadius", "", "setDeviceScaleFactor", "factor", "tintColor", "colorStr", "getValidColor", "color", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FaceInfoView extends FaceIcon {

    @NotNull
    private final String TAG;

    @Nullable
    private final GradientDrawable mCurrentBorder;
    private double mDeviceScaleFactor;

    @JvmOverloads
    public FaceInfoView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    private final int getValidColor(String color) {
        try {
            return Color.parseColor(color);
        } catch (Exception unused) {
            Logger.e(this.TAG, "getValidColor error ");
            return 0;
        }
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public int getH() {
        float f;
        if (this.isDeviceTab) {
            return (int) (((double) FaceIcon.INFO_HEIGHT) * this.mDeviceScaleFactor * 0.984d);
        }
        float f2 = 0.85f;
        if (this.mIsAodIcon) {
            f = FaceIcon.INFO_HEIGHT * 0.85f;
            f2 = 0.7f;
        } else {
            if (this.isPhotoPicker) {
                return ExtUtilsKt.getDp(Float.valueOf(60.0f));
            }
            int i = this.location;
            if (i == FaceIcon.TYPE_ENTRANCE) {
                return ExtUtilsKt.getDp(Float.valueOf(FaceSizeConstant.getFaceEntranceDimension$default(FaceSizeConstant.INSTANCE, !SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand(), 0, 2, null).getHeight()));
            }
            if (i == FaceIcon.TYPE_MARKET_COMMON_ITEM) {
                return ExtUtilsKt.getDp(Float.valueOf(FaceSizeConstant.INSTANCE.getFaceMarketCommonDimension(this.faceType).getWidth() * FaceIcon.SIZE_RATE));
            }
            if (i == FaceIcon.TYPE_MARKET_PHOTO_ITEM) {
                return ExtUtilsKt.getDp(Float.valueOf(FaceSizeConstant.INSTANCE.getFaceMarketPhotoDimension(this.faceType).getWidth() * FaceIcon.SIZE_RATE));
            }
            if (i == FaceIcon.TYPE_MARKET_CATEGORY_ITEM) {
                return ExtUtilsKt.getDp(Float.valueOf(FaceSizeConstant.INSTANCE.getFaceCategoryDimension(this.faceType).getWidth() * FaceIcon.SIZE_RATE));
            }
            f = FaceIcon.INFO_HEIGHT;
        }
        return (int) (f * f2);
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public float getRadius() {
        if (this.isDeviceTab) {
            return (float) (((double) FaceIcon.INFO_RADIUS) * this.mDeviceScaleFactor);
        }
        return this.mIsAodIcon ? FaceIcon.INFO_RADIUS * 0.85f * 0.7f : (getH() * FaceIcon.RADIUS) / FaceIcon.HEIGHT;
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public int getW() {
        float f;
        if (this.isDeviceTab) {
            return (int) (((double) FaceIcon.INFO_WIDTH) * this.mDeviceScaleFactor * 0.984d);
        }
        float f2 = 0.85f;
        if (this.mIsAodIcon) {
            f = FaceIcon.INFO_WIDTH * 0.85f;
            f2 = 0.7f;
        } else {
            if (this.isPhotoPicker) {
                return (getH() * FaceIcon.WIDTH) / FaceIcon.HEIGHT;
            }
            int i = this.location;
            if (i == FaceIcon.TYPE_ENTRANCE) {
                return ExtUtilsKt.getDp(Float.valueOf(FaceSizeConstant.getFaceEntranceDimension$default(FaceSizeConstant.INSTANCE, !SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand(), 0, 2, null).getHeight() / FaceIcon.SIZE_RATE));
            }
            if (i == FaceIcon.TYPE_MARKET_COMMON_ITEM) {
                return ExtUtilsKt.getDp(Float.valueOf(FaceSizeConstant.INSTANCE.getFaceMarketCommonDimension(this.faceType).getWidth()));
            }
            if (i == FaceIcon.TYPE_MARKET_PHOTO_ITEM) {
                return ExtUtilsKt.getDp(Float.valueOf(FaceSizeConstant.INSTANCE.getFaceMarketPhotoDimension(this.faceType).getWidth()));
            }
            if (i == FaceIcon.TYPE_MARKET_CATEGORY_ITEM) {
                return ExtUtilsKt.getDp(Float.valueOf(FaceSizeConstant.INSTANCE.getFaceCategoryDimension(this.faceType).getWidth()));
            }
            f = FaceIcon.INFO_WIDTH;
        }
        return (int) (f * f2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        GradientDrawable gradientDrawable = this.mCurrentBorder;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(getRadius() + FaceIcon.CUR_BORDER_WIDTH);
        }
        GradientDrawable gradientDrawable2 = this.mCurrentBorder;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setStroke(FaceIcon.CUR_BORDER_WIDTH, getResources().getColor(jki.common_main_dark_gray_color));
        }
        int i = this.location;
        if (i == FaceIcon.TYPE_MARKET_PHOTO_ITEM || i == FaceIcon.TYPE_MARKET_CATEGORY_ITEM || i == FaceIcon.TYPE_ENTRANCE) {
            GradientDrawable gradientDrawable3 = this.mCurrentBorder;
            if (gradientDrawable3 != null) {
                gradientDrawable3.setStroke(ExtUtilsKt.getDp(Double.valueOf(0.67d)), getResources().getColor(jki.f22894a, null));
            }
            GradientDrawable gradientDrawable4 = this.mCurrentBorder;
            if (gradientDrawable4 != null) {
                gradientDrawable4.setCornerRadius(getRadius());
            }
            GradientDrawable gradientDrawable5 = this.mCurrentBorder;
            if (gradientDrawable5 != null) {
                gradientDrawable5.setBounds(0, 0, getW(), getH());
            }
            GradientDrawable gradientDrawable6 = this.mCurrentBorder;
            if (gradientDrawable6 != null) {
                gradientDrawable6.draw(canvas);
            }
        }
        if (this.mIsCurrent) {
            GradientDrawable gradientDrawable7 = this.mCurrentBorder;
            if (gradientDrawable7 != null) {
                gradientDrawable7.setBounds(0, 0, getW(), getH());
            }
            GradientDrawable gradientDrawable8 = this.mCurrentBorder;
            if (gradientDrawable8 != null) {
                gradientDrawable8.draw(canvas);
            }
        }
    }

    public final void setDeviceScaleFactor(double factor) {
        this.mDeviceScaleFactor = factor;
    }

    public final void tintColor(@Nullable String colorStr) {
        if (colorStr == null || colorStr.length() == 0 || getDrawable() == null) {
            return;
        }
        int validColor = getValidColor(colorStr);
        Drawable drawableR = k47.r(getDrawable());
        Intrinsics.checkNotNullExpressionValue(drawableR, "wrap(...)");
        k47.n(drawableR, validColor);
        setImageDrawable(drawableR);
    }

    @JvmOverloads
    public FaceInfoView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FaceInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public FaceInfoView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "FaceInfoView";
        this.mDeviceScaleFactor = 0.6d;
        this.mCurrentBorder = (GradientDrawable) ni4.e(getContext(), ooi.f29341a);
    }
}
