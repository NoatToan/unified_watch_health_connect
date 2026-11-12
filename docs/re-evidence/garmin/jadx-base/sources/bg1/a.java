package bg1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"Lbg1/a;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f17842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17847l;

    public a(Parcel parcel) {
        parcel.getClass();
        this.f17837b = parcel.readLong();
        this.f17841f = parcel.readString();
        this.f17838c = parcel.readString();
        this.f17836a = parcel.readLong();
        this.f17839d = parcel.readInt();
        this.f17842g = parcel.readDouble();
        this.f17840e = parcel.readInt() == 1;
        this.f17843h = parcel.readString();
        this.f17844i = parcel.readInt();
        this.f17845j = parcel.readInt();
        this.f17846k = parcel.readLong();
        this.f17847l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f17837b);
        parcel.writeString(this.f17841f);
        parcel.writeString(this.f17838c);
        parcel.writeLong(this.f17836a);
        parcel.writeInt(this.f17839d);
        parcel.writeDouble(this.f17842g);
        parcel.writeInt(this.f17840e ? 1 : 0);
        parcel.writeString(this.f17843h);
        parcel.writeInt(this.f17844i);
        parcel.writeInt(this.f17845j);
        parcel.writeLong(this.f17846k);
        parcel.writeInt(this.f17847l);
    }

    public a() {
    }
}
