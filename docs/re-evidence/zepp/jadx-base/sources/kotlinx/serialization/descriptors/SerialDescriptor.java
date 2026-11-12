package kotlinx.serialization.descriptors;

import com.huami.watch.companion.ximalaya.XimalayaConst;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H'R\u001c\u0010\u0012\u001a\u00020\u00048&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0017\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u00020\f8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u00020\f8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010 \u001a\u00020\u00028&@'X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0011\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "index", "", "getElementName", "name", "getElementIndex", "", "", "getElementAnnotations", "getElementDescriptor", "", "isElementOptional", "getSerialName", "()Ljava/lang/String;", "getSerialName$annotations", "()V", "serialName", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "getKind$annotations", XimalayaConst.KIND, "isNullable", "()Z", "isNullable$annotations", "isInline", "isInline$annotations", "getElementsCount", "()I", "getElementsCount$annotations", "elementsCount", "getAnnotations", "()Ljava/util/List;", "getAnnotations$annotations", "annotations", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
public interface SerialDescriptor {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static List<Annotation> getAnnotations(@NotNull SerialDescriptor serialDescriptor) {
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getAnnotations$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getElementsCount$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKind$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSerialName$annotations() {
        }

        public static boolean isInline(@NotNull SerialDescriptor serialDescriptor) {
            return false;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void isInline$annotations() {
        }

        public static boolean isNullable(@NotNull SerialDescriptor serialDescriptor) {
            return false;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void isNullable$annotations() {
        }
    }

    @NotNull
    List<Annotation> getAnnotations();

    @ExperimentalSerializationApi
    @NotNull
    List<Annotation> getElementAnnotations(int index);

    @ExperimentalSerializationApi
    @NotNull
    SerialDescriptor getElementDescriptor(int index);

    @ExperimentalSerializationApi
    int getElementIndex(@NotNull String name);

    @ExperimentalSerializationApi
    @NotNull
    String getElementName(int index);

    int getElementsCount();

    @NotNull
    SerialKind getKind();

    @NotNull
    String getSerialName();

    @ExperimentalSerializationApi
    boolean isElementOptional(int index);

    boolean isInline();

    boolean isNullable();
}
