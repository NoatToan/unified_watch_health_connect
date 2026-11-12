package org.apache.commons.text.lookup;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BASE64_DECODER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultStringLookup {
    private static final /* synthetic */ DefaultStringLookup[] $VALUES;
    public static final DefaultStringLookup BASE64_DECODER;
    public static final DefaultStringLookup BASE64_ENCODER;
    public static final DefaultStringLookup CONST;
    public static final DefaultStringLookup DATE;
    public static final DefaultStringLookup DNS;
    public static final DefaultStringLookup ENVIRONMENT;
    public static final DefaultStringLookup FILE;
    public static final DefaultStringLookup JAVA;
    public static final DefaultStringLookup LOCAL_HOST;
    public static final DefaultStringLookup PROPERTIES;
    public static final DefaultStringLookup RESOURCE_BUNDLE;
    public static final DefaultStringLookup SCRIPT;
    public static final DefaultStringLookup SYSTEM_PROPERTIES;
    public static final DefaultStringLookup URL;
    public static final DefaultStringLookup URL_DECODER;
    public static final DefaultStringLookup URL_ENCODER;
    public static final DefaultStringLookup XML;
    private final String key;
    private final StringLookup lookup;

    static {
        StringLookupFactory stringLookupFactory = StringLookupFactory.INSTANCE;
        DefaultStringLookup defaultStringLookup = new DefaultStringLookup("BASE64_DECODER", 0, StringLookupFactory.KEY_BASE64_DECODER, stringLookupFactory.base64DecoderStringLookup());
        BASE64_DECODER = defaultStringLookup;
        DefaultStringLookup defaultStringLookup2 = new DefaultStringLookup("BASE64_ENCODER", 1, StringLookupFactory.KEY_BASE64_ENCODER, stringLookupFactory.base64EncoderStringLookup());
        BASE64_ENCODER = defaultStringLookup2;
        DefaultStringLookup defaultStringLookup3 = new DefaultStringLookup("CONST", 2, StringLookupFactory.KEY_CONST, stringLookupFactory.constantStringLookup());
        CONST = defaultStringLookup3;
        DefaultStringLookup defaultStringLookup4 = new DefaultStringLookup("DATE", 3, "date", stringLookupFactory.dateStringLookup());
        DATE = defaultStringLookup4;
        DefaultStringLookup defaultStringLookup5 = new DefaultStringLookup("DNS", 4, StringLookupFactory.KEY_DNS, stringLookupFactory.dnsStringLookup());
        DNS = defaultStringLookup5;
        DefaultStringLookup defaultStringLookup6 = new DefaultStringLookup("ENVIRONMENT", 5, StringLookupFactory.KEY_ENV, stringLookupFactory.environmentVariableStringLookup());
        ENVIRONMENT = defaultStringLookup6;
        DefaultStringLookup defaultStringLookup7 = new DefaultStringLookup("FILE", 6, "file", stringLookupFactory.fileStringLookup());
        FILE = defaultStringLookup7;
        DefaultStringLookup defaultStringLookup8 = new DefaultStringLookup("JAVA", 7, StringLookupFactory.KEY_JAVA, stringLookupFactory.javaPlatformStringLookup());
        JAVA = defaultStringLookup8;
        DefaultStringLookup defaultStringLookup9 = new DefaultStringLookup("LOCAL_HOST", 8, StringLookupFactory.KEY_LOCALHOST, stringLookupFactory.localHostStringLookup());
        LOCAL_HOST = defaultStringLookup9;
        DefaultStringLookup defaultStringLookup10 = new DefaultStringLookup("PROPERTIES", 9, "properties", stringLookupFactory.propertiesStringLookup());
        PROPERTIES = defaultStringLookup10;
        DefaultStringLookup defaultStringLookup11 = new DefaultStringLookup("RESOURCE_BUNDLE", 10, StringLookupFactory.KEY_RESOURCE_BUNDLE, stringLookupFactory.resourceBundleStringLookup());
        RESOURCE_BUNDLE = defaultStringLookup11;
        DefaultStringLookup defaultStringLookup12 = new DefaultStringLookup("SCRIPT", 11, StringLookupFactory.KEY_SCRIPT, stringLookupFactory.scriptStringLookup());
        SCRIPT = defaultStringLookup12;
        DefaultStringLookup defaultStringLookup13 = new DefaultStringLookup("SYSTEM_PROPERTIES", 12, StringLookupFactory.KEY_SYS, stringLookupFactory.systemPropertyStringLookup());
        SYSTEM_PROPERTIES = defaultStringLookup13;
        DefaultStringLookup defaultStringLookup14 = new DefaultStringLookup("URL", 13, "url", stringLookupFactory.urlStringLookup());
        URL = defaultStringLookup14;
        DefaultStringLookup defaultStringLookup15 = new DefaultStringLookup("URL_DECODER", 14, StringLookupFactory.KEY_URL_DECODER, stringLookupFactory.urlDecoderStringLookup());
        URL_DECODER = defaultStringLookup15;
        DefaultStringLookup defaultStringLookup16 = new DefaultStringLookup("URL_ENCODER", 15, StringLookupFactory.KEY_URL_ENCODER, stringLookupFactory.urlEncoderStringLookup());
        URL_ENCODER = defaultStringLookup16;
        DefaultStringLookup defaultStringLookup17 = new DefaultStringLookup("XML", 16, StringLookupFactory.KEY_XML, stringLookupFactory.xmlStringLookup());
        XML = defaultStringLookup17;
        $VALUES = new DefaultStringLookup[]{defaultStringLookup, defaultStringLookup2, defaultStringLookup3, defaultStringLookup4, defaultStringLookup5, defaultStringLookup6, defaultStringLookup7, defaultStringLookup8, defaultStringLookup9, defaultStringLookup10, defaultStringLookup11, defaultStringLookup12, defaultStringLookup13, defaultStringLookup14, defaultStringLookup15, defaultStringLookup16, defaultStringLookup17};
    }

    private DefaultStringLookup(String str, int i14, String str2, StringLookup stringLookup) {
        super(str, i14);
        this.key = str2;
        this.lookup = stringLookup;
    }

    public static DefaultStringLookup valueOf(String str) {
        return (DefaultStringLookup) Enum.valueOf(DefaultStringLookup.class, str);
    }

    public static DefaultStringLookup[] values() {
        return (DefaultStringLookup[]) $VALUES.clone();
    }

    public String getKey() {
        return this.key;
    }

    public StringLookup getStringLookup() {
        return this.lookup;
    }
}
