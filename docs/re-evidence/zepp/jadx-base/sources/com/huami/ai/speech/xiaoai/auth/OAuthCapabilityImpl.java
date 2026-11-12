package com.huami.ai.speech.xiaoai.auth;

import com.huami.tools.log.HMLog;
import com.xiaomi.ai.android.capability.AuthCapability;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/auth/OAuthCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/AuthCapability;", "", "authType", "", "needRefresh", "", "onGetToken", "onGetOAuthCode", "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "a", "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "xiaoMiToken", "<init>", "(Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class OAuthCapabilityImpl extends AuthCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final XiaoMiToken xiaoMiToken;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Mi Auth Type:", Integer.valueOf(this.a));
        }
    }

    public OAuthCapabilityImpl(@NotNull XiaoMiToken xiaoMiToken) {
        this.xiaoMiToken = xiaoMiToken;
    }

    @Override // com.xiaomi.ai.android.capability.AuthCapability
    @NotNull
    public String onGetOAuthCode() {
        return this.xiaoMiToken.getAuthCode();
    }

    @Override // com.xiaomi.ai.android.capability.AuthCapability
    @NotNull
    public String onGetToken(int authType, boolean needRefresh) {
        HMLog.info("speech", new a(authType));
        return this.xiaoMiToken.getToken(needRefresh);
    }
}
