package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.l;
import o13.m;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.u0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001b\u0010\"\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001b\u0010.\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Lcom/google/firebase/sessions/ProcessDataManager;", "Landroid/content/Context;", "appContext", "Lcom/google/firebase/sessions/UuidGenerator;", "uuidGenerator", "<init>", "(Landroid/content/Context;Lcom/google/firebase/sessions/UuidGenerator;)V", "", "Lcom/google/firebase/sessions/ProcessDetails;", "getAppProcessDetails", "()Ljava/util/List;", "processDetails", "Lcom/google/firebase/sessions/ProcessData;", "processData", "", "isProcessStale", "(Lcom/google/firebase/sessions/ProcessDetails;Lcom/google/firebase/sessions/ProcessData;)Z", "", "", "processDataMap", "isColdStart", "(Ljava/util/Map;)Z", "isMyProcessStale", "", "onSessionGenerated", "()V", "updateProcessDataMap", "(Ljava/util/Map;)Ljava/util/Map;", "Landroid/content/Context;", "myProcessName$delegate", "Lo13/l;", "getMyProcessName", "()Ljava/lang/String;", "myProcessName", "", "myPid", "I", "getMyPid", "()I", "myUuid$delegate", "getMyUuid", "myUuid", "myProcessDetails$delegate", "getMyProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "myProcessDetails", "hasGeneratedSession", "Z", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessDataManagerImpl implements ProcessDataManager {
    private final Context appContext;
    private boolean hasGeneratedSession;
    private final int myPid;

    /* JADX INFO: renamed from: myProcessDetails$delegate, reason: from kotlin metadata */
    private final l myProcessDetails;

    /* JADX INFO: renamed from: myProcessName$delegate, reason: from kotlin metadata */
    private final l myProcessName;

    /* JADX INFO: renamed from: myUuid$delegate, reason: from kotlin metadata */
    private final l myUuid;

    public ProcessDataManagerImpl(Context context, UuidGenerator uuidGenerator) {
        context.getClass();
        uuidGenerator.getClass();
        this.appContext = context;
        final int i14 = 0;
        this.myProcessName = m.b(new e23.a(this) { // from class: com.google.firebase.sessions.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessDataManagerImpl f53844b;

            {
                this.f53844b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ProcessDataManagerImpl.myProcessName_delegate$lambda$0(this.f53844b);
                    default:
                        return ProcessDataManagerImpl.myProcessDetails_delegate$lambda$2(this.f53844b);
                }
            }
        });
        this.myPid = Process.myPid();
        this.myUuid = m.b(new c(uuidGenerator, 2));
        final int i15 = 1;
        this.myProcessDetails = m.b(new e23.a(this) { // from class: com.google.firebase.sessions.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessDataManagerImpl f53844b;

            {
                this.f53844b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ProcessDataManagerImpl.myProcessName_delegate$lambda$0(this.f53844b);
                    default:
                        return ProcessDataManagerImpl.myProcessDetails_delegate$lambda$2(this.f53844b);
                }
            }
        });
    }

    private final List<ProcessDetails> getAppProcessDetails() {
        return ProcessDetailsProvider.INSTANCE.getAppProcessDetails(this.appContext);
    }

    private final ProcessDetails getMyProcessDetails() {
        return (ProcessDetails) this.myProcessDetails.getValue();
    }

    private final boolean isProcessStale(ProcessDetails processDetails, ProcessData processData) {
        if (s.g(getMyProcessName(), processDetails.getProcessName())) {
            return (processDetails.getPid() == processData.getPid() && s.g(getMyUuid(), processData.getUuid())) ? false : true;
        }
        return processDetails.getPid() != processData.getPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessDetails myProcessDetails_delegate$lambda$2(ProcessDataManagerImpl processDataManagerImpl) {
        return ProcessDetailsProvider.INSTANCE.getMyProcessDetails(processDataManagerImpl.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myProcessName_delegate$lambda$0(ProcessDataManagerImpl processDataManagerImpl) {
        return processDataManagerImpl.getMyProcessDetails().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myUuid_delegate$lambda$1(UuidGenerator uuidGenerator) {
        String string = uuidGenerator.next().toString();
        string.getClass();
        return string;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public Map<String, ProcessData> generateProcessDataMap() {
        return ProcessDataManager.DefaultImpls.generateProcessDataMap(this);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public int getMyPid() {
        return this.myPid;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public String getMyProcessName() {
        return (String) this.myProcessName.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public String getMyUuid() {
        return (String) this.myUuid.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isColdStart(Map<String, ProcessData> processDataMap) {
        processDataMap.getClass();
        if (this.hasGeneratedSession) {
            return false;
        }
        List<ProcessDetails> appProcessDetails = getAppProcessDetails();
        ArrayList<p> arrayList = new ArrayList();
        for (ProcessDetails processDetails : appProcessDetails) {
            ProcessData processData = processDataMap.get(processDetails.getProcessName());
            p pVar = processData != null ? new p(processDetails, processData) : null;
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (p pVar2 : arrayList) {
            if (!isProcessStale((ProcessDetails) pVar2.f128594a, (ProcessData) pVar2.f128595b)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isMyProcessStale(Map<String, ProcessData> processDataMap) {
        processDataMap.getClass();
        ProcessData processData = processDataMap.get(getMyProcessName());
        return (processData != null && processData.getPid() == getMyPid() && s.g(processData.getUuid(), getMyUuid())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public void onSessionGenerated() {
        this.hasGeneratedSession = true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public Map<String, ProcessData> updateProcessDataMap(Map<String, ProcessData> processDataMap) {
        if (processDataMap == null) {
            return t0.b(new p(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(processDataMap);
        linkedHashMap.put(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid()));
        return u0.m(linkedHashMap);
    }
}
