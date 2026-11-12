package com.garmin.feature.garminpay.providers.gpay.alipay;

import androidx.lifecycle.i0;
import bo2.f;
import bo2.g;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import w2.a0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity$onBTStateReady$1", f = "AlipayAppletInstallationActivity.kt", l = {153, ModuleDescriptor.MODULE_VERSION, 157, 159, 162}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f51108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlipayAppletInstallationActivity f51109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f51112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AlipayAppletInstallationActivity f51113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AlipayAppletInstallationActivity alipayAppletInstallationActivity, d<? super a> dVar) {
        super(2, dVar);
        this.f51113f = alipayAppletInstallationActivity;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        a aVar = new a(this.f51113f, dVar);
        aVar.f51112e = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:53:0x0131, B:18:0x0045, B:47:0x0101, B:50:0x012c, B:21:0x0054, B:40:0x00d0, B:43:0x00fb, B:24:0x0063, B:34:0x009f, B:37:0x00ca, B:27:0x006a, B:30:0x0097), top: B:77:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:53:0x0131, B:18:0x0045, B:47:0x0101, B:50:0x012c, B:21:0x0054, B:40:0x00d0, B:43:0x00fb, B:24:0x0063, B:34:0x009f, B:37:0x00ca, B:27:0x006a, B:30:0x0097), top: B:77:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0131 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0032, B:53:0x0131, B:18:0x0045, B:47:0x0101, B:50:0x012c, B:21:0x0054, B:40:0x00d0, B:43:0x00fb, B:24:0x0063, B:34:0x009f, B:37:0x00ca, B:27:0x006a, B:30:0x0097), top: B:77:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x016d  */
    /* JADX WARN: Code duplicated, block: B:65:0x018e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x020f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0213  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object objD4;
        Object obj2;
        AlipayAppletInstallationActivity alipayAppletInstallationActivity;
        Throwable thB;
        androidx.appcompat.app.e eVarQ;
        int i14;
        AlipayAppletInstallationActivity alipayAppletInstallationActivity2;
        Object objE0;
        AlipayAppletInstallationActivity alipayAppletInstallationActivity3;
        Object objE1;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f51111d;
        AlipayAppletInstallationActivity alipayAppletInstallationActivity4 = this.f51113f;
        try {
            if (i15 == 0) {
                r.b(obj);
                int i16 = q.f128596b;
                AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("checkAvailableSpace");
                bo2.e eVarEa = alipayAppletInstallationActivity4.ea();
                this.f51112e = null;
                this.f51108a = alipayAppletInstallationActivity4;
                this.f51109b = null;
                this.f51110c = 0;
                this.f51111d = 1;
                x53.c cVar = s0.f129406a;
                Object objE2 = ge1.b.e0(x53.b.f189152a, new f(eVarEa, null), this);
                if (objE2 != aVar) {
                    objE2 = Unit.INSTANCE;
                }
                if (objE2 != aVar) {
                    i14 = 0;
                    alipayAppletInstallationActivity2 = alipayAppletInstallationActivity4;
                }
                return aVar;
            }
            if (i15 == 1) {
                i14 = this.f51110c;
                alipayAppletInstallationActivity2 = (AlipayAppletInstallationActivity) this.f51108a;
                r.b(obj);
            } else {
                if (i15 == 2) {
                    i14 = this.f51110c;
                    alipayAppletInstallationActivity2 = (AlipayAppletInstallationActivity) this.f51108a;
                    r.b(obj);
                    AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("createOwnerData");
                    bo2.e eVarEa2 = alipayAppletInstallationActivity2.ea();
                    this.f51112e = null;
                    this.f51108a = alipayAppletInstallationActivity2;
                    this.f51109b = null;
                    this.f51110c = i14;
                    this.f51111d = 3;
                    x53.c cVar2 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new bo2.i(eVarEa2, null), this);
                    if (objE0 == aVar) {
                        objE0 = Unit.INSTANCE;
                    }
                    if (objE0 == aVar) {
                        alipayAppletInstallationActivity3 = alipayAppletInstallationActivity2;
                        AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("checkFitPayAccountRequiredAndCreateIfNeeded");
                        bo2.e eVarEa3 = alipayAppletInstallationActivity3.ea();
                        this.f51112e = null;
                        this.f51108a = null;
                        this.f51109b = null;
                        this.f51110c = i14;
                        this.f51111d = 4;
                        x53.c cVar3 = s0.f129406a;
                        objE1 = ge1.b.e0(x53.b.f189152a, new g(eVarEa3, null), this);
                        if (objE1 != aVar) {
                            objE1 = Unit.INSTANCE;
                        }
                        if (objE1 != aVar) {
                            bVar = Unit.INSTANCE;
                            int i17 = q.f128596b;
                            if (!(bVar instanceof q.b)) {
                                hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                                AlipayAppletInstallationActivity.a aVar2 = AlipayAppletInstallationActivity.f51097j;
                                bo2.e eVarEa4 = alipayAppletInstallationActivity4.ea();
                                this.f51112e = null;
                                this.f51108a = bVar;
                                this.f51109b = alipayAppletInstallationActivity4;
                                this.f51110c = 0;
                                this.f51111d = 5;
                                objD4 = eVarEa4.D4(this);
                                if (objD4 != aVar) {
                                    obj2 = bVar;
                                    obj = objD4;
                                    alipayAppletInstallationActivity = alipayAppletInstallationActivity4;
                                }
                            }
                            thB = q.b(bVar);
                            if (thB != null) {
                                hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                                AlipayAppletInstallationActivity.f51097j.f51101a.a().error("Something wrong..leaving Alipay applet installation", thB);
                                alipayAppletInstallationActivity4.ea().E4(hs2.f.AlipayAppletInstallationFailed);
                                if (thB instanceof AlipayAppletNoSESpaceException) {
                                    br2.c cVar4 = br2.c.f19585a;
                                    String string = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_title);
                                    string.getClass();
                                    String string2 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_description, a0.i(alipayAppletInstallationActivity4.ea().A4()));
                                    string2.getClass();
                                    String string3 = alipayAppletInstallationActivity4.getString(R.string.lbl_ok);
                                    string3.getClass();
                                    eVarQ = br2.c.q(cVar4, alipayAppletInstallationActivity4, string, string2, new o13.p(string3, new bo2.b(alipayAppletInstallationActivity4, 1)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                    if (eVarQ != null) {
                                        eVarQ.show();
                                    }
                                } else {
                                    AlipayAppletInstallationActivity.da(alipayAppletInstallationActivity4);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar;
                }
                if (i15 == 3) {
                    i14 = this.f51110c;
                    alipayAppletInstallationActivity3 = (AlipayAppletInstallationActivity) this.f51108a;
                    r.b(obj);
                    AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("checkFitPayAccountRequiredAndCreateIfNeeded");
                    bo2.e eVarEa5 = alipayAppletInstallationActivity3.ea();
                    this.f51112e = null;
                    this.f51108a = null;
                    this.f51109b = null;
                    this.f51110c = i14;
                    this.f51111d = 4;
                    x53.c cVar5 = s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new g(eVarEa5, null), this);
                    if (objE1 != aVar) {
                        objE1 = Unit.INSTANCE;
                    }
                    if (objE1 != aVar) {
                        bVar = Unit.INSTANCE;
                        int i18 = q.f128596b;
                        if (!(bVar instanceof q.b)) {
                            hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                            AlipayAppletInstallationActivity.a aVar3 = AlipayAppletInstallationActivity.f51097j;
                            bo2.e eVarEa6 = alipayAppletInstallationActivity4.ea();
                            this.f51112e = null;
                            this.f51108a = bVar;
                            this.f51109b = alipayAppletInstallationActivity4;
                            this.f51110c = 0;
                            this.f51111d = 5;
                            objD4 = eVarEa6.D4(this);
                            if (objD4 != aVar) {
                                obj2 = bVar;
                                obj = objD4;
                                alipayAppletInstallationActivity = alipayAppletInstallationActivity4;
                            }
                        }
                        thB = q.b(bVar);
                        if (thB != null) {
                            hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                            AlipayAppletInstallationActivity.f51097j.f51101a.a().error("Something wrong..leaving Alipay applet installation", thB);
                            alipayAppletInstallationActivity4.ea().E4(hs2.f.AlipayAppletInstallationFailed);
                            if (thB instanceof AlipayAppletNoSESpaceException) {
                                br2.c cVar6 = br2.c.f19585a;
                                String string4 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_title);
                                string4.getClass();
                                String string5 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_description, a0.i(alipayAppletInstallationActivity4.ea().A4()));
                                string5.getClass();
                                String string6 = alipayAppletInstallationActivity4.getString(R.string.lbl_ok);
                                string6.getClass();
                                eVarQ = br2.c.q(cVar6, alipayAppletInstallationActivity4, string4, string5, new o13.p(string6, new bo2.b(alipayAppletInstallationActivity4, 1)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                if (eVarQ != null) {
                                    eVarQ.show();
                                }
                            } else {
                                AlipayAppletInstallationActivity.da(alipayAppletInstallationActivity4);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar;
                }
                if (i15 == 4) {
                    r.b(obj);
                    bVar = Unit.INSTANCE;
                    int i19 = q.f128596b;
                    if (!(bVar instanceof q.b)) {
                        hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                        AlipayAppletInstallationActivity.a aVar4 = AlipayAppletInstallationActivity.f51097j;
                        bo2.e eVarEa7 = alipayAppletInstallationActivity4.ea();
                        this.f51112e = null;
                        this.f51108a = bVar;
                        this.f51109b = alipayAppletInstallationActivity4;
                        this.f51110c = 0;
                        this.f51111d = 5;
                        objD4 = eVarEa7.D4(this);
                        if (objD4 != aVar) {
                            obj2 = bVar;
                            obj = objD4;
                            alipayAppletInstallationActivity = alipayAppletInstallationActivity4;
                        }
                        return aVar;
                    }
                    thB = q.b(bVar);
                    if (thB != null) {
                        hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                        AlipayAppletInstallationActivity.f51097j.f51101a.a().error("Something wrong..leaving Alipay applet installation", thB);
                        alipayAppletInstallationActivity4.ea().E4(hs2.f.AlipayAppletInstallationFailed);
                        if (thB instanceof AlipayAppletNoSESpaceException) {
                            br2.c cVar7 = br2.c.f19585a;
                            String string7 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_title);
                            string7.getClass();
                            String string8 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_description, a0.i(alipayAppletInstallationActivity4.ea().A4()));
                            string8.getClass();
                            String string9 = alipayAppletInstallationActivity4.getString(R.string.lbl_ok);
                            string9.getClass();
                            eVarQ = br2.c.q(cVar7, alipayAppletInstallationActivity4, string7, string8, new o13.p(string9, new bo2.b(alipayAppletInstallationActivity4, 1)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            if (eVarQ != null) {
                                eVarQ.show();
                            }
                        } else {
                            AlipayAppletInstallationActivity.da(alipayAppletInstallationActivity4);
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 5) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                alipayAppletInstallationActivity = this.f51109b;
                obj2 = this.f51108a;
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("navigateToDeviceOnBoarding");
                alipayAppletInstallationActivity.getClass();
                i0 i0VarW = f0.w(alipayAppletInstallationActivity);
                x53.c cVar8 = s0.f129406a;
                gl.b.I(i0VarW, x53.b.f189152a, new bo2.c(alipayAppletInstallationActivity, null), 2);
            } else {
                AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("onDeviceOnboardFinished");
                AlipayAppletInstallationActivity.ca(alipayAppletInstallationActivity, new f.a(-1, null));
            }
            bVar = obj2;
            thB = q.b(bVar);
            if (thB != null) {
                hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                AlipayAppletInstallationActivity.f51097j.f51101a.a().error("Something wrong..leaving Alipay applet installation", thB);
                alipayAppletInstallationActivity4.ea().E4(hs2.f.AlipayAppletInstallationFailed);
                if (thB instanceof AlipayAppletNoSESpaceException) {
                    br2.c cVar9 = br2.c.f19585a;
                    String string10 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_title);
                    string10.getClass();
                    String string11 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_description, a0.i(alipayAppletInstallationActivity4.ea().A4()));
                    string11.getClass();
                    String string12 = alipayAppletInstallationActivity4.getString(R.string.lbl_ok);
                    string12.getClass();
                    eVarQ = br2.c.q(cVar9, alipayAppletInstallationActivity4, string10, string11, new o13.p(string12, new bo2.b(alipayAppletInstallationActivity4, 1)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ != null) {
                        eVarQ.show();
                    }
                } else {
                    AlipayAppletInstallationActivity.da(alipayAppletInstallationActivity4);
                }
            }
            return Unit.INSTANCE;
            AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("checkProviderStatusAndSetupIfNeeded");
            bo2.e eVarEa8 = alipayAppletInstallationActivity2.ea();
            this.f51112e = null;
            this.f51108a = alipayAppletInstallationActivity2;
            this.f51109b = null;
            this.f51110c = i14;
            this.f51111d = 2;
            x53.c cVar10 = s0.f129406a;
            Object objE3 = ge1.b.e0(x53.b.f189152a, new bo2.h(eVarEa8, null), this);
            if (objE3 != aVar) {
                objE3 = Unit.INSTANCE;
            }
            if (objE3 != aVar) {
                AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("createOwnerData");
                bo2.e eVarEa9 = alipayAppletInstallationActivity2.ea();
                this.f51112e = null;
                this.f51108a = alipayAppletInstallationActivity2;
                this.f51109b = null;
                this.f51110c = i14;
                this.f51111d = 3;
                x53.c cVar11 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new bo2.i(eVarEa9, null), this);
                if (objE0 == aVar) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == aVar) {
                    alipayAppletInstallationActivity3 = alipayAppletInstallationActivity2;
                    AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("checkFitPayAccountRequiredAndCreateIfNeeded");
                    bo2.e eVarEa10 = alipayAppletInstallationActivity3.ea();
                    this.f51112e = null;
                    this.f51108a = null;
                    this.f51109b = null;
                    this.f51110c = i14;
                    this.f51111d = 4;
                    x53.c cVar12 = s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new g(eVarEa10, null), this);
                    if (objE1 != aVar) {
                        objE1 = Unit.INSTANCE;
                    }
                    if (objE1 != aVar) {
                        bVar = Unit.INSTANCE;
                        int i110 = q.f128596b;
                        if (!(bVar instanceof q.b)) {
                            hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                            AlipayAppletInstallationActivity.a aVar5 = AlipayAppletInstallationActivity.f51097j;
                            bo2.e eVarEa11 = alipayAppletInstallationActivity4.ea();
                            this.f51112e = null;
                            this.f51108a = bVar;
                            this.f51109b = alipayAppletInstallationActivity4;
                            this.f51110c = 0;
                            this.f51111d = 5;
                            objD4 = eVarEa11.D4(this);
                            if (objD4 != aVar) {
                                obj2 = bVar;
                                obj = objD4;
                                alipayAppletInstallationActivity = alipayAppletInstallationActivity4;
                                if (((Boolean) obj).booleanValue()) {
                                    AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("navigateToDeviceOnBoarding");
                                    alipayAppletInstallationActivity.getClass();
                                    i0 i0VarW2 = f0.w(alipayAppletInstallationActivity);
                                    x53.c cVar13 = s0.f129406a;
                                    gl.b.I(i0VarW2, x53.b.f189152a, new bo2.c(alipayAppletInstallationActivity, null), 2);
                                } else {
                                    AlipayAppletInstallationActivity.f51097j.f51101a.a().trace("onDeviceOnboardFinished");
                                    AlipayAppletInstallationActivity.ca(alipayAppletInstallationActivity, new f.a(-1, null));
                                }
                                bVar = obj2;
                            }
                        }
                        thB = q.b(bVar);
                        if (thB != null) {
                            hn2.c.ba(alipayAppletInstallationActivity4, Boolean.FALSE, null, null, 14);
                            AlipayAppletInstallationActivity.f51097j.f51101a.a().error("Something wrong..leaving Alipay applet installation", thB);
                            alipayAppletInstallationActivity4.ea().E4(hs2.f.AlipayAppletInstallationFailed);
                            if (thB instanceof AlipayAppletNoSESpaceException) {
                                br2.c cVar14 = br2.c.f19585a;
                                String string13 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_title);
                                string13.getClass();
                                String string14 = alipayAppletInstallationActivity4.getString(R.string.common_se_memory_full_description, a0.i(alipayAppletInstallationActivity4.ea().A4()));
                                string14.getClass();
                                String string15 = alipayAppletInstallationActivity4.getString(R.string.lbl_ok);
                                string15.getClass();
                                eVarQ = br2.c.q(cVar14, alipayAppletInstallationActivity4, string13, string14, new o13.p(string15, new bo2.b(alipayAppletInstallationActivity4, 1)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                                if (eVarQ != null) {
                                    eVarQ.show();
                                }
                            } else {
                                AlipayAppletInstallationActivity.da(alipayAppletInstallationActivity4);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        } catch (Throwable th3) {
            int i24 = q.f128596b;
            bVar = new q.b(th3);
        }
        return aVar;
    }
}
