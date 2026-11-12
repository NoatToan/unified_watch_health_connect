package f20;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$getPhoneContactList$1", f = "ContactViewModel.kt", l = {101}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.d f68434b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$getPhoneContactList$1$1", f = "ContactViewModel.kt", l = {102}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.d f68436b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.contacts.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f68436b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f68436b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00cf A[PHI: r7
          0x00cf: PHI (r7v12 java.lang.String) = (r7v11 java.lang.String), (r7v18 java.lang.String) binds: [B:39:0x00ba, B:44:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE0;
            boolean z14;
            boolean z15;
            boolean z16;
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68435a;
            boolean z17 = true;
            com.garmin.android.apps.connectmobile.contacts.d dVar = this.f68436b;
            if (i14 == 0) {
                o13.r.b(obj);
                m20.z zVar = dVar.f32386a;
                this.f68435a = 1;
                int i15 = m20.z.f116054f;
                zVar.getClass();
                x53.c cVar = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new m20.q(zVar, 5, 5, null), this);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objE0 = obj;
            }
            v2 v2Var = (v2) objE0;
            if (v2Var instanceof v2.b) {
                Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    l20.n nVar = (l20.n) obj2;
                    Set<l20.o> set = nVar.f109031e;
                    Set<l20.j> set2 = nVar.f109032f;
                    if (!set.isEmpty() || !set2.isEmpty()) {
                        if (!dVar.f32390e || nVar.f109031e.isEmpty() || !set2.isEmpty()) {
                            arrayList.add(obj2);
                        }
                    }
                }
                dVar.f32401p = arrayList;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    l20.n nVar2 = (l20.n) it.next();
                    if (nVar2.a().length() == 0 && nVar2.b().length() == 0) {
                        l20.j jVar = (l20.j) h0.c0(nVar2.f109032f);
                        String str2 = jVar != null ? jVar.f109005a : null;
                        if (str2 == null) {
                            l20.o oVar = (l20.o) h0.c0(nVar2.f109031e);
                            str2 = oVar != null ? oVar.f109033a : null;
                            str = str2 != null ? str2 : "";
                        }
                        nVar2.f109029c = d53.w.i0(str).toString();
                    }
                }
                ArrayList<l20.n> arrayList2 = dVar.f32401p;
                if (arrayList2 == null) {
                    p005kotlin.jvm.internal.s.m("phoneContacts");
                    throw null;
                }
                ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                for (l20.n nVar3 : arrayList2) {
                    long j8 = nVar3.f109027a;
                    String string = d53.w.i0(nVar3.a() + StringUtils.SPACE + nVar3.b()).toString();
                    Collection collection = dVar.f32391f;
                    if (collection == null) {
                        collection = j0.f134944a;
                    }
                    collection.getClass();
                    if (collection.isEmpty()) {
                        z14 = z17;
                        z16 = false;
                        break;
                    }
                    Iterator it3 = collection.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z14 = z17;
                            z16 = false;
                            break;
                            break;
                        }
                        l20.a aVar2 = (l20.a) it3.next();
                        aVar2.getClass();
                        if (p005kotlin.jvm.internal.s.g(nVar3.a(), aVar2.getFirstName()) && p005kotlin.jvm.internal.s.g(nVar3.b(), aVar2.getLastName())) {
                            Set<l20.o> set3 = nVar3.f109031e;
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            Iterator<T> it4 = set3.iterator();
                            while (it4.hasNext()) {
                                linkedHashSet3.add(com.garmin.android.apps.connectmobile.contacts.b.k(((l20.o) it4.next()).f109033a));
                                z17 = z17;
                            }
                            z14 = z17;
                            List<l20.c> listZ = aVar2.z();
                            if (listZ != null) {
                                linkedHashSet = new LinkedHashSet();
                                Iterator<T> it5 = listZ.iterator();
                                while (it5.hasNext()) {
                                    linkedHashSet.add(com.garmin.android.apps.connectmobile.contacts.b.k(((l20.c) it5.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()));
                                }
                            } else {
                                linkedHashSet = new LinkedHashSet();
                            }
                            if (h0.h0(linkedHashSet3, linkedHashSet).isEmpty()) {
                                Set<l20.j> set4 = nVar3.f109032f;
                                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                Iterator<T> it6 = set4.iterator();
                                while (it6.hasNext()) {
                                    linkedHashSet4.add(((l20.j) it6.next()).f109005a);
                                }
                                List<l20.c> listR = aVar2.r();
                                if (listR != null) {
                                    linkedHashSet2 = new LinkedHashSet();
                                    Iterator<T> it7 = listR.iterator();
                                    while (it7.hasNext()) {
                                        String str3 = ((l20.c) it7.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashSet2.add(str3);
                                    }
                                } else {
                                    linkedHashSet2 = new LinkedHashSet();
                                }
                                z15 = !h0.h0(linkedHashSet4, linkedHashSet2).isEmpty();
                            } else {
                                z15 = z14;
                            }
                        } else {
                            z14 = z17;
                            z15 = false;
                        }
                        if (z15) {
                            z16 = z14;
                            break;
                        }
                        z17 = z14;
                    }
                    arrayList3.add(new o(j8, null, null, string, null, !z16, false, 0, false, false, false, false, false, null, false, 32726, null));
                    z17 = z14;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (((o) obj3).f68410f) {
                        arrayList4.add(obj3);
                    }
                }
                dVar.f32402q = arrayList4;
                com.garmin.android.apps.connectmobile.contacts.d.D4(dVar, arrayList4);
            } else {
                com.garmin.android.apps.connectmobile.contacts.d.D4(dVar, j0.f134944a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.garmin.android.apps.connectmobile.contacts.d dVar, t13.d<? super t> dVar2) {
        super(2, dVar2);
        this.f68434b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f68434b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68433a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f68434b, null);
            this.f68433a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
