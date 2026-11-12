package com.garmin.android.apps.connectmobile;

import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lcom/garmin/android/apps/connectmobile/v2;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.BaseRepository$safeApiResultWithRetry$result$1", f = "BaseRepository.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.l<t13.d<? super v2<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super c83.a0<Object>>, Object> f36764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Logger f36765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f36767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(e23.l<? super t13.d<? super c83.a0<Object>>, ? extends Object> lVar, Logger logger, String str, p005kotlin.jvm.internal.p0 p0Var, t13.d<? super i0> dVar) {
        super(1, dVar);
        this.f36764b = lVar;
        this.f36765c = logger;
        this.f36766d = str;
        this.f36767e = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i0(this.f36764b, this.f36765c, this.f36766d, this.f36767e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<Object>> dVar) {
        return ((i0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f36763a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f36763a = 1;
            obj = this.f36764b.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        c83.a0 a0Var = (c83.a0) obj;
        T t7 = a0Var.f25746b;
        Response response = a0Var.f25745a;
        if (response.isSuccessful() && t7 != 0) {
            return new v2.b(t7, response.code(), null, null, 12, null);
        }
        if (response.isSuccessful()) {
            return new v2.b(Unit.INSTANCE, response.code(), null, null, 12, null);
        }
        int iCode = response.code();
        String strMessage = response.message();
        String str = this.f36766d;
        StringBuilder sbK = androidx.core.view.j.k(iCode, "BaseRepository - ", str, " -> server error response code=[", "] message=[");
        sbK.append(strMessage);
        sbK.append("].");
        this.f36765c.error(sbK.toString());
        this.f36767e.f105807a--;
        IOException iOException = new IOException("Error occurred during getting safe Api result, " + str + ", Response [" + a0Var + "]");
        Integer num = new Integer(response.code());
        ResponseBody responseBody = a0Var.f25747c;
        return new v2.a(iOException, num, responseBody != null ? responseBody.string() : null);
    }
}
