package ey2;

import android.net.Uri;
import cy2.i;
import cy2.j;
import d53.w;
import ds.e0;
import i3.e5;
import java.net.URLDecoder;
import lc.u0;
import o13.o;
import o13.r;
import o53.s0;
import org.apache.commons.lang3.BooleanUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ley2/c;", "", "<init>", "()V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f67454a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f67455b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67456a;

        static {
            int[] iArr = new int[ve2.e.values().length];
            try {
                iArr[ve2.e.f177705e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.e.f177706f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve2.e.f177707g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67456a = iArr;
        }
    }

    static {
        Logger logger = LoggerFactory.getLogger((Class<?>) c.class);
        logger.getClass();
        f67455b = logger;
    }

    private c() {
    }

    public static Object a(String str, String str2, ve2.e eVar, i iVar, j jVar, cy2.c cVar, v13.i iVar2) {
        Uri uriBuild;
        boolean z14;
        String str3;
        str.getClass();
        str2.getClass();
        eVar.getClass();
        jVar.getClass();
        boolean z15 = jVar instanceof j.f;
        if (z15 || ((z14 = jVar instanceof j.c))) {
            int i14 = a.f67456a[eVar.ordinal()];
            if (i14 == 1 || i14 == 2) {
                throw new o("Mock activation is not supported in China.");
            }
            if (i14 != 3) {
                throw new o("Mock Activation is not supported anywhere except in the TEST environment.");
            }
            uriBuild = Uri.parse("https://omttest.garmin.com/app/mock-subscription/start");
        } else {
            boolean z16 = jVar instanceof j.e;
            if (!z16 && !(jVar instanceof j.a) && !(jVar instanceof j.d) && !(jVar instanceof j.g) && !(jVar instanceof j.h) && !(jVar instanceof j.i) && !(jVar instanceof j.C1217j) && !(jVar instanceof j.b)) {
                u0.r();
                return null;
            }
            int i15 = a.f67456a[eVar.ordinal()];
            if (i15 == 1 || i15 == 2) {
                throw new o("UAC is not supported in China.");
            }
            String str4 = i15 != 3 ? "https://subscriptions.garmin.com/uac/start" : "https://test.subscriptions.garmin.com/uac/start";
            if (cVar == null || (str3 = cVar.f56814g) == null) {
                str3 = null;
            } else if (w.J(str3)) {
                f67455b.debug("Client name in config is blank. Falling back to app package name for clientName.");
                str3 = null;
            }
            if (str3 != null) {
                str = str3;
            }
            String strG = e5.g(str, "-Android-", str2);
            Uri.Builder builderBuildUpon = Uri.parse(str4).buildUpon();
            xx2.d.f192590a.getClass();
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("returnUrl", (String) xx2.d.f192595f.getValue()).appendQueryParameter("exitFlowUrl", (String) xx2.d.f192597h.getValue()).appendQueryParameter("failedReturnUrl", (String) xx2.d.f192596g.getValue()).appendQueryParameter("flow", jVar.getF56872a()).appendQueryParameter("isInMobileApp", BooleanUtils.TRUE).appendQueryParameter("clientName", strG);
            if (jVar instanceof j.a) {
                j.a aVar = (j.a) jVar;
                builderAppendQueryParameter.appendQueryParameter("unitId", aVar.f56839a);
                String str5 = aVar.f56840b;
                if (str5 != null) {
                    builderAppendQueryParameter.appendQueryParameter("packageSKU", str5);
                }
            } else if (z16) {
                j.e eVar2 = (j.e) jVar;
                builderAppendQueryParameter.appendQueryParameter("metaPackageSku", eVar2.f56852a);
                String str6 = eVar2.f56853b;
                if (str6 != null) {
                    builderAppendQueryParameter.appendQueryParameter("packageSKU", str6);
                }
                String str7 = eVar2.f56854c;
                if (str7 != null) {
                    builderAppendQueryParameter.appendQueryParameter("referenceId", str7);
                }
                String str8 = eVar2.f56855d;
                if (str8 != null) {
                    builderAppendQueryParameter.appendQueryParameter("promoCode", str8);
                }
            } else if (jVar instanceof j.d) {
                j.d dVar = (j.d) jVar;
                builderAppendQueryParameter.appendQueryParameter("unitId", dVar.f56848a);
                String str9 = dVar.f56849b;
                if (str9 != null) {
                    builderAppendQueryParameter.appendQueryParameter("packageSKU", str9);
                }
                String str10 = dVar.f56850c;
                if (str10 != null) {
                    builderAppendQueryParameter.appendQueryParameter("referenceId", str10);
                }
            } else if (jVar instanceof j.h) {
                j.h hVar = (j.h) jVar;
                builderAppendQueryParameter.appendQueryParameter("packageInstanceId", hVar.f56863a);
                String str11 = hVar.f56864b;
                if (str11 != null) {
                    builderAppendQueryParameter.appendQueryParameter("selectedSKU", str11);
                }
                String str12 = hVar.f56865c;
                if (str12 != null) {
                    builderAppendQueryParameter.appendQueryParameter("referenceId", str12);
                }
            } else if (jVar instanceof j.g) {
                j.g gVar = (j.g) jVar;
                builderAppendQueryParameter.appendQueryParameter("packageInstanceId", gVar.f56860a);
                String str13 = gVar.f56861b;
                if (str13 != null) {
                    builderAppendQueryParameter.appendQueryParameter("referenceId", str13);
                }
            } else if (!(jVar instanceof j.C1217j)) {
                if (jVar instanceof j.i) {
                    j.i iVar3 = (j.i) jVar;
                    builderAppendQueryParameter.appendQueryParameter("sourceUid", iVar3.f56867a);
                    builderAppendQueryParameter.appendQueryParameter("targetUid", iVar3.f56868b);
                    builderAppendQueryParameter.appendQueryParameter("packageInstanceId", iVar3.f56869c);
                    String str14 = iVar3.f56870d;
                    if (str14 != null) {
                        builderAppendQueryParameter.appendQueryParameter("referenceId", str14);
                    }
                } else if (jVar instanceof j.b) {
                    j.b bVar = (j.b) jVar;
                    builderAppendQueryParameter.appendQueryParameter("unitId", bVar.f56842a);
                    String str15 = bVar.f56843b;
                    if (str15 != null) {
                        builderAppendQueryParameter.appendQueryParameter("referenceId", str15);
                    }
                } else if (!z14 && !z15) {
                    u0.r();
                    return null;
                }
            }
            String str16 = cVar != null ? cVar.f56808a : null;
            if (str16 != null && str16.length() != 0) {
                builderAppendQueryParameter.appendQueryParameter("cultureCode", cVar.f56808a);
            }
            String str17 = cVar != null ? cVar.f56809b : null;
            if (str17 != null && str17.length() != 0) {
                builderAppendQueryParameter.appendQueryParameter("cssUrl", cVar.f56809b);
            }
            String str18 = cVar != null ? cVar.f56810c : null;
            if (str18 != null && str18.length() != 0) {
                builderAppendQueryParameter.appendQueryParameter("upcCssUrl", cVar.f56810c);
            }
            String str19 = cVar != null ? cVar.f56811d : null;
            if (str19 != null && str19.length() != 0) {
                builderAppendQueryParameter.appendQueryParameter("upcStylingJsonName", cVar.f56811d);
            }
            if ((cVar != null ? cVar.f56815h : null) != null) {
                builderAppendQueryParameter.appendQueryParameter("showHeader", cVar.f56815h.toString());
            }
            if ((cVar != null ? cVar.f56816i : null) != null) {
                builderAppendQueryParameter.appendQueryParameter("showFooter", cVar.f56816i.toString());
            }
            uriBuild = builderAppendQueryParameter.appendQueryParameter("timestamp", String.valueOf(DateTime.now().getMillis())).build();
            uriBuild.getClass();
        }
        return iVar.e3(uriBuild, iVar2);
    }

    public static androidx.appcompat.app.e c(i.c cVar, cy2.b bVar, e23.a aVar, e23.a aVar2) {
        bVar.getClass();
        androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(cVar).setTitle(bVar.f56804a).setMessage(bVar.f56805b).setNegativeButton(bVar.f56806c, new c32.a(aVar2, 2)).setPositiveButton(bVar.f56807d, new c32.a(aVar, 3)).setOnCancelListener(new c32.b(aVar2, 1)).show();
        eVarShow.getClass();
        return eVarShow;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable b(Uri uri, v13.c cVar) throws Throwable {
        d dVar;
        Uri uri2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f67460d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f67460d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objE0 = dVar.f67458b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f67460d;
        if (i15 == 0) {
            r.b(objE0);
            xx2.d dVar2 = xx2.d.f192590a;
            dVar.f67457a = uri;
            dVar.f67460d = 1;
            dVar2.getClass();
            objE0 = ge1.b.e0(s0.f129406a, new xx2.c(uri, null), dVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = dVar.f67457a;
            r.b(objE0);
        }
        boolean zBooleanValue = ((Boolean) objE0).booleanValue();
        Logger logger = f67455b;
        if (zBooleanValue) {
            try {
                String queryParameter = uri.getQueryParameter("url");
                String queryParameter2 = uri.getQueryParameter("redirectResult");
                if (queryParameter == null || w.J(queryParameter)) {
                    logger.error("Missing 'url' parameter for the return URL");
                } else if (queryParameter2 == null || w.J(queryParameter2)) {
                    logger.error("Missing 'redirectResult' parameter for the return URL");
                } else {
                    try {
                        uri2 = Uri.parse(URLDecoder.decode(queryParameter, "UTF-8") + "&redirectResult=" + queryParameter2);
                    } catch (Exception unused) {
                        logger.error("Failed to remove percent encoding for the return URL");
                        uri2 = null;
                    }
                    if (uri2 != null) {
                        return uri2;
                    }
                    e0.v("Failed to decode URL with host: ", uri.getHost(), logger);
                }
            } catch (Exception e4) {
                logger.error("Failed to get query parameters for the return URL", (Throwable) e4);
            }
            uri2 = null;
            if (uri2 != null) {
                return uri2;
            }
            e0.v("Failed to decode URL with host: ", uri.getHost(), logger);
        }
        logger.error(v.e0.g("URL path not supported: ", uri.getScheme(), "://", uri.getHost(), uri.getPath()));
        return null;
    }
}
