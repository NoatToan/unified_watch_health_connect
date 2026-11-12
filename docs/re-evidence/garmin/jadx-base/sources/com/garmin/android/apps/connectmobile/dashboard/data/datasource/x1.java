package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/x1;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/w1;", "Ll70/i0;", "fitnessStatsActivityRepo", "", "trainingPlansJson", "Lf12/l;", "userSettings", "<init>", "(Ll70/i0;Ljava/lang/String;Lf12/l;)V", "b", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x1 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f33391b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/x1$b;", "", "", "planClassification", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getPlanClassification", "()Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("trainingPlanClassification")
        private final String planClassification;

        public b(String str) {
            this.planClassification = str;
        }

        public final boolean a() {
            return p005kotlin.jvm.internal.s.g(this.planClassification, ww1.b0.FBT_ADAPTIVE.f187728a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.planClassification, ((b) obj).planClassification);
        }

        public final int hashCode() {
            String str = this.planClassification;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("LightweightTrainingPlanDTO(planClassification=", this.planClassification, ")");
        }
    }

    static {
        new a(null);
    }

    public x1(l70.i0 i0Var, String str, f12.l lVar) {
        i0Var.getClass();
        lVar.getClass();
        this.f33390a = str;
        this.f33391b = lVar;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.w1
    public final Object a(boolean z14, l70.e.d.a.C2114a c2114a) {
        List listI0;
        String str = this.f33390a;
        if (str != null && ((listI0 = p13.u.i0((Object[]) GsonUtil.f47253b.fromJson(str, b[].class))) == null || !listI0.isEmpty())) {
            Iterator it = listI0.iterator();
            while (it.hasNext()) {
                if (((b) it.next()).a()) {
                    int i14 = this.f33391b.e1().f77271c;
                    DateTime dateTimeNow = DateTime.now();
                    dateTimeNow.getClass();
                    DateTime dateTimeO = g22.k.o(i14, dateTimeNow);
                    DateTime dateTimeB = g22.k.b(i14, dateTimeNow);
                    String strB = c22.j0.b(dateTimeO, "yyyy-MM-dd", null);
                    String strB2 = c22.j0.b(dateTimeB, "yyyy-MM-dd", null);
                    if (strB != null && strB2 != null) {
                        String strA = l70.i0.f110699c.a();
                        if (!z14 && strA != null) {
                            return strA;
                        }
                        Object objA = l70.i0.f110697a.a(strB, strB2, c2114a);
                        return objA == u13.a.COROUTINE_SUSPENDED ? objA : (String) objA;
                    }
                    String str2 = "Failed to format start and/or end date -  startDate=" + dateTimeO + ", endDate=" + dateTimeB;
                    com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "FitnessStatsActivitiesDataSourceImpl", str2);
                    break;
                }
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/x1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
