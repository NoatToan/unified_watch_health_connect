package nh2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.Logger;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mt0.b2;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.y0;
import p13.h0;
import q03.q;
import q03.r;
import q03.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lnh2/d;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi2.d f126161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y03.e f126162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y03.e f126163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f126164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mh2.a f126165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f126166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<Map<String, Object>> f126167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, Object> f126168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f126169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Map<String, Object>> f126170j;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072n\u0010\u0006\u001aj\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002 \u0005*4\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo13/p;", "", "", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lo13/p;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends w implements l<p<? extends List<? extends Map<String, ? extends Object>>, ? extends Map<String, ? extends Object>>, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f126172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super Boolean, Unit> lVar) {
            super(1);
            this.f126172b = lVar;
        }

        @Override // e23.l
        public final Unit invoke(p<? extends List<? extends Map<String, ? extends Object>>, ? extends Map<String, ? extends Object>> pVar) {
            d.this.f126161a.a("Received UI Composition and Data Values");
            this.f126172b.invoke(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends w implements l<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f126174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super Boolean, Unit> lVar) {
            super(1);
            this.f126174b = lVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            d.this.f126161a.b("Problem in getting either UI Composition or Data Values: " + th3.getLocalizedMessage());
            this.f126174b.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Parcel parcel) {
        this();
        parcel.getClass();
        this.f126164d = parcel.readString();
        this.f126166f = parcel.readByte() != 0;
        List arrayList = new ArrayList();
        this.f126167g = arrayList;
        parcel.readList(arrayList, Map.class.getClassLoader());
        List arrayList2 = new ArrayList();
        this.f126170j = arrayList2;
        parcel.readList(arrayList2, Map.class.getClassLoader());
        Map linkedHashMap = new LinkedHashMap();
        this.f126168h = linkedHashMap;
        parcel.readMap(linkedHashMap, Map.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.f126169i = arrayList3;
        parcel.readList(arrayList3, Map.class.getClassLoader());
    }

    @SuppressLint({"CheckResult"})
    public final void b(l lVar, final String str) {
        this.f126161a.getClass();
        final int i14 = 1;
        u uVar = new u(this) { // from class: nh2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f126159b;

            {
                this.f126159b = this;
            }

            @Override // q03.u
            public final void c(e13.a.C1312a c1312a) throws Throwable {
                int i15 = i14;
                String str2 = str;
                d dVar = this.f126159b;
                switch (i15) {
                    case 0:
                        d.Companion companion = d.INSTANCE;
                        dVar.f126161a.getClass();
                        ge1.b.W(t13.h.f161748a, new i(str2, dVar, c1312a, null));
                        break;
                    default:
                        d.Companion companion2 = d.INSTANCE;
                        dVar.f126161a.getClass();
                        ge1.b.W(t13.h.f161748a, new g(str2, dVar, c1312a, null));
                        break;
                }
            }
        };
        int i15 = w03.b.f181178a;
        e13.a aVar = new e13.a(uVar);
        final int i16 = 0;
        e13.a aVar2 = new e13.a(new u(this) { // from class: nh2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f126159b;

            {
                this.f126159b = this;
            }

            @Override // q03.u
            public final void c(e13.a.C1312a c1312a) throws Throwable {
                int i17 = i16;
                String str2 = str;
                d dVar = this.f126159b;
                switch (i17) {
                    case 0:
                        d.Companion companion = d.INSTANCE;
                        dVar.f126161a.getClass();
                        ge1.b.W(t13.h.f161748a, new i(str2, dVar, c1312a, null));
                        break;
                    default:
                        d.Companion companion2 = d.INSTANCE;
                        dVar.f126161a.getClass();
                        ge1.b.W(t13.h.f161748a, new g(str2, dVar, c1312a, null));
                        break;
                }
            }
        });
        hi2.h.f83906a.getClass();
        q qVar = l13.a.f108328c;
        this.f126162b = new e13.d(r.l(aVar.j(qVar), aVar2.j(qVar), new hb.a(10)).j(l13.a.f108327b).g(r03.a.a()), new nh2.b(this, i16)).h(new b2(new b(lVar), 15), new b2(new c(lVar), 16));
    }

    public final Object d(String str) {
        hi2.d dVar = this.f126161a;
        dVar.getClass();
        if (this.f126168h.isEmpty()) {
            Logger logger = hi2.d.f83889c;
            return null;
        }
        if (str == null) {
            dVar.b("Unable to get data value for jsonKey: " + str);
            return null;
        }
        Map<String, Object> map = this.f126168h;
        List listW = d53.w.W(str, new String[]{"."});
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (it.hasNext()) {
                Object obj = map != null ? map.get(str2) : null;
                if (y0.h(obj)) {
                    if (!y0.h(obj)) {
                        obj = null;
                    }
                    map = (Map) obj;
                } else {
                    if (!(obj instanceof ArrayList)) {
                        dVar.b("Unable to get data value for ".concat(str));
                        return null;
                    }
                    if (it.hasNext()) {
                        map = (Map) ((ArrayList) obj).get(Integer.parseInt((String) it.next()));
                    }
                }
            } else {
                dVar.a("getDataValue: No items after " + str2);
            }
        }
        Object obj2 = map != null ? map.get(h0.m0(listW)) : null;
        dVar.a("getDataValue: Data value for " + str + " -> " + obj2);
        return obj2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f(Context context, List<Map<String, Object>> list, String str) {
        String strSubstring;
        list.getClass();
        str.getClass();
        int iH = d53.w.H(str, ">", 0, false, 6);
        String string = d53.w.i0(str).toString();
        if (iH > 0) {
            string = d53.w.i0(str.substring(0, iH)).toString();
            strSubstring = str.substring(iH + 1, str.length());
        } else {
            strSubstring = "";
        }
        hi2.d dVar = this.f126161a;
        dVar.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            hi2.i.a aVar = hi2.i.f83907a;
            String strValueOf = String.valueOf(map.get(mh2.i.TITLE.f118617a));
            aVar.getClass();
            if (hi2.i.a.c(context, strValueOf, null).equals(string)) {
                Object obj = map.get(mh2.i.CHILD.f118617a);
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    Object obj2 = map2.get(mh2.i.SETTINGS.f118617a);
                    List<Map<String, Object>> list2 = (List) (y0.g(obj2) ? obj2 : null);
                    if (list2 == null) {
                        continue;
                    } else {
                        if (strSubstring.length() <= 0) {
                            this.f126164d = string;
                            this.f126167g = list2;
                            return;
                        }
                        f(context, list2, strSubstring);
                    }
                } else {
                    continue;
                }
            }
        }
        dVar.b("Did not receive view attributes for the ".concat(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f126164d);
        parcel.writeByte(this.f126166f ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f126167g);
        parcel.writeList(this.f126170j);
        parcel.writeMap(this.f126168h);
        parcel.writeList(this.f126169i);
    }

    /* JADX INFO: renamed from: nh2.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnh2/d$a;", "Landroid/os/Parcelable$Creator;", "Lnh2/d;", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<d> {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }

        private Companion() {
        }
    }

    public d() {
        this.f126161a = new hi2.d("SettingsDataModel", null, 2, null);
        this.f126165e = mh2.a.Back;
        this.f126167g = new ArrayList();
        this.f126168h = new LinkedHashMap();
        this.f126169i = new ArrayList();
        this.f126170j = new ArrayList();
    }
}
