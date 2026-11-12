package yj;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f197468a;

    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    private c(Parcel parcel) {
        this.f197468a = new b(null);
        Bundle bundle = parcel.readBundle();
        bundle.setClassLoader(b.class.getClassLoader());
        this.f197468a = (b) bundle.getParcelable("com.dsi.ant.channel.antipcresult.bundledata");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.dsi.ant.channel.antipcresult.bundledata", this.f197468a);
        parcel.writeBundle(bundle);
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f197469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<IBinder> f197470b;

        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.readInt();
                b bVar = new b(null);
                bVar.f197469a = parcel.readBundle();
                bVar.f197470b = parcel.createBinderArrayList();
                return bVar;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        private b() {
            this.f197469a = null;
            this.f197470b = new ArrayList<>();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(1);
            parcel.writeBundle(this.f197469a);
            parcel.writeBinderList(this.f197470b);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public c() {
        this.f197468a = new b(null);
    }

    public /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }
}
