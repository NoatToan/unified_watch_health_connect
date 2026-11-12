package defpackage;

import com.xiaomi.ai.edge.common.model.EdgeNetworkType;

/* JADX INFO: loaded from: classes7.dex */
public class m08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25609b;
    public EdgeNetworkType c = EdgeNetworkType.UNKNOWN;

    public String a() {
        return this.f25608a;
    }

    public String b() {
        return this.f25609b;
    }

    public EdgeNetworkType c() {
        return this.c;
    }

    public void d(EdgeNetworkType edgeNetworkType) {
        this.c = edgeNetworkType;
    }
}
