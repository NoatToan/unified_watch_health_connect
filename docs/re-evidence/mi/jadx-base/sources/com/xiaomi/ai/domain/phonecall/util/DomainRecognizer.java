package com.xiaomi.ai.domain.phonecall.util;

import com.typesafe.config.a;
import defpackage.nb4;
import defpackage.ovg;
import defpackage.t08;
import defpackage.xb8;
import defpackage.y2e;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class DomainRecognizer implements Serializable {
    private static final long serialVersionUID = 2243331232603376288L;
    private String negativeKey;
    private Pattern negativePattern;
    private String positiveKey;
    private Pattern postivePattern;
    private String recongnizerName;

    public DomainRecognizer() {
    }

    private String getPattern(nb4 nb4Var, String str) {
        Iterator<String> it = nb4Var.f(str).iterator();
        String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + it.next() + "|";
        }
        return str2.substring(0, str2.length() - 1);
    }

    private String queryWithNameSlot(y2e y2eVar) {
        StringBuilder sb = new StringBuilder();
        for (ovg ovgVarE = y2eVar.l().e(); ovgVarE.e() != null; ovgVarE = ovgVarE.e()) {
            xb8 xb8VarI = ovgVarE.i();
            if (xb8VarI.f().toLowerCase().equals("name")) {
                sb.append(xb8VarI.h());
            }
        }
        return sb.toString();
    }

    private String queryWithSlots(y2e y2eVar) {
        StringBuilder sb = new StringBuilder();
        for (ovg ovgVarE = y2eVar.l().e(); ovgVarE.e() != null; ovgVarE = ovgVarE.e()) {
            xb8 xb8VarI = ovgVarE.i();
            if (xb8VarI.f().equals("eps")) {
                sb.append(xb8VarI.h());
            } else {
                sb.append("<");
                sb.append(xb8VarI.f());
                sb.append(">");
            }
        }
        return sb.toString();
    }

    public String getNegativeKey() {
        return this.negativeKey;
    }

    public Pattern getNegativePattern() {
        return this.negativePattern;
    }

    public String getPositiveKey() {
        return this.positiveKey;
    }

    public Pattern getPostivePattern() {
        return this.postivePattern;
    }

    public String getRecongnizerName() {
        return this.recongnizerName;
    }

    public boolean hitNegative(y2e y2eVar, String str) {
        return this.negativePattern.matcher(str).find() || this.negativePattern.matcher(queryWithSlots(y2eVar)).find();
    }

    public void init(String str) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(t08.a(str));
            try {
                nb4 nb4VarI = a.i(inputStreamReader);
                this.postivePattern = Pattern.compile(getPattern(nb4VarI, this.positiveKey));
                this.negativePattern = Pattern.compile(getPattern(nb4VarI, this.negativeKey));
                inputStreamReader.close();
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isDomain(y2e y2eVar, String str) {
        String strQueryWithSlots = queryWithSlots(y2eVar);
        return (!this.postivePattern.matcher(strQueryWithSlots).find() || this.negativePattern.matcher(str).find() || this.negativePattern.matcher(strQueryWithSlots).find()) ? false : true;
    }

    public boolean isDomainWithName(y2e y2eVar, String str) {
        Matcher matcher = this.negativePattern.matcher(queryWithNameSlot(y2eVar));
        String strQueryWithSlots = queryWithSlots(y2eVar);
        Matcher matcher2 = this.postivePattern.matcher(strQueryWithSlots);
        Matcher matcher3 = this.negativePattern.matcher(str);
        Matcher matcher4 = this.negativePattern.matcher(strQueryWithSlots);
        boolean zFind = matcher2.find();
        boolean zFind2 = matcher3.find();
        boolean zFind3 = matcher4.find();
        if (matcher.find()) {
            return zFind && !zFind3;
        }
        return (!zFind || zFind2 || zFind3) ? false : true;
    }

    public boolean isValid(String str) {
        return this.postivePattern.matcher(str).find() && !this.negativePattern.matcher(str).find();
    }

    public void setNegativeKey(String str) {
        this.negativeKey = str;
    }

    public void setNegativePattern(Pattern pattern) {
        this.negativePattern = pattern;
    }

    public void setPositiveKey(String str) {
        this.positiveKey = str;
    }

    public void setPostivePattern(Pattern pattern) {
        this.postivePattern = pattern;
    }

    public void setRecongnizerName(String str) {
        this.recongnizerName = str;
    }

    public DomainRecognizer(String str, String str2, String str3, String str4) {
        this.recongnizerName = str;
        this.positiveKey = str3;
        this.negativeKey = str4;
        init(str2);
    }
}
