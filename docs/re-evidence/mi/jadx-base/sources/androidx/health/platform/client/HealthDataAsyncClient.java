package androidx.health.platform.client;

import androidx.health.platform.client.proto.a1;
import androidx.health.platform.client.proto.b1;
import androidx.health.platform.client.proto.d1;
import androidx.health.platform.client.proto.e1;
import androidx.health.platform.client.proto.f1;
import androidx.health.platform.client.proto.g1;
import androidx.health.platform.client.proto.i1;
import androidx.health.platform.client.proto.k1;
import androidx.health.platform.client.proto.o;
import androidx.health.platform.client.proto.o1;
import androidx.health.platform.client.proto.p1;
import androidx.health.platform.client.proto.q1;
import androidx.health.platform.client.proto.s1;
import androidx.health.platform.client.proto.u0;
import androidx.health.platform.client.proto.y0;
import defpackage.lhe;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u0012\u0010\u0011J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\fH&¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u000e\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u000e\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\u0006\u0010\u000e\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00052\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00052\u0006\u0010#\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00052\u0006\u0010#\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00052\u0006\u0010#\u001a\u00020/H&¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002000\u00052\u0006\u0010#\u001a\u000203H&¢\u0006\u0004\b4\u00105ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00066À\u0006\u0001"}, d2 = {"Landroidx/health/platform/client/HealthDataAsyncClient;", "", "", "Landroidx/health/platform/client/proto/u0;", "permissions", "Llhe;", "getGrantedPermissions", "(Ljava/util/Set;)Llhe;", "filterGrantedPermissions", "", "revokeAllPermissions", "()Llhe;", "", "Landroidx/health/platform/client/proto/o;", "dataCollection", "", "insertData", "(Ljava/util/List;)Llhe;", "updateData", "Landroidx/health/platform/client/proto/a1;", "uidsCollection", "clientIdsCollection", "deleteData", "(Ljava/util/List;Ljava/util/List;)Llhe;", "Landroidx/health/platform/client/proto/b1;", "deleteDataRange", "(Landroidx/health/platform/client/proto/b1;)Llhe;", "Landroidx/health/platform/client/proto/g1;", "readData", "(Landroidx/health/platform/client/proto/g1;)Llhe;", "Landroidx/health/platform/client/proto/f1;", "Landroidx/health/platform/client/proto/s1;", "readDataRange", "(Landroidx/health/platform/client/proto/f1;)Llhe;", "Landroidx/health/platform/client/proto/y0;", "request", "Landroidx/health/platform/client/proto/o1;", "aggregate", "(Landroidx/health/platform/client/proto/y0;)Llhe;", "Landroidx/health/platform/client/proto/e1;", "Landroidx/health/platform/client/proto/q1;", "getChangesToken", "(Landroidx/health/platform/client/proto/e1;)Llhe;", "Landroidx/health/platform/client/proto/d1;", "Landroidx/health/platform/client/proto/p1;", "getChanges", "(Landroidx/health/platform/client/proto/d1;)Llhe;", "Landroidx/health/platform/client/proto/i1;", "Ljava/lang/Void;", "registerForDataNotifications", "(Landroidx/health/platform/client/proto/i1;)Llhe;", "Landroidx/health/platform/client/proto/k1;", "unregisterFromDataNotifications", "(Landroidx/health/platform/client/proto/k1;)Llhe;", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public interface HealthDataAsyncClient {
    @NotNull
    lhe<o1> aggregate(@NotNull y0 request);

    @NotNull
    lhe<Unit> deleteData(@NotNull List<a1> uidsCollection, @NotNull List<a1> clientIdsCollection);

    @NotNull
    lhe<Unit> deleteDataRange(@NotNull b1 dataCollection);

    @NotNull
    lhe<Set<u0>> filterGrantedPermissions(@NotNull Set<u0> permissions);

    @NotNull
    lhe<p1> getChanges(@NotNull d1 request);

    @NotNull
    lhe<q1> getChangesToken(@NotNull e1 request);

    @NotNull
    lhe<Set<u0>> getGrantedPermissions(@NotNull Set<u0> permissions);

    @NotNull
    lhe<List<String>> insertData(@NotNull List<o> dataCollection);

    @NotNull
    lhe<o> readData(@NotNull g1 dataCollection);

    @NotNull
    lhe<s1> readDataRange(@NotNull f1 dataCollection);

    @NotNull
    lhe<Void> registerForDataNotifications(@NotNull i1 request);

    @NotNull
    lhe<Unit> revokeAllPermissions();

    @NotNull
    lhe<Void> unregisterFromDataNotifications(@NotNull k1 request);

    @NotNull
    lhe<Unit> updateData(@NotNull List<o> dataCollection);
}
