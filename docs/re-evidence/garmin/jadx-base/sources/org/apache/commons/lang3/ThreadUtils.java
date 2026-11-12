package org.apache.commons.lang3;

import a73.p;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.apache.commons.lang3.time.DurationUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadUtils {
    public static final AlwaysTruePredicate ALWAYS_TRUE_PREDICATE = new AlwaysTruePredicate();

    public static final class AlwaysTruePredicate implements ThreadPredicate, ThreadGroupPredicate {
        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(Thread thread) {
            return true;
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate
        public boolean test(ThreadGroup threadGroup) {
            return true;
        }

        private AlwaysTruePredicate() {
        }
    }

    @FunctionalInterface
    public interface ThreadGroupPredicate {
        boolean test(ThreadGroup threadGroup);
    }

    public static class ThreadIdPredicate implements ThreadPredicate {
        private final long threadId;

        public ThreadIdPredicate(long j8) {
            if (j8 > 0) {
                this.threadId = j8;
            } else {
                h.s("The thread id must be greater than zero");
                throw null;
            }
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(Thread thread) {
            return thread != null && thread.getId() == this.threadId;
        }
    }

    @FunctionalInterface
    public interface ThreadPredicate {
        boolean test(Thread thread);
    }

    public static Thread findThreadById(long j8, String str) {
        Validate.notNull(str, "threadGroupName", new Object[0]);
        Thread threadFindThreadById = findThreadById(j8);
        if (threadFindThreadById == null || threadFindThreadById.getThreadGroup() == null || !threadFindThreadById.getThreadGroup().getName().equals(str)) {
            return null;
        }
        return threadFindThreadById;
    }

    public static Collection<ThreadGroup> findThreadGroups(ThreadGroup threadGroup, boolean z14, ThreadGroupPredicate threadGroupPredicate) {
        ThreadGroup[] threadGroupArr;
        int iEnumerate;
        Validate.notNull(threadGroup, "group", new Object[0]);
        Validate.notNull(threadGroupPredicate, "predicate", new Object[0]);
        int iActiveGroupCount = threadGroup.activeGroupCount();
        while (true) {
            int i14 = (iActiveGroupCount / 2) + iActiveGroupCount + 1;
            threadGroupArr = new ThreadGroup[i14];
            iEnumerate = threadGroup.enumerate(threadGroupArr, z14);
            if (iEnumerate < i14) {
                break;
            }
            iActiveGroupCount = iEnumerate;
        }
        ArrayList arrayList = new ArrayList(iEnumerate);
        for (int i15 = 0; i15 < iEnumerate; i15++) {
            if (threadGroupPredicate.test(threadGroupArr[i15])) {
                arrayList.add(threadGroupArr[i15]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<ThreadGroup> findThreadGroupsByName(String str) {
        return findThreadGroups(new NamePredicate(str));
    }

    public static Collection<Thread> findThreads(ThreadGroup threadGroup, boolean z14, ThreadPredicate threadPredicate) {
        Thread[] threadArr;
        int iEnumerate;
        Validate.notNull(threadGroup, "The group must not be null", new Object[0]);
        Validate.notNull(threadPredicate, "The predicate must not be null", new Object[0]);
        int iActiveCount = threadGroup.activeCount();
        while (true) {
            int i14 = (iActiveCount / 2) + iActiveCount + 1;
            threadArr = new Thread[i14];
            iEnumerate = threadGroup.enumerate(threadArr, z14);
            if (iEnumerate < i14) {
                break;
            }
            iActiveCount = iEnumerate;
        }
        ArrayList arrayList = new ArrayList(iEnumerate);
        for (int i15 = 0; i15 < iEnumerate; i15++) {
            if (threadPredicate.test(threadArr[i15])) {
                arrayList.add(threadArr[i15]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<Thread> findThreadsByName(String str, String str2) {
        Validate.notNull(str, "threadName", new Object[0]);
        Validate.notNull(str2, "threadGroupName", new Object[0]);
        Collection<ThreadGroup> collectionFindThreadGroups = findThreadGroups(new NamePredicate(str2));
        if (collectionFindThreadGroups.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        NamePredicate namePredicate = new NamePredicate(str);
        Iterator<ThreadGroup> it = collectionFindThreadGroups.iterator();
        while (it.hasNext()) {
            arrayList.addAll(findThreads(it.next(), false, namePredicate));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<ThreadGroup> getAllThreadGroups() {
        return findThreadGroups(ALWAYS_TRUE_PREDICATE);
    }

    public static Collection<Thread> getAllThreads() {
        return findThreads(ALWAYS_TRUE_PREDICATE);
    }

    public static ThreadGroup getSystemThreadGroup() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        return threadGroup;
    }

    public static void join(Thread thread, Duration duration) {
        thread.getClass();
        DurationUtils.accept(new b(thread, 1), duration);
    }

    public static void sleep(Duration duration) {
        DurationUtils.accept(new p(1), duration);
    }

    public static class NamePredicate implements ThreadPredicate, ThreadGroupPredicate {
        private final String name;

        public NamePredicate(String str) {
            Validate.notNull(str, "name", new Object[0]);
            this.name = str;
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(Thread thread) {
            return thread != null && thread.getName().equals(this.name);
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate
        public boolean test(ThreadGroup threadGroup) {
            return threadGroup != null && threadGroup.getName().equals(this.name);
        }
    }

    public static Thread findThreadById(long j8) {
        Collection<Thread> collectionFindThreads = findThreads(new ThreadIdPredicate(j8));
        if (collectionFindThreads.isEmpty()) {
            return null;
        }
        return collectionFindThreads.iterator().next();
    }

    public static Thread findThreadById(long j8, ThreadGroup threadGroup) {
        Validate.notNull(threadGroup, "threadGroup", new Object[0]);
        Thread threadFindThreadById = findThreadById(j8);
        if (threadFindThreadById == null || !threadGroup.equals(threadFindThreadById.getThreadGroup())) {
            return null;
        }
        return threadFindThreadById;
    }

    public static Collection<ThreadGroup> findThreadGroups(ThreadGroupPredicate threadGroupPredicate) {
        return findThreadGroups(getSystemThreadGroup(), true, threadGroupPredicate);
    }

    public static Collection<Thread> findThreads(ThreadPredicate threadPredicate) {
        return findThreads(getSystemThreadGroup(), true, threadPredicate);
    }

    public static Collection<Thread> findThreadsByName(String str) {
        return findThreads(new NamePredicate(str));
    }

    public static Collection<Thread> findThreadsByName(String str, ThreadGroup threadGroup) {
        return findThreads(threadGroup, false, new NamePredicate(str));
    }
}
