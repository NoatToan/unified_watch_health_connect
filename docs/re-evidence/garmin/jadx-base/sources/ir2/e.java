package ir2;

import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import d53.n;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$initWithDevice$1", f = "WalletMessageConsoleActivity.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletMessageConsoleActivity f94840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f94841c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$initWithDevice$1$1", f = "WalletMessageConsoleActivity.kt", l = {190}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WalletMessageConsoleActivity f94843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f94844c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WalletMessageConsoleActivity walletMessageConsoleActivity, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94843b = walletMessageConsoleActivity;
            this.f94844c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94843b, this.f94844c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94842a;
            if (i14 == 0) {
                r.b(obj);
                this.f94842a = 1;
                if (WalletMessageConsoleActivity.ca(this.f94843b, this.f94844c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WalletMessageConsoleActivity walletMessageConsoleActivity, long j8, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f94840b = walletMessageConsoleActivity;
        this.f94841c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f94840b, this.f94841c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94839a;
        int i15 = 1;
        long j8 = this.f94841c;
        WalletMessageConsoleActivity walletMessageConsoleActivity = this.f94840b;
        try {
            if (i14 == 0) {
                r.b(obj);
                hn2.c.ba(walletMessageConsoleActivity, Boolean.TRUE, "Prepare card image", null, 12);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(walletMessageConsoleActivity, j8, null);
                this.f94839a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            ((TextView) walletMessageConsoleActivity.findViewById(R.id.device_unit_id)).setText("ESN: " + j8);
        } catch (Exception e4) {
            WalletMessageConsoleActivity.f51901j.error("Failed to init for device " + j8, (Throwable) e4);
            new androidx.appcompat.app.e.a(walletMessageConsoleActivity).setTitle("Error").setMessage(n.c("\n                    Failed to init for device " + j8 + "\n                    -\n                    " + e4 + "\n                    ")).setPositiveButton(R.string.lbl_ok, new b(walletMessageConsoleActivity, i15)).show();
        } finally {
            hn2.c.ba(walletMessageConsoleActivity, Boolean.FALSE, null, null, 14);
        }
        return Unit.INSTANCE;
    }
}
