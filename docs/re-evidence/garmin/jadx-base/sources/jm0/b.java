package jm0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import h10.j;
import java.io.Serializable;
import java.util.ArrayList;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
public interface b {
    Object A(String str, j jVar);

    boolean B();

    void a(Context context, GroupChallengeDTO groupChallengeDTO);

    Intent b(Activity activity, Uri uri, Rect rect, float f14);

    Object c(long j8, long j14, i iVar);

    Intent d(Context context, String str, String str2, String str3);

    String e(Context context, GroupChallengeDTO groupChallengeDTO);

    Object f(Context context, String str, String str2, GroupDTO.c cVar, v13.c cVar2);

    Object g(Context context, String str, String str2, GroupDTO.c cVar, v13.c cVar2);

    boolean h();

    String i();

    Intent j(String str);

    void k(GroupDetailActivity groupDetailActivity, Intent intent);

    Intent l(Activity activity, GroupDetailsDTO groupDetailsDTO);

    void m();

    Intent n(GroupDetailActivity groupDetailActivity, GroupDetailsDTO groupDetailsDTO);

    void o(Context context, String str);

    String p(Context context, GroupChallengeDTO groupChallengeDTO);

    Object q(long j8, Long l14, i iVar);

    Object r(long j8, long j14, i iVar);

    int s(Context context, String str);

    Serializable t(double d14, double d15, v13.c cVar);

    Object u(String str, boolean z14, i iVar);

    ArrayList v(Context context);

    Object w(String str, v13.c cVar);

    Intent x(Context context, String str, String str2, Boolean bool);

    String y(long j8);

    Object z(long j8, Long l14, i iVar);
}
