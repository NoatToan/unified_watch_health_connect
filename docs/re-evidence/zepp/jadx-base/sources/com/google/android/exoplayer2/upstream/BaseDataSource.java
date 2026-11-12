package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import defpackage.x21;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDataSource implements DataSource {
    private final boolean a;
    private final ArrayList<TransferListener> b = new ArrayList<>(1);
    private int c;

    @Nullable
    private DataSpec d;

    public BaseDataSource(boolean isNetwork) {
        this.a = isNetwork;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        if (this.b.contains(transferListener)) {
            return;
        }
        this.b.add(transferListener);
        this.c++;
    }

    public final void bytesTransferred(int bytesTransferred) {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.d);
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).onBytesTransferred(this, dataSpec, this.a, bytesTransferred);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ Map getResponseHeaders() {
        return x21.a(this);
    }

    public final void transferEnded() {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.d);
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).onTransferEnd(this, dataSpec, this.a);
        }
        this.d = null;
    }

    public final void transferInitializing(DataSpec dataSpec) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).onTransferInitializing(this, dataSpec, this.a);
        }
    }

    public final void transferStarted(DataSpec dataSpec) {
        this.d = dataSpec;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).onTransferStart(this, dataSpec, this.a);
        }
    }
}
