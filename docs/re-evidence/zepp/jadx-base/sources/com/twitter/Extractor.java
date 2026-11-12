package com.twitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes18.dex */
public class Extractor {
    public boolean extractURLWithoutProtocol = true;

    public class a implements Comparator<Entity> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Entity entity, Entity entity2) {
            return entity.start - entity2.start;
        }
    }

    public static final class b {
        public final String a;
        public int b = 0;
        public int c = 0;

        public b(String str) {
            this.a = str;
        }

        public int a(int i) {
            int iOffsetByCodePoints = this.a.offsetByCodePoints(this.c, i - this.b);
            this.c = iOffsetByCodePoints;
            this.b = i;
            return iOffsetByCodePoints;
        }

        public int b(int i) {
            int i2 = this.c;
            if (i < i2) {
                this.b -= this.a.codePointCount(i, i2);
            } else {
                this.b += this.a.codePointCount(i2, i);
            }
            this.c = i;
            if (i > 0 && Character.isSupplementaryCodePoint(this.a.codePointAt(i - 1))) {
                this.c--;
            }
            return this.b;
        }
    }

    private List<Entity> a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        boolean z2 = false;
        for (char c : str.toCharArray()) {
            if (c == '#' || c == 65283) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Regex.VALID_HASHTAG.matcher(str);
        while (matcher.find()) {
            if (!Regex.INVALID_HASHTAG_MATCH_END.matcher(str.substring(matcher.end())).find()) {
                arrayList.add(new Entity(matcher, Entity.Type.HASHTAG, 3));
            }
        }
        if (z) {
            List<Entity> listExtractURLsWithIndices = extractURLsWithIndices(str);
            if (!listExtractURLsWithIndices.isEmpty()) {
                arrayList.addAll(listExtractURLsWithIndices);
                b(arrayList);
                Iterator<Entity> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getType() != Entity.Type.HASHTAG) {
                        it2.remove();
                    }
                }
            }
        }
        return arrayList;
    }

    private void b(List<Entity> list) {
        Collections.sort(list, new a());
        if (list.isEmpty()) {
            return;
        }
        Iterator<Entity> it2 = list.iterator();
        Entity next = it2.next();
        while (it2.hasNext()) {
            Entity next2 = it2.next();
            if (next.getEnd().intValue() > next2.getStart().intValue()) {
                it2.remove();
            } else {
                next = next2;
            }
        }
    }

    public List<String> extractCashtags(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Entity> it2 = extractCashtagsWithIndices(str).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().value);
        }
        return arrayList;
    }

    public List<Entity> extractCashtagsWithIndices(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        if (str.indexOf(36) == -1) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Regex.VALID_CASHTAG.matcher(str);
        while (matcher.find()) {
            arrayList.add(new Entity(matcher, Entity.Type.CASHTAG, 3));
        }
        return arrayList;
    }

    public List<Entity> extractEntitiesWithIndices(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(extractURLsWithIndices(str));
        arrayList.addAll(a(str, false));
        arrayList.addAll(extractMentionsOrListsWithIndices(str));
        arrayList.addAll(extractCashtagsWithIndices(str));
        b(arrayList);
        return arrayList;
    }

    public List<String> extractHashtags(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Entity> it2 = extractHashtagsWithIndices(str).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().value);
        }
        return arrayList;
    }

    public List<Entity> extractHashtagsWithIndices(String str) {
        return a(str, true);
    }

    public List<String> extractMentionedScreennames(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Entity> it2 = extractMentionedScreennamesWithIndices(str).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().value);
        }
        return arrayList;
    }

    public List<Entity> extractMentionedScreennamesWithIndices(String str) {
        ArrayList arrayList = new ArrayList();
        for (Entity entity : extractMentionsOrListsWithIndices(str)) {
            if (entity.listSlug == null) {
                arrayList.add(entity);
            }
        }
        return arrayList;
    }

    public List<Entity> extractMentionsOrListsWithIndices(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        boolean z = false;
        for (char c : str.toCharArray()) {
            if (c == '@' || c == 65312) {
                z = true;
                break;
            }
        }
        if (!z) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Regex.VALID_MENTION_OR_LIST.matcher(str);
        while (matcher.find()) {
            if (!Regex.INVALID_MENTION_MATCH_END.matcher(str.substring(matcher.end())).find()) {
                if (matcher.group(4) == null) {
                    arrayList.add(new Entity(matcher, Entity.Type.MENTION, 3));
                } else {
                    arrayList.add(new Entity(matcher.start(3) - 1, matcher.end(4), matcher.group(3), matcher.group(4), Entity.Type.MENTION));
                }
            }
        }
        return arrayList;
    }

    public String extractReplyScreenname(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Regex.VALID_REPLY.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        if (Regex.INVALID_MENTION_MATCH_END.matcher(str.substring(matcher.end())).find()) {
            return null;
        }
        return matcher.group(1);
    }

    public List<String> extractURLs(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Entity> it2 = extractURLsWithIndices(str).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().value);
        }
        return arrayList;
    }

    public List<Entity> extractURLsWithIndices(String str) {
        if (str != null && str.length() != 0) {
            if (str.indexOf(this.extractURLWithoutProtocol ? 46 : 58) != -1) {
                ArrayList arrayList = new ArrayList();
                Matcher matcher = Regex.VALID_URL.matcher(str);
                while (matcher.find()) {
                    if (matcher.group(4) != null || (this.extractURLWithoutProtocol && !Regex.INVALID_URL_WITHOUT_PROTOCOL_MATCH_BEGIN.matcher(matcher.group(2)).matches())) {
                        String strGroup = matcher.group(3);
                        int iStart = matcher.start(3);
                        int iEnd = matcher.end(3);
                        Matcher matcher2 = Regex.VALID_TCO_URL.matcher(strGroup);
                        if (matcher2.find()) {
                            strGroup = matcher2.group();
                            iEnd = strGroup.length() + iStart;
                        }
                        arrayList.add(new Entity(iStart, iEnd, strGroup, Entity.Type.URL));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public boolean isExtractURLWithoutProtocol() {
        return this.extractURLWithoutProtocol;
    }

    public void modifyIndicesFromUTF16ToToUnicode(String str, List<Entity> list) {
        b bVar = new b(str);
        for (Entity entity : list) {
            entity.start = bVar.b(entity.start);
            entity.end = bVar.b(entity.end);
        }
    }

    public void modifyIndicesFromUnicodeToUTF16(String str, List<Entity> list) {
        b bVar = new b(str);
        for (Entity entity : list) {
            entity.start = bVar.a(entity.start);
            entity.end = bVar.a(entity.end);
        }
    }

    public void setExtractURLWithoutProtocol(boolean z) {
        this.extractURLWithoutProtocol = z;
    }

    public static class Entity {
        public String displayURL;
        public int end;
        public String expandedURL;
        public final String listSlug;
        public int start;
        public final Type type;
        public final String value;

        public enum Type {
            URL,
            HASHTAG,
            MENTION,
            CASHTAG
        }

        public Entity(int i, int i2, String str, String str2, Type type) {
            this.displayURL = null;
            this.expandedURL = null;
            this.start = i;
            this.end = i2;
            this.value = str;
            this.listSlug = str2;
            this.type = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entity)) {
                return false;
            }
            Entity entity = (Entity) obj;
            return this.type.equals(entity.type) && this.start == entity.start && this.end == entity.end && this.value.equals(entity.value);
        }

        public String getDisplayURL() {
            return this.displayURL;
        }

        public Integer getEnd() {
            return Integer.valueOf(this.end);
        }

        public String getExpandedURL() {
            return this.expandedURL;
        }

        public String getListSlug() {
            return this.listSlug;
        }

        public Integer getStart() {
            return Integer.valueOf(this.start);
        }

        public Type getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.type.hashCode() + this.value.hashCode() + this.start + this.end;
        }

        public void setDisplayURL(String str) {
            this.displayURL = str;
        }

        public void setExpandedURL(String str) {
            this.expandedURL = str;
        }

        public String toString() {
            return this.value + "(" + this.type + ") [" + this.start + "," + this.end + "]";
        }

        public Entity(int i, int i2, String str, Type type) {
            this(i, i2, str, null, type);
        }

        public Entity(Matcher matcher, Type type, int i) {
            this(matcher, type, i, -1);
        }

        public Entity(Matcher matcher, Type type, int i, int i2) {
            this(matcher.start(i) + i2, matcher.end(i), matcher.group(i), type);
        }
    }
}
