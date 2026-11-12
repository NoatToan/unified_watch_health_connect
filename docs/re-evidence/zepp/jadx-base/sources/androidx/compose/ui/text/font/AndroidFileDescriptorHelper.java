package androidx.compose.ui.text.font;

import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileDescriptorHelper;", "", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "Landroid/graphics/Typeface;", "create", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
final class AndroidFileDescriptorHelper {

    @NotNull
    public static final AndroidFileDescriptorHelper INSTANCE = new AndroidFileDescriptorHelper();

    private AndroidFileDescriptorHelper() {
    }

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final android.graphics.Typeface create(@NotNull ParcelFileDescriptor fileDescriptor) {
        return new android.graphics.Typeface.Builder(fileDescriptor.getFileDescriptor()).build();
    }
}
