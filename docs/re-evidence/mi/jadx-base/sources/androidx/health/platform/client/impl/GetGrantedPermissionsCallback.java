package androidx.health.platform.client.impl;

import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.impl.error.ErrorStatusConverterKt;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.u0;
import com.xiaomi.onetrack.api.b;
import defpackage.l0m;
import defpackage.tsc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/health/platform/client/impl/GetGrantedPermissionsCallback;", "Ltsc$a;", "", "Landroidx/health/platform/client/permission/Permission;", b.I, "", "onSuccess", "(Ljava/util/List;)V", "Landroidx/health/platform/client/error/ErrorStatus;", "error", "onError", "(Landroidx/health/platform/client/error/ErrorStatus;)V", "Ll0m;", "", "Landroidx/health/platform/client/proto/u0;", "resultFuture", "Ll0m;", "<init>", "(Ll0m;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGetGrantedPermissionsCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetGrantedPermissionsCallback.kt\nandroidx/health/platform/client/impl/GetGrantedPermissionsCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1549#2:38\n1620#2,3:39\n*S KotlinDebug\n*F\n+ 1 GetGrantedPermissionsCallback.kt\nandroidx/health/platform/client/impl/GetGrantedPermissionsCallback\n*L\n30#1:38\n30#1:39,3\n*E\n"})
public final class GetGrantedPermissionsCallback extends tsc.a {

    @NotNull
    private final l0m<Set<u0>> resultFuture;

    public GetGrantedPermissionsCallback(@NotNull l0m<Set<u0>> resultFuture) {
        Intrinsics.checkNotNullParameter(resultFuture, "resultFuture");
        this.resultFuture = resultFuture;
    }

    @Override // defpackage.tsc
    public void onError(@NotNull ErrorStatus error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.resultFuture.C(ErrorStatusConverterKt.toException(error));
    }

    @Override // defpackage.tsc
    public void onSuccess(@NotNull List<Permission> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        l0m<Set<u0>> l0mVar = this.resultFuture;
        List<Permission> list = response;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Permission) it.next()).getProto());
        }
        l0mVar.B(CollectionsKt___CollectionsKt.toSet(arrayList));
    }
}
