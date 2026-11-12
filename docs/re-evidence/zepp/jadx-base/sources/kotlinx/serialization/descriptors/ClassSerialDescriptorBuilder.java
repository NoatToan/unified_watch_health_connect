package kotlinx.serialization.descriptors;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tR\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001dR(\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060!8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001dR\"\u00101\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u001d¨\u00064"}, d2 = {"Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "", "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "annotations", "", "isOptional", "", "element", "a", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "serialName", "b", "Z", "isNullable", "()Z", "setNullable", "(Z)V", "isNullable$annotations", "()V", "c", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "setAnnotations", "(Ljava/util/List;)V", "getAnnotations$annotations", "", GoogleApiAvailabilityLight.a, "getElementNames$kotlinx_serialization_core", "elementNames", "", "e", "Ljava/util/Set;", "uniqueNames", "f", "getElementDescriptors$kotlinx_serialization_core", "elementDescriptors", "g", "getElementAnnotations$kotlinx_serialization_core", "elementAnnotations", "h", "getElementOptionality$kotlinx_serialization_core", "elementOptionality", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
public final class ClassSerialDescriptorBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isNullable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<? extends Annotation> annotations = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<String> elementNames = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Set<String> uniqueNames = new HashSet();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<SerialDescriptor> elementDescriptors = new ArrayList();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<List<Annotation>> elementAnnotations = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<Boolean> elementOptionality = new ArrayList();

    public ClassSerialDescriptorBuilder(@NotNull String str) {
        this.serialName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String str, SerialDescriptor serialDescriptor, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        classSerialDescriptorBuilder.element(str, serialDescriptor, list, z);
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAnnotations$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void isNullable$annotations() {
    }

    public final void element(@NotNull String elementName, @NotNull SerialDescriptor descriptor, @NotNull List<? extends Annotation> annotations, boolean isOptional) {
        if (this.uniqueNames.add(elementName)) {
            this.elementNames.add(elementName);
            this.elementDescriptors.add(descriptor);
            this.elementAnnotations.add(annotations);
            this.elementOptionality.add(Boolean.valueOf(isOptional));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered").toString());
    }

    @NotNull
    public final List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final List<List<Annotation>> getElementAnnotations$kotlinx_serialization_core() {
        return this.elementAnnotations;
    }

    @NotNull
    public final List<SerialDescriptor> getElementDescriptors$kotlinx_serialization_core() {
        return this.elementDescriptors;
    }

    @NotNull
    public final List<String> getElementNames$kotlinx_serialization_core() {
        return this.elementNames;
    }

    @NotNull
    public final List<Boolean> getElementOptionality$kotlinx_serialization_core() {
        return this.elementOptionality;
    }

    @NotNull
    public final String getSerialName() {
        return this.serialName;
    }

    /* JADX INFO: renamed from: isNullable, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    public final void setAnnotations(@NotNull List<? extends Annotation> list) {
        this.annotations = list;
    }

    public final void setNullable(boolean z) {
        this.isNullable = z;
    }
}
