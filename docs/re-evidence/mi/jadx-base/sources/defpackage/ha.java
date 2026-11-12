package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\fH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002¨\u0006\u001c"}, d2 = {"Lha;", "Lga;", "Lth;", "Lmh;", "Laa;", "fileInfo", "Lev;", "transferListener", "", "withCompress", "", PluginDeviceInfo.FMODEL, "Lda;", "Lma;", "fileTransferPacket", PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONOFF, "", "path", "h", PluginDeviceInfo.FLOCALIZATIONS, "Lkd;", "device", "fileSaveDir", "<init>", "(Lkd;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ha implements ga, th, mh {

    @NotNull
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kd f19847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f19848b;

    @Nullable
    public ea c;

    @NotNull
    public final Map<Integer, ca> d;

    @NotNull
    public final Map<String, eq> e;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lha$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ha(@NotNull kd device, @NotNull String fileSaveDir) throws Exception {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(fileSaveDir, "fileSaveDir");
        this.f19847a = device;
        this.f19848b = fileSaveDir;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        h();
        device.v(this);
    }

    @Override // defpackage.mh
    public void a() {
        mh.a.b(this);
    }

    @Override // defpackage.mh
    public void b() {
        ea eaVar = this.c;
        if (eaVar != null) {
            eaVar.b(this);
        }
    }

    @Override // defpackage.mh
    public void c() {
        mh.a.a(this);
    }

    @Override // defpackage.mh
    public void d() {
        ea eaVar = this.c;
        if (eaVar != null) {
            eaVar.b(this);
        }
    }

    @Override // defpackage.mh
    public void e() {
        ea eaVar = this.c;
        if (eaVar != null) {
            eaVar.b(this);
        }
    }

    @Override // defpackage.mh
    public void f() {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            h();
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("FileTransferAppletApiImpl", "Init file transfer api failed while device reconnect,case:" + thM889exceptionOrNullimpl);
        }
    }

    public final void g() throws Exception {
        if (!this.f19847a.V()) {
            throw new Exception("Device is not connected!");
        }
        if (this.c == null) {
            throw new Exception("File transfer is null");
        }
    }

    public final void h() throws Exception {
        ea eaVarA = fa.f17582a.a(this.f19847a);
        if (eaVarA == null) {
            return;
        }
        eaVarA.a(this);
        this.c = eaVarA;
        this.d.clear();
    }

    @Override // defpackage.mh
    public void a(boolean z) {
        mh.a.a(this, z);
    }

    @Override // defpackage.ga
    public void a(@NotNull FileInfo fileInfo, @NotNull ev evVar) {
        ga.a.a(this, fileInfo, evVar);
    }

    @Override // defpackage.ga
    public void a(@NotNull FileInfo fileInfo, @NotNull ev transferListener, boolean withCompress) throws Exception {
        Intrinsics.checkNotNullParameter(fileInfo, "fileInfo");
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        g();
        if (transferListener instanceof qp) {
            ea eaVar = this.c;
            if (eaVar != null) {
                eaVar.a(fileInfo, (qp) transferListener, withCompress);
                return;
            }
            return;
        }
        throw new Exception("Please input right listener");
    }

    @Override // defpackage.th
    public void a(@NotNull FileRequestInfo fileInfo) {
        long j;
        Intrinsics.checkNotNullParameter(fileInfo, "fileInfo");
        t5t.d("FileTransferAppletApiImpl", fileInfo.toString());
        String str = this.f19848b + File.separator + fileInfo.getFileName() + ".tmp";
        File file = new File(str);
        long length = file.exists() ? file.length() : 0L;
        if (length >= fileInfo.getFileSize()) {
            a(str);
            j = 0;
        } else {
            j = length;
        }
        ca caVar = new ca(fileInfo.getSessionID(), fileInfo.getUrl(), str, fileInfo.getFileSize(), fileInfo.getFileCRC32());
        if (!new File(file.getParent()).exists()) {
            new File(file.getParent()).mkdirs();
        }
        if (this.d.containsKey(Integer.valueOf(caVar.getF5098a()))) {
            ea eaVar = this.c;
            if (eaVar != null) {
                eaVar.a(new TransferResponse(fileInfo.getSessionID(), 9, 0, 4, null));
                return;
            }
            return;
        }
        this.d.put(Integer.valueOf(caVar.getF5098a()), caVar);
        ea eaVar2 = this.c;
        if (eaVar2 != null) {
            eaVar2.a(new TransferResponse(fileInfo.getSessionID(), 0, (int) j));
        }
        Map<String, eq> map = this.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, eq> entry : map.entrySet()) {
            if (StringsKt__StringsJVMKt.startsWith$default(caVar.getF5099b(), entry.getKey(), false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((eq) ((Map.Entry) it.next()).getValue()).getF16947a().onStart();
        }
    }

    @Override // defpackage.th
    public void a(@NotNull FileTransferPacket fileTransferPacket) {
        Intrinsics.checkNotNullParameter(fileTransferPacket, "fileTransferPacket");
        t5t.d("FileTransferAppletApiImpl", fileTransferPacket.toString());
        ca caVar = this.d.get(Integer.valueOf(fileTransferPacket.getSessionID()));
        if (caVar == null) {
            t5t.d("FileTransferAppletApiImpl", "SessionID not match");
            ea eaVar = this.c;
            if (eaVar != null) {
                eaVar.a(new FilePacketResponse(fileTransferPacket.getSessionID(), 4));
                return;
            }
            return;
        }
        if (caVar.a(fileTransferPacket.getChunkSize())) {
            t5t.d("FileTransferAppletApiImpl", "Packet lost");
            ea eaVar2 = this.c;
            if (eaVar2 != null) {
                eaVar2.a(new FilePacketResponse(fileTransferPacket.getSessionID(), 10));
            }
            this.d.remove(Integer.valueOf(fileTransferPacket.getSessionID()));
            Map<String, eq> map = this.e;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, eq> entry : map.entrySet()) {
                if (StringsKt__StringsJVMKt.startsWith$default(caVar.getF5099b(), entry.getKey(), false, 2, null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                ((eq) entry2.getValue()).getF16947a().a(new Exception("Packet lost"));
                ((eq) entry2.getValue()).getF16947a().a(10);
            }
            this.e.remove(caVar.getF5099b());
            return;
        }
        int iA = ca.a(caVar, fileTransferPacket, 0L, 2, null);
        t5t.d("FileTransferAppletApiImpl", "Write file result:" + iA);
        if (iA == -1) {
            ea eaVar3 = this.c;
            if (eaVar3 != null) {
                eaVar3.a(new FilePacketResponse(fileTransferPacket.getSessionID(), 0));
            }
            Map<String, eq> map2 = this.e;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, eq> entry3 : map2.entrySet()) {
                if (StringsKt__StringsJVMKt.startsWith$default(caVar.getF5099b(), entry3.getKey(), false, 2, null)) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                if (((eq) entry4.getValue()).getF16948b() != caVar.b()) {
                    ((eq) entry4.getValue()).getF16947a().b(caVar.b());
                }
            }
        } else if (iA == 0) {
            ea eaVar4 = this.c;
            if (eaVar4 != null) {
                eaVar4.a(new FilePacketResponse(fileTransferPacket.getSessionID(), 0));
            }
            Map<String, eq> map3 = this.e;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry<String, eq> entry5 : map3.entrySet()) {
                if (StringsKt__StringsJVMKt.startsWith$default(caVar.getF5099b(), entry5.getKey(), false, 2, null)) {
                    linkedHashMap3.put(entry5.getKey(), entry5.getValue());
                }
            }
            for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
                ((eq) entry6.getValue()).getF16947a().b(100);
                ((eq) entry6.getValue()).getF16947a().a(caVar.getC(), caVar.getF5099b());
            }
        } else if (iA == 7) {
            Map<String, eq> map4 = this.e;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry<String, eq> entry7 : map4.entrySet()) {
                if (StringsKt__StringsJVMKt.startsWith$default(caVar.getF5099b(), entry7.getKey(), false, 2, null)) {
                    linkedHashMap4.put(entry7.getKey(), entry7.getValue());
                }
            }
            for (Map.Entry entry8 : linkedHashMap4.entrySet()) {
                ((eq) entry8.getValue()).getF16947a().a(new Exception("Write file to disk failed"));
                ((eq) entry8.getValue()).getF16947a().a(7);
            }
            ea eaVar5 = this.c;
            if (eaVar5 != null) {
                eaVar5.a(new FilePacketResponse(fileTransferPacket.getSessionID(), 7));
            }
        } else if (iA == 11) {
            ea eaVar6 = this.c;
            if (eaVar6 != null) {
                eaVar6.a(new FilePacketResponse(fileTransferPacket.getSessionID(), 11));
            }
            Map<String, eq> map5 = this.e;
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry<String, eq> entry9 : map5.entrySet()) {
                if (StringsKt__StringsJVMKt.startsWith$default(caVar.getF5099b(), entry9.getKey(), false, 2, null)) {
                    linkedHashMap5.put(entry9.getKey(), entry9.getValue());
                }
            }
            for (Map.Entry entry10 : linkedHashMap5.entrySet()) {
                ((eq) entry10.getValue()).getF16947a().a(new Exception("CRC not match, something wrong during transfer"));
                ((eq) entry10.getValue()).getF16947a().a(11);
            }
        }
        if (iA != -1) {
            this.d.remove(Integer.valueOf(fileTransferPacket.getSessionID()));
            this.e.remove(caVar.getF5099b());
        }
    }

    public final void a(String path) {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
    }
}
