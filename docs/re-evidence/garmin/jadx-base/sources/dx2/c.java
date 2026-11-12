package dx2;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import cx2.g;
import cx2.h;
import e23.l;
import e23.p;
import fv2.f;
import gw2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import v13.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldx2/c;", "Landroidx/lifecycle/u1;", "Lrw2/a;", "settingsDataModel", "<init>", "(Lrw2/a;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw2.a f61484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f61485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<Map<String, Object>> f61486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<jw2.a> f61487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<Boolean> f61488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<Boolean> f61489f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.viewmodel.SettingsViewModel$updateAndNotifyObservers$2", f = "SettingsViewModel.kt", l = {133}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61490a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f61492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f61493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f61494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object f61495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ l<jw2.a, Unit> f61496g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, j jVar, int i14, Object obj, l<? super jw2.a, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f61492c = context;
            this.f61493d = jVar;
            this.f61494e = i14;
            this.f61495f = obj;
            this.f61496g = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new a(this.f61492c, this.f61493d, this.f61494e, this.f61495f, this.f61496g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f61490a;
            c cVar = c.this;
            if (i14 == 0) {
                r.b(obj);
                cVar.f61488e.j(Boolean.TRUE);
                rw2.a aVar3 = cVar.f61484a;
                this.f61490a = 1;
                aVar = this;
                obj = aVar3.g(this.f61492c, this.f61493d, this.f61494e, this.f61495f, aVar);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                aVar = this;
            }
            jw2.a aVar4 = (jw2.a) obj;
            aVar.f61496g.invoke(aVar4);
            cVar.f61485b.getClass();
            cVar.f61488e.j(Boolean.FALSE);
            if (aVar4.f101365c != null) {
                cVar.f61486c.j(cVar.f61484a.f154867g);
            }
            cVar.f61487d.j(aVar4);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(rw2.a aVar) {
        aVar.getClass();
        this.f61484a = aVar;
        this.f61485b = new h("SettingsViewModel", null, 2, 0 == true ? 1 : 0);
        this.f61486c = new y0<>();
        this.f61487d = new y0<>();
        this.f61488e = new y0<>();
        this.f61489f = new y0<>();
    }

    public static String A4(Map map) {
        map.getClass();
        Object obj = map.get(gw2.i.TYPE.f79975a);
        try {
            if (!(obj instanceof String)) {
                obj = null;
            }
            return (String) obj;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static String C4(Map map) {
        Map map2;
        Object obj = map.get(gw2.i.LINK_OPTIONS.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        Object obj2 = map2 != null ? map2.get(gw2.i.DEST_PAGE.f79975a) : null;
        try {
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            return (String) obj2;
        } catch (ClassCastException unused2) {
            return null;
        }
    }

    public static qv2.c F4(Map map) {
        Map map2;
        Map map3;
        Object obj = map.get(gw2.i.EMPTY_STATE_VIEW_OPTIONS.f79975a);
        Map map4 = null;
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        if (map2 == null) {
            return null;
        }
        Object obj2 = map2.get(gw2.i.DESCRIPTION.f79975a);
        try {
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            map3 = (Map) obj2;
        } catch (ClassCastException unused2) {
            map3 = null;
        }
        tv2.c cVarB = g.b(map3);
        Object obj3 = map2.get(gw2.i.ACTION_TEXT.f79975a);
        try {
            if (!(obj3 instanceof Map)) {
                obj3 = null;
            }
            map4 = (Map) obj3;
        } catch (ClassCastException unused3) {
        }
        return new qv2.c(cVarB, g.b(map4));
    }

    public static String L4(Map map) {
        Map map2;
        Object obj = map.get(gw2.i.LINK_OPTIONS.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        Object obj2 = map2 != null ? map2.get(gw2.i.LINK_TYPE.f79975a) : null;
        try {
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            return (String) obj2;
        } catch (ClassCastException unused2) {
            return null;
        }
    }

    public static tv2.c M4(Map map) {
        map.getClass();
        Object obj = map.get(gw2.i.TITLE.f79975a);
        Map map2 = null;
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
        }
        return g.b(map2);
    }

    public static Integer P4(Map map) {
        map.getClass();
        int iF = fb1.c.f(map, gw2.i.ROW_ID.f79975a, cx2.b.f56665a);
        Integer numValueOf = Integer.valueOf(iF);
        if (iF >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static List R4(Map map) {
        Map mapT4 = T4(map);
        Object obj = mapT4 != null ? mapT4.get(gw2.i.ROWS.f79975a) : null;
        try {
            if (!p005kotlin.jvm.internal.y0.g(obj)) {
                obj = null;
            }
            return (List) obj;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static List S4(Map map) {
        Map mapT4 = T4(map);
        Object obj = mapT4 != null ? mapT4.get(gw2.i.MENU_ITEMS.f79975a) : null;
        try {
            if (!p005kotlin.jvm.internal.y0.g(obj)) {
                obj = null;
            }
            return (List) obj;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static Map T4(Map map) {
        Map map2;
        Object obj = map.get(gw2.i.LINK_OPTIONS.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        Object obj2 = map2 != null ? map2.get(gw2.i.SELECTION_OPTIONS.f79975a) : null;
        try {
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            return (Map) obj2;
        } catch (ClassCastException unused2) {
            return null;
        }
    }

    public static boolean b5(Map map) {
        Map mapT4 = T4(map);
        Boolean bool = null;
        Object obj = mapT4 != null ? mapT4.get(gw2.i.EXIT_ITEMS_ON_TAP.f79975a) : null;
        try {
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            bool = (Boolean) obj;
        } catch (ClassCastException unused) {
        }
        return true ^ (bool != null ? bool.booleanValue() : true);
    }

    public static Integer y4(Map map) {
        Map map2;
        Long l14;
        Object obj = map.get(gw2.i.LINK_OPTIONS.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        Object obj2 = map2 != null ? map2.get(gw2.i.DEST_COMPOSITION_ID.f79975a) : null;
        try {
            if (!(obj2 instanceof Long)) {
                obj2 = null;
            }
            l14 = (Long) obj2;
        } catch (ClassCastException unused2) {
            l14 = null;
        }
        if (l14 != null) {
            return Integer.valueOf((int) l14.longValue());
        }
        return null;
    }

    public static wu2.b z4(Map map) {
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Object obj = map.get(gw2.i.CONFIRMATION.f79975a);
        Map map6 = null;
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        if (map2 == null) {
            return null;
        }
        Object obj2 = map2.get(gw2.i.TITLE.f79975a);
        try {
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            map3 = (Map) obj2;
        } catch (ClassCastException unused2) {
            map3 = null;
        }
        tv2.c cVarB = g.b(map3);
        Object obj3 = map2.get(gw2.i.MESSAGE.f79975a);
        try {
            if (!(obj3 instanceof Map)) {
                obj3 = null;
            }
            map4 = (Map) obj3;
        } catch (ClassCastException unused3) {
            map4 = null;
        }
        tv2.c cVarB2 = g.b(map4);
        Object obj4 = map2.get(gw2.i.POSITIVE_TEXT.f79975a);
        try {
            if (!(obj4 instanceof Map)) {
                obj4 = null;
            }
            map5 = (Map) obj4;
        } catch (ClassCastException unused4) {
            map5 = null;
        }
        tv2.c cVarB3 = g.b(map5);
        Object obj5 = map2.get(gw2.i.NEGATIVE_TEXT.f79975a);
        try {
            if (!(obj5 instanceof Map)) {
                obj5 = null;
            }
            map6 = (Map) obj5;
        } catch (ClassCastException unused5) {
        }
        return new wu2.b(cVarB, cVarB2, cVarB3, g.b(map6));
    }

    public final f B4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.DATE_PICKER, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof f)) {
                objF = null;
            }
            return (f) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final ev2.c D4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.DOUBLE_LABEL, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof ev2.c)) {
                objF = null;
            }
            return (ev2.c) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final Integer E4(Map<String, ? extends Object> map) {
        lv2.c cVar;
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.DOUBLE_LABEL_SELECTION, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof lv2.c)) {
                objF = null;
            }
            cVar = (lv2.c) objF;
        } catch (ClassCastException unused) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.f115051a;
        }
        return null;
    }

    public final gv2.d G4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.FLOAT_PICKER, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof gv2.d)) {
                objF = null;
            }
            return (gv2.d) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final hv2.d H4(Map<String, ? extends Object> map) {
        map.getClass();
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.HEIGHT_PICKER, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof hv2.d)) {
                objF = null;
            }
            return (hv2.d) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [T] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [T] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [T] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [T] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v6, types: [T] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [T] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [T] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [T] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [T] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    public final zw2.g.c I4(Map<String, ? extends Object> map) {
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Unit unit;
        Unit unit2;
        String str;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? ValueOf;
        ?? r19;
        String str2;
        Boolean bool;
        ?? r110;
        String str3;
        Boolean bool2;
        Object obj = map.get(gw2.i.DATA_SCREEN_ICON.f79975a);
        ?? r24 = 0;
        string = 0;
        string = 0;
        ?? string = 0;
        string = 0;
        string = 0;
        ?? string2 = 0;
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        Object obj2 = map.get(gw2.i.WATCH_FACE_ICON.f79975a);
        try {
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            map3 = (Map) obj2;
        } catch (ClassCastException unused2) {
            map3 = null;
        }
        Object obj3 = map.get(gw2.i.CONTROLS_MENU_ICON.f79975a);
        try {
            if (!(obj3 instanceof Map)) {
                obj3 = null;
            }
            map4 = (Map) obj3;
        } catch (ClassCastException unused3) {
            map4 = null;
        }
        Object obj4 = map.get(gw2.i.ICON_SETTINGS.f79975a);
        try {
            if (!(obj4 instanceof Map)) {
                obj4 = null;
            }
            map5 = (Map) obj4;
        } catch (ClassCastException unused4) {
            map5 = null;
        }
        r0 r0Var = new r0();
        r0 r0Var2 = new r0();
        r0 r0Var3 = new r0();
        r0 r0Var4 = new r0();
        h hVar = this.f61485b;
        if (map2 != null) {
            Object obj5 = map2.get(gw2.i.ICON_SET.f79975a);
            try {
                if (!(obj5 instanceof String)) {
                    obj5 = null;
                }
                r110 = (String) obj5;
            } catch (ClassCastException unused5) {
                r110 = 0;
            }
            r0Var.f105810a = r110;
            int iF = fb1.c.f(map2, gw2.i.NUMBER_OF_FIELDS.f79975a, cx2.b.f56665a);
            Object obj6 = map2.get(gw2.i.LAYOUT_FIELD.f79975a);
            try {
                if (!(obj6 instanceof String)) {
                    obj6 = null;
                }
                str3 = (String) obj6;
            } catch (ClassCastException unused6) {
                str3 = null;
            }
            Object obj7 = map2.get(gw2.i.IS_PREVIEW.f79975a);
            try {
                if (!(obj7 instanceof Boolean)) {
                    obj7 = null;
                }
                bool2 = (Boolean) obj7;
            } catch (ClassCastException unused7) {
                bool2 = null;
            }
            if (iF == -1 || str3 == null || bool2 == null) {
                hVar.getClass();
            } else {
                StringBuilder sbI = b71.i.i(iF, "DATA_SCREEN_", "_FIELD");
                if (!str3.equals("NONE")) {
                    sbI.append("_");
                    sbI.append(str3);
                }
                if (bool2.booleanValue()) {
                    sbI.append("_PREVIEW");
                }
                string = sbI.toString();
            }
            r0Var2.f105810a = string;
        } else if (map3 != null) {
            Object obj8 = map3.get(gw2.i.ICON_SET.f79975a);
            try {
                if (!(obj8 instanceof String)) {
                    obj8 = null;
                }
                r19 = (String) obj8;
            } catch (ClassCastException unused8) {
                r19 = 0;
            }
            r0Var.f105810a = r19;
            int iF2 = fb1.c.f(map3, gw2.i.NUMBER_OF_COMPLICATIONS.f79975a, cx2.b.f56665a);
            Object obj9 = map3.get(gw2.i.LAYOUT_STYLE.f79975a);
            try {
                if (!(obj9 instanceof String)) {
                    obj9 = null;
                }
                str2 = (String) obj9;
            } catch (ClassCastException unused9) {
                str2 = null;
            }
            Object obj10 = map3.get(gw2.i.IS_PREVIEW.f79975a);
            try {
                if (!(obj10 instanceof Boolean)) {
                    obj10 = null;
                }
                bool = (Boolean) obj10;
            } catch (ClassCastException unused10) {
                bool = null;
            }
            if (iF2 == -1 || str2 == null || bool == null) {
                hVar.getClass();
            } else {
                StringBuilder sbI2 = b71.i.i(iF2, "WATCHFACE_", "_COMPLICATION");
                if (!str2.equals("NONE")) {
                    sbI2.append("_");
                    sbI2.append(str2);
                }
                if (bool.booleanValue()) {
                    sbI2.append("_PREVIEW");
                }
                string2 = sbI2.toString();
            }
            r0Var2.f105810a = string2;
        } else {
            if (map4 != null) {
                Object obj11 = map4.get(gw2.i.ICON_SET.f79975a);
                try {
                    if (!(obj11 instanceof String)) {
                        obj11 = null;
                    }
                    r18 = (String) obj11;
                } catch (ClassCastException unused11) {
                    r18 = 0;
                }
                r0Var.f105810a = r18;
                int iF3 = fb1.c.f(map4, gw2.i.CONTROL.f79975a, cx2.b.f56665a);
                if (iF3 == -1) {
                    hVar.getClass();
                    ValueOf = 0;
                } else {
                    ValueOf = String.valueOf(iF3);
                }
                r0Var2.f105810a = ValueOf;
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                if (map5 != null) {
                    Object obj12 = map.get(gw2.i.ICON_SET.f79975a);
                    try {
                        if (!(obj12 instanceof String)) {
                            obj12 = null;
                        }
                        r14 = (String) obj12;
                    } catch (ClassCastException unused12) {
                        r14 = 0;
                    }
                    if (r14 == 0) {
                        r14 = "BASE";
                    }
                    r0Var.f105810a = r14;
                    Object obj13 = map.get(gw2.i.ICON.f79975a);
                    try {
                        if (!(obj13 instanceof String)) {
                            obj13 = null;
                        }
                        r15 = (String) obj13;
                    } catch (ClassCastException unused13) {
                        r15 = 0;
                    }
                    r0Var2.f105810a = r15;
                    Object obj14 = map5.get(gw2.i.LIGHT_COLOR.f79975a);
                    try {
                        if (!(obj14 instanceof Long)) {
                            obj14 = null;
                        }
                        r16 = (Long) obj14;
                    } catch (ClassCastException unused14) {
                        r16 = 0;
                    }
                    r0Var3.f105810a = r16;
                    Object obj15 = map5.get(gw2.i.DARK_COLOR.f79975a);
                    try {
                        if (!(obj15 instanceof Long)) {
                            obj15 = null;
                        }
                        r17 = (Long) obj15;
                    } catch (ClassCastException unused15) {
                        r17 = 0;
                    }
                    r0Var4.f105810a = r17;
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    Object obj16 = map.get(gw2.i.ICON_SET.f79975a);
                    try {
                        if (!(obj16 instanceof String)) {
                            obj16 = null;
                        }
                        str = (String) obj16;
                    } catch (ClassCastException unused16) {
                        str = null;
                    }
                    r0Var.f105810a = str != null ? str : "BASE";
                    Object obj17 = map.get(gw2.i.ICON.f79975a);
                    try {
                        if (!(obj17 instanceof String)) {
                            obj17 = null;
                        }
                        r24 = (String) obj17;
                    } catch (ClassCastException unused17) {
                    }
                    r0Var2.f105810a = r24;
                }
            }
        }
        return new zw2.g.c((String) r0Var.f105810a, (String) r0Var2.f105810a, (Long) r0Var3.f105810a, (Long) r0Var4.f105810a);
    }

    public final iv2.d J4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.INTEGER_INPUT, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof iv2.d)) {
                objF = null;
            }
            return (iv2.d) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final jv2.d K4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.INTEGER_PICKER, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof jv2.d)) {
                objF = null;
            }
            return (jv2.d) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final kv2.d N4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.MULTI_SELECTION_ITEM, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof kv2.d)) {
                objF = null;
            }
            return (kv2.d) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    public final xv2.f O4(Map<String, ? extends Object> map) {
        Map map2;
        Map map3;
        xv2.a aVar;
        List<Map<String, ? extends Object>> list;
        ?? arrayList;
        Map map4;
        Boolean bool;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        map.getClass();
        Object obj = map.get(gw2.i.REORDERABLE_LIST_OPTIONS.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        if (map2 == null) {
            return null;
        }
        int iF = fb1.c.f(map2, gw2.i.REORDERABLE_LIST_GROUP_ID.f79975a, cx2.b.f56665a);
        String strValueOf = String.valueOf(map2.get(gw2.i.REORDERABLE_LIST_ACTION_TYPE.f79975a));
        gw2.h hVar = gw2.h.ADD;
        if (!strValueOf.equals(hVar.f79898a)) {
            hVar = gw2.h.DELETE;
            if (!strValueOf.equals(hVar.f79898a)) {
                hVar = gw2.h.NONE;
            }
        }
        Object obj2 = map2.get(gw2.i.REORDERABLE_LIST_DELETE_CONFIRMATION.f79975a);
        try {
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            map3 = (Map) obj2;
        } catch (ClassCastException unused2) {
            map3 = null;
        }
        if (map3 != null) {
            Object obj3 = map3.get(gw2.i.TITLE.f79975a);
            try {
                if (!(obj3 instanceof Map)) {
                    obj3 = null;
                }
                map5 = (Map) obj3;
            } catch (ClassCastException unused3) {
                map5 = null;
            }
            tv2.c cVarB = g.b(map5);
            Object obj4 = map3.get(gw2.i.MESSAGE.f79975a);
            try {
                if (!(obj4 instanceof Map)) {
                    obj4 = null;
                }
                map6 = (Map) obj4;
            } catch (ClassCastException unused4) {
                map6 = null;
            }
            tv2.c cVarB2 = g.b(map6);
            Object obj5 = map3.get(gw2.i.POSITIVE_TEXT.f79975a);
            try {
                if (!(obj5 instanceof Map)) {
                    obj5 = null;
                }
                map7 = (Map) obj5;
            } catch (ClassCastException unused5) {
                map7 = null;
            }
            tv2.c cVarB3 = g.b(map7);
            Object obj6 = map3.get(gw2.i.NEGATIVE_TEXT.f79975a);
            try {
                if (!(obj6 instanceof Map)) {
                    obj6 = null;
                }
                map8 = (Map) obj6;
            } catch (ClassCastException unused6) {
                map8 = null;
            }
            aVar = new xv2.a(cVarB, cVarB2, cVarB3, g.b(map8));
        } else {
            aVar = null;
        }
        Object obj7 = map2.get(gw2.i.REORDERABLE_LIST_ITEMS.f79975a);
        try {
            if (!(obj7 instanceof List)) {
                obj7 = null;
            }
            list = (List) obj7;
        } catch (ClassCastException unused7) {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(y.r(list, 10));
            for (Map<String, ? extends Object> map9 : list) {
                int iF2 = fb1.c.f(map9, gw2.i.ROW_ID.f79975a, cx2.b.f56665a);
                Object obj8 = map9.get(gw2.i.TITLE.f79975a);
                try {
                    if (!p005kotlin.jvm.internal.y0.h(obj8)) {
                        obj8 = null;
                    }
                    map4 = (Map) obj8;
                } catch (ClassCastException unused8) {
                    map4 = null;
                }
                tv2.c cVarB4 = g.b(map4);
                zw2.g.c cVarI4 = I4(map9);
                Object obj9 = map9.get(gw2.i.ACTION_ENABLED.f79975a);
                try {
                    if (!(obj9 instanceof Boolean)) {
                        obj9 = null;
                    }
                    bool = (Boolean) obj9;
                } catch (ClassCastException unused9) {
                    bool = null;
                }
                arrayList.add(new xv2.e(iF2, cVarB4, cVarI4, bool != null ? bool.booleanValue() : true));
            }
        } else {
            arrayList = j0.f134944a;
        }
        return new xv2.f(iF, hVar, aVar, arrayList);
    }

    public final lv2.c Q4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.DOUBLE_LABEL_SELECTION, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof lv2.c)) {
                objF = null;
            }
            return (lv2.c) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final Integer U4(Map<String, ? extends Object> map) {
        lv2.c cVar;
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.SINGLE_LABEL_SELECTION, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof lv2.c)) {
                objF = null;
            }
            cVar = (lv2.c) objF;
        } catch (ClassCastException unused) {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.f115051a;
        }
        return null;
    }

    public final nv2.d V4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.TOD_PICKER, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof nv2.d)) {
                objF = null;
            }
            return (nv2.d) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final mv2.e W4(Map<String, ? extends Object> map) {
        cx2.b.a aVar = cx2.b.f56665a;
        Object obj = map.get(gw2.i.ROW_ID.f79975a);
        String string = obj != null ? obj.toString() : null;
        aVar.getClass();
        Object objF = this.f61484a.f(j.TIME_PICKER, map, cx2.b.a.c(string));
        try {
            if (!(objF instanceof mv2.e)) {
                objF = null;
            }
            return (mv2.e) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final boolean X4(Map<String, ? extends Object> map) {
        map.getClass();
        Object obj = map.get(gw2.i.PLATFORM.f79975a);
        if (obj != null) {
            String string = obj.toString();
            if (!s.g(string, Rule.ALL) && !s.g(string, "ANDROID")) {
                return false;
            }
        }
        return true;
    }

    public final Boolean Y4(Map<String, ? extends Object> map) {
        bw2.g gVar;
        map.getClass();
        Object objF = this.f61484a.f(j.SWITCH, map, fb1.c.f(map, gw2.i.ROW_ID.f79975a, cx2.b.f56665a));
        try {
            if (!(objF instanceof bw2.g)) {
                objF = null;
            }
            gVar = (bw2.g) objF;
        } catch (ClassCastException unused) {
            gVar = null;
        }
        if (gVar != null) {
            return Boolean.valueOf(gVar.f21592a);
        }
        return null;
    }

    public final boolean Z4(Map<String, ? extends Object> map) {
        Integer numE4 = E4(map);
        Integer numU4 = U4(map);
        if (numE4 != null && numE4.intValue() == -1) {
            numE4 = numU4;
        }
        return s.g(numE4, map.get(gw2.i.INDEX.f79975a));
    }

    public final String a5(Map<String, ? extends Object> map) {
        ArrayList arrayList;
        HashMap map2;
        Object obj;
        map.getClass();
        int iF = fb1.c.f(map, gw2.i.ROW_ID.f79975a, cx2.b.f56665a);
        Map<String, Object> mapD = this.f61486c.d();
        String str = null;
        if (mapD == null || (obj = mapD.get(gw2.i.ROWS.f79975a)) == null) {
            arrayList = null;
        } else {
            try {
                if (!(obj instanceof ArrayList)) {
                    obj = null;
                }
                arrayList = (ArrayList) obj;
            } catch (ClassCastException unused) {
                arrayList = null;
            }
        }
        if (arrayList == null) {
            return "VISIBLE";
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                if (!(next instanceof HashMap)) {
                    next = null;
                }
                map2 = (HashMap) next;
            } catch (ClassCastException unused2) {
                map2 = null;
            }
            if (map2 != null) {
                cx2.b.a aVar = cx2.b.f56665a;
                String strValueOf = String.valueOf(map2.get(gw2.i.ROW_ID.f79975a));
                aVar.getClass();
                if (cx2.b.a.c(strValueOf) == iF) {
                    Object obj2 = map2.get(gw2.i.VIEW_STATE.f79975a);
                    if (obj2 != null) {
                        try {
                            if (!(obj2 instanceof String)) {
                                obj2 = null;
                            }
                            str = (String) obj2;
                        } catch (ClassCastException unused3) {
                        }
                    }
                    return String.valueOf(str);
                }
            }
        }
        return "VISIBLE";
    }

    public final void c5(Context context, j jVar, int i14, Object obj, l<? super jw2.a, Unit> lVar) {
        context.getClass();
        jVar.getClass();
        this.f61485b.getClass();
        ge1.b.T(v1.a(this), null, null, new a(context, jVar, i14, obj, lVar, null), 3);
    }

    public final cv2.b x4(Map<String, ? extends Object> map) {
        map.getClass();
        Object objF = this.f61484a.f(j.ALERT_VOLUME, map, fb1.c.f(map, gw2.i.ROW_ID.f79975a, cx2.b.f56665a));
        try {
            if (!(objF instanceof cv2.b)) {
                objF = null;
            }
            return (cv2.b) objF;
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
