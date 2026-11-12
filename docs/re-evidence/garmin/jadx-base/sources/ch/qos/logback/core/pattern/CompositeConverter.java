package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CompositeConverter<E> extends DynamicConverter<E> {
    Converter<E> childConverter;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e4) {
        StringBuilder sb3 = new StringBuilder();
        for (Converter<E> converter = this.childConverter; converter != null; converter = converter.next) {
            converter.write(sb3, e4);
        }
        return transform(e4, sb3.toString());
    }

    public Converter<E> getChildConverter() {
        return this.childConverter;
    }

    public void setChildConverter(Converter<E> converter) {
        this.childConverter = converter;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("CompositeConverter<");
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo != null) {
            sb3.append(formatInfo);
        }
        if (this.childConverter != null) {
            sb3.append(", children: ");
            sb3.append(this.childConverter);
        }
        sb3.append(">");
        return sb3.toString();
    }

    public abstract String transform(E e4, String str);
}
