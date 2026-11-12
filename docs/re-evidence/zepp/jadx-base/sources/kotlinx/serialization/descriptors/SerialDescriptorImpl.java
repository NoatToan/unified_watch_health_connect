package kotlinx.serialization.descriptors;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.loc.z;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u001c\u0010\u0018\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00198\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050)8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00010/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00010/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00104R\u001d\u0010E\u001a\u00020\u00038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b\u0014\u0010\"¨\u0006K"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "index", "", "getElementName", "name", "getElementIndex", "", "", "getElementAnnotations", "getElementDescriptor", "", "isElementOptional", "", "other", "equals", "hashCode", "toString", "a", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "serialName", "Lkotlinx/serialization/descriptors/SerialKind;", "b", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", XimalayaConst.KIND, "c", LogUtil.I, "getElementsCount", "()I", "elementsCount", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "e", "Ljava/util/Set;", "getSerialNames", "()Ljava/util/Set;", "serialNames", "", "f", "[Ljava/lang/String;", "elementNames", "g", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "h", "[Ljava/util/List;", "elementAnnotations", "", "i", "[Z", "elementOptionality", "", z.j, "Ljava/util/Map;", "name2Index", hl.k, "typeParametersDescriptors", "l", "Lkotlin/Lazy;", "_hashCode", "typeParameters", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "builder", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;ILjava/util/List;Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SerialKind kind;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int elementsCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<Annotation> annotations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Set<String> serialNames;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String[] elementNames;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final SerialDescriptor[] elementDescriptors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<Annotation>[] elementAnnotations;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final boolean[] elementOptionality;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Integer> name2Index;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final SerialDescriptor[] typeParametersDescriptors;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy _hashCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            SerialDescriptorImpl serialDescriptorImpl = SerialDescriptorImpl.this;
            return PluginGeneratedSerialDescriptorKt.hashCodeImpl(serialDescriptorImpl, serialDescriptorImpl.typeParametersDescriptors);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, CharSequence> {
        public b() {
            super(1);
        }

        @NotNull
        public final CharSequence a(int i) {
            return SerialDescriptorImpl.this.getElementName(i) + ": " + SerialDescriptorImpl.this.getElementDescriptor(i).getSerialName();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public SerialDescriptorImpl(@NotNull String str, @NotNull SerialKind serialKind, int i, @NotNull List<? extends SerialDescriptor> list, @NotNull ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        this.serialName = str;
        this.kind = serialKind;
        this.elementsCount = i;
        this.annotations = classSerialDescriptorBuilder.getAnnotations();
        this.serialNames = CollectionsKt___CollectionsKt.toHashSet(classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core());
        Object[] array = classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        this.elementNames = strArr;
        this.elementDescriptors = Platform_commonKt.compactArray(classSerialDescriptorBuilder.getElementDescriptors$kotlinx_serialization_core());
        Object[] array2 = classSerialDescriptorBuilder.getElementAnnotations$kotlinx_serialization_core().toArray(new List[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        this.elementAnnotations = (List[]) array2;
        this.elementOptionality = CollectionsKt___CollectionsKt.toBooleanArray(classSerialDescriptorBuilder.getElementOptionality$kotlinx_serialization_core());
        Iterable<IndexedValue> iterableWithIndex = ArraysKt___ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.name2Index = r.toMap(arrayList);
        this.typeParametersDescriptors = Platform_commonKt.compactArray(list);
        this._hashCode = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final int a() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) other;
            if (Intrinsics.areEqual(getSerialName(), serialDescriptor.getSerialName()) && Arrays.equals(this.typeParametersDescriptors, ((SerialDescriptorImpl) other).typeParametersDescriptors) && getElementsCount() == serialDescriptor.getElementsCount()) {
                int elementsCount = getElementsCount();
                if (elementsCount <= 0) {
                    return true;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (!Intrinsics.areEqual(getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) || !Intrinsics.areEqual(getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) {
                        break;
                    }
                    if (i2 >= elementsCount) {
                        return true;
                    }
                    i = i2;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        return this.elementAnnotations[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        return this.elementDescriptors[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Integer num = this.name2Index.get(name);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int index) {
        return this.elementNames[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    @NotNull
    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    public int hashCode() {
        return a();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        return this.elementOptionality[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: isInline */
    public boolean getIsInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(e.until(0, getElementsCount()), ", ", Intrinsics.stringPlus(getSerialName(), "("), ")", 0, null, new b(), 24, null);
    }
}
