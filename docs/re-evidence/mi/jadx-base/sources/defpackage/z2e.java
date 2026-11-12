package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class z2e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ovg f40809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f40810b;
        public double c;

        public a(ovg ovgVar, double d, double d2) {
            this.f40809a = ovgVar;
            this.f40810b = d;
            this.c = d2;
        }

        public ovg a() {
            return this.f40809a;
        }

        public double b() {
            return this.f40810b;
        }

        public double c() {
            return this.c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01a4  */
    public static JsonObject a(y2e y2eVar) {
        JsonArray jsonArray = new JsonArray();
        JsonArray jsonArray2 = new JsonArray();
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet2.add(y2eVar.l());
        ovg ovgVarO = y2eVar.o();
        linkedList.add(new a(y2eVar.l(), 0.0d, 0.5d));
        double d = 0.0d;
        while (true) {
            double d2 = 0.5d;
            if (linkedList.isEmpty()) {
                jsonArray.add(c(new a(ovgVarO, d + 0.5d, 0.5d), true));
                JsonObject jsonObject = new JsonObject();
                jsonObject.add("nodes", jsonArray);
                jsonObject.add("edges", jsonArray2);
                return jsonObject;
            }
            a aVar = (a) linkedList.poll();
            if (!hashSet.contains(aVar.a())) {
                hashSet.add(aVar.a());
                boolean zContains = hashSet2.contains(aVar.a());
                if (aVar.a() != ovgVarO) {
                    jsonArray.add(c(aVar, zContains));
                }
                if (aVar.a().s()) {
                    hashSet2.add(aVar.a().e());
                }
                List<uz7> listK = aVar.a().k();
                double dC = aVar.c();
                double d3 = dC;
                for (uz7 uz7Var : listK) {
                    boolean zContains2 = hashSet2.contains(uz7Var.d()) & hashSet2.contains(uz7Var.a());
                    double dB = aVar.b() + d2;
                    if (uz7Var.d() != ovgVarO && dB > d) {
                        d = dB;
                    }
                    jsonArray2.add(b(uz7Var, zContains2));
                    a aVar2 = new a(uz7Var.d(), dB, d3);
                    double d4 = -1.0d;
                    boolean z = false;
                    for (int i = 0; i < jsonArray.size(); i++) {
                        JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
                        if (asJsonObject.get("x").getAsDouble() == aVar2.b()) {
                            double asDouble = asJsonObject.get("y").getAsDouble();
                            if (d4 < asDouble) {
                                d4 = asDouble;
                            }
                            if (asDouble == aVar2.c()) {
                                z = true;
                            }
                        }
                    }
                    a aVar3 = z ? new a(uz7Var.d(), dB, d4 + 0.5d) : aVar2;
                    if (hashSet.contains(aVar3.a())) {
                        int i2 = 0;
                        while (i2 < jsonArray.size()) {
                            JsonObject asJsonObject2 = jsonArray.get(i2).getAsJsonObject();
                            HashSet hashSet3 = hashSet;
                            if (asJsonObject2.get("id").getAsString().equals(String.valueOf(aVar3.a().l()))) {
                                double dB2 = aVar3.b();
                                if (asJsonObject2.get("x").getAsDouble() <= dB2) {
                                    asJsonObject2.addProperty("x", Double.valueOf(dB2 + 0.5d));
                                    asJsonObject2.addProperty("y", Double.valueOf(Math.max(aVar3.c(), asJsonObject2.get("y").getAsDouble())));
                                    jsonArray.set(i2, asJsonObject2);
                                }
                            }
                            i2++;
                            hashSet2 = hashSet2;
                            hashSet = hashSet3;
                            d = d;
                        }
                    }
                    linkedList.add(aVar3);
                    d3 += 0.5d;
                    d2 = 0.5d;
                    hashSet2 = hashSet2;
                    hashSet = hashSet;
                    d = d;
                }
            }
        }
    }

    public static JsonObject b(uz7 uz7Var, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", uz7Var.f36302b.l() + "|" + uz7Var.c.l());
        String str = uz7Var.a().l() + "";
        String str2 = uz7Var.d().l() + "";
        jsonObject.addProperty("source", str);
        jsonObject.addProperty("target", str2);
        jsonObject.addProperty("cost", Double.valueOf(uz7Var.c()));
        jsonObject.add("label", uz7Var.b());
        jsonObject.addProperty("sp", Boolean.valueOf(z));
        return jsonObject;
    }

    public static JsonObject c(a aVar, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", aVar.a().l() + "");
        xb8 xb8VarI = aVar.a().i();
        String strE = xb8VarI.e();
        if (xb8VarI.f() != null) {
            strE = strE + "/" + xb8VarI.f();
        }
        String str = strE + ": " + String.format("%.3f", Float.valueOf(aVar.a().p()));
        jsonObject.addProperty("ntype", aVar.a().i().c().name());
        jsonObject.addProperty("label", str);
        jsonObject.addProperty("token", xb8VarI.h());
        jsonObject.addProperty("slot_value", xb8VarI.g());
        jsonObject.addProperty("x", Double.valueOf(aVar.b()));
        jsonObject.addProperty("y", Double.valueOf(aVar.c()));
        jsonObject.addProperty("cost", Double.valueOf(aVar.a().n()));
        jsonObject.addProperty("sp", Boolean.valueOf(z));
        if (aVar.a().d() != null) {
            jsonObject.addProperty("bpred", Integer.valueOf(aVar.a().d().l()));
        }
        if (aVar.a().e() != null) {
            jsonObject.addProperty("bsuc", Integer.valueOf(aVar.a().e().l()));
        }
        return jsonObject;
    }
}
