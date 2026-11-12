package com.huami.ai.speech.alexa.uitls;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.skill.CaptionChannel;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/alexa/uitls/WebTvvCaptionChannel;", "Lcom/huami/ai/skill/CaptionChannel;", "", ShareConstants.FEED_CAPTION_PARAM, "a", SOAP.XMLNS, "", GoogleApiAvailabilityLight.a, "c", "b", "", "showCaption", "text", "isFinal", "showQuerySpeechText", "Lcom/huami/ai/skill/CaptionChannel;", "channel", "<init>", "(Lcom/huami/ai/skill/CaptionChannel;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class WebTvvCaptionChannel implements CaptionChannel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CaptionChannel channel;

    public WebTvvCaptionChannel(@NotNull CaptionChannel captionChannel) {
        this.channel = captionChannel;
    }

    private final String a(String caption) {
        StringBuilder sb = new StringBuilder();
        for (String str : StringsKt__StringsKt.lines(caption)) {
            if (b(str)) {
                sb.append('\n');
            } else if (!d(str)) {
                sb.append(str);
            }
        }
        return StringsKt__StringsKt.removePrefix(sb, System.lineSeparator()).toString();
    }

    private final boolean b(String s) {
        return StringsKt__StringsKt.contains$default((CharSequence) s, (CharSequence) "WEBVTT", false, 2, (Object) null);
    }

    private final boolean c(String s) {
        return l.toIntOrNull(s) != null;
    }

    private final boolean d(String s) {
        if (b(s) || StringsKt__StringsKt.contains$default((CharSequence) s, (CharSequence) "-->", false, 2, (Object) null)) {
            return true;
        }
        return (s.length() == 0) || c(s);
    }

    @Override // com.huami.ai.skill.CaptionChannel
    public void showCaption(@NotNull String caption) {
        this.channel.showCaption(a(caption));
    }

    @Override // com.huami.ai.skill.CaptionChannel
    public void showQuerySpeechText(@NotNull String text, boolean isFinal) {
        this.channel.showQuerySpeechText(text, isFinal);
    }
}
