package defpackage;

import cn.hutool.core.collection.CollUtil;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class jcj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Character> f22648a = CollUtil.q(Character.valueOf(Typography.dollar), '(', ')', '*', '+', '.', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '?', Character.valueOf(AbstractJsonLexerKt.STRING_ESC), '^', Character.valueOf(AbstractJsonLexerKt.BEGIN_OBJ), Character.valueOf(AbstractJsonLexerKt.END_OBJ), '|');

    public static boolean a(Pattern pattern, CharSequence charSequence) {
        if (charSequence == null || pattern == null) {
            return false;
        }
        return pattern.matcher(charSequence).matches();
    }
}
