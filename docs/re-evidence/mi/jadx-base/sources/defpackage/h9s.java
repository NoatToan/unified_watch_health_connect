package defpackage;

import com.miui.tsmclient.seitsm.TsmRpcModels;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface h9s {
    void a() throws InterruptedException;

    void a(TsmRpcModels.TsmCAPDU tsmCAPDU) throws InterruptedException;

    void b() throws InterruptedException;

    void b(TsmRpcModels.TsmCAPDU tsmCAPDU) throws InterruptedException;

    void c() throws InterruptedException;

    void c(List<TsmRpcModels.TsmCAPDU> list, boolean z) throws InterruptedException;
}
