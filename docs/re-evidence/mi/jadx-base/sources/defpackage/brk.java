package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class brk {
    private Map<String, Set<a>> slotResource = new HashMap();
    private Map<String, Set<mjh<String, String>>> tokenToNTokenSlots = new HashMap();
    private Map<b, JsonObject> slotNTokenMetaMap = new HashMap();
    private Set<String> slots = new HashSet();
    private Set<String> dict = new HashSet();
    private Map<String, Set<String>> slotDict = new HashMap();
    private Map<String, List<mjh<String, String>>> slot2TokenNToken = new HashMap();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f4517b;
        public JsonObject c;

        public a(JsonObject jsonObject) {
            this.f4516a = jsonObject.get("token").getAsString();
            this.f4517b = jsonObject.get("norm_token").getAsString();
            if (jsonObject.has("meta")) {
                this.c = jsonObject.get("meta").getAsJsonObject();
            }
        }

        public JsonObject a() {
            return this.c;
        }

        public String b() {
            return this.f4517b;
        }

        public String c() {
            return this.f4516a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f4516a;
            if (str == null ? aVar.f4516a != null : !str.equals(aVar.f4516a)) {
                return false;
            }
            String str2 = this.f4517b;
            if (str2 == null ? aVar.f4517b != null : !str2.equals(aVar.f4517b)) {
                return false;
            }
            JsonObject jsonObject = this.c;
            JsonObject jsonObject2 = aVar.c;
            if (jsonObject != null) {
                return jsonObject.equals(jsonObject2);
            }
            return jsonObject2 == null;
        }

        public int hashCode() {
            String str = this.f4516a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f4517b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            JsonObject jsonObject = this.c;
            return iHashCode2 + (jsonObject != null ? jsonObject.hashCode() : 0);
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f4519b;

        public b(String str, String str2) {
            this.f4518a = str;
            this.f4519b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            String str = this.f4518a;
            if (str == null ? bVar.f4518a != null : !str.equals(bVar.f4518a)) {
                return false;
            }
            String str2 = this.f4519b;
            String str3 = bVar.f4519b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            return str3 == null;
        }

        public int hashCode() {
            String str = this.f4518a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f4519b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public brk(InputStream inputStream) throws Exception {
        loadResources(inputStream);
    }

    private void addDomainResource(JsonObject jsonObject) {
        String asString = jsonObject.get("slot").getAsString();
        if (!this.slotResource.containsKey(asString)) {
            this.slotResource.put(asString, new HashSet());
        }
        a aVar = new a(jsonObject);
        this.slotResource.get(asString).add(aVar);
        this.slots.add(asString);
        this.dict.add(aVar.c());
        this.dict.add(aVar.b());
        if (!this.slotDict.containsKey(asString)) {
            this.slotDict.put(asString, new HashSet());
        }
        this.slotDict.get(asString).add(aVar.c());
        this.slotDict.get(asString).add(aVar.b());
        if (!this.slot2TokenNToken.containsKey(asString)) {
            this.slot2TokenNToken.put(asString, new ArrayList());
        }
        this.slot2TokenNToken.get(asString).add(mjh.e(aVar.c(), aVar.b()));
        String strC = aVar.c();
        if (!this.tokenToNTokenSlots.containsKey(strC)) {
            this.tokenToNTokenSlots.put(strC, new HashSet());
        }
        this.tokenToNTokenSlots.get(strC).add(mjh.e(aVar.b(), asString));
        this.slotNTokenMetaMap.put(new b(asString, aVar.b()), aVar.a());
    }

    public Set<String> getDict() {
        return this.dict;
    }

    public JsonObject getMetaInfo(String str, String str2) {
        b bVar = new b(str, str2);
        return this.slotNTokenMetaMap.containsKey(bVar) ? this.slotNTokenMetaMap.get(bVar) : new JsonObject();
    }

    public Set<mjh<String, String>> getNTokenSlot(String str) {
        return this.tokenToNTokenSlots.containsKey(str) ? this.tokenToNTokenSlots.get(str) : new HashSet();
    }

    public Set<a> getResources(String str) {
        return this.slotResource.containsKey(str) ? this.slotResource.get(str) : new HashSet();
    }

    public Map<String, List<mjh<String, String>>> getSlot2TokenNToken() {
        return this.slot2TokenNToken;
    }

    public Set<String> getSlots() {
        return this.slots;
    }

    public void loadResources(JsonArray jsonArray) throws Exception {
        if (jsonArray == null || jsonArray.isJsonNull()) {
            return;
        }
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
            if (!asJsonObject.has("slot") || !asJsonObject.has("token") || !asJsonObject.has("norm_token")) {
                throw new RuntimeException("resource loaded failed, info:" + asJsonObject);
            }
            addDomainResource(asJsonObject);
        }
    }

    public void setSlot2TokenNToken(Map<String, List<mjh<String, String>>> map) {
        this.slot2TokenNToken = map;
    }

    public Set<String> getDict(String str) {
        return this.slotDict.containsKey(str) ? this.slotDict.get(str) : new HashSet();
    }

    public void loadResources(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                JsonObject asJsonObject = j4b.a().parse(line.trim()).getAsJsonObject();
                if (asJsonObject.has("slot") && asJsonObject.has("token") && asJsonObject.has("norm_token")) {
                    addDomainResource(asJsonObject);
                } else {
                    throw new RuntimeException("resource loaded failed, info:" + asJsonObject);
                }
            } else {
                bufferedReader.close();
                return;
            }
        }
    }

    public brk(String str) throws Exception {
        loadResources(new FileInputStream(new File(str)));
    }

    public brk() {
    }
}
