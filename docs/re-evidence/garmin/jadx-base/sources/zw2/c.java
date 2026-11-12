package zw2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw2/c;", "Landroid/content/BroadcastReceiver;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f207280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vw2.b f207281b;

    public c(b bVar, vw2.b bVar2) {
        this.f207280a = bVar;
        this.f207281b = bVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getClass();
        if (s.g(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            vw2.b bVar = this.f207281b;
            b bVar2 = this.f207280a;
            if (intExtra == 10) {
                cx2.h hVar = bVar2.f207273b;
                Logger logger = cx2.h.f56678c;
                hVar.getClass();
                bVar2.f207275d = b.a.BLUETOOTH_OFF;
                bVar.b("");
                return;
            }
            cx2.h hVar2 = bVar2.f207273b;
            Logger logger2 = cx2.h.f56678c;
            hVar2.getClass();
            bVar2.f207275d = b.a.DEFAULT_ERROR;
            bVar.b("");
        }
    }
}
