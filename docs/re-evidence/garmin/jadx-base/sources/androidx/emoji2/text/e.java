package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class e extends d.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.i f7049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f7050b;

    public e(EmojiCompatInitializer.b bVar, d.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f7049a = iVar;
        this.f7050b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.d.i
    public final void a(Throwable th3) {
        ThreadPoolExecutor threadPoolExecutor = this.f7050b;
        try {
            this.f7049a.a(th3);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.d.i
    public final void b(h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f7050b;
        try {
            this.f7049a.b(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
