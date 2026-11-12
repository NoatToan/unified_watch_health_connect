package jd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import gg1.v0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import ro1.g0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljd0/r;", "Lfy0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements fy0.a {
    @Override // fy0.a
    public final Intent a(Context context, String str, String str2, String str3) {
        context.getClass();
        str.getClass();
        g0.f153957a.getClass();
        v0 v0VarK = GCMSettingManager.k();
        v0VarK.getClass();
        String strConcat = ("https://" + v0VarK.f77340f).concat(str);
        x0.f23314a.getClass();
        String str4 = x0.Za;
        str4.getClass();
        String strF = g2.f(str4);
        String string = context.getString(R.string.beat_yesterday_hashtag);
        v0 v0VarK2 = GCMSettingManager.k();
        v0VarK2.getClass();
        String strD = j20.x.d(strF, StringUtils.SPACE, string, "\n", ("https://" + v0VarK2.f77340f).concat(str));
        js.c.f100592a.getClass();
        return js.c.b(context, str2, strConcat, strD, str3);
    }

    @Override // fy0.a
    public final void b(Activity activity, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        activity.getClass();
        CourseDetailsActivity.f33024k.getClass();
        CourseDetailsActivity.a.b(activity, eVar, 35);
    }
}
