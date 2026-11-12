package wj0;

import androidx.fragment.app.Fragment;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.gcplus.domain.PremiumBadgeChallengeExtensionsKt$showSubscriptionNoticeIfNeeded$2", f = "PremiumBadgeChallengeExtensions.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f185776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f185777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f185778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fragment f185779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z14, e23.a<Unit> aVar, DateTime dateTime, Fragment fragment, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f185776a = z14;
        this.f185777b = aVar;
        this.f185778c = dateTime;
        this.f185779d = fragment;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f185776a, this.f185777b, this.f185778c, this.f185779d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f185777b.invoke();
        return Unit.INSTANCE;
    }
}
