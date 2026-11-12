package c7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.lang3.StringUtils;
import p1.c0;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f25197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0<String, Typeface> f25198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f25199c;

    public static class a extends i7.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b7.g.c f25200a;

        public a(b7.g.c cVar) {
            this.f25200a = cVar;
        }

        @Override // i7.m
        public final void a(int i14) {
            b7.g.c cVar = this.f25200a;
            if (cVar != null) {
                cVar.lambda$callbackFailAsync$1(i14);
            }
        }

        @Override // i7.m
        public final void b(Typeface typeface) {
            b7.g.c cVar = this.f25200a;
            if (cVar != null) {
                cVar.lambda$callbackSuccessAsync$0(typeface);
            }
        }
    }

    static {
        Trace.beginSection(ce.a.d("TypefaceCompat static init"));
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 31) {
            f25197a = new m();
        } else if (i14 >= 29) {
            f25197a = new l();
        } else {
            f25197a = new k();
        }
        f25198b = new c0<>(16);
        f25199c = null;
        Trace.endSection();
    }

    private h() {
    }

    public static Typeface a(Context context, b7.e.a aVar, Resources resources, int i14, String str, int i15, int i16, b7.g.c cVar, boolean z14) {
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        Typeface typeface;
        Typeface typeface2 = null;
        if (aVar instanceof b7.e.d) {
            b7.e.d dVar = (b7.e.d) aVar;
            String str2 = dVar.f16252d;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                List<i7.e> list = dVar.f16249a;
                if (list.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i17 = 0;
                        while (true) {
                            if (i17 >= list.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderH = null;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < list.size()) {
                                        i7.e eVar = list.get(i18);
                                        if (i18 == list.size() - 1 && TextUtils.isEmpty(eVar.f91917g)) {
                                            customFallbackBuilderH.setSystemFallback(eVar.f91916f);
                                        } else {
                                            String str3 = eVar.f91916f;
                                            String str4 = eVar.f91917g;
                                            Font fontD = d(c(str3));
                                            if (fontD != null) {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = b.m.l(fontD).build();
                                                } else {
                                                    try {
                                                        b.m.p();
                                                        b.m.D();
                                                        fontFamilyBuild = b.m.l(androidx.core.view.d.j(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                    }
                                                }
                                                if (customFallbackBuilderH == null) {
                                                    customFallbackBuilderH = b.m.h(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderH.addCustomFallback(fontFamilyBuild);
                                                }
                                                i18++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderH.build();
                                    break;
                                }
                            }
                            if (c(list.get(i17).f91916f) != null) {
                                i17++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(list.get(0).f91916f);
            }
            if (typefaceBuild != null) {
                if (cVar != null) {
                    cVar.callbackSuccessAsync(typefaceBuild, null);
                }
                f25198b.put(b(resources, i14, str, i15, i16), typefaceBuild);
                return typefaceBuild;
            }
            boolean z15 = !z14 ? cVar != null : dVar.f16251c != 0;
            int i19 = z14 ? dVar.f16250b : -1;
            Handler handler = b7.g.c.getHandler(null);
            a aVar2 = new a(cVar);
            List<i7.e> list2 = dVar.f16249a;
            i7.c cVar2 = new i7.c(aVar2, new i7.o(handler));
            if (!z15) {
                String strA = i7.j.a(i16, list2);
                typeface = i7.j.f91929a.get(strA);
                if (typeface != null) {
                    cVar2.a(new i7.j.a(typeface));
                    typeface2 = typeface;
                } else {
                    i7.g gVar = new i7.g(cVar2);
                    synchronized (i7.j.f91931c) {
                        try {
                            k1<String, ArrayList<k7.b<i7.j.a>>> k1Var = i7.j.f91932d;
                            ArrayList<k7.b<i7.j.a>> arrayList = k1Var.get(strA);
                            if (arrayList != null) {
                                arrayList.add(gVar);
                            } else {
                                ArrayList<k7.b<i7.j.a>> arrayList2 = new ArrayList<>();
                                arrayList2.add(gVar);
                                k1Var.put(strA, arrayList2);
                                i7.j.f91930b.execute(new i7.p(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new i7.h(strA, context, list2, i16), new i7.i(strA)));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                if (list2.size() > 1) {
                    vb.h.s("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                i7.e eVar2 = list2.get(0);
                c0<String, Typeface> c0Var = i7.j.f91929a;
                ArrayList arrayList3 = new ArrayList(1);
                Object obj = new Object[]{eVar2}[0];
                Objects.requireNonNull(obj);
                arrayList3.add(obj);
                String strA2 = i7.j.a(i16, Collections.unmodifiableList(arrayList3));
                typeface = i7.j.f91929a.get(strA2);
                if (typeface != null) {
                    cVar2.a(new i7.j.a(typeface));
                    typeface2 = typeface;
                } else if (i19 == -1) {
                    ArrayList arrayList4 = new ArrayList(1);
                    Object obj2 = new Object[]{eVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList4.add(obj2);
                    i7.j.a aVarB = i7.j.b(strA2, context, Collections.unmodifiableList(arrayList4), i16);
                    cVar2.a(aVarB);
                    typeface2 = aVarB.f91933a;
                } else {
                    try {
                        try {
                            try {
                                i7.j.a aVar3 = (i7.j.a) i7.j.f91930b.submit(new i7.f(strA2, context, eVar2, i16)).get(i19, TimeUnit.MILLISECONDS);
                                cVar2.a(aVar3);
                                typeface2 = aVar3.f91933a;
                            } catch (InterruptedException e4) {
                                throw e4;
                            }
                        } catch (ExecutionException e14) {
                            throw new RuntimeException(e14);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        cVar2.a(new i7.j.a(-3));
                    }
                }
            }
        } else {
            Typeface typefaceA = f25197a.a(context, (b7.e.b) aVar, resources, i16);
            if (cVar != null) {
                if (typefaceA != null) {
                    cVar.callbackSuccessAsync(typefaceA, null);
                } else {
                    cVar.callbackFailAsync(-3, null);
                }
            }
            typeface2 = typefaceA;
        }
        if (typeface2 != null) {
            f25198b.put(b(resources, i14, str, i15, i16), typeface2);
        }
        return typeface2;
    }

    public static String b(Resources resources, int i14, String str, int i15, int i16) {
        return resources.getResourcePackageName(i14) + '-' + str + '-' + i15 + '-' + i14 + '-' + i16;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f25199c == null) {
            f25199c = new Paint();
        }
        f25199c.setTextSize(10.0f);
        f25199c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) StringUtils.SPACE, 0, 1, 0, 1, 0.0f, 0.0f, false, f25199c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
