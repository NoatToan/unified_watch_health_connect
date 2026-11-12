package wd2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.library.livetrack.LivetrackService;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$notifyAppCreated$1", f = "LivetrackManager.kt", l = {162, 166, 168, TsExtractor.TS_STREAM_TYPE_AC4, SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f184659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f184660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f184661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd2.f1 f184662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f184663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l lVar, xd2.f1 f1Var, q qVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f184661c = lVar;
        this.f184662d = f1Var;
        this.f184663e = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f184661c, this.f184662d, this.f184663e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0140  */
    /* JADX WARN: Code duplicated, block: B:44:0x0142  */
    /* JADX WARN: Code duplicated, block: B:46:0x0148  */
    /* JADX WARN: Code duplicated, block: B:47:0x015b  */
    /* JADX WARN: Code duplicated, block: B:65:0x019e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f0 A[PHI: r2
      0x01f0: PHI (r2v39 java.util.List) = (r2v35 java.util.List), (r2v42 java.util.List) binds: [B:81:0x01e0, B:86:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0201  */
    /* JADX WARN: Code duplicated, block: B:98:0x0210  */
    /* JADX WARN: Code duplicated, block: B:99:0x0231  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0187, code lost:
    
        if (r2.d(null, r21) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c9, code lost:
    
        if (r2.d(null, r21) == r1) goto L84;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x019e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:98:0x0210, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map<Long, ge2.a> map;
        Object objI;
        List list;
        Logger logger;
        Logger logger2;
        g1 g1Var;
        List list2;
        Logger logger3;
        g1 g1Var2;
        LivetrackService livetrackService;
        LivetrackService livetrackService2;
        androidx.lifecycle.y0<com.garmin.android.library.livetrack.d> y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f184660b;
        q qVar = this.f184663e;
        l lVar = this.f184661c;
        if (i14 == 0) {
            o13.r.b(obj);
            lVar.getF104144a().getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            f12.l.f68084a.getClass();
            if (f12.l.a.a().Q3()) {
                rd2.f.a().f152045a.getClass();
                ArrayList<sd2.f> arrayListD = rd2.j.d();
                if (arrayListD != null) {
                    for (sd2.f fVar : arrayListD) {
                        if (nu0.c.c(fVar.getUnitID())) {
                            linkedHashMap.put(Long.valueOf(fVar.getUnitID()), new ge2.a(Boolean.TRUE, null, null, null, 14, null));
                        }
                    }
                }
            }
            ge2.e eVar = !GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_migration_grouptrack_gcs), false) ? new ge2.e(linkedHashMap, Boolean.valueOf(GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_live_tracking_email_sharing), false)), Boolean.valueOf(GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_user_wants_live_track_extend_sharing), false)), Boolean.valueOf(GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_live_tracking_privacy_selection), true)), Boolean.valueOf(GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_live_tracking_group_track), false)), null, null, 96, null) : null;
            if (eVar != null && (map = eVar.f77022a) != null && map.size() == 0) {
                Boolean bool = eVar.f77023b;
                Boolean bool2 = Boolean.FALSE;
                if (p005kotlin.jvm.internal.s.g(bool, bool2) && p005kotlin.jvm.internal.s.g(eVar.f77024c, bool2) && p005kotlin.jvm.internal.s.g(eVar.f77025d, Boolean.TRUE) && p005kotlin.jvm.internal.s.g(eVar.f77026e, bool2)) {
                    eVar = null;
                } else if (eVar == null) {
                    if (linkedHashMap.isEmpty()) {
                        eVar = null;
                    } else {
                        eVar = new ge2.e(linkedHashMap, null, null, null, null, null, null, 126, null);
                    }
                }
            } else if (eVar == null) {
                if (linkedHashMap.isEmpty()) {
                    eVar = new ge2.e(linkedHashMap, null, null, null, null, null, null, 126, null);
                } else {
                    eVar = null;
                }
            }
            if (eVar != null) {
                this.f184659a = null;
                this.f184660b = 1;
                if (q.b(qVar, lVar, eVar, this) != aVar) {
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    o13.r.b(obj);
                    objI = obj;
                    list = (List) objI;
                    logger = q.f184565h;
                    if (logger != null) {
                        logger.debug("Last known session infos: " + list);
                    }
                    if (!list.isEmpty()) {
                        logger3 = q.f184565h;
                        if (logger3 != null) {
                            logger3.debug("Nothing to restore, shutting down");
                        }
                        q.a aVar2 = q.f184563f;
                        this.f184659a = null;
                        this.f184660b = 4;
                    } else {
                        logger2 = q.f184565h;
                        if (logger2 != null) {
                            logger2.debug("Starting Livetrack service and attempting to restore sessions");
                        }
                        if (qVar.f184567b == null) {
                            qVar.d(lVar);
                            Unit unit = Unit.INSTANCE;
                        }
                        g1Var = qVar.f184567b;
                        if (g1Var != null) {
                            this.f184659a = list;
                            this.f184660b = 5;
                            if (g1Var.f(this) != aVar) {
                                list2 = list;
                            }
                        } else {
                            g1Var2 = qVar.f184567b;
                            if (g1Var2 != null) {
                                list.getClass();
                                if (g1Var2.d()) {
                                    livetrackService = g1Var2.f184472d;
                                    if (livetrackService != null && (y0Var = livetrackService.f50163c) != null) {
                                        g1Var2.f184473e.n(y0Var, g1Var2.f184474f);
                                    }
                                    livetrackService2 = g1Var2.f184472d;
                                    if (livetrackService2 != null) {
                                        l lVar2 = g1Var2.f184469a;
                                        livetrackService2.f50162b.debug("restoreLivetrackSessions: " + list);
                                        livetrackService2.f50164d = lVar2;
                                        ge1.b.T(livetrackService2, null, null, new com.garmin.android.library.livetrack.f(livetrackService2, list, lVar2, null), 3);
                                    }
                                } else {
                                    g1Var2.f184471c.error("restoreLivetrack: Not foreground started");
                                }
                            }
                        }
                    }
                    return aVar;
                }
                if (i14 != 4) {
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = this.f184659a;
                    o13.r.b(obj);
                }
                list = list2;
                g1Var2 = qVar.f184567b;
                if (g1Var2 != null) {
                    list.getClass();
                    if (g1Var2.d()) {
                        livetrackService = g1Var2.f184472d;
                        if (livetrackService != null) {
                            g1Var2.f184473e.n(y0Var, g1Var2.f184474f);
                        }
                        livetrackService2 = g1Var2.f184472d;
                        if (livetrackService2 != null) {
                            l lVar3 = g1Var2.f184469a;
                            livetrackService2.f50162b.debug("restoreLivetrackSessions: " + list);
                            livetrackService2.f50164d = lVar3;
                            ge1.b.T(livetrackService2, null, null, new com.garmin.android.library.livetrack.f(livetrackService2, list, lVar3, null), 3);
                        }
                    } else {
                        g1Var2.f184471c.error("restoreLivetrack: Not foreground started");
                    }
                }
            }
            o13.r.b(obj);
        } else {
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        if (lVar.getF104148e().d()) {
            this.f184659a = null;
            this.f184660b = 3;
            objI = this.f184662d.i(this);
            if (objI != aVar) {
                list = (List) objI;
                logger = q.f184565h;
                if (logger != null) {
                    logger.debug("Last known session infos: " + list);
                }
                if (!list.isEmpty()) {
                    logger2 = q.f184565h;
                    if (logger2 != null) {
                        logger2.debug("Starting Livetrack service and attempting to restore sessions");
                    }
                    if (qVar.f184567b == null) {
                        qVar.d(lVar);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    g1Var = qVar.f184567b;
                    if (g1Var != null) {
                        this.f184659a = list;
                        this.f184660b = 5;
                        if (g1Var.f(this) != aVar) {
                            list2 = list;
                            list = list2;
                            g1Var2 = qVar.f184567b;
                            if (g1Var2 != null) {
                                list.getClass();
                                if (g1Var2.d()) {
                                    livetrackService = g1Var2.f184472d;
                                    if (livetrackService != null) {
                                        g1Var2.f184473e.n(y0Var, g1Var2.f184474f);
                                    }
                                    livetrackService2 = g1Var2.f184472d;
                                    if (livetrackService2 != null) {
                                        l lVar4 = g1Var2.f184469a;
                                        livetrackService2.f50162b.debug("restoreLivetrackSessions: " + list);
                                        livetrackService2.f50164d = lVar4;
                                        ge1.b.T(livetrackService2, null, null, new com.garmin.android.library.livetrack.f(livetrackService2, list, lVar4, null), 3);
                                    }
                                } else {
                                    g1Var2.f184471c.error("restoreLivetrack: Not foreground started");
                                }
                            }
                        }
                    } else {
                        g1Var2 = qVar.f184567b;
                        if (g1Var2 != null) {
                            list.getClass();
                            if (g1Var2.d()) {
                                livetrackService = g1Var2.f184472d;
                                if (livetrackService != null) {
                                    g1Var2.f184473e.n(y0Var, g1Var2.f184474f);
                                }
                                livetrackService2 = g1Var2.f184472d;
                                if (livetrackService2 != null) {
                                    l lVar5 = g1Var2.f184469a;
                                    livetrackService2.f50162b.debug("restoreLivetrackSessions: " + list);
                                    livetrackService2.f50164d = lVar5;
                                    ge1.b.T(livetrackService2, null, null, new com.garmin.android.library.livetrack.f(livetrackService2, list, lVar5, null), 3);
                                }
                            } else {
                                g1Var2.f184471c.error("restoreLivetrack: Not foreground started");
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                logger3 = q.f184565h;
                if (logger3 != null) {
                    logger3.debug("Nothing to restore, shutting down");
                }
                q.a aVar3 = q.f184563f;
                this.f184659a = null;
                this.f184660b = 4;
            }
        } else {
            Logger logger4 = q.f184565h;
            if (logger4 != null) {
                logger4.warn("Livetrack feature is not enabled, shutting down");
            }
            q.a aVar4 = q.f184563f;
            this.f184659a = null;
            this.f184660b = 2;
        }
        return aVar;
    }
}
