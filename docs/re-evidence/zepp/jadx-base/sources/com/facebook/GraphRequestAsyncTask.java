package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.alipay.sdk.m.u.i;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.huami.watch.companion.esim.AbsEsimOperation;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u0016\u0018\u0000 *2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001*B\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"B\u001d\b\u0016\u0012\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\u000b\"\u00020#¢\u0006\u0004\b!\u0010$B\u0017\b\u0016\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020#0%¢\u0006\u0004\b!\u0010&B\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010'B'\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\u000b\"\u00020#¢\u0006\u0004\b!\u0010(B!\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020#0%¢\u0006\u0004\b!\u0010)J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0017J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014J+\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eR4\u0010\u0016\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0019\u0010 \u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006+"}, d2 = {"Lcom/facebook/GraphRequestAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/facebook/GraphResponse;", "", "toString", "", "onPreExecute", "result", "onPostExecute", "", "params", "doInBackground", "([Ljava/lang/Void;)Ljava/util/List;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<set-?>", "a", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", Constants.EXCEPTION, "Ljava/net/HttpURLConnection;", "b", "Ljava/net/HttpURLConnection;", AbsEsimOperation.HEADER_CONNECTION, "Lcom/facebook/GraphRequestBatch;", "c", "Lcom/facebook/GraphRequestBatch;", "getRequests", "()Lcom/facebook/GraphRequestBatch;", "requests", "<init>", "(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V", "Lcom/facebook/GraphRequest;", "([Lcom/facebook/GraphRequest;)V", "", "(Ljava/util/Collection;)V", "(Lcom/facebook/GraphRequestBatch;)V", "(Ljava/net/HttpURLConnection;[Lcom/facebook/GraphRequest;)V", "(Ljava/net/HttpURLConnection;Ljava/util/Collection;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<? extends GraphResponse>> {
    private static final String d = GraphRequestAsyncTask.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Exception exception;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HttpURLConnection connection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final GraphRequestBatch requests;

    public GraphRequestAsyncTask(@Nullable HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        this.connection = httpURLConnection;
        this.requests = graphRequestBatch;
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends GraphResponse> doInBackground(Void[] voidArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return doInBackground2(voidArr);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public final Exception getException() {
        return this.exception;
    }

    @NotNull
    public final GraphRequestBatch getRequests() {
        return this.requests;
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends GraphResponse> list) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            onPostExecute2((List<GraphResponse>) list);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @VisibleForTesting(otherwise = 4)
    public void onPreExecute() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (FacebookSdk.isDebugEnabled()) {
                String str = d;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Utility.logd(str, String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1)));
            }
            if (this.requests.getCallbackHandler() == null) {
                this.requests.setCallbackHandler(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @NotNull
    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.connection + ", requests: " + this.requests + i.d;
    }

    public GraphRequestAsyncTask(@NotNull GraphRequest... graphRequestArr) {
        this((HttpURLConnection) null, new GraphRequestBatch((GraphRequest[]) Arrays.copyOf(graphRequestArr, graphRequestArr.length)));
    }

    @VisibleForTesting(otherwise = 4)
    @Nullable
    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public List<GraphResponse> doInBackground2(@NotNull Void... params) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                HttpURLConnection httpURLConnection = this.connection;
                return httpURLConnection == null ? this.requests.executeAndWait() : GraphRequest.INSTANCE.executeConnectionAndWait(httpURLConnection, this.requests);
            } catch (Exception e) {
                this.exception = e;
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    public void onPostExecute2(@NotNull List<GraphResponse> result) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onPostExecute(result);
            Exception exc = this.exception;
            if (exc != null) {
                String str = d;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Utility.logd(str, String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public GraphRequestAsyncTask(@NotNull Collection<GraphRequest> collection) {
        this((HttpURLConnection) null, new GraphRequestBatch(collection));
    }

    public GraphRequestAsyncTask(@NotNull GraphRequestBatch graphRequestBatch) {
        this((HttpURLConnection) null, graphRequestBatch);
    }

    public GraphRequestAsyncTask(@Nullable HttpURLConnection httpURLConnection, @NotNull GraphRequest... graphRequestArr) {
        this(httpURLConnection, new GraphRequestBatch((GraphRequest[]) Arrays.copyOf(graphRequestArr, graphRequestArr.length)));
    }

    public GraphRequestAsyncTask(@Nullable HttpURLConnection httpURLConnection, @NotNull Collection<GraphRequest> collection) {
        this(httpURLConnection, new GraphRequestBatch(collection));
    }
}
