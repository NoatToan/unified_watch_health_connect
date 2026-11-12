package l52;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Stack;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\rB\u0017\b\u0012\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u000e"}, d2 = {"Ll52/m;", "Landroid/os/Parcelable;", "T", "Ll52/s;", "Ll52/e;", "Ll52/f$c;", "root", "<init>", "(Ll52/f$c;)V", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m<T extends Parcelable> implements Parcelable, s<T>, e<T> {
    public static final Parcelable.Creator<m<Parcelable>> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.c<T> f110306a;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"l52/m$a", "Landroid/os/Parcelable$Creator;", "Ll52/m;", "Landroid/os/Parcelable;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m<Parcelable>> {
        @Override // android.os.Parcelable.Creator
        public final m<Parcelable> createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m<>(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final m<Parcelable>[] newArray(int i14) {
            return new m[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    private m(Parcel parcel) {
        Serializable serializable = parcel.readSerializable();
        serializable.getClass();
        f.c<T> cVar = new f.c<>((UUID) serializable);
        this.f110306a = cVar;
        if (parcel.readByte() == 0) {
            return;
        }
        Serializable serializable2 = parcel.readSerializable();
        serializable2.getClass();
        Class cls = (Class) serializable2;
        while (true) {
            byte b14 = parcel.readByte();
            if (b14 == 0) {
                Parcelable parcelable = parcel.readParcelable(cls.getClassLoader());
                Serializable serializable3 = parcel.readSerializable();
                serializable3.getClass();
                parcelable.getClass();
                f.b bVar = new f.b(parcelable, (UUID) serializable3);
                cVar.l(bVar);
                cVar = (f.c<T>) bVar;
            } else if (b14 == 1) {
                Parcelable parcelable2 = parcel.readParcelable(cls.getClassLoader());
                Serializable serializable4 = parcel.readSerializable();
                serializable4.getClass();
                Serializable serializable5 = parcel.readSerializable();
                serializable5.getClass();
                parcelable2.getClass();
                f.a aVar = new f.a(parcelable2, new f.c((UUID) serializable5), (UUID) serializable4);
                cVar.l(aVar);
                cVar = aVar.f110252f;
            } else {
                if (b14 != 2) {
                    return;
                }
                cVar = cVar.f110250d;
                cVar.getClass();
            }
        }
    }

    @Override // l52.i
    public final e.b J() {
        return this.f110306a.f110249c.c();
    }

    @Override // l52.i
    public final m L1(e23.l lVar) {
        lVar.getClass();
        return new m(this.f110306a.e(lVar));
    }

    @Override // l52.s
    public final <R> Object b(h hVar, t<T, R> tVar) {
        hVar.getClass();
        return this.f110306a.b(hVar, tVar);
    }

    @Override // l52.i
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public final e.b<T> K1() {
        return this.f110306a.f110248b.c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f110306a, ((m) obj).f110306a);
    }

    @Override // l52.e
    public final void j2(e23.l<? super j<T>, Unit> lVar) {
        this.f110306a.i(lVar);
    }

    @Override // l52.i
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final e.b<T> n3(i.b<T> bVar) {
        bVar.getClass();
        Object obj = null;
        if (!(bVar instanceof g)) {
            return null;
        }
        f<T> fVarInvoke = this.f110306a;
        fVarInvoke.getClass();
        Iterator<e23.l<f<T>, f<T>>> it = ((g) bVar).f110261a.iterator();
        while (it.hasNext()) {
            fVarInvoke = it.next().invoke(fVarInvoke);
            if (fVarInvoke == null) {
                fVarInvoke = null;
                break;
            }
        }
        if (fVarInvoke == null) {
            return null;
        }
        if ((fVarInvoke instanceof f.a) || (fVarInvoke instanceof f.b)) {
            obj = fVarInvoke;
        } else if (!(fVarInvoke instanceof f.c)) {
            lc.u0.r();
            return null;
        }
        return (e.b) obj;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f.c<T> cVar = this.f110306a;
        parcel.writeSerializable(cVar.f110247a);
        h hVar = h.PRE_ORDER;
        Object objB = o.b(cVar, hVar, new ky0.c(22));
        int i15 = o13.q.f128596b;
        if (objB instanceof o13.q.b) {
            objB = null;
        }
        Parcelable parcelable = (Parcelable) objB;
        if (parcelable == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeSerializable(parcelable.getClass());
        Stack stack = new Stack();
        o.a(cVar, hVar, new androidx.media3.exoplayer.u(stack, parcel, i14, 8));
        while (!stack.isEmpty()) {
            parcel.writeByte((byte) 2);
            stack.pop();
        }
        parcel.writeByte((byte) 3);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll52/m$b;", "", "<init>", "()V", "", "LEAF", "B", "INTERNAL_START", "INTERNAL_END", "PARCEL_END", "NO_ELEMENT", "HAS_ELEMENT", "Landroid/os/Parcelable$Creator;", "Ll52/m;", "Landroid/os/Parcelable;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    private m(f.c<T> cVar) {
        this.f110306a = cVar;
    }

    public m() {
        this.f110306a = new f.c<>();
    }

    public /* synthetic */ m(Parcel parcel, p005kotlin.jvm.internal.j jVar) {
        this(parcel);
    }
}
