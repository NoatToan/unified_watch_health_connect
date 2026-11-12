package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.DeviceRealTimeDataSource$initialize$2", f = "DeviceRealTimeDataSource.kt", l = {260, 261, 262, 263, 264, 265, 266}, m = "invokeSuspend", v = 2)
public final class a1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f33138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f33140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(y0 y0Var, t13.d<? super a1> dVar) {
        super(2, dVar);
        this.f33140c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a1(this.f33140c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        if (r5 == r0) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        y0 y0Var2;
        y0 y0Var3;
        y0 y0Var4;
        y0 y0Var5;
        y0 y0Var6;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33139b;
        y0 y0Var7 = this.f33140c;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                hd1.a aVar2 = y0Var7.f33396b;
                zy0.a aVar3 = zy0.a.REAL_TIME_FLOORS;
                this.f33138a = y0Var7;
                this.f33139b = 1;
                obj = aVar2.b(aVar3, hd1.y.class, this);
                if (obj != aVar) {
                    y0Var = y0Var7;
                    y0Var.f33400f = (hd1.y) obj;
                    hd1.a aVar4 = y0Var7.f33396b;
                    zy0.a aVar5 = zy0.a.REAL_TIME_STEPS;
                    this.f33138a = y0Var7;
                    this.f33139b = 2;
                    obj = aVar4.b(aVar5, hd1.i0.class, this);
                    if (obj != aVar) {
                        y0Var2 = y0Var7;
                        y0Var2.f33403i = (hd1.i0) obj;
                        hd1.a aVar6 = y0Var7.f33396b;
                        zy0.a aVar7 = zy0.a.REAL_TIME_PUSHES;
                        this.f33138a = y0Var7;
                        this.f33139b = 3;
                        obj = aVar6.b(aVar7, hd1.e0.class, this);
                        if (obj != aVar) {
                            y0Var3 = y0Var7;
                            y0Var3.f33404j = (hd1.e0) obj;
                            hd1.a aVar8 = y0Var7.f33396b;
                            zy0.a aVar9 = zy0.a.REAL_TIME_CALORIES;
                            this.f33138a = y0Var7;
                            this.f33139b = 4;
                            obj = aVar8.b(aVar9, hd1.o.class, this);
                            if (obj != aVar) {
                                y0Var4 = y0Var7;
                                y0Var4.f33399e = (hd1.o) obj;
                                hd1.a aVar10 = y0Var7.f33396b;
                                zy0.a aVar11 = zy0.a.REAL_TIME_RESPIRATION;
                                this.f33138a = y0Var7;
                                this.f33139b = 5;
                                obj = aVar10.b(aVar11, hd1.g0.class, this);
                                if (obj != aVar) {
                                    y0Var5 = y0Var7;
                                    y0Var5.f33406l = (hd1.g0) obj;
                                    hd1.a aVar12 = y0Var7.f33396b;
                                    zy0.a aVar13 = zy0.a.REAL_TIME_INTENSITY_MINUTES;
                                    this.f33138a = y0Var7;
                                    this.f33139b = 6;
                                    obj = aVar12.b(aVar13, hd1.c0.class, this);
                                    if (obj != aVar) {
                                        y0Var6 = y0Var7;
                                        y0Var6.f33402h = (hd1.c0) obj;
                                        hd1.a aVar14 = y0Var7.f33396b;
                                        zy0.a aVar15 = zy0.a.REAL_TIME_TRAINING_READINESS;
                                        this.f33138a = y0Var7;
                                        this.f33139b = 7;
                                        obj = aVar14.b(aVar15, hd1.k0.class, this);
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                y0Var = this.f33138a;
                o13.r.b(obj);
                y0Var.f33400f = (hd1.y) obj;
                hd1.a aVar16 = y0Var7.f33396b;
                zy0.a aVar17 = zy0.a.REAL_TIME_STEPS;
                this.f33138a = y0Var7;
                this.f33139b = 2;
                obj = aVar16.b(aVar17, hd1.i0.class, this);
                if (obj != aVar) {
                    y0Var2 = y0Var7;
                    y0Var2.f33403i = (hd1.i0) obj;
                    hd1.a aVar18 = y0Var7.f33396b;
                    zy0.a aVar19 = zy0.a.REAL_TIME_PUSHES;
                    this.f33138a = y0Var7;
                    this.f33139b = 3;
                    obj = aVar18.b(aVar19, hd1.e0.class, this);
                    if (obj != aVar) {
                        y0Var3 = y0Var7;
                        y0Var3.f33404j = (hd1.e0) obj;
                        hd1.a aVar20 = y0Var7.f33396b;
                        zy0.a aVar21 = zy0.a.REAL_TIME_CALORIES;
                        this.f33138a = y0Var7;
                        this.f33139b = 4;
                        obj = aVar20.b(aVar21, hd1.o.class, this);
                        if (obj != aVar) {
                            y0Var4 = y0Var7;
                            y0Var4.f33399e = (hd1.o) obj;
                            hd1.a aVar110 = y0Var7.f33396b;
                            zy0.a aVar111 = zy0.a.REAL_TIME_RESPIRATION;
                            this.f33138a = y0Var7;
                            this.f33139b = 5;
                            obj = aVar110.b(aVar111, hd1.g0.class, this);
                            if (obj != aVar) {
                                y0Var5 = y0Var7;
                                y0Var5.f33406l = (hd1.g0) obj;
                                hd1.a aVar112 = y0Var7.f33396b;
                                zy0.a aVar113 = zy0.a.REAL_TIME_INTENSITY_MINUTES;
                                this.f33138a = y0Var7;
                                this.f33139b = 6;
                                obj = aVar112.b(aVar113, hd1.c0.class, this);
                                if (obj != aVar) {
                                    y0Var6 = y0Var7;
                                    y0Var6.f33402h = (hd1.c0) obj;
                                    hd1.a aVar114 = y0Var7.f33396b;
                                    zy0.a aVar115 = zy0.a.REAL_TIME_TRAINING_READINESS;
                                    this.f33138a = y0Var7;
                                    this.f33139b = 7;
                                    obj = aVar114.b(aVar115, hd1.k0.class, this);
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                y0Var2 = this.f33138a;
                o13.r.b(obj);
                y0Var2.f33403i = (hd1.i0) obj;
                hd1.a aVar116 = y0Var7.f33396b;
                zy0.a aVar117 = zy0.a.REAL_TIME_PUSHES;
                this.f33138a = y0Var7;
                this.f33139b = 3;
                obj = aVar116.b(aVar117, hd1.e0.class, this);
                if (obj != aVar) {
                    y0Var3 = y0Var7;
                    y0Var3.f33404j = (hd1.e0) obj;
                    hd1.a aVar22 = y0Var7.f33396b;
                    zy0.a aVar23 = zy0.a.REAL_TIME_CALORIES;
                    this.f33138a = y0Var7;
                    this.f33139b = 4;
                    obj = aVar22.b(aVar23, hd1.o.class, this);
                    if (obj != aVar) {
                        y0Var4 = y0Var7;
                        y0Var4.f33399e = (hd1.o) obj;
                        hd1.a aVar118 = y0Var7.f33396b;
                        zy0.a aVar119 = zy0.a.REAL_TIME_RESPIRATION;
                        this.f33138a = y0Var7;
                        this.f33139b = 5;
                        obj = aVar118.b(aVar119, hd1.g0.class, this);
                        if (obj != aVar) {
                            y0Var5 = y0Var7;
                            y0Var5.f33406l = (hd1.g0) obj;
                            hd1.a aVar1110 = y0Var7.f33396b;
                            zy0.a aVar1111 = zy0.a.REAL_TIME_INTENSITY_MINUTES;
                            this.f33138a = y0Var7;
                            this.f33139b = 6;
                            obj = aVar1110.b(aVar1111, hd1.c0.class, this);
                            if (obj != aVar) {
                                y0Var6 = y0Var7;
                                y0Var6.f33402h = (hd1.c0) obj;
                                hd1.a aVar1112 = y0Var7.f33396b;
                                zy0.a aVar1113 = zy0.a.REAL_TIME_TRAINING_READINESS;
                                this.f33138a = y0Var7;
                                this.f33139b = 7;
                                obj = aVar1112.b(aVar1113, hd1.k0.class, this);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 3:
                y0Var3 = this.f33138a;
                o13.r.b(obj);
                y0Var3.f33404j = (hd1.e0) obj;
                hd1.a aVar24 = y0Var7.f33396b;
                zy0.a aVar25 = zy0.a.REAL_TIME_CALORIES;
                this.f33138a = y0Var7;
                this.f33139b = 4;
                obj = aVar24.b(aVar25, hd1.o.class, this);
                if (obj != aVar) {
                    y0Var4 = y0Var7;
                    y0Var4.f33399e = (hd1.o) obj;
                    hd1.a aVar1114 = y0Var7.f33396b;
                    zy0.a aVar1115 = zy0.a.REAL_TIME_RESPIRATION;
                    this.f33138a = y0Var7;
                    this.f33139b = 5;
                    obj = aVar1114.b(aVar1115, hd1.g0.class, this);
                    if (obj != aVar) {
                        y0Var5 = y0Var7;
                        y0Var5.f33406l = (hd1.g0) obj;
                        hd1.a aVar1116 = y0Var7.f33396b;
                        zy0.a aVar1117 = zy0.a.REAL_TIME_INTENSITY_MINUTES;
                        this.f33138a = y0Var7;
                        this.f33139b = 6;
                        obj = aVar1116.b(aVar1117, hd1.c0.class, this);
                        if (obj != aVar) {
                            y0Var6 = y0Var7;
                            y0Var6.f33402h = (hd1.c0) obj;
                            hd1.a aVar1118 = y0Var7.f33396b;
                            zy0.a aVar1119 = zy0.a.REAL_TIME_TRAINING_READINESS;
                            this.f33138a = y0Var7;
                            this.f33139b = 7;
                            obj = aVar1118.b(aVar1119, hd1.k0.class, this);
                        }
                    }
                    break;
                }
                return aVar;
            case 4:
                y0Var4 = this.f33138a;
                o13.r.b(obj);
                y0Var4.f33399e = (hd1.o) obj;
                hd1.a aVar11110 = y0Var7.f33396b;
                zy0.a aVar11111 = zy0.a.REAL_TIME_RESPIRATION;
                this.f33138a = y0Var7;
                this.f33139b = 5;
                obj = aVar11110.b(aVar11111, hd1.g0.class, this);
                if (obj != aVar) {
                    y0Var5 = y0Var7;
                    y0Var5.f33406l = (hd1.g0) obj;
                    hd1.a aVar11112 = y0Var7.f33396b;
                    zy0.a aVar11113 = zy0.a.REAL_TIME_INTENSITY_MINUTES;
                    this.f33138a = y0Var7;
                    this.f33139b = 6;
                    obj = aVar11112.b(aVar11113, hd1.c0.class, this);
                    if (obj != aVar) {
                        y0Var6 = y0Var7;
                        y0Var6.f33402h = (hd1.c0) obj;
                        hd1.a aVar11114 = y0Var7.f33396b;
                        zy0.a aVar11115 = zy0.a.REAL_TIME_TRAINING_READINESS;
                        this.f33138a = y0Var7;
                        this.f33139b = 7;
                        obj = aVar11114.b(aVar11115, hd1.k0.class, this);
                    }
                    break;
                }
                return aVar;
            case 5:
                y0Var5 = this.f33138a;
                o13.r.b(obj);
                y0Var5.f33406l = (hd1.g0) obj;
                hd1.a aVar11116 = y0Var7.f33396b;
                zy0.a aVar11117 = zy0.a.REAL_TIME_INTENSITY_MINUTES;
                this.f33138a = y0Var7;
                this.f33139b = 6;
                obj = aVar11116.b(aVar11117, hd1.c0.class, this);
                if (obj != aVar) {
                    y0Var6 = y0Var7;
                    y0Var6.f33402h = (hd1.c0) obj;
                    hd1.a aVar11118 = y0Var7.f33396b;
                    zy0.a aVar11119 = zy0.a.REAL_TIME_TRAINING_READINESS;
                    this.f33138a = y0Var7;
                    this.f33139b = 7;
                    obj = aVar11118.b(aVar11119, hd1.k0.class, this);
                    break;
                }
                return aVar;
            case 6:
                y0Var6 = this.f33138a;
                o13.r.b(obj);
                y0Var6.f33402h = (hd1.c0) obj;
                hd1.a aVar111110 = y0Var7.f33396b;
                zy0.a aVar111111 = zy0.a.REAL_TIME_TRAINING_READINESS;
                this.f33138a = y0Var7;
                this.f33139b = 7;
                obj = aVar111110.b(aVar111111, hd1.k0.class, this);
                break;
            case 7:
                y0Var7 = this.f33138a;
                o13.r.b(obj);
                y0Var7.f33405k = (hd1.k0) obj;
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
