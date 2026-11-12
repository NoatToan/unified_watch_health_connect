package com.huami.ai.unsupport.check;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\t\"%\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "", "", "a", "Lkotlin/jvm/functions/Function1;", "getCheckJapanese", "()Lkotlin/jvm/functions/Function1;", "checkJapanese", "b", "getCheckKorean", "checkKorean", "speech-skill_release"}, k = 2, mv = {1, 5, 1})
public final class LanguageCheckFuncKt {

    @NotNull
    private static final Function1<Integer, Boolean> a = a.a;

    @NotNull
    private static final Function1<Integer, Boolean> b = b.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "codePoint", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final boolean a(int i) {
            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(i);
            if (unicodeBlockOf == null) {
                return false;
            }
            return Intrinsics.areEqual(Character.UnicodeBlock.HIRAGANA, unicodeBlockOf) || Intrinsics.areEqual(Character.UnicodeBlock.KATAKANA, unicodeBlockOf) || Intrinsics.areEqual(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS, unicodeBlockOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(a(num.intValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "codePoint", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final boolean a(int i) {
            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(i);
            if (unicodeBlockOf == null) {
                return false;
            }
            return Intrinsics.areEqual(Character.UnicodeBlock.HANGUL_JAMO, unicodeBlockOf) || Intrinsics.areEqual(Character.UnicodeBlock.HANGUL_JAMO_EXTENDED_A, unicodeBlockOf) || Intrinsics.areEqual(Character.UnicodeBlock.HANGUL_JAMO_EXTENDED_B, unicodeBlockOf) || Intrinsics.areEqual(Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO, unicodeBlockOf) || Intrinsics.areEqual(Character.UnicodeBlock.HANGUL_SYLLABLES, unicodeBlockOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(a(num.intValue()));
        }
    }

    @NotNull
    public static final Function1<Integer, Boolean> getCheckJapanese() {
        return a;
    }

    @NotNull
    public static final Function1<Integer, Boolean> getCheckKorean() {
        return b;
    }
}
