package jw2;

import cx2.g;
import cx2.h;
import gw2.i;
import iw2.i1;
import java.util.HashMap;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ljw2/c;", "", "", "shouldEndInstantiation", "Ltv2/b;", "informationMessage", "<init>", "(ZLtv2/b;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f101370c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f101371d = new h("MenuChangeResponse", null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f101372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.b f101373b;

    public /* synthetic */ c(boolean z14, tv2.b bVar, int i14, j jVar) {
        this(z14, (i14 & 2) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f101372a == cVar.f101372a && s.g(this.f101373b, cVar.f101373b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f101372a) * 31;
        tv2.b bVar = this.f101373b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "MenuChangeResponse(shouldEndInstantiation=" + this.f101372a + ", informationMessage=" + this.f101373b + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljw2/c$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(int i14, int i15, v13.c cVar) {
            b bVar;
            Boolean bool;
            HashMap map;
            Map map2;
            Map map3;
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i16 = bVar.f101369c;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    bVar.f101369c = i16 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, cVar);
                }
            } else {
                bVar = new b(this, cVar);
            }
            Object objV = bVar.f101367a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = bVar.f101369c;
            int i18 = 2;
            boolean z14 = false;
            Map map4 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (i17 == 0) {
                r.b(objV);
                c.f101371d.getClass();
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    bVar.f101369c = 1;
                    objV = i1VarD.v(i14, i15, bVar);
                    if (objV == aVar) {
                        return aVar;
                    }
                }
                return new c(z14, objArr2 == true ? 1 : 0, i18, objArr == true ? 1 : 0);
            }
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objV);
            String str = (String) objV;
            if (str != null) {
                com.garmin.realtimesettings.app.util.a.f52669a.getClass();
                HashMap mapB = com.garmin.realtimesettings.app.util.a.C1130a.b(str);
                Object obj = mapB.get(i.EXIT_INSTANTIATION.f79975a);
                try {
                    if (!(obj instanceof Boolean)) {
                        obj = null;
                    }
                    bool = (Boolean) obj;
                } catch (ClassCastException unused) {
                    bool = null;
                }
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Object obj2 = mapB.get(i.INFORMATION_MESSAGE.f79975a);
                try {
                    if (!(obj2 instanceof HashMap)) {
                        obj2 = null;
                    }
                    map = (HashMap) obj2;
                } catch (ClassCastException unused2) {
                    map = null;
                }
                if (map == null) {
                    return new c(zBooleanValue, objArr4 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                }
                Object obj3 = map.get(i.NEUTRAL_TEXT.f79975a);
                try {
                    if (!(obj3 instanceof Map)) {
                        obj3 = null;
                    }
                    map2 = (Map) obj3;
                } catch (ClassCastException unused3) {
                    map2 = null;
                }
                tv2.c cVarB = g.b(map2);
                Object obj4 = map.get(i.TITLE.f79975a);
                try {
                    if (!(obj4 instanceof Map)) {
                        obj4 = null;
                    }
                    map3 = (Map) obj4;
                } catch (ClassCastException unused4) {
                    map3 = null;
                }
                tv2.c cVarB2 = g.b(map3);
                Object obj5 = map.get(i.MESSAGE.f79975a);
                try {
                    if (!(obj5 instanceof Map)) {
                        obj5 = null;
                    }
                    map4 = (Map) obj5;
                } catch (ClassCastException unused5) {
                }
                return new c(false, new tv2.b(cVarB2, g.b(map4), cVarB));
            }
            return new c(z14, objArr2 == true ? 1 : 0, i18, objArr == true ? 1 : 0);
        }

        private a() {
        }
    }

    public c(boolean z14, tv2.b bVar) {
        this.f101372a = z14;
        this.f101373b = bVar;
    }
}
