package p3;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\tB\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lp3/c2;", "T", "Lp3/o3;", "Landroid/os/Parcelable;", "value", "Lp3/p3;", "policy", "<init>", "(Ljava/lang/Object;Lp3/p3;)V", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class c2<T> extends o3<T> implements Parcelable {
    public static final Parcelable.Creator<c2<Object>> CREATOR;

    static {
        new b(null);
        CREATOR = new a();
    }

    public c2(T t7, p3<T> p3Var) {
        super(t7, p3Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int i15;
        parcel.writeValue(getF182175a());
        t1 t1Var = t1.f135313a;
        t1Var.getClass();
        p3<T> p3Var = this.f135211b;
        if (p005kotlin.jvm.internal.s.g(p3Var, t1Var)) {
            i15 = 0;
        } else {
            a4 a4Var = a4.f135041a;
            a4Var.getClass();
            if (p005kotlin.jvm.internal.s.g(p3Var, a4Var)) {
                i15 = 1;
            } else {
                x2 x2Var = x2.f135386a;
                x2Var.getClass();
                if (!p005kotlin.jvm.internal.s.g(p3Var, x2Var)) {
                    vb.h.z("Only known types of MutableState's SnapshotMutationPolicy are supported");
                    return;
                }
                i15 = 2;
            }
        }
        parcel.writeInt(i15);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lp3/c2$b;", "", "<init>", "()V", "", "PolicyNeverEquals", "I", "PolicyStructuralEquality", "PolicyReferentialEquality", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"p3/c2$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lp3/c2;", "", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.ClassLoaderCreator<c2<Object>> {
        public static c2 a(Parcel parcel, ClassLoader classLoader) {
            p3 p3Var;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i14 = parcel.readInt();
            if (i14 == 0) {
                p3Var = t1.f135313a;
                p3Var.getClass();
            } else if (i14 == 1) {
                p3Var = a4.f135041a;
                p3Var.getClass();
            } else {
                if (i14 != 2) {
                    vb.h.z(v.e0.f(i14, "Unsupported MutableState policy ", " was restored"));
                    return null;
                }
                p3Var = x2.f135386a;
                p3Var.getClass();
            }
            return new c2(value, p3Var);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i14) {
            return new c2[i14];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ c2<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }
}
