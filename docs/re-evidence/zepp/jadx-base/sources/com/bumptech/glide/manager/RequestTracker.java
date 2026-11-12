package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alipay.sdk.m.u.i;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RequestTracker {
    private static final String d = "RequestTracker";
    private final Set<Request> a = Collections.newSetFromMap(new WeakHashMap());
    private final List<Request> b = new ArrayList();
    private boolean c;

    private boolean b(@Nullable Request request, boolean z) {
        boolean z2 = true;
        if (request == null) {
            return true;
        }
        boolean zRemove = this.a.remove(request);
        if (!this.b.remove(request) && !zRemove) {
            z2 = false;
        }
        if (z2) {
            request.clear();
            if (z) {
                request.recycle();
            }
        }
        return z2;
    }

    @VisibleForTesting
    public void a(Request request) {
        this.a.add(request);
    }

    public boolean clearRemoveAndRecycle(@Nullable Request request) {
        return b(request, true);
    }

    public void clearRequests() {
        Iterator it2 = Util.getSnapshot(this.a).iterator();
        while (it2.hasNext()) {
            b((Request) it2.next(), false);
        }
        this.b.clear();
    }

    public boolean isPaused() {
        return this.c;
    }

    public void pauseAllRequests() {
        this.c = true;
        for (Request request : Util.getSnapshot(this.a)) {
            if (request.isRunning() || request.isComplete()) {
                request.clear();
                this.b.add(request);
            }
        }
    }

    public void pauseRequests() {
        this.c = true;
        for (Request request : Util.getSnapshot(this.a)) {
            if (request.isRunning()) {
                request.clear();
                this.b.add(request);
            }
        }
    }

    public void restartRequests() {
        for (Request request : Util.getSnapshot(this.a)) {
            if (!request.isComplete() && !request.isCleared()) {
                request.clear();
                if (this.c) {
                    this.b.add(request);
                } else {
                    request.begin();
                }
            }
        }
    }

    public void resumeRequests() {
        this.c = false;
        for (Request request : Util.getSnapshot(this.a)) {
            if (!request.isComplete() && !request.isRunning()) {
                request.begin();
            }
        }
        this.b.clear();
    }

    public void runRequest(@NonNull Request request) {
        this.a.add(request);
        if (!this.c) {
            request.begin();
            return;
        }
        request.clear();
        if (Log.isLoggable(d, 2)) {
            Log.v(d, "Paused, delaying request");
        }
        this.b.add(request);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + i.d;
    }
}
