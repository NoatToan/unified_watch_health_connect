package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedWebActivityServiceConnectionPool {
    private static final String TAG = "TWAConnectionPool";
    private final Map<Uri, ConnectionHolder> mConnections = new HashMap();
    private final Context mContext;

    public static class BindToServiceAsyncTask extends AsyncTask<Void, Void, Exception> {
        private final Context mAppContext;
        private final ConnectionHolder mConnection;
        private final Intent mIntent;

        public BindToServiceAsyncTask(Context context, Intent intent, ConnectionHolder connection) {
            this.mAppContext = context.getApplicationContext();
            this.mIntent = intent;
            this.mConnection = connection;
        }

        @Override // android.os.AsyncTask
        @Nullable
        public Exception doInBackground(Void... voids) {
            try {
                if (this.mAppContext.bindService(this.mIntent, this.mConnection, 4097)) {
                    return null;
                }
                this.mAppContext.unbindService(this.mConnection);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e) {
                Log.w(TrustedWebActivityServiceConnectionPool.TAG, "SecurityException while binding.", e);
                return e;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Exception bindingException) {
            if (bindingException != null) {
                this.mConnection.cancel(bindingException);
            }
        }
    }

    private TrustedWebActivityServiceConnectionPool(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    @NonNull
    public static TrustedWebActivityServiceConnectionPool create(@NonNull Context context) {
        return new TrustedWebActivityServiceConnectionPool(context);
    }

    @Nullable
    private Intent createServiceIntent(Context appContext, Uri scope, Set<Token> possiblePackages, boolean shouldLog) {
        if (possiblePackages == null || possiblePackages.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(scope);
        intent.setAction("android.intent.action.VIEW");
        Iterator<ResolveInfo> it2 = appContext.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        String str = null;
        while (it2.hasNext()) {
            String str2 = it2.next().activityInfo.packageName;
            Iterator<Token> it3 = possiblePackages.iterator();
            while (it3.hasNext()) {
                if (it3.next().matches(str2, appContext.getPackageManager())) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            if (shouldLog) {
                Log.w(TAG, "No TWA candidates for " + scope + " have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(TrustedWebActivityService.ACTION_TRUSTED_WEB_ACTIVITY_SERVICE);
        ResolveInfo resolveInfoResolveService = appContext.getPackageManager().resolveService(intent2, 131072);
        if (resolveInfoResolveService == null) {
            if (shouldLog) {
                Log.w(TAG, "Could not find TWAService for " + str);
            }
            return null;
        }
        if (shouldLog) {
            Log.i(TAG, "Found " + resolveInfoResolveService.serviceInfo.name + " to handle request for " + scope);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveInfoResolveService.serviceInfo.name));
        return intent3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connect$0(Uri uri) {
        this.mConnections.remove(uri);
    }

    @NonNull
    @MainThread
    public ListenableFuture<TrustedWebActivityServiceConnection> connect(@NonNull final Uri scope, @NonNull Set<Token> possiblePackages, @NonNull Executor executor) {
        ConnectionHolder connectionHolder = this.mConnections.get(scope);
        if (connectionHolder != null) {
            return connectionHolder.getServiceWrapper();
        }
        Intent intentCreateServiceIntent = createServiceIntent(this.mContext, scope, possiblePackages, true);
        if (intentCreateServiceIntent == null) {
            return FutureUtils.immediateFailedFuture(new IllegalArgumentException("No service exists for scope"));
        }
        ConnectionHolder connectionHolder2 = new ConnectionHolder(new Runnable() { // from class: lz7
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$connect$0(scope);
            }
        });
        this.mConnections.put(scope, connectionHolder2);
        new BindToServiceAsyncTask(this.mContext, intentCreateServiceIntent, connectionHolder2).executeOnExecutor(executor, new Void[0]);
        return connectionHolder2.getServiceWrapper();
    }

    @MainThread
    public boolean serviceExistsForScope(@NonNull Uri scope, @NonNull Set<Token> possiblePackages) {
        return (this.mConnections.get(scope) == null && createServiceIntent(this.mContext, scope, possiblePackages, false) == null) ? false : true;
    }

    public void unbindAllConnections() {
        Iterator<ConnectionHolder> it2 = this.mConnections.values().iterator();
        while (it2.hasNext()) {
            this.mContext.unbindService(it2.next());
        }
        this.mConnections.clear();
    }
}
