package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.follow.domain.FriendListActivity;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/v5;", "Lbv/g;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v5 implements bv.g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104397a;

        static {
            int[] iArr = new int[am.c2.values().length];
            try {
                iArr[am.c2.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.c2.DAILY_SUMMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[am.c2.AUTO_CHALLENGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[am.c2.SEGMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104397a = iArr;
        }
    }

    @Override // bv.g
    public final do1.s a() {
        return new do1.s((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    @Override // bv.g
    public final void b(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        UserProfileActivity.f46494x.getClass();
        UserProfileActivity.a.c(context, str, str2, null);
    }

    @Override // bv.g
    public final boolean c() {
        return com.garmin.android.apps.connectmobile.leaderboard.challenges.x.v();
    }

    @Override // bv.g
    public final void d(Context context, am.c2 c2Var, Parcelable parcelable, View view2, View view3) {
        c2Var.getClass();
        view2.getClass();
        view3.getClass();
        int i14 = a.f104397a[c2Var.ordinal()];
        if (i14 == 1) {
            m10.d dVar = new m10.d(view2, 0);
            m10.d dVar2 = new m10.d(view3, 0);
            m10.c cVar = new m10.c(context, "yyyy-MM-dd HH:mm:ss");
            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) parcelable;
            cVar.a(dVar, activityListItemDTO, 0);
            cVar.a(dVar2, activityListItemDTO, 1);
            dVar.a();
            dVar2.a();
        } else if (i14 == 2) {
            m10.d dVar3 = new m10.d(view2, 0);
            m10.d dVar4 = new m10.d(view3, 0);
            m10.c cVar2 = new m10.c(context, "yyyy-MM-dd");
            oq1.a aVar = (oq1.a) parcelable;
            cVar2.b(dVar3, aVar);
            cVar2.b(dVar4, aVar);
            dVar3.a();
            dVar4.a();
        } else if (i14 == 3) {
            do1.b bVar = new do1.b(view2);
            do1.b bVar2 = new do1.b(view3);
            do1.a aVar2 = new do1.a(context);
            com.garmin.android.apps.connectmobile.leaderboard.model.f fVar = (com.garmin.android.apps.connectmobile.leaderboard.model.f) parcelable;
            aVar2.a(bVar, fVar);
            aVar2.a(bVar2, fVar);
            bVar.f60587c.setVisibility(8);
            bVar.f60588d.setVisibility(8);
            bVar.f60589e.setVisibility(8);
            bVar2.f60587c.setVisibility(8);
            bVar2.f60588d.setVisibility(8);
            bVar2.f60589e.setVisibility(8);
        } else {
            if (i14 != 4) {
                view2.setVisibility(8);
                view3.setVisibility(8);
                return;
            }
            com.garmin.android.apps.connectmobile.segments.presentation.f.a aVar3 = new com.garmin.android.apps.connectmobile.segments.presentation.f.a(view2);
            com.garmin.android.apps.connectmobile.segments.presentation.f.a aVar4 = new com.garmin.android.apps.connectmobile.segments.presentation.f.a(view3);
            SegmentDetailsDTO segmentDetailsDTO = (SegmentDetailsDTO) parcelable;
            com.garmin.android.apps.connectmobile.segments.presentation.f.a(context, aVar3, segmentDetailsDTO);
            com.garmin.android.apps.connectmobile.segments.presentation.f.a(context, aVar4, segmentDetailsDTO);
            aVar3.a();
            aVar4.a();
        }
        int color = a7.b.getColor(context, R.color.gcm_background);
        view2.setBackgroundColor(color);
        view3.setBackgroundColor(color);
        view3.setVisibility(0);
    }

    @Override // bv.g
    public final Intent e(Context context) {
        context.getClass();
        FriendListActivity.a aVar = FriendListActivity.f35257b;
        p003ji0.k kVar = p003ji0.k.FOLLOWING;
        aVar.getClass();
        return FriendListActivity.a.a(context, kVar);
    }

    @Override // bv.g
    public final void f(androidx.fragment.app.m mVar, Parcelable parcelable, boolean z14) {
        am.h hVar;
        if (parcelable == null || !(parcelable instanceof ActivityListItemDTO)) {
            return;
        }
        if (z14) {
            hVar = am.h.VIEW_DISABLE_SOCIAL;
            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) parcelable;
            activityListItemDTO.S0 = 0;
            activityListItemDTO.T0 = 0;
        } else {
            hVar = am.h.VIEW_ONLY;
        }
        aq.b bVar = new aq.b();
        ActivityListItemDTO activityListItemDTO2 = (ActivityListItemDTO) parcelable;
        bVar.f11822a = activityListItemDTO2;
        bVar.f11823b = activityListItemDTO2.f29250b;
        String str = activityListItemDTO2.f29265g.f4358a;
        bVar.f11827f = str;
        if (hVar != null) {
            bVar.f11824c = hVar;
        }
        bVar.f11825d = true;
        bVar.f11827f = str;
        mVar.startActivity(bVar.a(mVar));
    }
}
