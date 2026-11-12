package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.CollectionDeserializer;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@JsonAdapter(CollectionDeserializer.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0001B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfo2/b;", "Landroid/os/Parcelable;", "T", "", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", MapboxMap.QFE_LIMIT, MapboxMap.QFE_OFFSET, "totalResults", "", "results", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;IIILjava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b<T extends Parcelable> implements Collection<T>, Parcelable, f23.a {
    public static final Parcelable.Creator<b<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f72916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<T> f72920e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b<?>> {
        @Override // android.os.Parcelable.Creator
        public final b<?> createFromParcel(Parcel parcel) {
            parcel.getClass();
            Links links = (Links) parcel.readSerializable();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i17);
            int iD = 0;
            while (iD != i17) {
                iD = u0.d(b.class, parcel, arrayList, iD, 1);
            }
            return new b<>(links, i14, i15, i16, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b<?>[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Links links, int i14, int i15, int i16, List<? extends T> list) {
        links.getClass();
        list.getClass();
        this.f72916a = links;
        this.f72917b = i14;
        this.f72918c = i15;
        this.f72919d = i16;
        this.f72920e = list;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Parcelable)) {
            return false;
        }
        return this.f72920e.contains((Parcelable) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.f72920e.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f72916a.equals(bVar.f72916a) && this.f72917b == bVar.f72917b && this.f72918c == bVar.f72918c && this.f72919d == bVar.f72919d && this.f72920e.equals(bVar.f72920e);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f72920e.hashCode() + q2.d(this.f72919d, q2.d(this.f72918c, q2.d(this.f72917b, this.f72916a.f51142a.hashCode() * 31, 31), 31), 31);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f72920e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.f72920e.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super T> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f72920e.size();
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ApiCollection(links=");
        sb3.append(this.f72916a);
        sb3.append(", limit=");
        sb3.append(this.f72917b);
        sb3.append(", offset=");
        ds.e0.m(this.f72918c, this.f72919d, ", totalResults=", ", results=", sb3);
        return u62.z.c(sb3, this.f72920e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.f72916a);
        parcel.writeInt(this.f72917b);
        parcel.writeInt(this.f72918c);
        parcel.writeInt(this.f72919d);
        Iterator itE = kg.f.e(this.f72920e, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
