package androidx.compose.ui.layout;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u00020\u00028W@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/GraphicLayerInfo;", "", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "getOwnerViewId$annotations", "()V", "ownerViewId", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface GraphicLayerInfo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @ExperimentalComposeUiApi
        public static long getOwnerViewId(@NotNull GraphicLayerInfo graphicLayerInfo) {
            return 0L;
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getOwnerViewId$annotations() {
        }
    }

    long getLayerId();

    @ExperimentalComposeUiApi
    long getOwnerViewId();
}
