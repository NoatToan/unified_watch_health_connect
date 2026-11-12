package androidx.compose.ui.text.font;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "style", LogUtil.I, "getStyle-_-LCdwA", "()I", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "typefaceInternal", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typeface", "<init>", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidFileFont implements AndroidFont {

    @NotNull
    private final File file;
    private final int style;
    private final android.graphics.Typeface typefaceInternal;

    @NotNull
    private final FontWeight weight;

    private AndroidFileFont(File file, FontWeight fontWeight, int i) {
        this.file = file;
        this.weight = fontWeight;
        this.style = i;
        this.typefaceInternal = android.graphics.Typeface.createFromFile(file);
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, fontWeight, i);
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.AndroidFont
    @NotNull
    /* JADX INFO: renamed from: getTypeface, reason: from getter */
    public android.graphics.Typeface getTypefaceInternal() {
        return this.typefaceInternal;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight, (i2 & 4) != 0 ? FontStyle.INSTANCE.m2765getNormal_LCdwA() : i, null);
    }
}
