package androidx.health.platform.client.impl;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.health.platform.client.HealthDataAsyncClient;
import androidx.health.platform.client.impl.ServiceBackedHealthDataClient;
import androidx.health.platform.client.impl.internal.ProviderConnectionManager;
import androidx.health.platform.client.permission.Permission;
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
import androidx.health.platform.client.request.AggregateDataRequest;
import androidx.health.platform.client.request.DeleteDataRangeRequest;
import androidx.health.platform.client.request.DeleteDataRequest;
import androidx.health.platform.client.request.GetChangesRequest;
import androidx.health.platform.client.request.GetChangesTokenRequest;
import androidx.health.platform.client.request.ReadDataRangeRequest;
import androidx.health.platform.client.request.ReadDataRequest;
import androidx.health.platform.client.request.RegisterForDataNotificationsRequest;
import androidx.health.platform.client.request.RequestContext;
import androidx.health.platform.client.request.UnregisterFromDataNotificationsRequest;
import androidx.health.platform.client.request.UpsertDataRequest;
import defpackage.a14;
import defpackage.kkk;
import defpackage.l0m;
import defpackage.lhe;
import defpackage.lsh;
import defpackage.mkk;
import defpackage.s0a;
import defpackage.se4;
import defpackage.xsc;
import defpackage.y04;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FB\u0019\b\u0016\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bE\u0010GJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u0013\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0013\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n2\u0006\u0010\u0013\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\n2\u0006\u0010(\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\n2\u0006\u0010(\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002050\n2\u0006\u0010(\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002050\n2\u0006\u0010(\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010?\u001a\n >*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006H"}, d2 = {"Landroidx/health/platform/client/impl/ServiceBackedHealthDataClient;", "Ly04;", "Lxsc;", "Landroidx/health/platform/client/HealthDataAsyncClient;", "Landroidx/health/platform/client/request/RequestContext;", "getRequestContext", "()Landroidx/health/platform/client/request/RequestContext;", "", "Landroidx/health/platform/client/proto/u0;", "permissions", "Llhe;", "getGrantedPermissions", "(Ljava/util/Set;)Llhe;", "filterGrantedPermissions", "", "revokeAllPermissions", "()Llhe;", "", "Landroidx/health/platform/client/proto/o;", "dataCollection", "", "insertData", "(Ljava/util/List;)Llhe;", "updateData", "Landroidx/health/platform/client/proto/a1;", "uidsCollection", "clientIdsCollection", "deleteData", "(Ljava/util/List;Ljava/util/List;)Llhe;", "Landroidx/health/platform/client/proto/b1;", "deleteDataRange", "(Landroidx/health/platform/client/proto/b1;)Llhe;", "Landroidx/health/platform/client/proto/g1;", "readData", "(Landroidx/health/platform/client/proto/g1;)Llhe;", "Landroidx/health/platform/client/proto/f1;", "Landroidx/health/platform/client/proto/s1;", "readDataRange", "(Landroidx/health/platform/client/proto/f1;)Llhe;", "Landroidx/health/platform/client/proto/y0;", "request", "Landroidx/health/platform/client/proto/o1;", "aggregate", "(Landroidx/health/platform/client/proto/y0;)Llhe;", "Landroidx/health/platform/client/proto/e1;", "Landroidx/health/platform/client/proto/q1;", "getChangesToken", "(Landroidx/health/platform/client/proto/e1;)Llhe;", "Landroidx/health/platform/client/proto/d1;", "Landroidx/health/platform/client/proto/p1;", "getChanges", "(Landroidx/health/platform/client/proto/d1;)Llhe;", "Landroidx/health/platform/client/proto/i1;", "Ljava/lang/Void;", "registerForDataNotifications", "(Landroidx/health/platform/client/proto/i1;)Llhe;", "Landroidx/health/platform/client/proto/k1;", "unregisterFromDataNotifications", "(Landroidx/health/platform/client/proto/k1;)Llhe;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "callingPackageName", "Ljava/lang/String;", "La14;", "clientConfiguration", "Lse4;", "connectionManager", "<init>", "(Landroid/content/Context;La14;Lse4;)V", "(Landroid/content/Context;La14;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nServiceBackedHealthDataClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceBackedHealthDataClient.kt\nandroidx/health/platform/client/impl/ServiceBackedHealthDataClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n1549#2:230\n1620#2,3:231\n1549#2:234\n1620#2,3:235\n*S KotlinDebug\n*F\n+ 1 ServiceBackedHealthDataClient.kt\nandroidx/health/platform/client/impl/ServiceBackedHealthDataClient\n*L\n87#1:230\n87#1:231,3\n99#1:234\n99#1:235,3\n*E\n"})
public final class ServiceBackedHealthDataClient extends y04<xsc> implements HealthDataAsyncClient {
    private final String callingPackageName;

    @NotNull
    private final Context context;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceBackedHealthDataClient(@NotNull Context context, @NotNull a14 clientConfiguration) {
        this(context, clientConfiguration, ProviderConnectionManager.INSTANCE.getInstance(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientConfiguration, "clientConfiguration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aggregate$lambda$11(ServiceBackedHealthDataClient this$0, y0 request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        AggregateDataRequest aggregateDataRequest = new AggregateDataRequest(request);
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.w4(requestContext, aggregateDataRequest, new AggregateDataCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteData$lambda$7(ServiceBackedHealthDataClient this$0, DeleteDataRequest request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.r0(requestContext, request, new DeleteDataCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteDataRange$lambda$8(ServiceBackedHealthDataClient this$0, DeleteDataRangeRequest request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.H(requestContext, request, new DeleteDataRangeCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void filterGrantedPermissions$lambda$3(ServiceBackedHealthDataClient this$0, Set permissions, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        RequestContext requestContext = this$0.getRequestContext();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(permissions, 10));
        Iterator it = permissions.iterator();
        while (it.hasNext()) {
            arrayList.add(new Permission((u0) it.next()));
        }
        List<Permission> list = CollectionsKt___CollectionsKt.toList(arrayList);
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.y0(requestContext, list, new FilterGrantedPermissionsCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getChanges$lambda$13(ServiceBackedHealthDataClient this$0, d1 request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        GetChangesRequest getChangesRequest = new GetChangesRequest(request);
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.d3(requestContext, getChangesRequest, new GetChangesCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getChangesToken$lambda$12(ServiceBackedHealthDataClient this$0, e1 request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        GetChangesTokenRequest getChangesTokenRequest = new GetChangesTokenRequest(request);
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.B(requestContext, getChangesTokenRequest, new GetChangesTokenCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGrantedPermissions$lambda$1(ServiceBackedHealthDataClient this$0, Set permissions, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        RequestContext requestContext = this$0.getRequestContext();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(permissions, 10));
        Iterator it = permissions.iterator();
        while (it.hasNext()) {
            arrayList.add(new Permission((u0) it.next()));
        }
        List<Permission> list = CollectionsKt___CollectionsKt.toList(arrayList);
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.P(requestContext, list, new GetGrantedPermissionsCallback(resultFuture));
    }

    private final RequestContext getRequestContext() {
        String callingPackageName = this.callingPackageName;
        Intrinsics.checkNotNullExpressionValue(callingPackageName, "callingPackageName");
        return new RequestContext(callingPackageName, 112, lsh.a(this.context), s0a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertData$lambda$5(ServiceBackedHealthDataClient this$0, UpsertDataRequest request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.Z(requestContext, request, new InsertDataCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readData$lambda$9(ServiceBackedHealthDataClient this$0, ReadDataRequest request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.A0(requestContext, request, new ReadDataCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readDataRange$lambda$10(ServiceBackedHealthDataClient this$0, ReadDataRangeRequest request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.a3(requestContext, request, new ReadDataRangeCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForDataNotifications$lambda$14(ServiceBackedHealthDataClient this$0, i1 request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        RegisterForDataNotificationsRequest registerForDataNotificationsRequest = new RegisterForDataNotificationsRequest(request);
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.D0(requestContext, registerForDataNotificationsRequest, new RegisterForDataNotificationsCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revokeAllPermissions$lambda$4(ServiceBackedHealthDataClient this$0, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RequestContext requestContext = this$0.getRequestContext();
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.P1(requestContext, new RevokeAllPermissionsCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterFromDataNotifications$lambda$15(ServiceBackedHealthDataClient this$0, k1 request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        UnregisterFromDataNotificationsRequest unregisterFromDataNotificationsRequest = new UnregisterFromDataNotificationsRequest(request);
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.v2(requestContext, unregisterFromDataNotificationsRequest, new UnregisterFromDataNotificationsCallback(resultFuture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateData$lambda$6(ServiceBackedHealthDataClient this$0, UpsertDataRequest request, xsc xscVar, l0m resultFuture) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        RequestContext requestContext = this$0.getRequestContext();
        Intrinsics.checkNotNullExpressionValue(resultFuture, "resultFuture");
        xscVar.L0(requestContext, request, new UpdateDataCallback(resultFuture));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<o1> aggregate(@NotNull final y0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: mxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.aggregate$lambda$11(this.f27318a, request, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…)\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<Unit> deleteData(@NotNull List<a1> uidsCollection, @NotNull List<a1> clientIdsCollection) {
        Intrinsics.checkNotNullParameter(uidsCollection, "uidsCollection");
        Intrinsics.checkNotNullParameter(clientIdsCollection, "clientIdsCollection");
        final DeleteDataRequest deleteDataRequest = new DeleteDataRequest(uidsCollection, clientIdsCollection);
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: pxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.deleteData$lambda$7(this.f30881a, deleteDataRequest, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…(resultFuture))\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<Unit> deleteDataRange(@NotNull b1 dataCollection) {
        Intrinsics.checkNotNullParameter(dataCollection, "dataCollection");
        final DeleteDataRangeRequest deleteDataRangeRequest = new DeleteDataRangeRequest(dataCollection);
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: rxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.deleteDataRange$lambda$8(this.f33039a, deleteDataRangeRequest, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…)\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<Set<u0>> filterGrantedPermissions(@NotNull final Set<u0> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(Math.min(1, 5), new kkk() { // from class: sxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.filterGrantedPermissions$lambda$3(this.f34087a, permissions, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…)\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<p1> getChanges(@NotNull final d1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: kxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.getChanges$lambda$13(this.f24398a, request, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…)\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<q1> getChangesToken(@NotNull final e1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: lxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.getChangesToken$lambda$12(this.f25530a, request, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…)\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<Set<u0>> getGrantedPermissions(@NotNull final Set<u0> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: nxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.getGrantedPermissions$lambda$1(this.f28547a, permissions, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…)\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<List<String>> insertData(@NotNull List<o> dataCollection) {
        Intrinsics.checkNotNullParameter(dataCollection, "dataCollection");
        final UpsertDataRequest upsertDataRequest = new UpsertDataRequest(dataCollection);
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: wxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.insertData$lambda$5(this.f38463a, upsertDataRequest, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…(resultFuture))\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<o> readData(@NotNull g1 dataCollection) {
        Intrinsics.checkNotNullParameter(dataCollection, "dataCollection");
        final ReadDataRequest readDataRequest = new ReadDataRequest(dataCollection);
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: yxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.readData$lambda$9(this.f40671a, readDataRequest, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…(resultFuture))\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<s1> readDataRange(@NotNull f1 dataCollection) {
        Intrinsics.checkNotNullParameter(dataCollection, "dataCollection");
        final ReadDataRangeRequest readDataRangeRequest = new ReadDataRangeRequest(dataCollection);
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: vxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.readDataRange$lambda$10(this.f37337a, readDataRangeRequest, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…(resultFuture))\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<Void> registerForDataNotifications(@NotNull final i1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(Math.min(1, 2), new kkk() { // from class: uxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.registerForDataNotifications$lambda$14(this.f36256a, request, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…,\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<Unit> revokeAllPermissions() {
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: txl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.revokeAllPermissions$lambda$4(this.f35164a, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…)\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<Void> unregisterFromDataNotifications(@NotNull final k1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(Math.min(1, 2), new kkk() { // from class: xxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.unregisterFromDataNotifications$lambda$15(this.f39569a, request, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…,\n            )\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    @NotNull
    public lhe<Unit> updateData(@NotNull List<o> dataCollection) {
        Intrinsics.checkNotNullParameter(dataCollection, "dataCollection");
        final UpsertDataRequest upsertDataRequest = new UpsertDataRequest(dataCollection);
        lhe lheVarExecuteWithVersionCheck = executeWithVersionCheck(1, new kkk() { // from class: oxl
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                ServiceBackedHealthDataClient.updateData$lambda$6(this.f29791a, upsertDataRequest, (xsc) obj, l0mVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lheVarExecuteWithVersionCheck, "executeWithVersionCheck(…(resultFuture))\n        }");
        return lheVarExecuteWithVersionCheck;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceBackedHealthDataClient(@NotNull Context context, @NotNull a14 clientConfiguration, @NotNull se4 connectionManager) {
        super(clientConfiguration, connectionManager, new y04.d() { // from class: jxl
            @Override // y04.d
            public final Object a(IBinder iBinder) {
                return xsc.a.s2(iBinder);
            }
        }, new mkk() { // from class: qxl
            @Override // defpackage.mkk
            public final Object a(Object obj) {
                return Integer.valueOf(((xsc) obj).i());
            }
        });
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientConfiguration, "clientConfiguration");
        Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
        this.context = context;
        this.callingPackageName = context.getPackageName();
    }
}
