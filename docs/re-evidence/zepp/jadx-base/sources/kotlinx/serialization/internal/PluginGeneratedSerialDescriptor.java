package kotlinx.serialization.internal;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.loc.z;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 \u0012\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\bS\u0010TJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u001c\u0010\u001f\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0019\u0010(\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010/0+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R'\u0010A\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030=0+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b!\u0010@R#\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010+8@@\u0000X\u0080\u0084\u0002¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010DR\u001d\u0010G\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\b$\u0010'R\u0016\u0010K\u001a\u00020H8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020\f0\u00138V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00040O8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "", "", "a", "name", "", "isOptional", "", "addElement", "", "annotation", "pushAnnotation", "pushClassAnnotation", "index", "getElementDescriptor", "isElementOptional", "", "getElementAnnotations", "getElementName", "getElementIndex", "", "other", "equals", "hashCode", "toString", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "serialName", "Lkotlinx/serialization/internal/GeneratedSerializer;", "b", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "c", LogUtil.I, "getElementsCount", "()I", "elementsCount", GoogleApiAvailabilityLight.a, "added", "", "e", "[Ljava/lang/String;", "names", "", "f", "[Ljava/util/List;", "propertiesAnnotations", "g", "Ljava/util/List;", "classAnnotations", "", "h", "[Z", "elementsOptionality", "i", "Ljava/util/Map;", "indices", "Lkotlinx/serialization/KSerializer;", z.j, "Lkotlin/Lazy;", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", hl.k, "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "l", "_hashCode", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", XimalayaConst.KIND, "getAnnotations", "()Ljava/util/List;", "annotations", "", "getSerialNames", "()Ljava/util/Set;", "serialNames", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String serialName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final GeneratedSerializer<?> generatedSerializer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int elementsCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int added;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String[] names;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<Annotation>[] propertiesAnnotations;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private List<Annotation> classAnnotations;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final boolean[] elementsOptionality;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private Map<String, Integer> indices;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy childSerializers;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy typeParameterDescriptors;

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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
            return PluginGeneratedSerialDescriptorKt.hashCodeImpl(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n"}, d2 = {"", "Lkotlinx/serialization/KSerializer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<KSerializer<?>[]> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KSerializer<?>[] invoke() {
            GeneratedSerializer generatedSerializer = PluginGeneratedSerialDescriptor.this.generatedSerializer;
            KSerializer<?>[] kSerializerArrChildSerializers = generatedSerializer == null ? null : generatedSerializer.childSerializers();
            return kSerializerArrChildSerializers == null ? new KSerializer[0] : kSerializerArrChildSerializers;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "i", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Integer, CharSequence> {
        public c() {
            super(1);
        }

        @NotNull
        public final CharSequence a(int i) {
            return PluginGeneratedSerialDescriptor.this.getElementName(i) + ": " + PluginGeneratedSerialDescriptor.this.getElementDescriptor(i).getSerialName();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SerialDescriptor[]> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SerialDescriptor[] invoke() {
            KSerializer<?>[] kSerializerArrTypeParametersSerializers;
            GeneratedSerializer generatedSerializer = PluginGeneratedSerialDescriptor.this.generatedSerializer;
            ArrayList arrayList = null;
            if (generatedSerializer != null && (kSerializerArrTypeParametersSerializers = generatedSerializer.typeParametersSerializers()) != null) {
                arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                    arrayList.add(kSerializer.getDescriptor());
                }
            }
            return Platform_commonKt.compactArray(arrayList);
        }
    }

    public PluginGeneratedSerialDescriptor(@NotNull String str, @Nullable GeneratedSerializer<?> generatedSerializer, int i) {
        this.serialName = str;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = i;
        this.added = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i3 = this.elementsCount;
        this.propertiesAnnotations = new List[i3];
        this.elementsOptionality = new boolean[i3];
        this.indices = r.emptyMap();
        this.childSerializers = LazyKt__LazyJVMKt.lazy(new b());
        this.typeParameterDescriptors = LazyKt__LazyJVMKt.lazy(new d());
        this._hashCode = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final Map<String, Integer> a() {
        HashMap map = new HashMap();
        int length = this.names.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                map.put(this.names[i], Integer.valueOf(i));
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return map;
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pluginGeneratedSerialDescriptor.addElement(str, z);
    }

    private final KSerializer<?>[] b() {
        return (KSerializer[]) this.childSerializers.getValue();
    }

    private final int c() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    public final void addElement(@NotNull String name, boolean isOptional) {
        String[] strArr = this.names;
        int i = this.added + 1;
        this.added = i;
        strArr[i] = name;
        this.elementsOptionality[i] = isOptional;
        this.propertiesAnnotations[i] = null;
        if (i == this.elementsCount - 1) {
            this.indices = a();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) other;
            if (Intrinsics.areEqual(getSerialName(), serialDescriptor.getSerialName()) && Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor) other).getTypeParameterDescriptors$kotlinx_serialization_core()) && getElementsCount() == serialDescriptor.getElementsCount()) {
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
        List<Annotation> list = this.classAnnotations;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        return b()[index].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Integer num = this.indices.get(name);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int index) {
        return this.names[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    @NotNull
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    @NotNull
    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors.getValue();
    }

    public int hashCode() {
        return c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        return this.elementsOptionality[index];
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

    public final void pushAnnotation(@NotNull Annotation annotation) {
        List<Annotation> arrayList = this.propertiesAnnotations[this.added];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.propertiesAnnotations[this.added] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void pushClassAnnotation(@NotNull Annotation a2) {
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        this.classAnnotations.add(a2);
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(e.until(0, this.elementsCount), ", ", Intrinsics.stringPlus(getSerialName(), "("), ")", 0, null, new c(), 24, null);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : generatedSerializer, i);
    }
}
