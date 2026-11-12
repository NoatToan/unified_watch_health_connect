package com.huami.watchfacesstore.view.clip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002JU\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00062%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/huami/watchfacesstore/view/clip/ClipImageLayout;", "Landroid/widget/RelativeLayout;", "Landroid/graphics/Bitmap;", "clip", "bitmap", "Lkotlin/Pair;", "", "size", "radius", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "", TransportUri.ACTION_BLOCK, "setImageInfo", "Lcom/huami/watchfacesstore/view/clip/ClipZoomImageView;", "a", "Lcom/huami/watchfacesstore/view/clip/ClipZoomImageView;", "mZoomImageView", "Lcom/huami/watchfacesstore/view/clip/ClipImageBorderView;", "b", "Lcom/huami/watchfacesstore/view/clip/ClipImageBorderView;", "mClipImageView", "c", "Landroid/widget/ImageView;", "mImageView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ClipImageLayout extends RelativeLayout {
    public static final int CROP_MODE_CIRCLE = 1;
    public static final int CROP_MODE_RECT = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ClipZoomImageView mZoomImageView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ClipImageBorderView mClipImageView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ImageView mImageView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Pair<Integer, Integer> pair) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(pair.getFirst().intValue(), pair.getSecond().intValue());
            layoutParams.addRule(13);
            ClipImageLayout.this.mImageView.setLayoutParams(layoutParams);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
            a(pair);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipImageLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ClipZoomImageView clipZoomImageView = new ClipZoomImageView(context, null, 2, 0 == true ? 1 : 0);
        this.mZoomImageView = clipZoomImageView;
        this.mClipImageView = new ClipImageBorderView(context, null, 0, 6, null);
        this.mImageView = new ImageView(context);
        clipZoomImageView.setOnSizeChangeListener(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setImageInfo$default(ClipImageLayout clipImageLayout, Bitmap bitmap, Pair pair, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        clipImageLayout.setImageInfo(bitmap, pair, i, function1);
    }

    @Nullable
    public final Bitmap clip() {
        return this.mZoomImageView.clip();
    }

    public final void setImageInfo(@Nullable Bitmap bitmap, @NotNull Pair<Integer, Integer> size, int radius, @Nullable Function1<? super ImageView, Unit> block) {
        this.mZoomImageView.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(size.getFirst().intValue(), size.getSecond().intValue());
        layoutParams2.addRule(13);
        removeAllViews();
        addView(this.mZoomImageView, layoutParams);
        addView(this.mClipImageView, layoutParams);
        addView(this.mImageView, layoutParams2);
        this.mZoomImageView.setClipWidthAndHeight(size);
        this.mClipImageView.setSizeAndRadius(size, radius);
        if (block == null) {
            return;
        }
        block.invoke(this.mImageView);
    }
}
