package kotlinx.serialization.json;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001Bw\b\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0019\u0010!\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0019\u0010$\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0019\u0010'\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0019\u0010*\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\b¨\u0006-"}, d2 = {"Lkotlinx/serialization/json/JsonConfiguration;", "", "", "toString", "", "a", "Z", "getEncodeDefaults", "()Z", "encodeDefaults", "b", "getIgnoreUnknownKeys", "ignoreUnknownKeys", "c", "isLenient", GoogleApiAvailabilityLight.a, "getAllowStructuredMapKeys", "allowStructuredMapKeys", "e", "getPrettyPrint", "prettyPrint", "f", "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "getPrettyPrintIndent$annotations", "()V", "prettyPrintIndent", "g", "getCoerceInputValues", "coerceInputValues", "h", "getUseArrayPolymorphism", "useArrayPolymorphism", "i", "getClassDiscriminator", "classDiscriminator", z.j, "getAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", hl.k, "getUseAlternativeNames", "useAlternativeNames", "<init>", "(ZZZZZLjava/lang/String;ZZLjava/lang/String;ZZ)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
@ExperimentalSerializationApi
public final class JsonConfiguration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean encodeDefaults;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean ignoreUnknownKeys;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isLenient;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean allowStructuredMapKeys;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean prettyPrint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String prettyPrintIndent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean coerceInputValues;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String classDiscriminator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final boolean allowSpecialFloatingPointValues;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean useAlternativeNames;

    public JsonConfiguration() {
        this(false, false, false, false, false, null, false, false, null, false, false, 2047, null);
    }

    public JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String str, boolean z6, boolean z7, @NotNull String str2, boolean z8, boolean z9) {
        this.encodeDefaults = z;
        this.ignoreUnknownKeys = z2;
        this.isLenient = z3;
        this.allowStructuredMapKeys = z4;
        this.prettyPrint = z5;
        this.prettyPrintIndent = str;
        this.coerceInputValues = z6;
        this.useArrayPolymorphism = z7;
        this.classDiscriminator = str2;
        this.allowSpecialFloatingPointValues = z8;
        this.useAlternativeNames = z9;
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    @NotNull
    public final String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    @NotNull
    public final String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    /* JADX INFO: renamed from: isLenient, reason: from getter */
    public final boolean getIsLenient() {
        return this.isLenient;
    }

    @NotNull
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.encodeDefaults + ", ignoreUnknownKeys=" + this.ignoreUnknownKeys + ", isLenient=" + this.isLenient + ", allowStructuredMapKeys=" + this.allowStructuredMapKeys + ", prettyPrint=" + this.prettyPrint + ", prettyPrintIndent='" + this.prettyPrintIndent + "', coerceInputValues=" + this.coerceInputValues + ", useArrayPolymorphism=" + this.useArrayPolymorphism + ", classDiscriminator='" + this.classDiscriminator + "', allowSpecialFloatingPointValues=" + this.allowSpecialFloatingPointValues + ')';
    }

    public /* synthetic */ JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7, String str2, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? "    " : str, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? "type" : str2, (i & 512) == 0 ? z8 : false, (i & 1024) != 0 ? true : z9);
    }
}
