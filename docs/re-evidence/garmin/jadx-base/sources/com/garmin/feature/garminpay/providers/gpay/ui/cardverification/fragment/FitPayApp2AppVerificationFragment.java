package com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.x1;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dq2.f;
import e23.p;
import f.c;
import i3.e5;
import java.util.concurrent.atomic.AtomicReference;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import o53.j0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/fragment/FitPayApp2AppVerificationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayApp2AppVerificationFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f51480a = m.b(new ll0.b(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f51481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yo2.b f51482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f51483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b f51484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f51485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f51486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c<Intent> f51487h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51488a;

        static {
            int[] iArr = new int[mp2.b.values().length];
            try {
                iArr[mp2.b.AWAITING_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mp2.b.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51488a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayApp2AppVerificationFragment$onCreate$1", f = "FitPayApp2AppVerificationFragment.kt", l = {73}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51489a;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return FitPayApp2AppVerificationFragment.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51489a;
            FitPayApp2AppVerificationFragment fitPayApp2AppVerificationFragment = FitPayApp2AppVerificationFragment.this;
            if (i14 == 0) {
                r.b(obj);
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                Boolean bool = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get();
                Boolean bool2 = Boolean.TRUE;
                if (!s.g(bool, bool2) || s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51200k.get(), bool2)) {
                    FitPayApp2AppVerificationFragment.u6(fitPayApp2AppVerificationFragment);
                } else {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = fitPayApp2AppVerificationFragment.f51483d;
                    if (aVar2 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    String externalTokenReference = aVar2.y4().getExternalTokenReference();
                    if (externalTokenReference == null || externalTokenReference.length() == 0) {
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar3 = fitPayApp2AppVerificationFragment.f51483d;
                        if (aVar3 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        j0 j0VarC4 = aVar3.C4();
                        this.f51489a = 1;
                        if (j0VarC4.C(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayApp2AppVerificationFragment.f51483d;
                        if (aVar4 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        atomicReference.set(aVar4.y4().getExternalTokenReference());
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
            androidx.fragment.app.m mVarRequireActivity = fitPayApp2AppVerificationFragment.requireActivity();
            mVarRequireActivity.getClass();
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.REQUIRE_ADDITIONAL_AUTHENTICATION;
            cVar.getClass();
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(mVarRequireActivity, aVar5, null);
            return Unit.INSTANCE;
        }
    }

    public FitPayApp2AppVerificationFragment() {
        c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new jp.a(this, 5));
        cVarRegisterForActivityResult.getClass();
        this.f51487h = cVarRegisterForActivityResult;
    }

    public static final void u6(FitPayApp2AppVerificationFragment fitPayApp2AppVerificationFragment) {
        dq2.a aVar;
        String str;
        fitPayApp2AppVerificationFragment.v6().debug("handleRequest");
        f fVar = fitPayApp2AppVerificationFragment.f51481b;
        if (fVar == null || (aVar = fVar.f60810e) == null) {
            fitPayApp2AppVerificationFragment.v6().error("handleRequest: app 2 app context missing");
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar = fitPayApp2AppVerificationFragment.f51484e;
            if (bVar != null) {
                bVar.P0(FitPayCardVerificationActivity.a.f.f51461a);
                return;
            } else {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
        }
        androidx.fragment.app.m activity = fitPayApp2AppVerificationFragment.getActivity();
        activity.getClass();
        String applicationId = aVar.getApplicationId();
        wr2.b bVar2 = wr2.b.f186831a;
        Context applicationContext = ((FitPayCardVerificationActivity) activity).getApplicationContext();
        applicationContext.getClass();
        bVar2.getClass();
        if (!wr2.b.b(applicationContext, applicationId)) {
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar3 = fitPayApp2AppVerificationFragment.f51484e;
            if (bVar3 != null) {
                bVar3.P0(new FitPayCardVerificationActivity.a.C1067a(applicationId));
                return;
            } else {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
        }
        String strG = e5.g(applicationId, ".", aVar.getAction());
        Intent intent = new Intent();
        intent.setPackage(applicationId);
        intent.setAction(strG);
        dq2.b data = aVar.getData();
        try {
            String text = data.getOutbound().getText();
            if (text != null && text.length() != 0) {
                fitPayApp2AppVerificationFragment.f51485f = data.getInbound().getResponse();
                fitPayApp2AppVerificationFragment.f51486g = data.getInbound().getAuthCode();
                String str2 = fitPayApp2AppVerificationFragment.f51485f;
                if (str2 != null && str2.length() != 0 && (str = fitPayApp2AppVerificationFragment.f51486g) != null && str.length() != 0) {
                    intent.putExtra("android.intent.extra.TEXT", text).getClass();
                    try {
                        fitPayApp2AppVerificationFragment.f51487h.a(intent, null);
                        return;
                    } catch (ActivityNotFoundException e4) {
                        fitPayApp2AppVerificationFragment.v6().error("handleRequest: ", (Throwable) e4);
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar4 = fitPayApp2AppVerificationFragment.f51484e;
                        if (bVar4 != null) {
                            bVar4.P0(FitPayCardVerificationActivity.a.f.f51461a);
                            return;
                        } else {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                    }
                }
                fitPayApp2AppVerificationFragment.v6().error("handleRequest: missing inbound keys, can not perform A2A action");
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar5 = fitPayApp2AppVerificationFragment.f51484e;
                if (bVar5 != null) {
                    bVar5.P0(FitPayCardVerificationActivity.a.f.f51461a);
                    return;
                } else {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
            }
            fitPayApp2AppVerificationFragment.v6().error("handleRequest: data payload is missing");
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar6 = fitPayApp2AppVerificationFragment.f51484e;
            if (bVar6 != null) {
                bVar6.P0(FitPayCardVerificationActivity.a.f.f51461a);
            } else {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
        } catch (Exception e14) {
            fitPayApp2AppVerificationFragment.v6().error("handleRequest: ", (Throwable) e14);
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar7 = fitPayApp2AppVerificationFragment.f51484e;
            if (bVar7 == null) {
                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
            bVar7.P0(FitPayCardVerificationActivity.a.f.f51461a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            a7.e activity = getActivity();
            activity.getClass();
            this.f51484e = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b) activity;
        } catch (ClassCastException unused) {
            v6().error(getActivity() + " must implement IVerificationUIListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a) new x1(mVarRequireActivity).b(s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.class));
        this.f51483d = aVar;
        this.f51481b = aVar.f51471e.d();
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = this.f51483d;
        if (aVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        this.f51482c = aVar2.y4();
        ge1.b.T(f0.w(this), o53.s0.f129406a, null, new b(null), 2);
    }

    public final Logger v6() {
        return (Logger) this.f51480a.getValue();
    }
}
