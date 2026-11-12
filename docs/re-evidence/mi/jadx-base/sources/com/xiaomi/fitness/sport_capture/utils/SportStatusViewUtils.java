package com.xiaomi.fitness.sport_capture.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.view.View;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sport_capture.widgets.BaseSportStatusInfoView;
import com.xiaomi.fitness.sport_capture.widgets.SportStatusInfoViewType1;
import com.xiaomi.fitness.sport_capture.widgets.SportStatusInfoViewType2;
import com.xiaomi.fitness.sport_capture.widgets.SportStatusInfoViewType3;
import com.xiaomi.fitness.sport_capture.widgets.SportStatusInfoViewType4;
import com.xiaomi.fitness.sport_capture.widgets.SportStatusInfoViewType5;
import defpackage.ded;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/SportStatusViewUtils;", "", "", "viewHeight", "Landroid/graphics/Bitmap;", "bitmap", "scaleBitmap", "(ILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "", "degree", "rotateBitmapAndKeepSize", "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "Lded;", "projectionData", "viewWidth", "oriRotate", "convertSportStatusView2Bitmap", "(Landroid/content/Context;Lded;IIF)Landroid/graphics/Bitmap;", "", "TAG", "Ljava/lang/String;", "VIEW_WIDTH", "I", "VIEW_HEIGHT", "<init>", "()V", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportStatusViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportStatusViewUtils.kt\ncom/xiaomi/fitness/sport_capture/utils/SportStatusViewUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class SportStatusViewUtils {

    @NotNull
    private static final String TAG = "SportStatusViewUtils";

    @NotNull
    public static final SportStatusViewUtils INSTANCE = new SportStatusViewUtils();
    private static final int VIEW_WIDTH = ExtUtilsKt.getDp(668);
    private static final int VIEW_HEIGHT = ExtUtilsKt.getDp(376);

    private SportStatusViewUtils() {
    }

    public static /* synthetic */ Bitmap convertSportStatusView2Bitmap$default(SportStatusViewUtils sportStatusViewUtils, Context context, ded dedVar, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            f = 0.0f;
        }
        return sportStatusViewUtils.convertSportStatusView2Bitmap(context, dedVar, i, i2, f);
    }

    @JvmStatic
    @Nullable
    public static final Bitmap rotateBitmapAndKeepSize(@Nullable Bitmap bitmap, float degree) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(degree, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (Exception e) {
                Logger.e(TAG, "rotateBitmapAndKeepSize exception", e);
            }
        }
        return null;
    }

    private final Bitmap scaleBitmap(int viewHeight, Bitmap bitmap) {
        float f = viewHeight / VIEW_HEIGHT;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @NotNull
    public final Bitmap convertSportStatusView2Bitmap(@NotNull Context context, @NotNull ded projectionData, int viewWidth, int viewHeight, float oriRotate) {
        BaseSportStatusInfoView sportStatusInfoViewType2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        int i = projectionData.c;
        if (i != 1 && i != 2) {
            if (i != 4 && i != 5 && i != 6 && i != 15) {
                switch (i) {
                    case 708:
                    case 709:
                        sportStatusInfoViewType2 = new SportStatusInfoViewType3(context);
                        sportStatusInfoViewType2.render(projectionData, oriRotate);
                        break;
                    case 710:
                        sportStatusInfoViewType2 = new SportStatusInfoViewType4(context);
                        sportStatusInfoViewType2.render(projectionData, oriRotate);
                        break;
                    default:
                        sportStatusInfoViewType2 = new SportStatusInfoViewType5(context);
                        sportStatusInfoViewType2.render(projectionData, oriRotate);
                        break;
                }
            } else {
                sportStatusInfoViewType2 = new SportStatusInfoViewType1(context);
                sportStatusInfoViewType2.render(projectionData, oriRotate);
            }
        } else {
            sportStatusInfoViewType2 = new SportStatusInfoViewType2(context);
            sportStatusInfoViewType2.render(projectionData, oriRotate);
        }
        int i2 = VIEW_WIDTH;
        int i3 = VIEW_HEIGHT;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        sportStatusInfoViewType2.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        sportStatusInfoViewType2.layout(0, 0, viewWidth, viewHeight);
        sportStatusInfoViewType2.draw(canvas);
        return scaleBitmap(viewHeight, bitmapCreateBitmap);
    }
}
