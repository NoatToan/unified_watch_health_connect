package lv0;

import android.content.ClipData;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llv0/d;", "", "", "text", "Landroid/content/ClipData;", "imageUri", "<init>", "(Ljava/lang/String;Landroid/content/ClipData;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClipData f115047b;

    public /* synthetic */ d(String str, ClipData clipData, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : clipData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f115046a, dVar.f115046a) && s.g(this.f115047b, dVar.f115047b);
    }

    public final int hashCode() {
        String str = this.f115046a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ClipData clipData = this.f115047b;
        return iHashCode + (clipData != null ? clipData.hashCode() : 0);
    }

    public final String toString() {
        return "LiveTrackSharingInput(text=" + this.f115046a + ", imageUri=" + this.f115047b + ")";
    }

    public d(String str, ClipData clipData) {
        this.f115046a = str;
        this.f115047b = clipData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
