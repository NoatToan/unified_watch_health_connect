package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class ScanContent<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> content;

    public ScanContent() {
    }

    public static ScanContent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ScanContent scanContent = new ScanContent();
        scanContent.setContent(IntentUtils.readSlot(zsdVar.w(MiuiCursorConstants.CONTENT), String.class));
        return scanContent;
    }

    public static zsd write(ScanContent scanContent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0(MiuiCursorConstants.CONTENT, IntentUtils.writeSlot(scanContent.content));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getContent() {
        return this.content;
    }

    @Required
    public ScanContent setContent(Slot<String> slot) {
        this.content = slot;
        return this;
    }

    public ScanContent(Slot<String> slot) {
        this.content = slot;
    }
}
