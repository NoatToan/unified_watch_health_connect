package com.garmin.android.apps.connectmobile.userprofile.presentation.privacy;

import am.r1;
import am.x0;
import am.z0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import e23.p;
import ip.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import m12.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.x;
import r53.a2;
import r53.e2;
import r53.g2;
import r53.p2;
import r53.q2;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b;", "Landroidx/lifecycle/u1;", "Lip/f;", "activityPrivacyRepo", "<init>", "(Lip/f;)V", "a", "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f47147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<nj1.b> f47148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<List<ip.a>> f47149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f47150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f47151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f47152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f47153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f47154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0 f47155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f47156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f47157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f47158l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacyViewModel$navigateToEditProfile$1", f = "ActivitiesPrivacyViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47166a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f47168c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(this.f47168c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47166a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2 e2Var = b.this.f47152f;
                AbstractC0915b.C0916b c0916b = new AbstractC0915b.C0916b(this.f47168c);
                this.f47166a = 1;
                if (e2Var.emit(c0916b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f47169a;

        public d(Map map) {
            this.f47169a = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            String str = ((x0) t7).f4358a;
            Map map = this.f47169a;
            Integer num = (Integer) map.get(str);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            Integer num2 = (Integer) map.get(((x0) t14).f4358a);
            return r13.a.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f47170a;

        public e(Map map) {
            this.f47170a = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            String str = ((ip.a) t7).f94639a.f4358a;
            Map map = this.f47170a;
            Integer num = (Integer) map.get(str);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            Integer num2 = (Integer) map.get(((ip.a) t14).f94639a.f4358a);
            return r13.a.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }

    public b(f fVar) {
        fVar.getClass();
        this.f47147a = fVar;
        y0<nj1.b> y0Var = new y0<>();
        this.f47148b = y0Var;
        y0<List<ip.a>> y0Var2 = new y0<>();
        this.f47149c = y0Var2;
        ArrayList arrayList = new ArrayList();
        this.f47150d = arrayList;
        p2 p2VarA = q2.a(new a(j0.f134944a, false, null, false, 14, null));
        this.f47151e = p2VarA;
        e2 e2VarB = g2.b(0, 0, null, 6);
        this.f47152f = e2VarB;
        this.f47153g = s.c(e2VarB);
        this.f47154h = y0Var;
        this.f47155i = y0Var2;
        this.f47156j = arrayList;
        this.f47157k = p2VarA;
        r rVar = (r) KoinJavaComponent.get$default(r.class, null, null, 6, null);
        this.f47158l = rVar;
        HashMap mapO = r1.o();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : mapO.entrySet()) {
            x0 x0VarM = z0.m((String) entry.getKey());
            if (x0VarM == null) {
                Object value = entry.getValue();
                value.getClass();
                x0VarM = rVar.l(((Number) value).intValue());
            }
            x0VarM = (x0VarM == null || !mapO.containsKey(x0VarM.f4358a)) ? null : x0VarM;
            if (x0VarM != null) {
                arrayList2.add(x0VarM);
            }
        }
        this.f47150d.addAll(h0.N0(arrayList2, new u12.c(mapO)));
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : mapO.entrySet()) {
            x0 x0VarM2 = z0.m((String) entry2.getKey());
            if (x0VarM2 == null) {
                Object value2 = entry2.getValue();
                value2.getClass();
                x0VarM2 = rVar.l(((Number) value2).intValue());
            }
            ip.a aVar = (x0VarM2 == null || !mapO.containsKey(x0VarM2.f4358a)) ? null : new ip.a(x0VarM2, null);
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        this.f47149c.m(h0.N0(arrayList3, new u12.d(mapO)));
    }

    public final void x4(nj1.b bVar) {
        this.f47148b.m((nj1.b) new Gson().fromJson(new Gson().toJson(bVar, nj1.b.class), nj1.b.class));
        z4(bVar);
    }

    public final void y4(String str) {
        ge1.b.T(v1.a(this), null, null, new c(str, null), 3);
    }

    public final void z4(nj1.b bVar) {
        Integer num;
        Integer num2;
        HashMap mapO = r1.o();
        ArrayList arrayList = this.f47150d;
        boolean zIsEmpty = arrayList.isEmpty();
        r rVar = this.f47158l;
        if (zIsEmpty) {
            List<nj1.d> listD = bVar.d();
            ArrayList arrayList2 = new ArrayList();
            for (nj1.d dVar : listD) {
                List<Integer> listB = dVar.b();
                int iIntValue = (listB == null || (num2 = (Integer) h0.d0(listB)) == null) ? -1 : num2.intValue();
                x0 x0VarM = z0.m(dVar.getPrivacySubcategoryType());
                if (x0VarM == null) {
                    x0VarM = rVar.l(iIntValue);
                }
                if (x0VarM == null || !mapO.containsKey(x0VarM.f4358a)) {
                    x0VarM = null;
                }
                if (x0VarM != null) {
                    arrayList2.add(x0VarM);
                }
            }
            arrayList.addAll(h0.N0(arrayList2, new d(mapO)));
        }
        List<nj1.d> listD2 = bVar.d();
        ArrayList arrayList3 = new ArrayList();
        for (nj1.d dVar2 : listD2) {
            List<Integer> listB2 = dVar2.b();
            int iIntValue2 = (listB2 == null || (num = (Integer) h0.d0(listB2)) == null) ? -1 : num.intValue();
            x0 x0VarM2 = z0.m(dVar2.getPrivacySubcategoryType());
            if (x0VarM2 == null) {
                x0VarM2 = rVar.l(iIntValue2);
            }
            ip.a aVar = (x0VarM2 == null || !mapO.containsKey(x0VarM2.f4358a)) ? null : new ip.a(x0VarM2, PrivacyType.Companion.b(PrivacyType.INSTANCE, dVar2.getSubcategoryDetails().getAccessRule()));
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        this.f47149c.m(h0.N0(arrayList3, new e(mapO)));
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b;", "", "<init>", "()V", "a", "c", "b", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b$c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC0915b {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b$b$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b$a;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b;", "Lfw/c;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lfw/c;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends AbstractC0915b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final fw.c f47163a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fw.c cVar) {
                super(null);
                cVar.getClass();
                this.f47163a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f47163a, ((a) obj).f47163a);
            }

            public final int hashCode() {
                return this.f47163a.hashCode();
            }

            public final String toString() {
                return "DisplayError(error=" + this.f47163a + ")";
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b$b$c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b$c;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends AbstractC0915b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f47165a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0915b(j jVar) {
            this();
        }

        private AbstractC0915b() {
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$b;", "", "snackbarMessage", "<init>", "(Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0916b extends AbstractC0915b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f47164a;

            public /* synthetic */ C0916b(String str, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : str);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0916b) && p005kotlin.jvm.internal.s.g(this.f47164a, ((C0916b) obj).f47164a);
            }

            public final int hashCode() {
                String str = this.f47164a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return am.j.m("NavigateToEditProfile(snackbarMessage=", this.f47164a, ")");
            }

            public C0916b(String str) {
                super(null);
                this.f47164a = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0916b() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/b$a;", "", "", "Lip/a;", "activityPrivacyLevels", "", "pendingRequestDialogVisible", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "activityPrivacyOptions", "loading", "<init>", "(Ljava/util/List;ZLjava/util/List;Z)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ip.a> f47159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f47160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<PrivacyType> f47161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f47162d;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(List list, boolean z14, List list2, boolean z15, int i14, j jVar) {
            z14 = (i14 & 2) != 0 ? false : z14;
            if ((i14 & 4) != 0) {
                PrivacyType.INSTANCE.getClass();
                list2 = x.k(PrivacyType.ONLY_ME, PrivacyType.MY_CONNECTIONS, PrivacyType.MY_GROUPS_AND_CONNECTIONS, PrivacyType.EVERYONE, PrivacyType.CUSTOM);
            }
            this(list, z14, list2, (i14 & 8) != 0 ? false : z15);
        }

        public static a a(a aVar, boolean z14, boolean z15, int i14) {
            List<ip.a> list = aVar.f47159a;
            if ((i14 & 2) != 0) {
                z14 = aVar.f47160b;
            }
            List<PrivacyType> list2 = aVar.f47161c;
            if ((i14 & 8) != 0) {
                z15 = aVar.f47162d;
            }
            aVar.getClass();
            list.getClass();
            list2.getClass();
            return new a(list, z14, list2, z15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f47159a, aVar.f47159a) && this.f47160b == aVar.f47160b && p005kotlin.jvm.internal.s.g(this.f47161c, aVar.f47161c) && this.f47162d == aVar.f47162d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f47162d) + u0.b(q6.f.g(this.f47159a.hashCode() * 31, 31, this.f47160b), 31, this.f47161c);
        }

        public final String toString() {
            return "State(activityPrivacyLevels=" + this.f47159a + ", pendingRequestDialogVisible=" + this.f47160b + ", activityPrivacyOptions=" + this.f47161c + ", loading=" + this.f47162d + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<ip.a> list, boolean z14, List<? extends PrivacyType> list2, boolean z15) {
            list.getClass();
            list2.getClass();
            this.f47159a = list;
            this.f47160b = z14;
            this.f47161c = list2;
            this.f47162d = z15;
        }
    }
}
