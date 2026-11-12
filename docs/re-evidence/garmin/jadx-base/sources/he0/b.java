package he0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhe0/b;", "", "", Action.KEY_ATTRIBUTE, "", "value", "", "timeFrame", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Boolean value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeFrame")
    private final Integer timeFrame;

    public b(String str, Boolean bool, Integer num) {
        this.key = str;
        this.value = bool;
        this.timeFrame = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTimeFrame() {
        return this.timeFrame;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.key, bVar.key) && s.g(this.value, bVar.value) && s.g(this.timeFrame, bVar.timeFrame);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.value;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.timeFrame;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.key;
        Boolean bool = this.value;
        Integer num = this.timeFrame;
        StringBuilder sb3 = new StringBuilder("PromoUsageIndicator(key=");
        sb3.append(str);
        sb3.append(", value=");
        sb3.append(bool);
        sb3.append(", timeFrame=");
        return f3.i(sb3, num, ")");
    }
}
