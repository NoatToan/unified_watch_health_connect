package kotlin.text;

import io.netty.util.internal.StringUtil;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.9")
@ExperimentalStdlibApi
public final class HexFormat {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final HexFormat Default;

    @NotNull
    private static final HexFormat UpperCase;

    @NotNull
    private final BytesHexFormat bytes;

    @NotNull
    private final NumberHexFormat number;
    private final boolean upperCase;

    public static final class Builder {

        @Nullable
        private BytesHexFormat.Builder _bytes;

        @Nullable
        private NumberHexFormat.Builder _number;
        private boolean upperCase = HexFormat.Companion.getDefault().getUpperCase();

        @PublishedApi
        public Builder() {
        }

        @InlineOnly
        private final void bytes(Function1<? super BytesHexFormat.Builder, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke2(getBytes());
        }

        @InlineOnly
        private final void number(Function1<? super NumberHexFormat.Builder, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke2(getNumber());
        }

        @PublishedApi
        @NotNull
        public final HexFormat build() {
            BytesHexFormat default$kotlin_stdlib;
            NumberHexFormat default$kotlin_stdlib2;
            boolean z = this.upperCase;
            BytesHexFormat.Builder builder = this._bytes;
            if (builder == null || (default$kotlin_stdlib = builder.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib = BytesHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            NumberHexFormat.Builder builder2 = this._number;
            if (builder2 == null || (default$kotlin_stdlib2 = builder2.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib2 = NumberHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            return new HexFormat(z, default$kotlin_stdlib, default$kotlin_stdlib2);
        }

        @NotNull
        public final BytesHexFormat.Builder getBytes() {
            if (this._bytes == null) {
                this._bytes = new BytesHexFormat.Builder();
            }
            BytesHexFormat.Builder builder = this._bytes;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        @NotNull
        public final NumberHexFormat.Builder getNumber() {
            if (this._number == null) {
                this._number = new NumberHexFormat.Builder();
            }
            NumberHexFormat.Builder builder = this._number;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        public final boolean getUpperCase() {
            return this.upperCase;
        }

        public final void setUpperCase(boolean z) {
            this.upperCase = z;
        }
    }

    public static final class BytesHexFormat {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final BytesHexFormat Default = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        @NotNull
        private final String bytePrefix;

        @NotNull
        private final String byteSeparator;

        @NotNull
        private final String byteSuffix;
        private final int bytesPerGroup;
        private final int bytesPerLine;

        @NotNull
        private final String groupSeparator;
        private final boolean ignoreCase;
        private final boolean noLineAndGroupSeparator;
        private final boolean shortByteSeparatorNoPrefixAndSuffix;

        public static final class Builder {

            @NotNull
            private String bytePrefix;

            @NotNull
            private String byteSeparator;

            @NotNull
            private String byteSuffix;
            private int bytesPerGroup;
            private int bytesPerLine;

            @NotNull
            private String groupSeparator;

            public Builder() {
                Companion companion = BytesHexFormat.Companion;
                this.bytesPerLine = companion.getDefault$kotlin_stdlib().getBytesPerLine();
                this.bytesPerGroup = companion.getDefault$kotlin_stdlib().getBytesPerGroup();
                this.groupSeparator = companion.getDefault$kotlin_stdlib().getGroupSeparator();
                this.byteSeparator = companion.getDefault$kotlin_stdlib().getByteSeparator();
                this.bytePrefix = companion.getDefault$kotlin_stdlib().getBytePrefix();
                this.byteSuffix = companion.getDefault$kotlin_stdlib().getByteSuffix();
            }

            @NotNull
            public final BytesHexFormat build$kotlin_stdlib() {
                return new BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
            }

            @NotNull
            public final String getBytePrefix() {
                return this.bytePrefix;
            }

            @NotNull
            public final String getByteSeparator() {
                return this.byteSeparator;
            }

            @NotNull
            public final String getByteSuffix() {
                return this.byteSuffix;
            }

            public final int getBytesPerGroup() {
                return this.bytesPerGroup;
            }

            public final int getBytesPerLine() {
                return this.bytesPerLine;
            }

            @NotNull
            public final String getGroupSeparator() {
                return this.groupSeparator;
            }

            public final void setBytePrefix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, StringUtil.CARRIAGE_RETURN, false, 2, (Object) null)) {
                    this.bytePrefix = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
            }

            public final void setByteSeparator(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, StringUtil.CARRIAGE_RETURN, false, 2, (Object) null)) {
                    this.byteSeparator = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
            }

            public final void setByteSuffix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, StringUtil.CARRIAGE_RETURN, false, 2, (Object) null)) {
                    this.byteSuffix = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
            }

            public final void setBytesPerGroup(int i) {
                if (i > 0) {
                    this.bytesPerGroup = i;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i);
            }

            public final void setBytesPerLine(int i) {
                if (i > 0) {
                    this.bytesPerLine = i;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i);
            }

            public final void setGroupSeparator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.groupSeparator = str;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final BytesHexFormat getDefault$kotlin_stdlib() {
                return BytesHexFormat.Default;
            }
        }

        public BytesHexFormat(int i, int i2, @NotNull String groupSeparator, @NotNull String byteSeparator, @NotNull String bytePrefix, @NotNull String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.bytesPerLine = i;
            this.bytesPerGroup = i2;
            this.groupSeparator = groupSeparator;
            this.byteSeparator = byteSeparator;
            this.bytePrefix = bytePrefix;
            this.byteSuffix = byteSuffix;
            this.noLineAndGroupSeparator = i == Integer.MAX_VALUE && i2 == Integer.MAX_VALUE;
            this.shortByteSeparatorNoPrefixAndSuffix = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.ignoreCase = HexFormatKt.isCaseSensitive(groupSeparator) || HexFormatKt.isCaseSensitive(byteSeparator) || HexFormatKt.isCaseSensitive(bytePrefix) || HexFormatKt.isCaseSensitive(byteSuffix);
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.bytesPerLine);
            sb.append(",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.bytesPerGroup);
            sb.append(",");
            sb.append('\n');
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.groupSeparator);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.byteSeparator);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.bytePrefix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.byteSuffix);
            sb.append("\"");
            return sb;
        }

        @NotNull
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        @NotNull
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        @NotNull
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        @NotNull
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
            return this.ignoreCase;
        }

        public final boolean getNoLineAndGroupSeparator$kotlin_stdlib() {
            return this.noLineAndGroupSeparator;
        }

        public final boolean getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() {
            return this.shortByteSeparatorNoPrefixAndSuffix;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append('\n');
            appendOptionsTo$kotlin_stdlib(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HexFormat getDefault() {
            return HexFormat.Default;
        }

        @NotNull
        public final HexFormat getUpperCase() {
            return HexFormat.UpperCase;
        }
    }

    public static final class NumberHexFormat {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final NumberHexFormat Default = new NumberHexFormat("", "", false, 1);
        private final boolean ignoreCase;
        private final boolean isDigitsOnly;
        private final boolean isDigitsOnlyAndNoPadding;
        private final int minLength;

        @NotNull
        private final String prefix;
        private final boolean removeLeadingZeros;

        @NotNull
        private final String suffix;

        @SourceDebugExtension({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormat$NumberHexFormat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,844:1\n1#2:845\n*E\n"})
        public static final class Builder {
            private int minLength;

            @NotNull
            private String prefix;
            private boolean removeLeadingZeros;

            @NotNull
            private String suffix;

            public Builder() {
                Companion companion = NumberHexFormat.Companion;
                this.prefix = companion.getDefault$kotlin_stdlib().getPrefix();
                this.suffix = companion.getDefault$kotlin_stdlib().getSuffix();
                this.removeLeadingZeros = companion.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
                this.minLength = companion.getDefault$kotlin_stdlib().getMinLength();
            }

            @SinceKotlin(version = "2.0")
            public static /* synthetic */ void getMinLength$annotations() {
            }

            @NotNull
            public final NumberHexFormat build$kotlin_stdlib() {
                return new NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros, this.minLength);
            }

            public final int getMinLength() {
                return this.minLength;
            }

            @NotNull
            public final String getPrefix() {
                return this.prefix;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.removeLeadingZeros;
            }

            @NotNull
            public final String getSuffix() {
                return this.suffix;
            }

            public final void setMinLength(int i) {
                if (i > 0) {
                    this.minLength = i;
                    return;
                }
                throw new IllegalArgumentException(("Non-positive values are prohibited for minLength, but was " + i).toString());
            }

            public final void setPrefix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, StringUtil.CARRIAGE_RETURN, false, 2, (Object) null)) {
                    this.prefix = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
            }

            public final void setRemoveLeadingZeros(boolean z) {
                this.removeLeadingZeros = z;
            }

            public final void setSuffix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, StringUtil.CARRIAGE_RETURN, false, 2, (Object) null)) {
                    this.suffix = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final NumberHexFormat getDefault$kotlin_stdlib() {
                return NumberHexFormat.Default;
            }
        }

        public NumberHexFormat(@NotNull String prefix, @NotNull String suffix, boolean z, int i) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
            this.removeLeadingZeros = z;
            this.minLength = i;
            boolean z2 = prefix.length() == 0 && suffix.length() == 0;
            this.isDigitsOnly = z2;
            this.isDigitsOnlyAndNoPadding = z2 && i == 1;
            this.ignoreCase = HexFormatKt.isCaseSensitive(prefix) || HexFormatKt.isCaseSensitive(suffix);
        }

        @SinceKotlin(version = "2.0")
        public static /* synthetic */ void getMinLength$annotations() {
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.prefix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.suffix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.removeLeadingZeros);
            sb.append(',');
            sb.append('\n');
            sb.append(indent);
            sb.append("minLength = ");
            sb.append(this.minLength);
            return sb;
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
            return this.ignoreCase;
        }

        public final int getMinLength() {
            return this.minLength;
        }

        @NotNull
        public final String getPrefix() {
            return this.prefix;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        @NotNull
        public final String getSuffix() {
            return this.suffix;
        }

        public final boolean isDigitsOnly$kotlin_stdlib() {
            return this.isDigitsOnly;
        }

        public final boolean isDigitsOnlyAndNoPadding$kotlin_stdlib() {
            return this.isDigitsOnlyAndNoPadding;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append('\n');
            appendOptionsTo$kotlin_stdlib(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.Companion;
        BytesHexFormat default$kotlin_stdlib = companion.getDefault$kotlin_stdlib();
        NumberHexFormat.Companion companion2 = NumberHexFormat.Companion;
        Default = new HexFormat(false, default$kotlin_stdlib, companion2.getDefault$kotlin_stdlib());
        UpperCase = new HexFormat(true, companion.getDefault$kotlin_stdlib(), companion2.getDefault$kotlin_stdlib());
    }

    public HexFormat(boolean z, @NotNull BytesHexFormat bytes, @NotNull NumberHexFormat number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.upperCase = z;
        this.bytes = bytes;
        this.number = number;
    }

    @NotNull
    public final BytesHexFormat getBytes() {
        return this.bytes;
    }

    @NotNull
    public final NumberHexFormat getNumber() {
        return this.number;
    }

    public final boolean getUpperCase() {
        return this.upperCase;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        sb.append('\n');
        sb.append("    upperCase = ");
        sb.append(this.upperCase);
        sb.append(",");
        sb.append('\n');
        sb.append("    bytes = BytesHexFormat(");
        sb.append('\n');
        this.bytes.appendOptionsTo$kotlin_stdlib(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.number.appendOptionsTo$kotlin_stdlib(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
