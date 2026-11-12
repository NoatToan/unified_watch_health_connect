package dy1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldy1/f;", "", "", "Ldy1/e;", "benchmarksBannerTypes", "", "benchmarksCountInfo", "Lkotlin/Function0;", "", "Lcom/garmin/android/apps/connectmobile/training/stp/presentation/composables/ButtonClicked;", "onBenchmarksClicked", "<init>", "(Ljava/util/List;Ljava/lang/String;Le23/a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f61551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f61553c;

    public /* synthetic */ f(List list, String str, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f61551a, fVar.f61551a) && p005kotlin.jvm.internal.s.g(this.f61552b, fVar.f61552b) && p005kotlin.jvm.internal.s.g(this.f61553c, fVar.f61553c);
    }

    public final int hashCode() {
        List<e> list = this.f61551a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f61552b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e23.a<Unit> aVar = this.f61553c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BenchmarksDashboardState(benchmarksBannerTypes=");
        sb3.append(this.f61551a);
        sb3.append(", benchmarksCountInfo=");
        sb3.append(this.f61552b);
        sb3.append(", onBenchmarksClicked=");
        return n23.j.i(sb3, this.f61553c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends e> list, String str, e23.a<Unit> aVar) {
        this.f61551a = list;
        this.f61552b = str;
        this.f61553c = aVar;
    }

    public f() {
        this(null, null, null, 7, null);
    }
}
