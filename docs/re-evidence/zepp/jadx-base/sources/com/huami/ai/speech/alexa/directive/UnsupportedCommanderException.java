package com.huami.ai.speech.alexa.directive;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/ai/speech/alexa/directive/UnsupportedCommanderException;", "", "", "a", "Ljava/lang/String;", "name", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class UnsupportedCommanderException extends Throwable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    public UnsupportedCommanderException(@NotNull String str) {
        this.name = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return "暂不支持 " + this.name + " 指令，请在 AlexaCommandCenter 添加。";
    }
}
