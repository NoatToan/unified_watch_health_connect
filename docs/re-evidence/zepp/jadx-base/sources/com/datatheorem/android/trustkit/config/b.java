package com.datatheorem.android.trustkit.config;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.datatheorem.android.trustkit.utils.TrustKitLog;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.huami.passport.Configs;
import com.unionpay.tsmservice.data.Constant;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.acra.ACRAConstants;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
class b {

    /* JADX INFO: renamed from: com.datatheorem.android.trustkit.config.b$b, reason: collision with other inner class name */
    public static class C0130b {
        public boolean a;
        public Set<Certificate> b;

        private C0130b() {
            this.a = false;
            this.b = null;
        }
    }

    public static class c {
        public Boolean a;
        public String b;

        private c() {
            this.a = null;
            this.b = null;
        }
    }

    public static class d {
        public Date a;
        public Set<String> b;

        private d() {
            this.a = null;
            this.b = null;
        }
    }

    public static class e {
        public Boolean a;
        public Boolean b;
        public Set<String> c;

        private e() {
            this.a = Boolean.FALSE;
        }
    }

    private static String a(@NonNull Context context, String str) {
        if (!TextUtils.isDigitsOnly(str.replace("@", ""))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@");
        sb.append(context.getResources().getResourceName(Integer.parseInt(str.replace("@", ""))).replace(context.getPackageName() + ":", ""));
        return sb.toString();
    }

    @NonNull
    public static TrustKitConfiguration b(@NonNull Context context, @NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, CertificateException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        C0130b c0130bC = null;
        while (eventType != 1) {
            if (eventType == 2) {
                if ("domain-config".equals(xmlPullParser.getName())) {
                    arrayList.addAll(e(xmlPullParser, null));
                } else if ("debug-overrides".equals(xmlPullParser.getName())) {
                    c0130bC = c(context, xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            DomainPinningPolicy domainPinningPolicyBuild = ((DomainPinningPolicy.Builder) it2.next()).build();
            if (domainPinningPolicyBuild != null) {
                hashSet.add(domainPinningPolicyBuild);
            }
        }
        return c0130bC != null ? new TrustKitConfiguration(hashSet, c0130bC.a, c0130bC.b) : new TrustKitConfiguration(hashSet);
    }

    @NonNull
    private static C0130b c(@NonNull Context context, @NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, CertificateException {
        Boolean boolValueOf;
        xmlPullParser.require(2, null, "debug-overrides");
        C0130b c0130b = new C0130b();
        HashSet hashSet = new HashSet();
        int next = xmlPullParser.next();
        Boolean bool = null;
        while (true) {
            if (next == 3 && "trust-anchors".equals(xmlPullParser.getName())) {
                break;
            }
            if (next == 2 && "certificates".equals(xmlPullParser.getName())) {
                boolean z = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "overridePins"));
                if (bool == null || bool.booleanValue() == z) {
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    boolValueOf = Boolean.FALSE;
                    TrustKitLog.w("Warning: different values for overridePins are set in the policy but TrustKit only supports one value; using overridePins=false for all connections");
                }
                bool = boolValueOf;
                String strA = a(context, xmlPullParser.getAttributeValue(null, "src").trim());
                if (TextUtils.isEmpty(strA) || strA.equals("user") || strA.equals("system") || !strA.startsWith("@raw")) {
                    TrustKitLog.i("No <debug-overrides> certificates found by TrustKit. Please check your @raw folder (TrustKit doesn't support system and user installed certificates).");
                } else {
                    hashSet.add(CertificateFactory.getInstance(ACRAConstants.DEFAULT_CERTIFICATE_TYPE).generateCertificate(context.getResources().openRawResource(context.getResources().getIdentifier(strA.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)[1], "raw", context.getPackageName()))));
                }
            }
            next = xmlPullParser.next();
        }
        if (bool != null) {
            c0130b.a = bool.booleanValue();
        }
        if (hashSet.size() > 0) {
            c0130b.b = hashSet;
        }
        return c0130b;
    }

    @NonNull
    private static c d(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "domain");
        c cVar = new c();
        String attributeValue = xmlPullParser.getAttributeValue(null, "includeSubdomains");
        if (attributeValue != null) {
            cVar.a = Boolean.valueOf(Boolean.parseBoolean(attributeValue));
        }
        cVar.b = xmlPullParser.nextText();
        return cVar;
    }

    private static List<DomainPinningPolicy.Builder> e(XmlPullParser xmlPullParser, DomainPinningPolicy.Builder builder) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "domain-config");
        DomainPinningPolicy.Builder parent = new DomainPinningPolicy.Builder().setParent(builder);
        ArrayList arrayList = new ArrayList();
        arrayList.add(parent);
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && "domain-config".equals(xmlPullParser.getName())) {
                return arrayList;
            }
            if (next == 2) {
                if ("domain-config".equals(xmlPullParser.getName())) {
                    arrayList.addAll(e(xmlPullParser, parent));
                } else if ("domain".equals(xmlPullParser.getName())) {
                    c cVarD = d(xmlPullParser);
                    parent.setHostname(cVarD.b).setShouldIncludeSubdomains(cVarD.a);
                } else if ("pin-set".equals(xmlPullParser.getName())) {
                    d dVarF = f(xmlPullParser);
                    parent.setPublicKeyHashes(dVarF.b).setExpirationDate(dVarF.a);
                } else if ("trustkit-config".equals(xmlPullParser.getName())) {
                    e eVarG = g(xmlPullParser);
                    parent.setReportUris(eVarG.c).setShouldEnforcePinning(eVarG.a).setShouldDisableDefaultReportUri(eVarG.b);
                }
            }
            next = xmlPullParser.next();
        }
    }

    @NonNull
    private static d f(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "pin-set");
        d dVar = new d();
        dVar.b = new HashSet();
        String attributeValue = xmlPullParser.getAttributeValue(null, Configs.Params.EXPIRATION);
        if (attributeValue != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                simpleDateFormat.setLenient(false);
                Date date = simpleDateFormat.parse(attributeValue);
                if (date == null) {
                    throw new ConfigurationException("Invalid expiration date in pin-set");
                }
                dVar.a = date;
            } catch (ParseException unused) {
                throw new ConfigurationException("Invalid expiration date in pin-set");
            }
        }
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && "pin-set".equals(xmlPullParser.getName())) {
                return dVar;
            }
            if (next == 2 && Constant.KEY_PIN.equals(xmlPullParser.getName())) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "digest");
                if (attributeValue2 == null || !attributeValue2.equals(ConstantsKt.ALGORITHM_SHA_256)) {
                    throw new IllegalArgumentException("Unexpected digest value: " + attributeValue2);
                }
                dVar.b.add(xmlPullParser.nextText());
            }
            next = xmlPullParser.next();
        }
    }

    @NonNull
    private static e g(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "trustkit-config");
        e eVar = new e();
        HashSet hashSet = new HashSet();
        String attributeValue = xmlPullParser.getAttributeValue(null, "enforcePinning");
        if (attributeValue != null) {
            eVar.a = Boolean.valueOf(Boolean.parseBoolean(attributeValue));
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "disableDefaultReportUri");
        if (attributeValue2 != null) {
            eVar.b = Boolean.valueOf(Boolean.parseBoolean(attributeValue2));
        }
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && "trustkit-config".equals(xmlPullParser.getName())) {
                eVar.c = hashSet;
                return eVar;
            }
            if (next == 2 && "report-uri".equals(xmlPullParser.getName())) {
                hashSet.add(xmlPullParser.nextText());
            }
            next = xmlPullParser.next();
        }
    }
}
