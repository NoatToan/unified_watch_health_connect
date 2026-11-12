package jw2;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljw2/e;", "", "", "communicationType", "languagePartNumber", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "iconSet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f101383c;

    public e(String str, String str2, ArrayList<String> arrayList) {
        str.getClass();
        this.f101381a = str;
        this.f101382b = str2;
        this.f101383c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f101381a.equals(eVar.f101381a) && s.g(this.f101382b, eVar.f101382b) && s.g(this.f101383c, eVar.f101383c);
    }

    public final int hashCode() {
        int iHashCode = this.f101381a.hashCode() * 31;
        String str = this.f101382b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList<String> arrayList = this.f101383c;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("StartUpDataResponse(communicationType=", this.f101381a, ", languagePartNumber=", this.f101382b, ", iconSet=");
        sbI.append(this.f101383c);
        sbI.append(")");
        return sbI.toString();
    }
}
