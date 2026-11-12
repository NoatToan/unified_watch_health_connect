package bu;

import am.j;
import am.x0;
import am.z0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m63.q0;
import m63.y1;
import o13.r;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import ot.b0;
import ot.c0;
import ot.k;
import ot.l;
import ot.n;
import ot.q;
import ot.t;
import ot.u;
import ot.y;
import ot.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.b1;
import p13.h0;
import p13.u0;
import to.o;
import tt.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbu/f;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f21180a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21181b = (a) KoinJavaComponent.get$default(a.class, null, null, 6, null);

    private f() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:36|21|(1:40)(1:24)) */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r1 = r9;
        r9 = r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:25:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ac -> B:29:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, String str, v13.c cVar) {
        c cVar2;
        int i14;
        String str2;
        String str3;
        Object objA;
        fVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i15 = cVar2.f21168e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar2.f21168e = i15 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(fVar, cVar);
            }
        } else {
            cVar2 = new c(fVar, cVar);
        }
        Object obj = cVar2.f21166c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = cVar2.f21168e;
        if (i16 == 0) {
            r.b(obj);
            i14 = 2;
            str2 = str;
            if (i14 > 0) {
                return null;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "AnnualReportRemoteResourceManager", "Getting " + str2 + " from the web");
            a aVar3 = f21181b;
            String str4 = ("/images/annual-report/" + ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).a() + "/") + str2;
            cVar2.f21164a = str2;
            cVar2.f21165b = i14;
            cVar2.f21168e = 1;
            objA = aVar3.a(str4, cVar2);
            if (objA == aVar) {
                return aVar;
            }
            str3 = str2;
            obj = objA;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = cVar2.f21165b;
            str3 = cVar2.f21164a;
            try {
                r.b(obj);
            } catch (Exception e4) {
                Exception e14 = e4;
                i14--;
                if (i14 <= 0) {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.g(a2Var2, "AnnualReportRemoteResourceManager", e14);
                } else {
                    String strM = j.m("Retrying to fetch ", str3, " from the web");
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var3, "AnnualReportRemoteResourceManager", strM);
                }
                str2 = str3;
                if (i14 > 0) {
                    return null;
                }
                i2.a aVar6 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar6.getClass();
                i2.a.b(a2Var4, "AnnualReportRemoteResourceManager", "Getting " + str2 + " from the web");
                a aVar7 = f21181b;
                String str5 = ("/images/annual-report/" + ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).a() + "/") + str2;
                cVar2.f21164a = str2;
                cVar2.f21165b = i14;
                cVar2.f21168e = 1;
                objA = aVar7.a(str5, cVar2);
                if (objA == aVar) {
                    return aVar;
                }
                str3 = str2;
                obj = objA;
            }
        }
        return ((a0) obj).f25746b;
    }

    public static final void b(f fVar, Context context, String str, List list) {
        fVar.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("annual_report_remote_resource_record", 0);
        String string = sharedPreferences.getString("annual_report_remote_resource_record_key", "{}");
        String str2 = string != null ? string : "{}";
        n63.b.a aVar = n63.b.f123892d;
        aVar.getClass();
        y1 y1Var = y1.f117048a;
        LinkedHashMap linkedHashMapN = u0.n((Map) aVar.c(new q0(y1Var, new m63.e(y1Var)), str2));
        linkedHashMapN.put(str, list);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("annual_report_remote_resource_record_key", aVar.b(new q0(y1Var, new m63.e(y1Var)), linkedHashMapN));
        editorEdit.apply();
    }

    public static boolean c(Context context, String str) {
        String string = context.getSharedPreferences("annual_report_remote_resource_record", 0).getString("annual_report_remote_resource_record_key", "{}");
        String str2 = string != null ? string : "{}";
        n63.b.a aVar = n63.b.f123892d;
        aVar.getClass();
        y1 y1Var = y1.f117048a;
        List list = (List) ((Map) aVar.c(new q0(y1Var, new m63.e(y1Var)), str2)).get(str);
        return list != null && (list.isEmpty() ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap d(Context context, l lVar, String str) {
        n nVarF;
        context.getClass();
        str.getClass();
        if ((lVar instanceof g) && (nVarF = f((g) lVar)) != null) {
            return BitmapFactory.decodeFile(new File(context.getFilesDir(), h(new h.c(nVarF), str).toString()).getPath());
        }
        return null;
    }

    public static String e(Context context, g gVar, String str) throws IOException {
        h cVar;
        context.getClass();
        if (!(gVar instanceof b0) || (gVar instanceof c0) || (gVar instanceof t)) {
            n nVarF = f(gVar);
            if (nVarF == null) {
                return "";
            }
            cVar = new h.c(nVarF);
        } else {
            cVar = h.d.f21188a;
        }
        File file = new File(context.getFilesDir(), h(cVar, str).toString());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), d53.c.f57666b), 8192);
        try {
            String strE = lg.d.E(bufferedReader);
            bufferedReader.close();
            return strE;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(bufferedReader, th3);
                throw th4;
            }
        }
    }

    public static n f(g gVar) {
        if (gVar instanceof c0) {
            return n.STEPS;
        }
        if (gVar instanceof t) {
            return n.PUSHES;
        }
        if (gVar instanceof z) {
            return n.SLEEP_SCORE;
        }
        if (gVar instanceof y) {
            return n.SLEEP;
        }
        if (gVar instanceof q) {
            return n.BODY_BATTERY;
        }
        if (gVar instanceof ot.j) {
            return n.ACTIVITY_SUMMARY;
        }
        if (gVar instanceof k) {
            return n.ACTIVITY_TIME;
        }
        if (gVar instanceof ot.f) {
            return n.ACTIVITY_DISTANCE;
        }
        if (gVar instanceof ot.d) {
            return n.ACTIVITY_ELEVATION;
        }
        if (gVar instanceof ot.e) {
            return n.ACTIVITY_CALORIES;
        }
        if (gVar instanceof ot.b) {
            return n.ACHIEVEMENTS;
        }
        if (gVar instanceof u) {
            return n.RECAP;
        }
        return null;
    }

    public static List g(i iVar) {
        Set setE = b1.e(h.b.f21184a);
        if (iVar.getSteps() != null) {
            setE.add(h.d.f21188a);
            setE.add(new h.c(n.STEPS));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getPushes() != null) {
            setE.add(h.d.f21188a);
            setE.add(new h.c(n.PUSHES));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getSleepScore() != null) {
            setE.add(h.d.f21188a);
            setE.add(new h.c(n.SLEEP_SCORE));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getSleep() != null) {
            setE.add(h.d.f21188a);
            setE.add(new h.c(n.SLEEP));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getBodyBattery() != null) {
            setE.add(new h.c(n.BODY_BATTERY));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getActivitySummary() != null) {
            setE.add(new h.c(n.ACTIVITY_SUMMARY));
            setE.add(new h.c(n.RECAP));
            List<tt.h> listC = iVar.getActivitySummary().c();
            if (listC != null) {
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    o activityType = ((tt.h) it.next()).getActivityType();
                    setE.add(new h.a(z0.l(x0.f4346x, activityType != null ? activityType.j() : null)));
                }
            }
        }
        if (iVar.getActivityTime() != null) {
            setE.add(h.d.f21188a);
            setE.add(new h.c(n.ACTIVITY_TIME));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getActivityDistance() != null) {
            setE.add(new h.c(n.ACTIVITY_DISTANCE));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getActivityElevation() != null) {
            setE.add(new h.c(n.ACTIVITY_ELEVATION));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getActivityCalories() != null) {
            setE.add(h.d.f21188a);
            setE.add(new h.c(n.ACTIVITY_CALORIES));
            setE.add(new h.c(n.RECAP));
        }
        if (iVar.getAchievements() != null) {
            setE.add(new h.c(n.ACHIEVEMENTS));
            setE.add(new h.c(n.RECAP));
        }
        return h0.b1(setE);
    }

    public static Path h(h hVar, String str) {
        Path path = Paths.get(androidx.room.a0.j("annual_report_remote_resource_local_file/", hVar.getF21187b(), "/", str), new String[0]);
        path.getClass();
        return path;
    }

    public static Uri i(Context context, h hVar, String str) {
        hVar.getClass();
        Uri uriFromFile = Uri.fromFile(new File(context.getFilesDir(), h(hVar, str).toString()));
        uriFromFile.getClass();
        return uriFromFile;
    }

    public static void k(Context context) {
        context.getClass();
        String strH = com.airbnb.lottie.animation.keyframe.a.h("Deleting resource... success = ", a23.g.d(new File(context.getFilesDir(), "annual_report_remote_resource_local_file")));
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportRemoteResourceManager", strH);
        SharedPreferences sharedPreferences = context.getSharedPreferences("annual_report_remote_resource_record", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove("annual_report_remote_resource_record_key");
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Context context, i iVar, v13.c cVar) throws Throwable {
        d dVar;
        Iterator it;
        int i14;
        Object objE0;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i15 = dVar.f21174f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f21174f = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f21172d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar.f21174f;
        if (i16 == 0) {
            r.b(obj);
            it = g(iVar).iterator();
            i14 = 0;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = dVar.f21171c;
            it = dVar.f21170b;
            Context context2 = dVar.f21169a;
            r.b(obj);
            i14 = i17;
            context = context2;
        }
        while (it.hasNext()) {
            h hVar = (h) it.next();
            dVar.f21169a = context;
            dVar.f21170b = it;
            dVar.f21171c = i14;
            dVar.f21174f = 1;
            f21180a.getClass();
            String strG = tn.k.g(hVar.getF21187b(), ".zip");
            if (c(context, strG)) {
                String strConcat = strG.concat(" is already downloaded");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "AnnualReportRemoteResourceManager", strConcat);
                objE0 = Unit.INSTANCE;
            } else {
                x53.c cVar2 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new e(strG, context, hVar, null), dVar);
                if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                    objE0 = Unit.INSTANCE;
                }
            }
            if (objE0 == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
