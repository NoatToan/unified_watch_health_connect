package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.util.FileDownloadExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes18.dex */
public class MessageSnapshotThreadPool {
    private final List<FlowSingleExecutor> a = new ArrayList();
    private final MessageSnapshotFlow.MessageReceiver b;

    public class FlowSingleExecutor {
        private final List<Integer> a = new ArrayList();
        private final Executor b;

        public class a implements Runnable {
            public final /* synthetic */ MessageSnapshot a;

            public a(MessageSnapshot messageSnapshot) {
                this.a = messageSnapshot;
            }

            @Override // java.lang.Runnable
            public void run() {
                MessageSnapshotThreadPool.this.b.receive(this.a);
                FlowSingleExecutor.this.a.remove(Integer.valueOf(this.a.getId()));
            }
        }

        public FlowSingleExecutor(int i) {
            this.b = FileDownloadExecutors.newDefaultThreadPool(1, "Flow-" + i);
        }

        public void enqueue(int i) {
            this.a.add(Integer.valueOf(i));
        }

        public void execute(MessageSnapshot messageSnapshot) {
            this.b.execute(new a(messageSnapshot));
        }
    }

    public MessageSnapshotThreadPool(int i, MessageSnapshotFlow.MessageReceiver messageReceiver) {
        this.b = messageReceiver;
        for (int i2 = 0; i2 < i; i2++) {
            this.a.add(new FlowSingleExecutor(i2));
        }
    }

    public void execute(MessageSnapshot messageSnapshot) {
        FlowSingleExecutor flowSingleExecutor = null;
        try {
            synchronized (this.a) {
                int id = messageSnapshot.getId();
                for (FlowSingleExecutor flowSingleExecutor2 : this.a) {
                    if (flowSingleExecutor2.a.contains(Integer.valueOf(id))) {
                        flowSingleExecutor = flowSingleExecutor2;
                        break;
                    }
                }
                if (flowSingleExecutor == null) {
                    int size = 0;
                    for (FlowSingleExecutor flowSingleExecutor3 : this.a) {
                        if (flowSingleExecutor3.a.size() <= 0) {
                            flowSingleExecutor = flowSingleExecutor3;
                            break;
                        } else if (size == 0 || flowSingleExecutor3.a.size() < size) {
                            size = flowSingleExecutor3.a.size();
                            flowSingleExecutor = flowSingleExecutor3;
                        }
                    }
                }
                flowSingleExecutor.enqueue(id);
            }
            flowSingleExecutor.execute(messageSnapshot);
        } catch (Throwable th) {
            flowSingleExecutor.execute(messageSnapshot);
            throw th;
        }
    }
}
