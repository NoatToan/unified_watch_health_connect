package com.garmin.device.filetransfer.core.background;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.m;
import o13.r;
import o13.t;
import o53.s;
import ok2.a0;
import ok2.f0;
import ok2.y;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import p13.w;
import t13.d;
import u91.i;
import v13.c;
import v13.e;
import vb.h;
import vc0.v;
import vk2.g;
import z6.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/device/filetransfer/core/background/BackgroundTransferWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BackgroundTransferWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f50764q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f50765r = 25620000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f50766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f50767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f50768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f50769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f50770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f50771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f50772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f50773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f50774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f50775p;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "com.garmin.device.filetransfer.core.background.BackgroundTransferWorker", f = "BackgroundTransferWorker.kt", l = {165, 190}, m = "doWork")
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BackgroundTransferWorker f50776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50777b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f50779d;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f50777b = obj;
            this.f50779d |= Integer.MIN_VALUE;
            return BackgroundTransferWorker.this.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundTransferWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f50766g = "BackgroundTransferWorker";
        this.f50767h = m.b(new v(this, 9));
        this.f50774o = 120000L;
        this.f50775p = 15000L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) throws Throwable {
        b bVar;
        BackgroundTransferWorker backgroundTransferWorker;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f50779d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f50779d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objG = bVar.f50777b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f50779d;
        if (i15 == 0) {
            r.b(objG);
            WorkerParameters workerParameters = this.f11470b;
            androidx.work.c cVar = workerParameters.f11427b;
            androidx.work.c cVar2 = workerParameters.f11427b;
            String strE = cVar.e("key_tag");
            if (strE != null) {
                this.f50766g = strE;
            }
            this.f50768i = cVar2.e("key_connection_id");
            this.f50770k = cVar2.e("key_notification_title");
            this.f50771l = cVar2.e("key_notification_message");
            this.f50772m = new Integer(cVar2.c("key_notification_icon", -1));
            this.f50769j = cVar2.e("key_notification_channel");
            this.f50773n = cVar2.a("key_notification_progress", false);
            bVar.f50776a = this;
            bVar.f50779d = 1;
            objG = g();
            if (objG != aVar) {
                backgroundTransferWorker = this;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objG);
                return objG;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        backgroundTransferWorker = bVar.f50776a;
        r.b(objG);
        androidx.work.d.a aVar2 = (androidx.work.d.a) objG;
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a0.f132585h.a().getConfiguration();
            try {
                g gVarH = backgroundTransferWorker.h();
                if (gVarH == null || gVarH.f178677i.isEmpty()) {
                    return new androidx.work.d.a.c();
                }
                bVar.f50776a = null;
                bVar.f50779d = 2;
                Object objD = backgroundTransferWorker.d(gVarH, bVar);
                return objD == aVar ? aVar : objD;
            } catch (Exception e4) {
                backgroundTransferWorker.f().error("Error occurred when starting background sync", (Throwable) e4);
                return new androidx.work.d.a.b();
            }
        } catch (Exception e14) {
            backgroundTransferWorker.f().warn("Unable to doWork, TransferHelper not configured: " + e14.getMessage());
            return new androidx.work.d.a.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b1 A[Catch: Exception -> 0x0108, TRY_ENTER, TryCatch #5 {Exception -> 0x0108, blocks: (B:44:0x00b1, B:47:0x00bf, B:49:0x00c6, B:55:0x00fe, B:52:0x00f9, B:70:0x0121), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf A[Catch: Exception -> 0x0108, TryCatch #5 {Exception -> 0x0108, blocks: (B:44:0x00b1, B:47:0x00bf, B:49:0x00c6, B:55:0x00fe, B:52:0x00f9, B:70:0x0121), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[Catch: Exception -> 0x0108, TryCatch #5 {Exception -> 0x0108, blocks: (B:44:0x00b1, B:47:0x00bf, B:49:0x00c6, B:55:0x00fe, B:52:0x00f9, B:70:0x0121), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[Catch: Exception -> 0x0108, TryCatch #5 {Exception -> 0x0108, blocks: (B:44:0x00b1, B:47:0x00bf, B:49:0x00c6, B:55:0x00fe, B:52:0x00f9, B:70:0x0121), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe A[Catch: Exception -> 0x0108, TRY_LEAVE, TryCatch #5 {Exception -> 0x0108, blocks: (B:44:0x00b1, B:47:0x00bf, B:49:0x00c6, B:55:0x00fe, B:52:0x00f9, B:70:0x0121), top: B:84:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        if (r4.a(r5) == r6) goto L65;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00c6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [vk2.g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.garmin.device.filetransfer.core.background.BackgroundTransferWorker] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(g gVar, c cVar) throws Throwable {
        vk2.d dVar;
        vk2.e eVar;
        BackgroundTransferWorker backgroundTransferWorker;
        rs2.c cVar2;
        Notification notificationE;
        BackgroundTransferWorker backgroundTransferWorker2;
        Object objK;
        vk2.e eVar2;
        BackgroundTransferWorker backgroundTransferWorker3;
        ?? r14 = "No sync started within timeout. Try again later. ";
        if (cVar instanceof vk2.d) {
            dVar = (vk2.d) cVar;
            int i14 = dVar.f178657e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f178657e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new vk2.d(this, cVar);
            }
        } else {
            dVar = new vk2.d(this, cVar);
        }
        Object objA = dVar.f178655c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r15 = dVar.f178657e;
        try {
            try {
                if (r15 == 0) {
                    r.b(objA);
                    try {
                        long j8 = this.f50774o;
                        if (j8 < 120000) {
                            throw new IllegalArgumentException("syncStartTimeout: " + j8 + " below minimum 120000");
                        }
                        long j14 = this.f50775p;
                        if (j14 >= 15000) {
                            eVar = new vk2.e(this.f50768i, null, null, this.f50766g, new uo1.a(this, 16), j14, 6, null);
                        } else {
                            h.s(androidx.room.a0.f(j14, "syncFinishTimeout: ", " below minimum 15000"));
                            eVar = null;
                        }
                        try {
                            dVar.f178653a = this;
                            dVar.f178654b = eVar;
                            dVar.f178657e = 1;
                            objA = gVar.a(dVar);
                            if (objA != aVar) {
                                backgroundTransferWorker = this;
                                cVar2 = (rs2.c) objA;
                                if (cVar2 == null) {
                                    eVar.f178660c.j(eVar);
                                    return new androidx.work.d.a.c();
                                }
                                notificationE = backgroundTransferWorker.e(cVar2, 0);
                                if (notificationE != null) {
                                    backgroundTransferWorker.f().info("Run in foreground: " + notificationE);
                                    ue.m mVar = new ue.m(7000, notificationE);
                                    dVar.f178653a = backgroundTransferWorker;
                                    dVar.f178654b = eVar;
                                    dVar.f178657e = 2;
                                    WorkerParameters workerParameters = backgroundTransferWorker.f11470b;
                                    objK = lg.d.k(workerParameters.f11432g.a(backgroundTransferWorker.f11469a, workerParameters.f11426a, mVar), dVar);
                                    if (objK == aVar) {
                                        objK = Unit.INSTANCE;
                                    }
                                    if (objK == aVar) {
                                        objK = Unit.INSTANCE;
                                    }
                                    if (objK != aVar) {
                                        eVar2 = eVar;
                                        backgroundTransferWorker3 = backgroundTransferWorker;
                                        eVar = eVar2;
                                        backgroundTransferWorker2 = backgroundTransferWorker3;
                                        dVar.f178653a = backgroundTransferWorker2;
                                        dVar.f178654b = null;
                                        dVar.f178657e = 3;
                                        r14 = backgroundTransferWorker2;
                                    }
                                } else {
                                    backgroundTransferWorker2 = backgroundTransferWorker;
                                    dVar.f178653a = backgroundTransferWorker2;
                                    dVar.f178654b = null;
                                    dVar.f178657e = 3;
                                    r14 = backgroundTransferWorker2;
                                }
                            }
                            return aVar;
                        } catch (Exception e4) {
                            e = e4;
                            backgroundTransferWorker = this;
                            backgroundTransferWorker.f().warn("No sync started within timeout. Try again later. " + e.getMessage());
                            eVar.f178660c.j(eVar);
                            return new androidx.work.d.a.b();
                        }
                    } catch (Exception e14) {
                        e = e14;
                        r14 = this;
                        r14.f().error("Error occurred when starting background syncs", (Throwable) e);
                        return new androidx.work.d.a.b();
                    }
                }
                if (r15 == 1) {
                    eVar = dVar.f178654b;
                    backgroundTransferWorker = dVar.f178653a;
                    try {
                        r.b(objA);
                        cVar2 = (rs2.c) objA;
                        if (cVar2 == null) {
                            eVar.f178660c.j(eVar);
                            return new androidx.work.d.a.c();
                        }
                        notificationE = backgroundTransferWorker.e(cVar2, 0);
                        if (notificationE != null) {
                            backgroundTransferWorker.f().info("Run in foreground: " + notificationE);
                            ue.m mVar2 = new ue.m(7000, notificationE);
                            dVar.f178653a = backgroundTransferWorker;
                            dVar.f178654b = eVar;
                            dVar.f178657e = 2;
                            WorkerParameters workerParameters2 = backgroundTransferWorker.f11470b;
                            objK = lg.d.k(workerParameters2.f11432g.a(backgroundTransferWorker.f11469a, workerParameters2.f11426a, mVar2), dVar);
                            if (objK == aVar) {
                                objK = Unit.INSTANCE;
                            }
                            if (objK == aVar) {
                                objK = Unit.INSTANCE;
                            }
                            if (objK != aVar) {
                                eVar2 = eVar;
                                backgroundTransferWorker3 = backgroundTransferWorker;
                                eVar = eVar2;
                                backgroundTransferWorker2 = backgroundTransferWorker3;
                                dVar.f178653a = backgroundTransferWorker2;
                                dVar.f178654b = null;
                                dVar.f178657e = 3;
                                r14 = backgroundTransferWorker2;
                            }
                        } else {
                            backgroundTransferWorker2 = backgroundTransferWorker;
                            dVar.f178653a = backgroundTransferWorker2;
                            dVar.f178654b = null;
                            dVar.f178657e = 3;
                            r14 = backgroundTransferWorker2;
                        }
                        return aVar;
                    } catch (Exception e15) {
                        e = e15;
                        backgroundTransferWorker.f().warn("No sync started within timeout. Try again later. " + e.getMessage());
                        eVar.f178660c.j(eVar);
                        return new androidx.work.d.a.b();
                    }
                }
                if (r15 == 2) {
                    eVar2 = dVar.f178654b;
                    backgroundTransferWorker3 = dVar.f178653a;
                    try {
                        r.b(objA);
                        eVar = eVar2;
                        backgroundTransferWorker2 = backgroundTransferWorker3;
                        dVar.f178653a = backgroundTransferWorker2;
                        dVar.f178654b = null;
                        dVar.f178657e = 3;
                        r14 = backgroundTransferWorker2;
                    } catch (Exception e16) {
                        e = e16;
                        r14 = backgroundTransferWorker3;
                        r14.f().error("Error occurred when starting background syncs", (Throwable) e);
                        return new androidx.work.d.a.b();
                    }
                } else {
                    if (r15 != 3) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    BackgroundTransferWorker backgroundTransferWorker4 = dVar.f178653a;
                    r.b(objA);
                    r14 = backgroundTransferWorker4;
                }
                return new androidx.work.d.a.c();
            } catch (Exception e17) {
                e = e17;
            }
        } catch (Exception e18) {
            e = e18;
            r14 = r15;
        }
    }

    public final Notification e(rs2.c cVar, int i14) {
        cVar.getClass();
        Context context = this.f11469a;
        q qVar = new q(context, "BACKGROUND_SYNC");
        String str = this.f50770k;
        if (str != null) {
            qVar.f202683e = q.e(str);
            String str2 = this.f50770k;
            if (str2 != null) {
                qVar.m(str2);
                x0 x0Var = x0.f105818a;
                String str3 = this.f50771l;
                if (str3 != null) {
                    qVar.f202684f = q.e(String.format(str3, Arrays.copyOf(new Object[]{cVar.getF92742f()}, 1)));
                    Integer num = this.f50772m;
                    if (num != null) {
                        qVar.N.icon = num.intValue();
                        qVar.i(2, true);
                        if (this.f50773n) {
                            qVar.f202697s = 100;
                            qVar.f202698t = i14;
                            qVar.f202699u = false;
                        }
                        String str4 = this.f50769j;
                        if (str4 != null) {
                            NotificationChannel notificationChannel = new NotificationChannel("BACKGROUND_SYNC", str4, 2);
                            Object systemService = context.getSystemService("notification");
                            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                            if (notificationManager != null) {
                                notificationManager.createNotificationChannel(notificationChannel);
                            }
                            return qVar.c();
                        }
                    }
                }
            }
        }
        return null;
    }

    public final Logger f() {
        Object value = this.f50767h.getValue();
        value.getClass();
        return (Logger) value;
    }

    public Object g() {
        return null;
    }

    public final g h() {
        List listC;
        String str = this.f50768i;
        if (str == null) {
            listC = a0.f132585h.a().e();
        } else {
            ok2.g gVarD = a0.f132585h.a().d(str);
            if (gVarD == null) {
                return null;
            }
            listC = w.c(gVarD);
        }
        List<ok2.g> list = listC;
        if (list.isEmpty()) {
            f().debug("requestSyncStart skipped: no Sync 2.0 managers found");
            return null;
        }
        g gVar = new g(str, null, this.f50766g, this.f50774o, 0L, 18, null);
        HashSet<String> hashSet = new HashSet();
        for (ok2.g gVar2 : list) {
            rs2.c cVar = gVar2.f132682a;
            f0 f0Var = gVar2.f132691j;
            y yVarI = i(cVar);
            i iVar = new i(27, gVar, gVar2);
            if (yVarI != null) {
                f0Var.r(yVarI, iVar);
                hashSet.add(cVar.getF92741e());
            } else if (gVar2.I(null, this.f50766g)) {
                ok2.w.a.a(f0Var, null, iVar, 1);
                hashSet.add(cVar.getF92741e());
            }
        }
        HashSet hashSet2 = new HashSet(hashSet);
        for (String str2 : hashSet) {
            al2.c cVar2 = gVar.f178678j.get(str2);
            if ((cVar2 != null ? cVar2.f3777c : null) == al2.b.NO_ITEMS) {
                hashSet2.remove(str2);
            }
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = gVar.f178677i;
        copyOnWriteArraySet.addAll(hashSet2);
        boolean zIsEmpty = copyOnWriteArraySet.isEmpty();
        a0 a0Var = gVar.f178671c;
        s sVar = gVar.f178676h;
        if (zIsEmpty) {
            sVar.g0(null);
            a0Var.j(gVar);
            return gVar;
        }
        if (sVar.isActive()) {
            a0Var.b(gVar);
        }
        return gVar;
    }

    public y i(rs2.c cVar) {
        return new y();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/garmin/device/filetransfer/core/background/BackgroundTransferWorker$a;", "", "<init>", "()V", "", "SYNC_START_TIMEOUT", "J", "SYNC_END_TIMEOUT", "", "NOTIFICATION_ID", "I", "", "NOTIFICATION_CHANNEL_ID", "Ljava/lang/String;", "KEY_TAG", "KEY_CONNECTION_ID", "KEY_NOTIFICATION_TITLE", "KEY_NOTIFICATION_MESSAGE", "KEY_NOTIFICATION_ICON", "KEY_NOTIFICATION_PROGRESS", "KEY_NOTIFICATION_CHANNEL", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static androidx.work.c.a a(String str, vk2.a aVar, String str2) {
            androidx.work.c.a aVar2 = new androidx.work.c.a();
            LinkedHashMap linkedHashMap = aVar2.f11467a;
            linkedHashMap.put("key_tag", str);
            if (str2 != null) {
                linkedHashMap.put("key_connection_id", str2);
            }
            if (aVar != null) {
                linkedHashMap.put("key_notification_title", aVar.f178644a);
                linkedHashMap.put("key_notification_message", aVar.f178645b);
                linkedHashMap.put("key_notification_icon", Integer.valueOf(aVar.f178646c));
                linkedHashMap.put("key_notification_channel", aVar.f178647d);
                linkedHashMap.put("key_notification_progress", Boolean.valueOf(aVar.f178648e));
            }
            return aVar2;
        }

        private a() {
        }
    }
}
