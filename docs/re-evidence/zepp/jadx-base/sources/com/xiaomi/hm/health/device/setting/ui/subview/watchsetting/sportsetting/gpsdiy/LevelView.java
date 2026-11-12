package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b'\u0010+B#\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b'\u0010-J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R*\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LevelView;", "Landroid/view/View;", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "value", "a", LogUtil.I, "getLevelCount", "()I", "setLevelCount", "(I)V", "levelCount", "b", "getLevel", "setLevel", FirebaseAnalytics.Param.LEVEL, "c", "gapWidth", GoogleApiAvailabilityLight.a, "viewHeight", "e", "perLevelWidth", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Paint;", "paint", "g", "normalColor", "highLightColor", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LevelView extends View {
    private static final int i = 4;

    @NotNull
    private static final String j = "#02AF8D";

    @NotNull
    private static final String k = "#F2F2F2";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int levelCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int level;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int gapWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int viewHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int perLevelWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private Paint paint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int normalColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int highLightColor;

    public LevelView(@NotNull Context context) {
        this(context, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getLevelCount() {
        return this.levelCount;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        if (canvas == null) {
            return;
        }
        int i2 = 0;
        int i3 = this.levelCount;
        if (i3 <= 0) {
            return;
        }
        while (true) {
            int i4 = i2 + 1;
            this.paint.setColor(i2 > this.level + (-1) ? this.normalColor : this.highLightColor);
            int i5 = this.perLevelWidth;
            float f = (this.gapWidth + i5) * i2;
            canvas.drawRect(f, 0.0f, f + i5, this.viewHeight, this.paint);
            if (i4 >= i3) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.viewHeight = h;
        int i2 = w / ((this.levelCount * 4) - 1);
        this.gapWidth = i2;
        this.perLevelWidth = i2 * 3;
    }

    public final void setLevel(int i2) {
        this.level = i2;
        invalidate();
    }

    public final void setLevelCount(int i2) {
        this.levelCount = i2;
        invalidate();
    }

    public LevelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LevelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.levelCount = 4;
        this.paint = new Paint();
        this.normalColor = Color.parseColor(k);
        this.highLightColor = Color.parseColor(j);
    }
}
