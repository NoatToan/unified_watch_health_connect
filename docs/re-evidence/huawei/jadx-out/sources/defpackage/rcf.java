package defpackage;

import android.text.TextUtils;
import android.util.Xml;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.declaration.xmlparser.DeclarationConstants;
import com.huawei.ui.device.declaration.xmlparser.parser.BaseDeclarationParser;
import health.compact.a.CommonUtil;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes16.dex */
public class rcf extends BaseDeclarationParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private XmlPullParser f47117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rbn f47118c = null;

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.XmlParser
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public rbq parse(InputStream inputStream) throws XmlPullParserException, IOException {
        if (inputStream == null) {
            throw new NullPointerException("parameter 'xmlInputStream' is null.");
        }
        e(inputStream);
        try {
            try {
                rbq rbqVarB = b();
                try {
                    inputStream.close();
                    return rbqVarB;
                } catch (IOException unused) {
                    LogUtil.e("DeclarationParserImpl", "parse: parse xml occurred IOException.");
                    return rbqVarB;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    LogUtil.e("DeclarationParserImpl", "parse: parse xml occurred IOException.");
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e) {
            LogUtil.e("DeclarationParserImpl", "parse: parse xml occurred XmlPullParserException or IOException.");
            throw e;
        }
    }

    private rbq b() throws XmlPullParserException, IOException {
        rbq rbqVar = new rbq();
        int eventType = this.f47117b.getEventType();
        while (eventType != 1) {
            String name = this.f47117b.getName();
            if (eventType == 2) {
                e(rbqVar, name);
            } else {
                LogUtil.a("DeclarationParserImpl", "else case.");
            }
            eventType = this.f47117b.next();
        }
        return rbqVar;
    }

    private void e(rbq rbqVar, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeclarationParserImpl", "name is null or empty.");
            return;
        }
        if ("declaration".equals(str)) {
            rbq declaration = parseDeclaration();
            rbqVar.c(declaration.h());
            rbqVar.d(declaration.g());
            rbqVar.e(declaration.a());
            rbqVar.a(declaration.f());
            rbqVar.a(declaration.n());
            rbqVar.b(declaration.e());
            this.f47118c = rbqVar;
            return;
        }
        if ("title".equals(str)) {
            rbr title = parseTitle();
            rbqVar.a(title);
            this.f47118c = title;
            return;
        }
        if ("content".equals(str)) {
            rbo content = parseContent();
            rbqVar.c(content);
            this.f47118c = content;
            return;
        }
        if ("part".equals(str)) {
            rbx part = parsePart();
            rbqVar.c().a(part);
            this.f47118c = part;
        } else {
            if ("string".equals(str)) {
                parseString(this.f47118c);
                return;
            }
            if ("placeholder".equals(str)) {
                parsePlaceholder(this.f47118c);
            } else if (NetworkService.Constants.CONFIG_SERVICE.equals(str)) {
                parseConfig(this.f47118c);
            } else {
                LogUtil.j("DeclarationParserImpl", "name not contains.");
            }
        }
    }

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.BaseDeclarationParser
    public rbq parseDeclaration() {
        rbq rbqVar = new rbq();
        rbqVar.c(a("product_type"));
        rbqVar.d(a("scope"));
        rbqVar.e(a("feature_id"));
        rbqVar.a(CommonUtil.e(a("index"), 0));
        rbqVar.a(a("xml_version"));
        rbqVar.b(a("content_version"));
        return rbqVar;
    }

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.BaseDeclarationParser
    public rbr parseTitle() {
        rbr rbrVar = new rbr();
        String strA = a("checkbox");
        if (DeclarationConstants.Position.START.name().equalsIgnoreCase(strA)) {
            rbrVar.d(DeclarationConstants.Position.START);
        } else if (DeclarationConstants.Position.END.name().equalsIgnoreCase(strA)) {
            rbrVar.d(DeclarationConstants.Position.END);
        } else {
            rbrVar.d(DeclarationConstants.Position.EMPTY);
        }
        rbrVar.a(Boolean.parseBoolean(a("checked")));
        return rbrVar;
    }

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.BaseDeclarationParser
    public rbo parseContent() {
        rbo rboVar = new rbo();
        rboVar.d(CommonUtil.e(a("part_count"), 0));
        return rboVar;
    }

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.BaseDeclarationParser
    public rbx parsePart() {
        String strA = a("type");
        if (DeclarationConstants.PartType.PARAGRAPH.name().equalsIgnoreCase(strA)) {
            rbw rbwVar = new rbw();
            rbwVar.b(DeclarationConstants.PartType.PARAGRAPH);
            return rbwVar;
        }
        if (DeclarationConstants.PartType.SWITCHFACE.name().equalsIgnoreCase(strA)) {
            rca rcaVar = new rca();
            rcaVar.b(DeclarationConstants.PartType.SWITCHFACE);
            return rcaVar;
        }
        if (DeclarationConstants.PartType.CHECKBOX.name().equalsIgnoreCase(strA)) {
            rby rbyVar = new rby();
            rbyVar.b(DeclarationConstants.PartType.CHECKBOX);
            return rbyVar;
        }
        if (DeclarationConstants.PartType.TOGGLEBUTTON.name().equalsIgnoreCase(strA)) {
            rbz rbzVar = new rbz();
            rbzVar.b(DeclarationConstants.PartType.TOGGLEBUTTON);
            return rbzVar;
        }
        LogUtil.a("DeclarationParserImpl", "not support part type.");
        return null;
    }

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.BaseDeclarationParser
    public void parseString(rbn rbnVar) {
        if (rbnVar instanceof rbr) {
            ((rbr) rbnVar).e(a("value"));
            return;
        }
        if (rbnVar instanceof rbw) {
            String strA = a("value");
            int iE = CommonUtil.e(a("placeholder_count"), 0);
            rbw rbwVar = (rbw) rbnVar;
            rbwVar.d(strA);
            rbwVar.c(iE);
            return;
        }
        if (rbnVar instanceof rca) {
            ((rca) rbnVar).b(a("value"));
        } else {
            if (rbnVar instanceof rby) {
                String strA2 = a("value");
                String strA3 = a("description");
                rby rbyVar = (rby) rbnVar;
                rbyVar.d(strA2);
                rbyVar.e(strA3);
                return;
            }
            LogUtil.a("DeclarationParserImpl", "not support element.");
        }
    }

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.BaseDeclarationParser
    public void parsePlaceholder(rbn rbnVar) {
        rcb rcbVarE;
        DeclarationConstants.PlaceholderType placeholderType;
        String strA = a("value");
        String strA2 = a("type");
        if (DeclarationConstants.PlaceholderType.STR.name().equalsIgnoreCase(strA2)) {
            rcbVarE = new rcb();
            placeholderType = DeclarationConstants.PlaceholderType.STR;
        } else if (DeclarationConstants.PlaceholderType.URL.name().equalsIgnoreCase(strA2)) {
            rcbVarE = c();
            placeholderType = DeclarationConstants.PlaceholderType.URL;
        } else if (DeclarationConstants.PlaceholderType.JSON.name().equalsIgnoreCase(strA2)) {
            rcbVarE = e();
            placeholderType = DeclarationConstants.PlaceholderType.JSON;
        } else {
            LogUtil.a("DeclarationParserImpl", "parsePlaceholder: not support placeholder type");
            rcbVarE = null;
            placeholderType = null;
        }
        if (rcbVarE == null) {
            LogUtil.j("DeclarationParserImpl", "parsePlaceholder: placeholder is null.");
            return;
        }
        rcbVarE.d(strA);
        rcbVarE.d(placeholderType);
        if (rbnVar instanceof rbx) {
            ((rbx) rbnVar).d(rcbVarE);
            LogUtil.a("DeclarationParserImpl", "currentElement instanceof Part: " + strA2 + ", " + strA);
            return;
        }
        LogUtil.a("DeclarationParserImpl", "parsePlaceholder: other type");
    }

    private rcb e() {
        return new rcc(a("json"));
    }

    private rcb c() {
        return new rcd(a("url"), a("flag"), a("branchId"));
    }

    @Override // com.huawei.ui.device.declaration.xmlparser.parser.BaseDeclarationParser
    public void parseConfig(rbn rbnVar) {
        if (rbnVar instanceof rca) {
            ((rca) rbnVar).a(d());
        } else if (rbnVar instanceof rby) {
            ((rby) rbnVar).d(a());
        } else {
            LogUtil.a("DeclarationParserImpl", "parsePlaceholder: not support element");
        }
    }

    private rbv a() {
        DeclarationConstants.Position position;
        rbv rbvVar = new rbv();
        String strA = a("pos");
        String strA2 = a("checked");
        if (DeclarationConstants.Position.START.name().equalsIgnoreCase(strA)) {
            position = DeclarationConstants.Position.START;
        } else if (DeclarationConstants.Position.END.name().equalsIgnoreCase(strA)) {
            position = DeclarationConstants.Position.END;
        } else if (DeclarationConstants.Position.EMPTY.name().equalsIgnoreCase(strA)) {
            position = DeclarationConstants.Position.EMPTY;
        } else {
            position = DeclarationConstants.Position.UNKNOWN;
            LogUtil.a("DeclarationParserImpl", "parsePlaceholder: not support checkbox position");
        }
        rbvVar.c(position);
        rbvVar.e(Boolean.parseBoolean(strA2));
        return rbvVar;
    }

    private rbu d() {
        rbu rbuVar = new rbu();
        String strA = a("state");
        String strA2 = a("action");
        String strA3 = a("description");
        if (DeclarationConstants.SwitchFaceState.Enabled.name().equalsIgnoreCase(strA)) {
            rbuVar.b(DeclarationConstants.SwitchFaceState.Enabled);
        } else if (DeclarationConstants.SwitchFaceState.Disabled.name().equalsIgnoreCase(strA2)) {
            rbuVar.b(DeclarationConstants.SwitchFaceState.Disabled);
        } else {
            LogUtil.a("DeclarationParserImpl", "parsePlaceholder: not support switch face state");
        }
        rbuVar.a(strA2);
        rbuVar.b(strA3);
        return rbuVar;
    }

    private void e(InputStream inputStream) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        this.f47117b = xmlPullParserNewPullParser;
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        this.f47117b.setInput(inputStream, "UTF-8");
    }

    private String a(String str) {
        if (this.f47117b == null || TextUtils.isEmpty(str)) {
            LogUtil.j("DeclarationParserImpl", "getAttributeValueByName: mXmlPullParser is null or specifiedName is invalid.");
            return "";
        }
        int iE = e(this.f47117b, str);
        if (iE == -1) {
            LogUtil.j("DeclarationParserImpl", "getAttributeValueByName: invalid index.");
            return "";
        }
        return this.f47117b.getAttributeValue(iE);
    }

    private int e(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser == null || TextUtils.isEmpty(str)) {
            LogUtil.j("DeclarationParserImpl", "getAttributeNameIndex: mXmlPullParser is null or specifiedName is invalid.");
            return -1;
        }
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (TextUtils.equals(this.f47117b.getAttributeName(i), str)) {
                return i;
            }
        }
        return -1;
    }
}
