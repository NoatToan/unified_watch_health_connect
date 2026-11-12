package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003J\u0017\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0003J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0096\u0003J\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0096\u0001J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\n8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamily;", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "", "Landroidx/compose/ui/text/font/Font;", "element", "", SearchCriteria.CONTAINS, "", MessengerShareContentUtility.ELEMENTS, "containsAll", "", "index", "get", "indexOf", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "equals", "hashCode", "", "toString", "fonts", "Ljava/util/List;", "getFonts", "()Ljava/util/List;", "getSize", "()I", "size", "<init>", "(Ljava/util/List;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class FontListFontFamily extends FileBasedFontFamily implements List<Font>, KMappedMarker {

    @NotNull
    private final List<Font> fonts;

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamily(@NotNull List<? extends Font> list) {
        super(null);
        this.fonts = list;
        if (!(!list.isEmpty())) {
            throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
        }
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object obj = list.get(i);
                Font font = (Font) obj;
                if (hashSet.add(new Pair(font.getWeight(), FontStyle.m2757boximpl(font.getStyle())))) {
                    arrayList.add(obj);
                }
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (!(arrayList.size() == this.fonts.size())) {
            throw new IllegalStateException("There cannot be two fonts with the same FontWeight and FontStyle in the same FontFamily".toString());
        }
    }

    @Override // java.util.List
    public void add(int i, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Font element) {
        return this.fonts.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Font) {
            return contains((Font) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        return this.fonts.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontListFontFamily) && Intrinsics.areEqual(this.fonts, ((FontListFontFamily) other).fonts);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @NotNull
    public Font get(int index) {
        return this.fonts.get(index);
    }

    @NotNull
    public final List<Font> getFonts() {
        return this.fonts;
    }

    public int getSize() {
        return this.fonts.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    public int indexOf(@NotNull Font element) {
        return this.fonts.indexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Font) {
            return indexOf((Font) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.fonts.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Font> iterator() {
        return this.fonts.iterator();
    }

    public int lastIndexOf(@NotNull Font element) {
        return this.fonts.lastIndexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Font) {
            return lastIndexOf((Font) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Font> listIterator() {
        return this.fonts.listIterator();
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Font> listIterator(int index) {
        return this.fonts.listIterator(index);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Font remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Font remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Font> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Font set(int i, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Font> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<Font> subList(int fromIndex, int toIndex) {
        return this.fonts.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    @NotNull
    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }
}
