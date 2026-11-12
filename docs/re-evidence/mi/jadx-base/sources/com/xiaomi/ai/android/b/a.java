package com.xiaomi.ai.android.b;

import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.General;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.Event;
import defpackage.wpe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Context<ContextPayload>> f10861a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10862b;

    public a(boolean z) {
        this.f10862b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<Context<ContextPayload>> b(Event event) {
        if (!AIApiConstants.General.UpdateGlobalContexts.equals(event.getFullName())) {
            return a();
        }
        General.UpdateGlobalContexts updateGlobalContexts = (General.UpdateGlobalContexts) event.getPayload();
        if (updateGlobalContexts.getDeleteItems().c()) {
            for (General.ContextDeleteItem contextDeleteItem : updateGlobalContexts.getDeleteItems().b()) {
                this.f10861a.remove(contextDeleteItem.getNamespace() + "." + contextDeleteItem.getName());
            }
        }
        if (updateGlobalContexts.getCreateOrUpdateItems().c()) {
            for (Context<Object> context : updateGlobalContexts.getCreateOrUpdateItems().b()) {
                this.f10861a.put(context.getFullName(), (Context<ContextPayload>) context);
            }
        }
        return a();
    }

    private List<Context<ContextPayload>> c(Event<?> event) {
        String fullName = event.getFullName();
        if (AIApiConstants.SpeechRecognizer.Recognize.equals(fullName) || AIApiConstants.SpeechRecognizer.DuplexRecognizeStarted.equals(fullName)) {
            this.f10861a.clear();
            for (Context<ContextPayload> context : event.getContexts()) {
                this.f10861a.put(context.getFullName(), context);
            }
            return a();
        }
        if (!AIApiConstants.General.ContextUpdate.equals(fullName)) {
            return a();
        }
        General.ContextUpdate contextUpdate = (General.ContextUpdate) event.getPayload();
        if (!contextUpdate.isEnableIncrementalUpdate().c() || !Boolean.TRUE.equals(contextUpdate.isEnableIncrementalUpdate().b())) {
            this.f10861a.clear();
        } else if (contextUpdate.getDeleteItems().c()) {
            for (General.ContextDeleteItem contextDeleteItem : contextUpdate.getDeleteItems().b()) {
                this.f10861a.remove(contextDeleteItem.getNamespace() + "." + contextDeleteItem.getName());
            }
        }
        for (Context<ContextPayload> context2 : event.getContexts()) {
            this.f10861a.put(context2.getFullName(), context2);
        }
        return a();
    }

    public synchronized List<Context<ContextPayload>> a() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<Map.Entry<String, Context<ContextPayload>>> it = this.f10861a.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            wpe.b("EngineContext", "get context list size: " + arrayList.size() + " global: " + this.f10862b);
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized List<Context<ContextPayload>> a(a aVar) {
        if (aVar.f10862b == this.f10862b) {
            wpe.e("EngineContext", "mergeContext: only support global and temp context merge");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Context<ContextPayload>> entry : this.f10861a.entrySet()) {
            if (!aVar.f10861a.containsKey(entry.getKey()) || aVar.f10862b) {
                arrayList.add(entry.getValue());
            }
        }
        for (Map.Entry<String, Context<ContextPayload>> entry2 : aVar.f10861a.entrySet()) {
            if (!this.f10861a.containsKey(entry2.getKey()) || this.f10862b) {
                arrayList.add(entry2.getValue());
            }
        }
        return arrayList;
    }

    public synchronized List<Context<ContextPayload>> a(Event<?> event) {
        if (this.f10862b) {
            return b(event);
        }
        return c(event);
    }
}
