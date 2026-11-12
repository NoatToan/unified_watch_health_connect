package com.amazon.identity.auth.device.utils;

import android.content.Context;
import android.os.RemoteException;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.AmazonAuthorizationServiceInterface;
import com.amazon.identity.auth.device.authorization.ThirdPartyServiceHelper;
import com.amazon.identity.auth.map.device.utils.MAPLog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LWAServiceWrapper<Result> {
    private static final String LOG_TAG = "com.amazon.identity.auth.device.utils.LWAServiceWrapper";
    private static final int SERVICE_BINDING_RETRY_ATTEMPTS = 3;

    public abstract Result doWork(Context context, AmazonAuthorizationServiceInterface amazonAuthorizationServiceInterface) throws AuthError, RemoteException;

    public final Result execute(Context context, ThirdPartyServiceHelper thirdPartyServiceHelper) throws AuthError {
        Result resultDoWork = null;
        RemoteException e = null;
        int i = 0;
        while (i <= 3) {
            try {
                AmazonAuthorizationServiceInterface remoteAndroidService = thirdPartyServiceHelper.getRemoteAndroidService(context, i == 3);
                if (remoteAndroidService != null) {
                    resultDoWork = doWork(context, remoteAndroidService);
                    ThirdPartyServiceHelper.unbind(context);
                    return resultDoWork;
                }
                continue;
            } catch (RemoteException e2) {
                e = e2;
                MAPLog.e(LOG_TAG, "RemoteException", e);
                ThirdPartyServiceHelper.unbind(context);
            }
            i++;
        }
        if (resultDoWork != null || e == null) {
            return resultDoWork;
        }
        throw new AuthError("Service Failure", e, AuthError.ERROR_TYPE.ERROR_THREAD);
    }
}
