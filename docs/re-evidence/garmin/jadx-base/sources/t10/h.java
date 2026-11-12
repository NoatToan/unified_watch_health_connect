package t10;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b21.l4;
import b63.q;
import b63.u;
import b63.v;
import c63.k0;
import c63.l0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import e23.s;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lt10/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161686a;

    static {
        new a(null);
    }

    public h(Context context) {
        context.getClass();
        this.f161686a = context;
    }

    public final void a(Uri uri, boolean z14, e23.l<? super Intent, Unit> lVar, s<? super String, ? super String, ? super String, ? super sz0.e, ? super PendingIntent, Unit> sVar) {
        l4 mVar;
        v vVarB;
        uri.getClass();
        if (uri.getPathSegments().contains("find-food")) {
            u uVarE = g22.l.e(u.INSTANCE);
            try {
                String queryParameter = uri.getQueryParameter("time");
                if (queryParameter != null) {
                    v.Companion companion = v.INSTANCE;
                    v.b.f16220a.getClass();
                    k0 k0VarA = l0.a();
                    companion.getClass();
                    vVarB = v.Companion.b(queryParameter, k0VarA);
                } else {
                    vVarB = null;
                }
                mVar = new l4.m((m21.b) m21.b.e.INSTANCE, vVarB != null ? q.a(g22.l.d(b63.o.INSTANCE), vVarB) : uVarE, (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null);
            } catch (Exception e4) {
                a2 a2Var = a2.NUTRITION;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error when parsing promotedFeature for handleNutritionDeepLink(): ");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "NutritionDeepLinkHandler", strD);
                mVar = new l4.m((m21.b) m21.b.e.INSTANCE, uVarE, (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null);
            }
        } else {
            mVar = l4.y0.INSTANCE;
        }
        l4 l4Var = mVar;
        NutritionActivity.a aVar = NutritionActivity.f39581f;
        boolean z15 = l4Var instanceof l4.m;
        DateTime dateTimeR = z15 ? g22.k.r(g22.l.i(((l4.m) l4Var).b())) : null;
        Context context = this.f161686a;
        Intent intentA = NutritionActivity.a.a(aVar, context, dateTimeR, null, l4Var, false, false, 52);
        if (z14) {
            intentA.setFlags(268435456);
            lVar.invoke(intentA);
            return;
        }
        String string = context.getString(R.string.lbl_nutrition);
        string.getClass();
        String string2 = z15 ? context.getString(R.string.open_connect_to_find_log_food) : context.getString(R.string.open_connect_to_get_started);
        string2.getClass();
        sz0.e eVar = sz0.e.F;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
        activity.getClass();
        sVar.invoke(string, string2, string2, eVar, activity);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt10/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
