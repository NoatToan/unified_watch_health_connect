package org.junit.experimental.results;

import java.util.Iterator;
import java.util.List;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes23.dex */
class a {
    private final List<Failure> a;

    public a(List<Failure> list) {
        this.a = list;
    }

    public Result a() {
        Result result = new Result();
        RunListener runListenerCreateListener = result.createListener();
        Iterator<Failure> it2 = this.a.iterator();
        while (it2.hasNext()) {
            try {
                runListenerCreateListener.testFailure(it2.next());
            } catch (Exception unused) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        return result;
    }
}
