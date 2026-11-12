package com.huami.medal.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Pair;
import androidx.annotation.MainThread;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.huami.medal.data.MedalDataManager;
import com.huami.medal.ui.MedalUiHelper;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Medal;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import defpackage.jw4;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import rx.Emitter;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
public class MedalUiHelper implements LifecycleObserver {
    public static final String MEDAL_TYPE_CYCLING = "骑行勋章";
    public static final String MEDAL_TYPE_RUN = "跑步勋章";
    public static final String MEDAL_TYPE_SPORT_WALKING = "健走勋章";
    private static final String h = "MedalUiHelper";
    private final boolean a;
    private Subscription b;
    private final Context d;
    private MedalDialogShowListener e;
    private final LifecycleOwner f;
    private boolean c = true;
    private final BroadcastReceiver g = new c();

    public interface MedalDialogShowListener {
        void onDismiss(boolean z);

        void onShow();
    }

    public class a extends SingleSubscriber<List<Medal>> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c() {
            return "Unexpected error happened while loading medals or showing medal dialog.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(List list, boolean z) {
            return "Medal dialog show finished, medal count:" + list.size() + ", hasSportMedal:" + z;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            th.printStackTrace();
            MedalUiHelper.this.c = true;
            HMLog.error(MedalUiHelper.h, "", th, new Function0() { // from class: com.huami.medal.ui.b
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MedalUiHelper.a.c();
                }
            });
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(final List<Medal> list) {
            Medal next;
            final boolean z = true;
            MedalUiHelper.this.c = true;
            Iterator<Medal> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                next = it2.next();
                if ("跑步勋章".equals(next.getCategory()) || "骑行勋章".equals(next.getCategory())) {
                    break;
                }
            } while (!"健走勋章".equals(next.getCategory()));
            HMLog.debug(MedalUiHelper.h, new Function0() { // from class: com.huami.medal.ui.a
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MedalUiHelper.a.d(list, z);
                }
            });
            if (list.isEmpty() || MedalUiHelper.this.e == null || !MedalUiHelper.this.o()) {
                return;
            }
            MedalUiHelper.this.e.onDismiss(z);
        }
    }

    public class b extends HMLoadTarget<Object> {
        public final /* synthetic */ Emitter a;

        public b(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadCancel() {
            this.a.onNext(Boolean.FALSE);
            this.a.onCompleted();
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            this.a.onNext(Boolean.FALSE);
            this.a.onCompleted();
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Object obj) {
            this.a.onNext(Boolean.TRUE);
            this.a.onCompleted();
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return;
            }
            if (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0) {
                MedalDataManager.syncTakenStateToServer();
            }
        }
    }

    public MedalUiHelper(Context context, LifecycleOwner lifecycleOwner, boolean z) {
        this.d = context.getApplicationContext();
        this.f = lifecycleOwner;
        this.a = z;
        y();
    }

    @MainThread
    private Observable<Boolean> m(Activity activity, Medal medal) {
        final DisplayConfig.ConfigBuilder configBuilderLoad = HMImageLoader.with(activity).load(medal.getObtainIcon());
        return Observable.create(new Action1() { // from class: ow4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.p(configBuilderLoad, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.LATEST).subscribeOn(Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Observable<Medal> x(final FragmentActivity fragmentActivity, final Medal medal) {
        return Observable.create(new Action1() { // from class: nw4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.r(medal, fragmentActivity, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        LifecycleOwner lifecycleOwner = this.f;
        return lifecycleOwner != null && lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(DisplayConfig.ConfigBuilder configBuilder, Emitter emitter) {
        if (configBuilder.obtain() == null) {
            configBuilder.downloadOnlyExecute(new b(emitter));
        } else {
            emitter.onNext(Boolean.TRUE);
            emitter.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Emitter emitter, Medal medal, DialogInterface dialogInterface) {
        emitter.onNext(medal);
        emitter.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(final Medal medal, FragmentActivity fragmentActivity, final Emitter emitter) {
        if (!o()) {
            emitter.onNext(medal);
            emitter.onCompleted();
            return;
        }
        MedalDialogFragment.builder().setMedal(medal).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: iw4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MedalUiHelper.q(emitter, medal, dialogInterface);
            }
        }).create().show(fragmentActivity.getSupportFragmentManager(), "MedalDialog:" + medal.getId());
        MedalDialogShowListener medalDialogShowListener = this.e;
        if (medalDialogShowListener != null) {
            medalDialogShowListener.onShow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "Try to load medals, but this feature does not support for this version";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t() {
        return "Already loading medals";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable u(FragmentActivity fragmentActivity, Medal medal) {
        return Observable.zip(Observable.just(medal), m(fragmentActivity, medal), new Func2() { // from class: kw4
            @Override // rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return new Pair((Medal) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean v(Pair pair) {
        return (Boolean) pair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Medal w(Pair pair) {
        return (Medal) pair.first;
    }

    private void y() {
        if (this.a) {
            this.d.registerReceiver(this.g, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void cancelRequest() {
        Subscription subscription;
        if (!this.a || (subscription = this.b) == null || subscription.isUnsubscribed()) {
            return;
        }
        this.b.unsubscribe();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void clearListener() {
        this.e = null;
    }

    public void loadNotTakenMedalsThenShowMedalDialog(String str, final FragmentActivity fragmentActivity) {
        if (!this.a) {
            HMLog.debug(h, new Function0() { // from class: mw4
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MedalUiHelper.s();
                }
            });
        } else {
            if (!this.c) {
                HMLog.debug(h, new Function0() { // from class: lw4
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return MedalUiHelper.t();
                    }
                });
                return;
            }
            MedalDataManager.syncTakenStateToServer();
            this.c = false;
            this.b = MedalDataManager.loadNotTakenMedalsInRx(str).flatMap(jw4.a).concatMap(new Func1() { // from class: qw4
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return this.a.u(fragmentActivity, (Medal) obj);
                }
            }).filter(new Func1() { // from class: rw4
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return MedalUiHelper.v((Pair) obj);
                }
            }).map(new Func1() { // from class: sw4
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return MedalUiHelper.w((Pair) obj);
                }
            }).map(new Func1() { // from class: pw4
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return this.a.x(fragmentActivity, (Medal) obj);
                }
            }).toList().flatMap(new Func1() { // from class: tw4
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return Observable.concat((List) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).toList().toSingle().subscribe(new a());
        }
    }

    public void setShowListener(MedalDialogShowListener medalDialogShowListener) {
        this.e = medalDialogShowListener;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void unregisterReceiver() {
        if (this.a) {
            this.d.unregisterReceiver(this.g);
        }
    }
}
