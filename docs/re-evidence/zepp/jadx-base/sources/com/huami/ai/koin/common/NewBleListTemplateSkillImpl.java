package com.huami.ai.koin.common;

import com.huami.ai.entity.template.ListTemplate;
import com.huami.ai.entity.template.ListTemplateItem;
import com.huami.ai.skill.ListTemplateSkill;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.ListContent;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/koin/common/NewBleListTemplateSkillImpl;", "Lcom/huami/ai/skill/ListTemplateSkill;", "Lcom/huami/ai/entity/template/ListTemplate;", "listTemplate", "", "renderList", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class NewBleListTemplateSkillImpl implements ListTemplateSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ ListTemplate b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, ListTemplate listTemplate) {
            super(0);
            this.a = z;
            this.b = listTemplate;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送列表格式数据的指令：" + this.a + ",内容:" + this.b;
        }
    }

    public NewBleListTemplateSkillImpl(@NotNull HMBaseDevice hMBaseDevice) {
        this.baseDevice = hMBaseDevice;
    }

    @Override // com.huami.ai.skill.ListTemplateSkill
    public boolean renderList(@NotNull ListTemplate listTemplate) {
        ArrayList arrayList = new ArrayList();
        for (ListTemplateItem listTemplateItem : listTemplate.getItem()) {
            arrayList.add(new ListContent.Item(listTemplateItem.getName(), listTemplateItem.getValue(), listTemplateItem.getUrl()));
        }
        boolean zSendCommand$default = DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new ListContent(listTemplate.getTitle(), listTemplate.getSubtitle(), arrayList)), null, 2, null);
        HMLog.info("speech", new a(zSendCommand$default, listTemplate));
        return zSendCommand$default;
    }
}
