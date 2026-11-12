package com.huami.privacy.plugin;

import android.app.Application;
import android.provider.Settings;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/privacy/plugin/AndroidId;", "Lcom/huami/privacy/plugin/PrivacyPlugin;", "", "Landroid/app/Application;", "a", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "isPrivacyAgreed", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Landroid/app/Application;Lkotlin/jvm/functions/Function0;)V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidId implements PrivacyPlugin<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application application;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isPrivacyAgreed;

    public AndroidId(@NotNull Application application, @NotNull Function0<Boolean> function0) {
        this.application = application;
        this.isPrivacyAgreed = function0;
    }

    @Override // com.huami.privacy.plugin.PrivacyPlugin
    @Nullable
    public String getValue() {
        if (this.isPrivacyAgreed.invoke().booleanValue()) {
            return Settings.System.getString(this.application.getContentResolver(), "android_id");
        }
        return null;
    }
}
