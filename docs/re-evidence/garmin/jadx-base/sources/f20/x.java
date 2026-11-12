package f20;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.ContactsMigrationActivity;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import lc.u0;
import o53.c2;
import o53.s0;
import o53.t1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lf20/x;", "", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f68445m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContactsMigrationActivity f68446a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f68448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f68449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l20.h f68450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f68451f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f68454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u53.d f68455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c2 f68456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c2 f68457l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f68447b = o13.m.b(new ey0.a(19));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f68452g = 50;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f68453h = new ArrayList();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactsMigrationPresenter$migrate$1", f = "ContactsMigrationPresenter.kt", l = {104, 105}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x f68458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f68459b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactsMigrationPresenter$migrate$1$1", f = "ContactsMigrationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x f68461a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x xVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f68461a = xVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f68461a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                x xVar = this.f68461a;
                ContactsMigrationActivity contactsMigrationActivity = xVar.f68446a;
                if (contactsMigrationActivity != null) {
                    contactsMigrationActivity.hideProgressOverlay();
                }
                xVar.b();
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if (ge1.b.e0(r7, r1, r6) == r0) goto L16;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x xVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68459b;
            x xVar2 = x.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    xVar = this.f68458a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            int i15 = x.f68445m;
            z zVarA = xVar2.a();
            this.f68458a = xVar2;
            this.f68459b = 1;
            obj = zVarA.h(this);
            if (obj != aVar) {
                xVar = xVar2;
            }
            return aVar;
            xVar.f68450e = (l20.h) obj;
            x53.c cVar = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(xVar2, null);
            this.f68458a = null;
            this.f68459b = 2;
        }
    }

    static {
        new a(null);
    }

    public static void e(x xVar, ArrayList arrayList, o oVar, int i14) {
        Throwable th3;
        ContactsMigrationActivity contactsMigrationActivity;
        ContactsMigrationActivity contactsMigrationActivity2;
        String upperCase;
        String upperCase2;
        ArrayList<o> arrayList2 = (i14 & 1) != 0 ? null : arrayList;
        o oVar2 = (i14 & 2) != 0 ? null : oVar;
        ArrayList arrayList3 = xVar.f68453h;
        if (arrayList2 == null || (contactsMigrationActivity2 = xVar.f68446a) == null) {
            th3 = null;
        } else {
            View view2 = contactsMigrationActivity2.f32330h;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("emptyViewContainer");
                throw null;
            }
            view2.setVisibility(8);
            View view3 = contactsMigrationActivity2.f32331i;
            if (view3 == null) {
                p005kotlin.jvm.internal.s.m("contactListContainer");
                throw null;
            }
            view3.setVisibility(0);
            for (o oVar3 : arrayList2) {
                ArrayList arrayList4 = new ArrayList();
                if (oVar3.f68413i) {
                    String string = contactsMigrationActivity2.getString(R.string.title_live_track);
                    string.getClass();
                    arrayList4.add(string);
                }
                if (oVar3.f68415k) {
                    String string2 = contactsMigrationActivity2.getString(R.string.incident_detection_assistance_contact);
                    string2.getClass();
                    arrayList4.add(string2);
                }
                oVar3.f68409e = h0.k0(arrayList4, null, null, null, null, 63);
            }
            com.garmin.android.apps.connectmobile.contacts.g gVar = contactsMigrationActivity2.f32327e;
            if (gVar == null) {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
            ArrayList arrayList5 = gVar.f32714d;
            arrayList5.clear();
            if (arrayList2.isEmpty()) {
                th3 = null;
            } else {
                List listN0 = h0.N0(arrayList2, gVar.f32715e);
                arrayList5.addAll(listN0);
                Iterator<Integer> it = j23.t.l(listN0.size() - 1, 1).iterator();
                while (((j23.k) it).f96801c) {
                    int iNextInt = ((p0) it).nextInt();
                    Character chQ0 = d53.y.q0(((o) listN0.get(iNextInt)).f68408d);
                    Character chQ1 = d53.y.q0(((o) listN0.get(iNextInt - 1)).f68408d);
                    if (chQ0 != null) {
                        String strValueOf = String.valueOf(chQ0.charValue());
                        strValueOf.getClass();
                        upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    } else {
                        upperCase = null;
                    }
                    if (chQ1 != null) {
                        String strValueOf2 = String.valueOf(chQ1.charValue());
                        strValueOf2.getClass();
                        upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                    } else {
                        upperCase2 = null;
                    }
                    if (!p005kotlin.jvm.internal.s.g(upperCase, upperCase2) && (chQ0 == null || Character.isLetter(chQ0.charValue()) || chQ1 == null || Character.isLetter(chQ1.charValue()))) {
                        arrayList5.add(iNextInt, gVar.r(((o) listN0.get(iNextInt)).f68408d));
                    }
                }
                th3 = null;
                arrayList5.add(0, gVar.r(((o) listN0.get(0)).f68408d));
            }
            gVar.notifyDataSetChanged();
        }
        if (oVar2 != null && (contactsMigrationActivity = xVar.f68446a) != null) {
            com.garmin.android.apps.connectmobile.contacts.g gVar2 = contactsMigrationActivity.f32327e;
            if (gVar2 == null) {
                p005kotlin.jvm.internal.s.m("adapter");
                throw th3;
            }
            int iIndexOf = gVar2.f32714d.indexOf(oVar2);
            if (iIndexOf != -1) {
                gVar2.notifyItemChanged(iIndexOf);
            }
        }
        ContactsMigrationActivity contactsMigrationActivity3 = xVar.f68446a;
        if (contactsMigrationActivity3 != null) {
            contactsMigrationActivity3.setSubtitle(contactsMigrationActivity3.getString(R.string.contact_management_subtitle_add_contacts, String.valueOf(arrayList3.size()), String.valueOf(xVar.f68452g)));
        }
        ContactsMigrationActivity contactsMigrationActivity4 = xVar.f68446a;
        if (contactsMigrationActivity4 != null) {
            boolean zIsEmpty = arrayList3.isEmpty();
            View view4 = contactsMigrationActivity4.f32328f;
            if (view4 == null) {
                p005kotlin.jvm.internal.s.m("bottomContainer");
                throw th3;
            }
            view4.setVisibility(zIsEmpty ? 8 : 0);
        }
    }

    public final z a() {
        return (z) this.f68447b.getValue();
    }

    public final void b() {
        l20.h hVar = this.f68450e;
        if (hVar == null) {
            return;
        }
        if (hVar instanceof l20.h.c) {
            ContactsMigrationActivity contactsMigrationActivity = this.f68446a;
            if (contactsMigrationActivity != null) {
                contactsMigrationActivity.ca(true);
            }
            a().a();
            a().b();
            return;
        }
        if (hVar instanceof l20.h.b) {
            ContactsMigrationActivity contactsMigrationActivity2 = this.f68446a;
            if (contactsMigrationActivity2 != null) {
                contactsMigrationActivity2.ca(false);
            }
            a().a();
            a().b();
            return;
        }
        if (!(hVar instanceof l20.h.a)) {
            u0.r();
            return;
        }
        l20.h.a aVar = (l20.h.a) hVar;
        List<l20.a> list = aVar.f109002a;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (l20.a aVarG : list) {
            String contactId = aVarG.getContactId();
            if (contactId == null || d53.w.J(contactId)) {
                aVarG = l20.a.g(aVarG, UUID.randomUUID().toString(), null, null, null, null, null, null, null, null, 8190);
            }
            arrayList.add(aVarG);
        }
        this.f68451f = arrayList;
        this.f68452g = aVar.f109003b;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                e(this, arrayList2, null, 2);
                return;
            }
            l20.a aVar2 = (l20.a) it.next();
            String contactId2 = aVar2.getContactId();
            String str = "";
            String str2 = contactId2 == null ? "" : contactId2;
            l20.g gVarQ = aVar2.q();
            String profileImageUrlSmall = gVarQ != null ? gVarQ.getProfileImageUrlSmall() : null;
            String firstName = aVar2.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            String lastName = aVar2.getLastName();
            if (lastName != null) {
                str = lastName;
            }
            arrayList2.add(new o(0L, str2, profileImageUrlSmall, d53.w.i0(firstName + StringUtils.SPACE + str).toString(), null, true, false, 0, p005kotlin.jvm.internal.s.g(aVar2.getIsLiveTrackDefault(), Boolean.TRUE), false, ge1.b.Q(aVar2), false, false, null, false, 31441, null));
        }
    }

    public final void c() {
        c2 c2Var = this.f68457l;
        if (c2Var != null && c2Var.isActive()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "ContactsMigrationPres", "Migration contacts already in progress.");
            return;
        }
        ContactsMigrationActivity contactsMigrationActivity = this.f68446a;
        if (contactsMigrationActivity != null) {
            contactsMigrationActivity.showProgressOverlay();
        }
        u53.d dVar = this.f68455j;
        this.f68457l = dVar != null ? ge1.b.T(dVar, null, null, new b(null), 3) : null;
    }

    public final void d() {
        Object next;
        ArrayList arrayList = this.f68451f;
        if (arrayList == null) {
            p005kotlin.jvm.internal.s.m("allContacts");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            l20.a aVar = (l20.a) obj;
            Iterator it = this.f68453h.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((o) next).f68406b, aVar.getContactId()));
            if (next != null) {
                arrayList2.add(obj);
            }
        }
        this.f68454i = arrayList2;
        if (arrayList2.isEmpty()) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.p(a2Var, "ContactsMigrationPres", "List of contacts to replace is empty.");
            return;
        }
        c2 c2Var = this.f68456k;
        if (c2Var != null && c2Var.isActive()) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.p(a2Var2, "ContactsMigrationPres", "Replace contacts operation already in progress.");
            return;
        }
        ArrayList arrayList3 = this.f68454i;
        if (arrayList3 != null) {
            ContactsMigrationActivity contactsMigrationActivity = this.f68446a;
            if (contactsMigrationActivity != null) {
                contactsMigrationActivity.showProgressOverlay();
            }
            u53.d dVar = this.f68455j;
            this.f68456k = dVar != null ? ge1.b.T(dVar, null, null, new y(this, arrayList3, null), 3) : null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf20/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
