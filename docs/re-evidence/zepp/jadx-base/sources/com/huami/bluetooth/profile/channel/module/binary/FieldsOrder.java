package com.huami.bluetooth.profile.channel.module.binary;

import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/FieldsOrder;", "", "Ljava/lang/reflect/Field;", "field", "", "a", "Lcom/huami/bluetooth/profile/channel/module/binary/Layout;", "layout", "", "sort", "(Lcom/huami/bluetooth/profile/channel/module/binary/Layout;)[Ljava/lang/reflect/Field;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FieldsOrder {

    @NotNull
    public static final FieldsOrder INSTANCE = new FieldsOrder();

    private FieldsOrder() {
    }

    private final int a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        int length = declaredAnnotations.length;
        int i = 0;
        while (i < length) {
            Annotation annotation = declaredAnnotations[i];
            i++;
            if (annotation instanceof Order) {
                return ((Order) annotation).value();
            }
        }
        return 0;
    }

    @NotNull
    public final Field[] sort(@NotNull Layout layout) {
        Field[] fields = layout.getClass().getFields();
        ArrayList arrayList = new ArrayList();
        int length = fields.length;
        int i = 0;
        while (i < length) {
            Field field = fields[i];
            i++;
            arrayList.add(new BinaryDecoder.OrderLayout(field, a(field)));
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator<T>() { // from class: com.huami.bluetooth.profile.channel.module.binary.FieldsOrder$sort$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BinaryDecoder.OrderLayout) t).b), Integer.valueOf(((BinaryDecoder.OrderLayout) t2).b));
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((BinaryDecoder.OrderLayout) it2.next()).a);
        }
        Object[] array = arrayList2.toArray(new Field[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (Field[]) array;
    }
}
