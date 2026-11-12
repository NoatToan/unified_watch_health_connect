package com.garmin.android.apps.connectmobile.courses.model;

import c22.c3;
import c22.g2;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.messaging.Constants;
import f72.b5;
import f72.c5;
import f72.d3;
import f72.d8;
import f72.h1;
import f72.i9;
import f72.m7;
import f72.m8;
import f72.o4;
import f72.q3;
import f72.t3;
import f72.t7;
import f72.v7;
import f72.w6;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.i1;
import v62.m6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/h;", "", "", Action.KEY_ATTRIBUTE, "Lu4/d;", "icon", "Lc22/c3;", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;Lu4/d;Lc22/c3;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f32947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f32948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f32949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f32950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f32951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f32952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f32953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f32954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f32955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f32956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f32957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f32958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f32959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f32960r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f32961t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f32962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ h[] f32963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ w13.c f32964x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.d f32966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f32967c;

    static {
        s62.a.f157643a.getClass();
        t62.c cVar = t62.c.f162799a;
        u4.d dVarA = m8.a(cVar);
        x0.f23314a.getClass();
        h hVar = new h("CONVENIENCE", 0, "CONVENIENCE", dVarA, g2.b(x0.f23693wc));
        f32947e = hVar;
        h hVar2 = new h("RESTROOM", 1, "RESTROOM", v7.a(cVar), g2.b(x0.Cc));
        f32948f = hVar2;
        h hVar3 = new h("WATER_STOP", 2, "WATER_STOP", i9.a(cVar), g2.b(x0.Fc));
        f32949g = hVar3;
        h hVar4 = new h("COFFEE_SHOP", 3, "COFFEE_SHOP", b5.a(cVar), g2.b(x0.f23660uc));
        f32950h = hVar4;
        h hVar5 = new h("BIKE_SHOP_AND_REPAIR", 4, "BIKE_SHOP_AND_REPAIR", h1.a(cVar), g2.b(x0.f23644tc));
        f32951i = hVar5;
        h hVar6 = new h("PARK", 5, "PARK", m7.a(cVar), g2.b(x0.f23744zc));
        f32952j = hVar6;
        h hVar7 = new h("WINERY_OR_BREWERY", 6, "WINERY_OR_BREWERY", t3.a(cVar), g2.b(x0.Gc));
        f32953k = hVar7;
        h hVar8 = new h("BANK_OR_ATM", 7, "BANK_OR_ATM", q3.a(cVar), g2.b(x0.f23628sc));
        f32954l = hVar8;
        h hVar9 = new h("RESTAURANT", 8, "RESTAURANT", t7.a(cVar), g2.b(x0.Bc));
        f32955m = hVar9;
        h hVar10 = new h("EMERGENCY", 9, "EMERGENCY", d3.a(cVar), g2.b(x0.f23710xc));
        f32956n = hVar10;
        h hVar11 = new h("RECREATION", 10, "RECREATION", i1.a(t62.a.f162797a), g2.b(x0.Ac));
        f32957o = hVar11;
        h hVar12 = new h("ATTRACTION", 11, "ATTRACTION", m6.a(t62.b.f162798a), g2.b(x0.f23595qc));
        f32958p = hVar12;
        h hVar13 = new h("LODGING", 12, "LODGING", w6.a(cVar), g2.b(x0.f23727yc));
        f32959q = hVar13;
        h hVar14 = new h("TRANSPORTATION", 13, "TRANSPORTATION", o4.a(cVar), g2.b(x0.Ec));
        f32960r = hVar14;
        h hVar15 = new h("SHOPPING", 14, "SHOPPING", d8.a(cVar), g2.b(x0.Dc));
        f32961t = hVar15;
        h hVar16 = new h("COMMUNITY", 15, "COMMUNITY", c5.a(cVar), g2.b(x0.f23676vc));
        f32962v = hVar16;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16};
        f32963w = hVarArr;
        f32964x = new w13.c(hVarArr);
        f32946d = new a(null);
    }

    private h(String str, int i14, String str2, u4.d dVar, c3 c3Var) {
        super(str, i14);
        this.f32965a = str2;
        this.f32966b = dVar;
        this.f32967c = c3Var;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f32963w.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/h$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a(String str) {
            Object next;
            str.getClass();
            w13.c cVar = h.f32964x;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((h) next).f32965a, str)) {
                    return (h) next;
                }
            }
            next = null;
            return (h) next;
        }

        private a() {
        }
    }
}
