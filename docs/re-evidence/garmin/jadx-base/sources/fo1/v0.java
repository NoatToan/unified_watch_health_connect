package fo1;

import android.content.Context;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.feed.activity.exception.DeletedActivityException;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.json.JSONException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$checkIfRefreshIsNeeded$1", f = "ConversationViewModel.kt", l = {711, 726, 733, 747, 766, ViewUtils.EDGE_TO_EDGE_FLAGS, 772}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wg0.a f72810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f72814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f72815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f72816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o0 f72817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f72818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f72819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f72820k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e23.l<go1.w, Unit> f72821l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$checkIfRefreshIsNeeded$1$2", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<go1.w, Unit> f72822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go1.w f72823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super go1.w, Unit> lVar, go1.w wVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f72822a = lVar;
            this.f72823b = wVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f72822a, this.f72823b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f72822a.invoke(this.f72823b);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72824a;

        static {
            int[] iArr = new int[am.c2.values().length];
            try {
                iArr[am.c2.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f72824a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(o0 o0Var, Context context, e23.a<Unit> aVar, long j8, e23.l<? super go1.w, Unit> lVar, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f72817h = o0Var;
        this.f72818i = context;
        this.f72819j = aVar;
        this.f72820k = j8;
        this.f72821l = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v0(this.f72817h, this.f72818i, this.f72819j, this.f72820k, this.f72821l, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0250  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:108:0x027b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0282  */
    /* JADX WARN: Code duplicated, block: B:111:0x0287  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:65:0x015e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x0165  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193 A[PHI: r1 r2 r3 r8 r10 r11
      0x0193: PHI (r1v13 boolean) = (r1v9 boolean), (r1v17 boolean) binds: [B:75:0x018f, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r2v2 java.lang.Object) = (r2v1 java.lang.Object), (r2v14 java.lang.Object) binds: [B:75:0x018f, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r3v10 long) = (r3v8 long), (r3v11 long) binds: [B:75:0x018f, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r8v4 int) = (r8v2 int), (r8v5 int) binds: [B:75:0x018f, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r10v13 int) = (r10v10 int), (r10v15 int) binds: [B:75:0x018f, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r11v11 int) = (r11v8 int), (r11v14 int) binds: [B:75:0x018f, B:10:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0199  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:98:0x0227  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0271, code lost:
    
        if (ge1.b.e0(r0, r9, r26) == r6) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws JSONException {
        wg0.a aVar;
        Integer num;
        int iIntValue;
        Object objG;
        int i14;
        int i15;
        String str;
        long j8;
        Object objI;
        int i16;
        int i17;
        wg0.a aVar2;
        am.l lVar;
        Object objM;
        int i18;
        long j14;
        DateTime dateTimeNow;
        boolean zB;
        Object objR;
        v2 v2Var;
        Object objD4;
        int i19;
        int i24;
        int i25;
        long j15;
        wg0.a aVar3;
        ArrayList arrayList;
        go1.w wVar;
        boolean z14;
        v2 v2Var2;
        Object objB4;
        long j16;
        int i26;
        int i27;
        int i28;
        wg0.a aVar4;
        go1.w wVar2;
        ArrayList arrayList2;
        u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
        int i29 = this.f72816g;
        e23.l<go1.w, Unit> lVar2 = this.f72821l;
        e23.a<Unit> aVar6 = this.f72819j;
        Context context = this.f72818i;
        int i30 = 1;
        o0 o0Var = this.f72817h;
        switch (i29) {
            case 0:
                o13.r.b(obj);
                am.c2 c2Var = o0Var.f72656c;
                if ((c2Var == null ? -1 : b.f72824a[c2Var.ordinal()]) == 1) {
                    Parcelable parcelable = o0Var.f72659f;
                    aVar = parcelable instanceof wg0.a ? (wg0.a) parcelable : null;
                    if (aVar != null && (num = aVar.f185045d) != null) {
                        iIntValue = num.intValue();
                        iz0.a aVarH4 = o0Var.H4();
                        this.f72810a = aVar;
                        this.f72811b = iIntValue;
                        this.f72816g = 1;
                        objG = aVarH4.g(context, iIntValue, this);
                        if (objG != aVar5) {
                            i14 = iIntValue;
                            boolean zBooleanValue = ((Boolean) objG).booleanValue();
                            i15 = !zBooleanValue ? 1 : 0;
                            if (!aVar.j() && (lVar = aVar.f185050i) != am.l.f4051g && ((lVar != am.l.f4050f || (!aVar.f185063x && zBooleanValue)) && (lVar != am.l.f4049e || zBooleanValue))) {
                                i30 = 0;
                            }
                            if (i30 == 0) {
                                aVar6.invoke();
                                return Unit.INSTANCE;
                            }
                            str = o0Var.f72657d;
                            if (str != null) {
                                return Unit.INSTANCE;
                            }
                            j8 = Long.parseLong(str);
                            iz0.a aVarH5 = o0Var.H4();
                            this.f72810a = aVar;
                            this.f72811b = i14;
                            this.f72812c = i15;
                            this.f72813d = i30;
                            this.f72814e = j8;
                            this.f72816g = 2;
                            objI = aVarH5.i(context, j8, this);
                            if (objI != aVar5) {
                                wg0.a aVar7 = aVar;
                                i16 = i30;
                                i17 = i14;
                                aVar2 = aVar7;
                                if (((Boolean) objI).booleanValue()) {
                                    aVar6.invoke();
                                    return Unit.INSTANCE;
                                }
                                int i34 = o0.H0;
                                iz0.a aVarH6 = o0Var.H4();
                                this.f72810a = aVar2;
                                this.f72811b = i17;
                                this.f72812c = i15;
                                this.f72813d = i16;
                                this.f72814e = j8;
                                this.f72816g = 3;
                                objM = aVarH6.m(context, this.f72820k, this);
                                if (objM != aVar5) {
                                    i18 = i17;
                                    j14 = j8;
                                    if (!((List) objM).contains(new Long(j14))) {
                                        return Unit.INSTANCE;
                                    }
                                    dateTimeNow = aVar2.f185048g;
                                    if (dateTimeNow == null) {
                                        dateTimeNow = DateTime.now();
                                    }
                                    dateTimeNow.getClass();
                                    zB = am.s1.b(dateTimeNow);
                                    if (zB) {
                                        return Unit.INSTANCE;
                                    }
                                    int i35 = o0.H0;
                                    iz0.a aVarH7 = o0Var.H4();
                                    this.f72810a = null;
                                    this.f72811b = i18;
                                    this.f72812c = i15;
                                    this.f72813d = i16;
                                    this.f72814e = j14;
                                    this.f72815f = zB;
                                    this.f72816g = 4;
                                    objR = aVarH7.r(context, j14, this);
                                    if (objR != aVar5) {
                                        v2Var = (v2) objR;
                                        if (v2Var instanceof v2.b) {
                                            if (!(v2Var instanceof v2.a)) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            if (((v2.a) v2Var).f47383a instanceof DeletedActivityException) {
                                                this.f72810a = null;
                                                this.f72811b = i18;
                                                this.f72812c = i15;
                                                this.f72813d = i16;
                                                this.f72814e = j14;
                                                this.f72815f = zB;
                                                this.f72816g = 5;
                                                int i36 = o0.H0;
                                                objD4 = o0Var.D4(j14, this);
                                                if (objD4 != aVar5) {
                                                    i19 = i18;
                                                    i24 = i15;
                                                    i25 = i16;
                                                    j15 = j14;
                                                    z14 = zB;
                                                    v2Var2 = (v2) objD4;
                                                    if (v2Var2 instanceof v2.b) {
                                                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) ((v2.b) v2Var2).f47386a;
                                                        am.c2 c2Var2 = o0Var.f72656c;
                                                        String str2 = o0Var.f72657d;
                                                        this.f72810a = null;
                                                        this.f72811b = i19;
                                                        this.f72812c = i24;
                                                        this.f72813d = i25;
                                                        this.f72814e = j15;
                                                        this.f72815f = z14;
                                                        this.f72816g = 6;
                                                        objB4 = o0Var.B4(this.f72818i, hVar, c2Var2, str2, this);
                                                        if (objB4 != aVar5) {
                                                            j16 = j15;
                                                            i26 = i25;
                                                            i27 = i24;
                                                            i28 = i19;
                                                            aVar4 = (wg0.a) objB4;
                                                            if (aVar4 != null) {
                                                                o0Var.f72659f = aVar4;
                                                            }
                                                            Parcelable parcelable2 = o0Var.f72659f;
                                                            arrayList2 = o0Var.f72673t;
                                                            wVar2 = new go1.w(0, false, null, parcelable2, null, 22, null);
                                                            if (!arrayList2.isEmpty()) {
                                                                arrayList2.set(0, wVar2);
                                                                x53.c cVar = o53.s0.f129406a;
                                                                o53.t1 t1Var = u53.o.f168762a;
                                                                a aVar8 = new a(lVar2, wVar2, null);
                                                                this.f72810a = null;
                                                                this.f72811b = i28;
                                                                this.f72812c = i27;
                                                                this.f72813d = i26;
                                                                this.f72814e = j16;
                                                                this.f72815f = z14;
                                                                this.f72816g = 7;
                                                            }
                                                        }
                                                    } else {
                                                        o0Var.f72666l.j(null);
                                                    }
                                                }
                                            } else {
                                                o0Var.f72666l.j(null);
                                            }
                                            break;
                                        } else {
                                            aVar3 = (wg0.a) ((v2.b) v2Var).f47386a;
                                            if (aVar3 == null) {
                                                o0Var.f72666l.j(null);
                                            } else {
                                                o0Var.f72659f = aVar3;
                                                arrayList = o0Var.f72673t;
                                                wVar = new go1.w(0, false, null, aVar3, null, 22, null);
                                                if (!arrayList.isEmpty()) {
                                                    arrayList.set(0, wVar);
                                                    lVar2.invoke(wVar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar5;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 1:
                iIntValue = this.f72811b;
                aVar = this.f72810a;
                o13.r.b(obj);
                objG = obj;
                i14 = iIntValue;
                boolean zBooleanValue2 = ((Boolean) objG).booleanValue();
                i15 = !zBooleanValue2 ? 1 : 0;
                if (!aVar.j()) {
                    i30 = 0;
                }
                if (i30 == 0) {
                    aVar6.invoke();
                    return Unit.INSTANCE;
                }
                str = o0Var.f72657d;
                if (str != null) {
                    return Unit.INSTANCE;
                }
                j8 = Long.parseLong(str);
                iz0.a aVarH8 = o0Var.H4();
                this.f72810a = aVar;
                this.f72811b = i14;
                this.f72812c = i15;
                this.f72813d = i30;
                this.f72814e = j8;
                this.f72816g = 2;
                objI = aVarH8.i(context, j8, this);
                if (objI != aVar5) {
                    wg0.a aVar9 = aVar;
                    i16 = i30;
                    i17 = i14;
                    aVar2 = aVar9;
                    if (((Boolean) objI).booleanValue()) {
                        aVar6.invoke();
                        return Unit.INSTANCE;
                    }
                    int i37 = o0.H0;
                    iz0.a aVarH9 = o0Var.H4();
                    this.f72810a = aVar2;
                    this.f72811b = i17;
                    this.f72812c = i15;
                    this.f72813d = i16;
                    this.f72814e = j8;
                    this.f72816g = 3;
                    objM = aVarH9.m(context, this.f72820k, this);
                    if (objM != aVar5) {
                        i18 = i17;
                        j14 = j8;
                        if (!((List) objM).contains(new Long(j14))) {
                            return Unit.INSTANCE;
                        }
                        dateTimeNow = aVar2.f185048g;
                        if (dateTimeNow == null) {
                            dateTimeNow = DateTime.now();
                        }
                        dateTimeNow.getClass();
                        zB = am.s1.b(dateTimeNow);
                        if (zB) {
                            return Unit.INSTANCE;
                        }
                        int i38 = o0.H0;
                        iz0.a aVarH10 = o0Var.H4();
                        this.f72810a = null;
                        this.f72811b = i18;
                        this.f72812c = i15;
                        this.f72813d = i16;
                        this.f72814e = j14;
                        this.f72815f = zB;
                        this.f72816g = 4;
                        objR = aVarH10.r(context, j14, this);
                        if (objR != aVar5) {
                            v2Var = (v2) objR;
                            if (v2Var instanceof v2.b) {
                                if (!(v2Var instanceof v2.a)) {
                                    lc.u0.r();
                                    return null;
                                }
                                if (((v2.a) v2Var).f47383a instanceof DeletedActivityException) {
                                    this.f72810a = null;
                                    this.f72811b = i18;
                                    this.f72812c = i15;
                                    this.f72813d = i16;
                                    this.f72814e = j14;
                                    this.f72815f = zB;
                                    this.f72816g = 5;
                                    int i39 = o0.H0;
                                    objD4 = o0Var.D4(j14, this);
                                    if (objD4 != aVar5) {
                                        i19 = i18;
                                        i24 = i15;
                                        i25 = i16;
                                        j15 = j14;
                                        z14 = zB;
                                        v2Var2 = (v2) objD4;
                                        if (v2Var2 instanceof v2.b) {
                                            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.h) ((v2.b) v2Var2).f47386a;
                                            am.c2 c2Var3 = o0Var.f72656c;
                                            String str3 = o0Var.f72657d;
                                            this.f72810a = null;
                                            this.f72811b = i19;
                                            this.f72812c = i24;
                                            this.f72813d = i25;
                                            this.f72814e = j15;
                                            this.f72815f = z14;
                                            this.f72816g = 6;
                                            objB4 = o0Var.B4(this.f72818i, hVar2, c2Var3, str3, this);
                                            if (objB4 != aVar5) {
                                                j16 = j15;
                                                i26 = i25;
                                                i27 = i24;
                                                i28 = i19;
                                                aVar4 = (wg0.a) objB4;
                                                if (aVar4 != null) {
                                                    o0Var.f72659f = aVar4;
                                                }
                                                Parcelable parcelable3 = o0Var.f72659f;
                                                arrayList2 = o0Var.f72673t;
                                                wVar2 = new go1.w(0, false, null, parcelable3, null, 22, null);
                                                if (!arrayList2.isEmpty()) {
                                                    arrayList2.set(0, wVar2);
                                                    x53.c cVar2 = o53.s0.f129406a;
                                                    o53.t1 t1Var2 = u53.o.f168762a;
                                                    a aVar10 = new a(lVar2, wVar2, null);
                                                    this.f72810a = null;
                                                    this.f72811b = i28;
                                                    this.f72812c = i27;
                                                    this.f72813d = i26;
                                                    this.f72814e = j16;
                                                    this.f72815f = z14;
                                                    this.f72816g = 7;
                                                }
                                            }
                                        } else {
                                            o0Var.f72666l.j(null);
                                        }
                                    }
                                } else {
                                    o0Var.f72666l.j(null);
                                }
                                break;
                            } else {
                                aVar3 = (wg0.a) ((v2.b) v2Var).f47386a;
                                if (aVar3 == null) {
                                    o0Var.f72666l.j(null);
                                } else {
                                    o0Var.f72659f = aVar3;
                                    arrayList = o0Var.f72673t;
                                    wVar = new go1.w(0, false, null, aVar3, null, 22, null);
                                    if (!arrayList.isEmpty()) {
                                        arrayList.set(0, wVar);
                                        lVar2.invoke(wVar);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar5;
            case 2:
                long j17 = this.f72814e;
                i16 = this.f72813d;
                i15 = this.f72812c;
                int i44 = this.f72811b;
                wg0.a aVar11 = this.f72810a;
                o13.r.b(obj);
                i17 = i44;
                aVar2 = aVar11;
                j8 = j17;
                objI = obj;
                if (((Boolean) objI).booleanValue()) {
                    aVar6.invoke();
                    return Unit.INSTANCE;
                }
                int i310 = o0.H0;
                iz0.a aVarH11 = o0Var.H4();
                this.f72810a = aVar2;
                this.f72811b = i17;
                this.f72812c = i15;
                this.f72813d = i16;
                this.f72814e = j8;
                this.f72816g = 3;
                objM = aVarH11.m(context, this.f72820k, this);
                if (objM != aVar5) {
                    i18 = i17;
                    j14 = j8;
                    if (!((List) objM).contains(new Long(j14))) {
                        return Unit.INSTANCE;
                    }
                    dateTimeNow = aVar2.f185048g;
                    if (dateTimeNow == null) {
                        dateTimeNow = DateTime.now();
                    }
                    dateTimeNow.getClass();
                    zB = am.s1.b(dateTimeNow);
                    if (zB) {
                        return Unit.INSTANCE;
                    }
                    int i311 = o0.H0;
                    iz0.a aVarH12 = o0Var.H4();
                    this.f72810a = null;
                    this.f72811b = i18;
                    this.f72812c = i15;
                    this.f72813d = i16;
                    this.f72814e = j14;
                    this.f72815f = zB;
                    this.f72816g = 4;
                    objR = aVarH12.r(context, j14, this);
                    if (objR != aVar5) {
                        v2Var = (v2) objR;
                        if (v2Var instanceof v2.b) {
                            if (!(v2Var instanceof v2.a)) {
                                lc.u0.r();
                                return null;
                            }
                            if (((v2.a) v2Var).f47383a instanceof DeletedActivityException) {
                                this.f72810a = null;
                                this.f72811b = i18;
                                this.f72812c = i15;
                                this.f72813d = i16;
                                this.f72814e = j14;
                                this.f72815f = zB;
                                this.f72816g = 5;
                                int i312 = o0.H0;
                                objD4 = o0Var.D4(j14, this);
                                if (objD4 != aVar5) {
                                    i19 = i18;
                                    i24 = i15;
                                    i25 = i16;
                                    j15 = j14;
                                    z14 = zB;
                                    v2Var2 = (v2) objD4;
                                    if (v2Var2 instanceof v2.b) {
                                        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = (com.garmin.android.apps.connectmobile.activities.newmodel.h) ((v2.b) v2Var2).f47386a;
                                        am.c2 c2Var4 = o0Var.f72656c;
                                        String str4 = o0Var.f72657d;
                                        this.f72810a = null;
                                        this.f72811b = i19;
                                        this.f72812c = i24;
                                        this.f72813d = i25;
                                        this.f72814e = j15;
                                        this.f72815f = z14;
                                        this.f72816g = 6;
                                        objB4 = o0Var.B4(this.f72818i, hVar3, c2Var4, str4, this);
                                        if (objB4 != aVar5) {
                                            j16 = j15;
                                            i26 = i25;
                                            i27 = i24;
                                            i28 = i19;
                                            aVar4 = (wg0.a) objB4;
                                            if (aVar4 != null) {
                                                o0Var.f72659f = aVar4;
                                            }
                                            Parcelable parcelable4 = o0Var.f72659f;
                                            arrayList2 = o0Var.f72673t;
                                            wVar2 = new go1.w(0, false, null, parcelable4, null, 22, null);
                                            if (!arrayList2.isEmpty()) {
                                                arrayList2.set(0, wVar2);
                                                x53.c cVar3 = o53.s0.f129406a;
                                                o53.t1 t1Var3 = u53.o.f168762a;
                                                a aVar12 = new a(lVar2, wVar2, null);
                                                this.f72810a = null;
                                                this.f72811b = i28;
                                                this.f72812c = i27;
                                                this.f72813d = i26;
                                                this.f72814e = j16;
                                                this.f72815f = z14;
                                                this.f72816g = 7;
                                            }
                                        }
                                    } else {
                                        o0Var.f72666l.j(null);
                                    }
                                }
                            } else {
                                o0Var.f72666l.j(null);
                            }
                            break;
                        } else {
                            aVar3 = (wg0.a) ((v2.b) v2Var).f47386a;
                            if (aVar3 == null) {
                                o0Var.f72666l.j(null);
                            } else {
                                o0Var.f72659f = aVar3;
                                arrayList = o0Var.f72673t;
                                wVar = new go1.w(0, false, null, aVar3, null, 22, null);
                                if (!arrayList.isEmpty()) {
                                    arrayList.set(0, wVar);
                                    lVar2.invoke(wVar);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar5;
            case 3:
                j14 = this.f72814e;
                int i45 = this.f72813d;
                int i46 = this.f72812c;
                int i47 = this.f72811b;
                aVar2 = this.f72810a;
                o13.r.b(obj);
                i18 = i47;
                i15 = i46;
                i16 = i45;
                objM = obj;
                if (!((List) objM).contains(new Long(j14))) {
                    return Unit.INSTANCE;
                }
                dateTimeNow = aVar2.f185048g;
                if (dateTimeNow == null) {
                    dateTimeNow = DateTime.now();
                }
                dateTimeNow.getClass();
                zB = am.s1.b(dateTimeNow);
                if (zB) {
                    return Unit.INSTANCE;
                }
                int i313 = o0.H0;
                iz0.a aVarH13 = o0Var.H4();
                this.f72810a = null;
                this.f72811b = i18;
                this.f72812c = i15;
                this.f72813d = i16;
                this.f72814e = j14;
                this.f72815f = zB;
                this.f72816g = 4;
                objR = aVarH13.r(context, j14, this);
                if (objR != aVar5) {
                    v2Var = (v2) objR;
                    if (v2Var instanceof v2.b) {
                        if (!(v2Var instanceof v2.a)) {
                            lc.u0.r();
                            return null;
                        }
                        if (((v2.a) v2Var).f47383a instanceof DeletedActivityException) {
                            this.f72810a = null;
                            this.f72811b = i18;
                            this.f72812c = i15;
                            this.f72813d = i16;
                            this.f72814e = j14;
                            this.f72815f = zB;
                            this.f72816g = 5;
                            int i314 = o0.H0;
                            objD4 = o0Var.D4(j14, this);
                            if (objD4 != aVar5) {
                                i19 = i18;
                                i24 = i15;
                                i25 = i16;
                                j15 = j14;
                                z14 = zB;
                                v2Var2 = (v2) objD4;
                                if (v2Var2 instanceof v2.b) {
                                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4 = (com.garmin.android.apps.connectmobile.activities.newmodel.h) ((v2.b) v2Var2).f47386a;
                                    am.c2 c2Var5 = o0Var.f72656c;
                                    String str5 = o0Var.f72657d;
                                    this.f72810a = null;
                                    this.f72811b = i19;
                                    this.f72812c = i24;
                                    this.f72813d = i25;
                                    this.f72814e = j15;
                                    this.f72815f = z14;
                                    this.f72816g = 6;
                                    objB4 = o0Var.B4(this.f72818i, hVar4, c2Var5, str5, this);
                                    if (objB4 != aVar5) {
                                        j16 = j15;
                                        i26 = i25;
                                        i27 = i24;
                                        i28 = i19;
                                        aVar4 = (wg0.a) objB4;
                                        if (aVar4 != null) {
                                            o0Var.f72659f = aVar4;
                                        }
                                        Parcelable parcelable5 = o0Var.f72659f;
                                        arrayList2 = o0Var.f72673t;
                                        wVar2 = new go1.w(0, false, null, parcelable5, null, 22, null);
                                        if (!arrayList2.isEmpty()) {
                                            arrayList2.set(0, wVar2);
                                            x53.c cVar4 = o53.s0.f129406a;
                                            o53.t1 t1Var4 = u53.o.f168762a;
                                            a aVar13 = new a(lVar2, wVar2, null);
                                            this.f72810a = null;
                                            this.f72811b = i28;
                                            this.f72812c = i27;
                                            this.f72813d = i26;
                                            this.f72814e = j16;
                                            this.f72815f = z14;
                                            this.f72816g = 7;
                                        }
                                    }
                                } else {
                                    o0Var.f72666l.j(null);
                                }
                            }
                        } else {
                            o0Var.f72666l.j(null);
                        }
                        break;
                    } else {
                        aVar3 = (wg0.a) ((v2.b) v2Var).f47386a;
                        if (aVar3 == null) {
                            o0Var.f72666l.j(null);
                        } else {
                            o0Var.f72659f = aVar3;
                            arrayList = o0Var.f72673t;
                            wVar = new go1.w(0, false, null, aVar3, null, 22, null);
                            if (!arrayList.isEmpty()) {
                                arrayList.set(0, wVar);
                                lVar2.invoke(wVar);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                return aVar5;
            case 4:
                zB = this.f72815f;
                long j18 = this.f72814e;
                int i48 = this.f72813d;
                int i49 = this.f72812c;
                int i54 = this.f72811b;
                o13.r.b(obj);
                i18 = i54;
                i15 = i49;
                i16 = i48;
                j14 = j18;
                objR = obj;
                v2Var = (v2) objR;
                if (v2Var instanceof v2.b) {
                    aVar3 = (wg0.a) ((v2.b) v2Var).f47386a;
                    if (aVar3 == null) {
                        o0Var.f72666l.j(null);
                    } else {
                        o0Var.f72659f = aVar3;
                        arrayList = o0Var.f72673t;
                        wVar = new go1.w(0, false, null, aVar3, null, 22, null);
                        if (!arrayList.isEmpty()) {
                            arrayList.set(0, wVar);
                            lVar2.invoke(wVar);
                        }
                    }
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        lc.u0.r();
                        return null;
                    }
                    if (((v2.a) v2Var).f47383a instanceof DeletedActivityException) {
                        this.f72810a = null;
                        this.f72811b = i18;
                        this.f72812c = i15;
                        this.f72813d = i16;
                        this.f72814e = j14;
                        this.f72815f = zB;
                        this.f72816g = 5;
                        int i315 = o0.H0;
                        objD4 = o0Var.D4(j14, this);
                        if (objD4 != aVar5) {
                            i19 = i18;
                            i24 = i15;
                            i25 = i16;
                            j15 = j14;
                            z14 = zB;
                            v2Var2 = (v2) objD4;
                            if (v2Var2 instanceof v2.b) {
                                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar5 = (com.garmin.android.apps.connectmobile.activities.newmodel.h) ((v2.b) v2Var2).f47386a;
                                am.c2 c2Var6 = o0Var.f72656c;
                                String str6 = o0Var.f72657d;
                                this.f72810a = null;
                                this.f72811b = i19;
                                this.f72812c = i24;
                                this.f72813d = i25;
                                this.f72814e = j15;
                                this.f72815f = z14;
                                this.f72816g = 6;
                                objB4 = o0Var.B4(this.f72818i, hVar5, c2Var6, str6, this);
                                if (objB4 != aVar5) {
                                    j16 = j15;
                                    i26 = i25;
                                    i27 = i24;
                                    i28 = i19;
                                    aVar4 = (wg0.a) objB4;
                                    if (aVar4 != null) {
                                        o0Var.f72659f = aVar4;
                                    }
                                    Parcelable parcelable6 = o0Var.f72659f;
                                    arrayList2 = o0Var.f72673t;
                                    wVar2 = new go1.w(0, false, null, parcelable6, null, 22, null);
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.set(0, wVar2);
                                        x53.c cVar5 = o53.s0.f129406a;
                                        o53.t1 t1Var5 = u53.o.f168762a;
                                        a aVar14 = new a(lVar2, wVar2, null);
                                        this.f72810a = null;
                                        this.f72811b = i28;
                                        this.f72812c = i27;
                                        this.f72813d = i26;
                                        this.f72814e = j16;
                                        this.f72815f = z14;
                                        this.f72816g = 7;
                                    }
                                }
                            } else {
                                o0Var.f72666l.j(null);
                            }
                            break;
                        }
                        return aVar5;
                    }
                    o0Var.f72666l.j(null);
                }
                return Unit.INSTANCE;
            case 5:
                zB = this.f72815f;
                long j19 = this.f72814e;
                int i55 = this.f72813d;
                int i56 = this.f72812c;
                int i57 = this.f72811b;
                o13.r.b(obj);
                i24 = i56;
                i19 = i57;
                j15 = j19;
                i25 = i55;
                objD4 = obj;
                z14 = zB;
                v2Var2 = (v2) objD4;
                if (v2Var2 instanceof v2.b) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar6 = (com.garmin.android.apps.connectmobile.activities.newmodel.h) ((v2.b) v2Var2).f47386a;
                    am.c2 c2Var7 = o0Var.f72656c;
                    String str7 = o0Var.f72657d;
                    this.f72810a = null;
                    this.f72811b = i19;
                    this.f72812c = i24;
                    this.f72813d = i25;
                    this.f72814e = j15;
                    this.f72815f = z14;
                    this.f72816g = 6;
                    objB4 = o0Var.B4(this.f72818i, hVar6, c2Var7, str7, this);
                    if (objB4 != aVar5) {
                        j16 = j15;
                        i26 = i25;
                        i27 = i24;
                        i28 = i19;
                        aVar4 = (wg0.a) objB4;
                        if (aVar4 != null) {
                            o0Var.f72659f = aVar4;
                        }
                        Parcelable parcelable7 = o0Var.f72659f;
                        arrayList2 = o0Var.f72673t;
                        wVar2 = new go1.w(0, false, null, parcelable7, null, 22, null);
                        if (!arrayList2.isEmpty()) {
                            arrayList2.set(0, wVar2);
                            x53.c cVar6 = o53.s0.f129406a;
                            o53.t1 t1Var6 = u53.o.f168762a;
                            a aVar15 = new a(lVar2, wVar2, null);
                            this.f72810a = null;
                            this.f72811b = i28;
                            this.f72812c = i27;
                            this.f72813d = i26;
                            this.f72814e = j16;
                            this.f72815f = z14;
                            this.f72816g = 7;
                        }
                        break;
                    }
                    return aVar5;
                }
                o0Var.f72666l.j(null);
                return Unit.INSTANCE;
            case 6:
                boolean z15 = this.f72815f;
                j16 = this.f72814e;
                i26 = this.f72813d;
                i27 = this.f72812c;
                i28 = this.f72811b;
                o13.r.b(obj);
                z14 = z15;
                objB4 = obj;
                aVar4 = (wg0.a) objB4;
                if (aVar4 != null) {
                    o0Var.f72659f = aVar4;
                }
                Parcelable parcelable8 = o0Var.f72659f;
                arrayList2 = o0Var.f72673t;
                wVar2 = new go1.w(0, false, null, parcelable8, null, 22, null);
                if (!arrayList2.isEmpty()) {
                    arrayList2.set(0, wVar2);
                    x53.c cVar7 = o53.s0.f129406a;
                    o53.t1 t1Var7 = u53.o.f168762a;
                    a aVar16 = new a(lVar2, wVar2, null);
                    this.f72810a = null;
                    this.f72811b = i28;
                    this.f72812c = i27;
                    this.f72813d = i26;
                    this.f72814e = j16;
                    this.f72815f = z14;
                    this.f72816g = 7;
                    break;
                }
                return Unit.INSTANCE;
            case 7:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
