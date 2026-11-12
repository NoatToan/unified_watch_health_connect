package oh2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bBI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Loh2/a;", "Landroid/os/Parcelable;", "", "Loh2/c;", "controlsMenuList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "watchFaceControlsList", "carouselListControlsList", "<init>", "(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f132164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<c> f132165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<c> f132166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi2.d f132167d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = f.a(c.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iA3 = 0;
            while (iA3 != i15) {
                iA3 = f.a(c.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            while (iA != i16) {
                iA = f.a(c.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new a(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C2509a(null);
        CREATOR = new b();
    }

    public a(List<c> list, ArrayList<c> arrayList, ArrayList<c> arrayList2) {
        list.getClass();
        arrayList.getClass();
        arrayList2.getClass();
        this.f132164a = list;
        this.f132165b = arrayList;
        this.f132166c = arrayList2;
        this.f132167d = new hi2.d("BoundedControlsMenuDTO", null, 2, null);
        arrayList.clear();
        arrayList2.clear();
        for (c cVar : list) {
            if (cVar.f132173b == 255 && !s.g(cVar.f132174c, Boolean.TRUE)) {
                arrayList2.add(cVar);
            } else if (!s.g(cVar.f132172a, "INVALID")) {
                arrayList.add(cVar);
            }
        }
    }

    public final c b(int i14, ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f132173b == i14) {
                return cVar;
            }
        }
        this.f132167d.b("BoundedControlsMenuEachItemDTO with index " + i14 + " not found");
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = f.e(this.f132164a, parcel);
        while (itE.hasNext()) {
            ((c) itE.next()).writeToParcel(parcel, i14);
        }
        ArrayList<c> arrayList = this.f132165b;
        parcel.writeInt(arrayList.size());
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i14);
        }
        ArrayList<c> arrayList2 = this.f132166c;
        parcel.writeInt(arrayList2.size());
        Iterator<c> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: oh2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Loh2/a$a;", "", "<init>", "()V", "", "CONTROLS_MENU_INVALID_CONTROL", "Ljava/lang/String;", "", "CONTROLS_MENU_INVALID_POSITION", "I", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2509a {
        public /* synthetic */ C2509a(j jVar) {
            this();
        }

        private C2509a() {
        }
    }

    public /* synthetic */ a(List list, ArrayList arrayList, ArrayList arrayList2, int i14, j jVar) {
        this(list, (i14 & 2) != 0 ? new ArrayList() : arrayList, (i14 & 4) != 0 ? new ArrayList() : arrayList2);
    }
}
