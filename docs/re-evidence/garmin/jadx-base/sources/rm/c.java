package rm;

import android.os.Parcel;
import com.github.mikephil.chartingv2.data.Entry;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lrm/c;", "Lcom/github/mikephil/chartingv2/data/Entry;", "", "xValue", "yValue", "", "xIndex", "<init>", "(FFI)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f153510a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.f153510a = parcel.readFloat();
    }

    @Override // com.github.mikephil.chartingv2.data.Entry, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeFloat(this.f153510a);
    }

    public c(float f14, float f15, int i14) {
        super(f15, i14);
        this.f153510a = f14;
    }
}
