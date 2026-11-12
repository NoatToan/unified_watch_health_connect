package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b1\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH&J\b\u0010\"\u001a\u00020!H&R\u0016\u0010&\u001a\u00020#8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010\b\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0016\u0010\t\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0016\u0010\n\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0016\u0010-\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0016\u0010/\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u001c\u00105\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00108\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u001c\u0010;\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\u001c\u0010>\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u00102\"\u0004\b=\u00104R\u001c\u0010A\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u00102\"\u0004\b@\u00104R\u001c\u0010D\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u00102\"\u0004\bC\u00104R\u001c\u0010G\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bE\u00102\"\u0004\bF\u00104R\u001c\u0010J\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bH\u00102\"\u0004\bI\u00104R\u001c\u0010M\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bK\u00102\"\u0004\bL\u00104R\u001c\u0010P\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bN\u00102\"\u0004\bO\u00104R\u001c\u0010S\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bQ\u00102\"\u0004\bR\u00104R\u001c\u0010X\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001c\u0010[\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR\u001c\u0010^\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u00102\"\u0004\b]\u00104R\u0016\u0010`\u001a\u00020\u000b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010U¨\u0006a"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "Landroid/graphics/Outline;", "outline", "", "setOutline", "", "left", "top", "right", "bottom", "", "setPosition", "offset", "offsetLeftAndRight", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "hasOverlappingRendering", "setHasOverlappingRendering", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "getTop", "getRight", "getBottom", "getWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "()Z", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "getHasDisplayList", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceRenderNode {
    void drawInto(@NotNull Canvas canvas);

    @NotNull
    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(@NotNull Matrix matrix);

    int getLeft();

    void getMatrix(@NotNull Matrix matrix);

    float getPivotX();

    float getPivotY();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int offset);

    void offsetTopAndBottom(int offset);

    void record(@NotNull CanvasHolder canvasHolder, @Nullable Path clipPath, @NotNull Function1<? super androidx.compose.ui.graphics.Canvas, Unit> drawBlock);

    void setAlpha(float f);

    void setCameraDistance(float f);

    void setClipToBounds(boolean z);

    void setClipToOutline(boolean z);

    void setElevation(float f);

    boolean setHasOverlappingRendering(boolean hasOverlappingRendering);

    void setOutline(@Nullable Outline outline);

    void setPivotX(float f);

    void setPivotY(float f);

    boolean setPosition(int left, int top, int right, int bottom);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setTranslationX(float f);

    void setTranslationY(float f);
}
