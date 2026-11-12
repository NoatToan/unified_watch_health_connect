package defpackage;

import com.huawei.hms.network.embedded.r3;
import kotlin.Metadata;
import kotlinx.coroutines.Incomplete;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/InactiveNodeList;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "(Lkotlinx/coroutines/NodeList;)V", r3.B, "", "()Z", "getList", "()Lkotlinx/coroutines/NodeList;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zhq implements Incomplete {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zig f54108b;

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: isActive */
    public boolean getF54103b() {
        return false;
    }

    public zhq(zig zigVar) {
        this.f54108b = zigVar;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: getList, reason: from getter */
    public zig getF54108b() {
        return this.f54108b;
    }

    public String toString() {
        return ASSERTIONS_ENABLED.c() ? getF54108b().a("New") : super.toString();
    }
}
