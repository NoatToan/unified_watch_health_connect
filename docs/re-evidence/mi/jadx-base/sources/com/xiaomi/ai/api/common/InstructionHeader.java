package com.xiaomi.ai.api.common;

import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class InstructionHeader extends MessageHeader<InstructionHeader> {
    private Optional<InstructionDependence> dependence;
    private Optional<String> dialog_id;
    private String id;
    private Optional<Boolean> is_offline;
    private Optional<InstructionMultiDependence> multi_dependence;
    private Optional<String> transaction_id;

    public InstructionHeader() {
    }

    public Optional<InstructionDependence> getDependence() {
        Optional<InstructionDependence> optional = this.dependence;
        return Optional.e((optional == null || !optional.c()) ? null : this.dependence.b());
    }

    public Optional<String> getDialogId() {
        Optional<String> optional = this.dialog_id;
        return Optional.e((optional == null || !optional.c()) ? null : this.dialog_id.b());
    }

    public String getId() {
        return this.id;
    }

    public Optional<Boolean> getIsOffline() {
        return this.is_offline;
    }

    public Optional<InstructionMultiDependence> getMultiDependence() {
        Optional<InstructionMultiDependence> optional = this.multi_dependence;
        return Optional.e((optional == null || !optional.c()) ? null : this.multi_dependence.b());
    }

    public Optional<String> getTransactionId() {
        Optional<String> optional = this.transaction_id;
        return Optional.e((optional == null || !optional.c()) ? null : this.transaction_id.b());
    }

    public void setDependence(InstructionDependence instructionDependence) {
        this.dependence = Optional.e(instructionDependence);
    }

    public InstructionHeader setDialogId(String str) {
        this.dialog_id = Optional.e(str);
        return this;
    }

    public InstructionHeader setId(String str) {
        this.id = str;
        return this;
    }

    public InstructionHeader setIsOffline(Boolean bool) {
        this.is_offline = Optional.d(bool);
        return this;
    }

    public void setMultiDependence(InstructionMultiDependence instructionMultiDependence) {
        this.multi_dependence = Optional.e(instructionMultiDependence);
    }

    public InstructionHeader setTransactionId(String str) {
        this.transaction_id = Optional.e(str);
        return this;
    }

    public InstructionHeader(String str, String str2) {
        super(str, str2);
    }
}
