package ru;

import am.h;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import org.joda.time.DateTime;
import uu.z;

/* JADX INFO: loaded from: classes7.dex */
public interface d {
    void a(Context context, String str, String str2, String str3);

    void b(m mVar, String str, int i14);

    void c(m mVar, String str, int i14);

    void d(m mVar, String str);

    void e(Context context, int i14, int i15, String str);

    void f(Context context, String str);

    void g(BadgeDetailsActivity badgeDetailsActivity, Intent intent, String str, String str2);

    void h(Context context, long j8, h hVar);

    Object i(String str, z zVar);

    void j(m mVar, String str);

    void k(m mVar, DateTime dateTime);

    void l(m mVar, int i14);

    Intent m(Uri uri);

    void n(Context context, String str);

    void o(int i14, Context context);

    void p(Context context, int i14, int i15, com.garmin.android.apps.connectmobile.badges.service.model.a aVar);
}
