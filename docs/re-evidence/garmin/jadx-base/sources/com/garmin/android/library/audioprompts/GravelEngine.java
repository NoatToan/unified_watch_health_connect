package com.garmin.android.library.audioprompts;

import android.content.res.AssetManager;
import d53.u;
import i3.e5;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0010\u001a\u00020\u000f\"\u00020\r¢\u0006\u0004\b\u0011\u0010\u001cJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006#"}, d2 = {"Lcom/garmin/android/library/audioprompts/GravelEngine;", "", "Landroid/content/res/AssetManager;", "assetManager", "Ljava/util/Locale;", "locale", "<init>", "(Landroid/content/res/AssetManager;Ljava/util/Locale;)V", "", "", "build", "(Landroid/content/res/AssetManager;Ljava/lang/String;)J", "gravelEngineHndl", "", "phraseId", "", "slots", "render", "(JI[I)Ljava/lang/String;", "phraseTemplate", "contextJson", "renderJsonPhrase", "(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "destroy", "(J)V", "toGravelLocale", "(Ljava/util/Locale;)Ljava/lang/String;", "(I[I)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "finalize", "()V", "J", "Companion", "a", "ext-lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GravelEngine {
    private static final String GRAVEL_INDONESIAN_LOCALE_CODE = "id-ID";
    private static final String INDONESIAN_LANGUAGE_CODE = "in";
    private final long gravelEngineHndl;

    static {
        System.loadLibrary("AudioPrompts");
    }

    public GravelEngine(AssetManager assetManager, Locale locale) {
        assetManager.getClass();
        locale.getClass();
        this.gravelEngineHndl = build(assetManager, toGravelLocale(locale));
    }

    private final native long build(AssetManager assetManager, String locale);

    private final native void destroy(long gravelEngineHndl);

    private final native String render(long gravelEngineHndl, int phraseId, int[] slots);

    private final native String renderJsonPhrase(long gravelEngineHndl, String phraseTemplate, String contextJson);

    private final String toGravelLocale(Locale locale) {
        return u.q(locale.getLanguage(), INDONESIAN_LANGUAGE_CODE, true) ? GRAVEL_INDONESIAN_LOCALE_CODE : e5.g(locale.getLanguage(), "-", locale.getCountry());
    }

    public final void finalize() {
        destroy(this.gravelEngineHndl);
    }

    public final String render(String phraseTemplate, String contextJson) {
        phraseTemplate.getClass();
        contextJson.getClass();
        return renderJsonPhrase(this.gravelEngineHndl, phraseTemplate, contextJson);
    }

    public final String render(int phraseId, int... slots) {
        slots.getClass();
        return render(this.gravelEngineHndl, phraseId, slots);
    }
}
