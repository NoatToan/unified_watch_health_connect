package defpackage;

import android.os.Handler;
import android.os.Message;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.spp.ParseResult;

/* JADX INFO: loaded from: classes2.dex */
public class k7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.xiaomi.wearable.spp.b f23563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile byte[] f23564b;
    public Handler d;
    public volatile boolean c = true;
    public final qfp e = new qfp(snr.a());
    public final qfp.a f = new a(getClass().getSimpleName());

    public class a extends qfp.a {
        public a(String str) {
            super(str);
        }

        @Override // qfp.a
        public void onTimerCallback() {
            CoreExtKt.logger.i("SppWorker", "time out reset sppPacket,thread:" + Thread.currentThread().getName());
            k7o.this.f();
        }

        @Override // qfp.a
        public void resetCallback() {
            k7o.this.e.c();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23566a;

        static {
            int[] iArr = new int[ParseResult.values().length];
            f23566a = iArr;
            try {
                iArr[ParseResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23566a[ParseResult.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23566a[ParseResult.INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k7o(Handler handler) {
        this.d = handler;
    }

    public final void b(byte[] bArr) {
        CoreExtKt.logger.i("SppWorker", "createOrMergeSppPacket: ");
        if (!this.c) {
            if (bArr == null) {
                CoreExtKt.logger.i("SppWorker", "createOrMergeSppPacket: read data = null");
                return;
            }
            if (this.f23563a == null || this.f23563a.o() == null) {
                throw new NullPointerException("sppPacket can't be null or packetData can't be null");
            }
            CoreExtKt.logger.i("SppWorker", "sppPacket merge thread:" + Thread.currentThread().getName());
            this.f23563a.q(bArr);
            if (this.e.b()) {
                CoreExtKt.logger.i("SppWorker", "stop timer,thread:" + Thread.currentThread().getName());
                this.e.e();
                return;
            }
            return;
        }
        this.c = false;
        if (this.f23564b == null) {
            if (bArr == null) {
                CoreExtKt.logger.i("SppWorker", "createOrMergeSppPacket: new read data = null");
                return;
            }
            CoreExtKt.logger.i("SppWorker", "new sppPacket remaining length:0,thread:" + Thread.currentThread().getName());
            this.f23563a = new com.xiaomi.wearable.spp.b(bArr);
            return;
        }
        CoreExtKt.logger.i("SppWorker", "new sppPacket remaining length:" + this.f23564b.length + " thread:" + Thread.currentThread().getName());
        this.f23563a = new com.xiaomi.wearable.spp.b(this.f23564b);
        if (bArr != null) {
            this.f23563a.q(bArr);
        }
        this.f23564b = null;
    }

    public final void c(com.xiaomi.wearable.spp.b bVar) {
        Message messageObtainMessage = this.d.obtainMessage(1);
        messageObtainMessage.obj = bVar;
        Handler handler = this.d;
        if (handler != null) {
            handler.sendMessage(messageObtainMessage);
        }
    }

    public final void d(ParseResult parseResult) {
        CoreExtKt.logger.i("SppWorker", "doNextByParseResult() called with: resultCode = [" + parseResult + "]");
        int i = b.f23566a[parseResult.ordinal()];
        if (i != 1) {
            if (i == 2) {
                e(null);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                this.e.d(this.f, 10000L);
                return;
            }
        }
        this.c = true;
        this.f23564b = null;
        if (this.f23563a.o() != null && this.f23563a.o().length > 0) {
            this.f23564b = this.f23563a.o();
            this.f23563a.v();
        }
        CoreExtKt.logger.i("SppWorker", "parse data success,thread:" + Thread.currentThread().getName());
        c(this.f23563a);
        if (this.f23564b != null) {
            e(null);
        }
    }

    public void e(byte[] bArr) {
        try {
            b(bArr);
            d(this.f23563a.t());
        } catch (Exception e) {
            CoreExtKt.logger.i("SppWorker", "loop parse error:" + e.getMessage());
            f();
        }
    }

    public void f() {
        if (this.e.b()) {
            this.e.e();
        }
        this.c = true;
        this.f23563a = null;
        this.f23564b = null;
    }
}
