package com.huami.watch.companion.sync;

import android.content.Context;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseSyncHelper {
    private static final Map<Class<? extends BaseSyncHelper>, BaseSyncHelper> d = new HashMap();
    public boolean a;
    public boolean b;
    private Transporter.DataListener c = new a();
    public Context mContext;
    public Disposable mSubscription;
    public Transporter mTransporter;

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            Log.v(BaseSyncHelper.this.tag(), "OnDataReceived : " + transportDataItem, new Object[0]);
            BaseSyncHelper.this.onDataReceived(transportDataItem.getAction(), transportDataItem.getData());
        }
    }

    public class b implements ObservableOnSubscribe<Boolean> {
        public b() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Boolean> observableEmitter) throws Exception {
            observableEmitter.onNext(Boolean.valueOf(BaseSyncHelper.this.start()));
        }
    }

    public class c implements Consumer<Boolean> {
        public c() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NonNull Boolean bool) throws Exception {
        }
    }

    public class d implements DoLooper.Function<DoLooper.Result> {
        public d() {
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() throws Exception {
            DoLooper.Result result = new DoLooper.Result();
            BaseSyncHelper baseSyncHelper = BaseSyncHelper.this;
            result.finish = !baseSyncHelper.a;
            result.success = baseSyncHelper.b;
            return result;
        }
    }

    public static BaseSyncHelper getHelper(Context context, Transporter transporter, Class<? extends BaseSyncHelper> cls) {
        BaseSyncHelper baseSyncHelper;
        Map<Class<? extends BaseSyncHelper>, BaseSyncHelper> map = d;
        synchronized (map) {
            baseSyncHelper = map.containsKey(cls) ? map.get(cls) : null;
        }
        if (baseSyncHelper == null) {
            try {
                BaseSyncHelper baseSyncHelperNewInstance = cls.newInstance();
                if (context != null) {
                    try {
                        baseSyncHelperNewInstance.mContext = context.getApplicationContext();
                    } catch (IllegalAccessException e) {
                        e = e;
                        baseSyncHelper = baseSyncHelperNewInstance;
                        e.printStackTrace();
                    } catch (InstantiationException e2) {
                        e = e2;
                        baseSyncHelper = baseSyncHelperNewInstance;
                        e.printStackTrace();
                    }
                }
                baseSyncHelperNewInstance.mTransporter = transporter;
                baseSyncHelper = baseSyncHelperNewInstance;
            } catch (IllegalAccessException e3) {
                e = e3;
            } catch (InstantiationException e4) {
                e = e4;
            }
            if (baseSyncHelper == null) {
                throw new IllegalArgumentException(cls.getSimpleName() + " Not Found!!");
            }
            Transporter transporter2 = baseSyncHelper.mTransporter;
            if (transporter2 != null) {
                transporter2.addDataListener(baseSyncHelper.c);
            }
            Map<Class<? extends BaseSyncHelper>, BaseSyncHelper> map2 = d;
            synchronized (map2) {
                map2.put(cls, baseSyncHelper);
            }
        }
        return baseSyncHelper;
    }

    public boolean doSync(int i, int i2) {
        return DoLooper.doLoop(new d(), i, i2);
    }

    public boolean isSyncing() {
        return this.a;
    }

    public void onDataReceived(String str, DataBundle dataBundle) {
    }

    public void onError() {
        onRelease();
    }

    public void onFinish(boolean z) {
    }

    public void onRelease() {
        this.a = false;
        this.b = false;
        Disposable disposable = this.mSubscription;
        if (disposable != null) {
            disposable.dispose();
            this.mSubscription = null;
        }
    }

    public abstract boolean onStart();

    public void release() {
        Log.i(tag(), "Sync Release...", new Object[0]);
        onRelease();
    }

    public boolean start() {
        boolean zOnStart;
        Log.i(tag(), "Sync Start...", new Object[0]);
        if (this.a) {
            Log.w(tag(), "Already Syncing...Abort!!", new Object[0]);
            return false;
        }
        this.a = true;
        this.b = false;
        try {
            zOnStart = onStart();
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(tag(), "SyncErr", e, new Object[0]);
            onError();
            zOnStart = false;
        }
        this.a = false;
        this.b = zOnStart;
        Log.i(tag(), "Sync Finish, Success : " + zOnStart, new Object[0]);
        try {
            onFinish(zOnStart);
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.w(tag(), "SyncFinishErr", e2, new Object[0]);
            onError();
        }
        return zOnStart;
    }

    public void startAsync(Consumer<Boolean> consumer) {
        this.mSubscription = Rx.io(new b()).subscribe(consumer);
    }

    public String tag() {
        return getClass().getSimpleName();
    }

    public void startAsync() {
        startAsync(new c());
    }
}
