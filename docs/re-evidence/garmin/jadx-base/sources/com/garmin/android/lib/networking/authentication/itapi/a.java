package com.garmin.android.lib.networking.authentication.itapi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import e23.p;
import fb1.c;
import java.net.URLEncoder;
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
@e(c = "com.garmin.android.lib.networking.authentication.itapi.IT2RevokeAccessAndRefreshTokensWorker$Companion$enqueue$2", f = "IT2RevokeAccessAndRefreshTokensWorker.kt", l = {}, m = "invokeSuspend")
public final class a extends i implements p<b0, d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f50077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f50078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f50079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f50080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f50081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f50082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, String str4, String str5, Context context, d<? super a> dVar) {
        super(2, dVar);
        this.f50077a = str;
        this.f50078b = str2;
        this.f50079c = str3;
        this.f50080d = str4;
        this.f50081e = str5;
        this.f50082f = context;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f50077a, this.f50078b, this.f50079c, this.f50080d, this.f50081e, this.f50082f, dVar);
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
        String str = this.f50077a;
        arrayListX.add(new o13.p("URL", k.g(str, "/api/oauth/revoke")));
        String str2 = this.f50078b;
        arrayListX.add(new o13.p("ACCESS_TOKEN", str2));
        String str3 = this.f50079c;
        arrayListX.add(new o13.p("USER_AGENT", str3));
        String str4 = this.f50080d;
        arrayListX.add(new o13.p("IT_CLIENT_ID_LOGGING_ONLY", str4));
        arrayListX.add(new o13.p("POST_BODY", c.n("access_token=", URLEncoder.encode(str2, "UTF-8"))));
        arrayListX.trimToSize();
        x.a aVar2 = new x.a((Class<? extends androidx.work.d>) IT2RevokeAccessAndRefreshTokensWorker.class);
        f.a aVar3 = new f.a();
        aVar3.b(v.CONNECTED);
        aVar2.f170098c.f26950j = aVar3.a();
        ue.a aVar4 = ue.a.EXPONENTIAL;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x.a aVarD = aVar2.d(aVar4, 30000L, timeUnit);
        int i14 = 0;
        o13.p[] pVarArr = (o13.p[]) arrayListX.toArray(new o13.p[0]);
        o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
        androidx.work.c.a aVar5 = new androidx.work.c.a();
        for (int length = pVarArr2.length; i14 < length; length = length) {
            o13.p[] pVarArr3 = pVarArr2;
            o13.p pVar = pVarArr3[i14];
            i14++;
            aVar5.b(pVar.f128595b, (String) pVar.f128594a);
            pVarArr2 = pVarArr3;
        }
        x xVarA = aVarD.f(aVar5.a()).a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o13.p("URL", k.g(str, "/api/oauth/revokerefreshtoken")));
        arrayList.add(new o13.p("ACCESS_TOKEN", str2));
        arrayList.add(new o13.p("USER_AGENT", str3));
        arrayList.add(new o13.p("IT_CLIENT_ID_LOGGING_ONLY", str4));
        arrayList.add(new o13.p("POST_BODY", c.n("refresh_token=", URLEncoder.encode(this.f50081e, "UTF-8"))));
        arrayList.trimToSize();
        x.a aVar6 = new x.a((Class<? extends androidx.work.d>) IT2RevokeAccessAndRefreshTokensWorker.class);
        f.a aVar7 = new f.a();
        aVar7.b(v.CONNECTED);
        aVar6.f170098c.f26950j = aVar7.a();
        x.a aVarD2 = aVar6.d(ue.a.EXPONENTIAL, 30000L, timeUnit);
        o13.p[] pVarArr4 = (o13.p[]) arrayList.toArray(new o13.p[0]);
        o13.p[] pVarArr5 = (o13.p[]) Arrays.copyOf(pVarArr4, pVarArr4.length);
        androidx.work.c.a aVar8 = new androidx.work.c.a();
        int length2 = pVarArr5.length;
        int i15 = 0;
        while (i15 < length2) {
            o13.p pVar2 = pVarArr5[i15];
            i15++;
            aVar8.b(pVar2.f128595b, (String) pVar2.f128594a);
        }
        return Boolean.valueOf(new Handler(Looper.getMainLooper()).post(new fh2.a(this.f50082f, 25, aVarD2.f(aVar8.a()).a(), xVarA)));
    }
}
