package com.garmin.android.lib.networking.authentication.gcapi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import d53.w;
import dd2.c;
import e23.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import tn.k;
import ue.f;
import ue.v;
import ue.x;
import v.h;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.android.lib.networking.authentication.gcapi.GCSaveUserTimezoneWorker$Companion$enqueue$2", f = "GCSaveUserTimezoneWorker.kt", l = {}, m = "invokeSuspend")
public final class a extends i implements p<b0, d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f50070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f50071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f50072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f50073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f50074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f50075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, String str4, c cVar, Context context, d<? super a> dVar) {
        super(2, dVar);
        this.f50070a = str;
        this.f50071b = str2;
        this.f50072c = str3;
        this.f50073d = str4;
        this.f50074e = cVar;
        this.f50075f = context;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f50070a, this.f50071b, this.f50072c, this.f50073d, this.f50074e, this.f50075f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Boolean> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ArrayList arrayListX = h.x(obj);
        arrayListX.add(new o13.p("URL", k.g(this.f50070a, "/userprofile-service/userprofile/timezone/")));
        arrayListX.add(new o13.p("SHORT_USER_AGENT", this.f50071b));
        com.nimbusds.jose.shaded.gson.internal.a.u("USER_AGENT", this.f50072c, arrayListX);
        String str = this.f50073d;
        if (str == null || w.J(str)) {
            c cVar = this.f50074e;
            cVar.getClass();
            com.nimbusds.jose.shaded.gson.internal.a.u("OAUTH1_CONSUMER_KEY", cVar.f59214c, arrayListX);
            com.nimbusds.jose.shaded.gson.internal.a.u("OAUTH1_CONSUMER_SECRET", cVar.f59215d, arrayListX);
            com.nimbusds.jose.shaded.gson.internal.a.u("OAUTH1_USER_TOKEN", cVar.f59212a, arrayListX);
            com.nimbusds.jose.shaded.gson.internal.a.u("OAUTH1_USER_SECRET", cVar.f59213b, arrayListX);
        } else {
            com.nimbusds.jose.shaded.gson.internal.a.u("OAUTH2_DI_ACCESS_TOKEN", str, arrayListX);
        }
        x.a aVar2 = new x.a((Class<? extends androidx.work.d>) GCSaveUserTimezoneWorker.class);
        f.a aVar3 = new f.a();
        aVar3.b(v.CONNECTED);
        aVar2.f170098c.f26950j = aVar3.a();
        x.a aVarD = aVar2.d(ue.a.EXPONENTIAL, 30000L, TimeUnit.MILLISECONDS);
        int i14 = 0;
        o13.p[] pVarArr = (o13.p[]) arrayListX.toArray(new o13.p[0]);
        o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
        androidx.work.c.a aVar4 = new androidx.work.c.a();
        int length = pVarArr2.length;
        while (i14 < length) {
            o13.p pVar = pVarArr2[i14];
            i14++;
            aVar4.b(pVar.f128595b, (String) pVar.f128594a);
        }
        return Boolean.valueOf(new Handler(Looper.getMainLooper()).post(new jx2.i(this.f50075f, aVarD.f(aVar4.a()).a(), 1)));
    }
}
