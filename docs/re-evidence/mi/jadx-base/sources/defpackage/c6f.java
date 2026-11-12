package defpackage;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.mass.dispatcher.MassDataDispatcher;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public class c6f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f4982a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MassDataDispatcher f4983b = MassDataDispatcher.s();

    public class a implements OnSyncCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4985b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ s5f e;
        public final /* synthetic */ int f;

        public a(int i, int i2, int i3, String str, s5f s5fVar, int i4) {
            this.f4984a = i;
            this.f4985b = i2;
            this.c = i3;
            this.d = str;
            this.e = s5fVar;
            this.f = i4;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            if (i2 == 1) {
                Logger.i("MassDataSender", "MassPrepare prepareStatus NOT_SUPPORT ");
                c6f.this.g(this.f4984a, this.f4985b, this.c, this.d, this.f, this.e);
                return;
            }
            Logger.i("MassDataSender", "MassPrepare prepareStatus send failed:  " + i2);
            this.e.onFail(3, "");
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            try {
                if (syncResult.getPacket() != null && syncResult.getPacket().z() != null && syncResult.getPacket().z().p() != null) {
                    l6f l6fVarP = syncResult.getPacket().z().p();
                    if (l6fVarP.d == 0) {
                        int i2 = l6fVarP.f;
                        int i3 = l6fVarP.g;
                        Logger.i("MassDataSender", "MassPrepare response remainLength = " + i2 + " expectedSliceLength = " + i3);
                        c6f.this.f4983b.B(this.f4984a, this.f4985b, this.c, this.d, i3, this.e, i2);
                    } else {
                        Logger.i("MassDataSender", "MassPrepare prepareStatus error:  " + l6fVarP.d);
                        this.e.onFail(l6fVarP.d, "");
                    }
                }
            } catch (Exception e) {
                Logger.i("MassDataSender", "onCallback: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static byte d(int i, int i2) {
        byte b2 = (byte) ((i * 16) + i2);
        Logger.i("MassDataSender", "getDataTypeByte: " + ((int) b2));
        return b2;
    }

    public final /* synthetic */ void e(String str, s5f s5fVar, int i, int i2, int i3, int i4) {
        if (TextUtils.isEmpty(str)) {
            s5fVar.onFail(3, "file path is null");
            return;
        }
        byte[] fileMD5Bytes = MD5Util.getFileMD5Bytes(new File(str));
        File file = new File(str);
        Logger.i("MassDataSender", "sendFile: hash with md5 = " + ByteUtil.byteToString(fileMD5Bytes) + " , length = " + file.length());
        byte bD = d(i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append("MassPrepare dataTypeByte  = ");
        sb.append((int) bD);
        Logger.i("MassDataSender", sb.toString());
        this.f4983b.z(bD, fileMD5Bytes, (int) file.length(), 0, new a(i3, i, i2, str, s5fVar, i4));
    }

    public void f(final int i, final int i2, final int i3, final String str, final int i4, final s5f s5fVar) {
        this.f4982a.execute(new Runnable() { // from class: a6f
            @Override // java.lang.Runnable
            public final void run() {
                this.f685a.e(str, s5fVar, i2, i3, i, i4);
            }
        });
    }

    public final void g(int i, int i2, int i3, String str, int i4, s5f s5fVar) {
        this.f4983b.B(i, i2, i3, str, i4, s5fVar, 0);
    }
}
