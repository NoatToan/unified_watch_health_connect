package com.unionpay;

import android.content.DialogInterface;
import com.xiaomi.wearable.hm.BroadcastsKt;

/* JADX INFO: loaded from: classes6.dex */
final class r implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10782a;

    public r(UPPayWapActivity uPPayWapActivity) {
        this.f10782a = uPPayWapActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10782a.a(BroadcastsKt.SILENT_PUSHING_CANCEL, (String) null);
    }
}
