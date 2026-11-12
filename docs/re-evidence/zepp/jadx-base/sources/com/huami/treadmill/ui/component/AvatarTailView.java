package com.huami.treadmill.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.data.BoltRunnerData;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.io.File;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bJ\u0010KB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bJ\u0010NB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\u0006\u0010O\u001a\u00020\u0012¢\u0006\u0004\bJ\u0010PJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0014J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J&\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0012J\u0010\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0002R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010,\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00106\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0018\u0010>\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010@¨\u0006Q"}, d2 = {"Lcom/huami/treadmill/ui/component/AvatarTailView;", "Landroid/view/View;", "", "distanceTotal", "", WebAPI.PARAM_SHARE_INVITE_AVATAR, "Landroid/graphics/PointF;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", GoogleApiAvailabilityLight.a, Constant.PAI_KEY_DAILY_PAI, "a", "angle", "left", "margin", "b", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "startColor", "endColor", "radio", "alpha", "getColor", "Lcom/huami/treadmill/data/BoltRunnerData;", "info", "setAvatarImageView", "distance", "setDistance", "speed", "setSpeed", "Landroid/content/Context;", "mContext", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "mAvatarRect", "mTailRect", LogUtil.I, "mViewWidth", "e", "mViewHeight", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Paint;", "mAvatarPaint", "g", "mAvatarBgPaint", "h", "mTailPaint", "Landroid/widget/ImageView;", "i", "Landroid/widget/ImageView;", "mAvatarImageView", z.j, "mAvatarImageBgView", hl.k, "mTailImageView", "l", "F", "mDistance", "m", "mTailDistance", "Ljava/util/Timer;", GoogleApiAvailabilityLight.b, "Ljava/util/Timer;", "mTimer", "o", "mLastDistance", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class AvatarTailView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private RectF mAvatarRect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private RectF mTailRect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mViewWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mViewHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Paint mAvatarPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Paint mAvatarBgPaint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Paint mTailPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private ImageView mAvatarImageView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ImageView mAvatarImageBgView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private ImageView mTailImageView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float mDistance;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float mTailDistance;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private Timer mTimer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float mLastDistance;

    public AvatarTailView(@NotNull Context context) {
        this(context, null);
    }

    private final float a(Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    private final PointF b(float angle, boolean left, float margin) {
        float fA;
        int i;
        double d;
        double d2;
        double dSin;
        double d3;
        double d4;
        double d5;
        double dSin2;
        int i2 = this.mViewHeight;
        float f = 2;
        float f2 = (i2 / f) - margin;
        if (left) {
            fA = (i2 / f) - ((int) a(this.mContext, 1.0f));
            i = this.mViewHeight;
        } else {
            fA = (this.mViewWidth - (i2 / f)) + ((int) a(this.mContext, 1.0f));
            i = this.mViewHeight;
        }
        float f3 = i / f;
        double radians = Math.toRadians(angle);
        if (angle >= 90.0f) {
            if (angle == 90.0f) {
                f3 += f2;
            } else if (angle <= 90.0f || angle >= 180.0f) {
                if (angle == 180.0f) {
                    fA -= f2;
                } else {
                    if (angle <= 180.0f || angle >= 270.0f) {
                        if (angle == 270.0f) {
                            f3 -= f2;
                        } else {
                            double d6 = (((double) (360 - angle)) * 3.141592653589793d) / 180.0d;
                            d = f2;
                            fA = (float) (((double) fA) + (Math.cos(d6) * d));
                            d2 = f3;
                            dSin = Math.sin(d6);
                        }
                    } else {
                        double d7 = (((double) (angle - 180)) * 3.141592653589793d) / 180.0d;
                        d = f2;
                        fA = (float) (((double) fA) - (Math.cos(d7) * d));
                        d2 = f3;
                        dSin = Math.sin(d7);
                    }
                    d3 = d2 - (dSin * d);
                    f3 = (float) d3;
                }
            } else {
                double d8 = (((double) (180 - angle)) * 3.141592653589793d) / 180.0d;
                d4 = f2;
                fA = (float) (((double) fA) - (Math.cos(d8) * d4));
                d5 = f3;
                dSin2 = Math.sin(d8);
            }
            PointF pointF = new PointF();
            pointF.set(fA, f3);
            return pointF;
        }
        d4 = f2;
        fA = (float) (((double) fA) + (Math.cos(radians) * d4));
        d5 = f3;
        dSin2 = Math.sin(radians);
        d3 = d5 + (dSin2 * d4);
        f3 = (float) d3;
        PointF pointF2 = new PointF();
        pointF2.set(fA, f3);
        return pointF2;
    }

    private final PointF c(float distanceTotal, boolean avatar) {
        float f;
        float f2;
        float f3;
        float f4 = 100;
        float f5 = distanceTotal % f4;
        float f6 = distanceTotal % 400;
        float fA = avatar ? ((int) a(this.mContext, 21.0f)) + a(this.mContext, 6.0f) : a(this.mContext, 21.0f);
        float fA2 = 0.0f;
        if (f6 >= 0.0f && f6 < 100.0f) {
            fA2 = ((this.mViewHeight / 2) - a(this.mContext, 1.0f)) + ((f5 * ((this.mViewWidth - this.mViewHeight) + a(this.mContext, 2.0f))) / f4);
            f = this.mViewHeight - fA;
        } else {
            if (f6 >= 100.0f && f6 < 200.0f) {
                if (f5 < 50.0f) {
                    f3 = 90.0f;
                } else {
                    f5 -= 50;
                    f3 = 360.0f;
                }
                return b(f3 - ((f5 * 180) / f4), false, fA);
            }
            if (f6 >= 200.0f && f6 < 300.0f) {
                fA2 = ((this.mViewHeight / 2) - a(this.mContext, 1.0f)) + (((f4 - f5) * ((this.mViewWidth - this.mViewHeight) + a(this.mContext, 2.0f))) / f4);
                f = 0 + fA;
            } else {
                if (f6 >= 300.0f && f6 < 400.0f) {
                    if (f5 < 50.0f) {
                        f2 = 270.0f;
                    } else {
                        f5 -= 50;
                        f2 = 180.0f;
                    }
                    return b(f2 - ((f5 * 180) / f4), true, fA);
                }
                f = 0.0f;
            }
        }
        PointF pointF = new PointF();
        pointF.set(fA2, f);
        return pointF;
    }

    private final void d(Context context) {
        this.mAvatarRect = new RectF();
        this.mTailRect = new RectF();
        Paint paint = new Paint();
        this.mAvatarPaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.mAvatarPaint;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
        }
        Paint paint3 = this.mAvatarPaint;
        if (paint3 != null) {
            paint3.setColor(ContextCompat.getColor(context, R.color.cl_ffffff));
        }
        Paint paint4 = new Paint();
        this.mAvatarBgPaint = paint4;
        paint4.setAntiAlias(true);
        Paint paint5 = this.mAvatarBgPaint;
        if (paint5 != null) {
            paint5.setStyle(Paint.Style.FILL);
        }
        Paint paint6 = this.mAvatarBgPaint;
        if (paint6 != null) {
            paint6.setColor(ContextCompat.getColor(context, R.color.cl_ffffff));
        }
        Paint paint7 = new Paint();
        this.mTailPaint = paint7;
        paint7.setAntiAlias(true);
        Paint paint8 = this.mTailPaint;
        if (paint8 != null) {
            paint8.setColor(ContextCompat.getColor(context, R.color.cl_0076ae));
        }
        Paint paint9 = this.mTailPaint;
        if (paint9 != null) {
            paint9.setStyle(Paint.Style.FILL);
        }
        ImageView imageView = new ImageView(context);
        this.mTailImageView = imageView;
        imageView.setImageResource(R.drawable.td_running_tail);
        ImageView imageView2 = this.mTailImageView;
        if (imageView2 != null) {
            imageView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        ImageView imageView3 = new ImageView(context);
        this.mAvatarImageBgView = imageView3;
        imageView3.setImageResource(R.drawable.td_avatar_ring_running);
        ImageView imageView4 = this.mAvatarImageBgView;
        if (imageView4 == null) {
            return;
        }
        imageView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getColor(int startColor, int endColor, float radio, int alpha) {
        int iRed = Color.red(startColor);
        int iBlue = Color.blue(startColor);
        int iGreen = Color.green(startColor);
        return Color.argb(alpha, (int) (((double) iRed) + ((double) ((Color.red(endColor) - iRed) * radio)) + 0.5d), (int) (((double) iGreen) + ((double) ((Color.green(endColor) - iGreen) * radio)) + 0.5d), (int) (((double) iBlue) + ((double) ((Color.blue(endColor) - iBlue) * radio)) + 0.5d));
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawColor(0);
        }
        int color = ContextCompat.getColor(getContext(), R.color.cl_1ae4bf);
        int color2 = ContextCompat.getColor(getContext(), R.color.cl_0076ae);
        Paint paint = this.mTailPaint;
        if (paint != null) {
            paint.setStrokeWidth(a(this.mContext, 3.0f));
        }
        int iA = (int) (this.mTailDistance * a(this.mContext, 3.0f));
        if (iA >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (iA != 0) {
                    float f = i;
                    float f2 = iA;
                    PointF pointFC = c((this.mDistance + 400) - ((this.mTailDistance * f) / f2), false);
                    int color3 = getColor(color, color2, f / f2, 50 - ((i * 50) / iA));
                    Paint paint2 = this.mTailPaint;
                    if (paint2 != null) {
                        paint2.setColor(color3);
                        if (canvas != null) {
                            canvas.drawPoint(pointFC.x, pointFC.y, paint2);
                        }
                    }
                }
                if (i == iA) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        PointF pointFC2 = c(this.mDistance, true);
        if (canvas == null) {
            return;
        }
        ImageView imageView = this.mAvatarImageBgView;
        Drawable drawable = imageView == null ? null : imageView.getDrawable();
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setBounds(((int) pointFC2.x) - ((int) a(this.mContext, 19.0f)), ((int) pointFC2.y) - ((int) a(this.mContext, 19.0f)), ((int) pointFC2.x) + ((int) a(this.mContext, 19.0f)), ((int) pointFC2.y) + ((int) a(this.mContext, 19.0f)));
        gradientDrawable.draw(canvas);
        ImageView imageView2 = this.mAvatarImageView;
        Drawable drawable2 = imageView2 != null ? imageView2.getDrawable() : null;
        if (drawable2 != null) {
            drawable2.setBounds(((int) pointFC2.x) - ((int) a(this.mContext, 18.0f)), ((int) pointFC2.y) - ((int) a(this.mContext, 18.0f)), ((int) pointFC2.x) + ((int) a(this.mContext, 18.0f)), ((int) pointFC2.y) + ((int) a(this.mContext, 18.0f)));
        }
        if (drawable2 == null) {
            return;
        }
        drawable2.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mViewWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        this.mViewHeight = View.MeasureSpec.getSize(heightMeasureSpec);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    public final void setAvatarImageView(@Nullable BoltRunnerData info) {
        String avatarUrl;
        ImageView imageView = new ImageView(getContext());
        this.mAvatarImageView = imageView;
        imageView.setImageResource(R.drawable.td_avatar_default);
        ImageView imageView2 = this.mAvatarImageView;
        if (imageView2 != null) {
            imageView2.setLayoutParams(new ViewGroup.LayoutParams((int) a(this.mContext, 36.0f), (int) a(this.mContext, 36.0f)));
        }
        if (info != null) {
            String avatarPath = info.getAvatarPath();
            if (avatarPath != null) {
                if (!new File(avatarPath).exists()) {
                    avatarPath = null;
                }
                if (avatarPath == null) {
                    avatarPath = null;
                } else {
                    Glide.with(this.mAvatarImageView).load(info.getAvatarPath()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(this.mAvatarImageView);
                }
            } else {
                avatarPath = null;
            }
            if (avatarPath == null && (avatarUrl = info.getAvatarUrl()) != null) {
                if ((m.isBlank(avatarUrl) ? null : avatarUrl) != null) {
                    Glide.with(this.mAvatarImageView).load(info.getAvatarUrl()).apply(TdmillConfig.INSTANCE.getAvatarOptions().transform(new CircleCrop())).into(this.mAvatarImageView);
                }
            }
        }
        invalidate();
    }

    public final void setDistance(float distance) {
        float f = this.mLastDistance;
        if ((distance == f) || distance < 0.0f) {
            return;
        }
        float f2 = distance - f;
        final int i = (int) (5 * f2);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = f2 / i;
        if ((this.mLastDistance == 0.0f) || f2 <= 0.0f || i <= 0) {
            this.mDistance = distance % 400;
            this.mLastDistance = distance;
            invalidate();
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        floatRef2.element = this.mLastDistance;
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
        }
        TimerTask timerTask = new TimerTask() { // from class: com.huami.treadmill.ui.component.AvatarTailView$setDistance$mTask$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Timer timer2;
                this.a.mDistance = (floatRef2.element + (floatRef.element * intRef.element)) % 400;
                this.a.mLastDistance = floatRef2.element + (floatRef.element * intRef.element);
                this.a.postInvalidate();
                if (intRef.element == i && (timer2 = this.a.mTimer) != null) {
                    timer2.cancel();
                }
                intRef.element++;
            }
        };
        Timer timer2 = new Timer();
        this.mTimer = timer2;
        timer2.schedule(timerTask, 0L, 1000 / ((long) i));
    }

    public final void setSpeed(float speed) {
        float f = 0.0f;
        if (!(speed == 0.0f)) {
            double d = ((double) speed) * 3.6d;
            if (d < 0.1d) {
                f = 50.0f;
            } else {
                f = d > 15.0d ? 150.0f : ((float) (((d / 0.1d) * ((double) 400)) / ((double) 600))) + 50.0f;
            }
        }
        this.mTailDistance = f;
        invalidate();
    }

    public AvatarTailView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarTailView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = getContext();
        d(context);
    }
}
