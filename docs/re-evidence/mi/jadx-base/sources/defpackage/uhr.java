package defpackage;

import android.content.res.XmlResourceParser;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class uhr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, String> f35772b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f35774b;
        public boolean c;

        public a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final uhr f35775a = new uhr();
    }

    public static uhr a() {
        return b.f35775a;
    }

    public final void b() {
        try {
            HashMap map = new HashMap();
            XmlResourceParser xml = ApplicationExtKt.getApplication().getResources().getXml(a6j.f687a);
            xml.next();
            if (xml.getEventType() == 0) {
                String name = xml.getName();
                while (true) {
                    if (name != null && name.equals("Entries")) {
                        break;
                    }
                    xml.next();
                    name = xml.getName();
                }
            }
            xml.require(2, null, "Entries");
            int next = xml.next();
            while (next != 3) {
                if (next != 2) {
                    return;
                }
                String name2 = xml.getName();
                if (!name2.equals(AIApiConstants.Application.NAME)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("parse fail");
                    sb.append(name2);
                    return;
                }
                a aVarC = c(xml);
                if (aVarC.c) {
                    return;
                }
                String str = aVarC.f35773a;
                if (str != null || aVarC.f35774b != null) {
                    map.put(str, aVarC.f35774b);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("appname: ");
                    sb2.append(aVarC.f35773a);
                    sb2.append(" appkey: ");
                    sb2.append(aVarC.f35774b);
                }
                next = xml.next();
            }
            if (next == 3 && xml.getName().equals("Entries") && !map.isEmpty()) {
                this.f35772b = Collections.unmodifiableMap(map);
            }
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception: ");
            sb3.append(e);
        }
    }

    public final a c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        xmlResourceParser.require(2, null, AIApiConstants.Application.NAME);
        a aVar = new a();
        int next = xmlResourceParser.next();
        while (next != 3) {
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("PackageName")) {
                    if (!name.equals("SignatureHash")) {
                        aVar.c = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("parse fail");
                        sb.append(name);
                        break;
                    }
                    next = xmlResourceParser.next();
                    if (next == 4) {
                        aVar.f35774b = xmlResourceParser.getText();
                        next = xmlResourceParser.next();
                    }
                    if (next != 3 || !xmlResourceParser.getName().equals("SignatureHash")) {
                        aVar.c = true;
                        break;
                    }
                    next = xmlResourceParser.next();
                } else {
                    next = xmlResourceParser.next();
                    if (next == 4) {
                        aVar.f35773a = xmlResourceParser.getText();
                        next = xmlResourceParser.next();
                    }
                    if (next != 3 || !xmlResourceParser.getName().equals("PackageName")) {
                        aVar.c = true;
                        break;
                    }
                    next = xmlResourceParser.next();
                }
            } else {
                aVar.c = true;
                break;
            }
        }
        if (next != 3 || !xmlResourceParser.getName().equals(AIApiConstants.Application.NAME)) {
            aVar.c = true;
        }
        return aVar;
    }

    public boolean d(int i) {
        String[] packagesForUid = ApplicationExtKt.getApplication().getPackageManager().getPackagesForUid(i);
        if (this.f35772b == null) {
            return false;
        }
        for (String str : packagesForUid) {
            if (this.f35772b.containsKey(str)) {
                String str2 = this.f35772b.get(str);
                try {
                    String strB = cmq.b(ApplicationExtKt.getApplication(), str);
                    Logger.d("verifyAuthenticity", "sha256 : " + strB);
                    if (str2.equals(strB)) {
                        return true;
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception reading client data!");
                    sb.append(e);
                }
            }
        }
        return false;
    }

    public uhr() {
        this.f35771a = "WhiteListMgr";
        b();
    }
}
