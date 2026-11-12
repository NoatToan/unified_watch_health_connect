package im;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.chartingv2.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000b"}, d2 = {"Lim/c0;", "Lim/b;", "", "chartType", "<init>", "(I)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "CREATOR", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends b {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public rm.b X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.X0 = (rm.b) parcel.readParcelable(rm.b.class.getClassLoader());
    }

    public final double A(List<String> list) {
        double dO;
        LinkedHashMap linkedHashMap;
        list.getClass();
        double d14 = 0.0d;
        for (String str : list) {
            rm.b bVar = this.X0;
            List list2 = (bVar == null || (linkedHashMap = bVar.f153506a) == null) ? null : (List) linkedHashMap.get(str);
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((Entry) it.next()).getVal()));
                }
                dO = h0.O(arrayList);
            } else {
                dO = 0.0d;
            }
            d14 += dO;
        }
        return d14 / ((double) list.size());
    }

    @Override // im.b, zm.p
    public final double getTotalDuration() {
        return 0.0d;
    }

    /* JADX INFO: renamed from: im.c0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lim/c0$a;", "Landroid/os/Parcelable$Creator;", "Lim/c0;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<c0> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }

        private Companion() {
        }
    }

    public c0(int i14) {
        super(i14);
    }
}
