package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53774b;

    public /* synthetic */ k(Object obj, int i14) {
        this.f53773a = i14;
        this.f53774b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f53773a) {
            case 1:
                WakeLockHolder.completeWakefulIntent((Intent) this.f53774b);
                break;
            case 2:
                ((WithinAppServiceConnection.BindRequest) this.f53774b).finish();
                break;
            default:
                ((ScheduledFuture) this.f53774b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((GmsRpc) this.f53774b).lambda$extractResponseWhenComplete$0(task);
    }
}
