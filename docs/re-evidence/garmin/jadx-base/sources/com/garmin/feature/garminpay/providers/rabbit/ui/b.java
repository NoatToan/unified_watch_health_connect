package com.garmin.feature.garminpay.providers.rabbit.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import com.garmin.garminpay.wallet.exception.NfcTransferCoroutineException;
import e23.l;
import e23.p;
import java.util.Locale;
import o13.q;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import qh1.j;
import qn0.m;
import qq2.f;
import v13.e;
import v13.i;
import vb.h;
import vn2.b1;
import w2.a0;
import w52.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/b;", "Lsy2/b;", "Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel;", "Lqq2/b;", "Lqq2/a;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends sy2.b<IRabbitCardDetailModel, qq2.b> implements qq2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f51786e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pq2.b f51787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f51788d;

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.rabbit.ui.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1076b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51789a;

        static {
            int[] iArr = new int[NfcTransferCoroutineException.a.values().length];
            try {
                iArr[NfcTransferCoroutineException.a.BUSY_WHEN_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NfcTransferCoroutineException.a.BUSY_WHEN_FINISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NfcTransferCoroutineException.a.DEVICE_DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51789a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailPresenter$onDisableOrEnableCardClicked$1", f = "RabbitCardDetailPresenter.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f51791b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = b.this.new c(dVar);
            cVar.f51791b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51790a;
            final b bVar2 = b.this;
            final int i15 = 1;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    int i16 = q.f128596b;
                    IRabbitCardDetailModel iRabbitCardDetailModelF0 = bVar2.f0();
                    boolean z14 = !bVar2.f51788d;
                    this.f51791b = null;
                    this.f51790a = 1;
                    if (iRabbitCardDetailModelF0.w(z14, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                bVar = Unit.INSTANCE;
                int i17 = q.f128596b;
            } catch (Throwable th3) {
                int i18 = q.f128596b;
                bVar = new q.b(th3);
            }
            if (!(bVar instanceof q.b)) {
                bVar2.f51788d = !bVar2.f51788d;
                bVar2.getView().Z7(a0.i(bVar2.f0().getDevice()), bVar2.f51788d);
                if (bVar2.f51788d) {
                    bVar2.getView().Z5(new l() { // from class: qq2.c
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            int i19 = i15;
                            final com.garmin.feature.garminpay.providers.rabbit.ui.b bVar3 = bVar2;
                            androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj2;
                            switch (i19) {
                                case 0:
                                    Logger logger = com.garmin.feature.garminpay.providers.rabbit.ui.b.f51786e;
                                    aVar2.getClass();
                                    aVar2.setTitle(R.string.dialog_title_error);
                                    aVar2.setMessage(R.string.wallet_operation_error_but_turn_off_rapid_pass);
                                    final int i24 = 0;
                                    aVar2.setPositiveButton(R.string.wallet_call, new DialogInterface.OnClickListener() { // from class: qq2.d
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i25) {
                                            int i26 = i24;
                                            com.garmin.feature.garminpay.providers.rabbit.ui.b bVar4 = bVar3;
                                            switch (i26) {
                                                case 0:
                                                    Logger logger2 = com.garmin.feature.garminpay.providers.rabbit.ui.b.f51786e;
                                                    bVar4.G();
                                                    break;
                                                default:
                                                    gl.b.I(bVar4.getView().getScope(), null, new e(bVar4, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    aVar2.setNegativeButton(R.string.lbl_cancel, new j(3));
                                    aVar2.setCancelable(false);
                                    break;
                                default:
                                    aVar2.setTitle(R.string.wallet_set_card_rapid_pass_title);
                                    aVar2.setMessage(R.string.wallet_set_card_rapid_pass_message);
                                    final int i25 = 1;
                                    aVar2.setPositiveButton(R.string.lbl_yes, new DialogInterface.OnClickListener() { // from class: qq2.d
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i26) {
                                            int i27 = i25;
                                            com.garmin.feature.garminpay.providers.rabbit.ui.b bVar4 = bVar3;
                                            switch (i27) {
                                                case 0:
                                                    Logger logger2 = com.garmin.feature.garminpay.providers.rabbit.ui.b.f51786e;
                                                    bVar4.G();
                                                    break;
                                                default:
                                                    gl.b.I(bVar4.getView().getScope(), null, new e(bVar4, null), 3);
                                                    dialogInterface.dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    aVar2.setNegativeButton(R.string.lbl_no, new j(4));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            Throwable thB = q.b(bVar);
            if (thB != null) {
                boolean z15 = thB instanceof NfcTransferCoroutineException;
                if (z15 || (thB instanceof IRabbitCardDetailModel.OperateRabbitCardException)) {
                    String strI = a0.i(bVar2.f0().getDevice());
                    bVar2.f0().getDevice().getUnitID();
                    b.f51786e.error("showOperateRabbitCardFailedDialog(): error=", thB);
                    if (thB instanceof IRabbitCardDetailModel.OperateRabbitCardException) {
                        final int i19 = 0;
                        bVar2.getView().Z5(new l() { // from class: qq2.c
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                int i110 = i19;
                                final com.garmin.feature.garminpay.providers.rabbit.ui.b bVar3 = bVar2;
                                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj2;
                                switch (i110) {
                                    case 0:
                                        Logger logger = com.garmin.feature.garminpay.providers.rabbit.ui.b.f51786e;
                                        aVar2.getClass();
                                        aVar2.setTitle(R.string.dialog_title_error);
                                        aVar2.setMessage(R.string.wallet_operation_error_but_turn_off_rapid_pass);
                                        final int i24 = 0;
                                        aVar2.setPositiveButton(R.string.wallet_call, new DialogInterface.OnClickListener() { // from class: qq2.d
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i26) {
                                                int i27 = i24;
                                                com.garmin.feature.garminpay.providers.rabbit.ui.b bVar4 = bVar3;
                                                switch (i27) {
                                                    case 0:
                                                        Logger logger2 = com.garmin.feature.garminpay.providers.rabbit.ui.b.f51786e;
                                                        bVar4.G();
                                                        break;
                                                    default:
                                                        gl.b.I(bVar4.getView().getScope(), null, new e(bVar4, null), 3);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                        aVar2.setNegativeButton(R.string.lbl_cancel, new j(3));
                                        aVar2.setCancelable(false);
                                        break;
                                    default:
                                        aVar2.setTitle(R.string.wallet_set_card_rapid_pass_title);
                                        aVar2.setMessage(R.string.wallet_set_card_rapid_pass_message);
                                        final int i25 = 1;
                                        aVar2.setPositiveButton(R.string.lbl_yes, new DialogInterface.OnClickListener() { // from class: qq2.d
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i26) {
                                                int i27 = i25;
                                                com.garmin.feature.garminpay.providers.rabbit.ui.b bVar4 = bVar3;
                                                switch (i27) {
                                                    case 0:
                                                        Logger logger2 = com.garmin.feature.garminpay.providers.rabbit.ui.b.f51786e;
                                                        bVar4.G();
                                                        break;
                                                    default:
                                                        gl.b.I(bVar4.getView().getScope(), null, new e(bVar4, null), 3);
                                                        dialogInterface.dismiss();
                                                        break;
                                                }
                                            }
                                        });
                                        aVar2.setNegativeButton(R.string.lbl_no, new j(4));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else if (z15) {
                        int i24 = C1076b.f51789a[((NfcTransferCoroutineException) thB).getFailedType().ordinal()];
                        if (i24 == 1 || i24 == 2) {
                            br2.c.f19585a.e(bVar2.getView().getF52032a(), strI, new m(5));
                        } else if (i24 != 3) {
                            br2.c.f19585a.g(new m(7), bVar2.getView().getF52032a());
                        } else {
                            br2.c.f19585a.d(bVar2.getView().getF52032a(), strI, new m(6));
                        }
                    }
                } else {
                    String strI2 = a0.i(bVar2.f0().getDevice());
                    bVar2.f0().getDevice().getUnitID();
                    b.h0(bVar2, thB, strI2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailPresenter$onResume$1", f = "RabbitCardDetailPresenter.kt", l = {35, 38}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f51793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51794b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            b bVar2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51794b;
            b bVar3 = b.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    qq2.b view2 = bVar3.getView();
                    int i15 = vq2.e.f179461z0;
                    view2.S5(null, null);
                    this.f51793a = bVar3;
                    this.f51794b = 1;
                    obj = b.g0(bVar3, this);
                    if (obj != aVar) {
                        bVar = bVar3;
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    bVar = this.f51793a;
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar2 = this.f51793a;
                    r.b(obj);
                }
                bVar2.f51788d = ((Boolean) obj).booleanValue();
                bVar3.getView().Z7(a0.i(bVar3.f0().getDevice()), bVar3.f51788d);
                bVar3.getView().m1();
                bVar3.getView().hideProgressOverlay();
                return Unit.INSTANCE;
                bVar.f51787c = (pq2.b) obj;
                bVar3.getView().Z(bVar3.f51787c != null);
                IRabbitCardDetailModel iRabbitCardDetailModelF0 = bVar3.f0();
                this.f51793a = bVar3;
                this.f51794b = 2;
                obj = iRabbitCardDetailModelF0.q0(this);
                if (obj != aVar) {
                    bVar2 = bVar3;
                    bVar2.f51788d = ((Boolean) obj).booleanValue();
                    bVar3.getView().Z7(a0.i(bVar3.f0().getDevice()), bVar3.f51788d);
                    bVar3.getView().m1();
                    bVar3.getView().hideProgressOverlay();
                    return Unit.INSTANCE;
                }
                return aVar;
            } catch (IRabbitCardDetailModel.DeviceNotSupportException e4) {
                Logger logger = b.f51786e;
                StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(bVar3.f0().getDevice().getUnitID(), "Your ", a0.i(bVar3.f0().getDevice()), " (");
                sbJ.append(") doesn't support enable/disable card");
                logger.warn(sbJ.toString(), (Throwable) e4);
                bVar3.getView().T3();
            }
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f51786e = gt2.b.f79005a.h("RabbitCardDetailPresenter");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:13:0x002d, B:32:0x0087, B:34:0x008f, B:36:0x0095, B:18:0x0038, B:24:0x004e, B:28:0x0061, B:38:0x00a2, B:21:0x003f), top: B:42:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:13:0x002d, B:32:0x0087, B:34:0x008f, B:36:0x0095, B:18:0x0038, B:24:0x004e, B:28:0x0061, B:38:0x00a2, B:21:0x003f), top: B:42:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object g0(b bVar, v13.c cVar) {
        f fVar;
        String str;
        Intent intent;
        bVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f146085e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f146085e = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar, cVar);
            }
        } else {
            fVar = new f(bVar, cVar);
        }
        Object objZ = fVar.f146083c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f146085e;
        try {
            if (i15 == 0) {
                r.b(objZ);
                IRabbitCardDetailModel iRabbitCardDetailModelF0 = bVar.f0();
                fVar.f146085e = 1;
                objZ = iRabbitCardDetailModelF0.Z(fVar);
                if (objZ == aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                r.b(objZ);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                intent = fVar.f146082b;
                str = fVar.f146081a;
                r.b(objZ);
            }
            if (((Boolean) objZ).booleanValue()) {
                return new pq2.c(intent);
            }
            Uri uri = Uri.parse(str);
            uri.getClass();
            return new pq2.d(uri);
            oq2.a aVar2 = (oq2.a) objZ;
            String strA = aVar2.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME java.lang.String();
            String strB = aVar2.getUrlScheme();
            String strC = aVar2.getPlayStoreLink();
            if (strB != null && strA != null) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strB));
                intent2.setFlags(268435456);
                IRabbitCardDetailModel iRabbitCardDetailModelF1 = bVar.f0();
                fVar.f146081a = strC;
                fVar.f146082b = intent2;
                fVar.f146085e = 2;
                Object objU = iRabbitCardDetailModelF1.u(intent2, strA, fVar);
                if (objU != aVar) {
                    str = strC;
                    objZ = objU;
                    intent = intent2;
                    if (((Boolean) objZ).booleanValue()) {
                        return new pq2.c(intent);
                    }
                    Uri uri2 = Uri.parse(str);
                    uri2.getClass();
                    return new pq2.d(uri2);
                }
                return aVar;
            }
            Uri uri3 = Uri.parse(strC);
            uri3.getClass();
            return new pq2.d(uri3);
        } catch (Throwable th3) {
            f51786e.warn("An exception occurs during preparing the redirection, return null", th3);
            return null;
        }
    }

    public static final void h0(b bVar, Throwable th3, String str) {
        bVar.getClass();
        f51786e.error("showExpressTransitFailedDialog: error=", th3);
        boolean z14 = th3 instanceof ExpressCardSettingException;
        if (z14 && ((ExpressCardSettingException) th3).getType() == ExpressCardSettingException.a.DEVICE_IS_BUSY) {
            br2.c.f19585a.e(bVar.getView().getF52032a(), str, new m(2));
            return;
        }
        if (z14 && ((ExpressCardSettingException) th3).getType() == ExpressCardSettingException.a.DEVICE_NOT_CONNECTED) {
            br2.c.f19585a.d(bVar.getView().getF52032a(), str, new m(3));
            return;
        }
        if (z14 && ((ExpressCardSettingException) th3).getType() == ExpressCardSettingException.a.GENERAL_ERROR) {
            br2.c.f19585a.g(new m(4), bVar.getView().getF52032a());
        } else {
            qq2.b view2 = bVar.getView();
            int i14 = vq2.b.f179457y0;
            view2.J3(new b1(5));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // qq2.a
    public final void G() {
        hn2.c cVarM = getView().getF52032a();
        pq2.a aVar = new pq2.a("02-617-8383");
        cVarM.getClass();
        aVar.a(cVarM);
    }

    @Override // sy2.d
    public final void a0() {
        qq2.b view2 = getView();
        String strN0 = f0().n0();
        String strI = a0.i(f0().getDevice());
        String strT = u0.t(f0().getDevice());
        strT.getClass();
        view2.N6(strN0, strI, strT);
    }

    @Override // qq2.a
    public final void b0() {
        pq2.b bVar = this.f51787c;
        if (bVar != null) {
            hn2.c cVarM = getView().getF52032a();
            cVarM.getClass();
            bVar.a(cVarM);
        }
    }

    @Override // qq2.a
    public final void i() {
        gl.b.I(getView().getScope(), null, new c(null), 3);
    }

    @Override // qq2.a
    public final void onResume() {
        gl.b.I(getView().getScope(), null, new d(null), 3);
    }

    @Override // qq2.a
    public final void u() {
        Uri uri;
        if (s.g(Locale.getDefault().getLanguage(), "th")) {
            oq2.b.f133301a.getClass();
            uri = oq2.b.f133304d;
        } else {
            oq2.b.f133301a.getClass();
            uri = oq2.b.f133305e;
        }
        hn2.c cVarM = getView().getF52032a();
        pq2.d dVar = new pq2.d(uri);
        cVarM.getClass();
        dVar.a(cVarM);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
