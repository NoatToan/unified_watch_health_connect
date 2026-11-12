package s10;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.d1;
import com.garmin.android.apps.connectmobile.startup.StartupChecksActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.CIQHTTPDelegate$launchCustomTabsCompatibleBrowser$1", f = "CIQHTTPDelegate.kt", l = {153}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f155870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f155871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f155872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Uri uri, String str, d<? super c> dVar) {
        super(2, dVar);
        this.f155870b = context;
        this.f155871c = uri;
        this.f155872d = str;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f155870b, this.f155871c, this.f155872d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155869a;
        if (i14 == 0) {
            r.b(obj);
            StartupChecksActivity.f44788d.getClass();
            StartupChecksActivity.a.c(this.f155870b);
            this.f155869a = 1;
            if (m0.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        Activity activity = d1.f33128j.get();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        r.e eVarA = new r.e.d().a();
        Intent intent = eVarA.f148677a;
        String str = this.f155872d;
        if (str != null) {
            intent.setPackage(str);
        }
        intent.setData(this.f155871c);
        a7.b.startActivity(activity, intent, eVarA.f148678b);
        return Unit.INSTANCE;
    }
}
