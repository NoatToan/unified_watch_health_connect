package xs0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import c22.i;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxs0/a;", "Landroid/os/Parcelable;", "", "", Action.KEY_ATTRIBUTE, "Lc22/c3;", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lc22/c3;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a implements Parcelable {
    GENERIC("GENERIC", i.b(R.string.lbl_lactate_threshold)),
    RUNNING("RUNNING", i.b(R.string.lbl_running_lactate_threshold)),
    ROWING("ROWING", i.b(R.string.lbl_rowing_lactate_threshold));

    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: xs0.a.a
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return a.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f192069b;

    a(String str, c3 c3Var) {
        this.f192068a = str;
        this.f192069b = c3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
