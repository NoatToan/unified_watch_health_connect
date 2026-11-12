package com.google.android.gms.fitness.service;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.fitness.zzbh;
import com.google.android.gms.internal.fitness.zzcn;
import com.google.android.gms.internal.fitness.zzer;
import com.google.android.gms.internal.fitness.zzet;
import com.google.android.gms.internal.fitness.zzeu;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FitnessSensorService extends Service {

    @RecentlyNonNull
    public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
    private a a;

    @Override // android.app.Service
    @RecentlyNullable
    @CallSuper
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        if (!SERVICE_INTERFACE.equals(intent.getAction())) {
            return null;
        }
        if (Log.isLoggable("FitnessSensorService", 3)) {
            String strValueOf = String.valueOf(intent);
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20 + name.length());
            sb.append("Intent ");
            sb.append(strValueOf);
            sb.append(" received by ");
            sb.append(name);
            Log.d("FitnessSensorService", sb.toString());
        }
        return this.a.asBinder();
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        super.onCreate();
        this.a = new a();
    }

    @RecentlyNonNull
    public abstract List<DataSource> onFindDataSources(@RecentlyNonNull List<DataType> list);

    public abstract boolean onRegister(@RecentlyNonNull FitnessSensorServiceRequest fitnessSensorServiceRequest);

    public abstract boolean onUnregister(@RecentlyNonNull DataSource dataSource);

    @VisibleForTesting
    @TargetApi(19)
    public final void zzac() {
        int callingUid = Binder.getCallingUid();
        if (PlatformVersion.isAtLeastKitKat()) {
            ((AppOpsManager) getSystemService("appops")).checkPackage(callingUid, "com.google.android.gms");
            return;
        }
        String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (str.equals("com.google.android.gms")) {
                    return;
                }
            }
        }
        throw new SecurityException("Unauthorized caller");
    }

    public static class a extends zzeu {
        private final FitnessSensorService b;

        private a(FitnessSensorService fitnessSensorService) {
            this.b = fitnessSensorService;
        }

        @Override // com.google.android.gms.internal.fitness.zzev
        public final void zza(zzer zzerVar, zzbh zzbhVar) throws RemoteException {
            this.b.zzac();
            zzbhVar.zza(new DataSourcesResult(this.b.onFindDataSources(zzerVar.getDataTypes()), Status.RESULT_SUCCESS));
        }

        @Override // com.google.android.gms.internal.fitness.zzev
        public final void zza(FitnessSensorServiceRequest fitnessSensorServiceRequest, zzcn zzcnVar) throws RemoteException {
            this.b.zzac();
            if (this.b.onRegister(fitnessSensorServiceRequest)) {
                zzcnVar.onResult(Status.RESULT_SUCCESS);
            } else {
                zzcnVar.onResult(new Status(13));
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzev
        public final void zza(zzet zzetVar, zzcn zzcnVar) throws RemoteException {
            this.b.zzac();
            if (this.b.onUnregister(zzetVar.getDataSource())) {
                zzcnVar.onResult(Status.RESULT_SUCCESS);
            } else {
                zzcnVar.onResult(new Status(13));
            }
        }
    }
}
