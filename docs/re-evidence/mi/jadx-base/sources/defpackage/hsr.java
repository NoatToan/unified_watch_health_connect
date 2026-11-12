package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import com.xiaomi.ai.nlp.tokenizer.dict.SpecialWord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class hsr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LanguageModel f20416b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmr f20415a = new mmr();
    public final rfq c = new rfq();
    public final aiq d = new aiq();
    public final int e = 80;

    public final JsonObject a(uz7 uz7Var, LanguageModel languageModel) {
        xb8 xb8VarI = uz7Var.a().i();
        xb8 xb8VarI2 = uz7Var.d().i();
        String strH = xb8VarI.h();
        String strH2 = xb8VarI2.h();
        JsonObject jsonObject = new JsonObject();
        if (!languageModel.d(strH) && languageModel.d(strH2)) {
            jsonObject.addProperty("score", Float.valueOf(languageModel.f(strH2)));
            jsonObject.addProperty("type", "u-w");
            return jsonObject;
        }
        int i = 1;
        if (!languageModel.d(strH) && !languageModel.d(strH2)) {
            List<String> listD = d(strH2, this.f20415a);
            String str = listD.get(0);
            float f = languageModel.f(str);
            int length = str.length();
            while (i < listD.size() && length < 4) {
                String str2 = listD.get(i - 1);
                String str3 = listD.get(i);
                f += languageModel.a(str3, str2).get("score").getAsFloat();
                length += str3.length();
                i++;
            }
            jsonObject.addProperty("score", Float.valueOf(f));
            jsonObject.addProperty("type", "u-u");
            return jsonObject;
        }
        if (!languageModel.d(strH) || languageModel.d(strH2)) {
            return languageModel.a(strH2, strH);
        }
        float fE = languageModel.e(strH);
        List<String> listD2 = d(strH2, this.f20415a);
        String str4 = listD2.get(0);
        float f2 = fE + languageModel.f(str4);
        int length2 = str4.length();
        while (i < listD2.size() && length2 < 4) {
            String str5 = listD2.get(i - 1);
            String str6 = listD2.get(i);
            f2 += languageModel.a(str6, str5).get("score").getAsFloat();
            length2 += str6.length();
            i++;
        }
        jsonObject.addProperty("score", Float.valueOf(f2));
        jsonObject.addProperty("type", "w-u");
        return jsonObject;
    }

    public final void b(y2e y2eVar, LanguageModel languageModel, e17 e17Var) {
        if (y2eVar.l() == null) {
            return;
        }
        y2eVar.l().A(0.0f);
        for (ovg ovgVar : y2eVar.x()) {
            for (uz7 uz7Var : ovgVar.k()) {
                JsonObject jsonObjectA = a(uz7Var, languageModel);
                float asFloat = jsonObjectA.get("score").getAsFloat();
                String asString = jsonObjectA.get("type").getAsString();
                float fP = uz7Var.a().p() + asFloat;
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("score", Float.valueOf(asFloat));
                jsonObject.addProperty("type", asString);
                uz7Var.e(jsonObject);
                uz7Var.f(asFloat);
                if (uz7Var.d().d() == null || fP > uz7Var.d().p()) {
                    uz7Var.d().u(ovgVar);
                    ovgVar.w(uz7Var.d());
                    uz7Var.d().A(fP);
                }
                if (ovgVar.e() == null) {
                    ovgVar.w(uz7Var.d());
                }
            }
        }
    }

    public boolean c() throws IOException {
        String str = hsr.class.getResource("/full") == null ? "/lite" : "/full";
        if (!this.f20415a.a(hsr.class.getResourceAsStream(str + "/word-dict.dic"), hsr.class.getResourceAsStream(str + "/word-prop.dic"))) {
            return false;
        }
        this.f20416b = new LanguageModel(hsr.class.getResourceAsStream(str + "/ngram-dict.dic"), hsr.class.getResourceAsStream(str + "/ngram-prop.dic"));
        return true;
    }

    public final List<String> d(String str, mmr mmrVar) {
        int iC;
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length(); i += iC) {
            iC = ilo.c(str, i);
            if (iC > 0) {
                strSubstring = str.substring(i, i + iC);
            } else {
                strSubstring = "";
                iC = 0;
            }
            int iB = ilo.b(str, i);
            if (iB > iC) {
                strSubstring = str.substring(i, i + iB);
                iC = iB;
            }
            Iterator<mmr.a> it = mmrVar.b(str, i).iterator();
            while (it.hasNext()) {
                int i2 = it.next().f27013b;
                if (i2 > iC) {
                    strSubstring = str.substring(i, i + i2);
                    iC = i2;
                }
            }
            if (iC <= 0) {
                return new ArrayList(Arrays.asList(SpecialWord.UNK_WORD.getWord()));
            }
            arrayList.add(strSubstring);
        }
        return arrayList;
    }

    public final List<String> e(List<String> list, List<Set<String>> list2) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2 = i) {
            String str = list.get(i2);
            String str2 = list.get(i2);
            int i3 = i2 + 1;
            int length = str.length();
            String str3 = str2;
            String str4 = str;
            i = i3;
            while (i3 < list.size() && length < 80) {
                str4 = str4 + list.get(i3);
                length += list.get(i3).length();
                i3++;
                Iterator<Set<String>> it = list2.iterator();
                while (it.hasNext()) {
                    if (it.next().contains(str4)) {
                        i = i3;
                        str3 = str4;
                    }
                }
            }
            arrayList.add(str3);
        }
        return arrayList;
    }

    public List<String> f(String str) {
        return k(str, this.c.a(), null);
    }

    public List<String> g(String str, List<Set<String>> list) {
        return h(str, list, null);
    }

    public List<String> h(String str, List<Set<String>> list, e17 e17Var) {
        return i(str, list, new y2e(str.length(), false), e17Var);
    }

    public final List<String> i(String str, List<Set<String>> list, y2e y2eVar, e17 e17Var) {
        String strA = ilo.a(str);
        int length = strA.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            int iC = ilo.c(strA, i);
            if (iC != 0) {
                int i2 = iC + i;
                arrayList.add(new xb8(i, i2, SpecialWord.UNK_WORD.getWord(), strA.substring(i, i2)));
            }
            int iB = ilo.b(strA, i);
            if (iB != 0) {
                int i3 = iB + i;
                arrayList.add(new xb8(i, i3, SpecialWord.UNK_WORD.getWord(), strA.substring(i, i3)));
            }
            List<mmr.a> listB = this.f20415a.b(strA, i);
            HashSet hashSet = new HashSet();
            for (mmr.a aVar : listB) {
                String strSubstring = strA.substring(i, aVar.f27013b + i);
                hashSet.add(strSubstring);
                int i4 = aVar.f27012a;
                SpecialWord specialWord = SpecialWord.UNK_WORD;
                arrayList.add(new xb8(i, aVar.f27013b + i, i4 == specialWord.getIndex() ? specialWord.getWord() : strSubstring, strSubstring));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y2eVar.b((xb8) it.next(), false);
        }
        l(y2eVar, this.f20416b, e17Var);
        ArrayList arrayList2 = new ArrayList();
        for (ovg ovgVarL = y2eVar.l(); ovgVarL != null; ovgVarL = ovgVarL.e()) {
            if (ovgVarL != y2eVar.o() && ovgVarL != y2eVar.l()) {
                arrayList2.add(ovgVarL.i().e());
            }
        }
        return e(arrayList2, list);
    }

    public List<String> j(String str, Set<String> set, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(set);
        arrayList.add(this.c.a());
        return g(str, arrayList);
    }

    public List<String> k(String str, Set<String> set, e17 e17Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(set);
        arrayList.add(this.c.a());
        return h(str, arrayList, e17Var);
    }

    public final void l(y2e y2eVar, LanguageModel languageModel, e17 e17Var) {
        b(y2eVar, languageModel, e17Var);
        ovg ovgVarO = y2eVar.o();
        ovgVarO.z(true);
        while (ovgVarO.d() != null) {
            ovg ovgVarD = ovgVarO.d();
            ovgVarD.z(true);
            ovgVarD.w(ovgVarO);
            ovgVarO = ovgVarD;
        }
    }
}
