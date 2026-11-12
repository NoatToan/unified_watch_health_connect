package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.huami.ad.Constants;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.huami.view.basetitle.IdGetter;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import io.netty.util.internal.StringUtil;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Beta
@GwtCompatible
public final class MediaType {
    private static final String g = "charset";
    private static final String l = "application";
    private static final String m = "audio";
    private static final String n = "image";
    private static final String o = "text";
    private static final String p = "video";
    private static final String q = "*";
    private final String a;
    private final String b;
    private final ImmutableListMultimap<String, String> c;

    @LazyInit
    private String d;

    @LazyInit
    private int e;

    @LazyInit
    private Optional<Charset> f;
    private static final ImmutableListMultimap<String, String> h = ImmutableListMultimap.of("charset", Ascii.toLowerCase(Charsets.UTF_8.name()));
    private static final CharMatcher i = CharMatcher.ascii().and(CharMatcher.javaIsoControl().negate()).and(CharMatcher.isNot(StringUtil.SPACE)).and(CharMatcher.noneOf("()<>@,;:\\\"/[]?="));
    private static final CharMatcher j = CharMatcher.ascii().and(CharMatcher.noneOf("\"\\\r"));
    private static final CharMatcher k = CharMatcher.anyOf(" \t\r\n");
    private static final Map<MediaType, MediaType> r = Maps.newHashMap();
    public static final MediaType ANY_TYPE = h("*", "*");
    public static final MediaType ANY_TEXT_TYPE = h("text", "*");
    public static final MediaType ANY_IMAGE_TYPE = h("image", "*");
    public static final MediaType ANY_AUDIO_TYPE = h("audio", "*");
    public static final MediaType ANY_VIDEO_TYPE = h("video", "*");
    public static final MediaType ANY_APPLICATION_TYPE = h("application", "*");
    public static final MediaType CACHE_MANIFEST_UTF_8 = i("text", "cache-manifest");
    public static final MediaType CSS_UTF_8 = i("text", "css");
    public static final MediaType CSV_UTF_8 = i("text", "csv");
    public static final MediaType HTML_UTF_8 = i("text", "html");
    public static final MediaType I_CALENDAR_UTF_8 = i("text", "calendar");
    public static final MediaType PLAIN_TEXT_UTF_8 = i("text", ConstantsKt.PLAIN);
    public static final MediaType TEXT_JAVASCRIPT_UTF_8 = i("text", "javascript");
    public static final MediaType TSV_UTF_8 = i("text", "tab-separated-values");
    public static final MediaType VCARD_UTF_8 = i("text", "vcard");
    public static final MediaType WML_UTF_8 = i("text", "vnd.wap.wml");
    public static final MediaType XML_UTF_8 = i("text", IdGetter.xml);
    public static final MediaType VTT_UTF_8 = i("text", "vtt");
    public static final MediaType BMP = h("image", "bmp");
    public static final MediaType CRW = h("image", "x-canon-crw");
    public static final MediaType GIF = h("image", Constants.GIF_PATH);
    public static final MediaType ICO = h("image", "vnd.microsoft.icon");
    public static final MediaType JPEG = h("image", "jpeg");
    public static final MediaType PNG = h("image", "png");
    public static final MediaType PSD = h("image", "vnd.adobe.photoshop");
    public static final MediaType SVG_UTF_8 = i("image", "svg+xml");
    public static final MediaType TIFF = h("image", "tiff");
    public static final MediaType WEBP = h("image", "webp");
    public static final MediaType MP4_AUDIO = h("audio", TrainingWebConst.Value.VideoFormat.MP4);
    public static final MediaType MPEG_AUDIO = h("audio", "mpeg");
    public static final MediaType OGG_AUDIO = h("audio", "ogg");
    public static final MediaType WEBM_AUDIO = h("audio", "webm");
    public static final MediaType L16_AUDIO = h("audio", "l16");
    public static final MediaType L24_AUDIO = h("audio", "l24");
    public static final MediaType BASIC_AUDIO = h("audio", "basic");
    public static final MediaType AAC_AUDIO = h("audio", "aac");
    public static final MediaType VORBIS_AUDIO = h("audio", "vorbis");
    public static final MediaType WMA_AUDIO = h("audio", "x-ms-wma");
    public static final MediaType WAX_AUDIO = h("audio", "x-ms-wax");
    public static final MediaType VND_REAL_AUDIO = h("audio", "vnd.rn-realaudio");
    public static final MediaType VND_WAVE_AUDIO = h("audio", "vnd.wave");
    public static final MediaType MP4_VIDEO = h("video", TrainingWebConst.Value.VideoFormat.MP4);
    public static final MediaType MPEG_VIDEO = h("video", "mpeg");
    public static final MediaType OGG_VIDEO = h("video", "ogg");
    public static final MediaType QUICKTIME = h("video", "quicktime");
    public static final MediaType WEBM_VIDEO = h("video", "webm");
    public static final MediaType WMV = h("video", "x-ms-wmv");
    public static final MediaType FLV_VIDEO = h("video", "x-flv");
    public static final MediaType THREE_GPP_VIDEO = h("video", "3gpp");
    public static final MediaType THREE_GPP2_VIDEO = h("video", "3gpp2");
    public static final MediaType APPLICATION_XML_UTF_8 = i("application", IdGetter.xml);
    public static final MediaType ATOM_UTF_8 = i("application", "atom+xml");
    public static final MediaType BZIP2 = h("application", "x-bzip2");
    public static final MediaType DART_UTF_8 = i("application", "dart");
    public static final MediaType APPLE_PASSBOOK = h("application", "vnd.apple.pkpass");
    public static final MediaType EOT = h("application", "vnd.ms-fontobject");
    public static final MediaType EPUB = h("application", "epub+zip");
    public static final MediaType FORM_DATA = h("application", "x-www-form-urlencoded");
    public static final MediaType KEY_ARCHIVE = h("application", "pkcs12");
    public static final MediaType APPLICATION_BINARY = h("application", "binary");
    public static final MediaType GZIP = h("application", "x-gzip");
    public static final MediaType HAL_JSON = h("application", "hal+json");
    public static final MediaType JAVASCRIPT_UTF_8 = i("application", "javascript");
    public static final MediaType JSON_UTF_8 = i("application", "json");
    public static final MediaType MANIFEST_JSON_UTF_8 = i("application", "manifest+json");
    public static final MediaType KML = h("application", "vnd.google-earth.kml+xml");
    public static final MediaType KMZ = h("application", "vnd.google-earth.kmz");
    public static final MediaType MBOX = h("application", "mbox");
    public static final MediaType APPLE_MOBILE_CONFIG = h("application", "x-apple-aspen-config");
    public static final MediaType MICROSOFT_EXCEL = h("application", "vnd.ms-excel");
    public static final MediaType MICROSOFT_POWERPOINT = h("application", "vnd.ms-powerpoint");
    public static final MediaType MICROSOFT_WORD = h("application", "msword");
    public static final MediaType WASM_APPLICATION = h("application", "wasm");
    public static final MediaType NACL_APPLICATION = h("application", "x-nacl");
    public static final MediaType NACL_PORTABLE_APPLICATION = h("application", "x-pnacl");
    public static final MediaType OCTET_STREAM = h("application", "octet-stream");
    public static final MediaType OGG_CONTAINER = h("application", "ogg");
    public static final MediaType OOXML_DOCUMENT = h("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final MediaType OOXML_PRESENTATION = h("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final MediaType OOXML_SHEET = h("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final MediaType OPENDOCUMENT_GRAPHICS = h("application", "vnd.oasis.opendocument.graphics");
    public static final MediaType OPENDOCUMENT_PRESENTATION = h("application", "vnd.oasis.opendocument.presentation");
    public static final MediaType OPENDOCUMENT_SPREADSHEET = h("application", "vnd.oasis.opendocument.spreadsheet");
    public static final MediaType OPENDOCUMENT_TEXT = h("application", "vnd.oasis.opendocument.text");
    public static final MediaType PDF = h("application", "pdf");
    public static final MediaType POSTSCRIPT = h("application", "postscript");
    public static final MediaType PROTOBUF = h("application", "protobuf");
    public static final MediaType RDF_XML_UTF_8 = i("application", "rdf+xml");
    public static final MediaType RTF_UTF_8 = i("application", "rtf");
    public static final MediaType SFNT = h("application", "font-sfnt");
    public static final MediaType SHOCKWAVE_FLASH = h("application", "x-shockwave-flash");
    public static final MediaType SKETCHUP = h("application", "vnd.sketchup.skp");
    public static final MediaType SOAP_XML_UTF_8 = i("application", "soap+xml");
    public static final MediaType TAR = h("application", "x-tar");
    public static final MediaType WOFF = h("application", "font-woff");
    public static final MediaType WOFF2 = h("application", "font-woff2");
    public static final MediaType XHTML_UTF_8 = i("application", "xhtml+xml");
    public static final MediaType XRD_UTF_8 = i("application", "xrd+xml");
    public static final MediaType ZIP = h("application", "zip");
    private static final Joiner.MapJoiner s = Joiner.on("; ").withKeyValueSeparator(SearchCriteria.EQ);

    public class a implements Function<Collection<String>, ImmutableMultiset<String>> {
        public a() {
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableMultiset<String> apply(Collection<String> collection) {
            return ImmutableMultiset.copyOf(collection);
        }
    }

    public class b implements Function<String, String> {
        public b() {
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return MediaType.i.matchesAllOf(str) ? str : MediaType.m(str);
        }
    }

    public static final class c {
        public final String a;
        public int b = 0;

        public c(String str) {
            this.a = str;
        }

        public char a(char c) {
            Preconditions.checkState(e());
            Preconditions.checkState(f() == c);
            this.b++;
            return c;
        }

        public char b(CharMatcher charMatcher) {
            Preconditions.checkState(e());
            char cF = f();
            Preconditions.checkState(charMatcher.matches(cF));
            this.b++;
            return cF;
        }

        public String c(CharMatcher charMatcher) {
            int i = this.b;
            String strD = d(charMatcher);
            Preconditions.checkState(this.b != i);
            return strD;
        }

        public String d(CharMatcher charMatcher) {
            Preconditions.checkState(e());
            int i = this.b;
            this.b = charMatcher.negate().indexIn(this.a, i);
            return e() ? this.a.substring(i, this.b) : this.a.substring(i);
        }

        public boolean e() {
            int i = this.b;
            return i >= 0 && i < this.a.length();
        }

        public char f() {
            Preconditions.checkState(e());
            return this.a.charAt(this.b);
        }
    }

    private MediaType(String str, String str2, ImmutableListMultimap<String, String> immutableListMultimap) {
        this.a = str;
        this.b = str2;
        this.c = immutableListMultimap;
    }

    private static MediaType c(MediaType mediaType) {
        r.put(mediaType, mediaType);
        return mediaType;
    }

    public static MediaType create(String str, String str2) {
        MediaType mediaTypeE = e(str, str2, ImmutableListMultimap.of());
        mediaTypeE.f = Optional.absent();
        return mediaTypeE;
    }

    private String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        if (!this.c.isEmpty()) {
            sb.append("; ");
            s.appendTo(sb, Multimaps.transformValues((ListMultimap) this.c, (Function) new b()).entries());
        }
        return sb.toString();
    }

    private static MediaType e(String str, String str2, Multimap<String, String> multimap) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(multimap);
        String strO = o(str);
        String strO2 = o(str2);
        Preconditions.checkArgument(!"*".equals(strO) || "*".equals(strO2), "A wildcard type cannot be used with a non-wildcard subtype");
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        for (Map.Entry<String, String> entry : multimap.entries()) {
            String strO3 = o(entry.getKey());
            builder.put(strO3, n(strO3, entry.getValue()));
        }
        MediaType mediaType = new MediaType(strO, strO2, builder.build());
        return (MediaType) MoreObjects.firstNonNull(r.get(mediaType), mediaType);
    }

    public static MediaType f(String str) {
        return create("application", str);
    }

    public static MediaType g(String str) {
        return create("audio", str);
    }

    private static MediaType h(String str, String str2) {
        MediaType mediaTypeC = c(new MediaType(str, str2, ImmutableListMultimap.of()));
        mediaTypeC.f = Optional.absent();
        return mediaTypeC;
    }

    private static MediaType i(String str, String str2) {
        MediaType mediaTypeC = c(new MediaType(str, str2, h));
        mediaTypeC.f = Optional.of(Charsets.UTF_8);
        return mediaTypeC;
    }

    public static MediaType j(String str) {
        return create("image", str);
    }

    public static MediaType k(String str) {
        return create("text", str);
    }

    public static MediaType l(String str) {
        return create("video", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append('\"');
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        sb.append('\"');
        return sb.toString();
    }

    private static String n(String str, String str2) {
        return "charset".equals(str) ? Ascii.toLowerCase(str2) : str2;
    }

    private static String o(String str) {
        Preconditions.checkArgument(i.matchesAllOf(str));
        return Ascii.toLowerCase(str);
    }

    private Map<String, ImmutableMultiset<String>> p() {
        return Maps.transformValues(this.c.asMap(), new a());
    }

    public static MediaType parse(String str) {
        String strC;
        Preconditions.checkNotNull(str);
        c cVar = new c(str);
        try {
            CharMatcher charMatcher = i;
            String strC2 = cVar.c(charMatcher);
            cVar.a('/');
            String strC3 = cVar.c(charMatcher);
            ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
            while (cVar.e()) {
                CharMatcher charMatcher2 = k;
                cVar.d(charMatcher2);
                cVar.a(';');
                cVar.d(charMatcher2);
                CharMatcher charMatcher3 = i;
                String strC4 = cVar.c(charMatcher3);
                cVar.a(com.alipay.sdk.m.n.a.h);
                if ('\"' == cVar.f()) {
                    cVar.a('\"');
                    StringBuilder sb = new StringBuilder();
                    while ('\"' != cVar.f()) {
                        if ('\\' == cVar.f()) {
                            cVar.a('\\');
                            sb.append(cVar.b(CharMatcher.ascii()));
                        } else {
                            sb.append(cVar.c(j));
                        }
                    }
                    strC = sb.toString();
                    cVar.a('\"');
                } else {
                    strC = cVar.c(charMatcher3);
                }
                builder.put(strC4, strC);
            }
            return e(strC2, strC3, builder.build());
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException("Could not parse '" + str + "'", e);
        }
    }

    public Optional<Charset> charset() {
        Optional<Charset> optionalOf = this.f;
        if (optionalOf == null) {
            Optional<Charset> optionalAbsent = Optional.absent();
            UnmodifiableIterator<String> it2 = this.c.get("charset").iterator();
            String str = null;
            optionalOf = optionalAbsent;
            while (it2.hasNext()) {
                String next = it2.next();
                if (str == null) {
                    optionalOf = Optional.of(Charset.forName(next));
                    str = next;
                } else if (!str.equals(next)) {
                    throw new IllegalStateException("Multiple charset values defined: " + str + ", " + next);
                }
            }
            this.f = optionalOf;
        }
        return optionalOf;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        MediaType mediaType = (MediaType) obj;
        return this.a.equals(mediaType.a) && this.b.equals(mediaType.b) && p().equals(mediaType.p());
    }

    public boolean hasWildcard() {
        return "*".equals(this.a) || "*".equals(this.b);
    }

    public int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Objects.hashCode(this.a, this.b, p());
        this.e = iHashCode;
        return iHashCode;
    }

    public boolean is(MediaType mediaType) {
        return (mediaType.a.equals("*") || mediaType.a.equals(this.a)) && (mediaType.b.equals("*") || mediaType.b.equals(this.b)) && this.c.entries().containsAll(mediaType.c.entries());
    }

    public ImmutableListMultimap<String, String> parameters() {
        return this.c;
    }

    public String subtype() {
        return this.b;
    }

    public String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strD = d();
        this.d = strD;
        return strD;
    }

