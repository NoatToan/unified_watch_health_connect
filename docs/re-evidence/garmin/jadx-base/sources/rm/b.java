package rm;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.chartingv2.data.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lrm/b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f153506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f153507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f153508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f153509d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Parcel parcel) {
        this();
        parcel.getClass();
        int i14 = parcel.readInt();
        for (int i15 = 0; i15 < i14; i15++) {
            String string = parcel.readString();
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, Entry.CREATOR);
            if (string != null) {
                this.f153506a.put(string, arrayList);
            }
        }
        this.f153507b = parcel.readDouble();
        this.f153508c = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        LinkedHashMap linkedHashMap = this.f153506a;
        parcel.writeInt(linkedHashMap.size());
        for (String str : linkedHashMap.keySet()) {
            parcel.writeString(str);
            parcel.writeTypedList((List) linkedHashMap.get(str));
        }
        parcel.writeDouble(this.f153507b);
        parcel.writeDouble(this.f153508c);
    }

    /* JADX INFO: renamed from: rm.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lrm/b$a;", "Landroid/os/Parcelable$Creator;", "Lrm/b;", "<init>", "()V", "", "TIMESTAMP_KEY", "Ljava/lang/String;", "TANK_PRESSURE_KEY", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<b> {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }

        private Companion() {
        }
    }

    public b() {
        this.f153506a = new LinkedHashMap();
        this.f153507b = -1.0d;
        this.f153508c = -1.0d;
        this.f153509d = Double.MAX_VALUE;
    }
}
