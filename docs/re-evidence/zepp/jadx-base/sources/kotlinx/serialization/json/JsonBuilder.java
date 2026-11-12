package kotlinx.serialization.json;

import com.amap.api.mapcore.util.hl;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR(\u0010&\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\b\u001a\u0004\b(\u0010\n\"\u0004\b)\u0010\fR\"\u0010.\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\b\u001a\u0004\b,\u0010\n\"\u0004\b-\u0010\fR\"\u00102\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\"\u00106\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\b\u001a\u0004\b4\u0010\n\"\u0004\b5\u0010\fR\"\u0010:\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\b\u001a\u0004\b8\u0010\n\"\u0004\b9\u0010\fR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006G"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlinx/serialization/json/JsonConfiguration;", "build$kotlinx_serialization_json", "()Lkotlinx/serialization/json/JsonConfiguration;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "encodeDefaults", "b", "getIgnoreUnknownKeys", "setIgnoreUnknownKeys", "ignoreUnknownKeys", "c", "isLenient", "setLenient", GoogleApiAvailabilityLight.a, "getAllowStructuredMapKeys", "setAllowStructuredMapKeys", "allowStructuredMapKeys", "e", "getPrettyPrint", "setPrettyPrint", "prettyPrint", "", "f", "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "getPrettyPrintIndent$annotations", "()V", "prettyPrintIndent", "g", "getCoerceInputValues", "setCoerceInputValues", "coerceInputValues", "h", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "useArrayPolymorphism", "i", "getClassDiscriminator", "setClassDiscriminator", "classDiscriminator", z.j, "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", hl.k, "getUseAlternativeNames", "setUseAlternativeNames", "useAlternativeNames", "Lkotlinx/serialization/modules/SerializersModule;", "l", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "setSerializersModule", "(Lkotlinx/serialization/modules/SerializersModule;)V", "serializersModule", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public final class JsonBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean encodeDefaults;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean ignoreUnknownKeys;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isLenient;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean allowStructuredMapKeys;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean prettyPrint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String prettyPrintIndent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean coerceInputValues;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String classDiscriminator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean allowSpecialFloatingPointValues;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean useAlternativeNames;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private SerializersModule serializersModule;

    public JsonBuilder(@NotNull Json json) {
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().getIsLenient();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        this.serializersModule = json.getSerializersModule();
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }

    @NotNull
    public final JsonConfiguration build$kotlinx_serialization_json() {
        if (this.useArrayPolymorphism && !Intrinsics.areEqual(this.classDiscriminator, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (this.prettyPrint) {
            if (!Intrinsics.areEqual(this.prettyPrintIndent, "    ")) {
                String str = this.prettyPrintIndent;
                boolean z = false;
                int i = 0;
                while (true) {
                    boolean z2 = true;
                    if (i >= str.length()) {
                        z = true;
                        break;
                    }
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    i++;
                }
                if (!z) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ", getPrettyPrintIndent()).toString());
                }
            }
        } else if (!Intrinsics.areEqual(this.prettyPrintIndent, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames);
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

    @NotNull
    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
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

    public final void setAllowSpecialFloatingPointValues(boolean z) {
        this.allowSpecialFloatingPointValues = z;
    }

    public final void setAllowStructuredMapKeys(boolean z) {
        this.allowStructuredMapKeys = z;
    }

    public final void setClassDiscriminator(@NotNull String str) {
        this.classDiscriminator = str;
    }

    public final void setCoerceInputValues(boolean z) {
        this.coerceInputValues = z;
    }

    public final void setEncodeDefaults(boolean z) {
        this.encodeDefaults = z;
    }

    public final void setIgnoreUnknownKeys(boolean z) {
        this.ignoreUnknownKeys = z;
    }

    public final void setLenient(boolean z) {
        this.isLenient = z;
    }

    public final void setPrettyPrint(boolean z) {
        this.prettyPrint = z;
    }

    public final void setPrettyPrintIndent(@NotNull String str) {
        this.prettyPrintIndent = str;
    }

    public final void setSerializersModule(@NotNull SerializersModule serializersModule) {
        this.serializersModule = serializersModule;
    }

    public final void setUseAlternativeNames(boolean z) {
        this.useAlternativeNames = z;
    }

    public final void setUseArrayPolymorphism(boolean z) {
        this.useArrayPolymorphism = z;
    }
}
