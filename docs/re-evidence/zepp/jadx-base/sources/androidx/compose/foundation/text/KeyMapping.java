package androidx.compose.foundation.text;

import android.view.KeyEvent;
import com.huami.moving.ui.utils.SportAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/KeyMapping;", "", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "Landroidx/compose/foundation/text/KeyCommand;", "map-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/KeyCommand;", SportAnalytics.ParamValue.MapButtonType.MAP, "foundation_release"}, k = 1, mv = {1, 5, 1})
public interface KeyMapping {
    @Nullable
    /* JADX INFO: renamed from: map-ZmokQxo, reason: not valid java name */
    KeyCommand mo419mapZmokQxo(@NotNull KeyEvent event);
}
