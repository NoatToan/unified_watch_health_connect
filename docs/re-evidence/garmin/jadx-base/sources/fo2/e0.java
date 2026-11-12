package fo2;

import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lfo2/e0;", "", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "Lfo2/e0$a;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Lfo2/e0$a;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Lfo2/e0$a;", "()Lfo2/e0$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final a state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfo2/e0$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        INITIALIZING,
        INITIALIZATION_FAILED,
        INITIALIZED,
        DELETE_IN_PROGRESS,
        DELETE_FAILED
    }

    public e0(Links links, a aVar) {
        links.getClass();
        aVar.getClass();
        this.links = links;
        this.state = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getState() {
        return this.state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.links, e0Var.links) && this.state == e0Var.state;
    }

    public final int hashCode() {
        return this.state.hashCode() + (this.links.f51142a.hashCode() * 31);
    }

    public final String toString() {
        return "SecurityDomain(links=" + this.links + ", state=" + this.state + ")";
    }
}
