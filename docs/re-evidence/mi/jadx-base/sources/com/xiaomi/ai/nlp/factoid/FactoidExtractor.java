package com.xiaomi.ai.nlp.factoid;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.parsers.Parser;
import defpackage.c17;
import defpackage.d17;
import defpackage.dq5;
import defpackage.hl8;
import defpackage.pr5;
import defpackage.q69;
import defpackage.tud;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class FactoidExtractor implements Serializable {
    private pr5 debugTool;
    private List<EntityType> entityTypes;
    private List<List<Parser>> leveledParsers;
    private ExecutorService threadPool;
    private int threadTimeOut = 30;
    private boolean useExternalThreadPool;

    public static List<q69> filterEntity(List<q69> list) {
        if (list.isEmpty()) {
            return list;
        }
        LinkedList linkedList = new LinkedList();
        Collections.sort(list);
        q69 q69Var = list.get(list.size() - 1);
        for (int size = list.size() - 1; size >= 0; size--) {
            if ((list.get(size).b() < q69Var.b() || list.get(size).c() >= q69Var.c()) && (list.get(size).b() <= q69Var.b() || list.get(size).c() > q69Var.c())) {
                q69Var = list.get(size);
                linkedList.addFirst(q69Var);
            }
        }
        return linkedList;
    }

    private void initDebugTool() throws Exception {
        this.debugTool = (pr5) Class.forName(new JsonParser().parse(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("debug.conf.json"))).getAsJsonObject().get("debug_tool").getAsString()).newInstance();
    }

    private void initParsers() throws Exception {
        if (this.entityTypes == null) {
            this.entityTypes = Arrays.asList(EntityType.Number, EntityType.Age, EntityType.Level, EntityType.Rating, EntityType.SeasonEpisode, EntityType.Temperature, EntityType.Fraction, EntityType.Currency, EntityType.MeasureUnit, EntityType.DateTime, EntityType.Festival, EntityType.LunarDate);
        }
        String str = getClass().getPackage().getName() + ".parsers";
        JsonObject asJsonObject = new JsonParser().parse(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("parser.conf.json"))).getAsJsonObject();
        this.leveledParsers = new ArrayList();
        HashMap map = new HashMap();
        Iterator<JsonElement> it = asJsonObject.get("parsers").getAsJsonArray().iterator();
        while (it.hasNext()) {
            JsonObject asJsonObject2 = it.next().getAsJsonObject();
            String asString = asJsonObject2.get("parser").getAsString();
            if (asJsonObject2.has("deps")) {
                map.put(asString, tud.a(asJsonObject2.get("deps").getAsJsonArray()));
            }
        }
        HashSet<String> hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<EntityType> it2 = this.entityTypes.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(it2.next().getParsers());
        }
        while (!hashSet.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            for (String str2 : hashSet) {
                if (map.containsKey(str2)) {
                    hashSet2.addAll((Collection) map.get(str2));
                }
            }
            arrayList.add(hashSet);
            hashSet = hashSet2;
        }
        HashSet hashSet3 = new HashSet();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : (Set) arrayList.get(size)) {
                if (!hashSet3.contains(str3)) {
                    arrayList2.add((Parser) Class.forName(str + "." + str3).newInstance());
                    hashSet3.add(str3);
                }
            }
            this.leveledParsers.add(arrayList2);
        }
    }

    public boolean destroy() throws Exception {
        if (this.useExternalThreadPool) {
            return true;
        }
        if (this.threadPool.isShutdown()) {
            throw new Exception("FactoidExtractor already shutdown, could only shutdown once");
        }
        try {
            this.threadPool.shutdownNow();
            boolean zAwaitTermination = this.threadPool.awaitTermination(this.threadTimeOut, TimeUnit.MILLISECONDS);
            if (!zAwaitTermination) {
                this.threadPool.shutdown();
            }
            return zAwaitTermination;
        } catch (Throwable th) {
            this.threadPool.shutdown();
            throw th;
        }
    }

    public List<q69> extract(String str, dq5 dq5Var) throws ExecutionException, CancellationException, InterruptedException {
        return extract(str, dq5Var, (TimeZone) null, false);
    }

    public List<q69> extractAll(String str, dq5 dq5Var) throws ExecutionException, CancellationException, InterruptedException {
        return extractAll(str, dq5Var, false);
    }

    public List<List<Parser>> getLeveledParsers() {
        return this.leveledParsers;
    }

    public void init() throws Exception {
        init(10);
    }

    public void setExecTimeOut(int i) {
        this.threadTimeOut = i;
    }

    public void init(int i) throws Exception {
        initDebugTool();
        this.threadPool = Executors.newFixedThreadPool(i);
        this.useExternalThreadPool = false;
        initParsers();
    }

    public List<q69> extract(String str, dq5 dq5Var, TimeZone timeZone) throws ExecutionException, CancellationException, InterruptedException {
        return extract(str, dq5Var, timeZone, false);
    }

    public List<q69> extractAll(String str, dq5 dq5Var, boolean z) throws ExecutionException, CancellationException, InterruptedException {
        List<List<Parser>> list = this.leveledParsers;
        if (list != null) {
            return new hl8(str, dq5Var, this.entityTypes, list, this.debugTool, this.threadPool, this.threadTimeOut).c(z);
        }
        throw new RuntimeException("FactoidExtractor is not initialized!");
    }

    public List<q69> extract(String str, String str2, dq5 dq5Var) throws ExecutionException, CancellationException, InterruptedException, ParseException {
        return extract(str, str2, dq5Var, null, false);
    }

    public void init(ExecutorService executorService) throws Exception {
        initDebugTool();
        this.threadPool = executorService;
        this.useExternalThreadPool = true;
        initParsers();
    }

    public List<q69> extract(String str, String str2, dq5 dq5Var, TimeZone timeZone) throws ExecutionException, CancellationException, InterruptedException, ParseException {
        return extract(str, str2, dq5Var, timeZone, false);
    }

    public List<q69> extract(String str) throws ExecutionException, CancellationException, InterruptedException {
        return extract(str, new dq5(), (TimeZone) null, false);
    }

    public List<q69> extract(String str, TimeZone timeZone) throws ExecutionException, CancellationException, InterruptedException {
        return extract(str, new dq5(timeZone), timeZone, false);
    }

    public void init(int i, List<EntityType> list) throws Exception {
        initDebugTool();
        this.threadPool = Executors.newFixedThreadPool(i);
        this.useExternalThreadPool = false;
        this.entityTypes = list;
        initParsers();
    }

    public List<q69> extract(String str, dq5 dq5Var, TimeZone timeZone, boolean z) throws ExecutionException, CancellationException, InterruptedException {
        List<List<Parser>> list = this.leveledParsers;
        if (list != null) {
            return filterEntity(new hl8(str, dq5Var, this.entityTypes, list, this.debugTool, this.threadPool, this.threadTimeOut).c(z));
        }
        throw new RuntimeException("FactoidExtractor is not initialized!");
    }

    public List<q69> extract(String str, String str2) throws ExecutionException, CancellationException, InterruptedException, ParseException {
        return extract(str, str2, new dq5(), null, false);
    }

    public void init(ExecutorService executorService, List<EntityType> list) throws Exception {
        initDebugTool();
        this.threadPool = executorService;
        this.useExternalThreadPool = true;
        this.entityTypes = list;
        initParsers();
    }

    public List<q69> extract(String str, String str2, TimeZone timeZone) throws ExecutionException, CancellationException, InterruptedException, ParseException {
        return extract(str, str2, new dq5(timeZone), timeZone, false);
    }

    public List<q69> extract(String str, String str2, dq5 dq5Var, TimeZone timeZone, boolean z) throws ExecutionException, InterruptedException, CancellationException, ParseException {
        List<q69> listExtract = extract(str, dq5Var, timeZone, z);
        c17 c17VarA = d17.a(str2);
        return c17VarA == null ? listExtract : c17VarA.a(listExtract, dq5Var, timeZone);
    }
}
