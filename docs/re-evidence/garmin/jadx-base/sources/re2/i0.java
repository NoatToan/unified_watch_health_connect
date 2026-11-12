package re2;

import android.content.res.Resources;
import android.os.LocaleList;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.MobileAuthUtil$getRegionAwareText$2", f = "MobileAuthUtil.kt", l = {243}, m = "invokeSuspend")
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.e f152304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Resources f152305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f152306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ve2.e eVar, Resources resources, String str, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f152304b = eVar;
        this.f152305c = resources;
        this.f152306d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f152304b, this.f152305c, this.f152306d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ve2.e eVar;
        Locale locale;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152303a;
        if (i14 == 0) {
            o13.r.b(obj);
            eVar = this.f152304b;
            if (eVar == null) {
                b bVar = b.f152215a;
                this.f152303a = 1;
                bVar.getClass();
                obj = b.q(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h7.g gVar = h7.g.f82327b;
            locale = h7.g.b(LocaleList.getDefault()).f82328a.get(0);
            str = this.f152306d;
            if (locale == null && (eVar == ve2.e.f177705e || eVar == ve2.e.f177706f || eVar == ve2.e.f177708h)) {
                return e5.g(str, " - ", (p005kotlin.jvm.internal.s.g(locale.getLanguage(), "en") || p005kotlin.jvm.internal.s.g(locale.getLanguage(), "zh")) ? this.f152305c.getString(R.string.china_display_name_overwrite) : new Locale("", "CN").getDisplayCountry());
            }
            return str;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        eVar = (ve2.e) obj;
        h7.g gVar2 = h7.g.f82327b;
        locale = h7.g.b(LocaleList.getDefault()).f82328a.get(0);
        str = this.f152306d;
        if (locale == null) {
        }
        return str;
    }
}
