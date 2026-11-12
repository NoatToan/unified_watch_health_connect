package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\r\u000e\u000fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/j;", "Lcom/garmin/android/apps/connectmobile/f0;", "Luh/b;", "apolloClient", "", "activityListJson", "Ln70/g;", "dashboardDelegate", "Lam/b2;", "gcActivityApi", "<init>", "(Luh/b;Ljava/lang/String;Ln70/g;Lam/b2;)V", "a", "c", "b", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements j, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh.b f33247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n70.g f33249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final am.b2 f33250d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k$a;", "", "", "activityId", "", "hasPolyline", "hasSplits", "", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k$c;", "splitSummaries", "<init>", "(JZZLjava/util/List;)V", "a", "J", "()J", "b", "Z", "()Z", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("activityId")
        private final long activityId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("hasPolyline")
        private final boolean hasPolyline;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("hasSplits")
        private final boolean hasSplits;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("splitSummaries")
        private final List<c> splitSummaries;

        public a(long j8, boolean z14, boolean z15, List<c> list) {
            this.activityId = j8;
            this.hasPolyline = z14;
            this.hasSplits = z15;
            this.splitSummaries = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getActivityId() {
            return this.activityId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasPolyline() {
            return this.hasPolyline;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getHasSplits() {
            return this.hasSplits;
        }

        public final List<c> d() {
            return this.splitSummaries;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.activityId == aVar.activityId && this.hasPolyline == aVar.hasPolyline && this.hasSplits == aVar.hasSplits && p005kotlin.jvm.internal.s.g(this.splitSummaries, aVar.splitSummaries);
        }

        public final int hashCode() {
            int iG = q6.f.g(q6.f.g(Long.hashCode(this.activityId) * 31, 31, this.hasPolyline), 31, this.hasSplits);
            List<c> list = this.splitSummaries;
            return iG + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return "ActivityListItemLightweight(activityId=" + this.activityId + ", hasPolyline=" + this.hasPolyline + ", hasSplits=" + this.hasSplits + ", splitSummaries=" + this.splitSummaries + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k$c;", "", "Lqs/x;", "splitType", "<init>", "(Lqs/x;)V", "a", "Lqs/x;", "()Lqs/x;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("splitType")
        private final qs.x splitType;

        public c(qs.x xVar) {
            xVar.getClass();
            this.splitType = xVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final qs.x getSplitType() {
            return this.splitType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.splitType == ((c) obj).splitType;
        }

        public final int hashCode() {
            return this.splitType.hashCode();
        }

        public final String toString() {
            return "SplitSummary(splitType=" + this.splitType + ")";
        }
    }

    static {
        new b(null);
    }

    public k(uh.b bVar, String str, n70.g gVar, am.b2 b2Var) {
        bVar.getClass();
        gVar.getClass();
        b2Var.getClass();
        this.f33247a = bVar;
        this.f33248b = str;
        this.f33249c = gVar;
        this.f33250d = b2Var;
    }

    public static boolean b(a aVar) {
        List<c> listD;
        if (!aVar.getHasSplits() || (listD = aVar.d()) == null || listD.isEmpty()) {
            return false;
        }
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).getSplitType() == qs.x.VIRTUAL_ACTIVITY_SECTION) {
                return aVar.d().size() > 1;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02ff A[PHI: r2 r3 r4 r5 r7 r8 r14 r15
      0x02ff: PHI (r2v5 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l) = 
      (r2v6 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l)
      (r2v6 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l)
      (r2v6 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l)
      (r2v7 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l)
      (r2v7 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l)
     binds: [B:99:0x029f, B:101:0x02ab, B:114:0x02fb, B:85:0x025c, B:94:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r3v4 u13.a) = (r3v5 u13.a), (r3v5 u13.a), (r3v5 u13.a), (r3v6 u13.a), (r3v6 u13.a) binds: [B:99:0x029f, B:101:0x02ab, B:114:0x02fb, B:85:0x025c, B:94:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r4v8 int) = (r4v10 int), (r4v10 int), (r4v10 int), (r4v11 int), (r4v11 int) binds: [B:99:0x029f, B:101:0x02ab, B:114:0x02fb, B:85:0x025c, B:94:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r5v4 int) = (r5v6 int), (r5v6 int), (r5v6 int), (r5v7 int), (r5v7 int) binds: [B:99:0x029f, B:101:0x02ab, B:114:0x02fb, B:85:0x025c, B:94:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r7v3 kotlin.jvm.internal.r0) = 
      (r7v6 kotlin.jvm.internal.r0)
      (r7v6 kotlin.jvm.internal.r0)
      (r7v6 kotlin.jvm.internal.r0)
      (r7v7 kotlin.jvm.internal.r0)
      (r7v7 kotlin.jvm.internal.r0)
     binds: [B:99:0x029f, B:101:0x02ab, B:114:0x02fb, B:85:0x025c, B:94:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r8v3 java.util.Map) = (r8v4 java.util.Map), (r8v4 java.util.Map), (r8v4 java.util.Map), (r8v5 java.util.Map), (r8v5 java.util.Map) binds: [B:99:0x029f, B:101:0x02ab, B:114:0x02fb, B:85:0x025c, B:94:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r14v2 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a) = 
      (r14v4 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a)
      (r14v4 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a)
      (r14v4 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a)
      (r14v5 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a)
      (r14v5 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a)
     binds: [B:99:0x029f, B:101:0x02ab, B:114:0x02fb, B:85:0x025c, B:94:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r15v2 java.util.Iterator) = 
      (r15v4 java.util.Iterator)
      (r15v4 java.util.Iterator)
      (r15v4 java.util.Iterator)
      (r15v5 java.util.Iterator)
      (r15v5 java.util.Iterator)
     binds: [B:99:0x029f, B:101:0x02ab, B:114:0x02fb, B:85:0x025c, B:94:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x030b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0327  */
    /* JADX WARN: Code duplicated, block: B:124:0x032f  */
    /* JADX WARN: Code duplicated, block: B:128:0x033b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0343  */
    /* JADX WARN: Code duplicated, block: B:135:0x034f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0357  */
    /* JADX WARN: Code duplicated, block: B:142:0x0363  */
    /* JADX WARN: Code duplicated, block: B:145:0x0372  */
    /* JADX WARN: Code duplicated, block: B:150:0x0383  */
    /* JADX WARN: Code duplicated, block: B:153:0x038c A[LOOP:0: B:152:0x038a->B:153:0x038c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:164:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:167:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x010f  */
    /* JADX WARN: Code duplicated, block: B:56:0x01aa A[PHI: r1 r2 r3 r4 r5 r7 r8 r14 r15
      0x01aa: PHI (r1v1 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k) = 
      (r1v9 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k)
      (r1v9 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k)
      (r1v10 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k)
     binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r2v3 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l) = 
      (r2v9 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l)
      (r2v9 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l)
      (r2v10 com.garmin.android.apps.connectmobile.dashboard.data.datasource.l)
     binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r3v2 u13.a) = (r3v8 u13.a), (r3v8 u13.a), (r3v9 u13.a) binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r4v6 int) = (r4v13 int), (r4v13 int), (r4v14 int) binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r5v2 int) = (r5v9 int), (r5v9 int), (r5v10 int) binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r7v1 kotlin.jvm.internal.r0) = (r7v9 kotlin.jvm.internal.r0), (r7v9 kotlin.jvm.internal.r0), (r7v10 kotlin.jvm.internal.r0) binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r8v1 java.util.Map) = (r8v7 java.util.Map), (r8v7 java.util.Map), (r8v8 java.util.Map) binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r14v0 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a) = 
      (r14v7 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a)
      (r14v7 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a)
      (r14v8 com.garmin.android.apps.connectmobile.dashboard.data.datasource.k$a)
     binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r15v0 java.util.Iterator) = (r15v7 java.util.Iterator), (r15v7 java.util.Iterator), (r15v8 java.util.Iterator) binds: [B:45:0x0147, B:55:0x017e, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, ps.m] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v4, types: [kotlin.jvm.internal.r0, t13.d] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [T, ps.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0321 -> B:120:0x0324). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0327 -> B:122:0x0329). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x04cd -> B:170:0x04d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.j
    public final java.lang.Object a(v13.c r124) {
        /*
            Method dump skipped, instruction units count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.dashboard.data.datasource.k.a(v13.c):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
