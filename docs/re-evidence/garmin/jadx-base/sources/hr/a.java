package hr;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhr/a;", "", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyType", "", "isSelected", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrivacyType f85282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85283b;

    public a(PrivacyType privacyType, boolean z14) {
        privacyType.getClass();
        this.f85282a = privacyType;
        this.f85283b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f85282a == aVar.f85282a && this.f85283b == aVar.f85283b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85283b) + (this.f85282a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectablePrivacyType(privacyType=" + this.f85282a + ", isSelected=" + this.f85283b + ")";
    }

    public /* synthetic */ a(PrivacyType privacyType, boolean z14, int i14, j jVar) {
        this(privacyType, (i14 & 2) != 0 ? false : z14);
    }
}
