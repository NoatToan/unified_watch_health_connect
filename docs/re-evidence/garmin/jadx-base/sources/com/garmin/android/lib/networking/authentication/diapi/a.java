package com.garmin.android.lib.networking.authentication.diapi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import d53.w;
import e23.p;
import fb1.c;
import i3.e5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import o13.r;
import o53.b0;
import oc.b;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import sc2.l;
import t13.d;
import tn.k;
import ue.f;
import ue.v;
import ue.x;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.android.lib.networking.authentication.diapi.DI2RevokeAccessAndRefreshTokensWorker$Companion$enqueue$2", f = "DI2RevokeAccessAndRefreshTokensWorker.kt", l = {}, m = "invokeSuspend")
public final class a extends i implements p<b0, d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f50062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f50063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f50064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f50065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f50066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f50067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f50068g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, String str4, String str5, l lVar, Context context, d<? super a> dVar) {
        super(2, dVar);
        this.f50062a = str;
        this.f50063b = str2;
        this.f50064c = str3;
        this.f50065d = str4;
        this.f50066e = str5;
        this.f50067f = lVar;
        this.f50068g = context;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f50062a, this.f50063b, this.f50064c, this.f50065d, this.f50066e, this.f50067f, this.f50068g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Object> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        DI2RevokeAccessAndRefreshTokensWorker.f50061e.getClass();
        String str = this.f50062a;
        String strN = (str == null || w.J(str)) ? null : c.n("token=", URLEncoder.encode(str, "UTF-8"));
        String str2 = this.f50063b;
        if (str2 != null && !w.J(str2)) {
            String strEncode = URLEncoder.encode(str2, "UTF-8");
            strN = strN == null ? c.n("token=", strEncode) : e5.g(strN, "&token=", strEncode);
        }
        if (strN == null) {
            return new Integer(Log.w("NC#DI2RevokeAccessAndRefreshTokensWorker", "no work enqueued, both accessToken and refreshToken are null or blank"));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o13.p("URL", k.g(this.f50064c, "/di-oauth2-service/token/revoke")));
        arrayList.add(new o13.p("SHORT_USER_AGENT", this.f50065d));
        arrayList.add(new o13.p("USER_AGENT", this.f50066e));
        arrayList.add(new o13.p("BASIC_AUTH_HEADER_VAL", b.M(this.f50067f)));
        arrayList.add(new o13.p("POST_BODY", strN));
        arrayList.trimToSize();
        x.a aVar2 = new x.a((Class<? extends androidx.work.d>) DI2RevokeAccessAndRefreshTokensWorker.class);
        f.a aVar3 = new f.a();
        aVar3.b(v.CONNECTED);
        aVar2.f170098c.f26950j = aVar3.a();
        x.a aVarD = aVar2.d(ue.a.EXPONENTIAL, 5L, TimeUnit.MINUTES);
        int i14 = 0;
        o13.p[] pVarArr = (o13.p[]) arrayList.toArray(new o13.p[0]);
        o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
        androidx.work.c.a aVar4 = new androidx.work.c.a();
        int length = pVarArr2.length;
        while (i14 < length) {
            o13.p pVar = pVarArr2[i14];
            i14++;
            aVar4.b(pVar.f128595b, (String) pVar.f128594a);
        }
        return Boolean.valueOf(new Handler(Looper.getMainLooper()).post(new at0.c(this.f50068g, str, str2, aVarD.f(aVar4.a()).a(), 17)));
    }
}
