package w8;

import androidx.health.platform.client.permission.Permission;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Landroidx/health/platform/client/permission/Permission;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class c extends w implements l<Permission, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f183540a = new c();

    public c() {
        super(1);
    }

    @Override // e23.l
    public final String invoke(Permission permission) {
        return permission.f7528b.u();
    }
}
