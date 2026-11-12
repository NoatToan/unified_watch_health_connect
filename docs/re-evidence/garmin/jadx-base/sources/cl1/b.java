package cl1;

import d53.t;
import d53.w;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcl1/b;", "Lcl1/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements cl1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27937b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f27938a;

    public b(l lVar) {
        lVar.getClass();
        this.f27938a = lVar;
    }

    public static String k(long j8, String str) {
        return str + "_" + j8;
    }

    @Override // cl1.a
    public final void a() {
        this.f27938a.O2("activity_recording_location_permission_seen", true);
    }

    @Override // cl1.a
    public final boolean b() {
        return this.f27938a.W2("activity_recording_location_permission_seen", false);
    }

    @Override // cl1.a
    public final void c(Set<Long> set) {
        set.getClass();
        this.f27938a.S("activity_recording_onboarding_completed_device_ids", h0.k0(set, ",", null, null, null, 62));
    }

    @Override // cl1.a
    public final List<String> d(long j8) {
        List<String> listB1 = null;
        String strA4 = this.f27938a.A4(k(j8, "activity_recording_favorite_activities_for"), null);
        if (strA4 != null) {
            List listW = w.W(strA4, new String[]{","});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listW) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            listB1 = h0.b1(h0.f1(arrayList));
        }
        return listB1 == null ? j0.f134944a : listB1;
    }

    @Override // cl1.a
    public final void e(long j8, List<String> list) {
        list.getClass();
        String strK0 = h0.k0(h0.b1(h0.f1(list)), ",", null, null, null, 62);
        this.f27938a.S(k(j8, "activity_recording_favorite_activities_for"), strK0);
    }

    @Override // cl1.a
    public final boolean f(long j8) {
        return i().contains(Long.valueOf(j8));
    }

    @Override // cl1.a
    public final void g(long j8) {
        Set<Long> setF1 = h0.f1(i());
        if (setF1.add(Long.valueOf(j8))) {
            c(setF1);
        }
    }

    @Override // cl1.a
    public final void h(long j8) {
        this.f27938a.O2(k(j8, "activity_recording_favorite_activities_fetched_from_cloud"), true);
    }

    @Override // cl1.a
    public final Set<Long> i() {
        Set<Long> setG1;
        String strA4 = this.f27938a.A4("activity_recording_onboarding_completed_device_ids", "");
        if (strA4 != null) {
            List listW = w.W(strA4, new String[]{","});
            ArrayList arrayList = new ArrayList();
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                Long lJ = t.j((String) it.next());
                if (lJ != null) {
                    arrayList.add(lJ);
                }
            }
            setG1 = h0.g1(arrayList);
        } else {
            setG1 = null;
        }
        return setG1 == null ? l0.f134950a : setG1;
    }

    @Override // cl1.a
    public final boolean j(long j8) {
        return this.f27938a.W2(k(j8, "activity_recording_favorite_activities_fetched_from_cloud"), false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcl1/b$a;", "", "<init>", "()V", "", "DELIMITER", "Ljava/lang/String;", "EMPTY_STRING", "ACTIVITY_RECORDING_ONBOARDING_COMPLETED_DEVICE_IDS", "ACTIVITY_RECORDING_FAVORITE_ACTIVITIES", "ACTIVITY_RECORDING_FAVORITE_ACTIVITIES_FETCHED_FROM_CLOUD", "ACTIVITY_RECORDING_LOCATION_PERMISSION_SEEN", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static String a(int i14, int i15) {
            return androidx.core.view.j.d(i14, i15, ":");
        }

        private a() {
        }
    }
}
