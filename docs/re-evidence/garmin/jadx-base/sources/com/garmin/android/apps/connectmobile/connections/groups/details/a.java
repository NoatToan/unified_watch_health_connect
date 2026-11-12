package com.garmin.android.apps.connectmobile.connections.groups.details;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gncs.NotificationConstants;
import j02.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kg.f;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import to.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/a;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;", "groupDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;)V", "c", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31464g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupDTO f31465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym0.a f31466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<List<AbstractC0510a>> f31467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f31468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap<o, x0> f31469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<g3<Unit>> f31470f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$c;", "Landroidx/lifecycle/x1$c;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;", "groupDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GroupDTO f31478a;

        public c(GroupDTO groupDTO) {
            groupDTO.getClass();
            this.f31478a = groupDTO;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            return new a(this.f31478a);
        }
    }

    static {
        new b(null);
    }

    public a(GroupDTO groupDTO) {
        groupDTO.getClass();
        this.f31465a = groupDTO;
        ym0.a.f197886f.getClass();
        this.f31466b = ym0.a.C3709a.a();
        y0<List<AbstractC0510a>> y0Var = new y0<>(j0.f134944a);
        this.f31467c = y0Var;
        this.f31468d = t1.a(y0Var, new r(2));
        ConcurrentHashMap<o, x0> concurrentHashMap = new ConcurrentHashMap<>();
        this.f31469e = concurrentHashMap;
        this.f31470f = new y0<>(g3.a.e(g3.f35298f));
        concurrentHashMap.clear();
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.connections.groups.details.b(this, null), 2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void x4(AbstractC0510a abstractC0510a, boolean z14) {
        Object obj;
        Object next;
        abstractC0510a.getClass();
        androidx.lifecycle.s0 s0Var = this.f31467c;
        List list = (List) s0Var.d();
        if (list == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "GroupActivityFeedTypeViewModel", "fullActivityTypeList value is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof AbstractC0510a.C0511a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AbstractC0510a.C0511a) next).f31472b != abstractC0510a.getF31471a());
        AbstractC0510a.C0511a c0511a = (AbstractC0510a.C0511a) next;
        if (c0511a == null) {
            String str = "Did not find mainType item: " + abstractC0510a.getF31471a();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "GroupActivityFeedTypeViewModel", str);
            return;
        }
        if (c0511a.f31473c == z14) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int iIndexOf = arrayList2.indexOf(c0511a);
        x0 x0Var = c0511a.f31472b;
        x0Var.getClass();
        arrayList2.set(iIndexOf, new AbstractC0510a.C0511a(x0Var, z14));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (obj3 instanceof AbstractC0510a.b) {
                arrayList3.add(obj3);
            }
        }
        for (Object obj4 : arrayList3) {
            if (((AbstractC0510a.b) obj4).f31474b == abstractC0510a.getF31471a()) {
                obj = obj4;
                break;
            }
        }
        AbstractC0510a.b bVar = (AbstractC0510a.b) obj;
        if (bVar != null) {
            arrayList2.set(arrayList2.indexOf(bVar), AbstractC0510a.b.d(bVar, z14 ? bVar.f31475c : j0.f134944a));
            s0Var.j(arrayList2);
            return;
        }
        String str2 = "Can not find subTypes for type: " + abstractC0510a.getF31471a();
        i2.a aVar3 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var3, "GroupActivityFeedTypeViewModel", str2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.details.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a;", "", "Lam/x0;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lam/x0;)V", "a", "b", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$a;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC0510a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f31471a;

        private AbstractC0510a(x0 x0Var) {
            this.f31471a = x0Var;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public x0 getF31471a() {
            return this.f31471a;
        }

        public /* synthetic */ AbstractC0510a(x0 x0Var, j jVar) {
            this(x0Var);
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.details.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$a;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a;", "Lam/x0;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "isSwitchOn", "<init>", "(Lam/x0;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0511a extends AbstractC0510a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final x0 f31472b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f31473c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0511a(x0 x0Var, boolean z14) {
                super(x0Var, null);
                x0Var.getClass();
                this.f31472b = x0Var;
                this.f31473c = z14;
            }

            @Override // com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final x0 getF31471a() {
                return this.f31472b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0511a)) {
                    return false;
                }
                C0511a c0511a = (C0511a) obj;
                return this.f31472b == c0511a.f31472b && this.f31473c == c0511a.f31473c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f31473c) + (this.f31472b.hashCode() * 31);
            }

            public final String toString() {
                return "MainType(type=" + this.f31472b + ", isSwitchOn=" + this.f31473c + ")";
            }

            public /* synthetic */ C0511a(x0 x0Var, boolean z14, int i14, j jVar) {
                this(x0Var, (i14 & 2) != 0 ? false : z14);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.details.a$a$b */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a$b;", "Lcom/garmin/android/apps/connectmobile/connections/groups/details/a$a;", "Landroid/os/Parcelable;", "Lam/x0;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "fullSubTypes", "selectedSubTypes", "", "otherType", "<init>", "(Lam/x0;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends AbstractC0510a implements Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new C0512a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final x0 f31474b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List<x0> f31475c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final List<x0> f31476d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f31477e;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.details.a$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0512a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    x0 x0Var = (x0) parcel.readParcelable(b.class.getClassLoader());
                    int i14 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i14);
                    int iD = 0;
                    int iD2 = 0;
                    while (iD2 != i14) {
                        iD2 = u0.d(b.class, parcel, arrayList, iD2, 1);
                    }
                    int i15 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i15);
                    while (iD != i15) {
                        iD = u0.d(b.class, parcel, arrayList2, iD, 1);
                    }
                    return new b(x0Var, arrayList, arrayList2, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i14) {
                    return new b[i14];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(x0 x0Var, List<? extends x0> list, List<? extends x0> list2, String str) {
                super(x0Var, null);
                x0Var.getClass();
                list.getClass();
                list2.getClass();
                str.getClass();
                this.f31474b = x0Var;
                this.f31475c = list;
                this.f31476d = list2;
                this.f31477e = str;
            }

            public static b d(b bVar, List list) {
                x0 x0Var = bVar.f31474b;
                List<x0> list2 = bVar.f31475c;
                String str = bVar.f31477e;
                x0Var.getClass();
                list2.getClass();
                list.getClass();
                str.getClass();
                return new b(x0Var, list2, list, str);
            }

            @Override // com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final x0 getF31471a() {
                return this.f31474b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f31474b == bVar.f31474b && s.g(this.f31475c, bVar.f31475c) && s.g(this.f31476d, bVar.f31476d) && s.g(this.f31477e, bVar.f31477e);
            }

            public final int hashCode() {
                return this.f31477e.hashCode() + u0.b(u0.b(this.f31474b.hashCode() * 31, 31, this.f31475c), 31, this.f31476d);
            }

            public final String toString() {
                return "SubType(type=" + this.f31474b + ", fullSubTypes=" + this.f31475c + ", selectedSubTypes=" + this.f31476d + ", otherType=" + this.f31477e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeParcelable(this.f31474b, i14);
                Iterator itE = f.e(this.f31475c, parcel);
                while (itE.hasNext()) {
                    parcel.writeParcelable((Parcelable) itE.next(), i14);
                }
                Iterator itE2 = f.e(this.f31476d, parcel);
                while (itE2.hasNext()) {
                    parcel.writeParcelable((Parcelable) itE2.next(), i14);
                }
                parcel.writeString(this.f31477e);
            }

            public b(x0 x0Var, List list, List list2, String str, int i14, j jVar) {
                this(x0Var, list, (i14 & 4) != 0 ? j0.f134944a : list2, (i14 & 8) != 0 ? "" : str);
            }
        }
    }
}
