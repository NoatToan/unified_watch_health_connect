package com.xiaomi.ai.api.common;

import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Instruction<T> extends Message<InstructionHeader, T> {
    public Instruction() {
    }

    private void setDependenceImpl(List<Instruction> list, String str) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("dependence instruction list is empty.");
        }
        for (Instruction instruction : list) {
            instruction.setDependence(new InstructionDependence(getId(), Optional.d(str)));
            if (getDialogId() != null && getDialogId().c()) {
                instruction.setDialogId(getDialogId().b());
            }
        }
    }

    public boolean checkDependence(String str, String str2) {
        if (str2 == null) {
            str2 = "true";
        }
        Optional<InstructionDependence> dependence = getHeader().getDependence();
        if (!dependence.c()) {
            return false;
        }
        InstructionDependence instructionDependenceB = dependence.b();
        return instructionDependenceB.getId().equals(str) && (instructionDependenceB.getPredicate().c() ? instructionDependenceB.getPredicate().b() : "true").equals(str2);
    }

    public Optional<String> getDependenceId() {
        Optional<InstructionDependence> dependence = getHeader().getDependence();
        return (dependence == null || !dependence.c()) ? Optional.a() : Optional.e(getHeader().getDependence().b().getId());
    }

    public Optional<String> getDependencePredicate() {
        Optional<InstructionDependence> dependence = getHeader().getDependence();
        if (dependence == null || !dependence.c()) {
            return Optional.a();
        }
        Optional<String> predicate = getHeader().getDependence().b().getPredicate();
        return predicate == null ? Optional.a() : predicate;
    }

    public Optional<String> getDialogId() {
        return getHeader().getDialogId();
    }

    public String getId() {
        return getHeader().getId();
    }

    public Optional<InstructionMultiDependence> getInstructionMultiDependence() {
        return getHeader().getMultiDependence();
    }

    public Instruction<T> setDependence(InstructionDependence instructionDependence) {
        getHeader().setDependence(instructionDependence);
        return this;
    }

    public void setDependenceFailure(List<Instruction> list) {
        setDependenceImpl(list, "false");
    }

    public void setDependenceSuccess(List<Instruction> list) {
        setDependenceImpl(list, "true");
    }

    public Instruction<T> setDialogId(String str) {
        getHeader().setDialogId(str);
        return this;
    }

    public Instruction<T> setMultiDependence(InstructionMultiDependence instructionMultiDependence) {
        getHeader().setMultiDependence(instructionMultiDependence);
        return this;
    }

    public Instruction(InstructionHeader instructionHeader, T t) {
        super(instructionHeader, t);
    }
}
