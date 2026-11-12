package androidx.paging;

import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.ghe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/paging/OffsettingListUpdateCallback;", "Lghe;", "", "position", "count", "", "onInserted", "(II)V", "onRemoved", "fromPosition", "toPosition", "onMoved", "", TSMAuthContants.PARAM_PAYLOAD, "onChanged", "(IILjava/lang/Object;)V", "offset", "I", "callback", "Lghe;", "<init>", "(ILghe;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
final class OffsettingListUpdateCallback implements ghe {
    private final ghe callback;
    private final int offset;

    public OffsettingListUpdateCallback(int i, @NotNull ghe callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.offset = i;
        this.callback = callback;
    }

    @Override // defpackage.ghe
    public void onChanged(int position, int count, @Nullable Object payload) {
        this.callback.onChanged(position + this.offset, count, payload);
    }

    @Override // defpackage.ghe
    public void onInserted(int position, int count) {
        this.callback.onInserted(position + this.offset, count);
    }

    @Override // defpackage.ghe
    public void onMoved(int fromPosition, int toPosition) {
        ghe gheVar = this.callback;
        int i = this.offset;
        gheVar.onMoved(fromPosition + i, toPosition + i);
    }

    @Override // defpackage.ghe
    public void onRemoved(int position, int count) {
        this.callback.onRemoved(position + this.offset, count);
    }
}
