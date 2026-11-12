package a8;

import com.google.android.exoplayer2.util.Util;
import fa.z;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1903b;

    public /* synthetic */ a(String str, int i14) {
        this.f1902a = i14;
        this.f1903b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i14 = this.f1902a;
        String str = this.f1903b;
        switch (i14) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            case 1:
                return Util.lambda$newSingleThreadExecutor$0(str, runnable);
            default:
                int i15 = z.f70071a;
                return new Thread(runnable, str);
        }
    }
}
