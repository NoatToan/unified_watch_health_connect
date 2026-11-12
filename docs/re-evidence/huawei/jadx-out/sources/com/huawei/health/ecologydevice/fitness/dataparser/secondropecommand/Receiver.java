package com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand;

import com.huawei.hwlogsmodel.LogUtil;
import defpackage.egu;
import defpackage.egv;
import defpackage.egw;
import defpackage.egx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Utf8;

/* JADX INFO: loaded from: classes7.dex */
public class Receiver implements CommandArrayList.ReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Byte, CommandArrayList> f6513c;
    private CommandReceiveCallback d;

    public interface CommandReceiveCallback {
        void onReceiveSuccess(CommandArrayList commandArrayList);
    }

    private Receiver() {
        this.f6513c = new ConcurrentHashMap();
    }

    public static Receiver c() {
        return b.d;
    }

    static class b {
        private static final Receiver d = new Receiver();
    }

    public void c(CommandReceiveCallback commandReceiveCallback) {
        this.d = commandReceiveCallback;
    }

    public void d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        byte b2 = bArr[0];
        boolean z = ((byte) (b2 & 128)) != 0;
        boolean z2 = ((byte) (b2 & 64)) != 0;
        byte b3 = (byte) (b2 & Utf8.REPLACEMENT_BYTE);
        LogUtil.a("PDROPE_Receiver", "moreData = ", Boolean.valueOf(z), ", needSplicing = ", Boolean.valueOf(z2), ", sequence=", Byte.valueOf(b3));
        if (!this.f6513c.containsKey(Byte.valueOf(b3))) {
            CommandArrayList commandArrayList = new CommandArrayList();
            commandArrayList.e(this);
            commandArrayList.c(b3);
            this.f6513c.put(Byte.valueOf(b3), commandArrayList);
        }
        byte b4 = (byte) (bArr[1] & 255);
        CommandArrayList commandArrayList2 = this.f6513c.get(Byte.valueOf(b3));
        if (b4 == 0) {
            a(bArr, commandArrayList2, z2);
            return;
        }
        if (z) {
            egu eguVarC = new egu.a().c(bArr);
            commandArrayList2.a(eguVarC.getCommand());
            commandArrayList2.d(eguVarC.getCode());
            commandArrayList2.e(eguVarC.getOrder(), eguVarC);
            return;
        }
        egv egvVarE = new egv.e().e(bArr);
        commandArrayList2.d(egvVarE.getOrder() + 1);
        commandArrayList2.a(egvVarE.getCommand());
        commandArrayList2.d(egvVarE.getCode());
        commandArrayList2.e(egvVarE.getOrder(), egvVarE);
    }

    private void a(byte[] bArr, CommandArrayList commandArrayList, boolean z) {
        if (z) {
            egw egwVarD = new egw.c().d(bArr);
            commandArrayList.a(egwVarD.getCommand());
            commandArrayList.d(egwVarD.getCode());
            commandArrayList.d(egwVarD.b());
            commandArrayList.e(0, egwVarD);
            return;
        }
        egx egxVarD = new egx.c().d(bArr);
        LogUtil.a("PDROPE_Receiver", "command = ", egxVarD.toString());
        commandArrayList.d(egxVarD.getOrder() + 1);
        commandArrayList.a(egxVarD.getCommand());
        commandArrayList.d(egxVarD.getCode());
        commandArrayList.d(egxVarD.a());
        commandArrayList.e(0, egxVarD);
    }

    @Override // com.huawei.health.ecologydevice.fitness.dataparser.secondropecommand.CommandArrayList.ReceiveCallback
    public void onReceiveSuccess(byte b2, CommandArrayList commandArrayList) {
        this.f6513c.remove(Byte.valueOf(b2));
        commandArrayList.h();
        boolean zA = commandArrayList.a();
        LogUtil.a("PDROPE_Receiver", "commandArrayList.checkData() = ", Boolean.valueOf(zA));
        CommandReceiveCallback commandReceiveCallback = this.d;
        if (commandReceiveCallback == null || !zA) {
            return;
        }
        commandReceiveCallback.onReceiveSuccess(commandArrayList);
    }
}
