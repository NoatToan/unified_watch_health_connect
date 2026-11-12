package com.xiaomi.fitness.sport.view;

import android.view.View;
import android.widget.ImageView;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/sport/view/DataBindingAdapters;", "", "<init>", "()V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataBindingAdapters {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/DataBindingAdapters$Companion;", "", "<init>", "()V", "setImageResource", "", "view", "Landroid/widget/ImageView;", TSMAuthContants.PARAM_RESOURCE, "", "setBackResource", "Landroid/view/View;", "setImgBackResource", "setRoundBackResource", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setBackResource(@NotNull View view, int resource) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setBackgroundResource(resource);
        }

        @JvmStatic
        public final void setImageResource(@NotNull ImageView view, int resource) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setImageResource(resource);
        }

        @JvmStatic
        public final void setImgBackResource(@NotNull ImageView view, int resource) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setBackgroundResource(resource);
        }

        @JvmStatic
        public final void setRoundBackResource(@NotNull ImageView view, int resource) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @JvmStatic
    public static final void setBackResource(@NotNull View view, int i) {
        INSTANCE.setBackResource(view, i);
    }

    @JvmStatic
    public static final void setImageResource(@NotNull ImageView imageView, int i) {
        INSTANCE.setImageResource(imageView, i);
    }

    @JvmStatic
    public static final void setImgBackResource(@NotNull ImageView imageView, int i) {
        INSTANCE.setImgBackResource(imageView, i);
    }

    @JvmStatic
    public static final void setRoundBackResource(@NotNull ImageView imageView, int i) {
        INSTANCE.setRoundBackResource(imageView, i);
    }
}
