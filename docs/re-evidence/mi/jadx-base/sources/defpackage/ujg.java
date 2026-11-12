package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.client.IClientCallback;
import com.xiaomi.smarthome.core.entity.account.AccountType;
import com.xiaomi.smarthome.core.entity.net.Crypto;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.IServerHandle;
import com.xiaomi.smarthome.core.server.MiHomeMemoryFile;
import com.xiaomi.smarthome.core.server.internal.Const;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.account.MiJiaAccountManager;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeAesApi;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeHttpsApi;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeOAuthHttpsApi;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeOpenApi;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.device.api.Callback;
import com.xiaomi.smarthome.device.api.Parser;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.AsyncHandle;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.frame.JsonParser;
import com.xiaomi.smarthome.frame.SmartHomeApiParser;
import com.xiaomi.smarthome.frame.SyncCallback;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;
import com.xiaomi.smarthome.utils.ExtsKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ujg {
    public static volatile ujg e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f35823b;
    public MessageHandlerThread c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f35822a = new Random();
    public List<j> d = new CopyOnWriteArrayList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements JsonParser<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Parser f35824a;

        public a(Parser parser) {
            this.f35824a = parser;
        }

        @Override // com.xiaomi.smarthome.frame.JsonParser
        public T parse(JSONObject jSONObject) throws JSONException {
            Parser parser = this.f35824a;
            if (parser != null) {
                return (T) parser.parse(jSONObject.toString());
            }
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends AsyncCallback<T, Error> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f35826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Looper f35827b;

        public b(Callback callback, Looper looper) {
            this.f35826a = callback;
            this.f35827b = looper;
        }

        @Override // com.xiaomi.smarthome.frame.AsyncCallback
        public void onFailure(Error error) {
            if (error != null) {
                ujg.this.g(this.f35826a, error.getCode(), error.getDetail(), this.f35827b);
            } else {
                ujg.this.g(this.f35826a, -1, "", this.f35827b);
            }
        }

        @Override // com.xiaomi.smarthome.frame.AsyncCallback
        public void onSuccess(T t) {
            ujg.this.h(this.f35826a, t, this.f35827b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f35828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f35829b;

        public c(Callback callback, Object obj) {
            this.f35828a = callback;
            this.f35829b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Callback callback = this.f35828a;
            if (callback != null) {
                callback.onSuccess(this.f35829b);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f35830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35831b;
        public final /* synthetic */ String c;

        public d(Callback callback, int i, String str) {
            this.f35830a = callback;
            this.f35831b = i;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Callback callback = this.f35830a;
            if (callback != null) {
                callback.onFailure(this.f35831b, this.c);
            }
        }
    }

    public class e extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JsonParser f35832b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AsyncCallback asyncCallback, JsonParser jsonParser, boolean z, long j) {
            super(asyncCallback);
            this.f35832b = jsonParser;
            this.c = z;
            this.d = j;
        }

        @Override // com.xiaomi.smarthome.core.client.IClientCallback
        public void onFailure(Bundle bundle) throws RemoteException {
            bundle.setClassLoader(Error.class.getClassLoader());
            NetError netError = (NetError) bundle.getParcelable("error");
            Error error = !TextUtils.isEmpty(netError.getmExtraMsg()) ? new Error(netError.getCode(), netError.getDetail(), netError.getmExtraMsg()) : new Error(netError.getCode(), netError.getDetail());
            AsyncCallback asyncCallback = this.f35844a;
            if (asyncCallback != null) {
                asyncCallback.sendFailureMessage(error);
            }
            AsyncCallback asyncCallback2 = this.f35844a;
            if (asyncCallback2 == null || !(asyncCallback2 instanceof SyncCallback)) {
                ujg.this.i(this.d);
            }
            this.f35844a = null;
        }

        @Override // com.xiaomi.smarthome.core.client.IClientCallback
        public void onSuccess(Bundle bundle) throws RemoteException {
            MiHomeMemoryFile miHomeMemoryFile;
            bundle.setClassLoader(NetResult.class.getClassLoader());
            NetResult netResult = (NetResult) bundle.getParcelable("result");
            if (netResult == null && (miHomeMemoryFile = (MiHomeMemoryFile) bundle.getParcelable(Const.ON_SUCCESS_RESULT_FILE)) != null) {
                Parcel parcel = miHomeMemoryFile.readParcel();
                netResult = (NetResult) parcel.readParcelable(NetResult.class.getClassLoader());
                parcel.recycle();
            }
            SmartHomeApiParser.getInstance().parse(netResult, this.f35832b, this.f35844a, this.c);
            if (netResult.mIsCache) {
                return;
            }
            AsyncCallback asyncCallback = this.f35844a;
            if (asyncCallback == null || !(asyncCallback instanceof SyncCallback)) {
                ujg.this.i(this.d);
            }
            this.f35844a = null;
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f35833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AsyncHandle f35834b;
        public final /* synthetic */ int c;

        public f(long j, AsyncHandle asyncHandle, int i) {
            this.f35833a = j;
            this.f35834b = asyncHandle;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = new j(ujg.this, null);
            jVar.f35845a = this.f35833a;
            jVar.c = new WeakReference<>(this.f35834b);
            jVar.f35846b = this.c;
            ujg.this.d.add(jVar);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f35835a;

        public g(long j) {
            this.f35835a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (i < ujg.this.d.size()) {
                if (ujg.this.d.get(i).f35845a == this.f35835a) {
                    ujg.this.d.remove(i);
                    i--;
                }
                i++;
            }
        }
    }

    public class h extends jl4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NetHandle f35837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Crypto f35838b;
        public final /* synthetic */ NetRequest c;
        public final /* synthetic */ IClientCallback d;

        public class a implements NetCallback<NetResult, NetError> {
            public a() {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onCache(NetResult netResult) {
                if (h.this.d != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("result", netResult);
                    try {
                        h.this.d.onSuccess(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onFailure(NetError netError) {
                if (h.this.d != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("error", netError);
                        h.this.d.onFailure(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(NetResult netResult) {
                if (h.this.d != null) {
                    try {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("result", netResult);
                            h.this.d.onSuccess(bundle);
                        } catch (Exception unused) {
                        }
                    } catch (TransactionTooLargeException unused2) {
                        Bundle bundle2 = new Bundle();
                        MiHomeMemoryFile miHomeMemoryFile = new MiHomeMemoryFile();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeParcelable(netResult, 0);
                        miHomeMemoryFile.saveParcel(parcelObtain.marshall());
                        parcelObtain.recycle();
                        bundle2.putParcelable(Const.ON_SUCCESS_RESULT_FILE, miHomeMemoryFile);
                        h.this.d.onSuccess(bundle2);
                    } catch (Exception unused3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("fatal");
                        sb.append(h.this.c.getPath());
                        sb.append(h.this.c.getQueryParams());
                    }
                }
            }
        }

        public class b implements NetCallback<NetResult, NetError> {
            public b() {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onFailure(NetError netError) {
                if (h.this.d != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("error", netError);
                        h.this.d.onFailure(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(NetResult netResult) {
                if (h.this.d != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("result", netResult);
                    try {
                        h.this.d.onSuccess(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        public class c implements NetCallback<NetResult, NetError> {
            public c() {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onFailure(NetError netError) {
                if (h.this.d != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("error", netError);
                        h.this.d.onFailure(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(NetResult netResult) {
                if (h.this.d != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("result", netResult);
                    try {
                        h.this.d.onSuccess(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        public class d implements NetCallback<NetResult, NetError> {
            public d() {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onFailure(NetError netError) {
                if (h.this.d != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("error", netError);
                        h.this.d.onFailure(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(NetResult netResult) {
                if (h.this.d != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("result", netResult);
                    try {
                        h.this.d.onSuccess(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        public class e implements NetCallback<NetResult, NetError> {
            public e() {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onFailure(NetError netError) {
                if (h.this.d != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("error", netError);
                        h.this.d.onFailure(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(NetResult netResult) {
                if (h.this.d != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("result", netResult);
                    try {
                        h.this.d.onSuccess(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        public h(Crypto crypto, NetRequest netRequest, IClientCallback iClientCallback) {
            this.f35838b = crypto;
            this.c = netRequest;
            this.d = iClientCallback;
        }

        @Override // defpackage.jl4
        public void onCancel() {
            NetHandle netHandle = this.f35837a;
            if (netHandle != null) {
                netHandle.cancel();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Crypto crypto = this.f35838b;
            try {
                if (crypto == Crypto.RC4) {
                    AccountType accountType = MiJiaAccountManager.getInstance().getAccountType();
                    if (accountType == AccountType.MI) {
                        this.f35837a = SmartHomeRc4Api.getInstance().sendRequest(this.c, new a());
                        return;
                    }
                    if (accountType == AccountType.WX) {
                        this.f35837a = SmartHomeOAuthHttpsApi.getInstance().sendRequest(this.c, new b());
                        return;
                    }
                    if (this.d == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("error", new NetError(-9999, "unknown account type:" + accountType));
                    this.d.onFailure(bundle);
                } else {
                    if (crypto == Crypto.NONE) {
                        this.f35837a = SmartHomeOpenApi.getInstance().sendRequest(this.c, new c());
                        return;
                    }
                    if (crypto == Crypto.AES) {
                        this.f35837a = SmartHomeAesApi.getInstance().sendRequest(this.c, new d());
                        return;
                    }
                    if (crypto == Crypto.HTTPS) {
                        this.f35837a = SmartHomeHttpsApi.getInstance().sendRequest(this.c, new e());
                    } else {
                        if (this.d == null) {
                            return;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("error", new NetError(-9999, "crypto not support"));
                        this.d.onFailure(bundle2);
                    }
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public static abstract class i extends IClientCallback.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AsyncCallback f35844a;

        public i(AsyncCallback asyncCallback) {
            this.f35844a = asyncCallback;
        }
    }

    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f35845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35846b;
        public WeakReference<AsyncHandle> c;

        public j() {
        }

        public /* synthetic */ j(ujg ujgVar, a aVar) {
            this();
        }
    }

    public ujg() {
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread("NetworkBridge");
        this.c = messageHandlerThread;
        messageHandlerThread.start();
        this.f35823b = new Handler(this.c.getLooper());
    }

    public static ujg e() {
        if (e == null) {
            synchronized (ujg.class) {
                try {
                    if (e == null) {
                        e = new ujg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final void b(long j2, int i2, AsyncHandle asyncHandle) {
        this.f35823b.post(new f(j2, asyncHandle, i2));
    }

    public <T> void c(String str, String str2, String str3, Callback<T> callback, Parser<T> parser) {
        Looper looperF = f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", str3));
        NetRequest.Builder builder = new NetRequest.Builder();
        builder.method("POST").path(str2).addQueries(arrayList);
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new KeyValuePair("MIOT-REQUEST-MODEL", str));
            builder.addHeaders(arrayList2);
        }
        k(null, builder.build(), new a(parser), Crypto.RC4, new b(callback, looperF), parser instanceof pfh);
    }

    public long d() {
        return this.f35822a.nextLong();
    }

    public Looper f() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
    }

    public <T> void g(Callback<T> callback, int i2, String str, Looper looper) {
        if (callback == null) {
            return;
        }
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        new Handler(looper).post(new d(callback, i2, str));
    }

    public <T> void h(Callback<T> callback, T t, Looper looper) {
        if (callback == null) {
            return;
        }
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        new Handler(looper).post(new c(callback, t));
    }

    public final void i(long j2) {
        this.f35823b.post(new g(j2));
    }

    public IServerHandle j(NetRequest netRequest, Crypto crypto, IClientCallback iClientCallback) throws RemoteException {
        h hVar = new h(crypto, netRequest, iClientCallback);
        hVar.execute();
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> AsyncHandle k(Context context, NetRequest netRequest, JsonParser<R> jsonParser, Crypto crypto, AsyncCallback<R, Error> asyncCallback, boolean z) {
        IServerHandle iServerHandleJ;
        int iHashCode = context != null ? context.hashCode() : 0;
        long jD = d();
        e eVar = new e(asyncCallback, jsonParser, z, jD);
        boolean z2 = asyncCallback instanceof SyncCallback;
        if (z2) {
            try {
                ((SyncCallback) asyncCallback).setUseSyncLockMode();
                Object syncLock = ((SyncCallback) asyncCallback).getSyncLock();
                synchronized (syncLock) {
                    iServerHandleJ = j(netRequest, crypto, eVar);
                    syncLock.wait();
                }
                SyncCallback syncCallback = (SyncCallback) asyncCallback;
                if (syncCallback.isSuccess()) {
                    asyncCallback.onSuccess(syncCallback.getResult());
                } else {
                    asyncCallback.onFailure(syncCallback.getError());
                }
            } catch (Throwable th) {
                if (asyncCallback != 0) {
                    asyncCallback.sendFailureMessage(new Error(-9999, ExtsKt.getString(th)));
                }
                return new AsyncHandle(null);
            }
        } else {
            try {
                iServerHandleJ = j(netRequest, crypto, eVar);
            } catch (Throwable th2) {
                if (asyncCallback != 0) {
                    asyncCallback.sendFailureMessage(new Error(-9999, ExtsKt.getString(th2)));
                }
                return new AsyncHandle(null);
            }
        }
        AsyncHandle asyncHandle = new AsyncHandle(iServerHandleJ);
        if (!z2) {
            b(jD, iHashCode, asyncHandle);
        }
        return asyncHandle;
    }
}
