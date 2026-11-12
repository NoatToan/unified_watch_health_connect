package com.xiaomi.ai.domain.mobileapp.util;

import com.xiaomi.ai.api.SpeechSynthesizer;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.api.common.InstructionDependence;
import com.xiaomi.ai.api.common.InstructionHeader;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.common.Optional;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class InstructionUtil {
    public static <T extends InstructionPayload> Instruction<T> appendInstructionWithDepend(List<Instruction> list, T t, T t2) {
        Instruction<T> instructionBuildInstructionWithDepend = buildInstructionWithDepend(t, t2);
        list.add(instructionBuildInstructionWithDepend);
        return instructionBuildInstructionWithDepend;
    }

    public static <T extends InstructionPayload> Pair<Instruction, Instruction> appendSpeakAndToastWithDepend(List<Instruction> list, String str, String str2, String str3, T t) {
        return appendSpeakAndToastWithDepend(list, str, str2, str3, buildInstruction(t));
    }

    public static <T extends InstructionPayload> Instruction<T> buildInstruction(T t, String str) {
        NamespaceName namespaceName = getNamespaceName(t);
        return new Instruction<>(new InstructionHeader(namespaceName.namespace(), namespaceName.name()).setId(str), t);
    }

    public static <T extends InstructionPayload> Instruction<T> buildInstructionWithDepend(T t, Instruction instruction, String str) {
        NamespaceName namespaceName = getNamespaceName(t);
        InstructionHeader id = new InstructionHeader(namespaceName.namespace(), namespaceName.name()).setId(str);
        if (instruction != null) {
            id.setDependence(new InstructionDependence(instruction.getId(), Optional.d("true")));
        }
        return new Instruction<>(id, t);
    }

    private static NamespaceName getNamespaceName(Object obj) {
        NamespaceName namespaceName = (NamespaceName) obj.getClass().getAnnotation(NamespaceName.class);
        if (namespaceName != null) {
            return namespaceName;
        }
        throw new UnsupportedOperationException("Cannot find NamespaceName");
    }

    public static void setDialogForInstructions(List<Instruction> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getHeader().setDialogId(str);
        }
    }

    public static <T extends InstructionPayload> Instruction<T> appendInstructionWithDepend(List<Instruction> list, T t, Instruction instruction) {
        Instruction<T> instructionBuildInstructionWithDepend = buildInstructionWithDepend(t, instruction);
        list.add(instructionBuildInstructionWithDepend);
        return instructionBuildInstructionWithDepend;
    }

    public static <T extends InstructionPayload> Pair<Instruction, Instruction> appendSpeakAndToastWithDepend(List<Instruction> list, String str, String str2, String str3, Instruction instruction) {
        return Pair.of(appendInstructionWithDepend(list, new SpeechSynthesizer.Speak(str), instruction), appendInstructionWithDepend(list, new Template.Toast(str2).setQuery(str3), instruction));
    }

    public static <T extends InstructionPayload> Instruction<T> buildInstruction(T t) {
        return buildInstruction(t, APIUtils.randomRequestId(false));
    }

    public static <T extends InstructionPayload> Instruction<T> appendInstructionWithDepend(List<Instruction> list, T t) {
        return appendInstructionWithDepend(list, t, (Instruction) null);
    }

    public static <T extends InstructionPayload> Instruction<T> buildInstructionWithDepend(T t, Instruction instruction) {
        return buildInstructionWithDepend(t, instruction, APIUtils.randomRequestId(false));
    }

    public static <T extends InstructionPayload> Instruction<T> buildInstructionWithDepend(T t, T t2) {
        return buildInstructionWithDepend(t, buildInstruction(t2));
    }

    public static <T extends InstructionPayload> Pair<Instruction, Instruction> appendSpeakAndToastWithDepend(List<Instruction> list, String str, String str2, String str3) {
        return appendSpeakAndToastWithDepend(list, str, str2, str3, (Instruction) null);
    }
}
