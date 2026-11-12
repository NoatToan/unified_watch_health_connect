package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u000b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "other", "", "compareTo", "", "", "equals", "hashCode", "", "toString", "weight", LogUtil.I, "getWeight", "()I", "<init>", "(I)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class FontWeight implements Comparable<FontWeight> {

    @NotNull
    private static final FontWeight Black;

    @NotNull
    private static final FontWeight Bold;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FontWeight ExtraBold;

    @NotNull
    private static final FontWeight ExtraLight;

    @NotNull
    private static final FontWeight Light;

    @NotNull
    private static final FontWeight Medium;

    @NotNull
    private static final FontWeight Normal;

    @NotNull
    private static final FontWeight SemiBold;

    @NotNull
    private static final FontWeight Thin;

    @NotNull
    private static final FontWeight W100;

    @NotNull
    private static final FontWeight W200;

    @NotNull
    private static final FontWeight W300;

    @NotNull
    private static final FontWeight W400;

    @NotNull
    private static final FontWeight W500;

    @NotNull
    private static final FontWeight W600;

    @NotNull
    private static final FontWeight W700;

    @NotNull
    private static final FontWeight W800;

    @NotNull
    private static final FontWeight W900;

    @NotNull
    private static final List<FontWeight> values;
    private final int weight;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\"\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R\"\u0010!\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0004\u0012\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0006R\"\u0010$\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0004\u0012\u0004\b&\u0010\b\u001a\u0004\b%\u0010\u0006R\"\u0010'\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0004\u0012\u0004\b)\u0010\b\u001a\u0004\b(\u0010\u0006R\"\u0010*\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u0004\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010\u0006R\"\u0010-\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0004\u0012\u0004\b/\u0010\b\u001a\u0004\b.\u0010\u0006R\"\u00100\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u0004\u0012\u0004\b2\u0010\b\u001a\u0004\b1\u0010\u0006R\"\u00103\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u0004\u0012\u0004\b5\u0010\b\u001a\u0004\b4\u0010\u0006R\"\u00106\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u0004\u0012\u0004\b8\u0010\b\u001a\u0004\b7\u0010\u0006R\"\u00109\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010\u0004\u0012\u0004\b;\u0010\b\u001a\u0004\b:\u0010\u0006R\"\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "Landroidx/compose/ui/text/font/FontWeight;", "W100", "Landroidx/compose/ui/text/font/FontWeight;", "getW100", "()Landroidx/compose/ui/text/font/FontWeight;", "getW100$annotations", "()V", "W200", "getW200", "getW200$annotations", "W300", "getW300", "getW300$annotations", "W400", "getW400", "getW400$annotations", "W500", "getW500", "getW500$annotations", "W600", "getW600", "getW600$annotations", "W700", "getW700", "getW700$annotations", "W800", "getW800", "getW800$annotations", "W900", "getW900", "getW900$annotations", "Thin", "getThin", "getThin$annotations", "ExtraLight", "getExtraLight", "getExtraLight$annotations", "Light", "getLight", "getLight$annotations", StatEvent.VALUE_NORMAL, "getNormal", "getNormal$annotations", "Medium", "getMedium", "getMedium$annotations", "SemiBold", "getSemiBold", "getSemiBold$annotations", "Bold", "getBold", "getBold$annotations", "ExtraBold", "getExtraBold", "getExtraBold$annotations", "Black", "getBlack", "getBlack$annotations", "", "values", "Ljava/util/List;", "getValues$ui_text_release", "()Ljava/util/List;", "<init>", "ui-text_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getBlack$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getMedium$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNormal$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSemiBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getThin$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW100$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW200$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW300$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW400$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW500$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW600$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW700$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW800$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW900$annotations() {
        }

        @NotNull
        public final FontWeight getBlack() {
            return FontWeight.Black;
        }

        @NotNull
        public final FontWeight getBold() {
            return FontWeight.Bold;
        }

        @NotNull
        public final FontWeight getExtraBold() {
            return FontWeight.ExtraBold;
        }

        @NotNull
        public final FontWeight getExtraLight() {
            return FontWeight.ExtraLight;
        }

        @NotNull
        public final FontWeight getLight() {
            return FontWeight.Light;
        }

        @NotNull
        public final FontWeight getMedium() {
            return FontWeight.Medium;
        }

        @NotNull
        public final FontWeight getNormal() {
            return FontWeight.Normal;
        }

        @NotNull
        public final FontWeight getSemiBold() {
            return FontWeight.SemiBold;
        }

        @NotNull
        public final FontWeight getThin() {
            return FontWeight.Thin;
        }

        @NotNull
        public final List<FontWeight> getValues$ui_text_release() {
            return FontWeight.values;
        }

        @NotNull
        public final FontWeight getW100() {
            return FontWeight.W100;
        }

        @NotNull
        public final FontWeight getW200() {
            return FontWeight.W200;
        }

        @NotNull
        public final FontWeight getW300() {
            return FontWeight.W300;
        }

        @NotNull
        public final FontWeight getW400() {
            return FontWeight.W400;
        }

        @NotNull
        public final FontWeight getW500() {
            return FontWeight.W500;
        }

        @NotNull
        public final FontWeight getW600() {
            return FontWeight.W600;
        }

        @NotNull
        public final FontWeight getW700() {
            return FontWeight.W700;
        }

        @NotNull
        public final FontWeight getW800() {
            return FontWeight.W800;
        }

        @NotNull
        public final FontWeight getW900() {
            return FontWeight.W900;
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        W100 = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        W200 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        W300 = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        W400 = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        W500 = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        W600 = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        W700 = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        W800 = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        W900 = fontWeight9;
        Thin = fontWeight;
        ExtraLight = fontWeight2;
        Light = fontWeight3;
        Normal = fontWeight4;
        Medium = fontWeight5;
        SemiBold = fontWeight6;
        Bold = fontWeight7;
        ExtraBold = fontWeight8;
        Black = fontWeight9;
        values = CollectionsKt__CollectionsKt.listOf((Object[]) new FontWeight[]{fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9});
    }

    public FontWeight(int i) {
        this.weight = i;
        boolean z = false;
        if (1 <= i && i <= 1000) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Font weight can be in range [1, 1000]. Current value: ", Integer.valueOf(getWeight())).toString());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontWeight) && this.weight == ((FontWeight) other).weight;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.weight;
    }

    @NotNull
    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull FontWeight other) {
        return Intrinsics.compare(this.weight, other.weight);
    }
}
