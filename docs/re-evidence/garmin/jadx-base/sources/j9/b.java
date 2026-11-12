package j9;

import android.os.Handler;
import androidx.health.platform.client.impl.ipc.ApiVersionException;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;

/* JADX INFO: loaded from: classes.dex */
public class b implements FutureCallback<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettableFuture f97771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f97772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f97773d;

    public b(a aVar, int i14, SettableFuture settableFuture, e eVar) {
        this.f97773d = aVar;
        this.f97770a = i14;
        this.f97771b = settableFuture;
        this.f97772c = eVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th3) {
        this.f97771b.setException(th3);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Integer num) {
        Integer num2 = num;
        int iIntValue = num2.intValue();
        SettableFuture settableFuture = this.f97771b;
        int i14 = this.f97770a;
        a aVar = this.f97773d;
        if (iIntValue >= i14) {
            k9.c cVar = aVar.f97763b;
            c cVar2 = new c(aVar, aVar.f97762a, this.f97772c, settableFuture);
            Handler handler = cVar.f103412b;
            handler.sendMessage(handler.obtainMessage(3, cVar2));
            return;
        }
        k9.c cVar3 = aVar.f97763b;
        k9.a aVar2 = new k9.a(aVar.f97762a);
        Handler handler2 = cVar3.f103412b;
        handler2.sendMessage(handler2.obtainMessage(3, aVar2));
        settableFuture.setException(new ApiVersionException(num2.intValue(), i14));
    }
}
