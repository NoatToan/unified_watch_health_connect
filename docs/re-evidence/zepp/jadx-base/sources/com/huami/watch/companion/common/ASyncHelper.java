package com.huami.watch.companion.common;

import android.util.SparseArray;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class ASyncHelper {
    public static final int STATE_NONE = 0;
    private final List<Consumer<Integer>> a;
    public int mState;
    public final SparseArray<String> mStateDescriptions;
    public Disposable mSubscription;

    public ASyncHelper() {
        SparseArray<String> sparseArray = new SparseArray<>();
        this.mStateDescriptions = sparseArray;
        this.a = new ArrayList();
        fillStateDescriptions(sparseArray);
    }

    private void a() {
        Log.d(tag(), "Clear Callbacks!!", new Object[0]);
        synchronized (this.a) {
            if (this.a.size() > 0) {
                this.a.clear();
            }
        }
    }

    public void addCallback(Consumer<Integer> consumer) {
        Log.d(tag(), "Add Callback : " + consumer, new Object[0]);
        if (consumer == null) {
            return;
        }
        synchronized (this.a) {
            if (!this.a.contains(consumer)) {
                this.a.add(consumer);
            }
        }
    }

    public void fillStateDescriptions(SparseArray<String> sparseArray) {
    }

    public boolean isIdle() {
        return this.mState == 0;
    }

    public void notifyStateChanged(int i) {
        this.mState = i;
        synchronized (this.a) {
            if (this.a.size() > 0) {
                Iterator<Consumer<Integer>> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().accept(Integer.valueOf(this.mState));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e(tag(), "NotifyStateChangedErr", e, new Object[0]);
                        Analytics.exception(new Exception("NotifyStateChangedErr", e));
                    }
                }
            }
        }
    }

    public void release() {
        this.mState = 0;
        a();
        Disposable disposable = this.mSubscription;
        if (disposable != null) {
            disposable.dispose();
            this.mSubscription = null;
        }
    }

    public void removeCallback(Consumer<Integer> consumer) {
        Log.d(tag(), "Remove Callback : " + consumer, new Object[0]);
        if (consumer == null) {
            return;
        }
        synchronized (this.a) {
            this.a.remove(consumer);
        }
    }

    public String state(int i) {
        return i + ", " + this.mStateDescriptions.get(i) + ", Prev: " + this.mState + ", " + this.mStateDescriptions.get(this.mState);
    }

    public abstract String tag();

    public int state() {
        return this.mState;
    }
}
