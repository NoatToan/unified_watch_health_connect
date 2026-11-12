package com.garmin.subscriptions.retrofit;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyx2/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.subscriptions.retrofit.SubscriptionGatewayRetrofitManager$getPurchasableSubscriptions$response$1", f = "SubscriptionGatewayRetrofitManager.kt", l = {241, 243}, m = "invokeSuspend")
public final class i extends v13.i implements l<t13.d<? super a0<yx2.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f52707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.a f52708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f52709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f52710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f52711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f52712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f52713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, g.a aVar, String str2, String str3, String str4, boolean z14, String str5, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f52707b = str;
        this.f52708c = aVar;
        this.f52709d = str2;
        this.f52710e = str3;
        this.f52711f = str4;
        this.f52712g = z14;
        this.f52713h = str5;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f52707b, this.f52708c, this.f52709d, this.f52710e, this.f52711f, this.f52712g, this.f52713h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<yx2.k>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r11 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r11 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52706a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return (a0) obj;
            }
            if (i14 == 2) {
                r.b(obj);
                return (a0) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        String str = this.f52707b;
        g.a aVar2 = this.f52708c;
        String str2 = this.f52709d;
        if (str != null) {
            this.f52706a = 1;
            obj = aVar2.c(str2, str, this.f52710e, this.f52711f, this.f52712g, this.f52713h, this);
        } else {
            this.f52706a = 2;
            obj = aVar2.a(str2, this.f52710e, this.f52711f, this.f52712g, this.f52713h, this);
        }
        return aVar;
    }
}
