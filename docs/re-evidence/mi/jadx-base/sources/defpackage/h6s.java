package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.mipush.sdk.aq;
import com.xiaomi.mipush.sdk.d;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class h6s extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d6s f19762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6s(d6s d6sVar, Looper looper) {
        super(looper);
        this.f19762a = d6sVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        if (message.what != 19) {
            return;
        }
        String str = (String) message.obj;
        int i = message.arg1;
        synchronized (l4s.class) {
            try {
                if (l4s.b(this.f19762a.f15156b).f(str)) {
                    if (l4s.b(this.f19762a.f15156b).a(str) < 10) {
                        String string = message.getData() != null ? message.getData().getString("third_sync_reason") : "";
                        aq aqVar = aq.DISABLE_PUSH;
                        if (aqVar.ordinal() == i && "syncing".equals(l4s.b(this.f19762a.f15156b).c(aqVar))) {
                            this.f19762a.F(str, aqVar, true, null);
                        } else {
                            aq aqVar2 = aq.ENABLE_PUSH;
                            if (aqVar2.ordinal() == i && "syncing".equals(l4s.b(this.f19762a.f15156b).c(aqVar2))) {
                                this.f19762a.F(str, aqVar2, true, null);
                            } else {
                                aq aqVar3 = aq.UPLOAD_HUAWEI_TOKEN;
                                if (aqVar3.ordinal() == i && "syncing".equals(l4s.b(this.f19762a.f15156b).c(aqVar3))) {
                                    HashMap<String, String> mapE = gxs.e(this.f19762a.f15156b, d.ASSEMBLE_PUSH_HUAWEI);
                                    mapE.put("third_sync_reason", string);
                                    this.f19762a.F(str, aqVar3, false, mapE);
                                } else {
                                    aq aqVar4 = aq.UPLOAD_FCM_TOKEN;
                                    if (aqVar4.ordinal() == i && "syncing".equals(l4s.b(this.f19762a.f15156b).c(aqVar4))) {
                                        d6s d6sVar = this.f19762a;
                                        d6sVar.F(str, aqVar4, false, gxs.e(d6sVar.f15156b, d.ASSEMBLE_PUSH_FCM));
                                    } else {
                                        aq aqVar5 = aq.UPLOAD_COS_TOKEN;
                                        if (aqVar5.ordinal() == i && "syncing".equals(l4s.b(this.f19762a.f15156b).c(aqVar5))) {
                                            HashMap<String, String> mapE2 = gxs.e(this.f19762a.f15156b, d.ASSEMBLE_PUSH_COS);
                                            mapE2.put("third_sync_reason", string);
                                            this.f19762a.F(str, aqVar5, false, mapE2);
                                        } else {
                                            aq aqVar6 = aq.UPLOAD_FTOS_TOKEN;
                                            if (aqVar6.ordinal() == i && "syncing".equals(l4s.b(this.f19762a.f15156b).c(aqVar6))) {
                                                HashMap<String, String> mapE3 = gxs.e(this.f19762a.f15156b, d.ASSEMBLE_PUSH_FTOS);
                                                mapE3.put("third_sync_reason", string);
                                                this.f19762a.F(str, aqVar6, false, mapE3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        l4s.b(this.f19762a.f15156b).g(str);
                    } else {
                        l4s.b(this.f19762a.f15156b).h(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
