package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.AbstractMapBuilderEntrySet;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u0017\u001a\u00020\u00102\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u001b\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u001cH\u0096\u0002J\"\u0010\u001d\u001a\u00020\u00102\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0019H\u0016J\"\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0019H\u0016J\"\u0010\u001f\u001a\u00020\u00102\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0019H\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lkotlin/collections/builders/MapBuilderEntries;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "", "backing", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "getBacking", "()Lkotlin/collections/builders/MapBuilder;", "size", "", "getSize", "()I", "isEmpty", "", "containsEntry", FunctionSetBeanReader.BI_ELEMENT, "", CervicalMucusRecord.Appearance.CLEAR, "", "add", "addAll", "elements", "", EventType.REMOVE, "iterator", "", "containsAll", "removeAll", "retainAll", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zap<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zam<K, V> f53944c;

    public zap(zam<K, V> zamVar) {
        zcp.c(zamVar, "");
        this.f53944c = zamVar;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f53944c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f53944c.isEmpty();
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public boolean containsEntry(Map.Entry<? extends K, ? extends V> element) {
        zcp.c(element, "");
        return this.f53944c.e((Map.Entry) element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f53944c.clear();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> entry) {
        zcp.c(entry, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        zcp.c(elements, "");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public boolean remove(Map.Entry<K, V> element) {
        zcp.c(element, "");
        return this.f53944c.a((Map.Entry) element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f53944c.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> elements) {
        zcp.c(elements, "");
        return this.f53944c.c(elements);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> elements) {
        zcp.c(elements, "");
        this.f53944c.e();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> elements) {
        zcp.c(elements, "");
        this.f53944c.e();
        return super.retainAll(elements);
    }
}
