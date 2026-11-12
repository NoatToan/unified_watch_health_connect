package ex2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import c83.b0;
import com.bumptech.glide.load.engine.GlideException;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;
import f72.gh;
import i3.e5;
import iw2.i1;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import o53.s0;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import v.e0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lex2/i;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f66970a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cx2.h f66971b = new cx2.h("ImageHelper", null, 2, null);

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ex2/i$a", "Lmj/g;", "Landroid/graphics/drawable/Drawable;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mj.g<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f66972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppCompatImageView f66973b;

        public a(String str, int i14, AppCompatImageView appCompatImageView) {
            this.f66972a = i14;
            this.f66973b = appCompatImageView;
        }

        @Override // mj.g
        public final boolean d(GlideException glideException, nj.h hVar) {
            hVar.getClass();
            i.f66971b.getClass();
            AppCompatImageView appCompatImageView = this.f66973b;
            int i14 = this.f66972a;
            if (i14 == 0) {
                appCompatImageView.setVisibility(0);
                return false;
            }
            if (i14 == 4) {
                appCompatImageView.setVisibility(4);
                return false;
            }
            if (i14 != 8) {
                return false;
            }
            appCompatImageView.setVisibility(8);
            return false;
        }

        @Override // mj.g
        public final void g(Object obj, Object obj2, ui.a aVar) {
            obj2.getClass();
            aVar.getClass();
            i.f66971b.getClass();
            this.f66973b.setVisibility(0);
        }
    }

    private i() {
    }

    public static void e(Context context, String str, AppCompatImageView appCompatImageView, int i14, Drawable drawable) {
        str.getClass();
        appCompatImageView.getClass();
        f66971b.getClass();
        com.bumptech.glide.b.c(context).c(context).l(str).f(drawable).y(new a(str, i14, appCompatImageView)).E(appCompatImageView);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0209  */
    /* JADX WARN: Code duplicated, block: B:51:0x021e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0252  */
    /* JADX WARN: Code duplicated, block: B:57:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0267  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01aa -> B:43:0x01c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x02d1 -> B:88:0x032b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x030a -> B:82:0x0312). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0334 -> B:43:0x01c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(android.content.Context r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, v13.c r26) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex2.i.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, String str, v13.c cVar) throws Throwable {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f66956c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f66956c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objE0 = eVar.f66954a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f66956c;
        if (i15 == 0) {
            o13.r.b(objE0);
            File cacheDir = context.getCacheDir();
            cacheDir.getClass();
            OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().cache(new Cache(cacheDir, 1048576L)).addInterceptor(new d(context)).build();
            b0.b bVar = new b0.b();
            bVar.b(str);
            bVar.a(e83.a.d(new GsonBuilder().setStrictness(Strictness.LENIENT).create()));
            bVar.d(okHttpClientBuild);
            m mVar = (m) bVar.c().b(m.class);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            f fVar = new f(mVar, str, null);
            eVar.f66956c = 1;
            objE0 = ge1.b.e0(bVar2, fVar, eVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        Integer num = (Integer) objE0;
        f66971b.getClass();
        return num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, String str, String str2, v13.c cVar) throws Throwable {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f66962c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f66962c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objE0 = gVar.f66960a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f66962c;
        if (i15 == 0) {
            o13.r.b(objE0);
            iw2.w wVar = iw2.w.f95547a;
            gVar.f66962c = 1;
            wVar.getClass();
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new iw2.n(context, str, str2, null), gVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        return Boolean.valueOf(((File) objE0).exists());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Context context, String str, String str2, String str3, v13.c cVar) throws Throwable {
        h hVar;
        String str4;
        File file;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f66969g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f66969g = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objC = hVar.f66967e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f66969g;
        cx2.h hVar2 = f66971b;
        if (i15 == 0) {
            o13.r.b(objC);
            hVar.f66963a = context;
            hVar.f66964b = str;
            hVar.f66965c = str2;
            hVar.f66966d = str3;
            hVar.f66969g = 1;
            objC = c(context, str, str2, hVar);
            if (objC != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            str3 = hVar.f66966d;
            str2 = hVar.f66965c;
            str = hVar.f66964b;
            context = hVar.f66963a;
            o13.r.b(objC);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = hVar.f66966d;
            o13.r.b(objC);
        }
        file = new File((File) objC, tn.k.g(str4, ".png"));
        if (file.exists()) {
            hVar2.getClass();
            return Drawable.createFromPath(file.getAbsolutePath());
        }
        hVar2.getClass();
        return null;
        if (!((Boolean) objC).booleanValue()) {
            hVar2.getClass();
            return null;
        }
        iw2.w wVar = iw2.w.f95547a;
        hVar.f66963a = null;
        hVar.f66964b = null;
        hVar.f66965c = null;
        hVar.f66966d = str3;
        hVar.f66969g = 2;
        wVar.getClass();
        x53.c cVar2 = s0.f129406a;
        objC = ge1.b.e0(x53.b.f189152a, new iw2.n(context, str, str2, null), hVar);
        if (objC != obj) {
            str4 = str3;
            file = new File((File) objC, tn.k.g(str4, ".png"));
            if (file.exists()) {
                hVar2.getClass();
                return Drawable.createFromPath(file.getAbsolutePath());
            }
            hVar2.getClass();
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x0139  */
    /* JADX WARN: Code duplicated, block: B:47:0x014d A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r13 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Context context, String str, String str2, Long l14, Long l15, AppCompatImageView appCompatImageView, int i14, v13.c cVar) throws Throwable {
        j jVar;
        Long l16;
        AppCompatImageView appCompatImageView2;
        int i15;
        String str3;
        Long l17;
        String str4;
        Context context2;
        Object objD;
        String str5;
        Long l18;
        int i16;
        Long l19;
        Context context3;
        AppCompatImageView appCompatImageView3;
        Drawable drawable;
        long jLongValue;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i17 = jVar.f66983j;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                jVar.f66983j = i17 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objE = jVar.f66981h;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i18 = jVar.f66983j;
        if (i18 != 0) {
            if (i18 == 1) {
                i14 = jVar.f66980g;
                appCompatImageView = jVar.f66979f;
                l15 = jVar.f66978e;
                l14 = jVar.f66977d;
                str2 = jVar.f66976c;
                str = jVar.f66975b;
                context = jVar.f66974a;
                o13.r.b(objE);
            } else {
                if (i18 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i16 = jVar.f66980g;
                appCompatImageView3 = jVar.f66979f;
                l18 = jVar.f66978e;
                l19 = jVar.f66977d;
                str3 = jVar.f66976c;
                str5 = jVar.f66975b;
                context3 = jVar.f66974a;
                o13.r.b(objE);
            }
            drawable = (Drawable) objE;
            if (drawable != null) {
                appCompatImageView3.setImageDrawable(drawable);
                if (l18 == null || l19 != null) {
                    if (l18 != null) {
                        jLongValue = l18.longValue();
                    } else {
                        l19.getClass();
                        jLongValue = l19.longValue();
                    }
                    appCompatImageView3.setColorFilter(xy2.b.u(jLongValue), PorterDuff.Mode.SRC_ATOP);
                }
                appCompatImageView3.setVisibility(0);
            } else {
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                String strConcat = com.garmin.realtimesettings.app.initialization.b.c().f192455c.f73850b.concat("/settings-icons/realtimesettings/images/");
                iw2.w.f95547a.getClass();
                e(context3, e0.h(e5.l(strConcat, "v1/", str5, "/", iw2.w.g(context3)), "/", str3, ".png"), appCompatImageView3, i16, null);
            }
            if (p005kotlin.jvm.internal.s.g(str5, "BASE") || p005kotlin.jvm.internal.s.g(str3, "ADD_ACTION") || p005kotlin.jvm.internal.s.g(str3, "DELETE_ACTION")) {
                appCompatImageView3.setImageTintList(null);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objE);
        if (p005kotlin.jvm.internal.s.g(str2, "WORKOUTS")) {
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            vw2.a aVarA = com.garmin.realtimesettings.app.initialization.b.a();
            jVar.f66974a = context;
            jVar.f66975b = str;
            jVar.f66976c = str2;
            jVar.f66977d = l14;
            jVar.f66978e = l15;
            jVar.f66979f = appCompatImageView;
            jVar.f66980g = i14;
            jVar.f66983j = 1;
            objE = aVarA.e(jVar);
        } else {
            l16 = l15;
            appCompatImageView2 = appCompatImageView;
            i15 = i14;
            str3 = str2;
            l17 = l14;
            str4 = str;
            context2 = context;
            iw2.w.f95547a.getClass();
            String strG = iw2.w.g(context2);
            jVar.f66974a = context2;
            jVar.f66975b = str4;
            jVar.f66976c = str3;
            jVar.f66977d = l17;
            jVar.f66978e = l16;
            jVar.f66979f = appCompatImageView2;
            jVar.f66980g = i15;
            jVar.f66983j = 2;
            objD = d(context2, str4, strG, str3, jVar);
            if (objD != obj) {
                str5 = str4;
                l18 = l16;
                i16 = i15;
                objE = objD;
                l19 = l17;
                context3 = context2;
                appCompatImageView3 = appCompatImageView2;
                drawable = (Drawable) objE;
                if (drawable != null) {
                    appCompatImageView3.setImageDrawable(drawable);
                    if (l18 == null) {
                        if (l18 != null) {
                            jLongValue = l18.longValue();
                        } else {
                            l19.getClass();
                            jLongValue = l19.longValue();
                        }
                        appCompatImageView3.setColorFilter(xy2.b.u(jLongValue), PorterDuff.Mode.SRC_ATOP);
                    } else {
                        if (l18 != null) {
                            jLongValue = l18.longValue();
                        } else {
                            l19.getClass();
                            jLongValue = l19.longValue();
                        }
                        appCompatImageView3.setColorFilter(xy2.b.u(jLongValue), PorterDuff.Mode.SRC_ATOP);
                    }
                    appCompatImageView3.setVisibility(0);
                } else {
                    com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                    String strConcat2 = com.garmin.realtimesettings.app.initialization.b.c().f192455c.f73850b.concat("/settings-icons/realtimesettings/images/");
                    iw2.w.f95547a.getClass();
                    e(context3, e0.h(e5.l(strConcat2, "v1/", str5, "/", iw2.w.g(context3)), "/", str3, ".png"), appCompatImageView3, i16, null);
                }
                if (p005kotlin.jvm.internal.s.g(str5, "BASE")) {
                    appCompatImageView3.setImageTintList(null);
                } else {
                    appCompatImageView3.setImageTintList(null);
                }
                return Unit.INSTANCE;
            }
        }
        return obj;
        if (((Boolean) objE).booleanValue()) {
            int color = a7.b.getColor(context, R.color.icon_1);
            s62.a.f157643a.getClass();
            u4.d dVarA = gh.a(t62.c.f162799a);
            appCompatImageView.getClass();
            appCompatImageView.getContext().getClass();
            appCompatImageView.setImageDrawable(new l(dVarA, color));
            return Unit.INSTANCE;
        }
        l16 = l15;
        appCompatImageView2 = appCompatImageView;
        i15 = i14;
        str3 = str2;
        l17 = l14;
        str4 = str;
        context2 = context;
        iw2.w.f95547a.getClass();
        String strG2 = iw2.w.g(context2);
        jVar.f66974a = context2;
        jVar.f66975b = str4;
        jVar.f66976c = str3;
        jVar.f66977d = l17;
        jVar.f66978e = l16;
        jVar.f66979f = appCompatImageView2;
        jVar.f66980g = i15;
        jVar.f66983j = 2;
        objD = d(context2, str4, strG2, str3, jVar);
        if (objD != obj) {
            str5 = str4;
            l18 = l16;
            i16 = i15;
            objE = objD;
            l19 = l17;
            context3 = context2;
            appCompatImageView3 = appCompatImageView2;
            drawable = (Drawable) objE;
            if (drawable != null) {
                appCompatImageView3.setImageDrawable(drawable);
                if (l18 == null) {
                    if (l18 != null) {
                        jLongValue = l18.longValue();
                    } else {
                        l19.getClass();
                        jLongValue = l19.longValue();
                    }
                    appCompatImageView3.setColorFilter(xy2.b.u(jLongValue), PorterDuff.Mode.SRC_ATOP);
                } else {
                    if (l18 != null) {
                        jLongValue = l18.longValue();
                    } else {
                        l19.getClass();
                        jLongValue = l19.longValue();
                    }
                    appCompatImageView3.setColorFilter(xy2.b.u(jLongValue), PorterDuff.Mode.SRC_ATOP);
                }
                appCompatImageView3.setVisibility(0);
            } else {
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                String strConcat3 = com.garmin.realtimesettings.app.initialization.b.c().f192455c.f73850b.concat("/settings-icons/realtimesettings/images/");
                iw2.w.f95547a.getClass();
                e(context3, e0.h(e5.l(strConcat3, "v1/", str5, "/", iw2.w.g(context3)), "/", str3, ".png"), appCompatImageView3, i16, null);
            }
            if (p005kotlin.jvm.internal.s.g(str5, "BASE")) {
                appCompatImageView3.setImageTintList(null);
            } else {
                appCompatImageView3.setImageTintList(null);
            }
            return Unit.INSTANCE;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(String str, String str2, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f66986c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f66986c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objL = kVar.f66984a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f66986c;
        cx2.h hVar = f66971b;
        if (i15 == 0) {
            o13.r.b(objL);
            hVar.getClass();
            i1 i1Var = (i1) da2.d.b().getCapability(str, i1.class);
            if (i1Var == null) {
                return x.d("BASE");
            }
            kVar.f66986c = 1;
            objL = i1Var.l(str2, kVar);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        jw2.e eVar = (jw2.e) objL;
        ArrayList<String> arrayList = eVar != null ? eVar.f101383c : null;
        Objects.toString(arrayList);
        hVar.getClass();
        return arrayList == null ? x.d("BASE") : arrayList;
    }
}
