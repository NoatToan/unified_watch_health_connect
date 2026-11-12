package io.sentry.android.replay.util;

import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.l;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/util/PersistableLinkedList;", "Ljava/util/LinkedList;", "Lio/sentry/rrweb/b;", "", "persistRecording", "()V", "", "elements", "", "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Lio/sentry/rrweb/b;)Z", "remove", "()Lio/sentry/rrweb/b;", "", "propertyName", "Ljava/lang/String;", "Lio/sentry/SentryOptions;", "options", "Lio/sentry/SentryOptions;", "Ljava/util/concurrent/ScheduledExecutorService;", "persistingExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "Lkotlin/Function0;", "Lio/sentry/android/replay/ReplayCache;", "cacheProvider", "Lkotlin/jvm/functions/Function0;", "<init>", "(Ljava/lang/String;Lio/sentry/SentryOptions;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function0;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPersistable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Persistable.kt\nio/sentry/android/replay/util/PersistableLinkedList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class PersistableLinkedList extends LinkedList<io.sentry.rrweb.b> {

    @NotNull
    private final Function0<ReplayCache> cacheProvider;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final ScheduledExecutorService persistingExecutor;

    @NotNull
    private final String propertyName;

    public PersistableLinkedList(@NotNull String propertyName, @NotNull SentryOptions options, @NotNull ScheduledExecutorService persistingExecutor, @NotNull Function0<ReplayCache> cacheProvider) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(persistingExecutor, "persistingExecutor");
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        this.propertyName = propertyName;
        this.options = options;
        this.persistingExecutor = persistingExecutor;
        this.cacheProvider = cacheProvider;
    }

    private final void persistRecording() throws IOException {
        final ReplayCache replayCacheInvoke = this.cacheProvider.invoke();
        if (replayCacheInvoke == null) {
            return;
        }
        final l lVar = new l();
        lVar.b(new ArrayList(this));
        if (this.options.getMainThreadChecker().a()) {
            this.persistingExecutor.submit(new Runnable() { // from class: io.sentry.android.replay.util.e
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    PersistableLinkedList.persistRecording$lambda$1(this.f21659a, lVar, replayCacheInvoke);
                }
            });
            return;
        }
        StringWriter stringWriter = new StringWriter();
        this.options.getSerializer().a(lVar, new BufferedWriter(stringWriter));
        replayCacheInvoke.persistSegmentValues(this.propertyName, stringWriter.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistRecording$lambda$1(PersistableLinkedList this$0, l recording, ReplayCache cache) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recording, "$recording");
        Intrinsics.checkNotNullParameter(cache, "$cache");
        StringWriter stringWriter = new StringWriter();
        this$0.options.getSerializer().a(recording, new BufferedWriter(stringWriter));
        cache.persistSegmentValues(this$0.propertyName, stringWriter.toString());
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean addAll(@NotNull Collection<? extends io.sentry.rrweb.b> elements) throws IOException {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean zAddAll = super.addAll(elements);
        persistRecording();
        return zAddAll;
    }

    public /* bridge */ boolean contains(io.sentry.rrweb.b bVar) {
        return super.contains((Object) bVar);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(io.sentry.rrweb.b bVar) {
        return super.indexOf((Object) bVar);
    }

    public /* bridge */ int lastIndexOf(io.sentry.rrweb.b bVar) {
        return super.lastIndexOf((Object) bVar);
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ io.sentry.rrweb.b remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ io.sentry.rrweb.b removeAt(int i) {
        return (io.sentry.rrweb.b) super.remove(i);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(@NotNull io.sentry.rrweb.b element) throws IOException {
        Intrinsics.checkNotNullParameter(element, "element");
        boolean zAdd = super.add(element);
        persistRecording();
        return zAdd;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof io.sentry.rrweb.b) {
            return contains((io.sentry.rrweb.b) obj);
        }
        return false;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof io.sentry.rrweb.b) {
            return indexOf((io.sentry.rrweb.b) obj);
        }
        return -1;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof io.sentry.rrweb.b) {
            return lastIndexOf((io.sentry.rrweb.b) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(io.sentry.rrweb.b bVar) {
        return super.remove((Object) bVar);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof io.sentry.rrweb.b) {
            return remove((io.sentry.rrweb.b) obj);
        }
        return false;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    @NotNull
    public io.sentry.rrweb.b remove() throws IOException {
        io.sentry.rrweb.b result = (io.sentry.rrweb.b) super.remove();
        persistRecording();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
