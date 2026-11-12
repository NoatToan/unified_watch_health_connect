package com.huami.chart.shimmer;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u0000 a2\u00020\u0001:\u0003abcB\u0007¢\u0006\u0004\b`\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000e\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001e\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\"\u0010&\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR(\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b'\u0010\u0017\u0012\u0004\b*\u0010\u001d\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\"\u0010G\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R\"\u0010K\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0017\u001a\u0004\bI\u0010\u0019\"\u0004\bJ\u0010\u001bR\"\u0010O\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0017\u001a\u0004\bM\u0010\u0019\"\u0004\bN\u0010\u001bR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\"\u0010_\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010R\u001a\u0004\b]\u0010T\"\u0004\b^\u0010V¨\u0006d"}, d2 = {"Lcom/huami/chart/shimmer/Shimmer;", "", "", "a", "b", "", "[F", "getPositions", "()[F", "positions", "", "[I", "getColors", "()[I", "colors", "Landroid/graphics/Rect;", "c", "Landroid/graphics/Rect;", "getTranslateBounds", "()Landroid/graphics/Rect;", "translateBounds", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getDirection", "()I", "setDirection", "(I)V", "getDirection$annotations", "()V", "direction", "e", "getHighlightColor", "setHighlightColor", "highlightColor", "f", "getBaseColor", "setBaseColor", "baseColor", "g", "getShape", "setShape", "getShape$annotations", "shape", "", "h", "F", "getDropoff", "()F", "setDropoff", "(F)V", "dropoff", "i", "getTilt", "setTilt", "tilt", "", z.j, "Z", "getClipToChildren", "()Z", "setClipToChildren", "(Z)V", "clipToChildren", hl.k, "getAutoStart", "setAutoStart", "autoStart", "l", "getAlphaShimmer", "setAlphaShimmer", "alphaShimmer", "m", "getRepeatCount", "setRepeatCount", "repeatCount", GoogleApiAvailabilityLight.b, "getRepeatMode", "setRepeatMode", RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, "", "o", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", b.r, "getRepeatDelay", "setRepeatDelay", "repeatDelay", DTransferConstants.SEARCH_KEY, "getStartDelay", "setStartDelay", "startDelay", "<init>", "Companion", "Direction", "Shape", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class Shimmer {
    private static final int r = 3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int direction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int shape;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float tilt;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long repeatDelay;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private long startDelay;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final float[] positions = new float[3];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final int[] colors = new int[3];

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Rect translateBounds = new Rect();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @ColorInt
    private int highlightColor = Color.parseColor("#cccccc");

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @ColorInt
    private int baseColor = Color.parseColor("#7f7f7f");

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float dropoff = 0.5f;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean clipToChildren = true;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean autoStart = true;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean alphaShimmer = true;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int repeatCount = -1;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int repeatMode = 1;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long animationDuration = 4000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/chart/shimmer/Shimmer$Direction;", "", "Companion", "chart_release"}, k = 1, mv = {1, 5, 1})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Direction {
        public static final int BOTTOM_TO_TOP = 3;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;
        public static final int LEFT_TO_RIGHT = 0;
        public static final int RIGHT_TO_LEFT = 2;
        public static final int TOP_TO_BOTTOM = 1;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/chart/shimmer/Shimmer$Direction$Companion;", "", "", "LEFT_TO_RIGHT", LogUtil.I, "TOP_TO_BOTTOM", "RIGHT_TO_LEFT", "BOTTOM_TO_TOP", "<init>", "()V", "chart_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final int BOTTOM_TO_TOP = 3;
            public static final int LEFT_TO_RIGHT = 0;
            public static final int RIGHT_TO_LEFT = 2;
            public static final int TOP_TO_BOTTOM = 1;
            public static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/chart/shimmer/Shimmer$Shape;", "", "Companion", "chart_release"}, k = 1, mv = {1, 5, 1})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Shape {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;
        public static final int LINEAR = 0;
        public static final int RADIAL = 1;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/chart/shimmer/Shimmer$Shape$Companion;", "", "", "LINEAR", LogUtil.I, "RADIAL", "<init>", "()V", "chart_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static final int LINEAR = 0;
            public static final int RADIAL = 1;
            public static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }
    }

    public Shimmer() {
        a();
        b();
    }

    private final void a() {
        if (this.shape == 0) {
            int[] iArr = this.colors;
            int i = this.baseColor;
            iArr[0] = i;
            iArr[1] = this.highlightColor;
            iArr[2] = i;
        }
    }

    private final void b() {
        if (this.shape == 0) {
            float[] fArr = this.positions;
            fArr[0] = 0.0f;
            fArr[1] = this.dropoff;
            fArr[2] = 1.0f;
        }
    }

    public static /* synthetic */ void getDirection$annotations() {
    }

    public static /* synthetic */ void getShape$annotations() {
    }

    public final boolean getAlphaShimmer() {
        return this.alphaShimmer;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAutoStart() {
        return this.autoStart;
    }

    public final int getBaseColor() {
        return this.baseColor;
    }

    public final boolean getClipToChildren() {
        return this.clipToChildren;
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    public final int getDirection() {
        return this.direction;
    }

    public final float getDropoff() {
        return this.dropoff;
    }

    public final int getHighlightColor() {
        return this.highlightColor;
    }

    @NotNull
    public final float[] getPositions() {
        return this.positions;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public final long getRepeatDelay() {
        return this.repeatDelay;
    }

    public final int getRepeatMode() {
        return this.repeatMode;
    }

    public final int getShape() {
        return this.shape;
    }

    public final long getStartDelay() {
        return this.startDelay;
    }

    public final float getTilt() {
        return this.tilt;
    }

    @NotNull
    public final Rect getTranslateBounds() {
        return this.translateBounds;
    }

    public final void setAlphaShimmer(boolean z) {
        this.alphaShimmer = z;
    }

    public final void setAnimationDuration(long j) {
        this.animationDuration = j;
    }

    public final void setAutoStart(boolean z) {
        this.autoStart = z;
    }

    public final void setBaseColor(int i) {
        this.baseColor = i;
    }

    public final void setClipToChildren(boolean z) {
        this.clipToChildren = z;
    }

    public final void setDirection(int i) {
        this.direction = i;
    }

    public final void setDropoff(float f) {
        this.dropoff = f;
    }

    public final void setHighlightColor(int i) {
        this.highlightColor = i;
    }

    public final void setRepeatCount(int i) {
        this.repeatCount = i;
    }

    public final void setRepeatDelay(long j) {
        this.repeatDelay = j;
    }

    public final void setRepeatMode(int i) {
        this.repeatMode = i;
    }

    public final void setShape(int i) {
        this.shape = i;
    }

    public final void setStartDelay(long j) {
        this.startDelay = j;
    }

    public final void setTilt(float f) {
        this.tilt = f;
    }
}
