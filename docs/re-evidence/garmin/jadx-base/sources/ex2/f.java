package ex2;

import c83.a0;
import com.google.gson.JsonObject;
import java.io.IOException;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)I"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.ImageHelper$fetchServerConfigVersion$result$1", f = "ImageHelper.kt", l = {}, m = "invokeSuspend", v = 1)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Integer>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f66957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f66958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f66959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f66958b = mVar;
        this.f66959c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f66958b, this.f66959c, dVar);
        fVar.f66957a = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Integer> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a0<JsonObject> a0VarExecute;
        JsonObject jsonObject;
        Integer num;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        try {
            a0VarExecute = this.f66958b.b(1).execute();
        } catch (IOException e4) {
            cx2.h hVar = i.f66971b;
            e4.toString();
            hVar.getClass();
            a0VarExecute = null;
        }
        if (a0VarExecute == null || (jsonObject = a0VarExecute.f25746b) == null) {
            i.f66971b.getClass();
            return null;
        }
        try {
            num = new Integer(jsonObject.get("version").getAsInt());
        } catch (ClassCastException unused) {
            num = null;
        }
        if (num != null) {
            i.f66971b.getClass();
            return num;
        }
        cx2.h hVar2 = i.f66971b;
        jsonObject.toString();
        hVar2.getClass();
        return null;
    }
}
