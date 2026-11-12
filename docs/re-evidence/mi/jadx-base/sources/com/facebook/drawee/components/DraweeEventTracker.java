package com.facebook.drawee.components;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class DraweeEventTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DraweeEventTracker f7095b = new DraweeEventTracker();
    public static boolean c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<Event> f7096a = new ArrayBlockingQueue(20);

    public enum Event {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    public static DraweeEventTracker a() {
        return c ? new DraweeEventTracker() : f7095b;
    }

    public void b(Event event) {
        if (c) {
            if (this.f7096a.size() + 1 > 20) {
                this.f7096a.poll();
            }
            this.f7096a.add(event);
        }
    }

    public String toString() {
        return this.f7096a.toString();
    }
}
