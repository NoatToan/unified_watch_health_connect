package com.huami.ai.speech.xiaoai.interceptor;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.speech.xiaoai.capability.instruction.entity.CombineAnswer;
import com.huami.ai.speech.xiaoai.utils.CheckInstructionKt;
import com.huami.ai.speech.xiaoai.utils.PlayInfoExtKt;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.api.common.InstructionHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00060\u000f0\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\f\u0010\r\u001a\u00020\t*\u00020\fH\u0002J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016R.\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00060\u000f0\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/xiaoai/interceptor/CombineTTSTextInterceptor;", "Lcom/huami/ai/speech/xiaoai/interceptor/InstructionInterceptor;", "", "Lcom/xiaomi/ai/api/common/Instruction;", "", "instruction", "", "c", "b", "", "text", "a", "Lcom/xiaomi/ai/api/Template$DeviceList;", GoogleApiAvailabilityLight.a, "intercept", "Lkotlin/Function1;", "Ljava/util/List;", "interceptorCheckList", "<init>", "(Ljava/util/List;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class CombineTTSTextInterceptor implements InstructionInterceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Function1<Instruction<Object>, Boolean>> interceptorCheckList;

    /* JADX WARN: Multi-variable type inference failed */
    public CombineTTSTextInterceptor(@NotNull List<? extends Function1<? super Instruction<Object>, Boolean>> list) {
        this.interceptorCheckList = list;
    }

    private final Instruction<Object> a(String text) {
        return new Instruction<>(new InstructionHeader(CombineAnswer.NAME_SPACE, CombineAnswer.PAYLOAD_NAME), new CombineAnswer.CombineAnswerPayload(text));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Instruction<Object> b(List<? extends Instruction<Object>> instruction) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        String text;
        Function1<Instruction<Object>, Boolean> checkTemplateToastInstruction = CheckInstructionKt.getCheckTemplateToastInstruction();
        Iterator<T> it2 = instruction.iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((Boolean) checkTemplateToastInstruction.invoke(next)).booleanValue());
        Instruction instruction2 = (Instruction) next;
        Template.Toast toast = (Template.Toast) (instruction2 == null ? null : instruction2.getPayload());
        String str = "";
        if (toast != null && (text = toast.getText()) != null) {
            str = text;
        }
        StringBuilder sb = new StringBuilder(str);
        Function1<Instruction<Object>, Boolean> checkTemplateGeneralInstructionWithTextContent = CheckInstructionKt.getCheckTemplateGeneralInstructionWithTextContent();
        Iterator<T> it3 = instruction.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!((Boolean) checkTemplateGeneralInstructionWithTextContent.invoke(next2)).booleanValue());
        Instruction instruction3 = (Instruction) next2;
        if (instruction3 != null) {
            T payload = instruction3.getPayload();
            Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.General");
            String text2 = ((Template.General) payload).getText();
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(text2);
            return a(sb.toString());
        }
        Function1<Instruction<Object>, Boolean> checkPlayInfoInstruction = CheckInstructionKt.getCheckPlayInfoInstruction();
        Iterator<T> it4 = instruction.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (!((Boolean) checkPlayInfoInstruction.invoke(next3)).booleanValue());
        Instruction instruction4 = (Instruction) next3;
        if (instruction4 != null) {
            T payload2 = instruction4.getPayload();
            Objects.requireNonNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.PlayInfo");
            String text3 = PlayInfoExtKt.parseText((Template.PlayInfo) payload2);
            if (text3.length() > 0) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(text3);
            }
            return a(sb.toString());
        }
        Function1<Instruction<Object>, Boolean> checkTemplateListInstruction = CheckInstructionKt.getCheckTemplateListInstruction();
        for (Object obj2 : instruction) {
            if (((Boolean) checkTemplateListInstruction.invoke(obj2)).booleanValue()) {
                obj = obj2;
                break;
            }
        }
        Instruction instruction5 = (Instruction) obj;
        if (instruction5 == null) {
            return a(sb.toString());
        }
        if (sb.length() > 0) {
            sb.append('\n');
        }
        T payload3 = instruction5.getPayload();
        Objects.requireNonNull(payload3, "null cannot be cast to non-null type com.xiaomi.ai.api.Template.DeviceList");
        sb.append(d((Template.DeviceList) payload3));
        return a(sb.toString());
    }

    private final boolean c(List<? extends Instruction<Object>> instruction) {
        Iterator<T> it2 = instruction.iterator();
        while (it2.hasNext()) {
            Instruction instruction2 = (Instruction) it2.next();
            Iterator<T> it3 = this.interceptorCheckList.iterator();
            while (it3.hasNext()) {
                if (((Boolean) ((Function1) it3.next()).invoke(instruction2)).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final String d(Template.DeviceList deviceList) {
        List<Template.DeviceItem> items = deviceList.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Template.DeviceItem deviceItem = (Template.DeviceItem) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append('.');
            sb.append((Object) deviceItem.getTitle().getMainTitle());
            String string = sb.toString();
            String subTitle = deviceItem.getTitle().getSubTitle();
            if (!(subTitle == null || subTitle.length() == 0)) {
                string = string + '\n' + ((Object) deviceItem.getTitle().getSubTitle());
            }
            arrayList.add(string);
            i = i2;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = ((String) next) + '\n' + ((String) it2.next());
        }
        return (String) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.xiaoai.interceptor.InstructionInterceptor
    @NotNull
    public List<Instruction<Object>> intercept(@NotNull List<? extends Instruction<Object>> instruction) {
        Function1<Instruction<Object>, Boolean> checkTemplateToastInstruction = CheckInstructionKt.getCheckTemplateToastInstruction();
        ArrayList arrayList = new ArrayList();
        for (Object obj : instruction) {
            if (!((Boolean) checkTemplateToastInstruction.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Function1<Instruction<Object>, Boolean> checkTemplateGeneralInstructionWithTextContent = CheckInstructionKt.getCheckTemplateGeneralInstructionWithTextContent();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((Boolean) checkTemplateGeneralInstructionWithTextContent.invoke(obj2)).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        Function1<Instruction<Object>, Boolean> checkPlayInfoInstruction = CheckInstructionKt.getCheckPlayInfoInstruction();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!((Boolean) checkPlayInfoInstruction.invoke(obj3)).booleanValue()) {
                arrayList3.add(obj3);
            }
        }
        List<Instruction<Object>> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        if (mutableList.size() == instruction.size()) {
            return instruction;
        }
        if (c(instruction)) {
            mutableList.add(0, b(instruction));
        }
        return mutableList;
    }
}
