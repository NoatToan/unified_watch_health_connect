package okhttp3.internal.cache;

import e23.l;
import java.io.IOException;
import o2.c;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends w implements l<IOException, Unit> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        iOException.getClass();
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
        } else {
            c.j(Thread.currentThread().getName(), " MUST hold lock on ", diskLruCache);
        }
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
        invoke2(iOException);
        return Unit.INSTANCE;
    }
}
