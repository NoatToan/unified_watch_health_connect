package lp2;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationSubmitFragment;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationSubmitFragment$startAuthCodeVerification$1", f = "FitPayCardVerificationSubmitFragment.kt", l = {256}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FitPayCardVerificationSubmitFragment f114247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f114248d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationSubmitFragment$startAuthCodeVerification$1$2", f = "FitPayCardVerificationSubmitFragment.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f114249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FitPayCardVerificationSubmitFragment f114250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f114251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f114252d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FitPayCardVerificationSubmitFragment fitPayCardVerificationSubmitFragment, String str, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f114250b = fitPayCardVerificationSubmitFragment;
            this.f114251c = str;
            this.f114252d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f114250b, this.f114251c, this.f114252d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f114249a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = this.f114250b.f51517c;
            if (aVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            this.f114249a = 1;
            Object objL0 = aVar2.A4().f205979a.l0(this.f114251c, this.f114252d, this);
            return objL0 == aVar ? aVar : objL0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FitPayCardVerificationSubmitFragment fitPayCardVerificationSubmitFragment, String str, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f114247c = fitPayCardVerificationSubmitFragment;
        this.f114248d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f114247c, this.f114248d, dVar);
        iVar.f114246b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        RandomAccess randomAccessB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114245a;
        String str2 = this.f114248d;
        FitPayCardVerificationSubmitFragment fitPayCardVerificationSubmitFragment = this.f114247c;
        try {
            if (i14 == 0) {
                r.b(obj);
                int i15 = FitPayCardVerificationSubmitFragment.f51514k;
                fitPayCardVerificationSubmitFragment.w6().debug("startAuthCodeVerification");
                if (str2.length() > 0) {
                    kp2.b bVar = fitPayCardVerificationSubmitFragment.f51519e;
                    if (bVar == null) {
                        s.m("cardSubmitVerificationAdapter");
                        throw null;
                    }
                    dq2.f fVar = fitPayCardVerificationSubmitFragment.f51516b;
                    if (fVar != null) {
                        kp2.b.C2044b c2044b = kp2.b.f106012f;
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = fitPayCardVerificationSubmitFragment.f51517c;
                        if (aVar2 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        randomAccessB = kp2.b.C2044b.b(c2044b, fVar, aVar2.y4(), null, this.f114248d, 4);
                    } else {
                        randomAccessB = null;
                    }
                    if (randomAccessB == null) {
                        bVar.getClass();
                        randomAccessB = j0.f134944a;
                    }
                    bVar.t(randomAccessB);
                }
                dq2.f fVar2 = fitPayCardVerificationSubmitFragment.f51516b;
                if (fVar2 == null || (str = fVar2.f60812g) == null) {
                    fitPayCardVerificationSubmitFragment.w6().error("startAuthCodeVerification: verifyUrl is missing can not verify auth code");
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar2 = fitPayCardVerificationSubmitFragment.f51521g;
                    if (bVar2 != null) {
                        bVar2.P0(new FitPayCardVerificationActivity.a.h(true));
                        return Unit.INSTANCE;
                    }
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                t13.g gVarPlus = f0.w(fitPayCardVerificationSubmitFragment).f7937b.plus(s0.f129406a);
                a aVar3 = new a(fitPayCardVerificationSubmitFragment, str2, str, null);
                this.f114246b = null;
                this.f114245a = 1;
                if (ge1.b.e0(gVarPlus, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            SwipeRefreshLayout swipeRefreshLayout = fitPayCardVerificationSubmitFragment.f51522h;
            if (swipeRefreshLayout == null) {
                s.m("swipeToRefreshLayout");
                throw null;
            }
            swipeRefreshLayout.setRefreshing(false);
            fitPayCardVerificationSubmitFragment.w6().debug("startAuthCodeVerification: verification complete");
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
            AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayCardVerificationSubmitFragment.f51517c;
            if (aVar4 == null) {
                s.m("viewModel");
                throw null;
            }
            atomicReference.set(aVar4.y4().getExternalTokenReference());
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar5 = fitPayCardVerificationSubmitFragment.f51517c;
            if (aVar5 != null) {
                aVar5.f51475i.j(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b.CARD_VERIFIED);
                return Unit.INSTANCE;
            }
            s.m("viewModel");
            throw null;
        } catch (Exception e4) {
            SwipeRefreshLayout swipeRefreshLayout2 = fitPayCardVerificationSubmitFragment.f51522h;
            if (swipeRefreshLayout2 == null) {
                s.m("swipeToRefreshLayout");
                throw null;
            }
            swipeRefreshLayout2.setRefreshing(false);
            if (e4 instanceof NewFitPayException) {
                NewFitPayException newFitPayException = (NewFitPayException) e4;
                if (newFitPayException.getErrorFlag() == z.CARD_VERIFICATION_FAILED) {
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar3 = fitPayCardVerificationSubmitFragment.f51521g;
                    if (bVar3 == null) {
                        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    bVar3.P0(new FitPayCardVerificationActivity.a.h(false));
                } else {
                    int i16 = FitPayCardVerificationSubmitFragment.b.f51525a[newFitPayException.getErrorFlag().ordinal()];
                    if (i16 == 1) {
                        kp2.b bVar4 = fitPayCardVerificationSubmitFragment.f51519e;
                        if (bVar4 == null) {
                            s.m("cardSubmitVerificationAdapter");
                            throw null;
                        }
                        kp2.b.C2044b c2044b2 = kp2.b.f106012f;
                        dq2.f fVar3 = fitPayCardVerificationSubmitFragment.f51516b;
                        fVar3.getClass();
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar6 = fitPayCardVerificationSubmitFragment.f51517c;
                        if (aVar6 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        yo2.b bVarY4 = aVar6.y4();
                        String string = fitPayCardVerificationSubmitFragment.getString(R.string.incorrect_code);
                        c2044b2.getClass();
                        bVar4.t(kp2.b.C2044b.a(fVar3, bVarY4, string, str2));
                    } else if (i16 == 2) {
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar5 = fitPayCardVerificationSubmitFragment.f51521g;
                        if (bVar5 == null) {
                            s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        bVar5.P0(FitPayCardVerificationActivity.a.c.f51458a);
                    } else if (i16 == 3) {
                        kp2.b bVar6 = fitPayCardVerificationSubmitFragment.f51519e;
                        if (bVar6 == null) {
                            s.m("cardSubmitVerificationAdapter");
                            throw null;
                        }
                        kp2.b.C2044b c2044b3 = kp2.b.f106012f;
                        dq2.f fVar4 = fitPayCardVerificationSubmitFragment.f51516b;
                        fVar4.getClass();
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar7 = fitPayCardVerificationSubmitFragment.f51517c;
                        if (aVar7 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        bVar6.t(kp2.b.C2044b.b(c2044b3, fVar4, aVar7.y4(), fitPayCardVerificationSubmitFragment.getString(R.string.expired_session), null, 8));
                    } else if (i16 != 4) {
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar7 = fitPayCardVerificationSubmitFragment.f51521g;
                        if (i16 != 5) {
                            if (bVar7 == null) {
                                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                throw null;
                            }
                            bVar7.P0(new FitPayCardVerificationActivity.a.h(true));
                        } else {
                            if (bVar7 == null) {
                                s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                                throw null;
                            }
                            bVar7.P0(FitPayCardVerificationActivity.a.b.f51457a);
                        }
                    } else {
                        kp2.b bVar8 = fitPayCardVerificationSubmitFragment.f51519e;
                        if (bVar8 == null) {
                            s.m("cardSubmitVerificationAdapter");
                            throw null;
                        }
                        kp2.b.C2044b c2044b4 = kp2.b.f106012f;
                        dq2.f fVar5 = fitPayCardVerificationSubmitFragment.f51516b;
                        fVar5.getClass();
                        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar8 = fitPayCardVerificationSubmitFragment.f51517c;
                        if (aVar8 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        bVar8.t(kp2.b.C2044b.b(c2044b4, fVar5, aVar8.y4(), fitPayCardVerificationSubmitFragment.getString(R.string.incorrect_tav), null, 8));
                    }
                }
            } else {
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b bVar9 = fitPayCardVerificationSubmitFragment.f51521g;
                if (bVar9 == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                bVar9.P0(new FitPayCardVerificationActivity.a.h(false));
                fitPayCardVerificationSubmitFragment.w6().error("startAuthCodeVerification: ", (Throwable) e4);
            }
        }
    }
}
