package za1;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.data.Entry;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000f¨\u0006\u0012"}, d2 = {"Lza1/a;", "Lcom/github/mikephil/charting/data/Entry;", "Landroid/os/Parcelable;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "Lza1/g;", "data", "<init>", "(FFLza1/g;)V", "Landroid/graphics/drawable/Drawable;", "icon", "(FFLandroid/graphics/drawable/Drawable;Lza1/g;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "CREATOR", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Entry implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public a(Parcel parcel) {
        parcel.getClass();
        setX(parcel.readFloat());
        setY(parcel.readFloat());
        if (parcel.readInt() == 1) {
            setData(parcel.readParcelable(g.class.getClassLoader()));
        }
    }

    /* JADX INFO: renamed from: za1.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lza1/a$a;", "Landroid/os/Parcelable$Creator;", "Lza1/a;", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<a> {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }

        private Companion() {
        }
    }

    public a(float f14, float f15, Drawable drawable, g gVar) {
        super(f14, f15, drawable, gVar);
    }

    public a(float f14, float f15, g gVar) {
        super(f14, f15, gVar);
    }
}
