package z80;

import b63.v;
import java.util.List;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz80/j;", "", "", "Lmb0/h;", "daysOfWeek", "Lb63/v;", "sleepTime", "wakeTime", "<init>", "(Ljava/util/List;Lb63/v;Lb63/v;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<mb0.h> f203062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f203063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f203064c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends mb0.h> list, v vVar, v vVar2) {
        list.getClass();
        vVar.getClass();
        vVar2.getClass();
        this.f203062a = list;
        this.f203063b = vVar;
        this.f203064c = vVar2;
    }

    public static j a(j jVar, List list) {
        v vVar = jVar.f203063b;
        v vVar2 = jVar.f203064c;
        list.getClass();
        return new j(list, vVar, vVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f203062a.equals(jVar.f203062a) && this.f203063b.equals(jVar.f203063b) && this.f203064c.equals(jVar.f203064c);
    }

    public final int hashCode() {
        return this.f203064c.f16219a.hashCode() + l2.c(this.f203063b.f16219a, this.f203062a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SleepWindowData(daysOfWeek=" + this.f203062a + ", sleepTime=" + this.f203063b + ", wakeTime=" + this.f203064c + ")";
    }
}
