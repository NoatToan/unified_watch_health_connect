package xv;

import l73.k;
import org.greenrobot.eventbus.ThreadMode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lxv/f;", "Lpi2/c;", "<init>", "()V", "Lxv/d;", "transferCompleteEvent", "", "fileTransferComplete", "(Lxv/d;)V", "Lxv/e;", "transferProgressEvent", "fileTransferProgressUpdate", "(Lxv/e;)V", "Lxv/c;", "fileFetchCompleteEvent", "fileFetchComplete", "(Lxv/c;)V", "Lxv/b;", "deleteFileCacheEvent", "deleteCachedFiles", "(Lxv/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f implements pi2.c {
    @k(threadMode = ThreadMode.MAIN)
    public void deleteCachedFiles(b deleteFileCacheEvent) {
        deleteFileCacheEvent.getClass();
    }

    @k(threadMode = ThreadMode.MAIN)
    public void fileFetchComplete(c fileFetchCompleteEvent) {
        fileFetchCompleteEvent.getClass();
    }

    @k(threadMode = ThreadMode.MAIN)
    public void fileTransferComplete(d transferCompleteEvent) {
        transferCompleteEvent.getClass();
    }

    @k(threadMode = ThreadMode.MAIN)
    public void fileTransferProgressUpdate(e transferProgressEvent) {
        transferProgressEvent.getClass();
    }
}
