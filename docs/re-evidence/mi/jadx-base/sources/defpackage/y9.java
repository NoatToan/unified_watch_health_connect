package defpackage;

import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Ly9;", "", "Lcom/huami/bluetooth/profile/channel/module/binary/Layout;", "layout", "", "Ljava/lang/reflect/Field;", PluginDeviceInfo.FMODEL, "(Lcom/huami/bluetooth/profile/channel/module/binary/Layout;)[Ljava/lang/reflect/Field;", "field", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y9 f39942a = new y9();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BinaryDecoder.a) t).f9863b), Integer.valueOf(((BinaryDecoder.a) t2).f9863b));
        }
    }

    @NotNull
    public final Field[] a(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Field[] fields = layout.getClass().getFields();
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(fields, "fields");
        for (Field i : fields) {
            Intrinsics.checkNotNullExpressionValue(i, "i");
            arrayList.add(new BinaryDecoder.a(i, a(i)));
        }
        if (arrayList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new a());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((BinaryDecoder.a) it.next()).f9862a);
        }
        Object[] array = arrayList2.toArray(new Field[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Field[]) array;
    }

    public final int a(Field field) {
        Annotation[] annotations = field.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
        for (Annotation annotation : annotations) {
            if (annotation instanceof yn) {
                return ((yn) annotation).value();
            }
        }
        return 0;
    }
}
