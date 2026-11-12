package com.xiaomi.ai.api.common;

import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public class InstructionHeader extends MessageHeader<InstructionHeader> {
    private Optional<InstructionDependence> dependence;
    private Optional<String> dialog_id;
    private String id;

    public InstructionHeader() {
    }

    public InstructionHeader(String str, String str2) {
        super(str, str2);
    }

    public Optional<InstructionDependence> getDependence() {
        Optional<InstructionDependence> optional = this.dependence;
        return Optional.ofNullable((optional == null || !optional.isPresent()) ? null : this.dependence.get());
    }

    public Optional<String> getDialogId() {
        Optional<String> optional = this.dialog_id;
        return Optional.ofNullable((optional == null || !optional.isPresent()) ? null : this.dialog_id.get());
    }

    public String getId() {
        return this.id;
    }

    public void setDependence(InstructionDependence instructionDependence) {
        this.dependence = Optional.ofNullable(instructionDependence);
    }

    public InstructionHeader setDialogId(String str) {
        this.dialog_id = Optional.ofNullable(str);
        return this;
    }

    public InstructionHeader setId(String str) {
        this.id = str;
        return this;
    }
}
