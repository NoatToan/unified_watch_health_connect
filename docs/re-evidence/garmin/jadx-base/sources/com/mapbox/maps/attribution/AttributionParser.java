package com.mapbox.maps.attribution;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.R;
import com.mapbox.maps.plugin.attribution.Attribution;
import d53.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 -2\u00020\u0001:\u0002-.B[\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0007J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010 \u001a\u00020\u0015H\u0004J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\u0016\u0010'\u001a\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0002J\u0018\u0010)\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionParser;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "attributionData", "", "withImproveMap", "", "withCopyrightSign", "withTelemetryAttribution", "withMapboxAttribution", "withMapboxPrivacyPolicy", "withMapboxGeofencingConsent", "extraAttributions", "", "Lcom/mapbox/maps/plugin/attribution/Attribution;", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;ZZZZZZLjava/util/List;)V", "attributions", "", "addAdditionalAttributions", "", "createAttributionString", "shortenedOutput", "getAttributions", "", "isImproveThisMapAnchor", "anchor", "isUrlValid", "url", "isValidForImproveThisMap", "isValidForMapbox", "parse", "parseAnchorValue", "htmlBuilder", "Landroid/text/SpannableStringBuilder;", "urlSpan", "Landroid/text/style/URLSpan;", "parseAttributions", "parseStringLiteralToAttributions", "stringLiteralList", "parseUrlSpan", "stripCopyright", "anchorString", "translateImproveThisMapAnchor", "Companion", "Options", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class AttributionParser {
    private static final String COPYRIGHT = "© ";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EMPTY_STRING = "";
    private static final List<String> IMPROVE_MAP_URLS;
    private static final String IMPROVE_THIS_MAP = "Improve this map";
    private final String attributionData;
    private final Set<Attribution> attributions;
    private final WeakReference<Context> context;
    private final List<Attribution> extraAttributions;
    private final boolean withCopyrightSign;
    private final boolean withImproveMap;
    private final boolean withMapboxAttribution;
    private final boolean withMapboxGeofencingConsent;
    private final boolean withMapboxPrivacyPolicy;
    private final boolean withTelemetryAttribution;

    static {
        ArrayList arrayList = new ArrayList();
        IMPROVE_MAP_URLS = arrayList;
        arrayList.add("https://www.mapbox.com/feedback/");
        arrayList.add("https://www.mapbox.com/map-feedback/");
        arrayList.add("https://apps.mapbox.com/feedback/");
    }

    public AttributionParser(WeakReference<Context> weakReference, String str, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, List<Attribution> list) {
        weakReference.getClass();
        str.getClass();
        list.getClass();
        this.context = weakReference;
        this.attributionData = str;
        this.withImproveMap = z14;
        this.withCopyrightSign = z15;
        this.withTelemetryAttribution = z16;
        this.withMapboxAttribution = z17;
        this.withMapboxPrivacyPolicy = z18;
        this.withMapboxGeofencingConsent = z19;
        this.extraAttributions = list;
        this.attributions = new LinkedHashSet();
    }

    private final void addAdditionalAttributions() {
        String string;
        String string2;
        String string3;
        Context context = this.context.get();
        if (this.withTelemetryAttribution) {
            Set<Attribution> set = this.attributions;
            if (context == null || (string3 = context.getString(R.string.mapbox_telemetrySettings)) == null) {
                string3 = Attribution.TELEMETRY_SETTINGS;
            }
            set.add(new Attribution(string3, Attribution.ABOUT_TELEMETRY_URL));
        }
        if (this.withMapboxGeofencingConsent) {
            Set<Attribution> set2 = this.attributions;
            if (context == null || (string2 = context.getString(R.string.mapbox_geofencing_consent)) == null) {
                string2 = Attribution.GEOFENCING;
            }
            set2.add(new Attribution(string2, Attribution.GEOFENCING_URL_MARKER));
        }
        if (this.withMapboxPrivacyPolicy) {
            Set<Attribution> set3 = this.attributions;
            if (context == null || (string = context.getString(R.string.mapbox_privacy_policy)) == null) {
                string = Attribution.PRIVACY_POLICY;
            }
            set3.add(new Attribution(string, Attribution.PRIVACY_POLICY_URL));
        }
        this.attributions.addAll(this.extraAttributions);
    }

    public static /* synthetic */ String createAttributionString$default(AttributionParser attributionParser, boolean z14, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: createAttributionString");
            return null;
        }
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        return attributionParser.createAttributionString(z14);
    }

    private final boolean isImproveThisMapAnchor(String anchor) {
        return s.g(anchor, IMPROVE_THIS_MAP);
    }

    private final boolean isUrlValid(String url) {
        return isValidForImproveThisMap(url) && isValidForMapbox(url);
    }

    private final boolean isValidForImproveThisMap(String url) {
        return this.withImproveMap || !IMPROVE_MAP_URLS.contains(url);
    }

    private final boolean isValidForMapbox(String url) {
        return this.withMapboxAttribution || !s.g(url, Attribution.ABOUT_MAPS_URL);
    }

    private final String parseAnchorValue(SpannableStringBuilder htmlBuilder, URLSpan urlSpan) {
        int spanStart = htmlBuilder.getSpanStart(urlSpan);
        int spanEnd = htmlBuilder.getSpanEnd(urlSpan);
        char[] cArr = new char[spanEnd - spanStart];
        htmlBuilder.getChars(spanStart, spanEnd, cArr, 0);
        return stripCopyright(new String(cArr));
    }

    private final void parseAttributions() {
        Spanned spannedFromHtml = INSTANCE.fromHtml(this.attributionData);
        spannedFromHtml.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannedFromHtml;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            uRLSpan.getClass();
            parseUrlSpan(spannableStringBuilder, uRLSpan);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseStringLiteralToAttributions(List<String> stringLiteralList) {
        Iterator<String> it = stringLiteralList.iterator();
        while (it.hasNext()) {
            String string = INSTANCE.fromHtml(it.next()).toString();
            if (!this.withCopyrightSign) {
                string = stripCopyright(string);
            }
            this.attributions.add(new Attribution(string, ""));
        }
    }

    private final void parseUrlSpan(SpannableStringBuilder htmlBuilder, URLSpan urlSpan) {
        String url = urlSpan.getURL();
        url.getClass();
        if (isUrlValid(url)) {
            String anchorValue = parseAnchorValue(htmlBuilder, urlSpan);
            if (isImproveThisMapAnchor(anchorValue)) {
                if (!this.withImproveMap) {
                    return;
                } else {
                    anchorValue = translateImproveThisMapAnchor(anchorValue);
                }
            }
            this.attributions.add(new Attribution(anchorValue, url));
        }
    }

    private final String stripCopyright(String anchorString) {
        return (this.withCopyrightSign || !u.y(anchorString, COPYRIGHT, false)) ? anchorString : anchorString.substring(2, anchorString.length());
    }

    private final String translateImproveThisMapAnchor(String anchorString) {
        Context context = this.context.get();
        if (context == null) {
            return anchorString;
        }
        String string = context.getString(R.string.mapbox_telemetryImproveMap);
        string.getClass();
        return string;
    }

    public final String createAttributionString(boolean shortenedOutput) {
        if (this.attributions.isEmpty()) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(this.withCopyrightSign ? "" : COPYRIGHT);
        int i14 = 0;
        for (Attribution attribution : this.attributions) {
            i14++;
            sb3.append(!shortenedOutput ? attribution.getTitle() : attribution.getTitleAbbreviated());
            if (i14 != this.attributions.size()) {
                sb3.append(" / ");
            }
        }
        return sb3.toString();
    }

    public final Set<Attribution> getAttributions() {
        return this.attributions;
    }

    public final void parse() {
        parseAttributions();
        addAdditionalAttributions();
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u001b\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\u001fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010 \u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0010R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Options;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributionDataStringArray", "", "", "[Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "extraAttributions", "", "Lcom/mapbox/maps/plugin/attribution/Attribution;", "stringLiteralArray", "", "withCopyrightSign", "", "withImproveMap", "withMapboxAttribution", "withMapboxGeofencingConsent", "withMapboxPrivacyPolicy", "withTelemetryAttribution", "build", "Lcom/mapbox/maps/attribution/AttributionParser;", "hasValidHTMLTag", "htmlStr", "parseAttribution", "attribution", "([Ljava/lang/String;)Ljava/lang/String;", "withAttributionData", "attributionData", "([Ljava/lang/String;)Lcom/mapbox/maps/attribution/AttributionParser$Options;", "withExtraAttributions", "attributions", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Options {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String HTML_STYLE_REGEX = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
        private String[] attributionDataStringArray;
        private final WeakReference<Context> context;
        private List<Attribution> extraAttributions;
        private List<String> stringLiteralArray;
        private boolean withCopyrightSign;
        private boolean withImproveMap;
        private boolean withMapboxAttribution;
        private boolean withMapboxGeofencingConsent;
        private boolean withMapboxPrivacyPolicy;
        private boolean withTelemetryAttribution;

        public Options(Context context) {
            context.getClass();
            this.context = new WeakReference<>(context);
            this.withImproveMap = true;
            this.withCopyrightSign = true;
            this.withMapboxAttribution = true;
            this.withMapboxPrivacyPolicy = true;
            this.withMapboxGeofencingConsent = true;
            this.stringLiteralArray = new ArrayList();
            this.extraAttributions = j0.f134944a;
        }

        private final boolean hasValidHTMLTag(String htmlStr) {
            return Pattern.compile(HTML_STYLE_REGEX).matcher(htmlStr).find();
        }

        private final String parseAttribution(String[] attribution) {
            StringBuilder sb3 = new StringBuilder();
            for (String str : attribution) {
                if (str.length() > 0) {
                    if (hasValidHTMLTag(str)) {
                        sb3.append(str);
                    } else {
                        this.stringLiteralArray.add(str);
                    }
                }
            }
            return sb3.toString();
        }

        public final AttributionParser build() {
            String[] strArr = this.attributionDataStringArray;
            if (strArr == null) {
                h.z("Using builder without providing attribution data");
                return null;
            }
            strArr.getClass();
            AttributionParser attributionParser = new AttributionParser(this.context, parseAttribution(strArr), this.withImproveMap, this.withCopyrightSign, this.withTelemetryAttribution, this.withMapboxAttribution, this.withMapboxPrivacyPolicy, this.withMapboxGeofencingConsent, this.extraAttributions);
            attributionParser.parse();
            attributionParser.parseStringLiteralToAttributions(this.stringLiteralArray);
            return attributionParser;
        }

        public final Options withAttributionData(String... attributionData) {
            attributionData.getClass();
            this.attributionDataStringArray = (String[]) Arrays.copyOf(attributionData, attributionData.length);
            return this;
        }

        public final Options withCopyrightSign(boolean withCopyrightSign) {
            this.withCopyrightSign = withCopyrightSign;
            return this;
        }

        public final Options withExtraAttributions(List<Attribution> attributions) {
            attributions.getClass();
            this.extraAttributions = attributions;
            return this;
        }

        public final Options withImproveMap(boolean withImproveMap) {
            this.withImproveMap = withImproveMap;
            return this;
        }

        public final Options withMapboxAttribution(boolean withMapboxAttribution) {
            this.withMapboxAttribution = withMapboxAttribution;
            return this;
        }

        public final Options withMapboxGeofencingConsent(boolean withMapboxGeofencingConsent) {
            this.withMapboxGeofencingConsent = withMapboxGeofencingConsent;
            return this;
        }

        public final Options withMapboxPrivacyPolicy(boolean withMapboxPrivacyPolicy) {
            this.withMapboxPrivacyPolicy = withMapboxPrivacyPolicy;
            return this;
        }

        public final Options withTelemetryAttribution(boolean withTelemetryAttribution) {
            this.withTelemetryAttribution = withTelemetryAttribution;
            return this;
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Options$Companion;", "", "()V", "HTML_STYLE_REGEX", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Companion;", "", "()V", "COPYRIGHT", "", "EMPTY_STRING", "IMPROVE_MAP_URLS", "", "getIMPROVE_MAP_URLS", "()Ljava/util/List;", "IMPROVE_THIS_MAP", "fromHtml", "Landroid/text/Spanned;", "html", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Spanned fromHtml(String html) {
            Spanned spannedFromHtml = Html.fromHtml(html, 0);
            spannedFromHtml.getClass();
            return spannedFromHtml;
        }

        public final List<String> getIMPROVE_MAP_URLS() {
            return AttributionParser.IMPROVE_MAP_URLS;
        }

        private Companion() {
        }
    }

    public final String createAttributionString() {
        return createAttributionString$default(this, false, 1, null);
    }
}
