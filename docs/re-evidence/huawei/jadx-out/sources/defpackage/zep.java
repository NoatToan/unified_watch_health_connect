package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "<init>", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getValue", "()Ljava/lang/String;", "getRange", "()Lkotlin/ranges/IntRange;", "component1", "component2", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zep {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54040b;
    private final zdl e;

    public zep(String str, zdl zdlVar) {
        zcp.c(str, "");
        zcp.c(zdlVar, "");
        this.f54040b = str;
        this.e = zdlVar;
    }

    public String toString() {
        return "MatchGroup(value=" + this.f54040b + ", range=" + this.e + g4.l;
    }

    public int hashCode() {
        return (this.f54040b.hashCode() * 31) + this.e.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zep)) {
            return false;
        }
        zep zepVar = (zep) other;
        return zcp.b((Object) this.f54040b, (Object) zepVar.f54040b) && zcp.b(this.e, zepVar.e);
    }
}
