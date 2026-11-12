package com.huami.bluetooth.profile.channel.module.voice;

import com.huami.account.UserLegalInfoManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R-\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/LanguageSetting;", "", "", "a", "Ljava/lang/String;", "getLanguage", "()Ljava/lang/String;", UserLegalInfoManager.KEY_LANGUAGE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", "list", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LanguageSetting {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String language;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final ArrayList<String> list;

    public LanguageSetting(@NotNull String str, @Nullable ArrayList<String> arrayList) {
        this.language = str;
        this.list = arrayList;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final ArrayList<String> getList() {
        return this.list;
    }

    public /* synthetic */ LanguageSetting(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : arrayList);
    }
}
