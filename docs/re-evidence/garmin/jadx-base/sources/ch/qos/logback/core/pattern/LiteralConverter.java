package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class LiteralConverter<E> extends Converter<E> {
    String literal;

    public LiteralConverter(String str) {
        this.literal = str;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e4) {
        return this.literal;
    }
}
