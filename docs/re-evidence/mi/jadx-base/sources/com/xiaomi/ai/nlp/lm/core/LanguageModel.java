package com.xiaomi.ai.nlp.lm.core;

import com.google.gson.JsonObject;
import defpackage.mjh;
import defpackage.t27;
import defpackage.ttg;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class LanguageModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t27 f11093a = new t27();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<ttg> f11094b = new ArrayList();
    public Map<String, List<String>> c = new HashMap();

    public enum SourceType {
        LABEL_SYSTEM,
        THIRD_CORPUS
    }

    public LanguageModel() {
    }

    public JsonObject a(String str, String str2) {
        JsonObject jsonObject = new JsonObject();
        int iA = this.f11093a.a(str2 + " " + str);
        if (iA != -1) {
            jsonObject.addProperty("type", "bigram");
            jsonObject.addProperty("score", this.f11094b.get(iA).c().b());
            return jsonObject;
        }
        int iA2 = this.f11093a.a(str);
        if (iA2 == -1) {
            iA2 = this.f11093a.a("<unk>");
        }
        int iA3 = this.f11093a.a(str2);
        if (iA3 != -1) {
            jsonObject.addProperty("type", "prBow + unigram");
            jsonObject.addProperty("score", Float.valueOf(this.f11094b.get(iA2).c().c().floatValue() + this.f11094b.get(iA3).b()));
            return jsonObject;
        }
        if (iA2 != -1) {
            jsonObject.addProperty("type", "unigram");
            jsonObject.addProperty("score", this.f11094b.get(iA2).c().c());
            return jsonObject;
        }
        jsonObject.addProperty("type", "unigram");
        jsonObject.addProperty("score", Float.valueOf(-40.0f));
        return jsonObject;
    }

    public boolean b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        return this.f11093a.a(sb.toString()) != -1;
    }

    public boolean c(String str, String str2) {
        return b(str, str2);
    }

    public boolean d(String str) {
        return this.f11093a.a(str) != -1;
    }

    public float e(String str) {
        int iA = this.f11093a.a(str);
        if (iA == -1) {
            return 0.0f;
        }
        return this.f11094b.get(iA).b();
    }

    public float f(String str) {
        int iA = this.f11093a.a(str);
        if (iA == -1) {
            iA = this.f11093a.a("<unk>");
        }
        if (iA != -1) {
            return this.f11094b.get(iA).c().c().floatValue();
        }
        return -40.0f;
    }

    public LanguageModel(InputStream inputStream, InputStream inputStream2) throws Throwable {
        this.f11093a.c(inputStream);
        inputStream.close();
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream2, 16384));
        int iAvailable = dataInputStream.available() / 8;
        for (int i = 0; i < iAvailable; i++) {
            float f = dataInputStream.readFloat();
            this.f11094b.add(new ttg("", mjh.e(Float.valueOf(f), Float.valueOf(f)), dataInputStream.readFloat()));
        }
        dataInputStream.close();
        inputStream2.close();
    }
}
