package com.twitter;

import com.huami.passport.Configs;
import com.huami.watch.ota.UpdateUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public class Autolink {
    public static final String DEFAULT_CASHTAG_CLASS = "tweet-url cashtag";
    public static final String DEFAULT_CASHTAG_URL_BASE = "https://twitter.com/#!/search?q=%24";
    public static final String DEFAULT_HASHTAG_CLASS = "tweet-url hashtag";
    public static final String DEFAULT_HASHTAG_URL_BASE = "https://twitter.com/#!/search?q=%23";
    public static final String DEFAULT_INVISIBLE_TAG_ATTRS = "style='position:absolute;left:-9999px;'";
    public static final String DEFAULT_LIST_CLASS = "tweet-url list-slug";
    public static final String DEFAULT_LIST_URL_BASE = "https://twitter.com/";
    public static final String DEFAULT_USERNAME_CLASS = "tweet-url username";
    public static final String DEFAULT_USERNAME_URL_BASE = "https://twitter.com/";
    private Extractor a;
    public String cashtagClass;
    public String cashtagUrlBase;
    public String hashtagClass;
    public String hashtagUrlBase;
    public String invisibleTagAttrs;
    public String listClass;
    public String listUrlBase;
    public String urlClass;
    public String usernameClass;
    public String usernameUrlBase;
    public boolean noFollow = true;
    public boolean usernameIncludeSymbol = false;
    public String symbolTag = null;
    public String textWithSymbolTag = null;
    public String urlTarget = null;
    public LinkAttributeModifier linkAttributeModifier = null;
    public LinkTextModifier linkTextModifier = null;

    public interface LinkAttributeModifier {
        void modify(Extractor.Entity entity, Map<String, String> map);
    }

    public interface LinkTextModifier {
        CharSequence modify(Extractor.Entity entity, CharSequence charSequence);
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Extractor.Entity.Type.values().length];
            a = iArr;
            try {
                iArr[Extractor.Entity.Type.URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Extractor.Entity.Type.HASHTAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Extractor.Entity.Type.MENTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Extractor.Entity.Type.CASHTAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Autolink() {
        this.urlClass = null;
        Extractor extractor = new Extractor();
        this.a = extractor;
        this.urlClass = null;
        this.listClass = DEFAULT_LIST_CLASS;
        this.usernameClass = DEFAULT_USERNAME_CLASS;
        this.hashtagClass = DEFAULT_HASHTAG_CLASS;
        this.cashtagClass = DEFAULT_CASHTAG_CLASS;
        this.usernameUrlBase = "https://twitter.com/";
        this.listUrlBase = "https://twitter.com/";
        this.hashtagUrlBase = DEFAULT_HASHTAG_URL_BASE;
        this.cashtagUrlBase = DEFAULT_CASHTAG_URL_BASE;
        this.invisibleTagAttrs = DEFAULT_INVISIBLE_TAG_ATTRS;
        extractor.setExtractURLWithoutProtocol(false);
    }

    private static CharSequence a(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length() * 2);
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\"') {
                sb.append("&quot;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt != '\'') {
                sb.append(cCharAt);
            } else {
                sb.append("&#39;");
            }
        }
        return sb;
    }

    public String autoLink(String str) {
        String strEscapeBrackets = escapeBrackets(str);
        return autoLinkEntities(strEscapeBrackets, this.a.extractEntitiesWithIndices(strEscapeBrackets));
    }

    public String autoLinkCashtags(String str) {
        return autoLinkEntities(str, this.a.extractCashtagsWithIndices(str));
    }

    public String autoLinkEntities(String str, List<Extractor.Entity> list) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int i = 0;
        for (Extractor.Entity entity : list) {
            sb.append(str.subSequence(i, entity.start));
            int i2 = a.a[entity.type.ordinal()];
            if (i2 == 1) {
                linkToURL(entity, str, sb);
            } else if (i2 == 2) {
                linkToHashtag(entity, str, sb);
            } else if (i2 == 3) {
                linkToMentionAndList(entity, str, sb);
            } else if (i2 == 4) {
                linkToCashtag(entity, str, sb);
            }
            i = entity.end;
        }
        sb.append(str.subSequence(i, str.length()));
        return sb.toString();
    }

    public String autoLinkHashtags(String str) {
        return autoLinkEntities(str, this.a.extractHashtagsWithIndices(str));
    }

    public String autoLinkURLs(String str) {
        return autoLinkEntities(str, this.a.extractURLsWithIndices(str));
    }

    public String autoLinkUsernamesAndLists(String str) {
        return autoLinkEntities(str, this.a.extractMentionsOrListsWithIndices(str));
    }

    public String escapeBrackets(String str) {
        int length = str.length();
        if (length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length + 16);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public String getCashtagClass() {
        return this.cashtagClass;
    }

    public String getCashtagUrlBase() {
        return this.cashtagUrlBase;
    }

    public String getHashtagClass() {
        return this.hashtagClass;
    }

    public String getHashtagUrlBase() {
        return this.hashtagUrlBase;
    }

    public String getListClass() {
        return this.listClass;
    }

    public String getListUrlBase() {
        return this.listUrlBase;
    }

    public String getUrlClass() {
        return this.urlClass;
    }

    public String getUsernameClass() {
        return this.usernameClass;
    }

    public String getUsernameUrlBase() {
        return this.usernameUrlBase;
    }

    public boolean isNoFollow() {
        return this.noFollow;
    }

    public void linkToCashtag(Extractor.Entity entity, String str, StringBuilder sb) {
        String value = entity.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("href", this.cashtagUrlBase + ((Object) value));
        linkedHashMap.put("title", "$" + ((Object) value));
        linkedHashMap.put(Constants.CLASS, this.cashtagClass);
        linkToTextWithSymbol(entity, "$", value, linkedHashMap, sb);
    }

    public void linkToHashtag(Extractor.Entity entity, String str, StringBuilder sb) {
        CharSequence charSequenceSubSequence = str.subSequence(entity.getStart().intValue(), entity.getStart().intValue() + 1);
        String value = entity.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("href", this.hashtagUrlBase + ((Object) value));
        linkedHashMap.put("title", UpdateUtils.CMD_FILTER + ((Object) value));
        if (Regex.RTL_CHARACTERS.matcher(str).find()) {
            linkedHashMap.put(Constants.CLASS, this.hashtagClass + " rtl");
        } else {
            linkedHashMap.put(Constants.CLASS, this.hashtagClass);
        }
        linkToTextWithSymbol(entity, charSequenceSubSequence, value, linkedHashMap, sb);
    }

    public void linkToMentionAndList(Extractor.Entity entity, String str, StringBuilder sb) {
        String value = entity.getValue();
        CharSequence charSequenceSubSequence = str.subSequence(entity.getStart().intValue(), entity.getStart().intValue() + 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (entity.listSlug != null) {
            value = value + entity.listSlug;
            linkedHashMap.put(Constants.CLASS, this.listClass);
            linkedHashMap.put("href", this.listUrlBase + value);
        } else {
            linkedHashMap.put(Constants.CLASS, this.usernameClass);
            linkedHashMap.put("href", this.usernameUrlBase + value);
        }
        linkToTextWithSymbol(entity, charSequenceSubSequence, value, linkedHashMap, sb);
    }

    public void linkToText(Extractor.Entity entity, CharSequence charSequence, Map<String, String> map, StringBuilder sb) {
        if (this.noFollow) {
            map.put(Configs.Params.REL, "nofollow");
        }
        LinkAttributeModifier linkAttributeModifier = this.linkAttributeModifier;
        if (linkAttributeModifier != null) {
            linkAttributeModifier.modify(entity, map);
        }
        LinkTextModifier linkTextModifier = this.linkTextModifier;
        if (linkTextModifier != null) {
            charSequence = linkTextModifier.modify(entity, charSequence);
        }
        sb.append("<a");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(" ");
            sb.append(a(entry.getKey()));
            sb.append("=\"");
            sb.append(a(entry.getValue()));
            sb.append("\"");
        }
        sb.append(SearchCriteria.GT);
        sb.append(charSequence);
        sb.append("</a>");
    }

    public void linkToTextWithSymbol(Extractor.Entity entity, CharSequence charSequence, CharSequence charSequence2, Map<String, String> map, StringBuilder sb) {
        CharSequence charSequence3;
        String str = this.symbolTag;
        boolean z = true;
        if (str == null || str.length() == 0) {
            charSequence3 = charSequence;
        } else {
            String str2 = this.symbolTag;
            charSequence3 = String.format("<%s>%s</%s>", str2, charSequence, str2);
        }
        CharSequence charSequenceA = a(charSequence2);
        String str3 = this.textWithSymbolTag;
        if (str3 != null && str3.length() != 0) {
            String str4 = this.textWithSymbolTag;
            charSequenceA = String.format("<%s>%s</%s>", str4, charSequenceA, str4);
        }
        if (!this.usernameIncludeSymbol && Regex.AT_SIGNS.matcher(charSequence).matches()) {
            z = false;
        }
        if (!z) {
            sb.append(charSequence3);
            linkToText(entity, charSequenceA, map, sb);
        } else {
            linkToText(entity, charSequence3.toString() + ((Object) charSequenceA), map, sb);
        }
    }

    public void linkToURL(Extractor.Entity entity, String str, StringBuilder sb) {
        String value = entity.getValue();
        CharSequence charSequenceA = a(value);
        String str2 = entity.displayURL;
        if (str2 != null && entity.expandedURL != null) {
            String strReplace = str2.replace("…", "");
            int iIndexOf = entity.expandedURL.indexOf(strReplace);
            if (iIndexOf != -1) {
                String strSubstring = entity.expandedURL.substring(0, iIndexOf);
                String strSubstring2 = entity.expandedURL.substring(iIndexOf + strReplace.length());
                String str3 = entity.displayURL.startsWith("…") ? "…" : "";
                String str4 = entity.displayURL.endsWith("…") ? "…" : "";
                String str5 = "<span " + this.invisibleTagAttrs + SearchCriteria.GT;
                StringBuilder sb2 = new StringBuilder("<span class='tco-ellipsis'>");
                sb2.append(str3);
                sb2.append(str5);
                sb2.append("&nbsp;</span></span>");
                sb2.append(str5);
                sb2.append(a(strSubstring));
                sb2.append("</span>");
                sb2.append("<span class='js-display-url'>");
                sb2.append(a(strReplace));
                sb2.append("</span>");
                sb2.append(str5);
                sb2.append(a(strSubstring2));
                sb2.append("</span>");
                sb2.append("<span class='tco-ellipsis'>");
                sb2.append(str5);
                sb2.append("&nbsp;</span>");
                sb2.append(str4);
                sb2.append("</span>");
                charSequenceA = sb2;
            } else {
                charSequenceA = entity.displayURL;
            }
        }
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("href", value.toString());
        String str6 = this.urlClass;
        if (str6 != null) {
            linkedHashMap.put(Constants.CLASS, str6);
        }
        String str7 = this.urlClass;
        if (str7 != null && str7.length() != 0) {
            linkedHashMap.put(Constants.CLASS, this.urlClass);
        }
        String str8 = this.urlTarget;
        if (str8 != null && str8.length() != 0) {
            linkedHashMap.put("target", this.urlTarget);
        }
        linkToText(entity, charSequenceA, linkedHashMap, sb);
    }

    public void setCashtagClass(String str) {
        this.cashtagClass = str;
    }

    public void setCashtagUrlBase(String str) {
        this.cashtagUrlBase = str;
    }

    public void setHashtagClass(String str) {
        this.hashtagClass = str;
    }

    public void setHashtagUrlBase(String str) {
        this.hashtagUrlBase = str;
    }

    public void setLinkAttributeModifier(LinkAttributeModifier linkAttributeModifier) {
        this.linkAttributeModifier = linkAttributeModifier;
    }

    public void setLinkTextModifier(LinkTextModifier linkTextModifier) {
        this.linkTextModifier = linkTextModifier;
    }

    public void setListClass(String str) {
        this.listClass = str;
    }

    public void setListUrlBase(String str) {
        this.listUrlBase = str;
    }

    public void setNoFollow(boolean z) {
        this.noFollow = z;
    }

    public void setSymbolTag(String str) {
        this.symbolTag = str;
    }

    public void setTextWithSymbolTag(String str) {
        this.textWithSymbolTag = str;
    }

    public void setUrlClass(String str) {
        this.urlClass = str;
    }

    public void setUrlTarget(String str) {
        this.urlTarget = str;
    }

    public void setUsernameClass(String str) {
        this.usernameClass = str;
    }

    public void setUsernameIncludeSymbol(boolean z) {
        this.usernameIncludeSymbol = z;
    }

    public void setUsernameUrlBase(String str) {
        this.usernameUrlBase = str;
    }
}
