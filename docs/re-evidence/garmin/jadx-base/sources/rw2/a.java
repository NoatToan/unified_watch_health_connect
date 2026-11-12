package rw2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import bw2.f;
import com.google.gson.Gson;
import cx2.g;
import cx2.h;
import e23.l;
import e23.p;
import gw2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c2;
import o53.s0;
import o53.t1;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.y0;
import p13.h0;
import p13.j0;
import p13.y;
import u53.o;
import v13.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lrw2/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f154861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c2 f154862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f154863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tv2.c f154864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f154865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f154866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, Object> f154867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<Map<String, Object>> f154868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f154869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f154870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f154871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f154872l;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154873a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.ALERT_VOLUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.BATTERY_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.DATE_PICKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.DOUBLE_LABEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.DOUBLE_LABEL_SELECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[j.EDIT_TEXT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[j.FLOAT_PICKER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[j.HEIGHT_PICKER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[j.INTEGER_INPUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[j.INTEGER_PICKER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[j.MULTI_SELECTION_ITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[j.REORDERABLE_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[j.SINGLE_LABEL_SELECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[j.SWITCH.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[j.TIME_PICKER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[j.TOD_PICKER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[j.WATCH_FACE_GRID.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[j.TEXT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[j.SELECTION_ITEM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f154873a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.datalayer.SettingsDataModel$fetchUICompositions$1", f = "SettingsDataModel.kt", l = {183, 194}, m = "invokeSuspend", v = 1)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f154874a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f154876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f154877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f154878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f154879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f154880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f154881h;

        /* JADX INFO: renamed from: rw2.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
        @v13.e(c = "com.garmin.realtimesettings.app.datalayer.SettingsDataModel$fetchUICompositions$1$1", f = "SettingsDataModel.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C2934a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l<Boolean, Unit> f154882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f154883b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2934a(l<? super Boolean, Unit> lVar, boolean z14, t13.d<? super C2934a> dVar) {
                super(2, dVar);
                this.f154882a = lVar;
                this.f154883b = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2934a(this.f154882a, this.f154883b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2934a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f154882a.invoke(Boolean.valueOf(this.f154883b));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Context context, boolean z14, int i14, int i15, boolean z15, l<? super Boolean, Unit> lVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f154876c = context;
            this.f154877d = z14;
            this.f154878e = i14;
            this.f154879f = i15;
            this.f154880g = z15;
            this.f154881h = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f154876c, this.f154877d, this.f154878e, this.f154879f, this.f154880g, this.f154881h, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        
            if (ge1.b.e0(r0, r1, r16) == r8) goto L25;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f154874a;
            boolean z14 = false;
            int i15 = this.f154878e;
            a aVar2 = a.this;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                a aVar3 = a.this;
                Context context = this.f154876c;
                boolean z15 = this.f154877d;
                int i16 = this.f154878e;
                int i17 = this.f154879f;
                boolean z16 = this.f154880g;
                this.f154874a = 1;
                if (a.b(aVar3, context, z15, i16, i17, z16, this) == aVar) {
                }
                return aVar;
                aVar2.f154861a.b("fetchUICompositions: Received UI Composition for " + i15);
                z14 = true;
            } catch (NullPointerException e4) {
                h hVar = aVar2.f154861a;
                String strE = sn.a.e(i15, "fetchUICompositions: Received null from device for ", ": ", e4.getLocalizedMessage());
                Logger logger = h.f56678c;
                hVar.d(null, strE);
            } catch (Exception e14) {
                h hVar2 = aVar2.f154861a;
                String strE2 = sn.a.e(i15, "fetchUICompositions: Problem in getting UI Composition for ", ": ", e14.getLocalizedMessage());
                Logger logger2 = h.f56678c;
                hVar2.d(null, strE2);
            }
            x53.c cVar = s0.f129406a;
            t1 t1Var = o.f168762a;
            C2934a c2934a = new C2934a(this.f154881h, z14, null);
            this.f154874a = 2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Parcel parcel) {
        this();
        parcel.getClass();
        this.f154864d = (tv2.c) parcel.readParcelable(tv2.c.class.getClassLoader());
        this.f154865e = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        this.f154866f = arrayList;
        parcel.readList(arrayList, Map.class.getClassLoader());
        List arrayList2 = new ArrayList();
        this.f154868h = arrayList2;
        parcel.readList(arrayList2, Map.class.getClassLoader());
        Map linkedHashMap = new LinkedHashMap();
        this.f154867g = linkedHashMap;
        parcel.readMap(linkedHashMap, Map.class.getClassLoader());
        this.f154869i = parcel.readInt();
        this.f154871k = (e) parcel.readParcelable(e.class.getClassLoader());
        this.f154872l = (e) parcel.readParcelable(e.class.getClassLoader());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object b(a aVar, Context context, boolean z14, int i14, int i15, boolean z15, v13.c cVar) throws Throwable {
        rw2.c cVar2;
        int i16;
        h hVar = aVar.f154861a;
        if (cVar instanceof rw2.c) {
            cVar2 = (rw2.c) cVar;
            int i17 = cVar2.f154893d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                cVar2.f154893d = i17 - Integer.MIN_VALUE;
            } else {
                cVar2 = new rw2.c(aVar, cVar);
            }
        } else {
            cVar2 = new rw2.c(aVar, cVar);
        }
        rw2.c cVar3 = cVar2;
        Object objA = cVar3.f154891b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i18 = cVar3.f154893d;
        if (i18 == 0) {
            r.b(objA);
            hVar.getClass();
            hw2.c cVar4 = new hw2.c();
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            long j8 = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192449a;
            String str = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192450b;
            cVar3.f154890a = i14;
            cVar3.f154893d = 1;
            objA = cVar4.a(context, j8, str, i14, i15, z14, z15, cVar3);
            if (objA == aVar2) {
                return aVar2;
            }
            i16 = i14;
        } else {
            if (i18 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i16 = cVar3.f154890a;
            r.b(objA);
        }
        JSONObject jSONObject = (JSONObject) objA;
        Object objOpt = jSONObject.opt(gw2.i.ROWS.f79975a);
        if (objOpt == null) {
            Logger logger = h.f56678c;
            hVar.getClass();
        } else if (objOpt instanceof JSONArray) {
            com.garmin.realtimesettings.app.util.a.f52669a.getClass();
            aVar.f154866f = h0.d1(com.garmin.realtimesettings.app.util.a.C1130a.a((JSONArray) objOpt));
        } else {
            Logger logger2 = h.f56678c;
            hVar.d(null, "getComposition: row is not in json array");
        }
        Object objOpt2 = jSONObject.opt(gw2.i.MENU_ITEMS.f79975a);
        if (objOpt2 == null) {
            aVar.f154868h = new ArrayList();
            Logger logger3 = h.f56678c;
            hVar.getClass();
        } else if (objOpt2 instanceof JSONArray) {
            com.garmin.realtimesettings.app.util.a.f52669a.getClass();
            aVar.f154868h = h0.d1(com.garmin.realtimesettings.app.util.a.C1130a.a((JSONArray) objOpt2));
        } else {
            Logger logger4 = h.f56678c;
            hVar.d(null, "getComposition: menu is not in json array");
        }
        gw2.i iVar = gw2.i.TITLE;
        if (jSONObject.has(iVar.f79975a)) {
            com.garmin.realtimesettings.app.util.a.C1130a c1130a = com.garmin.realtimesettings.app.util.a.f52669a;
            Object obj = jSONObject.get(iVar.f79975a);
            obj.getClass();
            c1130a.getClass();
            aVar.f154864d = g.b(com.garmin.realtimesettings.app.util.a.C1130a.b(obj));
        } else {
            String strH = am.j.h(i16, "Title not found for composition: ");
            Logger logger5 = h.f56678c;
            hVar.d(null, strH);
        }
        aVar.f154871k = new e(jSONObject.optLong(gw2.i.GLOBAL_VERSION.f79975a, 0L), jSONObject.optLong(gw2.i.VERSION.f79975a, 0L));
        if (!aVar.f154866f.isEmpty()) {
            return aVar.f154866f;
        }
        vb.h.z("getComposition: viewAttrs is empty");
        return null;
    }

    public final void d(Context context, int i14, int i15, boolean z14, boolean z15, l<? super Boolean, Unit> lVar) {
        c2 c2Var;
        this.f154861a.getClass();
        this.f154869i = i14;
        c2 c2Var2 = this.f154862b;
        if (c2Var2 != null && c2Var2.isActive() && (c2Var = this.f154862b) != null) {
            c2Var.c(null);
        }
        this.f154869i = i14;
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        this.f154862b = ge1.b.T(com.garmin.realtimesettings.app.initialization.b.f52593e, null, null, new c(context, z14, i14, i15, z15, lVar, null), 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v204, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v205, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v207, types: [java.util.ArrayList] */
    public final Object f(j jVar, Map<String, ? extends Object> map, int i14) {
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Long l14;
        Long l15;
        Map map7;
        Map map8;
        Object dVar;
        Map map9;
        Map map10;
        Map map11;
        Map map12;
        Map map13;
        Map map14;
        Map map15;
        Map map16;
        Map map17;
        Map map18;
        Map map19;
        Map map20;
        Map map21;
        Object dVar2;
        Map map22;
        Map map23;
        Map map24;
        Map map25;
        Map map26;
        Map map27;
        Map map28;
        Map map29;
        Map map30;
        Map map31;
        Map map32;
        Map map33;
        Map map34;
        List list;
        ArrayList arrayList;
        Object bVar;
        Map map35;
        List<Map> list2;
        ?? arrayList2;
        List list3;
        String str;
        Map map36;
        Map map37;
        Boolean bool;
        Map map38;
        Map map39;
        Map map40;
        Map map41;
        Map map42;
        Map map43;
        Map map44;
        Map map45;
        Map map46;
        Map map47;
        String str2;
        List list4;
        Map map48;
        Object obj;
        Map map49;
        Object obj2;
        List<Map> list5;
        Boolean bool2;
        sv2.b bVar2;
        Map map50;
        jVar.getClass();
        map.getClass();
        int iF = -1;
        long jA = 0;
        String str3 = null;
        Map map51 = null;
        Map map52 = null;
        String str4 = null;
        switch (b.f154873a[jVar.ordinal()]) {
            case 1:
                wu2.d.a aVar = wu2.d.f187341a;
                Map<String, Object> map53 = this.f154867g;
                aVar.getClass();
                return wu2.d.a.b(i14, map53);
            case 2:
                cv2.a.C1211a c1211a = cv2.a.f55912a;
                Map<String, Object> map54 = this.f154867g;
                c1211a.getClass();
                map54.getClass();
                dw2.b.f61449a.getClass();
                Map mapA = dw2.b.a(i14, map54);
                if (mapA == null) {
                    return null;
                }
                Object obj3 = mapA.get(gw2.i.ALERT_VOLUME_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj3)) {
                        obj3 = null;
                    }
                    map2 = (Map) obj3;
                    break;
                } catch (ClassCastException unused) {
                    map2 = null;
                }
                Object obj4 = map2 != null ? map2.get(gw2.i.ALERT_DIALECT.f79975a) : null;
                try {
                    if (!(obj4 instanceof String)) {
                        obj4 = null;
                    }
                    str3 = (String) obj4;
                } catch (ClassCastException unused2) {
                }
                bVar = new cv2.b(str3);
                return bVar;
            case 3:
                xu2.a.C3588a c3588a = xu2.a.f192253a;
                Map<String, Object> map55 = this.f154867g;
                c3588a.getClass();
                return xu2.a.C3588a.a(i14, map55);
            case 4:
                fv2.e.a aVar2 = fv2.e.f73748a;
                Map<String, Object> map56 = this.f154867g;
                aVar2.getClass();
                return fv2.e.a.b(i14, map56);
            case 5:
                ev2.b.a aVar3 = ev2.b.f66165a;
                Map<String, Object> map57 = this.f154867g;
                aVar3.getClass();
                return ev2.b.a.a(i14, map57);
            case 6:
                lv2.b.a aVar4 = lv2.b.f115050a;
                Map<String, Object> map58 = this.f154867g;
                aVar4.getClass();
                map58.getClass();
                dw2.b.f61449a.getClass();
                Map mapA2 = dw2.b.a(i14, map58);
                if (mapA2 == null) {
                    return null;
                }
                Object obj5 = mapA2.get(gw2.i.DOUBLE_LABEL_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj5)) {
                        obj5 = null;
                    }
                    map3 = (Map) obj5;
                    break;
                } catch (ClassCastException unused3) {
                    map3 = null;
                }
                Object obj6 = map3 != null ? map3.get(gw2.i.SELECTION_SETTINGS.f79975a) : null;
                try {
                    if (!y0.h(obj6)) {
                        obj6 = null;
                    }
                    map4 = (Map) obj6;
                    break;
                } catch (ClassCastException unused4) {
                    map4 = null;
                }
                Object obj7 = map3 != null ? map3.get(gw2.i.SUBTEXT.f79975a) : null;
                try {
                    if (!(obj7 instanceof Map)) {
                        obj7 = null;
                    }
                    map5 = (Map) obj7;
                    break;
                } catch (ClassCastException unused5) {
                    map5 = null;
                }
                Object obj8 = map3 != null ? map3.get(gw2.i.ICON_SETTINGS.f79975a) : null;
                try {
                    if (!y0.h(obj8)) {
                        obj8 = null;
                    }
                    map6 = (Map) obj8;
                    break;
                } catch (ClassCastException unused6) {
                    map6 = null;
                }
                Object obj9 = map6 != null ? map6.get(gw2.i.LIGHT_COLOR.f79975a) : null;
                try {
                    if (!(obj9 instanceof Long)) {
                        obj9 = null;
                    }
                    l14 = (Long) obj9;
                    break;
                } catch (ClassCastException unused7) {
                    l14 = null;
                }
                Object obj10 = map6 != null ? map6.get(gw2.i.DARK_COLOR.f79975a) : null;
                try {
                    if (!(obj10 instanceof Long)) {
                        obj10 = null;
                    }
                    l15 = (Long) obj10;
                    break;
                } catch (ClassCastException unused8) {
                    l15 = null;
                }
                lv2.b.f115050a.getClass();
                lv2.c cVarA = lv2.b.a.a(map, map4, map5, l14, l15);
                bVar = cVarA;
                if (cVarA == null) {
                    bVar = new lv2.c(null, g.b(map5), l14, l15);
                }
                return bVar;
            case 7:
                ov2.c.a aVar5 = ov2.c.f134263a;
                Map<String, Object> map59 = this.f154867g;
                aVar5.getClass();
                return ov2.c.a.a(map59, map, i14);
            case 8:
                gv2.c.a aVar6 = gv2.c.f79452a;
                Map<String, Object> map60 = this.f154867g;
                aVar6.getClass();
                map60.getClass();
                gv2.c.f79453b.getClass();
                tv2.c cVar = new tv2.c(null, null, null, null, null, 30, null);
                tv2.c cVar2 = new tv2.c(null, null, null, null, null, 30, null);
                tv2.c cVar3 = new tv2.c(null, null, null, null, null, 30, null);
                dw2.b.f61449a.getClass();
                Map mapA3 = dw2.b.a(i14, map60);
                double d14 = -1.0d;
                if (mapA3 != null) {
                    Object obj11 = mapA3.get(gw2.i.DOUBLE_LABEL_SETTINGS.f79975a);
                    try {
                        if (!y0.h(obj11)) {
                            obj11 = null;
                        }
                        map9 = (Map) obj11;
                    } catch (ClassCastException unused9) {
                        map9 = null;
                    }
                    Object obj12 = map9 != null ? map9.get(gw2.i.FLOAT_PICKER_SETTINGS.f79975a) : null;
                    try {
                        if (!y0.h(obj12)) {
                            obj12 = null;
                        }
                        map10 = (Map) obj12;
                    } catch (ClassCastException unused10) {
                        map10 = null;
                    }
                    if (map10 != null) {
                        d14 = Double.parseDouble(String.valueOf(map10.get(gw2.i.FLOAT_VALUE.f79975a)));
                        Object obj13 = map10.get(gw2.i.FORMATTED_VALUE.f79975a);
                        try {
                            if (!(obj13 instanceof Map)) {
                                obj13 = null;
                            }
                            map11 = (Map) obj13;
                        } catch (ClassCastException unused11) {
                            map11 = null;
                        }
                        cVar = g.b(map11);
                        Object obj14 = map10.get(gw2.i.MEASUREMENT_UNIT.f79975a);
                        try {
                            if (!(obj14 instanceof Map)) {
                                obj14 = null;
                            }
                            map12 = (Map) obj14;
                        } catch (ClassCastException unused12) {
                            map12 = null;
                        }
                        cVar2 = g.b(map12);
                        Object obj15 = map10.get(gw2.i.PICKER_TITLE.f79975a);
                        try {
                            if (!(obj15 instanceof Map)) {
                                obj15 = null;
                            }
                            map13 = (Map) obj15;
                        } catch (ClassCastException unused13) {
                            map13 = null;
                        }
                        cVar3 = g.b(map13);
                    }
                    break;
                }
                double d15 = d14;
                tv2.c cVar4 = cVar;
                tv2.c cVar5 = cVar2;
                tv2.c cVar6 = cVar3;
                Object obj16 = map.get(gw2.i.LINK_OPTIONS.f79975a);
                try {
                    if (!(obj16 instanceof Map)) {
                        obj16 = null;
                    }
                    map7 = (Map) obj16;
                    break;
                } catch (ClassCastException unused14) {
                    map7 = null;
                }
                Object obj17 = map7 != null ? map7.get(gw2.i.FLOAT_PICKER_OPTIONS.f79975a) : null;
                try {
                    if (!(obj17 instanceof Map)) {
                        obj17 = null;
                    }
                    map8 = (Map) obj17;
                    break;
                } catch (ClassCastException unused15) {
                    map8 = null;
                }
                cx2.b.a aVar7 = cx2.b.f56665a;
                String strValueOf = String.valueOf(map8 != null ? map8.get(gw2.i.MINIMUM.f79975a) : null);
                aVar7.getClass();
                dVar = new gv2.d(d15, cVar4, cVar6, cVar5, cx2.b.a.b(strValueOf), cx2.b.a.b(String.valueOf(map8 != null ? map8.get(gw2.i.MAXIMUM.f79975a) : null)), cx2.b.a.c(String.valueOf(map8 != null ? map8.get(gw2.i.PRECISION.f79975a) : null)), cx2.b.a.b(String.valueOf(map8 != null ? map8.get(gw2.i.GRANULARITY.f79975a) : null)));
                return dVar;
            case 9:
                hv2.c.a aVar8 = hv2.c.f85903a;
                Map<String, Object> map61 = this.f154867g;
                aVar8.getClass();
                map61.getClass();
                hv2.c.f85904b.getClass();
                dw2.b.f61449a.getClass();
                Map mapA4 = dw2.b.a(i14, map61);
                if (mapA4 != null) {
                    Object obj18 = mapA4.get(gw2.i.DOUBLE_LABEL_SETTINGS.f79975a);
                    try {
                        if (!y0.h(obj18)) {
                            obj18 = null;
                        }
                        map14 = (Map) obj18;
                    } catch (ClassCastException unused16) {
                        map14 = null;
                    }
                    Object obj19 = map14 != null ? map14.get(gw2.i.HEIGHT_PICKER_SETTINGS.f79975a) : null;
                    try {
                        if (!y0.h(obj19)) {
                            obj19 = null;
                        }
                        map15 = (Map) obj19;
                    } catch (ClassCastException unused17) {
                        map15 = null;
                    }
                    if (map15 != null) {
                        Object obj20 = map15.get(gw2.i.FORMATTED_VALUE.f79975a);
                        try {
                            if (!(obj20 instanceof Map)) {
                                obj20 = null;
                            }
                            map16 = (Map) obj20;
                            break;
                        } catch (ClassCastException unused18) {
                            map16 = null;
                        }
                        tv2.c cVarB = g.b(map16);
                        int iF2 = fb1.c.f(map15, gw2.i.HEIGHT_VALUE.f79975a, cx2.b.f56665a);
                        Object obj21 = map15.get(gw2.i.MEASUREMENT_UNIT.f79975a);
                        try {
                            if (!(obj21 instanceof String)) {
                                obj21 = null;
                            }
                            str4 = (String) obj21;
                        } catch (ClassCastException unused19) {
                        }
                        bVar = new hv2.d(cVarB, Integer.valueOf(iF2), str4);
                        return bVar;
                    }
                    break;
                }
                h.c(hv2.c.f85904b, "getHeightPickerOptions: Unable to get height picker values");
                return null;
            case 10:
                iv2.c.a aVar9 = iv2.c.f95221a;
                Map<String, Object> map62 = this.f154867g;
                aVar9.getClass();
                map62.getClass();
                iv2.c.f95222b.getClass();
                tv2.c cVar7 = new tv2.c(null, null, null, null, null, 30, null);
                tv2.c cVar8 = new tv2.c(null, null, null, null, null, 30, null);
                dw2.b.f61449a.getClass();
                Map mapA5 = dw2.b.a(i14, map62);
                if (mapA5 != null) {
                    Object obj22 = mapA5.get(gw2.i.DOUBLE_LABEL_SETTINGS.f79975a);
                    try {
                        if (!y0.h(obj22)) {
                            obj22 = null;
                        }
                        map22 = (Map) obj22;
                    } catch (ClassCastException unused20) {
                        map22 = null;
                    }
                    Object obj23 = map22 != null ? map22.get(gw2.i.INTEGER_INPUT_SETTINGS.f79975a) : null;
                    try {
                        if (!y0.h(obj23)) {
                            obj23 = null;
                        }
                        map23 = (Map) obj23;
                    } catch (ClassCastException unused21) {
                        map23 = null;
                    }
                    if (map23 != null) {
                        iF = fb1.c.f(map23, gw2.i.INTEGER_VALUE.f79975a, cx2.b.f56665a);
                        Object obj24 = map23.get(gw2.i.FORMATTED_VALUE.f79975a);
                        try {
                            if (!(obj24 instanceof Map)) {
                                obj24 = null;
                            }
                            map24 = (Map) obj24;
                        } catch (ClassCastException unused22) {
                            map24 = null;
                        }
                        cVar7 = g.b(map24);
                        Object obj25 = map23.get(gw2.i.MEASUREMENT_UNIT.f79975a);
                        try {
                            if (!(obj25 instanceof Map)) {
                                obj25 = null;
                            }
                            map25 = (Map) obj25;
                        } catch (ClassCastException unused23) {
                            map25 = null;
                        }
                        cVar8 = g.b(map25);
                    }
                    break;
                }
                int i15 = iF;
                tv2.c cVar9 = cVar7;
                tv2.c cVar10 = cVar8;
                Object obj26 = map.get(gw2.i.LINK_OPTIONS.f79975a);
                try {
                    if (!(obj26 instanceof Map)) {
                        obj26 = null;
                    }
                    map17 = (Map) obj26;
                    break;
                } catch (ClassCastException unused24) {
                    map17 = null;
                }
                Object obj27 = map17 != null ? map17.get(gw2.i.INTEGER_INPUT_OPTIONS.f79975a) : null;
                try {
                    if (!(obj27 instanceof Map)) {
                        obj27 = null;
                    }
                    map18 = (Map) obj27;
                    break;
                } catch (ClassCastException unused25) {
                    map18 = null;
                }
                Object obj28 = map18 != null ? map18.get(gw2.i.TITLE.f79975a) : null;
                try {
                    if (!(obj28 instanceof Map)) {
                        obj28 = null;
                    }
                    map19 = (Map) obj28;
                    break;
                } catch (ClassCastException unused26) {
                    map19 = null;
                }
                tv2.c cVarB2 = g.b(map19);
                Object obj29 = map18 != null ? map18.get(gw2.i.INFORMATION_MESSAGE.f79975a) : null;
                try {
                    if (!(obj29 instanceof Map)) {
                        obj29 = null;
                    }
                    map20 = (Map) obj29;
                    break;
                } catch (ClassCastException unused27) {
                    map20 = null;
                }
                tv2.c cVarB3 = g.b(map20);
                Object obj30 = map18 != null ? map18.get(gw2.i.ERROR_MESSAGE.f79975a) : null;
                try {
                    if (!(obj30 instanceof Map)) {
                        obj30 = null;
                    }
                    map21 = (Map) obj30;
                    break;
                } catch (ClassCastException unused28) {
                    map21 = null;
                }
                tv2.c cVarB4 = g.b(map21);
                cx2.b.a aVar10 = cx2.b.f56665a;
                String strValueOf2 = String.valueOf(map18 != null ? map18.get(gw2.i.MINIMUM_VALUE.f79975a) : null);
                aVar10.getClass();
                dVar2 = new iv2.d(i15, cVar9, cVar10, cx2.b.a.c(strValueOf2), cx2.b.a.c(String.valueOf(map18 != null ? map18.get(gw2.i.MAXIMUM_VALUE.f79975a) : null)), cx2.b.a.c(String.valueOf(map18 != null ? map18.get(gw2.i.DEFAULT_VALUE.f79975a) : null)), cVarB2, cVarB3, cVarB4);
                return dVar2;
            case 11:
                jv2.c.a aVar11 = jv2.c.f101195a;
                Map<String, Object> map63 = this.f154867g;
                aVar11.getClass();
                map63.getClass();
                jv2.c.f101196b.getClass();
                tv2.c cVar11 = new tv2.c(null, null, null, null, null, 30, null);
                tv2.c cVar12 = new tv2.c(null, null, null, null, null, 30, null);
                tv2.c cVar13 = new tv2.c(null, null, null, null, null, 30, null);
                dw2.b.f61449a.getClass();
                Map mapA6 = dw2.b.a(i14, map63);
                if (mapA6 != null) {
                    Object obj31 = mapA6.get(gw2.i.DOUBLE_LABEL_SETTINGS.f79975a);
                    try {
                        if (!y0.h(obj31)) {
                            obj31 = null;
                        }
                        map28 = (Map) obj31;
                    } catch (ClassCastException unused29) {
                        map28 = null;
                    }
                    Object obj32 = map28 != null ? map28.get(gw2.i.INTEGER_PICKER_SETTINGS.f79975a) : null;
                    try {
                        if (!y0.h(obj32)) {
                            obj32 = null;
                        }
                        map29 = (Map) obj32;
                    } catch (ClassCastException unused30) {
                        map29 = null;
                    }
                    if (map29 != null) {
                        iF = fb1.c.f(map29, gw2.i.INTEGER_VALUE.f79975a, cx2.b.f56665a);
                        Object obj33 = map29.get(gw2.i.FORMATTED_VALUE.f79975a);
                        try {
                            if (!(obj33 instanceof Map)) {
                                obj33 = null;
                            }
                            map30 = (Map) obj33;
                        } catch (ClassCastException unused31) {
                            map30 = null;
                        }
                        cVar11 = g.b(map30);
                        Object obj34 = map29.get(gw2.i.MEASUREMENT_UNIT.f79975a);
                        try {
                            if (!(obj34 instanceof Map)) {
                                obj34 = null;
                            }
                            map31 = (Map) obj34;
                        } catch (ClassCastException unused32) {
                            map31 = null;
                        }
                        cVar12 = g.b(map31);
                        Object obj35 = map29.get(gw2.i.PICKER_TITLE.f79975a);
                        try {
                            if (!(obj35 instanceof Map)) {
                                obj35 = null;
                            }
                            map32 = (Map) obj35;
                        } catch (ClassCastException unused33) {
                            map32 = null;
                        }
                        cVar13 = g.b(map32);
                    }
                    break;
                }
                int i16 = iF;
                tv2.c cVar14 = cVar11;
                tv2.c cVar15 = cVar12;
                tv2.c cVar16 = cVar13;
                Object obj36 = map.get(gw2.i.LINK_OPTIONS.f79975a);
                try {
                    if (!(obj36 instanceof Map)) {
                        obj36 = null;
                    }
                    map26 = (Map) obj36;
                    break;
                } catch (ClassCastException unused34) {
                    map26 = null;
                }
                Object obj37 = map26 != null ? map26.get(gw2.i.INTEGER_PICKER_OPTIONS.f79975a) : null;
                try {
                    if (!(obj37 instanceof Map)) {
                        obj37 = null;
                    }
                    map27 = (Map) obj37;
                    break;
                } catch (ClassCastException unused35) {
                    map27 = null;
                }
                cx2.b.a aVar12 = cx2.b.f56665a;
                String strValueOf3 = String.valueOf(map27 != null ? map27.get(gw2.i.MINIMUM.f79975a) : null);
                aVar12.getClass();
                dVar = new jv2.d(i16, cVar14, cVar16, cVar15, cx2.b.a.c(strValueOf3), cx2.b.a.c(String.valueOf(map27 != null ? map27.get(gw2.i.MAXIMUM.f79975a) : null)), cx2.b.a.c(String.valueOf(map27 != null ? map27.get(gw2.i.GRANULARITY.f79975a) : null)));
                return dVar;
            case 12:
                kv2.c.a aVar13 = kv2.c.f106814a;
                Map<String, Object> map64 = this.f154867g;
                aVar13.getClass();
                map64.getClass();
                dw2.b.f61449a.getClass();
                Map mapA7 = dw2.b.a(i14, map64);
                if (mapA7 == null) {
                    return null;
                }
                Object obj38 = mapA7.get(gw2.i.DOUBLE_LABEL_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj38)) {
                        obj38 = null;
                    }
                    map33 = (Map) obj38;
                    break;
                } catch (ClassCastException unused36) {
                    map33 = null;
                }
                Object obj39 = map33 != null ? map33.get(gw2.i.MULTI_SELECTION_SETTINGS.f79975a) : null;
                try {
                    if (!y0.h(obj39)) {
                        obj39 = null;
                    }
                    map34 = (Map) obj39;
                    break;
                } catch (ClassCastException unused37) {
                    map34 = null;
                }
                cx2.b.a aVar14 = cx2.b.f56665a;
                Object obj40 = map34 != null ? map34.get(gw2.i.SELECTED_INDEXES.f79975a) : null;
                try {
                    if (!(obj40 instanceof List)) {
                        obj40 = null;
                    }
                    list = (List) obj40;
                    break;
                } catch (ClassCastException unused38) {
                    list = null;
                }
                if (list == null) {
                    list = j0.f134944a;
                }
                aVar14.getClass();
                list.getClass();
                try {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
                    }
                } catch (Exception unused39) {
                    h.c(cx2.b.f56666b, list + " cannot be converted to intList");
                    arrayList = new ArrayList();
                }
                Object obj41 = map34 != null ? map34.get(gw2.i.FORMATTED_VALUE.f79975a) : null;
                try {
                    if (!(obj41 instanceof Map)) {
                        obj41 = null;
                    }
                    map52 = (Map) obj41;
                } catch (ClassCastException unused40) {
                }
                return new kv2.d(arrayList, g.b(map52));
            case 13:
                wv2.c.a aVar15 = wv2.c.f187470a;
                Map<String, Object> map65 = this.f154867g;
                aVar15.getClass();
                map65.getClass();
                Object obj42 = map.get(gw2.i.REORDERABLE_LIST_OPTIONS.f79975a);
                try {
                    if (!(obj42 instanceof Map)) {
                        obj42 = null;
                    }
                    map35 = (Map) obj42;
                    break;
                } catch (ClassCastException unused41) {
                    map35 = null;
                }
                Object obj43 = map35 != null ? map35.get(gw2.i.REORDERABLE_LIST_ITEMS.f79975a) : null;
                try {
                    if (!(obj43 instanceof List)) {
                        obj43 = null;
                    }
                    list2 = (List) obj43;
                    break;
                } catch (ClassCastException unused42) {
                    list2 = null;
                }
                if (list2 != null) {
                    arrayList2 = new ArrayList(y.r(list2, 10));
                    for (Map map66 : list2) {
                        cx2.b.a aVar16 = cx2.b.f56665a;
                        String strValueOf4 = String.valueOf(map66.get(gw2.i.ROW_ID.f79975a));
                        aVar16.getClass();
                        arrayList2.add(Integer.valueOf(cx2.b.a.c(strValueOf4)));
                    }
                } else {
                    arrayList2 = j0.f134944a;
                }
                ArrayList arrayList3 = new ArrayList();
                Object obj44 = map65.get(gw2.i.ROWS.f79975a);
                try {
                    if (!(obj44 instanceof List)) {
                        obj44 = null;
                    }
                    list3 = (List) obj44;
                    break;
                } catch (ClassCastException unused43) {
                    list3 = null;
                }
                if (list3 == null) {
                    return null;
                }
                ListIterator listIterator = list3.listIterator();
                while (listIterator.hasNext()) {
                    Map map67 = (Map) listIterator.next();
                    int iF3 = fb1.c.f(map67, gw2.i.ROW_ID.f79975a, cx2.b.f56665a);
                    if (arrayList2.contains(Integer.valueOf(iF3))) {
                        Object obj45 = map67.get(gw2.i.VIEW_STATE.f79975a);
                        if (obj45 != null) {
                            try {
                                if (!(obj45 instanceof String)) {
                                    obj45 = null;
                                }
                                str = (String) obj45;
                            } catch (ClassCastException unused44) {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            arrayList3.add(new xv2.d(iF3, str));
                        }
                        break;
                    }
                }
                boolean zIsEmpty = arrayList3.isEmpty();
                bVar = arrayList3;
                if (zIsEmpty) {
                    return null;
                }
                return bVar;
            case 14:
                lv2.b.a aVar17 = lv2.b.f115050a;
                Map<String, Object> map68 = this.f154867g;
                aVar17.getClass();
                map68.getClass();
                dw2.b.f61449a.getClass();
                Map mapA8 = dw2.b.a(i14, map68);
                if (mapA8 == null) {
                    return null;
                }
                Object obj46 = mapA8.get(gw2.i.SINGLE_LABEL_SELECTION_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj46)) {
                        obj46 = null;
                    }
                    map36 = (Map) obj46;
                    break;
                } catch (ClassCastException unused45) {
                    map36 = null;
                }
                lv2.b.f115050a.getClass();
                return lv2.b.a.a(map, map36, null, null, null);
            case 15:
                f.a aVar18 = f.f21591a;
                Map<String, Object> map69 = this.f154867g;
                aVar18.getClass();
                map69.getClass();
                dw2.b.f61449a.getClass();
                Map mapA9 = dw2.b.a(i14, map69);
                if (mapA9 == null) {
                    return null;
                }
                Object obj47 = mapA9.get(gw2.i.TOGGLE_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj47)) {
                        obj47 = null;
                    }
                    map37 = (Map) obj47;
                    break;
                } catch (ClassCastException unused46) {
                    map37 = null;
                }
                Object obj48 = map37 != null ? map37.get(gw2.i.TOGGLE_VALUE.f79975a) : null;
                try {
                    if (!(obj48 instanceof Boolean)) {
                        obj48 = null;
                    }
                    bool = (Boolean) obj48;
                    break;
                } catch (ClassCastException unused47) {
                    bool = null;
                }
                Object obj49 = map37 != null ? map37.get(gw2.i.SUBTEXT.f79975a) : null;
                try {
                    if (!(obj49 instanceof Map)) {
                        obj49 = null;
                    }
                    map38 = (Map) obj49;
                    break;
                } catch (ClassCastException unused48) {
                    map38 = null;
                }
                tv2.c cVarB5 = g.b(map38);
                if (bool != null) {
                    return new bw2.g(bool.booleanValue(), cVarB5);
                }
                return null;
            case 16:
                mv2.d.a aVar19 = mv2.d.f121205a;
                Map<String, Object> map70 = this.f154867g;
                aVar19.getClass();
                map70.getClass();
                mv2.d.f121206b.getClass();
                tv2.c cVar17 = new tv2.c(null, null, null, null, null, 30, null);
                tv2.c cVar18 = new tv2.c(null, null, null, null, null, 30, null);
                dw2.b.f61449a.getClass();
                Map mapA10 = dw2.b.a(i14, map70);
                if (mapA10 != null) {
                    Object obj50 = mapA10.get(gw2.i.DOUBLE_LABEL_SETTINGS.f79975a);
                    try {
                        if (!y0.h(obj50)) {
                            obj50 = null;
                        }
                        map41 = (Map) obj50;
                    } catch (ClassCastException unused49) {
                        map41 = null;
                    }
                    Object obj51 = map41 != null ? map41.get(gw2.i.TIME_PICKER_SETTINGS.f79975a) : null;
                    try {
                        if (!y0.h(obj51)) {
                            obj51 = null;
                        }
                        map42 = (Map) obj51;
                    } catch (ClassCastException unused50) {
                        map42 = null;
                    }
                    if (map42 != null) {
                        cx2.b.a aVar20 = cx2.b.f56665a;
                        String strValueOf5 = String.valueOf(map42.get(gw2.i.SECONDS.f79975a));
                        aVar20.getClass();
                        jA = cx2.b.a.a(strValueOf5);
                        Object obj52 = map42.get(gw2.i.FORMATTED_VALUE.f79975a);
                        try {
                            if (!(obj52 instanceof Map)) {
                                obj52 = null;
                            }
                            map43 = (Map) obj52;
                        } catch (ClassCastException unused51) {
                            map43 = null;
                        }
                        cVar17 = g.b(map43);
                        Object obj53 = map42.get(gw2.i.PICKER_TITLE.f79975a);
                        try {
                            if (!(obj53 instanceof Map)) {
                                obj53 = null;
                            }
                            map44 = (Map) obj53;
                        } catch (ClassCastException unused52) {
                            map44 = null;
                        }
                        cVar18 = g.b(map44);
                    }
                    break;
                }
                long j8 = jA;
                tv2.c cVar19 = cVar17;
                tv2.c cVar20 = cVar18;
                Object obj54 = map.get(gw2.i.LINK_OPTIONS.f79975a);
                try {
                    if (!(obj54 instanceof Map)) {
                        obj54 = null;
                    }
                    map39 = (Map) obj54;
                    break;
                } catch (ClassCastException unused53) {
                    map39 = null;
                }
                Object obj55 = map39 != null ? map39.get(gw2.i.TIME_PICKER_OPTIONS.f79975a) : null;
                try {
                    if (!(obj55 instanceof Map)) {
                        obj55 = null;
                    }
                    map40 = (Map) obj55;
                    break;
                } catch (ClassCastException unused54) {
                    map40 = null;
                }
                cx2.b.a aVar21 = cx2.b.f56665a;
                String strValueOf6 = String.valueOf(map40 != null ? map40.get(gw2.i.MIN_TIME_SECONDS.f79975a) : null);
                aVar21.getClass();
                dVar2 = new mv2.e(j8, cVar19, cVar20, cx2.b.a.a(strValueOf6), cx2.b.a.a(String.valueOf(map40 != null ? map40.get(gw2.i.MAX_TIME_SECONDS.f79975a) : null)), cx2.b.a.a(String.valueOf(map40 != null ? map40.get(gw2.i.GRANULARITY_SECONDS.f79975a) : null)));
                return dVar2;
            case 17:
                nv2.c.a aVar22 = nv2.c.f127971a;
                Map<String, Object> map71 = this.f154867g;
                aVar22.getClass();
                map71.getClass();
                nv2.c.f127972b.getClass();
                dw2.b.f61449a.getClass();
                Map mapA11 = dw2.b.a(i14, map71);
                if (mapA11 == null) {
                    return null;
                }
                Object obj56 = mapA11.get(gw2.i.DOUBLE_LABEL_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj56)) {
                        obj56 = null;
                    }
                    map45 = (Map) obj56;
                    break;
                } catch (ClassCastException unused55) {
                    map45 = null;
                }
                Object obj57 = map45 != null ? map45.get(gw2.i.TOD_PICKER_SETTINGS.f79975a) : null;
                try {
                    if (!y0.h(obj57)) {
                        obj57 = null;
                    }
                    map46 = (Map) obj57;
                    break;
                } catch (ClassCastException unused56) {
                    map46 = null;
                }
                if (map46 == null) {
                    return null;
                }
                cx2.b.a aVar23 = cx2.b.f56665a;
                String strValueOf7 = String.valueOf(map46.get(gw2.i.SECONDS.f79975a));
                aVar23.getClass();
                long jA2 = cx2.b.a.a(strValueOf7);
                Object obj58 = map46.get(gw2.i.FORMATTED_VALUE.f79975a);
                try {
                    if (!(obj58 instanceof Map)) {
                        obj58 = null;
                    }
                    map47 = (Map) obj58;
                    break;
                } catch (ClassCastException unused57) {
                    map47 = null;
                }
                tv2.c cVarB6 = g.b(map47);
                Object obj59 = map46.get(gw2.i.TIME_FORMAT.f79975a);
                try {
                    if (!(obj59 instanceof String)) {
                        obj59 = null;
                    }
                    str2 = (String) obj59;
                    break;
                } catch (ClassCastException unused58) {
                    str2 = null;
                }
                boolean zG = s.g(str2, "TWENTY_FOUR_HOUR");
                if (jA2 >= 0) {
                    return new nv2.d(jA2, cVarB6, zG);
                }
                return null;
            case 18:
                rv2.d dVar3 = rv2.d.f154770a;
                Map<String, Object> map72 = this.f154867g;
                dVar3.getClass();
                map72.getClass();
                Object obj60 = map72.get(gw2.i.ROWS.f79975a);
                try {
                    if (!(obj60 instanceof List)) {
                        obj60 = null;
                    }
                    list4 = (List) obj60;
                    break;
                } catch (ClassCastException unused59) {
                    list4 = null;
                }
                if (list4 == null || (map48 = (Map) h0.d0(list4)) == null || (obj = map48.get(gw2.i.WATCH_FACE_GRID_SETTINGS.f79975a)) == null) {
                    return null;
                }
                try {
                    if (!(obj instanceof Map)) {
                        obj = null;
                    }
                    map49 = (Map) obj;
                    break;
                } catch (ClassCastException unused60) {
                    map49 = null;
                }
                if (map49 == null || (obj2 = map49.get(gw2.i.WATCH_FACE_GRID_ITEM_SETTINGS.f79975a)) == null) {
                    return null;
                }
                try {
                    if (!(obj2 instanceof List)) {
                        obj2 = null;
                    }
                    list5 = (List) obj2;
                    break;
                } catch (ClassCastException unused61) {
                    list5 = null;
                }
                if (list5 == null) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Map map73 : list5) {
                    cx2.b.a aVar24 = cx2.b.f56665a;
                    Object obj61 = map73.get(gw2.i.INDEX.f79975a);
                    String string = obj61 != null ? obj61.toString() : null;
                    aVar24.getClass();
                    int iC = cx2.b.a.c(string);
                    Object obj62 = map73.get(gw2.i.IS_SELECTED.f79975a);
                    if (obj62 != null) {
                        try {
                            if (!(obj62 instanceof Boolean)) {
                                obj62 = null;
                            }
                            bool2 = (Boolean) obj62;
                        } catch (ClassCastException unused62) {
                            bool2 = null;
                        }
                        if (bool2 != null) {
                            bVar2 = new sv2.b(iC, bool2.booleanValue());
                        } else {
                            bVar2 = null;
                        }
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        arrayList4.add(bVar2);
                    }
                    break;
                }
                return new sv2.d(arrayList4);
            case 19:
                cw2.d dVar4 = cw2.d.f56278a;
                Map<String, Object> map74 = this.f154867g;
                dVar4.getClass();
                map74.getClass();
                dw2.b.f61449a.getClass();
                Map mapA12 = dw2.b.a(i14, map74);
                if (mapA12 == null) {
                    return null;
                }
                Set setKeySet = mapA12.keySet();
                gw2.i iVar = gw2.i.TEXT_SETTINGS;
                if (!setKeySet.contains(iVar.f79975a)) {
                    return null;
                }
                Object obj63 = mapA12.get(iVar.f79975a);
                try {
                    if (!y0.h(obj63)) {
                        obj63 = null;
                    }
                    map50 = (Map) obj63;
                    break;
                } catch (ClassCastException unused63) {
                    map50 = null;
                }
                Object obj64 = map50 != null ? map50.get(gw2.i.TEXT.f79975a) : null;
                try {
                    if (!y0.h(obj64)) {
                        obj64 = null;
                    }
                    map51 = (Map) obj64;
                } catch (ClassCastException unused64) {
                }
                return new cw2.e(g.b(map51));
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0222, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0248, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0268, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028f, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a9, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ab, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017b, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a6, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d0, code lost:
    
        if (r2 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01fa, code lost:
    
        if (r2 == r3) goto L137;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, j jVar, int i14, Object obj, v13.c cVar) {
        d dVar;
        fv2.b bVar;
        hv2.g gVar;
        jw2.a aVar;
        Object obj2 = obj;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i15 = dVar.f154896c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f154896c = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        d dVar2 = dVar;
        Object objA = dVar2.f154894a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        switch (dVar2.f154896c) {
            case 0:
                r.b(objA);
                switch (b.f154873a[jVar.ordinal()]) {
                    case 1:
                        wu2.d.a aVar3 = wu2.d.f187341a;
                        int i16 = this.f154869i;
                        dVar2.f154896c = 1;
                        objA = aVar3.a(i16, i14, dVar2);
                        break;
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 14:
                    case 19:
                    default:
                        return new jw2.a(false, false, null, null, 15, null);
                    case 4:
                        fv2.e.a aVar4 = fv2.e.f73748a;
                        int i17 = this.f154869i;
                        try {
                            if (!(obj2 instanceof fv2.b)) {
                                obj2 = null;
                            }
                            bVar = (fv2.b) obj2;
                        } catch (ClassCastException unused) {
                            bVar = null;
                        }
                        dVar2.f154896c = 2;
                        objA = aVar4.c(context, i17, i14, bVar, dVar2);
                        break;
                    case 7:
                        ov2.c.a aVar5 = ov2.c.f134263a;
                        int i18 = this.f154869i;
                        String strValueOf = String.valueOf(obj2);
                        dVar2.f154896c = 3;
                        objA = aVar5.b(context, i18, i14, strValueOf, dVar2);
                        break;
                    case 8:
                        gv2.c.a aVar6 = gv2.c.f79452a;
                        int i19 = this.f154869i;
                        float f14 = Float.parseFloat(String.valueOf(obj2));
                        dVar2.f154896c = 4;
                        objA = aVar6.a(context, i19, i14, f14, dVar2);
                        break;
                    case 9:
                        hv2.c.a aVar7 = hv2.c.f85903a;
                        int i24 = this.f154869i;
                        try {
                            if (!(obj2 instanceof hv2.g)) {
                                obj2 = null;
                            }
                            gVar = (hv2.g) obj2;
                        } catch (ClassCastException unused2) {
                            gVar = null;
                        }
                        dVar2.f154896c = 5;
                        objA = aVar7.a(context, i24, i14, gVar, dVar2);
                        break;
                    case 10:
                        iv2.c.a aVar8 = iv2.c.f95221a;
                        int i25 = this.f154869i;
                        cx2.b.a aVar9 = cx2.b.f56665a;
                        String strValueOf2 = String.valueOf(obj2);
                        aVar9.getClass();
                        int iC = cx2.b.a.c(strValueOf2);
                        dVar2.f154896c = 6;
                        objA = aVar8.a(context, i25, i14, iC, dVar2);
                        break;
                    case 11:
                        jv2.c.a aVar10 = jv2.c.f101195a;
                        int i26 = this.f154869i;
                        cx2.b.a aVar11 = cx2.b.f56665a;
                        String strValueOf3 = String.valueOf(obj2);
                        aVar11.getClass();
                        int iC2 = cx2.b.a.c(strValueOf3);
                        dVar2.f154896c = 7;
                        objA = aVar10.a(context, i26, i14, iC2, dVar2);
                        break;
                    case 12:
                        vv2.c.a aVar12 = vv2.c.f180550a;
                        int i27 = this.f154869i;
                        cx2.b.a aVar13 = cx2.b.f56665a;
                        String strValueOf4 = String.valueOf(obj2);
                        aVar13.getClass();
                        int iC3 = cx2.b.a.c(strValueOf4);
                        dVar2.f154896c = 8;
                        objA = aVar12.a(context, i27, i14, iC3, dVar2);
                        break;
                    case 13:
                        obj2.getClass();
                        xv2.c cVar2 = (xv2.c) obj2;
                        wv2.c.a aVar14 = wv2.c.f187470a;
                        int i28 = this.f154869i;
                        int i29 = cVar2.f192278a;
                        dVar2.f154896c = 9;
                        objA = aVar14.a(context, i28, i29, cVar2, dVar2);
                        break;
                    case 15:
                        f.a aVar15 = f.f21591a;
                        int i30 = this.f154869i;
                        boolean z14 = Boolean.parseBoolean(String.valueOf(obj2));
                        dVar2.f154896c = 10;
                        objA = aVar15.a(context, i30, i14, z14, dVar2);
                        break;
                    case 16:
                        mv2.d.a aVar16 = mv2.d.f121205a;
                        int i34 = this.f154869i;
                        cx2.b.a aVar17 = cx2.b.f56665a;
                        String strValueOf5 = String.valueOf(obj2);
                        aVar17.getClass();
                        int iC4 = cx2.b.a.c(strValueOf5);
                        dVar2.f154896c = 12;
                        objA = aVar16.a(context, i34, i14, iC4, dVar2);
                        break;
                    case 17:
                        nv2.c.a aVar18 = nv2.c.f127971a;
                        int i35 = this.f154869i;
                        cx2.b.a aVar19 = cx2.b.f56665a;
                        String strValueOf6 = String.valueOf(obj2);
                        aVar19.getClass();
                        int iC5 = cx2.b.a.c(strValueOf6);
                        dVar2.f154896c = 13;
                        objA = aVar18.a(context, i35, i14, iC5, dVar2);
                        break;
                    case 18:
                        rv2.d dVar3 = rv2.d.f154770a;
                        int i36 = this.f154869i;
                        cx2.b.a aVar20 = cx2.b.f56665a;
                        String strValueOf7 = String.valueOf(obj2);
                        aVar20.getClass();
                        int iC6 = cx2.b.a.c(strValueOf7);
                        dVar2.f154896c = 14;
                        objA = dVar3.a(context, i36, i14, iC6, dVar2);
                        break;
                    case 20:
                        yv2.e.a aVar21 = yv2.e.f199863a;
                        int i37 = this.f154869i;
                        cx2.b.a aVar22 = cx2.b.f56665a;
                        String strValueOf8 = String.valueOf(obj2);
                        aVar22.getClass();
                        int iC7 = cx2.b.a.c(strValueOf8);
                        dVar2.f154896c = 11;
                        objA = aVar21.a(context, i37, i14, iC7, dVar2);
                        break;
                }
                break;
            case 1:
                r.b(objA);
                jw2.a aVar23 = (jw2.a) objA;
                HashMap<String, Object> map = aVar23.f101365c;
                if (map != null) {
                    h(map);
                }
                return aVar23;
            case 2:
                r.b(objA);
                aVar = (jw2.a) objA;
                HashMap<String, Object> map2 = aVar.f101365c;
                if (map2 != null) {
                    h(map2);
                }
                return aVar;
            case 3:
                r.b(objA);
                jw2.a aVar24 = (jw2.a) objA;
                HashMap<String, Object> map3 = aVar24.f101365c;
                if (map3 != null) {
                    h(map3);
                }
                return aVar24;
            case 4:
                r.b(objA);
                jw2.a aVar25 = (jw2.a) objA;
                HashMap<String, Object> map4 = aVar25.f101365c;
                if (map4 != null) {
                    h(map4);
                }
                return aVar25;
            case 5:
                r.b(objA);
                aVar = (jw2.a) objA;
                HashMap<String, Object> map5 = aVar.f101365c;
                if (map5 != null) {
                    h(map5);
                }
                return aVar;
            case 6:
                r.b(objA);
                jw2.a aVar26 = (jw2.a) objA;
                HashMap<String, Object> map6 = aVar26.f101365c;
                if (map6 != null) {
                    h(map6);
                }
                return aVar26;
            case 7:
                r.b(objA);
                jw2.a aVar27 = (jw2.a) objA;
                HashMap<String, Object> map7 = aVar27.f101365c;
                if (map7 != null) {
                    h(map7);
                }
                return aVar27;
            case 8:
                r.b(objA);
                jw2.a aVar28 = (jw2.a) objA;
                HashMap<String, Object> map8 = aVar28.f101365c;
                if (map8 != null) {
                    h(map8);
                }
                return aVar28;
            case 9:
                r.b(objA);
                jw2.a aVar29 = (jw2.a) objA;
                HashMap<String, Object> map9 = aVar29.f101365c;
                if (map9 != null) {
                    h(map9);
                }
                return aVar29;
            case 10:
                r.b(objA);
                jw2.a aVar30 = (jw2.a) objA;
                HashMap<String, Object> map10 = aVar30.f101365c;
                if (map10 != null) {
                    h(map10);
                }
                return aVar30;
            case 11:
                r.b(objA);
                jw2.a aVar31 = (jw2.a) objA;
                HashMap<String, Object> map11 = aVar31.f101365c;
                if (map11 != null) {
                    h(map11);
                }
                return aVar31;
            case 12:
                r.b(objA);
                jw2.a aVar32 = (jw2.a) objA;
                HashMap<String, Object> map12 = aVar32.f101365c;
                if (map12 != null) {
                    h(map12);
                }
                return aVar32;
            case 13:
                r.b(objA);
                jw2.a aVar33 = (jw2.a) objA;
                HashMap<String, Object> map13 = aVar33.f101365c;
                if (map13 != null) {
                    h(map13);
                }
                return aVar33;
            case 14:
                r.b(objA);
                jw2.a aVar34 = (jw2.a) objA;
                HashMap<String, Object> map14 = aVar34.f101365c;
                if (map14 != null) {
                    h(map14);
                }
                return aVar34;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final void h(HashMap map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        Object obj = this.f154867g.get(gw2.i.ROWS.f79975a);
        try {
            if (!(obj instanceof ArrayList)) {
                obj = null;
            }
            arrayList = (ArrayList) obj;
        } catch (ClassCastException unused) {
            arrayList = null;
        }
        Object obj2 = map.get(gw2.i.ROWS.f79975a);
        try {
            if (!(obj2 instanceof ArrayList)) {
                obj2 = null;
            }
            arrayList2 = (ArrayList) obj2;
        } catch (ClassCastException unused2) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    if (!(next instanceof HashMap)) {
                        next = null;
                    }
                    map2 = (HashMap) next;
                } catch (ClassCastException unused3) {
                    map2 = null;
                }
                if (map2 != null) {
                    cx2.b.a aVar = cx2.b.f56665a;
                    String strValueOf = String.valueOf(map2.get(gw2.i.ROW_ID.f79975a));
                    aVar.getClass();
                    int iC = cx2.b.a.c(strValueOf);
                    if (arrayList != null) {
                        Iterator it3 = arrayList.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            try {
                                if (!(next2 instanceof HashMap)) {
                                    next2 = null;
                                }
                                map3 = (HashMap) next2;
                            } catch (ClassCastException unused4) {
                                map3 = null;
                            }
                            if (map3 != null) {
                                cx2.b.a aVar2 = cx2.b.f56665a;
                                String strValueOf2 = String.valueOf(map3.get(gw2.i.ROW_ID.f79975a));
                                aVar2.getClass();
                                if (iC == cx2.b.a.c(strValueOf2)) {
                                    Gson gson = new Gson();
                                    Object objFromJson = gson.fromJson(gson.toJson(map2), (Class<Object>) HashMap.class);
                                    try {
                                        if (!(objFromJson instanceof HashMap)) {
                                            objFromJson = null;
                                        }
                                        map4 = (HashMap) objFromJson;
                                    } catch (ClassCastException unused5) {
                                        map4 = null;
                                    }
                                    if (map4 != null) {
                                        map3.clear();
                                        map3.putAll(map4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f154864d, 0);
        parcel.writeByte(this.f154865e ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f154866f);
        parcel.writeList(this.f154868h);
        parcel.writeMap(this.f154867g);
        parcel.writeInt(this.f154869i);
        parcel.writeParcelable(this.f154871k, 0);
        parcel.writeParcelable(this.f154872l, 0);
    }

    /* JADX INFO: renamed from: rw2.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrw2/a$a;", "Landroid/os/Parcelable$Creator;", "Lrw2/a;", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<a> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }

        private Companion() {
        }
    }

    public a() {
        this.f154861a = new h("SettingsDataModel", null, 2, null);
        this.f154866f = new ArrayList();
        this.f154867g = new LinkedHashMap();
        this.f154868h = new ArrayList();
    }
}
