package g91;

import a91.m;
import android.content.Context;
import android.content.Intent;
import c22.o;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.consent.PersonalizedInsightsConsentActivity;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.language.LanguageSelectionActivity;
import java.io.Serializable;
import java.util.Set;
import o13.r;
import p005kotlin.Metadata;
import q92.x;
import ub1.i;
import v13.c;
import vb.h;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg91/b;", "Lub1/i;", "La91/m;", "languageSelectionRepository", "Lc22/o;", "appUtilDelegate", "<init>", "(La91/m;Lc22/o;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f76475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f76476b;

    public b(m mVar, o oVar) {
        mVar.getClass();
        oVar.getClass();
        this.f76475a = mVar;
        this.f76476b = oVar;
    }

    @Override // ub1.i
    public final Intent a(Context context) {
        context.getClass();
        LanguageSelectionActivity.f40328b.getClass();
        Intent intent = new Intent(context, (Class<?>) LanguageSelectionActivity.class);
        intent.putExtra("DESTINATION", (Serializable) null);
        return intent;
    }

    @Override // ub1.i
    public final Intent b(Context context) {
        context.getClass();
        if (d1.h(x.DI_CONNECT_UPLOAD, false)) {
            return ConsentActivity.a.b(ConsentActivity.f32155r, context, x.DI_CONNECT_AI, false, null, 24);
        }
        PersonalizedInsightsConsentActivity.a aVar = PersonalizedInsightsConsentActivity.f40319t;
        h91.b bVar = h91.b.DASHBOARD;
        aVar.getClass();
        return PersonalizedInsightsConsentActivity.a.a(context, bVar);
    }

    @Override // ub1.i
    public final Intent c(Context context) {
        context.getClass();
        PersonalizedInsightsConsentActivity.a aVar = PersonalizedInsightsConsentActivity.f40319t;
        h91.b bVar = h91.b.DEV_MENU;
        aVar.getClass();
        return PersonalizedInsightsConsentActivity.a.a(context, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ub1.i
    public final Object d(Context context, c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f76474d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f76474d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objC = aVar.f76472b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f76474d;
        if (i15 == 0) {
            r.b(objC);
            aVar.f76471a = context;
            aVar.f76474d = 1;
            Set<String> set = m.f2145d;
            objC = this.f76475a.c(false, aVar);
            if (objC == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = aVar.f76471a;
            r.b(objC);
        }
        Set set2 = (Set) objC;
        Set set3 = set2;
        if (set3 == null || set3.isEmpty() || set2.contains(this.f76476b.b())) {
            return b(context);
        }
        LanguageSelectionActivity.a aVar3 = LanguageSelectionActivity.f40328b;
        h91.b bVar = h91.b.DASHBOARD;
        aVar3.getClass();
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) LanguageSelectionActivity.class);
        intent.putExtra("DESTINATION", bVar);
        return intent;
    }
}
