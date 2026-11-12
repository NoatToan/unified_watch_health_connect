package wo;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwo/a;", "", "", "selectedChartType", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "chartTypes", "<init>", "(Ljava/lang/Integer;Ljava/util/LinkedHashMap;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f186397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap<Integer, String> f186398b;

    public a(Integer num, LinkedHashMap<Integer, String> linkedHashMap) {
        linkedHashMap.getClass();
        this.f186397a = num;
        this.f186398b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f186397a, aVar.f186397a) && this.f186398b.equals(aVar.f186398b);
    }

    public final int hashCode() {
        Integer num = this.f186397a;
        return this.f186398b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ChartTypeSelection(selectedChartType=" + this.f186397a + ", chartTypes=" + this.f186398b + ")";
    }
}
