package com.amazon.alexa.avs;

import com.amazon.alexa.avs.message.response.Directive;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class BlockableDirectiveThread extends Thread {
    private volatile boolean block;
    private final DirectiveDispatcher directiveDispatcher;
    private final BlockingQueue<Directive> directiveQueue;

    public BlockableDirectiveThread(BlockingQueue<Directive> blockingQueue, DirectiveDispatcher directiveDispatcher) {
        this(blockingQueue, directiveDispatcher, BlockableDirectiveThread.class.getSimpleName());
    }

    public synchronized void block() {
        this.block = true;
    }

    public synchronized void clear() {
        this.directiveQueue.clear();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    if (this.block) {
                        wait();
                    }
                }
                this.directiveDispatcher.dispatch(this.directiveQueue.take());
            } catch (InterruptedException unused) {
            }
        }
    }

    public synchronized void unblock() {
        this.block = false;
        notify();
    }

    public BlockableDirectiveThread(BlockingQueue<Directive> blockingQueue, DirectiveDispatcher directiveDispatcher, String str) {
        this.directiveQueue = blockingQueue;
        this.directiveDispatcher = directiveDispatcher;
        setName(str);
    }
}
