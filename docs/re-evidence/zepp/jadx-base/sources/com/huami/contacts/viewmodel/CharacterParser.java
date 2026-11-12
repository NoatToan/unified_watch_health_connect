package com.huami.contacts.viewmodel;

import com.github.promeg.pinyinhelper.Pinyin;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/contacts/viewmodel/CharacterParser;", "", "", "target", "", "parseToPinyin", "<init>", "()V", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class CharacterParser {

    @NotNull
    public static final CharacterParser INSTANCE = new CharacterParser();

    private CharacterParser() {
    }

    @NotNull
    public final String parseToPinyin(@NotNull CharSequence target) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            String pinyin = Pinyin.toPinyin(target.charAt(i));
            Locale locale = Locale.getDefault();
            Objects.requireNonNull(pinyin, "null cannot be cast to non-null type java.lang.String");
            sb.append(pinyin.toUpperCase(locale));
        }
        return sb.toString();
    }
}
