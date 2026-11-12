package com.garmin.feature.garminpay.providers.gpay.pushprovisioning;

import android.os.Bundle;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import ho2.k;
import ho2.m;
import o13.g;
import o13.r;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity$previousChecks$1", f = "PushProvMainActivity.kt", l = {219, 223}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PushProvMainActivity f51185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f51187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f51188d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51189a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.BANK_SYSTEM_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.TROUBLE_COMMUNICATING_GPAY_SERVERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51189a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PushProvMainActivity pushProvMainActivity, d<? super b> dVar) {
        super(2, dVar);
        this.f51188d = pushProvMainActivity;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f51188d, dVar);
        bVar.f51187c = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r9.z4(r3, r18) == r2) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f51187c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f51186b;
        PushProvMainActivity pushProvMainActivity = this.f51188d;
        try {
            if (i14 == 0) {
                r.b(obj);
                PushProvMainActivity.f51162v.debug("previousChecks");
                m mVar = pushProvMainActivity.f51165i;
                if (mVar == null) {
                    s.m("pushProvViewModel");
                    throw null;
                }
                this.f51187c = b0Var;
                this.f51186b = 1;
                x53.c cVar = s0.f129406a;
                Object objE0 = ge1.b.e0(x53.b.f189152a, new k(mVar, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                }
                return obj2;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pushProvMainActivity = this.f51185a;
                r.b(obj);
            }
            m mVar2 = pushProvMainActivity.f51165i;
            if (mVar2 == null) {
                s.m("pushProvViewModel");
                throw null;
            }
            y0<io2.d> y0Var = mVar2.f84877h;
            if (y0Var != null) {
                y0Var.f(pushProvMainActivity, new PushProvMainActivity.d(new ho2.d(pushProvMainActivity, 2)));
                return Unit.INSTANCE;
            }
            s.m("pushProvDeepLinkData");
            throw null;
            Bundle extras = pushProvMainActivity.getIntent().getExtras();
            io2.d dVar = (io2.d) (extras != null ? extras.get("extra.deep.link.data") : null);
            if (dVar != null) {
                m mVar3 = pushProvMainActivity.f51165i;
                if (mVar3 == null) {
                    s.m("pushProvViewModel");
                    throw null;
                }
                this.f51187c = b0Var;
                this.f51185a = pushProvMainActivity;
                this.f51186b = 2;
            } else {
                PushProvMainActivity.f51162v.error("deep link data cannot be null");
                pushProvMainActivity.fa();
            }
        } catch (Exception e4) {
            Logger logger = PushProvMainActivity.f51162v;
            logger.error("verifyPushProvDeepLinkData - " + g.b(e4) + " message: " + e4.getMessage());
            if (e4 instanceof NewFitPayException) {
                int i15 = a.f51189a[((NewFitPayException) e4).getErrorFlag().ordinal()];
                if (i15 == 1) {
                    pushProvMainActivity.getClass();
                    logger.debug("showBankSystemErrorDialog");
                    br2.c cVar2 = br2.c.f19585a;
                    String string = pushProvMainActivity.getString(R.string.dialog_title_error);
                    string.getClass();
                    String string2 = pushProvMainActivity.getString(R.string.bank_communication_error);
                    string2.getClass();
                    androidx.appcompat.app.e eVarQ = br2.c.q(cVar2, pushProvMainActivity, string, string2, new o13.p(pushProvMainActivity.getString(R.string.lbl_ok), new ho2.b(pushProvMainActivity, 3)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ != null) {
                        eVarQ.show();
                    }
                } else if (i15 != 2) {
                    pushProvMainActivity.ka();
                } else {
                    pushProvMainActivity.getClass();
                    logger.debug("showTroubleCommunicatingGpayServersDialog");
                    br2.c cVar3 = br2.c.f19585a;
                    String string3 = pushProvMainActivity.getString(R.string.dialog_title_error);
                    string3.getClass();
                    String string4 = pushProvMainActivity.getString(R.string.wallet_generic_server_error);
                    string4.getClass();
                    androidx.appcompat.app.e eVarQ2 = br2.c.q(cVar3, pushProvMainActivity, string3, string4, new o13.p(pushProvMainActivity.getString(R.string.lbl_ok), new ho2.b(pushProvMainActivity, 2)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ2 != null) {
                        eVarQ2.show();
                    }
                }
            } else {
                pushProvMainActivity.ka();
            }
            pushProvMainActivity = pushProvMainActivity;
        }
        return Unit.INSTANCE;
    }
}