    public String type() {
        return this.a;
    }

    public MediaType withCharset(Charset charset) {
        Preconditions.checkNotNull(charset);
        MediaType mediaTypeWithParameter = withParameter("charset", charset.name());
        mediaTypeWithParameter.f = Optional.of(charset);
        return mediaTypeWithParameter;
    }

    public MediaType withParameter(String str, String str2) {
        return withParameters(str, ImmutableSet.of(str2));
    }

    public MediaType withParameters(Multimap<String, String> multimap) {
        return e(this.a, this.b, multimap);
    }

    public MediaType withoutParameters() {
        return this.c.isEmpty() ? this : create(this.a, this.b);
    }

    public MediaType withParameters(String str, Iterable<String> iterable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(iterable);
        String strO = o(str);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        UnmodifiableIterator<Map.Entry<String, String>> it2 = this.c.entries().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> next = it2.next();
            String key = next.getKey();
            if (!strO.equals(key)) {
                builder.put(key, next.getValue());
            }
        }
        Iterator<String> it3 = iterable.iterator();
        while (it3.hasNext()) {
            builder.put(strO, n(strO, it3.next()));
        }
        MediaType mediaType = new MediaType(this.a, this.b, builder.build());
        if (!strO.equals("charset")) {
            mediaType.f = this.f;
        }
        return (MediaType) MoreObjects.firstNonNull(r.get(mediaType), mediaType);
    }
}
