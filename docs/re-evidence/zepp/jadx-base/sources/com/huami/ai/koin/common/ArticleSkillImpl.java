package com.huami.ai.koin.common;

import com.huami.ai.skill.ArticleSkill;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.ArticleContent;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/ai/koin/common/ArticleSkillImpl;", "Lcom/huami/ai/skill/ArticleSkill;", "", "title", "subTitle", "content", "", "sendArticle", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class ArticleSkillImpl implements ArticleSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, String str, String str2, String str3) {
            super(0);
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了Article的指令：" + this.a + ",title:" + this.b + ",subTitle:" + this.c + ",content:" + this.d;
        }
    }

    public ArticleSkillImpl(@NotNull HMBaseDevice hMBaseDevice) {
        this.baseDevice = hMBaseDevice;
    }

    @Override // com.huami.ai.skill.ArticleSkill
    public boolean sendArticle(@NotNull String title, @NotNull String subTitle, @NotNull String content) {
        boolean zSendCommand$default = DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new ArticleContent(title, subTitle, content)), null, 2, null);
        HMLog.info("speech", new a(zSendCommand$default, title, subTitle, content));
        return zSendCommand$default;
    }
}
