package lx0;

import c22.j0;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import o13.r;
import o53.b0;
import o53.l1;
import o53.s;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ww0.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupViewModel$postSetupResults$1", f = "MCTSetupViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f115204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserSettingsDTO f115205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f115206d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupViewModel$postSetupResults$1$1", f = "MCTSetupViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS, 157}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f115208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f115209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ UserSettingsDTO f115210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ JSONObject f115211e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f115209c = kVar;
            this.f115210d = userSettingsDTO;
            this.f115211e = jSONObject;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f115209c, this.f115210d, this.f115211e, dVar);
            aVar.f115208b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00ae A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0018, B:33:0x0113, B:34:0x0124, B:12:0x0028, B:23:0x0075, B:24:0x0077, B:26:0x00ae, B:28:0x00b4, B:30:0x00b8, B:15:0x0031, B:17:0x0053, B:18:0x0058, B:20:0x0069), top: B:39:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b8 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0018, B:33:0x0113, B:34:0x0124, B:12:0x0028, B:23:0x0075, B:24:0x0077, B:26:0x00ae, B:28:0x00b4, B:30:0x00b8, B:15:0x0031, B:17:0x0053, B:18:0x0058, B:20:0x0069), top: B:39:0x0012 }] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
        
            if (r0.a(r10, r16) == r2) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objC;
            u uVar;
            ww0.a menstrualCycleType;
            b0 b0Var = (b0) this.f115208b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f115207a;
            UserSettingsDTO userSettingsDTO = this.f115210d;
            k kVar = this.f115209c;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        objC = obj;
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    kVar.f115199o.j(new cx0.a<>(null, null, null, false, 12, null));
                    kVar.f115199o.j(new cx0.a<>(null, null, null, false, 12, null));
                    return Unit.INSTANCE;
                }
                r.b(obj);
                t13.g.a aVar2 = b0Var.getF136462d().get(l1.f129368i0);
                aVar2.getClass();
                kVar.f115187c = new s((l1) aVar2);
                ax0.a aVar3 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                JSONObject jSONObject = this.f115211e;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                kVar.f115188d = new Long(aVar3.a(userSettingsDTO, jSONObject, kVar.f115189e));
                s sVar = kVar.f115187c;
                if (sVar == null) {
                    i52.a aVar4 = i52.a.f91796a;
                    ww0.a aVar5 = kVar.f115190f;
                    aVar4.getClass();
                    i52.a.t(aVar5);
                    ww0.i iVar = kVar.f115194j;
                    iVar.getClass();
                    f12.l.a aVar6 = f12.l.f68084a;
                    aVar6.getClass();
                    f12.l.a.a().R1(iVar);
                    int i15 = kVar.f115192h;
                    aVar6.getClass();
                    f12.l.a.a().r1(i15);
                    int i16 = kVar.f115193i;
                    aVar6.getClass();
                    f12.l.a.a().t3(i16);
                    uVar = userSettingsDTO.f43527e;
                    if (uVar != null) {
                        menstrualCycleType = uVar.getMenstrualCycleType();
                    } else {
                        menstrualCycleType = null;
                    }
                    if (menstrualCycleType != ww0.a.NONE) {
                        LocalDate localDateFromDateFields = LocalDate.fromDateFields(kVar.f115191g);
                        xw0.b bVar = new xw0.b(new Long(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), localDateFromDateFields.toString("yyyy-MM-dd"), new Long(kVar.f115192h), new Long(Math.max(kVar.f115193i, Days.daysBetween(localDateFromDateFields, LocalDate.now()).getDays() + 1)), LocalDateTime.now().toString(j0.f23101c));
                        yw0.a aVar7 = kVar.f115185a;
                        this.f115208b = null;
                        this.f115207a = 2;
                    }
                    kVar.f115199o.j(new cx0.a<>(null, null, null, false, 12, null));
                    return Unit.INSTANCE;
                }
                this.f115208b = null;
                this.f115207a = 1;
                objC = sVar.C(this);
                if (objC == aVar) {
                }
                return aVar;
                i52.a aVar8 = i52.a.f91796a;
                ww0.a aVar9 = kVar.f115190f;
                aVar8.getClass();
                i52.a.t(aVar9);
                ww0.i iVar2 = kVar.f115194j;
                iVar2.getClass();
                f12.l.a aVar10 = f12.l.f68084a;
                aVar10.getClass();
                f12.l.a.a().R1(iVar2);
                int i17 = kVar.f115192h;
                aVar10.getClass();
                f12.l.a.a().r1(i17);
                int i18 = kVar.f115193i;
                aVar10.getClass();
                f12.l.a.a().t3(i18);
                uVar = userSettingsDTO.f43527e;
                if (uVar != null) {
                    menstrualCycleType = uVar.getMenstrualCycleType();
                } else {
                    menstrualCycleType = null;
                }
                if (menstrualCycleType != ww0.a.NONE) {
                    LocalDate localDateFromDateFields2 = LocalDate.fromDateFields(kVar.f115191g);
                    xw0.b bVar2 = new xw0.b(new Long(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), localDateFromDateFields2.toString("yyyy-MM-dd"), new Long(kVar.f115192h), new Long(Math.max(kVar.f115193i, Days.daysBetween(localDateFromDateFields2, LocalDate.now()).getDays() + 1)), LocalDateTime.now().toString(j0.f23101c));
                    yw0.a aVar11 = kVar.f115185a;
                    this.f115208b = null;
                    this.f115207a = 2;
                }
                kVar.f115199o.j(new cx0.a<>(null, null, null, false, 12, null));
            } catch (Exception e4) {
                kVar.f115199o.j(new cx0.a<>(null, e4, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f115204b = kVar;
        this.f115205c = userSettingsDTO;
        this.f115206d = jSONObject;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f115204b, this.f115205c, this.f115206d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115203a;
        k kVar = this.f115204b;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(kVar, this.f115205c, this.f115206d, null);
            this.f115203a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        kVar.f115200p.j(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
