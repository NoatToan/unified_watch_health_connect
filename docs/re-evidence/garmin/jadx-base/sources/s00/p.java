package s00;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.ChildAccountsPushNotificationHandler$handleAdminAssistanceContactRemovalNotification$1", f = "ChildAccountsPushNotificationHandler.kt", l = {168}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f155376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f155377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f155379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f155380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f155381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f155382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f155383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f155384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f155385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n00.c f155386k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, String str2, n nVar, Context context, String str3, long j8, String str4, n00.c cVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f155379d = str;
        this.f155380e = str2;
        this.f155381f = nVar;
        this.f155382g = context;
        this.f155383h = str3;
        this.f155384i = j8;
        this.f155385j = str4;
        this.f155386k = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f155379d, this.f155380e, this.f155381f, this.f155382g, this.f155383h, this.f155384i, this.f155385j, this.f155386k, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        long j8;
        Object objF;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155378c;
        n nVar = this.f155381f;
        String str2 = this.f155380e;
        if (i14 == 0) {
            o13.r.b(obj);
            String str3 = this.f155379d;
            j8 = Long.parseLong(str3);
            this.f155377b = str2;
            this.f155376a = j8;
            this.f155378c = 1;
            objF = n.f(nVar, str3, this);
            if (objF == aVar) {
                return aVar;
            }
            str = str2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j14 = this.f155376a;
            String str4 = this.f155377b;
            o13.r.b(obj);
            j8 = j14;
            str = str4;
            objF = obj;
        }
        hl.a.b bVar = new hl.a.b(j8, str, (String) objF, null, 8, null);
        Intent intentC = SafetyFeaturesActivity.f43691f.c(this.f155382g, this.f155383h, this.f155384i, pj1.l.CHILD_REMOVED_CONTACT, bVar);
        Object[] objArr = {str2, this.f155385j};
        Context context = this.f155382g;
        String string = context.getString(R.string.pn_admin_assistance_contact_removal, objArr);
        string.getClass();
        sz0.e eVar = sz0.e.f161371k;
        int iD = nVar.d(this.f155386k);
        String string2 = context.getString(R.string.pn_emergency_calling_contact_removed_title);
        nVar.getClass();
        j.e(this.f155382g, eVar, iD, string2, string, j.c(context, intentC));
        return Unit.INSTANCE;
    }
}
