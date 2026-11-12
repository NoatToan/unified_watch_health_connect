package yo2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lyo2/g;", "", "Lyo2/h;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "percentComplete", "<init>", "(Lyo2/h;D)V", "a", "Lyo2/h;", "b", "()Lyo2/h;", "D", "()D", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final h state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("percentComplete")
    private final double percentComplete;

    public g(h hVar, double d14) {
        hVar.getClass();
        this.state = hVar;
        this.percentComplete = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getPercentComplete() {
        return this.percentComplete;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getState() {
        return this.state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.state == gVar.state && Double.compare(this.percentComplete, gVar.percentComplete) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.percentComplete) + (this.state.hashCode() * 31);
    }

    public final String toString() {
        return "NewFitPayDeviceSEUpdateData(state=" + this.state + ", percentComplete=" + this.percentComplete + ")";
    }

    public /* synthetic */ g(h hVar, double d14, int i14, j jVar) {
        this(hVar, (i14 & 2) != 0 ? 0.0d : d14);
    }
}
