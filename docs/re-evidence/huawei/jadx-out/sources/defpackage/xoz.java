package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xoz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f53256a = new byte[0];
    private static volatile xoz d = null;
    public static final String e = "WalletLocalManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<xou> f53257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xow f53258c;
    private boolean h;

    private xoz(Context context) {
        this.h = false;
        if (c(a(context, "grs_sdk_global_route_config.json")) == 0) {
            this.h = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0086 A[EXC_TOP_SPLITTER, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[SYNTHETIC] */
    private String a(Context context, String str) {
        if (context == null) {
            xnd.b(e, "getConfigContent context is null.", false);
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            xnd.b(e, "getConfigContent fileName is null.", false);
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (-1 == i) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                    xnd.b(e, "closeQuietly IOException", false);
                }
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused2) {
                        xnd.b(e, "closeQuietly IOException", false);
                    }
                }
            }
            byteArrayOutputStream.flush();
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        } catch (IOException unused3) {
            xnd.b(e, "getConfigContent IOException: ", false);
            return "";
        } finally {
            byteArrayOutputStream.close();
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
        }
    }

    public Map<String, String> b(String str, String str2) {
        if (!this.h) {
            return new HashMap(0);
        }
        xpa xpaVarE = this.f53258c.e(str2);
        if (xpaVarE == null) {
            xnd.b(e, "service not found in local config", false);
            return new HashMap(0);
        }
        xoy xoyVarC = xpaVarE.c(a(str));
        if (xoyVarC == null) {
            xnd.b(e, "countryGroupId not found by routeby in local config", false);
            return new HashMap(0);
        }
        xnd.b(e, "getServicesUrlsFromLocal = " + xoyVarC.d(), false);
        return xoyVarC.d();
    }

    private int c(String str) {
        if (TextUtils.isEmpty(str)) {
            xnd.b(e, "getConfigMgr configContent is null.", false);
            return -1;
        }
        int iE = e(str);
        if (iE != 0) {
            return iE;
        }
        int iD = d(str);
        return iD != 0 ? iD : b(str);
    }

    private int d(String str) {
        this.f53258c = new xow();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONObject(MimeTypes.BASE_TYPE_APPLICATION).getJSONArray("services");
            if (jSONArray != null && jSONArray.length() != 0) {
                return 0;
            }
            xnd.b(e, "local config application.services is not config or no any services", false);
            return -1;
        } catch (JSONException unused) {
            xnd.b(e, "parse appbean failed", false);
            return -1;
        }
    }

    private int e(String str) {
        this.f53257b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("countryGroups");
            if (jSONObject.length() != 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next instanceof String) {
                        String str2 = next;
                        xou xouVar = new xou();
                        xouVar.e(str2);
                        JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
                        xouVar.a(jSONObject2.getString("name"));
                        xouVar.c(jSONObject2.getString("description"));
                        JSONArray jSONArray = jSONObject2.getJSONArray("countries");
                        HashSet hashSet = new HashSet(16);
                        if (jSONArray != null && jSONArray.length() != 0) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                if (jSONArray.get(i) instanceof String) {
                                    hashSet.add((String) jSONArray.get(i));
                                }
                            }
                            xouVar.d(hashSet);
                            this.f53257b.add(xouVar);
                        }
                        xnd.b(e, "local config countryGroups.groupId.countries is not config or no any countries", false);
                        return -1;
                    }
                }
            }
            return 0;
        } catch (JSONException unused) {
            xnd.b(e, "parse countryGroup failed", false);
            return -1;
        }
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
    private int b(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("services");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next instanceof String) {
                    String str2 = next;
                    xpa xpaVar = new xpa();
                    xpaVar.d(str2);
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
                    xpaVar.e(jSONObject2.getString("routeBy"));
                    JSONArray jSONArray = jSONObject2.getJSONArray("servings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        if (jSONArray.get(i) instanceof JSONObject) {
                            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i);
                            xoy xoyVar = new xoy();
                            if (!jSONObject3.has("countryGroup")) {
                                string = "no-country";
                            } else {
                                string = jSONObject3.getString("countryGroup");
                            }
                            xoyVar.a(string);
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("addresses");
                            HashMap map = new HashMap(16);
                            Iterator<String> itKeys2 = jSONObject4.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                if (next2 instanceof String) {
                                    String str3 = next2;
                                    map.put(str3, jSONObject4.getString(str3));
                                }
                            }
                            xoyVar.e(map);
                            xpaVar.e(xoyVar.b(), xoyVar);
                        }
                    }
                    this.f53258c.c(str2, xpaVar);
                }
            }
            return 0;
        } catch (JSONException unused) {
            xnd.b(e, "parse services failed", false);
            return -1;
        }
    }

    public String a(String str) {
        List<xou> list = this.f53257b;
        if (list != null && list.size() > 0) {
            for (xou xouVar : this.f53257b) {
                if (xouVar != null && xouVar.b() != null && xouVar.b().contains(str)) {
                    return xouVar.a();
                }
            }
            return "";
        }
        return "";
    }

    public static xoz c(Context context) {
        if (d == null) {
            synchronized (f53256a) {
                if (d == null) {
                    d = new xoz(context);
                }
            }
        }
        return d;
    }
}
