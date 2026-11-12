package defpackage;

import com.braintreepayments.api.PaymentMethod;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00060\u0001j\u0002`\u0002:\u000245B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0005\u0010\u000fJ\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0004J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001dH\u0007J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001dH\u0007J\u0016\u0010$\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\bJ\"\u0010$\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180'J\u0016\u0010(\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\bJ\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0*2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u001dJ \u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u001dH\u0007J\b\u0010-\u001a\u00020\bH\u0016J\u0006\u0010.\u001a\u00020\u0004J\b\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010\u0017\u001a\u000203H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00066"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "nativePattern", "Ljava/util/regex/Pattern;", "<init>", "(Ljava/util/regex/Pattern;)V", "pattern", "", "(Ljava/lang/String;)V", TypeParams.QUESTION_CHOOSE_SINGEL, "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", PaymentMethod.OPTIONS_KEY, "", "(Ljava/lang/String;Ljava/util/Set;)V", "getPattern", "()Ljava/lang/String;", "_options", "getOptions", "()Ljava/util/Set;", "matches", "", "input", "", "containsMatchIn", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matchAt", "index", "matchesAt", "replace", "replacement", "transform", "Lkotlin/Function1;", "replaceFirst", "split", "", BleConstants.LIMIT, "splitToSequence", "toString", "toPattern", "writeReplace", "", "readObject", "", "Ljava/io/ObjectInputStream;", "Serialized", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zeu implements Serializable {
    public static final d d = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f54042b;

    public zeu(Pattern pattern) {
        zcp.c(pattern, "");
        this.f54042b = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zeu(String str) {
        zcp.c(str, "");
        Pattern patternCompile = Pattern.compile(str);
        zcp.b((Object) patternCompile, "");
        this(patternCompile);
    }

    public final boolean e(CharSequence charSequence) {
        zcp.c(charSequence, "");
        return this.f54042b.matcher(charSequence).matches();
    }

    public static /* synthetic */ MatchResult b(zeu zeuVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return zeuVar.a(charSequence, i);
    }

    public final MatchResult a(CharSequence charSequence, int i) {
        zcp.c(charSequence, "");
        Matcher matcher = this.f54042b.matcher(charSequence);
        zcp.b((Object) matcher, "");
        return toInt.c(matcher, i, charSequence);
    }

    public final String b(CharSequence charSequence, String str) {
        zcp.c(charSequence, "");
        zcp.c(str, "");
        String strReplaceAll = this.f54042b.matcher(charSequence).replaceAll(str);
        zcp.b((Object) strReplaceAll, "");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f54042b.toString();
        zcp.b((Object) string, "");
        return string;
    }

    private final Object writeReplace() {
        String strPattern = this.f54042b.pattern();
        zcp.b((Object) strPattern, "");
        return new c(strPattern, this.f54042b.flags());
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: loaded from: classes46.dex */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", ParamConstants.Param.FLAGS, "", "<init>", "(Ljava/lang/String;I)V", "getPattern", "()Ljava/lang/String;", "getFlags", "()I", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class c implements Serializable {
        public static final d d = new d(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f54043a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54044c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "<init>", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d {
            private d() {
            }

            public /* synthetic */ d(zcm zcmVar) {
                this();
            }
        }

        public c(String str, int i) {
            zcp.c(str, "");
            this.f54043a = str;
            this.f54044c = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f54043a, this.f54044c);
            zcp.b((Object) patternCompile, "");
            return new zeu(patternCompile);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "<init>", "()V", "fromLiteral", "Lkotlin/text/Regex;", "literal", "", "escape", "escapeReplacement", "ensureUnicodeCase", "", ParamConstants.Param.FLAGS, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }
    }
}
