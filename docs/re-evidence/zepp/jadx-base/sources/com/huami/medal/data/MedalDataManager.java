package com.huami.medal.data;

import android.text.TextUtils;
import com.huami.medal.data.MedalDataManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Medal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
public class MedalDataManager {
    public static final String MEDAL_TYPE_ACTIVITY = "activity";
    public static final String MEDAL_TYPE_CYCLING = "qixing";
    public static final String MEDAL_TYPE_RUN = "run";
    public static final String MEDAL_TYPE_SPORT_WALKING = "jianzou";
    public static final String MEDAL_TYPE_WALK = "walk";
    private static final String a = "MedalDataManager";
    private static final int b = 3;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MedalType {
    }

    public class a extends SingleSubscriber<Boolean> {
        public final /* synthetic */ Medal b;

        public a(Medal medal) {
            this.b = medal;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b() {
            return "Unexpected error happened while taking medal.";
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            final StringBuilder sb = new StringBuilder("Fail to take medal to server. Medal id:");
            sb.append(this.b.getId());
            sb.append(", name:");
            sb.append(this.b.getTitle());
            HMLog.warn(MedalDataManager.a, new Function0() { // from class: gw4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return sb.toString();
                }
            });
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            th.printStackTrace();
            HMLog.error(MedalDataManager.a, "", th, new Function0() { // from class: com.huami.medal.data.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MedalDataManager.a.b();
                }
            });
        }
    }

    public class b extends Subscriber<Boolean> {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "syncTakenStateToServer failed";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(Boolean bool) {
            return "syncTakenStateToServer success:" + bool;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onNext(final Boolean bool) {
            HMLog.debug(MedalDataManager.a, new Function0() { // from class: com.huami.medal.data.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MedalDataManager.b.e(bool);
                }
            });
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
            HMLog.warn(MedalDataManager.a, th, new Function0() { // from class: com.huami.medal.data.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MedalDataManager.b.d();
                }
            });
        }
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.hashCode();
        switch (str) {
            case "activity":
                return Medal.MEDAL_CATEGORY_ACTIVITY;
            case "jianzou":
                return "健走勋章";
            case "qixing":
                return "骑行勋章";
            case "run":
                return "跑步勋章";
            case "walk":
                return Medal.MEDAL_CATEGORY_WALK;
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List f(String str, List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Medal) it2.next()).setState(0);
        }
        String strE = e(str);
        e.g(strE, list);
        List<Medal> listC = e.c(strE, list);
        return listC.size() > 3 ? listC.subList(0, 3) : listC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean g(Medal medal) {
        if (!h.i(medal.getId())) {
            return Boolean.FALSE;
        }
        e.b(medal);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean h(Medal medal) throws Exception {
        medal.setState(1);
        e.i(medal);
        return Boolean.valueOf(h.i(medal.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(Medal medal, Boolean bool) {
        if (!bool.booleanValue()) {
            return Boolean.FALSE;
        }
        e.b(medal);
        return Boolean.TRUE;
    }

    public static Observable<List<Medal>> loadNotTakenMedalsInRx(final String str) {
        return h.g(str, h.l).map(new Func1() { // from class: ew4
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return MedalDataManager.f(str, (List) obj);
            }
        });
    }

    public static void syncTakenStateToServer() {
        e.h().map(new Func1() { // from class: fw4
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return MedalDataManager.g((Medal) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Subscriber) new b());
    }

    public static void takeMedalInRx(final Medal medal) {
        if (medal == null) {
            return;
        }
        Observable.fromCallable(new Callable() { // from class: cw4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MedalDataManager.h(medal);
            }
        }).subscribeOn(Schedulers.io()).map(new Func1() { // from class: dw4
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return MedalDataManager.i(medal, (Boolean) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new a(medal));
    }
}
