package com.xiaomi.fitness.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import coil.Coil;
import coil.request.Disposable;
import coil.request.ImageRequest;
import com.xiaomi.fitness.extensions.ViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/widget/SquareBindingImageView;", "Lcom/xiaomi/fitness/widget/SquareImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SquareBindingImageView extends SquareImageView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/widget/SquareBindingImageView$Companion;", "", "<init>", "()V", "setSrc", "", "imageView", "Lcom/xiaomi/fitness/widget/SquareBindingImageView;", "src", "", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSquareBindingImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SquareBindingImageView.kt\ncom/xiaomi/fitness/widget/SquareBindingImageView$Companion\n+ 2 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt\n+ 3 ViewExt.kt\ncom/xiaomi/fitness/extensions/ViewExtKt$loadWithLifecycle$1\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,31:1\n270#2,9:32\n279#2,3:42\n282#2,8:46\n272#3:41\n24#4:45\n*S KotlinDebug\n*F\n+ 1 SquareBindingImageView.kt\ncom/xiaomi/fitness/widget/SquareBindingImageView$Companion\n*L\n28#1:32,9\n28#1:42,3\n28#1:46,8\n28#1:41\n28#1:45\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setSrc(@NotNull SquareBindingImageView imageView, @Nullable String src) {
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(imageView);
            Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageRequest imageRequestBuild = new ImageRequest.Builder(context).data(src).target(imageView).lifecycle(lifecycle).build();
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Disposable disposableEnqueue = Coil.imageLoader(context2).enqueue(imageRequestBuild);
            if (lifecycle != null) {
                lifecycle.addObserver(new ViewExtKt.AnonymousClass2(disposableEnqueue, lifecycle));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareBindingImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void setSrc(@NotNull SquareBindingImageView squareBindingImageView, @Nullable String str) {
        INSTANCE.setSrc(squareBindingImageView, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareBindingImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SquareBindingImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareBindingImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
