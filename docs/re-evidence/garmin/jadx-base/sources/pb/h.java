package pb;

import androidx.media3.common.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements w.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136812a;

    public h(String str) {
        this.f136812a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f136812a;
    }
}
