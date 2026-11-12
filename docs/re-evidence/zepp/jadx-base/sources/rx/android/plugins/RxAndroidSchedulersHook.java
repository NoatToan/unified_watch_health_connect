package rx.android.plugins;

import rx.Scheduler;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public class RxAndroidSchedulersHook {
    private static final RxAndroidSchedulersHook a = new RxAndroidSchedulersHook();

    public static RxAndroidSchedulersHook getDefaultInstance() {
        return a;
    }

    public Scheduler getMainThreadScheduler() {
        return null;
    }

    public Action0 onSchedule(Action0 action0) {
        return action0;
    }
}
