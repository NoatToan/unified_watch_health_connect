package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.TempListUtilsKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0086\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0019\u0010\f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "decoration", "plus", "other", "", SearchCriteria.CONTAINS, "", "toString", "equals", "", "hashCode", "mask", LogUtil.I, "getMask", "()I", "<init>", "(I)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class TextDecoration {
    private final int mask;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextDecoration None = new TextDecoration(0);

    @NotNull
    private static final TextDecoration Underline = new TextDecoration(1);

    @NotNull
    private static final TextDecoration LineThrough = new TextDecoration(2);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\"\u0010\u000f\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "", "Landroidx/compose/ui/text/style/TextDecoration;", "decorations", "combine", "None", "Landroidx/compose/ui/text/style/TextDecoration;", "getNone", "()Landroidx/compose/ui/text/style/TextDecoration;", "getNone$annotations", "()V", "Underline", "getUnderline", "getUnderline$annotations", "LineThrough", "getLineThrough", "getLineThrough$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getLineThrough$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @Stable
        public static /* synthetic */ void getUnderline$annotations() {
        }

        @NotNull
        public final TextDecoration combine(@NotNull List<TextDecoration> decorations) {
            int i = 0;
            Integer numValueOf = 0;
            int size = decorations.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    numValueOf = Integer.valueOf(decorations.get(i).getMask() | numValueOf.intValue());
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            return new TextDecoration(numValueOf.intValue());
        }

        @NotNull
        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        @NotNull
        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        @NotNull
        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }
    }

    public TextDecoration(int i) {
        this.mask = i;
    }

    public final boolean contains(@NotNull TextDecoration other) {
        int i = this.mask;
        return (other.mask | i) == i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TextDecoration) && this.mask == ((TextDecoration) other).mask;
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    @NotNull
    public final TextDecoration plus(@NotNull TextDecoration decoration) {
        return new TextDecoration(decoration.mask | this.mask);
    }

    @NotNull
    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & LineThrough.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return Intrinsics.stringPlus("TextDecoration.", arrayList.get(0));
        }
        return "TextDecoration[" + TempListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + JsonLexerKt.END_LIST;
    }
}
