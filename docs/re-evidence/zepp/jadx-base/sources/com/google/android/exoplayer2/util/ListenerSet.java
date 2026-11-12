package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
public final class ListenerSet<T> {
    private static final int h = 0;
    private final Clock a;
    private final HandlerWrapper b;
    private final IterationFinishedEvent<T> c;
    private final CopyOnWriteArraySet<a<T>> d;
    private final ArrayDeque<Runnable> e;
    private final ArrayDeque<Runnable> f;
    private boolean g;

    public interface Event<T> {
        void invoke(T listener);
    }

    public interface IterationFinishedEvent<T> {
        void invoke(T listener, FlagSet eventFlags);
    }

    public static final class a<T> {

        @Nonnull
        public final T a;
        private FlagSet.Builder b = new FlagSet.Builder();
        private boolean c;
        private boolean d;

        public a(@Nonnull T listener) {
            this.a = listener;
        }

        public void a(int eventFlag, Event<T> event) {
            if (this.d) {
                return;
            }
            if (eventFlag != -1) {
                this.b.add(eventFlag);
            }
            this.c = true;
            event.invoke(this.a);
        }

        public void b(IterationFinishedEvent<T> event) {
            if (this.d || !this.c) {
                return;
            }
            FlagSet flagSetBuild = this.b.build();
            this.b = new FlagSet.Builder();
            this.c = false;
            event.invoke(this.a, flagSetBuild);
        }

        public void c(IterationFinishedEvent<T> event) {
            this.d = true;
            if (this.c) {
                event.invoke(this.a, this.b.build());
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || a.class != other.getClass()) {
                return false;
            }
            return this.a.equals(((a) other).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Message message) {
        Iterator<a<T>> it2 = this.d.iterator();
        while (it2.hasNext()) {
            it2.next().b(this.c);
            if (this.b.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).a(i, event);
        }
    }

    public void add(T listener) {
        if (this.g) {
            return;
        }
        Assertions.checkNotNull(listener);
        this.d.add(new a<>(listener));
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, IterationFinishedEvent<T> iterationFinishedEvent) {
        return new ListenerSet<>(this.d, looper, this.a, iterationFinishedEvent);
    }

    public void flushEvents() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.hasMessages(0)) {
            HandlerWrapper handlerWrapper = this.b;
            handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(0));
        }
        boolean z = !this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (z) {
            return;
        }
        while (!this.e.isEmpty()) {
            this.e.peekFirst().run();
            this.e.removeFirst();
        }
    }

    public void queueEvent(final int eventFlag, final Event<T> event) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: to4
            @Override // java.lang.Runnable
            public final void run() {
                ListenerSet.d(copyOnWriteArraySet, eventFlag, event);
            }
        });
    }

    public void release() {
        Iterator<a<T>> it2 = this.d.iterator();
        while (it2.hasNext()) {
            it2.next().c(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    public void remove(T listener) {
        for (a<T> aVar : this.d) {
            if (aVar.a.equals(listener)) {
                aVar.c(this.c);
                this.d.remove(aVar);
            }
        }
    }

    public void sendEvent(int eventFlag, Event<T> event) {
        queueEvent(eventFlag, event);
        flushEvents();
    }

    public int size() {
        return this.d.size();
    }

    private ListenerSet(CopyOnWriteArraySet<a<T>> listeners, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this.a = clock;
        this.d = listeners;
        this.c = iterationFinishedEvent;
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.b = clock.createHandler(looper, new Handler.Callback() { // from class: so4
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.c(message);
            }
        });
    }
}
