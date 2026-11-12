package kotlin;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import q53.i;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li5/r4;", "Landroid/database/ContentObserver;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r4 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i<p005kotlin.Unit> f91431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(i<p005kotlin.Unit> iVar, Handler handler) {
        super(handler);
        this.f91431a = iVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z14, Uri uri) {
        this.f91431a.i(p005kotlin.Unit.INSTANCE);
    }
}
