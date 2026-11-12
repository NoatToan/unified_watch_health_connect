package nr0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zk0.c;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lnr0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f127607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f127608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f127609c;

    /* JADX INFO: renamed from: nr0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"nr0/a$a", "Landroid/os/Parcelable$Creator;", "Lnr0/a;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2449a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new C2449a();
    }

    public a(Parcel parcel) {
        parcel.getClass();
        this.f127607a = (c) parcel.readParcelable(c.class.getClassLoader());
        this.f127608b = (h) parcel.readParcelable(h.class.getClassLoader());
        this.f127609c = (h) parcel.readParcelable(h.class.getClassLoader());
    }

    public final int b() {
        h hVar = this.f127609c;
        if (hVar == null) {
            return 0;
        }
        hVar.getClass();
        return hVar.C();
    }

    public final int d() {
        c cVar = this.f127607a;
        if (cVar == null) {
            return 0;
        }
        cVar.getClass();
        Integer userGoal = cVar.getUserGoal();
        userGoal.getClass();
        return userGoal.intValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean f() {
        return this.f127609c != null;
    }

    public final void g(int i14) {
        if (this.f127609c == null) {
            h hVar = new h();
            this.f127609c = hVar;
            hVar.goalType = "INTENSITY_MINUTES";
        }
        h hVar2 = this.f127609c;
        hVar2.getClass();
        hVar2.D(i14);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f127607a, i14);
        parcel.writeParcelable(this.f127608b, i14);
        parcel.writeParcelable(this.f127609c, i14);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnr0/a$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lnr0/a;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public a() {
    }
}
