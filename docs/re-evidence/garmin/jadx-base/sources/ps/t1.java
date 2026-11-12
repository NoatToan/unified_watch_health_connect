package ps;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0001\nB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lps/t1;", "Landroid/os/Parcelable;", "Lps/b1;", "metric", "", "", "values", "intervals", "<init>", "(Lps/b1;Ljava/util/List;Ljava/util/List;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class t1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f140222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Double> f140223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Double> f140224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f140221d = new a(null);
    public static final Parcelable.Creator<t1> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<t1> {
        @Override // android.os.Parcelable.Creator
        public final t1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            b1 b1Var = (b1) parcel.readParcelable(t1.class.getClassLoader());
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(Double.valueOf(parcel.readDouble()));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList2.add(Double.valueOf(parcel.readDouble()));
            }
            return new t1(b1Var, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final t1[] newArray(int i14) {
            return new t1[i14];
        }
    }

    public t1(b1 b1Var, List<Double> list, List<Double> list2) {
        b1Var.getClass();
        list.getClass();
        list2.getClass();
        this.f140222a = b1Var;
        this.f140223b = list;
        this.f140224c = list2;
    }

    public int b(Context context, Double d14) {
        context.getClass();
        List<Double> list = this.f140224c;
        boolean zIsEmpty = list.isEmpty();
        b1 b1Var = this.f140222a;
        if (zIsEmpty || d14 == null || Double.isNaN(d14.doubleValue())) {
            return a7.b.getColor(context, b1Var.f139696h);
        }
        int size = list.size();
        a aVar = f140221d;
        if (size == 1) {
            int[] iArr = b1Var.f139694f;
            int[] iArr2 = b1Var.f139693e;
            iArr2.getClass();
            Integer numValueOf = iArr2.length == 0 ? null : Integer.valueOf(iArr2[0]);
            return a.a(aVar, 0, iArr, a7.b.getColor(context, numValueOf != null ? numValueOf.intValue() : b1Var.f139696h));
        }
        int size2 = list.size();
        for (int i14 = 1; i14 < size2; i14++) {
            if (d14.doubleValue() < list.get(i14).doubleValue()) {
                int i15 = i14 - 1;
                return a.a(aVar, i15, b1Var.f139694f, a7.b.getColor(context, b1Var.f139693e[i15]));
            }
        }
        int[] iArr3 = b1Var.f139693e;
        int length = iArr3.length - 1;
        int[] iArr4 = b1Var.f139694f;
        if (iArr3.length != 0) {
            return a.a(aVar, length, iArr4, a7.b.getColor(context, iArr3[iArr3.length - 1]));
        }
        n23.j.s("Array is empty.");
        return 0;
    }

    public final LayerDrawable d(Context context) {
        context.getClass();
        b1 b1Var = this.f140222a;
        int[] iArr = b1Var.f139693e;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i14 : iArr) {
            arrayList.add(new ColorDrawable(a7.b.getColor(context, i14)));
        }
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) arrayList.toArray(new ColorDrawable[0]));
        f140221d.getClass();
        int i15 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        int[] iArr2 = b1Var.f139693e;
        int length = (iArr2.length * i15) - i15;
        int length2 = iArr2.length;
        int i16 = 0;
        for (int i17 = 0; i17 < length2; i17++) {
            layerDrawable.setLayerInset(i17, i16, 0, length - i16, 0);
            layerDrawable.setLayerWidth(i17, i15);
            i16 += i15;
        }
        return layerDrawable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        t1 t1Var = (t1) obj;
        return p005kotlin.jvm.internal.s.g(this.f140222a, t1Var.f140222a) && p005kotlin.jvm.internal.s.g(this.f140223b, t1Var.f140223b) && p005kotlin.jvm.internal.s.g(this.f140224c, t1Var.f140224c);
    }

    public final int hashCode() {
        return this.f140224c.hashCode() + lc.u0.b(this.f140222a.hashCode() * 31, 31, this.f140223b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f140222a, i14);
        Iterator itE = kg.f.e(this.f140223b, parcel);
        while (itE.hasNext()) {
            parcel.writeDouble(((Number) itE.next()).doubleValue());
        }
        Iterator itE2 = kg.f.e(this.f140224c, parcel);
        while (itE2.hasNext()) {
            parcel.writeDouble(((Number) itE2.next()).doubleValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lps/t1$a;", "", "<init>", "()V", "", "COLOR_DRAWABLE_SIZE", "F", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final int a(a aVar, int i14, int[] iArr, int i15) {
            aVar.getClass();
            try {
                return c7.d.e(i15, iArr.length > i14 ? iArr[i14] : 255);
            } catch (IllegalArgumentException unused) {
                return i15;
            }
        }

        private a() {
        }
    }

    public t1(b1 b1Var, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b1Var, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? p13.j0.f134944a : list2);
    }
}
