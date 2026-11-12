package androidx.health.platform.client.impl;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.health.platform.client.HealthDataAsyncClient;
import androidx.health.platform.client.impl.internal.ProviderConnectionManager;
import androidx.health.platform.client.impl.ipc.Client;
import androidx.health.platform.client.impl.ipc.ClientConfiguration;
import androidx.health.platform.client.impl.ipc.RemoteFutureOperation;
import androidx.health.platform.client.impl.ipc.RemoteOperation;
import androidx.health.platform.client.impl.ipc.internal.ConnectionManager;
import androidx.health.platform.client.impl.permission.foregroundstate.ForegroundStateChecker;
import androidx.health.platform.client.impl.permission.token.PermissionTokenManager;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.DataProto;
import androidx.health.platform.client.proto.PermissionProto;
import androidx.health.platform.client.proto.RequestProto;
import androidx.health.platform.client.proto.ResponseProto;
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
import androidx.health.platform.client.service.IHealthDataService;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.arb;
import defpackage.yzc;
import defpackage.yzp;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013H\u0016J\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001b0\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016J*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001bH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u001c\u001a\u00020$H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00132\u0006\u0010\u001c\u001a\u00020&H\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00132\u0006\u0010\u001c\u001a\u00020)H\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00132\u0006\u0010,\u001a\u00020-H\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00132\u0006\u0010,\u001a\u000200H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00132\u0006\u0010,\u001a\u000203H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00132\u0006\u0010,\u001a\u000206H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002050\u00132\u0006\u0010,\u001a\u000208H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Landroidx/health/platform/client/impl/ServiceBackedHealthDataClient;", "Landroidx/health/platform/client/impl/ipc/Client;", "Landroidx/health/platform/client/service/IHealthDataService;", "Landroidx/health/platform/client/HealthDataAsyncClient;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "clientConfiguration", "Landroidx/health/platform/client/impl/ipc/ClientConfiguration;", "connectionManager", "Landroidx/health/platform/client/impl/ipc/internal/ConnectionManager;", "<init>", "(Landroid/content/Context;Landroidx/health/platform/client/impl/ipc/ClientConfiguration;Landroidx/health/platform/client/impl/ipc/internal/ConnectionManager;)V", "(Landroid/content/Context;Landroidx/health/platform/client/impl/ipc/ClientConfiguration;)V", "callingPackageName", "", "kotlin.jvm.PlatformType", "getRequestContext", "Landroidx/health/platform/client/request/RequestContext;", "getGrantedPermissions", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "Landroidx/health/platform/client/proto/PermissionProto$Permission;", "permissions", "filterGrantedPermissions", "revokeAllPermissions", "", "insertData", "", "dataCollection", "Landroidx/health/platform/client/proto/DataProto$DataPoint;", "updateData", "deleteData", "uidsCollection", "Landroidx/health/platform/client/proto/RequestProto$DataTypeIdPair;", "clientIdsCollection", "deleteDataRange", "Landroidx/health/platform/client/proto/RequestProto$DeleteDataRangeRequest;", "readData", "Landroidx/health/platform/client/proto/RequestProto$ReadDataRequest;", "readDataRange", "Landroidx/health/platform/client/proto/ResponseProto$ReadDataRangeResponse;", "Landroidx/health/platform/client/proto/RequestProto$ReadDataRangeRequest;", "aggregate", "Landroidx/health/platform/client/proto/ResponseProto$AggregateDataResponse;", "request", "Landroidx/health/platform/client/proto/RequestProto$AggregateDataRequest;", "getChangesToken", "Landroidx/health/platform/client/proto/ResponseProto$GetChangesTokenResponse;", "Landroidx/health/platform/client/proto/RequestProto$GetChangesTokenRequest;", "getChanges", "Landroidx/health/platform/client/proto/ResponseProto$GetChangesResponse;", "Landroidx/health/platform/client/proto/RequestProto$GetChangesRequest;", "registerForDataNotifications", "Ljava/lang/Void;", "Landroidx/health/platform/client/proto/RequestProto$RegisterForDataNotificationsRequest;", "unregisterFromDataNotifications", "Landroidx/health/platform/client/proto/RequestProto$UnregisterFromDataNotificationsRequest;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServiceBackedHealthDataClient extends Client<IHealthDataService> implements HealthDataAsyncClient {
    private final String callingPackageName;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceBackedHealthDataClient(Context context, ClientConfiguration clientConfiguration, ConnectionManager connectionManager) {
        super(clientConfiguration, connectionManager, new Client.ServiceGetter() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda0
            @Override // androidx.health.platform.client.impl.ipc.Client.ServiceGetter
            public final Object getService(IBinder iBinder) {
                return IHealthDataService.Stub.asInterface(iBinder);
            }
        }, new RemoteOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda7
            @Override // androidx.health.platform.client.impl.ipc.RemoteOperation
            public final Object execute(Object obj) {
                return Integer.valueOf(((IHealthDataService) obj).getApiVersion());
            }
        });
        zcp.c(context, "");
        zcp.c(clientConfiguration, "");
        zcp.c(connectionManager, "");
        this.context = context;
        this.callingPackageName = context.getPackageName();
    }

    private final RequestContext getRequestContext() {
        String str = this.callingPackageName;
        zcp.b((Object) str, "");
        return new RequestContext(str, 112, PermissionTokenManager.getCurrentToken(this.context), ForegroundStateChecker.isInForeground());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceBackedHealthDataClient(Context context, ClientConfiguration clientConfiguration) {
        this(context, clientConfiguration, ProviderConnectionManager.INSTANCE.getInstance(context));
        zcp.c(context, "");
        zcp.c(clientConfiguration, "");
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<Set<PermissionProto.Permission>> getGrantedPermissions(final Set<PermissionProto.Permission> permissions) {
        zcp.c(permissions, "");
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda4
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.getGrantedPermissions$lambda$1(this.f$0, permissions, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGrantedPermissions$lambda$1(ServiceBackedHealthDataClient serviceBackedHealthDataClient, Set set, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(yzp.e(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Permission((PermissionProto.Permission) it.next()));
        }
        List<Permission> listI = yzp.i((Iterable) arrayList);
        zcp.e(arbVar);
        iHealthDataService.getGrantedPermissions(requestContext, listI, new GetGrantedPermissionsCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<Set<PermissionProto.Permission>> filterGrantedPermissions(final Set<PermissionProto.Permission> permissions) {
        zcp.c(permissions, "");
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(Math.min(1, 5), new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda9
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.filterGrantedPermissions$lambda$3(this.f$0, permissions, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void filterGrantedPermissions$lambda$3(ServiceBackedHealthDataClient serviceBackedHealthDataClient, Set set, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(yzp.e(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Permission((PermissionProto.Permission) it.next()));
        }
        List<Permission> listI = yzp.i((Iterable) arrayList);
        zcp.e(arbVar);
        iHealthDataService.filterGrantedPermissions(requestContext, listI, new FilterGrantedPermissionsCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<yzc> revokeAllPermissions() {
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda10
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.revokeAllPermissions$lambda$4(this.f$0, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revokeAllPermissions$lambda$4(ServiceBackedHealthDataClient serviceBackedHealthDataClient, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        zcp.e(arbVar);
        iHealthDataService.revokeAllPermissions(requestContext, new RevokeAllPermissionsCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<List<String>> insertData(List<DataProto.DataPoint> dataCollection) {
        zcp.c(dataCollection, "");
        final UpsertDataRequest upsertDataRequest = new UpsertDataRequest(dataCollection);
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda13
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.insertData$lambda$5(this.f$0, upsertDataRequest, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertData$lambda$5(ServiceBackedHealthDataClient serviceBackedHealthDataClient, UpsertDataRequest upsertDataRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        zcp.e(arbVar);
        iHealthDataService.insertData(requestContext, upsertDataRequest, new InsertDataCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<yzc> updateData(List<DataProto.DataPoint> dataCollection) {
        zcp.c(dataCollection, "");
        final UpsertDataRequest upsertDataRequest = new UpsertDataRequest(dataCollection);
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda5
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.updateData$lambda$6(this.f$0, upsertDataRequest, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateData$lambda$6(ServiceBackedHealthDataClient serviceBackedHealthDataClient, UpsertDataRequest upsertDataRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        zcp.e(arbVar);
        iHealthDataService.updateData(requestContext, upsertDataRequest, new UpdateDataCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<yzc> deleteData(List<RequestProto.DataTypeIdPair> uidsCollection, List<RequestProto.DataTypeIdPair> clientIdsCollection) {
        zcp.c(uidsCollection, "");
        zcp.c(clientIdsCollection, "");
        final DeleteDataRequest deleteDataRequest = new DeleteDataRequest(uidsCollection, clientIdsCollection);
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda6
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.deleteData$lambda$7(this.f$0, deleteDataRequest, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteData$lambda$7(ServiceBackedHealthDataClient serviceBackedHealthDataClient, DeleteDataRequest deleteDataRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        zcp.e(arbVar);
        iHealthDataService.deleteData(requestContext, deleteDataRequest, new DeleteDataCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<yzc> deleteDataRange(RequestProto.DeleteDataRangeRequest dataCollection) {
        zcp.c(dataCollection, "");
        final DeleteDataRangeRequest deleteDataRangeRequest = new DeleteDataRangeRequest(dataCollection);
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda8
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.deleteDataRange$lambda$8(this.f$0, deleteDataRangeRequest, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteDataRange$lambda$8(ServiceBackedHealthDataClient serviceBackedHealthDataClient, DeleteDataRangeRequest deleteDataRangeRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        zcp.e(arbVar);
        iHealthDataService.deleteDataRange(requestContext, deleteDataRangeRequest, new DeleteDataRangeCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<DataProto.DataPoint> readData(RequestProto.ReadDataRequest dataCollection) {
        zcp.c(dataCollection, "");
        final ReadDataRequest readDataRequest = new ReadDataRequest(dataCollection);
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda15
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.readData$lambda$9(this.f$0, readDataRequest, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readData$lambda$9(ServiceBackedHealthDataClient serviceBackedHealthDataClient, ReadDataRequest readDataRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        zcp.e(arbVar);
        iHealthDataService.readData(requestContext, readDataRequest, new ReadDataCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<ResponseProto.ReadDataRangeResponse> readDataRange(RequestProto.ReadDataRangeRequest dataCollection) {
        zcp.c(dataCollection, "");
        final ReadDataRangeRequest readDataRangeRequest = new ReadDataRangeRequest(dataCollection);
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda12
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.readDataRange$lambda$10(this.f$0, readDataRangeRequest, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readDataRange$lambda$10(ServiceBackedHealthDataClient serviceBackedHealthDataClient, ReadDataRangeRequest readDataRangeRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        zcp.e(arbVar);
        iHealthDataService.readDataRange(requestContext, readDataRangeRequest, new ReadDataRangeCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<ResponseProto.AggregateDataResponse> aggregate(final RequestProto.AggregateDataRequest request) {
        zcp.c(request, "");
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda3
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.aggregate$lambda$11(this.f$0, request, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aggregate$lambda$11(ServiceBackedHealthDataClient serviceBackedHealthDataClient, RequestProto.AggregateDataRequest aggregateDataRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        AggregateDataRequest aggregateDataRequest2 = new AggregateDataRequest(aggregateDataRequest);
        zcp.e(arbVar);
        iHealthDataService.aggregate(requestContext, aggregateDataRequest2, new AggregateDataCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<ResponseProto.GetChangesTokenResponse> getChangesToken(final RequestProto.GetChangesTokenRequest request) {
        zcp.c(request, "");
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda2
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.getChangesToken$lambda$12(this.f$0, request, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getChangesToken$lambda$12(ServiceBackedHealthDataClient serviceBackedHealthDataClient, RequestProto.GetChangesTokenRequest getChangesTokenRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        GetChangesTokenRequest getChangesTokenRequest2 = new GetChangesTokenRequest(getChangesTokenRequest);
        zcp.e(arbVar);
        iHealthDataService.getChangesToken(requestContext, getChangesTokenRequest2, new GetChangesTokenCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<ResponseProto.GetChangesResponse> getChanges(final RequestProto.GetChangesRequest request) {
        zcp.c(request, "");
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(1, new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda1
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.getChanges$lambda$13(this.f$0, request, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getChanges$lambda$13(ServiceBackedHealthDataClient serviceBackedHealthDataClient, RequestProto.GetChangesRequest getChangesRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        GetChangesRequest getChangesRequest2 = new GetChangesRequest(getChangesRequest);
        zcp.e(arbVar);
        iHealthDataService.getChanges(requestContext, getChangesRequest2, new GetChangesCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<Void> registerForDataNotifications(final RequestProto.RegisterForDataNotificationsRequest request) {
        zcp.c(request, "");
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(Math.min(1, 2), new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda11
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.registerForDataNotifications$lambda$14(this.f$0, request, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForDataNotifications$lambda$14(ServiceBackedHealthDataClient serviceBackedHealthDataClient, RequestProto.RegisterForDataNotificationsRequest registerForDataNotificationsRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        RegisterForDataNotificationsRequest registerForDataNotificationsRequest2 = new RegisterForDataNotificationsRequest(registerForDataNotificationsRequest);
        zcp.e(arbVar);
        iHealthDataService.registerForDataNotifications(requestContext, registerForDataNotificationsRequest2, new RegisterForDataNotificationsCallback(arbVar));
    }

    @Override // androidx.health.platform.client.HealthDataAsyncClient
    public ListenableFuture<Void> unregisterFromDataNotifications(final RequestProto.UnregisterFromDataNotificationsRequest request) {
        zcp.c(request, "");
        ListenableFuture listenableFutureExecuteWithVersionCheck = executeWithVersionCheck(Math.min(1, 2), new RemoteFutureOperation() { // from class: androidx.health.platform.client.impl.ServiceBackedHealthDataClient$$ExternalSyntheticLambda14
            @Override // androidx.health.platform.client.impl.ipc.RemoteFutureOperation
            public final void execute(Object obj, arb arbVar) throws RemoteException {
                ServiceBackedHealthDataClient.unregisterFromDataNotifications$lambda$15(this.f$0, request, (IHealthDataService) obj, arbVar);
            }
        });
        zcp.b((Object) listenableFutureExecuteWithVersionCheck, "");
        return listenableFutureExecuteWithVersionCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterFromDataNotifications$lambda$15(ServiceBackedHealthDataClient serviceBackedHealthDataClient, RequestProto.UnregisterFromDataNotificationsRequest unregisterFromDataNotificationsRequest, IHealthDataService iHealthDataService, arb arbVar) throws RemoteException {
        RequestContext requestContext = serviceBackedHealthDataClient.getRequestContext();
        UnregisterFromDataNotificationsRequest unregisterFromDataNotificationsRequest2 = new UnregisterFromDataNotificationsRequest(unregisterFromDataNotificationsRequest);
        zcp.e(arbVar);
        iHealthDataService.unregisterFromDataNotifications(requestContext, unregisterFromDataNotificationsRequest2, new UnregisterFromDataNotificationsCallback(arbVar));
    }
}
