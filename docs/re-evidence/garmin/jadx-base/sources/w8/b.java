package w8;

import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.o1;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/health/platform/client/permission/Permission;", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class b extends w implements l<String, Permission> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f183539a = new b();

    public b() {
        super(1);
    }

    @Override // e23.l
    public final Permission invoke(String str) {
        String str2 = str;
        str2.getClass();
        o1.a aVarV = o1.v();
        aVarV.g();
        o1.t((o1) aVarV.f7677b, str2);
        return new Permission(aVarV.e());
    }
}
