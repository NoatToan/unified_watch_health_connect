package com.mapbox.maps.renderer.widget;

import android.graphics.Bitmap;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import lc.u0;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\nB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/renderer/widget/BitmapWidget;", "Lcom/mapbox/maps/renderer/widget/Widget;", "bitmap", "Landroid/graphics/Bitmap;", ModelSourceWrapper.POSITION, "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "marginX", "", "marginY", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;FF)V", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;F)V", "originalPosition", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "renderer", "Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "getRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "getPosition", "getRotation", "setPosition", "", "widgetPosition", "setRotation", "angleDegrees", "updateBitmap", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public class BitmapWidget extends Widget {
    private final WidgetPosition originalPosition;
    private final BitmapWidgetRenderer renderer;

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f14, float f15, int i14, j jVar) {
        if ((i14 & 2) != 0) {
            widgetPosition = new WidgetPosition(WidgetPosition.Horizontal.LEFT, WidgetPosition.Vertical.TOP);
        }
        this(bitmap, widgetPosition, (i14 & 4) != 0 ? 0.0f : f14, (i14 & 8) != 0 ? 0.0f : f15);
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public WidgetPosition getPosition() {
        return getRenderer().getPosition();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public float getRotation() {
        return getRenderer().getRotationDegrees();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public void setPosition(WidgetPosition widgetPosition) {
        widgetPosition.getClass();
        getRenderer().setPosition(widgetPosition);
        triggerRepaint$maps_sdk_release();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public void setRotation(float angleDegrees) {
        getRenderer().setRotation(angleDegrees);
        triggerRepaint$maps_sdk_release();
    }

    public final void updateBitmap(Bitmap bitmap) {
        bitmap.getClass();
        getRenderer().updateBitmap(bitmap);
        triggerRepaint$maps_sdk_release();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    /* JADX INFO: renamed from: getRenderer$maps_sdk_release, reason: from getter */
    public BitmapWidgetRenderer getRenderer() {
        return this.renderer;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.widget.BitmapWidget$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<WidgetPosition.Builder, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetPosition.Builder builder) {
            builder.getClass();
            builder.m319setVerticalAlignment(WidgetPosition.Vertical.TOP);
            builder.m316setHorizontalAlignment(WidgetPosition.Horizontal.LEFT);
            builder.m317setOffsetX(0.0f);
            builder.m318setOffsetY(0.0f);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(WidgetPosition.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, int i14, j jVar) {
        this(bitmap, (i14 & 2) != 0 ? WidgetPositionKt.WidgetPosition(AnonymousClass1.INSTANCE) : widgetPosition);
    }

    public BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition) {
        bitmap.getClass();
        widgetPosition.getClass();
        this.originalPosition = widgetPosition;
        this.renderer = new BitmapWidgetRenderer(bitmap, widgetPosition);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BitmapWidget(Bitmap bitmap) {
        this(bitmap, (WidgetPosition) null, 2, (j) (0 == true ? 1 : 0));
        bitmap.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f14, float f15) {
        this(bitmap, WidgetPositionKt.WidgetPosition(new AnonymousClass2(widgetPosition, f14, f15)));
        bitmap.getClass();
        widgetPosition.getClass();
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f14, int i14, j jVar) {
        if ((i14 & 2) != 0) {
            widgetPosition = new WidgetPosition(WidgetPosition.Horizontal.LEFT, WidgetPosition.Vertical.TOP);
        }
        this(bitmap, widgetPosition, (i14 & 4) != 0 ? 0.0f : f14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f14) {
        this(bitmap, widgetPosition, f14, 0.0f);
        bitmap.getClass();
        widgetPosition.getClass();
    }

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.widget.BitmapWidget$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements l<WidgetPosition.Builder, Unit> {
        final /* synthetic */ float $marginX;
        final /* synthetic */ float $marginY;
        final /* synthetic */ WidgetPosition $position;

        /* JADX INFO: renamed from: com.mapbox.maps.renderer.widget.BitmapWidget$2$WhenMappings */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[WidgetPosition.Horizontal.values().length];
                try {
                    iArr[WidgetPosition.Horizontal.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WidgetPosition.Horizontal.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WidgetPosition.Horizontal.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[WidgetPosition.Vertical.values().length];
                try {
                    iArr2[WidgetPosition.Vertical.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[WidgetPosition.Vertical.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[WidgetPosition.Vertical.BOTTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WidgetPosition widgetPosition, float f14, float f15) {
            super(1);
            this.$position = widgetPosition;
            this.$marginX = f14;
            this.$marginY = f15;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetPosition.Builder builder) {
            float f14;
            float f15;
            builder.getClass();
            builder.m316setHorizontalAlignment(this.$position.getHorizontalAlignment());
            builder.m319setVerticalAlignment(this.$position.getVerticalAlignment());
            int i14 = WhenMappings.$EnumSwitchMapping$0[this.$position.getHorizontalAlignment().ordinal()];
            if (i14 == 1 || i14 == 2) {
                f14 = this.$marginX;
            } else {
                if (i14 != 3) {
                    u0.r();
                    return;
                }
                f14 = -this.$marginX;
            }
            builder.m317setOffsetX(f14);
            int i15 = WhenMappings.$EnumSwitchMapping$1[this.$position.getVerticalAlignment().ordinal()];
            if (i15 == 1 || i15 == 2) {
                f15 = this.$marginY;
            } else {
                if (i15 != 3) {
                    u0.r();
                    return;
                }
                f15 = -this.$marginY;
            }
            builder.m318setOffsetY(f15);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(WidgetPosition.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }
    }
}
