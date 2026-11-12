package com.garmin.android.apps.connectmobile.device.setup.presentation.inreach;

import a31.e;
import android.app.Notification;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c22.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.LinkedHashMap;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pc0.n0;
import sz0.f;
import t13.d;
import ue.i0;
import ue.l;
import ue.v;
import ue.x;
import v13.c;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/setup/presentation/inreach/InReachSubscriptionPollingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InReachSubscriptionPollingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f33782k = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m90.a f33783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0 f33784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l80.a f33785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f33786j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionPollingWorker", f = "InReachSubscriptionPollingWorker.kt", l = {56, 65, 72, 74, 75, 97}, m = "doWork", v = 2)
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f33787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f33788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f33789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f33790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f33791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f33792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f33793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f33794h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f33796j;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f33794h = obj;
            this.f33796j |= Integer.MIN_VALUE;
            return InReachSubscriptionPollingWorker.this.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InReachSubscriptionPollingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f33783g = (m90.a) KoinJavaComponent.get$default(m90.a.class, null, null, 6, null);
        this.f33784h = (n0) KoinJavaComponent.get$default(n0.class, null, null, 6, null);
        this.f33785i = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
        this.f33786j = (e) KoinJavaComponent.get$default(e.class, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0364 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:0: B:69:0x01ba->B:111:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[PHI: r0 r2 r4 r5 r8 r10 r12 r14
      0x0080: PHI (r0v21 m90.a) = (r0v14 m90.a), (r0v23 m90.a) binds: [B:23:0x0077, B:82:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r2v18 long) = (r2v12 long), (r2v19 long) binds: [B:23:0x0077, B:82:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r4v8 int) = (r4v5 int), (r4v10 int) binds: [B:23:0x0077, B:82:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r5v14 long) = (r5v9 long), (r5v15 long) binds: [B:23:0x0077, B:82:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r8v4 boolean) = (r8v3 boolean), (r8v7 boolean) binds: [B:23:0x0077, B:82:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r10v4 u13.a) = (r10v3 u13.a), (r10v5 u13.a) binds: [B:23:0x0077, B:82:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r12v12 long) = (r12v8 long), (r12v13 long) binds: [B:23:0x0077, B:82:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:23:0x0077, B:82:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b6 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c0 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0214  */
    /* JADX WARN: Code duplicated, block: B:78:0x0215  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:81:0x0222 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x023a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0253  */
    /* JADX WARN: Code duplicated, block: B:89:0x025b A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0260  */
    /* JADX WARN: Code duplicated, block: B:92:0x0283 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02a2 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02e8 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0336 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:13:0x0044, B:43:0x011e, B:48:0x012d, B:52:0x014b, B:59:0x015c, B:63:0x01aa, B:65:0x01ae, B:75:0x01d1, B:79:0x021a, B:81:0x0222, B:84:0x023c, B:87:0x0255, B:89:0x025b, B:91:0x0261, B:94:0x02c2, B:92:0x0283, B:93:0x02a2, B:68:0x01b6, B:69:0x01ba, B:71:0x01c0, B:96:0x02e8, B:98:0x0336, B:100:0x0364, B:104:0x0397, B:19:0x0062, B:22:0x0074, B:26:0x008f, B:29:0x00a4, B:32:0x00c1, B:35:0x00d3, B:38:0x00ed, B:40:0x00fb), top: B:108:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0385 -> B:15:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object c(t13.d<? super androidx.work.d.a> r33) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionPollingWorker.c(t13.d):java.lang.Object");
    }

    public final void d(long j8) {
        Context context = this.f11469a;
        context.getClass();
        l22.a aVar = new l22.a(context);
        sz0.e eVar = sz0.e.I0;
        q qVar = new q(context, eVar.f161386a);
        Notification notification = qVar.N;
        notification.icon = 2131232010;
        qVar.f202683e = q.e(aVar.getString(R.string.lbl_activation_failed));
        qVar.f202684f = q.e(aVar.getString(R.string.pn_activation_failed_body));
        qVar.B = StringLookupFactory.KEY_SYS;
        notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
        qVar.f202691m = 1;
        qVar.f202686h = this.f33783g.h(context, j8);
        Notification notificationC = qVar.c();
        notificationC.flags = 16;
        f.f161394a.getClass();
        f.a.f(context, notificationC, 52, eVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/setup/presentation/inreach/InReachSubscriptionPollingWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "WORKER_TAG", "KEY_DEVICE_ID", "KEY_REFERENCE_ID", "KEY_PURCHASE_TIMESTAMP", "", "ONE_HOUR_MS", "J", "POLLING_INTERVAL_MS", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(long j8, long j14, String str) {
            str.getClass();
            Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).getF104108a();
            androidx.work.c.a aVar = new androidx.work.c.a();
            Long lValueOf = Long.valueOf(j8);
            LinkedHashMap linkedHashMap = aVar.f11467a;
            linkedHashMap.put("key_device_id", lValueOf);
            linkedHashMap.put("key_purchase_timestamp", Long.valueOf(j14));
            linkedHashMap.put("key_reference_id", str);
            androidx.work.c cVarA = aVar.a();
            x.a aVar2 = new x.a((Class<? extends androidx.work.d>) InReachSubscriptionPollingWorker.class);
            ue.f.a aVar3 = new ue.f.a();
            aVar3.b(v.CONNECTED);
            aVar2.f170098c.f26950j = aVar3.a();
            x xVarA = aVar2.f(cVarA).a();
            i0.f170088a.getClass();
            i0.a.a(contextC).c(org.apache.commons.lang3.e.e(j8, "SubscriptionPollingWork_"), l.REPLACE, xVarA);
        }

        private a() {
        }
    }
}
