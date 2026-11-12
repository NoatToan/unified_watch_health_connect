package com.garmin.android.apps.connectmobile.googlehealthconnect;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import c22.s3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.googlehealthconnect.data.database.GoogleHealthConnectDatabase;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.m1;
import o53.s0;
import okhttp3.internal.http.StatusLine;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p13.j0;
import p13.u;
import p3.c2;
import p3.p0;
import y8.a1;
import y8.d0;
import y8.d1;
import y8.o;
import y8.v;
import y8.w;
import y8.w0;
import y8.x;
import y8.x0;
import y8.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/i;", "Lcom/garmin/android/apps/connectmobile/googlehealthconnect/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbm0/a;", "googleHealthConnectRepository", "Lc22/k;", "appConfigurationDelegate", "<init>", "(Landroid/content/Context;Lbm0/a;Lc22/k;)V", "a", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements com.garmin.android.apps.connectmobile.googlehealthconnect.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f36065j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm0.a f36067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c22.k f36068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f36069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f36070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<k23.d<? extends d0>> f36071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<k23.d<? extends d0>> f36072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f36073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2 f36074i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36075a;

        static {
            int[] iArr = new int[dm0.a.values().length];
            try {
                iArr[dm0.a.WRITE_ACTIVE_CALORIES_BURNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dm0.a.WRITE_BODY_FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dm0.a.WRITE_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dm0.a.WRITE_ELEVATION_GAINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dm0.a.WRITE_EXERCISE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[dm0.a.WRITE_FLOORS_CLIMBED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[dm0.a.WRITE_HEART_RATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[dm0.a.WRITE_RESTING_HEART_RATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[dm0.a.WRITE_SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[dm0.a.WRITE_SPEED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[dm0.a.WRITE_STEPS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[dm0.a.WRITE_TOTAL_CALORIES_BURNED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[dm0.a.WRITE_WEIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f36075a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.googlehealthconnect.HealthConnectDelegateImpl$handleEditedActivity$1", f = "GoogleHealthConnectDelegateImpl.kt", l = {250, 255}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f36076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f36077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f36078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f36079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f36080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public k23.d f36081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f36083h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f36084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f36085j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Instant f36087l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Instant f36088m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Instant instant, Instant instant2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f36087l = instant;
            this.f36088m = instant2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = i.this.new c(this.f36087l, this.f36088m, dVar);
            cVar.f36085j = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006d  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ae  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
        
            if (r15 == r2) goto L29;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0096 -> B:20:0x0099). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            i iVar;
            int i14;
            Collection collection;
            int i15;
            Instant instant;
            Iterator it3;
            Instant instant2;
            i iVar2;
            int i16;
            Object next;
            k23.d dVar;
            Object objB;
            b0 b0Var = (b0) this.f36085j;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = this.f36084i;
            i iVar3 = i.this;
            try {
                if (i17 == 0) {
                    r.b(obj);
                    List<k23.d<? extends d0>> list = iVar3.f36071f;
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    iVar = iVar3;
                    i14 = 0;
                    collection = arrayList;
                    i15 = 0;
                    if (it.hasNext()) {
                        next = it.next();
                        dVar = (k23.d) next;
                        this.f36085j = b0Var;
                        this.f36076a = iVar;
                        this.f36077b = null;
                        this.f36078c = collection;
                        this.f36079d = it;
                        this.f36080e = next;
                        this.f36081f = dVar;
                        this.f36082g = i15;
                        this.f36083h = i14;
                        this.f36084i = 1;
                        int i18 = i.f36065j;
                        objB = iVar.b().d().b(this);
                    } else {
                        List list2 = (List) collection;
                        Instant instant3 = this.f36087l;
                        instant = this.f36088m;
                        it3 = list2.iterator();
                        instant2 = instant3;
                        iVar2 = iVar3;
                        i16 = 0;
                    }
                    return aVar;
                }
                if (i17 == 1) {
                    i14 = this.f36083h;
                    i15 = this.f36082g;
                    dVar = this.f36081f;
                    next = this.f36080e;
                    it = (Iterator) this.f36079d;
                    collection = (Collection) this.f36078c;
                    iVar = this.f36076a;
                    r.b(obj);
                    objB = obj;
                    w8.a.f183535a.getClass();
                    if (((Set) objB).contains(w8.a.C3399a.a(dVar))) {
                        collection.add(next);
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        dVar = (k23.d) next;
                        this.f36085j = b0Var;
                        this.f36076a = iVar;
                        this.f36077b = null;
                        this.f36078c = collection;
                        this.f36079d = it;
                        this.f36080e = next;
                        this.f36081f = dVar;
                        this.f36082g = i15;
                        this.f36083h = i14;
                        this.f36084i = 1;
                        int i19 = i.f36065j;
                        objB = iVar.b().d().b(this);
                    } else {
                        List list3 = (List) collection;
                        Instant instant4 = this.f36087l;
                        instant = this.f36088m;
                        it3 = list3.iterator();
                        instant2 = instant4;
                        iVar2 = iVar3;
                        i16 = 0;
                    }
                    return aVar;
                }
                if (i17 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i16 = this.f36082g;
                it3 = (Iterator) this.f36080e;
                instant = (Instant) this.f36079d;
                instant2 = (Instant) this.f36078c;
                iVar2 = this.f36077b;
                r.b(obj);
                while (it3.hasNext()) {
                    k23.d dVar2 = (k23.d) it3.next();
                    int i24 = i.f36065j;
                    k8.a aVarB = iVar2.b();
                    b9.a.C0234a c0234a = b9.a.f16934e;
                    instant2.getClass();
                    instant.getClass();
                    c0234a.getClass();
                    b9.a aVarA = b9.a.C0234a.a(instant2, instant);
                    this.f36085j = b0Var;
                    this.f36076a = null;
                    this.f36077b = iVar2;
                    this.f36078c = instant2;
                    this.f36079d = instant;
                    this.f36080e = it3;
                    this.f36081f = null;
                    this.f36082g = i16;
                    this.f36083h = 0;
                    this.f36084i = 2;
                    if (aVarB.a(dVar2, aVarA, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception e4) {
                com.garmin.android.apps.connectmobile.googlehealthconnect.b bVar = com.garmin.android.apps.connectmobile.googlehealthconnect.b.f36013a;
                com.garmin.android.apps.connectmobile.googlehealthconnect.b.a aVar2 = com.garmin.android.apps.connectmobile.googlehealthconnect.b.a.EDITING_ACTIVITY;
                bVar.getClass();
                com.garmin.android.apps.connectmobile.googlehealthconnect.b.a(aVar2);
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.g(a2Var, "GoogleHealthConnectDelegate", e4);
            }
            iVar3.k(com.garmin.android.apps.connectmobile.googlehealthconnect.b.c.ON_EDIT_ACTIVITY, true);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/googlehealthconnect/i$d", "Lht/t;", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements ht.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36089a;

        public d(boolean z14) {
            this.f36089a = String.valueOf(z14);
        }

        @Override // ht.t
        public final String a() {
            return "healthConnectEnabled";
        }

        @Override // ht.t
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF36089a() {
            return this.f36089a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.googlehealthconnect.HealthConnectDelegateImpl$writeDataToHealthConnect$1", f = "GoogleHealthConnectDelegateImpl.kt", l = {295, StatusLine.HTTP_PERM_REDIRECT, 311}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f36090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f36092c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.googlehealthconnect.b.c f36094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f36095f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.garmin.android.apps.connectmobile.googlehealthconnect.b.c cVar, boolean z14, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f36094e = cVar;
            this.f36095f = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = i.this.new e(this.f36094e, this.f36095f, dVar);
            eVar.f36092c = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:100:0x0147 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:101:0x0152 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:102:0x015c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:0x0166 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:104:0x0170 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:105:0x017a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:106:0x0184 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:107:0x018e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:108:0x0198 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x01a2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:110:0x01ac A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:0x01b6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:117:0x00eb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:119:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:0x00e8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:45:0x0106 A[PHI: r0 r15
          0x0106: PHI (r0v13 java.util.Set) = (r0v11 java.util.Set), (r0v24 java.util.Set) binds: [B:43:0x0102, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x0106: PHI (r15v15 java.lang.Object) = (r15v10 java.lang.Object), (r15v0 java.lang.Object) binds: [B:43:0x0102, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:47:0x010a  */
        /* JADX WARN: Code duplicated, block: B:50:0x0120  */
        /* JADX WARN: Code duplicated, block: B:76:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:87:0x0209  */
        /* JADX WARN: Code duplicated, block: B:89:0x020c  */
        /* JADX WARN: Code duplicated, block: B:98:0x0133 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x013c A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x025b, code lost:
        
            if (com.garmin.android.apps.connectmobile.googlehealthconnect.i.a(r8, r2, r14) == r1) goto L92;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Set setG1;
            p13.c.b bVarN;
            dm0.a aVar;
            pb2.g.c cVar;
            ArrayList arrayList2;
            Iterator it;
            long millis;
            List<pb2.g.b> list;
            Long lValueOf;
            pb2.g.b bVar;
            pb2.g.e eVar;
            pb2.g.f fVar;
            LocalDateTime localDateTime;
            DateTime dateTime;
            int i14;
            boolean z14;
            ArrayList arrayListA;
            b0 b0Var = (b0) this.f36092c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f36091b;
            i iVar = i.this;
            if (i15 == 0) {
                r.b(obj);
                this.f36092c = b0Var;
                this.f36091b = 1;
                int i16 = i.f36065j;
                obj = iVar.b().d().b(this);
                if (obj != aVar2) {
                }
                return aVar2;
            }
            if (i15 == 1) {
                r.b(obj);
            } else if (i15 == 2) {
                setG1 = this.f36090a;
                r.b(obj);
                cVar = (pb2.g.c) obj;
                if (cVar != null) {
                    int i17 = i.f36065j;
                    iVar.getClass();
                    arrayList2 = new ArrayList();
                    it = setG1.iterator();
                    while (it.hasNext()) {
                        try {
                            i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                            z14 = this.f36095f;
                            switch (i14) {
                                case 1:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.a(cVar, z14);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 2:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.b(cVar);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 3:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.c(cVar);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 4:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.d(cVar, z14);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 5:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.f(cVar, z14);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 6:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.g(cVar);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 7:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.h(cVar, z14);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 8:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.j(cVar);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 9:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.k(cVar, z14);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 10:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.l(cVar, z14);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 11:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.m(cVar);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 12:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.n(cVar);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                case 13:
                                    f.f36059a.getClass();
                                    arrayListA = f.a.p(cVar);
                                    arrayList2.addAll(arrayListA);
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        } catch (Exception e4) {
                            com.garmin.android.apps.connectmobile.googlehealthconnect.b bVar2 = com.garmin.android.apps.connectmobile.googlehealthconnect.b.f36013a;
                            com.garmin.android.apps.connectmobile.googlehealthconnect.b.a aVar3 = com.garmin.android.apps.connectmobile.googlehealthconnect.b.a.CREATING_RECORDS;
                            bVar2.getClass();
                            com.garmin.android.apps.connectmobile.googlehealthconnect.b.a(aVar3);
                            i2.a aVar4 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar4.getClass();
                            i2.a.g(a2Var, "GoogleHealthConnectDelegate", e4);
                        }
                    }
                    millis = DateTime.now().getMillis();
                    list = cVar.f137141a;
                    if (list != null || (bVar = (pb2.g.b) h0.n0(list)) == null || (eVar = bVar.f137138c) == null || (fVar = eVar.f137147c) == null || (localDateTime = fVar.f137153c) == null || (dateTime = localDateTime.toDateTime()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(dateTime.getMillis());
                    }
                    if (lValueOf != null) {
                        millis = lValueOf.longValue();
                    }
                    em0.a.f64581a.getClass();
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var2, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                    SharedPreferences sharedPreferences = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong("ghc_sync_time", millis);
                    editorEdit.apply();
                    this.f36092c = null;
                    this.f36090a = null;
                    this.f36091b = 3;
                }
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Set set = this.f36090a;
                r.b(obj);
            }
            return Unit.INSTANCE;
            Set<String> set2 = (Set) obj;
            if (set2.isEmpty()) {
                i2.a aVar6 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar6.getClass();
                i2.a.b(a2Var3, "GoogleHealthConnectDelegate", "writeDataToHealthConnect(): Not writing data because no permissions are granted.");
                int i18 = i.f36065j;
                iVar.getClass();
                i.p(false);
                return Unit.INSTANCE;
            }
            int i19 = i.f36065j;
            iVar.getClass();
            i.p(true);
            com.garmin.android.apps.connectmobile.googlehealthconnect.b.f36013a.getClass();
            com.garmin.android.apps.connectmobile.googlehealthconnect.b.c cVar2 = this.f36094e;
            cVar2.getClass();
            String str = "GHCSync_OnDeleteActivity";
            switch (com.garmin.android.apps.connectmobile.googlehealthconnect.b.d.f36052a[cVar2.ordinal()]) {
                case 1:
                    str = "GHCSync_DeviceSync";
                    ht.a.f85464a.getClass();
                    ht.a.a(null, str);
                    dm0.a.f60428b.getClass();
                    arrayList = new ArrayList();
                    for (String str2 : set2) {
                        dm0.a.f60428b.getClass();
                        w13.c cVar3 = dm0.a.f60443q;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                        do {
                            if (bVarN.hasNext()) {
                                aVar = (dm0.a) bVarN.next();
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        } while (!s.g(aVar.f60444a, str2));
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    bm0.a aVar7 = iVar.f36067b;
                    this.f36092c = null;
                    this.f36090a = setG1;
                    this.f36091b = 2;
                    obj = aVar7.Z(setG1, this);
                    if (obj != aVar2) {
                        cVar = (pb2.g.c) obj;
                        if (cVar != null) {
                            int i110 = i.f36065j;
                            iVar.getClass();
                            arrayList2 = new ArrayList();
                            it = setG1.iterator();
                            while (it.hasNext()) {
                                i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                                z14 = this.f36095f;
                                switch (i14) {
                                    case 1:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.a(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 2:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.b(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 3:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.c(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 4:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.d(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 5:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.f(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 6:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.g(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 7:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.h(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 8:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.j(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 9:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.k(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 10:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.l(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 11:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.m(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 12:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.n(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 13:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.p(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            millis = DateTime.now().getMillis();
                            list = cVar.f137141a;
                            if (list != null) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                millis = lValueOf.longValue();
                            }
                            em0.a.f64581a.getClass();
                            i2.a aVar8 = i2.f36769a;
                            a2 a2Var4 = a2.GENERAL;
                            aVar8.getClass();
                            i2.a.b(a2Var4, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                            SharedPreferences sharedPreferences2 = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                            sharedPreferences2.getClass();
                            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                            editorEdit2.putLong("ghc_sync_time", millis);
                            editorEdit2.apply();
                            this.f36092c = null;
                            this.f36090a = null;
                            this.f36091b = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 2:
                    str = "GHCSync_AppStarted";
                    ht.a.f85464a.getClass();
                    ht.a.a(null, str);
                    dm0.a.f60428b.getClass();
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        dm0.a.f60428b.getClass();
                        w13.c cVar4 = dm0.a.f60443q;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                        do {
                            if (bVarN.hasNext()) {
                                aVar = (dm0.a) bVarN.next();
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        } while (!s.g(aVar.f60444a, str2));
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    bm0.a aVar9 = iVar.f36067b;
                    this.f36092c = null;
                    this.f36090a = setG1;
                    this.f36091b = 2;
                    obj = aVar9.Z(setG1, this);
                    if (obj != aVar2) {
                        cVar = (pb2.g.c) obj;
                        if (cVar != null) {
                            int i111 = i.f36065j;
                            iVar.getClass();
                            arrayList2 = new ArrayList();
                            it = setG1.iterator();
                            while (it.hasNext()) {
                                i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                                z14 = this.f36095f;
                                switch (i14) {
                                    case 1:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.a(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 2:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.b(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 3:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.c(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 4:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.d(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 5:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.f(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 6:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.g(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 7:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.h(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 8:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.j(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 9:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.k(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 10:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.l(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 11:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.m(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 12:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.n(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 13:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.p(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            millis = DateTime.now().getMillis();
                            list = cVar.f137141a;
                            if (list != null) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                millis = lValueOf.longValue();
                            }
                            em0.a.f64581a.getClass();
                            i2.a aVar10 = i2.f36769a;
                            a2 a2Var5 = a2.GENERAL;
                            aVar10.getClass();
                            i2.a.b(a2Var5, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                            SharedPreferences sharedPreferences3 = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                            sharedPreferences3.getClass();
                            SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                            editorEdit3.putLong("ghc_sync_time", millis);
                            editorEdit3.apply();
                            this.f36092c = null;
                            this.f36090a = null;
                            this.f36091b = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 3:
                    str = "GHCSync_AppForegrounded";
                    ht.a.f85464a.getClass();
                    ht.a.a(null, str);
                    dm0.a.f60428b.getClass();
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        dm0.a.f60428b.getClass();
                        w13.c cVar5 = dm0.a.f60443q;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar5, cVar5);
                        do {
                            if (bVarN.hasNext()) {
                                aVar = (dm0.a) bVarN.next();
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        } while (!s.g(aVar.f60444a, str2));
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    bm0.a aVar11 = iVar.f36067b;
                    this.f36092c = null;
                    this.f36090a = setG1;
                    this.f36091b = 2;
                    obj = aVar11.Z(setG1, this);
                    if (obj != aVar2) {
                        cVar = (pb2.g.c) obj;
                        if (cVar != null) {
                            int i112 = i.f36065j;
                            iVar.getClass();
                            arrayList2 = new ArrayList();
                            it = setG1.iterator();
                            while (it.hasNext()) {
                                i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                                z14 = this.f36095f;
                                switch (i14) {
                                    case 1:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.a(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 2:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.b(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 3:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.c(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 4:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.d(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 5:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.f(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 6:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.g(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 7:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.h(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 8:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.j(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 9:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.k(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 10:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.l(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 11:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.m(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 12:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.n(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 13:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.p(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            millis = DateTime.now().getMillis();
                            list = cVar.f137141a;
                            if (list != null) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                millis = lValueOf.longValue();
                            }
                            em0.a.f64581a.getClass();
                            i2.a aVar12 = i2.f36769a;
                            a2 a2Var6 = a2.GENERAL;
                            aVar12.getClass();
                            i2.a.b(a2Var6, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                            SharedPreferences sharedPreferences4 = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor editorEdit4 = sharedPreferences4.edit();
                            editorEdit4.putLong("ghc_sync_time", millis);
                            editorEdit4.apply();
                            this.f36092c = null;
                            this.f36090a = null;
                            this.f36091b = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 4:
                    str = "GHCSync_OnPermissionsChange";
                    ht.a.f85464a.getClass();
                    ht.a.a(null, str);
                    dm0.a.f60428b.getClass();
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        dm0.a.f60428b.getClass();
                        w13.c cVar6 = dm0.a.f60443q;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                        do {
                            if (bVarN.hasNext()) {
                                aVar = (dm0.a) bVarN.next();
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        } while (!s.g(aVar.f60444a, str2));
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    bm0.a aVar13 = iVar.f36067b;
                    this.f36092c = null;
                    this.f36090a = setG1;
                    this.f36091b = 2;
                    obj = aVar13.Z(setG1, this);
                    if (obj != aVar2) {
                        cVar = (pb2.g.c) obj;
                        if (cVar != null) {
                            int i113 = i.f36065j;
                            iVar.getClass();
                            arrayList2 = new ArrayList();
                            it = setG1.iterator();
                            while (it.hasNext()) {
                                i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                                z14 = this.f36095f;
                                switch (i14) {
                                    case 1:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.a(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 2:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.b(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 3:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.c(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 4:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.d(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 5:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.f(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 6:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.g(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 7:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.h(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 8:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.j(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 9:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.k(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 10:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.l(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 11:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.m(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 12:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.n(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 13:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.p(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            millis = DateTime.now().getMillis();
                            list = cVar.f137141a;
                            if (list != null) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                millis = lValueOf.longValue();
                            }
                            em0.a.f64581a.getClass();
                            i2.a aVar14 = i2.f36769a;
                            a2 a2Var7 = a2.GENERAL;
                            aVar14.getClass();
                            i2.a.b(a2Var7, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                            SharedPreferences sharedPreferences5 = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor editorEdit5 = sharedPreferences5.edit();
                            editorEdit5.putLong("ghc_sync_time", millis);
                            editorEdit5.apply();
                            this.f36092c = null;
                            this.f36090a = null;
                            this.f36091b = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 5:
                    str = "GHCSync_OnManualActivityEntry";
                    ht.a.f85464a.getClass();
                    ht.a.a(null, str);
                    dm0.a.f60428b.getClass();
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        dm0.a.f60428b.getClass();
                        w13.c cVar7 = dm0.a.f60443q;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                        do {
                            if (bVarN.hasNext()) {
                                aVar = (dm0.a) bVarN.next();
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        } while (!s.g(aVar.f60444a, str2));
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    bm0.a aVar15 = iVar.f36067b;
                    this.f36092c = null;
                    this.f36090a = setG1;
                    this.f36091b = 2;
                    obj = aVar15.Z(setG1, this);
                    if (obj != aVar2) {
                        cVar = (pb2.g.c) obj;
                        if (cVar != null) {
                            int i114 = i.f36065j;
                            iVar.getClass();
                            arrayList2 = new ArrayList();
                            it = setG1.iterator();
                            while (it.hasNext()) {
                                i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                                z14 = this.f36095f;
                                switch (i14) {
                                    case 1:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.a(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 2:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.b(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 3:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.c(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 4:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.d(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 5:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.f(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 6:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.g(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 7:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.h(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 8:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.j(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 9:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.k(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 10:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.l(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 11:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.m(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 12:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.n(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 13:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.p(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            millis = DateTime.now().getMillis();
                            list = cVar.f137141a;
                            if (list != null) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                millis = lValueOf.longValue();
                            }
                            em0.a.f64581a.getClass();
                            i2.a aVar16 = i2.f36769a;
                            a2 a2Var8 = a2.GENERAL;
                            aVar16.getClass();
                            i2.a.b(a2Var8, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                            SharedPreferences sharedPreferences6 = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor editorEdit6 = sharedPreferences6.edit();
                            editorEdit6.putLong("ghc_sync_time", millis);
                            editorEdit6.apply();
                            this.f36092c = null;
                            this.f36090a = null;
                            this.f36091b = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 6:
                    str = "GHCSync_OnManualWeightEntry";
                    ht.a.f85464a.getClass();
                    ht.a.a(null, str);
                    dm0.a.f60428b.getClass();
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        dm0.a.f60428b.getClass();
                        w13.c cVar8 = dm0.a.f60443q;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                        do {
                            if (bVarN.hasNext()) {
                                aVar = (dm0.a) bVarN.next();
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        } while (!s.g(aVar.f60444a, str2));
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    bm0.a aVar17 = iVar.f36067b;
                    this.f36092c = null;
                    this.f36090a = setG1;
                    this.f36091b = 2;
                    obj = aVar17.Z(setG1, this);
                    if (obj != aVar2) {
                        cVar = (pb2.g.c) obj;
                        if (cVar != null) {
                            int i115 = i.f36065j;
                            iVar.getClass();
                            arrayList2 = new ArrayList();
                            it = setG1.iterator();
                            while (it.hasNext()) {
                                i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                                z14 = this.f36095f;
                                switch (i14) {
                                    case 1:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.a(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 2:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.b(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 3:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.c(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 4:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.d(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 5:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.f(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 6:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.g(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 7:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.h(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 8:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.j(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 9:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.k(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 10:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.l(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 11:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.m(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 12:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.n(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 13:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.p(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            millis = DateTime.now().getMillis();
                            list = cVar.f137141a;
                            if (list != null) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                millis = lValueOf.longValue();
                            }
                            em0.a.f64581a.getClass();
                            i2.a aVar18 = i2.f36769a;
                            a2 a2Var9 = a2.GENERAL;
                            aVar18.getClass();
                            i2.a.b(a2Var9, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                            SharedPreferences sharedPreferences7 = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor editorEdit7 = sharedPreferences7.edit();
                            editorEdit7.putLong("ghc_sync_time", millis);
                            editorEdit7.apply();
                            this.f36092c = null;
                            this.f36090a = null;
                            this.f36091b = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 7:
                    str = "GHCSync_OnEditSleepEntry";
                    ht.a.f85464a.getClass();
                    ht.a.a(null, str);
                    dm0.a.f60428b.getClass();
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        dm0.a.f60428b.getClass();
                        w13.c cVar9 = dm0.a.f60443q;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar9, cVar9);
                        do {
                            if (bVarN.hasNext()) {
                                aVar = (dm0.a) bVarN.next();
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        } while (!s.g(aVar.f60444a, str2));
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    bm0.a aVar19 = iVar.f36067b;
                    this.f36092c = null;
                    this.f36090a = setG1;
                    this.f36091b = 2;
                    obj = aVar19.Z(setG1, this);
                    if (obj != aVar2) {
                        cVar = (pb2.g.c) obj;
                        if (cVar != null) {
                            int i116 = i.f36065j;
                            iVar.getClass();
                            arrayList2 = new ArrayList();
                            it = setG1.iterator();
                            while (it.hasNext()) {
                                i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                                z14 = this.f36095f;
                                switch (i14) {
                                    case 1:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.a(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 2:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.b(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 3:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.c(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 4:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.d(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 5:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.f(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 6:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.g(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 7:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.h(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 8:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.j(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 9:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.k(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 10:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.l(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 11:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.m(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 12:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.n(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 13:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.p(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            millis = DateTime.now().getMillis();
                            list = cVar.f137141a;
                            if (list != null) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                millis = lValueOf.longValue();
                            }
                            em0.a.f64581a.getClass();
                            i2.a aVar110 = i2.f36769a;
                            a2 a2Var10 = a2.GENERAL;
                            aVar110.getClass();
                            i2.a.b(a2Var10, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                            SharedPreferences sharedPreferences8 = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor editorEdit8 = sharedPreferences8.edit();
                            editorEdit8.putLong("ghc_sync_time", millis);
                            editorEdit8.apply();
                            this.f36092c = null;
                            this.f36090a = null;
                            this.f36091b = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 8:
                case 9:
                    ht.a.f85464a.getClass();
                    ht.a.a(null, str);
                    dm0.a.f60428b.getClass();
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        dm0.a.f60428b.getClass();
                        w13.c cVar10 = dm0.a.f60443q;
                        bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar10, cVar10);
                        do {
                            if (bVarN.hasNext()) {
                                aVar = (dm0.a) bVarN.next();
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                arrayList.add(aVar);
                            }
                        } while (!s.g(aVar.f60444a, str2));
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    setG1 = h0.g1(arrayList);
                    bm0.a aVar111 = iVar.f36067b;
                    this.f36092c = null;
                    this.f36090a = setG1;
                    this.f36091b = 2;
                    obj = aVar111.Z(setG1, this);
                    if (obj != aVar2) {
                        cVar = (pb2.g.c) obj;
                        if (cVar != null) {
                            int i117 = i.f36065j;
                            iVar.getClass();
                            arrayList2 = new ArrayList();
                            it = setG1.iterator();
                            while (it.hasNext()) {
                                i14 = b.f36075a[((dm0.a) it.next()).ordinal()];
                                z14 = this.f36095f;
                                switch (i14) {
                                    case 1:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.a(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 2:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.b(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 3:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.c(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 4:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.d(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 5:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.f(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 6:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.g(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 7:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.h(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 8:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.j(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 9:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.k(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 10:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.l(cVar, z14);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 11:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.m(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 12:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.n(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    case 13:
                                        f.f36059a.getClass();
                                        arrayListA = f.a.p(cVar);
                                        arrayList2.addAll(arrayListA);
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            millis = DateTime.now().getMillis();
                            list = cVar.f137141a;
                            if (list != null) {
                                lValueOf = null;
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null) {
                                millis = lValueOf.longValue();
                            }
                            em0.a.f64581a.getClass();
                            i2.a aVar112 = i2.f36769a;
                            a2 a2Var11 = a2.GENERAL;
                            aVar112.getClass();
                            i2.a.b(a2Var11, "GoogleHealthConnectUtil", "Setting last sync time as " + millis);
                            SharedPreferences sharedPreferences9 = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor editorEdit9 = sharedPreferences9.edit();
                            editorEdit9.putLong("ghc_sync_time", millis);
                            editorEdit9.apply();
                            this.f36092c = null;
                            this.f36090a = null;
                            this.f36091b = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                default:
                    u0.r();
                    return null;
            }
        }
    }

    static {
        new a(null);
    }

    public i(Context context, bm0.a aVar, c22.k kVar) {
        context.getClass();
        aVar.getClass();
        kVar.getClass();
        this.f36066a = context;
        this.f36067b = aVar;
        this.f36068c = kVar;
        m1 m1VarC = g8.i.c();
        x53.c cVar = s0.f129406a;
        this.f36069d = c0.a(t13.g.a.C3052a.d(x53.b.f189152a, m1VarC));
        w8.a.C3399a c3399a = w8.a.f183535a;
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        k23.d dVarB = t0Var.b(y8.a.class);
        c3399a.getClass();
        this.f36070e = u.m0(new String[]{w8.a.C3399a.a(dVarB), w8.a.C3399a.a(t0Var.b(y8.g.class)), w8.a.C3399a.a(t0Var.b(y8.n.class)), w8.a.C3399a.a(t0Var.b(o.class)), w8.a.C3399a.a(t0Var.b(v.class)), w8.a.C3399a.a(t0Var.b(w.class)), w8.a.C3399a.a(t0Var.b(x.class)), w8.a.C3399a.a(t0Var.b(y8.s0.class)), w8.a.C3399a.a(t0Var.b(w0.class)), w8.a.C3399a.a(t0Var.b(x0.class)), w8.a.C3399a.a(t0Var.b(z0.class)), w8.a.C3399a.a(t0Var.b(a1.class)), w8.a.C3399a.a(t0Var.b(d1.class))});
        final int i14 = 0;
        final int i15 = 1;
        this.f36071f = p13.x.k(t0Var.b(y8.a.class), t0Var.b(y8.n.class), t0Var.b(o.class), t0Var.b(v.class), t0Var.b(x.class), t0Var.b(x0.class), t0Var.b(a1.class));
        this.f36072g = p13.x.k(t0Var.b(y8.n.class), t0Var.b(x.class), t0Var.b(a1.class));
        this.f36073h = o13.m.b(new e23.a(this) { // from class: com.garmin.android.apps.connectmobile.googlehealthconnect.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f36064b;

            {
                this.f36064b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i14;
                i iVar = this.f36064b;
                switch (i16) {
                    case 0:
                        int i17 = i.f36065j;
                        k8.a.b bVar = k8.a.f103321a;
                        Context context2 = iVar.f36066a;
                        bVar.getClass();
                        int iA = k8.a.b.a(context2, "com.google.android.apps.healthdata");
                        if (iA == 1) {
                            org.apache.commons.lang3.e.w("SDK version too low or running in a profile");
                            return null;
                        }
                        if (iA != 2) {
                            return Build.VERSION.SDK_INT >= 34 ? new o8.e(context2) : new o8.a(context2, "com.google.android.apps.healthdata");
                        }
                        vb.h.z("Service not available");
                        return null;
                    default:
                        int i18 = i.f36065j;
                        GoogleHealthConnectDatabase.a aVar2 = GoogleHealthConnectDatabase.f36055a;
                        Context context3 = iVar.f36066a;
                        aVar2.getClass();
                        GoogleHealthConnectDatabase googleHealthConnectDatabase = GoogleHealthConnectDatabase.f36056b;
                        if (googleHealthConnectDatabase != null) {
                            return googleHealthConnectDatabase;
                        }
                        Context applicationContext = context3.getApplicationContext();
                        applicationContext.getClass();
                        androidx.room.b0.a aVarA = androidx.room.x.a(applicationContext, GoogleHealthConnectDatabase.class, "googleHealthConnect_database");
                        aVarA.f10739q = false;
                        aVarA.f10740r = true;
                        aVarA.f10741s = false;
                        GoogleHealthConnectDatabase googleHealthConnectDatabase2 = (GoogleHealthConnectDatabase) aVarA.b();
                        GoogleHealthConnectDatabase.f36056b = googleHealthConnectDatabase2;
                        return googleHealthConnectDatabase2;
                }
            }
        });
        g gVar = g.NOT_SUPPORTED;
        c2 c2VarN = p0.n(gVar);
        this.f36074i = c2VarN;
        o13.m.b(new e23.a(this) { // from class: com.garmin.android.apps.connectmobile.googlehealthconnect.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f36064b;

            {
                this.f36064b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                i iVar = this.f36064b;
                switch (i16) {
                    case 0:
                        int i17 = i.f36065j;
                        k8.a.b bVar = k8.a.f103321a;
                        Context context2 = iVar.f36066a;
                        bVar.getClass();
                        int iA = k8.a.b.a(context2, "com.google.android.apps.healthdata");
                        if (iA == 1) {
                            org.apache.commons.lang3.e.w("SDK version too low or running in a profile");
                            return null;
                        }
                        if (iA != 2) {
                            return Build.VERSION.SDK_INT >= 34 ? new o8.e(context2) : new o8.a(context2, "com.google.android.apps.healthdata");
                        }
                        vb.h.z("Service not available");
                        return null;
                    default:
                        int i18 = i.f36065j;
                        GoogleHealthConnectDatabase.a aVar2 = GoogleHealthConnectDatabase.f36055a;
                        Context context3 = iVar.f36066a;
                        aVar2.getClass();
                        GoogleHealthConnectDatabase googleHealthConnectDatabase = GoogleHealthConnectDatabase.f36056b;
                        if (googleHealthConnectDatabase != null) {
                            return googleHealthConnectDatabase;
                        }
                        Context applicationContext = context3.getApplicationContext();
                        applicationContext.getClass();
                        androidx.room.b0.a aVarA = androidx.room.x.a(applicationContext, GoogleHealthConnectDatabase.class, "googleHealthConnect_database");
                        aVarA.f10739q = false;
                        aVarA.f10740r = true;
                        aVarA.f10741s = false;
                        GoogleHealthConnectDatabase googleHealthConnectDatabase2 = (GoogleHealthConnectDatabase) aVarA.b();
                        GoogleHealthConnectDatabase.f36056b = googleHealthConnectDatabase2;
                        return googleHealthConnectDatabase2;
                }
            }
        });
        k8.a.f103321a.getClass();
        int iA = k8.a.b.a(context, "com.google.android.apps.healthdata");
        if (d()) {
            em0.a.f64581a.getClass();
            if (Build.VERSION.SDK_INT >= 34 && iA == 3) {
                gVar = g.SUPPORTED;
            }
        }
        c2VarN.setValue(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(i iVar, ArrayList arrayList, v13.c cVar) {
        n nVar;
        iVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f36129c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f36129c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(iVar, cVar);
            }
        } else {
            nVar = new n(iVar, cVar);
        }
        Object obj = nVar.f36127a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f36129c;
        try {
            if (i15 == 0) {
                r.b(obj);
                String str = "writeToGoogleHealthConnect(): writing " + arrayList.size() + " records to Google Health Connect";
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "GoogleHealthConnectDelegate", str);
                k8.a aVarB = iVar.b();
                nVar.f36129c = 1;
                if (aVarB.e(arrayList, nVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            com.garmin.android.apps.connectmobile.googlehealthconnect.b bVar = com.garmin.android.apps.connectmobile.googlehealthconnect.b.f36013a;
            com.garmin.android.apps.connectmobile.googlehealthconnect.b.a aVar3 = com.garmin.android.apps.connectmobile.googlehealthconnect.b.a.WRITING_TO_HEALTH_CONNECT;
            bVar.getClass();
            com.garmin.android.apps.connectmobile.googlehealthconnect.b.a(aVar3);
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "GoogleHealthConnectDelegate", "writeToGoogleHealthConnect(): exception=" + e4);
        }
        return Unit.INSTANCE;
    }

    public static void p(boolean z14) {
        em0.a.f64581a.getClass();
        if (z14 != ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0).getBoolean("ghc_user_property_state", false)) {
            ht.s sVar = ht.s.f85508a;
            d dVar = new d(z14);
            sVar.getClass();
            ht.s.c(dVar);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "GoogleHealthConnectUtil", "Setting GHC User Property as " + z14);
            SharedPreferences sharedPreferences = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).getF36066a().getSharedPreferences("google_health_connect", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean("ghc_user_property_state", z14);
            editorEdit.apply();
        }
    }

    public final k8.a b() {
        return (k8.a) this.f36073h.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getF36066a() {
        return this.f36066a;
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final boolean d() {
        s3.f23252a.getClass();
        return s3.a("ROLE_MBTESTER") || this.f36068c.c("ghc_enabled");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r10.a(r5, r9, r0) == r1) goto L33;
     */
    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(DateTime dateTime, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f36119d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f36119d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objB = kVar.f36117b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f36119d;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    dateTime = kVar.f36116a;
                    r.b(objB);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objB);
                }
                return Unit.INSTANCE;
            }
            r.b(objB);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "GoogleHealthConnectDelegate", "deleteAllWeightRecordsForDate: deleting weight record for date " + dateTime);
            if (!o()) {
                i2.a.b(a2Var, "GoogleHealthConnectDelegate", "deleteAllWeightRecordsForDate: feature is not supported, cancelling");
                return Unit.INSTANCE;
            }
            k8.c cVarD = b().d();
            kVar.f36116a = dateTime;
            kVar.f36119d = 1;
            objB = cVarD.b(kVar);
            if (objB != aVar) {
            }
            return aVar;
            if (!((Set) objB).contains(dm0.a.WRITE_WEIGHT.f60444a)) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var2, "GoogleHealthConnectDelegate", "deleteAllWeightRecordsForDate: WRITE_WEIGHT permission not granted, cancelling");
                return Unit.INSTANCE;
            }
            long millis = dateTime.getMillis();
            long millis2 = dateTime.plusDays(1).minusSeconds(1).getMillis();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(millis);
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(millis2);
            k8.a aVarB = b();
            k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(d1.class);
            b9.a.C0234a c0234a = b9.a.f16934e;
            instantOfEpochMilli.getClass();
            instantOfEpochMilli2.getClass();
            c0234a.getClass();
            b9.a aVarA = b9.a.C0234a.a(instantOfEpochMilli, instantOfEpochMilli2);
            kVar.f36116a = null;
            kVar.f36119d = 2;
        } catch (Exception e4) {
            com.garmin.android.apps.connectmobile.googlehealthconnect.b bVar = com.garmin.android.apps.connectmobile.googlehealthconnect.b.f36013a;
            com.garmin.android.apps.connectmobile.googlehealthconnect.b.a aVar4 = com.garmin.android.apps.connectmobile.googlehealthconnect.b.a.DELETING_WEIGHT;
            bVar.getClass();
            com.garmin.android.apps.connectmobile.googlehealthconnect.b.a(aVar4);
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.g(a2Var3, "GoogleHealthConnectDelegate", e4);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final boolean f() {
        return this.f36074i.getF182175a() == g.SUPPORTED;
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0310  */
    /* JADX WARN: Code duplicated, block: B:68:0x0335  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01c3 -> B:39:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0310 -> B:66:0x0322). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final java.lang.Object g(long r28, long r30, long r32, v13.c r34) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.googlehealthconnect.i.g(long, long, long, v13.c):java.lang.Object");
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final Set<String> getPermissions() {
        return this.f36070e;
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final m8.a h() {
        k8.c.f103328b.getClass();
        return new m8.a("com.google.android.apps.healthdata");
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final boolean i() {
        return this.f36068c.c("ghc_foreground_sync_enabled");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r10.c(r2, r4, r6, r0) == r1) goto L32;
     */
    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j8, v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f36123d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f36123d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objB = lVar.f36121b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f36123d;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    j8 = lVar.f36120a;
                    r.b(objB);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objB);
                }
                return Unit.INSTANCE;
            }
            r.b(objB);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "GoogleHealthConnectDelegate", "deleteWeightRecord: deleting weight record for timestamp " + j8);
            if (!o()) {
                i2.a.b(a2Var, "GoogleHealthConnectDelegate", "deleteWeightRecord: feature is not supported, cancelling");
                return Unit.INSTANCE;
            }
            k8.c cVarD = b().d();
            lVar.f36120a = j8;
            lVar.f36123d = 1;
            objB = cVarD.b(lVar);
            if (objB != aVar) {
            }
            return aVar;
            if (!((Set) objB).contains(dm0.a.WRITE_WEIGHT.f60444a)) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var2, "GoogleHealthConnectDelegate", "deleteWeightRecord: WRITE_WEIGHT permission not granted, cancelling");
                return Unit.INSTANCE;
            }
            k8.a aVarB = b();
            k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(d1.class);
            j0 j0Var = j0.f134944a;
            List<String> listC = p13.w.c(String.valueOf(j8));
            lVar.f36120a = j8;
            lVar.f36123d = 2;
        } catch (Exception e4) {
            com.garmin.android.apps.connectmobile.googlehealthconnect.b bVar = com.garmin.android.apps.connectmobile.googlehealthconnect.b.f36013a;
            com.garmin.android.apps.connectmobile.googlehealthconnect.b.a aVar4 = com.garmin.android.apps.connectmobile.googlehealthconnect.b.a.DELETING_WEIGHT;
            bVar.getClass();
            com.garmin.android.apps.connectmobile.googlehealthconnect.b.a(aVar4);
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.g(a2Var3, "GoogleHealthConnectDelegate", e4);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final void k(com.garmin.android.apps.connectmobile.googlehealthconnect.b.c cVar, boolean z14) {
        cVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GoogleHealthConnectDelegate", "writeDataToHealthConnect: writing data to Health Connect, syncReason=" + cVar + ", bypassTimer=" + z14);
        if (o()) {
            ge1.b.T(this.f36069d, null, null, new e(cVar, z14, null), 3);
        } else {
            i2.a.b(a2Var, "GoogleHealthConnectDelegate", "writeDataToHealthConnect(): Not writing data because Google Health Connect is not supported.");
            p(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final Intent l() {
        k8.a.f103321a.getClass();
        return new Intent(k8.a.b.f103324b);
    }

    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final void m(DateTime dateTime) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GoogleHealthConnectDelegate", "handleEditedActivity: handling edited activity from date " + dateTime);
        if (!o()) {
            i2.a.b(a2Var, "GoogleHealthConnectDelegate", "handleEditedActivity: feature is not supported, cancelling");
            return;
        }
        if (!g22.k.k(dateTime)) {
            i2.a.b(a2Var, "GoogleHealthConnectDelegate", "handleEditedActivity: date is not today, cancelling");
            return;
        }
        ge1.b.T(this.f36069d, null, null, new c(Instant.ofEpochMilli(dateTime.getMillis()), Instant.ofEpochMilli(dateTime.plusDays(1).minusSeconds(1).getMillis()), null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.garmin.android.apps.connectmobile.googlehealthconnect.a
    public final Object n(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f36126c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f36126c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objB = mVar.f36124a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f36126c;
        if (i15 == 0) {
            r.b(objB);
            if (o()) {
                k8.c cVarD = b().d();
                mVar.f36126c = 1;
                objB = cVarD.b(mVar);
                if (objB == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objB);
        boolean z14 = ((Collection) objB).isEmpty() ? false : true;
        return Boolean.valueOf(z14);
    }

    public final boolean o() {
        return this.f36074i.getF182175a() == g.SUPPORTED;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_RECORDS_PER_WRITE", "I", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
