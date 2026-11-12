package com.xiaomi.ai.android.b;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Nlp;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.api.common.InstructionHeader;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.intent.dialog;
import defpackage.wpe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Nlp.OfflineSession f10867a = new Nlp.OfflineSession();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Nlp.UploadDialogState f10868b;

    public Nlp.UploadDialogState a() {
        return this.f10868b;
    }

    public Nlp.OfflineSession b() {
        return this.f10867a;
    }

    public Context c() {
        if (this.f10867a.getData() == null || this.f10867a.getData().isEmpty()) {
            return null;
        }
        return APIUtils.buildContext(this.f10867a);
    }

    public void a(Event event) {
        Iterator<Context> it = event.getContexts().iterator();
        while (it.hasNext()) {
            if (AIApiConstants.General.RenewSession.equals(it.next().getFullName())) {
                this.f10867a.setData(new ArrayList());
            }
        }
    }

    public void a(String str, List<Instruction<? extends InstructionPayload>> list, dialog.DialogState dialogState, boolean z) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        String str3;
        wpe.h("EngineSession", "updateSession: instructions size=" + list.size() + ", dialogState=" + dialogState + ", dialogStateChanged=" + z);
        Nlp.OfflineSessionItemInfo offlineSessionItemInfo = new Nlp.OfflineSessionItemInfo();
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = false;
        for (Instruction<? extends InstructionPayload> instruction : list) {
            if (AIApiConstants.Nlp.IntentsWithRelation.equals(instruction.getFullName())) {
                offlineSessionItemInfo.setIntention(((Nlp.IntentsWithRelation) instruction.getPayload()).getIntent());
            }
            arrayList.add(instruction);
            InstructionHeader header = instruction.getHeader();
            if (header.getIsOffline() != null && header.getIsOffline().c()) {
                zBooleanValue = header.getIsOffline().b().booleanValue();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (dialogState != null) {
            arrayList2.add(dialogState);
            sb = new StringBuilder();
            str2 = "set dialogState of ";
        } else {
            sb = new StringBuilder();
            str2 = "dialogState is null ";
        }
        sb.append(str2);
        sb.append(str);
        wpe.h("EngineSession", sb.toString());
        if (z) {
            if (zBooleanValue) {
                this.f10868b = null;
                sb2 = new StringBuilder();
                str3 = "clear dialog state for offline result ";
            } else {
                Nlp.UploadDialogState uploadDialogState = new Nlp.UploadDialogState();
                this.f10868b = uploadDialogState;
                uploadDialogState.setLastRequestId(str);
                this.f10868b.setDialogStates(arrayList2);
                sb2 = new StringBuilder();
                str3 = "save dialog state for online result ";
            }
            sb2.append(str3);
            sb2.append(str);
            wpe.h("EngineSession", sb2.toString());
        }
        try {
            offlineSessionItemInfo.setInstructions(APIUtils.writeInstructions(arrayList));
            offlineSessionItemInfo.setTimestamp(System.currentTimeMillis());
            offlineSessionItemInfo.setDialogStates(arrayList2);
            offlineSessionItemInfo.setRequestId(str);
            offlineSessionItemInfo.setSourceType(Nlp.SourceType.OFFLINE_ASR_OFFLINE_NLP);
            offlineSessionItemInfo.setAnswer(JsonNodeFactory.instance.arrayNode());
            List<Nlp.OfflineSessionItemInfo> data = this.f10867a.getData();
            if (data == null) {
                data = new ArrayList<>();
            } else {
                while (data.size() >= 1) {
                    data.remove(0);
                }
            }
            data.add(offlineSessionItemInfo);
            this.f10867a.setData(data);
        } catch (Exception e) {
            wpe.k("EngineSession", wpe.o(e));
        }
    }
}
