package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class en9 extends ry5 {
    public en9(ExecutorService executorService) {
        super(executorService);
    }

    public void finalize() {
        super.shutdown();
    }
}
