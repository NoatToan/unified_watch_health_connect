package com.unionpay.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.unionpay.UPSEInfoResp;

/* JADX INFO: loaded from: classes6.dex */
final class c implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f10756a;

    public c(b bVar) {
        this.f10756a = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        int iIntValue;
        int i = message.what;
        if (i != 1) {
            if (i != 4) {
                switch (i) {
                    case 4000:
                        this.f10756a.j.removeMessages(4);
                        b.a(this.f10756a, (Bundle) message.obj);
                        break;
                    case 4001:
                        this.f10756a.j.removeMessages(4003);
                        Object obj = message.obj;
                        if (obj instanceof Bundle) {
                            b.b(this.f10756a, (Bundle) obj);
                        }
                        break;
                    case AMapException.CODE_AMAP_SHARE_SIGNATURE_FAILURE /* 4002 */:
                        this.f10756a.j.removeMessages(4003);
                        Object obj2 = message.obj;
                        if (obj2 instanceof Bundle) {
                            b.c(this.f10756a, (Bundle) obj2);
                        }
                        break;
                    case 4003:
                        str = "queryHwPayStatus timeout";
                        break;
                    case 4004:
                        this.f10756a.j.removeMessages(4005);
                        try {
                            iIntValue = ((Integer) message.obj).intValue();
                        } catch (Exception unused) {
                            iIntValue = 0;
                        }
                        if (!this.f10756a.g) {
                            if (iIntValue != 1) {
                                this.f10756a.c();
                            } else {
                                b.e(this.f10756a);
                            }
                        }
                        break;
                    case 4005:
                        com.unionpay.utils.j.c("uppay", "QUERY_VENDOR_CAPACITY_TIMEOUT");
                        b.g(this.f10756a);
                        this.f10756a.c();
                        break;
                }
            } else {
                str = "timeout";
            }
            com.unionpay.utils.j.c("uppay", str);
            b bVar = this.f10756a;
            bVar.a(bVar.d, bVar.e, UPSEInfoResp.ERROR_TIMEOUT, "timeout");
            b.c(this.f10756a);
        } else {
            this.f10756a.j.removeMessages(4);
            com.unionpay.utils.j.c("uppay", "msg error");
            b.a(this.f10756a, message.arg1, (String) message.obj);
        }
        return false;
    }
}
