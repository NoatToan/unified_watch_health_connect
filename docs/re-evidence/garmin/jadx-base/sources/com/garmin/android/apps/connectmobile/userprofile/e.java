package com.garmin.android.apps.connectmobile.userprofile;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import com.garmin.android.apps.connectmobile.d0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.model.n;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import z12.o0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/e;", "Lcom/garmin/android/apps/connectmobile/d0$a;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends d0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f46567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z12.h f46568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f46569e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/e$a;", "Lo12/j$a;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements o12.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f46570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<m> f46571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList<ActivityListItemDTO> f46573d = new ArrayList<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f46574e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f46575f;

        @Override // o12.j.a
        public final boolean a() {
            if (!c()) {
                return false;
            }
            q qVar = this.f46570a;
            return (qVar != null ? qVar.i() : null) == n.PRIVATE;
        }

        @Override // o12.j.a
        public final int b() {
            return R.string.user_profile_status_private_hint;
        }

        public final boolean c() {
            q qVar = this.f46570a;
            return qVar != null && qVar.getUserId() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d0.a
    public final void B() {
        a aVar = new a();
        z(new o12.j(aVar));
        z(new z12.b(aVar));
        this.f46567c = aVar;
        z12.h hVar = new z12.h();
        z(hVar);
        this.f46568d = hVar;
        o0 o0Var = new o0();
        z(o0Var);
        this.f46569e = o0Var;
    }

    public final void C(boolean z14) {
        a aVar = this.f46567c;
        if (aVar == null || aVar.f46574e != z14) {
            if (aVar != null) {
                aVar.f46574e = z14;
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d0.a
    public final void clear() {
        ArrayList<ActivityListItemDTO> arrayList;
        int size;
        a aVar = this.f46567c;
        if (aVar == null || (arrayList = aVar.f46573d) == null || (size = arrayList.size()) <= 0) {
            return;
        }
        arrayList.clear();
        o0 o0Var = this.f46569e;
        b32.f fVar = this.f15668a;
        if (size > fVar.f15672e.get(o0Var).intValue()) {
            i2.n("NestedRecyclerViewGroup", "Invalid position: start = 0, limit = " + size);
        } else {
            b32.c cVar = fVar.f15667a;
            int iJ = fVar.j(o0Var);
            if (iJ == -1) {
                iJ = -1;
            }
            cVar.notifyItemRangeRemoved(iJ, size);
        }
    }
}
