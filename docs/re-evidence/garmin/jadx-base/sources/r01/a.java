package r01;

import android.content.Context;
import android.content.Intent;
import b21.l4;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr01/a;", "Lfe0/a;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements fe0.a {
    @Override // fe0.a
    public final void a(Context context, o82.g gVar, boolean z14) {
        context.getClass();
        gVar.getClass();
        Intent intentA = NutritionActivity.a.a(NutritionActivity.f39581f, context, null, gVar, z14 ? l4.i0.INSTANCE : null, false, false, 48);
        intentA.addFlags(536870912);
        context.startActivity(intentA);
    }
}
