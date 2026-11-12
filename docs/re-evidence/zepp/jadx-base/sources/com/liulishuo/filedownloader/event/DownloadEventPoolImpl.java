package com.liulishuo.filedownloader.event;

import com.liulishuo.filedownloader.util.FileDownloadExecutors;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadEventPoolImpl implements com.liulishuo.filedownloader.event.a {
    private final Executor a = FileDownloadExecutors.newDefaultThreadPool(10, "EventPool");
    private final HashMap<String, LinkedList<IDownloadListener>> b = new HashMap<>();

    public class a implements Runnable {
        public final /* synthetic */ IDownloadEvent a;

        public a(IDownloadEvent iDownloadEvent) {
            this.a = iDownloadEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadEventPoolImpl.this.publish(this.a);
        }
    }

    private void a(LinkedList<IDownloadListener> linkedList, IDownloadEvent iDownloadEvent) {
        for (Object obj : linkedList.toArray()) {
            if (obj != null && ((IDownloadListener) obj).callback(iDownloadEvent)) {
                break;
            }
        }
        Runnable runnable = iDownloadEvent.callback;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.liulishuo.filedownloader.event.a
    public boolean addListener(String str, IDownloadListener iDownloadListener) {
        boolean zAdd;
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(this, "setListener %s", str);
        }
        if (iDownloadListener == null) {
            throw new IllegalArgumentException("listener must not be null!");
        }
        LinkedList<IDownloadListener> linkedList = this.b.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                linkedList = this.b.get(str);
                if (linkedList == null) {
                    HashMap<String, LinkedList<IDownloadListener>> map = this.b;
                    LinkedList<IDownloadListener> linkedList2 = new LinkedList<>();
                    map.put(str, linkedList2);
                    linkedList = linkedList2;
                }
            }
        }
        synchronized (str.intern()) {
            zAdd = linkedList.add(iDownloadListener);
        }
        return zAdd;
    }

    @Override // com.liulishuo.filedownloader.event.a
    public void asyncPublishInNewThread(IDownloadEvent iDownloadEvent) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(this, "asyncPublishInNewThread %s", iDownloadEvent.getId());
        }
        if (iDownloadEvent == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        this.a.execute(new a(iDownloadEvent));
    }

    @Override // com.liulishuo.filedownloader.event.a
    public boolean publish(IDownloadEvent iDownloadEvent) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(this, "publish %s", iDownloadEvent.getId());
        }
        if (iDownloadEvent == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        String id = iDownloadEvent.getId();
        LinkedList<IDownloadListener> linkedList = this.b.get(id);
        if (linkedList == null) {
            synchronized (id.intern()) {
                linkedList = this.b.get(id);
                if (linkedList == null) {
                    if (FileDownloadLog.NEED_LOG) {
                        FileDownloadLog.d(this, "No listener for this event %s", id);
                    }
                    return false;
                }
            }
        }
        a(linkedList, iDownloadEvent);
        return true;
    }

    @Override // com.liulishuo.filedownloader.event.a
    public boolean removeListener(String str, IDownloadListener iDownloadListener) {
        boolean zRemove;
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(this, "removeListener %s", str);
        }
        LinkedList<IDownloadListener> linkedList = this.b.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                linkedList = this.b.get(str);
            }
        }
        if (linkedList == null || iDownloadListener == null) {
            return false;
        }
        synchronized (str.intern()) {
            zRemove = linkedList.remove(iDownloadListener);
            if (linkedList.size() <= 0) {
                this.b.remove(str);
            }
        }
        return zRemove;
    }
}
