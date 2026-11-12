package com.huami.watch.companion.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.sync.SyncResult;
import com.huami.watch.util.Log;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes16.dex */
public final class RxLooper {
    private static final String a = "Looper";
    private static final int b = 1000;

    public class a implements Observer<SyncResult> {
        public final /* synthetic */ AtomicBoolean a;

        public a(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(SyncResult syncResult) {
            this.a.set(syncResult.success);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Log.w(RxLooper.a, "OnError", th, new Object[0]);
            this.a.set(false);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    public class b implements Predicate<SyncResult> {
        @Override // io.reactivex.functions.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(@NonNull SyncResult syncResult) throws Exception {
            return syncResult.finish;
        }
    }

    public class c implements Predicate<SyncResult> {
        @Override // io.reactivex.functions.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(@NonNull SyncResult syncResult) throws Exception {
            return syncResult.finish;
        }
    }

    public class d implements Function<Long, SyncResult> {
        public final /* synthetic */ Function a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ int d;

        public d(Function function, String str, long j, int i) {
            this.a = function;
            this.b = str;
            this.c = j;
            this.d = i;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SyncResult apply(@NonNull Long l) throws Exception {
            SyncResult syncResult = (SyncResult) this.a.apply(null);
            if (syncResult.finish) {
                return syncResult;
            }
            String str = "Timeout Remain : ";
            if (!TextUtils.isEmpty(this.b)) {
                str = this.b + " Timeout Remain : ";
            }
            Log.d(RxLooper.a, str + ((this.c - (l.longValue() * ((long) this.d))) / 1000.0f) + SOAP.XMLNS, new Object[0]);
            return syncResult;
        }
    }

    public static boolean loop(Function<Void, SyncResult> function, int i, long j) {
        return loop(function, i, j, "");
    }

    public static boolean loop(Function<Void, SyncResult> function, int i, long j, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        long j2 = j * 1000;
        long j3 = i;
        Observable.intervalRange(0L, j2 / j3, 0L, j3, TimeUnit.MILLISECONDS).map(new d(function, str, j2, i)).timeout(j, TimeUnit.SECONDS).filter(new c()).takeUntil(new b()).blockingSubscribe(new a(atomicBoolean));
        Log.d(a, "Success : " + atomicBoolean.get(), new Object[0]);
        return atomicBoolean.get();
    }
}
