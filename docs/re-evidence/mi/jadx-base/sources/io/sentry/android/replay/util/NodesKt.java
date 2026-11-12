package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0082\b\u001a)\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0082\b\u001a\u0016\u0010\u0007\u001a\u00020\b*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0082\b\u001a\u001d\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0082\b\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0012H\u0000\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0011H\u0000¨\u0006\u0017"}, d2 = {"fastMaxOf", "", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, "fastMinOf", "boundsInWindow", "Landroid/graphics/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "root", "fastCoerceAtLeast", "minimumValue", "fastCoerceAtMost", "maximumValue", "fastCoerceIn", "findPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/node/LayoutNode;", "findTextAttributes", "Lio/sentry/android/replay/util/TextAttributes;", "isMaskable", "", "sentry-android-replay_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nio/sentry/android/replay/util/NodesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n152#1,6:209\n148#1,10:215\n148#1,10:225\n148#1,10:235\n148#1,10:245\n130#1:255\n139#1:256\n130#1:257\n139#1:258\n1#2:208\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nio/sentry/android/replay/util/NodesKt\n*L\n148#1:209,6\n175#1:215,10\n176#1:225,10\n177#1:235,10\n178#1:245,10\n194#1:255\n195#1:256\n202#1:257\n203#1:258\n*E\n"})
public final class NodesKt {
    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates, @Nullable LayoutCoordinates layoutCoordinates2) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        if (layoutCoordinates2 == null) {
            return new Rect();
        }
        float f = IntSize.getWidth-impl(layoutCoordinates2.getSize-YbymL2g());
        float f2 = IntSize.getHeight-impl(layoutCoordinates2.getSize-YbymL2g());
        androidx.compose.ui.geometry.Rect rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, (Object) null);
        float left = rectLocalBoundingBoxOf$default.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > f) {
            left = f;
        }
        float top = rectLocalBoundingBoxOf$default.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > f2) {
            top = f2;
        }
        float right = rectLocalBoundingBoxOf$default.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= f) {
            f = right;
        }
        float bottom = rectLocalBoundingBoxOf$default.getBottom();
        float f3 = bottom >= 0.0f ? bottom : 0.0f;
        if (f3 <= f2) {
            f2 = f3;
        }
        if (left == f || top == f2) {
            return new Rect();
        }
        long j = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, top));
        long j2 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f, top));
        long j3 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(f, f2));
        long j4 = layoutCoordinates2.localToWindow-MK-Hz9U(OffsetKt.Offset(left, f2));
        float f4 = Offset.getX-impl(j);
        float f5 = Offset.getX-impl(j2);
        float f6 = Offset.getX-impl(j4);
        float f7 = Offset.getX-impl(j3);
        float fMin = Math.min(f4, Math.min(f5, Math.min(f6, f7)));
        float fMax = Math.max(f4, Math.max(f5, Math.max(f6, f7)));
        float f8 = Offset.getY-impl(j);
        float f9 = Offset.getY-impl(j2);
        float f10 = Offset.getY-impl(j4);
        float f11 = Offset.getY-impl(j3);
        return new Rect((int) fMin, (int) Math.min(f8, Math.min(f9, Math.min(f10, f11))), (int) fMax, (int) Math.max(f8, Math.max(f9, Math.max(f10, f11))));
    }

    private static final float fastCoerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    private static final float fastCoerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    private static final float fastCoerceIn(float f, float f2, float f3) {
        if (f < f2) {
            f = f2;
        }
        return f > f3 ? f3 : f;
    }

    private static final float fastMaxOf(float f, float f2, float f3, float f4) {
        return Math.max(f, Math.max(f2, Math.max(f3, f4)));
    }

    private static final float fastMinOf(float f, float f2, float f3, float f4) {
        return Math.min(f, Math.min(f2, Math.min(f3, f4)));
    }

    @Nullable
    public static final Painter findPainter(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        for (int i = 0; i < size; i++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
            String name = modifier.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "modifier::class.java.name");
            if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "Painter", false, 2, (Object) null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof Painter) {
                        return (Painter) obj;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return null;
    }

    @NotNull
    public static final TextAttributes findTextAttributes(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        Color color = null;
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
            String modifierClassName = modifier.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(modifierClassName, "modifierClassName");
            if (StringsKt__StringsKt.contains$default((CharSequence) modifierClassName, (CharSequence) "Text", false, 2, (Object) null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    ColorProducer colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                    color = colorProducer != null ? Color.box-impl(colorProducer.invoke-0d7_KjU()) : null;
                } catch (Throwable unused) {
                }
            } else if (StringsKt__StringsKt.contains$default((CharSequence) modifierClassName, (CharSequence) "Fill", false, 2, (Object) null)) {
                z = true;
            }
        }
        return new TextAttributes(color, z, null);
    }

    public static final boolean isMaskable(@NotNull Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<this>");
        String className = painter.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(className, "className");
        return (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "Vector", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "Color", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "Brush", false, 2, (Object) null)) ? false : true;
    }
}
