package ik0;

import android.content.Context;
import e23.p;
import java.util.function.Consumer;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import vs2.k;
import vs2.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gdiadapter.handler.SystemEventSender$Companion$sendSystemEvent$1", f = "SystemEventSender.kt", l = {39}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f93902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f93903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f93904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Consumer<Integer> f93905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str, k kVar, Consumer<Integer> consumer, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f93902b = context;
        this.f93903c = str;
        this.f93904d = kVar;
        this.f93905e = consumer;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f93902b, this.f93903c, this.f93904d, this.f93905e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93901a;
        Consumer<Integer> consumer = this.f93905e;
        try {
            if (i14 == 0) {
                r.b(obj);
                l lVar = (l) da2.d.c(this.f93902b).getCapability(this.f93903c, l.class);
                if (lVar == null) {
                    return Unit.INSTANCE;
                }
                k kVar = this.f93904d;
                this.f93901a = 1;
                obj = lVar.a(kVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            if (consumer != null) {
                consumer.accept(new Integer(iIntValue));
            }
        } catch (Exception unused) {
            if (consumer != null) {
                consumer.accept(new Integer(-1));
            }
        }
        return Unit.INSTANCE;
    }
}
