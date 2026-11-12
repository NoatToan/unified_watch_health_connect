package kk0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.v2;
import java.io.File;
import java.time.DateTimeException;
import java.time.ZonedDateTime;
import java.util.List;
import kotlinx.datetime.DateTimeArithmeticException;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkk0/o0;", "Lkk0/j0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lkk0/i0;", "webDataAPI", "Lvk0/c;", "gearPreferences", "<init>", "(Lkk0/i0;Lvk0/c;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 implements j0, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f105090c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f105091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk0.c f105092b;

    public o0(i0 i0Var, vk0.c cVar) {
        i0Var.getClass();
        cVar.getClass();
        this.f105091a = i0Var;
        this.f105092b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:105:0x0204 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x0205  */
    /* JADX WARN: Code duplicated, block: B:108:0x0209  */
    /* JADX WARN: Code duplicated, block: B:111:0x0210  */
    /* JADX WARN: Code duplicated, block: B:113:0x0213  */
    /* JADX WARN: Code duplicated, block: B:119:0x0233  */
    /* JADX WARN: Code duplicated, block: B:121:0x0240 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x0241  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b A[PHI: r0 r1
      0x004b: PHI (r0v31 java.lang.Object) = (r0v29 java.lang.Object), (r0v1 java.lang.Object) binds: [B:98:0x01e1, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x004b: PHI (r1v22 java.io.File) = (r1v20 java.io.File), (r1v29 java.io.File) binds: [B:98:0x01e1, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0120 A[PHI: r15
      0x0120: PHI (r15v4 int) = (r15v0 int), (r15v11 int) binds: [B:62:0x0133, B:55:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022a, code lost:
    
        if (r0 == r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
    
        if (r0 == r7) goto L115;
     */
    @Override // kk0.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, v13.c cVar) throws Throwable {
        k0 k0Var;
        Long l14;
        int length;
        File file;
        int iG;
        File file2;
        Object obj;
        Object objE0;
        List list;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f105065e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f105065e = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        k0 k0Var2 = k0Var;
        Object objE1 = k0Var2.f105063c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var2.f105065e;
        vk0.c cVar2 = this.f105092b;
        List list2 = null;
        if (i15 != 0) {
            if (i15 == 1) {
                file = k0Var2.f105061a;
                o13.r.b(objE1);
            } else {
                if (i15 == 2) {
                    file = k0Var2.f105061a;
                    o13.r.b(objE1);
                    file2 = file;
                    obj = (v2) objE1;
                    if (!(obj instanceof v2.b)) {
                        if (!(obj instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        if (!file2.exists()) {
                            file2 = null;
                        }
                        if (file2 != null) {
                            k0Var2.f105061a = null;
                            k0Var2.f105062b = (v2.a) obj;
                            k0Var2.f105065e = 4;
                            x53.c cVar3 = s0.f129406a;
                            objE1 = ge1.b.e0(x53.b.f189152a, new m0(file2, null), k0Var2);
                        }
                        list = list2;
                        if (list != null) {
                            return new v2.b(list, 200, null, null, 12, null);
                        }
                        return obj;
                    }
                    k0Var2.f105061a = null;
                    k0Var2.f105062b = null;
                    k0Var2.f105065e = 3;
                    x53.c cVar4 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new n0((v2.b) obj, file2, cVar2, this, null), k0Var2);
                    if (objE0 != aVar) {
                        return objE0;
                    }
                    return aVar;
                }
                if (i15 == 3) {
                    o13.r.b(objE1);
                    return objE1;
                }
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = k0Var2.f105062b;
                o13.r.b(objE1);
            }
            list2 = (List) objE1;
            list = list2;
            if (list != null) {
                return new v2.b(list, 200, null, null, 12, null);
            }
            return obj;
        }
        o13.r.b(objE1);
        Long lB = cVar2.b();
        if (lB != null) {
            long jLongValue = lB.longValue();
            b63.l.INSTANCE.getClass();
            b63.l lVarA = b63.l.Companion.a(jLongValue);
            b63.f fVarA = b63.h.a(0, 1, 0, 0, 0, 0L, 0);
            b63.z.INSTANCE.getClass();
            try {
                try {
                    ZonedDateTime zonedDateTimeAtZone = lVarA.f16204a.atZone(b63.z.Companion.a().f16227a);
                    zonedDateTimeAtZone.getClass();
                    if (fVarA.getF16178a() != 0) {
                        zonedDateTimeAtZone = zonedDateTimeAtZone.plusMonths(fVarA.getF16178a());
                    }
                    if (fVarA.getF16179b() != 0) {
                        zonedDateTimeAtZone = zonedDateTimeAtZone.plusDays(fVarA.getF16179b());
                    }
                    if (fVarA.getF16186c() != 0) {
                        zonedDateTimeAtZone = zonedDateTimeAtZone.plusNanos(fVarA.getF16186c());
                    }
                    l14 = new Long(new b63.l(zonedDateTimeAtZone.toInstant()).c());
                } catch (DateTimeException e4) {
                    throw new DateTimeArithmeticException(e4);
                }
            } catch (DateTimeException e14) {
                throw new DateTimeArithmeticException(e14);
            }
        } else {
            l14 = null;
        }
        File filesDir = context.getFilesDir();
        filesDir.getClass();
        File file3 = new File(am.j.m("gear", File.separator, "brands_models.json"));
        String path = file3.getPath();
        path.getClass();
        char c14 = File.separatorChar;
        int iG2 = d53.w.G(c14, 0, 4, path);
        if (iG2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c14 || (iG = d53.w.G(c14, 2, 4, path)) < 0) {
                length = 1;
            } else {
                iG2 = d53.w.G(c14, iG + 1, 4, path);
                if (iG2 >= 0) {
                    length = iG2 + 1;
                } else {
                    length = path.length();
                }
            }
        } else if (iG2 <= 0 || path.charAt(iG2 - 1) != ':') {
            length = (iG2 == -1 && d53.w.D(path, CoreConstants.COLON_CHAR)) ? path.length() : 0;
        } else {
            length = iG2 + 1;
        }
        if (length > 0) {
            file = file3;
        } else {
            String string = filesDir.toString();
            string.getClass();
            if ((string.length() == 0) || d53.w.D(string, c14)) {
                file = new File(string + file3);
            } else {
                file = new File(string + c14 + file3);
            }
        }
        if (l14 == null || !file.exists() || l14.longValue() <= b63.a.C0229a.f16171a.a().c()) {
            l0 l0Var = new l0(this, null);
            k0Var2.f105061a = file;
            k0Var2.f105065e = 2;
            objE1 = com.garmin.android.apps.connectmobile.f0.J(this, l0Var, k0Var2);
            if (objE1 != aVar) {
                file2 = file;
                obj = (v2) objE1;
                if (!(obj instanceof v2.b)) {
                    if (!(obj instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    if (!file2.exists()) {
                        file2 = null;
                    }
                    if (file2 != null) {
                        k0Var2.f105061a = null;
                        k0Var2.f105062b = (v2.a) obj;
                        k0Var2.f105065e = 4;
                        x53.c cVar5 = s0.f129406a;
                        objE1 = ge1.b.e0(x53.b.f189152a, new m0(file2, null), k0Var2);
                    }
                    list = list2;
                    if (list != null) {
                        return new v2.b(list, 200, null, null, 12, null);
                    }
                    return obj;
                }
                k0Var2.f105061a = null;
                k0Var2.f105062b = null;
                k0Var2.f105065e = 3;
                x53.c cVar6 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new n0((v2.b) obj, file2, cVar2, this, null), k0Var2);
                if (objE0 != aVar) {
                    return objE0;
                }
            }
        } else {
            k0Var2.f105061a = file;
            k0Var2.f105065e = 1;
            x53.c cVar7 = s0.f129406a;
            objE1 = ge1.b.e0(x53.b.f189152a, new m0(file, null), k0Var2);
        }
        return aVar;
        List list3 = (List) objE1;
        if (list3 != null) {
            return new v2.b(list3, 200, null, null, 12, null);
        }
        l0 l0Var2 = new l0(this, null);
        k0Var2.f105061a = file;
        k0Var2.f105065e = 2;
        objE1 = com.garmin.android.apps.connectmobile.f0.J(this, l0Var2, k0Var2);
        if (objE1 != aVar) {
            file2 = file;
            obj = (v2) objE1;
            if (!(obj instanceof v2.b)) {
                if (!(obj instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                if (!file2.exists()) {
                    file2 = null;
                }
                if (file2 != null) {
                    k0Var2.f105061a = null;
                    k0Var2.f105062b = (v2.a) obj;
                    k0Var2.f105065e = 4;
                    x53.c cVar8 = s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new m0(file2, null), k0Var2);
                }
                list = list2;
                if (list != null) {
                    return new v2.b(list, 200, null, null, 12, null);
                }
                return obj;
            }
            k0Var2.f105061a = null;
            k0Var2.f105062b = null;
            k0Var2.f105065e = 3;
            x53.c cVar9 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new n0((v2.b) obj, file2, cVar2, this, null), k0Var2);
            if (objE0 != aVar) {
                return objE0;
            }
        }
        return aVar;
    }
}
