package com.xiaomi.fitness.base;

import android.content.Context;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/base/HomePageAdaptationParam;", "", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomePageAdaptationParam {
    private static final float contentTopHeaderHeightFraction = 0.23809524f;
    private static final float headerContentMarginBottom = 0.3042328f;
    private static final float headerContentMarginTop = 0.20899472f;
    private static final float imageMarginTop = 0.03527337f;
    private static final float titleTextMarginStart = 0.07583774f;
    private static final float titleTextMarginTop = 0.074074075f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static float fraction = (DisplayUtil.getStatusBarHeight() * 1.0f) / Constants.FHD_WIDTH;
    private static float imageWidthScreenFraction = 0.80907404f;
    private static float imageHeightHeaderFraction = 0.9116608f;
    private static float imageHeightWidthFraction = 1.1811024f;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010 \u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010!\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\"\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/base/HomePageAdaptationParam$Companion;", "", "<init>", "()V", "fraction", "", "getFraction", "()F", "setFraction", "(F)V", "imageWidthScreenFraction", "getImageWidthScreenFraction", "setImageWidthScreenFraction", "imageHeightHeaderFraction", "getImageHeightHeaderFraction", "setImageHeightHeaderFraction", "imageHeightWidthFraction", "getImageHeightWidthFraction", "setImageHeightWidthFraction", "titleTextMarginStart", "titleTextMarginTop", "headerContentMarginTop", "headerContentMarginBottom", "imageMarginTop", "contentTopHeaderHeightFraction", "getContentMarginTop", "", "context", "Landroid/content/Context;", "getRealHeaderViewHeight", "getTitleMarginStart", "getTitleMarginTop", "getImageMarginTop", "getHeaderContentMarginTitle", "getHeaderContentMarginBottom", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getContentMarginTop(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (int) (getRealHeaderViewHeight(context) * HomePageAdaptationParam.contentTopHeaderHeightFraction);
        }

        public final float getFraction() {
            return HomePageAdaptationParam.fraction;
        }

        public final int getHeaderContentMarginBottom(@Nullable Context context) {
            return (int) (getRealHeaderViewHeight(context) * HomePageAdaptationParam.headerContentMarginBottom);
        }

        public final int getHeaderContentMarginTitle(@Nullable Context context) {
            return (int) (getRealHeaderViewHeight(context) * HomePageAdaptationParam.headerContentMarginTop);
        }

        public final float getImageHeightHeaderFraction() {
            return HomePageAdaptationParam.imageHeightHeaderFraction;
        }

        public final float getImageHeightWidthFraction() {
            return HomePageAdaptationParam.imageHeightWidthFraction;
        }

        public final int getImageMarginTop(@Nullable Context context) {
            return (int) (getRealHeaderViewHeight(context) * HomePageAdaptationParam.imageMarginTop);
        }

        public final float getImageWidthScreenFraction() {
            return HomePageAdaptationParam.imageWidthScreenFraction;
        }

        public final int getRealHeaderViewHeight(@Nullable Context context) {
            int screenWidth = DisplayUtil.getScreenWidth();
            StringBuilder sb = new StringBuilder();
            sb.append("HomePageFragment HomePageAdaptationParam fraction:");
            sb.append(1.05f);
            return (int) (screenWidth * 1.05f);
        }

        public final int getTitleMarginStart(@Nullable Context context) {
            return (int) (getRealHeaderViewHeight(context) * HomePageAdaptationParam.titleTextMarginStart);
        }

        public final int getTitleMarginTop(@Nullable Context context) {
            return (int) (getRealHeaderViewHeight(context) * HomePageAdaptationParam.titleTextMarginTop);
        }

        public final void setFraction(float f) {
            HomePageAdaptationParam.fraction = f;
        }

        public final void setImageHeightHeaderFraction(float f) {
            HomePageAdaptationParam.imageHeightHeaderFraction = f;
        }

        public final void setImageHeightWidthFraction(float f) {
            HomePageAdaptationParam.imageHeightWidthFraction = f;
        }

        public final void setImageWidthScreenFraction(float f) {
            HomePageAdaptationParam.imageWidthScreenFraction = f;
        }
    }
}
