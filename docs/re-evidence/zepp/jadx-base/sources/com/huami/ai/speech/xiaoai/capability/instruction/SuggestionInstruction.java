package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.entity.template.ListTemplate;
import com.huami.ai.entity.template.ListTemplateItem;
import com.huami.ai.skill.ListTemplateSkill;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Suggestion;
import com.xiaomi.ai.api.common.Instruction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/SuggestionInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/Suggestion$ShowContextSuggestions;", "payload", "", "a", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/skill/ListTemplateSkill;", "Lcom/huami/ai/skill/ListTemplateSkill;", "listTemplateSkill", "<init>", "(Lcom/huami/ai/skill/ListTemplateSkill;)V", "Companion", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class SuggestionInstruction extends InstructionCapability {
    private static final int b = 3;

    @NotNull
    private static final String c = "suggestion";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ListTemplateSkill listTemplateSkill;

    public SuggestionInstruction(@NotNull ListTemplateSkill listTemplateSkill) {
        this.listTemplateSkill = listTemplateSkill;
    }

    private final boolean a(Suggestion.ShowContextSuggestions payload) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = CollectionsKt___CollectionsKt.take(payload.getSuggestions(), 3).iterator();
        while (it2.hasNext()) {
            arrayList.add(new ListTemplateItem("", ((Suggestion.QuerySuggestion) it2.next()).getQuery(), ""));
        }
        return this.listTemplateSkill.renderList(new ListTemplate(c, "", arrayList.size(), arrayList));
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@Nullable Instruction<?> instruction) {
        if (!Intrinsics.areEqual(instruction == null ? null : instruction.getFullName(), AIApiConstants.Suggestion.ShowContextSuggestions)) {
            return false;
        }
        Object payload = instruction.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Suggestion.ShowContextSuggestions");
        a((Suggestion.ShowContextSuggestions) payload);
        return true;
    }
}
