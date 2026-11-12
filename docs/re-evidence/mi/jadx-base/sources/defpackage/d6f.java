package defpackage;

import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.api.p;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class d6f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f15134a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5f f15135b;
    public final int c;

    public class a implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15137b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ av7 e;
        public final /* synthetic */ int f;

        public a(int i, int i2, int i3, String str, av7 av7Var, int i4) {
            this.f15136a = i;
            this.f15137b = i2;
            this.c = i3;
            this.d = str;
            this.e = av7Var;
            this.f = i4;
        }

        @Override // com.xiaomi.eco.api.p.a
        public void onCallback(EcoApiResult ecoApiResult) {
            try {
                Logger.i("MassDataSender", "MassPrepare response isSuccess = " + ecoApiResult.f());
                if (ecoApiResult.f()) {
                    if (ecoApiResult.e() != null && ecoApiResult.e().s() != null && ecoApiResult.e().s().o() != null) {
                        m6f m6fVarO = ecoApiResult.e().s().o();
                        if (m6fVarO.d == 0) {
                            int i = m6fVarO.f;
                            int i2 = m6fVarO.g;
                            Logger.i("MassDataSender", "MassPrepare response remainLength = " + i + " expectedSliceLength = " + i2);
                            d6f.this.f15135b.x(this.f15136a, this.f15137b, this.c, this.d, i2, d6f.this.c, this.e, i);
                        } else {
                            Logger.i("MassDataSender", "MassPrepare prepareStatus error:  " + m6fVarO.d);
                            this.e.onFail(m6fVarO.d, "");
                        }
                    }
                } else if (ecoApiResult.a() == 1) {
                    Logger.i("MassDataSender", "MassPrepare prepareStatus NOT_SUPPORT ");
                    d6f.this.i(this.f15136a, this.f15137b, this.c, this.d, this.f, this.e);
                } else {
                    Logger.i("MassDataSender", "MassPrepare prepareStatus send failed:  " + ecoApiResult.a());
                    this.e.onFail(3, "");
                }
            } catch (Exception e) {
                Logger.i("MassDataSender", "onCallback: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public d6f(com.xiaomi.eco.api.a aVar, int i) {
        e(aVar);
        this.c = i;
        this.f15135b = z5f.o(aVar);
    }

    public static byte f(int i, int i2) {
        byte b2 = (byte) ((i * 16) + i2);
        Logger.i("MassDataSender", "getDataTypeByte: " + ((int) b2));
        return b2;
    }

    public final void e(com.xiaomi.eco.api.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("WearApiCall should not be null");
        }
    }

    public final /* synthetic */ void g(String str, int i, int i2, int i3, av7 av7Var, int i4) {
        byte[] fileMD5Bytes = MD5Util.getFileMD5Bytes(new File(str));
        File file = new File(str);
        Logger.i("MassDataSender", "sendFile: hash with md5 = " + ByteUtil.byteToString(fileMD5Bytes) + " , length = " + file.length());
        byte bF = f(i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append("MassPrepare dataTypeByte  = ");
        sb.append((int) bF);
        Logger.i("MassDataSender", sb.toString());
        this.f15135b.v(bF, fileMD5Bytes, (int) file.length(), 0, new a(i3, i, i2, str, av7Var, i4));
    }

    public void h(final int i, final int i2, final int i3, final String str, final int i4, final av7 av7Var) {
        this.f15134a.execute(new Runnable() { // from class: b6f
            @Override // java.lang.Runnable
            public final void run() {
                this.f3859a.g(str, i2, i3, i, av7Var, i4);
            }
        });
    }

    public final void i(int i, int i2, int i3, String str, int i4, av7 av7Var) {
        this.f15135b.x(i, i2, i3, str, i4, this.c, av7Var, 0);
    }
}
