package com.garmin.feature.garminpay.providers.gpay.ecom;

import ds0.g;
import e23.p;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity$validateInitializationState$1", f = "EcomMainActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EcomMainActivity f51140a;

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.ecom.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1055a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51141a;

        static {
            int[] iArr = new int[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.values().length];
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.UNDER_MAINTENANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51141a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EcomMainActivity ecomMainActivity, d<? super a> dVar) {
        super(2, dVar);
        this.f51140a = ecomMainActivity;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f51140a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        EcomMainActivity.f51134l.debug("validateInitializationState");
        EcomMainActivity ecomMainActivity = this.f51140a;
        t tVar = ecomMainActivity.f51135g;
        t tVar2 = ecomMainActivity.f51136h;
        z0 z0Var = (z0) tVar.getValue();
        if (z0Var == null || z0Var.f205983e) {
            EcomMainActivity.ca(ecomMainActivity);
        } else {
            ((com.garmin.feature.garminpay.providers.gpay.ui.common.a) tVar2.getValue()).x4();
            ((com.garmin.feature.garminpay.providers.gpay.ui.common.a) tVar2.getValue()).f51575b.f(ecomMainActivity, new EcomMainActivity.b(new g(ecomMainActivity, 10)));
        }
        return Unit.INSTANCE;
    }
}
