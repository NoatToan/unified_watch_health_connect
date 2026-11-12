package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public class FusedLocationProviderClient extends GoogleApi<Api.ApiOptions.NoOptions> {

    @RecentlyNonNull
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @RecentlyNonNull
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    @VisibleForTesting(otherwise = 3)
    public FusedLocationProviderClient(@RecentlyNonNull Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    private final Task<Void> h(final com.google.android.gms.internal.location.zzba zzbaVar, final LocationCallback locationCallback, Looper looper, final o oVar, int i) {
        final ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(locationCallback, com.google.android.gms.internal.location.zzbj.zza(looper), LocationCallback.class.getSimpleName());
        final l lVar = new l(this, listenerHolderCreateListenerHolder);
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall(this, lVar, locationCallback, oVar, zzbaVar, listenerHolderCreateListenerHolder) { // from class: com.google.android.gms.location.f
            private final FusedLocationProviderClient a;
            private final q b;
            private final LocationCallback c;
            private final o d;
            private final com.google.android.gms.internal.location.zzba e;
            private final ListenerHolder f;

            {
                this.a = this;
                this.b = lVar;
                this.c = locationCallback;
                this.d = oVar;
                this.e = zzbaVar;
                this.f = listenerHolderCreateListenerHolder;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.a.e(this.b, this.c, this.d, this.e, this.f, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
            }
        }).unregister(lVar).withHolder(listenerHolderCreateListenerHolder).setMethodKey(i).build());
    }

    public final /* synthetic */ void d(com.google.android.gms.internal.location.zzba zzbaVar, PendingIntent pendingIntent, com.google.android.gms.internal.location.zzaz zzazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        p pVar = new p(taskCompletionSource);
        zzbaVar.zzc(getContextAttributionTag());
        zzazVar.zzD(zzbaVar, pendingIntent, pVar);
    }

    public final /* synthetic */ void e(final q qVar, final LocationCallback locationCallback, final o oVar, com.google.android.gms.internal.location.zzba zzbaVar, ListenerHolder listenerHolder, com.google.android.gms.internal.location.zzaz zzazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        n nVar = new n(taskCompletionSource, new o(this, qVar, locationCallback, oVar) { // from class: com.google.android.gms.location.l0
            private final FusedLocationProviderClient a;
            private final q b;
            private final LocationCallback c;
            private final o d;

            {
                this.a = this;
                this.b = qVar;
                this.c = locationCallback;
                this.d = oVar;
            }

            @Override // com.google.android.gms.location.o
            public final void zza() {
                FusedLocationProviderClient fusedLocationProviderClient = this.a;
                q qVar2 = this.b;
                LocationCallback locationCallback2 = this.c;
                o oVar2 = this.d;
                qVar2.b(false);
                fusedLocationProviderClient.removeLocationUpdates(locationCallback2);
                if (oVar2 != null) {
                    oVar2.zza();
                }
            }
        });
        zzbaVar.zzc(getContextAttributionTag());
        zzazVar.zzB(zzbaVar, listenerHolder, nVar);
    }

    public final /* synthetic */ void f(CancellationToken cancellationToken, com.google.android.gms.internal.location.zzba zzbaVar, com.google.android.gms.internal.location.zzaz zzazVar, final TaskCompletionSource taskCompletionSource) throws RemoteException {
        final k kVar = new k(this, taskCompletionSource);
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener(this, kVar) { // from class: com.google.android.gms.location.m0
                private final FusedLocationProviderClient a;
                private final LocationCallback b;

                {
                    this.a = this;
                    this.b = kVar;
                }

                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    this.a.removeLocationUpdates(this.b);
                }
            });
        }
        h(zzbaVar, kVar, Looper.getMainLooper(), new o(taskCompletionSource) { // from class: com.google.android.gms.location.n0
            private final TaskCompletionSource a;

            {
                this.a = taskCompletionSource;
            }

            @Override // com.google.android.gms.location.o
            public final void zza() {
                this.a.trySetResult(null);
            }
        }, 2437).continueWithTask(new Continuation(taskCompletionSource) { // from class: com.google.android.gms.location.b
            private final TaskCompletionSource a;

            {
                this.a = taskCompletionSource;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                TaskCompletionSource taskCompletionSource2 = this.a;
                if (!task.isSuccessful()) {
                    if (task.getException() != null) {
                        Exception exception = task.getException();
                        if (exception != null) {
                            taskCompletionSource2.setException(exception);
                        }
                    } else {
                        taskCompletionSource2.trySetResult(null);
                    }
                }
                return taskCompletionSource2.getTask();
            }
        });
    }

    @RecentlyNonNull
    public Task<Void> flushLocations() {
        return doWrite(TaskApiCall.builder().run(k0.a).setMethodKey(2422).build());
    }

    public final /* synthetic */ void g(com.google.android.gms.internal.location.zzaz zzazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(zzazVar.zzz(getContextAttributionTag()));
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getCurrentLocation(int i, @RecentlyNonNull final CancellationToken cancellationToken) {
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setPriority(i);
        locationRequestCreate.setInterval(0L);
        locationRequestCreate.setFastestInterval(0L);
        locationRequestCreate.setExpirationDuration(30000L);
        final com.google.android.gms.internal.location.zzba zzbaVarZza = com.google.android.gms.internal.location.zzba.zza(null, locationRequestCreate);
        zzbaVarZza.zzd(true);
        zzbaVarZza.zzb(10000L);
        Task taskDoRead = doRead(TaskApiCall.builder().run(new RemoteCall(this, cancellationToken, zzbaVarZza) { // from class: com.google.android.gms.location.c
            private final FusedLocationProviderClient a;
            private final CancellationToken b;
            private final com.google.android.gms.internal.location.zzba c;

            {
                this.a = this;
                this.b = cancellationToken;
                this.c = zzbaVarZza;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.a.f(this.b, this.c, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
            }
        }).setFeatures(zzu.zzd).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskDoRead.continueWithTask(new Continuation(taskCompletionSource) { // from class: com.google.android.gms.location.d
            private final TaskCompletionSource a;

            {
                this.a = taskCompletionSource;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                TaskCompletionSource taskCompletionSource2 = this.a;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult((Location) task.getResult());
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        taskCompletionSource2.setException(exception);
                    }
                }
                return taskCompletionSource2.getTask();
            }
        });
        return taskCompletionSource.getTask();
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getLastLocation() {
        return doRead(TaskApiCall.builder().run(new RemoteCall(this) { // from class: com.google.android.gms.location.j0
            private final FusedLocationProviderClient a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.a.g((com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(2414).build());
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<LocationAvailability> getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(e.a).setMethodKey(2416).build());
    }

    @RecentlyNonNull
    public Task<Void> removeLocationUpdates(@RecentlyNonNull final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.h
            private final PendingIntent a;

            {
                this.a = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzG(this.a, new p((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2418).build());
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull final PendingIntent pendingIntent) {
        final com.google.android.gms.internal.location.zzba zzbaVarZza = com.google.android.gms.internal.location.zzba.zza(null, locationRequest);
        return doWrite(TaskApiCall.builder().run(new RemoteCall(this, zzbaVarZza, pendingIntent) { // from class: com.google.android.gms.location.g
            private final FusedLocationProviderClient a;
            private final com.google.android.gms.internal.location.zzba b;
            private final PendingIntent c;

            {
                this.a = this;
                this.b = zzbaVarZza;
                this.c = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.a.d(this.b, this.c, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(2417).build());
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockLocation(@RecentlyNonNull final Location location) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(location) { // from class: com.google.android.gms.location.j
            private final Location a;

            {
                this.a = location;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzJ(this.a);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2421).build());
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockMode(final boolean z) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(z) { // from class: com.google.android.gms.location.i
            private final boolean a;

            {
                this.a = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzI(this.a);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2420).build());
    }

    @VisibleForTesting(otherwise = 3)
    public FusedLocationProviderClient(@RecentlyNonNull Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper());
    }

    @RecentlyNonNull
    public Task<Void> removeLocationUpdates(@RecentlyNonNull LocationCallback locationCallback) {
        return TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, LocationCallback.class.getSimpleName())));
    }

    @RecentlyNonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull LocationCallback locationCallback, @RecentlyNonNull Looper looper) {
        return h(com.google.android.gms.internal.location.zzba.zza(null, locationRequest), locationCallback, looper, null, 2436);
    }
}
